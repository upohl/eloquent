package org.muml.psm.allocation.algorithm.tests.util;

import java.io.PrintStream;

import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.utils.EMFComparePrettyPrinter;
import org.eclipse.emf.ecore.EObject;
import org.junit.Assert;

public class ModelTestUtil {
	public static void assertModelEquals(EObject expected, EObject actual) {
		Comparison comparison = EMFCompare.builder().build().compare(
				new DefaultComparisonScope(expected, actual, null));
		EMFComparePrettyPrinter.printComparison(comparison, new PrintStream(System.out));
		Assert.assertEquals(0, comparison.getDifferences().size());
	}
}
