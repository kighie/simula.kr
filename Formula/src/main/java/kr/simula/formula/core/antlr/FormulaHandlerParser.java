package kr.simula.formula.core.antlr;

import java.util.List;
import java.util.Map;

import kr.simula.formula.core.Block;
import kr.simula.formula.core.BlockStatement;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.Lambda;
import kr.simula.formula.core.Literal;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.SourceLocation;
import kr.simula.formula.core.Statement;
import kr.simula.formula.core.builder.BuildHandler;
import kr.simula.formula.core.util.SimpleSourceLocation;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class FormulaHandlerParser extends Parser implements GrammarTokens {
	
	private String sourceText;
	private BuildHandler handler;
	
	public FormulaHandlerParser(TokenStream input) {
		super(input);
	}
	

  	public void setHandler(BuildHandler formulaHandler){
  		this.handler = formulaHandler;
  	}
  	
  	public void setSourceText(String sourceText) {
		this.sourceText = sourceText;
	}
  	
	public Block block(String token) {
		return handler.block(token);
	}


	public void beginScope() {
		handler.beginScope();
	}


	public void endScope() {
		handler.endScope();
	}


	public Gettable<?> operator(String token, Node node) {
		return (Gettable<?>)handler.operator(token, node).setLocation(currentLocation());
	}

	public Gettable<?> operator(String token, Node left, Node right) {
		return (Gettable<?>)handler.operator(token, left, right).setLocation(currentLocation());
	}

	public Literal<?> literal(String token, String value) {
		return (Literal<?>)handler.literal(token, value).setLocation(currentLocation());
	}

	public Ref refer(String name) {
		return (Ref)handler.refer(name).setLocation(currentLocation());
	}

	public Ref refer(Ref parent, String name) {
		
		return (Ref)handler.refer(parent, name).setLocation(currentLocation());
	}

	public Ref referIndexed(Ref parent, Node index) {
		
		return (Ref)handler.referIndexed(parent, index).setLocation(currentLocation());
	}


	public Ref declare(String token, Class<?> type, String name) {
		return (Ref)handler.declare(token, type, name).setLocation(currentLocation());
	}

	

	public Gettable<?> declareProto(String token, List<?> fieldList) {
		return (Gettable<?>)handler.declareProto(token, fieldList).setLocation(currentLocation());
	}



	public void protoField(String token, List<?> fieldList, Class<?> type,
			String name, Node defaultValue, Object... extra) {
		handler.protoField(token, fieldList, type, name, defaultValue, extra);
	}



	public BlockStatement declareFn(Class<?> retType, String name,
			List<Ref> args) {
		
		return (BlockStatement)handler.declareFn(retType, name, args).setLocation(currentLocation());
	}

	public Class<?> type(String typeQname) {
		return handler.type(typeQname);
	}

	public <T> Class<T[]> arrayType(Class<T> type) {
		return handler.arrayType(type);
	}

	public Gettable<?> functionCall(String name, List<Node> args) {
		
		return (Gettable<?>)handler.functionCall(name, args).setLocation(currentLocation());
	}

	public Ref methodCall(Ref parent, String name, List<Node> args) {
		
		return (Ref)handler.methodCall(parent, name, args).setLocation(currentLocation());
	}

	public Statement statement(String token, Node... args) {
		
		return (Statement)handler.statement(token, args).setLocation(currentLocation());
	}

	public BlockStatement statementBlock(String token, Node... args) {
		
		return (BlockStatement)handler.statementBlock(token, args).setLocation(currentLocation());
	}

	public Lambda<?> lambda(String token, List<Ref> args, Object ... extra) {
		
		return (Lambda<?>)handler.lambda(token, args, extra).setLocation(currentLocation());
	}

	public Gettable<?> array(List<Node> elements) {
		
		return (Gettable<?>)handler.array(elements).setLocation(currentLocation());
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Gettable<Map> map(String token) {
		return (Gettable<Map>)handler.map(token).setLocation(currentLocation());
	}

	@SuppressWarnings("rawtypes")
	public void mapEntry(Gettable<Map> mapGettable, Class<?> entryType,
			String name, Node value) {
		handler.mapEntry(mapGettable, entryType, name, value);
	}
	
	/**
	 * @param ref
	 * @see kr.simula.formula.core.builder.BuildHandler#importJava(kr.simula.formula.core.Ref)
	 */
	public void importJava(Ref ref) {
		handler.importJava(ref);
	}


	public SourceLocation currentLocation(){
		SimpleSourceLocation location = null;
		
		if(_ctx == null){
			Token token = this.getCurrentToken();
			location = new SimpleSourceLocation(token.getLine(), token.getCharPositionInLine(), 
					token.getStartIndex(), token.getStopIndex());
			location.setText(token.getText());
			return location;
		} else {
			location = new SimpleSourceLocation(_ctx.start.getLine(), _ctx.start.getCharPositionInLine(), 
					_ctx.start.getStartIndex(), _ctx.start.getStopIndex());
			
			int end = -1;
			ParseTree last = _ctx.children.get(_ctx.children.size()-1);
			
			if(last instanceof TerminalNode){
				end = ((TerminalNode)last).getSymbol().getStopIndex();
			} else if(last instanceof ParserRuleContext) {
				end = ((ParserRuleContext)last).stop.getStopIndex();
			}
			
			location.setEndIndex(end);
		}
		
		if(sourceText != null){
			location.setText(sourceText.substring(location.getStartIndex(), location.getEndIndex()+1));
		} else {
			location.setText(_ctx.getText());
		}
		
		
//		System.out.println("\t" + location);
		return location;
	}
	
	@Override
	public String[] getTokenNames() {
		return null;
	}

	@Override
	public String[] getRuleNames() {
		return null;
	}

	@Override
	public String getGrammarFileName() {
		return null;
	}

	@Override
	public ATN getATN() {
		return null;
	}
	
}
