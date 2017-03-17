package org.muml.psm.allocation.algorithm.ocl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.ocl.pivot.TupleType;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.values.CollectionValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import org.muml.psm.allocation.language.as.CoherenceConstraint;
import org.muml.psm.allocation.language.as.EvaluableElement;
import org.muml.psm.allocation.language.as.LocationConstraint;
import org.muml.psm.allocation.language.as.QoSDimension;
import org.muml.psm.allocation.language.as.Relation;
import org.muml.psm.allocation.language.as.ResourceConstraint;
import org.muml.psm.allocation.language.xtext.typing.TypesUtil;

public class TupleAccessor {
	private static final String invalidPart = "Type %s has no part named %s";
	private static final String unexpectedObject = "unexpected object %s";
	private static final String noTupleValue = "object %s is not a TupleValue instance";
	
	private static Object getPart(TupleValue tupleValue, String namedPart, EvaluableElement elementCS,
			TupleType tupleType, boolean unboxValue) {
		//TupleType tupleType = TypesUtil.createLocationConstraintTupleType(locationConstraintCS);
		TuplePartId partId = tupleType.getTupleTypeId().getPartId(namedPart);
		if (partId == null) {
			throw new IllegalArgumentException(
					String.format(invalidPart, tupleType, namedPart));
		}
		Object partValue = tupleValue.getValue(partId);
		if (!unboxValue) {
			return partValue;
		}
		IdResolver idResolver = TypesUtil.getEnvironmentFactory(elementCS)
				.getIdResolver();
		Object unboxedValue = idResolver.unboxedValueOf(partValue);
		System.out.println("accessed: " + unboxedValue);
		// this is type safe as long as the locationConstraintCS is valid
		//return (NamedElement) unboxedValue;
		if (unboxedValue instanceof BigDecimal) {
			// XXX: qvto cannot convert a java.math.BigDecimal to "Real"
			// thus, we have to convert it to a double (maybe its somehow
			// possible to handle this conversion in the qvto transformation itself?)
			return ((BigDecimal) unboxedValue).doubleValue();
		}
		return unboxedValue;
	}	
	
	@Operation(kind=Kind.QUERY)
	public static Object getPart(TupleValue tupleValue, String namedPart, Object object) {
		return getPart(tupleValue, namedPart, object, true);
	}
	
	private static Object getPart(TupleValue tupleValue, String namedPart, Object object, boolean unboxValue) {
		// XXX: get rid of this EObject cast again
		EnvironmentFactoryInternal envFactory = TypesUtil.getEnvironmentFactory((EObject) object);
		TupleType tupleType = null;
		if (object instanceof Relation) {
			tupleType = TypesUtil.createRelationTupleType(envFactory, (Relation) object);
		} else if (object instanceof CoherenceConstraint) {
			tupleType = TypesUtil.createCoherenceConstraintTupleType(envFactory, (CoherenceConstraint) object);
		} else if (object instanceof LocationConstraint) {
			tupleType = TypesUtil.createLocationConstraintTupleType(envFactory, (LocationConstraint) object);
		} else if (object instanceof ResourceConstraint) {
			// outer tuple type has exactly 2 parts
			if (tupleValue.getTypeId().getPartIds().length == 2) {
				tupleType = TypesUtil.createResourceConstraintOuterTupleType(envFactory, (ResourceConstraint) object);
			} else {
				tupleType = TypesUtil.createResourceConstraintInnerTupleType(envFactory, (ResourceConstraint) object);
			}
		} else if (object instanceof QoSDimension) {
			tupleType = TypesUtil.createQoSDimensionTupleType(envFactory, (QoSDimension) object);
		} else {
			throw new IllegalArgumentException(
					String.format(unexpectedObject, object));
		}
		return getPart(tupleValue, namedPart, (EvaluableElement) object, tupleType, unboxValue);
	}
	
	@Operation(kind=Kind.QUERY)
	public static List<TupleValue> getSequencePart(TupleValue tupleValue, String namedPart, Object object) {
		CollectionValue result = (CollectionValue) getPart(tupleValue, namedPart, object, false);
		return createTupleValueList(result);
	}
	
	public static List<TupleValue> createTupleValueList(@NonNull CollectionValue collection) {
		List<TupleValue> tupleValueList = new ArrayList<TupleValue>(collection.size().signum());
		for (Object elm : collection.getElements()) {
			// do a sanity check (better safe than sorry...)
			if (!(elm instanceof TupleValue)) {
				throw new IllegalArgumentException(String.format(noTupleValue, elm));
			}
			tupleValueList.add((TupleValue) elm);
		}
		return tupleValueList;
	}
	
	@Operation(kind=Kind.QUERY)
	public static List<TupleValue> convertToTupleValueSequence(@Nullable Object evaluationResult) {
		if (!(evaluationResult instanceof SetValue)) {
			throw new IllegalArgumentException(
					String.format(unexpectedObject, evaluationResult));
		}
		return createTupleValueList((SetValue) evaluationResult);
	}
	
}
