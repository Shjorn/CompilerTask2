// Generated from hw.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class hwLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ID=14, BITSTRING=15, WHITESPACE=16, 
		COMMENT=17, COMMENT2=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "ID", "BITSTRING", "ALPHA", "NUM", 
			"WHITESPACE", "COMMENT", "COMMENT2"
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


	public hwLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "hw.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0012\u00a3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0005\rt\b\r\n\r\f\rw\t\r\u0001\u000e\u0004\u000ez"+
		"\b\u000e\u000b\u000e\f\u000e{\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0004\u0011\u0083\b\u0011\u000b\u0011\f\u0011\u0084"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u008d\b\u0012\n\u0012\f\u0012\u0090\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u009a\b\u0013\n\u0013\f\u0013\u009d\t\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0000!\u0000#\u0010%\u0011\'\u0012\u0001\u0000\u0007\u0001"+
		"\u000001\u0007\u0000AZ__az\u00c5\u00c6\u00d8\u00d8\u00e5\u00e6\u00f8\u00f8"+
		"\u0001\u000009\u0003\u0000\t\n\r\r  \u0001\u0000\n\n\u0001\u0000**\u0001"+
		"\u0000//\u00a7\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001"+
		"\u0000\u0000\u0000\u00033\u0001\u0000\u0000\u0000\u0005;\u0001\u0000\u0000"+
		"\u0000\u0007D\u0001\u0000\u0000\u0000\tM\u0001\u0000\u0000\u0000\u000b"+
		"U\u0001\u0000\u0000\u0000\r_\u0001\u0000\u0000\u0000\u000fb\u0001\u0000"+
		"\u0000\u0000\u0011d\u0001\u0000\u0000\u0000\u0013f\u0001\u0000\u0000\u0000"+
		"\u0015i\u0001\u0000\u0000\u0000\u0017l\u0001\u0000\u0000\u0000\u0019n"+
		"\u0001\u0000\u0000\u0000\u001bp\u0001\u0000\u0000\u0000\u001dy\u0001\u0000"+
		"\u0000\u0000\u001f}\u0001\u0000\u0000\u0000!\u007f\u0001\u0000\u0000\u0000"+
		"#\u0082\u0001\u0000\u0000\u0000%\u0088\u0001\u0000\u0000\u0000\'\u0093"+
		"\u0001\u0000\u0000\u0000)*\u0005.\u0000\u0000*+\u0005h\u0000\u0000+,\u0005"+
		"a\u0000\u0000,-\u0005r\u0000\u0000-.\u0005d\u0000\u0000./\u0005w\u0000"+
		"\u0000/0\u0005a\u0000\u000001\u0005r\u0000\u000012\u0005e\u0000\u0000"+
		"2\u0002\u0001\u0000\u0000\u000034\u0005.\u0000\u000045\u0005i\u0000\u0000"+
		"56\u0005n\u0000\u000067\u0005p\u0000\u000078\u0005u\u0000\u000089\u0005"+
		"t\u0000\u00009:\u0005s\u0000\u0000:\u0004\u0001\u0000\u0000\u0000;<\u0005"+
		".\u0000\u0000<=\u0005o\u0000\u0000=>\u0005u\u0000\u0000>?\u0005t\u0000"+
		"\u0000?@\u0005p\u0000\u0000@A\u0005u\u0000\u0000AB\u0005t\u0000\u0000"+
		"BC\u0005s\u0000\u0000C\u0006\u0001\u0000\u0000\u0000DE\u0005.\u0000\u0000"+
		"EF\u0005l\u0000\u0000FG\u0005a\u0000\u0000GH\u0005t\u0000\u0000HI\u0005"+
		"c\u0000\u0000IJ\u0005h\u0000\u0000JK\u0005e\u0000\u0000KL\u0005s\u0000"+
		"\u0000L\b\u0001\u0000\u0000\u0000MN\u0005.\u0000\u0000NO\u0005u\u0000"+
		"\u0000OP\u0005p\u0000\u0000PQ\u0005d\u0000\u0000QR\u0005a\u0000\u0000"+
		"RS\u0005t\u0000\u0000ST\u0005e\u0000\u0000T\n\u0001\u0000\u0000\u0000"+
		"UV\u0005.\u0000\u0000VW\u0005s\u0000\u0000WX\u0005i\u0000\u0000XY\u0005"+
		"m\u0000\u0000YZ\u0005u\u0000\u0000Z[\u0005l\u0000\u0000[\\\u0005a\u0000"+
		"\u0000\\]\u0005t\u0000\u0000]^\u0005e\u0000\u0000^\f\u0001\u0000\u0000"+
		"\u0000_`\u0005-\u0000\u0000`a\u0005>\u0000\u0000a\u000e\u0001\u0000\u0000"+
		"\u0000bc\u0005=\u0000\u0000c\u0010\u0001\u0000\u0000\u0000de\u0005!\u0000"+
		"\u0000e\u0012\u0001\u0000\u0000\u0000fg\u0005&\u0000\u0000gh\u0005&\u0000"+
		"\u0000h\u0014\u0001\u0000\u0000\u0000ij\u0005|\u0000\u0000jk\u0005|\u0000"+
		"\u0000k\u0016\u0001\u0000\u0000\u0000lm\u0005(\u0000\u0000m\u0018\u0001"+
		"\u0000\u0000\u0000no\u0005)\u0000\u0000o\u001a\u0001\u0000\u0000\u0000"+
		"pu\u0003\u001f\u000f\u0000qt\u0003\u001f\u000f\u0000rt\u0003!\u0010\u0000"+
		"sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\u001c\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xz\u0007\u0000\u0000\u0000"+
		"yx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|\u001e\u0001\u0000\u0000\u0000}~\u0007"+
		"\u0001\u0000\u0000~ \u0001\u0000\u0000\u0000\u007f\u0080\u0007\u0002\u0000"+
		"\u0000\u0080\"\u0001\u0000\u0000\u0000\u0081\u0083\u0007\u0003\u0000\u0000"+
		"\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0006\u0011\u0000\u0000"+
		"\u0087$\u0001\u0000\u0000\u0000\u0088\u0089\u0005/\u0000\u0000\u0089\u008a"+
		"\u0005/\u0000\u0000\u008a\u008e\u0001\u0000\u0000\u0000\u008b\u008d\b"+
		"\u0004\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0006\u0012\u0000\u0000\u0092&\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0005/\u0000\u0000\u0094\u0095\u0005*\u0000\u0000"+
		"\u0095\u009b\u0001\u0000\u0000\u0000\u0096\u009a\b\u0005\u0000\u0000\u0097"+
		"\u0098\u0005*\u0000\u0000\u0098\u009a\b\u0006\u0000\u0000\u0099\u0096"+
		"\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009d"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0005*\u0000\u0000\u009f\u00a0\u0005"+
		"/\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0006\u0013"+
		"\u0000\u0000\u00a2(\u0001\u0000\u0000\u0000\b\u0000su{\u0084\u008e\u0099"+
		"\u009b\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}