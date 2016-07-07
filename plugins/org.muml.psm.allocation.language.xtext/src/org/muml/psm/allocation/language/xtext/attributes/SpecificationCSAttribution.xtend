package org.muml.psm.allocation.language.xtext.attributes

import org.eclipse.emf.ecore.EObject
import org.eclipse.jdt.annotation.NonNull
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
			/* This is _most likely_ a lookup for the oclcontext:: package or a package
			 * that is transitively "reachable" from the oclcontext:: package.
			 * Since we do not require an explicit metamodel/package import via the "import"
			 * statement for these packages, the super.computeLookup call did not supply the
			 * correct package to the environmentView. So we try all root packages that are
			 * known to the environmentView (the oclcontext:: package and its transitively
			 * "reachable" packages are known packages, because they were "registered"
			 * during the MetaModelManager's instantiation (see SpecificationCSResource)). 
			 */
			environmentView.addRootPackages			
		}
		outerScopeView
	}
}