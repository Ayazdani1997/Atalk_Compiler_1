grammar Atalk;
@members{
	public void print(String n){
		System.out.println(n);
	}
	public int startScopeWithSameBaseForEnteringReceiver( Register register , Register heapRegister )
	{
		int offset = SymbolTable.top.getOffset( register );
		int argOffset = SymbolTable.top.getOffset( heapRegister );
		SymbolTable.push( new SymbolTable(SymbolTable.top) );
		SymbolTable.top.setOffset( heapRegister , argOffset );
		SymbolTable.top.setOffset( register , offset );
		//print( "offset is " + offset );
		return offset;
	}
	public int startScopeWithSameBase( Register register )
	{
		int offset = SymbolTable.top.getOffset( register );
		//int argOffset = SymbolTable.top.getOffset( heapRegister );
		SymbolTable.push( new SymbolTable(SymbolTable.top) );
		//SymbolTable.top.setOffset( heapRegister , argOffset );
		SymbolTable.top.setOffset( register , offset );
		//print( "offset is " + offset );
		return offset;	
	}
	public void endScopeWithSameBase( Register register , int localoffset )
	{
		String spRegName = new String( "\$sp" );
		//print( "localoffset is " + localoffset );
		int offset = SymbolTable.top.getOffset( register );
		if( !( register.toString() ).equals( spRegName ) )
			SymbolTable.top.pre.setOffset( register , offset );
		else
			SymbolTable.top.pre.setOffset( register , localoffset );
		SymbolTable.pop();
	}
	public void endScopeWithSameBaseForExitingReceiver( Register register , Register heapRegister , int localoffset )
	{
		String spRegName = new String( "\$sp" );
		//print( "localoffset is " + localoffset );
		int offset = SymbolTable.top.getOffset( register );
		int argOffset = SymbolTable.top.getOffset( heapRegister );
		SymbolTable.top.pre.setOffset( heapRegister , SymbolTable.top.getOffset( heapRegister ));
		if( !( register.toString() ).equals( spRegName ) )
			SymbolTable.top.pre.setOffset( register , offset );
		else
			SymbolTable.top.pre.setOffset( register , localoffset );
		SymbolTable.pop();
	}
}
program locals[int lastRepeatedVarNum , Stack <String> foreachCursor , Stack <String> foreachArray]:
	{ 
		Translator.mips = new Translator();
		$program::lastRepeatedVarNum=0;
		$foreachCursor = new Stack<String>();
		$foreachArray = new Stack<String>();
		SymbolTable.push(new SymbolTable() );
	}
	(
	op=actor
	{
		try{
			SymbolTable.top.put($op.ctx.asti);
		}
		catch(ItemAlreadyExistsException e){
			Atalk.pass1Passed = false;
			print("redefinition of actor with name "+$op.ctx.asti.getName()+" in line "+$actor::actorline);
			$op.ctx.asti.setActorName($op.ctx.asti.getName()+"_"+$program::lastRepeatedVarNum);
			$program::lastRepeatedVarNum+=1;
			try{
				SymbolTable.top.put($op.ctx.asti);
			}
			catch(ItemAlreadyExistsException ee){}
		} 
	print("actor <"+$op.ctx.asti.getName()+"> MB size:"+$op.ctx.asti.getActorMailBoxSize()); 
	}
	| NL)*
	{
		if(SymbolTable.top.size()==0) 
		{
			Atalk.pass1Passed = false;
			print("there has to be at least one actor line:1");
		}
		SymbolTable.pop();
	}
	;

