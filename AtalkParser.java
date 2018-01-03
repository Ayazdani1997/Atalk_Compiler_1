// Generated from Atalk.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AtalkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, CONST_NUM=38, 
		CONST_CHAR=39, CONST_STR=40, NL=41, ID=42, COMMENT=43, WS=44;
	public static final int
		RULE_program = 0, RULE_actor = 1, RULE_receiver = 2, RULE_state = 3, RULE_type = 4, 
		RULE_block = 5, RULE_stm_if_elseif_else = 6, RULE_stm_foreach = 7, RULE_statements = 8, 
		RULE_statement = 9, RULE_stm_vardef = 10, RULE_stm_tell = 11, RULE_stm_write = 12, 
		RULE_stm_quit = 13, RULE_stm_break = 14, RULE_stm_assignment = 15, RULE_expr = 16, 
		RULE_expr_assign = 17, RULE_expr_or = 18, RULE_expr_or_tmp = 19, RULE_expr_and = 20, 
		RULE_expr_and_tmp = 21, RULE_expr_eq = 22, RULE_expr_eq_tmp = 23, RULE_expr_cmp = 24, 
		RULE_expr_cmp_tmp = 25, RULE_expr_add = 26, RULE_expr_add_tmp = 27, RULE_expr_mult = 28, 
		RULE_expr_mult_tmp = 29, RULE_expr_un = 30, RULE_expr_mem = 31, RULE_expr_mem_tmp = 32, 
		RULE_expr_other = 33;
	public static final String[] ruleNames = {
		"program", "actor", "receiver", "state", "type", "block", "stm_if_elseif_else", 
		"stm_foreach", "statements", "statement", "stm_vardef", "stm_tell", "stm_write", 
		"stm_quit", "stm_break", "stm_assignment", "expr", "expr_assign", "expr_or", 
		"expr_or_tmp", "expr_and", "expr_and_tmp", "expr_eq", "expr_eq_tmp", "expr_cmp", 
		"expr_cmp_tmp", "expr_add", "expr_add_tmp", "expr_mult", "expr_mult_tmp", 
		"expr_un", "expr_mem", "expr_mem_tmp", "expr_other"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'actor'", "'<'", "'>'", "'end'", "'receiver'", "'('", "','", "')'", 
		"'char'", "'['", "']'", "'int'", "'begin'", "'if'", "'elseif'", "'else'", 
		"'foreach'", "'in'", "'='", "'sender'", "'self'", "'<<'", "'write'", "'quit'", 
		"'break'", "'or'", "'and'", "'=='", "'<>'", "'+'", "'-'", "'*'", "'/'", 
		"'not'", "'{'", "'}'", "'read'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "CONST_NUM", "CONST_CHAR", "CONST_STR", "NL", "ID", "COMMENT", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Atalk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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
			String spRegName = new String( "$sp" );
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
			String spRegName = new String( "$sp" );
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

	public AtalkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public int lastRepeatedVarNum;
		public Stack <String> foreachCursor;
		public Stack <String> foreachArray;
		public ActorContext op;
		public List<TerminalNode> NL() { return getTokens(AtalkParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkParser.NL, i);
		}
		public List<ActorContext> actor() {
			return getRuleContexts(ActorContext.class);
		}
		public ActorContext actor(int i) {
			return getRuleContext(ActorContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
					((ProgramContext)getInvokingContext(0)).lastRepeatedVarNum = 0;
					((ProgramContext)_localctx).foreachCursor =  new Stack<String>();
					((ProgramContext)_localctx).foreachArray =  new Stack<String>();
					SymbolTable.push(new SymbolTable() );
				
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==NL) {
				{
				setState(73);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(69);
					((ProgramContext)_localctx).op = actor();

							try{
								SymbolTable.top.put(((ProgramContext)_localctx).op.asti);
							}
							catch(ItemAlreadyExistsException e){
								Atalk.pass1Passed = false;
								print("redefinition of actor with name "+((ProgramContext)_localctx).op.asti.getName()+" in line "+((ActorContext)getInvokingContext(1)).actorline);
								((ProgramContext)_localctx).op.asti.setActorName(((ProgramContext)_localctx).op.asti.getName()+"_"+((ProgramContext)getInvokingContext(0)).lastRepeatedVarNum);
								((ProgramContext)getInvokingContext(0)).lastRepeatedVarNum+=1;
								try{
									SymbolTable.top.put(((ProgramContext)_localctx).op.asti);
								}
								catch(ItemAlreadyExistsException ee){}
							} 
						print("actor <"+((ProgramContext)_localctx).op.asti.getName()+"> MB size:"+((ProgramContext)_localctx).op.asti.getActorMailBoxSize()); 
						
					}
					break;
				case NL:
					{
					setState(72);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

					if(SymbolTable.top.size()==0) 
					{
						Atalk.pass1Passed = false;
						print("there has to be at least one actor line:1");
					}
					SymbolTable.pop();
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActorContext extends ParserRuleContext {
		public ActorSymbolTableItem asti;
		public int actorline;
		public Token op;
		public Token os;
		public ReceiverContext ot;
		public List<TerminalNode> NL() { return getTokens(AtalkParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkParser.NL, i);
		}
		public TerminalNode ID() { return getToken(AtalkParser.ID, 0); }
		public TerminalNode CONST_NUM() { return getToken(AtalkParser.CONST_NUM, 0); }
		public TerminalNode EOF() { return getToken(AtalkParser.EOF, 0); }
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<ReceiverContext> receiver() {
			return getRuleContexts(ReceiverContext.class);
		}
		public ReceiverContext receiver(int i) {
			return getRuleContext(ReceiverContext.class,i);
		}
		public ActorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterActor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitActor(this);
		}
	}

	public final ActorContext actor() throws RecognitionException {
		ActorContext _localctx = new ActorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_actor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__0);
			setState(81);
			((ActorContext)_localctx).op = match(ID);

						int offset = startScopeWithSameBaseForEnteringReceiver( Register.GP , Register.TEMP9 );
						((ActorContext)_localctx).actorline = (((ActorContext)_localctx).op!=null?((ActorContext)_localctx).op.getLine():0);
					

						((ActorContext)_localctx).asti = new ActorSymbolTableItem(SymbolTable.top); 
						_localctx.asti.setActorName((((ActorContext)_localctx).op!=null?((ActorContext)_localctx).op.getText():null));
						SymbolTable.top.setkeyOfActorAccordingToActorST(_localctx.asti.getKey());
					
			setState(84);
			match(T__1);
			setState(85);
			((ActorContext)_localctx).os = match(CONST_NUM);

						if(! ((((ActorContext)_localctx).os!=null?Integer.valueOf(((ActorContext)_localctx).os.getText()):0)>0)) {
							Atalk.pass1Passed = false;
							print("bad actor mailbox size in line "+(((ActorContext)_localctx).os!=null?((ActorContext)_localctx).os.getLine():0)); 
							_localctx.asti.setActorMailBoxSize(0);
						}
						else _localctx.asti.setActorMailBoxSize((((ActorContext)_localctx).os!=null?Integer.valueOf(((ActorContext)_localctx).os.getText()):0));
					
			setState(87);
			match(T__2);
			setState(88);
			match(NL);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__11) | (1L << NL))) != 0)) {
				{
				setState(94);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__11:
					{
					setState(89);
					state();
					}
					break;
				case T__4:
					{
					setState(90);
					((ActorContext)_localctx).ot = receiver();
					 
								try{
									SymbolTable.top.put(((ActorContext)_localctx).ot.rsti);
								} catch(ItemAlreadyExistsException e){
									Atalk.pass1Passed = false;
									print("redefinition of receiver <"+((ActorContext)_localctx).ot.rsti.getName()+"> in line "+((ReceiverContext)getInvokingContext(2)).receiverline + " in actor "
									+ (((ActorContext)_localctx).op!=null?((ActorContext)_localctx).op.getText():null) );
									((ActorContext)_localctx).ot.rsti.setReceiverName(((ActorContext)_localctx).ot.rsti.getName()+"_"+((ProgramContext)getInvokingContext(0)).lastRepeatedVarNum);
									((ProgramContext)getInvokingContext(0)).lastRepeatedVarNum+=1; 
									try{
										SymbolTable.top.put(((ActorContext)_localctx).ot.rsti);
									}
									catch(ItemAlreadyExistsException ee){}
								}
								print("receiver <"+((ActorContext)_localctx).ot.rsti.getKey()+">");
							
					}
					break;
				case NL:
					{
					setState(93);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__3);
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}

						endScopeWithSameBaseForExitingReceiver( Register.GP , Register.TEMP9 , offset );
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverContext extends ParserRuleContext {
		public ReceiverSymbolTableItem rsti;
		public int receiverline;
		public Token op;
		public TypeContext os;
		public Token ot;
		public TypeContext ou;
		public Token ow;
		public List<TerminalNode> NL() { return getTokens(AtalkParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkParser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AtalkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitReceiver(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_receiver);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

						int offset = startScopeWithSameBaseForEnteringReceiver( Register.GP , Register.TEMP9 );
						///int offset = SymbolTable.top.getOffset( Register.GP );
						//SymbolTable.push(new SymbolTable(SymbolTable.top));
					
			setState(104);
			match(T__4);
			setState(105);
			((ReceiverContext)_localctx).op = match(ID);

						((ReceiverContext)_localctx).receiverline = (((ReceiverContext)_localctx).op!=null?((ReceiverContext)_localctx).op.getLine():0);
					

						((ReceiverContext)_localctx).rsti = new ReceiverSymbolTableItem();
						_localctx.rsti.setReceiverName((((ReceiverContext)_localctx).op!=null?((ReceiverContext)_localctx).op.getText():null));
					
			setState(108);
			match(T__5);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__11) {
				{
				setState(109);
				((ReceiverContext)_localctx).os = type();
				setState(110);
				((ReceiverContext)_localctx).ot = match(ID);

							String name=(((ReceiverContext)_localctx).ot!=null?((ReceiverContext)_localctx).ot.getText():null);
							if(SymbolTable.top.contains((((ReceiverContext)_localctx).ot!=null?((ReceiverContext)_localctx).ot.getText():null)))
							{
								Atalk.pass1Passed = false;
								print("bad argument name: "+(((ReceiverContext)_localctx).ot!=null?((ReceiverContext)_localctx).ot.getText():null));
								name=(((ReceiverContext)_localctx).ot!=null?((ReceiverContext)_localctx).ot.getText():null)+"_"+((ProgramContext)getInvokingContext(0)).lastRepeatedVarNum;
								((ProgramContext)getInvokingContext(0)).lastRepeatedVarNum++;
							} 
							_localctx.rsti.addReceiverArgument(((ReceiverContext)_localctx).os.vartype,name);
							try{
								SymbolTable.top.put(new SymbolTableFunctionArgumentItem(new Variable(name,((ReceiverContext)_localctx).os.vartype),SymbolTable.top.getOffset(Register.TEMP9)));
							}
							catch(ItemAlreadyExistsException e){}
							print( "variable <"+name+"> offset: "+((SymbolTableFunctionArgumentItem)SymbolTable.top.getInCurrentScope(name)).getOffset()+
							" type:"+((ReceiverContext)_localctx).os.vartype.toString()+" width: "+((ReceiverContext)_localctx).os.vartype.size() + " with base " 
							+ ((SymbolTableFunctionArgumentItem)SymbolTable.top.getInCurrentScope(name)).getBaseRegister() );
						
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(112);
					match(T__6);
					setState(113);
					((ReceiverContext)_localctx).ou = type();
					setState(114);
					((ReceiverContext)_localctx).ow = match(ID);

								String name2=(((ReceiverContext)_localctx).ow!=null?((ReceiverContext)_localctx).ow.getText():null);
								if(SymbolTable.top.contains((((ReceiverContext)_localctx).ow!=null?((ReceiverContext)_localctx).ow.getText():null)))
								{
									Atalk.pass1Passed = false;
									print("bad argument name: "+(((ReceiverContext)_localctx).ow!=null?((ReceiverContext)_localctx).ow.getText():null));
									name2=(((ReceiverContext)_localctx).ow!=null?((ReceiverContext)_localctx).ow.getText():null)+"_"+((ProgramContext)getInvokingContext(0)).lastRepeatedVarNum;
									((ProgramContext)getInvokingContext(0)).lastRepeatedVarNum++;
								}
								_localctx.rsti.addReceiverArgument(((ReceiverContext)_localctx).ou.vartype,name2);
								try{
									SymbolTable.top.put(new SymbolTableFunctionArgumentItem(new Variable(name2,((ReceiverContext)_localctx).ou.vartype),SymbolTable.top.getOffset(Register.TEMP9)));
								}
								catch(ItemAlreadyExistsException e){}
								//print( "hello\n" );
								print("variable <"+name2+"> offset: "+((SymbolTableFunctionArgumentItem)SymbolTable.top.getInCurrentScope(name2)).getOffset()+
								" type:"+((ReceiverContext)_localctx).ou.vartype.toString()+" width: "+((ReceiverContext)_localctx).ou.vartype.size() + " with base " 
								+ ((SymbolTableFunctionArgumentItem)SymbolTable.top.getInCurrentScope(name2)).getBaseRegister() ); 
							
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(124);
			match(T__7);
			setState(125);
			match(NL);
			setState(126);
			statements();
			setState(127);
			match(T__3);
			setState(128);
			match(NL);

						if(_localctx.rsti.getKey().equals("receiver_init_"))
						{
							SymbolTable.top.isInitReceiverScope=true;
							SymbolTable.top.pre.actorSetHasInit();
						}
						endScopeWithSameBaseForExitingReceiver( Register.GP , Register.TEMP9 , offset );
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateContext extends ParserRuleContext {
		public TypeContext op;
		public Token os;
		public Token ot;
		public TerminalNode NL() { return getToken(AtalkParser.NL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AtalkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkParser.ID, i);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((StateContext)_localctx).op = type();
			setState(132);
			((StateContext)_localctx).os = match(ID);

						String name=(((StateContext)_localctx).os!=null?((StateContext)_localctx).os.getText():null);
						try {
							int offset = SymbolTable.top.getOffset(Register.GP);
							SymbolTable.top.put(new SymbolTableGlobalVariableItem(new Variable((((StateContext)_localctx).os!=null?((StateContext)_localctx).os.getText():null),((StateContext)_localctx).op.vartype), offset ));
						}
						catch(ItemAlreadyExistsException e)
						{
							Atalk.pass1Passed = false;
							print("redefinition of variable " + name + "; in line "+(((StateContext)_localctx).os!=null?((StateContext)_localctx).os.getLine():0));
							try{
								SymbolTable.top.put(new SymbolTableGlobalVariableItem(new Variable((((StateContext)_localctx).os!=null?((StateContext)_localctx).os.getText():null)+"_"+((ProgramContext)getInvokingContext(0)).lastRepeatedVarNum,((StateContext)_localctx).op.vartype),SymbolTable.top.getOffset(Register.GP)));
								name=(((StateContext)_localctx).os!=null?((StateContext)_localctx).os.getText():null)+"_"+(((ProgramContext)getInvokingContext(0)).lastRepeatedVarNum++);
							}
							catch(ItemAlreadyExistsException ee){}
						}
						print("variable <"+name+"> offset: "+((SymbolTableGlobalVariableItem)SymbolTable.top.getInCurrentScope(name)).getOffset()+
						" type:"+((StateContext)_localctx).op.vartype.toString()+" width: "+((StateContext)_localctx).op.vartype.size() + " with base " 
						+ ((SymbolTableGlobalVariableItem)SymbolTable.top.getInCurrentScope(name)).getBaseRegister() );
					
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(134);
				match(T__6);
				setState(135);
				((StateContext)_localctx).ot = match(ID);

							String name2=(((StateContext)_localctx).ot!=null?((StateContext)_localctx).ot.getText():null);
							try{
								SymbolTable.top.put(new SymbolTableGlobalVariableItem(new Variable((((StateContext)_localctx).ot!=null?((StateContext)_localctx).ot.getText():null),((StateContext)_localctx).op.vartype),SymbolTable.top.getOffset(Register.GP)));
							}
							catch(ItemAlreadyExistsException e){
								Atalk.pass1Passed = false;
								print("redefinition of variable " + name2 + "; in line "+(((StateContext)_localctx).os!=null?((StateContext)_localctx).os.getLine():0));
								try{
									SymbolTable.top.put(new SymbolTableGlobalVariableItem(new Variable((((StateContext)_localctx).ot!=null?((StateContext)_localctx).ot.getText():null)+"_"+((ProgramContext)getInvokingContext(0)).lastRepeatedVarNum,((StateContext)_localctx).op.vartype),SymbolTable.top.getOffset(Register.GP)));
									name2=(((StateContext)_localctx).ot!=null?((StateContext)_localctx).ot.getText():null)+"_"+(((ProgramContext)getInvokingContext(0)).lastRepeatedVarNum++);
								}
								catch(ItemAlreadyExistsException ee){}
							}
							print( "variable <"+name2+"> offset: "+((SymbolTableGlobalVariableItem)SymbolTable.top.getInCurrentScope(name2)).getOffset()+
							" type:"+((StateContext)_localctx).op.vartype.toString()+" width: "+((StateContext)_localctx).op.vartype.size() + " with base " 
							+ ((SymbolTableGlobalVariableItem)SymbolTable.top.getInCurrentScope(name2)).getBaseRegister() );
						
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type vartype;
		public Token CONST_NUM;
		public List<TerminalNode> CONST_NUM() { return getTokens(AtalkParser.CONST_NUM); }
		public TerminalNode CONST_NUM(int i) {
			return getToken(AtalkParser.CONST_NUM, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(T__8);

							((TypeContext)_localctx).vartype = CharArrayType.getInstance();
						
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(146);
					match(T__9);
					setState(147);
					((TypeContext)_localctx).CONST_NUM = match(CONST_NUM);
					setState(148);
					match(T__10);

								if((((TypeContext)_localctx).CONST_NUM!=null?Integer.valueOf(((TypeContext)_localctx).CONST_NUM.getText()):0)>0) 
									((CharArrayType) _localctx.vartype ).pushNewDimension((((TypeContext)_localctx).CONST_NUM!=null?Integer.valueOf(((TypeContext)_localctx).CONST_NUM.getText()):0));
								else
								{
									Atalk.pass1Passed = false;
									print( "invalid size for an array of character. the size must be greater than zero");
									((CharArrayType) _localctx.vartype).pushNewDimension( 0 );
								}
							
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

							if(( (CharArrayType) _localctx.vartype).DimensionsCount()==0) 
								((TypeContext)_localctx).vartype = CharType.getInstance();
						
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(T__11);

							((TypeContext)_localctx).vartype = IntArrayType.getInstance();
						
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(158);
					match(T__9);
					setState(159);
					((TypeContext)_localctx).CONST_NUM = match(CONST_NUM);
					setState(160);
					match(T__10);

								if((((TypeContext)_localctx).CONST_NUM!=null?Integer.valueOf(((TypeContext)_localctx).CONST_NUM.getText()):0)>0) 
									((IntArrayType) _localctx.vartype ).pushNewDimension((((TypeContext)_localctx).CONST_NUM!=null?Integer.valueOf(((TypeContext)_localctx).CONST_NUM.getText()):0));
								else
								{
									Atalk.pass1Passed = false;
									print( "invalid size for an array of integer. the size must be greater than zero");
									((IntArrayType)_localctx.vartype).pushNewDimension( 0 );
								}
							
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

							if(((IntArrayType)_localctx.vartype).DimensionsCount()==0) 
								((TypeContext)_localctx).vartype =  IntType.getInstance();
						
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(AtalkParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkParser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{

						int offset = startScopeWithSameBase( Register.SP );
					
			setState(171);
			match(T__12);
			setState(172);
			match(NL);
			setState(173);
			statements();
			setState(174);
			match(T__3);
			setState(175);
			match(NL);

						endScopeWithSameBase( Register.SP , offset );
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_if_elseif_elseContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(AtalkParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkParser.NL, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Stm_if_elseif_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_if_elseif_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterStm_if_elseif_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitStm_if_elseif_else(this);
		}
	}

	public final Stm_if_elseif_elseContext stm_if_elseif_else() throws RecognitionException {
		Stm_if_elseif_elseContext _localctx = new Stm_if_elseif_elseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stm_if_elseif_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__13);
			setState(179);
			expr();

						int offset = startScopeWithSameBase( Register.SP );
					
			setState(181);
			match(NL);
			setState(182);
			statements();
			 
						endScopeWithSameBase( Register.SP , offset ); 
					
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(184);
				match(T__14);
				setState(185);
				expr();

								int localoffset = startScopeWithSameBase( Register.SP );
							
				setState(187);
				match(NL);
				setState(188);
				statements();

								endScopeWithSameBase( Register.SP , localoffset );
							
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(196);
				match(T__15);
				setState(197);
				match(NL);

								int localoffset1 = startScopeWithSameBase( Register.SP  );		
							
				setState(199);
				statements();

								endScopeWithSameBase( Register.SP , localoffset1 );		
							
				}
			}

			setState(204);
			match(T__3);
			setState(205);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_foreachContext extends ParserRuleContext {
		public Token op;
		public ExprContext os;
		public List<TerminalNode> NL() { return getTokens(AtalkParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkParser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ID() { return getToken(AtalkParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stm_foreachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_foreach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterStm_foreach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitStm_foreach(this);
		}
	}

	public final Stm_foreachContext stm_foreach() throws RecognitionException {
		Stm_foreachContext _localctx = new Stm_foreachContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stm_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__16);

						int offset = startScopeWithSameBase( Register.SP );
						SymbolTable.top.setInForeachST();
					
			setState(209);
			((Stm_foreachContext)_localctx).op = match(ID);

						((ProgramContext)getInvokingContext(0)).foreachCursor.push( (((Stm_foreachContext)_localctx).op!=null?((Stm_foreachContext)_localctx).op.getText():null) );
					
			setState(211);
			match(T__17);
			setState(212);
			((Stm_foreachContext)_localctx).os = expr();

						if( ((Stm_foreachContext)_localctx).os.beingID )
						{
							SymbolTable.top.setIsArrayID();
							((ProgramContext)getInvokingContext(0)).foreachArray.push( ((Stm_foreachContext)_localctx).os.varname );
						}
					
			setState(214);
			match(NL);
			setState(215);
			statements();
			setState(216);
			match(T__3);
			 
							endScopeWithSameBase( Register.SP , offset );
							((ProgramContext)getInvokingContext(0)).foreachCursor.pop();
							if( SymbolTable.top.getIsArrayID() )
								((ProgramContext)getInvokingContext(0)).foreachArray.pop();
						
			setState(218);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(AtalkParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(AtalkParser.NL, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << NL) | (1L << ID))) != 0)) {
				{
				setState(222);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case T__8:
				case T__11:
				case T__12:
				case T__13:
				case T__16:
				case T__19:
				case T__20:
				case T__22:
				case T__23:
				case T__24:
				case T__30:
				case T__33:
				case T__34:
				case T__36:
				case CONST_NUM:
				case CONST_CHAR:
				case CONST_STR:
				case ID:
					{
					setState(220);
					statement();
					}
					break;
				case NL:
					{
					setState(221);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Stm_vardefContext stm_vardef() {
			return getRuleContext(Stm_vardefContext.class,0);
		}
		public Stm_assignmentContext stm_assignment() {
			return getRuleContext(Stm_assignmentContext.class,0);
		}
		public Stm_foreachContext stm_foreach() {
			return getRuleContext(Stm_foreachContext.class,0);
		}
		public Stm_if_elseif_elseContext stm_if_elseif_else() {
			return getRuleContext(Stm_if_elseif_elseContext.class,0);
		}
		public Stm_quitContext stm_quit() {
			return getRuleContext(Stm_quitContext.class,0);
		}
		public Stm_breakContext stm_break() {
			return getRuleContext(Stm_breakContext.class,0);
		}
		public Stm_tellContext stm_tell() {
			return getRuleContext(Stm_tellContext.class,0);
		}
		public Stm_writeContext stm_write() {
			return getRuleContext(Stm_writeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				stm_vardef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				stm_assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				stm_foreach();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				stm_if_elseif_else();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				stm_quit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				stm_break();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(233);
				stm_tell();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(234);
				stm_write();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(235);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_vardefContext extends ParserRuleContext {
		public TypeContext op;
		public Token os;
		public Token ot;
		public TerminalNode NL() { return getToken(AtalkParser.NL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AtalkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Stm_vardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterStm_vardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitStm_vardef(this);
		}
	}

	public final Stm_vardefContext stm_vardef() throws RecognitionException {
		Stm_vardefContext _localctx = new Stm_vardefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stm_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			((Stm_vardefContext)_localctx).op = type();
			setState(239);
			((Stm_vardefContext)_localctx).os = match(ID);

						String name=(((Stm_vardefContext)_localctx).os!=null?((Stm_vardefContext)_localctx).os.getText():null);
						try
						{
							if( name.equals( ((ProgramContext)getInvokingContext(0)).foreachCursor.topOfStack() ) && SymbolTable.top.isFirstForeach() )
								throw new ItemAlreadyExistsException();
							else if( SymbolTable.top.getIsArrayID() && ((ProgramContext)getInvokingContext(0)).foreachArray.topOfStack() != null && name.equals( ((ProgramContext)getInvokingContext(0)).foreachArray.topOfStack() ) && SymbolTable.top.isFirstForeach() )
								throw new ItemAlreadyExistsException();
							SymbolTable.top.put(new SymbolTableLocalVariableItem(new Variable(name,((Stm_vardefContext)_localctx).op.vartype),SymbolTable.top.getOffset(Register.SP)));
						}
						catch(ItemAlreadyExistsException e)
						{
							Atalk.pass1Passed = false;
							print("line "+(((Stm_vardefContext)_localctx).os!=null?((Stm_vardefContext)_localctx).os.getLine():0) + "; " + "redefinition of an existing variable : " + name );
							try
							{
								SymbolTable.top.put(new SymbolTableLocalVariableItem(new Variable((((Stm_vardefContext)_localctx).os!=null?((Stm_vardefContext)_localctx).os.getText():null)+"_"+((ProgramContext)getInvokingContext(0)).lastRepeatedVarNum,((Stm_vardefContext)_localctx).op.vartype),SymbolTable.top.getOffset(Register.SP)));
								name=(((Stm_vardefContext)_localctx).os!=null?((Stm_vardefContext)_localctx).os.getText():null)+"_"+((ProgramContext)getInvokingContext(0)).lastRepeatedVarNum;
								((ProgramContext)getInvokingContext(0)).lastRepeatedVarNum++;
							}
							catch(ItemAlreadyExistsException ee){} 
						}
						print( "variable <"+name+"> offset: "+((SymbolTableLocalVariableItem)SymbolTable.top.getInCurrentScope(name)).getOffset()+
						" type:"+((Stm_vardefContext)_localctx).op.vartype.toString()+" width: "+((Stm_vardefContext)_localctx).op.vartype.size() + " with base " 
						+ ((SymbolTableLocalVariableItem)SymbolTable.top.getInCurrentScope(name)).getBaseRegister() );
					
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(241);
				match(T__18);
				setState(242);
				expr();
				}
			}

			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(245);
				match(T__6);
				setState(246);
				((Stm_vardefContext)_localctx).ot = match(ID);

							String name2=(((Stm_vardefContext)_localctx).ot!=null?((Stm_vardefContext)_localctx).ot.getText():null); 
							try
							{
								SymbolTable.top.put(new SymbolTableLocalVariableItem(new Variable((((Stm_vardefContext)_localctx).ot!=null?((Stm_vardefContext)_localctx).ot.getText():null),((Stm_vardefContext)_localctx).op.vartype),SymbolTable.top.getOffset(Register.SP)));
							}
							catch(ItemAlreadyExistsException e)
							{
								Atalk.pass1Passed = false;
								print("line "+(((Stm_vardefContext)_localctx).ot!=null?((Stm_vardefContext)_localctx).ot.getLine():0) + ";" + "redefinition of an existing variable : " + name2 );
								try
								{
									SymbolTable.top.put(new SymbolTableLocalVariableItem(new Variable((((Stm_vardefContext)_localctx).ot!=null?((Stm_vardefContext)_localctx).ot.getText():null)+"_"+((ProgramContext)getInvokingContext(0)).lastRepeatedVarNum,((Stm_vardefContext)_localctx).op.vartype),SymbolTable.top.getOffset(Register.SP)));
									name2=(((Stm_vardefContext)_localctx).ot!=null?((Stm_vardefContext)_localctx).ot.getText():null)+"_"+((ProgramContext)getInvokingContext(0)).lastRepeatedVarNum;
									((ProgramContext)getInvokingContext(0)).lastRepeatedVarNum++;
								}
								catch(ItemAlreadyExistsException ee){} 
							}
							print( "variable <"+name2+"> offset: "+((SymbolTableLocalVariableItem)SymbolTable.top.getInCurrentScope(name2)).getOffset()+
							" type: "+((Stm_vardefContext)_localctx).op.vartype.toString()+" width: "+((Stm_vardefContext)_localctx).op.vartype.size() + " with base " 
							+ ((SymbolTableLocalVariableItem)SymbolTable.top.getInCurrentScope(name)).getBaseRegister());
						
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(248);
					match(T__18);
					setState(249);
					expr();
					}
				}

				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_tellContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AtalkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AtalkParser.ID, i);
		}
		public TerminalNode NL() { return getToken(AtalkParser.NL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Stm_tellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_tell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterStm_tell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitStm_tell(this);
		}
	}

	public final Stm_tellContext stm_tell() throws RecognitionException {
		Stm_tellContext _localctx = new Stm_tellContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stm_tell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(260);
			match(T__21);
			setState(261);
			match(ID);
			setState(262);
			match(T__5);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				setState(263);
				expr();
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(264);
					match(T__6);
					setState(265);
					expr();
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(273);
			match(T__7);
			setState(274);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_writeContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(AtalkParser.NL, 0); }
		public Stm_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterStm_write(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitStm_write(this);
		}
	}

	public final Stm_writeContext stm_write() throws RecognitionException {
		Stm_writeContext _localctx = new Stm_writeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stm_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__22);
			setState(277);
			match(T__5);
			setState(278);
			expr();
			setState(279);
			match(T__7);
			setState(280);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_quitContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(AtalkParser.NL, 0); }
		public Stm_quitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_quit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterStm_quit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitStm_quit(this);
		}
	}

	public final Stm_quitContext stm_quit() throws RecognitionException {
		Stm_quitContext _localctx = new Stm_quitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stm_quit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__23);
			setState(283);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_breakContext extends ParserRuleContext {
		public Token op;
		public TerminalNode NL() { return getToken(AtalkParser.NL, 0); }
		public Stm_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterStm_break(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitStm_break(this);
		}
	}

	public final Stm_breakContext stm_break() throws RecognitionException {
		Stm_breakContext _localctx = new Stm_breakContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stm_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			((Stm_breakContext)_localctx).op = match(T__24);

						if(!SymbolTable.top.getInForeachST())
						{
							Atalk.pass1Passed = false; 
							print("invalid use of break in line "+(((Stm_breakContext)_localctx).op!=null?((Stm_breakContext)_localctx).op.getLine():0));
						}
					
			setState(287);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stm_assignmentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(AtalkParser.NL, 0); }
		public Stm_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterStm_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitStm_assignment(this);
		}
	}

	public final Stm_assignmentContext stm_assignment() throws RecognitionException {
		Stm_assignmentContext _localctx = new Stm_assignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stm_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			expr();
			setState(290);
			match(NL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public boolean beingID;
		public String varname;
		public boolean isID;
		public String name;
		public Expr_assignContext expr_assign() {
			return getRuleContext(Expr_assignContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			expr_assign();

						((ExprContext)_localctx).beingID =  _localctx.isID;
						((ExprContext)_localctx).varname =  _localctx.name;
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_assignContext extends ParserRuleContext {
		public Expr_orContext expr_or() {
			return getRuleContext(Expr_orContext.class,0);
		}
		public Expr_assignContext expr_assign() {
			return getRuleContext(Expr_assignContext.class,0);
		}
		public Expr_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterExpr_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitExpr_assign(this);
		}
	}

	public final Expr_assignContext expr_assign() throws RecognitionException {
		Expr_assignContext _localctx = new Expr_assignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_assign);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				expr_or();
				setState(296);
				match(T__18);

							((ExprContext)getInvokingContext(16)).isID =  false;
						
				setState(298);
				expr_assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				expr_or();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_orContext extends ParserRuleContext {
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_or_tmpContext expr_or_tmp() {
			return getRuleContext(Expr_or_tmpContext.class,0);
		}
		public Expr_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterExpr_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitExpr_or(this);
		}
	}

	public final Expr_orContext expr_or() throws RecognitionException {
		Expr_orContext _localctx = new Expr_orContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			expr_and();
			setState(304);
			expr_or_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_or_tmpContext extends ParserRuleContext {
		public Expr_andContext expr_and() {
			return getRuleContext(Expr_andContext.class,0);
		}
		public Expr_or_tmpContext expr_or_tmp() {
			return getRuleContext(Expr_or_tmpContext.class,0);
		}
		public Expr_or_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterExpr_or_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitExpr_or_tmp(this);
		}
	}

	public final Expr_or_tmpContext expr_or_tmp() throws RecognitionException {
		Expr_or_tmpContext _localctx = new Expr_or_tmpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_or_tmp);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(T__25);
				setState(307);
				expr_and();
				setState(308);
				expr_or_tmp();

							((ExprContext)getInvokingContext(16)).isID =  false;
						
				}
				break;
			case T__6:
			case T__7:
			case T__10:
			case T__18:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_andContext extends ParserRuleContext {
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_and_tmpContext expr_and_tmp() {
			return getRuleContext(Expr_and_tmpContext.class,0);
		}
		public Expr_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterExpr_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitExpr_and(this);
		}
	}

	public final Expr_andContext expr_and() throws RecognitionException {
		Expr_andContext _localctx = new Expr_andContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			expr_eq();
			setState(315);
			expr_and_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_and_tmpContext extends ParserRuleContext {
		public Expr_eqContext expr_eq() {
			return getRuleContext(Expr_eqContext.class,0);
		}
		public Expr_and_tmpContext expr_and_tmp() {
			return getRuleContext(Expr_and_tmpContext.class,0);
		}
		public Expr_and_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_and_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterExpr_and_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitExpr_and_tmp(this);
		}
	}

	public final Expr_and_tmpContext expr_and_tmp() throws RecognitionException {
		Expr_and_tmpContext _localctx = new Expr_and_tmpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr_and_tmp);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(T__26);
				setState(318);
				expr_eq();
				setState(319);
				expr_and_tmp();

							((ExprContext)getInvokingContext(16)).isID =  false;
						
				}
				break;
			case T__6:
			case T__7:
			case T__10:
			case T__18:
			case T__25:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_eqContext extends ParserRuleContext {
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Expr_eq_tmpContext expr_eq_tmp() {
			return getRuleContext(Expr_eq_tmpContext.class,0);
		}
		public Expr_eqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterExpr_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitExpr_eq(this);
		}
	}

	public final Expr_eqContext expr_eq() throws RecognitionException {
		Expr_eqContext _localctx = new Expr_eqContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			expr_cmp();
			setState(326);
			expr_eq_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_eq_tmpContext extends ParserRuleContext {
		public Expr_cmpContext expr_cmp() {
			return getRuleContext(Expr_cmpContext.class,0);
		}
		public Expr_eq_tmpContext expr_eq_tmp() {
			return getRuleContext(Expr_eq_tmpContext.class,0);
		}
		public Expr_eq_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_eq_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterExpr_eq_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitExpr_eq_tmp(this);
		}
	}

	public final Expr_eq_tmpContext expr_eq_tmp() throws RecognitionException {
		Expr_eq_tmpContext _localctx = new Expr_eq_tmpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr_eq_tmp);
		int _la;
		try {
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(329);
				expr_cmp();
				setState(330);
				expr_eq_tmp();

							((ExprContext)getInvokingContext(16)).isID =  false;
						
				}
				break;
			case T__6:
			case T__7:
			case T__10:
			case T__18:
			case T__25:
			case T__26:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_cmpContext extends ParserRuleContext {
		public Expr_addContext expr_add() {
			return getRuleContext(Expr_addContext.class,0);
		}
		public Expr_cmp_tmpContext expr_cmp_tmp() {
			return getRuleContext(Expr_cmp_tmpContext.class,0);
		}
		public Expr_cmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterExpr_cmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitExpr_cmp(this);
		}
	}

	public final Expr_cmpContext expr_cmp() throws RecognitionException {
		Expr_cmpContext _localctx = new Expr_cmpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr_cmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			expr_add();
			setState(337);
			expr_cmp_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_cmp_tmpContext extends ParserRuleContext {
		public Expr_addContext expr_add() {
			return getRuleContext(Expr_addContext.class,0);
		}
		public Expr_cmp_tmpContext expr_cmp_tmp() {
			return getRuleContext(Expr_cmp_tmpContext.class,0);
		}
		public Expr_cmp_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cmp_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterExpr_cmp_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitExpr_cmp_tmp(this);
		}
	}

	public final Expr_cmp_tmpContext expr_cmp_tmp() throws RecognitionException {
		Expr_cmp_tmpContext _localctx = new Expr_cmp_tmpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr_cmp_tmp);
		int _la;
		try {
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(340);
				expr_add();
				setState(341);
				expr_cmp_tmp();

							((ExprContext)getInvokingContext(16)).isID =  false;
						
				}
				break;
			case T__6:
			case T__7:
			case T__10:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_addContext extends ParserRuleContext {
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public Expr_add_tmpContext expr_add_tmp() {
			return getRuleContext(Expr_add_tmpContext.class,0);
		}
		public Expr_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterExpr_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitExpr_add(this);
		}
	}

	public final Expr_addContext expr_add() throws RecognitionException {
		Expr_addContext _localctx = new Expr_addContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			expr_mult();
			setState(348);
			expr_add_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_add_tmpContext extends ParserRuleContext {
		public Expr_multContext expr_mult() {
			return getRuleContext(Expr_multContext.class,0);
		}
		public Expr_add_tmpContext expr_add_tmp() {
			return getRuleContext(Expr_add_tmpContext.class,0);
		}
		public Expr_add_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_add_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterExpr_add_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitExpr_add_tmp(this);
		}
	}

	public final Expr_add_tmpContext expr_add_tmp() throws RecognitionException {
		Expr_add_tmpContext _localctx = new Expr_add_tmpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr_add_tmp);
		int _la;
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(351);
				expr_mult();
				setState(352);
				expr_add_tmp();

							((ExprContext)getInvokingContext(16)).isID =  false;
						
				}
				break;
			case T__1:
			case T__2:
			case T__6:
			case T__7:
			case T__10:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_multContext extends ParserRuleContext {
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_mult_tmpContext expr_mult_tmp() {
			return getRuleContext(Expr_mult_tmpContext.class,0);
		}
		public Expr_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterExpr_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitExpr_mult(this);
		}
	}

	public final Expr_multContext expr_mult() throws RecognitionException {
		Expr_multContext _localctx = new Expr_multContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			expr_un();
			setState(359);
			expr_mult_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_mult_tmpContext extends ParserRuleContext {
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_mult_tmpContext expr_mult_tmp() {
			return getRuleContext(Expr_mult_tmpContext.class,0);
		}
		public Expr_mult_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mult_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterExpr_mult_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitExpr_mult_tmp(this);
		}
	}

	public final Expr_mult_tmpContext expr_mult_tmp() throws RecognitionException {
		Expr_mult_tmpContext _localctx = new Expr_mult_tmpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expr_mult_tmp);
		int _la;
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(362);
				expr_un();
				setState(363);
				expr_mult_tmp();

							((ExprContext)getInvokingContext(16)).isID =  false;
						
				}
				break;
			case T__1:
			case T__2:
			case T__6:
			case T__7:
			case T__10:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_unContext extends ParserRuleContext {
		public Expr_unContext expr_un() {
			return getRuleContext(Expr_unContext.class,0);
		}
		public Expr_memContext expr_mem() {
			return getRuleContext(Expr_memContext.class,0);
		}
		public Expr_unContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_un; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterExpr_un(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitExpr_un(this);
		}
	}

	public final Expr_unContext expr_un() throws RecognitionException {
		Expr_unContext _localctx = new Expr_unContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expr_un);
		int _la;
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__33) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(370);
				expr_un();

							((ExprContext)getInvokingContext(16)).isID =  false;
						
				}
				break;
			case T__5:
			case T__34:
			case T__36:
			case CONST_NUM:
			case CONST_CHAR:
			case CONST_STR:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				expr_mem();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_memContext extends ParserRuleContext {
		public Expr_otherContext expr_other() {
			return getRuleContext(Expr_otherContext.class,0);
		}
		public Expr_mem_tmpContext expr_mem_tmp() {
			return getRuleContext(Expr_mem_tmpContext.class,0);
		}
		public Expr_memContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterExpr_mem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitExpr_mem(this);
		}
	}

	public final Expr_memContext expr_mem() throws RecognitionException {
		Expr_memContext _localctx = new Expr_memContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr_mem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			expr_other();
			setState(377);
			expr_mem_tmp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_mem_tmpContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_mem_tmpContext expr_mem_tmp() {
			return getRuleContext(Expr_mem_tmpContext.class,0);
		}
		public Expr_mem_tmpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_mem_tmp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterExpr_mem_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitExpr_mem_tmp(this);
		}
	}

	public final Expr_mem_tmpContext expr_mem_tmp() throws RecognitionException {
		Expr_mem_tmpContext _localctx = new Expr_mem_tmpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr_mem_tmp);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(T__9);
				setState(380);
				expr();
				setState(381);
				match(T__10);
				setState(382);
				expr_mem_tmp();

							((ExprContext)getInvokingContext(16)).isID =  false;
						
				}
				break;
			case T__1:
			case T__2:
			case T__6:
			case T__7:
			case T__10:
			case T__18:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__35:
			case NL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_otherContext extends ParserRuleContext {
		public Token op;
		public TerminalNode CONST_NUM() { return getToken(AtalkParser.CONST_NUM, 0); }
		public TerminalNode CONST_CHAR() { return getToken(AtalkParser.CONST_CHAR, 0); }
		public TerminalNode CONST_STR() { return getToken(AtalkParser.CONST_STR, 0); }
		public TerminalNode ID() { return getToken(AtalkParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_otherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).enterExpr_other(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AtalkListener ) ((AtalkListener)listener).exitExpr_other(this);
		}
	}

	public final Expr_otherContext expr_other() throws RecognitionException {
		Expr_otherContext _localctx = new Expr_otherContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expr_other);
		int _la;
		try {
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(CONST_NUM);
				}
				break;
			case CONST_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(CONST_CHAR);
				}
				break;
			case CONST_STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				match(CONST_STR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				((Expr_otherContext)_localctx).op = match(ID);

						((ExprContext)getInvokingContext(16)).name =  (((Expr_otherContext)_localctx).op!=null?((Expr_otherContext)_localctx).op.getText():null);
						((ExprContext)getInvokingContext(16)).isID =  true;
					
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(393);
				match(T__34);
				setState(394);
				expr();
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(395);
					match(T__6);
					setState(396);
					expr();
					}
					}
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(402);
				match(T__35);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 6);
				{
				setState(404);
				match(T__36);
				setState(405);
				match(T__5);
				setState(406);
				match(CONST_NUM);
				setState(407);
				match(T__7);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 7);
				{
				setState(408);
				match(T__5);
				setState(409);
				expr();
				setState(410);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u01a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3a\n\3\f\3"+
		"\16\3d\13\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4x\n\4\f\4\16\4{\13\4\5\4}\n\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u008c\n\5\f\5\16\5\u008f\13\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0099\n\6\f\6\16\6\u009c\13\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6\u00a5\n\6\f\6\16\6\u00a8\13\6\3\6\5\6\u00ab\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\b\u00c2\n\b\f\b\16\b\u00c5\13\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u00cd\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\7\n\u00e1\n\n\f\n\16\n\u00e4\13\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ef\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00f6"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00fd\n\f\7\f\u00ff\n\f\f\f\16\f\u0102\13"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u010d\n\r\f\r\16\r\u0110\13"+
		"\r\5\r\u0112\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u0130\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u013b\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0146\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0151\n"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u015c\n\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0167\n\35\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0172\n\37\3 \3 \3 \3 \3 \5 \u0179"+
		"\n \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0185\n\"\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\7#\u0190\n#\f#\16#\u0193\13#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\5#\u019f\n#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BD\2\t\3\3++\4\2\26\27,,\3\2\36\37\3\2\4\5\3\2 !\3\2"+
		"\"#\4\2!!$$\2\u01aa\2F\3\2\2\2\4R\3\2\2\2\6i\3\2\2\2\b\u0085\3\2\2\2\n"+
		"\u00aa\3\2\2\2\f\u00ac\3\2\2\2\16\u00b4\3\2\2\2\20\u00d1\3\2\2\2\22\u00e2"+
		"\3\2\2\2\24\u00ee\3\2\2\2\26\u00f0\3\2\2\2\30\u0105\3\2\2\2\32\u0116\3"+
		"\2\2\2\34\u011c\3\2\2\2\36\u011f\3\2\2\2 \u0123\3\2\2\2\"\u0126\3\2\2"+
		"\2$\u012f\3\2\2\2&\u0131\3\2\2\2(\u013a\3\2\2\2*\u013c\3\2\2\2,\u0145"+
		"\3\2\2\2.\u0147\3\2\2\2\60\u0150\3\2\2\2\62\u0152\3\2\2\2\64\u015b\3\2"+
		"\2\2\66\u015d\3\2\2\28\u0166\3\2\2\2:\u0168\3\2\2\2<\u0171\3\2\2\2>\u0178"+
		"\3\2\2\2@\u017a\3\2\2\2B\u0184\3\2\2\2D\u019e\3\2\2\2FM\b\2\1\2GH\5\4"+
		"\3\2HI\b\2\1\2IL\3\2\2\2JL\7+\2\2KG\3\2\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2"+
		"\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\b\2\1\2Q\3\3\2\2\2RS\7\3\2\2ST\7"+
		",\2\2TU\b\3\1\2UV\b\3\1\2VW\7\4\2\2WX\7(\2\2XY\b\3\1\2YZ\7\5\2\2Zb\7+"+
		"\2\2[a\5\b\5\2\\]\5\6\4\2]^\b\3\1\2^a\3\2\2\2_a\7+\2\2`[\3\2\2\2`\\\3"+
		"\2\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7"+
		"\6\2\2fg\t\2\2\2gh\b\3\1\2h\5\3\2\2\2ij\b\4\1\2jk\7\7\2\2kl\7,\2\2lm\b"+
		"\4\1\2mn\b\4\1\2n|\7\b\2\2op\5\n\6\2pq\7,\2\2qy\b\4\1\2rs\7\t\2\2st\5"+
		"\n\6\2tu\7,\2\2uv\b\4\1\2vx\3\2\2\2wr\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3"+
		"\2\2\2z}\3\2\2\2{y\3\2\2\2|o\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\n\2\2"+
		"\177\u0080\7+\2\2\u0080\u0081\5\22\n\2\u0081\u0082\7\6\2\2\u0082\u0083"+
		"\7+\2\2\u0083\u0084\b\4\1\2\u0084\7\3\2\2\2\u0085\u0086\5\n\6\2\u0086"+
		"\u0087\7,\2\2\u0087\u008d\b\5\1\2\u0088\u0089\7\t\2\2\u0089\u008a\7,\2"+
		"\2\u008a\u008c\b\5\1\2\u008b\u0088\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7+\2\2\u0091\t\3\2\2\2\u0092\u0093\7\13\2\2\u0093\u009a\b\6\1\2"+
		"\u0094\u0095\7\f\2\2\u0095\u0096\7(\2\2\u0096\u0097\7\r\2\2\u0097\u0099"+
		"\b\6\1\2\u0098\u0094\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00ab\b\6"+
		"\1\2\u009e\u009f\7\16\2\2\u009f\u00a6\b\6\1\2\u00a0\u00a1\7\f\2\2\u00a1"+
		"\u00a2\7(\2\2\u00a2\u00a3\7\r\2\2\u00a3\u00a5\b\6\1\2\u00a4\u00a0\3\2"+
		"\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\b\6\1\2\u00aa\u0092\3\2"+
		"\2\2\u00aa\u009e\3\2\2\2\u00ab\13\3\2\2\2\u00ac\u00ad\b\7\1\2\u00ad\u00ae"+
		"\7\17\2\2\u00ae\u00af\7+\2\2\u00af\u00b0\5\22\n\2\u00b0\u00b1\7\6\2\2"+
		"\u00b1\u00b2\7+\2\2\u00b2\u00b3\b\7\1\2\u00b3\r\3\2\2\2\u00b4\u00b5\7"+
		"\20\2\2\u00b5\u00b6\5\"\22\2\u00b6\u00b7\b\b\1\2\u00b7\u00b8\7+\2\2\u00b8"+
		"\u00b9\5\22\n\2\u00b9\u00c3\b\b\1\2\u00ba\u00bb\7\21\2\2\u00bb\u00bc\5"+
		"\"\22\2\u00bc\u00bd\b\b\1\2\u00bd\u00be\7+\2\2\u00be\u00bf\5\22\n\2\u00bf"+
		"\u00c0\b\b\1\2\u00c0\u00c2\3\2\2\2\u00c1\u00ba\3\2\2\2\u00c2\u00c5\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00cc\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c6\u00c7\7\22\2\2\u00c7\u00c8\7+\2\2\u00c8\u00c9\b\b"+
		"\1\2\u00c9\u00ca\5\22\n\2\u00ca\u00cb\b\b\1\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00c6\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\6"+
		"\2\2\u00cf\u00d0\7+\2\2\u00d0\17\3\2\2\2\u00d1\u00d2\7\23\2\2\u00d2\u00d3"+
		"\b\t\1\2\u00d3\u00d4\7,\2\2\u00d4\u00d5\b\t\1\2\u00d5\u00d6\7\24\2\2\u00d6"+
		"\u00d7\5\"\22\2\u00d7\u00d8\b\t\1\2\u00d8\u00d9\7+\2\2\u00d9\u00da\5\22"+
		"\n\2\u00da\u00db\7\6\2\2\u00db\u00dc\b\t\1\2\u00dc\u00dd\7+\2\2\u00dd"+
		"\21\3\2\2\2\u00de\u00e1\5\24\13\2\u00df\u00e1\7+\2\2\u00e0\u00de\3\2\2"+
		"\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\23\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00ef\5\26\f\2\u00e6"+
		"\u00ef\5 \21\2\u00e7\u00ef\5\20\t\2\u00e8\u00ef\5\16\b\2\u00e9\u00ef\5"+
		"\34\17\2\u00ea\u00ef\5\36\20\2\u00eb\u00ef\5\30\r\2\u00ec\u00ef\5\32\16"+
		"\2\u00ed\u00ef\5\f\7\2\u00ee\u00e5\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00e7"+
		"\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ee"+
		"\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\25\3\2\2"+
		"\2\u00f0\u00f1\5\n\6\2\u00f1\u00f2\7,\2\2\u00f2\u00f5\b\f\1\2\u00f3\u00f4"+
		"\7\25\2\2\u00f4\u00f6\5\"\22\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2"+
		"\u00f6\u0100\3\2\2\2\u00f7\u00f8\7\t\2\2\u00f8\u00f9\7,\2\2\u00f9\u00fc"+
		"\b\f\1\2\u00fa\u00fb\7\25\2\2\u00fb\u00fd\5\"\22\2\u00fc\u00fa\3\2\2\2"+
		"\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f7\3\2\2\2\u00ff\u0102"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0104\7+\2\2\u0104\27\3\2\2\2\u0105\u0106\t\3\2\2"+
		"\u0106\u0107\7\30\2\2\u0107\u0108\7,\2\2\u0108\u0111\7\b\2\2\u0109\u010e"+
		"\5\"\22\2\u010a\u010b\7\t\2\2\u010b\u010d\5\"\22\2\u010c\u010a\3\2\2\2"+
		"\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0112"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0109\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\7\n\2\2\u0114\u0115\7+\2\2\u0115\31\3\2\2\2"+
		"\u0116\u0117\7\31\2\2\u0117\u0118\7\b\2\2\u0118\u0119\5\"\22\2\u0119\u011a"+
		"\7\n\2\2\u011a\u011b\7+\2\2\u011b\33\3\2\2\2\u011c\u011d\7\32\2\2\u011d"+
		"\u011e\7+\2\2\u011e\35\3\2\2\2\u011f\u0120\7\33\2\2\u0120\u0121\b\20\1"+
		"\2\u0121\u0122\7+\2\2\u0122\37\3\2\2\2\u0123\u0124\5\"\22\2\u0124\u0125"+
		"\7+\2\2\u0125!\3\2\2\2\u0126\u0127\5$\23\2\u0127\u0128\b\22\1\2\u0128"+
		"#\3\2\2\2\u0129\u012a\5&\24\2\u012a\u012b\7\25\2\2\u012b\u012c\b\23\1"+
		"\2\u012c\u012d\5$\23\2\u012d\u0130\3\2\2\2\u012e\u0130\5&\24\2\u012f\u0129"+
		"\3\2\2\2\u012f\u012e\3\2\2\2\u0130%\3\2\2\2\u0131\u0132\5*\26\2\u0132"+
		"\u0133\5(\25\2\u0133\'\3\2\2\2\u0134\u0135\7\34\2\2\u0135\u0136\5*\26"+
		"\2\u0136\u0137\5(\25\2\u0137\u0138\b\25\1\2\u0138\u013b\3\2\2\2\u0139"+
		"\u013b\3\2\2\2\u013a\u0134\3\2\2\2\u013a\u0139\3\2\2\2\u013b)\3\2\2\2"+
		"\u013c\u013d\5.\30\2\u013d\u013e\5,\27\2\u013e+\3\2\2\2\u013f\u0140\7"+
		"\35\2\2\u0140\u0141\5.\30\2\u0141\u0142\5,\27\2\u0142\u0143\b\27\1\2\u0143"+
		"\u0146\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u013f\3\2\2\2\u0145\u0144\3\2"+
		"\2\2\u0146-\3\2\2\2\u0147\u0148\5\62\32\2\u0148\u0149\5\60\31\2\u0149"+
		"/\3\2\2\2\u014a\u014b\t\4\2\2\u014b\u014c\5\62\32\2\u014c\u014d\5\60\31"+
		"\2\u014d\u014e\b\31\1\2\u014e\u0151\3\2\2\2\u014f\u0151\3\2\2\2\u0150"+
		"\u014a\3\2\2\2\u0150\u014f\3\2\2\2\u0151\61\3\2\2\2\u0152\u0153\5\66\34"+
		"\2\u0153\u0154\5\64\33\2\u0154\63\3\2\2\2\u0155\u0156\t\5\2\2\u0156\u0157"+
		"\5\66\34\2\u0157\u0158\5\64\33\2\u0158\u0159\b\33\1\2\u0159\u015c\3\2"+
		"\2\2\u015a\u015c\3\2\2\2\u015b\u0155\3\2\2\2\u015b\u015a\3\2\2\2\u015c"+
		"\65\3\2\2\2\u015d\u015e\5:\36\2\u015e\u015f\58\35\2\u015f\67\3\2\2\2\u0160"+
		"\u0161\t\6\2\2\u0161\u0162\5:\36\2\u0162\u0163\58\35\2\u0163\u0164\b\35"+
		"\1\2\u0164\u0167\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0160\3\2\2\2\u0166"+
		"\u0165\3\2\2\2\u01679\3\2\2\2\u0168\u0169\5> \2\u0169\u016a\5<\37\2\u016a"+
		";\3\2\2\2\u016b\u016c\t\7\2\2\u016c\u016d\5> \2\u016d\u016e\5<\37\2\u016e"+
		"\u016f\b\37\1\2\u016f\u0172\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016b\3"+
		"\2\2\2\u0171\u0170\3\2\2\2\u0172=\3\2\2\2\u0173\u0174\t\b\2\2\u0174\u0175"+
		"\5> \2\u0175\u0176\b \1\2\u0176\u0179\3\2\2\2\u0177\u0179\5@!\2\u0178"+
		"\u0173\3\2\2\2\u0178\u0177\3\2\2\2\u0179?\3\2\2\2\u017a\u017b\5D#\2\u017b"+
		"\u017c\5B\"\2\u017cA\3\2\2\2\u017d\u017e\7\f\2\2\u017e\u017f\5\"\22\2"+
		"\u017f\u0180\7\r\2\2\u0180\u0181\5B\"\2\u0181\u0182\b\"\1\2\u0182\u0185"+
		"\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u017d\3\2\2\2\u0184\u0183\3\2\2\2\u0185"+
		"C\3\2\2\2\u0186\u019f\7(\2\2\u0187\u019f\7)\2\2\u0188\u019f\7*\2\2\u0189"+
		"\u018a\7,\2\2\u018a\u019f\b#\1\2\u018b\u018c\7%\2\2\u018c\u0191\5\"\22"+
		"\2\u018d\u018e\7\t\2\2\u018e\u0190\5\"\22\2\u018f\u018d\3\2\2\2\u0190"+
		"\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2"+
		"\2\2\u0193\u0191\3\2\2\2\u0194\u0195\7&\2\2\u0195\u019f\3\2\2\2\u0196"+
		"\u0197\7\'\2\2\u0197\u0198\7\b\2\2\u0198\u0199\7(\2\2\u0199\u019f\7\n"+
		"\2\2\u019a\u019b\7\b\2\2\u019b\u019c\5\"\22\2\u019c\u019d\7\n\2\2\u019d"+
		"\u019f\3\2\2\2\u019e\u0186\3\2\2\2\u019e\u0187\3\2\2\2\u019e\u0188\3\2"+
		"\2\2\u019e\u0189\3\2\2\2\u019e\u018b\3\2\2\2\u019e\u0196\3\2\2\2\u019e"+
		"\u019a\3\2\2\2\u019fE\3\2\2\2!KM`by|\u008d\u009a\u00a6\u00aa\u00c3\u00cc"+
		"\u00e0\u00e2\u00ee\u00f5\u00fc\u0100\u010e\u0111\u012f\u013a\u0145\u0150"+
		"\u015b\u0166\u0171\u0178\u0184\u0191\u019e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}