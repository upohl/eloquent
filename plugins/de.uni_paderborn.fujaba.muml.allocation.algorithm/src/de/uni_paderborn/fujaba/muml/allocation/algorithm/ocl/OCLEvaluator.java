package de.uni_paderborn.fujaba.muml.allocation.algorithm.ocl;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.ocl.examples.domain.evaluation.DomainModelManager;
import org.eclipse.ocl.examples.domain.values.SetValue;
import org.eclipse.ocl.examples.domain.values.TupleValue;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.ExpressionInOCL;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitorImpl;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironment;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironmentFactory;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialoclcs.ContextCS;

import de.uni_paderborn.fujaba.muml.allocation.language.cs.EvaluatableElementCS;

public class OCLEvaluator {
	private static final String noMetaModelManager = "cannot find a MetaModelManager for %s";
	
	/**
	 * Evaluates the given OCL expression in the context of
	 * the specified contextObject.
	 */
	@Operation(kind=Kind.QUERY)
	public static Object evaluate(@NonNull ContextCS csExpression, @NonNull Object contextObject) {
		Element element = csExpression.getPivot();
		if (!(element instanceof ExpressionInOCL)) {
			throw new IllegalArgumentException("expected ExpressionInOCL instance; got: " + element);
		}
		return evaluate((ExpressionInOCL) element, contextObject);
	}
	
	/**
	 * Evaluates the given OCL expression in the context of
	 * the specified contextObject.
	 */
	public static Object evaluate(@NonNull ExpressionInOCL expressionInOCL, @NonNull Object contextObject) {
		// code is taken from org.eclipse.ocl.examples.xtext.console.OCLConsolePage
		MetaModelManager metaModelManager = getMetaModelManager(expressionInOCL);
		PivotEnvironmentFactory factory = new PivotEnvironmentFactory(null,
				metaModelManager);
		PivotEnvironment environment = factory.createEnvironment();
		EvaluationEnvironment evaluationEnvironment = factory.createEvaluationEnvironment();
		Object contextValue = metaModelManager.getIdResolver().boxedValueOf(contextObject);
		evaluationEnvironment.add(expressionInOCL.getContextVariable(),
				contextValue);
		DomainModelManager modelManager = evaluationEnvironment.createModelManager(contextObject);
		return new EvaluationVisitorImpl(environment, evaluationEnvironment, modelManager).visit(expressionInOCL);
	}
		
	@NonNull
	private static MetaModelManager getMetaModelManager(EObject object) {
		// we have to _reuse_ the metamodel manager - otherwise subsequent OCL
		// evaluations fail
		MetaModelManager metaModelManager = PivotUtil.findMetaModelManager(object);
		if (metaModelManager == null) {
			throw new IllegalStateException(String.format(noMetaModelManager, object));
		}
		return metaModelManager;
	}
	
	@Operation(kind=Kind.QUERY)
	// List corresponds to Sequence, LinkedHashSet to OrderedSet
	public static List<TupleValue> evaluateEvaluatableElementCS(@NonNull EvaluatableElementCS evaluatableElementCS, @NonNull Object contextObject) {
		System.out.println(evaluatableElementCS);
		SetValue result = (SetValue) evaluate(evaluatableElementCS.getExpression(), contextObject);
		// unboxing does not work because all elements are unboxed
		// in an incompatible way (that is the unboxed elements do not have type TupleValue
		// anymore)
		/* IdResolver idResolver = TypesUtil.getMetaModelManager((LocationConstraintCS) lc)
				.getIdResolver();
		// XXX: unchecked
		return (List<TupleValue>) idResolver.unboxedValueOf(result);*/
		return TupleAccessor.createTupleValueList(result);
	}
	
}
