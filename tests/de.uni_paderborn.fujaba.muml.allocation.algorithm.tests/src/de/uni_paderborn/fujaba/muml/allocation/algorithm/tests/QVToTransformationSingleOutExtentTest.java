package de.uni_paderborn.fujaba.muml.allocation.algorithm.tests;

import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.WriterLog;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// all the good bits are taken from de.uni_paderborn.fujaba.muml.verification.uppaal.tests

// TODO: document me

public class QVToTransformationSingleOutExtentTest {
	protected URI expectedURI;
	protected URI transformationURI;
	protected Map<String, Object> configurationPropertyMap;
	protected List<URI> inputURIList;
	protected ModelExtent[] modelExtents;
	protected ModelExtent outExtent;
	
	public QVToTransformationSingleOutExtentTest(String expectedURI, String transformationURI,
			Map<String, Object> configurationPropertyMap, String... inputObjectURIs) {
		this.expectedURI = URI.createURI(expectedURI);
		this.transformationURI = URI.createURI(transformationURI);
		this.configurationPropertyMap = configurationPropertyMap;
		inputURIList = new ArrayList<URI>(inputObjectURIs.length);
		for (String inputObjectURI : inputObjectURIs) {
			inputURIList.add(URI.createURI(inputObjectURI));
		}
	}
	
	public QVToTransformationSingleOutExtentTest(String expectedURI, String transformationURI,
			String... inputObjectURIs) {
		this(expectedURI, transformationURI, Collections.<String, Object>emptyMap(),
				inputObjectURIs);
	}
	
	@Test
	public void test() {
		checkTransformationRun(runTransformation());
		checkTransformationResult();
	}
	
	protected void checkTransformationRun(ExecutionDiagnostic result) {
		Assert.assertEquals(Diagnostic.OK, result.getCode());
	}
	
	protected void checkTransformationResult() {
		Assert.assertEquals(1, outExtent.getContents().size());
		ModelTestUtil.assertModelEquals(Util.loadURI(expectedURI),
				outExtent.getContents().get(0));
	}
	
	protected ExecutionContext createExecutionContext() {
		ExecutionContextImpl context = new ExecutionContextImpl();
		initExecutionContext(context);
		return context;
	}
	
	protected void initExecutionContext(ExecutionContextImpl context) {
		for (String key : configurationPropertyMap.keySet()) {
			context.setConfigProperty(key, configurationPropertyMap.get(key));
		}
		context.setLog(new WriterLog(new OutputStreamWriter(System.out)));
	}
	
	protected ExecutionDiagnostic runTransformation() {
		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);
		ExecutionContext context = createExecutionContext();
		return executor.execute(context, modelExtents);
	}
	
	@Before
	public void createModelExtents() {
		ModelExtent[] inputExtents = createInputModelExtents();
		createOutExtent();
		// XXX: do want to support no out extents?
		/*if (outExtent == null) {
			modelExtents = inputExtents;
			return;
		}*/
		modelExtents = new ModelExtent[inputExtents.length + 1];
		System.arraycopy(inputExtents, 0, modelExtents, 0, inputExtents.length);
		modelExtents[modelExtents.length - 1] = outExtent;
	}
	
	@After
	public void unsetModelExtents() {
		modelExtents = null;
		outExtent = null;
	}
	
	protected ModelExtent[] createInputModelExtents() {
		ModelExtent[] inputExtents = new BasicModelExtent[inputURIList.size()];
		int i = 0;
		for (URI inputURI : inputURIList) {
			 BasicModelExtent extent = new BasicModelExtent();
			 extent.add(Util.loadURI(inputURI));
			 inputExtents[i++] = extent;
		}
		return inputExtents;
	}
	
	protected void createOutExtent() {
		outExtent = new BasicModelExtent();
	}
	
	public static class Util {		
		public static EObject loadURI(URI uri) {
			URI loadURI = uri.hasFragment() ? uri.trimFragment() : uri;
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource(loadURI, true);
			assert resource.getContents().size() > 0;
			// resolve all proxies, otherwise EMFCompare complains (this is
			// especially needed for xtext resources)
			EcoreUtil.resolveAll(resource);
			return uri.hasFragment() ? resource.getEObject(uri.fragment())
					: resource.getContents().get(0);
		}
	}
	
}
