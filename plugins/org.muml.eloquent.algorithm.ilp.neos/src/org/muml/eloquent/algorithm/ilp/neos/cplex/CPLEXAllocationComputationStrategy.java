package org.muml.eloquent.algorithm.ilp.neos.cplex;

import java.util.HashMap;
import java.util.Map;

import org.muml.eloquent.algorithm.ilp.neos.cplex.config.CPLEXConfiguration;
import org.muml.eloquent.algorithm.ilp.neos.cplex.config.ConfigFactory;
import org.muml.psm.allocation.algorithm.qvto.QVToBasedAllocationComputationStrategy;

public class CPLEXAllocationComputationStrategy extends QVToBasedAllocationComputationStrategy<CPLEXConfiguration> {
	private static final String transformationURI =
			"platform:/plugin/org.muml.eloquent.algorithm.ilp.neos/transforms/CPLEXBasedAlgorithm.qvto";
	
	private static final String transformationConfigurationPropertyName =
			"config";
	
	private CPLEXConfiguration configuration;
	
	public CPLEXAllocationComputationStrategy() {
		super(transformationURI);
	}
	
	@Override
	protected Map<String, Object> getConfigurationPropertyMap() {
		Map<String, Object> configurationPropertyMap = new HashMap<String, Object>();
		String email = String.format("%s=%s", "email", getConfiguration().getEmail());
		configurationPropertyMap.put(transformationConfigurationPropertyName, email);
		return configurationPropertyMap;
	}
	
	@Override
	public CPLEXConfiguration getConfiguration() {
		if (configuration == null) {
			configuration = ConfigFactory.eINSTANCE.createCPLEXConfiguration();
		}
		return configuration;
	}

}
