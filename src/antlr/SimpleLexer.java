// Generated from unse\milenguaje\Simple.g4 by ANTLR 4.5.1
package unse.milenguaje;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, START=3, END=4, DEFINT=5, DEFREAL=6, DEFCHAR=7, IF=8, 
		ENDIF=9, WHILE=10, ENDWHILE=11, SUM=12, REST=13, MULT=14, HIGH=15, LESS=16, 
		HEQL=17, LEQL=18, UNEQL=19, AND=20, OR=21, EQUAL=22, NEGT=23, ASSIG=24, 
		DOUPOINT=25, DDPOINT=26, SEMICOLON=27, OPENBRACKET=28, CLOSEDBRACKET=29, 
		OPENKEY=30, CLOSEKEY=31, NUM=32, CHAR=33, VAR=34, SW=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "START", "END", "DEFINT", "DEFREAL", "DEFCHAR", "IF", 
		"ENDIF", "WHILE", "ENDWHILE", "SUM", "REST", "MULT", "HIGH", "LESS", "HEQL", 
		"LEQL", "UNEQL", "AND", "OR", "EQUAL", "NEGT", "ASSIG", "DOUPOINT", "DDPOINT", 
		"SEMICOLON", "OPENBRACKET", "CLOSEDBRACKET", "OPENKEY", "CLOSEKEY", "NUM", 
		"CHAR", "VAR", "SW"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'hello'", "'world'", "'start'", "'end'", "'int'", "'real'", "'char'", 
		"'if'", "'endif'", "'while'", "'endwhile'", "'+'", "'-'", "'*'", "'>'", 
		"'<'", "'>='", "'<='", "'!='", "'&&'", "'||'", "'=='", "'¬'", "'<<'", 
		"':'", "'::'", "';'", "'('", "')'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "START", "END", "DEFINT", "DEFREAL", "DEFCHAR", "IF", 
		"ENDIF", "WHILE", "ENDWHILE", "SUM", "REST", "MULT", "HIGH", "LESS", "HEQL", 
		"LEQL", "UNEQL", "AND", "OR", "EQUAL", "NEGT", "ASSIG", "DOUPOINT", "DDPOINT", 
		"SEMICOLON", "OPENBRACKET", "CLOSEDBRACKET", "OPENKEY", "CLOSEKEY", "NUM", 
		"CHAR", "VAR", "SW"
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


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00d6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\5!\u00b7\n!\3!\6!\u00ba\n!\r!\16!\u00bb\3!\3!\6!\u00c0"+
		"\n!\r!\16!\u00c1\5!\u00c4\n!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\6$\u00d1"+
		"\n$\r$\16$\u00d2\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\5\3\2\62;\5\2C\\aac|\5\2\13"+
		"\f\17\17\"\"\u00da\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5O\3\2\2\2\7U\3\2\2\2\t[\3\2\2\2\13_\3"+
		"\2\2\2\rc\3\2\2\2\17h\3\2\2\2\21m\3\2\2\2\23p\3\2\2\2\25v\3\2\2\2\27|"+
		"\3\2\2\2\31\u0085\3\2\2\2\33\u0087\3\2\2\2\35\u0089\3\2\2\2\37\u008b\3"+
		"\2\2\2!\u008d\3\2\2\2#\u008f\3\2\2\2%\u0092\3\2\2\2\'\u0095\3\2\2\2)\u0098"+
		"\3\2\2\2+\u009b\3\2\2\2-\u009e\3\2\2\2/\u00a1\3\2\2\2\61\u00a3\3\2\2\2"+
		"\63\u00a6\3\2\2\2\65\u00a8\3\2\2\2\67\u00ab\3\2\2\29\u00ad\3\2\2\2;\u00af"+
		"\3\2\2\2=\u00b1\3\2\2\2?\u00b3\3\2\2\2A\u00b6\3\2\2\2C\u00c5\3\2\2\2E"+
		"\u00c7\3\2\2\2G\u00d0\3\2\2\2IJ\7j\2\2JK\7g\2\2KL\7n\2\2LM\7n\2\2MN\7"+
		"q\2\2N\4\3\2\2\2OP\7y\2\2PQ\7q\2\2QR\7t\2\2RS\7n\2\2ST\7f\2\2T\6\3\2\2"+
		"\2UV\7u\2\2VW\7v\2\2WX\7c\2\2XY\7t\2\2YZ\7v\2\2Z\b\3\2\2\2[\\\7g\2\2\\"+
		"]\7p\2\2]^\7f\2\2^\n\3\2\2\2_`\7k\2\2`a\7p\2\2ab\7v\2\2b\f\3\2\2\2cd\7"+
		"t\2\2de\7g\2\2ef\7c\2\2fg\7n\2\2g\16\3\2\2\2hi\7e\2\2ij\7j\2\2jk\7c\2"+
		"\2kl\7t\2\2l\20\3\2\2\2mn\7k\2\2no\7h\2\2o\22\3\2\2\2pq\7g\2\2qr\7p\2"+
		"\2rs\7f\2\2st\7k\2\2tu\7h\2\2u\24\3\2\2\2vw\7y\2\2wx\7j\2\2xy\7k\2\2y"+
		"z\7n\2\2z{\7g\2\2{\26\3\2\2\2|}\7g\2\2}~\7p\2\2~\177\7f\2\2\177\u0080"+
		"\7y\2\2\u0080\u0081\7j\2\2\u0081\u0082\7k\2\2\u0082\u0083\7n\2\2\u0083"+
		"\u0084\7g\2\2\u0084\30\3\2\2\2\u0085\u0086\7-\2\2\u0086\32\3\2\2\2\u0087"+
		"\u0088\7/\2\2\u0088\34\3\2\2\2\u0089\u008a\7,\2\2\u008a\36\3\2\2\2\u008b"+
		"\u008c\7@\2\2\u008c \3\2\2\2\u008d\u008e\7>\2\2\u008e\"\3\2\2\2\u008f"+
		"\u0090\7@\2\2\u0090\u0091\7?\2\2\u0091$\3\2\2\2\u0092\u0093\7>\2\2\u0093"+
		"\u0094\7?\2\2\u0094&\3\2\2\2\u0095\u0096\7#\2\2\u0096\u0097\7?\2\2\u0097"+
		"(\3\2\2\2\u0098\u0099\7(\2\2\u0099\u009a\7(\2\2\u009a*\3\2\2\2\u009b\u009c"+
		"\7~\2\2\u009c\u009d\7~\2\2\u009d,\3\2\2\2\u009e\u009f\7?\2\2\u009f\u00a0"+
		"\7?\2\2\u00a0.\3\2\2\2\u00a1\u00a2\7\u00ae\2\2\u00a2\60\3\2\2\2\u00a3"+
		"\u00a4\7>\2\2\u00a4\u00a5\7>\2\2\u00a5\62\3\2\2\2\u00a6\u00a7\7<\2\2\u00a7"+
		"\64\3\2\2\2\u00a8\u00a9\7<\2\2\u00a9\u00aa\7<\2\2\u00aa\66\3\2\2\2\u00ab"+
		"\u00ac\7=\2\2\u00ac8\3\2\2\2\u00ad\u00ae\7*\2\2\u00ae:\3\2\2\2\u00af\u00b0"+
		"\7+\2\2\u00b0<\3\2\2\2\u00b1\u00b2\7}\2\2\u00b2>\3\2\2\2\u00b3\u00b4\7"+
		"\177\2\2\u00b4@\3\2\2\2\u00b5\u00b7\7/\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00ba\t\2\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c3\3\2"+
		"\2\2\u00bd\u00bf\7\60\2\2\u00be\u00c0\t\2\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2"+
		"\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4B\3\2\2\2\u00c5\u00c6"+
		"\t\3\2\2\u00c6D\3\2\2\2\u00c7\u00c8\7x\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca"+
		"\7t\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\t\2\2\2\u00cc\u00cd\t\2\2\2\u00cd"+
		"\u00ce\t\2\2\2\u00ceF\3\2\2\2\u00cf\u00d1\t\4\2\2\u00d0\u00cf\3\2\2\2"+
		"\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d5\b$\2\2\u00d5H\3\2\2\2\b\2\u00b6\u00bb\u00c1\u00c3"+
		"\u00d2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}