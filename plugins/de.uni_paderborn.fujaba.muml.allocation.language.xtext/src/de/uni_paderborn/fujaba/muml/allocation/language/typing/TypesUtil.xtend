package de.uni_paderborn.fujaba.muml.allocation.language.typing

import de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationTupleDescriptorCS
import de.uni_paderborn.fujaba.muml.instance.InstancePackage
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.jdt.annotation.NonNull
import org.eclipse.ocl.examples.domain.elements.DomainType
import org.eclipse.ocl.examples.domain.types.IdResolver
import org.eclipse.ocl.examples.pivot.CollectionType
import org.eclipse.ocl.examples.pivot.TupleType
import org.eclipse.ocl.examples.pivot.Type
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager
import org.eclipse.ocl.examples.pivot.manager.TupleTypeManager
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil
import de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS
import de.uni_paderborn.fujaba.muml.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS
import de.uni_paderborn.fujaba.muml.allocation.language.cs.ComponentResourceTupleDescriptorCS
import java.util.List
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage

class TypesUtil {
	private static final String tupleName = "Tuple"
	
	@NonNull
	public static def TupleType createTupleTypeHelper(MetaModelManager metaModelManager, Map<String, EClass> namedParts) {
		val Map<String, Type> newNamedParts = namedParts.mapValues[EClass eClass |
			getType(metaModelManager, eClass)
		]
		createTupleType(metaModelManager, newNamedParts)
	}
	
	@NonNull static def TupleType createTupleType(MetaModelManager metaModelManager, Map<String, Type> namedParts) {
		val TupleTypeManager tupleTypeManager = metaModelManager.tupleManager
		tupleTypeManager.getTupleType(tupleName, namedParts)
	}
	
	@NonNull
	private static def Type getType(MetaModelManager metaModelManager, EClass eClass) {
		val IdResolver idResolver = metaModelManager.idResolver
		val DomainType domainType = idResolver.getType(eClass)
		metaModelManager.getType(domainType)
	}
		
	@NonNull
	public static def CollectionType createSetType(MetaModelManager metaModelManager, Type type) {
		metaModelManager.getSetType(type, null, null)
	}
	
	@NonNull
	public static def MetaModelManager getMetaModelManager(EObject object) {
		val MetaModelManager metaModelManager = PivotUtil.findMetaModelManager(object)
		if (metaModelManager == null) {
			throw new IllegalStateException("A MetaModelManager should be associated with " + object)
		}
		metaModelManager
	}
	
	// language specific constraint types are created below
	
	// location constraint
	
	@NonNull
	public static def TupleType createLocationConstraintTupleType(LocationConstraintCS locationConstraintCS) {
		createLocationConstraintTupleType(getMetaModelManager(locationConstraintCS),
			locationConstraintCS.tupleDescriptor
		)
	}
	
	@NonNull
	public static def TupleType createLocationConstraintTupleType(MetaModelManager metaModelManager, LocationTupleDescriptorCS tupleDescriptor) {
		val namedParts =  #{tupleDescriptor.instance -> InstancePackage.Literals.COMPONENT_INSTANCE,
			tupleDescriptor.secondInstance -> InstancePackage.Literals.COMPONENT_INSTANCE
		}
		createTupleTypeHelper(metaModelManager, namedParts)
	}
	
	@NonNull
	public static def Type createLocationConstraintType(LocationConstraintCS locationConstraintCS) {
		val MetaModelManager metaModelManager = getMetaModelManager(locationConstraintCS) 
		createSetType(metaModelManager,
			createLocationConstraintTupleType(metaModelManager, locationConstraintCS.tupleDescriptor)
		)
	}
	
	// requiredHardwareResourceInstance constraint
	@NonNull static def TupleType createReqHWResInstanceConstraintTupleType(RequiredHardwareResourceInstanceConstraintCS constraintCS) {
		val MetaModelManager metaModelManager = getMetaModelManager(constraintCS)
		createReqHWResInstanceConstraintTupleType(metaModelManager,
			constraintCS.tupleDescriptors
		)
	}
	
	@NonNull static def TupleType createReqHWResInstanceConstraintTupleType(MetaModelManager metaModelManager, 
		List<ComponentResourceTupleDescriptorCS> tupleDescriptorList) {
		/*val namedParts = <String, Type>newHashMap()
		tupleDescriptorList.forEach[t |
			namedParts.putAll(#{
				t.instance -> getType(metaModelManager, InstancePackage.Literals.COMPONENT_INSTANCE),
				t.hwresinstance -> createSetType(metaModelManager,
					getType(metaModelManager, HwresourceinstancePackage.Literals.RESOURCE_INSTANCE))
		})]*/
		val namedParts = <String, EClass>newHashMap()
		tupleDescriptorList.forEach[t |
			namedParts.putAll(#{
				t.instance -> InstancePackage.Literals.COMPONENT_INSTANCE,
				t.hwresinstance -> HwresourceinstancePackage.Literals.RESOURCE_INSTANCE
			})
		]
		createTupleTypeHelper(metaModelManager, namedParts)
	}
	
	@NonNull static def Type createReqHWResInstanceConstraintType(RequiredHardwareResourceInstanceConstraintCS constraintCS) {
		val MetaModelManager metaModelManager = getMetaModelManager(constraintCS)
		createSetType(metaModelManager,
			createReqHWResInstanceConstraintTupleType(metaModelManager, constraintCS.tupleDescriptors)
		)
	}
}