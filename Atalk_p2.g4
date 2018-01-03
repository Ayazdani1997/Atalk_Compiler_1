grammar Atalk_p2;
@members{
	public void print(String n){
		System.out.println(n);
	}
	Translator mips  = new Translator();
	/*public boolean sizeConsistency( ArrayType t1 , ArrayType t2 )
	{
		if( t1.DimensionsCount() != t2.DimensionsCount() )
			return false;
		int size = t1.DimensionsCount();
		for( int i = 0 ; i < size ; i++ )
			if( t1.)
	}*/
}
program:
	{ 
		SymbolTable.push();
	}
	(
	actor
	| NL)*
	{
		mips.makeOutput();
		SymbolTable.pop();
	}
	;

actor:
		'actor' ID 
		{
			SymbolTable.push();
		} 
		'<' CONST_NUM
		{
			//mips.addActor( $ID.text , $CONST_NUM.int );
		}
		'>' NL
		(state | 
		receiver
		 | NL)*
		'end' (NL | EOF) 
		{
			SymbolTable.pop();
		}
	;

receiver :
		{
			SymbolTable.push();
		}
		'receiver' op=ID
		{

			//mips.addReceiver( $op.text );
		}
		'(' (os=type ot=ID {SymbolTable.define();}(',' ou=type ow=ID {SymbolTable.define();})*)? ')' NL
		statements
		'end' NL
		{
			//mips.addReceiverSkeleton();
			SymbolTable.pop();
		}
	;

state:
		op=type os=ID 
		(',' ot=ID )* NL
	;

type:
		'char' 
		('[' CONST_NUM ']')* 
	|	'int'  
		('[' CONST_NUM ']')* 
	;

block: 
		{
			SymbolTable.push();
		}
		'begin' 
		NL
			statements
		'end' 
		NL
		{
			SymbolTable.pop();
		}
	;

stm_if_elseif_else:

		op='if' 
		os=expr
		{
			SymbolTable.push();			
		} 
		NL statements 
		{ 
			SymbolTable.pop();	
			if(!( $os.item.getVariable().getType() instanceof IntType || $os.item.getVariable().getType() instanceof NoType ) )
				print("Error in line "+$op.line+" if expression must be integer");
		}
		(
			opp='elseif' 
			ou=expr
			{
				SymbolTable.push();
				if(!( $os.item.getVariable().getType() instanceof IntType || $os.item.getVariable().getType() instanceof NoType ) )
					print("Error in line "+$opp.line+" if expression must be integer");
			} 
			NL statements
			{
				SymbolTable.pop();
			}
		)*
		(
			'else' 
			NL
			{
				SymbolTable.push();		
			} 
			statements
			{
				SymbolTable.pop();	
			}
		)?
		'end' NL
	;

stm_foreach:
		'foreach'
		{
			SymbolTable.push();			
		} 
		op=ID 
		'in' os=expr
		{
			SymbolTableCursorItem cursorItem;
			int offset = SymbolTable.top.getOffset( Register.SP );
			if(! ( $os.item.getVariable().getType() instanceof ArrayType ) )
			{
				cursorItem = new SymbolTableCursorItem( new Variable( $op.text , NoType.getInstance() ) , offset );
				if( !( $os.item.getVariable().getType() instanceof NoType ) )
					print("Error in line "+$op.line+" It must be an array");
			}
			else 
			{
				if( ((ArrayType)$os.item.getVariable().getType()).DimensionsCount()==1){
					if($os.item.getVariable().getType() instanceof CharArrayType)
						cursorItem=new SymbolTableCursorItem(new Variable($op.text,CharType.getInstance()), offset );
					else
						cursorItem=new SymbolTableCursorItem(new Variable($op.text,IntType.getInstance()), offset );
				}
				else{
					if($os.item.getVariable().getType() instanceof CharArrayType)
						cursorItem=new SymbolTableCursorItem(new Variable($op.text, CharArrayType.getInstance()), offset );
					else
						cursorItem=new SymbolTableCursorItem(new Variable($op.text,IntArrayType.getInstance()) , offset );
					((ArrayType)cursorItem.getVariable().getType()).pushNewDimensions(new ArrayList<Integer>(((ArrayType)$os.item.getVariable().getType()).getDimensions()));
					((ArrayType)cursorItem.getVariable().getType()).getDimensions().remove(0);
				}
			}
			try
			{
				SymbolTable.top.put(cursorItem);
			}
			catch( ItemAlreadyExistsException e ) {
				print( "Error in line " + $op.line + " redefinition of variable " + $op.text );
				try
				{
					String name = "compiler::cursor";
					SymbolTable.top.put( new SymbolTableCursorItem( new Variable( name , cursorItem.getVariable().getType() ) , 0 ));
				}
				catch( ItemAlreadyExistsException ex ) {}
			}
		}
		NL
			statements
		'end'
		{ 
			SymbolTable.pop();
		} 
		NL	
	;

