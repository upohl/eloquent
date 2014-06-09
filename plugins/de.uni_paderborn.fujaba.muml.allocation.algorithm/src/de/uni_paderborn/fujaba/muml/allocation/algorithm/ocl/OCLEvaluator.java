package de.uni_paderborn.fujaba.muml.allocation.algorithm.ocl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.domain.evaluation.DomainModelManager;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.ExpressionInOCL;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationEnvironment;
import org.eclipse.ocl.examples.pivot.evaluation.EvaluationVisitorImpl;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironment;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironmentFactory;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialoclcs.ContextCS;

public class OCLEvaluator {
	
	/**
	 * Evaluates the given OCL expression in the context of
	 * the specified contextObject.
	 */
	public static Object evaluate(@NonNull ContextCS csExpression, @NonNull EObject contextObject) {
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
	public static Object evaluate(@NonNull ExpressionInOCL expressionInOCL, @NonNull EObject contextObject) {
		// code is taken from org.eclipse.ocl.examples.xtext.console.OCLConsolePage
		MetaModelManager metaModelManager = getMetaModelManager();
		PivotEnvironmentFactory factory = new PivotEnvironmentFactory(null,
				metaModelManager);
		PivotEnvironment environment = factory.createEnvironment();
		EvaluationEnvironment evaluationEnvironment = factory.createEvaluationEnvironment();
		// contextObject is already a boxed object, thus there is no
		// need to compute the boxed value
		evaluationEnvironment.add(expressionInOCL.getContextVariable(),
				contextObject);
		DomainModelManager modelManager = evaluationEnvironment.createModelManager(contextObject);
		return new EvaluationVisitorImpl(environment, evaluationEnvironment, modelManager).visit(expressionInOCL);
	}
		
	@NonNull
	private static MetaModelManager getMetaModelManager() {
		// investigate if it makes sense to reuse a metamodelmanager
		// via PivotUtil.findMetaModelManager(...)
		return new MetaModelManager();
	}
}
