package org.muml.psm.allocation.algorithm.ocl;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.pivot.evaluation.ModelManager;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.EnvironmentFactory;
import org.muml.psm.allocation.language.as.EvaluableElement;

public class OCLEvaluator {
	
	private static final String nullArgument = "%s must not be null";
	
	/**
	 * Evaluates the given OCL expression in the context of
	 * the specified contextObject.
	 */
	public static Object evaluate(@NonNull ExpressionInOCL expressionInOCL, @NonNull Object contextObject) {
		// this code is mostly taken from org.eclipse.ocl.examples.xtext.console.OCLConsolePage
		EnvironmentFactory environmentFactory = ClassUtil.nonNull(
				PivotUtilInternal.findEnvironmentFactory(expressionInOCL));
		ModelManager modelManager = environmentFactory.createModelManager(contextObject);
		EvaluationEnvironment evaluationEnvironment = environmentFactory
				.createEvaluationEnvironment(expressionInOCL, modelManager);
		Object contextValue = environmentFactory.getIdResolver().boxedValueOf(contextObject);
		evaluationEnvironment.add(expressionInOCL.getOwnedContext(), contextValue);
		EvaluationVisitor evaluationVisitor = environmentFactory
				.createEvaluationVisitor(evaluationEnvironment);
		return evaluationVisitor.visitExpressionInOCL(expressionInOCL);
	}
	
	@Operation(kind=Kind.QUERY)
	public static Object evaluateEvaluableElement(@Nullable EvaluableElement evaluatableElement, @Nullable Object contextObject) {
		if (evaluatableElement == null) {
			throw new IllegalArgumentException(
					String.format(nullArgument, "evaluatableElement"));
		} else if (contextObject == null) {
			throw new IllegalArgumentException(
					String.format(nullArgument, "contextObject"));
		}
		return evaluate(evaluatableElement.getExpression(), contextObject);
	}
	
	// XXX: does not really belong here (introduce a new Conversion class?)
	@Operation(kind=Kind.QUERY)
	public static Integer convertToInteger(@Nullable Object evaluationResult) {
		if (!(evaluationResult instanceof Number)) {
			throw new IllegalArgumentException(
					String.format(nullArgument, "evaluationResult"));
		}
		return ((Number) evaluationResult).intValue();
	}
	
	/** QVTo blackbox method to get system time for performance measurement
	 * @author upohl
	 * @return long current system time in ms
	 * @param void
	 * */
	public static long getCurrentTime()
	{
		return System.currentTimeMillis();
	}
	
}