actor returns[ActorSymbolTableItem asti] locals[int actorline]:
		'actor' op=ID 
		{
			int offset = startScopeWithSameBaseForEnteringReceiver( Register.GP , Register.TEMP9 );
			$actorline=$op.line;
		}
		{
			$asti=new ActorSymbolTableItem(SymbolTable.top); 
			$asti.setActorName($op.text);
			SymbolTable.top.setkeyOfActorAccordingToActorST($asti.getKey());
		}
		'<' os=CONST_NUM 
		{
			if(! ($os.int>0)) {
				Atalk.pass1Passed = false;
				print("bad actor mailbox size in line "+$os.line); 
				$asti.setActorMailBoxSize(0);
			}
			else $asti.setActorMailBoxSize($os.int);
		}
		'>'
		{
			Translator.mips.addNewActor( $op.text , $os.int );
		} 
		NL
		(state | 
		ot=receiver
		{ 
			try{
				SymbolTable.top.put($ot.ctx.rsti);
			} catch(ItemAlreadyExistsException e){
				Atalk.pass1Passed = false;
				print("redefinition of receiver <"+$ot.ctx.rsti.getName()+"> in line "+$receiver::receiverline + " in actor "
				+ $op.text );
				$ot.ctx.rsti.setReceiverName($ot.ctx.rsti.getName()+"_"+$program::lastRepeatedVarNum);
				$program::lastRepeatedVarNum+=1; 
				try{
					SymbolTable.top.put($ot.ctx.rsti);
				}
				catch(ItemAlreadyExistsException ee){}
			}
			Translator.mips.addNewReceiver( $op.text , $ot.ctx.rsti.getKey() , $ot.ctx.rsti.getName() );
			print("receiver <"+$ot.ctx.rsti.getKey()+">");
		}
		 | NL)*
		'end' (NL | EOF) 
		{
			endScopeWithSameBaseForExitingReceiver( Register.GP , Register.TEMP9 , offset );
		}
	;

receiver returns[ReceiverSymbolTableItem rsti] locals[int receiverline]:
		{
			int offset = startScopeWithSameBaseForEnteringReceiver( Register.GP , Register.TEMP9 );
			///int offset = SymbolTable.top.getOffset( Register.GP );
			//SymbolTable.push(new SymbolTable(SymbolTable.top));
		}
		'receiver' op=ID
		{
			$receiverline=$op.line;
		}
		{
			$rsti=new ReceiverSymbolTableItem();
			$rsti.setReceiverName($op.text);
		} 
		'(' (os=type ot=ID
		{
			String name=$ot.text;
			if(SymbolTable.top.contains($ot.text))
			{
				Atalk.pass1Passed = false;
				print("bad argument name: "+$ot.text);
				name=$ot.text+"_"+$program::lastRepeatedVarNum;
				$program::lastRepeatedVarNum++;
			} 
			$rsti.addReceiverArgument($os.vartype,name);
			try{
				SymbolTable.top.put(new SymbolTableFunctionArgumentItem(new Variable(name,$os.vartype),SymbolTable.top.getOffset(Register.TEMP9)));
			}
			catch(ItemAlreadyExistsException e){}
			print( "variable <"+name+"> offset: "+((SymbolTableFunctionArgumentItem)SymbolTable.top.getInCurrentScope(name)).getOffset()+
			" type:"+$os.vartype.toString()+" width: "+$os.vartype.size() + " with base " 
			+ ((SymbolTableFunctionArgumentItem)SymbolTable.top.getInCurrentScope(name)).getBaseRegister() );
		} 
		(',' ou=type ow=ID
		{
			String name2=$ow.text;
			if(SymbolTable.top.contains($ow.text))
			{
				Atalk.pass1Passed = false;
				print("bad argument name: "+$ow.text);
				name2=$ow.text+"_"+$program::lastRepeatedVarNum;
				$program::lastRepeatedVarNum++;
			}
			$rsti.addReceiverArgument($ou.vartype,name2);
			try{
				SymbolTable.top.put(new SymbolTableFunctionArgumentItem(new Variable(name2,$ou.vartype),SymbolTable.top.getOffset(Register.TEMP9)));
			}
			catch(ItemAlreadyExistsException e){}
			//print( "hello\n" );
			print("variable <"+name2+"> offset: "+((SymbolTableFunctionArgumentItem)SymbolTable.top.getInCurrentScope(name2)).getOffset()+
			" type:"+$ou.vartype.toString()+" width: "+$ou.vartype.size() + " with base " 
			+ ((SymbolTableFunctionArgumentItem)SymbolTable.top.getInCurrentScope(name2)).getBaseRegister() ); 
		}
		)*)? ')' NL
		statements
		'end' NL
		{
			if($rsti.getKey().equals("receiver_init_"))
			{
				SymbolTable.top.isInitReceiverScope=true;
				SymbolTable.top.pre.actorSetHasInit();
				$rsti.isInit = true;
			}
			SymbolTable.top.setkeyOfReceiverAccordingToReceiverST( $rsti.getKey() );
			endScopeWithSameBaseForExitingReceiver( Register.GP , Register.TEMP9 , offset );
		}
	;

