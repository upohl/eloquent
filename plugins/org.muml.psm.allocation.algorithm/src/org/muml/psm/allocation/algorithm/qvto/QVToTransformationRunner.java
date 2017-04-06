package org.muml.psm.allocation.algorithm.qvto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContext;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.StringBufferLog;


public class QVToTransformationRunner {
	private static final String RESOURCE_ERRORS = "The resource %s has errors: %s";
	public static final String LOG_SOURCE =
			"org.muml.psm.allocation.algorithm.qvto.QVToTransformationRunner";
	
	private URI transformationURI;
	private Map<String, Object> configurationPropertyMap;
	private IModelExtentProvider[] modelExtentProviders;
	private StringBufferLog log;
	
	public QVToTransformationRunner(String transformationURI,
			Map<String, Object> configurationPropertyMap) {
		this.transformationURI = URI.createURI(transformationURI);
		this.configurationPropertyMap = configurationPropertyMap;
	}
	
	public QVToTransformationRunner(String transformationURI,
			Map<String, Object> configurationPropertyMap, IModelExtentProvider... modelExtentProviders) {
		this(transformationURI, configurationPropertyMap);
		this.modelExtentProviders = new IModelExtentProvider[modelExtentProviders.length];
		for (int i = 0; i < modelExtentProviders.length; i++) {
			this.modelExtentProviders[i] = modelExtentProviders[i];
		}
	}
	
	// either in (!= null) extent or out (== null) extent
	public QVToTransformationRunner(String transformationURI,
			Map<String, Object> configurationPropertyMap, String... inOrOutObjectURIs) {
		this(transformationURI, configurationPropertyMap);
		modelExtentProviders = new IModelExtentProvider[inOrOutObjectURIs.length];
		for (int i = 0; i < inOrOutObjectURIs.length; i++) {
			if (inOrOutObjectURIs[i] == null) {
				modelExtentProviders[i] = URIBasedModelExtentProvider.createOut(inOrOutObjectURIs[i]);
			} else {
				modelExtentProviders[i] = URIBasedModelExtentProvider.createIn(inOrOutObjectURIs[i]);
			}
		}
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
	//	context.setLog(new WriterLog(new OutputStreamWriter(System.out)));
		log = new StringBufferLog();
		context.setLog(log);
	}
	
	public ExecutionDiagnostic runTransformation(@Nullable IProgressMonitor progressMonitor) {
		TransformationExecutor executor = new TransformationExecutor(
				transformationURI);
		ExecutionContext context = createExecutionContext(progressMonitor);
		ExecutionDiagnostic execDiag = executor.execute(context, createModelExtents());
		// hack for time "measurements"
		Diagnostic logDiagnostic = new BasicDiagnostic(LOG_SOURCE, Diagnostic.OK,
				log.getContents(), null);
		execDiag.add(logDiagnostic);
		return execDiag;
	}
	
	public ExecutionDiagnostic runTransformation() {
		return runTransformation(null);
	}
	
	@NonNull
	protected ModelExtent[] createModelExtents() {
		ModelExtent[] modelExtents = new ModelExtent[modelExtentProviders.length];
		for (int i = 0; i < modelExtents.length; i++) {
			modelExtents[i] = modelExtentProviders[i].getModelExtent();
		}
		return modelExtents;
	}
	
	@NonNull
	private List<ModelExtent> filterModelExtentsByTypes(@NonNull ModelExtentType... modelExtentTypes) {
		List<ModelExtent> outExtents = new ArrayList<ModelExtent>();
		for (IModelExtentProvider modelExtentProvider : modelExtentProviders) {
			for (ModelExtentType modelExtentType : modelExtentTypes) {
				if (modelExtentProvider.getExtentType() == modelExtentType) {
					outExtents.add(modelExtentProvider.getModelExtent());
					break;
				}
			}
		}
		return outExtents;
	}
	
	@NonNull
	public List<ModelExtent> getInExtents() {
		return filterModelExtentsByTypes(ModelExtentType.IN);
	}
	
	@NonNull
	public List<ModelExtent> getOutExtents() {
		return filterModelExtentsByTypes(ModelExtentType.OUT);
	}
	
	@NonNull
	public List<ModelExtent> getInOutExtents() {
		return filterModelExtentsByTypes(ModelExtentType.INOUT);
	}
	
