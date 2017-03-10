package org.muml.psm.allocation.language.xtext.cs2as;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.resource.ASResource;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.ocl.xtext.base.cs2as.Continuation;
import org.eclipse.ocl.xtext.base.utilities.BaseCSResource;
import org.eclipse.ocl.xtext.completeocl.cs2as.CompleteOCLCS2AS;
import org.eclipse.ocl.xtext.oclstdlibcs.JavaClassCS;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.muml.psm.allocation.language.cs.util.LanguageSpecificationCSVisitor;
import org.muml.psm.allocation.language.xtext.cs2as.SpecificationCS2PivotConversion;
import org.muml.psm.allocation.language.xtext.cs2as.SpecificationCSContainmentVisitor;
import org.muml.psm.allocation.language.xtext.cs2as.SpecificationCSPostOrderVisitor;
import org.muml.psm.allocation.language.xtext.visitor.LanguageSpecificationCSLeft2RightVisitor;
import org.muml.psm.allocation.language.xtext.visitor.LanguageSpecificationCSPreOrderVisitor;

@SuppressWarnings("all")
public class SpecificationCS2Pivot extends CompleteOCLCS2AS {
  protected Resource javaClassCSResource;
  
  public SpecificationCS2Pivot(final EnvironmentFactoryInternal environmentFactory, final BaseCSResource csResource, final ASResource asResource) {
    super(environmentFactory, csResource, asResource);
    ResourceImpl _resourceImpl = new ResourceImpl();
    this.javaClassCSResource = _resourceImpl;
  }
  
  /**
   * @NonNull
   */
  @Override
  protected LanguageSpecificationCSVisitor<Continuation<?>> createContainmentVisitor(final CS2ASConversion converter) {
    return new SpecificationCSContainmentVisitor(converter);
  }
  
  /**
   * @NonNull
   */
  @Override
  protected LanguageSpecificationCSVisitor<Element> createLeft2RightVisitor(final CS2ASConversion converter) {
    return new LanguageSpecificationCSLeft2RightVisitor(converter);
  }
  
  /**
   * @NonNull
   */
  @Override
  protected LanguageSpecificationCSVisitor<Continuation<?>> createPostOrderVisitor(final CS2ASConversion converter) {
    return new SpecificationCSPostOrderVisitor(converter);
  }
  
  /**
   * @NonNull
   */
  @Override
  protected LanguageSpecificationCSVisitor<Continuation<?>> createPreOrderVisitor(final CS2ASConversion converter) {
    return new LanguageSpecificationCSPreOrderVisitor(converter);
  }
  
  /**
   * @NonNull
   */
  @Override
  protected CS2ASConversion createConversion(final IDiagnosticConsumer diagnosticsConsumer, final BaseCSResource csResource) {
    return new SpecificationCS2PivotConversion(this, diagnosticsConsumer);
  }
  
  @Override
  public synchronized void update(final IDiagnosticConsumer diagnosticsConsumer) {
    EList<EObject> _contents = this.javaClassCSResource.getContents();
    _contents.clear();
    for (int i = (this.csResource.getContents().size() - 1); (i >= 0); i--) {
      {
        EList<EObject> _contents_1 = this.csResource.getContents();
        final EObject object = _contents_1.get(i);
        if ((object instanceof JavaClassCS)) {
          EList<EObject> _contents_2 = this.javaClassCSResource.getContents();
          _contents_2.add(object);
        }
      }
    }
    super.update(diagnosticsConsumer);
  }
}
