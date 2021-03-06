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
import org.eclipse.ocl.pivot.utilities.ValueUtil
import org.eclipse.ocl.pivot.values.IntegerValue
import org.eclipse.ocl.pivot.values.TemplateParameterSubstitutions
import org.muml.psm.allocation.language.^as.Bound
import org.muml.psm.allocation.language.^as.CoherenceConstraint
import org.muml.psm.allocation.language.^as.EvaluableElement
import org.muml.psm.allocation.language.^as.ForbiddenLocationConstraint
import org.muml.psm.allocation.language.^as.ImplicationConstraint
import org.muml.psm.allocation.language.^as.LocationConstraint
import org.muml.psm.allocation.language.^as.QoSDimension
import org.muml.psm.allocation.language.^as.Relation
import org.muml.psm.allocation.language.^as.ResourceConstraint
import org.muml.psm.allocation.language.^as.TupleDescriptor
import org.muml.psm.allocation.language.^as.TypedPair
import org.muml.psm.allocation.language.^as.WeightTupleDescriptor

class TypesUtil {
	private static final String missingEnvFac = "An EnvironmentFactory should be associated with %s"
	private static final String tupleName = "Tuple"
	private static final IntegerValue twoValue = ValueUtil.integerValueOf(2)
	
	/* will removed */
	/*@NonNull*/
	static def Type getType(EnvironmentFactoryInternal envFactory, EClass eClass) {
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
	static def Type getOclAnyType(EnvironmentFactoryInternal envFactory) {
		envFactory.standardLibrary.oclAnyType
	}
		
	/*@NonNull*/
	static def CollectionType createSetType(EnvironmentFactoryInternal envFactory, Type type) {
		envFactory.completeEnvironment.getSetType(type, false, null, null)
	}
	
	static def CollectionType createSequenceType(EnvironmentFactoryInternal envFactory, Type type) {
		envFactory.completeEnvironment.getSequenceType(type, false, twoValue, null)
	}
	
	/*@NonNull*/
	static def EnvironmentFactoryInternal getEnvironmentFactory(EObject object) {
		val EnvironmentFactoryInternal envFactory = PivotUtilInternal.findEnvironmentFactory(object)
		if (envFactory === null) {
			throw new IllegalStateException(String.format(missingEnvFac, object))
		}
		envFactory
	}
	
	static def boolean conformsTo(EnvironmentFactoryInternal envFactory, Type actualType, Type expectedType) {
		envFactory.metamodelManager.conformsTo(actualType, TemplateParameterSubstitutions.EMPTY,
			expectedType, TemplateParameterSubstitutions.EMPTY)
	}
	
	static def Map<String, Type> convertToNamedParts(TupleDescriptor tupleDescriptor, EnvironmentFactoryInternal envFactory) {
		if (tupleDescriptor.sequencePart !== null && !tupleDescriptor.sequencePart.equals("")) {
			convertToNamedSequencePart(tupleDescriptor.sequencePart, envFactory)
		} else {
			convertToNamedParts(tupleDescriptor.typedPairs)
		}
	}
	
	static def Map<String, Type> convertToNamedParts(List<TypedPair> typedPairs) {
		val namedParts = <String, Type>newHashMap()
		typedPairs.forEach[typedPair |
			namedParts.put(typedPair.first.name, typedPair.first.type)
			namedParts.put(typedPair.second.name, typedPair.second.type)
		]
		namedParts
	}
	
	static def Map<String, Type> convertToNamedSequencePart(String partName, EnvironmentFactoryInternal envFactory) {
		val namedParts = <String, Type>newHashMap()
		namedParts.put(partName, createSequenceType(envFactory,
			getOclAnyType(envFactory)
		))
		namedParts
	}
		
	// language specific constraint types are created below
	
	// relation
	
	/*@NonNull*/
	static def TupleType createRelationTupleType(EnvironmentFactoryInternal envFactory,
		Relation relation
	) {
		val Map<String, Type> namedParts = convertToNamedParts(relation.tupleDescriptor, envFactory)
		createTupleType(envFactory, namedParts)
	}
	
	/*@NonNull*/
	static def Type createRelationType(Relation relation) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(relation)
		createSetType(envFactory,
			createRelationTupleType(envFactory, relation)
		)
	}
	
