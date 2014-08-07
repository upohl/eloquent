package de.uni_paderborn.fujaba.muml.allocation.algorithm.tests;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.junit.Assert;
import org.junit.Test;

import de.uni_paderborn.fujaba.muml.allocation.algorithm.util.QVToSingleOutExtentTransformationRunner;
import de.uni_paderborn.fujaba.muml.allocation.algorithm.util.QVToSingleOutExtentTransformationRunner.Util;

// all the good bits are taken from de.uni_paderborn.fujaba.muml.verification.uppaal.tests

// TODO: document me

public class QVToTransformationSingleOutExtentTest {
	protected URI expectedURI;
	protected QVToSingleOutExtentTransformationRunner runner;
	
	public QVToTransformationSingleOutExtentTest(String expectedURI, String transformationURI,
			Map<String, Object> configurationPropertyMap, String... inputObjectURIs) {
		runner = new QVToSingleOutExtentTransformationRunner(transformationURI,
				configurationPropertyMap, inputObjectURIs);
		this.expectedURI = URI.createURI(expectedURI);
	}
	
	public QVToTransformationSingleOutExtentTest(String expectedURI, String transformationURI,
			String... inputObjectURIs) {
		this(expectedURI, transformationURI, Collections.<String, Object>emptyMap(),
				inputObjectURIs);
	}
	
	@Test
	public void test() {
		checkTransformationRun(runner.runTransformation());
		checkTransformationResult();
	}
	
	protected void checkTransformationRun(ExecutionDiagnostic result) {
		Assert.assertEquals(Diagnostic.OK, result.getCode());
	}
	
	protected void checkTransformationResult() {
		List<EObject> transformationResultList = runner.getOutExtent().getContents();
		Assert.assertEquals(1, transformationResultList.size());
		ModelTestUtil.assertModelEquals(Util.loadURI(expectedURI),
				transformationResultList.get(0));
	}
	
}
