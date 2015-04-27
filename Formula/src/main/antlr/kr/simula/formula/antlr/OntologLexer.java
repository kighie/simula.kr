// Generated from Ontolog.g4 by ANTLR 4.5
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
public class OntologLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, NUMBER=28, STRING_LITERAL=29, NULL=30, BOOLEAN=31, 
		IDENT=32, WS=33, MULTILINE_COMMENT=34, LINE_COMMENT=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "DIGIT", "LETTER", "NUMBER", "STRING_LITERAL", "NULL", 
		"BOOLEAN", "IDENT", "WS", "MULTILINE_COMMENT", "LINE_COMMENT", "EOL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'.'", "','", "'is'", "'!='", "'<>'", "'not'", 
		"'>'", "'>='", "'<'", "'<='", "'['", "']'", "':'", "'{'", "'}'", "'-'", 
		"'%'", "'^'", "'*'", "'/'", "'+'", "'&'", "'and'", "'or'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "NUMBER", "STRING_LITERAL", "NULL", "BOOLEAN", 
		"IDENT", "WS", "MULTILINE_COMMENT", "LINE_COMMENT"
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


	public OntologLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Ontolog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u0100\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\6\37\u0095\n\37\r\37\16\37\u0096\3\37\3\37\6\37\u009b\n\37"+
		"\r\37\16\37\u009c\5\37\u009f\n\37\3 \3 \7 \u00a3\n \f \16 \u00a6\13 \3"+
		" \3 \3 \7 \u00ab\n \f \16 \u00ae\13 \3 \5 \u00b1\n \3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\5!\u00be\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u00d2\n\"\3#\3#\3#\7#\u00d7\n#\f#\16"+
		"#\u00da\13#\3$\6$\u00dd\n$\r$\16$\u00de\3$\3$\3%\3%\3%\3%\7%\u00e7\n%"+
		"\f%\16%\u00ea\13%\3%\3%\3%\3%\3%\3&\3&\3&\3&\7&\u00f5\n&\f&\16&\u00f8"+
		"\13&\3&\3&\3\'\3\'\3\'\5\'\u00ff\n\'\3\u00e8\2(\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\2;\2=\36?\37A C!E\"G#I$K%M\2"+
		"\3\2\7\b\2&&C\\aac|\u3132\u3191\uac02\ud7b1\5\2\f\f\17\17$$\5\2\f\f\17"+
		"\17))\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u010d\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7"+
		"S\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2\rY\3\2\2\2\17\\\3\2\2\2\21_\3\2\2\2\23"+
		"b\3\2\2\2\25f\3\2\2\2\27h\3\2\2\2\31k\3\2\2\2\33m\3\2\2\2\35p\3\2\2\2"+
		"\37r\3\2\2\2!t\3\2\2\2#v\3\2\2\2%x\3\2\2\2\'z\3\2\2\2)|\3\2\2\2+~\3\2"+
		"\2\2-\u0080\3\2\2\2/\u0082\3\2\2\2\61\u0084\3\2\2\2\63\u0086\3\2\2\2\65"+
		"\u0088\3\2\2\2\67\u008c\3\2\2\29\u008f\3\2\2\2;\u0091\3\2\2\2=\u0094\3"+
		"\2\2\2?\u00b0\3\2\2\2A\u00bd\3\2\2\2C\u00d1\3\2\2\2E\u00d3\3\2\2\2G\u00dc"+
		"\3\2\2\2I\u00e2\3\2\2\2K\u00f0\3\2\2\2M\u00fe\3\2\2\2OP\7?\2\2P\4\3\2"+
		"\2\2QR\7*\2\2R\6\3\2\2\2ST\7+\2\2T\b\3\2\2\2UV\7\60\2\2V\n\3\2\2\2WX\7"+
		".\2\2X\f\3\2\2\2YZ\7k\2\2Z[\7u\2\2[\16\3\2\2\2\\]\7#\2\2]^\7?\2\2^\20"+
		"\3\2\2\2_`\7>\2\2`a\7@\2\2a\22\3\2\2\2bc\7p\2\2cd\7q\2\2de\7v\2\2e\24"+
		"\3\2\2\2fg\7@\2\2g\26\3\2\2\2hi\7@\2\2ij\7?\2\2j\30\3\2\2\2kl\7>\2\2l"+
		"\32\3\2\2\2mn\7>\2\2no\7?\2\2o\34\3\2\2\2pq\7]\2\2q\36\3\2\2\2rs\7_\2"+
		"\2s \3\2\2\2tu\7<\2\2u\"\3\2\2\2vw\7}\2\2w$\3\2\2\2xy\7\177\2\2y&\3\2"+
		"\2\2z{\7/\2\2{(\3\2\2\2|}\7\'\2\2}*\3\2\2\2~\177\7`\2\2\177,\3\2\2\2\u0080"+
		"\u0081\7,\2\2\u0081.\3\2\2\2\u0082\u0083\7\61\2\2\u0083\60\3\2\2\2\u0084"+
		"\u0085\7-\2\2\u0085\62\3\2\2\2\u0086\u0087\7(\2\2\u0087\64\3\2\2\2\u0088"+
		"\u0089\7c\2\2\u0089\u008a\7p\2\2\u008a\u008b\7f\2\2\u008b\66\3\2\2\2\u008c"+
		"\u008d\7q\2\2\u008d\u008e\7t\2\2\u008e8\3\2\2\2\u008f\u0090\4\62;\2\u0090"+
		":\3\2\2\2\u0091\u0092\t\2\2\2\u0092<\3\2\2\2\u0093\u0095\59\35\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u009e\3\2\2\2\u0098\u009a\7\60\2\2\u0099\u009b\59\35\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u009f\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		">\3\2\2\2\u00a0\u00a4\7$\2\2\u00a1\u00a3\n\3\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00b1\7$\2\2\u00a8\u00ac\7)\2\2\u00a9\u00ab"+
		"\n\4\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1\7)"+
		"\2\2\u00b0\u00a0\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b1@\3\2\2\2\u00b2\u00b3"+
		"\7p\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b5\7n\2\2\u00b5\u00be\7n\2\2\u00b6"+
		"\u00b7\7p\2\2\u00b7\u00b8\7k\2\2\u00b8\u00be\7n\2\2\u00b9\u00ba\7P\2\2"+
		"\u00ba\u00bb\7W\2\2\u00bb\u00bc\7N\2\2\u00bc\u00be\7N\2\2\u00bd\u00b2"+
		"\3\2\2\2\u00bd\u00b6\3\2\2\2\u00bd\u00b9\3\2\2\2\u00beB\3\2\2\2\u00bf"+
		"\u00c0\7v\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7w\2\2\u00c2\u00d2\7g\2\2"+
		"\u00c3\u00c4\7h\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7"+
		"\7u\2\2\u00c7\u00d2\7g\2\2\u00c8\u00c9\7V\2\2\u00c9\u00ca\7T\2\2\u00ca"+
		"\u00cb\7W\2\2\u00cb\u00d2\7G\2\2\u00cc\u00cd\7H\2\2\u00cd\u00ce\7C\2\2"+
		"\u00ce\u00cf\7N\2\2\u00cf\u00d0\7U\2\2\u00d0\u00d2\7G\2\2\u00d1\u00bf"+
		"\3\2\2\2\u00d1\u00c3\3\2\2\2\u00d1\u00c8\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d2"+
		"D\3\2\2\2\u00d3\u00d8\5;\36\2\u00d4\u00d7\5;\36\2\u00d5\u00d7\59\35\2"+
		"\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9F\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00dd\t\5\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\b$\2\2\u00e1"+
		"H\3\2\2\2\u00e2\u00e3\7\61\2\2\u00e3\u00e4\7,\2\2\u00e4\u00e8\3\2\2\2"+
		"\u00e5\u00e7\13\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\7,\2\2\u00ec\u00ed\7\61\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b%"+
		"\2\2\u00efJ\3\2\2\2\u00f0\u00f1\7\61\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f6"+
		"\3\2\2\2\u00f3\u00f5\n\6\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f9\u00fa\b&\2\2\u00faL\3\2\2\2\u00fb\u00fc\7\17\2\2\u00fc\u00ff"+
		"\7\f\2\2\u00fd\u00ff\t\6\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"N\3\2\2\2\21\2\u0096\u009c\u009e\u00a4\u00ac\u00b0\u00bd\u00d1\u00d6\u00d8"+
		"\u00de\u00e8\u00f6\u00fe\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}