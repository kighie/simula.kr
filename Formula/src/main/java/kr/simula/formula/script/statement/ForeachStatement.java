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

import java.util.Arrays;

import kr.simula.formula.core.BlockContext;
import kr.simula.formula.core.BlockStatement;
import kr.simula.formula.core.Context;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.EvalException;
import kr.simula.formula.core.ref.VariableRef;
import kr.simula.formula.core.wrapper.AbstractBlock;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class ForeachStatement extends AbstractBlock implements BlockStatement{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7430282325996175368L;
	private LoopConditionStatement loopCondition;
	
	/**
	 * @param loopCond
	 */
	public ForeachStatement(LoopConditionStatement loopCond) {
		this.loopCondition = loopCond;
	}

	@Override
	public String getToken() {
		return GrammarTokens.FOREACH;
	}
	
	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		buf.append("foreach(").append(loopCondition.getExpression()).append("){");
		getBodyExpression(buf);
		buf.append("}");
		return buf.toString();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void eval(Context context) {
		BlockContext blockCtx = new BlockContext(context);
		
		VariableRef<?> varRef = loopCondition.getVarRef();
		
		Gettable<?> iteratorRef = loopCondition.getIteratorRef();
		if(iteratorRef != null){
			Class<?> type = iteratorRef.type();
			if(Iterable.class.isAssignableFrom(type) ){
				Iterable<?> iterable = ((Gettable<Iterable>)iteratorRef).get(blockCtx);
				doEval(blockCtx, varRef, iterable);
			} else if(type.isArray()){
				Object[] array = ((Gettable<Object[]>)iteratorRef).get(blockCtx);
				
				doEval(blockCtx, varRef, Arrays.asList(array));
			} else {
				throw new EvalException(iteratorRef, iteratorRef + " is not iterable.");
			}
		} else {
			Gettable<?> arrayGettable = loopCondition.getArrayGettable();
			if(arrayGettable != null){
				Object[] array = ((Gettable<Object[]>)arrayGettable).get(blockCtx);
				doEval(blockCtx, varRef, Arrays.asList(array));
			} else {
				throw new EvalException(iteratorRef, iteratorRef + " is not iterable nor int range.");
			}
		}
		
	}
	
	/**
	 * <pre>
	 * </pre>
	 * @param blockCtx
	 * @param varRef
	 * @param iterable
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void doEval(BlockContext blockCtx, VariableRef varRef, Iterable<?> iterable ) {
		for( Object o : iterable ){
			blockCtx.clear();
			varRef.setLocal(blockCtx, o);
			evalBody(blockCtx);
		}
	}

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append("foreach(").append(loopCondition.toString()).append("){");
		toBodyString(buf);
		buf.append("}");
		return buf.toString();
	}
	
}
