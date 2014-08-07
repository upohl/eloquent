package de.uni_paderborn.fujaba.muml.allocation.algorithm.util;

import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.WriterLog;

/**
 * Executes a QVTo transformation with arbitrary many input
 * model extents and exactly one output model extent. For
 * running a transformation, instantiate this class and call
 * one of its runTransformation methods. Afterwards the
 * transformation result can be accessed via the getOutExtent
 * method.
 *
 */
public class QVToSingleOutExtentTransformationRunner {
	
	private static final String RESOURCE_ERRORS = "The resource %s has errors: %s";
	
	private URI transformationURI;
	private Map<String, Object> configurationPropertyMap;
	private URI[] inputObjectURIs;
	private ModelExtent outExtent;
	
	public QVToSingleOutExtentTransformationRunner(String transformationURI,
			Map<String, Object> configurationPropertyMap, String... inputObjectURIs) {
		this.transformationURI = URI.createURI(transformationURI);
		this.configurationPropertyMap = configurationPropertyMap;
		this.inputObjectURIs = new URI[inputObjectURIs.length];
		for (int i = 0; i < inputObjectURIs.length; i++) {
			this.inputObjectURIs[i] = URI.createURI(inputObjectURIs[i]);
		}
	}
	
	public QVToSingleOutExtentTransformationRunner(String transformationURI,
			String... inputObjectURIs) {
		this(transformationURI, Collections.<String, Object>emptyMap(), inputObjectURIs);
	}
	
	protected ExecutionContext createExecutionContext(@Nullable IProgressMonitor progressMonitor) {
		ExecutionContextImpl context = new ExecutionContextImpl();
		if (progressMonitor != null) {
			context.setProgressMonitor(progressMonitor);
		}
		initExecutionContext(context);
		return context;
	}
	
	protected void initExecutionContext(ExecutionContextImpl context) {
		for (String key : configurationPropertyMap.keySet()) {
			context.setConfigProperty(key, configurationPropertyMap.get(key));
		}
		context.setLog(new WriterLog(new OutputStreamWriter(System.out)));
	}
	
	public ExecutionDiagnostic runTransformation(@Nullable IProgressMonitor progressMonitor) {
		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);
		ExecutionContext context = createExecutionContext(progressMonitor);
		return executor.execute(context, createModelExtents());
	}
	
	public ExecutionDiagnostic runTransformation() {
		return runTransformation(null);
	}
	
	protected ModelExtent[] createModelExtents() {
		ModelExtent[] inputExtents = createInputModelExtents();
		createOutExtent();
		// XXX: do want to support no out extents?
		/*if (outExtent == null) {
			modelExtents = inputExtents;
			return;
		}*/
		ModelExtent[] modelExtents = new ModelExtent[inputExtents.length + 1];
		System.arraycopy(inputExtents, 0, modelExtents, 0, inputExtents.length);
		modelExtents[modelExtents.length - 1] = outExtent;
		return modelExtents;
	}
	
	protected ModelExtent[] createInputModelExtents() {
		ModelExtent[] inputExtents = new BasicModelExtent[inputObjectURIs.length];
		int i = 0;
		for (URI inputURI : inputObjectURIs) {
			 BasicModelExtent extent = new BasicModelExtent();
			 extent.add(Util.loadURI(inputURI));
			 inputExtents[i++] = extent;
		}
		return inputExtents;
	}
	
	protected void createOutExtent() {
		outExtent = new BasicModelExtent();
	}
	
	public ModelExtent getOutExtent() {
		return outExtent;
	}
	
	public static class Util {
		public static EObject loadURI(URI uri, boolean ignoreErrors) {
			URI loadURI = uri.hasFragment() ? uri.trimFragment() : uri;
			ResourceSet resourceSet = new ResourceSetImpl();
			Resource resource = resourceSet.getResource(loadURI, true);
			if (!resource.getErrors().isEmpty()) {
				throw new IllegalStateException(
						String.format(RESOURCE_ERRORS, uri.toPlatformString(false),
								resource.getErrors()));
			}
			assert resource.getContents().size() > 0;
			// resolve all proxies, otherwise EMFCompare complains (this is
			// especially needed for xtext resources)
			EcoreUtil.resolveAll(resource);
			return uri.hasFragment() ? resource.getEObject(uri.fragment())
					: resource.getContents().get(0);
		}
		
		public static EObject loadURI(URI uri) {
			return loadURI(uri, false);
		}
	}

}
