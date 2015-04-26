/*
 * Copyright (c) 2012 IkChan Kwon kighie@gmail.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
grammar Ontolog;

options {
	language = Java;
}

// use command line option : -package kr.simula.formula.antlr

@parser::header {
//	package kr.simula.formula.antlr;
	
	import java.util.List;
	import java.util.LinkedList;
	
	import kr.simula.formula.core.*;
	import kr.simula.formula.core.builder.*;
	import kr.simula.formula.expr.*;
	import kr.simula.formula.util.*;
}

@parser::members {
  	private FormulaHandler handler;
  	
  	public void setHandler(FormulaHandler formulaHandler){
  		this.handler = formulaHandler;
  	}
  	

	public String strip( String text ) {
    	if( text != null && text.length() >= 3 ) {
    		text = text.substring( 1, text.length() - 1 );
    		text = text.replaceAll( "\'", "'" );
    		text = text.replaceAll( "\"", "\\\"" );
    	}
    	return text;
	}
}
/*
@rulecatch {
	
	catch (RecognitionException re) {
	    throw re;
	}  
	catch (BuildException dsle) {
		TokenStream cts = (TokenStream)input;
		dsle.setToken(cts.get(cts.index()));
	    throw dsle;
	}
}
*/

@lexer::header {
//	package kr.simula.formula.antlr;
}


tokens {
  	NEGATION
}


/* *************************************
 * Formula Expression
 *************************************** */

formulaExpression returns [Node result]
	: 
	( '=' '(' formulaExpressionBase ')' { $result = $formulaExpressionBase.result ; } )
	| ( '=' formulaExpressionBase { $result = $formulaExpressionBase.result ; } )
	;

formulaExpressionBase returns [Node result]
	: 
	(
	operatorExpression { $result = $operatorExpression.result ; }
	| funcCallExp { $result =  $funcCallExp.result ; }
	| methodCallExp { $result =  $methodCallExp.result ; }
	) 
	;

funcCallExp returns [Gettable result]
	: IDENT '(' arguments? ')' 
		{ $result = handler.functionCall($IDENT.text, $arguments.nodeList) ;}
	;

methodCallExp returns [Node result]
	: qualifiedName 	{ Ref parent = $qualifiedName.result; }
	'.' IDENT 			{ String methodName = $IDENT.text; }
	'(' arguments? ')'	{ $result = handler.methodCall(parent, methodName, $arguments.nodeList) ; }
	;

arguments  returns [List<Node> nodeList]
	: { $nodeList = new LinkedList<Node>(); }
	( operatorExpression { $nodeList.add($operatorExpression.result); } 
		(',' 
			(arg2 = operatorExpression { $nodeList.add($arg2.result); })
			| (arg3 = conditionArg { $nodeList.add($arg3.result); })
		)*
	)?
	;


/*
	Condition Argument
*/
conditionArg returns [Lambda result]
	: 
	( 
		'='  op2 = literalTerm {$result = handler.lambda(GrammarTokens.OP_EQ, null, $op2.result); }
		|'is'  op2 = literalTerm {$result = handler.lambda(GrammarTokens.OP_EQ, null, $op2.result); }
		|'!=' op2 = literalTerm {$result = handler.lambda(GrammarTokens.OP_NOT_EQ, null, $op2.result); }
		|'<>' op2 = literalTerm {$result = handler.lambda(GrammarTokens.OP_NOT_EQ, null, $op2.result); }
		|'is' 'not' op2 = literalTerm {$result = handler.lambda(GrammarTokens.OP_NOT_EQ, null, $op2.result); }
		|'>'  op2 = literalTerm {$result = handler.lambda(GrammarTokens.OP_GT, null, $op2.result); }
		|'>=' op2 = literalTerm {$result = handler.lambda(GrammarTokens.OP_EQ_GT, null, $op2.result); }
		|'<'  op2 = literalTerm {$result = handler.lambda(GrammarTokens.OP_LT, null, $op2.result); }
		|'<=' op2 = literalTerm {$result = handler.lambda(GrammarTokens.OP_EQ_LT, null, $op2.result); }
	)
	;

