package de.uni_paderborn.fujaba.muml.allocation.language.ui;

import de.uni_paderborn.fujaba.muml.allocation.language.scoping.AllocationSpecificationLanguageScopeProvider;
import de.uni_paderborn.fujaba.muml.allocation.language.ui.internal.AllocationSpecificationLanguageActivator;
import org.osgi.framework.BundleContext;

@SuppressWarnings("all")
public class AllocationSpecificationLanguagePluginActivator extends AllocationSpecificationLanguageActivator {
  public void start(final BundleContext context) throws Exception {
    super.start(context);
    AllocationSpecificationLanguageScopeProvider.init();
  }
}
