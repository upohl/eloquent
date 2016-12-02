package org.muml.psm.allocation.language.xtext.provider

import org.muml.psm.allocation.language.xtext.provider.AbstractLazyObjectProvider
import org.muml.psm.allocation.language.^as.StorageProvider
import java.util.Collection

/**
 * StorageProvider that lazily instantiates the passed className
 * and delegates all "initialize", "store", and "noRelationFound" calls
 * to the instantiated object.
 */
class LazyStorageProvider extends AbstractLazyObjectProvider<StorageProvider> implements StorageProvider {
	
	new(String className, Collection<ClassLoader> classLoaders) {
		super(className, classLoaders)
	}
	
	override protected getClazz() {
		typeof(StorageProvider)
	}
	
	override initialize(Object context) {
		getObject().initialize(context)
	}
	
	override store(Object source, Object target) {
		getObject().store(source, target)
	}
	
	override noRelationFound() {
		getObject().noRelationFound()
	}
	
}