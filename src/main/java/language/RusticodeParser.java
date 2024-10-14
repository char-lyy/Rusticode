package language;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RusticodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, START=9, 
		END=10, DEFINT=11, DEFREAL=12, DEFCHAR=13, IF=14, ENDIF=15, WHILE=16, 
		ENDWHILE=17, TRUE=18, FALSE=19, SUM=20, REST=21, MULT=22, HIGH=23, LESS=24, 
		HEQL=25, LEQL=26, UNEQL=27, AND=28, OR=29, EQUAL=30, NEGT=31, ASSIG=32, 
		DOUPOINT=33, DDPOINT=34, SEMICOLON=35, OPENBRACKET=36, CLOSEDBRACKET=37, 
		OPENKEY=38, CLOSEKEY=39, NUM=40, CHAR=41, VAR=42, SW=43;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_definicion = 2, RULE_asignacion = 3, 
		RULE_exp_mat = 4, RULE_termino = 5, RULE_factor = 6, RULE_bool = 7, RULE_exp_log = 8, 
		RULE_if_sentence = 9, RULE_while_sentence = 10, RULE_type = 11, RULE_literal_value = 12, 
		RULE_start = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencia", "definicion", "asignacion", "exp_mat", "termino", 
			"factor", "bool", "exp_log", "if_sentence", "while_sentence", "type", 
			"literal_value", "start"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'?int'", "'?real'", "'?char'", "'?bool'", "'['", "']'", "'hello'", 
			"'world'", "'start:'", "'end'", "'int'", "'real'", "'char'", "'if'", 
			"'endif'", "'while'", "'endwhile'", "'True'", "'False'", "'+'", "'-'", 
			"'*'", "'>'", "'<'", "'>='", "'<='", "'!='", "'&&'", "'||'", "'=='", 
			"'\\u00AC'", "'<<'", "':'", "'::'", "';'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "START", "END", 
			"DEFINT", "DEFREAL", "DEFCHAR", "IF", "ENDIF", "WHILE", "ENDWHILE", "TRUE", 
			"FALSE", "SUM", "REST", "MULT", "HIGH", "LESS", "HEQL", "LEQL", "UNEQL", 
			"AND", "OR", "EQUAL", "NEGT", "ASSIG", "DOUPOINT", "DDPOINT", "SEMICOLON", 
			"OPENBRACKET", "CLOSEDBRACKET", "OPENKEY", "CLOSEKEY", "NUM", "CHAR", 
			"VAR", "SW"
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

	@Override
	public String getGrammarFileName() { return "Rusticode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RusticodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(RusticodeParser.START, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public TerminalNode END() { return getToken(RusticodeParser.END, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(START);
			setState(29);
			sentencia();
			setState(30);
			match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(RusticodeParser.SEMICOLON, 0); }
		public DefinicionContext definicion() {
			return getRuleContext(DefinicionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public If_sentenceContext if_sentence() {
			return getRuleContext(If_sentenceContext.class,0);
		}
		public While_sentenceContext while_sentence() {
			return getRuleContext(While_sentenceContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case DEFINT:
			case DEFREAL:
			case DEFCHAR:
				{
				setState(32);
				definicion();
				}
				break;
			case VAR:
				{
				setState(33);
				asignacion();
				}
				break;
			case IF:
				{
				setState(34);
				if_sentence();
				}
				break;
			case WHILE:
				{
				setState(35);
				while_sentence();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(38);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinicionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode DDPOINT() { return getToken(RusticodeParser.DDPOINT, 0); }
		public TerminalNode VAR() { return getToken(RusticodeParser.VAR, 0); }
		public TerminalNode ASSIG() { return getToken(RusticodeParser.ASSIG, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode NUM() { return getToken(RusticodeParser.NUM, 0); }
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterDefinicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitDefinicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitDefinicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definicion);
		int _la;
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEFINT:
			case DEFREAL:
			case DEFCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				type();
				setState(41);
				match(DDPOINT);
				setState(42);
				match(VAR);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIG) {
					{
					setState(43);
					match(ASSIG);
					setState(44);
					literal_value();
					}
				}

				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(48);
				match(DDPOINT);
				setState(49);
				match(VAR);
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(50);
					match(T__4);
					setState(51);
					match(NUM);
					setState(52);
					match(T__5);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(RusticodeParser.VAR, 0); }
		public List<TerminalNode> ASSIG() { return getTokens(RusticodeParser.ASSIG); }
		public TerminalNode ASSIG(int i) {
			return getToken(RusticodeParser.ASSIG, i);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Exp_matContext exp_mat() {
			return getRuleContext(Exp_matContext.class,0);
		}
		public TerminalNode NUM() { return getToken(RusticodeParser.NUM, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(VAR);
			setState(58);
			match(ASSIG);
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(59);
				literal_value();
				}
				break;
			case 2:
				{
				setState(60);
				exp_mat();
				}
				break;
			case 3:
				{
				setState(61);
				match(T__4);
				setState(62);
				match(NUM);
				setState(63);
				match(T__5);
				setState(64);
				match(ASSIG);
				setState(65);
				literal_value();
				}
				break;
			case 4:
				{
				setState(66);
				exp_mat();
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_matContext extends ParserRuleContext {
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> SUM() { return getTokens(RusticodeParser.SUM); }
		public TerminalNode SUM(int i) {
			return getToken(RusticodeParser.SUM, i);
		}
		public List<TerminalNode> REST() { return getTokens(RusticodeParser.REST); }
		public TerminalNode REST(int i) {
			return getToken(RusticodeParser.REST, i);
		}
		public Exp_matContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_mat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterExp_mat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitExp_mat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitExp_mat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_matContext exp_mat() throws RecognitionException {
		Exp_matContext _localctx = new Exp_matContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exp_mat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			termino();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM || _la==REST) {
				{
				setState(74);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUM:
					{
					setState(70);
					match(SUM);
					setState(71);
					termino();
					}
					break;
				case REST:
					{
					setState(72);
					match(REST);
					setState(73);
					termino();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(RusticodeParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(RusticodeParser.MULT, i);
		}
		public List<TerminalNode> REST() { return getTokens(RusticodeParser.REST); }
		public TerminalNode REST(int i) {
			return getToken(RusticodeParser.REST, i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_termino);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			factor();
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(84);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MULT:
						{
						setState(80);
						match(MULT);
						setState(81);
						factor();
						}
						break;
					case REST:
						{
						setState(82);
						match(REST);
						setState(83);
						factor();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() { return getToken(RusticodeParser.OPENBRACKET, 0); }
		public Exp_matContext exp_mat() {
			return getRuleContext(Exp_matContext.class,0);
		}
		public TerminalNode CLOSEDBRACKET() { return getToken(RusticodeParser.CLOSEDBRACKET, 0); }
		public TerminalNode NUM() { return getToken(RusticodeParser.NUM, 0); }
		public TerminalNode VAR() { return getToken(RusticodeParser.VAR, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(OPENBRACKET);
				setState(90);
				exp_mat();
				setState(91);
				match(CLOSEDBRACKET);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(NUM);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				match(VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(RusticodeParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(RusticodeParser.FALSE, 0); }
		public List<Exp_logContext> exp_log() {
			return getRuleContexts(Exp_logContext.class);
		}
		public Exp_logContext exp_log(int i) {
			return getRuleContext(Exp_logContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(RusticodeParser.EQUAL, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bool);
		int _la;
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case NEGT:
			case OPENBRACKET:
			case NUM:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				exp_log(0);
				setState(99);
				match(EQUAL);
				setState(100);
				exp_log(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_logContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(RusticodeParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(RusticodeParser.VAR, i);
		}
		public TerminalNode EQUAL() { return getToken(RusticodeParser.EQUAL, 0); }
		public TerminalNode NUM() { return getToken(RusticodeParser.NUM, 0); }
		public TerminalNode NEGT() { return getToken(RusticodeParser.NEGT, 0); }
		public TerminalNode OPENBRACKET() { return getToken(RusticodeParser.OPENBRACKET, 0); }
		public List<Exp_logContext> exp_log() {
			return getRuleContexts(Exp_logContext.class);
		}
		public Exp_logContext exp_log(int i) {
			return getRuleContext(Exp_logContext.class,i);
		}
		public TerminalNode CLOSEDBRACKET() { return getToken(RusticodeParser.CLOSEDBRACKET, 0); }
		public TerminalNode AND() { return getToken(RusticodeParser.AND, 0); }
		public TerminalNode OR() { return getToken(RusticodeParser.OR, 0); }
		public TerminalNode HIGH() { return getToken(RusticodeParser.HIGH, 0); }
		public TerminalNode LESS() { return getToken(RusticodeParser.LESS, 0); }
		public TerminalNode HEQL() { return getToken(RusticodeParser.HEQL, 0); }
		public TerminalNode LEQL() { return getToken(RusticodeParser.LEQL, 0); }
		public Exp_logContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterExp_log(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitExp_log(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitExp_log(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_logContext exp_log() throws RecognitionException {
		return exp_log(0);
	}

	private Exp_logContext exp_log(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp_logContext _localctx = new Exp_logContext(_ctx, _parentState);
		Exp_logContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exp_log, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(105);
				match(VAR);
				setState(106);
				match(EQUAL);
				setState(107);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				setState(108);
				match(NEGT);
				setState(109);
				match(OPENBRACKET);
				setState(110);
				exp_log(0);
				setState(111);
				match(CLOSEDBRACKET);
				}
				break;
			case 3:
				{
				setState(113);
				match(OPENBRACKET);
				setState(114);
				exp_log(0);
				setState(115);
				match(CLOSEDBRACKET);
				}
				break;
			case 4:
				{
				setState(117);
				match(VAR);
				}
				break;
			case 5:
				{
				setState(118);
				match(NUM);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Exp_logContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp_log);
						setState(121);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(122);
						match(AND);
						setState(123);
						exp_log(12);
						}
						break;
					case 2:
						{
						_localctx = new Exp_logContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp_log);
						setState(124);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(125);
						match(OR);
						setState(126);
						exp_log(11);
						}
						break;
					case 3:
						{
						_localctx = new Exp_logContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp_log);
						setState(127);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(128);
						match(HIGH);
						setState(129);
						exp_log(10);
						}
						break;
					case 4:
						{
						_localctx = new Exp_logContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp_log);
						setState(130);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(131);
						match(LESS);
						setState(132);
						exp_log(9);
						}
						break;
					case 5:
						{
						_localctx = new Exp_logContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp_log);
						setState(133);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(134);
						match(HEQL);
						setState(135);
						exp_log(8);
						}
						break;
					case 6:
						{
						_localctx = new Exp_logContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp_log);
						setState(136);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(137);
						match(LEQL);
						setState(138);
						exp_log(7);
						}
						break;
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_sentenceContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RusticodeParser.IF, 0); }
		public TerminalNode OPENBRACKET() { return getToken(RusticodeParser.OPENBRACKET, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode CLOSEDBRACKET() { return getToken(RusticodeParser.CLOSEDBRACKET, 0); }
		public TerminalNode OPENKEY() { return getToken(RusticodeParser.OPENKEY, 0); }
		public TerminalNode CLOSEKEY() { return getToken(RusticodeParser.CLOSEKEY, 0); }
		public TerminalNode ENDIF() { return getToken(RusticodeParser.ENDIF, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public If_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterIf_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitIf_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitIf_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_sentenceContext if_sentence() throws RecognitionException {
		If_sentenceContext _localctx = new If_sentenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(IF);
			setState(145);
			match(OPENBRACKET);
			setState(146);
			bool();
			setState(147);
			match(CLOSEDBRACKET);
			setState(148);
			match(OPENKEY);
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				sentencia();
				}
				}
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046607390L) != 0) );
			setState(154);
			match(CLOSEKEY);
			setState(155);
			match(ENDIF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_sentenceContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(RusticodeParser.WHILE, 0); }
		public TerminalNode OPENBRACKET() { return getToken(RusticodeParser.OPENBRACKET, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode CLOSEDBRACKET() { return getToken(RusticodeParser.CLOSEDBRACKET, 0); }
		public TerminalNode OPENKEY() { return getToken(RusticodeParser.OPENKEY, 0); }
		public TerminalNode CLOSEKEY() { return getToken(RusticodeParser.CLOSEKEY, 0); }
		public TerminalNode ENDWHILE() { return getToken(RusticodeParser.ENDWHILE, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public While_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterWhile_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitWhile_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitWhile_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_sentenceContext while_sentence() throws RecognitionException {
		While_sentenceContext _localctx = new While_sentenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(WHILE);
			setState(158);
			match(OPENBRACKET);
			setState(159);
			bool();
			setState(160);
			match(CLOSEDBRACKET);
			setState(161);
			match(OPENKEY);
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				sentencia();
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4398046607390L) != 0) );
			setState(167);
			match(CLOSEKEY);
			setState(168);
			match(ENDWHILE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode DEFINT() { return getToken(RusticodeParser.DEFINT, 0); }
		public TerminalNode DEFREAL() { return getToken(RusticodeParser.DEFREAL, 0); }
		public TerminalNode DEFCHAR() { return getToken(RusticodeParser.DEFCHAR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(RusticodeParser.NUM, 0); }
		public TerminalNode CHAR() { return getToken(RusticodeParser.CHAR, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal_value);
		try {
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(CHAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				bool();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__6);
			setState(178);
			match(T__7);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return exp_log_sempred((Exp_logContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_log_sempred(Exp_logContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u00b5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001%\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002.\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0003\u0002"+
		"8\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"D\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004K\b\u0004\n\u0004\f\u0004N\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005U\b\u0005\n\u0005\f\u0005"+
		"X\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006`\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007g\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\bx\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u008c\b\b\n\b\f\b\u008f"+
		"\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u0097\b\t"+
		"\u000b\t\f\t\u0098\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0004\n\u00a4\b\n\u000b\n\f\n\u00a5\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00b0"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0000\u0001\u0010\u000e\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0004"+
		"\u0001\u0000\u0001\u0004\u0001\u0000\u0012\u0013\u0002\u0000((**\u0001"+
		"\u0000\u000b\r\u00c4\u0000\u001c\u0001\u0000\u0000\u0000\u0002$\u0001"+
		"\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u00069\u0001\u0000\u0000"+
		"\u0000\bE\u0001\u0000\u0000\u0000\nO\u0001\u0000\u0000\u0000\f_\u0001"+
		"\u0000\u0000\u0000\u000ef\u0001\u0000\u0000\u0000\u0010w\u0001\u0000\u0000"+
		"\u0000\u0012\u0090\u0001\u0000\u0000\u0000\u0014\u009d\u0001\u0000\u0000"+
		"\u0000\u0016\u00aa\u0001\u0000\u0000\u0000\u0018\u00af\u0001\u0000\u0000"+
		"\u0000\u001a\u00b1\u0001\u0000\u0000\u0000\u001c\u001d\u0005\t\u0000\u0000"+
		"\u001d\u001e\u0003\u0002\u0001\u0000\u001e\u001f\u0005\n\u0000\u0000\u001f"+
		"\u0001\u0001\u0000\u0000\u0000 %\u0003\u0004\u0002\u0000!%\u0003\u0006"+
		"\u0003\u0000\"%\u0003\u0012\t\u0000#%\u0003\u0014\n\u0000$ \u0001\u0000"+
		"\u0000\u0000$!\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$#\u0001"+
		"\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&\'\u0005#\u0000\u0000\'\u0003"+
		"\u0001\u0000\u0000\u0000()\u0003\u0016\u000b\u0000)*\u0005\"\u0000\u0000"+
		"*-\u0005*\u0000\u0000+,\u0005 \u0000\u0000,.\u0003\u0018\f\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.8\u0001\u0000\u0000\u0000"+
		"/0\u0007\u0000\u0000\u000001\u0005\"\u0000\u000015\u0005*\u0000\u0000"+
		"23\u0005\u0005\u0000\u000034\u0005(\u0000\u000046\u0005\u0006\u0000\u0000"+
		"52\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0001\u0000\u0000"+
		"\u00007(\u0001\u0000\u0000\u00007/\u0001\u0000\u0000\u00008\u0005\u0001"+
		"\u0000\u0000\u00009:\u0005*\u0000\u0000:C\u0005 \u0000\u0000;D\u0003\u0018"+
		"\f\u0000<D\u0003\b\u0004\u0000=>\u0005\u0005\u0000\u0000>?\u0005(\u0000"+
		"\u0000?@\u0005\u0006\u0000\u0000@A\u0005 \u0000\u0000AD\u0003\u0018\f"+
		"\u0000BD\u0003\b\u0004\u0000C;\u0001\u0000\u0000\u0000C<\u0001\u0000\u0000"+
		"\u0000C=\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000D\u0007\u0001"+
		"\u0000\u0000\u0000EL\u0003\n\u0005\u0000FG\u0005\u0014\u0000\u0000GK\u0003"+
		"\n\u0005\u0000HI\u0005\u0015\u0000\u0000IK\u0003\n\u0005\u0000JF\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\t\u0001\u0000\u0000"+
		"\u0000NL\u0001\u0000\u0000\u0000OV\u0003\f\u0006\u0000PQ\u0005\u0016\u0000"+
		"\u0000QU\u0003\f\u0006\u0000RS\u0005\u0015\u0000\u0000SU\u0003\f\u0006"+
		"\u0000TP\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UX\u0001\u0000"+
		"\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\u000b"+
		"\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0005$\u0000\u0000"+
		"Z[\u0003\b\u0004\u0000[\\\u0005%\u0000\u0000\\`\u0001\u0000\u0000\u0000"+
		"]`\u0005(\u0000\u0000^`\u0005*\u0000\u0000_Y\u0001\u0000\u0000\u0000_"+
		"]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`\r\u0001\u0000\u0000"+
		"\u0000ag\u0007\u0001\u0000\u0000bc\u0003\u0010\b\u0000cd\u0005\u001e\u0000"+
		"\u0000de\u0003\u0010\b\u0000eg\u0001\u0000\u0000\u0000fa\u0001\u0000\u0000"+
		"\u0000fb\u0001\u0000\u0000\u0000g\u000f\u0001\u0000\u0000\u0000hi\u0006"+
		"\b\uffff\uffff\u0000ij\u0005*\u0000\u0000jk\u0005\u001e\u0000\u0000kx"+
		"\u0007\u0002\u0000\u0000lm\u0005\u001f\u0000\u0000mn\u0005$\u0000\u0000"+
		"no\u0003\u0010\b\u0000op\u0005%\u0000\u0000px\u0001\u0000\u0000\u0000"+
		"qr\u0005$\u0000\u0000rs\u0003\u0010\b\u0000st\u0005%\u0000\u0000tx\u0001"+
		"\u0000\u0000\u0000ux\u0005*\u0000\u0000vx\u0005(\u0000\u0000wh\u0001\u0000"+
		"\u0000\u0000wl\u0001\u0000\u0000\u0000wq\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000x\u008d\u0001\u0000\u0000"+
		"\u0000yz\n\u000b\u0000\u0000z{\u0005\u001c\u0000\u0000{\u008c\u0003\u0010"+
		"\b\f|}\n\n\u0000\u0000}~\u0005\u001d\u0000\u0000~\u008c\u0003\u0010\b"+
		"\u000b\u007f\u0080\n\t\u0000\u0000\u0080\u0081\u0005\u0017\u0000\u0000"+
		"\u0081\u008c\u0003\u0010\b\n\u0082\u0083\n\b\u0000\u0000\u0083\u0084\u0005"+
		"\u0018\u0000\u0000\u0084\u008c\u0003\u0010\b\t\u0085\u0086\n\u0007\u0000"+
		"\u0000\u0086\u0087\u0005\u0019\u0000\u0000\u0087\u008c\u0003\u0010\b\b"+
		"\u0088\u0089\n\u0006\u0000\u0000\u0089\u008a\u0005\u001a\u0000\u0000\u008a"+
		"\u008c\u0003\u0010\b\u0007\u008by\u0001\u0000\u0000\u0000\u008b|\u0001"+
		"\u0000\u0000\u0000\u008b\u007f\u0001\u0000\u0000\u0000\u008b\u0082\u0001"+
		"\u0000\u0000\u0000\u008b\u0085\u0001\u0000\u0000\u0000\u008b\u0088\u0001"+
		"\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0011\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091\u0005"+
		"\u000e\u0000\u0000\u0091\u0092\u0005$\u0000\u0000\u0092\u0093\u0003\u000e"+
		"\u0007\u0000\u0093\u0094\u0005%\u0000\u0000\u0094\u0096\u0005&\u0000\u0000"+
		"\u0095\u0097\u0003\u0002\u0001\u0000\u0096\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0005\'\u0000\u0000\u009b\u009c\u0005\u000f\u0000\u0000\u009c"+
		"\u0013\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0010\u0000\u0000\u009e"+
		"\u009f\u0005$\u0000\u0000\u009f\u00a0\u0003\u000e\u0007\u0000\u00a0\u00a1"+
		"\u0005%\u0000\u0000\u00a1\u00a3\u0005&\u0000\u0000\u00a2\u00a4\u0003\u0002"+
		"\u0001\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\'\u0000"+
		"\u0000\u00a8\u00a9\u0005\u0011\u0000\u0000\u00a9\u0015\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0007\u0003\u0000\u0000\u00ab\u0017\u0001\u0000\u0000"+
		"\u0000\u00ac\u00b0\u0005(\u0000\u0000\u00ad\u00b0\u0005)\u0000\u0000\u00ae"+
		"\u00b0\u0003\u000e\u0007\u0000\u00af\u00ac\u0001\u0000\u0000\u0000\u00af"+
		"\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0"+
		"\u0019\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0007\u0000\u0000\u00b2"+
		"\u00b3\u0005\b\u0000\u0000\u00b3\u001b\u0001\u0000\u0000\u0000\u0011$"+
		"-57CJLTV_fw\u008b\u008d\u0098\u00a5\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}