statements:
		(statement | NL)*
	;

statement:
		stm_vardef
	|	op=stm_assignment
	{
		if( ! $op.isStatement )
			print( "Error in line " + $op.lineNumber + " this line is not a statement" );
	}
	|	stm_foreach
	|	stm_if_elseif_else
	|	stm_quit
	|	stm_break
	|	stm_tell
	|	stm_write
	|	block
	;

stm_vardef:
		type os=ID 
		{
			String name;
			SymbolTableLocalVariableItem item;
			name =  $os.text;
			item = ( SymbolTableLocalVariableItem ) SymbolTable.top.getInCurrentScope( name );
			mips.addCode( "addiu \$fp, \$sp, " + ( item.getOffset() + item.getVariable().size() ) + " #variable " + name + " declaration"  );
		}
		(
		{
			mips.addCode( "addiu \$a0, \$fp, -4" );
			mips.addCode( "sw \$a0, 0(\$fp)");
			mips.addCode( "addiu \$fp, \$fp, 4" );
		}
			'=' om=expr
		{
			if( !( $om.item.getVariable().getType().equals( item.getVariable().getType() ) ) && !( $om.item.getVariable().getType() instanceof NoType ) )
				print("Error in line "+$os.line+" rValue & lValue are not from same types");			
			mips.generateCodeForAssignment( item.getVariable().size() , $om.item.isLValue );
		}
		) ? { SymbolTable.define(); }  (',' ot=ID
		{
			name = $ot.text;
			item = ( SymbolTableLocalVariableItem ) SymbolTable.top.getInCurrentScope( name );
			mips.addCode( "addiu \$fp, \$sp, " + ( item.getOffset() + item.getVariable().size() ) + " #variable " + name + " declaration"  );
		} 
		(
			{
				mips.addCode( "addiu \$a0, \$fp, -4" );
				mips.addCode( "sw \$a0, 0(\$fp)");
				mips.addCode( "addiu \$fp, \$fp, 4" );
			}
			'=' on=expr
		{
			if( !( $on.item.getVariable().getType().equals( item.getVariable().getType() ) ) && !( $on.item.getVariable().getType() instanceof NoType ) )
				print("Error in line "+$os.line+" rValue & lValue are not from same types");			
			mips.generateCodeForAssignment( item.getVariable().size() , $on.item.isLValue );
		}
		)?{SymbolTable.define();})* NL
	;

