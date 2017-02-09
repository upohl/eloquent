package org.muml.psm.allocation.language.xtext.provider

import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.impl.EObjectImpl
import org.muml.core.NamedElement
import org.muml.pim.instance.AssemblyConnectorInstance
import org.muml.pim.instance.ComponentInstance
import org.muml.pim.instance.PortInstance
import org.muml.pm.hardware.hwplatforminstance.BusInstance
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration
import org.muml.pm.hardware.hwplatforminstance.HWPortInstance
import org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance
import org.muml.pm.hardware.hwresourceinstance.ResourceInstance
import org.muml.psm.allocation.language.^as.NameProvider

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
	
	// TODO: escaping
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
	
	def dispatch String getNameFor(AssemblyConnectorInstance connectorInstance) {
		val PortInstance a = connectorInstance.connectorEndpointInstances.get(0) as PortInstance
		val PortInstance b = connectorInstance.connectorEndpointInstances.get(1) as PortInstance
		val name = a.componentInstance.getNameFor + ".port." + a.safeName
			+ ".ATo."
			+ b.componentInstance.getNameFor + '.port' + b.safeName
		uniqueName(name.sanitize, connectorInstance)
	}
	
	def dispatch String getNameFor(NetworkConnectorInstance connectorInstance) {
		val name = connectorInstance.connectorEndpointInstances.get(0).safeName
			+ ".NTo."
			+ connectorInstance.connectorEndpointInstances.get(1).safeName
		uniqueName(name.sanitize, connectorInstance)
	}
	
	private Map<String, EObject> name2Object = <String, EObject>newHashMap
	
	def String uniqueName(String name, EObject object) {
		val EObject existing = name2Object.get(name) 
		if (existing != null && existing != object) {
			println("### name collision ###")
			return uniqueName(name + "Unique", object)
		}
		name2Object.put(name, object)
		name
	}
	
	private Map<EObject, String> unnamedMap = <EObject, String>newHashMap
	private int unnamedCounter = 0
	
	def String safeName(NamedElement namedElement) {
		if (namedElement.name == null) {
			var s = unnamedMap.get(namedElement)
			if (s != null) {
				return s
			}
			s = "unnamedElement." + unnamedCounter++
			unnamedMap.put(namedElement, s)
			return s
		}
		var String name = namedElement.name
		if (namedElement instanceof HWPortInstance) {
			name = (namedElement as HWPortInstance).parentResourceInstance.getNameFor
				+ ".port." + namedElement.name
		} else if (namedElement instanceof BusInstance) {
			name = namedElement.name
		}
		name
	}
	
	def String sanitize(String data) {
		data.replaceAll("[\\s\"\\-+*/<>=]", "W")
	}
	
}