package org.muml.psm.allocation.language.xtext.provider

import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.impl.EObjectImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.muml.psm.allocation.language.^as.NameProvider

/**
 * A generic name provider that assigns names to EObjects.
 */
class EcoreNameProvider extends EObjectImpl implements NameProvider {
	private static final String unexpectedArgument = "Expected EObject or subtype (got: %s)"
	private static final String prefix = "x"
	private Map<Object, String> elementToNameMap
	
	new() {
		elementToNameMap = newHashMap
	}
	
	override getName(Object element) {
		if (!(element instanceof EObject)) {
			throw new IllegalArgumentException(
				String.format(unexpectedArgument, element)
			)
		}
		var String name = elementToNameMap.get(element)
		if (name != null) {
			return name
		}
		// XXX: we should sanitize "name"...
		name = EcoreUtil.getID(element as EObject)
		// we could speed this lookup up by maintaining an additional
		// HashSet...
		while (elementToNameMap.containsValue(name) || name == null) {
			name = EcoreUtil.generateUUID
		}
		name = prefix + name
		elementToNameMap.put(element, name)
		name
	}
	
}