stm_tell:
		{int destination;}(ot=ID{destination=1;} | 'sender'{destination=2;} | 'self'{destination=3;}) '<<' op=ID '('
	{
		ArrayList<SymbolTableTemporaryVariableItem> arguments=new ArrayList<>();	
	}
	 (om=expr{arguments.add($om.item);} (',' oj=expr{arguments.add($oj.item);})*)? ')'
	{
		if(destination==1)
		{
			ActorSymbolTableItem item=(ActorSymbolTableItem)SymbolTable.top.get("actor_"+$ot.text);
			if(item==null)
				print("Error in line "+$op.line+" actor '"+$ot.text+"' does'nt exist");
			else{
				String key="receiver_"+$op.text+ "_";
				for(int i=0;i<arguments.size();i++){
					key+=arguments.get(i).getVariable().getType().toString() + " ";
				}
				ReceiverSymbolTableItem recItem=(ReceiverSymbolTableItem)item.getAccordingST().getInCurrentScope(key);
				if(recItem==null)
					print("Error in line "+$op.line+" there is not such receiver in actor '"+$ot.text+"'");
			}
		}
		else if(destination==3){
			SymbolTable temp=SymbolTable.top;
			while(temp.pre.pre!=null)
				temp=temp.pre;
			String actorKey=temp.getkeyOfActorAccordingToActorST();
			ActorSymbolTableItem item=(ActorSymbolTableItem)SymbolTable.top.get(actorKey);
			String key="receiver_"+$op.text+ "_";
			for(int i=0;i<arguments.size();i++){
				key+=arguments.get(i).getVariable().getType().toString() + " ";
			}
			//print( key );
			ReceiverSymbolTableItem recItem=(ReceiverSymbolTableItem)temp.getInCurrentScope(key);
			if(recItem==null)
				print("Error in line "+$op.line+" there is not such receiver in actor '"+item.getName()+"'");
		}
		else if(destination==2){
			if(SymbolTable.top.isInitReceiverScope)
				print("Error in line "+$op.line+" sender could not be used in init() receiver");
		}
	}
	 NL
	;

stm_write:
		op='write' '(' os=expr 
		{
			if($os.item.getVariable().getType() instanceof ArrayType){
				if($os.item.getVariable().getType() instanceof IntArrayType)
					print("Error in line "+$op.line+" write argument cannot be int array");
				else if( ((CharArrayType)$os.item.getVariable().getType()).DimensionsCount()>1)
					print("Error in line "+$op.line+" write argument cannot be a multidimensional array");
			}
			mips.generateWrite( $os.item.getVariable().getType() , $os.item.isLValue );
		}
		')' NL
	;


stm_quit:
		op='quit'
		NL
	;

stm_break:
		op='break' NL
	;

stm_assignment returns[ boolean isStatement , int lineNumber ]:
		op=expr 
		NL
		{
			$isStatement = $op.isStatement;
			$lineNumber = $op.ln;
		}
	;

expr returns[ SymbolTableTemporaryVariableItem item , int couldBeAssigned , boolean isStatement , int ln ] locals[ int lineNumber ] :
		op=expr_assign
		{
			$couldBeAssigned=$op.syn_couldBeAssigned;
			$item=$op.item;
			$isStatement = $op.isStatement;
			$ln = $lineNumber;
		}
	;

expr_assign returns[int syn_couldBeAssigned , SymbolTableTemporaryVariableItem item , boolean isStatement ] locals[int couldBeAssigned]:
		{$couldBeAssigned=1;} os=expr_or op='=' ou=expr_assign
		{
			$isStatement = true;
			if($couldBeAssigned==0)
			{
				print("Error in line "+$op.line+" left hand must be Lvalue");
				$item = new SymbolTableTemporaryVariableItem( new Variable( "temp" , NoType.getInstance() ) , 0 );
			}
			else if (!$os.item.getVariable().getType().equals($ou.item.getVariable().getType()) && !( $os.item.getVariable().getType() instanceof NoType || $ou.item.getVariable().getType() instanceof NoType ))
			{
				print("Error in line "+$op.line+" left hand & right hand types must be equal");
				$item = new SymbolTableTemporaryVariableItem( new Variable( "temp" , NoType.getInstance() ) , 0 );
			}
			else if( ( $os.item.getVariable().getType() instanceof NoType || $ou.item.getVariable().getType() instanceof NoType ) )
				$item = new SymbolTableTemporaryVariableItem( new Variable( "temp" , NoType.getInstance() ) , 0 );
			else
				$item=$os.item;

			$syn_couldBeAssigned=$couldBeAssigned;
			mips.generateCodeForAssignment( $os.item.getVariable().size() , $ou.item.isLValue );		

		}
	|	{$couldBeAssigned=1;}on=expr_or
		{
			$item=$on.item;
			$syn_couldBeAssigned=$couldBeAssigned;
			$isStatement = false;
		}
	;

