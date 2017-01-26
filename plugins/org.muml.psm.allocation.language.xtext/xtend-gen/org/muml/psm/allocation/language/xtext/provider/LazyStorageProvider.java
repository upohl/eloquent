package org.muml.psm.allocation.language.xtext.provider;

import java.util.Collection;
import org.muml.psm.allocation.language.as.StorageProvider;
import org.muml.psm.allocation.language.xtext.provider.AbstractLazyObjectProvider;

/**
 * StorageProvider that lazily instantiates the passed className
 * and delegates all "initialize", "store", and "noRelationFound" calls
 * to the instantiated object.
 */
@SuppressWarnings("all")
public class LazyStorageProvider extends AbstractLazyObjectProvider<StorageProvider> implements StorageProvider {
  public LazyStorageProvider(final String className, final Collection<ClassLoader> classLoaders) {
    super(className, classLoaders);
  }
  
  @Override
  protected Class<StorageProvider> getClazz() {
    return StorageProvider.class;
  }
  
  @Override
  public void initialize(final Object context) {
    StorageProvider _object = this.getObject();
    _object.initialize(context);
  }
  
  @Override
  public Object store(final Object source, final Object target) {
    StorageProvider _object = this.getObject();
    return _object.store(source, target);
  }
  
  @Override
  public Object noRelationFound() {
    StorageProvider _object = this.getObject();
    return _object.noRelationFound();
  }
}