state:
		op=type os=ID
		{
			String name=$os.text;
			try {
				int offset = SymbolTable.top.getOffset(Register.GP);
				SymbolTable.top.put(new SymbolTableGlobalVariableItem(new Variable($os.text,$op.vartype), offset ));
			}
			catch(ItemAlreadyExistsException e)
			{
				Atalk.pass1Passed = false;
				print("redefinition of variable " + name + "; in line "+$os.line);
				try{
					SymbolTable.top.put(new SymbolTableGlobalVariableItem(new Variable($os.text+"_"+$program::lastRepeatedVarNum,$op.vartype),SymbolTable.top.getOffset(Register.GP)));
					name=$os.text+"_"+($program::lastRepeatedVarNum++);
				}
				catch(ItemAlreadyExistsException ee){}
			}
			print("variable <"+name+"> offset: "+((SymbolTableGlobalVariableItem)SymbolTable.top.getInCurrentScope(name)).getOffset()+
			" type:"+$op.vartype.toString()+" width: "+$op.vartype.size() + " with base " 
			+ ((SymbolTableGlobalVariableItem)SymbolTable.top.getInCurrentScope(name)).getBaseRegister() );
		} 
		(',' ot=ID
		{
			String name2=$ot.text;
			try{
				SymbolTable.top.put(new SymbolTableGlobalVariableItem(new Variable($ot.text,$op.vartype),SymbolTable.top.getOffset(Register.GP)));
			}
			catch(ItemAlreadyExistsException e){
				Atalk.pass1Passed = false;
				print("redefinition of variable " + name2 + "; in line "+$os.line);
				try{
					SymbolTable.top.put(new SymbolTableGlobalVariableItem(new Variable($ot.text+"_"+$program::lastRepeatedVarNum,$op.vartype),SymbolTable.top.getOffset(Register.GP)));
					name2=$ot.text+"_"+($program::lastRepeatedVarNum++);
				}
				catch(ItemAlreadyExistsException ee){}
			}
			print( "variable <"+name2+"> offset: "+((SymbolTableGlobalVariableItem)SymbolTable.top.getInCurrentScope(name2)).getOffset()+
			" type:"+$op.vartype.toString()+" width: "+$op.vartype.size() + " with base " 
			+ ((SymbolTableGlobalVariableItem)SymbolTable.top.getInCurrentScope(name2)).getBaseRegister() );
		} 
		)* NL
	;

type returns [Type vartype]:
		'char'
		{
			$vartype=CharArrayType.getInstance();
		} 
		('[' CONST_NUM ']'
		{
			if($CONST_NUM.int>0) 
				((CharArrayType) $vartype ).pushNewDimension($CONST_NUM.int);
			else
			{
				Atalk.pass1Passed = false;
				print( "invalid size for an array of character. the size must be greater than zero");
				((CharArrayType) $vartype).pushNewDimension( 0 );
			}
		}
		)* 
		{
			if(( (CharArrayType) $vartype).DimensionsCount()==0) 
				$vartype=CharType.getInstance();
		}
	|	'int' 
		{
			$vartype=IntArrayType.getInstance();
		} 
		('[' CONST_NUM ']'
		{
			if($CONST_NUM.int>0) 
				((IntArrayType) $vartype ).pushNewDimension($CONST_NUM.int);
			else
			{
				Atalk.pass1Passed = false;
				print( "invalid size for an array of integer. the size must be greater than zero");
				((IntArrayType)$vartype).pushNewDimension( 0 );
			}
		}
		)* 
		{
			if(((IntArrayType)$vartype).DimensionsCount()==0) 
				$vartype= IntType.getInstance();
		}
	;

