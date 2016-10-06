package org.muml.psm.allocation.language.xtext.typing

import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.ocl.pivot.CollectionType
import org.eclipse.ocl.pivot.TupleType
import org.eclipse.ocl.pivot.Type
import org.eclipse.ocl.pivot.ids.IdResolver
import org.eclipse.ocl.pivot.internal.manager.TupleTypeManager
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal
import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal
import org.eclipse.ocl.pivot.utilities.PivotUtil
import org.eclipse.ocl.pivot.values.TemplateParameterSubstitutions
import org.muml.psm.allocation.language.^as.LocationConstraint
import org.muml.psm.allocation.language.^as.QoSDimension
import org.muml.psm.allocation.language.^as.RequiredHardwareResourceInstanceConstraint
import org.muml.psm.allocation.language.^as.ResourceConstraint
import org.muml.psm.allocation.language.^as.TypedPair
import org.muml.psm.allocation.language.^as.WeightTupleDescriptor
import org.muml.psm.allocation.language.cs.EvaluatableElementCS
import org.muml.psm.allocation.language.cs.LocationConstraintCS
import org.muml.psm.allocation.language.cs.QoSDimensionCS
import org.muml.psm.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS
import org.muml.psm.allocation.language.cs.ResourceConstraintCS

class TypesUtil {
	private static final String missingEnvFac = "An EnvironmentFactory should be associated with %s"
	private static final String tupleName = "Tuple"
	
	/* will removed */
	/*@NonNull*/
	static def Type getType(EnvironmentFactoryInternal envFactory, EClass eClass) {
		// XXX: eek mmm -> envFac
		val IdResolver idResolver = envFactory.idResolver
		idResolver.getType(eClass)
	}
	
	/*@NonNull*/
	static def TupleType createTupleType(EnvironmentFactoryInternal envFactory, Map<String, Type> namedParts) {
		val TupleTypeManager tupleTypeManager = envFactory.completeModel.tupleManager
		tupleTypeManager.getTupleType(tupleName, namedParts)
	}
	
	/*@NonNull*/
	static def Type getRealType(EnvironmentFactoryInternal envFactory) {
		envFactory.standardLibrary.realType
	}
		
	/*@NonNull*/
	static def CollectionType createSetType(EnvironmentFactoryInternal envFactory, Type type) {
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
	
	static def boolean conformsTo(EnvironmentFactoryInternal envFactory, Type actualType, Type expectedType) {
		envFactory.metamodelManager.conformsTo(actualType, TemplateParameterSubstitutions.EMPTY,
			expectedType, TemplateParameterSubstitutions.EMPTY)
	}
	
	static def Map<String, Type> convertToNamedParts(List<TypedPair> typedPairs) {
		val namedParts = <String, Type>newHashMap()
		typedPairs.forEach[typedPair |
			namedParts.put(typedPair.first.name, typedPair.first.type)
			namedParts.put(typedPair.second.name, typedPair.second.type)
		]
		namedParts
	}
		
	// language specific constraint types are created below
	
	// location constraint
	
	/*@NonNull*/
	static def TupleType createLocationConstraintTupleType(EnvironmentFactoryInternal envFactory,
		LocationConstraintCS constraintCS
	) {
		val LocationConstraint constraint = PivotUtil.getPivot(typeof(LocationConstraint),
			constraintCS
		)
		val Map<String, Type> namedParts = convertToNamedParts(constraint.tupleDescriptor.typedPairs)
		createTupleType(envFactory, namedParts)
	}
	
	/*@NonNull*/
	static def Type createLocationConstraintType(LocationConstraintCS locationConstraintCS) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(locationConstraintCS)
		createSetType(envFactory,
			createLocationConstraintTupleType(envFactory, locationConstraintCS)
		)
	}
	
	/*@NonNull*/
	static def TupleType createReqHWResInstanceConstraintTupleType(EnvironmentFactoryInternal envFactory,
		RequiredHardwareResourceInstanceConstraintCS constraintCS
	) {
		val RequiredHardwareResourceInstanceConstraint constraint = PivotUtil.getPivot(typeof(RequiredHardwareResourceInstanceConstraint), constraintCS)
		val Map<String, Type> namedParts = convertToNamedParts(constraint.tupleDescriptor.typedPairs)
		createTupleType(envFactory, namedParts)
	}
	
	/*@NonNull*/
	static def Type createReqHWResInstanceConstraintType(RequiredHardwareResourceInstanceConstraintCS constraintCS) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(constraintCS)
		
		createSetType(envFactory,
			createReqHWResInstanceConstraintTupleType(envFactory, constraintCS)
		)
	}
	
	// resource constraint
	
	/*@NonNull*/
	static def TupleType createWeightTupleDescriptorTupleType(EnvironmentFactoryInternal envFactory,
		WeightTupleDescriptor tupleDescriptor
	) {
		val Map<String, Type> namedParts = convertToNamedParts(tupleDescriptor.typedPairs)
		namedParts.put(tupleDescriptor.weight, getRealType(envFactory))
		createTupleType(envFactory, namedParts)
	}
	
	/*@NonNull*/
	static def TupleType createResourceConstraintInnerTupleType(EnvironmentFactoryInternal envFactory,
		ResourceConstraintCS constraintCS
	) {
		val ResourceConstraint constraint = PivotUtil.getPivot(typeof(ResourceConstraint), constraintCS)
		createWeightTupleDescriptorTupleType(envFactory,
			constraint.tupleDescriptor
		)
	}
	
	/*@NonNull*/
	static def TupleType createResourceConstraintOuterTupleType(EnvironmentFactoryInternal envFactory,
		ResourceConstraintCS constraintCS
	) {
		val ResourceConstraint constraint = PivotUtil.getPivot(typeof(ResourceConstraint), constraintCS)
		val Type innerTupleType = createResourceConstraintInnerTupleType(
			envFactory, constraintCS
		)
		val Map<String, Type> outerNamedParts = #{
			constraint.tupleDescriptor.weight -> createSetType(envFactory, innerTupleType),
			constraint.tupleDescriptor.bound -> getRealType(envFactory)
		}
		return createTupleType(envFactory, outerNamedParts)
	}
	
	/*@NonNull*/
	static def Type createResourceConstraintType(ResourceConstraintCS constraintCS) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(constraintCS)
		createSetType(envFactory,
			createResourceConstraintOuterTupleType(envFactory, constraintCS)
		)
	}
	
	// QoS dimension
	/*@NonNull*/
	static def TupleType createQoSDimensionTupleType(EnvironmentFactoryInternal envFactory,
		QoSDimensionCS qosDimensionCS
	) {
		val QoSDimension qosDimension = PivotUtil.getPivot(typeof(QoSDimension), qosDimensionCS)
		createWeightTupleDescriptorTupleType(envFactory, qosDimension.tupleDescriptor)
	}
	
	/*@NonNull*/
	static def Type createQoSDimensionType(QoSDimensionCS qosDimensionCS) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(qosDimensionCS)
		createSetType(envFactory,  
			createQoSDimensionTupleType(envFactory, qosDimensionCS)
		)
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