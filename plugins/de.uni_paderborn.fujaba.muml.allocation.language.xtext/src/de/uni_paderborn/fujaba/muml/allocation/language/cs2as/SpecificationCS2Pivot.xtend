package de.uni_paderborn.fujaba.muml.allocation.language.cs2as

import de.uni_paderborn.fujaba.muml.allocation.language.cs.util.LanguageSpecificationCSVisitor
import de.uni_paderborn.fujaba.muml.allocation.language.visitor.LanguageSpecificationCSContainmentVisitor
import de.uni_paderborn.fujaba.muml.allocation.language.visitor.LanguageSpecificationCSLeft2RightVisitor
import de.uni_paderborn.fujaba.muml.allocation.language.visitor.LanguageSpecificationCSPreOrderVisitor
import java.util.Collection
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.jdt.annotation.NonNull
import org.eclipse.ocl.examples.pivot.Element
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager
import org.eclipse.ocl.examples.pivot.resource.ASResource
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2PivotConversion
import org.eclipse.ocl.examples.xtext.base.cs2as.Continuation
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCSResource
import org.eclipse.ocl.examples.xtext.essentialocl.cs2as.EssentialOCLCS2Pivot
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer

class SpecificationCS2Pivot extends EssentialOCLCS2Pivot {
	private EClass contextClass
	
	new(Map<? extends Resource, ? extends ASResource> cs2asResourceMap, MetaModelManager metaModelManager,
		EClass contextClass) {
		super(cs2asResourceMap, metaModelManager)
		this.contextClass = contextClass
	}
	
	@NonNull
	override protected LanguageSpecificationCSVisitor<Continuation<?>> createContainmentVisitor(@NonNull CS2PivotConversion converter) {
		new LanguageSpecificationCSContainmentVisitor(converter);
	}

	@NonNull
	override protected LanguageSpecificationCSVisitor<Element> createLeft2RightVisitor(@NonNull CS2PivotConversion converter) {
		new LanguageSpecificationCSLeft2RightVisitor(converter);
	}

	@NonNull
	override protected LanguageSpecificationCSVisitor<Continuation<?>> createPostOrderVisitor(@NonNull CS2PivotConversion converter) {
		// use the customized post order visitor
		new SpecificationCSPostOrderVisitor(converter);
	}

	@NonNull
	override protected LanguageSpecificationCSVisitor<Continuation<?>> createPreOrderVisitor(@NonNull CS2PivotConversion converter) {
		new LanguageSpecificationCSPreOrderVisitor(converter);
	}
	
	@NonNull
	override protected CS2PivotConversion createConversion(@NonNull IDiagnosticConsumer diagnosticsConsumer, @NonNull Collection<? extends BaseCSResource> csResources) {
		new SpecificationCS2PivotConversion(this, diagnosticsConsumer, csResources, contextClass)
	}
	
}