block: 
		{
			int offset = startScopeWithSameBase( Register.SP );
		}
		'begin' 
		NL
			statements
		'end' 
		NL
		{
			endScopeWithSameBase( Register.SP , offset );
		}
	;

stm_if_elseif_else:

		'if' 
		expr
		{
			int offset = startScopeWithSameBase( Register.SP );
		} 
		NL statements 
		{ 
			endScopeWithSameBase( Register.SP , offset ); 
		}
		(
			'elseif' 
			expr
			{
				int localoffset = startScopeWithSameBase( Register.SP );
			} 
			NL statements
			{
				endScopeWithSameBase( Register.SP , localoffset );
			}
		)*
		(
			'else' 
			NL
			{
				int localoffset1 = startScopeWithSameBase( Register.SP  );		
			} 
			statements
			{
				endScopeWithSameBase( Register.SP , localoffset1 );		
			}
		)?
		'end' NL
	;

stm_foreach:
		'foreach'
		{
			int offset = startScopeWithSameBase( Register.SP );
			SymbolTable.top.setStackOffsetBeforeForeachST(offset);
			SymbolTable.top.setInForeachST();
		} 
		op=ID 
		{
			$program::foreachCursor.push( $op.text );
		}
		'in' os=expr
		{
			if( $os.beingID )
			{
				SymbolTable.top.setIsArrayID();
				$program::foreachArray.push( $os.varname );
			}
		}
		NL
			statements
		'end'
			{ 
				endScopeWithSameBase( Register.SP , offset );
				$program::foreachCursor.pop();
				if( SymbolTable.top.getIsArrayID() )
					$program::foreachArray.pop();
			} 
		NL	
	;

statements:
		(statement | NL)*
	;

statement:
		stm_vardef
	|	stm_assignment
	|	stm_foreach
	|	stm_if_elseif_else
	|	stm_quit
	|	stm_break
	|	stm_tell
	|	stm_write
	|	block
	;

stm_vardef:
		op=type os=ID 
		{
			String name=$os.text;
			try
			{
				if( name.equals( $program::foreachCursor.topOfStack() ) && SymbolTable.top.isFirstForeach() )
					throw new ItemAlreadyExistsException();
				else if( SymbolTable.top.getIsArrayID() && $program::foreachArray.topOfStack() != null && name.equals( $program::foreachArray.topOfStack() ) && SymbolTable.top.isFirstForeach() )
					throw new ItemAlreadyExistsException();
				SymbolTable.top.put(new SymbolTableLocalVariableItem(new Variable(name,$op.vartype),SymbolTable.top.getOffset(Register.SP)));
			}
			catch(ItemAlreadyExistsException e)
			{
				Atalk.pass1Passed = false;
				print("line "+$os.line + "; " + "redefinition of an existing variable : " + name );
				try
				{
					SymbolTable.top.put(new SymbolTableLocalVariableItem(new Variable($os.text+"_"+$program::lastRepeatedVarNum,$op.vartype),SymbolTable.top.getOffset(Register.SP)));
					name=$os.text+"_"+$program::lastRepeatedVarNum;
					$program::lastRepeatedVarNum++;
				}
				catch(ItemAlreadyExistsException ee){} 
			}
			print( "variable <"+name+"> offset: "+((SymbolTableLocalVariableItem)SymbolTable.top.getInCurrentScope(name)).getOffset()+
			" type:"+$op.vartype.toString()+" width: "+$op.vartype.size() + " with base " 
			+ ((SymbolTableLocalVariableItem)SymbolTable.top.getInCurrentScope(name)).getBaseRegister() );
		}
		('=' expr)? (',' ot=ID 
		{
			String name2=$ot.text; 
			try
			{
				SymbolTable.top.put(new SymbolTableLocalVariableItem(new Variable($ot.text,$op.vartype),SymbolTable.top.getOffset(Register.SP)));
			}
			catch(ItemAlreadyExistsException e)
			{
				Atalk.pass1Passed = false;
				print("line "+$ot.line + ";" + "redefinition of an existing variable : " + name2 );
				try
				{
					SymbolTable.top.put(new SymbolTableLocalVariableItem(new Variable($ot.text+"_"+$program::lastRepeatedVarNum,$op.vartype),SymbolTable.top.getOffset(Register.SP)));
					name2=$ot.text+"_"+$program::lastRepeatedVarNum;
					$program::lastRepeatedVarNum++;
				}
				catch(ItemAlreadyExistsException ee){} 
			}
			print( "variable <"+name2+"> offset: "+((SymbolTableLocalVariableItem)SymbolTable.top.getInCurrentScope(name2)).getOffset()+
			" type: "+$op.vartype.toString()+" width: "+$op.vartype.size() + " with base " 
			+ ((SymbolTableLocalVariableItem)SymbolTable.top.getInCurrentScope(name)).getBaseRegister());
		}
		('=' expr)?)* NL
	;

