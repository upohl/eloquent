package org.muml.psm.allocation.algorithm.main;

import java.util.HashMap;
import java.util.Map;

/**
 * A configuration object that manages configuration objects for
 * different strategies.
 */
public class MultiStrategyConfiguration {
	private Map<Class<?>, Object> strategyConfigMap;
	
	protected Map<Class<?>, Object> getStrategyConfigMap() {
		if (strategyConfigMap == null) {
			strategyConfigMap = new HashMap<Class<?>, Object>();
		}
		return strategyConfigMap;
	}
	
	public void addConfiguration(Class<?> strategy, Object configuration) {
		getStrategyConfigMap().put(strategy, configuration);
	}
	
	public <V> V getConfigurationFor(Class<?> strategy, Class<V> asClass) {
		Object configuration = getStrategyConfigMap().get(strategy);
		return asClass.cast(configuration);
	}

}