literalTerm  returns [Node result]
	: BOOLEAN 			{ $result = handler.literal( GrammarTokens.LIT_BOOLEAN, $BOOLEAN.text); }
	| STRING_LITERAL	{ $result = handler.literal( GrammarTokens.LIT_STRING,  strip($STRING_LITERAL.text)); }
	| NUMBER			{ $result = handler.literal( GrammarTokens.LIT_NUMBER, $NUMBER.text); }
	| NULL				{ $result = handler.literal( GrammarTokens.LIT_NULL, null); }
	| IDENT				{ $result = handler.refer( $IDENT.text); }
	;


iterableTerm returns [Node result]
	: IDENT 			{ $result = handler.refer( $IDENT.text); }
	| qualifiedName		{ $result = $qualifiedName.result; }
	| funcCallExp		{ $result = $funcCallExp.result; }
	| methodCallExp		{ $result = $methodCallExp.result; }
	| array 			{ $result = $array.result; }
	;


formulaTerm returns [Node result]
	: literalTerm 			{ $result = $literalTerm.result; }
	| qualifiedName		{ $result = $qualifiedName.result; }
	| funcCallExp		{ $result = $funcCallExp.result; }
	| methodCallExp		{ $result = $methodCallExp.result; }
	| arrayRef			{ $result = $arrayRef.result; }
	| array 			{ $result = $array.result; }
	| map				{ $result = $map.result; }
	;

arrayRef   returns [Ref result]
	: IDENT '[' 
		(NUMBER 	{ $result = handler.refer( $IDENT.text, handler.literal( GrammarTokens.LIT_NUMBER, $NUMBER.text) ); } 
		| id2 = IDENT		{ $result = handler.refer( $IDENT.text, handler.refer( $id2.text) ); } 
		)
	 ']'
	;
	
array   returns [Gettable result]
	: '['	{ List<Node> elements = new LinkedList<Node>(); }
		( 
			( formulaTerm 		{ elements.add($formulaTerm.result); } )
			| ( from=NUMBER ':' to=NUMBER  { Range.setRange(elements, $from.text, $to.text) ; } )
		)
		(','
			( formulaTerm 		{ elements.add($formulaTerm.result); } )
			| ( from=NUMBER ':' to=NUMBER  { Range.setRange(elements, $from.text, $to.text) ; } ) 
		)* 	
		{	$result = handler.array(elements); }
	  ']'
	;
	
map   returns [Gettable result]
	: '{' 	{ $result = handler.map(GrammarTokens.SIMPLE_MAP);}
		IDENT ':' formulaTerm	
			{ handler.mapEntry( $result, null, $IDENT.text, $formulaTerm.result ); }
		(',' IDENT ':' formulaTerm 
			{ handler.mapEntry( $result, null, $IDENT.text, $formulaTerm.result ); }
		)* 
	  '}'
	;
	
qualifiedName returns [Ref result]
	: IDENT 	{ $result = handler.refer( $IDENT.text); }
	('.' IDENT	{ $result = handler.refer( $result, $IDENT.text); } )* 
	;

/* *****************************
 * Numeric Expression
 ******************************/

unary  returns [Node result]
	:  { boolean negative = false; }
		( '-' { negative = true; } )? ( 
		formulaTerm { $result = $formulaTerm.result;  }
		| '(' operatorExpression ')' { $result = $operatorExpression.result;  }
		) 
		{ 
			if(negative){
				$result = handler.operator(GrammarTokens.OP_NUM_NEGATION, $result );
			} 
		}
	;

percent  returns [Node result]
	:	unary 	{ $result = $unary.result;  }
    	('%' {$result = handler.operator(GrammarTokens.OP_PERCENT, $result); } )?
    ;

    
exponential returns [Node result]
    :	percent 	{ $result = $percent.result;  }
    	(
    		'^'		op2 = percent  	{$result = handler.operator(GrammarTokens.OP_POW, $result, $op2.result); }
    	)*
    ;
    
multiplicative returns [Node result]
    :	exponential 	{ $result = $exponential.result;  }
    	(
    		'*' 		op2 = exponential 	{$result = handler.operator(GrammarTokens.OP_MULTI, $result, $op2.result); }
    		| '/' 		op2 = exponential  	{$result = handler.operator(GrammarTokens.OP_DIVIDE, $result, $op2.result); }
//    		| '%'		op2 = exponential  	{$result = handler.operator(GrammarTokens.OP_MOD, $result, $op2.result); }
    	)*
    ;
    
