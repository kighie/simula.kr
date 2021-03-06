/* ******************************************************************************
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
package kr.simula.formula.script.statement;

import java.util.LinkedList;
import java.util.List;

import kr.simula.formula.core.BlockContext;
import kr.simula.formula.core.BlockStatement;
import kr.simula.formula.core.Context;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.Statement;
import kr.simula.formula.core.util.GettableUtils;
import kr.simula.formula.core.wrapper.AbstractBlock;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class IfStatement extends AbstractBlock implements BlockStatement{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3944279605088982554L;
	private Gettable<Boolean> condition;
	private List<ElseIf> elseIfList ;
	private Else elseStmt;
	
	
	/**
	 * @param condition
	 */
	public IfStatement(Gettable<Boolean> condition) {
		super();
		this.condition = condition;
	}

	@Override
	public String getToken() {
		return GrammarTokens.IF;
	}
	
	/**
	 * @return the condition
	 */
	public Gettable<Boolean> getCondition() {
		return condition;
	}

	public ElseIf createElseIf(Gettable<Boolean> elseIfCondition) {
		ElseIf elseIf = new ElseIf(elseIfCondition);
		if( elseIfList == null ){
			elseIfList = new LinkedList<IfStatement.ElseIf>();
		}
		elseIfList.add(elseIf);
		return elseIf;
	}

	public ElseIf createElseIf(Node elseIfCondition) {
		return createElseIf(GettableUtils.getBooleanGettable(elseIfCondition));
	}
	
	
	/**
	 * @return the elseStmt
	 */
	public Else checkOutElse() {
		if(elseStmt == null){
			elseStmt = new Else();
		}
		return elseStmt;
	}

	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		buf.append("if(").append(condition.getExpression()).append(") { ");
		getBodyExpression(buf);
		buf.append("}");
		if( elseIfList != null ){
			for(ElseIf ef : elseIfList){
				buf.append( ef.getExpression() );
			}
		}
		
		if(elseStmt != null){
			buf.append( elseStmt.getExpression() );
		}
		return buf.toString();
	}
	
	@Override
	public void eval(Context context) {
		BlockContext blockCtx = new BlockContext(context);
		
		if( condition.get(context) ){
			evalBody(blockCtx);
			return;
		} else if( elseIfList != null ){
			for(ElseIf ef : elseIfList){
				blockCtx.clear();
				if( ef.elseIfCondition.get(blockCtx) ){
					ef.eval(blockCtx);
					return;
				}
			}
		}
		
		if( elseStmt != null ){
			blockCtx.clear();
			elseStmt.eval(blockCtx);
		}
	}
	

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append("if(").append(condition.toString()).append(") {\n");
		toBodyString(buf);
		buf.append("}");
		if( elseIfList != null ){
			for(ElseIf ef : elseIfList){
				buf.append( ef.toString() );
			}
		}
		
		if(elseStmt != null){
			buf.append( elseStmt.toString() );
		}
		return buf.toString();
	}
	
	
	public class ElseIf  extends AbstractBlock implements Statement {
		/**
		 * 
		 */
		private static final long serialVersionUID = 4703597429637430754L;
		private Gettable<Boolean> elseIfCondition;

		public ElseIf(Gettable<Boolean> elseIfCondition) {
			this.elseIfCondition = elseIfCondition;
		}
		

		@Override
		public String getToken() {
			return GrammarTokens.ELSEIF;
		}
		
		@Override
		public String getExpression() {
			StringBuilder buf = new StringBuilder();
			buf.append("elseif(").append(elseIfCondition.getExpression()).append(") {\n");
			getBodyExpression(buf);
			buf.append("}");
			return buf.toString();
		}
		
		@Override
		public void eval(Context context) {
			if( elseIfCondition.get(context) ){
				evalBody(context);
			}
		}
		


		@Override
		public String toString() {
			StringBuilder buf = new StringBuilder();
			buf.append("elseif(").append(elseIfCondition.toString()).append(") {\n");
			toBodyString(buf);
			buf.append("}");
			return buf.toString();
		}
		
	}

	public class Else extends AbstractBlock implements Statement {
		/**
		 * 
		 */
		private static final long serialVersionUID = -7911878708653131993L;

		@Override
		public String getExpression() {
			StringBuilder buf = new StringBuilder();
			buf.append("else").append(" {\n");
			getBodyExpression(buf);
			buf.append("}");
			return buf.toString();
		}
		
		@Override
		public void eval(Context context) {
			evalBody(context);
		}

		@Override
		public String getToken() {
			return GrammarTokens.ELSE;
		}
		
		@Override
		public String toString() {
			StringBuilder buf = new StringBuilder();
			buf.append("else").append(" {\n");
			toBodyString(buf);
			buf.append("}");
			return buf.toString();
		}
	}
}
