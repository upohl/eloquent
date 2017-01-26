package org.muml.psm.allocation.language.xtext.provider;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pm.hardware.hwplatforminstance.HWPlatformInstanceConfiguration;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;
import org.muml.psm.allocation.Allocation;
import org.muml.psm.allocation.AllocationFactory;
import org.muml.psm.allocation.SystemAllocation;
import org.muml.psm.allocation.language.as.StorageProvider;
import org.muml.psm.allocation.language.oclcontext.OCLContext;

/**
 * MUML-specific StorageProvider. Currently, only ComponentInstances
 * can be related to StructuredResourceInstances
 */
@SuppressWarnings("all")
public class MUMLStorageProvider extends EObjectImpl implements StorageProvider {
  private final static String illegalContext = "Got an illegal context: %s";
  
  private final static String illegalPair = "Unable to store relation: %s to %s";
  
  protected SystemAllocation systemAllocation;
  
  @Override
  public void initialize(final Object context) {
    if ((!(context instanceof OCLContext))) {
      String _format = String.format(MUMLStorageProvider.illegalContext, context);
      throw new IllegalArgumentException(_format);
    }
    final OCLContext oclContext = ((OCLContext) context);
    SystemAllocation _createSystemAllocation = AllocationFactory.eINSTANCE.createSystemAllocation();
    this.systemAllocation = _createSystemAllocation;
    ComponentInstanceConfiguration _componentInstanceConfiguration = oclContext.getComponentInstanceConfiguration();
    this.systemAllocation.setCic(_componentInstanceConfiguration);
    HWPlatformInstanceConfiguration _hardwarePlatformInstanceConfiguration = oclContext.getHardwarePlatformInstanceConfiguration();
    this.systemAllocation.setHpic(_hardwarePlatformInstanceConfiguration);
  }
  
  @Override
  public Object store(final Object source, final Object target) {
    return this.storePair(source, target);
  }
  
  protected SystemAllocation _storePair(final Object source, final Object target) {
    String _format = String.format(MUMLStorageProvider.illegalPair, source, target);
    throw new IllegalArgumentException(_format);
  }
  
  protected SystemAllocation _storePair(final ComponentInstance source, final StructuredResourceInstance target) {
    SystemAllocation _xblockexpression = null;
    {
      final Allocation allocation = AllocationFactory.eINSTANCE.createAllocation();
      allocation.setComponentInstance(source);
      allocation.setResourceInstance(target);
      EList<Allocation> _allocations = this.systemAllocation.getAllocations();
      _allocations.add(allocation);
      _xblockexpression = this.systemAllocation;
    }
    return _xblockexpression;
  }
  
  @Override
  public Object noRelationFound() {
    return this.systemAllocation;
  }
  
  public SystemAllocation storePair(final Object source, final Object target) {
    if (source instanceof ComponentInstance
         && target instanceof StructuredResourceInstance) {
      return _storePair((ComponentInstance)source, (StructuredResourceInstance)target);
    } else if (source != null
         && target != null) {
      return _storePair(source, target);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(source, target).toString());
    }
  }
}
