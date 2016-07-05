package org.muml.psm.allocation.language.xtext.cs2as

import org.eclipse.emf.ecore.EClass
import org.eclipse.jdt.annotation.NonNull
import org.eclipse.ocl.pivot.Element
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal
import org.eclipse.ocl.pivot.resource.ASResource
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion
import org.eclipse.ocl.xtext.base.cs2as.Continuation
import org.eclipse.ocl.xtext.base.utilities.BaseCSResource
import org.eclipse.ocl.xtext.completeocl.cs2as.CompleteOCLCS2AS
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer
import org.muml.psm.allocation.language.cs.util.LanguageSpecificationCSVisitor
import org.muml.psm.allocation.language.xtext.visitor.LanguageSpecificationCSContainmentVisitor
import org.muml.psm.allocation.language.xtext.visitor.LanguageSpecificationCSLeft2RightVisitor
import org.muml.psm.allocation.language.xtext.visitor.LanguageSpecificationCSPreOrderVisitor

class SpecificationCS2Pivot extends CompleteOCLCS2AS {
	private EClass contextClass
	
	new(EnvironmentFactoryInternal environmentFactory, BaseCSResource csResource,
		ASResource asResource, EClass contextClass) {
		super(environmentFactory, csResource, asResource)
		this.contextClass = contextClass
	}
	
	
	override  protected  LanguageSpecificationCSVisitor<Continuation<?>> createContainmentVisitor( CS2ASConversion  converter) {
		new LanguageSpecificationCSContainmentVisitor(converter);
	}

	override protected LanguageSpecificationCSVisitor<Element> createLeft2RightVisitor( CS2ASConversion converter) {
		new LanguageSpecificationCSLeft2RightVisitor(converter);
	}

	
	override protected LanguageSpecificationCSVisitor<Continuation<?>> createPostOrderVisitor( CS2ASConversion converter) {
		// use the customized post order visitor
		new SpecificationCSPostOrderVisitor(converter);
	}

	
	override protected LanguageSpecificationCSVisitor<Continuation<?>> createPreOrderVisitor( CS2ASConversion converter) {
		new LanguageSpecificationCSPreOrderVisitor(converter);
	}
	
	
	override protected CS2ASConversion createConversion( IDiagnosticConsumer diagnosticsConsumer,  BaseCSResource csResource) {
		new SpecificationCS2PivotConversion(this, diagnosticsConsumer, contextClass)
	}
	
}