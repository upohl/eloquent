package org.muml.psm.allocation.language.xtext.typing

import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.jdt.annotation.NonNull
import org.eclipse.ocl.pivot.CollectionType
import org.eclipse.ocl.pivot.TupleType
import org.eclipse.ocl.pivot.Type
import org.eclipse.ocl.pivot.ids.IdResolver
import org.eclipse.ocl.pivot.internal.manager.TupleTypeManager
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal
import org.eclipse.ocl.pivot.values.TemplateParameterSubstitutions
import org.muml.pim.instance.InstancePackage
import org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage
import org.muml.psm.allocation.language.cs.ComponentResourceTupleDescriptorCS
import org.muml.psm.allocation.language.cs.EvaluatableElementCS
import org.muml.psm.allocation.language.cs.LocationConstraintCS
import org.muml.psm.allocation.language.cs.LocationTupleDescriptorCS
import org.muml.psm.allocation.language.cs.QoSDimensionCS
import org.muml.psm.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS
import org.muml.psm.allocation.language.cs.ResourceConstraintCS
import org.muml.psm.allocation.language.cs.WeightingComponentResourceTupleElementCS

class TypesUtil {
	private static final String missingEnvFac = "An EnvironmentFactory should be associated with %s"
	private static final String tupleName = "Tuple"
	
	/*@NonNull*/
	public static def TupleType createTupleTypeHelper(EnvironmentFactoryInternal envFactory, Map<String, EClass> namedParts) {
		val Map<String, Type> newNamedParts = namedParts.mapValues[EClass eClass |
			getType(envFactory, eClass)
		]
		createTupleType(envFactory, newNamedParts)
	}
	
	/*@NonNull*/ static def TupleType createTupleType(EnvironmentFactoryInternal envFactory, Map<String, Type> namedParts) {
		val TupleTypeManager tupleTypeManager = envFactory.completeModel.tupleManager
		tupleTypeManager.getTupleType(tupleName, namedParts)
	}
	
	/*@NonNull*/
	public static def Type getType(EnvironmentFactoryInternal envFactory, EClass eClass) {
		// XXX: eek mmm -> envFac
		val IdResolver idResolver = envFactory.idResolver
		idResolver.getType(eClass)
	}
	
	/*@NonNull*/
	public static def Type getRealType(EnvironmentFactoryInternal envFactory) {
		envFactory.standardLibrary.realType
	}
		
	/*@NonNull*/
	public static def CollectionType createSetType(EnvironmentFactoryInternal envFactory, Type type) {
		envFactory.completeEnvironment.getSetType(type, false, null, null)
	}
	
	/*@NonNull*/
	static def EnvironmentFactoryInternal getEnvironmentFactory(EObject object) {
		val EnvironmentFactoryInternal envFactory = PivotUtilInternal.findEnvironmentFactory(object)
		if (envFactory == null) {
			throw new IllegalStateException(String.format(missingEnvFac, object))
		}
		envFactory
	}
	
	public static def conformsTo(EnvironmentFactoryInternal envFactory, Type actualType, Type expectedType) {
		envFactory.metamodelManager.conformsTo(actualType, TemplateParameterSubstitutions.EMPTY,
			expectedType, TemplateParameterSubstitutions.EMPTY)
	}
	
	// language specific constraint types are created below
	
	// location constraint
	
	/*@NonNull*/
	public static def TupleType createLocationConstraintTupleType(LocationConstraintCS locationConstraintCS) {
		createLocationConstraintTupleType(getEnvironmentFactory(locationConstraintCS),
			locationConstraintCS.tupleDescriptor
		)
	}
	
