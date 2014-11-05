package de.uni_paderborn.fujaba.muml.allocation.language.cs2as;

import com.google.common.base.Objects;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.ConstraintCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.EvaluatableElementCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.QoSDimensionCS;
import de.uni_paderborn.fujaba.muml.allocation.language.visitor.LanguageSpecificationCSPostOrderVisitor;
import java.util.Collections;
import java.util.List;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.pivot.ExpressionInOCL;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.ocl.examples.xtext.base.cs2as.BasicContinuation;
import org.eclipse.ocl.examples.xtext.base.cs2as.CS2PivotConversion;
import org.eclipse.ocl.examples.xtext.base.cs2as.Continuation;
import org.eclipse.ocl.examples.xtext.base.cs2as.Dependency;
import org.eclipse.ocl.examples.xtext.base.cs2as.SingleContinuation;
import org.eclipse.ocl.examples.xtext.essentialocl.cs2as.EssentialOCLCSPostOrderVisitor;
import org.eclipse.ocl.examples.xtext.essentialocl.essentialoclcs.ContextCS;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SpecificationCSPostOrderVisitor extends LanguageSpecificationCSPostOrderVisitor {
  protected static class PreContextCSCompletion extends SingleContinuation<EvaluatableElementCS> {
    private final static String MISSING_ContextCSCompletion = "Expected an instance of type ContextCSCompletion in %s";
    
    public PreContextCSCompletion(final CS2PivotConversion context, final EvaluatableElementCS csElement) {
      super(context, null, null, csElement, Collections.<Dependency>emptyList());
    }
    
    public BasicContinuation<?> execute() {
      Object _xblockexpression = null;
      {
        ContextCS _expression = this.csElement.getExpression();
        final ExpressionInOCL expressionInOCL = PivotUtil.<ExpressionInOCL>getPivot(
          ExpressionInOCL.class, _expression);
        this.context.refreshContextVariable(expressionInOCL);
        _xblockexpression = null;
      }
      return ((BasicContinuation<?>)_xblockexpression);
    }
    
    public void addTo(@NonNull final List<BasicContinuation<?>> simpleContinuations) {
      final Function1<BasicContinuation<?>, Boolean> _function = new Function1<BasicContinuation<?>, Boolean>() {
        public Boolean apply(final BasicContinuation<?> it) {
          return Boolean.valueOf((it instanceof EssentialOCLCSPostOrderVisitor.ContextCSCompletion));
        }
      };
      final BasicContinuation<?> elm = IterableExtensions.<BasicContinuation<?>>findFirst(simpleContinuations, _function);
      boolean _equals = Objects.equal(elm, null);
      if (_equals) {
        String _format = String.format(SpecificationCSPostOrderVisitor.PreContextCSCompletion.MISSING_ContextCSCompletion, simpleContinuations);
        throw new IllegalStateException(_format);
      }
      int _indexOf = simpleContinuations.indexOf(elm);
      simpleContinuations.add(_indexOf, this);
    }
  }
  
  public SpecificationCSPostOrderVisitor(final CS2PivotConversion context) {
    super(context);
  }
  
  public Continuation<?> visitEvaluatableElementCS(@NonNull final EvaluatableElementCS csElement) {
    return new SpecificationCSPostOrderVisitor.PreContextCSCompletion(this.context, csElement);
  }
  
  public Continuation<?> visitConstraintCS(@NonNull final ConstraintCS csElement) {
    Continuation<?> _xblockexpression = null;
    {
      super.visitConstraintCS(csElement);
      _xblockexpression = this.visitEvaluatableElementCS(((EvaluatableElementCS) csElement));
    }
    return _xblockexpression;
  }
  
  public Continuation<?> visitQoSDimensionCS(@NonNull final QoSDimensionCS csElement) {
    Continuation<?> _xblockexpression = null;
    {
      super.visitQoSDimensionCS(csElement);
      _xblockexpression = this.visitEvaluatableElementCS(((EvaluatableElementCS) csElement));
    }
    return _xblockexpression;
  }
}
