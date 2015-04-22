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

import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.QName;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.builder.BuildContext;
import kr.simula.formula.core.ref.ArrayElementRef;
import kr.simula.formula.core.ref.FieldRef;
import kr.simula.formula.core.ref.ParameterRef;
import kr.simula.formula.core.util.GettableUtils;

/**
 * <pre>
 * LiteralHelper creates Literal Nodes (string, number, boolean, date, etc.)
 * </pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class RefHelper {

	/**
	 * 
	 * <pre>
	 * </pre>
	 * @param context
	 * @param name
	 * @return
	 */
	public Ref get(BuildContext context, String name){
		QName qname = makeQName(context, name);
		Ref ref = context.getRef(qname);
		System.out.println("REF A :: " + ref);
		if(ref != null){
			return ref;
		}

		System.out.println("REF B :: " + ref);
		ref = newRef(context, null, qname);
		return ref;
	}

	
	/**
	 * TODO
	 * <pre>
	 * </pre>
	 * @param context
	 * @param parent
	 * @param name
	 * @return
	 */
	public Ref get(BuildContext context, Ref parent, String name){
		QName qname = makeQName(context, parent, name);
		Ref ref = context.getRef(qname);

		System.out.println("REF1 :: " + ref);
		if(ref != null){
			return ref;
		}
		
		ref = newRef(context, parent, qname);
		System.out.println("REF2 :: " + ref);
		return ref;
	}
	
	protected Ref newRef(BuildContext context, Ref parent, QName qname) {
		Ref ref = create(parent, qname);
		context.registerRef(qname, ref);
		return ref;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected Ref create(Ref parent, QName qname){
		if(parent != null){
			return new FieldRef(qname, (Gettable<?>)parent);
		} else {
			return new ParameterRef(qname);
		}
	}
	
	/**<pre>
	 * </pre>
	 * @param context
	 * @param parent
	 * @param name
	 */
	protected QName makeQName(BuildContext context, Ref parent, String name) {
		return new QName(parent.qualifiedName(), name);
	}

	/**
	 * TODO 
	 * <pre>
	 * </pre>
	 * @param context
	 * @param exprToken
	 * @param qname
	 * @return
	 */
	protected QName makeQName(BuildContext context, String name) {
		return new QName(name);
	}


	/**<pre>
	 * </pre>
	 * @param current
	 * @param name
	 * @param index
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Ref get(BuildContext current, String name, Node index) {
		Ref parentArray = get(current, name);
		ArrayElementRef elementRef = new ArrayElementRef (parentArray.qualifiedName(), 
				GettableUtils.checkGettable(parentArray), GettableUtils.checkGettable(index,Number.class));
		return elementRef;
	}


	/**<pre>
	 * </pre>
	 * @param current
	 * @param parent
	 * @param name
	 * @param index
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Ref get(BuildContext current, Ref parent, String name, Node index) {
		Ref parentArray = get(current, parent, name);
		ArrayElementRef elementRef = new ArrayElementRef (parentArray.qualifiedName(), 
				GettableUtils.checkGettable(parentArray), GettableUtils.checkGettable(index,Number.class));
		return elementRef;
	}
}
