// Generated from Simple.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
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
		SW=37, DEFREAl=38, DDPOIN=39, SEMICON=40, CLOSEBRACKET=41;
	public static final String[] tokenNames = {
		"<INVALID>", "'start'", "'end'", "'int'", "'real'", "'char'", "'bool'", 
		"'if'", "'endif'", "'while'", "'endwhile'", "'?'", "'+'", "'-'", "'*'", 
		"'>'", "'<'", "'>='", "'<='", "'!='", "'&&'", "'||'", "'=='", "'¬'", "'<<'", 
		"':'", "'::'", "';'", "'('", "')'", "'{'", "'}'", "ENTERO", "REAL", "BOOL", 
		"CHAR", "VAR", "SW", "DEFREAl", "DDPOIN", "SEMICON", "CLOSEBRACKET"
	};
	public static final int
		RULE_inicio_fin = 0, RULE_programa = 1, RULE_sentencia = 2, RULE_definicion = 3, 
		RULE_asignacion = 4, RULE_if_sentencia = 5, RULE_while_sentencia = 6;
	public static final String[] ruleNames = {
		"inicio_fin", "programa", "sentencia", "definicion", "asignacion", "if_sentencia", 
		"while_sentencia"
	};

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Inicio_finContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(SimpleParser.END, 0); }
		public TerminalNode START() { return getToken(SimpleParser.START, 0); }
		public TerminalNode DOUPOINT() { return getToken(SimpleParser.DOUPOINT, 0); }
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public Inicio_finContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio_fin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterInicio_fin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitInicio_fin(this);
		}
	}

	public final Inicio_finContext inicio_fin() throws RecognitionException {
		Inicio_finContext _localctx = new Inicio_finContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio_fin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); match(START);
			setState(15); match(DOUPOINT);
			setState(16); programa();
			setState(17); match(END);
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

	public static class ProgramaContext extends ParserRuleContext {
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		try {
			setState(24);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19); sentencia();
				setState(20); match(SEMICOLON);
				setState(21); programa();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23); sentencia();
				}
				break;
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

	public static class SentenciaContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public If_sentenciaContext if_sentencia() {
			return getRuleContext(If_sentenciaContext.class,0);
		}
		public While_sentenciaContext while_sentencia() {
			return getRuleContext(While_sentenciaContext.class,0);
		}
		public DefinicionContext definicion() {
			return getRuleContext(DefinicionContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentencia);
		try {
			setState(30);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26); definicion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27); asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(28); if_sentencia();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(29); while_sentencia();
				}
				break;
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

	public static class DefinicionContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(SimpleParser.SEMICOLON, 0); }
		public TerminalNode QUERY(int i) {
			return getToken(SimpleParser.QUERY, i);
		}
		public TerminalNode REAL() { return getToken(SimpleParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(SimpleParser.BOOL, 0); }
		public TerminalNode DDPOIN() { return getToken(SimpleParser.DDPOIN, 0); }
		public TerminalNode OPENBRACKET() { return getToken(SimpleParser.OPENBRACKET, 0); }
		public TerminalNode DEFINT() { return getToken(SimpleParser.DEFINT, 0); }
		public TerminalNode DDPOINT(int i) {
			return getToken(SimpleParser.DDPOINT, i);
		}
		public TerminalNode SEMICON() { return getToken(SimpleParser.SEMICON, 0); }
		public TerminalNode VAR(int i) {
			return getToken(SimpleParser.VAR, i);
		}
		public TerminalNode DEFREAl() { return getToken(SimpleParser.DEFREAl, 0); }
		public TerminalNode DEFCHAR() { return getToken(SimpleParser.DEFCHAR, 0); }
		public TerminalNode DEFBOOL() { return getToken(SimpleParser.DEFBOOL, 0); }
		public TerminalNode DEFREAL() { return getToken(SimpleParser.DEFREAL, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(SimpleParser.CLOSEBRACKET, 0); }
		public TerminalNode ASSIG() { return getToken(SimpleParser.ASSIG, 0); }
		public List<TerminalNode> VAR() { return getTokens(SimpleParser.VAR); }
		public List<TerminalNode> QUERY() { return getTokens(SimpleParser.QUERY); }
		public TerminalNode CHAR() { return getToken(SimpleParser.CHAR, 0); }
		public List<TerminalNode> DDPOINT() { return getTokens(SimpleParser.DDPOINT); }
		public TerminalNode ENTERO() { return getToken(SimpleParser.ENTERO, 0); }
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterDefinicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitDefinicion(this);
		}
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definicion);
		try {
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32); match(DEFINT);
				setState(33); match(DDPOINT);
				setState(34); match(VAR);
				setState(35); match(ASSIG);
				setState(36); match(ENTERO);
				setState(37); match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38); match(DEFREAl);
				setState(39); match(DDPOIN);
				setState(40); match(VAR);
				setState(41); match(ASSIG);
				setState(42); match(REAL);
				setState(43); match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44); match(DEFCHAR);
				setState(45); match(DDPOIN);
				setState(46); match(VAR);
				setState(47); match(ASSIG);
				setState(48); match(CHAR);
				setState(49); match(SEMICON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(50); match(DEFBOOL);
				setState(51); match(DDPOIN);
				setState(52); match(VAR);
				setState(53); match(ASSIG);
				setState(54); match(BOOL);
				setState(55); match(SEMICON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(56); match(QUERY);
				setState(57); match(DEFINT);
				setState(58); match(DDPOINT);
				setState(59); match(VAR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60); match(QUERY);
				setState(61); match(DEFREAL);
				setState(62); match(DDPOINT);
				setState(63); match(VAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(64); match(QUERY);
				setState(65); match(DEFCHAR);
				setState(66); match(DDPOINT);
				setState(67); match(VAR);
				setState(68); match(QUERY);
				setState(69); match(DEFBOOL);
				setState(70); match(DDPOINT);
				setState(71); match(VAR);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(72); match(QUERY);
				setState(73); match(DEFREAL);
				setState(74); match(DDPOINT);
				setState(75); match(VAR);
				setState(76); match(OPENBRACKET);
				setState(77); match(ENTERO);
				setState(78); match(CLOSEBRACKET);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(79); match(QUERY);
				setState(80); match(DEFCHAR);
				setState(81); match(DDPOINT);
				setState(82); match(VAR);
				setState(83); match(OPENBRACKET);
				setState(84); match(ENTERO);
				setState(85); match(CLOSEBRACKET);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(86); match(QUERY);
				setState(87); match(DEFBOOL);
				setState(88); match(DDPOINT);
				setState(89); match(VAR);
				setState(90); match(OPENBRACKET);
				setState(91); match(ENTERO);
				setState(92); match(CLOSEBRACKET);
				}
				break;
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ENTERO(int i) {
			return getToken(SimpleParser.ENTERO, i);
		}
		public TerminalNode REAL() { return getToken(SimpleParser.REAL, 0); }
		public TerminalNode BOOL() { return getToken(SimpleParser.BOOL, 0); }
		public TerminalNode VAR() { return getToken(SimpleParser.VAR, 0); }
		public TerminalNode OPENBRACKET() { return getToken(SimpleParser.OPENBRACKET, 0); }
		public TerminalNode CHAR() { return getToken(SimpleParser.CHAR, 0); }
		public TerminalNode CLOSEBRACKET() { return getToken(SimpleParser.CLOSEBRACKET, 0); }
		public TerminalNode ASSIG() { return getToken(SimpleParser.ASSIG, 0); }
		public List<TerminalNode> ENTERO() { return getTokens(SimpleParser.ENTERO); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignacion);
		try {
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); match(VAR);
				setState(96); match(ASSIG);
				setState(97); match(ENTERO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); match(VAR);
				setState(99); match(ASSIG);
				setState(100); match(REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101); match(VAR);
				setState(102); match(ASSIG);
				setState(103); match(CHAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104); match(VAR);
				setState(105); match(ASSIG);
				setState(106); match(BOOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(107); match(VAR);
				setState(108); match(OPENBRACKET);
				setState(109); match(ENTERO);
				setState(110); match(CLOSEBRACKET);
				setState(111); match(REAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(112); match(VAR);
				setState(113); match(OPENBRACKET);
				setState(114); match(ENTERO);
				setState(115); match(CLOSEBRACKET);
				setState(116); match(ENTERO);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(117); match(VAR);
				setState(118); match(OPENBRACKET);
				setState(119); match(ENTERO);
				setState(120); match(CLOSEBRACKET);
				setState(121); match(BOOL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				}
				break;
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

	public static class If_sentenciaContext extends ParserRuleContext {
		public If_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterIf_sentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitIf_sentencia(this);
		}
	}

	public final If_sentenciaContext if_sentencia() throws RecognitionException {
		If_sentenciaContext _localctx = new If_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class While_sentenciaContext extends ParserRuleContext {
		public While_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).enterWhile_sentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleListener ) ((SimpleListener)listener).exitWhile_sentencia(this);
		}
	}

	public final While_sentenciaContext while_sentencia() throws RecognitionException {
		While_sentenciaContext _localctx = new While_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0084\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\5\4!\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5`\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6~\n\6\3\7\3\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2\u0090\2\20\3\2\2"+
		"\2\4\32\3\2\2\2\6 \3\2\2\2\b_\3\2\2\2\n}\3\2\2\2\f\177\3\2\2\2\16\u0081"+
		"\3\2\2\2\20\21\7\3\2\2\21\22\7\33\2\2\22\23\5\4\3\2\23\24\7\4\2\2\24\3"+
		"\3\2\2\2\25\26\5\6\4\2\26\27\7\35\2\2\27\30\5\4\3\2\30\33\3\2\2\2\31\33"+
		"\5\6\4\2\32\25\3\2\2\2\32\31\3\2\2\2\33\5\3\2\2\2\34!\5\b\5\2\35!\5\n"+
		"\6\2\36!\5\f\7\2\37!\5\16\b\2 \34\3\2\2\2 \35\3\2\2\2 \36\3\2\2\2 \37"+
		"\3\2\2\2!\7\3\2\2\2\"#\7\5\2\2#$\7\34\2\2$%\7&\2\2%&\7\32\2\2&\'\7\"\2"+
		"\2\'`\7\35\2\2()\7(\2\2)*\7)\2\2*+\7&\2\2+,\7\32\2\2,-\7#\2\2-`\7\35\2"+
		"\2./\7\7\2\2/\60\7)\2\2\60\61\7&\2\2\61\62\7\32\2\2\62\63\7%\2\2\63`\7"+
		"*\2\2\64\65\7\b\2\2\65\66\7)\2\2\66\67\7&\2\2\678\7\32\2\289\7$\2\29`"+
		"\7*\2\2:;\7\r\2\2;<\7\5\2\2<=\7\34\2\2=`\7&\2\2>?\7\r\2\2?@\7\6\2\2@A"+
		"\7\34\2\2A`\7&\2\2BC\7\r\2\2CD\7\7\2\2DE\7\34\2\2EF\7&\2\2FG\7\r\2\2G"+
		"H\7\b\2\2HI\7\34\2\2I`\7&\2\2JK\7\r\2\2KL\7\6\2\2LM\7\34\2\2MN\7&\2\2"+
		"NO\7\36\2\2OP\7\"\2\2P`\7+\2\2QR\7\r\2\2RS\7\7\2\2ST\7\34\2\2TU\7&\2\2"+
		"UV\7\36\2\2VW\7\"\2\2W`\7+\2\2XY\7\r\2\2YZ\7\b\2\2Z[\7\34\2\2[\\\7&\2"+
		"\2\\]\7\36\2\2]^\7\"\2\2^`\7+\2\2_\"\3\2\2\2_(\3\2\2\2_.\3\2\2\2_\64\3"+
		"\2\2\2_:\3\2\2\2_>\3\2\2\2_B\3\2\2\2_J\3\2\2\2_Q\3\2\2\2_X\3\2\2\2`\t"+
		"\3\2\2\2ab\7&\2\2bc\7\32\2\2c~\7\"\2\2de\7&\2\2ef\7\32\2\2f~\7#\2\2gh"+
		"\7&\2\2hi\7\32\2\2i~\7%\2\2jk\7&\2\2kl\7\32\2\2l~\7$\2\2mn\7&\2\2no\7"+
		"\36\2\2op\7\"\2\2pq\7+\2\2q~\7#\2\2rs\7&\2\2st\7\36\2\2tu\7\"\2\2uv\7"+
		"+\2\2v~\7\"\2\2wx\7&\2\2xy\7\36\2\2yz\7\"\2\2z{\7+\2\2{~\7$\2\2|~\3\2"+
		"\2\2}a\3\2\2\2}d\3\2\2\2}g\3\2\2\2}j\3\2\2\2}m\3\2\2\2}r\3\2\2\2}w\3\2"+
		"\2\2}|\3\2\2\2~\13\3\2\2\2\177\u0080\3\2\2\2\u0080\r\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\17\3\2\2\2\6\32 _}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}