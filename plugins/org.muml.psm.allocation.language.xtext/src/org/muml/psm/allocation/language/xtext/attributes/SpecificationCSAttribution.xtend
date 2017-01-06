package org.muml.psm.allocation.language.xtext.attributes

import org.eclipse.emf.ecore.EObject
import org.eclipse.ocl.pivot.internal.scoping.EnvironmentView
import org.eclipse.ocl.pivot.internal.scoping.ScopeView
import org.eclipse.ocl.xtext.completeocl.attributes.CompleteOCLDocumentCSAttribution
import org.eclipse.ocl.xtext.completeoclcs.ClassifierContextDeclCS

class SpecificationCSAttribution extends CompleteOCLDocumentCSAttribution {
	
	/*@NonNull*/ public static final SpecificationCSAttribution INSTANCE = new SpecificationCSAttribution
	
	override public ScopeView computeLookup(/*@NonNull*/ EObject target, /*@NonNull*/ EnvironmentView environmentView,
		/*@NonNull*/ ScopeView scopeView) {
		val ScopeView outerScopeView = super.computeLookup(target, environmentView, scopeView)
		val EObject child = scopeView.child
		if (!environmentView.hasFinalResult && child instanceof ClassifierContextDeclCS) {
			/*
			 * This is just for convenience: this is probably a lookup for a
			 * package that is transitively reachable from the oclContext's
			 * package (note: the oclcontext's package is usually explicitly
			 * imported). In order to access such a package, an explicit
			 * package import is needed (via the "import" statement). To avoid
			 * this explicit import, we try a lookup in the root packages.
			 */
			environmentView.addRootPackages			
		}
		outerScopeView
	}
}