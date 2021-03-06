package org.muml.psm.allocation.algorithm.tests.qvto;

import java.io.IOException;
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
import org.eclipse.m2m.internal.qvt.oml.common.MdaException;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.QvtModule;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.QvtTransformation.TransformationParameter;
import org.eclipse.m2m.internal.qvt.oml.runtime.project.TransformationUtil;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.junit.Assert;
import org.junit.Test;
import org.muml.psm.allocation.algorithm.qvto.QVToTransformationRunner;
import org.muml.psm.allocation.algorithm.qvto.QVToTransformationRunner.EObjectBasedModelExtentProvider;
import org.muml.psm.allocation.algorithm.qvto.QVToTransformationRunner.IModelExtentProvider;
import org.muml.psm.allocation.algorithm.qvto.QVToTransformationRunner.URIBasedModelExtentProvider;
import org.muml.psm.allocation.algorithm.qvto.QVToTransformationRunner.Util;
import org.muml.psm.allocation.algorithm.tests.util.ModelTestUtil;

public class QVToTransformationTest {
	
	public static class ExpectedOutput {
		private String uri;
		private EObject object;
		
		public ExpectedOutput(String uri) {
			this.uri = uri;
		}
		
		public ExpectedOutput(EObject object) {
			this.object = object;
		}
		
		public EObject getData() {
			if (uri == null) {
				return object;
			}
			return Util.loadURI(uri);
		}
	}
	
	public static class ExpectedTransformationStatus {
		private int code;
		private String message;
		private boolean isRegexMatch;
		
		private static final String regexNoMatch = "%s does not match %s";
		
		public ExpectedTransformationStatus(int code, String message,
				boolean isRegexMatch) {
			this.code = code;
			this.message = message;
			this.isRegexMatch = isRegexMatch;
		}
		
		public ExpectedTransformationStatus(int code, String message) {
			this(code, message, false);
		}
		
		public ExpectedTransformationStatus(int code) {
			this(code, null);
		}
		
		public ExpectedTransformationStatus() {
			this(ExecutionDiagnostic.OK);
		}
		
		public int getCode() {
			return code;
		}
		
		public String getMessage() {
			return message;
		}
		
		public void assertExpects(ExecutionDiagnostic result) {
			Assert.assertEquals(getCode(), result.getCode());
			if (getMessage() != null) {
				Assert.assertNotNull(result.getMessage());
				if (isRegexMatch) {
					String errorMessage = String.format(regexNoMatch,
							getMessage(), result.getMessage());
					Assert.assertTrue(errorMessage,
							result.getMessage().matches(getMessage()));
				} else {
					/*
					 *  naively transforming getMessage() to
					 *  ^getMessage()$ and simply performing a
					 *  regex match does not work in general, because
					 *  getMessage() can contain unescaped regex operators
					 *  => use assertEquals(...)
					 */
					Assert.assertEquals(getMessage(), result.getMessage());
				}
			}
		}
	}
	
	private static final String PARAM_MISM =
			"number of transformation parameters and inParamsAndExpOuts differ";
	private static final String INOUT_UNSUP =
			"inout parameters are currently not supported";
	private static final String ERROR_EXPOUT =
			"an error is expected => expected out parameters have to be null";
	
	protected QVToTransformationRunner runner;
	protected List<ExpectedOutput> expectedList;
	protected ExpectedTransformationStatus expectedTransformationStatus;
	
