package org.muml.psm.allocation.language.xtext.resource

import org.eclipse.emf.ecore.EClass
import org.eclipse.jdt.annotation.NonNull
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal
import org.eclipse.ocl.pivot.resource.ASResource
import org.eclipse.ocl.xtext.base.cs2as.CS2AS
import org.eclipse.ocl.xtext.completeocl.utilities.CompleteOCLCSResource
import org.muml.psm.allocation.language.oclcontext.OclcontextPackage
import org.muml.psm.allocation.language.xtext.cs2as.SpecificationCS2Pivot
import org.muml.psm.allocation.language.xtext.typing.TypesUtil

class SpecificationCSResource extends CompleteOCLCSResource {
	
	private static final EClass contextClass = OclcontextPackage.Literals.OCL_CONTEXT
	
	/*@NonNull*/ override CS2AS createCS2AS(/*@NonNull*/ EnvironmentFactoryInternal environmentFactory,
		/*@NonNull*/ ASResource asResource) {
		// General remark: we could also install a ParserContext - this would avoid our
		// custom SpecificationCSPostOrderVisitor (but the current is more flexible, because
		// we could use different context classes (not sure if we ever need this, though))
		// make our contextClass known
		TypesUtil.getType(environmentFactory, contextClass)
		new SpecificationCS2Pivot(environmentFactory, this, asResource, contextClass)
	}

}