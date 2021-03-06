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
package kr.simula.formula.core;

import java.io.Serializable;

/**
 * <pre>
 * Common interface of all Node classes.
 * </pre>
 * @author kighie@gmail.com
 *
 */
public interface Node extends Serializable {
//	/**
//	 * Node's content value type
//	 */
//	public enum ValueType {
//		VOID, 
//		TEXT,
//		DATE,
//		NUMERIC,
//		LOGICAL,
//		OBJECT,
//		ARRAY, 
//		MAP,
//		FUNCTION,
//		UNKNOWN
//	}
	
	/**
	 * Returns the value type of this node.
	 * @return
	 */
//	ValueType valueType();
	
	/**
	 * Returns full expression string of this node 
	 * @return
	 */
	String getExpression();
	
	/**
	 * @return this node's grammar token
	 * @see GrammarTokens
	 */
	String getToken();
	
	/**
	 * @return this node's location
	 */
	SourceLocation getLocation();

	/**
	 * set this node's location
	 * @param location
	 * @return this node
	 */
	Node setLocation(SourceLocation location);
}
