package org.muml.psm.allocation.ilp.lpsolve.xtext.resource

import com.google.inject.Injector
import org.eclipse.emf.ecore.EObject
import org.muml.psm.allocation.ilp.IntegerLinearProgram
import org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolveStandaloneSetup

class LPSolveResource extends AbstractLanguageResource {
	
	override protected Injector getInjector() {
		new LPSolveStandaloneSetup().createInjectorAndDoEMFRegistration;
	}
	
	override protected boolean isSerializable(EObject object) {
		object instanceof IntegerLinearProgram
	}
	
}