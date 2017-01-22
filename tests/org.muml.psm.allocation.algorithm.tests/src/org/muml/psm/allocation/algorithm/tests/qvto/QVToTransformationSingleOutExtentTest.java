package org.muml.psm.allocation.algorithm.tests.qvto;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;

// all the good bits are taken from org.muml.uppaal.adapter.tests

// TODO: document me

public class QVToTransformationSingleOutExtentTest extends QVToTransformationTest {
	protected URI expectedURI;
	
	
	public QVToTransformationSingleOutExtentTest(Object expectedOutput, String transformationURI,
			Map<String, Object> configurationPropertyMap, Object... inParameters) {
		super(transformationURI, configurationPropertyMap,
				mergeParams(expectedOutput, inParameters));
	}
	
	public QVToTransformationSingleOutExtentTest(Object expectedOutput, String transformationURI,
			Object... inParameters) {
		super(transformationURI, Collections.<String, Object>emptyMap(),
				mergeParams(expectedOutput, inParameters));
	}
	
	private static Object[] mergeParams(Object expectedOutput, Object[] inParameters) {
		Object[] inParamsAndExpOut = new Object[inParameters.length + 1];
		System.arraycopy(inParameters, 0, inParamsAndExpOut, 0, inParameters.length);
		inParamsAndExpOut[inParameters.length] = expectedOutput;
		return inParamsAndExpOut;
	}
	
}
