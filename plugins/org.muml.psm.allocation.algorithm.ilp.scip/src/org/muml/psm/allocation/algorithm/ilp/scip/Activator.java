package org.muml.psm.allocation.algorithm.ilp.scip;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

	private static Activator plugin;
	
	/**
	 * The plug-in ID.
	 */
	public static final String PLUGIN_ID = "org.muml.psm.allocation.algorithm.ilp.lpsolve";
	
	public Activator() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		super.start(bundleContext);
		plugin = this;
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		plugin = null;
	}
	
	public static Activator getDefault() {
		return plugin;
	}
}
