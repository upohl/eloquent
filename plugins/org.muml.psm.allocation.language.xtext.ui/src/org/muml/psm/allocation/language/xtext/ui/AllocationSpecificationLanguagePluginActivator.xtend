package org.muml.psm.allocation.language.xtext.ui

import org.muml.psm.allocation.language.xtext.scoping.AllocationSpecificationLanguageScopeProvider
import org.muml.psm.allocation.language.xtext.ui.internal.AllocationSpecificationLanguageActivator
import org.osgi.framework.BundleContext

class AllocationSpecificationLanguagePluginActivator extends AllocationSpecificationLanguageActivator {
	
	override public void start(BundleContext context) throws Exception {
		super.start(context)
		// initialize scoping
		AllocationSpecificationLanguageScopeProvider.init
	}
	
}