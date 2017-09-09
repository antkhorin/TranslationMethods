// Generated from C:/MyProgram/MethodsOfTranslation/ANTLRparser/src\Grammar.g4 by ANTLR 4.7
package gen;

import java.io.*;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, WORD=31, NUM=32, 
		BOOL=33, ORD=34, WS=35;
	public static final int
		RULE_start = 0, RULE_pack = 1, RULE_imp = 2, RULE_clas = 3, RULE_inclas = 4, 
		RULE_type = 5, RULE_voidtype = 6, RULE_var = 7, RULE_expr = 8, RULE_field = 9, 
		RULE_method = 10, RULE_code = 11, RULE_iff = 12, RULE_whil = 13, RULE_ret = 14, 
		RULE_inttype = 15, RULE_intr = 16, RULE_intexpr = 17, RULE_intterm = 18, 
		RULE_intvalue = 19, RULE_plus = 20, RULE_mul = 21, RULE_unminus = 22, 
		RULE_booltype = 23, RULE_boolr = 24, RULE_boolexpr = 25, RULE_boolterm = 26, 
		RULE_boolvalue = 27, RULE_or = 28, RULE_and = 29, RULE_nl = 30, RULE_sp = 31, 
		RULE_semi = 32, RULE_words = 33, RULE_seq = 34, RULE_seq2 = 35, RULE_mod = 36, 
		RULE_ex = 37, RULE_st = 38, RULE_word = 39, RULE_num = 40, RULE_bool = 41, 
		RULE_ord = 42, RULE_lb = 43, RULE_rb = 44, RULE_lp = 45, RULE_rp = 46, 
		RULE_tabs = 47;
	public static final String[] ruleNames = {
		"start", "pack", "imp", "clas", "inclas", "type", "voidtype", "var", "expr", 
		"field", "method", "code", "iff", "whil", "ret", "inttype", "intr", "intexpr", 
		"intterm", "intvalue", "plus", "mul", "unminus", "booltype", "boolr", 
		"boolexpr", "boolterm", "boolvalue", "or", "and", "nl", "sp", "semi", 
		"words", "seq", "seq2", "mod", "ex", "st", "word", "num", "bool", "ord", 
		"lb", "rb", "lp", "rp", "tabs"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'package'", "'import'", "'.*'", "'class'", "'void'", "'throws'", 
		"'if'", "'else'", "'while'", "'return'", "'int'", "'='", "'+'", "'*'", 
		"'-'", "'boolean'", "'||'", "'&&'", "';'", "'.'", "','", "'public'", "'private'", 
		"'extends'", "'implements'", "'static'", "'('", "')'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "WORD", "NUM", "BOOL", "ORD", 
		"WS"
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


	PrintWriter w;
	{
	    try {
	        w = new PrintWriter("Output.java");
	    } catch (Exception e) {}
	}

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public NlContext nl() {
			return getRuleContext(NlContext.class,0);
		}
		public PackContext pack() {
			return getRuleContext(PackContext.class,0);
		}
		public List<ImpContext> imp() {
			return getRuleContexts(ImpContext.class);
		}
		public ImpContext imp(int i) {
			return getRuleContext(ImpContext.class,i);
		}
		public List<ClasContext> clas() {
			return getRuleContexts(ClasContext.class);
		}
		public ClasContext clas(int i) {
			return getRuleContext(ClasContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(96);
				pack();
				}
			}

			setState(99);
			nl();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(100);
				imp();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__21) | (1L << T__22))) != 0)) {
				{
				{
				setState(106);
				clas(0);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			w.close();
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

	public static class PackContext extends ParserRuleContext {
		public SeqContext seq() {
			return getRuleContext(SeqContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public NlContext nl() {
			return getRuleContext(NlContext.class,0);
		}
		public PackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPack(this);
		}
	}

	public final PackContext pack() throws RecognitionException {
		PackContext _localctx = new PackContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__0);
			w.print("package ");
			setState(116);
			seq();
			setState(117);
			semi();
			setState(118);
			nl();
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

	public static class ImpContext extends ParserRuleContext {
		public SeqContext seq() {
			return getRuleContext(SeqContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public NlContext nl() {
			return getRuleContext(NlContext.class,0);
		}
		public ImpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterImp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitImp(this);
		}
	}

	public final ImpContext imp() throws RecognitionException {
		ImpContext _localctx = new ImpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__1);
			w.print("import ");
			setState(122);
			seq();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(123);
				match(T__2);
				w.print(".*");
				}
			}

			setState(127);
			semi();
			setState(128);
			nl();
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

	public static class ClasContext extends ParserRuleContext {
		public int n;
		public List<NlContext> nl() {
			return getRuleContexts(NlContext.class);
		}
		public NlContext nl(int i) {
			return getRuleContext(NlContext.class,i);
		}
		public List<TabsContext> tabs() {
			return getRuleContexts(TabsContext.class);
		}
		public TabsContext tabs(int i) {
			return getRuleContext(TabsContext.class,i);
		}
		public WordsContext words() {
			return getRuleContext(WordsContext.class,0);
		}
		public LpContext lp() {
			return getRuleContext(LpContext.class,0);
		}
		public InclasContext inclas() {
			return getRuleContext(InclasContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public ClasContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ClasContext(ParserRuleContext parent, int invokingState, int n) {
			super(parent, invokingState);
			this.n = n;
		}
		@Override public int getRuleIndex() { return RULE_clas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterClas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitClas(this);
		}
	}

	public final ClasContext clas(int n) throws RecognitionException {
		ClasContext _localctx = new ClasContext(_ctx, getState(), n);
		enterRule(_localctx, 6, RULE_clas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			nl();
			setState(131);
			tabs(n);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__22) {
				{
				setState(132);
				mod();
				}
			}

			setState(135);
			match(T__3);
			w.print("class ");
			setState(137);
			words();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23 || _la==T__24) {
				{
				setState(138);
				ex();
				}
			}

			setState(141);
			lp();
			setState(142);
			nl();
			setState(143);
			inclas(n + 1);
			setState(144);
			tabs(n);
			setState(145);
			rp();
			setState(146);
			nl();
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

	public static class InclasContext extends ParserRuleContext {
		public int n;
		public List<TabsContext> tabs() {
			return getRuleContexts(TabsContext.class);
		}
		public TabsContext tabs(int i) {
			return getRuleContext(TabsContext.class,i);
		}
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public InclasContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InclasContext(ParserRuleContext parent, int invokingState, int n) {
			super(parent, invokingState);
			this.n = n;
		}
		@Override public int getRuleIndex() { return RULE_inclas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInclas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInclas(this);
		}
	}

	public final InclasContext inclas(int n) throws RecognitionException {
		InclasContext _localctx = new InclasContext(_ctx, getState(), n);
		enterRule(_localctx, 8, RULE_inclas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__10) | (1L << T__15) | (1L << T__21) | (1L << T__22) | (1L << T__25))) != 0)) {
				{
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(148);
					tabs(n);
					setState(149);
					field();
					}
					break;
				case 2:
					{
					setState(151);
					method(n);
					}
					break;
				}
				}
				setState(156);
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

	public static class TypeContext extends ParserRuleContext {
		public InttypeContext inttype() {
			return getRuleContext(InttypeContext.class,0);
		}
		public BooltypeContext booltype() {
			return getRuleContext(BooltypeContext.class,0);
		}
		public VoidtypeContext voidtype() {
			return getRuleContext(VoidtypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				inttype();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				booltype();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				voidtype();
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

	public static class VoidtypeContext extends ParserRuleContext {
		public VoidtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVoidtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVoidtype(this);
		}
	}

	public final VoidtypeContext voidtype() throws RecognitionException {
		VoidtypeContext _localctx = new VoidtypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_voidtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__4);
			w.print("void ");
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

	public static class VarContext extends ParserRuleContext {
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public NlContext nl() {
			return getRuleContext(NlContext.class,0);
		}
		public InttypeContext inttype() {
			return getRuleContext(InttypeContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public BooltypeContext booltype() {
			return getRuleContext(BooltypeContext.class,0);
		}
		public IntrContext intr() {
			return getRuleContext(IntrContext.class,0);
		}
		public BoolrContext boolr() {
			return getRuleContext(BoolrContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(165);
				inttype();
				setState(166);
				word();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(167);
					intr();
					}
				}

				}
				break;
			case T__15:
				{
				setState(170);
				booltype();
				setState(171);
				word();
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(172);
					boolr();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(177);
			semi();
			setState(178);
			nl();
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

	public static class ExprContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public NlContext nl() {
			return getRuleContext(NlContext.class,0);
		}
		public IntrContext intr() {
			return getRuleContext(IntrContext.class,0);
		}
		public BoolrContext boolr() {
			return getRuleContext(BoolrContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			word();
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(181);
				intr();
				}
				break;
			case 2:
				{
				setState(182);
				boolr();
				}
				break;
			}
			setState(185);
			semi();
			setState(186);
			nl();
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

	public static class FieldContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public StContext st() {
			return getRuleContext(StContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__22) {
				{
				setState(188);
				mod();
				}
			}

			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(191);
				st();
				}
			}

			setState(194);
			var();
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

	public static class MethodContext extends ParserRuleContext {
		public int n;
		public List<NlContext> nl() {
			return getRuleContexts(NlContext.class);
		}
		public NlContext nl(int i) {
			return getRuleContext(NlContext.class,i);
		}
		public List<TabsContext> tabs() {
			return getRuleContexts(TabsContext.class);
		}
		public TabsContext tabs(int i) {
			return getRuleContext(TabsContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public LbContext lb() {
			return getRuleContext(LbContext.class,0);
		}
		public RbContext rb() {
			return getRuleContext(RbContext.class,0);
		}
		public SpContext sp() {
			return getRuleContext(SpContext.class,0);
		}
		public LpContext lp() {
			return getRuleContext(LpContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public StContext st() {
			return getRuleContext(StContext.class,0);
		}
		public Seq2Context seq2() {
			return getRuleContext(Seq2Context.class,0);
		}
		public WordsContext words() {
			return getRuleContext(WordsContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MethodContext(ParserRuleContext parent, int invokingState, int n) {
			super(parent, invokingState);
			this.n = n;
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method(int n) throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState(), n);
		enterRule(_localctx, 20, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			nl();
			setState(197);
			tabs(n);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21 || _la==T__22) {
				{
				setState(198);
				mod();
				}
			}

			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(201);
				st();
				}
			}

			setState(204);
			type();
			setState(205);
			word();
			setState(206);
			lb();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__15) {
				{
				setState(207);
				seq2();
				}
			}

			setState(210);
			rb();
			setState(211);
			sp();
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(212);
				match(T__5);
				w.print("throws ");
				setState(214);
				words();
				}
			}

			setState(217);
			lp();
			setState(218);
			nl();
			setState(219);
			code(n + 1);
			setState(220);
			tabs(n);
			setState(221);
			rp();
			setState(222);
			nl();
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

	public static class CodeContext extends ParserRuleContext {
		public int n;
		public List<TabsContext> tabs() {
			return getRuleContexts(TabsContext.class);
		}
		public TabsContext tabs(int i) {
			return getRuleContext(TabsContext.class,i);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<IffContext> iff() {
			return getRuleContexts(IffContext.class);
		}
		public IffContext iff(int i) {
			return getRuleContext(IffContext.class,i);
		}
		public List<WhilContext> whil() {
			return getRuleContexts(WhilContext.class);
		}
		public WhilContext whil(int i) {
			return getRuleContext(WhilContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CodeContext(ParserRuleContext parent, int invokingState, int n) {
			super(parent, invokingState);
			this.n = n;
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCode(this);
		}
	}

	public final CodeContext code(int n) throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState(), n);
		enterRule(_localctx, 22, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__15) | (1L << WORD))) != 0)) {
				{
				{
				setState(224);
				tabs(n);
				setState(229);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__10:
				case T__15:
					{
					setState(225);
					var();
					}
					break;
				case WORD:
					{
					setState(226);
					expr();
					}
					break;
				case T__6:
					{
					setState(227);
					iff(n);
					}
					break;
				case T__8:
					{
					setState(228);
					whil(n);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(236);
				ret(n);
				}
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

	public static class IffContext extends ParserRuleContext {
		public int n;
		public LbContext lb() {
			return getRuleContext(LbContext.class,0);
		}
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public RbContext rb() {
			return getRuleContext(RbContext.class,0);
		}
		public SpContext sp() {
			return getRuleContext(SpContext.class,0);
		}
		public List<LpContext> lp() {
			return getRuleContexts(LpContext.class);
		}
		public LpContext lp(int i) {
			return getRuleContext(LpContext.class,i);
		}
		public List<NlContext> nl() {
			return getRuleContexts(NlContext.class);
		}
		public NlContext nl(int i) {
			return getRuleContext(NlContext.class,i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public List<TabsContext> tabs() {
			return getRuleContexts(TabsContext.class);
		}
		public TabsContext tabs(int i) {
			return getRuleContext(TabsContext.class,i);
		}
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public IffContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IffContext(ParserRuleContext parent, int invokingState, int n) {
			super(parent, invokingState);
			this.n = n;
		}
		@Override public int getRuleIndex() { return RULE_iff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIff(this);
		}
	}

	public final IffContext iff(int n) throws RecognitionException {
		IffContext _localctx = new IffContext(_ctx, getState(), n);
		enterRule(_localctx, 24, RULE_iff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__6);
			w.print("if ");
			setState(241);
			lb();
			setState(242);
			boolexpr(0);
			setState(243);
			rb();
			setState(244);
			sp();
			setState(245);
			lp();
			setState(246);
			nl();
			setState(247);
			code(n + 1);
			setState(248);
			tabs(n);
			setState(249);
			rp();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(250);
				match(T__7);
				w.print(" else ");
				setState(252);
				lp();
				setState(253);
				nl();
				setState(254);
				code(n + 1);
				setState(255);
				tabs(n);
				setState(256);
				rp();
				}
			}

			setState(260);
			nl();
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

	public static class WhilContext extends ParserRuleContext {
		public int n;
		public LbContext lb() {
			return getRuleContext(LbContext.class,0);
		}
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public RbContext rb() {
			return getRuleContext(RbContext.class,0);
		}
		public SpContext sp() {
			return getRuleContext(SpContext.class,0);
		}
		public LpContext lp() {
			return getRuleContext(LpContext.class,0);
		}
		public List<NlContext> nl() {
			return getRuleContexts(NlContext.class);
		}
		public NlContext nl(int i) {
			return getRuleContext(NlContext.class,i);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TabsContext tabs() {
			return getRuleContext(TabsContext.class,0);
		}
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public WhilContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public WhilContext(ParserRuleContext parent, int invokingState, int n) {
			super(parent, invokingState);
			this.n = n;
		}
		@Override public int getRuleIndex() { return RULE_whil; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWhil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWhil(this);
		}
	}

	public final WhilContext whil(int n) throws RecognitionException {
		WhilContext _localctx = new WhilContext(_ctx, getState(), n);
		enterRule(_localctx, 26, RULE_whil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__8);
			w.print("while ");
			setState(264);
			lb();
			setState(265);
			boolexpr(0);
			setState(266);
			rb();
			setState(267);
			sp();
			setState(268);
			lp();
			setState(269);
			nl();
			setState(270);
			code(n + 1);
			setState(271);
			tabs(n);
			setState(272);
			rp();
			setState(273);
			nl();
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

	public static class RetContext extends ParserRuleContext {
		public int n;
		public TabsContext tabs() {
			return getRuleContext(TabsContext.class,0);
		}
		public SemiContext semi() {
			return getRuleContext(SemiContext.class,0);
		}
		public NlContext nl() {
			return getRuleContext(NlContext.class,0);
		}
		public IntexprContext intexpr() {
			return getRuleContext(IntexprContext.class,0);
		}
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public RetContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RetContext(ParserRuleContext parent, int invokingState, int n) {
			super(parent, invokingState);
			this.n = n;
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRet(this);
		}
	}

	public final RetContext ret(int n) throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState(), n);
		enterRule(_localctx, 28, RULE_ret);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			tabs(n);
			setState(276);
			match(T__9);
			w.print("return ");
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(278);
				intexpr(0);
				}
				break;
			case 2:
				{
				setState(279);
				boolexpr(0);
				}
				break;
			}
			setState(282);
			semi();
			setState(283);
			nl();
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

	public static class InttypeContext extends ParserRuleContext {
		public InttypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inttype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInttype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInttype(this);
		}
	}

	public final InttypeContext inttype() throws RecognitionException {
		InttypeContext _localctx = new InttypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_inttype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__10);
			w.print("int ");
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

	public static class IntrContext extends ParserRuleContext {
		public IntexprContext intexpr() {
			return getRuleContext(IntexprContext.class,0);
		}
		public IntrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIntr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIntr(this);
		}
	}

	public final IntrContext intr() throws RecognitionException {
		IntrContext _localctx = new IntrContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_intr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__11);
			w.print(" = ");
			setState(290);
			intexpr(0);
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

	public static class IntexprContext extends ParserRuleContext {
		public InttermContext intterm() {
			return getRuleContext(InttermContext.class,0);
		}
		public IntexprContext intexpr() {
			return getRuleContext(IntexprContext.class,0);
		}
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public IntexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIntexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIntexpr(this);
		}
	}

	public final IntexprContext intexpr() throws RecognitionException {
		return intexpr(0);
	}

	private IntexprContext intexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntexprContext _localctx = new IntexprContext(_ctx, _parentState);
		IntexprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_intexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(293);
			intterm(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IntexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_intexpr);
					setState(295);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(296);
					plus();
					setState(297);
					intterm(0);
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class InttermContext extends ParserRuleContext {
		public IntvalueContext intvalue() {
			return getRuleContext(IntvalueContext.class,0);
		}
		public InttermContext intterm() {
			return getRuleContext(InttermContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public InttermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIntterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIntterm(this);
		}
	}

	public final InttermContext intterm() throws RecognitionException {
		return intterm(0);
	}

	private InttermContext intterm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InttermContext _localctx = new InttermContext(_ctx, _parentState);
		InttermContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_intterm, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(305);
			intvalue();
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InttermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_intterm);
					setState(307);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(308);
					mul();
					setState(309);
					intvalue();
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class IntvalueContext extends ParserRuleContext {
		public LbContext lb() {
			return getRuleContext(LbContext.class,0);
		}
		public IntexprContext intexpr() {
			return getRuleContext(IntexprContext.class,0);
		}
		public RbContext rb() {
			return getRuleContext(RbContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public UnminusContext unminus() {
			return getRuleContext(UnminusContext.class,0);
		}
		public IntvalueContext intvalue() {
			return getRuleContext(IntvalueContext.class,0);
		}
		public IntvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIntvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIntvalue(this);
		}
	}

	public final IntvalueContext intvalue() throws RecognitionException {
		IntvalueContext _localctx = new IntvalueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_intvalue);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				lb();
				setState(317);
				intexpr(0);
				setState(318);
				rb();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				num();
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				word();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				unminus();
				setState(323);
				intvalue();
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

	public static class PlusContext extends ParserRuleContext {
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPlus(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__12);
			w.print(" + ");
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

	public static class MulContext extends ParserRuleContext {
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMul(this);
		}
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(T__13);
			w.print(" * ");
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

	public static class UnminusContext extends ParserRuleContext {
		public UnminusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unminus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterUnminus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitUnminus(this);
		}
	}

	public final UnminusContext unminus() throws RecognitionException {
		UnminusContext _localctx = new UnminusContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unminus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__14);
			w.print('-');
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

	public static class BooltypeContext extends ParserRuleContext {
		public BooltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booltype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBooltype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBooltype(this);
		}
	}

	public final BooltypeContext booltype() throws RecognitionException {
		BooltypeContext _localctx = new BooltypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_booltype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(T__15);
			w.print("boolean ");
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

	public static class BoolrContext extends ParserRuleContext {
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public BoolrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolr(this);
		}
	}

	public final BoolrContext boolr() throws RecognitionException {
		BoolrContext _localctx = new BoolrContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_boolr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(T__11);
			w.print(" = ");
			setState(341);
			boolexpr(0);
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

	public static class BoolexprContext extends ParserRuleContext {
		public BooltermContext boolterm() {
			return getRuleContext(BooltermContext.class,0);
		}
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolexpr(this);
		}
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		return boolexpr(0);
	}

	private BoolexprContext boolexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolexprContext _localctx = new BoolexprContext(_ctx, _parentState);
		BoolexprContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_boolexpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(344);
			boolterm(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolexpr);
					setState(346);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(347);
					or();
					setState(348);
					boolterm(0);
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class BooltermContext extends ParserRuleContext {
		public BoolvalueContext boolvalue() {
			return getRuleContext(BoolvalueContext.class,0);
		}
		public BooltermContext boolterm() {
			return getRuleContext(BooltermContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public BooltermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolterm(this);
		}
	}

	public final BooltermContext boolterm() throws RecognitionException {
		return boolterm(0);
	}

	private BooltermContext boolterm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooltermContext _localctx = new BooltermContext(_ctx, _parentState);
		BooltermContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_boolterm, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(356);
			boolvalue();
			}
			_ctx.stop = _input.LT(-1);
			setState(364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BooltermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolterm);
					setState(358);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(359);
					and();
					setState(360);
					boolvalue();
					}
					} 
				}
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class BoolvalueContext extends ParserRuleContext {
		public LbContext lb() {
			return getRuleContext(LbContext.class,0);
		}
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public RbContext rb() {
			return getRuleContext(RbContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public List<IntexprContext> intexpr() {
			return getRuleContexts(IntexprContext.class);
		}
		public IntexprContext intexpr(int i) {
			return getRuleContext(IntexprContext.class,i);
		}
		public OrdContext ord() {
			return getRuleContext(OrdContext.class,0);
		}
		public BoolvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolvalue(this);
		}
	}

	public final BoolvalueContext boolvalue() throws RecognitionException {
		BoolvalueContext _localctx = new BoolvalueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_boolvalue);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				lb();
				setState(368);
				boolexpr(0);
				setState(369);
				rb();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				bool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(372);
				word();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				intexpr(0);
				setState(374);
				ord();
				setState(375);
				intexpr(0);
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

	public static class OrContext extends ParserRuleContext {
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOr(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__16);
			w.print(" || ");
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

	public static class AndContext extends ParserRuleContext {
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(T__17);
			w.print(" && ");
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

	public static class NlContext extends ParserRuleContext {
		public NlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNl(this);
		}
	}

	public final NlContext nl() throws RecognitionException {
		NlContext _localctx = new NlContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_nl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			w.print('\n');
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

	public static class SpContext extends ParserRuleContext {
		public SpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSp(this);
		}
	}

	public final SpContext sp() throws RecognitionException {
		SpContext _localctx = new SpContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			w.print(' ');
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

	public static class SemiContext extends ParserRuleContext {
		public SemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSemi(this);
		}
	}

	public final SemiContext semi() throws RecognitionException {
		SemiContext _localctx = new SemiContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_semi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(T__18);
			w.print(";");
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

	public static class WordsContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public WordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWords(this);
		}
	}

	public final WordsContext words() throws RecognitionException {
		WordsContext _localctx = new WordsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_words);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			word();
			w.print(' ');
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

	public static class SeqContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public SeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSeq(this);
		}
	}

	public final SeqContext seq() throws RecognitionException {
		SeqContext _localctx = new SeqContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_seq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(395);
					word();
					setState(396);
					match(T__19);
					w.print('.');
					}
					} 
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(404);
			word();
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

	public static class Seq2Context extends ParserRuleContext {
		public List<InttypeContext> inttype() {
			return getRuleContexts(InttypeContext.class);
		}
		public InttypeContext inttype(int i) {
			return getRuleContext(InttypeContext.class,i);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<BooltypeContext> booltype() {
			return getRuleContexts(BooltypeContext.class);
		}
		public BooltypeContext booltype(int i) {
			return getRuleContext(BooltypeContext.class,i);
		}
		public Seq2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seq2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSeq2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSeq2(this);
		}
	}

	public final Seq2Context seq2() throws RecognitionException {
		Seq2Context _localctx = new Seq2Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_seq2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(412);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__10:
						{
						setState(406);
						inttype();
						setState(407);
						word();
						}
						break;
					case T__15:
						{
						setState(409);
						booltype();
						setState(410);
						word();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(414);
					match(T__20);
					w.print(", ");
					}
					} 
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(422);
				inttype();
				setState(423);
				word();
				}
				break;
			case T__15:
				{
				setState(425);
				booltype();
				setState(426);
				word();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ModContext extends ParserRuleContext {
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMod(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_mod);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(T__21);
				w.print("public ");
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(T__22);
				w.print("private ");
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

	public static class ExContext extends ParserRuleContext {
		public WordsContext words() {
			return getRuleContext(WordsContext.class,0);
		}
		public ExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEx(this);
		}
	}

	public final ExContext ex() throws RecognitionException {
		ExContext _localctx = new ExContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				{
				setState(436);
				match(T__23);
				w.print("extends ");
				}
				break;
			case T__24:
				{
				setState(438);
				match(T__24);
				w.print("implements ");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(442);
			words();
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

	public static class StContext extends ParserRuleContext {
		public StContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSt(this);
		}
	}

	public final StContext st() throws RecognitionException {
		StContext _localctx = new StContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(T__25);
			w.print("static ");
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

	public static class WordContext extends ParserRuleContext {
		public Token WORD;
		public TerminalNode WORD() { return getToken(GrammarParser.WORD, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			((WordContext)_localctx).WORD = match(WORD);
			w.print((((WordContext)_localctx).WORD!=null?((WordContext)_localctx).WORD.getText():null));
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

	public static class NumContext extends ParserRuleContext {
		public Token NUM;
		public TerminalNode NUM() { return getToken(GrammarParser.NUM, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			((NumContext)_localctx).NUM = match(NUM);
			w.print((((NumContext)_localctx).NUM!=null?((NumContext)_localctx).NUM.getText():null));
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

	public static class BoolContext extends ParserRuleContext {
		public Token BOOL;
		public TerminalNode BOOL() { return getToken(GrammarParser.BOOL, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_bool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			((BoolContext)_localctx).BOOL = match(BOOL);
			w.print((((BoolContext)_localctx).BOOL!=null?((BoolContext)_localctx).BOOL.getText():null));
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

	public static class OrdContext extends ParserRuleContext {
		public Token ORD;
		public TerminalNode ORD() { return getToken(GrammarParser.ORD, 0); }
		public OrdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOrd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOrd(this);
		}
	}

	public final OrdContext ord() throws RecognitionException {
		OrdContext _localctx = new OrdContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			((OrdContext)_localctx).ORD = match(ORD);
			w.print(" " + (((OrdContext)_localctx).ORD!=null?((OrdContext)_localctx).ORD.getText():null) + " ");
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

	public static class LbContext extends ParserRuleContext {
		public LbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLb(this);
		}
	}

	public final LbContext lb() throws RecognitionException {
		LbContext _localctx = new LbContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_lb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(T__26);
			w.print('(');
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

	public static class RbContext extends ParserRuleContext {
		public RbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRb(this);
		}
	}

	public final RbContext rb() throws RecognitionException {
		RbContext _localctx = new RbContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_rb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			match(T__27);
			w.print(')');
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

	public static class LpContext extends ParserRuleContext {
		public LpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLp(this);
		}
	}

	public final LpContext lp() throws RecognitionException {
		LpContext _localctx = new LpContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_lp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(T__28);
			w.print('{');
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

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRp(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		RpContext _localctx = new RpContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_rp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(T__29);
			w.print('}');
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

	public static class TabsContext extends ParserRuleContext {
		public int n;
		public TabsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TabsContext(ParserRuleContext parent, int invokingState, int n) {
			super(parent, invokingState);
			this.n = n;
		}
		@Override public int getRuleIndex() { return RULE_tabs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTabs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTabs(this);
		}
	}

	public final TabsContext tabs(int n) throws RecognitionException {
		TabsContext _localctx = new TabsContext(_ctx, getState(), n);
		enterRule(_localctx, 94, RULE_tabs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			for (int i = 0; i < n; i++) w.print('\t');
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
		case 17:
			return intexpr_sempred((IntexprContext)_localctx, predIndex);
		case 18:
			return intterm_sempred((InttermContext)_localctx, predIndex);
		case 25:
			return boolexpr_sempred((BoolexprContext)_localctx, predIndex);
		case 26:
			return boolterm_sempred((BooltermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean intexpr_sempred(IntexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean intterm_sempred(InttermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean boolexpr_sempred(BoolexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean boolterm_sempred(BooltermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u01dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\5\2d\n\2\3\2\3\2\7\2h\n"+
		"\2\f\2\16\2k\13\2\3\2\7\2n\n\2\f\2\16\2q\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\u0080\n\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5"+
		"\u0088\n\5\3\5\3\5\3\5\3\5\5\5\u008e\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\7\6\u009b\n\6\f\6\16\6\u009e\13\6\3\7\3\7\3\7\5\7\u00a3"+
		"\n\7\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u00ab\n\t\3\t\3\t\3\t\5\t\u00b0\n\t\5"+
		"\t\u00b2\n\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u00ba\n\n\3\n\3\n\3\n\3\13\5"+
		"\13\u00c0\n\13\3\13\5\13\u00c3\n\13\3\13\3\13\3\f\3\f\3\f\5\f\u00ca\n"+
		"\f\3\f\5\f\u00cd\n\f\3\f\3\f\3\f\3\f\5\f\u00d3\n\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00da\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u00e8"+
		"\n\r\7\r\u00ea\n\r\f\r\16\r\u00ed\13\r\3\r\5\r\u00f0\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0105\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u011b\n\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u012e\n\23\f\23\16\23\u0131\13\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u013a\n\24\f\24\16\24\u013d\13\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0148\n\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\7\33\u0161\n\33\f\33\16\33\u0164\13\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u016d\n\34\f\34\16\34\u0170\13\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u017c\n\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3"+
		"$\7$\u0192\n$\f$\16$\u0195\13$\3$\3$\3%\3%\3%\3%\3%\3%\5%\u019f\n%\3%"+
		"\3%\3%\7%\u01a4\n%\f%\16%\u01a7\13%\3%\3%\3%\3%\3%\3%\5%\u01af\n%\3&\3"+
		"&\3&\3&\5&\u01b5\n&\3\'\3\'\3\'\3\'\5\'\u01bb\n\'\3\'\3\'\3(\3(\3(\3)"+
		"\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\2\6$&\64\66\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\2\2\u01d6\2c\3\2\2\2"+
		"\4t\3\2\2\2\6z\3\2\2\2\b\u0084\3\2\2\2\n\u009c\3\2\2\2\f\u00a2\3\2\2\2"+
		"\16\u00a4\3\2\2\2\20\u00b1\3\2\2\2\22\u00b6\3\2\2\2\24\u00bf\3\2\2\2\26"+
		"\u00c6\3\2\2\2\30\u00eb\3\2\2\2\32\u00f1\3\2\2\2\34\u0108\3\2\2\2\36\u0115"+
		"\3\2\2\2 \u011f\3\2\2\2\"\u0122\3\2\2\2$\u0126\3\2\2\2&\u0132\3\2\2\2"+
		"(\u0147\3\2\2\2*\u0149\3\2\2\2,\u014c\3\2\2\2.\u014f\3\2\2\2\60\u0152"+
		"\3\2\2\2\62\u0155\3\2\2\2\64\u0159\3\2\2\2\66\u0165\3\2\2\28\u017b\3\2"+
		"\2\2:\u017d\3\2\2\2<\u0180\3\2\2\2>\u0183\3\2\2\2@\u0185\3\2\2\2B\u0187"+
		"\3\2\2\2D\u018a\3\2\2\2F\u0193\3\2\2\2H\u01a5\3\2\2\2J\u01b4\3\2\2\2L"+
		"\u01ba\3\2\2\2N\u01be\3\2\2\2P\u01c1\3\2\2\2R\u01c4\3\2\2\2T\u01c7\3\2"+
		"\2\2V\u01ca\3\2\2\2X\u01cd\3\2\2\2Z\u01d0\3\2\2\2\\\u01d3\3\2\2\2^\u01d6"+
		"\3\2\2\2`\u01d9\3\2\2\2bd\5\4\3\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ei\5> "+
		"\2fh\5\6\4\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jo\3\2\2\2ki\3\2\2"+
		"\2ln\5\b\5\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2"+
		"\2rs\b\2\1\2s\3\3\2\2\2tu\7\3\2\2uv\b\3\1\2vw\5F$\2wx\5B\"\2xy\5> \2y"+
		"\5\3\2\2\2z{\7\4\2\2{|\b\4\1\2|\177\5F$\2}~\7\5\2\2~\u0080\b\4\1\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\5B\"\2\u0082"+
		"\u0083\5> \2\u0083\7\3\2\2\2\u0084\u0085\5> \2\u0085\u0087\5`\61\2\u0086"+
		"\u0088\5J&\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2"+
		"\2\u0089\u008a\7\6\2\2\u008a\u008b\b\5\1\2\u008b\u008d\5D#\2\u008c\u008e"+
		"\5L\'\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\5\\/\2\u0090\u0091\5> \2\u0091\u0092\5\n\6\2\u0092\u0093\5`\61"+
		"\2\u0093\u0094\5^\60\2\u0094\u0095\5> \2\u0095\t\3\2\2\2\u0096\u0097\5"+
		"`\61\2\u0097\u0098\5\24\13\2\u0098\u009b\3\2\2\2\u0099\u009b\5\26\f\2"+
		"\u009a\u0096\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\13\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a3\5 \21\2\u00a0\u00a3\5\60\31\2\u00a1\u00a3\5\16\b\2\u00a2\u009f"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\r\3\2\2\2\u00a4"+
		"\u00a5\7\7\2\2\u00a5\u00a6\b\b\1\2\u00a6\17\3\2\2\2\u00a7\u00a8\5 \21"+
		"\2\u00a8\u00aa\5P)\2\u00a9\u00ab\5\"\22\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00b2\3\2\2\2\u00ac\u00ad\5\60\31\2\u00ad\u00af\5P)\2\u00ae"+
		"\u00b0\5\62\32\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3"+
		"\2\2\2\u00b1\u00a7\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\5B\"\2\u00b4\u00b5\5> \2\u00b5\21\3\2\2\2\u00b6\u00b9\5P)\2\u00b7"+
		"\u00ba\5\"\22\2\u00b8\u00ba\5\62\32\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\5B\"\2\u00bc\u00bd\5> \2\u00bd"+
		"\23\3\2\2\2\u00be\u00c0\5J&\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2"+
		"\u00c0\u00c2\3\2\2\2\u00c1\u00c3\5N(\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\5\20\t\2\u00c5\25\3\2\2\2\u00c6"+
		"\u00c7\5> \2\u00c7\u00c9\5`\61\2\u00c8\u00ca\5J&\2\u00c9\u00c8\3\2\2\2"+
		"\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00cd\5N(\2\u00cc\u00cb"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\5\f\7\2\u00cf"+
		"\u00d0\5P)\2\u00d0\u00d2\5X-\2\u00d1\u00d3\5H%\2\u00d2\u00d1\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\5Z.\2\u00d5\u00d9\5@!\2"+
		"\u00d6\u00d7\7\b\2\2\u00d7\u00d8\b\f\1\2\u00d8\u00da\5D#\2\u00d9\u00d6"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\5\\/\2\u00dc"+
		"\u00dd\5> \2\u00dd\u00de\5\30\r\2\u00de\u00df\5`\61\2\u00df\u00e0\5^\60"+
		"\2\u00e0\u00e1\5> \2\u00e1\27\3\2\2\2\u00e2\u00e7\5`\61\2\u00e3\u00e8"+
		"\5\20\t\2\u00e4\u00e8\5\22\n\2\u00e5\u00e8\5\32\16\2\u00e6\u00e8\5\34"+
		"\17\2\u00e7\u00e3\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e2\3\2\2\2\u00ea\u00ed\3\2"+
		"\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00f0\5\36\20\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3"+
		"\2\2\2\u00f0\31\3\2\2\2\u00f1\u00f2\7\t\2\2\u00f2\u00f3\b\16\1\2\u00f3"+
		"\u00f4\5X-\2\u00f4\u00f5\5\64\33\2\u00f5\u00f6\5Z.\2\u00f6\u00f7\5@!\2"+
		"\u00f7\u00f8\5\\/\2\u00f8\u00f9\5> \2\u00f9\u00fa\5\30\r\2\u00fa\u00fb"+
		"\5`\61\2\u00fb\u0104\5^\60\2\u00fc\u00fd\7\n\2\2\u00fd\u00fe\b\16\1\2"+
		"\u00fe\u00ff\5\\/\2\u00ff\u0100\5> \2\u0100\u0101\5\30\r\2\u0101\u0102"+
		"\5`\61\2\u0102\u0103\5^\60\2\u0103\u0105\3\2\2\2\u0104\u00fc\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\5> \2\u0107\33\3\2\2\2"+
		"\u0108\u0109\7\13\2\2\u0109\u010a\b\17\1\2\u010a\u010b\5X-\2\u010b\u010c"+
		"\5\64\33\2\u010c\u010d\5Z.\2\u010d\u010e\5@!\2\u010e\u010f\5\\/\2\u010f"+
		"\u0110\5> \2\u0110\u0111\5\30\r\2\u0111\u0112\5`\61\2\u0112\u0113\5^\60"+
		"\2\u0113\u0114\5> \2\u0114\35\3\2\2\2\u0115\u0116\5`\61\2\u0116\u0117"+
		"\7\f\2\2\u0117\u011a\b\20\1\2\u0118\u011b\5$\23\2\u0119\u011b\5\64\33"+
		"\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d"+
		"\5B\"\2\u011d\u011e\5> \2\u011e\37\3\2\2\2\u011f\u0120\7\r\2\2\u0120\u0121"+
		"\b\21\1\2\u0121!\3\2\2\2\u0122\u0123\7\16\2\2\u0123\u0124\b\22\1\2\u0124"+
		"\u0125\5$\23\2\u0125#\3\2\2\2\u0126\u0127\b\23\1\2\u0127\u0128\5&\24\2"+
		"\u0128\u012f\3\2\2\2\u0129\u012a\f\4\2\2\u012a\u012b\5*\26\2\u012b\u012c"+
		"\5&\24\2\u012c\u012e\3\2\2\2\u012d\u0129\3\2\2\2\u012e\u0131\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130%\3\2\2\2\u0131\u012f\3\2\2\2"+
		"\u0132\u0133\b\24\1\2\u0133\u0134\5(\25\2\u0134\u013b\3\2\2\2\u0135\u0136"+
		"\f\4\2\2\u0136\u0137\5,\27\2\u0137\u0138\5(\25\2\u0138\u013a\3\2\2\2\u0139"+
		"\u0135\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\'\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\5X-\2\u013f\u0140"+
		"\5$\23\2\u0140\u0141\5Z.\2\u0141\u0148\3\2\2\2\u0142\u0148\5R*\2\u0143"+
		"\u0148\5P)\2\u0144\u0145\5.\30\2\u0145\u0146\5(\25\2\u0146\u0148\3\2\2"+
		"\2\u0147\u013e\3\2\2\2\u0147\u0142\3\2\2\2\u0147\u0143\3\2\2\2\u0147\u0144"+
		"\3\2\2\2\u0148)\3\2\2\2\u0149\u014a\7\17\2\2\u014a\u014b\b\26\1\2\u014b"+
		"+\3\2\2\2\u014c\u014d\7\20\2\2\u014d\u014e\b\27\1\2\u014e-\3\2\2\2\u014f"+
		"\u0150\7\21\2\2\u0150\u0151\b\30\1\2\u0151/\3\2\2\2\u0152\u0153\7\22\2"+
		"\2\u0153\u0154\b\31\1\2\u0154\61\3\2\2\2\u0155\u0156\7\16\2\2\u0156\u0157"+
		"\b\32\1\2\u0157\u0158\5\64\33\2\u0158\63\3\2\2\2\u0159\u015a\b\33\1\2"+
		"\u015a\u015b\5\66\34\2\u015b\u0162\3\2\2\2\u015c\u015d\f\4\2\2\u015d\u015e"+
		"\5:\36\2\u015e\u015f\5\66\34\2\u015f\u0161\3\2\2\2\u0160\u015c\3\2\2\2"+
		"\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\65"+
		"\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\b\34\1\2\u0166\u0167\58\35\2"+
		"\u0167\u016e\3\2\2\2\u0168\u0169\f\4\2\2\u0169\u016a\5<\37\2\u016a\u016b"+
		"\58\35\2\u016b\u016d\3\2\2\2\u016c\u0168\3\2\2\2\u016d\u0170\3\2\2\2\u016e"+
		"\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\67\3\2\2\2\u0170\u016e\3\2\2"+
		"\2\u0171\u0172\5X-\2\u0172\u0173\5\64\33\2\u0173\u0174\5Z.\2\u0174\u017c"+
		"\3\2\2\2\u0175\u017c\5T+\2\u0176\u017c\5P)\2\u0177\u0178\5$\23\2\u0178"+
		"\u0179\5V,\2\u0179\u017a\5$\23\2\u017a\u017c\3\2\2\2\u017b\u0171\3\2\2"+
		"\2\u017b\u0175\3\2\2\2\u017b\u0176\3\2\2\2\u017b\u0177\3\2\2\2\u017c9"+
		"\3\2\2\2\u017d\u017e\7\23\2\2\u017e\u017f\b\36\1\2\u017f;\3\2\2\2\u0180"+
		"\u0181\7\24\2\2\u0181\u0182\b\37\1\2\u0182=\3\2\2\2\u0183\u0184\b \1\2"+
		"\u0184?\3\2\2\2\u0185\u0186\b!\1\2\u0186A\3\2\2\2\u0187\u0188\7\25\2\2"+
		"\u0188\u0189\b\"\1\2\u0189C\3\2\2\2\u018a\u018b\5P)\2\u018b\u018c\b#\1"+
		"\2\u018cE\3\2\2\2\u018d\u018e\5P)\2\u018e\u018f\7\26\2\2\u018f\u0190\b"+
		"$\1\2\u0190\u0192\3\2\2\2\u0191\u018d\3\2\2\2\u0192\u0195\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0193\3\2"+
		"\2\2\u0196\u0197\5P)\2\u0197G\3\2\2\2\u0198\u0199\5 \21\2\u0199\u019a"+
		"\5P)\2\u019a\u019f\3\2\2\2\u019b\u019c\5\60\31\2\u019c\u019d\5P)\2\u019d"+
		"\u019f\3\2\2\2\u019e\u0198\3\2\2\2\u019e\u019b\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u01a1\7\27\2\2\u01a1\u01a2\b%\1\2\u01a2\u01a4\3\2\2\2\u01a3"+
		"\u019e\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01ae\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\5 \21\2\u01a9"+
		"\u01aa\5P)\2\u01aa\u01af\3\2\2\2\u01ab\u01ac\5\60\31\2\u01ac\u01ad\5P"+
		")\2\u01ad\u01af\3\2\2\2\u01ae\u01a8\3\2\2\2\u01ae\u01ab\3\2\2\2\u01af"+
		"I\3\2\2\2\u01b0\u01b1\7\30\2\2\u01b1\u01b5\b&\1\2\u01b2\u01b3\7\31\2\2"+
		"\u01b3\u01b5\b&\1\2\u01b4\u01b0\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5K\3\2"+
		"\2\2\u01b6\u01b7\7\32\2\2\u01b7\u01bb\b\'\1\2\u01b8\u01b9\7\33\2\2\u01b9"+
		"\u01bb\b\'\1\2\u01ba\u01b6\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\3\2"+
		"\2\2\u01bc\u01bd\5D#\2\u01bdM\3\2\2\2\u01be\u01bf\7\34\2\2\u01bf\u01c0"+
		"\b(\1\2\u01c0O\3\2\2\2\u01c1\u01c2\7!\2\2\u01c2\u01c3\b)\1\2\u01c3Q\3"+
		"\2\2\2\u01c4\u01c5\7\"\2\2\u01c5\u01c6\b*\1\2\u01c6S\3\2\2\2\u01c7\u01c8"+
		"\7#\2\2\u01c8\u01c9\b+\1\2\u01c9U\3\2\2\2\u01ca\u01cb\7$\2\2\u01cb\u01cc"+
		"\b,\1\2\u01ccW\3\2\2\2\u01cd\u01ce\7\35\2\2\u01ce\u01cf\b-\1\2\u01cfY"+
		"\3\2\2\2\u01d0\u01d1\7\36\2\2\u01d1\u01d2\b.\1\2\u01d2[\3\2\2\2\u01d3"+
		"\u01d4\7\37\2\2\u01d4\u01d5\b/\1\2\u01d5]\3\2\2\2\u01d6\u01d7\7 \2\2\u01d7"+
		"\u01d8\b\60\1\2\u01d8_\3\2\2\2\u01d9\u01da\b\61\1\2\u01daa\3\2\2\2&ci"+
		"o\177\u0087\u008d\u009a\u009c\u00a2\u00aa\u00af\u00b1\u00b9\u00bf\u00c2"+
		"\u00c9\u00cc\u00d2\u00d9\u00e7\u00eb\u00ef\u0104\u011a\u012f\u013b\u0147"+
		"\u0162\u016e\u017b\u0193\u019e\u01a5\u01ae\u01b4\u01ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}