stm_tell:
		(ID | 'sender' | 'self') '<<' ID '(' (expr (',' expr)*)? ')' NL
	;

stm_write:
		'write' '(' expr ')' NL
	;


stm_quit:
		'quit' NL
	;

stm_break:
		op='break'
		{
			if(!SymbolTable.top.getInForeachST())
			{
				Atalk.pass1Passed = false; 
				print("invalid use of break in line "+$op.line);
			}
		} NL
	;

stm_assignment:
		expr NL
	;

expr returns[ boolean beingID , String varname ]locals[ boolean isID , String name ]:
		expr_assign
		{
			$beingID = $isID;
			$varname = $name;
		}
	;

expr_assign:
		expr_or '=' {
			$expr::isID = false;
		}
		expr_assign
	|	expr_or
	;

expr_or:
		expr_and expr_or_tmp
	;

expr_or_tmp:
		'or' expr_and expr_or_tmp
		{
			$expr::isID = false;
		}
	|
	;

expr_and:
		expr_eq expr_and_tmp
	;

expr_and_tmp:
		'and' expr_eq expr_and_tmp
		{
			$expr::isID = false;
		}
	|
	;

expr_eq:
		expr_cmp expr_eq_tmp
	;

expr_eq_tmp:
		('==' | '<>') expr_cmp expr_eq_tmp
		{
			$expr::isID = false;
		}
	|
	;

expr_cmp:
		expr_add expr_cmp_tmp
	;

expr_cmp_tmp:
		('<' | '>') expr_add expr_cmp_tmp
		{
			$expr::isID = false;
		}
	|
	;

expr_add:
		expr_mult expr_add_tmp
	;

expr_add_tmp:
		('+' | '-') expr_mult expr_add_tmp
		{
			$expr::isID = false;
		}
	|
	;

expr_mult:
		expr_un expr_mult_tmp
	;

expr_mult_tmp:
		('*' | '/') expr_un expr_mult_tmp
		{
			$expr::isID = false;
		}
	|
	;

expr_un:
		('not' | '-') expr_un
		{
			$expr::isID = false;
		}
	|	expr_mem
	;

expr_mem:
		expr_other expr_mem_tmp
	;

expr_mem_tmp:
		'[' expr ']' expr_mem_tmp
		{
			$expr::isID = false;
		}
	|
	;

expr_other:
		CONST_NUM
	|	CONST_CHAR
	|	CONST_STR
	|	op=ID
	{
		$expr::name = $op.text;
		$expr::isID = true;
	}
	|	'{' expr (',' expr)* '}'
	|	'read' '(' CONST_NUM ')'
	|	'(' expr ')'
	;

CONST_NUM:
		[0-9]+
	;

CONST_CHAR:
		'\'' . '\''
	;

CONST_STR:
		'"' ~('\r' | '\n' | '"')* '"'
	;

NL:
		'\r'? '\n' { setText("new_line"); }
	;

ID:
		[a-zA-Z_][a-zA-Z0-9_]*
	;

COMMENT:
		'#'(~[\r\n])* -> skip
	;

WS:
    	[ \t] -> skip
    ;
