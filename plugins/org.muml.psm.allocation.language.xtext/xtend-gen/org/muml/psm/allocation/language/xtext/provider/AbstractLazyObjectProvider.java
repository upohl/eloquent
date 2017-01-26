package org.muml.psm.allocation.language.xtext.provider;

import com.google.common.base.Objects;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;

/**
 * Abstract class for object providers that lazily instantiate
 * the passed className (via the passed classLoaders). The
 * instantiated object can be obtained via the getObject method.
 * 
 * The class that is designated by className should directly or
 * indirectly implement the T type.
 */
@SuppressWarnings("all")
public abstract class AbstractLazyObjectProvider<T extends Object> extends EObjectImpl {
  private final static String classNotFoundError = "Unable to find class %s";
  
  private final static String newInstanceError = "Unable to instantiate class %s";
  
  private final static String typeMismatchError = "The class should be a subtype of %s";
  
  private String className;
  
  private T object;
  
  private Collection<ClassLoader> classLoaders;
  
  private Resource dummyResource;
  
  public AbstractLazyObjectProvider(final String className, final Collection<ClassLoader> classLoaders) {
    this.className = className;
    this.classLoaders = classLoaders;
    ResourceImpl _resourceImpl = new ResourceImpl();
    this.dummyResource = _resourceImpl;
    EList<EObject> _contents = this.dummyResource.getContents();
    _contents.add(this);
  }
  
  protected T getObject() {
    T _xblockexpression = null;
    {
      boolean _equals = Objects.equal(this.object, null);
      if (_equals) {
        T _loadImplementation = this.loadImplementation();
        this.object = _loadImplementation;
      }
      _xblockexpression = this.object;
    }
    return _xblockexpression;
  }
  
  protected abstract Class<T> getClazz();
  
  protected Class<? extends T> loadClass() {
    Class<? extends T> _xblockexpression = null;
    {
      Class<?> clazz = null;
      for (final ClassLoader classLoader : this.classLoaders) {
        boolean _equals = Objects.equal(clazz, null);
        if (_equals) {
          try {
            Class<?> _loadClass = classLoader.loadClass(this.className);
            clazz = _loadClass;
          } catch (final Throwable _t) {
            if (_t instanceof ClassNotFoundException) {
              final ClassNotFoundException cnfe = (ClassNotFoundException)_t;
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
      }
      boolean _equals_1 = Objects.equal(clazz, null);
      if (_equals_1) {
        String _format = String.format(AbstractLazyObjectProvider.classNotFoundError, this.className);
        throw new IllegalStateException(_format);
      } else {
        Class<T> _clazz = this.getClazz();
        boolean _isAssignableFrom = _clazz.isAssignableFrom(clazz);
        boolean _not = (!_isAssignableFrom);
        if (_not) {
          Class<T> _clazz_1 = this.getClazz();
          String _name = _clazz_1.getName();
          String _format_1 = String.format(AbstractLazyObjectProvider.typeMismatchError, _name);
          throw new IllegalStateException(_format_1);
        }
      }
      _xblockexpression = ((Class<? extends T>) clazz);
    }
    return _xblockexpression;
  }
  
  protected T loadImplementation() {
    T _xblockexpression = null;
    {
      T instance = null;
      final Class<? extends T> clazz = this.loadClass();
      try {
        T _newInstance = clazz.newInstance();
        instance = _newInstance;
      } catch (final Throwable _t) {
        if (_t instanceof InstantiationException) {
          final InstantiationException e = (InstantiationException)_t;
        } else if (_t instanceof IllegalAccessException) {
          final IllegalAccessException e_1 = (IllegalAccessException)_t;
        } else if (_t instanceof ClassCastException) {
          final ClassCastException cce = (ClassCastException)_t;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      boolean _equals = Objects.equal(instance, null);
      if (_equals) {
        String _format = String.format(AbstractLazyObjectProvider.newInstanceError, this.className);
        throw new IllegalStateException(_format);
      }
      _xblockexpression = instance;
    }
    return _xblockexpression;
  }
}
