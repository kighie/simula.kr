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
		BOOLEAN=25, IDENT=26, WS=27, COMMENT=28, MULTILINE_COMMENT=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'"
	};
	public static final String[] ruleNames = {
		"T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", 
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "DIGIT", "LETTER", "NUMBER", "STRING_LITERAL", 
		"BOOLEAN", "IDENT", "WS", "COMMENT", "MULTILINE_COMMENT", "EOL"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00df\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\6"+
		"\32\177\n\32\r\32\16\32\u0080\3\32\3\32\6\32\u0085\n\32\r\32\16\32\u0086"+
		"\5\32\u0089\n\32\3\33\3\33\7\33\u008d\n\33\f\33\16\33\u0090\13\33\3\33"+
		"\3\33\3\33\7\33\u0095\n\33\f\33\16\33\u0098\13\33\3\33\5\33\u009b\n\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u00af\n\34\3\35\3\35\3\35\7\35\u00b4\n\35\f"+
		"\35\16\35\u00b7\13\35\3\36\6\36\u00ba\n\36\r\36\16\36\u00bb\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\7\37\u00c4\n\37\f\37\16\37\u00c7\13\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \7 \u00d1\n \f \16 \u00d4\13 \3 \3 \3 \3 \3 \3!"+
		"\3!\3!\5!\u00de\n!\2\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63"+
		"\31\65\32\67\339\34;\35=\36?\37A\2\3\2\7\b\2&&C\\aac|\u3132\u3191\uac02"+
		"\ud7b1\5\2\f\f\17\17$$\5\2\f\f\17\17))\5\2\13\f\16\17\"\"\4\2\f\f\17\17"+
		"\u00ea\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7H\3\2\2\2\tK\3\2\2\2\13M\3\2\2\2\r"+
		"O\3\2\2\2\17Q\3\2\2\2\21S\3\2\2\2\23V\3\2\2\2\25Y\3\2\2\2\27\\\3\2\2\2"+
		"\31^\3\2\2\2\33`\3\2\2\2\35b\3\2\2\2\37e\3\2\2\2!g\3\2\2\2#k\3\2\2\2%"+
		"m\3\2\2\2\'o\3\2\2\2)s\3\2\2\2+u\3\2\2\2-w\3\2\2\2/y\3\2\2\2\61{\3\2\2"+
		"\2\63~\3\2\2\2\65\u009a\3\2\2\2\67\u00ae\3\2\2\29\u00b0\3\2\2\2;\u00b9"+
		"\3\2\2\2=\u00bf\3\2\2\2?\u00cc\3\2\2\2A\u00dd\3\2\2\2CD\7\61\2\2D\4\3"+
		"\2\2\2EF\7#\2\2FG\7?\2\2G\6\3\2\2\2HI\7@\2\2IJ\7?\2\2J\b\3\2\2\2KL\7>"+
		"\2\2L\n\3\2\2\2MN\7?\2\2N\f\3\2\2\2OP\7@\2\2P\16\3\2\2\2QR\7`\2\2R\20"+
		"\3\2\2\2ST\7q\2\2TU\7t\2\2U\22\3\2\2\2VW\7>\2\2WX\7?\2\2X\24\3\2\2\2Y"+
		"Z\7>\2\2Z[\7@\2\2[\26\3\2\2\2\\]\7\'\2\2]\30\3\2\2\2^_\7(\2\2_\32\3\2"+
		"\2\2`a\7*\2\2a\34\3\2\2\2bc\7k\2\2cd\7u\2\2d\36\3\2\2\2ef\7+\2\2f \3\2"+
		"\2\2gh\7c\2\2hi\7p\2\2ij\7f\2\2j\"\3\2\2\2kl\7,\2\2l$\3\2\2\2mn\7-\2\2"+
		"n&\3\2\2\2op\7p\2\2pq\7q\2\2qr\7v\2\2r(\3\2\2\2st\7.\2\2t*\3\2\2\2uv\7"+
		"/\2\2v,\3\2\2\2wx\7\60\2\2x.\3\2\2\2yz\4\62;\2z\60\3\2\2\2{|\t\2\2\2|"+
		"\62\3\2\2\2}\177\5/\30\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0088\3\2\2\2\u0082\u0084\7\60\2\2\u0083\u0085\5"+
		"/\30\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\64\3\2\2\2\u008a\u008e\7$\2\2\u008b\u008d\n\3\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u009b\7$\2\2\u0092\u0096\7)\2"+
		"\2\u0093\u0095\n\4\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009b\7)\2\2\u009a\u008a\3\2\2\2\u009a\u0092\3\2\2\2\u009b\66\3\2\2\2"+
		"\u009c\u009d\7v\2\2\u009d\u009e\7t\2\2\u009e\u009f\7w\2\2\u009f\u00af"+
		"\7g\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7n\2\2\u00a3"+
		"\u00a4\7u\2\2\u00a4\u00af\7g\2\2\u00a5\u00a6\7V\2\2\u00a6\u00a7\7T\2\2"+
		"\u00a7\u00a8\7W\2\2\u00a8\u00af\7G\2\2\u00a9\u00aa\7H\2\2\u00aa\u00ab"+
		"\7C\2\2\u00ab\u00ac\7N\2\2\u00ac\u00ad\7U\2\2\u00ad\u00af\7G\2\2\u00ae"+
		"\u009c\3\2\2\2\u00ae\u00a0\3\2\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00a9\3\2"+
		"\2\2\u00af8\3\2\2\2\u00b0\u00b5\5\61\31\2\u00b1\u00b4\5\61\31\2\u00b2"+
		"\u00b4\5/\30\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6:\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b8\u00ba\t\5\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\36"+
		"\2\2\u00be<\3\2\2\2\u00bf\u00c0\7\61\2\2\u00c0\u00c1\7\61\2\2\u00c1\u00c5"+
		"\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\u00c9\5A!\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\37\2\2\u00cb"+
		">\3\2\2\2\u00cc\u00cd\7\61\2\2\u00cd\u00ce\7,\2\2\u00ce\u00d2\3\2\2\2"+
		"\u00cf\u00d1\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d6\7,\2\2\u00d6\u00d7\7\61\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\b "+
		"\2\2\u00d9@\3\2\2\2\u00da\u00db\7\17\2\2\u00db\u00de\7\f\2\2\u00dc\u00de"+
		"\t\6\2\2\u00dd\u00da\3\2\2\2\u00dd\u00dc\3\2\2\2\u00deB\3\2\2\2\20\2\u0080"+
		"\u0086\u0088\u008e\u0096\u009a\u00ae\u00b3\u00b5\u00bb\u00c5\u00d2\u00dd"+
		"\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}