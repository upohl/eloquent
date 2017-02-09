package org.muml.psm.allocation.language.xtext.cs2as

import java.util.Collection
import org.eclipse.ocl.pivot.utilities.PivotUtil
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion
import org.eclipse.ocl.xtext.base.cs2as.Continuation
import org.muml.psm.allocation.language.^as.Specification
import org.muml.psm.allocation.language.cs.SpecificationCS
import org.muml.psm.allocation.language.xtext.provider.LazyNameProvider
import org.muml.psm.allocation.language.xtext.provider.LazyStorageProvider
import org.muml.psm.allocation.language.xtext.visitor.LanguageSpecificationCSContainmentVisitor

class SpecificationCSContainmentVisitor extends LanguageSpecificationCSContainmentVisitor {

	new(CS2ASConversion context) {
		super(context)
	}
	
	override def Continuation<?> visitSpecificationCS(SpecificationCS csElement) {
		val Continuation<?> continuation = super.visitSpecificationCS(csElement)
		val Specification specification = PivotUtil.getPivot(typeof(Specification), csElement)
		val Collection<ClassLoader> classLoaders = this.context.getEnvironmentFactory()
			.getMetamodelManager().getImplementationManager().getClassLoaders()
		if (csElement.nameProviderImplementationClass != null) {
			specification.nameProvider = new LazyNameProvider(
				csElement.nameProviderImplementationClass.implementation.name,
				classLoaders
			)
		}
		if (csElement.storageProviderImplementationClass != null) {
			specification.storageProvider = new LazyStorageProvider(
				csElement.storageProviderImplementationClass.implementation.name,
				classLoaders
			)
		}
		continuation
	}
	
}