// Generated from Formula.g4 by ANTLR 4.4
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
public class FormulaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__21=1, T__20=2, T__19=3, T__18=4, T__17=5, T__16=6, T__15=7, T__14=8, 
		T__13=9, T__12=10, T__11=11, T__10=12, T__9=13, T__8=14, T__7=15, T__6=16, 
		T__5=17, T__4=18, T__3=19, T__2=20, T__1=21, T__0=22, NUMBER=23, STRING_LITERAL=24, 
		NULL=25, BOOLEAN=26, IDENT=27, WS=28, MULTILINE_COMMENT=29, LINE_COMMENT=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'"
	};
	public static final String[] ruleNames = {
		"T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", 
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "DIGIT", "LETTER", "NUMBER", "STRING_LITERAL", 
		"NULL", "BOOLEAN", "IDENT", "WS", "MULTILINE_COMMENT", "LINE_COMMENT", 
		"EOL"
	};


	public FormulaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Formula.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00ec\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\6\32\u0081\n\32\r\32\16\32\u0082\3\32\3\32\6\32\u0087\n\32\r\32\16\32"+
		"\u0088\5\32\u008b\n\32\3\33\3\33\7\33\u008f\n\33\f\33\16\33\u0092\13\33"+
		"\3\33\3\33\3\33\7\33\u0097\n\33\f\33\16\33\u009a\13\33\3\33\5\33\u009d"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00aa"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u00be\n\35\3\36\3\36\3\36\7\36\u00c3\n"+
		"\36\f\36\16\36\u00c6\13\36\3\37\6\37\u00c9\n\37\r\37\16\37\u00ca\3\37"+
		"\3\37\3 \3 \3 \3 \7 \u00d3\n \f \16 \u00d6\13 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\7!\u00e1\n!\f!\16!\u00e4\13!\3!\3!\3\"\3\"\3\"\5\"\u00eb\n\"\3\u00d4"+
		"\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\31\65\32\67\339\34;"+
		"\35=\36?\37A C\2\3\2\7\b\2&&C\\aac|\u3132\u3191\uac02\ud7b1\5\2\f\f\17"+
		"\17$$\5\2\f\f\17\17))\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u00f9\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\3E\3\2\2\2\5G\3\2\2\2\7J\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\rQ\3\2\2"+
		"\2\17S\3\2\2\2\21U\3\2\2\2\23X\3\2\2\2\25[\3\2\2\2\27^\3\2\2\2\31`\3\2"+
		"\2\2\33b\3\2\2\2\35d\3\2\2\2\37g\3\2\2\2!i\3\2\2\2#m\3\2\2\2%o\3\2\2\2"+
		"\'q\3\2\2\2)u\3\2\2\2+w\3\2\2\2-y\3\2\2\2/{\3\2\2\2\61}\3\2\2\2\63\u0080"+
		"\3\2\2\2\65\u009c\3\2\2\2\67\u00a9\3\2\2\29\u00bd\3\2\2\2;\u00bf\3\2\2"+
		"\2=\u00c8\3\2\2\2?\u00ce\3\2\2\2A\u00dc\3\2\2\2C\u00ea\3\2\2\2EF\7\61"+
		"\2\2F\4\3\2\2\2GH\7#\2\2HI\7?\2\2I\6\3\2\2\2JK\7@\2\2KL\7?\2\2L\b\3\2"+
		"\2\2MN\7>\2\2N\n\3\2\2\2OP\7?\2\2P\f\3\2\2\2QR\7`\2\2R\16\3\2\2\2ST\7"+
		"@\2\2T\20\3\2\2\2UV\7q\2\2VW\7t\2\2W\22\3\2\2\2XY\7>\2\2YZ\7?\2\2Z\24"+
		"\3\2\2\2[\\\7>\2\2\\]\7@\2\2]\26\3\2\2\2^_\7\'\2\2_\30\3\2\2\2`a\7(\2"+
		"\2a\32\3\2\2\2bc\7*\2\2c\34\3\2\2\2de\7k\2\2ef\7u\2\2f\36\3\2\2\2gh\7"+
		"+\2\2h \3\2\2\2ij\7c\2\2jk\7p\2\2kl\7f\2\2l\"\3\2\2\2mn\7,\2\2n$\3\2\2"+
		"\2op\7-\2\2p&\3\2\2\2qr\7p\2\2rs\7q\2\2st\7v\2\2t(\3\2\2\2uv\7.\2\2v*"+
		"\3\2\2\2wx\7/\2\2x,\3\2\2\2yz\7\60\2\2z.\3\2\2\2{|\4\62;\2|\60\3\2\2\2"+
		"}~\t\2\2\2~\62\3\2\2\2\177\u0081\5/\30\2\u0080\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u008a\3\2\2\2\u0084"+
		"\u0086\7\60\2\2\u0085\u0087\5/\30\2\u0086\u0085\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0084\3\2\2\2\u008a\u008b\3\2\2\2\u008b\64\3\2\2\2\u008c\u0090\7$\2\2"+
		"\u008d\u008f\n\3\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u009d\7$\2\2\u0094\u0098\7)\2\2\u0095\u0097\n\4\2\2\u0096\u0095\3\2\2"+
		"\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\7)\2\2\u009c\u008c\3\2\2\2\u009c"+
		"\u0094\3\2\2\2\u009d\66\3\2\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7w\2\2"+
		"\u00a0\u00a1\7n\2\2\u00a1\u00aa\7n\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4"+
		"\7k\2\2\u00a4\u00aa\7n\2\2\u00a5\u00a6\7P\2\2\u00a6\u00a7\7W\2\2\u00a7"+
		"\u00a8\7N\2\2\u00a8\u00aa\7N\2\2\u00a9\u009e\3\2\2\2\u00a9\u00a2\3\2\2"+
		"\2\u00a9\u00a5\3\2\2\2\u00aa8\3\2\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7"+
		"t\2\2\u00ad\u00ae\7w\2\2\u00ae\u00be\7g\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1"+
		"\7c\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7u\2\2\u00b3\u00be\7g\2\2\u00b4"+
		"\u00b5\7V\2\2\u00b5\u00b6\7T\2\2\u00b6\u00b7\7W\2\2\u00b7\u00be\7G\2\2"+
		"\u00b8\u00b9\7H\2\2\u00b9\u00ba\7C\2\2\u00ba\u00bb\7N\2\2\u00bb\u00bc"+
		"\7U\2\2\u00bc\u00be\7G\2\2\u00bd\u00ab\3\2\2\2\u00bd\u00af\3\2\2\2\u00bd"+
		"\u00b4\3\2\2\2\u00bd\u00b8\3\2\2\2\u00be:\3\2\2\2\u00bf\u00c4\5\61\31"+
		"\2\u00c0\u00c3\5\61\31\2\u00c1\u00c3\5/\30\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5<\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\t\5\2\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\b\37\2\2\u00cd>\3\2\2\2\u00ce\u00cf\7\61\2"+
		"\2\u00cf\u00d0\7,\2\2\u00d0\u00d4\3\2\2\2\u00d1\u00d3\13\2\2\2\u00d2\u00d1"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7,\2\2\u00d8\u00d9\7\61"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\b \2\2\u00db@\3\2\2\2\u00dc\u00dd"+
		"\7\61\2\2\u00dd\u00de\7\61\2\2\u00de\u00e2\3\2\2\2\u00df\u00e1\n\6\2\2"+
		"\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\b!\2\2\u00e6"+
		"B\3\2\2\2\u00e7\u00e8\7\17\2\2\u00e8\u00eb\7\f\2\2\u00e9\u00eb\t\6\2\2"+
		"\u00ea\u00e7\3\2\2\2\u00ea\u00e9\3\2\2\2\u00ebD\3\2\2\2\21\2\u0082\u0088"+
		"\u008a\u0090\u0098\u009c\u00a9\u00bd\u00c2\u00c4\u00ca\u00d4\u00e2\u00ea"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}