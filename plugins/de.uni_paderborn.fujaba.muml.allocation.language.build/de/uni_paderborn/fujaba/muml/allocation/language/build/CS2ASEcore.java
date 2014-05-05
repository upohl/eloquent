package de.uni_paderborn.fujaba.muml.allocation.language.build;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.ocl.examples.build.utilities.PredefinedQVToTransformationExecutor;

public class CS2ASEcore extends PredefinedQVToTransformationExecutor {
	private static final String TRANSFORMATION_URI = "platform:/resource/de.uni_paderborn.fujaba.muml.allocation.language/transforms/CS2ASTransformation.qvto";
	private static final String oclCS2PivotClassMap = "oclCS2PivotClassMap";
	
	private String csModelURI;
	private String pivotModelURI;
	private String asModelURI;
	
	public String getCsModelURI() {
		return csModelURI;
	}

	public void setCsModelURI(String csModelURI) {
		this.csModelURI = csModelURI;
	}

	public String getPivotModelURI() {
		return pivotModelURI;
	}

	public void setPivotModelURI(String pivotModelURI) {
		this.pivotModelURI = pivotModelURI;
	}

	public String getAsModelURI() {
		return asModelURI;
	}

	public void setAsModelURI(String asModelURI) {
		this.asModelURI = asModelURI;
	}
	
	@Override
	protected String getPredefinedTransformationURI() {
		return TRANSFORMATION_URI;
	}

	@Override
	protected void initializeConfigurationProperties(ExecutionContextImpl context) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("ModelElementCS", "Element");
		map.put("NamedElementCS", "NamedElement");
		map.put("ContextCS", "ExpressionInOCL");
		context.setConfigProperty(oclCS2PivotClassMap, map);
	}
}
