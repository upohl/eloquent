package org.muml.psm.allocation.language.xtext.resource

import java.io.File
import java.net.URL
import java.net.URLClassLoader
import java.util.Enumeration
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.launching.IRuntimeClasspathEntry
import org.eclipse.jdt.launching.JavaRuntime

/**
 * Classloader that delegates all "class loading tasks" to an
 * URLClassloader, which is configured with javaProject's
 * classpath.
 * 
 * This doc string needs a bit more love...
 */
class JavaProjectClassLoader extends ClassLoader {
	
	private static String projectNull = "javaProject must not be null"
	private static String parentNull = "parent must not be null"
	
	private IJavaProject javaProject
	private ClassLoader parent
	private ClassLoader delegate
	
	public new(IJavaProject javaProject, ClassLoader parent) {
		if (javaProject == null) {
			throw new IllegalArgumentException(projectNull)
		}
		if (parent == null) {
			throw new IllegalArgumentException(parentNull)
		}
		this.javaProject = javaProject
		this.parent = parent
	}
	
	protected def override Class<?> findClass(String name) {
		getDelegate().loadClass(name)
	}
	
	// currently unused by our code
	protected def override URL findResource(String name) {
		getDelegate().getResource(name)
	}
	
	// currently unused by our code
	protected def override Enumeration<URL> findResources(String name) {
		getDelegate().getResources(name)
	}
	
	protected def ClassLoader getDelegate() {
		// hmm should we check/list for changes to the project (e.g., the
		// classpath might change (currently, the editor has to be reopened))
		// JavaProject.areClasspathsEqual might be useful
		delegate = delegate ?: createDelegate()
	}
	
	protected def ClassLoader createDelegate() {
		// see org.eclipse.jdt.launching.AbstractJavaLaunchConfigurationDelegate.getClasspath(ILaunchConfiguration)
		// (that method is called when launching a MWE2 workflow)
		val Iterable<URL> classpathEntries = JavaRuntime.computeUnresolvedRuntimeClasspath(
			javaProject
		).map[entry |
			JavaRuntime.resolveRuntimeClasspathEntry(entry, javaProject).toList
		].flatten.toSet.filter[resolvedEntry |
			resolvedEntry.classpathProperty == IRuntimeClasspathEntry.USER_CLASSES
				&& resolvedEntry.location != null
		].map[resolvedEntry |
			val File file = new File(resolvedEntry.location)
			var location = "file://" + resolvedEntry.location
			if (file.directory && !location.endsWith("/")) {
				// a directory has to end with a "/" (see
				// sun.misc.URLClassPath.getLoader(URL))
				location += "/"
			}
			new URL(location)
		]
		val classLoader = new URLClassLoader(classpathEntries, parent)
		classLoader
	}
	
}