additiveExpression returns [Node result]
    :   multiplicative { $result = $multiplicative.result;  }
    ( 
    	'+' 	op2 = multiplicative	{$result = handler.operator(GrammarTokens.OP_PLUS, $result, $op2.result); }
    	| '-' 	op2 = multiplicative	{$result = handler.operator(GrammarTokens.OP_MINUS, $result, $op2.result); }
    )*
    ;
    
/*
	String Expression
*/

stringExpression returns [Node result]
    :   additiveExpression { $result = $additiveExpression.result;  }
    ( 
    	'&' op2 = additiveExpression {$result = handler.operator(GrammarTokens.OP_CONCAT, $result, $op2.result); }
    )* 
    ;
  
/*
	Logical Expression
*/
comparison returns [Node result]
	: stringExpression  { $result = $stringExpression.result;  }
	( 
		'='  op2 = stringExpression {$result = handler.operator(GrammarTokens.OP_EQ, $result, $op2.result); }
		|'is'  op2 = stringExpression {$result = handler.operator(GrammarTokens.OP_EQ, $result, $op2.result); }
		|'!=' op2 = stringExpression {$result = handler.operator(GrammarTokens.OP_NOT_EQ, $result, $op2.result); }
		|'<>' op2 = stringExpression {$result = handler.operator(GrammarTokens.OP_NOT_EQ, $result, $op2.result); }
		|'is' 'not' op2 = stringExpression {$result = handler.operator(GrammarTokens.OP_NOT_EQ, $result, $op2.result); }
		|'>'  op2 = stringExpression {$result = handler.operator(GrammarTokens.OP_GT, $result, $op2.result); }
		|'>=' op2 = stringExpression {$result = handler.operator(GrammarTokens.OP_EQ_GT, $result, $op2.result); }
		|'<'  op2 = stringExpression {$result = handler.operator(GrammarTokens.OP_LT, $result, $op2.result); }
		|'<=' op2 = stringExpression {$result = handler.operator(GrammarTokens.OP_EQ_LT, $result, $op2.result); }
	)*
	;
	
notExpression returns [Node result]
	: 
	(
		comparison { $result = $comparison.result;  }
		| 'not' comparison {$result = handler.operator(GrammarTokens.OP_NOT, $comparison.result); }
		
	)
	;
	
logicalExpression returns [Node result]
	: notExpression { $result = $notExpression.result;  }
	( 
		'and' 	op2 = operatorExpression {$result = handler.operator(GrammarTokens.OP_AND, $result, $op2.result); }
		|'or' 	op2 = operatorExpression {$result = handler.operator(GrammarTokens.OP_OR, $result, $op2.result); }
		
	)*
	;
    
operatorExpression returns [Node result]
	: logicalExpression { $result = $logicalExpression.result;  }
	;
    
    
/* *********************************************
	Lexer rules
********************************************* */
fragment DIGIT	: '0'..'9' ;

/* LATIN ALPAHBETs, $, _ and Korean charset*/
fragment LETTER
    : 	'$'
    	| 'A'..'Z' 
    	| '_' | 'a'..'z'
    	| '\uAC00'..'\uD7AF'
    	| '\u3130'..'\u318F'
//       | '\u1100'..'\u11FF'
    ;

NUMBER : DIGIT+ ('.' DIGIT+)? ;

STRING_LITERAL
	:	( '"' ( ~('"'|'\r'|'\n') )* '"' )
		| ( '\'' ( ~('\''|'\r'|'\n') )* '\'' )
	;

NULL : ('null'|'nil'|'NULL') ;

BOOLEAN :	('true' | 'false' | 'TRUE' | 'FALSE') ;
IDENT :  LETTER (LETTER|DIGIT)* ;

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

MULTILINE_COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;
    
fragment EOL 	
	:	(	( '\r\n' ) // DOS
		|	'\r'    // OSX
		|	'\n'    // Unix 
		)
	;