expr_or returns[SymbolTableTemporaryVariableItem item]:
		ou=expr_and os=expr_or_tmp
		{
			if($os.isThereORoperator==0)
				$item=$ou.item;
			else{
				if( !( $ou.item.getVariable().getType() instanceof IntType || $ou.item.getVariable().getType() instanceof NoType ) || !( $os.item.getVariable().getType() instanceof IntType || $os.item.getVariable().getType() instanceof NoType  ) )
				{
					print( "Error in line " + $os.orLine + " or is defined on integers" );
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				}
				else if( $ou.item.getVariable().getType() instanceof NoType && $os.item.getVariable().getType() instanceof NoType )
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				else
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
				mips.operationCommand( "or" );
			}
		}
	;

expr_or_tmp returns[ SymbolTableTemporaryVariableItem item , int isThereORoperator , int orLine ]:
		op='or' {$isThereORoperator=1;$expr_assign::couldBeAssigned=0; $orLine = $op.line; }
		ou=expr_and os=expr_or_tmp
		{
			if($os.isThereORoperator==0)
				$item=$ou.item;
			else {
				if( !( $ou.item.getVariable().getType() instanceof IntType || $ou.item.getVariable().getType() instanceof NoType ) || !( $os.item.getVariable().getType() instanceof IntType || $os.item.getVariable().getType() instanceof NoType  ) )
				{
					print( "Error in line " + $op.line + " : operands in or must be integers" );
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				}
				else if( $ou.item.getVariable().getType() instanceof NoType || $os.item.getVariable().getType() instanceof NoType )
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				else
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
				mips.operationCommand( $op.text );
			}	
		}
	| {$isThereORoperator=0;$item=null;}
	;

expr_and returns[SymbolTableTemporaryVariableItem item]:
		ou=expr_eq os=expr_and_tmp
		{
			if($os.isThereANDoperator==0)
				$item=$ou.item;
			else{
				if( !( $ou.item.getVariable().getType() instanceof IntType || $ou.item.getVariable().getType() instanceof NoType ) || !( $os.item.getVariable().getType() instanceof IntType || $os.item.getVariable().getType() instanceof NoType  ) )
				{
					print( "Error in line " + $os.andLine + " : non integer operands" );
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				}
				else if( $ou.item.getVariable().getType() instanceof NoType && $os.item.getVariable().getType() instanceof NoType )
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				else
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
				mips.operationCommand( "and" );
			}
		}
	;

expr_and_tmp returns[SymbolTableTemporaryVariableItem item,int isThereANDoperator , int andLine ]:
		op='and'{$isThereANDoperator=1;$expr_assign::couldBeAssigned=0; $andLine = $op.line ;} 
		ou=expr_eq os=expr_and_tmp
		{
			if($os.isThereANDoperator==0)
				$item=$ou.item;
			else
			{ 
				if( !( $ou.item.getVariable().getType() instanceof IntType || $ou.item.getVariable().getType() instanceof NoType ) || !( $os.item.getVariable().getType() instanceof IntType || $os.item.getVariable().getType() instanceof NoType  ) )
				{
					print( "Error in line " + $op.line + " : operands in and must be integers" );
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				}
				else if( $ou.item.getVariable().getType() instanceof NoType || $os.item.getVariable().getType() instanceof NoType )
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				else
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
				mips.operationCommand( $op.text );
			}
		}	
	|{$isThereANDoperator=0;$item=null;}
	;

expr_eq returns[SymbolTableTemporaryVariableItem item]:
		{
			mips.addCode( "li \$s4, 1" );
		}
		ou=expr_cmp os=expr_eq_tmp
		{	
			if($os.isThereEQNEQoperator==0)
				$item=$ou.item;
			else
			{ 
				if(! $ou.item.getVariable().getType().equals( $os.item.getVariable().getType() ) && !( $ou.item.getVariable().getType() instanceof NoType || $os.item.getVariable().getType() instanceof NoType ) )
				{
					print("Error in line "+$os.eqline+" compared operands must have same types");
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				}
				else if( $ou.item.getVariable().getType() instanceof NoType || $os.item.getVariable().getType() instanceof NoType )
					$item = new SymbolTableTemporaryVariableItem( new Variable( "temp" , NoType.getInstance() ) , 0 );
				else
						$item=new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
				mips.generateCodeForEquality( $os.eqoperator , $ou.item , $os.isFirstLValue  );
				mips.addCode( "sw \$s4, 0(\$t6)" );
				mips.addCode( "addiu \$fp, \$fp, -4" );
				mips.addCode( "sw \$t6, 0(\$fp)" );
				mips.addCode( "addiu \$fp, \$fp, 4" );
				mips.addCode( "addiu \$t6, \$t6, -4" );
			}
		}
	;

