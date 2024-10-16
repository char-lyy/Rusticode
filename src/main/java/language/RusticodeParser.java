// Generated from C:/Users/Evelin Suarez/OneDrive/Desktop/Estudio/repoR/src/main/antlr4/Rusticode.g4 by ANTLR 4.13.1
package language;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RusticodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, START=6, END=7, DEFINT=8, DEFREAL=9, 
		DEFCHAR=10, IF=11, ENDIF=12, WHILE=13, ENDWHILE=14, TRUE=15, FALSE=16, 
		SUM=17, REST=18, MULT=19, DIV=20, HIGH=21, LESS=22, HEQL=23, LEQL=24, 
		UNEQL=25, AND=26, OR=27, EQUAL=28, NEGT=29, ASSIG=30, DOUPOINT=31, DDPOINT=32, 
		SEMICOLON=33, OPENBRACKET=34, CLOSEDBRACKET=35, OPENKEY=36, CLOSEKEY=37, 
		NUM=38, CHAR=39, VAR=40, SW=41, COM=42;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_definicion = 2, RULE_const_type = 3, 
		RULE_asignacion = 4, RULE_exp_mat = 5, RULE_termino = 6, RULE_factor = 7, 
		RULE_bool = 8, RULE_exp_log = 9, RULE_comparador = 10, RULE_if_sentence = 11, 
		RULE_while_sentence = 12, RULE_type = 13, RULE_literal_value = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencia", "definicion", "const_type", "asignacion", "exp_mat", 
			"termino", "factor", "bool", "exp_log", "comparador", "if_sentence", 
			"while_sentence", "type", "literal_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'?int'", "'?real'", "'?char'", "'start:'", "'end'", 
			"'int'", "'real'", "'char'", "'if'", "'endif'", "'while'", "'endwhile'", 
			"'True'", "'False'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", 
			"'<='", "'!='", "'&&'", "'||'", "'=='", "'\\u00AC'", "'<<'", "':'", "'::'", 
			"';'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "START", "END", "DEFINT", "DEFREAL", 
			"DEFCHAR", "IF", "ENDIF", "WHILE", "ENDWHILE", "TRUE", "FALSE", "SUM", 
			"REST", "MULT", "DIV", "HIGH", "LESS", "HEQL", "LEQL", "UNEQL", "AND", 
			"OR", "EQUAL", "NEGT", "ASSIG", "DOUPOINT", "DDPOINT", "SEMICOLON", "OPENBRACKET", 
			"CLOSEDBRACKET", "OPENKEY", "CLOSEKEY", "NUM", "CHAR", "VAR", "SW", "COM"
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
		public TerminalNode END() { return getToken(RusticodeParser.END, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(START);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				sentencia();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511639864L) != 0) );
			setState(36);
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
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
			case DEFINT:
			case DEFREAL:
			case DEFCHAR:
				{
				setState(38);
				definicion();
				}
				break;
			case VAR:
				{
				setState(39);
				asignacion();
				}
				break;
			case IF:
				{
				setState(40);
				if_sentence();
				}
				break;
			case WHILE:
				{
				setState(41);
				while_sentence();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(44);
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
		public TerminalNode NUM() { return getToken(RusticodeParser.NUM, 0); }
		public Const_typeContext const_type() {
			return getRuleContext(Const_typeContext.class,0);
		}
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				type();
				setState(47);
				match(DDPOINT);
				setState(48);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				type();
				setState(51);
				match(DDPOINT);
				setState(52);
				match(VAR);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(53);
					match(T__0);
					setState(54);
					match(NUM);
					setState(55);
					match(T__1);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				const_type();
				setState(59);
				match(DDPOINT);
				setState(60);
				match(VAR);
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
	public static class Const_typeContext extends ParserRuleContext {
		public Const_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterConst_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitConst_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitConst_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_typeContext const_type() throws RecognitionException {
		Const_typeContext _localctx = new Const_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_const_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) ) {
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
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(RusticodeParser.VAR, 0); }
		public TerminalNode ASSIG() { return getToken(RusticodeParser.ASSIG, 0); }
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
		enterRule(_localctx, 8, RULE_asignacion);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(VAR);
				setState(67);
				match(ASSIG);
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(68);
					literal_value();
					}
					break;
				case 2:
					{
					setState(69);
					exp_mat();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(VAR);
				setState(73);
				match(T__0);
				setState(74);
				match(NUM);
				setState(75);
				match(T__1);
				setState(76);
				match(ASSIG);
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(77);
					literal_value();
					}
					break;
				case 2:
					{
					setState(78);
					exp_mat();
					}
					break;
				}
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
		enterRule(_localctx, 10, RULE_exp_mat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			termino();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUM || _la==REST) {
				{
				setState(88);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SUM:
					{
					setState(84);
					match(SUM);
					setState(85);
					termino();
					}
					break;
				case REST:
					{
					setState(86);
					match(REST);
					setState(87);
					termino();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(92);
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
		public List<TerminalNode> DIV() { return getTokens(RusticodeParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(RusticodeParser.DIV, i);
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
		enterRule(_localctx, 12, RULE_termino);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			factor();
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(100);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MULT:
						{
						setState(94);
						match(MULT);
						setState(95);
						factor();
						}
						break;
					case REST:
						{
						setState(96);
						match(REST);
						setState(97);
						factor();
						}
						break;
					case DIV:
						{
						setState(98);
						match(DIV);
						setState(99);
						factor();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 14, RULE_factor);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(OPENBRACKET);
				setState(106);
				exp_mat();
				setState(107);
				match(CLOSEDBRACKET);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(NUM);
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
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
		public Exp_logContext exp_log() {
			return getRuleContext(Exp_logContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_bool);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(FALSE);
				}
				break;
			case NEGT:
			case OPENBRACKET:
			case NUM:
			case VAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
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
		public ComparadorContext comparador() {
			return getRuleContext(ComparadorContext.class,0);
		}
		public List<TerminalNode> VAR() { return getTokens(RusticodeParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(RusticodeParser.VAR, i);
		}
		public List<TerminalNode> NUM() { return getTokens(RusticodeParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(RusticodeParser.NUM, i);
		}
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_exp_log, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case VAR:
				{
				setState(119);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(120);
				comparador();
				setState(121);
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
			case NEGT:
				{
				setState(123);
				match(NEGT);
				setState(124);
				match(OPENBRACKET);
				setState(125);
				exp_log(0);
				setState(126);
				match(CLOSEDBRACKET);
				}
				break;
			case OPENBRACKET:
				{
				setState(128);
				match(OPENBRACKET);
				setState(129);
				exp_log(0);
				setState(130);
				match(CLOSEDBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Exp_logContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp_log);
						setState(134);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(135);
						match(AND);
						setState(136);
						exp_log(7);
						}
						break;
					case 2:
						{
						_localctx = new Exp_logContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp_log);
						setState(137);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(138);
						match(OR);
						setState(139);
						exp_log(6);
						}
						break;
					case 3:
						{
						_localctx = new Exp_logContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp_log);
						setState(140);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(141);
						comparador();
						setState(142);
						exp_log(5);
						}
						break;
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
	public static class ComparadorContext extends ParserRuleContext {
		public TerminalNode HIGH() { return getToken(RusticodeParser.HIGH, 0); }
		public TerminalNode LESS() { return getToken(RusticodeParser.LESS, 0); }
		public TerminalNode HEQL() { return getToken(RusticodeParser.HEQL, 0); }
		public TerminalNode LEQL() { return getToken(RusticodeParser.LEQL, 0); }
		public TerminalNode EQUAL() { return getToken(RusticodeParser.EQUAL, 0); }
		public TerminalNode UNEQL() { return getToken(RusticodeParser.UNEQL, 0); }
		public ComparadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterComparador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitComparador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitComparador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparadorContext comparador() throws RecognitionException {
		ComparadorContext _localctx = new ComparadorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 333447168L) != 0)) ) {
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
	public static class If_sentenceContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(RusticodeParser.IF, 0); }
		public TerminalNode OPENBRACKET() { return getToken(RusticodeParser.OPENBRACKET, 0); }
		public Exp_logContext exp_log() {
			return getRuleContext(Exp_logContext.class,0);
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
		enterRule(_localctx, 22, RULE_if_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(IF);
			setState(152);
			match(OPENBRACKET);
			setState(153);
			exp_log(0);
			setState(154);
			match(CLOSEDBRACKET);
			setState(155);
			match(OPENKEY);
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156);
				sentencia();
				}
				}
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511639864L) != 0) );
			setState(161);
			match(CLOSEKEY);
			setState(162);
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
		public Exp_logContext exp_log() {
			return getRuleContext(Exp_logContext.class,0);
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
		enterRule(_localctx, 24, RULE_while_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(WHILE);
			setState(165);
			match(OPENBRACKET);
			setState(166);
			exp_log(0);
			setState(167);
			match(CLOSEDBRACKET);
			setState(168);
			match(OPENKEY);
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				sentencia();
				}
				}
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511639864L) != 0) );
			setState(174);
			match(CLOSEKEY);
			setState(175);
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
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
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
		enterRule(_localctx, 28, RULE_literal_value);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(CHAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return exp_log_sempred((Exp_logContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_log_sempred(Exp_logContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001*\u00b9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0004\u0000!\b\u0000\u000b\u0000\f\u0000\"\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001+\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u00029\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002?\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004G\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004P\b"+
		"\u0004\u0003\u0004R\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005Y\b\u0005\n\u0005\f\u0005\\\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006e\b\u0006\n\u0006\f\u0006h\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007p\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0003\bu\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0085\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0091\b\t\n\t\f\t\u0094\t\t"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u009e\b\u000b\u000b\u000b\f\u000b\u009f"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0004\f\u00ab\b\f\u000b\f\f\f\u00ac\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b7"+
		"\b\u000e\u0001\u000e\u0000\u0001\u0012\u000f\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0004\u0001"+
		"\u0000\u0003\u0005\u0002\u0000&&((\u0002\u0000\u0015\u0019\u001c\u001c"+
		"\u0001\u0000\b\n\u00c5\u0000\u001e\u0001\u0000\u0000\u0000\u0002*\u0001"+
		"\u0000\u0000\u0000\u0004>\u0001\u0000\u0000\u0000\u0006@\u0001\u0000\u0000"+
		"\u0000\bQ\u0001\u0000\u0000\u0000\nS\u0001\u0000\u0000\u0000\f]\u0001"+
		"\u0000\u0000\u0000\u000eo\u0001\u0000\u0000\u0000\u0010t\u0001\u0000\u0000"+
		"\u0000\u0012\u0084\u0001\u0000\u0000\u0000\u0014\u0095\u0001\u0000\u0000"+
		"\u0000\u0016\u0097\u0001\u0000\u0000\u0000\u0018\u00a4\u0001\u0000\u0000"+
		"\u0000\u001a\u00b1\u0001\u0000\u0000\u0000\u001c\u00b6\u0001\u0000\u0000"+
		"\u0000\u001e \u0005\u0006\u0000\u0000\u001f!\u0003\u0002\u0001\u0000 "+
		"\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0005"+
		"\u0007\u0000\u0000%\u0001\u0001\u0000\u0000\u0000&+\u0003\u0004\u0002"+
		"\u0000\'+\u0003\b\u0004\u0000(+\u0003\u0016\u000b\u0000)+\u0003\u0018"+
		"\f\u0000*&\u0001\u0000\u0000\u0000*\'\u0001\u0000\u0000\u0000*(\u0001"+
		"\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000"+
		",-\u0005!\u0000\u0000-\u0003\u0001\u0000\u0000\u0000./\u0003\u001a\r\u0000"+
		"/0\u0005 \u0000\u000001\u0005(\u0000\u00001?\u0001\u0000\u0000\u00002"+
		"3\u0003\u001a\r\u000034\u0005 \u0000\u000048\u0005(\u0000\u000056\u0005"+
		"\u0001\u0000\u000067\u0005&\u0000\u000079\u0005\u0002\u0000\u000085\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u00009?\u0001\u0000\u0000\u0000"+
		":;\u0003\u0006\u0003\u0000;<\u0005 \u0000\u0000<=\u0005(\u0000\u0000="+
		"?\u0001\u0000\u0000\u0000>.\u0001\u0000\u0000\u0000>2\u0001\u0000\u0000"+
		"\u0000>:\u0001\u0000\u0000\u0000?\u0005\u0001\u0000\u0000\u0000@A\u0007"+
		"\u0000\u0000\u0000A\u0007\u0001\u0000\u0000\u0000BC\u0005(\u0000\u0000"+
		"CF\u0005\u001e\u0000\u0000DG\u0003\u001c\u000e\u0000EG\u0003\n\u0005\u0000"+
		"FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000GR\u0001\u0000\u0000"+
		"\u0000HI\u0005(\u0000\u0000IJ\u0005\u0001\u0000\u0000JK\u0005&\u0000\u0000"+
		"KL\u0005\u0002\u0000\u0000LO\u0005\u001e\u0000\u0000MP\u0003\u001c\u000e"+
		"\u0000NP\u0003\n\u0005\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000"+
		"\u0000PR\u0001\u0000\u0000\u0000QB\u0001\u0000\u0000\u0000QH\u0001\u0000"+
		"\u0000\u0000R\t\u0001\u0000\u0000\u0000SZ\u0003\f\u0006\u0000TU\u0005"+
		"\u0011\u0000\u0000UY\u0003\f\u0006\u0000VW\u0005\u0012\u0000\u0000WY\u0003"+
		"\f\u0006\u0000XT\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y\\"+
		"\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[\u000b\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]f\u0003"+
		"\u000e\u0007\u0000^_\u0005\u0013\u0000\u0000_e\u0003\u000e\u0007\u0000"+
		"`a\u0005\u0012\u0000\u0000ae\u0003\u000e\u0007\u0000bc\u0005\u0014\u0000"+
		"\u0000ce\u0003\u000e\u0007\u0000d^\u0001\u0000\u0000\u0000d`\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\r\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000ij\u0005\"\u0000\u0000jk\u0003\n\u0005\u0000"+
		"kl\u0005#\u0000\u0000lp\u0001\u0000\u0000\u0000mp\u0005&\u0000\u0000n"+
		"p\u0005(\u0000\u0000oi\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"on\u0001\u0000\u0000\u0000p\u000f\u0001\u0000\u0000\u0000qu\u0005\u000f"+
		"\u0000\u0000ru\u0005\u0010\u0000\u0000su\u0003\u0012\t\u0000tq\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000u\u0011"+
		"\u0001\u0000\u0000\u0000vw\u0006\t\uffff\uffff\u0000wx\u0007\u0001\u0000"+
		"\u0000xy\u0003\u0014\n\u0000yz\u0007\u0001\u0000\u0000z\u0085\u0001\u0000"+
		"\u0000\u0000{|\u0005\u001d\u0000\u0000|}\u0005\"\u0000\u0000}~\u0003\u0012"+
		"\t\u0000~\u007f\u0005#\u0000\u0000\u007f\u0085\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\"\u0000\u0000\u0081\u0082\u0003\u0012\t\u0000\u0082"+
		"\u0083\u0005#\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084v\u0001"+
		"\u0000\u0000\u0000\u0084{\u0001\u0000\u0000\u0000\u0084\u0080\u0001\u0000"+
		"\u0000\u0000\u0085\u0092\u0001\u0000\u0000\u0000\u0086\u0087\n\u0006\u0000"+
		"\u0000\u0087\u0088\u0005\u001a\u0000\u0000\u0088\u0091\u0003\u0012\t\u0007"+
		"\u0089\u008a\n\u0005\u0000\u0000\u008a\u008b\u0005\u001b\u0000\u0000\u008b"+
		"\u0091\u0003\u0012\t\u0006\u008c\u008d\n\u0004\u0000\u0000\u008d\u008e"+
		"\u0003\u0014\n\u0000\u008e\u008f\u0003\u0012\t\u0005\u008f\u0091\u0001"+
		"\u0000\u0000\u0000\u0090\u0086\u0001\u0000\u0000\u0000\u0090\u0089\u0001"+
		"\u0000\u0000\u0000\u0090\u008c\u0001\u0000\u0000\u0000\u0091\u0094\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0013\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0007\u0002\u0000\u0000\u0096\u0015\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005\u000b\u0000\u0000\u0098\u0099\u0005"+
		"\"\u0000\u0000\u0099\u009a\u0003\u0012\t\u0000\u009a\u009b\u0005#\u0000"+
		"\u0000\u009b\u009d\u0005$\u0000\u0000\u009c\u009e\u0003\u0002\u0001\u0000"+
		"\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005%\u0000\u0000\u00a2"+
		"\u00a3\u0005\f\u0000\u0000\u00a3\u0017\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005\r\u0000\u0000\u00a5\u00a6\u0005\"\u0000\u0000\u00a6\u00a7\u0003"+
		"\u0012\t\u0000\u00a7\u00a8\u0005#\u0000\u0000\u00a8\u00aa\u0005$\u0000"+
		"\u0000\u00a9\u00ab\u0003\u0002\u0001\u0000\u00aa\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005%\u0000\u0000\u00af\u00b0\u0005\u000e\u0000\u0000"+
		"\u00b0\u0019\u0001\u0000\u0000\u0000\u00b1\u00b2\u0007\u0003\u0000\u0000"+
		"\u00b2\u001b\u0001\u0000\u0000\u0000\u00b3\u00b7\u0005&\u0000\u0000\u00b4"+
		"\u00b7\u0005\'\u0000\u0000\u00b5\u00b7\u0003\u0010\b\u0000\u00b6\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b7\u001d\u0001\u0000\u0000\u0000\u0013\"*"+
		"8>FOQXZdfot\u0084\u0090\u0092\u009f\u00ac\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}