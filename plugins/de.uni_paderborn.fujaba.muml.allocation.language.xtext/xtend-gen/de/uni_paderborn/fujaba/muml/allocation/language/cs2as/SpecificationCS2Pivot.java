package de.uni_paderborn.fujaba.muml.allocation.language.cs2as;

import de.uni_paderborn.fujaba.muml.allocation.language.cs.util.LanguageSpecificationCSVisitor;
import de.uni_paderborn.fujaba.muml.allocation.language.cs2as.SpecificationCS2PivotConversion;
import de.uni_paderborn.fujaba.muml.allocation.language.cs2as.SpecificationCSPostOrderVisitor;
import de.uni_paderborn.fujaba.muml.allocation.language.visitor.LanguageSpecificationCSContainmentVisitor;
import de.uni_paderborn.fujaba.muml.allocation.language.visitor.LanguageSpecificationCSLeft2RightVisitor;
import de.uni_paderborn.fujaba.muml.allocation.language.visitor.LanguageSpecificationCSPreOrderVisitor;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.resource.ASResource;
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2as.Continuation;
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCSResource;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2as.EssentialOCLCS2Pivot;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;

@SuppressWarnings("all")
public class SpecificationCS2Pivot extends EssentialOCLCS2Pivot {
  private EClass contextClass;
  
  public SpecificationCS2Pivot(final Map<? extends Resource, ? extends ASResource> cs2asResourceMap, final MetaModelManager metaModelManager, final EClass contextClass) {
    super(cs2asResourceMap, metaModelManager);
    this.contextClass = contextClass;
  }
  
  @NonNull
  protected LanguageSpecificationCSVisitor<Continuation<?>> createContainmentVisitor(@NonNull final CS2PivotConversion converter) {
    return new LanguageSpecificationCSContainmentVisitor(converter);
  }
  
  @NonNull
  protected LanguageSpecificationCSVisitor<Element> createLeft2RightVisitor(@NonNull final CS2PivotConversion converter) {
    return new LanguageSpecificationCSLeft2RightVisitor(converter);
  }
  
  @NonNull
  protected LanguageSpecificationCSVisitor<Continuation<?>> createPostOrderVisitor(@NonNull final CS2PivotConversion converter) {
    return new SpecificationCSPostOrderVisitor(converter);
  }
  
  @NonNull
  protected LanguageSpecificationCSVisitor<Continuation<?>> createPreOrderVisitor(@NonNull final CS2PivotConversion converter) {
    return new LanguageSpecificationCSPreOrderVisitor(converter);
  }
  
  @NonNull
  protected CS2PivotConversion createConversion(@NonNull final IDiagnosticConsumer diagnosticsConsumer, @NonNull final Collection<? extends BaseCSResource> csResources) {
    return new SpecificationCS2PivotConversion(this, diagnosticsConsumer, csResources, this.contextClass);
  }
}
