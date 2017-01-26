package org.muml.psm.allocation.language.xtext.cs2as;

import java.util.Collection;
import org.eclipse.ocl.pivot.internal.library.ImplementationManager;
import org.eclipse.ocl.pivot.internal.manager.PivotMetamodelManager;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.ocl.xtext.base.cs2as.Continuation;
import org.eclipse.ocl.xtext.oclstdlibcs.JavaClassCS;
import org.muml.psm.allocation.language.as.Specification;
import org.muml.psm.allocation.language.cs.JavaImplementationProviderCS;
import org.muml.psm.allocation.language.cs.SpecificationCS;
import org.muml.psm.allocation.language.xtext.provider.LazyNameProvider;
import org.muml.psm.allocation.language.xtext.provider.LazyStorageProvider;
import org.muml.psm.allocation.language.xtext.visitor.LanguageSpecificationCSContainmentVisitor;

@SuppressWarnings("all")
public class SpecificationCSContainmentVisitor extends LanguageSpecificationCSContainmentVisitor {
  public SpecificationCSContainmentVisitor(final CS2ASConversion context) {
    super(context);
  }
  
  @Override
  public Continuation<?> visitSpecificationCS(final SpecificationCS csElement) {
    Continuation<?> _xblockexpression = null;
    {
      final Continuation<?> continuation = super.visitSpecificationCS(csElement);
      final Specification specification = PivotUtil.<Specification>getPivot(Specification.class, csElement);
      EnvironmentFactoryInternal _environmentFactory = this.context.getEnvironmentFactory();
      PivotMetamodelManager _metamodelManager = _environmentFactory.getMetamodelManager();
      ImplementationManager _implementationManager = _metamodelManager.getImplementationManager();
      final Collection<ClassLoader> classLoaders = _implementationManager.getClassLoaders();
      JavaImplementationProviderCS _nameProviderImplementationClass = csElement.getNameProviderImplementationClass();
      JavaClassCS _implementation = _nameProviderImplementationClass.getImplementation();
      String _name = _implementation.getName();
      LazyNameProvider _lazyNameProvider = new LazyNameProvider(_name, classLoaders);
      specification.setNameProvider(_lazyNameProvider);
      JavaImplementationProviderCS _storageProviderImplementationClass = csElement.getStorageProviderImplementationClass();
      JavaClassCS _implementation_1 = _storageProviderImplementationClass.getImplementation();
      String _name_1 = _implementation_1.getName();
      LazyStorageProvider _lazyStorageProvider = new LazyStorageProvider(_name_1, classLoaders);
      specification.setStorageProvider(_lazyStorageProvider);
      _xblockexpression = continuation;
    }
    return _xblockexpression;
  }
}
