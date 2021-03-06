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
import java.math.RoundingMode;

import kr.simula.formula.core.GrammarTokens;
import kr.simula.formula.core.Operator.Unary;
import kr.simula.formula.core.builder.helper.UnaryOperatorHelper;
import kr.simula.formula.core.factory.op.DecimalUnaryOperatorFactory;
import kr.simula.formula.core.factory.op.LogicalUnaryOperatorFactory;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class ExprUnaryOperatorHelper extends UnaryOperatorHelper {
	
	private final static BigDecimal DEC100 = new BigDecimal("100");
	
	@Override
	protected void initDefaults() {
		super.initDefaults();

		setFactory(GrammarTokens.OP_NUM_NEGATION, new DecimalUnaryOperatorFactory(NEGATE));
		setFactory(GrammarTokens.OP_PERCENT, new DecimalUnaryOperatorFactory(PERCENT));
		setFactory(GrammarTokens.OP_NOT, new LogicalUnaryOperatorFactory(NOT));
	}
	

	public static final Unary<BigDecimal,BigDecimal> NEGATE = new Unary<BigDecimal,BigDecimal>() {
		private static final long serialVersionUID = 1L;

		@Override
		public BigDecimal eval(BigDecimal val) {
			return val.negate();
		};
		
		public String getToken() { return "NEGATE";}

	};

	public static final Unary<BigDecimal,BigDecimal> PERCENT = new Unary<BigDecimal,BigDecimal>() {
		private static final long serialVersionUID = 1L;

		@Override
		public BigDecimal eval(BigDecimal val) {
			return val.divide(DEC100, val.scale()+2 , RoundingMode.HALF_UP);
		};
		
		public String getToken() { return "PERCENT";}

	};
	
	public static final Unary<Boolean,Boolean> NOT = new Unary<Boolean,Boolean>() {
		private static final long serialVersionUID = 1L;

		@Override
		public Boolean eval(Boolean val) {
			return (val != null) ? !val : true;
		};
		
		public String getToken() { return "NOT";}

	};
}
