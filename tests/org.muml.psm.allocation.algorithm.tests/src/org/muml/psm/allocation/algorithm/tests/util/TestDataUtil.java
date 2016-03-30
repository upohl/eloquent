package org.muml.psm.allocation.algorithm.tests.util;

import java.util.ArrayList;
import java.util.Collection;

public class TestDataUtil {
	
	public static <T> Collection<Object[]> createTestData(int varargsStartPos, Object[]... testData) {
		Collection<Object[]> collection = new ArrayList<Object[]>();
		for (Object[] data : testData) {
			Object[] varargs = new String[data.length - varargsStartPos];
			Object[] newData = new Object[varargsStartPos + 1];
			System.arraycopy(data, varargsStartPos, varargs, 0, varargs.length);
			System.arraycopy(data, 0, newData, 0, varargsStartPos);
			newData[newData.length - 1] = varargs;
			collection.add(newData);
		}
		return collection;
	}
}
