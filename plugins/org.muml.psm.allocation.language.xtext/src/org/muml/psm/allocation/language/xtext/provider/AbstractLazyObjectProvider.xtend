package org.muml.psm.allocation.language.xtext.provider

import java.util.Collection
import org.eclipse.emf.ecore.impl.EObjectImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceImpl

/**
 * Abstract class for object providers that lazily instantiate
 * the passed className (via the passed classLoaders). The
 * instantiated object can be obtained via the getObject method.
 * 
 * The class that is designated by className should directly or
 * indirectly implement the T type.
 */
public abstract class AbstractLazyObjectProvider<T> extends EObjectImpl {
	
	private static final String classNotFoundError = "Unable to find class %s"
	private static final String newInstanceError = "Unable to instantiate class %s"
	private static final String typeMismatchError = "The class should be a subtype of %s"
	
	private String className
	private T object
	private Collection<ClassLoader> classLoaders
	private Resource dummyResource
	
	public new(String className, Collection<ClassLoader> classLoaders) {
		this.className = className
		this.classLoaders = classLoaders
		dummyResource = new ResourceImpl()
		dummyResource.contents.add(this)
	}
	
	protected def T getObject() {
		if (object == null) {
			object = loadImplementation()
		}
		object
	}
	
	protected def abstract Class<T> getClazz()
	
	//@NonNull
	protected def Class<? extends T> loadClass() {
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
		} else if (!getClazz().isAssignableFrom(clazz)) {
			throw new IllegalStateException(
				String.format(typeMismatchError, getClazz().name)
			)
		}
		clazz as Class<? extends T>
	}
	
	//@NonNull
	protected def T loadImplementation() {
		var T instance
		val Class<? extends T> clazz = loadClass()
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