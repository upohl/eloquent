package org.muml.psm.allocation.algorithm.main;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.annotation.NonNull;

/**
 * Provides access to registered <code>org.muml.psm.allocation.algorithm.strategy</code>
 * extensions.
 *
 */
public class AllocationComputationStrategyExtension {
	private static final String extensionPointId =
			"org.muml.psm.allocation.algorithm.strategy";
	
	/**
	 * Returns descriptions for all registered
	 * <code>org.muml.psm.allocation.algorithm.strategy</code> extensions.
	 * 
	 * @return the allocationComputationStrategyDescrptions
	 */
	public static AllocationComputationStrategyDescription[] getDescriptions() {
		IConfigurationElement[] configurationElements = Platform
				.getExtensionRegistry()
				.getConfigurationElementsFor(extensionPointId);
		AllocationComputationStrategyDescription[] descriptions =
				new AllocationComputationStrategyDescription[configurationElements.length];
		for (int i = 0; i < configurationElements.length; i++) {
			descriptions[i] = new AllocationComputationStrategyDescription(
					configurationElements[i]);
		}
		return descriptions;
	}
	
	/**
	 * Encapsulates <code>org.muml.psm.allocation.algorithm.strategy</code>
	 * extension. It provides access to the strategy name and description.
	 * Additionally, the concrete <code>IAllocationComputationStrategy</code> can
	 * be created lazily.
	 *
	 */
	public static class AllocationComputationStrategyDescription {
		private static final String nameAttribute = "name";
		private static final String descriptionAttribute = "description";
		private static final String classAttribute = "class";
		private static final String invalidClass = "%s is no IAllocationComputationStrategy<?>";
		
		private IConfigurationElement configurationElement;
		
		public AllocationComputationStrategyDescription(
				@NonNull IConfigurationElement configurationElement) {
			this.configurationElement = configurationElement;
		}
		
		@NonNull
		public String getName() {
			return configurationElement.getAttribute(nameAttribute);
		}
		
		@NonNull
		public String getDescription() {
			String description = configurationElement.getAttribute(
					descriptionAttribute);
			return description != null ? description : "";
		}
		
		/**
		 * Returns the <code>IAllocationComputationStrategy</code> object. A
		 * <code>IllegalStateException</code> is thrown, if the configuration
		 * element's <code>class</code> attribute does not correspond to
		 * an <code>IAllocationComputationStrategy</code>.
		 * 
		 * @return the allocation computation strategy
		 */
		@NonNull
		public IAllocationComputationStrategy<?, ?> getAllocationComputationStrategy()
				throws CoreException {
			Object object = configurationElement.createExecutableExtension(
					classAttribute);
			if (!(object instanceof IAllocationComputationStrategy<?, ?>)) {
				throw new IllegalStateException(
						String.format(invalidClass, object));
			}
			return (IAllocationComputationStrategy<?, ?>) object;
		}
	}
}
