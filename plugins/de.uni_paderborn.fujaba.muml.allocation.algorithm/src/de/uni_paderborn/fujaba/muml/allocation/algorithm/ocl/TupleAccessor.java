package de.uni_paderborn.fujaba.muml.allocation.algorithm.ocl;

import java.util.List;

import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation.Kind;
import org.eclipse.ocl.examples.domain.ids.TuplePartId;
import org.eclipse.ocl.examples.domain.types.IdResolver;
import org.eclipse.ocl.examples.domain.values.TupleValue;
import org.eclipse.ocl.examples.pivot.TupleType;

import de.uni_paderborn.fujaba.muml.allocation.language.cs.ConstraintCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.LocationConstraintCS;
import de.uni_paderborn.fujaba.muml.allocation.language.cs.RequiredHardwareResourceInstanceConstraintCS;
import de.uni_paderborn.fujaba.muml.allocation.language.typing.TypesUtil;

public class TupleAccessor {
	private static final String invalidPart = "Type %s has no part named %s";
	private static final String unexpectedObject = "unexpected object %s";
	
	private static Object getPart(TupleValue tupleValue, String namedPart, ConstraintCS constraintCS, TupleType tupleType) {
		//TupleType tupleType = TypesUtil.createLocationConstraintTupleType(locationConstraintCS);
		TuplePartId partId = tupleType.getTupleTypeId().getPartId(namedPart);
		if (partId == null) {
			throw new IllegalArgumentException(
					String.format(invalidPart, tupleType, namedPart));
		}
		Object partValue = tupleValue.getValue(partId);
		IdResolver idResolver = TypesUtil.getMetaModelManager(constraintCS)
				.getIdResolver();
		Object unboxedValue = idResolver.unboxedValueOf(partValue);
		System.out.println("accessed: " + unboxedValue);
		// this is type safe as long as the locationConstraintCS is valid
		//return (NamedElement) unboxedValue;
		return unboxedValue;
	}	
	
	@Operation(kind=Kind.QUERY)
	public static Object getPart(TupleValue tupleValue, String namedPart, Object object) {
		TupleType tupleType = null;
		if (object instanceof LocationConstraintCS) {
			tupleType = TypesUtil.createLocationConstraintTupleType((LocationConstraintCS) object);
		} else if (object instanceof RequiredHardwareResourceInstanceConstraintCS) {
			tupleType = TypesUtil.createReqHWResInstanceConstraintTupleType((RequiredHardwareResourceInstanceConstraintCS) object);
		} else {
			throw new IllegalArgumentException(
					String.format(unexpectedObject, object));
		}
		return getPart(tupleValue, namedPart, (ConstraintCS) object, tupleType);
	}
	
	@Operation(kind=Kind.QUERY)
	@SuppressWarnings("unchecked")
	public static List<Object> getSequencePart(TupleValue tupleValue, String namedPart, Object object) {
		return (List<Object>) getPart(tupleValue, namedPart, object);
	}
}
