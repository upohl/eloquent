/*
* generated by Xtext
*/
package de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class LPSolveStandaloneSetup extends LPSolveStandaloneSetupGenerated{

	public static void doSetup() {
		new LPSolveStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

