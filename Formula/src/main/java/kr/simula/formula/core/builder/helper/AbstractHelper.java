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
package kr.simula.formula.core.builder.helper;

import java.util.HashMap;
import java.util.Map;

import kr.simula.formula.core.builder.BuildException;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public abstract class AbstractHelper<FACTORY_TYPE> {

	protected final HashMap<String, FACTORY_TYPE> factories = new HashMap<String, FACTORY_TYPE>();
	
	
	/**
	 * 
	 */
	public AbstractHelper() {
		initDefaults();
	}
	
	protected void initDefaults(){
	}
	
	public FACTORY_TYPE getFactory(String expToken) {
		FACTORY_TYPE factory = factories.get(expToken);
		if(factory == null){
			throw new BuildException("Factory for " + expToken + " is not registered.");
		}
		
		return factory;
	}
	
	public FACTORY_TYPE setFactory(String expToken, FACTORY_TYPE factory) {
		return factories.put(expToken, factory);
	}
	
	public void setFactories(Map<String, ? extends FACTORY_TYPE> m) {
		factories.putAll(m);
	}

}
