package org.muml.psm.allocation.language.xtext.naming

import java.util.Collection
import org.eclipse.emf.ecore.impl.EObjectImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import org.muml.psm.allocation.language.^as.NameProvider

/**
 * NameProvider that lazily instantiates the passed className
 * (via the passed classLoaders) and delegates all getName calls
 * to the instantiated object.
 * 
 * The class that is designated by className should directly or
 * indirectly implement the NameProvider interface.
 */
class LazyNameProvider extends EObjectImpl implements NameProvider {
	
	private static final String classNotFoundError = "Unable to find class %s"
	private static final String newInstanceError = "Unable to instantiate class %s"
	private static final String typeMismatchError = "The class should be a supertype of NameProvider"
	
	private String className
	private NameProvider nameProvider
	private Collection<ClassLoader> classLoaders
	private Resource dummyResource
	
	public new(String className, Collection<ClassLoader> classLoaders) {
		this.className = className
		this.classLoaders = classLoaders
		dummyResource = new ResourceImpl()
		dummyResource.contents.add(this)
	}
	
	override String getName(Object element) {
		if (nameProvider == null) {
			nameProvider = loadImplementation()
		}
		nameProvider.getName(element)
	}
	
	//@NonNull
	protected def Class<? extends NameProvider> loadClass() {
		var Class<?> clazz
		for (ClassLoader classLoader : classLoaders) {
			if (clazz == null) {
				try {
					clazz = classLoader.loadClass(className)
				} catch (ClassNotFoundException cnfe) {
				}
			}
		}
		if (clazz == null) {
			throw new IllegalStateException(
				String.format(classNotFoundError, className)
			)
		} else if (!typeof(NameProvider).isAssignableFrom(clazz)) {
			throw new IllegalStateException(typeMismatchError)
		}
		clazz as Class<? extends NameProvider>
	}
	
	//@NonNull
	protected def NameProvider loadImplementation() {
		var NameProvider instance
		val Class<? extends NameProvider> clazz = loadClass()
		try {
			instance = clazz.newInstance
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		} catch (ClassCastException cce) {
		}
		if (instance == null) {
			throw new IllegalStateException(
				String.format(newInstanceError, className)
			)
		}
		instance
	}
	
}