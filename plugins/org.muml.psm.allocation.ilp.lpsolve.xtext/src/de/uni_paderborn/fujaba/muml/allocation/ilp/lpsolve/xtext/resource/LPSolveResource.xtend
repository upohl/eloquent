package de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.resource

import de.uni_paderborn.fujaba.common.xtext.AbstractLanguageResource
import org.eclipse.emf.ecore.EObject
import com.google.inject.Injector
import de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.LPSolveStandaloneSetup
import de.uni_paderborn.fujaba.muml.allocation.ilp.IntegerLinearProgram

class LPSolveResource extends AbstractLanguageResource {
	
	override protected Injector getInjector() {
		new LPSolveStandaloneSetup().createInjectorAndDoEMFRegistration;
	}
	
	override protected boolean isSerializable(EObject object) {
		object instanceof IntegerLinearProgram
	}
	
}