// Generated from FormulaScript.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__41=1, T__40=2, T__39=3, T__38=4, T__37=5, T__36=6, T__35=7, T__34=8, 
		T__33=9, T__32=10, T__31=11, T__30=12, T__29=13, T__28=14, T__27=15, T__26=16, 
		T__25=17, T__24=18, T__23=19, T__22=20, T__21=21, T__20=22, T__19=23, 
		T__18=24, T__17=25, T__16=26, T__15=27, T__14=28, T__13=29, T__12=30, 
		T__11=31, T__10=32, T__9=33, T__8=34, T__7=35, T__6=36, T__5=37, T__4=38, 
		T__3=39, T__2=40, T__1=41, T__0=42, END_OF_STMT=43, NUMBER=44, STRING_LITERAL=45, 
		NULL=46, BOOLEAN=47, IDENT=48, WS=49, MULTILINE_COMMENT=50, LINE_COMMENT=51;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'", "'1'", 
		"'2'", "'3'"
	};
	public static final String[] ruleNames = {
		"T__41", "T__40", "T__39", "T__38", "T__37", "T__36", "T__35", "T__34", 
		"T__33", "T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", 
		"T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", 
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "END_OF_STMT", "DIGIT", "LETTER", "NUMBER", "STRING_LITERAL", 
		"NULL", "BOOLEAN", "IDENT", "WS", "MULTILINE_COMMENT", "LINE_COMMENT", 
		"WhiteSpace", "EOL"
	};


	public FormulaScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FormulaScript.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\65\u0177\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$"+
		"\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3(\3(\3)\3)\3"+
		"*\3*\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\6/\u010b\n/\r/\16/\u010c\3/\3/\6"+
		"/\u0111\n/\r/\16/\u0112\5/\u0115\n/\3\60\3\60\7\60\u0119\n\60\f\60\16"+
		"\60\u011c\13\60\3\60\3\60\3\60\7\60\u0121\n\60\f\60\16\60\u0124\13\60"+
		"\3\60\5\60\u0127\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\5\61\u0134\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0148\n\62\3\63\3\63\3\63"+
		"\7\63\u014d\n\63\f\63\16\63\u0150\13\63\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\7\65\u015a\n\65\f\65\16\65\u015d\13\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\7\66\u0168\n\66\f\66\16\66\u016b\13\66\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\38\38\38\58\u0176\n8\4\u015b\u0169\29\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[\2]._/a\60c\61e\62g\63i\64k\65m\2o\2\3\2"+
		"\7\b\2&&C\\aac|\u3132\u3191\uac02\ud7b1\5\2\f\f\17\17$$\5\2\f\f\17\17"+
		"))\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u0182\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\3q\3\2\2\2\5s\3\2\2\2\7v\3\2\2\2\t~\3\2\2\2\13\u0085\3\2\2"+
		"\2\r\u008c\3\2\2\2\17\u0097\3\2\2\2\21\u009a\3\2\2\2\23\u009c\3\2\2\2"+
		"\25\u009e\3\2\2\2\27\u00a0\3\2\2\2\31\u00a2\3\2\2\2\33\u00a5\3\2\2\2\35"+
		"\u00ab\3\2\2\2\37\u00ae\3\2\2\2!\u00b0\3\2\2\2#\u00b2\3\2\2\2%\u00bb\3"+
		"\2\2\2\'\u00be\3\2\2\2)\u00c0\3\2\2\2+\u00c3\3\2\2\2-\u00c5\3\2\2\2/\u00c7"+
		"\3\2\2\2\61\u00ca\3\2\2\2\63\u00cd\3\2\2\2\65\u00cf\3\2\2\2\67\u00d2\3"+
		"\2\2\29\u00d4\3\2\2\2;\u00d6\3\2\2\2=\u00d8\3\2\2\2?\u00da\3\2\2\2A\u00dd"+
		"\3\2\2\2C\u00e0\3\2\2\2E\u00e2\3\2\2\2G\u00e5\3\2\2\2I\u00ea\3\2\2\2K"+
		"\u00f2\3\2\2\2M\u00f5\3\2\2\2O\u00f7\3\2\2\2Q\u00fb\3\2\2\2S\u00fd\3\2"+
		"\2\2U\u0101\3\2\2\2W\u0103\3\2\2\2Y\u0105\3\2\2\2[\u0107\3\2\2\2]\u010a"+
		"\3\2\2\2_\u0126\3\2\2\2a\u0133\3\2\2\2c\u0147\3\2\2\2e\u0149\3\2\2\2g"+
		"\u0151\3\2\2\2i\u0155\3\2\2\2k\u0163\3\2\2\2m\u0170\3\2\2\2o\u0175\3\2"+
		"\2\2qr\7\61\2\2r\4\3\2\2\2st\7c\2\2tu\7u\2\2u\6\3\2\2\2vw\7h\2\2wx\7q"+
		"\2\2xy\7t\2\2yz\7g\2\2z{\7c\2\2{|\7e\2\2|}\7j\2\2}\b\3\2\2\2~\177\7g\2"+
		"\2\177\u0080\7n\2\2\u0080\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082\u0083"+
		"\7k\2\2\u0083\u0084\7h\2\2\u0084\n\3\2\2\2\u0085\u0086\7t\2\2\u0086\u0087"+
		"\7g\2\2\u0087\u0088\7v\2\2\u0088\u0089\7w\2\2\u0089\u008a\7t\2\2\u008a"+
		"\u008b\7p\2\2\u008b\f\3\2\2\2\u008c\u008d\7k\2\2\u008d\u008e\7o\2\2\u008e"+
		"\u008f\7r\2\2\u008f\u0090\7q\2\2\u0090\u0091\7t\2\2\u0091\u0092\7v\2\2"+
		"\u0092\u0093\7L\2\2\u0093\u0094\7c\2\2\u0094\u0095\7x\2\2\u0095\u0096"+
		"\7c\2\2\u0096\16\3\2\2\2\u0097\u0098\7#\2\2\u0098\u0099\7?\2\2\u0099\20"+
		"\3\2\2\2\u009a\u009b\7}\2\2\u009b\22\3\2\2\2\u009c\u009d\7?\2\2\u009d"+
		"\24\3\2\2\2\u009e\u009f\7\177\2\2\u009f\26\3\2\2\2\u00a0\u00a1\7`\2\2"+
		"\u00a1\30\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7h\2\2\u00a4\32\3\2\2"+
		"\2\u00a5\u00a6\7h\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7f\2\2\u00a8\u00a9"+
		"\7g\2\2\u00a9\u00aa\7h\2\2\u00aa\34\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac\u00ad"+
		"\7?\2\2\u00ad\36\3\2\2\2\u00ae\u00af\7(\2\2\u00af \3\2\2\2\u00b0\u00b1"+
		"\7*\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7r\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5"+
		"\7t\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7f\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9\u00ba\7h\2\2\u00ba$\3\2\2\2\u00bb\u00bc\7k\2\2\u00bc"+
		"\u00bd\7u\2\2\u00bd&\3\2\2\2\u00be\u00bf\7,\2\2\u00bf(\3\2\2\2\u00c0\u00c1"+
		"\7t\2\2\u00c1\u00c2\7}\2\2\u00c2*\3\2\2\2\u00c3\u00c4\7.\2\2\u00c4,\3"+
		"\2\2\2\u00c5\u00c6\7\60\2\2\u00c6.\3\2\2\2\u00c7\u00c8\7/\2\2\u00c8\u00c9"+
		"\7@\2\2\u00c9\60\3\2\2\2\u00ca\u00cb\7>\2\2\u00cb\u00cc\7/\2\2\u00cc\62"+
		"\3\2\2\2\u00cd\u00ce\7<\2\2\u00ce\64\3\2\2\2\u00cf\u00d0\7@\2\2\u00d0"+
		"\u00d1\7?\2\2\u00d1\66\3\2\2\2\u00d2\u00d3\7]\2\2\u00d38\3\2\2\2\u00d4"+
		"\u00d5\7>\2\2\u00d5:\3\2\2\2\u00d6\u00d7\7_\2\2\u00d7<\3\2\2\2\u00d8\u00d9"+
		"\7@\2\2\u00d9>\3\2\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7t\2\2\u00dc@\3"+
		"\2\2\2\u00dd\u00de\7>\2\2\u00de\u00df\7@\2\2\u00dfB\3\2\2\2\u00e0\u00e1"+
		"\7\'\2\2\u00e1D\3\2\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7p\2\2\u00e4F\3"+
		"\2\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7u\2\2\u00e8"+
		"\u00e9\7g\2\2\u00e9H\3\2\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7{\2\2\u00ec"+
		"\u00ed\7r\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7g\2\2"+
		"\u00f0\u00f1\7h\2\2\u00f1J\3\2\2\2\u00f2\u00f3\7T\2\2\u00f3\u00f4\7}\2"+
		"\2\u00f4L\3\2\2\2\u00f5\u00f6\7+\2\2\u00f6N\3\2\2\2\u00f7\u00f8\7c\2\2"+
		"\u00f8\u00f9\7p\2\2\u00f9\u00fa\7f\2\2\u00faP\3\2\2\2\u00fb\u00fc\7-\2"+
		"\2\u00fcR\3\2\2\2\u00fd\u00fe\7p\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7"+
		"v\2\2\u0100T\3\2\2\2\u0101\u0102\7/\2\2\u0102V\3\2\2\2\u0103\u0104\7="+
		"\2\2\u0104X\3\2\2\2\u0105\u0106\4\62;\2\u0106Z\3\2\2\2\u0107\u0108\t\2"+
		"\2\2\u0108\\\3\2\2\2\u0109\u010b\5Y-\2\u010a\u0109\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0114\3\2\2\2\u010e"+
		"\u0110\7\60\2\2\u010f\u0111\5Y-\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114"+
		"\u010e\3\2\2\2\u0114\u0115\3\2\2\2\u0115^\3\2\2\2\u0116\u011a\7$\2\2\u0117"+
		"\u0119\n\3\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u0127\7$\2\2\u011e\u0122\7)\2\2\u011f\u0121\n\4\2\2\u0120\u011f\3\2\2"+
		"\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0127\7)\2\2\u0126\u0116\3\2\2\2\u0126"+
		"\u011e\3\2\2\2\u0127`\3\2\2\2\u0128\u0129\7p\2\2\u0129\u012a\7w\2\2\u012a"+
		"\u012b\7n\2\2\u012b\u0134\7n\2\2\u012c\u012d\7p\2\2\u012d\u012e\7k\2\2"+
		"\u012e\u0134\7n\2\2\u012f\u0130\7P\2\2\u0130\u0131\7W\2\2\u0131\u0132"+
		"\7N\2\2\u0132\u0134\7N\2\2\u0133\u0128\3\2\2\2\u0133\u012c\3\2\2\2\u0133"+
		"\u012f\3\2\2\2\u0134b\3\2\2\2\u0135\u0136\7v\2\2\u0136\u0137\7t\2\2\u0137"+
		"\u0138\7w\2\2\u0138\u0148\7g\2\2\u0139\u013a\7h\2\2\u013a\u013b\7c\2\2"+
		"\u013b\u013c\7n\2\2\u013c\u013d\7u\2\2\u013d\u0148\7g\2\2\u013e\u013f"+
		"\7V\2\2\u013f\u0140\7T\2\2\u0140\u0141\7W\2\2\u0141\u0148\7G\2\2\u0142"+
		"\u0143\7H\2\2\u0143\u0144\7C\2\2\u0144\u0145\7N\2\2\u0145\u0146\7U\2\2"+
		"\u0146\u0148\7G\2\2\u0147\u0135\3\2\2\2\u0147\u0139\3\2\2\2\u0147\u013e"+
		"\3\2\2\2\u0147\u0142\3\2\2\2\u0148d\3\2\2\2\u0149\u014e\5[.\2\u014a\u014d"+
		"\5[.\2\u014b\u014d\5Y-\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d"+
		"\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014ff\3\2\2\2"+
		"\u0150\u014e\3\2\2\2\u0151\u0152\5m\67\2\u0152\u0153\3\2\2\2\u0153\u0154"+
		"\b\64\2\2\u0154h\3\2\2\2\u0155\u0156\7\61\2\2\u0156\u0157\7,\2\2\u0157"+
		"\u015b\3\2\2\2\u0158\u015a\13\2\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3"+
		"\2\2\2\u015b\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015e\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u015f\7,\2\2\u015f\u0160\7\61\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0162\b\65\2\2\u0162j\3\2\2\2\u0163\u0164\7\61\2\2\u0164\u0165"+
		"\7\61\2\2\u0165\u0169\3\2\2\2\u0166\u0168\13\2\2\2\u0167\u0166\3\2\2\2"+
		"\u0168\u016b\3\2\2\2\u0169\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016c"+
		"\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\5o8\2\u016d\u016e\3\2\2\2\u016e"+
		"\u016f\b\66\2\2\u016fl\3\2\2\2\u0170\u0171\t\5\2\2\u0171n\3\2\2\2\u0172"+
		"\u0173\7\17\2\2\u0173\u0176\7\f\2\2\u0174\u0176\t\6\2\2\u0175\u0172\3"+
		"\2\2\2\u0175\u0174\3\2\2\2\u0176p\3\2\2\2\20\2\u010c\u0112\u0114\u011a"+
		"\u0122\u0126\u0133\u0147\u014c\u014e\u015b\u0169\u0175\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}