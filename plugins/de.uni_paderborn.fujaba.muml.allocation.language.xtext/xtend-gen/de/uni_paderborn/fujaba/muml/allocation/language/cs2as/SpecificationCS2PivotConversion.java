package de.uni_paderborn.fujaba.muml.allocation.language.cs2as;

import de.uni_paderborn.fujaba.muml.allocation.language.as.EvaluatableElement;
import de.uni_paderborn.fujaba.muml.allocation.language.typing.TypesUtil;
import java.util.Collection;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.pivot.Environment;
import org.eclipse.ocl.examples.pivot.ExpressionInOCL;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2Pivot;
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.utilities.BaseCSResource;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;

@SuppressWarnings("all")
public class SpecificationCS2PivotConversion extends CS2PivotConversion {
  private EClass contextClass;
  
  public SpecificationCS2PivotConversion(final CS2Pivot converter, final IDiagnosticConsumer diagnosticsConsumer, final Collection<? extends BaseCSResource> csResources, final EClass contextClass) {
    super(converter, diagnosticsConsumer, csResources);
    this.contextClass = contextClass;
  }
  
  public void refreshContextVariable(@NonNull final ExpressionInOCL pivotSpecification) {
    EObject _eContainer = pivotSpecification.eContainer();
    if ((_eContainer instanceof EvaluatableElement)) {
      final Type contextType = TypesUtil.getType(this.metaModelManager, this.contextClass);
      this.setContextVariable(pivotSpecification, Environment.SELF_VARIABLE_NAME, contextType);
    } else {
      super.refreshContextVariable(pivotSpecification);
    }
  }
}
