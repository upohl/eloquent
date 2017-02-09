package org.muml.psm.allocation.language.xtext.provider

import org.eclipse.emf.ecore.impl.EObjectImpl
import org.muml.pim.instance.AssemblyConnectorInstance
import org.muml.pim.instance.ComponentInstance
import org.muml.pm.hardware.hwplatforminstance.NetworkConnectorInstance
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance
import org.muml.psm.allocation.Allocation
import org.muml.psm.allocation.AllocationFactory
import org.muml.psm.allocation.SystemAllocation
import org.muml.psm.allocation.language.^as.StorageProvider
import org.muml.psm.allocation.language.oclcontext.OCLContext

/**
 * MUML-specific StorageProvider. Currently, only ComponentInstances
 * can be related to StructuredResourceInstances
 */
class MUMLStorageProvider extends EObjectImpl implements StorageProvider {
	
	private static final String illegalContext = "Got an illegal context: %s"
	private static final String illegalPair = "Unable to store relation: %s to %s"
	
	protected SystemAllocation systemAllocation
	
	override void initialize(Object context) {
		if (!(context instanceof OCLContext)) {
			throw new IllegalArgumentException(
				String.format(illegalContext, context)
			)
		}
		val oclContext = context as OCLContext
		systemAllocation = AllocationFactory.eINSTANCE.createSystemAllocation()
		systemAllocation.cic = oclContext.componentInstanceConfiguration
		systemAllocation.hpic = oclContext.hardwarePlatformInstanceConfiguration
	}
	
	override store(Object source, Object target) {
		storePair(source, target)
	}
	
	def dispatch SystemAllocation storePair(Object source, Object target) {
		throw new IllegalArgumentException(
			String.format(illegalPair, source, target)
		)
	}
	
	def dispatch SystemAllocation storePair(ComponentInstance source, StructuredResourceInstance target) {
		val Allocation allocation = AllocationFactory.eINSTANCE.createAllocation()
		allocation.componentInstance = source
		allocation.resourceInstance = target
		systemAllocation.allocations.add(allocation)
		systemAllocation
	}
	
	private MUMLNameProvider nameProvider = new MUMLNameProvider
	
	def dispatch SystemAllocation storePair(AssemblyConnectorInstance aci, NetworkConnectorInstance nci) {
		println(nameProvider.getName(aci) + " -> " + nameProvider.getName(nci))
		systemAllocation
	}
	
	override noRelationFound() {
		// return empty systemAllocation instance (for now we just do
		// this in order to pass the algorithMain/nonexistentAllocation
		// testcase)
		systemAllocation
	}
	
}