package org.muml.psm.allocation.algorithm.ui.wizard;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jface.viewers.IStructuredSelection;

public class ExtensionUtil {
	private static final String wizardPageProvider =
			"org.muml.psm.allocation.algorithm.ui.wizardPageProvider";
	private static final String classPropertyName =
			"class";
	private static final String unexpectedExecutableExtension =
			"Unexpected executable extension: %s (expected %s)";
	
	public static IConfigurationElement[] getConfigurationElements(String extensionPointId) {
		return Platform.getExtensionRegistry()
				.getConfigurationElementsFor(extensionPointId);
	}
	
	public static <T> T createExecutableExtension(@NonNull IConfigurationElement element,
			@NonNull String propertyName, @NonNull Class<? extends T> clazz) {
		Object object;
		try {
			object = element.createExecutableExtension(propertyName);
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
		if (!clazz.isInstance(object)) {
			throw new IllegalArgumentException(
					String.format(unexpectedExecutableExtension, object.getClass(), clazz));
		}
		return clazz.cast(object);
	}
	
	public static IAllocationWizardPageProvider getWizardPageProvider(IStructuredSelection ssel) {
		for (IConfigurationElement element : getConfigurationElements(wizardPageProvider)) {
			IAllocationWizardPageProvider wizardPageProvider = createExecutableExtension(element,
					classPropertyName,
					IAllocationWizardPageProvider.class);
			if (wizardPageProvider.isProviderFor(ssel)) {
				return wizardPageProvider;
			}
		}
		return null;
	}
}