expr_eq_tmp returns[SymbolTableTemporaryVariableItem item,int isThereEQNEQoperator,int eqline , String eqoperator , int isFirstLValue ]:
		op=('==' | '<>'){$eqline=$op.line;$isThereEQNEQoperator=1;$expr_assign::couldBeAssigned=0; $eqoperator = $op.text; } 
		ou=expr_cmp os=expr_eq_tmp
		{
			$isFirstLValue = $expr_cmp.item.isLValue;
			if($os.isThereEQNEQoperator==0)
				$item=$ou.item;
			else
			{ 
				if(! $ou.item.getVariable().getType().equals($os.item.getVariable().getType()) && !( $ou.item.getVariable().getType() instanceof NoType || $os.item.getVariable().getType() instanceof NoType ) )
				{
					print("Error in line "+$op.line+" compared operands must have same types");
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				}
				else if( $ou.item.getVariable().getType() instanceof NoType || $os.item.getVariable().getType() instanceof NoType )
					$item = new SymbolTableTemporaryVariableItem( new Variable( "temp" , NoType.getInstance() ) , 0 );
				else
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
				mips.generateCodeForEquality( $os.eqoperator , $ou.item , $os.isFirstLValue  );	
			}
		}
	|
	{
		$isThereEQNEQoperator=0;
		$item=null;
	}
	;

expr_cmp returns[SymbolTableTemporaryVariableItem item]:
		ou=expr_add os=expr_cmp_tmp
		{
			if($os.isThereCMPoperator==0)
				$item=$ou.item;
			else{
				if($os.item.getVariable().getType() instanceof NoType || $ou.item.getVariable().getType() instanceof NoType)
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				else if( !( $ou.item.getVariable().getType() instanceof IntType ) || !( $os.item.getVariable().getType() instanceof IntType ))
					print( "Error in line " + $os.compLine + " operands for comparision must be integers" );
				else
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
				mips.operationCommand( $os.compoperator );
			}
		}
	;

expr_cmp_tmp returns[SymbolTableTemporaryVariableItem item,int isThereCMPoperator , int compLine , String compoperator ]:
		op=('<' | '>'){$isThereCMPoperator=1; $expr_assign::couldBeAssigned=0; $compLine = $op.line ; $compoperator = $op.text; } 
		ou=expr_add os=expr_cmp_tmp
		{
			if($os.isThereCMPoperator==0)
			{
				if($ou.item.getVariable().getType() instanceof ArrayType ||$ou.item.getVariable().getType() instanceof CharType){
					print("Error in line "+$op.line+" mathematical operand must be integer");
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				}
				else
					$item=$ou.item;
			}
			else 
			{
				if( !( $ou.item.getVariable().getType() instanceof IntType || $ou.item.getVariable().getType() instanceof NoType ) || !( $os.item.getVariable().getType() instanceof IntType || $os.item.getVariable().getType() instanceof NoType  ) )
				{
					print( "Error in line " + $op.line + " : operands in relational comparision must be integers" );
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				}
				else if($os.item.getVariable().getType() instanceof NoType || $ou.item.getVariable().getType() instanceof NoType)
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				else
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
				mips.operationCommand( $os.compoperator );
			}
		}
	|{
		$isThereCMPoperator=0;
		$item=null;
	}
	;

expr_add returns[SymbolTableTemporaryVariableItem item]:
		ou=expr_mult os=expr_add_tmp
		{
			if($os.isTherePMoperator==0)
				$item=$ou.item;
			else{
				if($os.item.getVariable().getType() instanceof NoType || $ou.item.getVariable().getType() instanceof NoType)
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				else if( !( $ou.item.getVariable().getType() instanceof IntType ) || !( $os.item.getVariable().getType() instanceof IntType ) )
				{
					print( "Error in line " + $os.addLine + " add is defined on integers" );
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				}
				else
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
				mips.operationCommand( $os.asoperator );
			}

		}
	;

