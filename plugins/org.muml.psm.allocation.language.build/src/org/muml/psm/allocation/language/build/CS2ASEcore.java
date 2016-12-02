package org.muml.psm.allocation.language.build;

import java.util.List;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.util.Dictionary;
import org.eclipse.m2m.qvt.oml.util.Utils;
import org.eclipse.ocl.examples.build.utilities.PredefinedQVToTransformationExecutor;

public class CS2ASEcore extends PredefinedQVToTransformationExecutor {
	private static final String TRANSFORMATION_URI = "platform:/resource/org.muml.psm.allocation.language.build/transforms/CS2ASTransformation.qvto";
	private static final String oclCS2PivotClassMap = "oclCS2PivotClassMap";
	private static final String skipFeatures = "skipFeatures";
	
	private String csModelURI;
	private String pivotModelURI;
	
	public void setCsModelURI(String csModelURI) {
		this.csModelURI = csModelURI;
	}

	public void setPivotModelURI(String pivotModelURI) {
		this.pivotModelURI = pivotModelURI;
	}
	
	public void setasModelURI(String asModelURI) {
		setOut(asModelURI);
	}
	
	@Override
	protected String getPredefinedTransformationURI() {
		return TRANSFORMATION_URI;
	}
	
	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		addIn(csModelURI);
		addIn(pivotModelURI);
		super.invokeInternal(ctx, monitor, issues);
	}

	@Override
	protected void initializeConfigurationProperties(ExecutionContextImpl context) {
		Dictionary<String, String> dict = Utils.<String, String>createDictionary();
		// hmm ideally, this dict is specified in the calling workflow
		dict.put("ModelElementCS", "Element");
		dict.put("NamedElementCS", "NamedElement");
		dict.put("CompleteOCLDocumentCS", "Model");
		dict.put("ContextCS", "ExpressionInOCL");
		dict.put("TypedElementCS", "TypedElement");
		context.setConfigProperty(oclCS2PivotClassMap, dict);
		List<String> skipFeaturesList = Utils.<String>createList();
		skipFeaturesList.add("nameProviderImplementationClass");
		skipFeaturesList.add("storageProviderImplementationClass");
		context.setConfigProperty(skipFeatures, skipFeaturesList);
	}
}
