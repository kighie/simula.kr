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

import java.math.BigDecimal;

import kr.simula.formula.core.Gettable;
import kr.simula.formula.core.Operator.Binary;

/**
 * <pre></pre>
 * @author kighie@gmail.com
 * @since 1.0
 */
public class DecimalBinaryOperatorGettable extends BinaryOperatorGettable<BigDecimal, BigDecimal, BigDecimal> {


	/**
	 * 
	 */
	private static final long serialVersionUID = 3750742142108103042L;

	/**
	 * @param operator
	 * @param operand1
	 * @param operand2
	 */
	public DecimalBinaryOperatorGettable(
			Binary<BigDecimal, BigDecimal, BigDecimal> operator,
			Gettable<BigDecimal> operand1,
			Gettable<BigDecimal> operand2) {
		super(operator, operand1, operand2);
	}

	@Override
	public Class<BigDecimal> type() {
		return BigDecimal.class;
	}

//	@Override
//	public ValueType valueType() {
//		return ValueType.NUMERIC;
//	}

}
