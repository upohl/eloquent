package de.uni_paderborn.fujaba.muml.allocation.algorithm.tests;

import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.junit.Assert;

public class ModelTestUtil {
	public static void assertModelEquals(EObject expected, EObject actual) {
		Comparison comparison = EMFCompare.builder().build().compare(
				new DefaultComparisonScope(expected, actual, null));
		Assert.assertEquals(0, comparison.getDifferences().size());
	}
}
