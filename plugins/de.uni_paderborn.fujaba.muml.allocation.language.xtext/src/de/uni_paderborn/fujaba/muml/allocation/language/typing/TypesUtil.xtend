package de.uni_paderborn.fujaba.muml.allocation.language.typing

import de.uni_paderborn.fujaba.muml.allocation.language.cs.ComponentResourceTupleDescriptorCS
import de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS
import de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationTupleDescriptorCS
import de.uni_paderborn.fujaba.muml.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS
import de.uni_paderborn.fujaba.muml.allocation.language.cs.ResourceConstraintCS
import de.uni_paderborn.fujaba.muml.allocation.language.cs.WeightingComponentResourceTupleElementCS
import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.HwresourceinstancePackage
import de.uni_paderborn.fujaba.muml.instance.InstancePackage
import java.util.List
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
import de.uni_paderborn.fujaba.muml.allocation.language.cs.QoSDimensionCS

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
	public static def Type getType(MetaModelManager metaModelManager, EClass eClass) {
		val IdResolver idResolver = metaModelManager.idResolver
		val DomainType domainType = idResolver.getType(eClass)
		metaModelManager.getType(domainType)
	}
	
	@NonNull
	public static def Type getRealType(MetaModelManager metaModelManager) {
		val IdResolver idResolver = metaModelManager.idResolver
		val DomainType domainType = idResolver.standardLibrary.realType
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
	
	public static def conformsTo(MetaModelManager metaModelManager, Type actualType, Type expectedType) {
		metaModelManager.conformsTo(actualType, expectedType, null);
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
	
	@NonNull static def Map<String, EClass>createNamedPartsFromComponentResourceTupleDescriptors(
		List<ComponentResourceTupleDescriptorCS> tupleDescriptorList) {
		val namedParts = <String, EClass>newHashMap()
		tupleDescriptorList.forEach[t |
			namedParts.putAll(#{
				t.instance -> InstancePackage.Literals.COMPONENT_INSTANCE,
				t.hwresinstance -> HwresourceinstancePackage.Literals.RESOURCE_INSTANCE
			})
		]
		namedParts
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
		val namedParts = createNamedPartsFromComponentResourceTupleDescriptors(tupleDescriptorList)
		createTupleTypeHelper(metaModelManager, namedParts)
	}
	
	@NonNull static def Type createReqHWResInstanceConstraintType(RequiredHardwareResourceInstanceConstraintCS constraintCS) {
		val MetaModelManager metaModelManager = getMetaModelManager(constraintCS)
		createSetType(metaModelManager,
			createReqHWResInstanceConstraintTupleType(metaModelManager, constraintCS.tupleDescriptors)
		)
	}
	
	// resource constraint
	@NonNull static def TupleType createResourceConstraintInnerTupleType(ResourceConstraintCS constraintCS) {
		val MetaModelManager metaModelManager = getMetaModelManager(constraintCS)
		createWeightingComponentResourceTupleElementCSTupleType(metaModelManager, constraintCS)
	}
	
	@NonNull static def TupleType createResourceConstraintOuterTupleType(MetaModelManager metaModelManager, ResourceConstraintCS constraintCS) {
		val Type innerTupleType = createWeightingComponentResourceTupleElementCSTupleType(metaModelManager, constraintCS)
		val Map<String, Type> namedParts = #{
			constraintCS.weighting.value -> createSetType(metaModelManager, innerTupleType),
			constraintCS.rhs.value -> getRealType(metaModelManager)
		}
		createTupleType(metaModelManager, namedParts)
	}
	
	@NonNull static def TupleType createResourceConstraintOuterTupleType(ResourceConstraintCS constraintCS) {
		val MetaModelManager metaModelManager = getMetaModelManager(constraintCS)
		createResourceConstraintOuterTupleType(metaModelManager, constraintCS)
	}
	
	@NonNull static def Type createResourceConstraintType(ResourceConstraintCS constraintCS) {
		val MetaModelManager metaModelManager = getMetaModelManager(constraintCS)
		createSetType(metaModelManager,
			createResourceConstraintOuterTupleType(metaModelManager, constraintCS)
		)
	}
	
	// QoS dimension
	@NonNull static def TupleType createQoSDimensionTupleType(QoSDimensionCS qosDimensionCS) {
		val MetaModelManager metaModelManager = getMetaModelManager(qosDimensionCS)
		createWeightingComponentResourceTupleElementCSTupleType(metaModelManager, qosDimensionCS)
	}

	@NonNull static def Type createQoSDimensionType(QoSDimensionCS qosDimensionCS) {
		val MetaModelManager metaModelManager = getMetaModelManager(qosDimensionCS)
		createSetType(metaModelManager,  
			createWeightingComponentResourceTupleElementCSTupleType(metaModelManager, qosDimensionCS)
		)
	}
	
	@NonNull static def TupleType createWeightingComponentResourceTupleElementCSTupleType(MetaModelManager metaModelManager, WeightingComponentResourceTupleElementCS elementCS) {
		var Map<String, Type> namedParts = <String, Type>newHashMap()
		namedParts.putAll(createNamedPartsFromComponentResourceTupleDescriptors(elementCS.tupleDescriptors)
			.mapValues[EClass eClass | getType(metaModelManager, eClass)])
		namedParts.put(elementCS.weighting.value, getRealType(metaModelManager))
		createTupleType(metaModelManager, namedParts)
	}
}