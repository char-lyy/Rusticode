// Generated from Simple.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START=1, END=2, DEFINT=3, DEFREAL=4, DEFCHAR=5, DEFBOOL=6, IF=7, ENDIF=8, 
		WHILE=9, ENDWHILE=10, QUERY=11, SUM=12, REST=13, MULT=14, HIGH=15, LESS=16, 
		HEQL=17, LEQL=18, UNEQL=19, AND=20, OR=21, EQUAL=22, NEGT=23, ASSIG=24, 
		DOUPOINT=25, DDPOINT=26, SEMICOLON=27, OPENBRACKET=28, CLOSEDBRACKET=29, 
		OPENKEY=30, CLOSEKEY=31, ENTERO=32, REAL=33, BOOL=34, CHAR=35, VAR=36, 
		SW=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'"
	};
	public static final String[] ruleNames = {
		"START", "END", "DEFINT", "DEFREAL", "DEFCHAR", "DEFBOOL", "IF", "ENDIF", 
		"WHILE", "ENDWHILE", "QUERY", "SUM", "REST", "MULT", "HIGH", "LESS", "HEQL", 
		"LEQL", "UNEQL", "AND", "OR", "EQUAL", "NEGT", "ASSIG", "DOUPOINT", "DDPOINT", 
		"SEMICOLON", "OPENBRACKET", "CLOSEDBRACKET", "OPENKEY", "CLOSEKEY", "ENTERO", 
		"REAL", "BOOL", "CHAR", "VAR", "SW"
	};


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u00df\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\5!\u00b6\n!\3!\6!\u00b9\n!\r!\16!\u00ba\3\"\5\"\u00be\n\""+
		"\3\"\6\"\u00c1\n\"\r\"\16\"\u00c2\3\"\3\"\6\"\u00c7\n\"\r\"\16\"\u00c8"+
		"\5\"\u00cb\n\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\6&\u00da\n&\r&\16"+
		"&\u00db\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\6\3\2\62;\4\2hhxx\5\2C\\aa"+
		"c|\5\2\13\f\17\17\"\"\u00e5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5S\3\2"+
		"\2\2\7W\3\2\2\2\t[\3\2\2\2\13`\3\2\2\2\re\3\2\2\2\17j\3\2\2\2\21m\3\2"+
		"\2\2\23s\3\2\2\2\25y\3\2\2\2\27\u0082\3\2\2\2\31\u0084\3\2\2\2\33\u0086"+
		"\3\2\2\2\35\u0088\3\2\2\2\37\u008a\3\2\2\2!\u008c\3\2\2\2#\u008e\3\2\2"+
		"\2%\u0091\3\2\2\2\'\u0094\3\2\2\2)\u0097\3\2\2\2+\u009a\3\2\2\2-\u009d"+
		"\3\2\2\2/\u00a0\3\2\2\2\61\u00a2\3\2\2\2\63\u00a5\3\2\2\2\65\u00a7\3\2"+
		"\2\2\67\u00aa\3\2\2\29\u00ac\3\2\2\2;\u00ae\3\2\2\2=\u00b0\3\2\2\2?\u00b2"+
		"\3\2\2\2A\u00b5\3\2\2\2C\u00bd\3\2\2\2E\u00cc\3\2\2\2G\u00ce\3\2\2\2I"+
		"\u00d0\3\2\2\2K\u00d9\3\2\2\2MN\7u\2\2NO\7v\2\2OP\7c\2\2PQ\7t\2\2QR\7"+
		"v\2\2R\4\3\2\2\2ST\7g\2\2TU\7p\2\2UV\7f\2\2V\6\3\2\2\2WX\7k\2\2XY\7p\2"+
		"\2YZ\7v\2\2Z\b\3\2\2\2[\\\7t\2\2\\]\7g\2\2]^\7c\2\2^_\7n\2\2_\n\3\2\2"+
		"\2`a\7e\2\2ab\7j\2\2bc\7c\2\2cd\7t\2\2d\f\3\2\2\2ef\7d\2\2fg\7q\2\2gh"+
		"\7q\2\2hi\7n\2\2i\16\3\2\2\2jk\7k\2\2kl\7h\2\2l\20\3\2\2\2mn\7g\2\2no"+
		"\7p\2\2op\7f\2\2pq\7k\2\2qr\7h\2\2r\22\3\2\2\2st\7y\2\2tu\7j\2\2uv\7k"+
		"\2\2vw\7n\2\2wx\7g\2\2x\24\3\2\2\2yz\7g\2\2z{\7p\2\2{|\7f\2\2|}\7y\2\2"+
		"}~\7j\2\2~\177\7k\2\2\177\u0080\7n\2\2\u0080\u0081\7g\2\2\u0081\26\3\2"+
		"\2\2\u0082\u0083\7A\2\2\u0083\30\3\2\2\2\u0084\u0085\7-\2\2\u0085\32\3"+
		"\2\2\2\u0086\u0087\7/\2\2\u0087\34\3\2\2\2\u0088\u0089\7,\2\2\u0089\36"+
		"\3\2\2\2\u008a\u008b\7@\2\2\u008b \3\2\2\2\u008c\u008d\7>\2\2\u008d\""+
		"\3\2\2\2\u008e\u008f\7@\2\2\u008f\u0090\7?\2\2\u0090$\3\2\2\2\u0091\u0092"+
		"\7>\2\2\u0092\u0093\7?\2\2\u0093&\3\2\2\2\u0094\u0095\7#\2\2\u0095\u0096"+
		"\7?\2\2\u0096(\3\2\2\2\u0097\u0098\7(\2\2\u0098\u0099\7(\2\2\u0099*\3"+
		"\2\2\2\u009a\u009b\7~\2\2\u009b\u009c\7~\2\2\u009c,\3\2\2\2\u009d\u009e"+
		"\7?\2\2\u009e\u009f\7?\2\2\u009f.\3\2\2\2\u00a0\u00a1\7\u00ae\2\2\u00a1"+
		"\60\3\2\2\2\u00a2\u00a3\7>\2\2\u00a3\u00a4\7>\2\2\u00a4\62\3\2\2\2\u00a5"+
		"\u00a6\7<\2\2\u00a6\64\3\2\2\2\u00a7\u00a8\7<\2\2\u00a8\u00a9\7<\2\2\u00a9"+
		"\66\3\2\2\2\u00aa\u00ab\7=\2\2\u00ab8\3\2\2\2\u00ac\u00ad\7*\2\2\u00ad"+
		":\3\2\2\2\u00ae\u00af\7+\2\2\u00af<\3\2\2\2\u00b0\u00b1\7}\2\2\u00b1>"+
		"\3\2\2\2\u00b2\u00b3\7\177\2\2\u00b3@\3\2\2\2\u00b4\u00b6\7/\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b9\t\2"+
		"\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bbB\3\2\2\2\u00bc\u00be\7/\2\2\u00bd\u00bc\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00c1\t\2\2\2\u00c0\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00ca\3\2\2\2\u00c4\u00c6\7\60\2\2\u00c5\u00c7\t\2\2\2\u00c6\u00c5\3"+
		"\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c4\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cbD\3\2\2\2"+
		"\u00cc\u00cd\t\3\2\2\u00cdF\3\2\2\2\u00ce\u00cf\t\4\2\2\u00cfH\3\2\2\2"+
		"\u00d0\u00d1\7x\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d5\t\2\2\2\u00d5\u00d6\t\2\2\2\u00d6\u00d7\t\2\2\2\u00d7"+
		"J\3\2\2\2\u00d8\u00da\t\5\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2"+
		"\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
		"\b&\2\2\u00deL\3\2\2\2\n\2\u00b5\u00ba\u00bd\u00c2\u00c8\u00ca\u00db\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}