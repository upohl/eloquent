package org.muml.psm.allocation.language.xtext.cs2as;

import com.google.common.base.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.Type;
import org.eclipse.ocl.pivot.utilities.PivotConstants;
import org.eclipse.ocl.xtext.base.cs2as.CS2AS;
import org.eclipse.ocl.xtext.base.cs2as.CS2ASConversion;
import org.eclipse.xtext.diagnostics.IDiagnosticConsumer;
import org.muml.psm.allocation.language.as.OCLContext;
import org.muml.psm.allocation.language.as.Specification;

@SuppressWarnings("all")
public class SpecificationCS2PivotConversion extends CS2ASConversion {
  public SpecificationCS2PivotConversion(final CS2AS converter, final IDiagnosticConsumer diagnosticsConsumer) {
    super(converter, diagnosticsConsumer);
  }
  
  @Override
  public void refreshContextVariable(final ExpressionInOCL pivotSpecification) {
    Specification specification = null;
    if (((!Objects.equal(pivotSpecification.eContainer(), null)) && (!Objects.equal(pivotSpecification.eContainer().eContainer(), null)))) {
      EObject _eContainer = pivotSpecification.eContainer();
      final EObject container = _eContainer.eContainer();
      if ((container instanceof Specification)) {
        specification = ((Specification) container);
      } else {
        if (((!Objects.equal(container, null)) && (container.eContainer() instanceof Specification))) {
          EObject _eContainer_1 = container.eContainer();
          specification = ((Specification) _eContainer_1);
        }
      }
    }
    boolean _notEquals = (!Objects.equal(specification, null));
    if (_notEquals) {
      OCLContext _oclContext = specification.getOclContext();
      Type _type = _oclContext.getType();
      this.setContextVariable(pivotSpecification, PivotConstants.SELF_NAME, _type, null);
    } else {
      super.refreshContextVariable(pivotSpecification);
    }
  }
}
