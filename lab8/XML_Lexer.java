// Generated from XML_Lexer.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XML_Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EMAIL=1, DATE=2, PHONE=3, CREDITCARD=4, OTHER=5, WS=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BEGINELEMENT", "OKCHAR", "LOCAL_SUBPART", "DOMAIN_SUBPART", "LOCAL", 
		"DOMAIN", "EMAIL", "SLASH", "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", 
		"SIX", "SEVEN", "EIGHT", "NINE", "ZEROtoTWO", "ZEROtoFIVE", "ONEtoTWO", 
		"ONEtoFIVE", "DIGIT", "DIGITgreaterthanZERO", "DAY", "MONTH", "YEAR", 
		"DATE", "PARENTHESISopen", "PARENTHESISclose", "HYPHEN", "DOT", "SPACE", 
		"DIGIT3", "DIGIT4", "PHONE", "VISA", "VISAOLD", "MASTERCARD", "AMERICANEXP", 
		"DINER", "DISCOVER", "JCB", "CREDITCARD", "OTHERS", "OTHER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EMAIL", "DATE", "PHONE", "CREDITCARD", "OTHER", "WS"
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


	public XML_Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XML_Lexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6:
			EMAIL_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			DATE_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			PHONE_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			CREDITCARD_action((RuleContext)_localctx, actionIndex);
			break;
		case 45:
			OTHER_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void EMAIL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			System.out.println("valid email: "+getText());

			break;
		}
	}
	private void DATE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			System.out.println("valid date: "+getText());

			break;
		}
	}
	private void PHONE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			  System.out.println("valid phone: "+getText());
			  
			break;
		}
	}
	private void CREDITCARD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

			    System.out.println("valid credit card: "+getText());
			  
			break;
		}
	}
	private void OTHER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

			    System.out.println("valid other: "+getText());
			  
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\b\u01ec\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\6\3e\n\3\r\3\16\3f\3\4\6"+
		"\4j\n\4\r\4\16\4k\3\5\6\5o\n\5\r\5\16\5p\3\6\3\6\3\6\7\6v\n\6\f\6\16\6"+
		"y\13\6\3\7\3\7\3\7\7\7~\n\7\f\7\16\7\u0081\13\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u00c9\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00d8\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u00e4\n\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0131\n%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3("+
		"\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u015e\n)\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0173\n*\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0185\n+\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u019f\n,"+
		"\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01b5"+
		"\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\6.\u01c9\n."+
		"\r.\16.\u01ca\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3\60\6\60\u01e7\n\60\r\60\16\60\u01e8\3\60\3\60\2"+
		"\2\61\3\2\5\2\7\2\t\2\13\2\r\2\17\3\21\2\23\2\25\2\27\2\31\2\33\2\35\2"+
		"\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\4;\2=\2?\2A\2C\2E"+
		"\2G\2I\5K\2M\2O\2Q\2S\2U\2W\2Y\6[\2]\7_\b\3\2\30\7\2CY[\\aacy{|\7\2/\60"+
		"\62;C\\aac|\13\2##&&(/\62=??C\\aac|\u0080\u0080\6\2//\62;C\\c|\3\2\62"+
		"\62\3\2\63\63\3\2\64\64\3\2\65\65\3\2\66\66\3\2\67\67\3\288\3\299\3\2"+
		"::\3\2;;\3\2\62\64\3\2\62\67\3\2\63\64\3\2\63\67\3\2\62;\3\2\63;\13\2"+
		"\"#&&(\60\62=??C\\aac|\u0080\u0080\5\2\13\f\17\17\"\"\u01e1\2\17\3\2\2"+
		"\2\29\3\2\2\2\2I\3\2\2\2\2Y\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5"+
		"d\3\2\2\2\7i\3\2\2\2\tn\3\2\2\2\13r\3\2\2\2\rz\3\2\2\2\17\u0082\3\2\2"+
		"\2\21\u0099\3\2\2\2\23\u009b\3\2\2\2\25\u009d\3\2\2\2\27\u009f\3\2\2\2"+
		"\31\u00a1\3\2\2\2\33\u00a3\3\2\2\2\35\u00a5\3\2\2\2\37\u00a7\3\2\2\2!"+
		"\u00a9\3\2\2\2#\u00ab\3\2\2\2%\u00ad\3\2\2\2\'\u00af\3\2\2\2)\u00b1\3"+
		"\2\2\2+\u00b3\3\2\2\2-\u00b5\3\2\2\2/\u00b7\3\2\2\2\61\u00b9\3\2\2\2\63"+
		"\u00c8\3\2\2\2\65\u00d7\3\2\2\2\67\u00e3\3\2\2\29\u00e5\3\2\2\2;\u00fc"+
		"\3\2\2\2=\u00fe\3\2\2\2?\u0100\3\2\2\2A\u0102\3\2\2\2C\u0104\3\2\2\2E"+
		"\u0106\3\2\2\2G\u010a\3\2\2\2I\u010f\3\2\2\2K\u013e\3\2\2\2M\u0144\3\2"+
		"\2\2O\u0149\3\2\2\2Q\u015d\3\2\2\2S\u0172\3\2\2\2U\u0184\3\2\2\2W\u019e"+
		"\3\2\2\2Y\u01a0\3\2\2\2[\u01c8\3\2\2\2]\u01cc\3\2\2\2_\u01e6\3\2\2\2a"+
		"b\t\2\2\2b\4\3\2\2\2ce\t\3\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2"+
		"g\6\3\2\2\2hj\t\4\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\b\3\2\2"+
		"\2mo\t\5\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\n\3\2\2\2rw\5\7"+
		"\4\2st\7\60\2\2tv\5\7\4\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\f\3"+
		"\2\2\2yw\3\2\2\2z\177\5\t\5\2{|\7\60\2\2|~\5\t\5\2}{\3\2\2\2~\u0081\3"+
		"\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\16\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0082\u0083\7>\2\2\u0083\u0084\7g\2\2\u0084\u0085\7o\2\2\u0085\u0086"+
		"\7c\2\2\u0086\u0087\7k\2\2\u0087\u0088\7n\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\7@\2\2\u008a\u008b\5\13\6\2\u008b\u008c\7B\2\2\u008c\u008d\5\r"+
		"\7\2\u008d\u008e\7>\2\2\u008e\u008f\7\61\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\7g\2\2\u0091\u0092\7o\2\2\u0092\u0093\7c\2\2\u0093\u0094\7k\2\2"+
		"\u0094\u0095\7n\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7@\2\2\u0097\u0098"+
		"\b\b\2\2\u0098\20\3\2\2\2\u0099\u009a\7\61\2\2\u009a\22\3\2\2\2\u009b"+
		"\u009c\t\6\2\2\u009c\24\3\2\2\2\u009d\u009e\t\7\2\2\u009e\26\3\2\2\2\u009f"+
		"\u00a0\t\b\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\t\t\2\2\u00a2\32\3\2\2\2\u00a3"+
		"\u00a4\t\n\2\2\u00a4\34\3\2\2\2\u00a5\u00a6\t\13\2\2\u00a6\36\3\2\2\2"+
		"\u00a7\u00a8\t\f\2\2\u00a8 \3\2\2\2\u00a9\u00aa\t\r\2\2\u00aa\"\3\2\2"+
		"\2\u00ab\u00ac\t\16\2\2\u00ac$\3\2\2\2\u00ad\u00ae\t\17\2\2\u00ae&\3\2"+
		"\2\2\u00af\u00b0\t\20\2\2\u00b0(\3\2\2\2\u00b1\u00b2\t\21\2\2\u00b2*\3"+
		"\2\2\2\u00b3\u00b4\t\22\2\2\u00b4,\3\2\2\2\u00b5\u00b6\t\23\2\2\u00b6"+
		".\3\2\2\2\u00b7\u00b8\t\24\2\2\u00b8\60\3\2\2\2\u00b9\u00ba\t\25\2\2\u00ba"+
		"\62\3\2\2\2\u00bb\u00bc\5\23\n\2\u00bc\u00bd\5\61\31\2\u00bd\u00c9\3\2"+
		"\2\2\u00be\u00c9\5\61\31\2\u00bf\u00c0\5+\26\2\u00c0\u00c1\5/\30\2\u00c1"+
		"\u00c9\3\2\2\2\u00c2\u00c3\5\31\r\2\u00c3\u00c4\5\23\n\2\u00c4\u00c9\3"+
		"\2\2\2\u00c5\u00c6\5\31\r\2\u00c6\u00c7\5\25\13\2\u00c7\u00c9\3\2\2\2"+
		"\u00c8\u00bb\3\2\2\2\u00c8\u00be\3\2\2\2\u00c8\u00bf\3\2\2\2\u00c8\u00c2"+
		"\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9\64\3\2\2\2\u00ca\u00cb\5\23\n\2\u00cb"+
		"\u00cc\5\61\31\2\u00cc\u00d8\3\2\2\2\u00cd\u00d8\5\61\31\2\u00ce\u00cf"+
		"\5\25\13\2\u00cf\u00d0\5\23\n\2\u00d0\u00d8\3\2\2\2\u00d1\u00d2\5\25\13"+
		"\2\u00d2\u00d3\5\25\13\2\u00d3\u00d8\3\2\2\2\u00d4\u00d5\5\25\13\2\u00d5"+
		"\u00d6\5\27\f\2\u00d6\u00d8\3\2\2\2\u00d7\u00ca\3\2\2\2\u00d7\u00cd\3"+
		"\2\2\2\u00d7\u00ce\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d8"+
		"\66\3\2\2\2\u00d9\u00da\5\27\f\2\u00da\u00db\5\23\n\2\u00db\u00dc\5/\30"+
		"\2\u00dc\u00dd\5/\30\2\u00dd\u00e4\3\2\2\2\u00de\u00df\5\27\f\2\u00df"+
		"\u00e0\5\25\13\2\u00e0\u00e1\5\23\n\2\u00e1\u00e2\5\23\n\2\u00e2\u00e4"+
		"\3\2\2\2\u00e3\u00d9\3\2\2\2\u00e3\u00de\3\2\2\2\u00e48\3\2\2\2\u00e5"+
		"\u00e6\7>\2\2\u00e6\u00e7\7f\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7v\2\2"+
		"\u00e9\u00ea\7g\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7@\2\2\u00ec\u00ed"+
		"\5\63\32\2\u00ed\u00ee\5\21\t\2\u00ee\u00ef\5\65\33\2\u00ef\u00f0\5\21"+
		"\t\2\u00f0\u00f1\5\67\34\2\u00f1\u00f2\7>\2\2\u00f2\u00f3\7\61\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f5\7f\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7v\2"+
		"\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7@\2\2\u00fa\u00fb"+
		"\b\35\3\2\u00fb:\3\2\2\2\u00fc\u00fd\7*\2\2\u00fd<\3\2\2\2\u00fe\u00ff"+
		"\7+\2\2\u00ff>\3\2\2\2\u0100\u0101\7/\2\2\u0101@\3\2\2\2\u0102\u0103\7"+
		"\60\2\2\u0103B\3\2\2\2\u0104\u0105\7\"\2\2\u0105D\3\2\2\2\u0106\u0107"+
		"\5/\30\2\u0107\u0108\5/\30\2\u0108\u0109\5/\30\2\u0109F\3\2\2\2\u010a"+
		"\u010b\5/\30\2\u010b\u010c\5/\30\2\u010c\u010d\5/\30\2\u010d\u010e\5/"+
		"\30\2\u010eH\3\2\2\2\u010f\u0110\7>\2\2\u0110\u0111\7r\2\2\u0111\u0112"+
		"\7j\2\2\u0112\u0113\7q\2\2\u0113\u0114\7p\2\2\u0114\u0115\7g\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0130\7@\2\2\u0117\u0118\5E#\2\u0118\u0119\5? \2"+
		"\u0119\u011a\5E#\2\u011a\u011b\5? \2\u011b\u011c\5G$\2\u011c\u0131\3\2"+
		"\2\2\u011d\u011e\5E#\2\u011e\u011f\5A!\2\u011f\u0120\5E#\2\u0120\u0121"+
		"\5A!\2\u0121\u0122\5G$\2\u0122\u0131\3\2\2\2\u0123\u0124\5E#\2\u0124\u0125"+
		"\5C\"\2\u0125\u0126\5E#\2\u0126\u0127\5C\"\2\u0127\u0128\5G$\2\u0128\u0131"+
		"\3\2\2\2\u0129\u012a\5;\36\2\u012a\u012b\5E#\2\u012b\u012c\5=\37\2\u012c"+
		"\u012d\5E#\2\u012d\u012e\5? \2\u012e\u012f\5G$\2\u012f\u0131\3\2\2\2\u0130"+
		"\u0117\3\2\2\2\u0130\u011d\3\2\2\2\u0130\u0123\3\2\2\2\u0130\u0129\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7>\2\2\u0133\u0134\7\61\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\7r\2\2\u0136\u0137\7j\2\2\u0137\u0138\7q\2"+
		"\2\u0138\u0139\7p\2\2\u0139\u013a\7g\2\2\u013a\u013b\3\2\2\2\u013b\u013c"+
		"\7@\2\2\u013c\u013d\b%\4\2\u013dJ\3\2\2\2\u013e\u013f\5\33\16\2\u013f"+
		"\u0140\5E#\2\u0140\u0141\5G$\2\u0141\u0142\5G$\2\u0142\u0143\5G$\2\u0143"+
		"L\3\2\2\2\u0144\u0145\5\33\16\2\u0145\u0146\5G$\2\u0146\u0147\5G$\2\u0147"+
		"\u0148\5G$\2\u0148N\3\2\2\2\u0149\u014a\5\35\17\2\u014a\u014b\5E#\2\u014b"+
		"\u014c\5G$\2\u014c\u014d\5G$\2\u014d\u014e\5G$\2\u014eP\3\2\2\2\u014f"+
		"\u0150\5\31\r\2\u0150\u0151\5\33\16\2\u0151\u0152\5/\30\2\u0152\u0153"+
		"\5G$\2\u0153\u0154\5G$\2\u0154\u0155\5G$\2\u0155\u015e\3\2\2\2\u0156\u0157"+
		"\5\31\r\2\u0157\u0158\5!\21\2\u0158\u0159\5/\30\2\u0159\u015a\5G$\2\u015a"+
		"\u015b\5G$\2\u015b\u015c\5G$\2\u015c\u015e\3\2\2\2\u015d\u014f\3\2\2\2"+
		"\u015d\u0156\3\2\2\2\u015eR\3\2\2\2\u015f\u0160\5\31\r\2\u0160\u0161\5"+
		"\23\n\2\u0161\u0162\5)\25\2\u0162\u0163\5E#\2\u0163\u0164\5G$\2\u0164"+
		"\u0165\5G$\2\u0165\u0173\3\2\2\2\u0166\u0167\5\31\r\2\u0167\u0168\5\37"+
		"\20\2\u0168\u0169\5G$\2\u0169\u016a\5G$\2\u016a\u016b\5G$\2\u016b\u0173"+
		"\3\2\2\2\u016c\u016d\5\31\r\2\u016d\u016e\5#\22\2\u016e\u016f\5G$\2\u016f"+
		"\u0170\5G$\2\u0170\u0171\5G$\2\u0171\u0173\3\2\2\2\u0172\u015f\3\2\2\2"+
		"\u0172\u0166\3\2\2\2\u0172\u016c\3\2\2\2\u0173T\3\2\2\2\u0174\u0175\5"+
		"\37\20\2\u0175\u0176\5\25\13\2\u0176\u0177\5\23\n\2\u0177\u0178\5\23\n"+
		"\2\u0178\u0179\5G$\2\u0179\u017a\5G$\2\u017a\u017b\5G$\2\u017b\u0185\3"+
		"\2\2\2\u017c\u017d\5\37\20\2\u017d\u017e\5\35\17\2\u017e\u017f\5/\30\2"+
		"\u017f\u0180\5/\30\2\u0180\u0181\5G$\2\u0181\u0182\5G$\2\u0182\u0183\5"+
		"G$\2\u0183\u0185\3\2\2\2\u0184\u0174\3\2\2\2\u0184\u017c\3\2\2\2\u0185"+
		"V\3\2\2\2\u0186\u0187\5\27\f\2\u0187\u0188\5\25\13\2\u0188\u0189\5\31"+
		"\r\2\u0189\u018a\5\25\13\2\u018a\u018b\5G$\2\u018b\u018c\5G$\2\u018c\u018d"+
		"\5G$\2\u018d\u019f\3\2\2\2\u018e\u018f\5\25\13\2\u018f\u0190\5#\22\2\u0190"+
		"\u0191\5\23\n\2\u0191\u0192\5\23\n\2\u0192\u0193\5G$\2\u0193\u0194\5G"+
		"$\2\u0194\u0195\5G$\2\u0195\u019f\3\2\2\2\u0196\u0197\5\31\r\2\u0197\u0198"+
		"\5\35\17\2\u0198\u0199\5/\30\2\u0199\u019a\5/\30\2\u019a\u019b\5G$\2\u019b"+
		"\u019c\5G$\2\u019c\u019d\5G$\2\u019d\u019f\3\2\2\2\u019e\u0186\3\2\2\2"+
		"\u019e\u018e\3\2\2\2\u019e\u0196\3\2\2\2\u019fX\3\2\2\2\u01a0\u01a1\7"+
		">\2\2\u01a1\u01a2\7e\2\2\u01a2\u01a3\7t\2\2\u01a3\u01a4\7g\2\2\u01a4\u01a5"+
		"\7f\2\2\u01a5\u01a6\7k\2\2\u01a6\u01a7\7v\2\2\u01a7\u01a8\7e\2\2\u01a8"+
		"\u01a9\7c\2\2\u01a9\u01aa\7t\2\2\u01aa\u01ab\7f\2\2\u01ab\u01ac\3\2\2"+
		"\2\u01ac\u01b4\7@\2\2\u01ad\u01b5\5K&\2\u01ae\u01b5\5M\'\2\u01af\u01b5"+
		"\5O(\2\u01b0\u01b5\5Q)\2\u01b1\u01b5\5S*\2\u01b2\u01b5\5U+\2\u01b3\u01b5"+
		"\5W,\2\u01b4\u01ad\3\2\2\2\u01b4\u01ae\3\2\2\2\u01b4\u01af\3\2\2\2\u01b4"+
		"\u01b0\3\2\2\2\u01b4\u01b1\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2"+
		"\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\7>\2\2\u01b7\u01b8\7\61\2\2\u01b8"+
		"\u01b9\3\2\2\2\u01b9\u01ba\7e\2\2\u01ba\u01bb\7t\2\2\u01bb\u01bc\7g\2"+
		"\2\u01bc\u01bd\7f\2\2\u01bd\u01be\7k\2\2\u01be\u01bf\7v\2\2\u01bf\u01c0"+
		"\7e\2\2\u01c0\u01c1\7c\2\2\u01c1\u01c2\7t\2\2\u01c2\u01c3\7f\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c5\7@\2\2\u01c5\u01c6\b-\5\2\u01c6Z\3\2\2\2\u01c7"+
		"\u01c9\t\26\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01c8\3"+
		"\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\\\3\2\2\2\u01cc\u01cd\7>\2\2\u01cd\u01ce"+
		"\7c\2\2\u01ce\u01cf\7f\2\2\u01cf\u01d0\7f\2\2\u01d0\u01d1\7t\2\2\u01d1"+
		"\u01d2\7g\2\2\u01d2\u01d3\7u\2\2\u01d3\u01d4\7u\2\2\u01d4\u01d5\3\2\2"+
		"\2\u01d5\u01d6\7@\2\2\u01d6\u01d7\5[.\2\u01d7\u01d8\7>\2\2\u01d8\u01d9"+
		"\7\61\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\7c\2\2\u01db\u01dc\7f\2\2\u01dc"+
		"\u01dd\7f\2\2\u01dd\u01de\7t\2\2\u01de\u01df\7g\2\2\u01df\u01e0\7u\2\2"+
		"\u01e0\u01e1\7u\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\7@\2\2\u01e3\u01e4"+
		"\b/\6\2\u01e4^\3\2\2\2\u01e5\u01e7\t\27\2\2\u01e6\u01e5\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01ea\u01eb\b\60\7\2\u01eb`\3\2\2\2\23\2fkpw\177\u00c8\u00d7\u00e3"+
		"\u0130\u015d\u0172\u0184\u019e\u01b4\u01ca\u01e8\b\3\b\2\3\35\3\3%\4\3"+
		"-\5\3/\6\3\60\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}