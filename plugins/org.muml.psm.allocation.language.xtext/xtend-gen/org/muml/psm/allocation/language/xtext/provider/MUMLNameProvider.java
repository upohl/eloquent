package org.muml.psm.allocation.language.xtext.provider;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pim.instance.StructuredComponentInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.pm.hardware.hwresourceinstance.ResourceInstance;
import org.muml.psm.allocation.language.as.NameProvider;

/**
 * MUML-specific NameProvider. Currently, it only ComponentInstances
 * and ResourceInstances are supported.
 */
@SuppressWarnings("all")
public class MUMLNameProvider extends EObjectImpl implements NameProvider {
  private final static String unexpectedElement = "Unable to provide name for %s";
  
  @Override
  public String getName(final Object element) {
    return this.getNameFor(element);
  }
  
  protected String _getNameFor(final Object element) {
    String _format = String.format(MUMLNameProvider.unexpectedElement, element);
    throw new IllegalArgumentException(_format);
  }
  
  protected String _getNameFor(final ComponentInstance componentInstance) {
    String _xblockexpression = null;
    {
      final StringBuilder builder = new StringBuilder();
      ComponentInstance instance = componentInstance;
      do {
        {
          int _length = builder.length();
          boolean _greaterThan = (_length > 0);
          if (_greaterThan) {
            builder.insert(0, ".");
          }
          String _name = instance.getName();
          builder.insert(0, _name);
          ComponentInstanceConfiguration _parentCIC = instance.getParentCIC();
          StructuredComponentInstance _parentStructuredComponentInstance = _parentCIC.getParentStructuredComponentInstance();
          instance = _parentStructuredComponentInstance;
        }
      } while((!Objects.equal(instance, null)));
      _xblockexpression = builder.toString();
    }
    return _xblockexpression;
  }
  
  protected String _getNameFor(final ResourceInstance resourceInstance) {
    String _xblockexpression = null;
    {
      String _name = resourceInstance.getName();
      final StringBuilder builder = new StringBuilder(_name);
      EObject _eContainer = resourceInstance.eContainer();
      HWPlatformInstance hpi = ((HWPlatformInstanceConfiguration) _eContainer).getParentHWPlatformInstance();
      do {
        {
          int _length = builder.length();
          boolean _greaterThan = (_length > 0);
          if (_greaterThan) {
            builder.insert(0, ".");
          }
          String _name_1 = hpi.getName();
          builder.insert(0, _name_1);
          HWPlatformInstanceConfiguration _parentHPIC = hpi.getParentHPIC();
          HWPlatformInstance _parentHWPlatformInstance = _parentHPIC.getParentHWPlatformInstance();
          hpi = _parentHWPlatformInstance;
        }
      } while((!Objects.equal(hpi, null)));
      _xblockexpression = builder.toString();
    }
    return _xblockexpression;
  }
  
  public String getNameFor(final Object componentInstance) {
    if (componentInstance instanceof ComponentInstance) {
      return _getNameFor((ComponentInstance)componentInstance);
    } else if (componentInstance instanceof ResourceInstance) {
      return _getNameFor((ResourceInstance)componentInstance);
    } else if (componentInstance != null) {
      return _getNameFor(componentInstance);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(componentInstance).toString());
    }
  }
}
