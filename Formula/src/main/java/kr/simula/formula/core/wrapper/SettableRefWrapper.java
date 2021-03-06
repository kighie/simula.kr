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
package kr.simula.formula.core.wrapper;

import java.util.Map;

import kr.simula.formula.core.Context;
import kr.simula.formula.core.InternalException;
import kr.simula.formula.core.Ref;
import kr.simula.formula.core.Settable;
import kr.simula.formula.core.SourceLocation;
import kr.simula.formula.core.ref.ArrayElementRef;
import kr.simula.formula.core.ref.MapEntryRef;
import so.ontolog.data.common.Undefined;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class SettableRefWrapper<T> implements Settable<T> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4948583787362396280L;
	protected final Ref ref;
	protected final Setter<T> setter;
	
	/**
	 * @param type
	 * @param ref
	 */
	public SettableRefWrapper(Ref ref) {
		super();
		this.ref = ref;
		this.setter = createSetter(ref);
	}

	@SuppressWarnings("unchecked")
	protected Setter<T> createSetter(Ref ref){
		Setter<T> setter;
		if(ref instanceof ArrayElementRef){
			setter = new ArraySetter<T>((ArrayElementRef<T>) ref);
		} else if(ref instanceof MapEntryRef){
			setter = new MapEntrySetter<T>((MapEntryRef) ref);
		} else if(ref instanceof Settable){
			setter = new SettableSetter<T>((Settable<T>) ref);
		} else {
			setter = new SimpleSetter<T>(ref);
		}
		return setter;
	}
	
	@Override
	public String getExpression() {
		return ref.getExpression();
	}

	@Override
	public String getToken() {
		return ref.getToken();
	}

	@Override
	public SourceLocation getLocation() {
		return ref.getLocation();
	}

	@Override
	public Settable<T> setLocation(SourceLocation location) {
		ref.setLocation(location);
		return this;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Class<? extends T> type() {
		return (Class<? extends T>)ref.type();
	}

	@Override
	public void set(Context context, T value) {
		setter.set(context, value);
	}
	
	protected static interface Setter<E> {
		void set(Context context, E value);
	}

	static class SimpleSetter<E> implements Setter<E> {
		private Ref ref;
		private Class<?> refType;
		
		public SimpleSetter(Ref ref) {
			this.ref = ref;
			refType = ref.type();
			if(refType == Undefined.class){
				refType = null;
			}
		}

		@Override
		public void set(Context context, E value) {
			if( refType != null ){
				if(!refType.isAssignableFrom(value.getClass())){
					throw new InternalException("Value " + value + " cannot be set to " + ref);
				}
			}
//			System.out.println(refType + " set " + value);
			context.setReference(ref.qualifiedName(), value);
		}
		
	}

	static class ArraySetter<E> implements Setter<E> {
		private ArrayElementRef<E> elementRef;
		
		public ArraySetter(ArrayElementRef<E> elementRef) {
			this.elementRef = elementRef;
		}

		@Override
		public void set(Context context, E value) {
			Object[] array = (Object[])context.getReference(elementRef.qualifiedName().getParent());
			int index = elementRef.getIndex(context).intValue();
			array[index] = value;
		}
		
	}

	static class SettableSetter<E> implements Setter<E> {
		private Settable<E> fieldRef;
		
		public SettableSetter(Settable<E> fieldRef) {
			this.fieldRef = fieldRef;
		}

		@Override
		public void set(Context context, E value) {
			fieldRef.set(context, value);
		}
		
	}
	

	static class MapEntrySetter<E> implements Setter<E> {
		private MapEntryRef  entryRef;
		
		public MapEntrySetter(MapEntryRef  entryRef) {
			this.entryRef = entryRef;
		}

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public void set(Context context, E value) {
			Map map = (Map)context.getReference(entryRef.qualifiedName().getParent());
			String prop = entryRef.getIndex(context);
			map.put(prop, value);
		}
		
	}
}
