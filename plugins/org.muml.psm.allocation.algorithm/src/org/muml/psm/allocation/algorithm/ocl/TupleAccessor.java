package org.muml.psm.allocation.algorithm.ocl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.ocl.pivot.TupleType;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.values.CollectionValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import org.muml.psm.allocation.language.cs.EvaluatableElementCS;
import org.muml.psm.allocation.language.cs.LocationConstraintCS;
import org.muml.psm.allocation.language.cs.QoSDimensionCS;
import org.muml.psm.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS;
import org.muml.psm.allocation.language.cs.ResourceConstraintCS;
import org.muml.psm.allocation.language.xtext.typing.TypesUtil;

public class TupleAccessor {
	private static final String invalidPart = "Type %s has no part named %s";
	private static final String unexpectedObject = "unexpected object %s";
	private static final String noTupleValue = "object %s is not a TupleValue instance";
	
	private static Object getPart(TupleValue tupleValue, String namedPart, EvaluatableElementCS elementCS,
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
		if (object instanceof LocationConstraintCS) {
			tupleType = TypesUtil.createLocationConstraintTupleType(envFactory, (LocationConstraintCS) object);
		} else if (object instanceof RequiredHardwareResourceInstanceConstraintCS) {
			tupleType = TypesUtil.createReqHWResInstanceConstraintTupleType(envFactory, (RequiredHardwareResourceInstanceConstraintCS) object);
		} else if (object instanceof ResourceConstraintCS) {
			// outer tuple type has exactly 2 parts
			if (tupleValue.getTypeId().getPartIds().length == 2) {
				tupleType = TypesUtil.createResourceConstraintOuterTupleType(envFactory, (ResourceConstraintCS) object);
			} else {
				tupleType = TypesUtil.createResourceConstraintInnerTupleType(envFactory, (ResourceConstraintCS) object);
			}
		} else if (object instanceof QoSDimensionCS) {
			tupleType = TypesUtil.createQoSDimensionTupleType(envFactory, (QoSDimensionCS) object);
		} else {
			throw new IllegalArgumentException(
					String.format(unexpectedObject, object));
		}
		return getPart(tupleValue, namedPart, (EvaluatableElementCS) object, tupleType, unboxValue);
	}
	
	@Operation(kind=Kind.QUERY)
	public static List<TupleValue> getSequencePart(TupleValue tupleValue, String namedPart, Object object) {
		CollectionValue result = (CollectionValue) getPart(tupleValue, namedPart, object, false);
		return createTupleValueList(result);
	}
	
	public static List<TupleValue> createTupleValueList(CollectionValue collection) {
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
	
	
}
