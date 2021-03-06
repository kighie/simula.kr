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
package kr.simula.formula.core.builder;

import kr.simula.formula.core.Node;
import kr.simula.formula.core.antlr.ParsingErrorAdapter;
import kr.simula.formula.core.builder.helper.ArrayHelper;
import kr.simula.formula.core.builder.helper.BinaryOperatorHelper;
import kr.simula.formula.core.builder.helper.BlockHelper;
import kr.simula.formula.core.builder.helper.DeclarationHelper;
import kr.simula.formula.core.builder.helper.FunctionCallHelper;
import kr.simula.formula.core.builder.helper.ImportHelper;
import kr.simula.formula.core.builder.helper.LambdaHelper;
import kr.simula.formula.core.builder.helper.LiteralHelper;
import kr.simula.formula.core.builder.helper.MapHelper;
import kr.simula.formula.core.builder.helper.MethodCallHelper;
import kr.simula.formula.core.builder.helper.PrototypeHelper;
import kr.simula.formula.core.builder.helper.RefHelper;
import kr.simula.formula.core.builder.helper.StatementHelper;
import kr.simula.formula.core.builder.helper.TypeHelper;
import kr.simula.formula.core.builder.helper.UnaryOperatorHelper;
import kr.simula.formula.core.function.BuiltInFunctionRegistry;

/**
 * <pre>
 * </pre>
 * @author Ikchan Kwon
 *
 */
