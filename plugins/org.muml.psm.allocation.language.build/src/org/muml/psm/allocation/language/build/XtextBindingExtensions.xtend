package org.muml.psm.allocation.language.build

import java.util.Set
import org.eclipse.xtext.generator.BindKey
import java.util.HashSet
import org.eclipse.xtext.generator.BindFactory
import org.eclipse.xtext.generator.Binding

/**
 * This class provides extensions methods in order to add and
 * remove bindings in a "syntactically appealing" (subjective!) way
 * (long story short: syntactic sugar (cf. builder pattern)).
 */
class XtextBindingExtensions {
	
	def static Set<Binding> removeBindingsFor(Set<Binding> bindings, Class<?> clazz) {
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
	
	def static Set<Binding> addBindingFor(Set<Binding> bindings, Class<?> fromClazz, Class<?> toClazz) {
		bindings.addAll(new BindFactory().addTypeToType(
			fromClazz.getName,
			toClazz.getName
		).bindings)
		bindings
	}
	
}