	/*@NonNull*/
	static def Type createBoundType(Bound bound) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(bound)
		envFactory.metamodelManager.standardLibrary.integerType
	}
	
	// location constraint
	
	/*@NonNull*/
	static def TupleType createCoherenceConstraintTupleType(EnvironmentFactoryInternal envFactory,
		CoherenceConstraint constraint
	) {
		val Map<String, Type> namedParts = convertToNamedParts(constraint.tupleDescriptor, envFactory)
		createTupleType(envFactory, namedParts)
	}
		
	/*@NonNull*/
	static def Type createCoherenceConstraintType(CoherenceConstraint constraint) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(constraint)
		createSetType(envFactory,
			createCoherenceConstraintTupleType(envFactory, constraint)
		)
	}
	
	/*@NonNull*/
	static def TupleType createLocationConstraintTupleType(EnvironmentFactoryInternal envFactory,
		LocationConstraint constraint
	) {
		val Map<String, Type> namedParts = convertToNamedParts(constraint.tupleDescriptor, envFactory)
		createTupleType(envFactory, namedParts)
	}
	
	/*@NonNull*/
	static def Type createLocationConstraintType(LocationConstraint constraint) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(constraint)
		
		createSetType(envFactory,
			createLocationConstraintTupleType(envFactory, constraint)
		)
	}
	
	// resource constraint
	
	/*@NonNull*/
	static def TupleType createWeightTupleDescriptorTupleType(EnvironmentFactoryInternal envFactory,
		WeightTupleDescriptor tupleDescriptor
	) {
		val Map<String, Type> namedParts = convertToNamedParts(tupleDescriptor, envFactory)
		namedParts.put(tupleDescriptor.weight, getRealType(envFactory))
		createTupleType(envFactory, namedParts)
	}
	
	/*@NonNull*/
	static def TupleType createResourceConstraintInnerTupleType(EnvironmentFactoryInternal envFactory,
		ResourceConstraint constraint
	) {
		createWeightTupleDescriptorTupleType(envFactory,
			constraint.tupleDescriptor
		)
	}
	
	/*@NonNull*/
	static def TupleType createResourceConstraintOuterTupleType(EnvironmentFactoryInternal envFactory,
		ResourceConstraint constraint
	) {
		val Type innerTupleType = createResourceConstraintInnerTupleType(
			envFactory, constraint
		)
		val Map<String, Type> outerNamedParts = #{
			constraint.tupleDescriptor.weight -> createSetType(envFactory, innerTupleType),
			constraint.tupleDescriptor.bound -> getRealType(envFactory)
		}
		return createTupleType(envFactory, outerNamedParts)
	}
	
	/*@NonNull*/
	static def Type createResourceConstraintType(ResourceConstraint constraint) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(constraint)
		createSetType(envFactory,
			createResourceConstraintOuterTupleType(envFactory, constraint)
		)
	}
	
	// implication constraint
		
	/*@NonNull*/
	static def Type createImplicationConstraintType(ImplicationConstraint constraint) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(constraint)
		val tupleDescriptor = constraint.tupleDescriptor
		val premiseTupleType = createTupleType(envFactory,
			convertToNamedParts(tupleDescriptor.premiseTupleDescriptor, envFactory)
		)
		val premiseSetType = createSetType(envFactory, premiseTupleType)
		val conclusionTupleType = createTupleType(envFactory,
			convertToNamedParts(tupleDescriptor.conclusionTupleDescriptor, envFactory)
		)
		val conclusionSetType = createSetType(envFactory, conclusionTupleType)
		createSetType(envFactory,
			createTupleType(envFactory,
				#{
					tupleDescriptor.premise -> premiseSetType,
					tupleDescriptor.conclusion -> conclusionSetType
				}
			)
		)
	}
	
	// forbiddenLocation constraint
	/*@NonNull*/
	static def Type createForbiddenLocationConstraintType(ForbiddenLocationConstraint constraint) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(constraint)
		createSetType(envFactory,
			createTupleType(envFactory,
				convertToNamedParts(constraint.tupleDescriptor, envFactory)
			)
		)
	}
	
	// QoS dimension
	/*@NonNull*/
	static def TupleType createQoSDimensionTupleType(EnvironmentFactoryInternal envFactory,
		QoSDimension qosDimension
	) {
		createWeightTupleDescriptorTupleType(envFactory, qosDimension.tupleDescriptor)
	}
	
	/*@NonNull*/
	static def Type createQoSDimensionType(QoSDimension qosDimension) {
		val EnvironmentFactoryInternal envFactory = getEnvironmentFactory(qosDimension)
		createSetType(envFactory,
			createQoSDimensionTupleType(envFactory, qosDimension)
		)
	}
	
	// for convenience:
	
	static def dispatch createType(EvaluableElement element) {
		throw new IllegalArgumentException("unexpected element: " + element)
	}
	
	static def dispatch createType(Relation relation) {
		createRelationType(relation)
	}
	
	static def dispatch createType(Bound bound) {
		createBoundType(bound)
	}
	
	static def dispatch createType(CoherenceConstraint constraint) {
		createCoherenceConstraintType(constraint)
	}
	
	static def dispatch createType(LocationConstraint constraint) {
		createLocationConstraintType(constraint)
	}
	
	static def dispatch createType(ResourceConstraint constraint) {
		createResourceConstraintType(constraint)
	}
	
	static def dispatch createType(ImplicationConstraint constraint) {
		createImplicationConstraintType(constraint)
	}
	
	static def dispatch createType(ForbiddenLocationConstraint constraint) {
		createForbiddenLocationConstraintType(constraint)
	}
	
	static def dispatch createType(QoSDimension qosDimension) {
		createQoSDimensionType(qosDimension)
	}
}