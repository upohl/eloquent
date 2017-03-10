package org.muml.psm.allocation.language.xtext.resource;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.osgi.service.resolver.ExportPackageDescription;
import org.eclipse.osgi.service.resolver.PlatformAdmin;
import org.eclipse.osgi.service.resolver.StateHelper;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.muml.psm.allocation.language.xtext.resource.BundleClassLoader;
import org.osgi.framework.Bundle;
import org.osgi.framework.Version;

/**
 * Classloader that delegates all "class loading tasks" to an
 * URLClassloader, which is configured with javaProject's
 * classpath.
 * 
 * This doc string needs a bit more love...
 */
@SuppressWarnings("all")
public class JavaProjectClassLoader extends ClassLoader {
  private static String projectNull = "javaProject must not be null";
  
  private static String parentNull = "parent must not be null";
  
  private IJavaProject javaProject;
  
  private ClassLoader parent;
  
  private ClassLoader delegate;
  
  public JavaProjectClassLoader(final IJavaProject javaProject, final ClassLoader parent) {
    boolean _equals = Objects.equal(javaProject, null);
    if (_equals) {
      throw new IllegalArgumentException(JavaProjectClassLoader.projectNull);
    }
    boolean _equals_1 = Objects.equal(parent, null);
    if (_equals_1) {
      throw new IllegalArgumentException(JavaProjectClassLoader.parentNull);
    }
    this.javaProject = javaProject;
    this.parent = parent;
  }
  
  @Override
  protected Class<?> findClass(final String name) {
    try {
      ClassLoader _delegate = this.getDelegate();
      return _delegate.loadClass(name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  protected URL findResource(final String name) {
    ClassLoader _delegate = this.getDelegate();
    return _delegate.getResource(name);
  }
  
  @Override
  protected Enumeration<URL> findResources(final String name) {
    try {
      ClassLoader _delegate = this.getDelegate();
      return _delegate.getResources(name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected ClassLoader getDelegate() {
    ClassLoader _elvis = null;
    if (this.delegate != null) {
      _elvis = this.delegate;
    } else {
      ClassLoader _createDelegate = this.createDelegate();
      _elvis = _createDelegate;
    }
    return this.delegate = _elvis;
  }
  
  protected ClassLoader createDelegate() {
    ClassLoader _createPackageClassLoader = this.createPackageClassLoader(this.parent);
    return this.createLocalProjectClassLoader(_createPackageClassLoader);
  }
  
  protected ClassLoader createPackageClassLoader(final ClassLoader parent) {
    ClassLoader _xblockexpression = null;
    {
      IProject _project = this.javaProject.getProject();
      final IPluginModelBase pluginModelBase = PluginRegistry.findModel(_project);
      boolean _equals = Objects.equal(pluginModelBase, null);
      if (_equals) {
        return parent;
      }
      BundleDescription _bundleDescription = pluginModelBase.getBundleDescription();
      final BundleDescription bundleDescription = _bundleDescription.getSupplier();
      PlatformAdmin _platformAdmin = Platform.getPlatformAdmin();
      StateHelper _stateHelper = _platformAdmin.getStateHelper();
      final ExportPackageDescription[] exportPackageDescriptions = _stateHelper.getVisiblePackages(bundleDescription);
      final HashSet<BundleDescription> seen = CollectionLiterals.<BundleDescription>newHashSet();
      ClassLoader loader = parent;
      for (final ExportPackageDescription packageDescription : exportPackageDescriptions) {
        {
          final BundleDescription exporter = packageDescription.getExporter();
          boolean _contains = seen.contains(exporter);
          boolean _not = (!_contains);
          if (_not) {
            seen.add(exporter);
            String _symbolicName = exporter.getSymbolicName();
            Version _version = exporter.getVersion();
            String _string = _version.toString();
            final Bundle[] bundles = Platform.getBundles(_symbolicName, _string);
            boolean _notEquals = (!Objects.equal(bundles, null));
            if (_notEquals) {
              int _size = ((List<Bundle>)Conversions.doWrapArray(bundles)).size();
              int _minus = (_size - 1);
              final Bundle bundle = bundles[_minus];
              BundleClassLoader _bundleClassLoader = new BundleClassLoader(bundle, loader);
              loader = _bundleClassLoader;
            }
          }
        }
      }
      _xblockexpression = loader;
    }
    return _xblockexpression;
  }
  
  protected ClassLoader createLocalProjectClassLoader(final ClassLoader parent) {
    try {
      URLClassLoader _xblockexpression = null;
      {
        IRuntimeClasspathEntry[] _computeUnresolvedRuntimeClasspath = JavaRuntime.computeUnresolvedRuntimeClasspath(
          this.javaProject);
        final Function1<IRuntimeClasspathEntry, List<IRuntimeClasspathEntry>> _function = (IRuntimeClasspathEntry entry) -> {
          try {
            IRuntimeClasspathEntry[] _resolveRuntimeClasspathEntry = JavaRuntime.resolveRuntimeClasspathEntry(entry, this.javaProject);
            return IterableExtensions.<IRuntimeClasspathEntry>toList(((Iterable<IRuntimeClasspathEntry>)Conversions.doWrapArray(_resolveRuntimeClasspathEntry)));
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        List<List<IRuntimeClasspathEntry>> _map = ListExtensions.<IRuntimeClasspathEntry, List<IRuntimeClasspathEntry>>map(((List<IRuntimeClasspathEntry>)Conversions.doWrapArray(_computeUnresolvedRuntimeClasspath)), _function);
        Iterable<IRuntimeClasspathEntry> _flatten = Iterables.<IRuntimeClasspathEntry>concat(_map);
        Set<IRuntimeClasspathEntry> _set = IterableExtensions.<IRuntimeClasspathEntry>toSet(_flatten);
        final Function1<IRuntimeClasspathEntry, Boolean> _function_1 = (IRuntimeClasspathEntry resolvedEntry) -> {
          return Boolean.valueOf(((resolvedEntry.getClasspathProperty() == IRuntimeClasspathEntry.USER_CLASSES) && (!Objects.equal(resolvedEntry.getLocation(), null))));
        };
        Iterable<IRuntimeClasspathEntry> _filter = IterableExtensions.<IRuntimeClasspathEntry>filter(_set, _function_1);
        final Function1<IRuntimeClasspathEntry, URL> _function_2 = (IRuntimeClasspathEntry resolvedEntry) -> {
          try {
            URL _xblockexpression_1 = null;
            {
              String _location = resolvedEntry.getLocation();
              final File file = new File(_location);
              String _location_1 = resolvedEntry.getLocation();
              String location = ("file://" + _location_1);
              if ((file.isDirectory() && (!location.endsWith("/")))) {
                String _location_2 = location;
                location = (_location_2 + "/");
              }
              _xblockexpression_1 = new URL(location);
            }
            return _xblockexpression_1;
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
          }
        };
        final Iterable<URL> classpathEntries = IterableExtensions.<IRuntimeClasspathEntry, URL>map(_filter, _function_2);
        _xblockexpression = new URLClassLoader(((URL[])Conversions.unwrapArray(classpathEntries, URL.class)), parent);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
