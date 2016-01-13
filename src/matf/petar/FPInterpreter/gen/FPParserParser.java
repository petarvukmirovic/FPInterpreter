// Generated from /home/petar/IdeaProjects/FPInterpreter/src/grammar/FPParser.g4 by ANTLR 4.5.1
package matf.petar.FPInterpreter.gen;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FPParserParser extends Parser {
	public static final int
			T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
			T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
			T__17 = 18, T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24,
			T__24 = 25, T__25 = 26, T__26 = 27, T__27 = 28, T__28 = 29, T__29 = 30, T__30 = 31,
			T__31 = 32, T__32 = 33, T__33 = 34, COMMENT = 35, DOT = 36, FUN_ID = 37, NUM = 38, BOOL = 39,
			WS = 40;
	public static final int
			RULE_program = 0, RULE_definition = 1, RULE_expression = 2, RULE_functional_form = 3,
			RULE_construction = 4, RULE_conditional = 5, RULE_constant = 6, RULE_function = 7,
		RULE_built_in_function = 8, RULE_atom = 9, RULE_list = 10;
	public static final String[] ruleNames = {
			"program", "definition", "expression", "functional_form", "construction",
		"conditional", "constant", "function", "built_in_function", "atom", "list"
	};
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
			"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u0082\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
					"\13\4\f\t\f\3\2\3\2\6\2\33\n\2\r\2\16\2\34\3\3\3\3\3\3\3\3\3\3\3\4\3\4" +
					"\3\4\3\4\3\4\5\4)\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5" +
					"\3\5\3\5\3\5\5\5:\n\5\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13\5\3\6\3\6\3\6" +
					"\3\6\7\6H\n\6\f\6\16\6K\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3" +
					"\b\3\b\3\b\3\t\3\t\5\t\\\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3" +
					"\n\3\n\3\n\3\n\3\n\5\nm\n\n\3\13\3\13\3\13\5\13r\n\13\3\f\3\f\3\f\3\f" +
					"\3\f\7\fy\n\f\f\f\16\f|\13\f\3\f\3\f\5\f\u0080\n\f\3\f\2\3\b\r\2\4\6\b" +
					"\n\f\16\20\22\24\26\2\3\3\2\27\32\u0095\2\32\3\2\2\2\4\36\3\2\2\2\6(\3" +
					"\2\2\2\b9\3\2\2\2\nC\3\2\2\2\fN\3\2\2\2\16V\3\2\2\2\20[\3\2\2\2\22l\3" +
					"\2\2\2\24q\3\2\2\2\26\177\3\2\2\2\30\33\5\4\3\2\31\33\5\6\4\2\32\30\3" +
					"\2\2\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\3\3" +
					"\2\2\2\36\37\7\3\2\2\37 \7\'\2\2 !\7\4\2\2!\"\5\b\5\2\"\5\3\2\2\2#$\5" +
					"\b\5\2$%\7\5\2\2%&\5\6\4\2&)\3\2\2\2\')\5\24\13\2(#\3\2\2\2(\'\3\2\2\2" +
					")\7\3\2\2\2*+\b\5\1\2+,\7\6\2\2,:\5\b\5\13-.\7\7\2\2.:\5\b\5\n/\60\7\b" +
					"\2\2\60:\5\b\5\t\61:\5\n\6\2\62:\5\f\7\2\63:\5\16\b\2\64\65\7\t\2\2\65" +
					"\66\5\b\5\2\66\67\7\n\2\2\67:\3\2\2\28:\5\20\t\29*\3\2\2\29-\3\2\2\29" +
					"/\3\2\2\29\61\3\2\2\29\62\3\2\2\29\63\3\2\2\29\64\3\2\2\298\3\2\2\2:@" +
					"\3\2\2\2;<\f\4\2\2<=\7&\2\2=?\5\b\5\5>;\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A" +
					"\3\2\2\2A\t\3\2\2\2B@\3\2\2\2CD\7\13\2\2DI\5\b\5\2EF\7\f\2\2FH\5\b\5\2" +
					"GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\r\2\2" +
					"M\13\3\2\2\2NO\7\t\2\2OP\5\b\5\2PQ\7\16\2\2QR\5\b\5\2RS\7\17\2\2ST\5\b" +
					"\5\2TU\7\n\2\2U\r\3\2\2\2VW\7\20\2\2WX\7(\2\2X\17\3\2\2\2Y\\\5\22\n\2" +
					"Z\\\7\'\2\2[Y\3\2\2\2[Z\3\2\2\2\\\21\3\2\2\2]m\7(\2\2^m\7\21\2\2_m\7\22" +
					"\2\2`m\7\23\2\2am\7\24\2\2bm\7\25\2\2cm\7\26\2\2dm\t\2\2\2em\7\33\2\2" +
					"fm\7\34\2\2gm\7\35\2\2hm\7\36\2\2im\7\37\2\2jm\7 \2\2km\7!\2\2l]\3\2\2" +
					"\2l^\3\2\2\2l_\3\2\2\2l`\3\2\2\2la\3\2\2\2lb\3\2\2\2lc\3\2\2\2ld\3\2\2" +
					"\2le\3\2\2\2lf\3\2\2\2lg\3\2\2\2lh\3\2\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2" +
					"\2m\23\3\2\2\2nr\7(\2\2or\7)\2\2pr\5\26\f\2qn\3\2\2\2qo\3\2\2\2qp\3\2" +
					"\2\2r\25\3\2\2\2s\u0080\7\"\2\2tu\7#\2\2uz\5\24\13\2vw\7\f\2\2wy\5\24" +
					"\13\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7" +
					"$\2\2~\u0080\3\2\2\2\177s\3\2\2\2\177t\3\2\2\2\u0080\27\3\2\2\2\r\32\34" +
					"(9@I[lqz\177";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = {
			null, "'DEF'", "'='", "':'", "'APPLY-ALL'", "'INSERT-LEFT'", "'INSERT-RIGHT'",
			"'('", "')'", "'['", "','", "']'", "'->'", "';'", "'~'", "'tail'", "'id'",
			"'eq'", "'eq0'", "'gt'", "'ge'", "'*'", "'/'", "'+'", "'-'", "'a'", "'s'",
			"'apndl'", "'apndr'", "'distl'", "'distr'", "'iota'", "'<>'", "'<'", "'>'",
			null, "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null, null,
			null, null, null, null, null, null, null, null, null, null, null, "COMMENT",
			"DOT", "FUN_ID", "NUM", "BOOL", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	static {
		RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
	}

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

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

	public FPParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
	public String getGrammarFileName() { return "FPParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(24);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(22);
					definition();
					}
					break;
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__8:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case FUN_ID:
				case NUM:
				case BOOL:
					{
					setState(23);
					expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << FUN_ID) | (1L << NUM) | (1L << BOOL))) != 0) );
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

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(29);
			match(FUN_ID);
			setState(30);
			match(T__1);
			setState(31);
			functional_form(0);
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

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(38);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				functional_form(0);
				setState(34);
				match(T__2);
				setState(35);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				atom();
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

	public final Functional_formContext functional_form() throws RecognitionException {
		return functional_form(0);
	}

	private Functional_formContext functional_form(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Functional_formContext _localctx = new Functional_formContext(_ctx, _parentState);
		Functional_formContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_functional_form, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new ApplyAllContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(41);
				match(T__3);
				setState(42);
				functional_form(9);
				}
				break;
			case 2:
				{
				_localctx = new InsertLeftContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				match(T__4);
				setState(44);
				functional_form(8);
				}
				break;
			case 3:
				{
				_localctx = new InsertRightContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				match(T__5);
				setState(46);
				functional_form(7);
				}
				break;
			case 4:
				{
				_localctx = new ConstructionLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				construction();
				}
				break;
			case 5:
				{
				_localctx = new ConditionalLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				conditional();
				}
				break;
			case 6:
				{
				_localctx = new ConstantLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(49);
				constant();
				}
				break;
			case 7:
				{
				_localctx = new ParenthsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(T__6);
				setState(51);
				functional_form(0);
				setState(52);
				match(T__7);
				}
				break;
			case 8:
				{
				_localctx = new ElementaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CompositionContext(new Functional_formContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_functional_form);
					setState(57);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(58);
					match(DOT);
					setState(59);
					functional_form(3);
					}
					}
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public final ConstructionContext construction() throws RecognitionException {
		ConstructionContext _localctx = new ConstructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_construction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__8);
			setState(66);
			functional_form(0);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(67);
				match(T__9);
				setState(68);
				functional_form(0);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(T__10);
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

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__6);
			setState(77);
			functional_form(0);
			setState(78);
			match(T__11);
			setState(79);
			functional_form(0);
			setState(80);
			match(T__12);
			setState(81);
			functional_form(0);
			setState(82);
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

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__13);
			setState(85);
			match(NUM);
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

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function);
		try {
			setState(89);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				built_in_function();
				}
				break;
			case FUN_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(FUN_ID);
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

	public final Built_in_functionContext built_in_function() throws RecognitionException {
		Built_in_functionContext _localctx = new Built_in_functionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_built_in_function);
		int _la;
		try {
			setState(106);
			switch (_input.LA(1)) {
				case NUM:
					_localctx = new NumContext(_localctx);
					enterOuterAlt(_localctx, 1);
				{
					setState(91);
					match(NUM);
				}
				break;
				case T__14:
					_localctx = new TailContext(_localctx);
					enterOuterAlt(_localctx, 2);
				{
					setState(92);
					match(T__14);
				}
				break;
				case T__15:
					_localctx = new IdContext(_localctx);
					enterOuterAlt(_localctx, 3);
				{
					setState(93);
					match(T__15);
				}
				break;
				case T__16:
					_localctx = new EqContext(_localctx);
					enterOuterAlt(_localctx, 4);
				{
					setState(94);
					match(T__16);
				}
				break;
				case T__17:
					_localctx = new Eq0Context(_localctx);
					enterOuterAlt(_localctx, 5);
				{
					setState(95);
					match(T__17);
				}
				break;
				case T__18:
					_localctx = new GtContext(_localctx);
					enterOuterAlt(_localctx, 6);
				{
					setState(96);
					match(T__18);
				}
				break;
				case T__19:
					_localctx = new GeContext(_localctx);
					enterOuterAlt(_localctx, 7);
				{
					setState(97);
					match(T__19);
				}
				break;
				case T__20:
				case T__21:
				case T__22:
				case T__23:
					_localctx = new ArithmeticContext(_localctx);
					enterOuterAlt(_localctx, 8);
				{
					setState(98);
					_la = _input.LA(1);
					if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0))) {
						_errHandler.recoverInline(this);
					} else {
						consume();
				}
				}
				break;
				case T__24:
					_localctx = new AContext(_localctx);
					enterOuterAlt(_localctx, 9);
				{
					setState(99);
					match(T__24);
				}
				break;
				case T__25:
					_localctx = new SContext(_localctx);
					enterOuterAlt(_localctx, 10);
				{
					setState(100);
					match(T__25);
				}
				break;
				case T__26:
					_localctx = new ApndlContext(_localctx);
					enterOuterAlt(_localctx, 11);
				{
					setState(101);
					match(T__26);
				}
				break;
				case T__27:
					_localctx = new ApndrContext(_localctx);
					enterOuterAlt(_localctx, 12);
				{
					setState(102);
					match(T__27);
				}
				break;
				case T__28:
					_localctx = new DistlContext(_localctx);
					enterOuterAlt(_localctx, 13);
				{
					setState(103);
					match(T__28);
				}
				break;
				case T__29:
					_localctx = new DistrContext(_localctx);
					enterOuterAlt(_localctx, 14);
				{
					setState(104);
					match(T__29);
				}
				break;
				case T__30:
					_localctx = new IotaContext(_localctx);
					enterOuterAlt(_localctx, 15);
				{
					setState(105);
					match(T__30);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atom);
		try {
			setState(111);
			switch (_input.LA(1)) {
				case NUM:
					enterOuterAlt(_localctx, 1);
				{
					setState(108);
					match(NUM);
				}
				break;
				case BOOL:
					enterOuterAlt(_localctx, 2);
				{
					setState(109);
					match(BOOL);
				}
				break;
				case T__31:
				case T__32:
					enterOuterAlt(_localctx, 3);
				{
					setState(110);
					list();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_list);
		int _la;
		try {
			setState(125);
			switch (_input.LA(1)) {
				case T__31:
					enterOuterAlt(_localctx, 1);
				{
					setState(113);
					match(T__31);
				}
				break;
				case T__32:
					enterOuterAlt(_localctx, 2);
				{
					setState(114);
					match(T__32);
					setState(115);
					atom();
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == T__9) {
						{
							{
								setState(116);
								match(T__9);
								setState(117);
								atom();
							}
						}
						setState(122);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(123);
					match(T__33);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 3:
				return functional_form_sempred((Functional_formContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean functional_form_sempred(Functional_formContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return precpred(_ctx, 2);
		}
		return true;
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}

		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class, i);
		}

		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}

		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_program;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof FPParserVisitor) return ((FPParserVisitor<? extends T>) visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class DefinitionContext extends ParserRuleContext {
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode FUN_ID() {
			return getToken(FPParserParser.FUN_ID, 0);
		}

		public Functional_formContext functional_form() {
			return getRuleContext(Functional_formContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_definition;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof FPParserVisitor)
				return ((FPParserVisitor<? extends T>) visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Functional_formContext functional_form() {
			return getRuleContext(Functional_formContext.class, 0);
		}

		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class, 0);
		}

		public AtomContext atom() {
			return getRuleContext(AtomContext.class, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expression;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof FPParserVisitor)
				return ((FPParserVisitor<? extends T>) visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Functional_formContext extends ParserRuleContext {
		public Functional_formContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Functional_formContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_functional_form;
		}

		public void copyFrom(Functional_formContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class ConstructionLabelContext extends Functional_formContext {
		public ConstructionLabelContext(Functional_formContext ctx) {
			copyFrom(ctx);
		}

		public ConstructionContext construction() {
			return getRuleContext(ConstructionContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).enterConstructionLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).exitConstructionLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof FPParserVisitor)
				return ((FPParserVisitor<? extends T>) visitor).visitConstructionLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class InsertLeftContext extends Functional_formContext {
		public InsertLeftContext(Functional_formContext ctx) {
			copyFrom(ctx);
		}

		public Functional_formContext functional_form() {
			return getRuleContext(Functional_formContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).enterInsertLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).exitInsertLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof FPParserVisitor)
				return ((FPParserVisitor<? extends T>) visitor).visitInsertLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ConstantLabelContext extends Functional_formContext {
		public ConstantLabelContext(Functional_formContext ctx) {
			copyFrom(ctx);
		}

		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).enterConstantLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).exitConstantLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof FPParserVisitor)
				return ((FPParserVisitor<? extends T>) visitor).visitConstantLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class CompositionContext extends Functional_formContext {
		public CompositionContext(Functional_formContext ctx) {
			copyFrom(ctx);
		}

		public List<Functional_formContext> functional_form() {
			return getRuleContexts(Functional_formContext.class);
		}

		public Functional_formContext functional_form(int i) {
			return getRuleContext(Functional_formContext.class, i);
		}

		public TerminalNode DOT() {
			return getToken(FPParserParser.DOT, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).enterComposition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).exitComposition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof FPParserVisitor)
				return ((FPParserVisitor<? extends T>) visitor).visitComposition(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ApplyAllContext extends Functional_formContext {
		public ApplyAllContext(Functional_formContext ctx) {
			copyFrom(ctx);
		}

		public Functional_formContext functional_form() {
			return getRuleContext(Functional_formContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).enterApplyAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).exitApplyAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof FPParserVisitor) return ((FPParserVisitor<? extends T>) visitor).visitApplyAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ConditionalLabelContext extends Functional_formContext {
		public ConditionalLabelContext(Functional_formContext ctx) {
			copyFrom(ctx);
		}

		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).enterConditionalLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).exitConditionalLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof FPParserVisitor)
				return ((FPParserVisitor<? extends T>) visitor).visitConditionalLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ElementaryContext extends Functional_formContext {
		public ElementaryContext(Functional_formContext ctx) {
			copyFrom(ctx);
		}

		public FunctionContext function() {
			return getRuleContext(FunctionContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).enterElementary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).exitElementary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof FPParserVisitor)
				return ((FPParserVisitor<? extends T>) visitor).visitElementary(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class InsertRightContext extends Functional_formContext {
		public InsertRightContext(Functional_formContext ctx) {
			copyFrom(ctx);
		}

		public Functional_formContext functional_form() {
			return getRuleContext(Functional_formContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).enterInsertRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).exitInsertRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof FPParserVisitor)
				return ((FPParserVisitor<? extends T>) visitor).visitInsertRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ParenthsContext extends Functional_formContext {
		public ParenthsContext(Functional_formContext ctx) {
			copyFrom(ctx);
		}

		public Functional_formContext functional_form() {
			return getRuleContext(Functional_formContext.class, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).enterParenths(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).exitParenths(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof FPParserVisitor) return ((FPParserVisitor<? extends T>) visitor).visitParenths(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ConstructionContext extends ParserRuleContext {
		public ConstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<Functional_formContext> functional_form() {
			return getRuleContexts(Functional_formContext.class);
		}

		public Functional_formContext functional_form(int i) {
			return getRuleContext(Functional_formContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_construction;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).enterConstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).exitConstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof FPParserVisitor)
				return ((FPParserVisitor<? extends T>) visitor).visitConstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ConditionalContext extends ParserRuleContext {
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<Functional_formContext> functional_form() {
			return getRuleContexts(Functional_formContext.class);
		}

		public Functional_formContext functional_form(int i) {
			return getRuleContext(Functional_formContext.class, i);
		}

		@Override
		public int getRuleIndex() {
			return RULE_conditional;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof FPParserVisitor)
				return ((FPParserVisitor<? extends T>) visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode NUM() {
			return getToken(FPParserParser.NUM, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_constant;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof FPParserVisitor) return ((FPParserVisitor<? extends T>) visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Built_in_functionContext built_in_function() {
			return getRuleContext(Built_in_functionContext.class, 0);
		}

		public TerminalNode FUN_ID() {
			return getToken(FPParserParser.FUN_ID, 0);
		}

		@Override
		public int getRuleIndex() {
			return RULE_function;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof FPParserListener) ((FPParserListener) listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof FPParserVisitor) return ((FPParserVisitor<? extends T>) visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Built_in_functionContext extends ParserRuleContext {
		public Built_in_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public Built_in_functionContext() {
		}

		@Override
		public int getRuleIndex() {
			return RULE_built_in_function;
		}

		public void copyFrom(Built_in_functionContext ctx) {
			super.copyFrom(ctx);
		}
	}

	public static class AContext extends Built_in_functionContext {
		public AContext(Built_in_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).exitA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPParserVisitor ) return ((FPParserVisitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class IotaContext extends Built_in_functionContext {
		public IotaContext(Built_in_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).enterIota(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).exitIota(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPParserVisitor ) return ((FPParserVisitor<? extends T>)visitor).visitIota(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class Eq0Context extends Built_in_functionContext {
		public Eq0Context(Built_in_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).enterEq0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).exitEq0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPParserVisitor ) return ((FPParserVisitor<? extends T>)visitor).visitEq0(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class TailContext extends Built_in_functionContext {
		public TailContext(Built_in_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).enterTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).exitTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPParserVisitor ) return ((FPParserVisitor<? extends T>)visitor).visitTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ApndrContext extends Built_in_functionContext {
		public ApndrContext(Built_in_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).enterApndr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).exitApndr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPParserVisitor ) return ((FPParserVisitor<? extends T>)visitor).visitApndr(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class NumContext extends Built_in_functionContext {
		public NumContext(Built_in_functionContext ctx) {
			copyFrom(ctx);
		}

		public TerminalNode NUM() {
			return getToken(FPParserParser.NUM, 0);
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPParserVisitor ) return ((FPParserVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ArithmeticContext extends Built_in_functionContext {
		public ArithmeticContext(Built_in_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).enterArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).exitArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPParserVisitor ) return ((FPParserVisitor<? extends T>)visitor).visitArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class EqContext extends Built_in_functionContext {
		public EqContext(Built_in_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPParserVisitor ) return ((FPParserVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ApndlContext extends Built_in_functionContext {
		public ApndlContext(Built_in_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).enterApndl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).exitApndl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPParserVisitor ) return ((FPParserVisitor<? extends T>)visitor).visitApndl(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class GtContext extends Built_in_functionContext {
		public GtContext(Built_in_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).enterGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).exitGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPParserVisitor ) return ((FPParserVisitor<? extends T>)visitor).visitGt(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class SContext extends Built_in_functionContext {
		public SContext(Built_in_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPParserVisitor ) return ((FPParserVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class DistlContext extends Built_in_functionContext {
		public DistlContext(Built_in_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).enterDistl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).exitDistl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPParserVisitor ) return ((FPParserVisitor<? extends T>)visitor).visitDistl(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class IdContext extends Built_in_functionContext {
		public IdContext(Built_in_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPParserVisitor ) return ((FPParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class GeContext extends Built_in_functionContext {
		public GeContext(Built_in_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).enterGe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).exitGe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPParserVisitor ) return ((FPParserVisitor<? extends T>)visitor).visitGe(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class DistrContext extends Built_in_functionContext {
		public DistrContext(Built_in_functionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).enterDistr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).exitDistr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPParserVisitor ) return ((FPParserVisitor<? extends T>)visitor).visitDistr(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public TerminalNode NUM() { return getToken(FPParserParser.NUM, 0); }

		public TerminalNode BOOL() { return getToken(FPParserParser.BOOL, 0); }

		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}

		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPParserVisitor ) return ((FPParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public static class ListContext extends ParserRuleContext {
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}

		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}

		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPParserListener ) ((FPParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPParserVisitor ) return ((FPParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}
}