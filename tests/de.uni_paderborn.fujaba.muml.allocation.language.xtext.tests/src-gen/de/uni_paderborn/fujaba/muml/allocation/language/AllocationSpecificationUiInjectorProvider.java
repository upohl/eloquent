/*
* generated by Xtext
*/
package de.uni_paderborn.fujaba.muml.allocation.language;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class AllocationSpecificationUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return de.uni_paderborn.fujaba.muml.allocation.language.ui.internal.AllocationSpecificationActivator.getInstance().getInjector("de.uni_paderborn.fujaba.muml.allocation.language.AllocationSpecification");
	}
	
}