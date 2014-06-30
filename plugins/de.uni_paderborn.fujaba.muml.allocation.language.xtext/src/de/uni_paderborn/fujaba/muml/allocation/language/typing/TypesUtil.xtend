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

class TypesUtil {
	private static final String tupleName = "Tuple"
	
	@NonNull
	public static def TupleType createTupleType(MetaModelManager metaModelManager, Map<String, EClass> namedParts) {
		val IdResolver idResolver = metaModelManager.idResolver
		val Map<String, Type> newNamedParts = namedParts.mapValues[EClass eClass |
			val DomainType domainType = idResolver.getType(eClass)
			metaModelManager.getType(domainType)
		]
		val TupleTypeManager tupleTypeManager = metaModelManager.tupleManager
		tupleTypeManager.getTupleType(tupleName, newNamedParts)
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
		createTupleType(metaModelManager, namedParts)
	}
	
	@NonNull
	public static def Type createLocationConstraintType(LocationConstraintCS locationConstraintCS) {
		val MetaModelManager metaModelManager = getMetaModelManager(locationConstraintCS) 
		createSetType(metaModelManager,
			createLocationConstraintTupleType(metaModelManager, locationConstraintCS.tupleDescriptor)
		)
	}
}