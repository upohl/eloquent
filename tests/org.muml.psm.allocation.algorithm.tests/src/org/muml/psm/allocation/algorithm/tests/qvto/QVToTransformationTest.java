package org.muml.psm.allocation.algorithm.tests.qvto;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.junit.Assert;
import org.junit.Test;
import org.muml.psm.allocation.algorithm.qvto.QVToTransformationRunner;
import org.muml.psm.allocation.algorithm.qvto.QVToTransformationRunner.Util;
import org.muml.psm.allocation.algorithm.tests.util.ModelTestUtil;

public class QVToTransformationTest {
	
	private static final String EXP_OBJECT_SIZE_MISM = "length of expectedURI and inOrOutObjectURIs mismatch";
	
	protected QVToTransformationRunner runner;
	protected String[] expectedURIs;
	protected String[] objectURIs;
	
	public QVToTransformationTest(@NonNull String[] expectedURIs, String transformationURI,
			Map<String, Object> configurationPropertyMap, String[] objectURIs) {
		if (expectedURIs.length != objectURIs.length) {
			throw new IllegalArgumentException(EXP_OBJECT_SIZE_MISM);
		}
		this.expectedURIs = expectedURIs;
		this.objectURIs = objectURIs;
		this.runner = new QVToTransformationRunner(transformationURI,
				configurationPropertyMap, objectURIs);
	}
	
	public QVToTransformationTest(@NonNull String[] expectedURIs, String transformationURI,
			String[] objectURIs) {
		this(expectedURIs, transformationURI,
				Collections.<String, Object>emptyMap(),
				objectURIs);
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
		for (int i = 0; i < expectedURIs.length; i++) {
			if (expectedURIs[i] == null) {
				continue;
			}
			URI expectedURI = URI.createURI(expectedURIs[i]);
			List<EObject> transformationResultList = runner.getExtents()
					.get(i).getContents();
			Assert.assertEquals(1, transformationResultList.size());
			ModelTestUtil.assertModelEquals(Util.loadURI(expectedURI),
					transformationResultList.get(0));
		}
	}
	
	/*
	 * Useful for debugging:
	 * - create a new method in the subclass
	 * - annotate this method with an @After annotation
	 * - call one of the save methods in the newly created method
	 */
	protected void save(URI uri) {
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(uri);
		for (ModelExtent modelExtent : runner.getOutOrInOutExtents()) {
			resource.getContents().addAll(modelExtent.getContents());
		}
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	protected void save(String uri) {
		save(URI.createURI(uri, true));
	}
}
