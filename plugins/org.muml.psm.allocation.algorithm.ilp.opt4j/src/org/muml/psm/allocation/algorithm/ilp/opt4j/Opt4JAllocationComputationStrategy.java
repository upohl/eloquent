package org.muml.psm.allocation.algorithm.ilp.opt4j;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.muml.psm.allocation.algorithm.ilp.opt4j.config.ConfigFactory;
import org.muml.psm.allocation.algorithm.ilp.opt4j.config.Opt4jConfiguration;
import org.muml.psm.allocation.algorithm.qvto.QVToBasedAllocationComputationStrategy;

public class Opt4JAllocationComputationStrategy extends
		QVToBasedAllocationComputationStrategy<Opt4jConfiguration> {
	
	private static final String transformationURI =
			"platform:/plugin/org.muml.psm.allocation.algorithm.ilp.opt4j/transforms/Opt4JBasedAlgorithm.qvto";
	
	private static final String transformationConfigurationPropertyName = "config";
	
	private Opt4jConfiguration configuration;
	
	private boolean storeILPModel;

	public Opt4JAllocationComputationStrategy() {
		super(transformationURI);
	}
	
	@Override
	public Opt4jConfiguration getConfiguration() {
		if (configuration == null) {
			configuration = ConfigFactory.eINSTANCE
					.createOpt4jConfiguration();
		}
		return configuration;
	}
	
	@Override
	protected Map<String, Object> getConfigurationPropertyMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		StringBuilder builder = new StringBuilder();
		for (EAttribute attribute : configuration.eClass().getEAllAttributes()) {
			builder.append(attribute.getName());
			builder.append("=");
			Object value = configuration.eGet(attribute);
			if (value instanceof Boolean) {
				builder.append((Boolean) value ? 1 : 0);
			} else {
				builder.append(value);
			}
			builder.append(",");
		}
		builder.deleteCharAt(builder.length() - 1);
		map.put(transformationConfigurationPropertyName, builder.toString());
		map.put("STORE_ILP_MODEL", storeILPModel);
		return map;
	}
	
}