	@NonNull
	public List<ModelExtent> getOutOrInOutExtents() {
		return filterModelExtentsByTypes(ModelExtentType.OUT, ModelExtentType.INOUT);
	}
	
	@NonNull
	public List<ModelExtent> getExtents() {
		// ok... this is awkward
		return filterModelExtentsByTypes(ModelExtentType.OUT,
				ModelExtentType.INOUT, ModelExtentType.IN);
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
		
		public static EObject loadURI(String uri) {
			return loadURI(URI.createURI(uri));
		}
	}
	
	private static enum ModelExtentType {
		IN, OUT, INOUT
	}
	
	public static interface IModelExtentProvider {
		@NonNull
		ModelExtentType getExtentType();
		
		@NonNull
		ModelExtent getModelExtent();
	}
	
	public static abstract class AbstractModelExtentProvider implements IModelExtentProvider {
		private ModelExtentType extentType;
		private ModelExtent modelExtent;
		
		protected AbstractModelExtentProvider(ModelExtentType extentType) {
			this.extentType = extentType;
			this.modelExtent = null;
		}
		
		@Override
		public ModelExtentType getExtentType() {
			return extentType;
		}
		
		@Override
		public ModelExtent getModelExtent() {
			if (modelExtent == null) {
				modelExtent = createModelExtent();
			}
			return modelExtent;
		}
		
		@NonNull
		protected abstract ModelExtent createModelExtent();
	}
	
	public static class EObjectBasedModelExtentProvider extends AbstractModelExtentProvider {
		private static final String INV = "eObject may only be null for an out extent";
		private EObject eObject;
		
		protected EObjectBasedModelExtentProvider(ModelExtentType extentType, @Nullable EObject eObject) {
			super(extentType);
			this.eObject = eObject;
			if (eObject == null
					&& extentType != ModelExtentType.OUT) {
				throw new IllegalArgumentException(INV);
			}
		}

		@Override
		protected ModelExtent createModelExtent() {
			BasicModelExtent modelExtent = new BasicModelExtent();
			if (eObject != null) {
				modelExtent.add(eObject);
			}
			return modelExtent;
		}
		
		@NonNull
		public static IModelExtentProvider createIn(EObject eObject) {
			return new EObjectBasedModelExtentProvider(ModelExtentType.IN, eObject);
		}
		
		@NonNull
		public static IModelExtentProvider createOut(EObject eObject) {
			return new EObjectBasedModelExtentProvider(ModelExtentType.OUT, eObject);
		}
		
		@NonNull
		public static IModelExtentProvider createInOut(EObject eObject) {
			return new EObjectBasedModelExtentProvider(ModelExtentType.INOUT, eObject);
		}
	}
	
	public static class URIBasedModelExtentProvider extends EObjectBasedModelExtentProvider {
		
		protected URIBasedModelExtentProvider(ModelExtentType extentType, URI uri) {
			super(extentType, uri == null ? null : Util.loadURI(uri));
		}
		
		protected URIBasedModelExtentProvider(ModelExtentType extentType, String uri) {
			this(extentType, uri == null ? null : URI.createURI(uri));
		}
		
		@NonNull
		public static IModelExtentProvider createIn(String uri) {
			return new URIBasedModelExtentProvider(ModelExtentType.IN, uri);
		}
		
		@NonNull
		public static IModelExtentProvider createOut(String uri) {
			return new URIBasedModelExtentProvider(ModelExtentType.OUT, uri);
		}
		
		@NonNull
		public static IModelExtentProvider createInOut(String uri) {
			return new URIBasedModelExtentProvider(ModelExtentType.INOUT, uri);
		}
		
		@NonNull
		public static IModelExtentProvider createIn(URI uri) {
			return new URIBasedModelExtentProvider(ModelExtentType.IN, uri);
		}
		
		@NonNull
		public static IModelExtentProvider createOut(URI uri) {
			return new URIBasedModelExtentProvider(ModelExtentType.OUT, uri);
		}
		
		@NonNull
		public static IModelExtentProvider createInOut(URI uri) {
			return new URIBasedModelExtentProvider(ModelExtentType.INOUT, uri);
		}

	}
	
}