public abstract class AbstractFormulaBuilder<N extends Node> 
	implements FormulaBuilder<N>, FormulaHandlerFactory {
	
	
	private BuiltInFunctionRegistry builtinFunctionRegistry;
	
	private BlockHelper blockHelper;
	private LiteralHelper literalHelper;
	private RefHelper refHelper;
	private BinaryOperatorHelper binaryOperatorHelper;
	private UnaryOperatorHelper unaryOperatorHelper;
	private FunctionCallHelper functionCallHelper;
	private MethodCallHelper methodCallHelper;
	private LambdaHelper lambdaHelper;
	private ArrayHelper arrayHelper;
	private MapHelper mapHelper;
	private StatementHelper statementHelper;
	private DeclarationHelper declarationHelper;
	private TypeHelper typeHelper;
	private ImportHelper importHelper;
	private PrototypeHelper prototypeHelper;
	
	
	private boolean initialized;
	
	
	protected final ParsingErrorAdapter errorAdapter = new ParsingErrorAdapter();
	

	public boolean addErrorListener(BuildErrorListener e) {
		return errorAdapter.addListener(e);
	}

	public boolean removeErrorListener(BuildErrorListener o) {
		return errorAdapter.removeListener(o);
	}

	public synchronized void initialize(){
		if(initialized){
			return;
		}
		
		this.builtinFunctionRegistry = initBuiltinFunctionRegistry();
		this.literalHelper = initLiteralHelper();
		this.refHelper = initRefHelper();
		this.binaryOperatorHelper = initBinaryOperatorHelper();
		this.unaryOperatorHelper = initUnaryOperatorHelper();
		this.functionCallHelper = initFunctionCallHelper(builtinFunctionRegistry);
		this.methodCallHelper = initMethodCallHelper();
		this.lambdaHelper = initLambdaHelper();
		this.arrayHelper = initArrayHelper();
		this.mapHelper = initMapHelper();

		this.blockHelper = initBlockHelper();
		this.statementHelper = initStatementHelper();
		this.declarationHelper = initDeclarationHelper();
		this.typeHelper = initTypeHelper();
		
		this.importHelper = initImportHelper();
		
		this.prototypeHelper = initPrototypeHelper();
		initialized = true;
	}
	
	protected BuiltInFunctionRegistry initBuiltinFunctionRegistry() {
		BuiltInFunctionRegistry registry = new BuiltInFunctionRegistry();
		registry.initialize();
		initBuiltinFunctions(registry);
		extendBuiltinFunction(registry);
		return registry;
	}

	protected void initBuiltinFunctions(BuiltInFunctionRegistry registry) {
		registry.loadAndRegisterFunctions(this.getClass().getClassLoader(), "kr.simula.formula.core.function.builtin");
	}
	
	protected void extendBuiltinFunction(BuiltInFunctionRegistry registry) {
	}
	
	
	/**<pre>
	 * </pre>
	 * @return
	 */
	protected ImportHelper initImportHelper() {
		return new ImportHelper();
	}

	protected LiteralHelper initLiteralHelper() {
		return new LiteralHelper();
	}

	protected RefHelper initRefHelper() {
		return new RefHelper();
	}

	protected BinaryOperatorHelper initBinaryOperatorHelper() {
		return new BinaryOperatorHelper();
	}

	protected UnaryOperatorHelper initUnaryOperatorHelper() {
		return  new UnaryOperatorHelper();
	}

	protected FunctionCallHelper initFunctionCallHelper(BuiltInFunctionRegistry globalFunctionRegistry) {
		FunctionCallHelper callHelper = new FunctionCallHelper();
		callHelper.setFunctionRegistry(globalFunctionRegistry);
		return callHelper;
	}

	protected MethodCallHelper initMethodCallHelper() {
		return new MethodCallHelper();
	}

	protected LambdaHelper initLambdaHelper() {
		return new LambdaHelper();
	}

	protected ArrayHelper initArrayHelper() {
		return new ArrayHelper();
	}

	protected MapHelper initMapHelper() {
		return new MapHelper();
	}

	protected PrototypeHelper initPrototypeHelper() {
		return null;
	}
	

	protected BlockHelper initBlockHelper() {
		return null;
	}

	protected StatementHelper initStatementHelper() {
		return null;
	}

	protected DeclarationHelper initDeclarationHelper() {
		return null;
	}

	protected TypeHelper initTypeHelper() {
		return null;
	}
	
	@Override
	public RootBuildContext createContext() {
		RootBuildContext context = new RootBuildContext();
		context.setFunctionRegistry(builtinFunctionRegistry);
		
		return context;
	}
	
	@Override
	public BuildHandler newHandler() {
		return newHandler(createContext());
	}
	
	@Override
	public BuildHandler newHandler(RootBuildContext rootContext) {
		return newHandler(rootContext, 
				importHelper, blockHelper, literalHelper, refHelper, 
				typeHelper, binaryOperatorHelper, unaryOperatorHelper, functionCallHelper, 
				methodCallHelper, statementHelper, declarationHelper, arrayHelper, mapHelper, lambdaHelper,
				prototypeHelper);
	}

	protected abstract BuildHandler newHandler(RootBuildContext rootContext,
			ImportHelper importHelper, BlockHelper blockHelper,
			LiteralHelper literalHelper, RefHelper refHelper,
			TypeHelper typeHelper,
			BinaryOperatorHelper binaryOperatorHelper,
			UnaryOperatorHelper unaryOperatorHelper,
			FunctionCallHelper functionCallHelper, MethodCallHelper methodCallHelper,
			StatementHelper statementHelper, DeclarationHelper declarationHelper,
			ArrayHelper arrayHelper, MapHelper mapHelper, LambdaHelper lambdaHelper, 
			PrototypeHelper prototypeHelper);
	
	
	
	@Override
	public N build(String expression) {
		BuildHandler handler = newHandler();
		return build(handler, expression);
	}
	
	@Override
	public N build(FormulaSource source) {
		BuildHandler handler = newHandler();
		return build(handler, source);
	}

	@Override
	public N build(FormulaSource source, RootBuildContext rootContext) {
		BuildHandler handler = newHandler(rootContext);
		return build(handler, source);
	}

	protected abstract N build(BuildHandler handler, String expression);
	
	protected abstract N build(BuildHandler handler, FormulaSource source);
	
	
}
