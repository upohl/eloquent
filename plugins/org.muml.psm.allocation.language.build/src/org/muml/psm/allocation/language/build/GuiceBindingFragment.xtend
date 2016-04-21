package org.muml.psm.allocation.language.build

import org.eclipse.ocl.examples.build.fragments.EssentialOCLFragment
import org.eclipse.xtext.Grammar
import java.util.Set
import org.eclipse.xtext.generator.Binding
import org.eclipse.xtext.generator.BindFactory
import org.eclipse.xtext.generator.BindKey
import org.eclipse.xtext.resource.XtextResource
import java.util.HashSet
import org.muml.psm.allocation.language.xtext.resource.SpecificationCSResource
import org.eclipse.xtext.ui.editor.XtextEditor

class GuiceBindingFragment extends EssentialOCLFragment {
	
	def private Set<Binding> removeBindingsFor(Set<Binding> bindings, Class<?> clazz) {
		val Set<Binding> toRemove = new HashSet<Binding>()
		val BindKey bindKey = BindKey.type(clazz.getName)
		for (Binding binding : bindings) {
			if (binding.key.equals(bindKey)) {
				toRemove.add(binding)
			}
		}
		bindings.removeAll(toRemove)
		bindings
	}
	
	def private Set<Binding> addBindingFor(Set<Binding> bindings, Class<?> fromClazz, Class<?> toClazz) {
		bindings.addAll(new BindFactory().addTypeToType(
			fromClazz.getName,
			toClazz.getName
		).bindings)
		bindings
	}
	
	override public Set<Binding> getGuiceBindingsRt(Grammar grammar) {
		// use the SpecificationCS specific Resource
		super.getGuiceBindingsRt(grammar).removeBindingsFor(
			typeof(XtextResource)
		).addBindingFor(
			typeof(XtextResource),
			typeof(SpecificationCSResource)
		)
	}
	
	override public Set<Binding> getGuiceBindingsUi(Grammar grammar) {
		// we do not provide a custom XtextEditor... thus fallback to
		// the default one
		super.getGuiceBindingsUi(grammar).removeBindingsFor(
			typeof(XtextEditor)
		)
	}
}