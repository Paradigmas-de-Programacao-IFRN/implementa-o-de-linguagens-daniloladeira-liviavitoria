// Generated from ./src/plp/enquanto/parser/Enquanto.g4 by ANTLR 4.13.1
package plp.enquanto.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EnquantoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, BOOLEANO=42, INT=43, ID=44, TEXTO=45, Comentario=46, 
		Espaco=47;
	public static final int
		RULE_programa = 0, RULE_seqComando = 1, RULE_comando = 2, RULE_expressao = 3, 
		RULE_booleano = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "seqComando", "comando", "expressao", "booleano"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "':='", "';'", "'skip'", "'se'", "'entao'", "'senaose'", 
			"'senao'", "'enquanto'", "'faca'", "'repita'", "'vezes'", "'para'", "'de'", 
			"'ate'", "'escolha'", "'caso'", "':'", "'outro'", "'exiba'", "'escreva'", 
			"'{'", "'}'", "'leia'", "'^'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", 
			"'='", "'<='", "'<'", "'>='", "'>'", "'<>'", "'nao'", "'e'", "'ou'", 
			"'xor'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "BOOLEANO", "INT", "ID", "TEXTO", 
			"Comentario", "Espaco"
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
	public String getGrammarFileName() { return "Enquanto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EnquantoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public SeqComandoContext seqComando() {
			return getRuleContext(SeqComandoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			seqComando();
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
	public static class SeqComandoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public SeqComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqComando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSeqComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSeqComando(this);
		}
	}

	public final SeqComandoContext seqComando() throws RecognitionException {
		SeqComandoContext _localctx = new SeqComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_seqComando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				comando();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17592193460784L) != 0) );
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
	public static class ComandoContext extends ParserRuleContext {
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	 
		public ComandoContext() { }
		public void copyFrom(ComandoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ComandoContext {
		public List<TerminalNode> ID() { return getTokens(EnquantoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EnquantoParser.ID, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public AtribuicaoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitAtribuicao(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SeContext extends ComandoContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public SeContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSe(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EscolhaContext extends ComandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(EnquantoParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EnquantoParser.INT, i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public EscolhaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterEscolha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitEscolha(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnquantoContext extends ComandoContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public EnquantoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitEnquanto(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParaContext extends ComandoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ParaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitPara(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepitaContext extends ComandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public RepitaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterRepita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitRepita(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ComandoContext {
		public SeqComandoContext seqComando() {
			return getRuleContext(SeqComandoContext.class,0);
		}
		public BlocoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitBloco(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EscrevaContext extends ComandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public EscrevaContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitEscreva(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExibaExpContext extends ComandoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExibaExpContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterExibaExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitExibaExp(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipContext extends ComandoContext {
		public SkipContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitSkip(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExibaTextoContext extends ComandoContext {
		public TerminalNode TEXTO() { return getToken(EnquantoParser.TEXTO, 0); }
		public ExibaTextoContext(ComandoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterExibaTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitExibaTexto(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comando);
		int _la;
		try {
			int _alt;
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new AtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(ID);
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(18);
					match(T__0);
					setState(19);
					match(ID);
					}
					}
					setState(24);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(25);
				match(T__1);
				setState(26);
				expressao(0);
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(27);
					match(T__0);
					setState(28);
					expressao(0);
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(34);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new SkipContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(T__3);
				setState(37);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new SeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(T__4);
				setState(39);
				booleano(0);
				setState(40);
				match(T__5);
				setState(41);
				comando();
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(42);
						match(T__6);
						setState(43);
						booleano(0);
						setState(44);
						match(T__5);
						setState(45);
						comando();
						}
						} 
					}
					setState(51);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(52);
					match(T__7);
					setState(53);
					comando();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new EnquantoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(T__8);
				setState(57);
				booleano(0);
				setState(58);
				match(T__9);
				setState(59);
				comando();
				}
				break;
			case 5:
				_localctx = new RepitaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				match(T__10);
				setState(62);
				expressao(0);
				setState(63);
				match(T__11);
				setState(64);
				comando();
				}
				break;
			case 6:
				_localctx = new ParaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				match(T__12);
				setState(67);
				match(ID);
				setState(68);
				match(T__13);
				setState(69);
				expressao(0);
				setState(70);
				match(T__14);
				setState(71);
				expressao(0);
				setState(72);
				match(T__9);
				setState(73);
				comando();
				}
				break;
			case 7:
				_localctx = new EscolhaContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(75);
				match(T__15);
				setState(76);
				expressao(0);
				setState(81); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(77);
						match(T__16);
						setState(78);
						match(INT);
						setState(79);
						match(T__17);
						setState(80);
						comando();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(83); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(85);
					match(T__18);
					setState(86);
					match(T__17);
					setState(87);
					comando();
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new ExibaTextoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(90);
				match(T__19);
				setState(91);
				match(TEXTO);
				setState(92);
				match(T__2);
				}
				break;
			case 9:
				_localctx = new ExibaExpContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(93);
				match(T__19);
				setState(94);
				expressao(0);
				setState(95);
				match(T__2);
				}
				break;
			case 10:
				_localctx = new EscrevaContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(97);
				match(T__20);
				setState(98);
				expressao(0);
				setState(99);
				match(T__2);
				}
				break;
			case 11:
				_localctx = new BlocoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(101);
				match(T__21);
				setState(102);
				seqComando();
				setState(103);
				match(T__22);
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
	public static class ExpressaoContext extends ParserRuleContext {
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	 
		public ExpressaoContext() { }
		public void copyFrom(ExpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeiaContext extends ExpressaoContext {
		public LeiaContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitLeia(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InteiroContext extends ExpressaoContext {
		public TerminalNode INT() { return getToken(EnquantoParser.INT, 0); }
		public InteiroContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitInteiro(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpBinContext extends ExpressaoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OpBinContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterOpBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitOpBin(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExpressaoContext {
		public TerminalNode ID() { return getToken(EnquantoParser.ID, 0); }
		public IdContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitId(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpParContext extends ExpressaoContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExpParContext(ExpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterExpPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitExpPar(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		return expressao(0);
	}

	private ExpressaoContext expressao(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, _parentState);
		ExpressaoContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expressao, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new InteiroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(108);
				match(INT);
				}
				break;
			case T__23:
				{
				_localctx = new LeiaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(T__23);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(ID);
				}
				break;
			case T__29:
				{
				_localctx = new ExpParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(T__29);
				setState(112);
				expressao(0);
				setState(113);
				match(T__30);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(117);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(118);
						match(T__24);
						setState(119);
						expressao(5);
						}
						break;
					case 2:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(120);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(121);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(122);
						expressao(4);
						}
						break;
					case 3:
						{
						_localctx = new OpBinContext(new ExpressaoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressao);
						setState(123);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(124);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(125);
						expressao(3);
						}
						break;
					}
					} 
				}
				setState(130);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanoContext extends ParserRuleContext {
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
	 
		public BooleanoContext() { }
		public void copyFrom(BooleanoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends BooleanoContext {
		public TerminalNode BOOLEANO() { return getToken(EnquantoParser.BOOLEANO, 0); }
		public BoolContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitBool(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ELogicoContext extends BooleanoContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public ELogicoContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterELogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitELogico(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XorLogicoContext extends BooleanoContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public XorLogicoContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterXorLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitXorLogico(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NaoLogicoContext extends BooleanoContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public NaoLogicoContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterNaoLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitNaoLogico(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpRelContext extends BooleanoContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public OpRelContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterOpRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitOpRel(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolParContext extends BooleanoContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public BoolParContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterBoolPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitBoolPar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OuLogicoContext extends BooleanoContext {
		public List<BooleanoContext> booleano() {
			return getRuleContexts(BooleanoContext.class);
		}
		public BooleanoContext booleano(int i) {
			return getRuleContext(BooleanoContext.class,i);
		}
		public OuLogicoContext(BooleanoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).enterOuLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnquantoListener ) ((EnquantoListener)listener).exitOuLogico(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		return booleano(0);
	}

	private BooleanoContext booleano(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanoContext _localctx = new BooleanoContext(_ctx, _parentState);
		BooleanoContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_booleano, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(132);
				match(BOOLEANO);
				}
				break;
			case 2:
				{
				_localctx = new OpRelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				expressao(0);
				setState(134);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 270582939648L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(135);
				expressao(0);
				}
				break;
			case 3:
				{
				_localctx = new NaoLogicoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(T__37);
				setState(138);
				booleano(5);
				}
				break;
			case 4:
				{
				_localctx = new BoolParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(T__29);
				setState(140);
				booleano(0);
				setState(141);
				match(T__30);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(154);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ELogicoContext(new BooleanoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleano);
						setState(145);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(146);
						match(T__38);
						setState(147);
						booleano(5);
						}
						break;
					case 2:
						{
						_localctx = new OuLogicoContext(new BooleanoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleano);
						setState(148);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(149);
						match(T__39);
						setState(150);
						booleano(4);
						}
						break;
					case 3:
						{
						_localctx = new XorLogicoContext(new BooleanoContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_booleano);
						setState(151);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(152);
						match(T__40);
						setState(153);
						booleano(3);
						}
						break;
					}
					} 
				}
				setState(158);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expressao_sempred((ExpressaoContext)_localctx, predIndex);
		case 4:
			return booleano_sempred((BooleanoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressao_sempred(ExpressaoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleano_sempred(BooleanoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u00a0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u000e\b\u0001\u000b\u0001\f"+
		"\u0001\u000f\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0015\b\u0002"+
		"\n\u0002\f\u0002\u0018\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u001e\b\u0002\n\u0002\f\u0002!\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u00020\b\u0002\n\u0002\f\u00023\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00027\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0004\u0002R\b\u0002\u000b\u0002"+
		"\f\u0002S\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002Y\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002j\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003t\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u007f\b\u0003\n\u0003\f\u0003\u0082\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0090\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u009b\b\u0004\n\u0004"+
		"\f\u0004\u009e\t\u0004\u0001\u0004\u0000\u0002\u0006\b\u0005\u0000\u0002"+
		"\u0004\u0006\b\u0000\u0003\u0001\u0000\u001a\u001b\u0001\u0000\u001c\u001d"+
		"\u0001\u0000 %\u00b7\u0000\n\u0001\u0000\u0000\u0000\u0002\r\u0001\u0000"+
		"\u0000\u0000\u0004i\u0001\u0000\u0000\u0000\u0006s\u0001\u0000\u0000\u0000"+
		"\b\u008f\u0001\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b"+
		"\u0001\u0001\u0000\u0000\u0000\f\u000e\u0003\u0004\u0002\u0000\r\f\u0001"+
		"\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000"+
		"\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0003\u0001\u0000"+
		"\u0000\u0000\u0011\u0016\u0005,\u0000\u0000\u0012\u0013\u0005\u0001\u0000"+
		"\u0000\u0013\u0015\u0005,\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000"+
		"\u0015\u0018\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0019\u0001\u0000\u0000\u0000"+
		"\u0018\u0016\u0001\u0000\u0000\u0000\u0019\u001a\u0005\u0002\u0000\u0000"+
		"\u001a\u001f\u0003\u0006\u0003\u0000\u001b\u001c\u0005\u0001\u0000\u0000"+
		"\u001c\u001e\u0003\u0006\u0003\u0000\u001d\u001b\u0001\u0000\u0000\u0000"+
		"\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000\"#\u0005\u0003\u0000\u0000#j\u0001\u0000\u0000\u0000$%\u0005"+
		"\u0004\u0000\u0000%j\u0005\u0003\u0000\u0000&\'\u0005\u0005\u0000\u0000"+
		"\'(\u0003\b\u0004\u0000()\u0005\u0006\u0000\u0000)1\u0003\u0004\u0002"+
		"\u0000*+\u0005\u0007\u0000\u0000+,\u0003\b\u0004\u0000,-\u0005\u0006\u0000"+
		"\u0000-.\u0003\u0004\u0002\u0000.0\u0001\u0000\u0000\u0000/*\u0001\u0000"+
		"\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000026\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"45\u0005\b\u0000\u000057\u0003\u0004\u0002\u000064\u0001\u0000\u0000\u0000"+
		"67\u0001\u0000\u0000\u00007j\u0001\u0000\u0000\u000089\u0005\t\u0000\u0000"+
		"9:\u0003\b\u0004\u0000:;\u0005\n\u0000\u0000;<\u0003\u0004\u0002\u0000"+
		"<j\u0001\u0000\u0000\u0000=>\u0005\u000b\u0000\u0000>?\u0003\u0006\u0003"+
		"\u0000?@\u0005\f\u0000\u0000@A\u0003\u0004\u0002\u0000Aj\u0001\u0000\u0000"+
		"\u0000BC\u0005\r\u0000\u0000CD\u0005,\u0000\u0000DE\u0005\u000e\u0000"+
		"\u0000EF\u0003\u0006\u0003\u0000FG\u0005\u000f\u0000\u0000GH\u0003\u0006"+
		"\u0003\u0000HI\u0005\n\u0000\u0000IJ\u0003\u0004\u0002\u0000Jj\u0001\u0000"+
		"\u0000\u0000KL\u0005\u0010\u0000\u0000LQ\u0003\u0006\u0003\u0000MN\u0005"+
		"\u0011\u0000\u0000NO\u0005+\u0000\u0000OP\u0005\u0012\u0000\u0000PR\u0003"+
		"\u0004\u0002\u0000QM\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TX\u0001\u0000\u0000"+
		"\u0000UV\u0005\u0013\u0000\u0000VW\u0005\u0012\u0000\u0000WY\u0003\u0004"+
		"\u0002\u0000XU\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Yj\u0001"+
		"\u0000\u0000\u0000Z[\u0005\u0014\u0000\u0000[\\\u0005-\u0000\u0000\\j"+
		"\u0005\u0003\u0000\u0000]^\u0005\u0014\u0000\u0000^_\u0003\u0006\u0003"+
		"\u0000_`\u0005\u0003\u0000\u0000`j\u0001\u0000\u0000\u0000ab\u0005\u0015"+
		"\u0000\u0000bc\u0003\u0006\u0003\u0000cd\u0005\u0003\u0000\u0000dj\u0001"+
		"\u0000\u0000\u0000ef\u0005\u0016\u0000\u0000fg\u0003\u0002\u0001\u0000"+
		"gh\u0005\u0017\u0000\u0000hj\u0001\u0000\u0000\u0000i\u0011\u0001\u0000"+
		"\u0000\u0000i$\u0001\u0000\u0000\u0000i&\u0001\u0000\u0000\u0000i8\u0001"+
		"\u0000\u0000\u0000i=\u0001\u0000\u0000\u0000iB\u0001\u0000\u0000\u0000"+
		"iK\u0001\u0000\u0000\u0000iZ\u0001\u0000\u0000\u0000i]\u0001\u0000\u0000"+
		"\u0000ia\u0001\u0000\u0000\u0000ie\u0001\u0000\u0000\u0000j\u0005\u0001"+
		"\u0000\u0000\u0000kl\u0006\u0003\uffff\uffff\u0000lt\u0005+\u0000\u0000"+
		"mt\u0005\u0018\u0000\u0000nt\u0005,\u0000\u0000op\u0005\u001e\u0000\u0000"+
		"pq\u0003\u0006\u0003\u0000qr\u0005\u001f\u0000\u0000rt\u0001\u0000\u0000"+
		"\u0000sk\u0001\u0000\u0000\u0000sm\u0001\u0000\u0000\u0000sn\u0001\u0000"+
		"\u0000\u0000so\u0001\u0000\u0000\u0000t\u0080\u0001\u0000\u0000\u0000"+
		"uv\n\u0004\u0000\u0000vw\u0005\u0019\u0000\u0000w\u007f\u0003\u0006\u0003"+
		"\u0005xy\n\u0003\u0000\u0000yz\u0007\u0000\u0000\u0000z\u007f\u0003\u0006"+
		"\u0003\u0004{|\n\u0002\u0000\u0000|}\u0007\u0001\u0000\u0000}\u007f\u0003"+
		"\u0006\u0003\u0003~u\u0001\u0000\u0000\u0000~x\u0001\u0000\u0000\u0000"+
		"~{\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0007"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0006\u0004\uffff\uffff\u0000\u0084\u0090\u0005*\u0000\u0000\u0085\u0086"+
		"\u0003\u0006\u0003\u0000\u0086\u0087\u0007\u0002\u0000\u0000\u0087\u0088"+
		"\u0003\u0006\u0003\u0000\u0088\u0090\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0005&\u0000\u0000\u008a\u0090\u0003\b\u0004\u0005\u008b\u008c\u0005"+
		"\u001e\u0000\u0000\u008c\u008d\u0003\b\u0004\u0000\u008d\u008e\u0005\u001f"+
		"\u0000\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f\u0083\u0001\u0000"+
		"\u0000\u0000\u008f\u0085\u0001\u0000\u0000\u0000\u008f\u0089\u0001\u0000"+
		"\u0000\u0000\u008f\u008b\u0001\u0000\u0000\u0000\u0090\u009c\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\n\u0004\u0000\u0000\u0092\u0093\u0005\'\u0000"+
		"\u0000\u0093\u009b\u0003\b\u0004\u0005\u0094\u0095\n\u0003\u0000\u0000"+
		"\u0095\u0096\u0005(\u0000\u0000\u0096\u009b\u0003\b\u0004\u0004\u0097"+
		"\u0098\n\u0002\u0000\u0000\u0098\u0099\u0005)\u0000\u0000\u0099\u009b"+
		"\u0003\b\u0004\u0003\u009a\u0091\u0001\u0000\u0000\u0000\u009a\u0094\u0001"+
		"\u0000\u0000\u0000\u009a\u0097\u0001\u0000\u0000\u0000\u009b\u009e\u0001"+
		"\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001"+
		"\u0000\u0000\u0000\u009d\t\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000"+
		"\u0000\u0000\u000e\u000f\u0016\u001f16SXis~\u0080\u008f\u009a\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}