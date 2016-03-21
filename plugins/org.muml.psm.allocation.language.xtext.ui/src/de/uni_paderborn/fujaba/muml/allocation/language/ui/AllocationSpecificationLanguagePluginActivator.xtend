package de.uni_paderborn.fujaba.muml.allocation.language.ui

import de.uni_paderborn.fujaba.muml.allocation.language.ui.internal.AllocationSpecificationLanguageActivator
import org.osgi.framework.BundleContext
import de.uni_paderborn.fujaba.muml.allocation.language.scoping.AllocationSpecificationLanguageScopeProvider

class AllocationSpecificationLanguagePluginActivator extends AllocationSpecificationLanguageActivator {
	
	override public void start(BundleContext context) throws Exception {
		super.start(context)
		// initialize scoping
		AllocationSpecificationLanguageScopeProvider.init
	}
	
}