package org.muml.psm.allocation.language.xtext.ui;

import org.muml.psm.allocation.language.xtext.scoping.AllocationSpecificationLanguageScopeProvider;
import org.muml.psm.allocation.language.xtext.ui.internal.AllocationSpecificationLanguageActivator;
import org.osgi.framework.BundleContext;

@SuppressWarnings("all")
public class AllocationSpecificationLanguagePluginActivator extends AllocationSpecificationLanguageActivator {
  @Override
  public void start(final BundleContext context) throws Exception {
    super.start(context);
    AllocationSpecificationLanguageScopeProvider.init();
  }
}
