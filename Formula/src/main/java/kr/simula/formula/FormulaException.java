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
package kr.simula.formula;

/**
 * 
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public class FormulaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public FormulaException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public FormulaException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public FormulaException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public FormulaException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
