package de.uni_paderborn.fujaba.muml.allocation.language.cs2as

import de.uni_paderborn.fujaba.muml.allocation.language.cs.util.LanguageSpecificationCSVisitor
import de.uni_paderborn.fujaba.muml.allocation.language.visitor.LanguageSpecificationCSContainmentVisitor
import de.uni_paderborn.fujaba.muml.allocation.language.visitor.LanguageSpecificationCSLeft2RightVisitor
import de.uni_paderborn.fujaba.muml.allocation.language.visitor.LanguageSpecificationCSPreOrderVisitor
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

class SpecificationCS2Pivot extends CompleteOCLCS2AS {
	private EClass contextClass
	
	new(EnvironmentFactoryInternal environmentFactory, BaseCSResource csResource,
		ASResource asResource, EClass contextClass) {
		super(environmentFactory, csResource, asResource)
		this.contextClass = contextClass
	}
	
	@NonNull
	override protected LanguageSpecificationCSVisitor<Continuation<?>> createContainmentVisitor(@NonNull CS2ASConversion converter) {
		new LanguageSpecificationCSContainmentVisitor(converter);
	}

	@NonNull
	override protected LanguageSpecificationCSVisitor<Element> createLeft2RightVisitor(@NonNull CS2ASConversion converter) {
		new LanguageSpecificationCSLeft2RightVisitor(converter);
	}

	@NonNull
	override protected LanguageSpecificationCSVisitor<Continuation<?>> createPostOrderVisitor(@NonNull CS2ASConversion converter) {
		// use the customized post order visitor
		new SpecificationCSPostOrderVisitor(converter);
	}

	@NonNull
	override protected LanguageSpecificationCSVisitor<Continuation<?>> createPreOrderVisitor(@NonNull CS2ASConversion converter) {
		new LanguageSpecificationCSPreOrderVisitor(converter);
	}
	
	@NonNull
	override protected CS2ASConversion createConversion(@NonNull IDiagnosticConsumer diagnosticsConsumer, @NonNull BaseCSResource csResource) {
		new SpecificationCS2PivotConversion(this, diagnosticsConsumer, contextClass)
	}
	
}