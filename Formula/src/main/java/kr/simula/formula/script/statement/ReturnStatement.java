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
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.QName;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class ReturnStatement extends AbstractStatement {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3487808308853873781L;
	private final Gettable<?> gettable;
	private final QName returnValueKey;
	
	/**
	 * @param gettable
	 */
	public ReturnStatement(QName returnValueKey, Gettable<?> gettable) {
		this.gettable = gettable;
		this.returnValueKey = returnValueKey;
	}

	@Override
	public String getToken() {
		return GrammarTokens.RETURN;
	}
	
	@Override
	public void eval(Context context) {
		Object value = gettable.get(context);
		context.setLocalVar(returnValueKey, value);
	}
	
	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		buf.append("[return ").append(gettable.getExpression());
		buf.append("]");
		return buf.toString();
	}

}
