package org.muml.psm.allocation.algorithm.ocl;

import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.pivot.evaluation.EvaluationVisitor;
import org.eclipse.ocl.pivot.evaluation.ModelManager;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.internal.utilities.OCLInternal;
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;
import org.eclipse.ocl.pivot.utilities.EnvironmentFactory;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import org.muml.psm.allocation.language.as.EvaluatableElement;

public class OCLEvaluator {
	// singleton - lazily initialized
	private static OCLInternal nullOCL = null;
	
	/**
	 * Evaluates the given OCL expression in the context of
	 * the specified contextObject.
	 * Implicit assumption: all expressionInOCL objects, which are passed to this method, belong to the same resource
	 */
	public static Object evaluate(@NonNull ExpressionInOCL expressionInOCL, @NonNull Object contextObject) {
		// this code is mostly taken from org.eclipse.ocl.examples.xtext.console.OCLConsolePage
		EnvironmentFactory environmentFactory = getEnvironmentFactory(expressionInOCL);
		ModelManager modelManager = environmentFactory.createModelManager(contextObject);
		EvaluationEnvironment evaluationEnvironment = environmentFactory
				.createEvaluationEnvironment(expressionInOCL, modelManager);
		Object contextValue = environmentFactory.getIdResolver().boxedValueOf(contextObject);
		evaluationEnvironment.add(expressionInOCL.getOwnedContext(), contextValue);
		EvaluationVisitor evaluationVisitor = environmentFactory
				.createEvaluationVisitor(evaluationEnvironment);
		return evaluationVisitor.visitExpressionInOCL(expressionInOCL);
	}
	
	private static EnvironmentFactory getEnvironmentFactory(ExpressionInOCL expressionInOCL) {
		// we have to reuse the envFactory that was used when parsing the
		// *.allocation_specification file - otherwise some types (e.g. during
		// the evaluation) are missing;
		// the whole singleton approach only works if all expressionInOCL arguments that are
		// passed to this method belong to the same resource (see also the implicit assumption
		// of the evaluate method)
		if (nullOCL == null) {
			EnvironmentFactory envFactory = PivotUtilInternal.findEnvironmentFactory(expressionInOCL);
			nullOCL = OCLInternal.newInstance((EnvironmentFactoryInternal) envFactory);
		}
		return nullOCL.getEnvironmentFactory();
	}
	
	@Operation(kind=Kind.QUERY)
	// List corresponds to Sequence, LinkedHashSet to OrderedSet
	public static List<TupleValue> evaluateEvaluatableElement(@NonNull EvaluatableElement evaluatableElement, @NonNull Object contextObject) {
		System.out.println(evaluatableElement);
		SetValue result = (SetValue) evaluate(evaluatableElement.getExpression(), contextObject);
		// unboxing does not work because all elements are unboxed
		// in an incompatible way (that is the unboxed elements do not have type TupleValue
		// anymore)
		/* IdResolver idResolver = TypesUtil.getMetaModelManager((LocationConstraintCS) lc)
				.getIdResolver();
		// XXX: unchecked
		return (List<TupleValue>) idResolver.unboxedValueOf(result);*/
		return TupleAccessor.createTupleValueList(result);
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
