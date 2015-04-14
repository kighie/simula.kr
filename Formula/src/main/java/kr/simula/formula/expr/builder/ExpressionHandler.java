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

import kr.simula.formula.core.Block;
import kr.simula.formula.core.builder.AbstractFormulaHandler;
import kr.simula.formula.core.builder.BuildException;
import kr.simula.formula.core.builder.RootBuildContext;
import kr.simula.formula.core.factory.helper.BinaryOperatorHelper;
import kr.simula.formula.core.factory.helper.BlockHelper;
import kr.simula.formula.core.factory.helper.DeclarationHelper;
import kr.simula.formula.core.factory.helper.FunctionCallHelper;
import kr.simula.formula.core.factory.helper.LambdaHelper;
import kr.simula.formula.core.factory.helper.LiteralHelper;
import kr.simula.formula.core.factory.helper.MethodCallHelper;
import kr.simula.formula.core.factory.helper.RefHelper;
import kr.simula.formula.core.factory.helper.StatementHelper;
import kr.simula.formula.core.factory.helper.TypeHelper;
import kr.simula.formula.core.factory.helper.UnaryOperatorHelper;
import kr.simula.formula.expr.ExprTokens;

/**
 * @author kighie@gmail.com
 *
 */
public class ExpressionHandler extends AbstractFormulaHandler implements ExprTokens {
	

	/**
	 * @param rootContext
	 * @param blockHelper
	 * @param literalHelper
	 * @param refHelper
	 * @param typeHelper
	 * @param binaryOperatorHelper
	 * @param unaryOperatorHelper
	 * @param functionCallHelper
	 * @param methodCallHelper
	 * @param statementHelper
	 * @param declarationHelper
	 */
	public ExpressionHandler(RootBuildContext rootContext,
			BlockHelper blockHelper, LiteralHelper literalHelper,
			RefHelper refHelper, TypeHelper typeHelper,
			BinaryOperatorHelper binaryOperatorHelper,
			UnaryOperatorHelper unaryOperatorHelper,
			FunctionCallHelper functionCallHelper,
			MethodCallHelper methodCallHelper, StatementHelper statementHelper,
			DeclarationHelper declarationHelper,
			LambdaHelper lambdaHelper) {
		super(rootContext, blockHelper, literalHelper, refHelper, typeHelper,
				binaryOperatorHelper, unaryOperatorHelper, functionCallHelper,
				methodCallHelper, statementHelper, declarationHelper, lambdaHelper);
	}


	@Override
	public Block block(String token){
		throw new BuildException("New block is not supported.");
	}
	
	@Override
	public void endBlock() {
		throw new BuildException("End block is not supported.");
	}
	
}