	/*@NonNull*/
	public static def TupleType createLocationConstraintTupleType(EnvironmentFactoryInternal envFactory, LocationTupleDescriptorCS tupleDescriptor) {
		val namedParts =  #{tupleDescriptor.instance -> InstancePackage.Literals.COMPONENT_INSTANCE,
			tupleDescriptor.secondInstance -> InstancePackage.Literals.COMPONENT_INSTANCE
		}
		createTupleTypeHelper(envFactory, namedParts)
	}
	
	/*@NonNull*/
	public static def Type createLocationConstraintType(LocationConstraintCS locationConstraintCS) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(locationConstraintCS) 
		createSetType(envFactory,
			createLocationConstraintTupleType(envFactory, locationConstraintCS.tupleDescriptor)
		)
	}
	
	// requiredHardwareResourceInstance constraint
	/*@NonNull*/ static def TupleType createReqHWResInstanceConstraintTupleType(RequiredHardwareResourceInstanceConstraintCS constraintCS) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(constraintCS)
		createReqHWResInstanceConstraintTupleType(envFactory,
			constraintCS.tupleDescriptors
		)
	}
	
	/*@NonNull*/ static def Map<String, EClass>createNamedPartsFromComponentResourceTupleDescriptors(
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
	
	/*@NonNull*/ static def TupleType createReqHWResInstanceConstraintTupleType(EnvironmentFactoryInternal envFactory, 
		List<ComponentResourceTupleDescriptorCS> tupleDescriptorList) {
		/*val namedParts = <String, Type>newHashMap()
		tupleDescriptorList.forEach[t |
			namedParts.putAll(#{
				t.instance -> getType(metaModelManager, InstancePackage.Literals.COMPONENT_INSTANCE),
				t.hwresinstance -> createSetType(metaModelManager,
					getType(metaModelManager, HwresourceinstancePackage.Literals.RESOURCE_INSTANCE))
		})]*/
		val namedParts = createNamedPartsFromComponentResourceTupleDescriptors(tupleDescriptorList)
		createTupleTypeHelper(envFactory, namedParts)
	}
	
	/*@NonNull*/ static def Type createReqHWResInstanceConstraintType(RequiredHardwareResourceInstanceConstraintCS constraintCS) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(constraintCS)
		createSetType(envFactory,
			createReqHWResInstanceConstraintTupleType(envFactory, constraintCS.tupleDescriptors)
		)
	}
	
	// resource constraint
	/*@NonNull*/ static def TupleType createResourceConstraintInnerTupleType(ResourceConstraintCS constraintCS) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(constraintCS)
		createWeightingComponentResourceTupleElementCSTupleType(envFactory, constraintCS)
	}
	
	/*@NonNull*/ static def TupleType createResourceConstraintOuterTupleType(EnvironmentFactoryInternal envFactory, ResourceConstraintCS constraintCS) {
		val Type innerTupleType = createWeightingComponentResourceTupleElementCSTupleType(envFactory, constraintCS)
		val Map<String, Type> namedParts = #{
			constraintCS.weighting.value -> createSetType(envFactory, innerTupleType),
			constraintCS.rhs.value -> getRealType(envFactory)
		}
		createTupleType(envFactory, namedParts)
	}
	
	/*@NonNull*/ static def TupleType createResourceConstraintOuterTupleType(ResourceConstraintCS constraintCS) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(constraintCS)
		createResourceConstraintOuterTupleType(envFactory, constraintCS)
	}
	
	/*@NonNull*/ static def Type createResourceConstraintType(ResourceConstraintCS constraintCS) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(constraintCS)
		createSetType(envFactory,
			createResourceConstraintOuterTupleType(envFactory, constraintCS)
		)
	}
	
	// QoS dimension
	/*@NonNull*/ static def TupleType createQoSDimensionTupleType(QoSDimensionCS qosDimensionCS) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(qosDimensionCS)
		createWeightingComponentResourceTupleElementCSTupleType(envFactory, qosDimensionCS)
	}

	/*@NonNull*/ static def Type createQoSDimensionType(QoSDimensionCS qosDimensionCS) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(qosDimensionCS)
		createSetType(envFactory,  
			createWeightingComponentResourceTupleElementCSTupleType(envFactory, qosDimensionCS)
		)
	}
	
	/*@NonNull*/ static def TupleType createWeightingComponentResourceTupleElementCSTupleType(EnvironmentFactoryInternal envFactory, WeightingComponentResourceTupleElementCS elementCS) {
		var Map<String, Type> namedParts = <String, Type>newHashMap()
		namedParts.putAll(createNamedPartsFromComponentResourceTupleDescriptors(elementCS.tupleDescriptors)
			.mapValues[EClass eClass | getType(envFactory, eClass)])
		namedParts.put(elementCS.weighting.value, getRealType(envFactory))
		createTupleType(envFactory, namedParts)
	}
	
	// for convenience:
	
	static def dispatch createType(EvaluatableElementCS element) {
		throw new IllegalArgumentException("unexpected element: " + element)
	}
	
	static def dispatch createType(LocationConstraintCS constraintCS) {
		createLocationConstraintType(constraintCS)
	}
	
	static def dispatch createType(RequiredHardwareResourceInstanceConstraintCS constraintCS) {
		createReqHWResInstanceConstraintType(constraintCS)
	}
	
	static def dispatch createType(ResourceConstraintCS constraintCS) {
		createResourceConstraintType(constraintCS)
	}
	
	static def dispatch createType(QoSDimensionCS qosDimensionCS) {
		createQoSDimensionType(qosDimensionCS)
	}
}