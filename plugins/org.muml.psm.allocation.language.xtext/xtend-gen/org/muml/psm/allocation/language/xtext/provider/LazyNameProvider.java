package org.muml.psm.allocation.language.xtext.provider;

import java.util.Collection;
import org.muml.psm.allocation.language.as.NameProvider;
import org.muml.psm.allocation.language.xtext.provider.AbstractLazyObjectProvider;

/**
 * NameProvider that lazily instantiates the passed className
 * and delegates all getName calls to the instantiated object.
 */
@SuppressWarnings("all")
public class LazyNameProvider extends AbstractLazyObjectProvider<NameProvider> implements NameProvider {
  public LazyNameProvider(final String className, final Collection<ClassLoader> classLoaders) {
    super(className, classLoaders);
  }
  
  @Override
  protected Class<NameProvider> getClazz() {
    return NameProvider.class;
  }
  
  @Override
  public String getName(final Object element) {
    NameProvider _object = this.getObject();
    return _object.getName(element);
  }
}
