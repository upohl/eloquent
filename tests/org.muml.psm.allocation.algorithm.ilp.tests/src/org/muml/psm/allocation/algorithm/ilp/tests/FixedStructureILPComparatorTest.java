package org.muml.psm.allocation.algorithm.ilp.tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.muml.psm.allocation.algorithm.ilp.tests.util.FixedStructureILPComparator;
import org.muml.psm.allocation.algorithm.qvto.QVToTransformationRunner.Util;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;


@RunWith(value = Parameterized.class)
public class FixedStructureILPComparatorTest {
	private static final String uriPrefix =
			"platform:/plugin/org.muml.psm.allocation.algorithm.ilp.tests/fixtures/util/";
	
	private String ilp1URI;
	private String ilp2URI;
	private Class<? extends Throwable> expectedException;
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	public FixedStructureILPComparatorTest(@NonNull String ilp1URI,
			@NonNull String ilp2URI,
			@Nullable Class<? extends Throwable> expectedException) {
		this.ilp1URI = ilp1URI;
		this.ilp2URI = ilp2URI;
		this.expectedException = expectedException;
	}
	
	@Test
	public void performTest() {
		IntegerLinearProgram ilp1 = (IntegerLinearProgram)
				Util.loadURI(ilp1URI);
		IntegerLinearProgram ilp2 = (IntegerLinearProgram)
				Util.loadURI(ilp2URI);		
		if (expectedException != null) {
			thrown.expect(expectedException);
		}
		FixedStructureILPComparator.assertSameILP(ilp1, ilp2);
	}

	@Parameters
	public static Collection<Object[]> getTestData() {
		List<Object[]> testData = new ArrayList<Object[]>();
		testData.add(new Object[] {
				uriPrefix + "base.lp",
				uriPrefix + "base.lp",
				null
		});
		testData.add(new Object[] {
				uriPrefix + "base.lp",
				uriPrefix + "reorder1.lp",
				null
		});
		testData.add(new Object[] {
				uriPrefix + "base.lp",
				uriPrefix + "reorder2.lp",
				null
		});
		testData.add(new Object[] {
				uriPrefix + "reorder1.lp",
				uriPrefix + "reorder2.lp",
				null
		});
		testData.add(new Object[] {
				uriPrefix + "base.lp",
				uriPrefix + "no_reorder1.lp",
				AssertionError.class
		});
		testData.add(new Object[] {
				uriPrefix + "base.lp",
				uriPrefix + "no_reorder2.lp",
				AssertionError.class
		});
		testData.add(new Object[] {
				uriPrefix + "base.lp",
				uriPrefix + "no_reorder3.lp",
				AssertionError.class
		});
		testData.add(new Object[] {
				uriPrefix + "base.lp",
				uriPrefix + "no_reorder4.lp", // same as base.lp, but minimizes
				AssertionError.class
		});
		testData.add(new Object[] {
				uriPrefix + "base.lp",
				uriPrefix + "illegal_input1.lp",
				IllegalArgumentException.class
		});
		return testData;
	}
}
