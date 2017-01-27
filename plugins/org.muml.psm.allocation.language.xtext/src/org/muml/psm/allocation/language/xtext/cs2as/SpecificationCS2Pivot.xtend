package org.muml.psm.allocation.language.xtext.cs2as

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import org.eclipse.ocl.pivot.Element
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal
import org.eclipse.ocl.pivot.resource.ASResource
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion
import org.eclipse.ocl.xtext.base.cs2as.Continuation
import org.eclipse.ocl.xtext.base.utilities.BaseCSResource
import org.eclipse.ocl.xtext.completeocl.cs2as.CompleteOCLCS2AS
import org.eclipse.ocl.xtext.oclstdlibcs.JavaClassCS
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer
import org.muml.psm.allocation.language.cs.util.LanguageSpecificationCSVisitor
import org.muml.psm.allocation.language.xtext.visitor.LanguageSpecificationCSLeft2RightVisitor
import org.muml.psm.allocation.language.xtext.visitor.LanguageSpecificationCSPreOrderVisitor

class SpecificationCS2Pivot extends CompleteOCLCS2AS {
	
	protected Resource javaClassCSResource
	
	new(EnvironmentFactoryInternal environmentFactory, BaseCSResource csResource,
		ASResource asResource) {
		super(environmentFactory, csResource, asResource)
		javaClassCSResource = new ResourceImpl()
	}
	
	/*@NonNull*/
	override protected LanguageSpecificationCSVisitor<Continuation<?>> createContainmentVisitor(/*@NonNull*/ CS2ASConversion converter) {
		new SpecificationCSContainmentVisitor(converter);
	}

	/*@NonNull*/
	override protected LanguageSpecificationCSVisitor<Element> createLeft2RightVisitor(/*@NonNull*/ CS2ASConversion converter) {
		new LanguageSpecificationCSLeft2RightVisitor(converter);
	}

	/*@NonNull*/
	override protected LanguageSpecificationCSVisitor<Continuation<?>> createPostOrderVisitor(/*@NonNull*/ CS2ASConversion converter) {
		// use the customized post order visitor
		new SpecificationCSPostOrderVisitor(converter);
	}

	/*@NonNull*/
	override protected LanguageSpecificationCSVisitor<Continuation<?>> createPreOrderVisitor(/*@NonNull*/ CS2ASConversion converter) {
		new LanguageSpecificationCSPreOrderVisitor(converter);
	}
	
	/*@NonNull*/
	override protected CS2ASConversion createConversion(/*@NonNull*/ IDiagnosticConsumer diagnosticsConsumer, /*@NonNull*/ BaseCSResource csResource) {
		new SpecificationCS2PivotConversion(this, diagnosticsConsumer)
	}
	
	// make it synchronized, because we modify the csResource (super.update
	// is also synchronized)
	override synchronized void update(IDiagnosticConsumer diagnosticsConsumer) {
		// fixup the resource for all JavaClassCS instances: at the end of the
		// CS2AS conversion all JavaClassCS instances are moved into this
		// resource (via JavaClassScope.installContents). A subsequent CS2AS.update,
		// which calls CS2ASConversion.update, will fail because during the
		// containment visitor run a CCE is thrown (this is expected, because
		// the JavaClassCS belongs to the oclstdlib metamodel, which has a different
		// concrete visitor type (OCLstdlibCSVisitor) (which is, of course, not a
		// a supertype of LanguageSpecificationCSContainmentVisitor)). However,
		// we don't need a visitor run for JavaClassCS instances => move them
		// into a separate resource.
		// Note: the JavaClassCS instances should be contained in a resource,
		// because otherwise a potential validation would fail ("dangling reference").
		javaClassCSResource.contents.clear
		for (var int i = csResource.getContents.size - 1; i >= 0; i--) {
			val EObject object = csResource.getContents.get(i)
			if (object instanceof JavaClassCS) {
				// this directly removes the object from this resource
				javaClassCSResource.contents.add(object)
			}
		}
		super.update(diagnosticsConsumer)
	}
	
}