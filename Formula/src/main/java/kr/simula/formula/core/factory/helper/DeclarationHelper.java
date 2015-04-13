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
package kr.simula.formula.core.factory.helper;

import java.util.List;

import kr.simula.formula.core.BlockStatement;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.factory.DeclarationFactory;
import kr.simula.formula.core.factory.FunctionDeclFactory;
import kr.simula.formula.core.factory.func.DefaultFunctionDeclFactory;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public abstract class DeclarationHelper extends AbstractHelper<DeclarationFactory> {
	
	private FunctionDeclFactory fnDeclFactory;
	

	public DeclarationHelper() {
		this(new DefaultFunctionDeclFactory());
	}
	
	/**
	 * @param fnDeclFactory
	 */
	public DeclarationHelper(FunctionDeclFactory fnDeclFactory) {
		this.fnDeclFactory = fnDeclFactory;
	}

	/**<pre>
	 * </pre>
	 * @param context 
	 * @param token
	 * @param type
	 * @param name
	 * @return
	 */
	public Ref create(BuildContext context, String token, Class<?> type, String name) {
		DeclarationFactory factory = factories.get(token);
		if(factory == null){
			throw new BuildException("DeclarationFactory for " + token + " is not registered.");
		}
		return factory.create(context, type, name);
	}

	/**<pre>
	 * </pre>
	 * @param current
	 * @param retType
	 * @param name
	 * @param args
	 * @return
	 */
	public BlockStatement createFn(BuildContext current, Class<?> retType, String name,
			List<Ref> args) {
		return fnDeclFactory.create(current, retType, name, args);
	}

	
}
