// Generated from hw.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class hwParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, BITSTRING=15, WHITESPACE=16, 
		COMMENT=17, COMMENT2=18;
	public static final int
		RULE_start = 0, RULE_latchdecl = 1, RULE_updatedecl = 2, RULE_simInp = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "latchdecl", "updatedecl", "simInp", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.hardware'", "'.inputs'", "'.outputs'", "'.latches'", "'.update'", 
			"'.simulate'", "'->'", "'='", "'!'", "'&&'", "'||'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "BITSTRING", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "hw.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public hwParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public Token name;
		public Token ID;
		public List<Token> ins = new ArrayList<Token>();
		public List<Token> outs = new ArrayList<Token>();
		public LatchdeclContext latchdecl;
		public List<LatchdeclContext> ls = new ArrayList<LatchdeclContext>();
		public UpdatedeclContext updatedecl;
		public List<UpdatedeclContext> up = new ArrayList<UpdatedeclContext>();
		public SimInpContext simInp;
		public List<SimInpContext> simin = new ArrayList<SimInpContext>();
		public TerminalNode EOF() { return getToken(hwParser.EOF, 0); }
		public List<TerminalNode> ID() { return getTokens(hwParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(hwParser.ID, i);
		}
		public List<LatchdeclContext> latchdecl() {
			return getRuleContexts(LatchdeclContext.class);
		}
		public LatchdeclContext latchdecl(int i) {
			return getRuleContext(LatchdeclContext.class,i);
		}
		public List<UpdatedeclContext> updatedecl() {
			return getRuleContexts(UpdatedeclContext.class);
		}
		public UpdatedeclContext updatedecl(int i) {
			return getRuleContext(UpdatedeclContext.class,i);
		}
		public List<SimInpContext> simInp() {
			return getRuleContexts(SimInpContext.class);
		}
		public SimInpContext simInp(int i) {
			return getRuleContext(SimInpContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hwListener ) ((hwListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hwListener ) ((hwListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hwVisitor ) return ((hwVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__0);
			setState(11);
			((StartContext)_localctx).name = match(ID);
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(12);
				match(T__1);
				setState(14); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(13);
					((StartContext)_localctx).ID = match(ID);
					((StartContext)_localctx).ins.add(((StartContext)_localctx).ID);
					}
					}
					setState(16); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(20);
				match(T__2);
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(21);
					((StartContext)_localctx).ID = match(ID);
					((StartContext)_localctx).outs.add(((StartContext)_localctx).ID);
					}
					}
					setState(24); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
			}

			setState(28);
			match(T__3);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(29);
				((StartContext)_localctx).latchdecl = latchdecl();
				((StartContext)_localctx).ls.add(((StartContext)_localctx).latchdecl);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(T__4);
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				((StartContext)_localctx).updatedecl = updatedecl();
				((StartContext)_localctx).up.add(((StartContext)_localctx).updatedecl);
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(41);
			match(T__5);
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				((StartContext)_localctx).simInp = simInp();
				((StartContext)_localctx).simin.add(((StartContext)_localctx).simInp);
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(47);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LatchdeclContext extends ParserRuleContext {
		public Token in;
		public Token out;
		public List<TerminalNode> ID() { return getTokens(hwParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(hwParser.ID, i);
		}
		public LatchdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latchdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hwListener ) ((hwListener)listener).enterLatchdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hwListener ) ((hwListener)listener).exitLatchdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hwVisitor ) return ((hwVisitor<? extends T>)visitor).visitLatchdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchdeclContext latchdecl() throws RecognitionException {
		LatchdeclContext _localctx = new LatchdeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_latchdecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			((LatchdeclContext)_localctx).in = match(ID);
			setState(50);
			match(T__6);
			setState(51);
			((LatchdeclContext)_localctx).out = match(ID);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UpdatedeclContext extends ParserRuleContext {
		public Token write;
		public ExprContext e;
		public TerminalNode ID() { return getToken(hwParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UpdatedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updatedecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hwListener ) ((hwListener)listener).enterUpdatedecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hwListener ) ((hwListener)listener).exitUpdatedecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hwVisitor ) return ((hwVisitor<? extends T>)visitor).visitUpdatedecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdatedeclContext updatedecl() throws RecognitionException {
		UpdatedeclContext _localctx = new UpdatedeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_updatedecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			((UpdatedeclContext)_localctx).write = match(ID);
			setState(54);
			match(T__7);
			setState(55);
			((UpdatedeclContext)_localctx).e = expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimInpContext extends ParserRuleContext {
		public Token in;
		public Token str;
		public TerminalNode ID() { return getToken(hwParser.ID, 0); }
		public TerminalNode BITSTRING() { return getToken(hwParser.BITSTRING, 0); }
		public SimInpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simInp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hwListener ) ((hwListener)listener).enterSimInp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hwListener ) ((hwListener)listener).exitSimInp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hwVisitor ) return ((hwVisitor<? extends T>)visitor).visitSimInp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimInpContext simInp() throws RecognitionException {
		SimInpContext _localctx = new SimInpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simInp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			((SimInpContext)_localctx).in = match(ID);
			setState(58);
			match(T__7);
			setState(59);
			((SimInpContext)_localctx).str = match(BITSTRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SignalContext extends ExprContext {
		public Token x;
		public TerminalNode ID() { return getToken(hwParser.ID, 0); }
		public SignalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hwListener ) ((hwListener)listener).enterSignal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hwListener ) ((hwListener)listener).exitSignal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hwVisitor ) return ((hwVisitor<? extends T>)visitor).visitSignal(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hwListener ) ((hwListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hwListener ) ((hwListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hwVisitor ) return ((hwVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DisjunctionContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DisjunctionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hwListener ) ((hwListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hwListener ) ((hwListener)listener).exitDisjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hwVisitor ) return ((hwVisitor<? extends T>)visitor).visitDisjunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegationContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hwListener ) ((hwListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hwListener ) ((hwListener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hwVisitor ) return ((hwVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConjunctionContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ConjunctionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof hwListener ) ((hwListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof hwListener ) ((hwListener)listener).exitConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof hwVisitor ) return ((hwVisitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(62);
				match(T__8);
				setState(63);
				((NegationContext)_localctx).e = expr(5);
				}
				break;
			case ID:
				{
				_localctx = new SignalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				((SignalContext)_localctx).x = match(ID);
				}
				break;
			case T__11:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(T__11);
				setState(66);
				((ParenthesisContext)_localctx).e = expr(0);
				setState(67);
				match(T__12);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(77);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ConjunctionContext(new ExprContext(_parentctx, _parentState));
						((ConjunctionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(71);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(72);
						match(T__9);
						setState(73);
						((ConjunctionContext)_localctx).e2 = expr(5);
						}
						break;
					case 2:
						{
						_localctx = new DisjunctionContext(new ExprContext(_parentctx, _parentState));
						((DisjunctionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(74);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(75);
						match(T__10);
						setState(76);
						((DisjunctionContext)_localctx).e2 = expr(4);
						}
						break;
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012S\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u000f\b\u0000\u000b"+
		"\u0000\f\u0000\u0010\u0003\u0000\u0013\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0004\u0000\u0017\b\u0000\u000b\u0000\f\u0000\u0018\u0003\u0000\u001b"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001f\b\u0000\n\u0000\f\u0000"+
		"\"\t\u0000\u0001\u0000\u0001\u0000\u0004\u0000&\b\u0000\u000b\u0000\f"+
		"\u0000\'\u0001\u0000\u0001\u0000\u0004\u0000,\b\u0000\u000b\u0000\f\u0000"+
		"-\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004F\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004N\b\u0004\n\u0004\f\u0004Q\t\u0004\u0001\u0004\u0000\u0001"+
		"\b\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000X\u0000\n\u0001\u0000\u0000"+
		"\u0000\u00021\u0001\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u0006"+
		"9\u0001\u0000\u0000\u0000\bE\u0001\u0000\u0000\u0000\n\u000b\u0005\u0001"+
		"\u0000\u0000\u000b\u0012\u0005\u000e\u0000\u0000\f\u000e\u0005\u0002\u0000"+
		"\u0000\r\u000f\u0005\u000e\u0000\u0000\u000e\r\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u000e\u0001\u0000\u0000\u0000"+
		"\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0013\u0001\u0000\u0000\u0000"+
		"\u0012\f\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013"+
		"\u001a\u0001\u0000\u0000\u0000\u0014\u0016\u0005\u0003\u0000\u0000\u0015"+
		"\u0017\u0005\u000e\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0001\u0000\u0000\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a"+
		"\u0014\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0001\u0000\u0000\u0000\u001c \u0005\u0004\u0000\u0000\u001d\u001f"+
		"\u0003\u0002\u0001\u0000\u001e\u001d\u0001\u0000\u0000\u0000\u001f\"\u0001"+
		"\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000"+
		"\u0000!#\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#%\u0005\u0005"+
		"\u0000\u0000$&\u0003\u0004\u0002\u0000%$\u0001\u0000\u0000\u0000&\'\u0001"+
		"\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"()\u0001\u0000\u0000\u0000)+\u0005\u0006\u0000\u0000*,\u0003\u0006\u0003"+
		"\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0005"+
		"\u0000\u0000\u00010\u0001\u0001\u0000\u0000\u000012\u0005\u000e\u0000"+
		"\u000023\u0005\u0007\u0000\u000034\u0005\u000e\u0000\u00004\u0003\u0001"+
		"\u0000\u0000\u000056\u0005\u000e\u0000\u000067\u0005\b\u0000\u000078\u0003"+
		"\b\u0004\u00008\u0005\u0001\u0000\u0000\u00009:\u0005\u000e\u0000\u0000"+
		":;\u0005\b\u0000\u0000;<\u0005\u000f\u0000\u0000<\u0007\u0001\u0000\u0000"+
		"\u0000=>\u0006\u0004\uffff\uffff\u0000>?\u0005\t\u0000\u0000?F\u0003\b"+
		"\u0004\u0005@F\u0005\u000e\u0000\u0000AB\u0005\f\u0000\u0000BC\u0003\b"+
		"\u0004\u0000CD\u0005\r\u0000\u0000DF\u0001\u0000\u0000\u0000E=\u0001\u0000"+
		"\u0000\u0000E@\u0001\u0000\u0000\u0000EA\u0001\u0000\u0000\u0000FO\u0001"+
		"\u0000\u0000\u0000GH\n\u0004\u0000\u0000HI\u0005\n\u0000\u0000IN\u0003"+
		"\b\u0004\u0005JK\n\u0003\u0000\u0000KL\u0005\u000b\u0000\u0000LN\u0003"+
		"\b\u0004\u0004MG\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000NQ\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"P\t\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000\n\u0010\u0012\u0018"+
		"\u001a \'-EMO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}