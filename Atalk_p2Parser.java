// Generated from Atalk_p2.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Atalk_p2Parser extends Parser {
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
	public String getGrammarFileName() { return "Atalk_p2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public Atalk_p2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ActorContext> actor() {
			return getRuleContexts(ActorContext.class);
		}
		public ActorContext actor(int i) {
			return getRuleContext(ActorContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(Atalk_p2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Atalk_p2Parser.NL, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
					SymbolTable.push();
				
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==NL) {
				{
				setState(71);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(69);
					actor();
					}
					break;
				case NL:
					{
					setState(70);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

					mips.makeOutput();
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
		public Token ID;
		public Token CONST_NUM;
		public TerminalNode ID() { return getToken(Atalk_p2Parser.ID, 0); }
		public TerminalNode CONST_NUM() { return getToken(Atalk_p2Parser.CONST_NUM, 0); }
		public List<TerminalNode> NL() { return getTokens(Atalk_p2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Atalk_p2Parser.NL, i);
		}
		public TerminalNode EOF() { return getToken(Atalk_p2Parser.EOF, 0); }
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterActor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitActor(this);
		}
	}

	public final ActorContext actor() throws RecognitionException {
		ActorContext _localctx = new ActorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_actor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__0);
			setState(79);
			((ActorContext)_localctx).ID = match(ID);

						SymbolTable.push();
					
			setState(81);
			match(T__1);
			setState(82);
			((ActorContext)_localctx).CONST_NUM = match(CONST_NUM);

						//mips.addActor( (((ActorContext)_localctx).ID!=null?((ActorContext)_localctx).ID.getText():null) , (((ActorContext)_localctx).CONST_NUM!=null?Integer.valueOf(((ActorContext)_localctx).CONST_NUM.getText()):0) );
					
			setState(84);
			match(T__2);
			setState(85);
			match(NL);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__8) | (1L << T__11) | (1L << NL))) != 0)) {
				{
				setState(89);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__11:
					{
					setState(86);
					state();
					}
					break;
				case T__4:
					{
					setState(87);
					receiver();
					}
					break;
				case NL:
					{
					setState(88);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(T__3);
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ReceiverContext extends ParserRuleContext {
		public Token op;
		public TypeContext os;
		public Token ot;
		public TypeContext ou;
		public Token ow;
		public List<TerminalNode> NL() { return getTokens(Atalk_p2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Atalk_p2Parser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(Atalk_p2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Atalk_p2Parser.ID, i);
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitReceiver(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_receiver);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

						SymbolTable.push();
					
			setState(99);
			match(T__4);
			setState(100);
			((ReceiverContext)_localctx).op = match(ID);


						//mips.addReceiver( (((ReceiverContext)_localctx).op!=null?((ReceiverContext)_localctx).op.getText():null) );
					
			setState(102);
			match(T__5);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__11) {
				{
				setState(103);
				((ReceiverContext)_localctx).os = type();
				setState(104);
				((ReceiverContext)_localctx).ot = match(ID);
				SymbolTable.define();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(106);
					match(T__6);
					setState(107);
					((ReceiverContext)_localctx).ou = type();
					setState(108);
					((ReceiverContext)_localctx).ow = match(ID);
					SymbolTable.define();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(118);
			match(T__7);
			setState(119);
			match(NL);
			setState(120);
			statements();
			setState(121);
			match(T__3);
			setState(122);
			match(NL);

						//mips.addReceiverSkeleton();
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

	public static class StateContext extends ParserRuleContext {
		public TypeContext op;
		public Token os;
		public Token ot;
		public TerminalNode NL() { return getToken(Atalk_p2Parser.NL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(Atalk_p2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Atalk_p2Parser.ID, i);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((StateContext)_localctx).op = type();
			setState(126);
			((StateContext)_localctx).os = match(ID);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(127);
				match(T__6);
				setState(128);
				((StateContext)_localctx).ot = match(ID);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
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
		public List<TerminalNode> CONST_NUM() { return getTokens(Atalk_p2Parser.CONST_NUM); }
		public TerminalNode CONST_NUM(int i) {
			return getToken(Atalk_p2Parser.CONST_NUM, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(T__8);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(137);
					match(T__9);
					setState(138);
					match(CONST_NUM);
					setState(139);
					match(T__10);
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__11);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(146);
					match(T__9);
					setState(147);
					match(CONST_NUM);
					setState(148);
					match(T__10);
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
		public List<TerminalNode> NL() { return getTokens(Atalk_p2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Atalk_p2Parser.NL, i);
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{

						SymbolTable.push();
					
			setState(157);
			match(T__12);
			setState(158);
			match(NL);
			setState(159);
			statements();
			setState(160);
			match(T__3);
			setState(161);
			match(NL);

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

	public static class Stm_if_elseif_elseContext extends ParserRuleContext {
		public Token op;
		public ExprContext os;
		public Token opp;
		public ExprContext ou;
		public List<TerminalNode> NL() { return getTokens(Atalk_p2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Atalk_p2Parser.NL, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Stm_if_elseif_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_if_elseif_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterStm_if_elseif_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitStm_if_elseif_else(this);
		}
	}

	public final Stm_if_elseif_elseContext stm_if_elseif_else() throws RecognitionException {
		Stm_if_elseif_elseContext _localctx = new Stm_if_elseif_elseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stm_if_elseif_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((Stm_if_elseif_elseContext)_localctx).op = match(T__13);
			setState(165);
			((Stm_if_elseif_elseContext)_localctx).os = expr();

						SymbolTable.push();			
					
			setState(167);
			match(NL);
			setState(168);
			statements();
			 
						SymbolTable.pop();	
						if(!( ((Stm_if_elseif_elseContext)_localctx).os.item.getVariable().getType() instanceof IntType || ((Stm_if_elseif_elseContext)_localctx).os.item.getVariable().getType() instanceof NoType ) )
							print("Error in line "+(((Stm_if_elseif_elseContext)_localctx).op!=null?((Stm_if_elseif_elseContext)_localctx).op.getLine():0)+" if expression must be integer");
					
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(170);
				((Stm_if_elseif_elseContext)_localctx).opp = match(T__14);
				setState(171);
				((Stm_if_elseif_elseContext)_localctx).ou = expr();

								SymbolTable.push();
								if(!( ((Stm_if_elseif_elseContext)_localctx).os.item.getVariable().getType() instanceof IntType || ((Stm_if_elseif_elseContext)_localctx).os.item.getVariable().getType() instanceof NoType ) )
									print("Error in line "+(((Stm_if_elseif_elseContext)_localctx).opp!=null?((Stm_if_elseif_elseContext)_localctx).opp.getLine():0)+" if expression must be integer");
							
				setState(173);
				match(NL);
				setState(174);
				statements();

								SymbolTable.pop();
							
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(182);
				match(T__15);
				setState(183);
				match(NL);

								SymbolTable.push();		
							
				setState(185);
				statements();

								SymbolTable.pop();	
							
				}
			}

			setState(190);
			match(T__3);
			setState(191);
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
		public List<TerminalNode> NL() { return getTokens(Atalk_p2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Atalk_p2Parser.NL, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ID() { return getToken(Atalk_p2Parser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stm_foreachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_foreach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterStm_foreach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitStm_foreach(this);
		}
	}

	public final Stm_foreachContext stm_foreach() throws RecognitionException {
		Stm_foreachContext _localctx = new Stm_foreachContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stm_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__16);

						SymbolTable.push();			
					
			setState(195);
			((Stm_foreachContext)_localctx).op = match(ID);
			setState(196);
			match(T__17);
			setState(197);
			((Stm_foreachContext)_localctx).os = expr();

						SymbolTableCursorItem cursorItem;
						int offset = SymbolTable.top.getOffset( Register.SP );
						if(! ( ((Stm_foreachContext)_localctx).os.item.getVariable().getType() instanceof ArrayType ) )
						{
							cursorItem = new SymbolTableCursorItem( new Variable( (((Stm_foreachContext)_localctx).op!=null?((Stm_foreachContext)_localctx).op.getText():null) , NoType.getInstance() ) , offset );
							if( !( ((Stm_foreachContext)_localctx).os.item.getVariable().getType() instanceof NoType ) )
								print("Error in line "+(((Stm_foreachContext)_localctx).op!=null?((Stm_foreachContext)_localctx).op.getLine():0)+" It must be an array");
						}
						else 
						{
							if( ((ArrayType)((Stm_foreachContext)_localctx).os.item.getVariable().getType()).DimensionsCount()==1){
								if(((Stm_foreachContext)_localctx).os.item.getVariable().getType() instanceof CharArrayType)
									cursorItem=new SymbolTableCursorItem(new Variable((((Stm_foreachContext)_localctx).op!=null?((Stm_foreachContext)_localctx).op.getText():null),CharType.getInstance()), offset );
								else
									cursorItem=new SymbolTableCursorItem(new Variable((((Stm_foreachContext)_localctx).op!=null?((Stm_foreachContext)_localctx).op.getText():null),IntType.getInstance()), offset );
							}
							else{
								if(((Stm_foreachContext)_localctx).os.item.getVariable().getType() instanceof CharArrayType)
									cursorItem=new SymbolTableCursorItem(new Variable((((Stm_foreachContext)_localctx).op!=null?((Stm_foreachContext)_localctx).op.getText():null), CharArrayType.getInstance()), offset );
								else
									cursorItem=new SymbolTableCursorItem(new Variable((((Stm_foreachContext)_localctx).op!=null?((Stm_foreachContext)_localctx).op.getText():null),IntArrayType.getInstance()) , offset );
								((ArrayType)cursorItem.getVariable().getType()).pushNewDimensions(new ArrayList<Integer>(((ArrayType)((Stm_foreachContext)_localctx).os.item.getVariable().getType()).getDimensions()));
								((ArrayType)cursorItem.getVariable().getType()).getDimensions().remove(0);
							}
						}
						try
						{
							SymbolTable.top.put(cursorItem);
						}
						catch( ItemAlreadyExistsException e ) {
							print( "Error in line " + (((Stm_foreachContext)_localctx).op!=null?((Stm_foreachContext)_localctx).op.getLine():0) + " redefinition of variable " + (((Stm_foreachContext)_localctx).op!=null?((Stm_foreachContext)_localctx).op.getText():null) );
							try
							{
								String name = "compiler::cursor";
								SymbolTable.top.put( new SymbolTableCursorItem( new Variable( name , cursorItem.getVariable().getType() ) , 0 ));
							}
							catch( ItemAlreadyExistsException ex ) {}
						}
					
			setState(199);
			match(NL);
			setState(200);
			statements();
			setState(201);
			match(T__3);
			 
						SymbolTable.pop();
					
			setState(203);
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
		public List<TerminalNode> NL() { return getTokens(Atalk_p2Parser.NL); }
		public TerminalNode NL(int i) {
			return getToken(Atalk_p2Parser.NL, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << NL) | (1L << ID))) != 0)) {
				{
				setState(207);
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
					setState(205);
					statement();
					}
					break;
				case NL:
					{
					setState(206);
					match(NL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(211);
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
		public Stm_assignmentContext op;
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				stm_vardef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				((StatementContext)_localctx).op = stm_assignment();

						if( ! ((StatementContext)_localctx).op.isStatement )
							print( "Error in line " + ((StatementContext)_localctx).op.lineNumber + " this line is not a statement" );
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				stm_foreach();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				stm_if_elseif_else();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				stm_quit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(219);
				stm_break();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(220);
				stm_tell();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(221);
				stm_write();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(222);
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
		public Token os;
		public ExprContext om;
		public Token ot;
		public ExprContext on;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NL() { return getToken(Atalk_p2Parser.NL, 0); }
		public List<TerminalNode> ID() { return getTokens(Atalk_p2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Atalk_p2Parser.ID, i);
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterStm_vardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitStm_vardef(this);
		}
	}

	public final Stm_vardefContext stm_vardef() throws RecognitionException {
		Stm_vardefContext _localctx = new Stm_vardefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stm_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			type();
			setState(226);
			((Stm_vardefContext)_localctx).os = match(ID);

						String name;
						SymbolTableLocalVariableItem item;
						name =  (((Stm_vardefContext)_localctx).os!=null?((Stm_vardefContext)_localctx).os.getText():null);
						item = ( SymbolTableLocalVariableItem ) SymbolTable.top.getInCurrentScope( name );
						mips.addCode( "addiu $fp, $sp, " + ( item.getOffset() + item.getVariable().size() ) + " #variable " + name + " declaration"  );
					
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{

							mips.addCode( "addiu $a0, $fp, -4" );
							mips.addCode( "sw $a0, 0($fp)");
							mips.addCode( "addiu $fp, $fp, 4" );
						
				setState(229);
				match(T__18);
				setState(230);
				((Stm_vardefContext)_localctx).om = expr();

							if( !( ((Stm_vardefContext)_localctx).om.item.getVariable().getType().equals( item.getVariable().getType() ) ) && !( ((Stm_vardefContext)_localctx).om.item.getVariable().getType() instanceof NoType ) )
								print("Error in line "+(((Stm_vardefContext)_localctx).os!=null?((Stm_vardefContext)_localctx).os.getLine():0)+" rValue & lValue are not from same types");			
							mips.generateCodeForAssignment( item.getVariable().size() , ((Stm_vardefContext)_localctx).om.item.isLValue );
						
				}
			}

			 SymbolTable.define(); 
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(236);
				match(T__6);
				setState(237);
				((Stm_vardefContext)_localctx).ot = match(ID);

							name = (((Stm_vardefContext)_localctx).ot!=null?((Stm_vardefContext)_localctx).ot.getText():null);
							item = ( SymbolTableLocalVariableItem ) SymbolTable.top.getInCurrentScope( name );
							mips.addCode( "addiu $fp, $sp, " + ( item.getOffset() + item.getVariable().size() ) + " #variable " + name + " declaration"  );
						
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{

									mips.addCode( "addiu $a0, $fp, -4" );
									mips.addCode( "sw $a0, 0($fp)");
									mips.addCode( "addiu $fp, $fp, 4" );
								
					setState(240);
					match(T__18);
					setState(241);
					((Stm_vardefContext)_localctx).on = expr();

								if( !( ((Stm_vardefContext)_localctx).on.item.getVariable().getType().equals( item.getVariable().getType() ) ) && !( ((Stm_vardefContext)_localctx).on.item.getVariable().getType() instanceof NoType ) )
									print("Error in line "+(((Stm_vardefContext)_localctx).os!=null?((Stm_vardefContext)_localctx).os.getLine():0)+" rValue & lValue are not from same types");			
								mips.generateCodeForAssignment( item.getVariable().size() , ((Stm_vardefContext)_localctx).on.item.isLValue );
							
					}
				}

				SymbolTable.define();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
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
		public Token ot;
		public Token op;
		public ExprContext om;
		public ExprContext oj;
		public TerminalNode NL() { return getToken(Atalk_p2Parser.NL, 0); }
		public List<TerminalNode> ID() { return getTokens(Atalk_p2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Atalk_p2Parser.ID, i);
		}
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterStm_tell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitStm_tell(this);
		}
	}

	public final Stm_tellContext stm_tell() throws RecognitionException {
		Stm_tellContext _localctx = new Stm_tellContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stm_tell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			int destination;
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(255);
				((Stm_tellContext)_localctx).ot = match(ID);
				destination=1;
				}
				break;
			case T__19:
				{
				setState(257);
				match(T__19);
				destination=2;
				}
				break;
			case T__20:
				{
				setState(259);
				match(T__20);
				destination=3;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(263);
			match(T__21);
			setState(264);
			((Stm_tellContext)_localctx).op = match(ID);
			setState(265);
			match(T__5);

					ArrayList<SymbolTableTemporaryVariableItem> arguments=new ArrayList<>();	
				
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__30) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << CONST_NUM) | (1L << CONST_CHAR) | (1L << CONST_STR) | (1L << ID))) != 0)) {
				{
				setState(267);
				((Stm_tellContext)_localctx).om = expr();
				arguments.add(((Stm_tellContext)_localctx).om.item);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(269);
					match(T__6);
					setState(270);
					((Stm_tellContext)_localctx).oj = expr();
					arguments.add(((Stm_tellContext)_localctx).oj.item);
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(280);
			match(T__7);

					if(destination==1)
					{
						ActorSymbolTableItem item=(ActorSymbolTableItem)SymbolTable.top.get("actor_"+(((Stm_tellContext)_localctx).ot!=null?((Stm_tellContext)_localctx).ot.getText():null));
						if(item==null)
							print("Error in line "+(((Stm_tellContext)_localctx).op!=null?((Stm_tellContext)_localctx).op.getLine():0)+" actor '"+(((Stm_tellContext)_localctx).ot!=null?((Stm_tellContext)_localctx).ot.getText():null)+"' does'nt exist");
						else{
							String key="receiver_"+(((Stm_tellContext)_localctx).op!=null?((Stm_tellContext)_localctx).op.getText():null)+ "_";
							for(int i=0;i<arguments.size();i++){
								key+=arguments.get(i).getVariable().getType().toString() + " ";
							}
							ReceiverSymbolTableItem recItem=(ReceiverSymbolTableItem)item.getAccordingST().getInCurrentScope(key);
							if(recItem==null)
								print("Error in line "+(((Stm_tellContext)_localctx).op!=null?((Stm_tellContext)_localctx).op.getLine():0)+" there is not such receiver in actor '"+(((Stm_tellContext)_localctx).ot!=null?((Stm_tellContext)_localctx).ot.getText():null)+"'");
						}
					}
					else if(destination==3){
						SymbolTable temp=SymbolTable.top;
						while(temp.pre.pre!=null)
							temp=temp.pre;
						String actorKey=temp.getkeyOfActorAccordingToActorST();
						ActorSymbolTableItem item=(ActorSymbolTableItem)SymbolTable.top.get(actorKey);
						String key="receiver_"+(((Stm_tellContext)_localctx).op!=null?((Stm_tellContext)_localctx).op.getText():null)+ "_";
						for(int i=0;i<arguments.size();i++){
							key+=arguments.get(i).getVariable().getType().toString() + " ";
						}
						//print( key );
						ReceiverSymbolTableItem recItem=(ReceiverSymbolTableItem)temp.getInCurrentScope(key);
						if(recItem==null)
							print("Error in line "+(((Stm_tellContext)_localctx).op!=null?((Stm_tellContext)_localctx).op.getLine():0)+" there is not such receiver in actor '"+item.getName()+"'");
					}
					else if(destination==2){
						if(SymbolTable.top.isInitReceiverScope)
							print("Error in line "+(((Stm_tellContext)_localctx).op!=null?((Stm_tellContext)_localctx).op.getLine():0)+" sender could not be used in init() receiver");
					}
				
			setState(282);
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
		public Token op;
		public ExprContext os;
		public TerminalNode NL() { return getToken(Atalk_p2Parser.NL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stm_writeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterStm_write(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitStm_write(this);
		}
	}

	public final Stm_writeContext stm_write() throws RecognitionException {
		Stm_writeContext _localctx = new Stm_writeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stm_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			((Stm_writeContext)_localctx).op = match(T__22);
			setState(285);
			match(T__5);
			setState(286);
			((Stm_writeContext)_localctx).os = expr();

						if(((Stm_writeContext)_localctx).os.item.getVariable().getType() instanceof ArrayType){
							if(((Stm_writeContext)_localctx).os.item.getVariable().getType() instanceof IntArrayType)
								print("Error in line "+(((Stm_writeContext)_localctx).op!=null?((Stm_writeContext)_localctx).op.getLine():0)+" write argument cannot be int array");
							else if( ((CharArrayType)((Stm_writeContext)_localctx).os.item.getVariable().getType()).DimensionsCount()>1)
								print("Error in line "+(((Stm_writeContext)_localctx).op!=null?((Stm_writeContext)_localctx).op.getLine():0)+" write argument cannot be a multidimensional array");
						}
						mips.generateWrite( ((Stm_writeContext)_localctx).os.item.getVariable().getType() , ((Stm_writeContext)_localctx).os.item.isLValue );
					
			setState(288);
			match(T__7);
			setState(289);
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
		public Token op;
		public TerminalNode NL() { return getToken(Atalk_p2Parser.NL, 0); }
		public Stm_quitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_quit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterStm_quit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitStm_quit(this);
		}
	}

	public final Stm_quitContext stm_quit() throws RecognitionException {
		Stm_quitContext _localctx = new Stm_quitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stm_quit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			((Stm_quitContext)_localctx).op = match(T__23);
			setState(292);
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
		public TerminalNode NL() { return getToken(Atalk_p2Parser.NL, 0); }
		public Stm_breakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterStm_break(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitStm_break(this);
		}
	}

	public final Stm_breakContext stm_break() throws RecognitionException {
		Stm_breakContext _localctx = new Stm_breakContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_stm_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			((Stm_breakContext)_localctx).op = match(T__24);
			setState(295);
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
		public boolean isStatement;
		public int lineNumber;
		public ExprContext op;
		public TerminalNode NL() { return getToken(Atalk_p2Parser.NL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stm_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterStm_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitStm_assignment(this);
		}
	}

	public final Stm_assignmentContext stm_assignment() throws RecognitionException {
		Stm_assignmentContext _localctx = new Stm_assignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stm_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			((Stm_assignmentContext)_localctx).op = expr();
			setState(298);
			match(NL);

						((Stm_assignmentContext)_localctx).isStatement =  ((Stm_assignmentContext)_localctx).op.isStatement;
						((Stm_assignmentContext)_localctx).lineNumber =  ((Stm_assignmentContext)_localctx).op.ln;
					
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
		public SymbolTableTemporaryVariableItem item;
		public int couldBeAssigned;
		public boolean isStatement;
		public int ln;
		public int lineNumber;
		public Expr_assignContext op;
		public Expr_assignContext expr_assign() {
			return getRuleContext(Expr_assignContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			((ExprContext)_localctx).op = expr_assign();

						((ExprContext)_localctx).couldBeAssigned = ((ExprContext)_localctx).op.syn_couldBeAssigned;
						((ExprContext)_localctx).item = ((ExprContext)_localctx).op.item;
						((ExprContext)_localctx).isStatement =  ((ExprContext)_localctx).op.isStatement;
						((ExprContext)_localctx).ln =  _localctx.lineNumber;
					
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
		public int syn_couldBeAssigned;
		public SymbolTableTemporaryVariableItem item;
		public boolean isStatement;
		public int couldBeAssigned;
		public Expr_orContext os;
		public Token op;
		public Expr_assignContext ou;
		public Expr_orContext on;
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterExpr_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitExpr_assign(this);
		}
	}

	public final Expr_assignContext expr_assign() throws RecognitionException {
		Expr_assignContext _localctx = new Expr_assignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expr_assign);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				((Expr_assignContext)_localctx).couldBeAssigned = 1;
				setState(305);
				((Expr_assignContext)_localctx).os = expr_or();
				setState(306);
				((Expr_assignContext)_localctx).op = match(T__18);
				setState(307);
				((Expr_assignContext)_localctx).ou = expr_assign();

							((Expr_assignContext)_localctx).isStatement =  true;
							if(_localctx.couldBeAssigned==0)
							{
								print("Error in line "+(((Expr_assignContext)_localctx).op!=null?((Expr_assignContext)_localctx).op.getLine():0)+" left hand must be Lvalue");
								((Expr_assignContext)_localctx).item =  new SymbolTableTemporaryVariableItem( new Variable( "temp" , NoType.getInstance() ) , 0 );
							}
							else if (!((Expr_assignContext)_localctx).os.item.getVariable().getType().equals(((Expr_assignContext)_localctx).ou.item.getVariable().getType()) && !( ((Expr_assignContext)_localctx).os.item.getVariable().getType() instanceof NoType || ((Expr_assignContext)_localctx).ou.item.getVariable().getType() instanceof NoType ))
							{
								print("Error in line "+(((Expr_assignContext)_localctx).op!=null?((Expr_assignContext)_localctx).op.getLine():0)+" left hand & right hand types must be equal");
								((Expr_assignContext)_localctx).item =  new SymbolTableTemporaryVariableItem( new Variable( "temp" , NoType.getInstance() ) , 0 );
							}
							else if( ( ((Expr_assignContext)_localctx).os.item.getVariable().getType() instanceof NoType || ((Expr_assignContext)_localctx).ou.item.getVariable().getType() instanceof NoType ) )
								((Expr_assignContext)_localctx).item =  new SymbolTableTemporaryVariableItem( new Variable( "temp" , NoType.getInstance() ) , 0 );
							else
								((Expr_assignContext)_localctx).item = ((Expr_assignContext)_localctx).os.item;

							((Expr_assignContext)_localctx).syn_couldBeAssigned = _localctx.couldBeAssigned;
							mips.generateCodeForAssignment( ((Expr_assignContext)_localctx).os.item.getVariable().size() , ((Expr_assignContext)_localctx).ou.item.isLValue );		

						
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Expr_assignContext)_localctx).couldBeAssigned = 1;
				setState(311);
				((Expr_assignContext)_localctx).on = expr_or();

							((Expr_assignContext)_localctx).item = ((Expr_assignContext)_localctx).on.item;
							((Expr_assignContext)_localctx).syn_couldBeAssigned = _localctx.couldBeAssigned;
							((Expr_assignContext)_localctx).isStatement =  false;
						
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
		public SymbolTableTemporaryVariableItem item;
		public Expr_andContext ou;
		public Expr_or_tmpContext os;
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterExpr_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitExpr_or(this);
		}
	}

	public final Expr_orContext expr_or() throws RecognitionException {
		Expr_orContext _localctx = new Expr_orContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			((Expr_orContext)_localctx).ou = expr_and();
			setState(317);
			((Expr_orContext)_localctx).os = expr_or_tmp();

						if(((Expr_orContext)_localctx).os.isThereORoperator==0)
							((Expr_orContext)_localctx).item = ((Expr_orContext)_localctx).ou.item;
						else{
							if( !( ((Expr_orContext)_localctx).ou.item.getVariable().getType() instanceof IntType || ((Expr_orContext)_localctx).ou.item.getVariable().getType() instanceof NoType ) || !( ((Expr_orContext)_localctx).os.item.getVariable().getType() instanceof IntType || ((Expr_orContext)_localctx).os.item.getVariable().getType() instanceof NoType  ) )
							{
								print( "Error in line " + ((Expr_orContext)_localctx).os.orLine + " or is defined on integers" );
								((Expr_orContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
							}
							else if( ((Expr_orContext)_localctx).ou.item.getVariable().getType() instanceof NoType && ((Expr_orContext)_localctx).os.item.getVariable().getType() instanceof NoType )
								((Expr_orContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
							else
								((Expr_orContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
							mips.operationCommand( "or" );
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

	public static class Expr_or_tmpContext extends ParserRuleContext {
		public SymbolTableTemporaryVariableItem item;
		public int isThereORoperator;
		public int orLine;
		public Token op;
		public Expr_andContext ou;
		public Expr_or_tmpContext os;
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterExpr_or_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitExpr_or_tmp(this);
		}
	}

	public final Expr_or_tmpContext expr_or_tmp() throws RecognitionException {
		Expr_or_tmpContext _localctx = new Expr_or_tmpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_or_tmp);
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				((Expr_or_tmpContext)_localctx).op = match(T__25);
				((Expr_or_tmpContext)_localctx).isThereORoperator = 1;((Expr_assignContext)getInvokingContext(17)).couldBeAssigned = 0; ((Expr_or_tmpContext)_localctx).orLine =  (((Expr_or_tmpContext)_localctx).op!=null?((Expr_or_tmpContext)_localctx).op.getLine():0); 
				setState(322);
				((Expr_or_tmpContext)_localctx).ou = expr_and();
				setState(323);
				((Expr_or_tmpContext)_localctx).os = expr_or_tmp();

							if(((Expr_or_tmpContext)_localctx).os.isThereORoperator==0)
								((Expr_or_tmpContext)_localctx).item = ((Expr_or_tmpContext)_localctx).ou.item;
							else {
								if( !( ((Expr_or_tmpContext)_localctx).ou.item.getVariable().getType() instanceof IntType || ((Expr_or_tmpContext)_localctx).ou.item.getVariable().getType() instanceof NoType ) || !( ((Expr_or_tmpContext)_localctx).os.item.getVariable().getType() instanceof IntType || ((Expr_or_tmpContext)_localctx).os.item.getVariable().getType() instanceof NoType  ) )
								{
									print( "Error in line " + (((Expr_or_tmpContext)_localctx).op!=null?((Expr_or_tmpContext)_localctx).op.getLine():0) + " : operands in or must be integers" );
									((Expr_or_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
								}
								else if( ((Expr_or_tmpContext)_localctx).ou.item.getVariable().getType() instanceof NoType || ((Expr_or_tmpContext)_localctx).os.item.getVariable().getType() instanceof NoType )
									((Expr_or_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
								else
									((Expr_or_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
								mips.operationCommand( (((Expr_or_tmpContext)_localctx).op!=null?((Expr_or_tmpContext)_localctx).op.getText():null) );
							}	
						
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
				((Expr_or_tmpContext)_localctx).isThereORoperator = 0;((Expr_or_tmpContext)_localctx).item = null;
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
		public SymbolTableTemporaryVariableItem item;
		public Expr_eqContext ou;
		public Expr_and_tmpContext os;
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterExpr_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitExpr_and(this);
		}
	}

	public final Expr_andContext expr_and() throws RecognitionException {
		Expr_andContext _localctx = new Expr_andContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			((Expr_andContext)_localctx).ou = expr_eq();
			setState(330);
			((Expr_andContext)_localctx).os = expr_and_tmp();

						if(((Expr_andContext)_localctx).os.isThereANDoperator==0)
							((Expr_andContext)_localctx).item = ((Expr_andContext)_localctx).ou.item;
						else{
							if( !( ((Expr_andContext)_localctx).ou.item.getVariable().getType() instanceof IntType || ((Expr_andContext)_localctx).ou.item.getVariable().getType() instanceof NoType ) || !( ((Expr_andContext)_localctx).os.item.getVariable().getType() instanceof IntType || ((Expr_andContext)_localctx).os.item.getVariable().getType() instanceof NoType  ) )
							{
								print( "Error in line " + ((Expr_andContext)_localctx).os.andLine + " : non integer operands" );
								((Expr_andContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
							}
							else if( ((Expr_andContext)_localctx).ou.item.getVariable().getType() instanceof NoType && ((Expr_andContext)_localctx).os.item.getVariable().getType() instanceof NoType )
								((Expr_andContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
							else
								((Expr_andContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
							mips.operationCommand( "and" );
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

	public static class Expr_and_tmpContext extends ParserRuleContext {
		public SymbolTableTemporaryVariableItem item;
		public int isThereANDoperator;
		public int andLine;
		public Token op;
		public Expr_eqContext ou;
		public Expr_and_tmpContext os;
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterExpr_and_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitExpr_and_tmp(this);
		}
	}

	public final Expr_and_tmpContext expr_and_tmp() throws RecognitionException {
		Expr_and_tmpContext _localctx = new Expr_and_tmpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr_and_tmp);
		try {
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				((Expr_and_tmpContext)_localctx).op = match(T__26);
				((Expr_and_tmpContext)_localctx).isThereANDoperator = 1;((Expr_assignContext)getInvokingContext(17)).couldBeAssigned = 0; ((Expr_and_tmpContext)_localctx).andLine =  (((Expr_and_tmpContext)_localctx).op!=null?((Expr_and_tmpContext)_localctx).op.getLine():0) ;
				setState(335);
				((Expr_and_tmpContext)_localctx).ou = expr_eq();
				setState(336);
				((Expr_and_tmpContext)_localctx).os = expr_and_tmp();

							if(((Expr_and_tmpContext)_localctx).os.isThereANDoperator==0)
								((Expr_and_tmpContext)_localctx).item = ((Expr_and_tmpContext)_localctx).ou.item;
							else
							{ 
								if( !( ((Expr_and_tmpContext)_localctx).ou.item.getVariable().getType() instanceof IntType || ((Expr_and_tmpContext)_localctx).ou.item.getVariable().getType() instanceof NoType ) || !( ((Expr_and_tmpContext)_localctx).os.item.getVariable().getType() instanceof IntType || ((Expr_and_tmpContext)_localctx).os.item.getVariable().getType() instanceof NoType  ) )
								{
									print( "Error in line " + (((Expr_and_tmpContext)_localctx).op!=null?((Expr_and_tmpContext)_localctx).op.getLine():0) + " : operands in and must be integers" );
									((Expr_and_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
								}
								else if( ((Expr_and_tmpContext)_localctx).ou.item.getVariable().getType() instanceof NoType || ((Expr_and_tmpContext)_localctx).os.item.getVariable().getType() instanceof NoType )
									((Expr_and_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
								else
									((Expr_and_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
								mips.operationCommand( (((Expr_and_tmpContext)_localctx).op!=null?((Expr_and_tmpContext)_localctx).op.getText():null) );
							}
						
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
				((Expr_and_tmpContext)_localctx).isThereANDoperator = 0;((Expr_and_tmpContext)_localctx).item = null;
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
		public SymbolTableTemporaryVariableItem item;
		public Expr_cmpContext ou;
		public Expr_eq_tmpContext os;
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterExpr_eq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitExpr_eq(this);
		}
	}

	public final Expr_eqContext expr_eq() throws RecognitionException {
		Expr_eqContext _localctx = new Expr_eqContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expr_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			((Expr_eqContext)_localctx).ou = expr_cmp();
			setState(343);
			((Expr_eqContext)_localctx).os = expr_eq_tmp();
				
						if(((Expr_eqContext)_localctx).os.isThereEQNEQoperator==0)
							((Expr_eqContext)_localctx).item = ((Expr_eqContext)_localctx).ou.item;
						else
						{ 
							if(! ((Expr_eqContext)_localctx).ou.item.getVariable().getType().equals( ((Expr_eqContext)_localctx).os.item.getVariable().getType() ) && !( ((Expr_eqContext)_localctx).ou.item.getVariable().getType() instanceof NoType || ((Expr_eqContext)_localctx).os.item.getVariable().getType() instanceof NoType ) )
							{
								print("Error in line "+((Expr_eqContext)_localctx).os.eqline+" compared operands must have same types");
								((Expr_eqContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
							}
							else if( ((Expr_eqContext)_localctx).ou.item.getVariable().getType() instanceof NoType || ((Expr_eqContext)_localctx).os.item.getVariable().getType() instanceof NoType )
								((Expr_eqContext)_localctx).item =  new SymbolTableTemporaryVariableItem( new Variable( "temp" , NoType.getInstance() ) , 0 );
							else
									((Expr_eqContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
							//mips.operationCommand( ((Expr_eqContext)_localctx).os.eqoperator );
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

	public static class Expr_eq_tmpContext extends ParserRuleContext {
		public SymbolTableTemporaryVariableItem item;
		public int isThereEQNEQoperator;
		public int eqline;
		public String eqoperator;
		public Token op;
		public Expr_cmpContext ou;
		public Expr_eq_tmpContext os;
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterExpr_eq_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitExpr_eq_tmp(this);
		}
	}

	public final Expr_eq_tmpContext expr_eq_tmp() throws RecognitionException {
		Expr_eq_tmpContext _localctx = new Expr_eq_tmpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr_eq_tmp);
		int _la;
		try {
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				((Expr_eq_tmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
					((Expr_eq_tmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((Expr_eq_tmpContext)_localctx).eqline = (((Expr_eq_tmpContext)_localctx).op!=null?((Expr_eq_tmpContext)_localctx).op.getLine():0);((Expr_eq_tmpContext)_localctx).isThereEQNEQoperator = 1;((Expr_assignContext)getInvokingContext(17)).couldBeAssigned = 0; ((Expr_eq_tmpContext)_localctx).eqoperator =  (((Expr_eq_tmpContext)_localctx).op!=null?((Expr_eq_tmpContext)_localctx).op.getText():null); 
				setState(348);
				((Expr_eq_tmpContext)_localctx).ou = expr_cmp();
				setState(349);
				((Expr_eq_tmpContext)_localctx).os = expr_eq_tmp();

							if(((Expr_eq_tmpContext)_localctx).os.isThereEQNEQoperator==0)
								((Expr_eq_tmpContext)_localctx).item = ((Expr_eq_tmpContext)_localctx).ou.item;
							else
							{ 
								if(! ((Expr_eq_tmpContext)_localctx).ou.item.getVariable().getType().equals(((Expr_eq_tmpContext)_localctx).os.item.getVariable().getType()) && !( ((Expr_eq_tmpContext)_localctx).ou.item.getVariable().getType() instanceof NoType || ((Expr_eq_tmpContext)_localctx).os.item.getVariable().getType() instanceof NoType ) )
								{
									print("Error in line "+(((Expr_eq_tmpContext)_localctx).op!=null?((Expr_eq_tmpContext)_localctx).op.getLine():0)+" compared operands must have same types");
									((Expr_eq_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
								}
								else if( ((Expr_eq_tmpContext)_localctx).ou.item.getVariable().getType() instanceof NoType || ((Expr_eq_tmpContext)_localctx).os.item.getVariable().getType() instanceof NoType )
									((Expr_eq_tmpContext)_localctx).item =  new SymbolTableTemporaryVariableItem( new Variable( "temp" , NoType.getInstance() ) , 0 );
								else
									((Expr_eq_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
								//mips.operationCommand( (((Expr_eq_tmpContext)_localctx).op!=null?((Expr_eq_tmpContext)_localctx).op.getText():null) );	
							}
						
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

						((Expr_eq_tmpContext)_localctx).isThereEQNEQoperator = 0;
						((Expr_eq_tmpContext)_localctx).item = null;
					
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
		public SymbolTableTemporaryVariableItem item;
		public Expr_addContext ou;
		public Expr_cmp_tmpContext os;
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterExpr_cmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitExpr_cmp(this);
		}
	}

	public final Expr_cmpContext expr_cmp() throws RecognitionException {
		Expr_cmpContext _localctx = new Expr_cmpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr_cmp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			((Expr_cmpContext)_localctx).ou = expr_add();
			setState(356);
			((Expr_cmpContext)_localctx).os = expr_cmp_tmp();

						if(((Expr_cmpContext)_localctx).os.isThereCMPoperator==0)
							((Expr_cmpContext)_localctx).item = ((Expr_cmpContext)_localctx).ou.item;
						else{
							if(((Expr_cmpContext)_localctx).os.item.getVariable().getType() instanceof NoType || ((Expr_cmpContext)_localctx).ou.item.getVariable().getType() instanceof NoType)
								((Expr_cmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
							else if( !( ((Expr_cmpContext)_localctx).ou.item.getVariable().getType() instanceof IntType ) || !( ((Expr_cmpContext)_localctx).os.item.getVariable().getType() instanceof IntType ))
								print( "Error in line " + ((Expr_cmpContext)_localctx).os.compLine + " operands for comparision must be integers" );
							else
								((Expr_cmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
							mips.operationCommand( ((Expr_cmpContext)_localctx).os.compoperator );
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

	public static class Expr_cmp_tmpContext extends ParserRuleContext {
		public SymbolTableTemporaryVariableItem item;
		public int isThereCMPoperator;
		public int compLine;
		public String compoperator;
		public Token op;
		public Expr_addContext ou;
		public Expr_cmp_tmpContext os;
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterExpr_cmp_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitExpr_cmp_tmp(this);
		}
	}

	public final Expr_cmp_tmpContext expr_cmp_tmp() throws RecognitionException {
		Expr_cmp_tmpContext _localctx = new Expr_cmp_tmpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr_cmp_tmp);
		int _la;
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				((Expr_cmp_tmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__1 || _la==T__2) ) {
					((Expr_cmp_tmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((Expr_cmp_tmpContext)_localctx).isThereCMPoperator = 1; ((Expr_assignContext)getInvokingContext(17)).couldBeAssigned = 0; ((Expr_cmp_tmpContext)_localctx).compLine =  (((Expr_cmp_tmpContext)_localctx).op!=null?((Expr_cmp_tmpContext)_localctx).op.getLine():0) ; ((Expr_cmp_tmpContext)_localctx).compoperator =  (((Expr_cmp_tmpContext)_localctx).op!=null?((Expr_cmp_tmpContext)_localctx).op.getText():null); 
				setState(361);
				((Expr_cmp_tmpContext)_localctx).ou = expr_add();
				setState(362);
				((Expr_cmp_tmpContext)_localctx).os = expr_cmp_tmp();

							if(((Expr_cmp_tmpContext)_localctx).os.isThereCMPoperator==0)
							{
								if(((Expr_cmp_tmpContext)_localctx).ou.item.getVariable().getType() instanceof ArrayType ||((Expr_cmp_tmpContext)_localctx).ou.item.getVariable().getType() instanceof CharType){
									print("Error in line "+(((Expr_cmp_tmpContext)_localctx).op!=null?((Expr_cmp_tmpContext)_localctx).op.getLine():0)+" mathematical operand must be integer");
									((Expr_cmp_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
								}
								else
									((Expr_cmp_tmpContext)_localctx).item = ((Expr_cmp_tmpContext)_localctx).ou.item;
							}
							else 
							{
								if( !( ((Expr_cmp_tmpContext)_localctx).ou.item.getVariable().getType() instanceof IntType || ((Expr_cmp_tmpContext)_localctx).ou.item.getVariable().getType() instanceof NoType ) || !( ((Expr_cmp_tmpContext)_localctx).os.item.getVariable().getType() instanceof IntType || ((Expr_cmp_tmpContext)_localctx).os.item.getVariable().getType() instanceof NoType  ) )
								{
									print( "Error in line " + (((Expr_cmp_tmpContext)_localctx).op!=null?((Expr_cmp_tmpContext)_localctx).op.getLine():0) + " : operands in relational comparision must be integers" );
									((Expr_cmp_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
								}
								else if(((Expr_cmp_tmpContext)_localctx).os.item.getVariable().getType() instanceof NoType || ((Expr_cmp_tmpContext)_localctx).ou.item.getVariable().getType() instanceof NoType)
									((Expr_cmp_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
								else
									((Expr_cmp_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
								mips.operationCommand( (((Expr_cmp_tmpContext)_localctx).op!=null?((Expr_cmp_tmpContext)_localctx).op.getText():null) );
							}
						
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

						((Expr_cmp_tmpContext)_localctx).isThereCMPoperator = 0;
						((Expr_cmp_tmpContext)_localctx).item = null;
					
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
		public SymbolTableTemporaryVariableItem item;
		public Expr_multContext ou;
		public Expr_add_tmpContext os;
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterExpr_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitExpr_add(this);
		}
	}

	public final Expr_addContext expr_add() throws RecognitionException {
		Expr_addContext _localctx = new Expr_addContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expr_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			((Expr_addContext)_localctx).ou = expr_mult();
			setState(369);
			((Expr_addContext)_localctx).os = expr_add_tmp();

						if(((Expr_addContext)_localctx).os.isTherePMoperator==0)
							((Expr_addContext)_localctx).item = ((Expr_addContext)_localctx).ou.item;
						else{
							if(((Expr_addContext)_localctx).os.item.getVariable().getType() instanceof NoType || ((Expr_addContext)_localctx).ou.item.getVariable().getType() instanceof NoType)
								((Expr_addContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
							else if( !( ((Expr_addContext)_localctx).ou.item.getVariable().getType() instanceof IntType ) || !( ((Expr_addContext)_localctx).os.item.getVariable().getType() instanceof IntType ) )
							{
								print( "Error in line " + ((Expr_addContext)_localctx).os.addLine + " add is defined on integers" );
								((Expr_addContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
							}
							else
								((Expr_addContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
							mips.operationCommand( ((Expr_addContext)_localctx).os.asoperator );
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

	public static class Expr_add_tmpContext extends ParserRuleContext {
		public SymbolTableTemporaryVariableItem item;
		public int isTherePMoperator;
		public int addLine;
		public String asoperator;
		public Token op;
		public Expr_multContext ou;
		public Expr_add_tmpContext os;
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterExpr_add_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitExpr_add_tmp(this);
		}
	}

	public final Expr_add_tmpContext expr_add_tmp() throws RecognitionException {
		Expr_add_tmpContext _localctx = new Expr_add_tmpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr_add_tmp);
		int _la;
		try {
			setState(379);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				((Expr_add_tmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
					((Expr_add_tmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}

							((Expr_add_tmpContext)_localctx).isTherePMoperator = 1;
							((Expr_assignContext)getInvokingContext(17)).couldBeAssigned = 0; 
							((Expr_add_tmpContext)_localctx).addLine =  (((Expr_add_tmpContext)_localctx).op!=null?((Expr_add_tmpContext)_localctx).op.getLine():0); ((Expr_add_tmpContext)_localctx).asoperator =  (((Expr_add_tmpContext)_localctx).op!=null?((Expr_add_tmpContext)_localctx).op.getText():null); 
						
				setState(374);
				((Expr_add_tmpContext)_localctx).ou = expr_mult();
				setState(375);
				((Expr_add_tmpContext)_localctx).os = expr_add_tmp();

							if(((Expr_add_tmpContext)_localctx).os.isTherePMoperator==0)
							{
								if(((Expr_add_tmpContext)_localctx).ou.item.getVariable().getType() instanceof ArrayType ||((Expr_add_tmpContext)_localctx).ou.item.getVariable().getType() instanceof CharType){
									print("Error in line "+(((Expr_add_tmpContext)_localctx).op!=null?((Expr_add_tmpContext)_localctx).op.getLine():0)+" mathematical operand must be integer");
									((Expr_add_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
								}
								else
									((Expr_add_tmpContext)_localctx).item = ((Expr_add_tmpContext)_localctx).ou.item;
							}
							else
							{ 
								if(((Expr_add_tmpContext)_localctx).os.item.getVariable().getType() instanceof NoType || ((Expr_add_tmpContext)_localctx).ou.item.getVariable().getType() instanceof NoType)
									((Expr_add_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
								else if( !( ((Expr_add_tmpContext)_localctx).ou.item.getVariable().getType() instanceof IntType ) || !( ((Expr_add_tmpContext)_localctx).os.item.getVariable().getType() instanceof IntType ) )
								{
									print( "Error in line " + (((Expr_add_tmpContext)_localctx).op!=null?((Expr_add_tmpContext)_localctx).op.getLine():0) + " add is defined on integers" );
									((Expr_add_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
								}
								else
									((Expr_add_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
								mips.operationCommand( (((Expr_add_tmpContext)_localctx).op!=null?((Expr_add_tmpContext)_localctx).op.getText():null) );
							}
						
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
				((Expr_add_tmpContext)_localctx).isTherePMoperator = 0;((Expr_add_tmpContext)_localctx).item = null;
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
		public SymbolTableTemporaryVariableItem item;
		public Expr_unContext ou;
		public Expr_mult_tmpContext os;
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterExpr_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitExpr_mult(this);
		}
	}

	public final Expr_multContext expr_mult() throws RecognitionException {
		Expr_multContext _localctx = new Expr_multContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			((Expr_multContext)_localctx).ou = expr_un();
			setState(382);
			((Expr_multContext)_localctx).os = expr_mult_tmp();

						if(((Expr_multContext)_localctx).os.isThereMDoperator==0)
							((Expr_multContext)_localctx).item = ((Expr_multContext)_localctx).ou.item;
						else{
							if(((Expr_multContext)_localctx).os.item.getVariable().getType() instanceof NoType || ((Expr_multContext)_localctx).ou.item.getVariable().getType() instanceof NoType)
								((Expr_multContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
							else if( ((Expr_multContext)_localctx).os.item.getVariable().getType() instanceof IntType && ((Expr_multContext)_localctx).ou.item.getVariable().getType() instanceof IntType )
								((Expr_multContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
							else
							{
								print( "Error in line " + ((Expr_multContext)_localctx).os.multLine + " the operands must be integers" );
								((Expr_multContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
							}
							mips.operationCommand( ((Expr_multContext)_localctx).os.multoperator );
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

	public static class Expr_mult_tmpContext extends ParserRuleContext {
		public SymbolTableTemporaryVariableItem item;
		public int isThereMDoperator;
		public int multLine;
		public String multoperator;
		public Token op;
		public Expr_unContext ou;
		public Expr_mult_tmpContext os;
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterExpr_mult_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitExpr_mult_tmp(this);
		}
	}

	public final Expr_mult_tmpContext expr_mult_tmp() throws RecognitionException {
		Expr_mult_tmpContext _localctx = new Expr_mult_tmpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expr_mult_tmp);
		int _la;
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				((Expr_mult_tmpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
					((Expr_mult_tmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((Expr_mult_tmpContext)_localctx).isThereMDoperator = 1;((Expr_assignContext)getInvokingContext(17)).couldBeAssigned = 0; ((Expr_mult_tmpContext)_localctx).multLine =  (((Expr_mult_tmpContext)_localctx).op!=null?((Expr_mult_tmpContext)_localctx).op.getLine():0) ; ((Expr_mult_tmpContext)_localctx).multoperator =  (((Expr_mult_tmpContext)_localctx).op!=null?((Expr_mult_tmpContext)_localctx).op.getText():null);
				setState(387);
				((Expr_mult_tmpContext)_localctx).ou = expr_un();
				setState(388);
				((Expr_mult_tmpContext)_localctx).os = expr_mult_tmp();

							if(((Expr_mult_tmpContext)_localctx).os.isThereMDoperator==0)
							{
								if(((Expr_mult_tmpContext)_localctx).ou.item.getVariable().getType() instanceof ArrayType ||((Expr_mult_tmpContext)_localctx).ou.item.getVariable().getType() instanceof CharType){
									print("Error in line "+(((Expr_mult_tmpContext)_localctx).op!=null?((Expr_mult_tmpContext)_localctx).op.getLine():0)+" mathematical operand must be integer");
									((Expr_mult_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
								}
								else
									((Expr_mult_tmpContext)_localctx).item = ((Expr_mult_tmpContext)_localctx).ou.item;
							}
							else
							{ 
								if(((Expr_mult_tmpContext)_localctx).os.item.getVariable().getType() instanceof NoType || ((Expr_mult_tmpContext)_localctx).ou.item.getVariable().getType() instanceof NoType)
									((Expr_mult_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
								else if( ((Expr_mult_tmpContext)_localctx).os.item.getVariable().getType() instanceof IntType && ((Expr_mult_tmpContext)_localctx).ou.item.getVariable().getType() instanceof IntType )
										((Expr_mult_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
								else
								{
									print( "Error in Line : " + (((Expr_mult_tmpContext)_localctx).op!=null?((Expr_mult_tmpContext)_localctx).op.getLine():0) + " the operands must be integers" );
									((Expr_mult_tmpContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
								}
								mips.operationCommand( ((Expr_mult_tmpContext)_localctx).os.multoperator );
							}
						
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
				((Expr_mult_tmpContext)_localctx).isThereMDoperator = 0;((Expr_mult_tmpContext)_localctx).item = null;
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
		public SymbolTableTemporaryVariableItem item;
		public int isThereUnOperator;
		public Token op;
		public Expr_unContext ou;
		public Expr_memContext or;
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterExpr_un(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitExpr_un(this);
		}
	}

	public final Expr_unContext expr_un() throws RecognitionException {
		Expr_unContext _localctx = new Expr_unContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expr_un);
		int _la;
		try {
			setState(402);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				((Expr_unContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__33) ) {
					((Expr_unContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				((Expr_unContext)_localctx).isThereUnOperator = 1;((Expr_assignContext)getInvokingContext(17)).couldBeAssigned = 0;
				setState(396);
				((Expr_unContext)_localctx).ou = expr_un();

							if(((Expr_unContext)_localctx).ou.isThereUnOperator==0 && (((Expr_unContext)_localctx).ou.item.getVariable().getType() instanceof ArrayType ||((Expr_unContext)_localctx).ou.item.getVariable().getType() instanceof CharType)){
									print("Error in line "+(((Expr_unContext)_localctx).op!=null?((Expr_unContext)_localctx).op.getLine():0)+" mathematical operand must be integer");
									((Expr_unContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",NoType.getInstance()),0);
							}
							else
								((Expr_unContext)_localctx).item = ((Expr_unContext)_localctx).ou.item;
							String operand = (((Expr_unContext)_localctx).op!=null?((Expr_unContext)_localctx).op.getText():null) + "u";
							mips.operationCommand( operand );
						
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
				setState(399);
				((Expr_unContext)_localctx).or = expr_mem();

							((Expr_unContext)_localctx).item = ((Expr_unContext)_localctx).or.item;((Expr_unContext)_localctx).isThereUnOperator = 0;
						
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
		public SymbolTableTemporaryVariableItem item;
		public int badAccessFlag;
		public int mem_tmp_cnt;
		public Expr_otherContext og;
		public Expr_mem_tmpContext oi;
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterExpr_mem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitExpr_mem(this);
		}
	}

	public final Expr_memContext expr_mem() throws RecognitionException {
		Expr_memContext _localctx = new Expr_memContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expr_mem);
		try {
			enterOuterAlt(_localctx, 1);
			{

						((Expr_memContext)_localctx).badAccessFlag = 0;
						((Expr_memContext)_localctx).mem_tmp_cnt = 0;
					
			setState(405);
			((Expr_memContext)_localctx).og = expr_other();
			setState(406);
			((Expr_memContext)_localctx).oi = expr_mem_tmp();

						if(_localctx.badAccessFlag==1)
						{
							((Expr_memContext)_localctx).item =  new SymbolTableTemporaryVariableItem( new Variable( "temp" , NoType.getInstance()) , 0 );				
							print("Error in line "+((Expr_memContext)_localctx).oi.arrayAccessLine+" array indexes' types must be int");		
						}
						if(_localctx.mem_tmp_cnt!=0){
							if(!(((Expr_memContext)_localctx).og.item.getVariable().getType() instanceof ArrayType) && !( ((Expr_memContext)_localctx).og.item.getVariable().getName().equals("temp_read") ) && !( ((Expr_memContext)_localctx).og.item.getVariable().getName().equals("temp_curly") ))
							{
								if( !(((Expr_memContext)_localctx).og.item.getVariable().getType() instanceof NoType ))
									print("Error in line "+((Expr_memContext)_localctx).oi.arrayAccessLine+" the operand must be an array");
								((Expr_memContext)_localctx).item =  new SymbolTableTemporaryVariableItem( new Variable( "temp" , NoType.getInstance()) , 0 );
							}
							else{
								if(((ArrayType)((Expr_memContext)_localctx).og.item.getVariable().getType()).DimensionsCount()<_localctx.mem_tmp_cnt)
								{
									((Expr_memContext)_localctx).item =  new SymbolTableTemporaryVariableItem( new Variable( "temp" , NoType.getInstance()) , 0 );
									print("Error in line "+((Expr_memContext)_localctx).oi.arrayAccessLine+" bad access");
								}
								else if(((ArrayType)((Expr_memContext)_localctx).og.item.getVariable().getType()).DimensionsCount()==_localctx.mem_tmp_cnt)
								{
									if(((Expr_memContext)_localctx).og.item.getVariable().getType() instanceof CharArrayType)
										((Expr_memContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",CharType.getInstance()),0);
									else
										((Expr_memContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",IntType.getInstance()),0);
								}
								else{
									ArrayList<Integer> dimens=new ArrayList<>(((ArrayType)((Expr_memContext)_localctx).og.item.getVariable().getType()).getDimensions());
									for(int i=0;i<_localctx.mem_tmp_cnt;i++)
										dimens.remove(0);
									ArrayType type;
									if(((Expr_memContext)_localctx).og.item.getVariable().getType() instanceof CharArrayType)
										type=CharArrayType.getInstance();
									else
										type=IntArrayType.getInstance();
									type.pushNewDimensions(dimens);
									((Expr_memContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp",type),0);
								}
								mips.generateAccessCode( ((Expr_memContext)_localctx).oi.indices.size() , ((Expr_memContext)_localctx).og.item );
							}
						}
						else
							((Expr_memContext)_localctx).item = ((Expr_memContext)_localctx).og.item;
					
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
		public int arrayAccessLine;
		public ArrayList<SymbolTableTemporaryVariableItem> indices;
		public int isExecuted;
		public Token oi;
		public ExprContext op;
		public Expr_mem_tmpContext oj;
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterExpr_mem_tmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitExpr_mem_tmp(this);
		}
	}

	public final Expr_mem_tmpContext expr_mem_tmp() throws RecognitionException {
		Expr_mem_tmpContext _localctx = new Expr_mem_tmpContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr_mem_tmp);
		try {
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				((Expr_mem_tmpContext)_localctx).oi = match(T__9);
				((Expr_mem_tmpContext)_localctx).arrayAccessLine = (((Expr_mem_tmpContext)_localctx).oi!=null?((Expr_mem_tmpContext)_localctx).oi.getLine():0); ((Expr_mem_tmpContext)_localctx).isExecuted =  1;
				setState(411);
				((Expr_mem_tmpContext)_localctx).op = expr();
				setState(412);
				match(T__10);

								((Expr_mem_tmpContext)_localctx).indices =  new ArrayList<SymbolTableTemporaryVariableItem>();
								((Expr_memContext)getInvokingContext(31)).mem_tmp_cnt++;
								if(! ( ((Expr_mem_tmpContext)_localctx).op.item.getVariable().getType() instanceof IntType ) && ! ( ((Expr_mem_tmpContext)_localctx).op.item.getVariable().getType() instanceof NoType ) )
									((Expr_memContext)getInvokingContext(31)).badAccessFlag = 1;
						
				setState(414);
				((Expr_mem_tmpContext)_localctx).oj = expr_mem_tmp();

							if( ((Expr_mem_tmpContext)_localctx).oj.isExecuted == 1 )
							{
								((Expr_mem_tmpContext)_localctx).oj.indices.add( 0 , ((Expr_mem_tmpContext)_localctx).op.item );
								((Expr_mem_tmpContext)_localctx).indices =  ((Expr_mem_tmpContext)_localctx).oj.indices;
							}
							else
								_localctx.indices.add( ((Expr_mem_tmpContext)_localctx).op.item );
						
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
				 ((Expr_mem_tmpContext)_localctx).isExecuted =  0; 
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
		public SymbolTableTemporaryVariableItem item;
		public String name;
		public Token oa;
		public Token ot;
		public Token oe;
		public Token oj;
		public Token oy;
		public ExprContext or;
		public ExprContext ov;
		public Token ow;
		public Token CONST_NUM;
		public Token oz;
		public ExprContext od;
		public TerminalNode CONST_NUM() { return getToken(Atalk_p2Parser.CONST_NUM, 0); }
		public TerminalNode CONST_CHAR() { return getToken(Atalk_p2Parser.CONST_CHAR, 0); }
		public TerminalNode CONST_STR() { return getToken(Atalk_p2Parser.CONST_STR, 0); }
		public TerminalNode ID() { return getToken(Atalk_p2Parser.ID, 0); }
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
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).enterExpr_other(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Atalk_p2Listener ) ((Atalk_p2Listener)listener).exitExpr_other(this);
		}
	}

	public final Expr_otherContext expr_other() throws RecognitionException {
		Expr_otherContext _localctx = new Expr_otherContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expr_other);
		int _la;
		try {
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST_NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				((Expr_otherContext)_localctx).oa = match(CONST_NUM);

							((ExprContext)getInvokingContext(16)).lineNumber =  (((Expr_otherContext)_localctx).oa!=null?((Expr_otherContext)_localctx).oa.getLine():0);
							((Expr_otherContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp_const_int",IntType.getInstance()),0);
							((Expr_assignContext)getInvokingContext(17)).couldBeAssigned = 0;
							_localctx.item.isLValue = 0;
							mips.addConstIntToStack( (((Expr_otherContext)_localctx).oa!=null?Integer.valueOf(((Expr_otherContext)_localctx).oa.getText()):0) );
						
				}
				break;
			case CONST_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				((Expr_otherContext)_localctx).ot = match(CONST_CHAR);

							((ExprContext)getInvokingContext(16)).lineNumber =  (((Expr_otherContext)_localctx).ot!=null?((Expr_otherContext)_localctx).ot.getLine():0);
							((Expr_otherContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp_const_char",CharType.getInstance()),0);
							((Expr_assignContext)getInvokingContext(17)).couldBeAssigned = 0;
							_localctx.item.isLValue = 0;
							char temp = (((Expr_otherContext)_localctx).ot!=null?((Expr_otherContext)_localctx).ot.getText():null).charAt( 1 );
							mips.addCode( "#adding character " + temp + " to stack" );
							mips.addConstIntToStack( ( int ) temp );
						
				}
				break;
			case CONST_STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				((Expr_otherContext)_localctx).oe = match(CONST_STR);

							((ExprContext)getInvokingContext(16)).lineNumber =  (((Expr_otherContext)_localctx).oe!=null?((Expr_otherContext)_localctx).oe.getLine():0);
							CharArrayType c = CharArrayType.getInstance();
							c.pushNewDimension( (((Expr_otherContext)_localctx).oe!=null?((Expr_otherContext)_localctx).oe.getText():null).length() - 2 );
							((Expr_otherContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp_const_str", c ),0);
							((Expr_assignContext)getInvokingContext(17)).couldBeAssigned = 0;
							_localctx.item.isLValue = 0;
							//mips.addConstStringToStack( (((Expr_otherContext)_localctx).oe!=null?((Expr_otherContext)_localctx).oe.getText():null) );
							mips.addConstStringToStack( (((Expr_otherContext)_localctx).oe!=null?((Expr_otherContext)_localctx).oe.getText():null).length() - 2 , (((Expr_otherContext)_localctx).oe!=null?((Expr_otherContext)_localctx).oe.getText():null) );
						
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(426);
				((Expr_otherContext)_localctx).oj = match(ID);
					
							((Expr_otherContext)_localctx).name =  (((Expr_otherContext)_localctx).oj!=null?((Expr_otherContext)_localctx).oj.getText():null);
							((ExprContext)getInvokingContext(16)).lineNumber =  (((Expr_otherContext)_localctx).oj!=null?((Expr_otherContext)_localctx).oj.getLine():0);
							SymbolTableVariableItemBase localitem = (SymbolTableVariableItemBase) SymbolTable.top.get((((Expr_otherContext)_localctx).oj!=null?((Expr_otherContext)_localctx).oj.getText():null));
							if(localitem==null){
								print("Error in line "+(((Expr_otherContext)_localctx).oj!=null?((Expr_otherContext)_localctx).oj.getLine():0)+" item " +(((Expr_otherContext)_localctx).oj!=null?((Expr_otherContext)_localctx).oj.getText():null)+" does not exist");
								SymbolTableTemporaryVariableItem localitem1 = new SymbolTableTemporaryVariableItem(new Variable((((Expr_otherContext)_localctx).oj!=null?((Expr_otherContext)_localctx).oj.getText():null) ,NoType.getInstance()),0);
								try
								{
									SymbolTable.top.put( localitem1 );
								}
								catch( ItemAlreadyExistsException e ) {}
								((Expr_otherContext)_localctx).item =  localitem1;
							}
							else{
								((Expr_otherContext)_localctx).item = new SymbolTableTemporaryVariableItem(localitem.getVariable(),localitem.getOffset());
								mips.addLvalueAddressToStack( localitem.getVariable().getName(), localitem.getBaseRegister() , ( localitem.getOffset() + localitem.getVariable().size() - Type.WORD_BYTES ) );
							}		
						
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(428);
				((Expr_otherContext)_localctx).oy = match(T__34);
				setState(429);
				((Expr_otherContext)_localctx).or = expr();

							ArrayList<SymbolTableTemporaryVariableItem> recordList = new ArrayList<SymbolTableTemporaryVariableItem>();
							boolean inconsistencyFlag = false;
							((ExprContext)getInvokingContext(16)).lineNumber =  (((Expr_otherContext)_localctx).oy!=null?((Expr_otherContext)_localctx).oy.getLine():0);
							int dimen=1;
							((Expr_assignContext)getInvokingContext(17)).couldBeAssigned = 0;
							if( ((Expr_otherContext)_localctx).or.item.getVariable().getType() instanceof CharType || ((Expr_otherContext)_localctx).or.item.getVariable().getType() instanceof IntType || ((Expr_otherContext)_localctx).or.item.getVariable().getType() instanceof ArrayType )
								((Expr_otherContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp_curly", ((Expr_otherContext)_localctx).or.item.getVariable().getType() ) ,0);
							else if( ((Expr_otherContext)_localctx).or.item.getVariable().getType() instanceof NoType )
								((Expr_otherContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp_curly", NoType.getInstance() ) ,0);
							recordList.add( ((Expr_otherContext)_localctx).or.item );
						
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(431);
					match(T__6);
					setState(432);
					((Expr_otherContext)_localctx).ov = expr();

								if( !( ((Expr_otherContext)_localctx).or.item.getVariable().getType().equals(((Expr_otherContext)_localctx).ov.item.getVariable().getType()) ) )
								{
									inconsistencyFlag = true;
									if( !( ((Expr_otherContext)_localctx).ov.item.getVariable().getType() instanceof NoType ) )
										print("Error in line "+(((Expr_otherContext)_localctx).oy!=null?((Expr_otherContext)_localctx).oy.getLine():0)+" array contents do not match");
								}
								else
									dimen++;
								recordList.add( ((Expr_otherContext)_localctx).ov.item );
							
					}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(440);
				match(T__35);

							if(((Expr_otherContext)_localctx).or.item.getVariable().getType() instanceof ArrayType && !( ((Expr_otherContext)_localctx).or.item.getVariable().getType() instanceof NoType ) && !inconsistencyFlag )
							{
								_localctx.item.isLValue = 0;
								mips.generateCodeForRecord( recordList );
								( (ArrayType) _localctx.item.getVariable().getType() ).pushNewDimensionToFirst(dimen);
							}
							else
								((Expr_otherContext)_localctx).item =  new SymbolTableTemporaryVariableItem(new Variable("temp_curly", NoType.getInstance() ) ,0 );
						
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 6);
				{
				setState(443);
				((Expr_otherContext)_localctx).ow = match(T__36);
				setState(444);
				match(T__5);
				setState(445);
				((Expr_otherContext)_localctx).CONST_NUM = match(CONST_NUM);
				setState(446);
				match(T__7);

							((ExprContext)getInvokingContext(16)).lineNumber =  (((Expr_otherContext)_localctx).ow!=null?((Expr_otherContext)_localctx).ow.getLine():0);
							if( (((Expr_otherContext)_localctx).CONST_NUM!=null?Integer.valueOf(((Expr_otherContext)_localctx).CONST_NUM.getText()):0) == 0 )
								print( "Error in line " + (((Expr_otherContext)_localctx).CONST_NUM!=null?((Expr_otherContext)_localctx).CONST_NUM.getLine():0) + " , read argument must not be 0" );
							else
							{
								CharArrayType c = new CharArrayType();
								c.pushNewDimension( (((Expr_otherContext)_localctx).CONST_NUM!=null?Integer.valueOf(((Expr_otherContext)_localctx).CONST_NUM.getText()):0) );
								((Expr_otherContext)_localctx).item = new SymbolTableTemporaryVariableItem(new Variable("temp_read", c),0);
								((Expr_assignContext)getInvokingContext(17)).couldBeAssigned = 0;
								mips.generateRead( (((Expr_otherContext)_localctx).CONST_NUM!=null?Integer.valueOf(((Expr_otherContext)_localctx).CONST_NUM.getText()):0) );
							}
							_localctx.item.isLValue = 0;
						
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 7);
				{
				setState(448);
				((Expr_otherContext)_localctx).oz = match(T__5);
				setState(449);
				((Expr_otherContext)_localctx).od = expr();
				setState(450);
				match(T__7);

							((ExprContext)getInvokingContext(16)).lineNumber =  (((Expr_otherContext)_localctx).oz!=null?((Expr_otherContext)_localctx).oz.getLine():0);
							((Expr_otherContext)_localctx).item = ((Expr_otherContext)_localctx).od.item;
							_localctx.item.isLValue = ((Expr_otherContext)_localctx).od.item.isLValue;
							if(((Expr_otherContext)_localctx).od.couldBeAssigned==0)
								((Expr_assignContext)getInvokingContext(17)).couldBeAssigned = 0;
						
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u01ca\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\\\n\3\f\3\16\3_\13\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4r\n\4"+
		"\f\4\16\4u\13\4\5\4w\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7"+
		"\5\u0084\n\5\f\5\16\5\u0087\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u008f\n\6"+
		"\f\6\16\6\u0092\13\6\3\6\3\6\3\6\3\6\7\6\u0098\n\6\f\6\16\6\u009b\13\6"+
		"\5\6\u009d\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b4\n\b\f\b\16\b\u00b7\13\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00bf\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\7\n\u00d2\n\n\f\n\16\n\u00d5\13\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e2\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ec\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00f7\n\f\3\f\7\f\u00fa\n\f\f\f\16\f\u00fd\13\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0108\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u0114\n\r\f\r\16\r\u0117\13\r\5\r\u0119\n\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u013d\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u014a\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u0157\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u0164\n\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u0171\n\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u017e\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u018b\n\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u0195\n \3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01a5\n\"\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u01b6\n#\f#\16#\u01b9\13#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01c8\n#\3#\2\2$\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\b\3\3++\3\2"+
		"\36\37\3\2\4\5\3\2 !\3\2\"#\4\2!!$$\2\u01d5\2F\3\2\2\2\4P\3\2\2\2\6d\3"+
		"\2\2\2\b\177\3\2\2\2\n\u009c\3\2\2\2\f\u009e\3\2\2\2\16\u00a6\3\2\2\2"+
		"\20\u00c3\3\2\2\2\22\u00d3\3\2\2\2\24\u00e1\3\2\2\2\26\u00e3\3\2\2\2\30"+
		"\u0100\3\2\2\2\32\u011e\3\2\2\2\34\u0125\3\2\2\2\36\u0128\3\2\2\2 \u012b"+
		"\3\2\2\2\"\u012f\3\2\2\2$\u013c\3\2\2\2&\u013e\3\2\2\2(\u0149\3\2\2\2"+
		"*\u014b\3\2\2\2,\u0156\3\2\2\2.\u0158\3\2\2\2\60\u0163\3\2\2\2\62\u0165"+
		"\3\2\2\2\64\u0170\3\2\2\2\66\u0172\3\2\2\28\u017d\3\2\2\2:\u017f\3\2\2"+
		"\2<\u018a\3\2\2\2>\u0194\3\2\2\2@\u0196\3\2\2\2B\u01a4\3\2\2\2D\u01c7"+
		"\3\2\2\2FK\b\2\1\2GJ\5\4\3\2HJ\7+\2\2IG\3\2\2\2IH\3\2\2\2JM\3\2\2\2KI"+
		"\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\b\2\1\2O\3\3\2\2\2PQ\7\3\2\2"+
		"QR\7,\2\2RS\b\3\1\2ST\7\4\2\2TU\7(\2\2UV\b\3\1\2VW\7\5\2\2W]\7+\2\2X\\"+
		"\5\b\5\2Y\\\5\6\4\2Z\\\7+\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\_\3\2\2\2"+
		"][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\6\2\2ab\t\2\2\2bc\b\3\1\2"+
		"c\5\3\2\2\2de\b\4\1\2ef\7\7\2\2fg\7,\2\2gh\b\4\1\2hv\7\b\2\2ij\5\n\6\2"+
		"jk\7,\2\2ks\b\4\1\2lm\7\t\2\2mn\5\n\6\2no\7,\2\2op\b\4\1\2pr\3\2\2\2q"+
		"l\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3\2\2\2vi\3\2\2\2"+
		"vw\3\2\2\2wx\3\2\2\2xy\7\n\2\2yz\7+\2\2z{\5\22\n\2{|\7\6\2\2|}\7+\2\2"+
		"}~\b\4\1\2~\7\3\2\2\2\177\u0080\5\n\6\2\u0080\u0085\7,\2\2\u0081\u0082"+
		"\7\t\2\2\u0082\u0084\7,\2\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u0089\7+\2\2\u0089\t\3\2\2\2\u008a\u0090\7\13\2\2\u008b\u008c"+
		"\7\f\2\2\u008c\u008d\7(\2\2\u008d\u008f\7\r\2\2\u008e\u008b\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u009d\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\u0099\7\16\2\2\u0094\u0095\7\f\2\2\u0095"+
		"\u0096\7(\2\2\u0096\u0098\7\r\2\2\u0097\u0094\3\2\2\2\u0098\u009b\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009c\u008a\3\2\2\2\u009c\u0093\3\2\2\2\u009d\13\3\2\2"+
		"\2\u009e\u009f\b\7\1\2\u009f\u00a0\7\17\2\2\u00a0\u00a1\7+\2\2\u00a1\u00a2"+
		"\5\22\n\2\u00a2\u00a3\7\6\2\2\u00a3\u00a4\7+\2\2\u00a4\u00a5\b\7\1\2\u00a5"+
		"\r\3\2\2\2\u00a6\u00a7\7\20\2\2\u00a7\u00a8\5\"\22\2\u00a8\u00a9\b\b\1"+
		"\2\u00a9\u00aa\7+\2\2\u00aa\u00ab\5\22\n\2\u00ab\u00b5\b\b\1\2\u00ac\u00ad"+
		"\7\21\2\2\u00ad\u00ae\5\"\22\2\u00ae\u00af\b\b\1\2\u00af\u00b0\7+\2\2"+
		"\u00b0\u00b1\5\22\n\2\u00b1\u00b2\b\b\1\2\u00b2\u00b4\3\2\2\2\u00b3\u00ac"+
		"\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00be\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\22\2\2\u00b9\u00ba\7"+
		"+\2\2\u00ba\u00bb\b\b\1\2\u00bb\u00bc\5\22\n\2\u00bc\u00bd\b\b\1\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c1\7\6\2\2\u00c1\u00c2\7+\2\2\u00c2\17\3\2\2\2\u00c3\u00c4"+
		"\7\23\2\2\u00c4\u00c5\b\t\1\2\u00c5\u00c6\7,\2\2\u00c6\u00c7\7\24\2\2"+
		"\u00c7\u00c8\5\"\22\2\u00c8\u00c9\b\t\1\2\u00c9\u00ca\7+\2\2\u00ca\u00cb"+
		"\5\22\n\2\u00cb\u00cc\7\6\2\2\u00cc\u00cd\b\t\1\2\u00cd\u00ce\7+\2\2\u00ce"+
		"\21\3\2\2\2\u00cf\u00d2\5\24\13\2\u00d0\u00d2\7+\2\2\u00d1\u00cf\3\2\2"+
		"\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\23\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00e2\5\26\f\2\u00d7"+
		"\u00d8\5 \21\2\u00d8\u00d9\b\13\1\2\u00d9\u00e2\3\2\2\2\u00da\u00e2\5"+
		"\20\t\2\u00db\u00e2\5\16\b\2\u00dc\u00e2\5\34\17\2\u00dd\u00e2\5\36\20"+
		"\2\u00de\u00e2\5\30\r\2\u00df\u00e2\5\32\16\2\u00e0\u00e2\5\f\7\2\u00e1"+
		"\u00d6\3\2\2\2\u00e1\u00d7\3\2\2\2\u00e1\u00da\3\2\2\2\u00e1\u00db\3\2"+
		"\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\25\3\2\2\2\u00e3\u00e4\5\n\6"+
		"\2\u00e4\u00e5\7,\2\2\u00e5\u00eb\b\f\1\2\u00e6\u00e7\b\f\1\2\u00e7\u00e8"+
		"\7\25\2\2\u00e8\u00e9\5\"\22\2\u00e9\u00ea\b\f\1\2\u00ea\u00ec\3\2\2\2"+
		"\u00eb\u00e6\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00fb"+
		"\b\f\1\2\u00ee\u00ef\7\t\2\2\u00ef\u00f0\7,\2\2\u00f0\u00f6\b\f\1\2\u00f1"+
		"\u00f2\b\f\1\2\u00f2\u00f3\7\25\2\2\u00f3\u00f4\5\"\22\2\u00f4\u00f5\b"+
		"\f\1\2\u00f5\u00f7\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fa\b\f\1\2\u00f9\u00ee\3\2\2\2\u00fa\u00fd\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u00ff\7+\2\2\u00ff\27\3\2\2\2\u0100\u0107\b\r\1\2"+
		"\u0101\u0102\7,\2\2\u0102\u0108\b\r\1\2\u0103\u0104\7\26\2\2\u0104\u0108"+
		"\b\r\1\2\u0105\u0106\7\27\2\2\u0106\u0108\b\r\1\2\u0107\u0101\3\2\2\2"+
		"\u0107\u0103\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a"+
		"\7\30\2\2\u010a\u010b\7,\2\2\u010b\u010c\7\b\2\2\u010c\u0118\b\r\1\2\u010d"+
		"\u010e\5\"\22\2\u010e\u0115\b\r\1\2\u010f\u0110\7\t\2\2\u0110\u0111\5"+
		"\"\22\2\u0111\u0112\b\r\1\2\u0112\u0114\3\2\2\2\u0113\u010f\3\2\2\2\u0114"+
		"\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0119\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0118\u010d\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\7\n\2\2\u011b\u011c\b\r\1\2\u011c\u011d\7+"+
		"\2\2\u011d\31\3\2\2\2\u011e\u011f\7\31\2\2\u011f\u0120\7\b\2\2\u0120\u0121"+
		"\5\"\22\2\u0121\u0122\b\16\1\2\u0122\u0123\7\n\2\2\u0123\u0124\7+\2\2"+
		"\u0124\33\3\2\2\2\u0125\u0126\7\32\2\2\u0126\u0127\7+\2\2\u0127\35\3\2"+
		"\2\2\u0128\u0129\7\33\2\2\u0129\u012a\7+\2\2\u012a\37\3\2\2\2\u012b\u012c"+
		"\5\"\22\2\u012c\u012d\7+\2\2\u012d\u012e\b\21\1\2\u012e!\3\2\2\2\u012f"+
		"\u0130\5$\23\2\u0130\u0131\b\22\1\2\u0131#\3\2\2\2\u0132\u0133\b\23\1"+
		"\2\u0133\u0134\5&\24\2\u0134\u0135\7\25\2\2\u0135\u0136\5$\23\2\u0136"+
		"\u0137\b\23\1\2\u0137\u013d\3\2\2\2\u0138\u0139\b\23\1\2\u0139\u013a\5"+
		"&\24\2\u013a\u013b\b\23\1\2\u013b\u013d\3\2\2\2\u013c\u0132\3\2\2\2\u013c"+
		"\u0138\3\2\2\2\u013d%\3\2\2\2\u013e\u013f\5*\26\2\u013f\u0140\5(\25\2"+
		"\u0140\u0141\b\24\1\2\u0141\'\3\2\2\2\u0142\u0143\7\34\2\2\u0143\u0144"+
		"\b\25\1\2\u0144\u0145\5*\26\2\u0145\u0146\5(\25\2\u0146\u0147\b\25\1\2"+
		"\u0147\u014a\3\2\2\2\u0148\u014a\b\25\1\2\u0149\u0142\3\2\2\2\u0149\u0148"+
		"\3\2\2\2\u014a)\3\2\2\2\u014b\u014c\5.\30\2\u014c\u014d\5,\27\2\u014d"+
		"\u014e\b\26\1\2\u014e+\3\2\2\2\u014f\u0150\7\35\2\2\u0150\u0151\b\27\1"+
		"\2\u0151\u0152\5.\30\2\u0152\u0153\5,\27\2\u0153\u0154\b\27\1\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0157\b\27\1\2\u0156\u014f\3\2\2\2\u0156\u0155\3"+
		"\2\2\2\u0157-\3\2\2\2\u0158\u0159\5\62\32\2\u0159\u015a\5\60\31\2\u015a"+
		"\u015b\b\30\1\2\u015b/\3\2\2\2\u015c\u015d\t\3\2\2\u015d\u015e\b\31\1"+
		"\2\u015e\u015f\5\62\32\2\u015f\u0160\5\60\31\2\u0160\u0161\b\31\1\2\u0161"+
		"\u0164\3\2\2\2\u0162\u0164\b\31\1\2\u0163\u015c\3\2\2\2\u0163\u0162\3"+
		"\2\2\2\u0164\61\3\2\2\2\u0165\u0166\5\66\34\2\u0166\u0167\5\64\33\2\u0167"+
		"\u0168\b\32\1\2\u0168\63\3\2\2\2\u0169\u016a\t\4\2\2\u016a\u016b\b\33"+
		"\1\2\u016b\u016c\5\66\34\2\u016c\u016d\5\64\33\2\u016d\u016e\b\33\1\2"+
		"\u016e\u0171\3\2\2\2\u016f\u0171\b\33\1\2\u0170\u0169\3\2\2\2\u0170\u016f"+
		"\3\2\2\2\u0171\65\3\2\2\2\u0172\u0173\5:\36\2\u0173\u0174\58\35\2\u0174"+
		"\u0175\b\34\1\2\u0175\67\3\2\2\2\u0176\u0177\t\5\2\2\u0177\u0178\b\35"+
		"\1\2\u0178\u0179\5:\36\2\u0179\u017a\58\35\2\u017a\u017b\b\35\1\2\u017b"+
		"\u017e\3\2\2\2\u017c\u017e\b\35\1\2\u017d\u0176\3\2\2\2\u017d\u017c\3"+
		"\2\2\2\u017e9\3\2\2\2\u017f\u0180\5> \2\u0180\u0181\5<\37\2\u0181\u0182"+
		"\b\36\1\2\u0182;\3\2\2\2\u0183\u0184\t\6\2\2\u0184\u0185\b\37\1\2\u0185"+
		"\u0186\5> \2\u0186\u0187\5<\37\2\u0187\u0188\b\37\1\2\u0188\u018b\3\2"+
		"\2\2\u0189\u018b\b\37\1\2\u018a\u0183\3\2\2\2\u018a\u0189\3\2\2\2\u018b"+
		"=\3\2\2\2\u018c\u018d\t\7\2\2\u018d\u018e\b \1\2\u018e\u018f\5> \2\u018f"+
		"\u0190\b \1\2\u0190\u0195\3\2\2\2\u0191\u0192\5@!\2\u0192\u0193\b \1\2"+
		"\u0193\u0195\3\2\2\2\u0194\u018c\3\2\2\2\u0194\u0191\3\2\2\2\u0195?\3"+
		"\2\2\2\u0196\u0197\b!\1\2\u0197\u0198\5D#\2\u0198\u0199\5B\"\2\u0199\u019a"+
		"\b!\1\2\u019aA\3\2\2\2\u019b\u019c\7\f\2\2\u019c\u019d\b\"\1\2\u019d\u019e"+
		"\5\"\22\2\u019e\u019f\7\r\2\2\u019f\u01a0\b\"\1\2\u01a0\u01a1\5B\"\2\u01a1"+
		"\u01a2\b\"\1\2\u01a2\u01a5\3\2\2\2\u01a3\u01a5\b\"\1\2\u01a4\u019b\3\2"+
		"\2\2\u01a4\u01a3\3\2\2\2\u01a5C\3\2\2\2\u01a6\u01a7\7(\2\2\u01a7\u01c8"+
		"\b#\1\2\u01a8\u01a9\7)\2\2\u01a9\u01c8\b#\1\2\u01aa\u01ab\7*\2\2\u01ab"+
		"\u01c8\b#\1\2\u01ac\u01ad\7,\2\2\u01ad\u01c8\b#\1\2\u01ae\u01af\7%\2\2"+
		"\u01af\u01b0\5\"\22\2\u01b0\u01b7\b#\1\2\u01b1\u01b2\7\t\2\2\u01b2\u01b3"+
		"\5\"\22\2\u01b3\u01b4\b#\1\2\u01b4\u01b6\3\2\2\2\u01b5\u01b1\3\2\2\2\u01b6"+
		"\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2"+
		"\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bb\7&\2\2\u01bb\u01bc\b#\1\2\u01bc\u01c8"+
		"\3\2\2\2\u01bd\u01be\7\'\2\2\u01be\u01bf\7\b\2\2\u01bf\u01c0\7(\2\2\u01c0"+
		"\u01c1\7\n\2\2\u01c1\u01c8\b#\1\2\u01c2\u01c3\7\b\2\2\u01c3\u01c4\5\""+
		"\22\2\u01c4\u01c5\7\n\2\2\u01c5\u01c6\b#\1\2\u01c6\u01c8\3\2\2\2\u01c7"+
		"\u01a6\3\2\2\2\u01c7\u01a8\3\2\2\2\u01c7\u01aa\3\2\2\2\u01c7\u01ac\3\2"+
		"\2\2\u01c7\u01ae\3\2\2\2\u01c7\u01bd\3\2\2\2\u01c7\u01c2\3\2\2\2\u01c8"+
		"E\3\2\2\2\"IK[]sv\u0085\u0090\u0099\u009c\u00b5\u00be\u00d1\u00d3\u00e1"+
		"\u00eb\u00f6\u00fb\u0107\u0115\u0118\u013c\u0149\u0156\u0163\u0170\u017d"+
		"\u018a\u0194\u01a4\u01b7\u01c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}