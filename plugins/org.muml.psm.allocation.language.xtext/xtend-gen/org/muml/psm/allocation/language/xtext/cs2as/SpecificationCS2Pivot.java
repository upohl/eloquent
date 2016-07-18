package org.muml.psm.allocation.language.xtext.cs2as;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.resource.ASResource;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.ocl.xtext.base.cs2as.Continuation;
import org.eclipse.ocl.xtext.base.utilities.BaseCSResource;
import org.eclipse.ocl.xtext.completeocl.cs2as.CompleteOCLCS2AS;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.muml.psm.allocation.language.cs.util.LanguageSpecificationCSVisitor;
import org.muml.psm.allocation.language.xtext.cs2as.SpecificationCS2PivotConversion;
import org.muml.psm.allocation.language.xtext.cs2as.SpecificationCSPostOrderVisitor;
import org.muml.psm.allocation.language.xtext.visitor.LanguageSpecificationCSContainmentVisitor;
import org.muml.psm.allocation.language.xtext.visitor.LanguageSpecificationCSLeft2RightVisitor;
import org.muml.psm.allocation.language.xtext.visitor.LanguageSpecificationCSPreOrderVisitor;

@SuppressWarnings("all")
public class SpecificationCS2Pivot extends CompleteOCLCS2AS {
  private EClass contextClass;
  
  public SpecificationCS2Pivot(final EnvironmentFactoryInternal environmentFactory, final BaseCSResource csResource, final ASResource asResource, final EClass contextClass) {
    super(environmentFactory, csResource, asResource);
    this.contextClass = contextClass;
  }
  
  /**
   * @NonNull
   */
  protected LanguageSpecificationCSVisitor<Continuation<?>> createContainmentVisitor(final CS2ASConversion converter) {
    return new LanguageSpecificationCSContainmentVisitor(converter);
  }
  
  /**
   * @NonNull
   */
  protected LanguageSpecificationCSVisitor<Element> createLeft2RightVisitor(final CS2ASConversion converter) {
    return new LanguageSpecificationCSLeft2RightVisitor(converter);
  }
  
  /**
   * @NonNull
   */
  protected LanguageSpecificationCSVisitor<Continuation<?>> createPostOrderVisitor(final CS2ASConversion converter) {
    return new SpecificationCSPostOrderVisitor(converter);
  }
  
  /**
   * @NonNull
   */
  protected LanguageSpecificationCSVisitor<Continuation<?>> createPreOrderVisitor(final CS2ASConversion converter) {
    return new LanguageSpecificationCSPreOrderVisitor(converter);
  }
  
  /**
   * @NonNull
   */
  protected CS2ASConversion createConversion(final IDiagnosticConsumer diagnosticsConsumer, final BaseCSResource csResource) {
    return new SpecificationCS2PivotConversion(this, diagnosticsConsumer, this.contextClass);
  }
}
