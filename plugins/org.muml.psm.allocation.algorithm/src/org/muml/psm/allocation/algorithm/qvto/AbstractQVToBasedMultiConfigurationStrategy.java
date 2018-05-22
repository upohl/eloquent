package org.muml.psm.allocation.algorithm.qvto;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.muml.psm.allocation.algorithm.main.IStrategy;
import org.muml.psm.allocation.algorithm.main.MultiStrategyConfiguration;

/**
 * An abstract class that provides methods to construct a configuration
 * property map based on a specific strategy class. Such a transformation
 * property map can be passed, for instance, to the
 * <code>QVToBasedStrategyTransformationRunner</code>'s
 * <code>runTransformation</code> method.
 *
 */
public abstract class AbstractQVToBasedMultiConfigurationStrategy implements IStrategy<MultiStrategyConfiguration> {
	
	private static final String manyFeatureError = "A many feature is not supported: %s";
	private static final String nullValueError = "A null value is not supported";

	@Override
	public @Nullable MultiStrategyConfiguration getConfiguration() {
		return null;
	}
	
	@NonNull
	protected Map<String, Object> getConfigurationPropertyMapFor(Class<?> strategy) {
		Map<String, Object> map = new HashMap<String, Object>();
		EObject configuration = getConfiguration().getConfigurationFor(strategy,
				EObject.class);
		if (configuration != null) {
			// hmm what to do in the null case?
			StringBuilder builder = new StringBuilder();
			buildDictionaryString(builder, configuration);
			// hmm should we cut off a potentially trailing ","? (the
			// current qvto code can handle it)
			map.put(getConfigurationPropertyNameFor(strategy), builder.toString());
		}
		return map;
	}
	
	@NonNull
	protected abstract String getConfigurationPropertyNameFor(Class<?> strategy);
	
	protected void buildDictionaryString(@NonNull StringBuilder builder, @NonNull EObject eObject) {
		for (EAttribute attribute : eObject.eClass().getEAllAttributes()) {
			buildKeyValueString(builder, eObject, attribute);
		}
		for (EReference reference : eObject.eClass().getEAllContainments()) {
			if (reference.isMany()) {
				throw new IllegalStateException(
						String.format(manyFeatureError, reference));
			}
			// hmm one big "dict"?
			buildDictionaryString(builder, (EObject) eObject.eGet(reference));
		}
	}
	
	protected void buildKeyValueString(StringBuilder builder, EObject eObject, EAttribute attribute) {
		builder.append(attribute.getName());
		builder.append("=");
		builder.append(convertValue(eObject.eGet(attribute)));
		builder.append(",");
	}
	
	protected String convertValue(Object value) {
		if (value == null) {
			throw new IllegalArgumentException(nullValueError);
		}
		if (value instanceof Boolean) {
			return (Boolean) value ? "1" : "0";
		}
		return value.toString();
	}

}