expr_add_tmp returns[SymbolTableTemporaryVariableItem item,int isTherePMoperator , int addLine , String asoperator ]:
		op=('+' | '-')
		{
			$isTherePMoperator=1;
			$expr_assign::couldBeAssigned=0; 
			$addLine = $op.line; $asoperator = $op.text; 
		} 
		ou=expr_mult os=expr_add_tmp
		{
			if($os.isTherePMoperator==0)
			{
				if($ou.item.getVariable().getType() instanceof ArrayType ||$ou.item.getVariable().getType() instanceof CharType){
					print("Error in line "+$op.line+" mathematical operand must be integer");
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				}
				else
					$item=$ou.item;
			}
			else
			{ 
				if($os.item.getVariable().getType() instanceof NoType || $ou.item.getVariable().getType() instanceof NoType)
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				else if( !( $ou.item.getVariable().getType() instanceof IntType ) || !( $os.item.getVariable().getType() instanceof IntType ) )
				{
					print( "Error in line " + $op.line + " add is defined on integers" );
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				}
				else
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
				mips.operationCommand( $os.asoperator );
			}
		}	
	|{$isTherePMoperator=0;$item=null;}
	;

expr_mult returns[SymbolTableTemporaryVariableItem item]:
		ou=expr_un os=expr_mult_tmp
		{
			if($os.isThereMDoperator==0)
				$item=$ou.item;
			else{
				if($os.item.getVariable().getType() instanceof NoType || $ou.item.getVariable().getType() instanceof NoType)
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				else if( $os.item.getVariable().getType() instanceof IntType && $ou.item.getVariable().getType() instanceof IntType )
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
				else
				{
					print( "Error in line " + $os.multLine + " the operands must be integers" );
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				}
				mips.operationCommand( $os.multoperator );
			}
		}
	;

expr_mult_tmp returns[SymbolTableTemporaryVariableItem item,int isThereMDoperator , int multLine , String multoperator ]:
		op=('*' | '/') {$isThereMDoperator=1;$expr_assign::couldBeAssigned=0; $multLine = $op.line ; $multoperator = $op.text;}
		ou=expr_un os=expr_mult_tmp
		{
			if($os.isThereMDoperator==0)
			{
				if($ou.item.getVariable().getType() instanceof ArrayType ||$ou.item.getVariable().getType() instanceof CharType){
					print("Error in line "+$op.line+" mathematical operand must be integer");
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				}
				else
					$item=$ou.item;
			}
			else
			{ 
				if($os.item.getVariable().getType() instanceof NoType || $ou.item.getVariable().getType() instanceof NoType)
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				else if( $os.item.getVariable().getType() instanceof IntType && $ou.item.getVariable().getType() instanceof IntType )
						$item=new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
				else
				{
					print( "Error in Line : " + $op.line + " the operands must be integers" );
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
				}
				mips.operationCommand( $os.multoperator );
			}
		}
	|{$isThereMDoperator=0;$item=null;}
	;

expr_un returns [SymbolTableTemporaryVariableItem item,int isThereUnOperator]:
		op=('not' | '-'){$isThereUnOperator=1;$expr_assign::couldBeAssigned=0;} ou=expr_un
		{
			if($ou.isThereUnOperator==0 && ($ou.item.getVariable().getType() instanceof ArrayType ||$ou.item.getVariable().getType() instanceof CharType)){
					print("Error in line "+$op.line+" mathematical operand must be integer");
					$item=new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
			}
			else
				$item=$ou.item;
			String operand = $op.text + "u";
			mips.operationCommand( operand );
		}
	|	or=expr_mem{
			$item=$or.item;$isThereUnOperator=0;
		}
	;

