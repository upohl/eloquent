package de.uni_paderborn.fujaba.muml.allocation.language.build

import org.eclipse.ocl.examples.build.fragments.EssentialOCLFragment
import org.eclipse.xtext.Grammar
import java.util.Set
import org.eclipse.xtext.generator.Binding
import org.eclipse.xtext.generator.BindFactory
import org.eclipse.xtext.generator.BindKey
import org.eclipse.xtext.resource.XtextResource
import java.util.HashSet
import de.uni_paderborn.fujaba.muml.allocation.language.resource.SpecificationCSResource

class GuiceBindingFragment extends EssentialOCLFragment {
	override public Set<Binding> getGuiceBindingsRt(Grammar grammar) {
		// use the SpecificationCS specific Resource
		val Set<Binding> bindings = super.getGuiceBindingsRt(grammar)
		val Set<Binding> toRemove = new HashSet<Binding>()
		val BindKey bindKey = BindKey.type(typeof(XtextResource).getName)
		for (Binding binding : bindings) {
			if (binding.key.equals(bindKey)) {
				toRemove.add(binding)
			}
		}
		bindings.removeAll(toRemove)
		bindings.addAll(new BindFactory().addTypeToType(
			typeof(XtextResource).getName,
			typeof(SpecificationCSResource).getName
		).bindings)
		null
	}
}