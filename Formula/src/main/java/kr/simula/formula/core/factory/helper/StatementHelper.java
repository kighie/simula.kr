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

import kr.simula.formula.core.Node;
import kr.simula.formula.core.Statement;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.factory.BlockFactory;
import kr.simula.formula.core.factory.StatementFactory;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class StatementHelper extends AbstractHelper<StatementFactory> {



	/**<pre>
	 * </pre>
	 * @param current
	 * @param token
	 * @param args
	 * @return
	 */
	public Statement create(BuildContext context, String token, Node[] args) {
		StatementFactory factory = factories.get(token);
		if(factory == null){
			throw new BuildException("StatementFactory for " + token + " is not registered.");
		}
		return factory.create(context, token, args);
	}

}
