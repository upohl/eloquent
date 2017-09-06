package org.muml.eloquent.ocl.vql.tests;

import org.eclipse.ocl.xtext.completeocl.CompleteOCLRuntimeModule;
import org.eclipse.ocl.xtext.completeocl.CompleteOCLStandaloneSetup;
import org.eclipse.viatra.query.patternlanguage.emf.EMFPatternLanguageStandaloneSetup;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.testing.GlobalRegistries;
import org.eclipse.xtext.testing.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.eclipse.xtext.testing.IRegistryConfigurator;
import org.muml.eloquent.ocl.vql.VQLAwareOCLResource;

import com.google.inject.Guice;
import com.google.inject.Injector;

/*
 * Shamelessly copied and adapted from a vanilla xtext project.
 * Its sole purpose is to bind the XtextResource class to
 * the VQLAwareOCLResource class.
 */
public class InjectorProvider implements IInjectorProvider, IRegistryConfigurator {

	protected GlobalStateMemento stateBeforeInjectorCreation;
	protected GlobalStateMemento stateAfterInjectorCreation;
	protected Injector injector;

	static {
		GlobalRegistries.initializeDefaults();
	}

	@Override
	public Injector getInjector() {
		if (injector == null) {
			stateBeforeInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
			this.injector = internalCreateInjector();
			stateAfterInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
		}
		return injector;
	}

	protected Injector internalCreateInjector() {
		EMFPatternLanguageStandaloneSetup.doSetup();
		return new CompleteOCLStandaloneSetup() {
			@Override
			public Injector createInjector() {
				return Guice.createInjector(createRuntimeModule());
			}
		}.createInjectorAndDoEMFRegistration();
	}

	protected CompleteOCLRuntimeModule createRuntimeModule() {
		// make it work also with Maven/Tycho and OSGI
		// see https://bugs.eclipse.org/bugs/show_bug.cgi?id=493672
		return new CompleteOCLRuntimeModule() {
			@Override
			public ClassLoader bindClassLoaderToInstance() {
				return this.getClass()
						.getClassLoader();
			}
			
			@Override
			public Class<? extends XtextResource> bindXtextResource() {
				return VQLAwareOCLResource.class;
			}
		};
	}

	@Override
	public void restoreRegistry() {
		stateBeforeInjectorCreation.restoreGlobalState();
	}

	@Override
	public void setupRegistry() {
		getInjector();
		stateAfterInjectorCreation.restoreGlobalState();
	}
}
