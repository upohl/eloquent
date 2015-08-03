package de.uni_paderborn.fujaba.muml.allocation.language.cs2as;

import de.uni_paderborn.fujaba.muml.allocation.language.cs.util.LanguageSpecificationCSVisitor;
import de.uni_paderborn.fujaba.muml.allocation.language.cs2as.SpecificationCS2PivotConversion;
import de.uni_paderborn.fujaba.muml.allocation.language.cs2as.SpecificationCSPostOrderVisitor;
import de.uni_paderborn.fujaba.muml.allocation.language.visitor.LanguageSpecificationCSContainmentVisitor;
import de.uni_paderborn.fujaba.muml.allocation.language.visitor.LanguageSpecificationCSLeft2RightVisitor;
import de.uni_paderborn.fujaba.muml.allocation.language.visitor.LanguageSpecificationCSPreOrderVisitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.resource.ASResource;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.ocl.xtext.base.cs2as.Continuation;
import org.eclipse.ocl.xtext.base.utilities.BaseCSResource;
import org.eclipse.ocl.xtext.completeocl.cs2as.CompleteOCLCS2AS;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;

@SuppressWarnings("all")
public class SpecificationCS2Pivot extends CompleteOCLCS2AS {
  private EClass contextClass;
  
  public SpecificationCS2Pivot(final EnvironmentFactoryInternal environmentFactory, final BaseCSResource csResource, final ASResource asResource, final EClass contextClass) {
    super(environmentFactory, csResource, asResource);
    this.contextClass = contextClass;
  }
  
  @NonNull
  @Override
  protected LanguageSpecificationCSVisitor<Continuation<?>> createContainmentVisitor(@NonNull final CS2ASConversion converter) {
    return new LanguageSpecificationCSContainmentVisitor(converter);
  }
  
  @NonNull
  @Override
  protected LanguageSpecificationCSVisitor<Element> createLeft2RightVisitor(@NonNull final CS2ASConversion converter) {
    return new LanguageSpecificationCSLeft2RightVisitor(converter);
  }
  
  @NonNull
  @Override
  protected LanguageSpecificationCSVisitor<Continuation<?>> createPostOrderVisitor(@NonNull final CS2ASConversion converter) {
    return new SpecificationCSPostOrderVisitor(converter);
  }
  
  @NonNull
  @Override
  protected LanguageSpecificationCSVisitor<Continuation<?>> createPreOrderVisitor(@NonNull final CS2ASConversion converter) {
    return new LanguageSpecificationCSPreOrderVisitor(converter);
  }
  
  @NonNull
  @Override
  protected CS2ASConversion createConversion(@NonNull final IDiagnosticConsumer diagnosticsConsumer, @NonNull final BaseCSResource csResource) {
    return new SpecificationCS2PivotConversion(this, diagnosticsConsumer, this.contextClass);
  }
}
