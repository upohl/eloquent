package org.muml.eloquent.ocl.vql;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.internal.resource.ASResourceFactory;
import org.eclipse.ocl.pivot.internal.resource.AbstractASResourceFactory;
import org.eclipse.ocl.pivot.internal.utilities.EnvironmentFactoryInternal;
import org.eclipse.ocl.pivot.resource.ASResource;
import org.eclipse.ocl.pivot.utilities.ClassUtil;

public class VQLASResourceFactory extends AbstractASResourceFactory {
	
	/*
	 * This adapter serves two purposes:
	 * - avoid gazillion VQL2AS instances (which could/would be directly
	 *   garbage collected)
	 * - dispose objects that were created during the VQL2AS conversion
	 *   (this dispose is probably not needed, but it does not harm...)
	 */
	protected static class VQL2ASAdapter extends AdapterImpl {
		private VQL2AS vql2AS;
		
		public VQL2ASAdapter(@NonNull Resource resource,
				@NonNull EnvironmentFactoryInternal environmentFactory) {
			vql2AS = new VQL2AS(resource, environmentFactory);
		}
		
		public static @Nullable VQL2ASAdapter findAdapter(@NonNull Resource resource) {
			return ClassUtil.getAdapter(VQL2ASAdapter.class, resource);
		}
		
		public @NonNull Model getASModel() {
			return vql2AS.getASModel();
		}
		
		@Override
		public boolean isAdapterForType(Object type) {
			return VQL2ASAdapter.class == type;
		}
		
		@Override
		public void unsetTarget(Notifier oldTarget) {
			super.unsetTarget(oldTarget);
			// time to say goodbye
			vql2AS.dispose();
		}
	}
	
	private static final String VQL_EXTENSION = "vql";
	private static final String VQL_CONTENT_TYPE =
			ASResource.CONTENT_TYPE + "." + VQL_EXTENSION;
	
	// hrm this sucks... (way too generic)
	private static final String VQL_RESOURCE_CLASS_NAME =
			"org.eclipse.xtext.xbase.resource.BatchLinkableResource";
	
	private static VQLASResourceFactory INSTANCE;
	
	public static synchronized @NonNull VQLASResourceFactory getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new VQLASResourceFactory();
			INSTANCE.install(VQL_EXTENSION, VQL_RESOURCE_CLASS_NAME);
		}
		return INSTANCE;
	}
	
	public static void install(Resource.Factory.@NonNull Registry resourceFactoryRegistry) {
		/*
		 * Just register our content type (otherwise a call to
		 * PivotMetamodelManager.getResource fails, because there is no
		 * ASResourceFactory registered for our content type)
		 */
		resourceFactoryRegistry.getContentTypeToFactoryMap()
				.put(getInstance().getContentType(), getInstance());
	}

	public VQLASResourceFactory() {
		super(VQL_CONTENT_TYPE);
	}

	@Override
	public @NonNull ASResourceFactory getASResourceFactory() {
		return getInstance();
	}
	
	@Override
	public @Nullable Element importFromResource(@NonNull EnvironmentFactoryInternal environmentFactory,
			@NonNull Resource resource, @Nullable URI uri) {
		VQL2ASAdapter adapter = VQL2ASAdapter.findAdapter(resource);
		if (adapter == null) {
			adapter = new VQL2ASAdapter(resource, environmentFactory);
			resource.eAdapters().add(adapter);
		}
		return adapter.getASModel();
	}

}
