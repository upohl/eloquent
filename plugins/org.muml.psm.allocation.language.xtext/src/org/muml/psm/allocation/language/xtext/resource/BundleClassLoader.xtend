package org.muml.psm.allocation.language.xtext.resource

import java.lang.ClassLoader
import org.osgi.framework.Bundle
import java.net.URL
import java.util.Enumeration

/**
 * Classloader that delegates all "class loading tasks" to the
 * passed bundle.
 */
class BundleClassLoader extends ClassLoader {
	
	private static final String bundleNull = "bundle must not be null"
	private Bundle bundle
	
	new(Bundle bundle, ClassLoader parent) {
		super(parent)
		println("### BundleClassLoader ###")
		println("symbolicName: " + bundle.symbolicName)
		if (bundle == null) {
			throw new IllegalArgumentException(bundleNull)
		}
		this.bundle = bundle
	}
	
	protected def override Class<?> findClass(String name) {
		bundle.loadClass(name)
	}
	
	protected def override URL findResource(String name) {
		bundle.getResource(name)
	}
	
	protected def override Enumeration<URL> findResources(String name) {
		bundle.getResources(name)
	}
}