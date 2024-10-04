// Generated from com/example/expression/parser/Expression.g4 by ANTLR 4.9.2
package com.example.expression.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, IDENTIFIER=24, 
		NUMBER=25, STRING_LITERAL=26, BOOLEAN_LITERAL=27, NULL_LITERAL=28, WHITESPACE=29, 
		COMMENT=30;
	public static final int
		RULE_expression = 0, RULE_logicalExpression = 1, RULE_comparisonExpression = 2, 
		RULE_arithmeticExpression = 3, RULE_term = 4, RULE_factor = 5, RULE_functionCall = 6, 
		RULE_argumentList = 7, RULE_variableReference = 8, RULE_attributeReference = 9, 
		RULE_payloadReference = 10, RULE_propertyPath = 11, RULE_literal = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "logicalExpression", "comparisonExpression", "arithmeticExpression", 
			"term", "factor", "functionCall", "argumentList", "variableReference", 
			"attributeReference", "payloadReference", "propertyPath", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'or'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", "'not'", "','", "'vars'", 
			"'.'", "'attributes'", "'payload'", "'['", "']'", null, null, null, null, 
			"'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"IDENTIFIER", "NUMBER", "STRING_LITERAL", "BOOLEAN_LITERAL", "NULL_LITERAL", 
			"WHITESPACE", "COMMENT"
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
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExpressionParser.EOF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			logicalExpression();
			setState(27);
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

	public static class LogicalExpressionContext extends ParserRuleContext {
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_logicalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			comparisonExpression();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(30);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(31);
				comparisonExpression();
				}
				}
				setState(36);
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

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			arithmeticExpression();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				setState(38);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(39);
				arithmeticExpression();
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

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arithmeticExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			term();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				{
				setState(43);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(44);
				term();
				}
				}
				setState(49);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			factor();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) {
				{
				{
				setState(51);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(52);
				factor();
				}
				}
				setState(57);
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

	public static class FactorContext extends ParserRuleContext {
		public Token operator;
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public VariableReferenceContext variableReference() {
			return getRuleContext(VariableReferenceContext.class,0);
		}
		public AttributeReferenceContext attributeReference() {
			return getRuleContext(AttributeReferenceContext.class,0);
		}
		public PayloadReferenceContext payloadReference() {
			return getRuleContext(PayloadReferenceContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_factor);
		int _la;
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				functionCall();
				}
				break;
			case NUMBER:
			case STRING_LITERAL:
			case BOOLEAN_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				literal();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				variableReference();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				attributeReference();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				payloadReference();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				match(T__13);
				setState(64);
				logicalExpression();
				setState(65);
				match(T__14);
				}
				break;
			case T__8:
			case T__9:
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				((FactorContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__15))) != 0)) ) {
					((FactorContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(68);
				factor();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExpressionParser.IDENTIFIER, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(IDENTIFIER);
			setState(72);
			match(T__13);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__13) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL))) != 0)) {
				{
				setState(73);
				argumentList();
				}
			}

			setState(76);
			match(T__14);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			logicalExpression();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(79);
				match(T__16);
				setState(80);
				logicalExpression();
				}
				}
				setState(85);
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

	public static class VariableReferenceContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ExpressionParser.IDENTIFIER, 0); }
		public VariableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterVariableReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitVariableReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitVariableReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableReferenceContext variableReference() throws RecognitionException {
		VariableReferenceContext _localctx = new VariableReferenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__17);
			setState(87);
			match(T__18);
			setState(88);
			match(IDENTIFIER);
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

	public static class AttributeReferenceContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ExpressionParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ExpressionParser.IDENTIFIER, i);
		}
		public AttributeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterAttributeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitAttributeReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitAttributeReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeReferenceContext attributeReference() throws RecognitionException {
		AttributeReferenceContext _localctx = new AttributeReferenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_attributeReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__19);
			setState(91);
			match(T__18);
			setState(92);
			match(IDENTIFIER);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(93);
				match(T__18);
				setState(94);
				match(IDENTIFIER);
				}
				}
				setState(99);
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

	public static class PayloadReferenceContext extends ParserRuleContext {
		public PropertyPathContext propertyPath() {
			return getRuleContext(PropertyPathContext.class,0);
		}
		public PayloadReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_payloadReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPayloadReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPayloadReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitPayloadReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PayloadReferenceContext payloadReference() throws RecognitionException {
		PayloadReferenceContext _localctx = new PayloadReferenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_payloadReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__20);
			setState(101);
			propertyPath();
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

	public static class PropertyPathContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ExpressionParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ExpressionParser.IDENTIFIER, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(ExpressionParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(ExpressionParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ExpressionParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ExpressionParser.NUMBER, i);
		}
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public PropertyPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPropertyPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPropertyPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitPropertyPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyPathContext propertyPath() throws RecognitionException {
		PropertyPathContext _localctx = new PropertyPathContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_propertyPath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(103);
					match(T__18);
					setState(104);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(105);
					match(T__21);
					setState(106);
					match(STRING_LITERAL);
					setState(107);
					match(T__22);
					}
					break;
				case 3:
					{
					setState(108);
					match(T__21);
					setState(109);
					match(NUMBER);
					setState(110);
					match(T__22);
					}
					break;
				case 4:
					{
					setState(111);
					match(T__21);
					setState(112);
					logicalExpression();
					setState(113);
					match(T__22);
					}
					break;
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__18 || _la==T__21 );
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ExpressionParser.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ExpressionParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(ExpressionParser.BOOLEAN_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(ExpressionParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING_LITERAL) | (1L << BOOLEAN_LITERAL) | (1L << NULL_LITERAL))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 |\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\7\3#\n\3\f\3\16\3&\13\3"+
		"\3\4\3\4\3\4\5\4+\n\4\3\5\3\5\3\5\7\5\60\n\5\f\5\16\5\63\13\5\3\6\3\6"+
		"\3\6\7\68\n\6\f\6\16\6;\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7H\n\7\3\b\3\b\3\b\5\bM\n\b\3\b\3\b\3\t\3\t\3\t\7\tT\n\t\f\t\16\t"+
		"W\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13b\n\13\f\13\16\13"+
		"e\13\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6"+
		"\rv\n\r\r\r\16\rw\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\2\b\3\2\3\4\3\2\5\n\3\2\13\f\3\2\r\17\4\2\13\f\22\22\3\2\33\36\2\177"+
		"\2\34\3\2\2\2\4\37\3\2\2\2\6\'\3\2\2\2\b,\3\2\2\2\n\64\3\2\2\2\fG\3\2"+
		"\2\2\16I\3\2\2\2\20P\3\2\2\2\22X\3\2\2\2\24\\\3\2\2\2\26f\3\2\2\2\30u"+
		"\3\2\2\2\32y\3\2\2\2\34\35\5\4\3\2\35\36\7\2\2\3\36\3\3\2\2\2\37$\5\6"+
		"\4\2 !\t\2\2\2!#\5\6\4\2\" \3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\5"+
		"\3\2\2\2&$\3\2\2\2\'*\5\b\5\2()\t\3\2\2)+\5\b\5\2*(\3\2\2\2*+\3\2\2\2"+
		"+\7\3\2\2\2,\61\5\n\6\2-.\t\4\2\2.\60\5\n\6\2/-\3\2\2\2\60\63\3\2\2\2"+
		"\61/\3\2\2\2\61\62\3\2\2\2\62\t\3\2\2\2\63\61\3\2\2\2\649\5\f\7\2\65\66"+
		"\t\5\2\2\668\5\f\7\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\13"+
		"\3\2\2\2;9\3\2\2\2<H\5\16\b\2=H\5\32\16\2>H\5\22\n\2?H\5\24\13\2@H\5\26"+
		"\f\2AB\7\20\2\2BC\5\4\3\2CD\7\21\2\2DH\3\2\2\2EF\t\6\2\2FH\5\f\7\2G<\3"+
		"\2\2\2G=\3\2\2\2G>\3\2\2\2G?\3\2\2\2G@\3\2\2\2GA\3\2\2\2GE\3\2\2\2H\r"+
		"\3\2\2\2IJ\7\32\2\2JL\7\20\2\2KM\5\20\t\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2"+
		"\2NO\7\21\2\2O\17\3\2\2\2PU\5\4\3\2QR\7\23\2\2RT\5\4\3\2SQ\3\2\2\2TW\3"+
		"\2\2\2US\3\2\2\2UV\3\2\2\2V\21\3\2\2\2WU\3\2\2\2XY\7\24\2\2YZ\7\25\2\2"+
		"Z[\7\32\2\2[\23\3\2\2\2\\]\7\26\2\2]^\7\25\2\2^c\7\32\2\2_`\7\25\2\2`"+
		"b\7\32\2\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\25\3\2\2\2ec\3\2\2"+
		"\2fg\7\27\2\2gh\5\30\r\2h\27\3\2\2\2ij\7\25\2\2jv\7\32\2\2kl\7\30\2\2"+
		"lm\7\34\2\2mv\7\31\2\2no\7\30\2\2op\7\33\2\2pv\7\31\2\2qr\7\30\2\2rs\5"+
		"\4\3\2st\7\31\2\2tv\3\2\2\2ui\3\2\2\2uk\3\2\2\2un\3\2\2\2uq\3\2\2\2vw"+
		"\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\31\3\2\2\2yz\t\7\2\2z\33\3\2\2\2\f$*\61"+
		"9GLUcuw";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}