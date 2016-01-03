// Generated from /home/petar/IdeaProjects/FPInterpreter/src/grammar/FPLexer.g4 by ANTLR 4.5.1
package matf.petar.FPInterpreter.gen;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FPLexer extends Lexer {
	public static final int
		DOT=1, FUN_ID=2, NUM=3, BOOL=4, WS=5;
	public static final String[] ruleNames = {
		"DOT", "FUN_ID", "NUM", "BOOL", "WS"
	};
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
			"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7-\b\1\4\2\t\2\4" +
					"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\6\3\22\n\3\r\3\16\3\23" +
					"\3\4\5\4\27\n\4\3\4\6\4\32\n\4\r\4\16\4\33\3\5\3\5\3\5\3\5\3\5\3\5\3\5" +
					"\3\5\3\5\5\5\'\n\5\3\6\5\6*\n\6\3\6\3\6\2\2\7\3\3\5\4\7\5\t\6\13\7\3\2" +
					"\6\3\2c|\6\2\62;C\\aac|\4\2))\62;\4\3\13\f\"\"\60\2\3\3\2\2\2\2\5\3\2" +
					"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\r\3\2\2\2\5\17\3\2\2\2\7\26" +
					"\3\2\2\2\t&\3\2\2\2\13)\3\2\2\2\r\16\7\60\2\2\16\4\3\2\2\2\17\21\t\2\2" +
					"\2\20\22\t\3\2\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2" +
					"\2\24\6\3\2\2\2\25\27\7/\2\2\26\25\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2" +
					"\30\32\t\4\2\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2" +
					"\34\b\3\2\2\2\35\36\7V\2\2\36\37\7T\2\2\37 \7W\2\2 \'\7G\2\2!\"\7H\2\2" +
					"\"#\7C\2\2#$\7N\2\2$%\7U\2\2%\'\7G\2\2&\35\3\2\2\2&!\3\2\2\2\'\n\3\2\2" +
					"\2(*\t\5\2\2)(\3\2\2\2*+\3\2\2\2+,\b\6\2\2,\f\3\2\2\2\b\2\23\26\33&)\3" +
					"\b\2\2";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = {
		null, "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DOT", "FUN_ID", "NUM", "BOOL", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
	public static String[] modeNames = {
			"DEFAULT_MODE"
	};

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

	public FPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
	public String getGrammarFileName() { return "FPLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }
}