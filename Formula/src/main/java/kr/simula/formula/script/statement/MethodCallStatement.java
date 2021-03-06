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

import kr.simula.formula.core.Context;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.ref.MethodRef;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class MethodCallStatement extends AbstractStatement {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1307750552898970349L;
	private MethodRef<?> methodRef;
	
	/**
	 * @param methodRef
	 */
	public MethodCallStatement(MethodRef<?> methodRef) {
		this.methodRef = methodRef;
	}

	@Override
	public String getToken() {
		return GrammarTokens.MTHODE_CALL_STMT;
	}
	
	@Override
	public void eval(Context context) {
		methodRef.eval(context);
	}
	
	@Override
	public String getExpression() {
		return methodRef.getExpression();
	}
	
	@Override
	public String toString() {
		return methodRef.toString();
	}

}
