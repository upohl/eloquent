package org.muml.eloquent.ocl.vql;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.xtext.completeocl.utilities.CompleteOCLCSResource;

public class VQLAwareOCLResource extends CompleteOCLCSResource {
	
	private boolean resourceFactoryInstalled = false;
	
	@Override
	protected void initializeResourceFactory(Resource.Factory.@NonNull Registry resourceFactoryRegistry) {
		if (!resourceFactoryInstalled) {
			VQLASResourceFactory.install(resourceFactoryRegistry);
			resourceFactoryInstalled = true;
		}
		super.initializeResourceFactory(resourceFactoryRegistry);
	}
	
}