	/**
	 * Creates a new QVToTransformationTest instance.
	 * 
	 * @param transformationURI			the uri to the transformation file
	 * @param configurationPropertyMap	the transformation properties
	 * @param expTransformationStatus   the expected transformation status. If a non-successful
	 * 									transformation run is expected, then for every
	 * 									out parameter, null has to be specified in
	 * 									inParamsAndExpOuts.
	 * @param inParamsAndExpOuts		array, whose elements are of type EObject or String,
	 * 									that represents the tranformation's in parameters
	 * 									or an expected out parameter. If the i-th transformation
	 * 									parameter is an out parameter, the i-th array element is
	 * 									treated as an expected output. If the i-th transformation
	 * 									parameter is an in parameter, the i-th array element is
	 * 									treated as a transformation input parameter.
	 * 									If an element has the type String, it is treated as an uri
	 * 									and the corresponding EObject is loaded (in case of a
	 * 									fragment uri, otherwise (plain resource uri) the first
	 * 									element of the resource is loaded).
	 */
	public QVToTransformationTest(String transformationURI,
			Map<String, Object> configurationPropertyMap,
			ExpectedTransformationStatus expTransformationStatus,
			Object... inParamsAndExpOuts) {
		expectedTransformationStatus = expTransformationStatus;
		expectedList = new ArrayList<ExpectedOutput>();
		IModelExtentProvider[] modelExtentProviders = createModelExtentProviders(transformationURI,
				inParamsAndExpOuts);
		this.runner = new QVToTransformationRunner(transformationURI,
				configurationPropertyMap, modelExtentProviders);
	}
	
	/* 
	 * Just for convenience (see above for the description)
	 */
	public QVToTransformationTest(String transformationURI,
			Map<String, Object> configurationPropertyMap,
			Object... inParamsAndExpOuts) {
		this(transformationURI, configurationPropertyMap,
				new ExpectedTransformationStatus(),
				inParamsAndExpOuts);
	}
	
	protected IModelExtentProvider[] createModelExtentProviders(String transformationURI,
			Object[] inParamsAndExpOuts) {
		List<IModelExtentProvider> modelExtentList = new ArrayList<IModelExtentProvider>();
		List<TransformationParameter> parameterList = getTransformationParameters(transformationURI);
		if (parameterList.size() != inParamsAndExpOuts.length) {
			throw new IllegalArgumentException(PARAM_MISM);
		}
		for (int i = 0; i < inParamsAndExpOuts.length; i++) {
			TransformationParameter parameter = parameterList.get(i);
			Object item = inParamsAndExpOuts[i];
			if (parameter.getDirectionKind() == TransformationParameter.DirectionKind.IN) {
				if (item instanceof String) {
					modelExtentList.add(
							URIBasedModelExtentProvider.createIn(
									(String) item));
				} else if (item instanceof EObject) {
					modelExtentList.add(
							EObjectBasedModelExtentProvider.createIn(
									(EObject) item));
				}
			} else if (parameter.getDirectionKind() == TransformationParameter.DirectionKind.OUT) {
				if (isErrorExpected() && item != null) {
					throw new IllegalArgumentException(ERROR_EXPOUT);
				}
				if (item instanceof String) {
					expectedList.add(new ExpectedOutput((String) item));
				} else if (item instanceof EObject) {
					expectedList.add(new ExpectedOutput((EObject) item));
				}
				modelExtentList.add(EObjectBasedModelExtentProvider.createOut(null));
			} else {
				throw new IllegalArgumentException(INOUT_UNSUP);
			}
		}
		return modelExtentList.toArray(new IModelExtentProvider[0]);
	}
	
	protected List<TransformationParameter> getTransformationParameters(String transformationURI) {
		URI uri = URI.createURI(transformationURI);
		try {
			QvtModule mainModule = TransformationUtil.getQvtModule(uri);
			return mainModule.getParameters();
		} catch (MdaException e) {
			throw new RuntimeException(e);
		}
	}
	
	@Test
	public void test() {
		checkTransformationRun(runner.runTransformation());
		if (!isErrorExpected()) {
			checkTransformationResult();
		}
	}
	
	protected void checkTransformationRun(ExecutionDiagnostic result) {
		expectedTransformationStatus.assertExpects(result);
	}
	
	protected void checkTransformationResult() {
		List<ModelExtent> outExtentList = runner.getOutExtents();
		for (int i = 0; i < outExtentList.size(); i++) {
			List<EObject> transformationResultList = outExtentList.get(i)
					.getContents();
			Assert.assertEquals(1,  transformationResultList.size());
			ModelTestUtil.assertModelEquals(expectedList.get(i).getData(),
					transformationResultList.get(0));
		}
	}
	
	protected boolean isErrorExpected() {
		return expectedTransformationStatus.getCode() != ExecutionDiagnostic.OK;
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
