// Generated from FormulaScript.g4 by ANTLR 4.5
package kr.simula.formula.antlr;



//	package kr.simula.formula.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FormulaScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, END_OF_STMT=37, NUMBER=38, 
		STRING_LITERAL=39, NULL=40, BOOLEAN=41, IDENT=42, WS=43, MULTILINE_COMMENT=44, 
		LINE_COMMENT=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "END_OF_STMT", "DIGIT", "LETTER", "NUMBER", 
		"STRING_LITERAL", "NULL", "BOOLEAN", "IDENT", "WS", "MULTILINE_COMMENT", 
		"LINE_COMMENT", "EOL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'importJava'", "'<-'", "'['", "']'", "'('", "')'", "'{'", "'}'", 
		"','", "'return'", "'if'", "'elseif'", "'else'", "'foreach'", "'in'", 
		"'->'", "'='", "'.'", "'is'", "'!='", "'<>'", "'not'", "'>'", "'>='", 
		"'<'", "'<='", "':'", "'-'", "'%'", "'^'", "'*'", "'/'", "'+'", "'&'", 
		"'and'", "'or'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "END_OF_STMT", "NUMBER", "STRING_LITERAL", "NULL", "BOOLEAN", "IDENT", 
		"WS", "MULTILINE_COMMENT", "LINE_COMMENT"
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


	public FormulaScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FormulaScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2/\u0148\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3)\6)\u00dd\n)\r)\16)\u00de\3)\3)\6)\u00e3\n)\r)\16)\u00e4\5"+
		")\u00e7\n)\3*\3*\7*\u00eb\n*\f*\16*\u00ee\13*\3*\3*\3*\7*\u00f3\n*\f*"+
		"\16*\u00f6\13*\3*\5*\u00f9\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0106"+
		"\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u011a\n,"+
		"\3-\3-\3-\7-\u011f\n-\f-\16-\u0122\13-\3.\6.\u0125\n.\r.\16.\u0126\3."+
		"\3.\3/\3/\3/\3/\7/\u012f\n/\f/\16/\u0132\13/\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\7\60\u013d\n\60\f\60\16\60\u0140\13\60\3\60\3\60\3\61\3\61"+
		"\3\61\5\61\u0147\n\61\3\u0130\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2O\2Q(S)U*W+Y"+
		",[-]._/a\2\3\2\7\b\2&&C\\aac|\u3132\u3191\uac02\ud7b1\5\2\f\f\17\17$$"+
		"\5\2\f\f\17\17))\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u0155\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3c\3\2\2\2\5n\3\2\2\2\7q\3\2\2\2\ts\3\2\2"+
		"\2\13u\3\2\2\2\rw\3\2\2\2\17y\3\2\2\2\21{\3\2\2\2\23}\3\2\2\2\25\177\3"+
		"\2\2\2\27\u0086\3\2\2\2\31\u0089\3\2\2\2\33\u0090\3\2\2\2\35\u0095\3\2"+
		"\2\2\37\u009d\3\2\2\2!\u00a0\3\2\2\2#\u00a3\3\2\2\2%\u00a5\3\2\2\2\'\u00a7"+
		"\3\2\2\2)\u00aa\3\2\2\2+\u00ad\3\2\2\2-\u00b0\3\2\2\2/\u00b4\3\2\2\2\61"+
		"\u00b6\3\2\2\2\63\u00b9\3\2\2\2\65\u00bb\3\2\2\2\67\u00be\3\2\2\29\u00c0"+
		"\3\2\2\2;\u00c2\3\2\2\2=\u00c4\3\2\2\2?\u00c6\3\2\2\2A\u00c8\3\2\2\2C"+
		"\u00ca\3\2\2\2E\u00cc\3\2\2\2G\u00ce\3\2\2\2I\u00d2\3\2\2\2K\u00d5\3\2"+
		"\2\2M\u00d7\3\2\2\2O\u00d9\3\2\2\2Q\u00dc\3\2\2\2S\u00f8\3\2\2\2U\u0105"+
		"\3\2\2\2W\u0119\3\2\2\2Y\u011b\3\2\2\2[\u0124\3\2\2\2]\u012a\3\2\2\2_"+
		"\u0138\3\2\2\2a\u0146\3\2\2\2cd\7k\2\2de\7o\2\2ef\7r\2\2fg\7q\2\2gh\7"+
		"t\2\2hi\7v\2\2ij\7L\2\2jk\7c\2\2kl\7x\2\2lm\7c\2\2m\4\3\2\2\2no\7>\2\2"+
		"op\7/\2\2p\6\3\2\2\2qr\7]\2\2r\b\3\2\2\2st\7_\2\2t\n\3\2\2\2uv\7*\2\2"+
		"v\f\3\2\2\2wx\7+\2\2x\16\3\2\2\2yz\7}\2\2z\20\3\2\2\2{|\7\177\2\2|\22"+
		"\3\2\2\2}~\7.\2\2~\24\3\2\2\2\177\u0080\7t\2\2\u0080\u0081\7g\2\2\u0081"+
		"\u0082\7v\2\2\u0082\u0083\7w\2\2\u0083\u0084\7t\2\2\u0084\u0085\7p\2\2"+
		"\u0085\26\3\2\2\2\u0086\u0087\7k\2\2\u0087\u0088\7h\2\2\u0088\30\3\2\2"+
		"\2\u0089\u008a\7g\2\2\u008a\u008b\7n\2\2\u008b\u008c\7u\2\2\u008c\u008d"+
		"\7g\2\2\u008d\u008e\7k\2\2\u008e\u008f\7h\2\2\u008f\32\3\2\2\2\u0090\u0091"+
		"\7g\2\2\u0091\u0092\7n\2\2\u0092\u0093\7u\2\2\u0093\u0094\7g\2\2\u0094"+
		"\34\3\2\2\2\u0095\u0096\7h\2\2\u0096\u0097\7q\2\2\u0097\u0098\7t\2\2\u0098"+
		"\u0099\7g\2\2\u0099\u009a\7c\2\2\u009a\u009b\7e\2\2\u009b\u009c\7j\2\2"+
		"\u009c\36\3\2\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f \3\2\2\2"+
		"\u00a0\u00a1\7/\2\2\u00a1\u00a2\7@\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7?"+
		"\2\2\u00a4$\3\2\2\2\u00a5\u00a6\7\60\2\2\u00a6&\3\2\2\2\u00a7\u00a8\7"+
		"k\2\2\u00a8\u00a9\7u\2\2\u00a9(\3\2\2\2\u00aa\u00ab\7#\2\2\u00ab\u00ac"+
		"\7?\2\2\u00ac*\3\2\2\2\u00ad\u00ae\7>\2\2\u00ae\u00af\7@\2\2\u00af,\3"+
		"\2\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		".\3\2\2\2\u00b4\u00b5\7@\2\2\u00b5\60\3\2\2\2\u00b6\u00b7\7@\2\2\u00b7"+
		"\u00b8\7?\2\2\u00b8\62\3\2\2\2\u00b9\u00ba\7>\2\2\u00ba\64\3\2\2\2\u00bb"+
		"\u00bc\7>\2\2\u00bc\u00bd\7?\2\2\u00bd\66\3\2\2\2\u00be\u00bf\7<\2\2\u00bf"+
		"8\3\2\2\2\u00c0\u00c1\7/\2\2\u00c1:\3\2\2\2\u00c2\u00c3\7\'\2\2\u00c3"+
		"<\3\2\2\2\u00c4\u00c5\7`\2\2\u00c5>\3\2\2\2\u00c6\u00c7\7,\2\2\u00c7@"+
		"\3\2\2\2\u00c8\u00c9\7\61\2\2\u00c9B\3\2\2\2\u00ca\u00cb\7-\2\2\u00cb"+
		"D\3\2\2\2\u00cc\u00cd\7(\2\2\u00cdF\3\2\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0"+
		"\7p\2\2\u00d0\u00d1\7f\2\2\u00d1H\3\2\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4"+
		"\7t\2\2\u00d4J\3\2\2\2\u00d5\u00d6\7=\2\2\u00d6L\3\2\2\2\u00d7\u00d8\4"+
		"\62;\2\u00d8N\3\2\2\2\u00d9\u00da\t\2\2\2\u00daP\3\2\2\2\u00db\u00dd\5"+
		"M\'\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e6\3\2\2\2\u00e0\u00e2\7\60\2\2\u00e1\u00e3\5"+
		"M\'\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7R\3\2\2\2\u00e8\u00ec\7$\2\2\u00e9\u00eb\n\3\2\2\u00ea\u00e9"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f9\7$\2\2\u00f0\u00f4\7)\2"+
		"\2\u00f1\u00f3\n\4\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7"+
		"\u00f9\7)\2\2\u00f8\u00e8\3\2\2\2\u00f8\u00f0\3\2\2\2\u00f9T\3\2\2\2\u00fa"+
		"\u00fb\7p\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7n\2\2\u00fd\u0106\7n\2\2"+
		"\u00fe\u00ff\7p\2\2\u00ff\u0100\7k\2\2\u0100\u0106\7n\2\2\u0101\u0102"+
		"\7P\2\2\u0102\u0103\7W\2\2\u0103\u0104\7N\2\2\u0104\u0106\7N\2\2\u0105"+
		"\u00fa\3\2\2\2\u0105\u00fe\3\2\2\2\u0105\u0101\3\2\2\2\u0106V\3\2\2\2"+
		"\u0107\u0108\7v\2\2\u0108\u0109\7t\2\2\u0109\u010a\7w\2\2\u010a\u011a"+
		"\7g\2\2\u010b\u010c\7h\2\2\u010c\u010d\7c\2\2\u010d\u010e\7n\2\2\u010e"+
		"\u010f\7u\2\2\u010f\u011a\7g\2\2\u0110\u0111\7V\2\2\u0111\u0112\7T\2\2"+
		"\u0112\u0113\7W\2\2\u0113\u011a\7G\2\2\u0114\u0115\7H\2\2\u0115\u0116"+
		"\7C\2\2\u0116\u0117\7N\2\2\u0117\u0118\7U\2\2\u0118\u011a\7G\2\2\u0119"+
		"\u0107\3\2\2\2\u0119\u010b\3\2\2\2\u0119\u0110\3\2\2\2\u0119\u0114\3\2"+
		"\2\2\u011aX\3\2\2\2\u011b\u0120\5O(\2\u011c\u011f\5O(\2\u011d\u011f\5"+
		"M\'\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121Z\3\2\2\2\u0122\u0120\3\2\2\2"+
		"\u0123\u0125\t\5\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b.\2\2\u0129"+
		"\\\3\2\2\2\u012a\u012b\7\61\2\2\u012b\u012c\7,\2\2\u012c\u0130\3\2\2\2"+
		"\u012d\u012f\13\2\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133"+
		"\u0134\7,\2\2\u0134\u0135\7\61\2\2\u0135\u0136\3\2\2\2\u0136\u0137\b/"+
		"\2\2\u0137^\3\2\2\2\u0138\u0139\7\61\2\2\u0139\u013a\7\61\2\2\u013a\u013e"+
		"\3\2\2\2\u013b\u013d\n\6\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0141\u0142\b\60\2\2\u0142`\3\2\2\2\u0143\u0144\7\17\2\2\u0144\u0147"+
		"\7\f\2\2\u0145\u0147\t\6\2\2\u0146\u0143\3\2\2\2\u0146\u0145\3\2\2\2\u0147"+
		"b\3\2\2\2\21\2\u00de\u00e4\u00e6\u00ec\u00f4\u00f8\u0105\u0119\u011e\u0120"+
		"\u0126\u0130\u013e\u0146\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}