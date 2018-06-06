package org.muml.eloquent.algorithm.ilp.gurobi.tests;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.muml.eloquent.algorithm.ilp.gurobi.LPM2T;
import org.muml.psm.allocation.algorithm.qvto.QVToTransformationRunner.Util;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;

@RunWith(value = Parameterized.class)
public class LPM2TTest {
	private static final String uriPrefix =
			"platform:/plugin/org.muml.eloquent.algorithm.ilp.gurobi.tests/fixtures/";
	
	private String lpURI;
	private String glpURI;
	private Class<? extends Throwable> expectedException;
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	public LPM2TTest(String lpURI, String glpURI,
			Class<? extends Throwable> expectedException) {
		this.lpURI = lpURI;
		this.glpURI = glpURI;
		this.expectedException = expectedException;
	}
	
	@Test
	public void performTest() {
		IntegerLinearProgram ilp = (IntegerLinearProgram)
				Util.loadURI(lpURI);
		EcoreUtil.resolveAll(ilp.eResource());
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		if (expectedException != null) {
			thrown.expect(expectedException);
		}
		new LPM2T().serialize(ilp, os);
		if (glpURI != null) {
			URI uri = URI.createURI(glpURI);
			URIConverter uriConverter = ilp.eResource().getResourceSet()
					.getURIConverter();
			try {
				assertSameContent(uriConverter.createInputStream(uri),
						new ByteArrayInputStream(os.toByteArray()));
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
		
	protected void assertSameContent(InputStream expected, InputStream actual) throws IOException {
		BufferedReader expectedReader = new BufferedReader(
				new InputStreamReader(expected));
		BufferedReader actualReader = new BufferedReader(
				new InputStreamReader(actual));
		String eLine = null;
		String aLine = null;
		// the single & is intended (both readLine() calls should be
		// performed)
		while (((eLine = expectedReader.readLine()) != null)
				& ((aLine = actualReader.readLine()) != null)) {
			Assert.assertEquals(eLine, aLine);
		}
		Assert.assertNull(eLine);
		Assert.assertNull(aLine);
	}
	
	@Parameters
	public static Collection<Object[]> getTestData() {
		List<Object[]> testData = new ArrayList<Object[]>();
		testData.add(new Object[] {
				uriPrefix + "simple.lp",
				uriPrefix + "simple.glp",
				null
		});
		testData.add(new Object[] {
				uriPrefix + "simple_double.lp",
				uriPrefix + "simple_double.glp",
				null
		});
		testData.add(new Object[] {
				uriPrefix + "constant_objective.lp",
				uriPrefix + "constant_objective.glp",
				null
		});
		testData.add(new Object[] {
				uriPrefix + "unsupported_operator1.lp",
				null,
				IllegalArgumentException.class
		});
		testData.add(new Object[] {
				uriPrefix + "unsupported_operator2.lp",
				null,
				IllegalArgumentException.class
		});
		// we do not handle this gracefully
		testData.add(new Object[] {
				uriPrefix + "illegal_structure.lp",
				null,
				ClassCastException.class
		});
		return testData;
	}
}
