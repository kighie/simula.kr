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
package kr.simula.formula.core.ref;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.QName;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class ArgDeclRef<T>  extends GenericRef implements Gettable<T>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 535106876225275853L;
	protected Class<? extends T> type;
	
	/**
	 * @param qname
	 */
	public ArgDeclRef(Class<? extends T> type, QName qname) {
		super(qname);
		this.type = type;
	}
	
	/**
	 * @return the type
	 */
	@Override
	public Class<? extends T> type() {
		return type;
	}
	
	@Override
	public String getToken() {
		return GrammarTokens.ARG_DECL;
	}
	
	@Override
	public String getExpression() {
		StringBuilder buf = new StringBuilder();
		buf.append(type.getName()).append(" ").append(qname);
		return buf.toString();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T get(Context context) {
		return (T)context.getReference(qname);
	}
}
