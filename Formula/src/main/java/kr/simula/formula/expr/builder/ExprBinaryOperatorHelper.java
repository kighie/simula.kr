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
package kr.simula.formula.expr.builder;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.Operator.Binary;
import kr.simula.formula.core.builder.helper.BinaryOperatorHelper;
import kr.simula.formula.core.factory.op.CompareBinaryOperatorFactory;
import kr.simula.formula.core.factory.op.DecimalBinaryOperatorFactory;
import kr.simula.formula.core.factory.op.EqualsBinaryOperatorFactory;
import kr.simula.formula.core.factory.op.LogicalBinaryOperatorFactory;
import kr.simula.formula.core.factory.op.StringBinaryOperatorFactory;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class ExprBinaryOperatorHelper extends BinaryOperatorHelper {

	public static final MathContext DIVIDE_MATH_CONTEXT = new MathContext(10, RoundingMode.HALF_UP);
	
	@Override
	protected void initDefaults() {
		super.initDefaults();

		setFactory(GrammarTokens.OP_POW, new DecimalBinaryOperatorFactory(POW));
		setFactory(GrammarTokens.OP_MULTI, new DecimalBinaryOperatorFactory(MULTIFLY));
		setFactory(GrammarTokens.OP_DIVIDE, new DecimalBinaryOperatorFactory(DIVIDE));
//		setFactory(GrammarTokens.OP_MOD, new DecimalBinaryOperatorFactory(MOD));
		setFactory(GrammarTokens.OP_PLUS, new DecimalBinaryOperatorFactory(ADD));
		setFactory(GrammarTokens.OP_MINUS, new DecimalBinaryOperatorFactory(SUBTRACT));
		setFactory(GrammarTokens.OP_EQ, new EqualsBinaryOperatorFactory(EQUALS));
		setFactory(GrammarTokens.OP_NOT_EQ, new EqualsBinaryOperatorFactory(NOT_EQUALS));
		setFactory(GrammarTokens.OP_EQ_GT, new CompareBinaryOperatorFactory(EQUALS_GT));
		setFactory(GrammarTokens.OP_GT, new CompareBinaryOperatorFactory(GT));
		setFactory(GrammarTokens.OP_EQ_LT, new CompareBinaryOperatorFactory(EQUALS_LT));
		setFactory(GrammarTokens.OP_LT, new CompareBinaryOperatorFactory(LT));
		setFactory(GrammarTokens.OP_AND, new LogicalBinaryOperatorFactory(AND));
		setFactory(GrammarTokens.OP_OR, new LogicalBinaryOperatorFactory(OR));
		setFactory(GrammarTokens.OP_CONCAT, new StringBinaryOperatorFactory(CONCAT));
	}


	public static final Binary<BigDecimal,BigDecimal,BigDecimal> POW = new Binary<BigDecimal,BigDecimal,BigDecimal>() {
			private static final long serialVersionUID = 1L;

			@Override
			public BigDecimal eval(BigDecimal val1, BigDecimal val2) {
				return val1.pow(val2.intValueExact());
			}
			
			public String getToken() { return "POW";};
	};
	
	public static final Binary<BigDecimal,BigDecimal,BigDecimal> MULTIFLY = new Binary<BigDecimal,BigDecimal,BigDecimal>() {
			private static final long serialVersionUID = 1L;

			@Override
			public BigDecimal eval(BigDecimal val1, BigDecimal val2) {
				return val1.multiply(val2);
			}
			
			public String getToken() { return "MULTIFLY";};
	};
	
	public static final Binary<BigDecimal, BigDecimal, BigDecimal> DIVIDE = new Binary<BigDecimal, BigDecimal, BigDecimal>() {
		private static final long serialVersionUID = 1L;

		@Override
		public BigDecimal eval(BigDecimal val1, BigDecimal val2) {
			return val1.divide(val2, DIVIDE_MATH_CONTEXT);
		}

		public String getToken() { return "DIVIDE";};
	};

	public static final Binary<BigDecimal, BigDecimal, BigDecimal> ADD = new Binary<BigDecimal, BigDecimal, BigDecimal>() {
		private static final long serialVersionUID = 1L;

		@Override
		public BigDecimal eval(BigDecimal val1, BigDecimal val2) {
			return val1.add(val2);
		}

		public String getToken() { return "ADD";};
	};
	

	public static final Binary<BigDecimal, BigDecimal, BigDecimal> SUBTRACT = new Binary<BigDecimal, BigDecimal, BigDecimal>() {
		private static final long serialVersionUID = 1L;

		@Override
		public BigDecimal eval(BigDecimal val1, BigDecimal val2) {
			return val1.subtract(val2);
		}
		
		public String getToken() { return "SUBTRACT";};
	};
	

	public static final Binary<Boolean, Object, Object> EQUALS = new Binary<Boolean, Object, Object>() {
		private static final long serialVersionUID = 1L;

		@Override
		public Boolean eval(Object val1, Object val2) {
			return val1.equals(val2);
		};
		
		public String getToken() { return "EQUALS";}

	};

	public static final Binary<Boolean, Object, Object> NOT_EQUALS = new Binary<Boolean, Object, Object>() {
		private static final long serialVersionUID = 1L;

		@Override
		public Boolean eval(Object val1, Object val2) {
			return !val1.equals(val2);
		};
		
		public String getToken() { return "NOT_EQUALS";}

	};

	public static final Binary<Boolean, Comparable<?>, Comparable<?>> EQUALS_GT = new Binary<Boolean, Comparable<?>, Comparable<?>>() {
		private static final long serialVersionUID = 1L;

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public Boolean eval(Comparable val1, Comparable val2) {
			return (val1.compareTo(val2) >= 0);
		};
		
		public String getToken() { return "EQUALS_GT";}

	};

	public static final Binary<Boolean, Comparable<?>, Comparable<?>> GT = new Binary<Boolean, Comparable<?>, Comparable<?>>() {
		private static final long serialVersionUID = 1L;

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public Boolean eval(Comparable val1, Comparable val2) {
			return (val1.compareTo(val2) > 0);
		};
		
		public String getToken() { return "GT";}

	};
	public static final Binary<Boolean, Comparable<?>, Comparable<?>> EQUALS_LT = new Binary<Boolean, Comparable<?>, Comparable<?>>() {
		private static final long serialVersionUID = 1L;

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public Boolean eval(Comparable val1, Comparable val2) {
			return (val1.compareTo(val2) <= 0);
		};
		
		public String getToken() { return "EQUALS_LT";}

	};

	public static final Binary<Boolean, Comparable<?>, Comparable<?>> LT = new Binary<Boolean, Comparable<?>, Comparable<?>>() {
		private static final long serialVersionUID = 1L;

		@SuppressWarnings({ "rawtypes", "unchecked" })
		@Override
		public Boolean eval(Comparable val1, Comparable val2) {
			return (val1.compareTo(val2) < 0);
		};
		
		public String getToken() { return "LT";}

	};
	

	public static final Binary<Boolean, Boolean, Boolean> AND = new Binary<Boolean, Boolean, Boolean>() {
		private static final long serialVersionUID = 1L;

		@Override
		public Boolean eval(Boolean val1, Boolean val2) {
			return val1 && val2;
		};
		
		public String getToken() { return "AND";}

	};
	

	public static final Binary<Boolean, Boolean, Boolean> OR = new Binary<Boolean, Boolean, Boolean>() {
		private static final long serialVersionUID = 1L;

		@Override
		public Boolean eval(Boolean val1, Boolean val2) {
			return val1 || val2;
		};
		
		public String getToken() { return "OR";}

	};
	

	public static final Binary<String, Object, Object> CONCAT = new Binary<String, Object, Object>() {
		private static final long serialVersionUID = 1L;

		@Override
		public String eval(Object val1, Object val2) {
			StringBuilder buf = new StringBuilder();
			buf.append(val1).append(val2);
			return buf.toString();
		};
		
		public String getToken() { return "CONCAT";}

	};
}
