/*
 * generated by Xtext
 */
package de.uni_paderborn.fujaba.muml.allocation.language.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import de.uni_paderborn.fujaba.muml.allocation.language.ui.internal.AllocationSpecificationActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class AllocationSpecificationExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return AllocationSpecificationActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return AllocationSpecificationActivator.getInstance().getInjector(AllocationSpecificationActivator.DE_UNI_PADERBORN_FUJABA_MUML_ALLOCATION_LANGUAGE_ALLOCATIONSPECIFICATION);
	}
	
}