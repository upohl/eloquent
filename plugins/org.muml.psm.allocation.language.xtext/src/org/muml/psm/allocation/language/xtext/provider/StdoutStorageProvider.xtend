package org.muml.psm.allocation.language.xtext.provider

import org.eclipse.emf.ecore.impl.EObjectImpl
import org.muml.psm.allocation.language.^as.StorageProvider

/**
 * A simple storage provider that prints the results to stdout.
 */
class StdoutStorageProvider extends EObjectImpl implements StorageProvider {
	private EcoreNameProvider nameProvider
	
	new() {
		nameProvider = new EcoreNameProvider
	}
	
	override initialize(Object context) {
		println("initialized storage provider with " + context)
	}
	
	override noRelationFound() {
		println("no relation found")
	}
	
	override store(Object source, Object target) {
		val String sourceName = nameProvider.getName(source)
		val String targetName = nameProvider.getName(target)
		println('''relate "«sourceName»" to "«targetName»''')
	}
	
}