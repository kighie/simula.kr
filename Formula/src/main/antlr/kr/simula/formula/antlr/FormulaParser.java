// Generated from Formula.g4 by ANTLR 4.4
package kr.simula.formula.antlr;

//	package kr.simula.formula.antlr;
	
	import java.util.List;
	import java.util.LinkedList;
	
	import kr.simula.formula.core.*;
	import kr.simula.formula.core.builder.*;
	import kr.simula.formula.expr.*;
	import kr.simula.formula.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FormulaParser extends kr.simula.formula.core.antlr.FormulaHandlerParser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__27=1, T__26=2, T__25=3, T__24=4, T__23=5, T__22=6, T__21=7, T__20=8, 
		T__19=9, T__18=10, T__17=11, T__16=12, T__15=13, T__14=14, T__13=15, T__12=16, 
		T__11=17, T__10=18, T__9=19, T__8=20, T__7=21, T__6=22, T__5=23, T__4=24, 
		T__3=25, T__2=26, T__1=27, T__0=28, NUMBER=29, STRING_LITERAL=30, NULL=31, 
		BOOLEAN=32, IDENT=33, WS=34, MULTILINE_COMMENT=35, LINE_COMMENT=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'!='", "'{'", "'}'", "'='", "'^'", "'<='", "'&'", 
		"'('", "'is'", "'*'", "','", "'.'", "'->'", "':'", "'>='", "'['", "'<'", 
		"']'", "'>'", "'or'", "'<>'", "'%'", "')'", "'and'", "'+'", "'not'", "'-'", 
		"NUMBER", "STRING_LITERAL", "NULL", "BOOLEAN", "IDENT", "WS", "MULTILINE_COMMENT", 
		"LINE_COMMENT"
	};
	public static final int
		RULE_formulaExpression = 0, RULE_formulaExpressionBase = 1, RULE_funcCallExp = 2, 
		RULE_methodCallExp = 3, RULE_arguments = 4, RULE_lambdaArg = 5, RULE_literalTerm = 6, 
		RULE_iterableTerm = 7, RULE_formulaTerm = 8, RULE_arrayRef = 9, RULE_array = 10, 
		RULE_map = 11, RULE_qualifiedName = 12, RULE_unary = 13, RULE_percent = 14, 
		RULE_exponential = 15, RULE_multiplicative = 16, RULE_additiveExpression = 17, 
		RULE_stringExpression = 18, RULE_comparison = 19, RULE_notExpression = 20, 
		RULE_logicalExpression = 21, RULE_operatorExpression = 22;
	public static final String[] ruleNames = {
		"formulaExpression", "formulaExpressionBase", "funcCallExp", "methodCallExp", 
		"arguments", "lambdaArg", "literalTerm", "iterableTerm", "formulaTerm", 
		"arrayRef", "array", "map", "qualifiedName", "unary", "percent", "exponential", 
		"multiplicative", "additiveExpression", "stringExpression", "comparison", 
		"notExpression", "logicalExpression", "operatorExpression"
	};

	@Override
	public String getGrammarFileName() { return "Formula.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		public String strip( String text ) {
	    	if( text != null && text.length() >= 2 ) {
	    		text = text.substring( 1, text.length() - 1 );
	    		text = text.replaceAll( "\'", "'" );
	    		text = text.replaceAll( "\"", "\\\"" );
	    	}
	    	return text;
		}

	public FormulaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FormulaExpressionContext extends ParserRuleContext {
		public Node result;
		public FormulaExpressionBaseContext formulaExpressionBase;
		public FormulaExpressionBaseContext formulaExpressionBase() {
			return getRuleContext(FormulaExpressionBaseContext.class,0);
		}
		public FormulaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterFormulaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitFormulaExpression(this);
		}
	}

	public final FormulaExpressionContext formulaExpression() throws RecognitionException {
		FormulaExpressionContext _localctx = new FormulaExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_formulaExpression);
		try {
			setState(56);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(46); match(T__23);
				setState(47); match(T__19);
				setState(48); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				setState(49); match(T__4);
				 ((FormulaExpressionContext)_localctx).result =  ((FormulaExpressionContext)_localctx).formulaExpressionBase.result ; 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(52); match(T__23);
				setState(53); ((FormulaExpressionContext)_localctx).formulaExpressionBase = formulaExpressionBase();
				 ((FormulaExpressionContext)_localctx).result =  ((FormulaExpressionContext)_localctx).formulaExpressionBase.result ; 
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

	public static class FormulaExpressionBaseContext extends ParserRuleContext {
		public Node result;
		public OperatorExpressionContext operatorExpression;
		public FuncCallExpContext funcCallExp;
		public MethodCallExpContext methodCallExp;
		public MethodCallExpContext methodCallExp() {
			return getRuleContext(MethodCallExpContext.class,0);
		}
		public FuncCallExpContext funcCallExp() {
			return getRuleContext(FuncCallExpContext.class,0);
		}
		public OperatorExpressionContext operatorExpression() {
			return getRuleContext(OperatorExpressionContext.class,0);
		}
		public FormulaExpressionBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulaExpressionBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterFormulaExpressionBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitFormulaExpressionBase(this);
		}
	}

	public final FormulaExpressionBaseContext formulaExpressionBase() throws RecognitionException {
		FormulaExpressionBaseContext _localctx = new FormulaExpressionBaseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_formulaExpressionBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(58); ((FormulaExpressionBaseContext)_localctx).operatorExpression = operatorExpression();
				 ((FormulaExpressionBaseContext)_localctx).result =  ((FormulaExpressionBaseContext)_localctx).operatorExpression.result ; 
				}
				break;
			case 2:
				{
				setState(61); ((FormulaExpressionBaseContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaExpressionBaseContext)_localctx).result =   ((FormulaExpressionBaseContext)_localctx).funcCallExp.result ; 
				}
				break;
			case 3:
				{
				setState(64); ((FormulaExpressionBaseContext)_localctx).methodCallExp = methodCallExp();
				 ((FormulaExpressionBaseContext)_localctx).result =   ((FormulaExpressionBaseContext)_localctx).methodCallExp.result ; 
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

	public static class FuncCallExpContext extends ParserRuleContext {
		public Gettable result;
		public Token IDENT;
		public ArgumentsContext arguments;
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FormulaParser.IDENT, 0); }
		public FuncCallExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCallExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterFuncCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitFuncCallExp(this);
		}
	}

	public final FuncCallExpContext funcCallExp() throws RecognitionException {
		FuncCallExpContext _localctx = new FuncCallExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcCallExp);
		try {
			setState(79);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(69); ((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(70); match(T__19);
				setState(71); match(T__4);
				 ((FuncCallExpContext)_localctx).result =  functionCall((((FuncCallExpContext)_localctx).IDENT!=null?((FuncCallExpContext)_localctx).IDENT.getText():null), null) ;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(73); ((FuncCallExpContext)_localctx).IDENT = match(IDENT);
				setState(74); match(T__19);
				setState(75); ((FuncCallExpContext)_localctx).arguments = arguments();
				setState(76); match(T__4);
				 ((FuncCallExpContext)_localctx).result =  functionCall((((FuncCallExpContext)_localctx).IDENT!=null?((FuncCallExpContext)_localctx).IDENT.getText():null), ((FuncCallExpContext)_localctx).arguments.nodeList) ;
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

	public static class MethodCallExpContext extends ParserRuleContext {
		public Node result;
		public QualifiedNameContext qualifiedName;
		public Token IDENT;
		public ArgumentsContext arguments;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FormulaParser.IDENT, 0); }
		public MethodCallExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterMethodCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitMethodCallExp(this);
		}
	}

	public final MethodCallExpContext methodCallExp() throws RecognitionException {
		MethodCallExpContext _localctx = new MethodCallExpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodCallExp);
		try {
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(81); ((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(82); match(T__15);
				setState(83); ((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(84); match(T__19);
				setState(85); match(T__4);
				 ((MethodCallExpContext)_localctx).result =  methodCall(((MethodCallExpContext)_localctx).qualifiedName.result, (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null), null) ; 
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(88); ((MethodCallExpContext)_localctx).qualifiedName = qualifiedName();
				setState(89); match(T__15);
				setState(90); ((MethodCallExpContext)_localctx).IDENT = match(IDENT);
				setState(91); match(T__19);
				setState(92); ((MethodCallExpContext)_localctx).arguments = arguments();
				setState(93); match(T__4);
				 ((MethodCallExpContext)_localctx).result =  methodCall(((MethodCallExpContext)_localctx).qualifiedName.result, (((MethodCallExpContext)_localctx).IDENT!=null?((MethodCallExpContext)_localctx).IDENT.getText():null), ((MethodCallExpContext)_localctx).arguments.nodeList) ; 
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<Node> nodeList;
		public OperatorExpressionContext arg2;
		public OperatorExpressionContext operatorExpression(int i) {
			return getRuleContext(OperatorExpressionContext.class,i);
		}
		public List<OperatorExpressionContext> operatorExpression() {
			return getRuleContexts(OperatorExpressionContext.class);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ArgumentsContext)_localctx).nodeList =  new LinkedList<Node>(); 
			{
			setState(99); ((ArgumentsContext)_localctx).arg2 = operatorExpression();
			 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg2.result); 
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(102); match(T__16);
				setState(103); ((ArgumentsContext)_localctx).arg2 = operatorExpression();
				 _localctx.nodeList.add(((ArgumentsContext)_localctx).arg2.result); 
				}
				}
				setState(110);
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

	public static class LambdaArgContext extends ParserRuleContext {
		public Lambda result;
		public TerminalNode IDENT(int i) {
			return getToken(FormulaParser.IDENT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(FormulaParser.IDENT); }
		public LambdaArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterLambdaArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitLambdaArg(this);
		}
	}

	public final LambdaArgContext lambdaArg() throws RecognitionException {
		LambdaArgContext _localctx = new LambdaArgContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lambdaArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			switch (_input.LA(1)) {
			case IDENT:
				{
				{
				setState(111); match(IDENT);
				}
				}
				break;
			case T__19:
				{
				{
				setState(112); match(T__19);
				setState(113); match(IDENT);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(114); match(T__16);
					setState(115); match(IDENT);
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121); match(T__4);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(124); match(T__14);
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

	public static class LiteralTermContext extends ParserRuleContext {
		public Node result;
		public Token BOOLEAN;
		public Token STRING_LITERAL;
		public Token NUMBER;
		public Token IDENT;
		public TerminalNode NULL() { return getToken(FormulaParser.NULL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(FormulaParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN() { return getToken(FormulaParser.BOOLEAN, 0); }
		public TerminalNode NUMBER() { return getToken(FormulaParser.NUMBER, 0); }
		public TerminalNode IDENT() { return getToken(FormulaParser.IDENT, 0); }
		public LiteralTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterLiteralTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitLiteralTerm(this);
		}
	}

	public final LiteralTermContext literalTerm() throws RecognitionException {
		LiteralTermContext _localctx = new LiteralTermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_literalTerm);
		try {
			setState(136);
			switch (_input.LA(1)) {
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(126); ((LiteralTermContext)_localctx).BOOLEAN = match(BOOLEAN);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_BOOLEAN, (((LiteralTermContext)_localctx).BOOLEAN!=null?((LiteralTermContext)_localctx).BOOLEAN.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); ((LiteralTermContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_STRING,  strip((((LiteralTermContext)_localctx).STRING_LITERAL!=null?((LiteralTermContext)_localctx).STRING_LITERAL.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(130); ((LiteralTermContext)_localctx).NUMBER = match(NUMBER);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_NUMBER, (((LiteralTermContext)_localctx).NUMBER!=null?((LiteralTermContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(132); match(NULL);
				 ((LiteralTermContext)_localctx).result =  literal( LIT_NULL, null); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(134); ((LiteralTermContext)_localctx).IDENT = match(IDENT);
				 ((LiteralTermContext)_localctx).result =  refer( (((LiteralTermContext)_localctx).IDENT!=null?((LiteralTermContext)_localctx).IDENT.getText():null)); 
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

	public static class IterableTermContext extends ParserRuleContext {
		public Node result;
		public Token IDENT;
		public QualifiedNameContext qualifiedName;
		public FuncCallExpContext funcCallExp;
		public MethodCallExpContext methodCallExp;
		public ArrayRefContext arrayRef;
		public ArrayContext array;
		public MethodCallExpContext methodCallExp() {
			return getRuleContext(MethodCallExpContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FuncCallExpContext funcCallExp() {
			return getRuleContext(FuncCallExpContext.class,0);
		}
		public ArrayRefContext arrayRef() {
			return getRuleContext(ArrayRefContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FormulaParser.IDENT, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public IterableTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterableTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterIterableTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitIterableTerm(this);
		}
	}

	public final IterableTermContext iterableTerm() throws RecognitionException {
		IterableTermContext _localctx = new IterableTermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_iterableTerm);
		try {
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138); ((IterableTermContext)_localctx).IDENT = match(IDENT);
				 ((IterableTermContext)_localctx).result =  refer( (((IterableTermContext)_localctx).IDENT!=null?((IterableTermContext)_localctx).IDENT.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); ((IterableTermContext)_localctx).qualifiedName = qualifiedName();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).qualifiedName.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143); ((IterableTermContext)_localctx).funcCallExp = funcCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146); ((IterableTermContext)_localctx).methodCallExp = methodCallExp();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).methodCallExp.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149); ((IterableTermContext)_localctx).arrayRef = arrayRef();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).arrayRef.result; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(152); ((IterableTermContext)_localctx).array = array();
				 ((IterableTermContext)_localctx).result =  ((IterableTermContext)_localctx).array.result; 
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

	public static class FormulaTermContext extends ParserRuleContext {
		public Node result;
		public LiteralTermContext literalTerm;
		public QualifiedNameContext qualifiedName;
		public FuncCallExpContext funcCallExp;
		public MethodCallExpContext methodCallExp;
		public ArrayRefContext arrayRef;
		public ArrayContext array;
		public MapContext map;
		public MethodCallExpContext methodCallExp() {
			return getRuleContext(MethodCallExpContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public FuncCallExpContext funcCallExp() {
			return getRuleContext(FuncCallExpContext.class,0);
		}
		public LiteralTermContext literalTerm() {
			return getRuleContext(LiteralTermContext.class,0);
		}
		public ArrayRefContext arrayRef() {
			return getRuleContext(ArrayRefContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public FormulaTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulaTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterFormulaTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitFormulaTerm(this);
		}
	}

	public final FormulaTermContext formulaTerm() throws RecognitionException {
		FormulaTermContext _localctx = new FormulaTermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formulaTerm);
		try {
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157); ((FormulaTermContext)_localctx).literalTerm = literalTerm();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).literalTerm.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160); ((FormulaTermContext)_localctx).qualifiedName = qualifiedName();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).qualifiedName.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163); ((FormulaTermContext)_localctx).funcCallExp = funcCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).funcCallExp.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166); ((FormulaTermContext)_localctx).methodCallExp = methodCallExp();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).methodCallExp.result; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(169); ((FormulaTermContext)_localctx).arrayRef = arrayRef();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).arrayRef.result; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(172); ((FormulaTermContext)_localctx).array = array();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).array.result; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(175); ((FormulaTermContext)_localctx).map = map();
				 ((FormulaTermContext)_localctx).result =  ((FormulaTermContext)_localctx).map.result; 
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

	public static class ArrayRefContext extends ParserRuleContext {
		public Ref result;
		public QualifiedNameContext qualifiedName;
		public Token NUMBER;
		public Token id2;
		public Token id3;
		public TerminalNode NUMBER(int i) {
			return getToken(FormulaParser.NUMBER, i);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IDENT(int i) {
			return getToken(FormulaParser.IDENT, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(FormulaParser.STRING_LITERAL); }
		public List<TerminalNode> NUMBER() { return getTokens(FormulaParser.NUMBER); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(FormulaParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(FormulaParser.IDENT); }
		public ArrayRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterArrayRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitArrayRef(this);
		}
	}

	public final ArrayRefContext arrayRef() throws RecognitionException {
		ArrayRefContext _localctx = new ArrayRefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); ((ArrayRefContext)_localctx).qualifiedName = qualifiedName();
			 ((ArrayRefContext)_localctx).result =  ((ArrayRefContext)_localctx).qualifiedName.result; 
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(182); match(T__11);
				setState(189);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(183); ((ArrayRefContext)_localctx).NUMBER = match(NUMBER);
					 ((ArrayRefContext)_localctx).result =  referIndexed( _localctx.result , literal( LIT_NUMBER, (((ArrayRefContext)_localctx).NUMBER!=null?((ArrayRefContext)_localctx).NUMBER.getText():null)) ); 
					}
					break;
				case IDENT:
					{
					setState(185); ((ArrayRefContext)_localctx).id2 = match(IDENT);
					 ((ArrayRefContext)_localctx).result =  referIndexed( _localctx.result , refer( (((ArrayRefContext)_localctx).id2!=null?((ArrayRefContext)_localctx).id2.getText():null)) ); 
					}
					break;
				case STRING_LITERAL:
					{
					setState(187); ((ArrayRefContext)_localctx).id3 = match(STRING_LITERAL);
					 ((ArrayRefContext)_localctx).result =  referIndexed( _localctx.result , literal( LIT_STRING, strip((((ArrayRefContext)_localctx).id3!=null?((ArrayRefContext)_localctx).id3.getText():null))) ); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(191); match(T__9);
				}
				}
				setState(196);
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

	public static class ArrayContext extends ParserRuleContext {
		public Gettable result;
		public FormulaTermContext formulaTerm;
		public Token from;
		public Token to;
		public FormulaTermContext formulaTerm(int i) {
			return getRuleContext(FormulaTermContext.class,i);
		}
		public TerminalNode NUMBER(int i) {
			return getToken(FormulaParser.NUMBER, i);
		}
		public List<FormulaTermContext> formulaTerm() {
			return getRuleContexts(FormulaTermContext.class);
		}
		public List<TerminalNode> NUMBER() { return getTokens(FormulaParser.NUMBER); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(T__11);
			 List<Node> elements = new LinkedList<Node>(); 
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				{
				setState(199); ((ArrayContext)_localctx).formulaTerm = formulaTerm();
				 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
				}
				}
				break;
			case 2:
				{
				{
				setState(202); ((ArrayContext)_localctx).from = match(NUMBER);
				setState(203); match(T__13);
				setState(204); ((ArrayContext)_localctx).to = match(NUMBER);
				 Range.setRange(elements, (((ArrayContext)_localctx).from!=null?((ArrayContext)_localctx).from.getText():null), (((ArrayContext)_localctx).to!=null?((ArrayContext)_localctx).to.getText():null)) ; 
				}
				}
				break;
			}
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16 || _la==NUMBER) {
				{
				setState(216);
				switch (_input.LA(1)) {
				case T__16:
					{
					setState(208); match(T__16);
					{
					setState(209); ((ArrayContext)_localctx).formulaTerm = formulaTerm();
					 elements.add(((ArrayContext)_localctx).formulaTerm.result); 
					}
					}
					break;
				case NUMBER:
					{
					{
					setState(212); ((ArrayContext)_localctx).from = match(NUMBER);
					setState(213); match(T__13);
					setState(214); ((ArrayContext)_localctx).to = match(NUMBER);
					 Range.setRange(elements, (((ArrayContext)_localctx).from!=null?((ArrayContext)_localctx).from.getText():null), (((ArrayContext)_localctx).to!=null?((ArrayContext)_localctx).to.getText():null)) ; 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221); match(T__9);
				((ArrayContext)_localctx).result =  array(elements); 
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

	public static class MapContext extends ParserRuleContext {
		public Gettable result;
		public Token IDENT;
		public Token STRING_LITERAL;
		public FormulaTermContext formulaTerm;
		public FormulaTermContext formulaTerm(int i) {
			return getRuleContext(FormulaTermContext.class,i);
		}
		public List<FormulaTermContext> formulaTerm() {
			return getRuleContexts(FormulaTermContext.class);
		}
		public TerminalNode IDENT(int i) {
			return getToken(FormulaParser.IDENT, i);
		}
		public List<TerminalNode> STRING_LITERAL() { return getTokens(FormulaParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(FormulaParser.STRING_LITERAL, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(FormulaParser.IDENT); }
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitMap(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); match(T__25);
			 ((MapContext)_localctx).result =  map(SIMPLE_MAP); String key;
			setState(251);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL || _la==IDENT) {
				{
				setState(230);
				switch (_input.LA(1)) {
				case IDENT:
					{
					{
					setState(226); ((MapContext)_localctx).IDENT = match(IDENT);
					key = (((MapContext)_localctx).IDENT!=null?((MapContext)_localctx).IDENT.getText():null); 
					}
					}
					break;
				case STRING_LITERAL:
					{
					{
					setState(228); ((MapContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
					key = strip((((MapContext)_localctx).STRING_LITERAL!=null?((MapContext)_localctx).STRING_LITERAL.getText():null)); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(232); match(T__13);
				setState(233); ((MapContext)_localctx).formulaTerm = formulaTerm();
				 mapEntry( _localctx.result, null, key, ((MapContext)_localctx).formulaTerm.result ); 
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(235); match(T__16);
					setState(240);
					switch (_input.LA(1)) {
					case IDENT:
						{
						{
						setState(236); ((MapContext)_localctx).IDENT = match(IDENT);
						key = (((MapContext)_localctx).IDENT!=null?((MapContext)_localctx).IDENT.getText():null); 
						}
						}
						break;
					case STRING_LITERAL:
						{
						{
						setState(238); ((MapContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
						key = strip((((MapContext)_localctx).STRING_LITERAL!=null?((MapContext)_localctx).STRING_LITERAL.getText():null)); 
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(242); match(T__13);
					setState(243); ((MapContext)_localctx).formulaTerm = formulaTerm();
					 mapEntry( _localctx.result, null, key, ((MapContext)_localctx).formulaTerm.result ); 
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(253); match(T__24);
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public Ref result;
		public Token IDENT;
		public TerminalNode IDENT(int i) {
			return getToken(FormulaParser.IDENT, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(FormulaParser.IDENT); }
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
			 ((QualifiedNameContext)_localctx).result =  refer( (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(257); match(T__15);
					setState(258); ((QualifiedNameContext)_localctx).IDENT = match(IDENT);
					 ((QualifiedNameContext)_localctx).result =  refer( _localctx.result, (((QualifiedNameContext)_localctx).IDENT!=null?((QualifiedNameContext)_localctx).IDENT.getText():null)); 
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class UnaryContext extends ParserRuleContext {
		public Node result;
		public FormulaTermContext formulaTerm;
		public OperatorExpressionContext operatorExpression;
		public FormulaTermContext formulaTerm() {
			return getRuleContext(FormulaTermContext.class,0);
		}
		public OperatorExpressionContext operatorExpression() {
			return getRuleContext(OperatorExpressionContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 boolean negative = false; 
			setState(268);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(266); match(T__0);
				 negative = true; 
				}
			}

			setState(278);
			switch (_input.LA(1)) {
			case T__25:
			case T__11:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(270); ((UnaryContext)_localctx).formulaTerm = formulaTerm();
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).formulaTerm.result;  
				}
				break;
			case T__19:
				{
				setState(273); match(T__19);
				setState(274); ((UnaryContext)_localctx).operatorExpression = operatorExpression();
				setState(275); match(T__4);
				 ((UnaryContext)_localctx).result =  ((UnaryContext)_localctx).operatorExpression.result;  
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 
						if(negative){
							((UnaryContext)_localctx).result =  operator(OP_NUM_NEGATION, _localctx.result );
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

	public static class PercentContext extends ParserRuleContext {
		public Node result;
		public UnaryContext unary;
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public PercentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterPercent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitPercent(this);
		}
	}

	public final PercentContext percent() throws RecognitionException {
		PercentContext _localctx = new PercentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_percent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); ((PercentContext)_localctx).unary = unary();
			 ((PercentContext)_localctx).result =  ((PercentContext)_localctx).unary.result;  
			setState(286);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(284); match(T__5);
				((PercentContext)_localctx).result =  operator(OP_PERCENT, _localctx.result); 
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

	public static class ExponentialContext extends ParserRuleContext {
		public Node result;
		public PercentContext percent;
		public PercentContext op2;
		public List<PercentContext> percent() {
			return getRuleContexts(PercentContext.class);
		}
		public PercentContext percent(int i) {
			return getRuleContext(PercentContext.class,i);
		}
		public ExponentialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponential; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterExponential(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitExponential(this);
		}
	}

	public final ExponentialContext exponential() throws RecognitionException {
		ExponentialContext _localctx = new ExponentialContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exponential);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288); ((ExponentialContext)_localctx).percent = percent();
			 ((ExponentialContext)_localctx).result =  ((ExponentialContext)_localctx).percent.result;  
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(290); match(T__22);
				setState(291); ((ExponentialContext)_localctx).op2 = ((ExponentialContext)_localctx).percent = percent();
				((ExponentialContext)_localctx).result =  operator(OP_POW, _localctx.result, ((ExponentialContext)_localctx).op2.result); 
				}
				}
				setState(298);
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

	public static class MultiplicativeContext extends ParserRuleContext {
		public Node result;
		public ExponentialContext exponential;
		public ExponentialContext op2;
		public ExponentialContext exponential(int i) {
			return getRuleContext(ExponentialContext.class,i);
		}
		public List<ExponentialContext> exponential() {
			return getRuleContexts(ExponentialContext.class);
		}
		public MultiplicativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitMultiplicative(this);
		}
	}

	public final MultiplicativeContext multiplicative() throws RecognitionException {
		MultiplicativeContext _localctx = new MultiplicativeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); ((MultiplicativeContext)_localctx).exponential = exponential();
			 ((MultiplicativeContext)_localctx).result =  ((MultiplicativeContext)_localctx).exponential.result;  
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27 || _la==T__17) {
				{
				setState(309);
				switch (_input.LA(1)) {
				case T__17:
					{
					setState(301); match(T__17);
					setState(302); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  operator(OP_MULTI, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				case T__27:
					{
					setState(305); match(T__27);
					setState(306); ((MultiplicativeContext)_localctx).op2 = ((MultiplicativeContext)_localctx).exponential = exponential();
					((MultiplicativeContext)_localctx).result =  operator(OP_DIVIDE, _localctx.result, ((MultiplicativeContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(313);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Node result;
		public MultiplicativeContext multiplicative;
		public MultiplicativeContext op2;
		public List<MultiplicativeContext> multiplicative() {
			return getRuleContexts(MultiplicativeContext.class);
		}
		public MultiplicativeContext multiplicative(int i) {
			return getRuleContext(MultiplicativeContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
			 ((AdditiveExpressionContext)_localctx).result =  ((AdditiveExpressionContext)_localctx).multiplicative.result;  
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__0) {
				{
				setState(324);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(316); match(T__2);
					setState(317); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  operator(OP_PLUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				case T__0:
					{
					setState(320); match(T__0);
					setState(321); ((AdditiveExpressionContext)_localctx).op2 = ((AdditiveExpressionContext)_localctx).multiplicative = multiplicative();
					((AdditiveExpressionContext)_localctx).result =  operator(OP_MINUS, _localctx.result, ((AdditiveExpressionContext)_localctx).op2.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(328);
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

	public static class StringExpressionContext extends ParserRuleContext {
		public Node result;
		public AdditiveExpressionContext additiveExpression;
		public AdditiveExpressionContext op2;
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public StringExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitStringExpression(this);
		}
	}

	public final StringExpressionContext stringExpression() throws RecognitionException {
		StringExpressionContext _localctx = new StringExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_stringExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
			 ((StringExpressionContext)_localctx).result =  ((StringExpressionContext)_localctx).additiveExpression.result;  
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(331); match(T__20);
				setState(332); ((StringExpressionContext)_localctx).op2 = ((StringExpressionContext)_localctx).additiveExpression = additiveExpression();
				((StringExpressionContext)_localctx).result =  operator(OP_CONCAT, _localctx.result, ((StringExpressionContext)_localctx).op2.result); 
				}
				}
				setState(339);
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

	public static class ComparisonContext extends ParserRuleContext {
		public Node result;
		public StringExpressionContext stringExpression;
		public StringExpressionContext op2;
		public List<StringExpressionContext> stringExpression() {
			return getRuleContexts(StringExpressionContext.class);
		}
		public StringExpressionContext stringExpression(int i) {
			return getRuleContext(StringExpressionContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); ((ComparisonContext)_localctx).stringExpression = stringExpression();
			 ((ComparisonContext)_localctx).result =  ((ComparisonContext)_localctx).stringExpression.result;  
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__23) | (1L << T__21) | (1L << T__18) | (1L << T__12) | (1L << T__10) | (1L << T__8) | (1L << T__6))) != 0)) {
				{
				setState(379);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(342); match(T__23);
					setState(343); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 2:
					{
					setState(346); match(T__18);
					setState(347); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 3:
					{
					setState(350); match(T__26);
					setState(351); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 4:
					{
					setState(354); match(T__6);
					setState(355); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 5:
					{
					setState(358); match(T__18);
					setState(359); match(T__1);
					setState(360); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_NOT_EQ, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 6:
					{
					setState(363); match(T__8);
					setState(364); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 7:
					{
					setState(367); match(T__12);
					setState(368); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_EQ_GT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 8:
					{
					setState(371); match(T__10);
					setState(372); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				case 9:
					{
					setState(375); match(T__21);
					setState(376); ((ComparisonContext)_localctx).op2 = ((ComparisonContext)_localctx).stringExpression = stringExpression();
					((ComparisonContext)_localctx).result =  operator(OP_EQ_LT, _localctx.result, ((ComparisonContext)_localctx).op2.result); 
					}
					break;
				}
				}
				setState(383);
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

	public static class NotExpressionContext extends ParserRuleContext {
		public Node result;
		public ComparisonContext comparison;
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitNotExpression(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			switch (_input.LA(1)) {
			case T__25:
			case T__19:
			case T__11:
			case T__0:
			case NUMBER:
			case STRING_LITERAL:
			case NULL:
			case BOOLEAN:
			case IDENT:
				{
				setState(384); ((NotExpressionContext)_localctx).comparison = comparison();
				 ((NotExpressionContext)_localctx).result =  ((NotExpressionContext)_localctx).comparison.result;  
				}
				break;
			case T__1:
				{
				setState(387); match(T__1);
				setState(388); ((NotExpressionContext)_localctx).comparison = comparison();
				((NotExpressionContext)_localctx).result =  operator(OP_NOT, ((NotExpressionContext)_localctx).comparison.result); 
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

	public static class LogicalExpressionContext extends ParserRuleContext {
		public Node result;
		public NotExpressionContext notExpression;
		public OperatorExpressionContext op2;
		public OperatorExpressionContext operatorExpression(int i) {
			return getRuleContext(OperatorExpressionContext.class,i);
		}
		public NotExpressionContext notExpression() {
			return getRuleContext(NotExpressionContext.class,0);
		}
		public List<OperatorExpressionContext> operatorExpression() {
			return getRuleContexts(OperatorExpressionContext.class);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitLogicalExpression(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_logicalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(393); ((LogicalExpressionContext)_localctx).notExpression = notExpression();
			 ((LogicalExpressionContext)_localctx).result =  ((LogicalExpressionContext)_localctx).notExpression.result;  
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(403);
					switch (_input.LA(1)) {
					case T__3:
						{
						setState(395); match(T__3);
						setState(396); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  operator(OP_AND, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					case T__7:
						{
						setState(399); match(T__7);
						setState(400); ((LogicalExpressionContext)_localctx).op2 = operatorExpression();
						((LogicalExpressionContext)_localctx).result =  operator(OP_OR, _localctx.result, ((LogicalExpressionContext)_localctx).op2.result); 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class OperatorExpressionContext extends ParserRuleContext {
		public Node result;
		public LogicalExpressionContext logicalExpression;
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public OperatorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).enterOperatorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FormulaListener ) ((FormulaListener)listener).exitOperatorExpression(this);
		}
	}

	public final OperatorExpressionContext operatorExpression() throws RecognitionException {
		OperatorExpressionContext _localctx = new OperatorExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_operatorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408); ((OperatorExpressionContext)_localctx).logicalExpression = logicalExpression();
			 ((OperatorExpressionContext)_localctx).result =  ((OperatorExpressionContext)_localctx).logicalExpression.result;  
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u019e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2;\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4R\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5c\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\7\3\7\3\7\3\7\3\7"+
		"\7\7w\n\7\f\7\16\7z\13\7\3\7\5\7}\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u008b\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009e\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b5\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c0\n\13\3\13\7\13"+
		"\u00c3\n\13\f\13\16\13\u00c6\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00d1\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00db\n\f\f\f\16\f"+
		"\u00de\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e9\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00f3\n\r\3\r\3\r\3\r\3\r\7\r\u00f9\n\r\f"+
		"\r\16\r\u00fc\13\r\5\r\u00fe\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u0107\n\16\f\16\16\16\u010a\13\16\3\17\3\17\3\17\5\17\u010f\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0119\n\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\5\20\u0121\n\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0129\n"+
		"\21\f\21\16\21\u012c\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u0138\n\22\f\22\16\22\u013b\13\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u0147\n\23\f\23\16\23\u014a\13\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u0152\n\24\f\24\16\24\u0155\13\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u017e\n\25\f\25"+
		"\16\25\u0181\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u018a\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0196\n\27\f\27"+
		"\16\27\u0199\13\27\3\30\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\2\2\u01bd\2:\3\2\2\2\4E\3\2\2\2\6Q\3\2\2\2\b"+
		"b\3\2\2\2\nd\3\2\2\2\f|\3\2\2\2\16\u008a\3\2\2\2\20\u009d\3\2\2\2\22\u00b4"+
		"\3\2\2\2\24\u00b6\3\2\2\2\26\u00c7\3\2\2\2\30\u00e2\3\2\2\2\32\u0101\3"+
		"\2\2\2\34\u010b\3\2\2\2\36\u011c\3\2\2\2 \u0122\3\2\2\2\"\u012d\3\2\2"+
		"\2$\u013c\3\2\2\2&\u014b\3\2\2\2(\u0156\3\2\2\2*\u0189\3\2\2\2,\u018b"+
		"\3\2\2\2.\u019a\3\2\2\2\60\61\7\7\2\2\61\62\7\13\2\2\62\63\5\4\3\2\63"+
		"\64\7\32\2\2\64\65\b\2\1\2\65;\3\2\2\2\66\67\7\7\2\2\678\5\4\3\289\b\2"+
		"\1\29;\3\2\2\2:\60\3\2\2\2:\66\3\2\2\2;\3\3\2\2\2<=\5.\30\2=>\b\3\1\2"+
		">F\3\2\2\2?@\5\6\4\2@A\b\3\1\2AF\3\2\2\2BC\5\b\5\2CD\b\3\1\2DF\3\2\2\2"+
		"E<\3\2\2\2E?\3\2\2\2EB\3\2\2\2F\5\3\2\2\2GH\7#\2\2HI\7\13\2\2IJ\7\32\2"+
		"\2JR\b\4\1\2KL\7#\2\2LM\7\13\2\2MN\5\n\6\2NO\7\32\2\2OP\b\4\1\2PR\3\2"+
		"\2\2QG\3\2\2\2QK\3\2\2\2R\7\3\2\2\2ST\5\32\16\2TU\7\17\2\2UV\7#\2\2VW"+
		"\7\13\2\2WX\7\32\2\2XY\b\5\1\2Yc\3\2\2\2Z[\5\32\16\2[\\\7\17\2\2\\]\7"+
		"#\2\2]^\7\13\2\2^_\5\n\6\2_`\7\32\2\2`a\b\5\1\2ac\3\2\2\2bS\3\2\2\2bZ"+
		"\3\2\2\2c\t\3\2\2\2de\b\6\1\2ef\5.\30\2fg\b\6\1\2gn\3\2\2\2hi\7\16\2\2"+
		"ij\5.\30\2jk\b\6\1\2km\3\2\2\2lh\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2"+
		"o\13\3\2\2\2pn\3\2\2\2q}\7#\2\2rs\7\13\2\2sx\7#\2\2tu\7\16\2\2uw\7#\2"+
		"\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{}\7\32"+
		"\2\2|q\3\2\2\2|r\3\2\2\2}~\3\2\2\2~\177\7\20\2\2\177\r\3\2\2\2\u0080\u0081"+
		"\7\"\2\2\u0081\u008b\b\b\1\2\u0082\u0083\7 \2\2\u0083\u008b\b\b\1\2\u0084"+
		"\u0085\7\37\2\2\u0085\u008b\b\b\1\2\u0086\u0087\7!\2\2\u0087\u008b\b\b"+
		"\1\2\u0088\u0089\7#\2\2\u0089\u008b\b\b\1\2\u008a\u0080\3\2\2\2\u008a"+
		"\u0082\3\2\2\2\u008a\u0084\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008b\17\3\2\2\2\u008c\u008d\7#\2\2\u008d\u009e\b\t\1\2\u008e\u008f"+
		"\5\32\16\2\u008f\u0090\b\t\1\2\u0090\u009e\3\2\2\2\u0091\u0092\5\6\4\2"+
		"\u0092\u0093\b\t\1\2\u0093\u009e\3\2\2\2\u0094\u0095\5\b\5\2\u0095\u0096"+
		"\b\t\1\2\u0096\u009e\3\2\2\2\u0097\u0098\5\24\13\2\u0098\u0099\b\t\1\2"+
		"\u0099\u009e\3\2\2\2\u009a\u009b\5\26\f\2\u009b\u009c\b\t\1\2\u009c\u009e"+
		"\3\2\2\2\u009d\u008c\3\2\2\2\u009d\u008e\3\2\2\2\u009d\u0091\3\2\2\2\u009d"+
		"\u0094\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u009a\3\2\2\2\u009e\21\3\2\2"+
		"\2\u009f\u00a0\5\16\b\2\u00a0\u00a1\b\n\1\2\u00a1\u00b5\3\2\2\2\u00a2"+
		"\u00a3\5\32\16\2\u00a3\u00a4\b\n\1\2\u00a4\u00b5\3\2\2\2\u00a5\u00a6\5"+
		"\6\4\2\u00a6\u00a7\b\n\1\2\u00a7\u00b5\3\2\2\2\u00a8\u00a9\5\b\5\2\u00a9"+
		"\u00aa\b\n\1\2\u00aa\u00b5\3\2\2\2\u00ab\u00ac\5\24\13\2\u00ac\u00ad\b"+
		"\n\1\2\u00ad\u00b5\3\2\2\2\u00ae\u00af\5\26\f\2\u00af\u00b0\b\n\1\2\u00b0"+
		"\u00b5\3\2\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3\b\n\1\2\u00b3\u00b5\3"+
		"\2\2\2\u00b4\u009f\3\2\2\2\u00b4\u00a2\3\2\2\2\u00b4\u00a5\3\2\2\2\u00b4"+
		"\u00a8\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00b1\3\2"+
		"\2\2\u00b5\23\3\2\2\2\u00b6\u00b7\5\32\16\2\u00b7\u00c4\b\13\1\2\u00b8"+
		"\u00bf\7\23\2\2\u00b9\u00ba\7\37\2\2\u00ba\u00c0\b\13\1\2\u00bb\u00bc"+
		"\7#\2\2\u00bc\u00c0\b\13\1\2\u00bd\u00be\7 \2\2\u00be\u00c0\b\13\1\2\u00bf"+
		"\u00b9\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c3\7\25\2\2\u00c2\u00b8\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\25\3\2\2\2\u00c6\u00c4\3\2\2"+
		"\2\u00c7\u00c8\7\23\2\2\u00c8\u00d0\b\f\1\2\u00c9\u00ca\5\22\n\2\u00ca"+
		"\u00cb\b\f\1\2\u00cb\u00d1\3\2\2\2\u00cc\u00cd\7\37\2\2\u00cd\u00ce\7"+
		"\21\2\2\u00ce\u00cf\7\37\2\2\u00cf\u00d1\b\f\1\2\u00d0\u00c9\3\2\2\2\u00d0"+
		"\u00cc\3\2\2\2\u00d1\u00dc\3\2\2\2\u00d2\u00d3\7\16\2\2\u00d3\u00d4\5"+
		"\22\n\2\u00d4\u00d5\b\f\1\2\u00d5\u00db\3\2\2\2\u00d6\u00d7\7\37\2\2\u00d7"+
		"\u00d8\7\21\2\2\u00d8\u00d9\7\37\2\2\u00d9\u00db\b\f\1\2\u00da\u00d2\3"+
		"\2\2\2\u00da\u00d6\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\25"+
		"\2\2\u00e0\u00e1\b\f\1\2\u00e1\27\3\2\2\2\u00e2\u00e3\7\5\2\2\u00e3\u00fd"+
		"\b\r\1\2\u00e4\u00e5\7#\2\2\u00e5\u00e9\b\r\1\2\u00e6\u00e7\7 \2\2\u00e7"+
		"\u00e9\b\r\1\2\u00e8\u00e4\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00eb\7\21\2\2\u00eb\u00ec\5\22\n\2\u00ec\u00fa\b\r\1\2\u00ed"+
		"\u00f2\7\16\2\2\u00ee\u00ef\7#\2\2\u00ef\u00f3\b\r\1\2\u00f0\u00f1\7 "+
		"\2\2\u00f1\u00f3\b\r\1\2\u00f2\u00ee\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f5\7\21\2\2\u00f5\u00f6\5\22\n\2\u00f6\u00f7\b"+
		"\r\1\2\u00f7\u00f9\3\2\2\2\u00f8\u00ed\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fd\u00e8\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\7\6\2\2\u0100\31\3\2\2\2\u0101\u0102\7#\2\2\u0102\u0108\b\16\1"+
		"\2\u0103\u0104\7\17\2\2\u0104\u0105\7#\2\2\u0105\u0107\b\16\1\2\u0106"+
		"\u0103\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\33\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010e\b\17\1\2\u010c\u010d"+
		"\7\36\2\2\u010d\u010f\b\17\1\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2"+
		"\u010f\u0118\3\2\2\2\u0110\u0111\5\22\n\2\u0111\u0112\b\17\1\2\u0112\u0119"+
		"\3\2\2\2\u0113\u0114\7\13\2\2\u0114\u0115\5.\30\2\u0115\u0116\7\32\2\2"+
		"\u0116\u0117\b\17\1\2\u0117\u0119\3\2\2\2\u0118\u0110\3\2\2\2\u0118\u0113"+
		"\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\b\17\1\2\u011b\35\3\2\2\2\u011c"+
		"\u011d\5\34\17\2\u011d\u0120\b\20\1\2\u011e\u011f\7\31\2\2\u011f\u0121"+
		"\b\20\1\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\37\3\2\2\2\u0122"+
		"\u0123\5\36\20\2\u0123\u012a\b\21\1\2\u0124\u0125\7\b\2\2\u0125\u0126"+
		"\5\36\20\2\u0126\u0127\b\21\1\2\u0127\u0129\3\2\2\2\u0128\u0124\3\2\2"+
		"\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b!"+
		"\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\5 \21\2\u012e\u0139\b\22\1\2"+
		"\u012f\u0130\7\r\2\2\u0130\u0131\5 \21\2\u0131\u0132\b\22\1\2\u0132\u0138"+
		"\3\2\2\2\u0133\u0134\7\3\2\2\u0134\u0135\5 \21\2\u0135\u0136\b\22\1\2"+
		"\u0136\u0138\3\2\2\2\u0137\u012f\3\2\2\2\u0137\u0133\3\2\2\2\u0138\u013b"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a#\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013c\u013d\5\"\22\2\u013d\u0148\b\23\1\2\u013e\u013f\7"+
		"\34\2\2\u013f\u0140\5\"\22\2\u0140\u0141\b\23\1\2\u0141\u0147\3\2\2\2"+
		"\u0142\u0143\7\36\2\2\u0143\u0144\5\"\22\2\u0144\u0145\b\23\1\2\u0145"+
		"\u0147\3\2\2\2\u0146\u013e\3\2\2\2\u0146\u0142\3\2\2\2\u0147\u014a\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149%\3\2\2\2\u014a\u0148"+
		"\3\2\2\2\u014b\u014c\5$\23\2\u014c\u0153\b\24\1\2\u014d\u014e\7\n\2\2"+
		"\u014e\u014f\5$\23\2\u014f\u0150\b\24\1\2\u0150\u0152\3\2\2\2\u0151\u014d"+
		"\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\'\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\5&\24\2\u0157\u017f\b\25\1"+
		"\2\u0158\u0159\7\7\2\2\u0159\u015a\5&\24\2\u015a\u015b\b\25\1\2\u015b"+
		"\u017e\3\2\2\2\u015c\u015d\7\f\2\2\u015d\u015e\5&\24\2\u015e\u015f\b\25"+
		"\1\2\u015f\u017e\3\2\2\2\u0160\u0161\7\4\2\2\u0161\u0162\5&\24\2\u0162"+
		"\u0163\b\25\1\2\u0163\u017e\3\2\2\2\u0164\u0165\7\30\2\2\u0165\u0166\5"+
		"&\24\2\u0166\u0167\b\25\1\2\u0167\u017e\3\2\2\2\u0168\u0169\7\f\2\2\u0169"+
		"\u016a\7\35\2\2\u016a\u016b\5&\24\2\u016b\u016c\b\25\1\2\u016c\u017e\3"+
		"\2\2\2\u016d\u016e\7\26\2\2\u016e\u016f\5&\24\2\u016f\u0170\b\25\1\2\u0170"+
		"\u017e\3\2\2\2\u0171\u0172\7\22\2\2\u0172\u0173\5&\24\2\u0173\u0174\b"+
		"\25\1\2\u0174\u017e\3\2\2\2\u0175\u0176\7\24\2\2\u0176\u0177\5&\24\2\u0177"+
		"\u0178\b\25\1\2\u0178\u017e\3\2\2\2\u0179\u017a\7\t\2\2\u017a\u017b\5"+
		"&\24\2\u017b\u017c\b\25\1\2\u017c\u017e\3\2\2\2\u017d\u0158\3\2\2\2\u017d"+
		"\u015c\3\2\2\2\u017d\u0160\3\2\2\2\u017d\u0164\3\2\2\2\u017d\u0168\3\2"+
		"\2\2\u017d\u016d\3\2\2\2\u017d\u0171\3\2\2\2\u017d\u0175\3\2\2\2\u017d"+
		"\u0179\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2"+
		"\2\2\u0180)\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\5(\25\2\u0183\u0184"+
		"\b\26\1\2\u0184\u018a\3\2\2\2\u0185\u0186\7\35\2\2\u0186\u0187\5(\25\2"+
		"\u0187\u0188\b\26\1\2\u0188\u018a\3\2\2\2\u0189\u0182\3\2\2\2\u0189\u0185"+
		"\3\2\2\2\u018a+\3\2\2\2\u018b\u018c\5*\26\2\u018c\u0197\b\27\1\2\u018d"+
		"\u018e\7\33\2\2\u018e\u018f\5.\30\2\u018f\u0190\b\27\1\2\u0190\u0196\3"+
		"\2\2\2\u0191\u0192\7\27\2\2\u0192\u0193\5.\30\2\u0193\u0194\b\27\1\2\u0194"+
		"\u0196\3\2\2\2\u0195\u018d\3\2\2\2\u0195\u0191\3\2\2\2\u0196\u0199\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198-\3\2\2\2\u0199\u0197"+
		"\3\2\2\2\u019a\u019b\5,\27\2\u019b\u019c\b\30\1\2\u019c/\3\2\2\2$:EQb"+
		"nx|\u008a\u009d\u00b4\u00bf\u00c4\u00d0\u00da\u00dc\u00e8\u00f2\u00fa"+
		"\u00fd\u0108\u010e\u0118\u0120\u012a\u0137\u0139\u0146\u0148\u0153\u017d"+
		"\u017f\u0189\u0195\u0197";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}