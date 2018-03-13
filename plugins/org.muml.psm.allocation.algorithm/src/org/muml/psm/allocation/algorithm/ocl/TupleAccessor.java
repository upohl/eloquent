package org.muml.psm.allocation.algorithm.ocl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.values.CollectionValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import org.muml.psm.allocation.language.as.EvaluableElement;
import org.muml.psm.allocation.language.xtext.typing.TypesUtil;

public class TupleAccessor {
	private static final String invalidPart = "TupleTypeId %s has no part named %s";
	private static final String unexpectedObject = "unexpected object %s";
	private static final String noTupleValue = "object %s is not a TupleValue instance";
	
	private static Object getPart(TupleValue tupleValue, String namedPart,
			Object element, boolean unboxValue) {
		if (!(element instanceof EvaluableElement)) {
			throw new IllegalArgumentException(
					String.format(unexpectedObject, element));
		}
		TuplePartId partId = tupleValue.getTypeId().getPartId(namedPart);
		if (partId == null) {
			throw new IllegalArgumentException(
					String.format(invalidPart, tupleValue.getTypeId(),
							namedPart));
		}
		Object partValue = tupleValue.getValue(partId);
		if (!unboxValue) {
			return partValue;
		}
		IdResolver idResolver = TypesUtil.getEnvironmentFactory((EvaluableElement) element)
				.getIdResolver();
		Object unboxedValue = idResolver.unboxedValueOf(partValue);
		System.out.println("accessed: " + unboxedValue);
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
