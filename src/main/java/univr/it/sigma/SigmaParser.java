// Generated from /home/bong/Projects/ProgettoLinguaggi/src/main/java/univr/it/Sigma.g4 by ANTLR 4.13.2
package univr.it.sigma;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SigmaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHILE=1, FOR=2, IN=3, IF=4, ELSE=5, PRINT=6, INPUT=7, RETURN=8, SLY=9, 
		ARNOLD=10, ND=11, TYPES=12, TYPEF=13, TYPEA=14, FUNC=15, MAIN=16, PLUS=17, 
		MINUS=18, MUL=19, DIV=20, MOD=21, POW=22, EQ=23, LT=24, GT=25, LE=26, 
		GE=27, NOT=28, AND=29, OR=30, IS=31, DEF=32, TILDE=33, SEMIC=34, DOT=35, 
		COMMA=36, LPAR=37, RPAR=38, LSPAR=39, RSPAR=40, LCBRAC=41, RCBRAC=42, 
		COMMENT=43, LINE_COMMENT=44, WS=45, FLOAT=46, NEG=47, NAT=48, STRING=49, 
		ID=50;
	public static final int
		RULE_main = 0, RULE_block = 1, RULE_funcDef = 2, RULE_funCall = 3, RULE_statement = 4, 
		RULE_declaration = 5, RULE_array = 6, RULE_bExp = 7, RULE_sExp = 8, RULE_sAtoms = 9, 
		RULE_fExp = 10, RULE_fAtoms = 11, RULE_bfComm = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "block", "funcDef", "funCall", "statement", "declaration", "array", 
			"bExp", "sExp", "sAtoms", "fExp", "fAtoms", "bfComm"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'for'", "'in'", "'if'", "'else'", "'print'", "'input'", 
			"'ret'", "'sly'", "'arnold'", "'ND'", "'STRING'", "'FLOAT'", "'ARRAY'", 
			"'FUNC'", "'MAIN'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'='", 
			"'<'", "'>'", "'<='", "'>='", "'not'", "'and'", "'or'", "':'", "'@'", 
			"'~'", "';'", "'.'", "','", "'('", "')'", "'['", "']'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHILE", "FOR", "IN", "IF", "ELSE", "PRINT", "INPUT", "RETURN", 
			"SLY", "ARNOLD", "ND", "TYPES", "TYPEF", "TYPEA", "FUNC", "MAIN", "PLUS", 
			"MINUS", "MUL", "DIV", "MOD", "POW", "EQ", "LT", "GT", "LE", "GE", "NOT", 
			"AND", "OR", "IS", "DEF", "TILDE", "SEMIC", "DOT", "COMMA", "LPAR", "RPAR", 
			"LSPAR", "RSPAR", "LCBRAC", "RCBRAC", "COMMENT", "LINE_COMMENT", "WS", 
			"FLOAT", "NEG", "NAT", "STRING", "ID"
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
	public String getGrammarFileName() { return "Sigma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SigmaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(SigmaParser.DEF, 0); }
		public TerminalNode MAIN() { return getToken(SigmaParser.MAIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SigmaParser.EOF, 0); }
		public List<FuncDefContext> funcDef() {
			return getRuleContexts(FuncDefContext.class);
		}
		public FuncDefContext funcDef(int i) {
			return getRuleContext(FuncDefContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(26);
					funcDef();
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(32);
			match(DEF);
			setState(33);
			match(MAIN);
			setState(34);
			block();
			setState(35);
			match(EOF);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCBRAC() { return getToken(SigmaParser.LCBRAC, 0); }
		public TerminalNode RCBRAC() { return getToken(SigmaParser.RCBRAC, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(LCBRAC);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1128103225066326L) != 0)) {
				{
				{
				setState(38);
				statement();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(RCBRAC);
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
	public static class FuncDefContext extends ParserRuleContext {
		public Token type;
		public TerminalNode DEF() { return getToken(SigmaParser.DEF, 0); }
		public TerminalNode FUNC() { return getToken(SigmaParser.FUNC, 0); }
		public List<TerminalNode> ID() { return getTokens(SigmaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SigmaParser.ID, i);
		}
		public TerminalNode LPAR() { return getToken(SigmaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SigmaParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> TYPEA() { return getTokens(SigmaParser.TYPEA); }
		public TerminalNode TYPEA(int i) {
			return getToken(SigmaParser.TYPEA, i);
		}
		public List<TerminalNode> TYPES() { return getTokens(SigmaParser.TYPES); }
		public TerminalNode TYPES(int i) {
			return getToken(SigmaParser.TYPES, i);
		}
		public List<TerminalNode> TYPEF() { return getTokens(SigmaParser.TYPEF); }
		public TerminalNode TYPEF(int i) {
			return getToken(SigmaParser.TYPEF, i);
		}
		public List<TerminalNode> TILDE() { return getTokens(SigmaParser.TILDE); }
		public TerminalNode TILDE(int i) {
			return getToken(SigmaParser.TILDE, i);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(DEF);
			setState(47);
			match(FUNC);
			setState(48);
			match(ID);
			setState(49);
			match(LPAR);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) {
				{
				setState(50);
				((FuncDefContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
					((FuncDefContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(51);
				match(ID);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TILDE) {
					{
					{
					setState(52);
					match(TILDE);
					setState(53);
					((FuncDefContext)_localctx).type = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28672L) != 0)) ) {
						((FuncDefContext)_localctx).type = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(54);
					match(ID);
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(62);
			match(RPAR);
			setState(63);
			block();
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
	public static class FunCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SigmaParser.ID, 0); }
		public TerminalNode LPAR() { return getToken(SigmaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SigmaParser.RPAR, 0); }
		public List<FExpContext> fExp() {
			return getRuleContexts(FExpContext.class);
		}
		public FExpContext fExp(int i) {
			return getRuleContext(FExpContext.class,i);
		}
		public List<SExpContext> sExp() {
			return getRuleContexts(SExpContext.class);
		}
		public SExpContext sExp(int i) {
			return getRuleContext(SExpContext.class,i);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public List<TerminalNode> TILDE() { return getTokens(SigmaParser.TILDE); }
		public TerminalNode TILDE(int i) {
			return getToken(SigmaParser.TILDE, i);
		}
		public FunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunCallContext funCall() throws RecognitionException {
		FunCallContext _localctx = new FunCallContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ID);
			setState(66);
			match(LPAR);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2184317287530624L) != 0)) {
				{
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(67);
					fExp(0);
					}
					break;
				case 2:
					{
					setState(68);
					sExp(0);
					}
					break;
				case 3:
					{
					setState(69);
					array();
					}
					break;
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TILDE) {
					{
					{
					setState(72);
					match(TILDE);
					setState(76);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(73);
						fExp(0);
						}
						break;
					case 2:
						{
						setState(74);
						sExp(0);
						}
						break;
					case 3:
						{
						setState(75);
						array();
						}
						break;
					}
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(85);
			match(RPAR);
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
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStmtContext extends StatementContext {
		public TerminalNode PRINT() { return getToken(SigmaParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(SigmaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SigmaParser.RPAR, 0); }
		public TerminalNode SEMIC() { return getToken(SigmaParser.SEMIC, 0); }
		public SExpContext sExp() {
			return getRuleContext(SExpContext.class,0);
		}
		public PrintStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends StatementContext {
		public TerminalNode FOR() { return getToken(SigmaParser.FOR, 0); }
		public TerminalNode ID() { return getToken(SigmaParser.ID, 0); }
		public TerminalNode IN() { return getToken(SigmaParser.IN, 0); }
		public TerminalNode LPAR() { return getToken(SigmaParser.LPAR, 0); }
		public List<FExpContext> fExp() {
			return getRuleContexts(FExpContext.class);
		}
		public FExpContext fExp(int i) {
			return getRuleContext(FExpContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(SigmaParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode TILDE() { return getToken(SigmaParser.TILDE, 0); }
		public ForStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(SigmaParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(SigmaParser.LPAR, 0); }
		public BExpContext bExp() {
			return getRuleContext(BExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SigmaParser.RPAR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NdStmtContext extends StatementContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ND() { return getToken(SigmaParser.ND, 0); }
		public NdStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterNdStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitNdStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitNdStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BfStmtContext extends StatementContext {
		public TerminalNode SLY() { return getToken(SigmaParser.SLY, 0); }
		public TerminalNode LCBRAC() { return getToken(SigmaParser.LCBRAC, 0); }
		public BfCommContext bfComm() {
			return getRuleContext(BfCommContext.class,0);
		}
		public TerminalNode RCBRAC() { return getToken(SigmaParser.RCBRAC, 0); }
		public TerminalNode ARNOLD() { return getToken(SigmaParser.ARNOLD, 0); }
		public BfStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterBfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitBfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitBfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnFStmtContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(SigmaParser.RETURN, 0); }
		public TerminalNode TYPEF() { return getToken(SigmaParser.TYPEF, 0); }
		public TerminalNode IS() { return getToken(SigmaParser.IS, 0); }
		public FExpContext fExp() {
			return getRuleContext(FExpContext.class,0);
		}
		public TerminalNode SEMIC() { return getToken(SigmaParser.SEMIC, 0); }
		public ReturnFStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterReturnFStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitReturnFStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitReturnFStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseStmtContext extends StatementContext {
		public TerminalNode IF() { return getToken(SigmaParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(SigmaParser.LPAR, 0); }
		public BExpContext bExp() {
			return getRuleContext(BExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SigmaParser.RPAR, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SigmaParser.ELSE, 0); }
		public IfElseStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterIfElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitIfElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitIfElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecStmtContext extends StatementContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMIC() { return getToken(SigmaParser.SEMIC, 0); }
		public DecStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterDecStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitDecStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitDecStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnSStmtContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(SigmaParser.RETURN, 0); }
		public TerminalNode TYPES() { return getToken(SigmaParser.TYPES, 0); }
		public TerminalNode IS() { return getToken(SigmaParser.IS, 0); }
		public SExpContext sExp() {
			return getRuleContext(SExpContext.class,0);
		}
		public TerminalNode SEMIC() { return getToken(SigmaParser.SEMIC, 0); }
		public ReturnSStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterReturnSStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitReturnSStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitReturnSStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReDecStmtContext extends StatementContext {
		public TerminalNode ID() { return getToken(SigmaParser.ID, 0); }
		public TerminalNode IS() { return getToken(SigmaParser.IS, 0); }
		public TerminalNode SEMIC() { return getToken(SigmaParser.SEMIC, 0); }
		public SExpContext sExp() {
			return getRuleContext(SExpContext.class,0);
		}
		public List<FExpContext> fExp() {
			return getRuleContexts(FExpContext.class);
		}
		public FExpContext fExp(int i) {
			return getRuleContext(FExpContext.class,i);
		}
		public TerminalNode LSPAR() { return getToken(SigmaParser.LSPAR, 0); }
		public TerminalNode RSPAR() { return getToken(SigmaParser.RSPAR, 0); }
		public ReDecStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterReDecStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitReDecStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitReDecStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunStmtContext extends StatementContext {
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public TerminalNode SEMIC() { return getToken(SigmaParser.SEMIC, 0); }
		public FunStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterFunStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitFunStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitFunStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new IfElseStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(IF);
				setState(88);
				match(LPAR);
				setState(89);
				bExp(0);
				setState(90);
				match(RPAR);
				setState(91);
				block();
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(92);
					match(ELSE);
					setState(93);
					block();
					}
				}

				}
				break;
			case 2:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(WHILE);
				setState(97);
				match(LPAR);
				setState(98);
				bExp(0);
				setState(99);
				match(RPAR);
				setState(100);
				block();
				}
				break;
			case 3:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(FOR);
				setState(103);
				match(ID);
				setState(104);
				match(IN);
				setState(105);
				match(LPAR);
				setState(109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(106);
					fExp(0);
					setState(107);
					match(TILDE);
					}
					break;
				}
				setState(111);
				fExp(0);
				setState(112);
				match(RPAR);
				setState(113);
				block();
				}
				break;
			case 4:
				_localctx = new FunStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				funCall();
				setState(116);
				match(SEMIC);
				}
				break;
			case 5:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				match(PRINT);
				setState(119);
				match(LPAR);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1691048883519616L) != 0)) {
					{
					setState(120);
					sExp(0);
					}
				}

				setState(123);
				match(RPAR);
				setState(124);
				match(SEMIC);
				}
				break;
			case 6:
				_localctx = new DecStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				declaration();
				setState(126);
				match(SEMIC);
				}
				break;
			case 7:
				_localctx = new ReDecStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(128);
				match(ID);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSPAR) {
					{
					setState(129);
					match(LSPAR);
					setState(130);
					fExp(0);
					setState(131);
					match(RSPAR);
					}
				}

				setState(135);
				match(IS);
				setState(138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(136);
					sExp(0);
					}
					break;
				case 2:
					{
					setState(137);
					fExp(0);
					}
					break;
				}
				setState(140);
				match(SEMIC);
				}
				break;
			case 8:
				_localctx = new ReturnSStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				match(RETURN);
				setState(143);
				match(TYPES);
				setState(144);
				match(IS);
				setState(145);
				sExp(0);
				setState(146);
				match(SEMIC);
				}
				break;
			case 9:
				_localctx = new ReturnFStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(148);
				match(RETURN);
				setState(149);
				match(TYPEF);
				setState(150);
				match(IS);
				setState(151);
				fExp(0);
				setState(152);
				match(SEMIC);
				}
				break;
			case 10:
				_localctx = new NdStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(154);
				block();
				setState(155);
				match(ND);
				setState(156);
				block();
				}
				break;
			case 11:
				_localctx = new BfStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(158);
				match(SLY);
				setState(159);
				match(LCBRAC);
				setState(160);
				bfComm();
				setState(161);
				match(RCBRAC);
				setState(162);
				match(ARNOLD);
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
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecArrayContext extends DeclarationContext {
		public Token type;
		public TerminalNode DEF() { return getToken(SigmaParser.DEF, 0); }
		public TerminalNode TYPEA() { return getToken(SigmaParser.TYPEA, 0); }
		public TerminalNode TILDE() { return getToken(SigmaParser.TILDE, 0); }
		public TerminalNode ID() { return getToken(SigmaParser.ID, 0); }
		public TerminalNode IS() { return getToken(SigmaParser.IS, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode TYPES() { return getToken(SigmaParser.TYPES, 0); }
		public TerminalNode TYPEF() { return getToken(SigmaParser.TYPEF, 0); }
		public DecArrayContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterDecArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitDecArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitDecArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecStringContext extends DeclarationContext {
		public TerminalNode DEF() { return getToken(SigmaParser.DEF, 0); }
		public TerminalNode TYPES() { return getToken(SigmaParser.TYPES, 0); }
		public TerminalNode ID() { return getToken(SigmaParser.ID, 0); }
		public TerminalNode IS() { return getToken(SigmaParser.IS, 0); }
		public SExpContext sExp() {
			return getRuleContext(SExpContext.class,0);
		}
		public DecStringContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterDecString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitDecString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitDecString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecFloatContext extends DeclarationContext {
		public TerminalNode DEF() { return getToken(SigmaParser.DEF, 0); }
		public TerminalNode TYPEF() { return getToken(SigmaParser.TYPEF, 0); }
		public TerminalNode ID() { return getToken(SigmaParser.ID, 0); }
		public TerminalNode IS() { return getToken(SigmaParser.IS, 0); }
		public FExpContext fExp() {
			return getRuleContext(FExpContext.class,0);
		}
		public DecFloatContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterDecFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitDecFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitDecFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaration);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new DecStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(DEF);
				setState(167);
				match(TYPES);
				setState(168);
				match(ID);
				setState(169);
				match(IS);
				setState(170);
				sExp(0);
				}
				break;
			case 2:
				_localctx = new DecFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(DEF);
				setState(172);
				match(TYPEF);
				setState(173);
				match(ID);
				setState(174);
				match(IS);
				setState(175);
				fExp(0);
				}
				break;
			case 3:
				_localctx = new DecArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(DEF);
				setState(177);
				match(TYPEA);
				setState(178);
				match(TILDE);
				setState(179);
				((DecArrayContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TYPES || _la==TYPEF) ) {
					((DecArrayContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
				match(ID);
				setState(181);
				match(IS);
				setState(182);
				array();
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
	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayFloatContext extends ArrayContext {
		public TerminalNode LSPAR() { return getToken(SigmaParser.LSPAR, 0); }
		public TerminalNode RSPAR() { return getToken(SigmaParser.RSPAR, 0); }
		public List<FExpContext> fExp() {
			return getRuleContexts(FExpContext.class);
		}
		public FExpContext fExp(int i) {
			return getRuleContext(FExpContext.class,i);
		}
		public List<TerminalNode> TILDE() { return getTokens(SigmaParser.TILDE); }
		public TerminalNode TILDE(int i) {
			return getToken(SigmaParser.TILDE, i);
		}
		public ArrayFloatContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterArrayFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitArrayFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitArrayFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayStringContext extends ArrayContext {
		public TerminalNode LSPAR() { return getToken(SigmaParser.LSPAR, 0); }
		public TerminalNode RSPAR() { return getToken(SigmaParser.RSPAR, 0); }
		public List<SExpContext> sExp() {
			return getRuleContexts(SExpContext.class);
		}
		public SExpContext sExp(int i) {
			return getRuleContext(SExpContext.class,i);
		}
		public List<TerminalNode> TILDE() { return getTokens(SigmaParser.TILDE); }
		public TerminalNode TILDE(int i) {
			return getToken(SigmaParser.TILDE, i);
		}
		public ArrayStringContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterArrayString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitArrayString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitArrayString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayVarContext extends ArrayContext {
		public TerminalNode ID() { return getToken(SigmaParser.ID, 0); }
		public ArrayVarContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterArrayVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitArrayVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitArrayVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array);
		int _la;
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ArrayVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ArrayFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(LSPAR);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1618618555039872L) != 0)) {
					{
					setState(187);
					fExp(0);
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TILDE) {
						{
						{
						setState(188);
						match(TILDE);
						setState(189);
						fExp(0);
						}
						}
						setState(194);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(197);
				match(RSPAR);
				}
				break;
			case 3:
				_localctx = new ArrayStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(LSPAR);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1691048883519616L) != 0)) {
					{
					setState(199);
					sExp(0);
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TILDE) {
						{
						{
						setState(200);
						match(TILDE);
						setState(201);
						sExp(0);
						}
						}
						setState(206);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(209);
				match(RSPAR);
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
	public static class BExpContext extends ParserRuleContext {
		public BExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bExp; }
	 
		public BExpContext() { }
		public void copyFrom(BExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BParContext extends BExpContext {
		public TerminalNode LPAR() { return getToken(SigmaParser.LPAR, 0); }
		public BExpContext bExp() {
			return getRuleContext(BExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SigmaParser.RPAR, 0); }
		public BParContext(BExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterBPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitBPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitBPar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends BExpContext {
		public TerminalNode NOT() { return getToken(SigmaParser.NOT, 0); }
		public BExpContext bExp() {
			return getRuleContext(BExpContext.class,0);
		}
		public NotContext(BExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends BExpContext {
		public List<BExpContext> bExp() {
			return getRuleContexts(BExpContext.class);
		}
		public BExpContext bExp(int i) {
			return getRuleContext(BExpContext.class,i);
		}
		public TerminalNode OR() { return getToken(SigmaParser.OR, 0); }
		public OrContext(BExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SCompareContext extends BExpContext {
		public List<SExpContext> sExp() {
			return getRuleContexts(SExpContext.class);
		}
		public SExpContext sExp(int i) {
			return getRuleContext(SExpContext.class,i);
		}
		public TerminalNode EQ() { return getToken(SigmaParser.EQ, 0); }
		public SCompareContext(BExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterSCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitSCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitSCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends BExpContext {
		public List<BExpContext> bExp() {
			return getRuleContexts(BExpContext.class);
		}
		public BExpContext bExp(int i) {
			return getRuleContext(BExpContext.class,i);
		}
		public TerminalNode AND() { return getToken(SigmaParser.AND, 0); }
		public AndContext(BExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FCompareContext extends BExpContext {
		public Token op;
		public List<FExpContext> fExp() {
			return getRuleContexts(FExpContext.class);
		}
		public FExpContext fExp(int i) {
			return getRuleContext(FExpContext.class,i);
		}
		public TerminalNode EQ() { return getToken(SigmaParser.EQ, 0); }
		public TerminalNode LT() { return getToken(SigmaParser.LT, 0); }
		public TerminalNode GT() { return getToken(SigmaParser.GT, 0); }
		public TerminalNode LE() { return getToken(SigmaParser.LE, 0); }
		public TerminalNode GE() { return getToken(SigmaParser.GE, 0); }
		public FCompareContext(BExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterFCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitFCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitFCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BExpContext bExp() throws RecognitionException {
		return bExp(0);
	}

	private BExpContext bExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BExpContext _localctx = new BExpContext(_ctx, _parentState);
		BExpContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_bExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new SCompareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(213);
				sExp(0);
				setState(214);
				match(EQ);
				setState(215);
				sExp(0);
				}
				break;
			case 2:
				{
				_localctx = new FCompareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217);
				fExp(0);
				setState(218);
				((FCompareContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 260046848L) != 0)) ) {
					((FCompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(219);
				fExp(0);
				}
				break;
			case 3:
				{
				_localctx = new BParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				match(LPAR);
				setState(222);
				bExp(0);
				setState(223);
				match(RPAR);
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				match(NOT);
				setState(226);
				bExp(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(235);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new BExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bExp);
						setState(229);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(230);
						match(AND);
						setState(231);
						bExp(3);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new BExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bExp);
						setState(232);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(233);
						match(OR);
						setState(234);
						bExp(2);
						}
						break;
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
	public static class SExpContext extends ParserRuleContext {
		public SExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sExp; }
	 
		public SExpContext() { }
		public void copyFrom(SExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SAtomContext extends SExpContext {
		public SAtomsContext sAtoms() {
			return getRuleContext(SAtomsContext.class,0);
		}
		public SAtomContext(SExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterSAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitSAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitSAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConcatContext extends SExpContext {
		public List<SExpContext> sExp() {
			return getRuleContexts(SExpContext.class);
		}
		public SExpContext sExp(int i) {
			return getRuleContext(SExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(SigmaParser.PLUS, 0); }
		public ConcatContext(SExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitConcat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitConcat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatToStringContext extends SExpContext {
		public TerminalNode LCBRAC() { return getToken(SigmaParser.LCBRAC, 0); }
		public FExpContext fExp() {
			return getRuleContext(FExpContext.class,0);
		}
		public TerminalNode RCBRAC() { return getToken(SigmaParser.RCBRAC, 0); }
		public FloatToStringContext(SExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterFloatToString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitFloatToString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitFloatToString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SExpContext sExp() throws RecognitionException {
		return sExp(0);
	}

	private SExpContext sExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SExpContext _localctx = new SExpContext(_ctx, _parentState);
		SExpContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_sExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
			case STRING:
			case ID:
				{
				_localctx = new SAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(241);
				sAtoms();
				}
				break;
			case LCBRAC:
				{
				_localctx = new FloatToStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				match(LCBRAC);
				setState(243);
				fExp(0);
				setState(244);
				match(RCBRAC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConcatContext(new SExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_sExp);
					setState(248);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(249);
					match(PLUS);
					setState(250);
					sExp(3);
					}
					} 
				}
				setState(255);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SAtomsContext extends ParserRuleContext {
		public SAtomsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sAtoms; }
	 
		public SAtomsContext() { }
		public void copyFrom(SAtomsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SVarContext extends SAtomsContext {
		public TerminalNode ID() { return getToken(SigmaParser.ID, 0); }
		public TerminalNode LSPAR() { return getToken(SigmaParser.LSPAR, 0); }
		public FExpContext fExp() {
			return getRuleContext(FExpContext.class,0);
		}
		public TerminalNode RSPAR() { return getToken(SigmaParser.RSPAR, 0); }
		public SVarContext(SAtomsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterSVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitSVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitSVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SInputContext extends SAtomsContext {
		public TerminalNode INPUT() { return getToken(SigmaParser.INPUT, 0); }
		public TerminalNode LPAR() { return getToken(SigmaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SigmaParser.RPAR, 0); }
		public SInputContext(SAtomsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterSInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitSInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitSInput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends SAtomsContext {
		public TerminalNode STRING() { return getToken(SigmaParser.STRING, 0); }
		public StringContext(SAtomsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SReturnContext extends SAtomsContext {
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public SReturnContext(SAtomsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterSReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitSReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitSReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SAtomsContext sAtoms() throws RecognitionException {
		SAtomsContext _localctx = new SAtomsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sAtoms);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new SVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(ID);
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(257);
					match(LSPAR);
					setState(258);
					fExp(0);
					setState(259);
					match(RSPAR);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new SInputContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(INPUT);
				setState(265);
				match(LPAR);
				setState(266);
				match(RPAR);
				}
				break;
			case 4:
				_localctx = new SReturnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				funCall();
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
	public static class FExpContext extends ParserRuleContext {
		public FExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fExp; }
	 
		public FExpContext() { }
		public void copyFrom(FExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivModContext extends FExpContext {
		public Token op;
		public List<FExpContext> fExp() {
			return getRuleContexts(FExpContext.class);
		}
		public FExpContext fExp(int i) {
			return getRuleContext(FExpContext.class,i);
		}
		public TerminalNode MUL() { return getToken(SigmaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SigmaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SigmaParser.MOD, 0); }
		public MulDivModContext(FExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusMinusContext extends FExpContext {
		public Token op;
		public List<FExpContext> fExp() {
			return getRuleContexts(FExpContext.class);
		}
		public FExpContext fExp(int i) {
			return getRuleContext(FExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(SigmaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SigmaParser.MINUS, 0); }
		public PlusMinusContext(FExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FParContext extends FExpContext {
		public TerminalNode LPAR() { return getToken(SigmaParser.LPAR, 0); }
		public FExpContext fExp() {
			return getRuleContext(FExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SigmaParser.RPAR, 0); }
		public FParContext(FExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterFPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitFPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitFPar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FAtomContext extends FExpContext {
		public FAtomsContext fAtoms() {
			return getRuleContext(FAtomsContext.class,0);
		}
		public FAtomContext(FExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterFAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitFAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitFAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerContext extends FExpContext {
		public List<FExpContext> fExp() {
			return getRuleContexts(FExpContext.class);
		}
		public FExpContext fExp(int i) {
			return getRuleContext(FExpContext.class,i);
		}
		public TerminalNode POW() { return getToken(SigmaParser.POW, 0); }
		public PowerContext(FExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FExpContext fExp() throws RecognitionException {
		return fExp(0);
	}

	private FExpContext fExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FExpContext _localctx = new FExpContext(_ctx, _parentState);
		FExpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_fExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
			case FLOAT:
			case NEG:
			case NAT:
			case ID:
				{
				_localctx = new FAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(271);
				fAtoms();
				}
				break;
			case LPAR:
				{
				_localctx = new FParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
				match(LPAR);
				setState(273);
				fExp(0);
				setState(274);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(287);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new FExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_fExp);
						setState(278);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(279);
						match(POW);
						setState(280);
						fExp(3);
						}
						break;
					case 2:
						{
						_localctx = new MulDivModContext(new FExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_fExp);
						setState(281);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(282);
						((MulDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
							((MulDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(283);
						fExp(3);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusContext(new FExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_fExp);
						setState(284);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(285);
						((PlusMinusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(286);
						fExp(2);
						}
						break;
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
	public static class FAtomsContext extends ParserRuleContext {
		public FAtomsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fAtoms; }
	 
		public FAtomsContext() { }
		public void copyFrom(FAtomsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FInputContext extends FAtomsContext {
		public TerminalNode INPUT() { return getToken(SigmaParser.INPUT, 0); }
		public TerminalNode LPAR() { return getToken(SigmaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SigmaParser.RPAR, 0); }
		public FInputContext(FAtomsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterFInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitFInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitFInput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumbersContext extends FAtomsContext {
		public Token type;
		public TerminalNode FLOAT() { return getToken(SigmaParser.FLOAT, 0); }
		public TerminalNode NAT() { return getToken(SigmaParser.NAT, 0); }
		public TerminalNode NEG() { return getToken(SigmaParser.NEG, 0); }
		public NumbersContext(FAtomsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterNumbers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitNumbers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitNumbers(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FReturnContext extends FAtomsContext {
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public FReturnContext(FAtomsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterFReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitFReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitFReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FVarContext extends FAtomsContext {
		public TerminalNode ID() { return getToken(SigmaParser.ID, 0); }
		public TerminalNode LSPAR() { return getToken(SigmaParser.LSPAR, 0); }
		public FExpContext fExp() {
			return getRuleContext(FExpContext.class,0);
		}
		public TerminalNode RSPAR() { return getToken(SigmaParser.RSPAR, 0); }
		public FVarContext(FAtomsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterFVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitFVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitFVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FAtomsContext fAtoms() throws RecognitionException {
		FAtomsContext _localctx = new FAtomsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fAtoms);
		int _la;
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new FVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(ID);
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(293);
					match(LSPAR);
					setState(294);
					fExp(0);
					setState(295);
					match(RSPAR);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new NumbersContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				((NumbersContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 492581209243648L) != 0)) ) {
					((NumbersContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new FInputContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(INPUT);
				setState(301);
				match(LPAR);
				setState(302);
				match(RPAR);
				}
				break;
			case 4:
				_localctx = new FReturnContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				funCall();
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
	public static class BfCommContext extends ParserRuleContext {
		public BfCommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfComm; }
	 
		public BfCommContext() { }
		public void copyFrom(BfCommContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NilContext extends BfCommContext {
		public NilContext(BfCommContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterNil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitNil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitNil(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusContext extends BfCommContext {
		public TerminalNode MINUS() { return getToken(SigmaParser.MINUS, 0); }
		public BfCommContext bfComm() {
			return getRuleContext(BfCommContext.class,0);
		}
		public MinusContext(BfCommContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommaContext extends BfCommContext {
		public TerminalNode COMMA() { return getToken(SigmaParser.COMMA, 0); }
		public BfCommContext bfComm() {
			return getRuleContext(BfCommContext.class,0);
		}
		public CommaContext(BfCommContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitComma(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends BfCommContext {
		public TerminalNode LSPAR() { return getToken(SigmaParser.LSPAR, 0); }
		public List<BfCommContext> bfComm() {
			return getRuleContexts(BfCommContext.class);
		}
		public BfCommContext bfComm(int i) {
			return getRuleContext(BfCommContext.class,i);
		}
		public TerminalNode RSPAR() { return getToken(SigmaParser.RSPAR, 0); }
		public LoopContext(BfCommContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtContext extends BfCommContext {
		public TerminalNode LT() { return getToken(SigmaParser.LT, 0); }
		public BfCommContext bfComm() {
			return getRuleContext(BfCommContext.class,0);
		}
		public LtContext(BfCommContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitLt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotContext extends BfCommContext {
		public TerminalNode DOT() { return getToken(SigmaParser.DOT, 0); }
		public BfCommContext bfComm() {
			return getRuleContext(BfCommContext.class,0);
		}
		public DotContext(BfCommContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitDot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtContext extends BfCommContext {
		public TerminalNode GT() { return getToken(SigmaParser.GT, 0); }
		public BfCommContext bfComm() {
			return getRuleContext(BfCommContext.class,0);
		}
		public GtContext(BfCommContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitGt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusContext extends BfCommContext {
		public TerminalNode PLUS() { return getToken(SigmaParser.PLUS, 0); }
		public BfCommContext bfComm() {
			return getRuleContext(BfCommContext.class,0);
		}
		public PlusContext(BfCommContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SigmaListener ) ((SigmaListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SigmaVisitor ) return ((SigmaVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfCommContext bfComm() throws RecognitionException {
		BfCommContext _localctx = new BfCommContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bfComm);
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				_localctx = new LtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(LT);
				setState(307);
				bfComm();
				}
				break;
			case GT:
				_localctx = new GtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(GT);
				setState(309);
				bfComm();
				}
				break;
			case PLUS:
				_localctx = new PlusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				match(PLUS);
				setState(311);
				bfComm();
				}
				break;
			case MINUS:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				match(MINUS);
				setState(313);
				bfComm();
				}
				break;
			case DOT:
				_localctx = new DotContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
				match(DOT);
				setState(315);
				bfComm();
				}
				break;
			case COMMA:
				_localctx = new CommaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(316);
				match(COMMA);
				setState(317);
				bfComm();
				}
				break;
			case LSPAR:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(318);
				match(LSPAR);
				setState(319);
				bfComm();
				setState(320);
				match(RSPAR);
				setState(321);
				bfComm();
				}
				break;
			case RSPAR:
			case RCBRAC:
				_localctx = new NilContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return bExp_sempred((BExpContext)_localctx, predIndex);
		case 8:
			return sExp_sempred((SExpContext)_localctx, predIndex);
		case 10:
			return fExp_sempred((FExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bExp_sempred(BExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sExp_sempred(SExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean fExp_sempred(FExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u0147\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000\u001f"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0005\u0001(\b\u0001\n\u0001\f\u0001+\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00028\b"+
		"\u0002\n\u0002\f\u0002;\t\u0002\u0003\u0002=\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003G\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003M\b\u0003\u0005\u0003O\b\u0003\n\u0003\f\u0003R\t\u0003"+
		"\u0003\u0003T\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"_\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004n\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004z\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0086\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u008b\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a5\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b8\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u00bf\b\u0006\n\u0006\f\u0006\u00c2\t\u0006\u0003\u0006\u00c4\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u00cb\b\u0006\n\u0006\f\u0006\u00ce\t\u0006\u0003\u0006\u00d0\b\u0006"+
		"\u0001\u0006\u0003\u0006\u00d3\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00e4\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00ec\b\u0007\n\u0007\f\u0007\u00ef"+
		"\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00f7"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0005\b\u00fc\b\b\n\b\f\b\u00ff\t\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0106\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u010d\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0115\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u0120\b\n\n\n\f\n\u0123\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u012a\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0131\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u0145\b\f\u0001\f\u0000\u0003\u000e\u0010\u0014"+
		"\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000"+
		"\u0006\u0001\u0000\f\u000e\u0001\u0000\f\r\u0001\u0000\u0017\u001b\u0001"+
		"\u0000\u0013\u0015\u0001\u0000\u0011\u0012\u0001\u0000.0\u0174\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0002%\u0001\u0000\u0000\u0000\u0004.\u0001\u0000"+
		"\u0000\u0000\u0006A\u0001\u0000\u0000\u0000\b\u00a4\u0001\u0000\u0000"+
		"\u0000\n\u00b7\u0001\u0000\u0000\u0000\f\u00d2\u0001\u0000\u0000\u0000"+
		"\u000e\u00e3\u0001\u0000\u0000\u0000\u0010\u00f6\u0001\u0000\u0000\u0000"+
		"\u0012\u010c\u0001\u0000\u0000\u0000\u0014\u0114\u0001\u0000\u0000\u0000"+
		"\u0016\u0130\u0001\u0000\u0000\u0000\u0018\u0144\u0001\u0000\u0000\u0000"+
		"\u001a\u001c\u0003\u0004\u0002\u0000\u001b\u001a\u0001\u0000\u0000\u0000"+
		"\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000"+
		"\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f"+
		"\u001d\u0001\u0000\u0000\u0000 !\u0005 \u0000\u0000!\"\u0005\u0010\u0000"+
		"\u0000\"#\u0003\u0002\u0001\u0000#$\u0005\u0000\u0000\u0001$\u0001\u0001"+
		"\u0000\u0000\u0000%)\u0005)\u0000\u0000&(\u0003\b\u0004\u0000\'&\u0001"+
		"\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		")*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000"+
		"\u0000,-\u0005*\u0000\u0000-\u0003\u0001\u0000\u0000\u0000./\u0005 \u0000"+
		"\u0000/0\u0005\u000f\u0000\u000001\u00052\u0000\u00001<\u0005%\u0000\u0000"+
		"23\u0007\u0000\u0000\u000039\u00052\u0000\u000045\u0005!\u0000\u00005"+
		"6\u0007\u0000\u0000\u000068\u00052\u0000\u000074\u0001\u0000\u0000\u0000"+
		"8;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<2\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0005"+
		"&\u0000\u0000?@\u0003\u0002\u0001\u0000@\u0005\u0001\u0000\u0000\u0000"+
		"AB\u00052\u0000\u0000BS\u0005%\u0000\u0000CG\u0003\u0014\n\u0000DG\u0003"+
		"\u0010\b\u0000EG\u0003\f\u0006\u0000FC\u0001\u0000\u0000\u0000FD\u0001"+
		"\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000GP\u0001\u0000\u0000\u0000"+
		"HL\u0005!\u0000\u0000IM\u0003\u0014\n\u0000JM\u0003\u0010\b\u0000KM\u0003"+
		"\f\u0006\u0000LI\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LK\u0001"+
		"\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000NH\u0001\u0000\u0000\u0000"+
		"OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000SF\u0001\u0000"+
		"\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0005"+
		"&\u0000\u0000V\u0007\u0001\u0000\u0000\u0000WX\u0005\u0004\u0000\u0000"+
		"XY\u0005%\u0000\u0000YZ\u0003\u000e\u0007\u0000Z[\u0005&\u0000\u0000["+
		"^\u0003\u0002\u0001\u0000\\]\u0005\u0005\u0000\u0000]_\u0003\u0002\u0001"+
		"\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u00a5\u0001"+
		"\u0000\u0000\u0000`a\u0005\u0001\u0000\u0000ab\u0005%\u0000\u0000bc\u0003"+
		"\u000e\u0007\u0000cd\u0005&\u0000\u0000de\u0003\u0002\u0001\u0000e\u00a5"+
		"\u0001\u0000\u0000\u0000fg\u0005\u0002\u0000\u0000gh\u00052\u0000\u0000"+
		"hi\u0005\u0003\u0000\u0000im\u0005%\u0000\u0000jk\u0003\u0014\n\u0000"+
		"kl\u0005!\u0000\u0000ln\u0001\u0000\u0000\u0000mj\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0003\u0014\n\u0000"+
		"pq\u0005&\u0000\u0000qr\u0003\u0002\u0001\u0000r\u00a5\u0001\u0000\u0000"+
		"\u0000st\u0003\u0006\u0003\u0000tu\u0005\"\u0000\u0000u\u00a5\u0001\u0000"+
		"\u0000\u0000vw\u0005\u0006\u0000\u0000wy\u0005%\u0000\u0000xz\u0003\u0010"+
		"\b\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{|\u0005&\u0000\u0000|\u00a5\u0005\"\u0000\u0000}~\u0003\n"+
		"\u0005\u0000~\u007f\u0005\"\u0000\u0000\u007f\u00a5\u0001\u0000\u0000"+
		"\u0000\u0080\u0085\u00052\u0000\u0000\u0081\u0082\u0005\'\u0000\u0000"+
		"\u0082\u0083\u0003\u0014\n\u0000\u0083\u0084\u0005(\u0000\u0000\u0084"+
		"\u0086\u0001\u0000\u0000\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u008a\u0005\u001f\u0000\u0000\u0088\u008b\u0003\u0010\b\u0000\u0089\u008b"+
		"\u0003\u0014\n\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"\"\u0000\u0000\u008d\u00a5\u0001\u0000\u0000\u0000\u008e\u008f\u0005\b"+
		"\u0000\u0000\u008f\u0090\u0005\f\u0000\u0000\u0090\u0091\u0005\u001f\u0000"+
		"\u0000\u0091\u0092\u0003\u0010\b\u0000\u0092\u0093\u0005\"\u0000\u0000"+
		"\u0093\u00a5\u0001\u0000\u0000\u0000\u0094\u0095\u0005\b\u0000\u0000\u0095"+
		"\u0096\u0005\r\u0000\u0000\u0096\u0097\u0005\u001f\u0000\u0000\u0097\u0098"+
		"\u0003\u0014\n\u0000\u0098\u0099\u0005\"\u0000\u0000\u0099\u00a5\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0003\u0002\u0001\u0000\u009b\u009c\u0005"+
		"\u000b\u0000\u0000\u009c\u009d\u0003\u0002\u0001\u0000\u009d\u00a5\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0005\t\u0000\u0000\u009f\u00a0\u0005)"+
		"\u0000\u0000\u00a0\u00a1\u0003\u0018\f\u0000\u00a1\u00a2\u0005*\u0000"+
		"\u0000\u00a2\u00a3\u0005\n\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a4W\u0001\u0000\u0000\u0000\u00a4`\u0001\u0000\u0000\u0000\u00a4f"+
		"\u0001\u0000\u0000\u0000\u00a4s\u0001\u0000\u0000\u0000\u00a4v\u0001\u0000"+
		"\u0000\u0000\u00a4}\u0001\u0000\u0000\u0000\u00a4\u0080\u0001\u0000\u0000"+
		"\u0000\u00a4\u008e\u0001\u0000\u0000\u0000\u00a4\u0094\u0001\u0000\u0000"+
		"\u0000\u00a4\u009a\u0001\u0000\u0000\u0000\u00a4\u009e\u0001\u0000\u0000"+
		"\u0000\u00a5\t\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005 \u0000\u0000"+
		"\u00a7\u00a8\u0005\f\u0000\u0000\u00a8\u00a9\u00052\u0000\u0000\u00a9"+
		"\u00aa\u0005\u001f\u0000\u0000\u00aa\u00b8\u0003\u0010\b\u0000\u00ab\u00ac"+
		"\u0005 \u0000\u0000\u00ac\u00ad\u0005\r\u0000\u0000\u00ad\u00ae\u0005"+
		"2\u0000\u0000\u00ae\u00af\u0005\u001f\u0000\u0000\u00af\u00b8\u0003\u0014"+
		"\n\u0000\u00b0\u00b1\u0005 \u0000\u0000\u00b1\u00b2\u0005\u000e\u0000"+
		"\u0000\u00b2\u00b3\u0005!\u0000\u0000\u00b3\u00b4\u0007\u0001\u0000\u0000"+
		"\u00b4\u00b5\u00052\u0000\u0000\u00b5\u00b6\u0005\u001f\u0000\u0000\u00b6"+
		"\u00b8\u0003\f\u0006\u0000\u00b7\u00a6\u0001\u0000\u0000\u0000\u00b7\u00ab"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b0\u0001\u0000\u0000\u0000\u00b8\u000b"+
		"\u0001\u0000\u0000\u0000\u00b9\u00d3\u00052\u0000\u0000\u00ba\u00c3\u0005"+
		"\'\u0000\u0000\u00bb\u00c0\u0003\u0014\n\u0000\u00bc\u00bd\u0005!\u0000"+
		"\u0000\u00bd\u00bf\u0003\u0014\n\u0000\u00be\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00bb\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c5\u00d3\u0005(\u0000\u0000\u00c6\u00cf\u0005\'\u0000\u0000\u00c7"+
		"\u00cc\u0003\u0010\b\u0000\u00c8\u00c9\u0005!\u0000\u0000\u00c9\u00cb"+
		"\u0003\u0010\b\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cf\u00c7\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d3\u0005"+
		"(\u0000\u0000\u00d2\u00b9\u0001\u0000\u0000\u0000\u00d2\u00ba\u0001\u0000"+
		"\u0000\u0000\u00d2\u00c6\u0001\u0000\u0000\u0000\u00d3\r\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0006\u0007\uffff\uffff\u0000\u00d5\u00d6\u0003\u0010"+
		"\b\u0000\u00d6\u00d7\u0005\u0017\u0000\u0000\u00d7\u00d8\u0003\u0010\b"+
		"\u0000\u00d8\u00e4\u0001\u0000\u0000\u0000\u00d9\u00da\u0003\u0014\n\u0000"+
		"\u00da\u00db\u0007\u0002\u0000\u0000\u00db\u00dc\u0003\u0014\n\u0000\u00dc"+
		"\u00e4\u0001\u0000\u0000\u0000\u00dd\u00de\u0005%\u0000\u0000\u00de\u00df"+
		"\u0003\u000e\u0007\u0000\u00df\u00e0\u0005&\u0000\u0000\u00e0\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0005\u001c\u0000\u0000\u00e2\u00e4\u0003"+
		"\u000e\u0007\u0003\u00e3\u00d4\u0001\u0000\u0000\u0000\u00e3\u00d9\u0001"+
		"\u0000\u0000\u0000\u00e3\u00dd\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e4\u00ed\u0001\u0000\u0000\u0000\u00e5\u00e6\n\u0002"+
		"\u0000\u0000\u00e6\u00e7\u0005\u001d\u0000\u0000\u00e7\u00ec\u0003\u000e"+
		"\u0007\u0003\u00e8\u00e9\n\u0001\u0000\u0000\u00e9\u00ea\u0005\u001e\u0000"+
		"\u0000\u00ea\u00ec\u0003\u000e\u0007\u0002\u00eb\u00e5\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e8\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ee\u000f\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0006\b\uffff\uffff\u0000\u00f1\u00f7\u0003\u0012\t"+
		"\u0000\u00f2\u00f3\u0005)\u0000\u0000\u00f3\u00f4\u0003\u0014\n\u0000"+
		"\u00f4\u00f5\u0005*\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f6\u00f2\u0001\u0000\u0000\u0000\u00f7"+
		"\u00fd\u0001\u0000\u0000\u0000\u00f8\u00f9\n\u0002\u0000\u0000\u00f9\u00fa"+
		"\u0005\u0011\u0000\u0000\u00fa\u00fc\u0003\u0010\b\u0003\u00fb\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0011\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0105\u0005"+
		"2\u0000\u0000\u0101\u0102\u0005\'\u0000\u0000\u0102\u0103\u0003\u0014"+
		"\n\u0000\u0103\u0104\u0005(\u0000\u0000\u0104\u0106\u0001\u0000\u0000"+
		"\u0000\u0105\u0101\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000"+
		"\u0000\u0106\u010d\u0001\u0000\u0000\u0000\u0107\u010d\u00051\u0000\u0000"+
		"\u0108\u0109\u0005\u0007\u0000\u0000\u0109\u010a\u0005%\u0000\u0000\u010a"+
		"\u010d\u0005&\u0000\u0000\u010b\u010d\u0003\u0006\u0003\u0000\u010c\u0100"+
		"\u0001\u0000\u0000\u0000\u010c\u0107\u0001\u0000\u0000\u0000\u010c\u0108"+
		"\u0001\u0000\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u0013"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0006\n\uffff\uffff\u0000\u010f\u0115"+
		"\u0003\u0016\u000b\u0000\u0110\u0111\u0005%\u0000\u0000\u0111\u0112\u0003"+
		"\u0014\n\u0000\u0112\u0113\u0005&\u0000\u0000\u0113\u0115\u0001\u0000"+
		"\u0000\u0000\u0114\u010e\u0001\u0000\u0000\u0000\u0114\u0110\u0001\u0000"+
		"\u0000\u0000\u0115\u0121\u0001\u0000\u0000\u0000\u0116\u0117\n\u0003\u0000"+
		"\u0000\u0117\u0118\u0005\u0016\u0000\u0000\u0118\u0120\u0003\u0014\n\u0003"+
		"\u0119\u011a\n\u0002\u0000\u0000\u011a\u011b\u0007\u0003\u0000\u0000\u011b"+
		"\u0120\u0003\u0014\n\u0003\u011c\u011d\n\u0001\u0000\u0000\u011d\u011e"+
		"\u0007\u0004\u0000\u0000\u011e\u0120\u0003\u0014\n\u0002\u011f\u0116\u0001"+
		"\u0000\u0000\u0000\u011f\u0119\u0001\u0000\u0000\u0000\u011f\u011c\u0001"+
		"\u0000\u0000\u0000\u0120\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0015\u0001"+
		"\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124\u0129\u0005"+
		"2\u0000\u0000\u0125\u0126\u0005\'\u0000\u0000\u0126\u0127\u0003\u0014"+
		"\n\u0000\u0127\u0128\u0005(\u0000\u0000\u0128\u012a\u0001\u0000\u0000"+
		"\u0000\u0129\u0125\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000"+
		"\u0000\u012a\u0131\u0001\u0000\u0000\u0000\u012b\u0131\u0007\u0005\u0000"+
		"\u0000\u012c\u012d\u0005\u0007\u0000\u0000\u012d\u012e\u0005%\u0000\u0000"+
		"\u012e\u0131\u0005&\u0000\u0000\u012f\u0131\u0003\u0006\u0003\u0000\u0130"+
		"\u0124\u0001\u0000\u0000\u0000\u0130\u012b\u0001\u0000\u0000\u0000\u0130"+
		"\u012c\u0001\u0000\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131"+
		"\u0017\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u0018\u0000\u0000\u0133"+
		"\u0145\u0003\u0018\f\u0000\u0134\u0135\u0005\u0019\u0000\u0000\u0135\u0145"+
		"\u0003\u0018\f\u0000\u0136\u0137\u0005\u0011\u0000\u0000\u0137\u0145\u0003"+
		"\u0018\f\u0000\u0138\u0139\u0005\u0012\u0000\u0000\u0139\u0145\u0003\u0018"+
		"\f\u0000\u013a\u013b\u0005#\u0000\u0000\u013b\u0145\u0003\u0018\f\u0000"+
		"\u013c\u013d\u0005$\u0000\u0000\u013d\u0145\u0003\u0018\f\u0000\u013e"+
		"\u013f\u0005\'\u0000\u0000\u013f\u0140\u0003\u0018\f\u0000\u0140\u0141"+
		"\u0005(\u0000\u0000\u0141\u0142\u0003\u0018\f\u0000\u0142\u0145\u0001"+
		"\u0000\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0132\u0001"+
		"\u0000\u0000\u0000\u0144\u0134\u0001\u0000\u0000\u0000\u0144\u0136\u0001"+
		"\u0000\u0000\u0000\u0144\u0138\u0001\u0000\u0000\u0000\u0144\u013a\u0001"+
		"\u0000\u0000\u0000\u0144\u013c\u0001\u0000\u0000\u0000\u0144\u013e\u0001"+
		"\u0000\u0000\u0000\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u0019\u0001"+
		"\u0000\u0000\u0000!\u001d)9<FLPS^my\u0085\u008a\u00a4\u00b7\u00c0\u00c3"+
		"\u00cc\u00cf\u00d2\u00e3\u00eb\u00ed\u00f6\u00fd\u0105\u010c\u0114\u011f"+
		"\u0121\u0129\u0130\u0144";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}