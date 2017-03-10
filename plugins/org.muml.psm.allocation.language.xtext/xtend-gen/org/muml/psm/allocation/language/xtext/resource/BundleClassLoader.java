package org.muml.psm.allocation.language.xtext.resource;

import com.google.common.base.Objects;
import java.net.URL;
import java.util.Enumeration;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.osgi.framework.Bundle;

/**
 * Classloader that delegates all "class loading tasks" to the
 * passed bundle.
 */
@SuppressWarnings("all")
public class BundleClassLoader extends ClassLoader {
  private final static String bundleNull = "bundle must not be null";
  
  private Bundle bundle;
  
  public BundleClassLoader(final Bundle bundle, final ClassLoader parent) {
    super(parent);
    boolean _equals = Objects.equal(bundle, null);
    if (_equals) {
      throw new IllegalArgumentException(BundleClassLoader.bundleNull);
    }
    this.bundle = bundle;
  }
  
  @Override
  protected Class<?> findClass(final String name) {
    try {
      return this.bundle.loadClass(name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  protected URL findResource(final String name) {
    return this.bundle.getResource(name);
  }
  
  @Override
  protected Enumeration<URL> findResources(final String name) {
    try {
      return this.bundle.getResources(name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
