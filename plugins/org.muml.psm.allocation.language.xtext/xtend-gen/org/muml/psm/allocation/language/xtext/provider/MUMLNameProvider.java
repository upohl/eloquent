package org.muml.psm.allocation.language.xtext.provider;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.muml.core.NamedElement;
import org.muml.pim.connector.ConnectorEndpointInstance;
import org.muml.pim.instance.AssemblyConnectorInstance;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.instance.StructuredComponentInstance;
import org.muml.pm.hardware.hwplatforminstance.BusInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstance;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HWPortInstance;
import org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance;
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
  
  protected String _getNameFor(final AssemblyConnectorInstance connectorInstance) {
    String _xblockexpression = null;
    {
      EList<ConnectorEndpointInstance> _connectorEndpointInstances = connectorInstance.getConnectorEndpointInstances();
      ConnectorEndpointInstance _get = _connectorEndpointInstances.get(0);
      final PortInstance a = ((PortInstance) _get);
      EList<ConnectorEndpointInstance> _connectorEndpointInstances_1 = connectorInstance.getConnectorEndpointInstances();
      ConnectorEndpointInstance _get_1 = _connectorEndpointInstances_1.get(1);
      final PortInstance b = ((PortInstance) _get_1);
      ComponentInstance _componentInstance = a.getComponentInstance();
      String _nameFor = this.getNameFor(_componentInstance);
      String _plus = (_nameFor + ".port.");
      String _safeName = this.safeName(a);
      String _plus_1 = (_plus + _safeName);
      String _plus_2 = (_plus_1 + ".ATo.");
      ComponentInstance _componentInstance_1 = b.getComponentInstance();
      String _nameFor_1 = this.getNameFor(_componentInstance_1);
      String _plus_3 = (_plus_2 + _nameFor_1);
      String _plus_4 = (_plus_3 + ".port");
      String _safeName_1 = this.safeName(b);
      final String name = (_plus_4 + _safeName_1);
      String _sanitize = this.sanitize(name);
      _xblockexpression = this.uniqueName(_sanitize, connectorInstance);
    }
    return _xblockexpression;
  }
  
  protected String _getNameFor(final NetworkConnectorInstance connectorInstance) {
    String _xblockexpression = null;
    {
      EList<ConnectorEndpointInstance> _connectorEndpointInstances = connectorInstance.getConnectorEndpointInstances();
      ConnectorEndpointInstance _get = _connectorEndpointInstances.get(0);
      String _safeName = this.safeName(_get);
      String _plus = (_safeName + ".NTo.");
      EList<ConnectorEndpointInstance> _connectorEndpointInstances_1 = connectorInstance.getConnectorEndpointInstances();
      ConnectorEndpointInstance _get_1 = _connectorEndpointInstances_1.get(1);
      String _safeName_1 = this.safeName(_get_1);
      final String name = (_plus + _safeName_1);
      String _sanitize = this.sanitize(name);
      _xblockexpression = this.uniqueName(_sanitize, connectorInstance);
    }
    return _xblockexpression;
  }
  
  private Map<String, EObject> name2Object = CollectionLiterals.<String, EObject>newHashMap();
  
  public String uniqueName(final String name, final EObject object) {
    String _xblockexpression = null;
    {
      final EObject existing = this.name2Object.get(name);
      if (((!Objects.equal(existing, null)) && (!Objects.equal(existing, object)))) {
        InputOutput.<String>println("### name collision ###");
        return this.uniqueName((name + "Unique"), object);
      }
      this.name2Object.put(name, object);
      _xblockexpression = name;
    }
    return _xblockexpression;
  }
  
  private Map<EObject, String> unnamedMap = CollectionLiterals.<EObject, String>newHashMap();
  
  private int unnamedCounter = 0;
  
  public String safeName(final NamedElement namedElement) {
    String _xblockexpression = null;
    {
      String _name = namedElement.getName();
      boolean _equals = Objects.equal(_name, null);
      if (_equals) {
        String s = this.unnamedMap.get(namedElement);
        boolean _notEquals = (!Objects.equal(s, null));
        if (_notEquals) {
          return s;
        }
        int _plusPlus = this.unnamedCounter++;
        String _plus = ("unnamedElement." + Integer.valueOf(_plusPlus));
        s = _plus;
        this.unnamedMap.put(namedElement, s);
        return s;
      }
      String name = namedElement.getName();
      if ((namedElement instanceof HWPortInstance)) {
        ResourceInstance _parentResourceInstance = ((HWPortInstance) namedElement).getParentResourceInstance();
        String _nameFor = this.getNameFor(_parentResourceInstance);
        String _plus_1 = (_nameFor + ".port.");
        String _name_1 = ((HWPortInstance)namedElement).getName();
        String _plus_2 = (_plus_1 + _name_1);
        name = _plus_2;
      } else {
        if ((namedElement instanceof BusInstance)) {
          String _name_2 = ((BusInstance)namedElement).getName();
          name = _name_2;
        }
      }
      _xblockexpression = name;
    }
    return _xblockexpression;
  }
  
  public String sanitize(final String data) {
    return data.replaceAll("[\\s\"\\-+*/<>=]", "W");
  }
  
  public String getNameFor(final Object connectorInstance) {
    if (connectorInstance instanceof AssemblyConnectorInstance) {
      return _getNameFor((AssemblyConnectorInstance)connectorInstance);
    } else if (connectorInstance instanceof NetworkConnectorInstance) {
      return _getNameFor((NetworkConnectorInstance)connectorInstance);
    } else if (connectorInstance instanceof ComponentInstance) {
      return _getNameFor((ComponentInstance)connectorInstance);
    } else if (connectorInstance instanceof ResourceInstance) {
      return _getNameFor((ResourceInstance)connectorInstance);
    } else if (connectorInstance != null) {
      return _getNameFor(connectorInstance);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(connectorInstance).toString());
    }
  }
}