expr_mem returns [SymbolTableTemporaryVariableItem item] locals[int badAccessFlag,int mem_tmp_cnt]:
		{
			$badAccessFlag=0;
			$mem_tmp_cnt=0;
		}
		og=expr_other oi=expr_mem_tmp
		{
			if($badAccessFlag==1)
			{
				$item = new SymbolTableTemporaryVariableItem( new Variable( "temp" , NoType.getInstance()) , 0 );				
				print("Error in line "+$oi.arrayAccessLine+" array indexes' types must be int");		
			}
			if($mem_tmp_cnt!=0){
				if(!($og.item.getVariable().getType() instanceof ArrayType) && !( $og.item.getVariable().getName().equals("temp_read") ) && !( $og.item.getVariable().getName().equals("temp_curly") ))
				{
					if( !($og.item.getVariable().getType() instanceof NoType ))
						print("Error in line "+$oi.arrayAccessLine+" the operand must be an array");
					$item = new SymbolTableTemporaryVariableItem( new Variable( "temp" , NoType.getInstance()) , 0 );
				}
				else{
					if(((ArrayType)$og.item.getVariable().getType()).DimensionsCount()<$mem_tmp_cnt)
					{
						$item = new SymbolTableTemporaryVariableItem( new Variable( "temp" , NoType.getInstance()) , 0 );
						print("Error in line "+$oi.arrayAccessLine+" bad access");
					}
					else if(((ArrayType)$og.item.getVariable().getType()).DimensionsCount()==$mem_tmp_cnt)
					{
						if($og.item.getVariable().getType() instanceof CharArrayType)
							$item=new SymbolTableTemporaryVariableItem(new Variable("temp",CharType.getInstance()),0);
						else
							$item=new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
					}
					else{
						ArrayList<Integer> dimens=new ArrayList<>(((ArrayType)$og.item.getVariable().getType()).getDimensions());
						for(int i=0;i<$mem_tmp_cnt;i++)
							dimens.remove(0);
						ArrayType type;
						if($og.item.getVariable().getType() instanceof CharArrayType)
							type=CharArrayType.getInstance();
						else
							type=IntArrayType.getInstance();
						type.pushNewDimensions(dimens);
						$item=new SymbolTableTemporaryVariableItem(new Variable("temp",type),0);
					}
					mips.generateAccessCode( $oi.indices.size() , $og.item );
				}
			}
			else
				$item=$og.item;
		}
	;

expr_mem_tmp returns[int arrayAccessLine , ArrayList<SymbolTableTemporaryVariableItem> indices , int isExecuted ]:
		oi='['{$arrayAccessLine=$oi.line; $isExecuted = 1;} op=expr ']'
		{
				$indices = new ArrayList<SymbolTableTemporaryVariableItem>();
				$expr_mem::mem_tmp_cnt++;
				if(! ( $op.item.getVariable().getType() instanceof IntType ) && ! ( $op.item.getVariable().getType() instanceof NoType ) )
					$expr_mem::badAccessFlag=1;
		}
		oj=expr_mem_tmp
		{
			if( $oj.isExecuted == 1 )
			{
				$oj.indices.add( 0 , $op.item );
				$indices = $oj.indices;
			}
			else
				$indices.add( $op.item );
		}
	| { $isExecuted = 0; }
	;

