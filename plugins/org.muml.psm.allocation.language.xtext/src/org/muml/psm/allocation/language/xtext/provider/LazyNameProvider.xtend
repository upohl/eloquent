package org.muml.psm.allocation.language.xtext.provider

import java.util.Collection
import org.muml.psm.allocation.language.^as.NameProvider

/**
 * NameProvider that lazily instantiates the passed className
 * and delegates all getName calls to the instantiated object.
 */
class LazyNameProvider extends AbstractLazyObjectProvider<NameProvider> implements NameProvider {
	
	new(String className, Collection<ClassLoader> classLoaders) {
		super(className, classLoaders)
	}
	
	override protected getClazz() {
		typeof(NameProvider)
	}
	
	override getName(Object element) {
		getObject().getName(element)
	}
	
}