package org.muml.psm.allocation.language.xtext.cs2as

import java.util.Collections
import java.util.List
import org.eclipse.jdt.annotation.NonNull
import org.eclipse.ocl.pivot.ExpressionInOCL
import org.eclipse.ocl.pivot.utilities.PivotUtil
import org.eclipse.ocl.xtext.base.cs2as.BasicContinuation
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion
import org.eclipse.ocl.xtext.base.cs2as.Continuation
import org.eclipse.ocl.xtext.base.cs2as.Dependency
import org.eclipse.ocl.xtext.base.cs2as.SingleContinuation
import org.muml.psm.allocation.language.cs.ConstraintCS
import org.muml.psm.allocation.language.cs.EvaluatableElementCS
import org.muml.psm.allocation.language.cs.QoSDimensionCS
import org.muml.psm.allocation.language.xtext.visitor.LanguageSpecificationCSPostOrderVisitor

class SpecificationCSPostOrderVisitor extends LanguageSpecificationCSPostOrderVisitor {
	
	new(CS2ASConversion context) {
		super(context)
	}
	
	protected static class PreContextCSCompletion extends SingleContinuation<EvaluatableElementCS> {
		private static final String MISSING_ContextCSCompletion = "Expected an instance of type ContextCSCompletion in %s"
		
		new(CS2ASConversion context,	EvaluatableElementCS csElement) {
			super(context, null, null, csElement, Collections.<Dependency>emptyList)
		}

		override public BasicContinuation<?> execute() {
			/* Before the ContextCSCompletion (returned by visitContextCS) can be executed, we
			 * have to refresh the context variable first.
			 */
			val ExpressionInOCL expressionInOCL = PivotUtil.getPivot(
				typeof(ExpressionInOCL),
				csElement.getExpression()
			)
			context.refreshContextVariable(expressionInOCL)
			null
		}
		
		override public void addTo(@NonNull List<BasicContinuation<?>> simpleContinuations) {
			val BasicContinuation<?> elm = simpleContinuations.findFirst[it instanceof ContextCSCompletion]
			if (elm == null) {
				// should never happen, because visitContextCS is supposed to return
				// a ContextCSCompletion in this situation
				throw new IllegalStateException(
					String.format(MISSING_ContextCSCompletion,simpleContinuations)
				)
			}
			// we have to be executed _before_ the ContextCSCompletion
			simpleContinuations.add(simpleContinuations.indexOf(elm), this)
		}
	}
	
	override public Continuation<?> visitEvaluatableElementCS(@NonNull EvaluatableElementCS csElement) {
		new PreContextCSCompletion(context, csElement)
	}
	
	override public Continuation<?> visitConstraintCS(@NonNull ConstraintCS csElement) {
		// this should not return a Continuation (it should
		// end up with a call to visitNamedElement)
		super.visitConstraintCS(csElement)
		// no idea why xtend insists on this explicit type cast
		// (even if we omit it, the generated java code is correct)
		visitEvaluatableElementCS(csElement as EvaluatableElementCS)		
	}
	
	override public Continuation<?> visitQoSDimensionCS(@NonNull QoSDimensionCS csElement) {
		// this should not return a Continuation (it should
		// end up with a call to visitNamedElement)
		super.visitQoSDimensionCS(csElement)
		visitEvaluatableElementCS(csElement as EvaluatableElementCS)
	}
	
}