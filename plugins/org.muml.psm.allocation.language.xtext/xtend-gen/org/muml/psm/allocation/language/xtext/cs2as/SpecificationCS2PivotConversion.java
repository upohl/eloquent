package org.muml.psm.allocation.language.xtext.cs2as;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.utilities.PivotConstants;
import org.eclipse.ocl.xtext.base.cs2as.CS2AS;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.muml.psm.allocation.language.as.EvaluatableElement;
import org.muml.psm.allocation.language.xtext.typing.TypesUtil;

@SuppressWarnings("all")
public class SpecificationCS2PivotConversion extends CS2ASConversion {
  private EClass contextClass;
  
  public SpecificationCS2PivotConversion(final CS2AS converter, final IDiagnosticConsumer diagnosticsConsumer, final EClass contextClass) {
    super(converter, diagnosticsConsumer);
    this.contextClass = contextClass;
  }
  
  @Override
  public void refreshContextVariable(final ExpressionInOCL pivotSpecification) {
    EObject _eContainer = pivotSpecification.eContainer();
    if ((_eContainer instanceof EvaluatableElement)) {
      final Type contextType = TypesUtil.getType(this.environmentFactory, this.contextClass);
      this.setContextVariable(pivotSpecification, PivotConstants.SELF_NAME, contextType, null);
    } else {
      super.refreshContextVariable(pivotSpecification);
    }
  }
}
