package org.muml.psm.allocation.algorithm.ilp.tests

import org.eclipse.emf.ecore.ENamedElement
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.impl.EObjectImpl
import org.muml.psm.allocation.language.^as.NameProvider

class EcoreNameProvider extends EObjectImpl implements NameProvider {
	
	private static final String unexpectedElement = "Unable to provide name for %s"
	private static final String unexpectedContainmentHierarchy = "Did not expect %s in containment hierarchy of %s"
	
	override getName(Object element) {
		getNameFor(element)
	}
	
	def dispatch String getNameFor(Object element) {
		throw new IllegalArgumentException(
			String.format(unexpectedElement, element)
		)
	}
	
	def dispatch String getNameFor(ENamedElement namedElement) {
		val StringBuilder builder = new StringBuilder()
		var EObject object = namedElement
		do {
			if (builder.length > 0) {
				builder.insert(0, ".")
			}
			if (!(object instanceof ENamedElement)) {
				throw new IllegalStateException(
					String.format(unexpectedContainmentHierarchy,
						object, namedElement
					)
				)
			}
			builder.insert(0, (object as ENamedElement).name)
			object = object.eContainer
		} while (object != null)
		builder.toString
	}
	
}