expr_other returns[ SymbolTableTemporaryVariableItem item , String name ]:
		oa=CONST_NUM
		{
			$expr::lineNumber = $oa.line;
			$item=new SymbolTableTemporaryVariableItem(new Variable("temp_const_int",IntType.getInstance()),0);
			$expr_assign::couldBeAssigned=0;
			$item.isLValue = 0;
			mips.addConstIntToStack( $oa.int );
		}
	|	ot=CONST_CHAR
		{
			$expr::lineNumber = $ot.line;
			$item=new SymbolTableTemporaryVariableItem(new Variable("temp_const_char",CharType.getInstance()),0);
			$expr_assign::couldBeAssigned=0;
			$item.isLValue = 0;
			char temp = $ot.text.charAt( 1 );
			mips.addCode( "#adding character " + temp + " to stack" );
			mips.addConstIntToStack( ( int ) temp );
		}
	|	oe=CONST_STR
		{
			$expr::lineNumber = $oe.line;
			CharArrayType c = CharArrayType.getInstance();
			c.pushNewDimension( $oe.text.length() - 2 );
			$item=new SymbolTableTemporaryVariableItem(new Variable("temp_const_str", c ),0);
			$expr_assign::couldBeAssigned=0;
			$item.isLValue = 0;
			//mips.addConstStringToStack( $oe.text );
			mips.addConstStringToStack( $oe.text.length() - 2 , $oe.text );
		}
	|	
		oj=ID 
		{	
			$name = $oj.text;
			$expr::lineNumber = $oj.line;
			SymbolTableVariableItemBase localitem = (SymbolTableVariableItemBase) SymbolTable.top.get($oj.text);
			if(localitem==null){
				print("Error in line "+$oj.line+" item " +$oj.text+" does not exist");
				SymbolTableTemporaryVariableItem localitem1 = new SymbolTableTemporaryVariableItem(new Variable($oj.text ,NoType.getInstance()),0);
				try
				{
					SymbolTable.top.put( localitem1 );
				}
				catch( ItemAlreadyExistsException e ) {}
				$item = localitem1;
			}
			else{
				$item=new SymbolTableTemporaryVariableItem(localitem.getVariable(),localitem.getOffset());
				mips.addLvalueAddressToStack( localitem.getVariable().getName(), localitem.getBaseRegister() , ( localitem.getOffset() + localitem.getVariable().size() - Type.WORD_BYTES ) );
			}		
		}
	|
		oy='{' or=expr
		{
			ArrayList<SymbolTableTemporaryVariableItem> recordList = new ArrayList<SymbolTableTemporaryVariableItem>();
			boolean inconsistencyFlag = false;
			$expr::lineNumber = $oy.line;
			int dimen=1;
			$expr_assign::couldBeAssigned=0;
			if( $or.item.getVariable().getType() instanceof CharType || $or.item.getVariable().getType() instanceof IntType || $or.item.getVariable().getType() instanceof ArrayType )
				$item=new SymbolTableTemporaryVariableItem(new Variable("temp_curly", $or.item.getVariable().getType() ) ,0);
			else if( $or.item.getVariable().getType() instanceof NoType )
				$item=new SymbolTableTemporaryVariableItem(new Variable("temp_curly", NoType.getInstance() ) ,0);
			recordList.add( $or.item );
		}
		(',' ov=expr
		{
			if( !( $or.item.getVariable().getType().equals($ov.item.getVariable().getType()) ) )
			{
				inconsistencyFlag = true;
				if( !( $ov.item.getVariable().getType() instanceof NoType ) )
					print("Error in line "+$oy.line+" array contents do not match");
			}
			else
				dimen++;
			recordList.add( $ov.item );
		})* '}'
		{
			if( !( $or.item.getVariable().getType() instanceof NoType ) && !inconsistencyFlag )
			{
				if( $or.item.getVariable().getType() instanceof ArrayType )
					( (ArrayType) $item.getVariable().getType() ).pushNewDimensionToFirst(dimen);
				else
				{
					if( $or.item.getVariable().getType() instanceof IntType )
						$item = new SymbolTableTemporaryVariableItem(new Variable("temp_curly", new IntArrayType() ) ,0 );
					else
						$item = new SymbolTableTemporaryVariableItem(new Variable("temp_curly", new CharArrayType() ) ,0 );
					( (ArrayType) $item.getVariable().getType() ).pushNewDimensionToFirst( dimen );
				}
				$item.isLValue = 0;
			}
			else
				$item = new SymbolTableTemporaryVariableItem(new Variable("temp_curly", NoType.getInstance() ) ,0 );
			mips.generateCodeForRecord( recordList );
		}
	|	ow='read' '(' CONST_NUM ')'
		{
			$expr::lineNumber = $ow.line;
			if( $CONST_NUM.int == 0 )
				print( "Error in line " + $CONST_NUM.line + " , read argument must not be 0" );
			else
			{
				CharArrayType c = new CharArrayType();
				c.pushNewDimension( $CONST_NUM.int );
				$item=new SymbolTableTemporaryVariableItem(new Variable("temp_read", c),0);
				$expr_assign::couldBeAssigned=0;
				mips.generateRead( $CONST_NUM.int );
			}
			$item.isLValue = 0;
		}
	|	oz='(' od=expr ')'
		{
			$expr::lineNumber = $oz.line;
			$item=$od.item;
			$item.isLValue = $od.item.isLValue;
			if($od.couldBeAssigned==0)
				$expr_assign::couldBeAssigned=0;
		}
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
