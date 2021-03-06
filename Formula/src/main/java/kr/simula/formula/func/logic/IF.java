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
package kr.simula.formula.func.logic;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.annotation.Arguments;
import kr.simula.formula.core.annotation.FunctionBuild;
import kr.simula.formula.func.AbstractFunction;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
@FunctionBuild(argsLateEval=true)
public class IF extends AbstractFunction<Object> {
	private static final long serialVersionUID = 1L;

	/**
	 * @param returnType
	 */
	public IF() {
		super(Object.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	@Arguments({Boolean.class, Object.class, Object.class})
	public Object eval(Object... args) {
		checkArgCount(args, 2);
		Context context = (Context)args[0];
		Gettable<?>[] gettables = (Gettable<?>[])args[1];
		Gettable<Boolean> condition = (Gettable<Boolean>)gettables[0];
		
		if(condition.get(context)){
			return gettables[1].get(context);
		} else if(gettables.length>2) {
			return gettables[2].get(context);
		}
		
		return null;
	}

}