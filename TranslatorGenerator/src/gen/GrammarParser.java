// Generated from C:/MyProgram/MethodsOfTranslation/Translator generator/src\Grammar.g4 by ANTLR 4.7
package gen;

    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, TERM=5, VAR=6, CODE=7, WORD=8, WS=9;
	public static final int
		RULE_s = 0, RULE_desc = 1, RULE_name = 2, RULE_rul = 3, RULE_right = 4, 
		RULE_nterm = 5;
	public static final String[] ruleNames = {
		"s", "desc", "name", "rul", "right", "nterm"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'='", "':'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "TERM", "VAR", "CODE", "WORD", "WS"
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

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	    public class Rule{
	        public String name;
	        public String varName;
	        public String attrs;
	        public List<Right> right = new ArrayList<>();
	    }

	    public class Right {
	        public List<A> list = new ArrayList<>();
	    }

	    public class A {
	        public String name;
	        public String varName;
	        public int id;
	        public String attrs;

	        public A() {}

	        public A(String name, String varName, int id, String attrs) {
	            this.name = name;
	            this.varName = varName;
	            this.id = id;
	            this.attrs = attrs;
	        }
	    }

	    public Map<String, String> descr = new HashMap<>();
	    public List<Rule> rules = new ArrayList<>();

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public List<DescContext> desc() {
			return getRuleContexts(DescContext.class);
		}
		public DescContext desc(int i) {
			return getRuleContext(DescContext.class,i);
		}
		public List<RulContext> rul() {
			return getRuleContexts(RulContext.class);
		}
		public RulContext rul(int i) {
			return getRuleContext(RulContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(12);
					desc();
					}
					} 
				}
				setState(17);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				rul();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==WORD );
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

	public static class DescContext extends ParserRuleContext {
		public NameContext name;
		public Token VAR;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public DescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDesc(this);
		}
	}

	public final DescContext desc() throws RecognitionException {
		DescContext _localctx = new DescContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_desc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			((DescContext)_localctx).name = name();
			{
			setState(24);
			((DescContext)_localctx).VAR = match(VAR);
			descr.put((((DescContext)_localctx).name!=null?_input.getText(((DescContext)_localctx).name.start,((DescContext)_localctx).name.stop):null), (((DescContext)_localctx).VAR!=null?((DescContext)_localctx).VAR.getText():null));
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(GrammarParser.WORD, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(WORD);
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

	public static class RulContext extends ParserRuleContext {
		public Token WORD;
		public NameContext name;
		public Token VAR;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<RightContext> right() {
			return getRuleContexts(RightContext.class);
		}
		public RightContext right(int i) {
			return getRuleContext(RightContext.class,i);
		}
		public TerminalNode WORD() { return getToken(GrammarParser.WORD, 0); }
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public RulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRul(this);
		}
	}

	public final RulContext rul() throws RecognitionException {
		RulContext _localctx = new RulContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rul);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			Rule rule = new Rule();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(30);
				match(T__0);
				setState(31);
				((RulContext)_localctx).WORD = match(WORD);
				rule.varName = (((RulContext)_localctx).WORD!=null?((RulContext)_localctx).WORD.getText():null);
				setState(33);
				match(T__1);
				}
			}

			setState(36);
			((RulContext)_localctx).name = name();
			rule.name = (((RulContext)_localctx).name!=null?_input.getText(((RulContext)_localctx).name.start,((RulContext)_localctx).name.stop):null);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(38);
				((RulContext)_localctx).VAR = match(VAR);
				rule.attrs = (((RulContext)_localctx).VAR!=null?((RulContext)_localctx).VAR.getText():null);
				}
			}

			setState(42);
			match(T__2);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(43);
					right(rule);
					setState(44);
					match(T__3);
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(51);
			right(rule);
			rules.add(rule);
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

	public static class RightContext extends ParserRuleContext {
		public Rule rule;
		public Token TERM;
		public Token CODE;
		public List<NtermContext> nterm() {
			return getRuleContexts(NtermContext.class);
		}
		public NtermContext nterm(int i) {
			return getRuleContext(NtermContext.class,i);
		}
		public List<TerminalNode> TERM() { return getTokens(GrammarParser.TERM); }
		public TerminalNode TERM(int i) {
			return getToken(GrammarParser.TERM, i);
		}
		public List<TerminalNode> CODE() { return getTokens(GrammarParser.CODE); }
		public TerminalNode CODE(int i) {
			return getToken(GrammarParser.CODE, i);
		}
		public RightContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RightContext(ParserRuleContext parent, int invokingState, Rule rule) {
			super(parent, invokingState);
			this.rule = rule;
		}
		@Override public int getRuleIndex() { return RULE_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRight(this);
		}
	}

	public final RightContext right(Rule rule) throws RecognitionException {
		RightContext _localctx = new RightContext(_ctx, getState(), rule);
		enterRule(_localctx, 8, RULE_right);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			Right righ = new Right();
			setState(60); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(60);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case WORD:
						{
						setState(55);
						nterm(righ);
						}
						break;
					case TERM:
						{
						setState(56);
						((RightContext)_localctx).TERM = match(TERM);
						righ.list.add(new A((((RightContext)_localctx).TERM!=null?((RightContext)_localctx).TERM.getText():null), null, 1, null));
						}
						break;
					case CODE:
						{
						setState(58);
						((RightContext)_localctx).CODE = match(CODE);
						righ.list.add(new A((((RightContext)_localctx).CODE!=null?((RightContext)_localctx).CODE.getText():null), null, 2, null));
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(62); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			rule.right.add(righ);
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

	public static class NtermContext extends ParserRuleContext {
		public Right righ;
		public Token WORD;
		public NameContext name;
		public Token VAR;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode WORD() { return getToken(GrammarParser.WORD, 0); }
		public TerminalNode VAR() { return getToken(GrammarParser.VAR, 0); }
		public NtermContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NtermContext(ParserRuleContext parent, int invokingState, Right righ) {
			super(parent, invokingState);
			this.righ = righ;
		}
		@Override public int getRuleIndex() { return RULE_nterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNterm(this);
		}
	}

	public final NtermContext nterm(Right righ) throws RecognitionException {
		NtermContext _localctx = new NtermContext(_ctx, getState(), righ);
		enterRule(_localctx, 10, RULE_nterm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			A a = new A();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(67);
				match(T__0);
				setState(68);
				((NtermContext)_localctx).WORD = match(WORD);
				a.varName = (((NtermContext)_localctx).WORD!=null?((NtermContext)_localctx).WORD.getText():null);
				setState(70);
				match(T__1);
				}
			}

			setState(73);
			((NtermContext)_localctx).name = name();
			a.name = (((NtermContext)_localctx).name!=null?_input.getText(((NtermContext)_localctx).name.start,((NtermContext)_localctx).name.stop):null);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(75);
				((NtermContext)_localctx).VAR = match(VAR);
				a.attrs = (((NtermContext)_localctx).VAR!=null?((NtermContext)_localctx).VAR.getText():null);
				}
			}

			righ.list.add(a);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13T\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\6\2\26\n\2\r\2\16\2\27\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5"+
		"\5%\n\5\3\5\3\5\3\5\3\5\5\5+\n\5\3\5\3\5\3\5\3\5\7\5\61\n\5\f\5\16\5\64"+
		"\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\6\6?\n\6\r\6\16\6@\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\5\7J\n\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\7\3\7\3\7\2\2\b"+
		"\2\4\6\b\n\f\2\2\2W\2\21\3\2\2\2\4\31\3\2\2\2\6\35\3\2\2\2\b\37\3\2\2"+
		"\2\n8\3\2\2\2\fD\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\23\3\2\2\2\21"+
		"\17\3\2\2\2\21\22\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\24\26\5\b\5\2\25"+
		"\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31"+
		"\32\5\6\4\2\32\33\7\b\2\2\33\34\b\3\1\2\34\5\3\2\2\2\35\36\7\n\2\2\36"+
		"\7\3\2\2\2\37$\b\5\1\2 !\7\3\2\2!\"\7\n\2\2\"#\b\5\1\2#%\7\4\2\2$ \3\2"+
		"\2\2$%\3\2\2\2%&\3\2\2\2&\'\5\6\4\2\'*\b\5\1\2()\7\b\2\2)+\b\5\1\2*(\3"+
		"\2\2\2*+\3\2\2\2+,\3\2\2\2,\62\7\5\2\2-.\5\n\6\2./\7\6\2\2/\61\3\2\2\2"+
		"\60-\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64"+
		"\62\3\2\2\2\65\66\5\n\6\2\66\67\b\5\1\2\67\t\3\2\2\28>\b\6\1\29?\5\f\7"+
		"\2:;\7\7\2\2;?\b\6\1\2<=\7\t\2\2=?\b\6\1\2>9\3\2\2\2>:\3\2\2\2><\3\2\2"+
		"\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\b\6\1\2C\13\3\2\2\2DI\b\7"+
		"\1\2EF\7\3\2\2FG\7\n\2\2GH\b\7\1\2HJ\7\4\2\2IE\3\2\2\2IJ\3\2\2\2JK\3\2"+
		"\2\2KL\5\6\4\2LO\b\7\1\2MN\7\b\2\2NP\b\7\1\2OM\3\2\2\2OP\3\2\2\2PQ\3\2"+
		"\2\2QR\b\7\1\2R\r\3\2\2\2\13\21\27$*\62>@IO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}