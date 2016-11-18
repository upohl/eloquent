package org.muml.psm.allocation.language.xtext.naming

import org.muml.pim.instance.ComponentInstance
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration
import org.muml.pm.hardware.hwresourceinstance.ResourceInstance
import org.muml.psm.allocation.language.^as.NameProvider
import org.eclipse.emf.ecore.impl.EObjectImpl
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance

/**
 * MUML-specific NameProvider. Currently, it only ComponentInstances
 * and ResourceInstances are supported.
 */
class MUMLNameProvider extends EObjectImpl implements NameProvider {
	
	private static final String unexpectedElement = "Unable to provide name for %s"
	
	override getName(Object element) {
		getNameFor(element)
	}
	
	def dispatch String getNameFor(Object element) {
		throw new IllegalArgumentException(
			String.format(unexpectedElement, element)
		)
	}
	
	def dispatch String getNameFor(ComponentInstance componentInstance) {
		val StringBuilder builder = new StringBuilder()
		var instance = componentInstance
		do {
			if (builder.length > 0) {
				builder.insert(0, ".")
			}
			builder.insert(0, instance.name)
			instance = instance.parentCIC.parentStructuredComponentInstance
		} while (instance != null)
		builder.toString
	}
	
	def dispatch String getNameFor(ResourceInstance resourceInstance) {
		val StringBuilder builder = new StringBuilder(resourceInstance.name)
		var HWPlatformInstance hpi = (resourceInstance.eContainer as HWPlatformInstanceConfiguration)
			.parentHWPlatformInstance
		do {
			if (builder.length > 0) {
				builder.insert(0, ".")
			}
			builder.insert(0, hpi.name)
			hpi = hpi.parentHPIC.parentHWPlatformInstance
		} while (hpi != null)
		builder.toString
	}
	
}