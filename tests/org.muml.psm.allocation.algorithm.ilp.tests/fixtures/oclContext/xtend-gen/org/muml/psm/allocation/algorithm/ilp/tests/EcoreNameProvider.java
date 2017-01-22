package org.muml.psm.allocation.algorithm.ilp.tests;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.muml.psm.allocation.language.as.NameProvider;

@SuppressWarnings("all")
public class EcoreNameProvider extends EObjectImpl implements NameProvider {
  private final static String unexpectedElement = "Unable to provide name for %s";
  
  private final static String unexpectedContainmentHierarchy = "Did not expect %s in containment hierarchy of %s";
  
  @Override
  public String getName(final Object element) {
    return this.getNameFor(element);
  }
  
  protected String _getNameFor(final Object element) {
    String _format = String.format(EcoreNameProvider.unexpectedElement, element);
    throw new IllegalArgumentException(_format);
  }
  
  protected String _getNameFor(final ENamedElement namedElement) {
    String _xblockexpression = null;
    {
      final StringBuilder builder = new StringBuilder();
      EObject object = namedElement;
      do {
        {
          int _length = builder.length();
          boolean _greaterThan = (_length > 0);
          if (_greaterThan) {
            builder.insert(0, ".");
          }
          if ((!(object instanceof ENamedElement))) {
            String _format = String.format(EcoreNameProvider.unexpectedContainmentHierarchy, object, namedElement);
            throw new IllegalStateException(_format);
          }
          String _name = ((ENamedElement) object).getName();
          builder.insert(0, _name);
          EObject _eContainer = object.eContainer();
          object = _eContainer;
        }
      } while((!Objects.equal(object, null)));
      _xblockexpression = builder.toString();
    }
    return _xblockexpression;
  }
  
  public String getNameFor(final Object namedElement) {
    if (namedElement instanceof ENamedElement) {
      return _getNameFor((ENamedElement)namedElement);
    } else if (namedElement != null) {
      return _getNameFor(namedElement);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(namedElement).toString());
    }
  }
}
