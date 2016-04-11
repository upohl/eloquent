package org.muml.psm.allocation.algorithm.tests.qvto;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

// all the good bits are taken from org.muml.uppaal.adapter.tests

// TODO: document me

public class QVToTransformationSingleOutExtentTest extends QVToTransformationTest {
	protected URI expectedURI;
	
	
	public QVToTransformationSingleOutExtentTest(String expectedURI, String transformationURI,
			Map<String, Object> configurationPropertyMap, String... inputObjectURIs) {
		super(createExpectedURIs(expectedURI, inputObjectURIs),
				transformationURI, configurationPropertyMap,
				createInOrOutObjectURIs(inputObjectURIs));
	}
	
	// maybe provide explicit setters in the super class instead of fooling
	// around with these static methods...
	private static String[] createExpectedURIs(String expectedURI, String[] inputObjectURIs) {
		String[] expectedURIs = new String[inputObjectURIs.length + 1];
		expectedURIs[inputObjectURIs.length] = expectedURI;
		return expectedURIs;
	}
	
	private static String[] createInOrOutObjectURIs(String[] inputObjectURIs) {
		String[] inOrOutObjectURIs = new String[inputObjectURIs.length + 1];
		for (int i = 0; i < inputObjectURIs.length; i++) {
			inOrOutObjectURIs[i] = inputObjectURIs[i];
		}
		// this is already done implicitly
		inOrOutObjectURIs[inputObjectURIs.length] = null;
		return inOrOutObjectURIs;
	}
	
	public QVToTransformationSingleOutExtentTest(String expectedURI, String transformationURI,
			String... inputObjectURIs) {
		this(expectedURI, transformationURI, Collections.<String, Object>emptyMap(),
				inputObjectURIs);
	}
	
}
