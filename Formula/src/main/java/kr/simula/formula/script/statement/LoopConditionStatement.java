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
package kr.simula.formula.script.statement;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.EvalException;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.ref.VariableRef;
import kr.simula.formula.core.util.GettableUtils;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class LoopConditionStatement extends AbstractStatement {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1287038703776425966L;
	@SuppressWarnings("rawtypes")
	private VariableRef varRef;
	@SuppressWarnings("rawtypes")
	private Gettable<Iterable> iteratorRef;
	private Gettable<?> arrayGettable;
	
	
	/**
	 * @param varRef
	 */
	@SuppressWarnings("rawtypes")
	public LoopConditionStatement(VariableRef varRef) {
		this.varRef = varRef;
	}

	@Override
	public String getToken() {
		return GrammarTokens.LOOP_COND_DECL;
	}
	
	@SuppressWarnings("rawtypes")
	public Gettable<Iterable> getIteratorRef() {
		return iteratorRef;
	}

	public void setIteratorRef(Node iteratorRef) {
		if(GettableUtils.isGettable(iteratorRef, Iterable.class) ) {
			this.iteratorRef = GettableUtils.checkGettable(iteratorRef, Iterable.class);
		} else if(GettableUtils.isArrayGettable(iteratorRef) ) {
			this.arrayGettable = GettableUtils.checkGettable(iteratorRef);
		} else {
			throw new BuildException(iteratorRef + " is not iterable.");
		}
		
	}
	
	/**
	 * @return the varRef
	 */
	public VariableRef<?> getVarRef() {
		return varRef;
	}
	
	public Gettable<?> getArrayGettable() {
		return arrayGettable;
	}

	/**
	 * @return the range
	 *
	public Range getRange() {
		return range;
	}
	
	public void setRange(Range range) {
		this.range = range;
	}
	*/
	
	@Override
	public void eval(Context context) {
		// DO NOTHING
		throw new EvalException(this, "LoopCondition#eval not supported.");
	}
	
	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		buf.append("(").append(varRef.getExpression());
		if(iteratorRef != null) {
			buf.append(iteratorRef.getExpression());
		} else if(arrayGettable != null) {
			buf.append(arrayGettable.getExpression());
		} 
		
		return buf.toString();
	}

}
