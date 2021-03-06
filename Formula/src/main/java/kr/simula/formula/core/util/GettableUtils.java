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
package kr.simula.formula.core.util;

import java.math.BigDecimal;
import java.util.Date;

import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.Literal;
import kr.simula.formula.core.Node;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.ref.TypeLateBinding;
import kr.simula.formula.core.wrapper.DecimalGettableWrapper;
import kr.simula.formula.core.wrapper.StringGettableWrapper;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class GettableUtils {
	public static final TypeConverter<Object, BigDecimal> NUMBER_TO_DECIMAL = new TypeConverter<Object, BigDecimal>(){
		@Override
		public BigDecimal convert(Object input) {
			return new BigDecimal(input.toString());
		}
	};

	public static final TypeConverter<Object, BigDecimal> OBJECT_TO_DECIMAL = new TypeConverter<Object, BigDecimal>(){
		@Override
		public BigDecimal convert(Object input) {
			return new BigDecimal(input.toString());
		}
	};
	

	public static Gettable<?> checkGettable(Node node){
		if(node instanceof Gettable){
			return (Gettable<?>)node;
		}
		throw new BuildException(node + " is not Gettable.");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T> Gettable<T> checkGettable(Node node, Class<T>type){
		if(node instanceof Gettable){
			Gettable gettable = (Gettable)node;
			Class<?> nodeType = gettable.type();
			if(nodeType == null && gettable instanceof TypeLateBinding){
				((TypeLateBinding)gettable).setRequiredType(type);
				return (Gettable<T>)gettable;
			}

			if(type.isAssignableFrom( nodeType )){
				return (Gettable<T>)gettable;
			}
		}
		
		
		throw new BuildException(node + " is not Gettable<" + type.getName() + ">");
	}

	public static <T> boolean isGettable(Node node, Class<T>type){
		if(node instanceof Gettable){
			Gettable<?> gettable = (Gettable<?>)node;
			Class<?> nodeType = gettable.type();
			if(nodeType == null && gettable instanceof TypeLateBinding){
				return true;
			}
			if(type.isAssignableFrom( nodeType )){
				return true;
			}
		}
		
		
		return false;
	}
	

	/**<pre>
	 * </pre>
	 * @param iteratorRef
	 * @return
	 */
	public static boolean isArrayGettable(Node node) {
		if(node instanceof Gettable){
			Gettable<?> gettable = (Gettable<?>)node;
			Class<?> nodeType = gettable.type();
			if(nodeType == null && gettable instanceof TypeLateBinding){
				return true;
			}
			if(nodeType.isArray()){
				return true;
			}
		}
		
		return false;
	}


	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static Gettable<Comparable<?>> checkComparableGettable(Node node){
		if(node instanceof Gettable){
			Class<?> type = ((Gettable) node).type();
			if(type == null && node instanceof TypeLateBinding){
				return (Gettable<Comparable<?>>)node;
			}
			if(Comparable.class.isAssignableFrom( type )){
				return (Gettable<Comparable<?>>)node;
			}
		}
		throw new BuildException(node + " is not Gettable<Comparable>.");
	}

	public static BigDecimal getDecimal(Object value){
		if(value instanceof BigDecimal){
			return (BigDecimal)value;
		}
		
		if(value instanceof Number){
			return new BigDecimal(value.toString());
		}
		
		throw new BuildException(value + " is not numeric.");
	}
	

	public static Gettable<BigDecimal> getDecimalGettable(Node node){
		if(node instanceof Gettable){
			return getDecimalGettable((Gettable<?>)node);
		}
		throw new BuildException(node + " is not Gettable.");
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Gettable<BigDecimal> getDecimalGettable(Gettable<?> node){
		Class<?> type = node.type();
		
		if(type == null) {
			if(node instanceof TypeLateBinding){
				((TypeLateBinding)node).setRequiredType(BigDecimal.class);
			}
			
			return new DecimalGettableWrapper(NUMBER_TO_DECIMAL,node);
		}
		
		if(BigDecimal.class.isAssignableFrom(type) ){
			return (Gettable<BigDecimal>)node;
		}

		if(Number.class.isAssignableFrom(type) ){
			return new DecimalGettableWrapper(NUMBER_TO_DECIMAL,node);
		}

		if(Object.class.isAssignableFrom(type) ){
			return new DecimalGettableWrapper(OBJECT_TO_DECIMAL,node);
		}
		
		
		
		throw new BuildException(node + " is not numeric node.");
	}
	
	
	public static BigDecimal getDecimalValue(Literal<?> literal){
		Object value = literal.getValue();

		if(value instanceof BigDecimal) {
			return (BigDecimal)value;
		} else if(value instanceof Number) {
			return new BigDecimal(value.toString());
		} else {
			throw new BuildException("Numeric binary operator needs numeric operand. But literal operand=" + literal);
		}
	}


	public static Gettable<String> getStringGettable(Node node){
		if(node instanceof Gettable){
			return getStringGettable((Gettable<?>)node);
		}
		throw new BuildException(node + " is not Gettable.");
	}

	@SuppressWarnings("unchecked")
	public static Gettable<String> getStringGettable(Gettable<?> node){
		Class<?> type = node.type();
		
		if(String.class.isAssignableFrom(type) ){
			return (Gettable<String>)node;
		} else {
			return new StringGettableWrapper(node);
		}
	}
	
	/**<pre>
	 * </pre>
	 * @param node
	 * @return
	 */
	public static Gettable<Boolean> getBooleanGettable(Node node) {
		if(node instanceof Gettable){
			return getBooleanGettable((Gettable<?>)node);
		}
		throw new BuildException(node + " is not Gettable.");
	}
	

	@SuppressWarnings("unchecked")
	public static Gettable<Boolean> getBooleanGettable(Gettable<?> node) {
		Class<?> type = node.type();
		if(type == null && node instanceof TypeLateBinding){
			return (Gettable<Boolean>)node;
		}
		if(Boolean.class.isAssignableFrom( type )){
			return (Gettable<Boolean>)node;
		}
		
		throw new BuildException(node + " is not Gettable<Boolean>.");
	}

	/**<pre>
	 * </pre>
	 * @param node
	 * @return
	 */
	public static Gettable<Date> getDateGettable(Node node) {
		if(node instanceof Gettable){
			return getDateGettable((Gettable<?>)node);
		}
		throw new BuildException(node + " is not Gettable.");
	}
	

	@SuppressWarnings("unchecked")
	public static Gettable<Date> getDateGettable(Gettable<?> node) {
		if(Date.class.isAssignableFrom(node.type()) ){
			return (Gettable<Date>)node;
		} 
		throw new BuildException(node + " is not Gettable<Date>.");
	}

}
