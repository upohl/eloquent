package de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.resource;

import com.google.inject.Injector;
import de.uni_paderborn.fujaba.common.xtext.AbstractLanguageResource;
import de.uni_paderborn.fujaba.muml.allocation.ilp.lpsolve.xtext.LPSolveStandaloneSetup;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class LPSolveResource extends AbstractLanguageResource {
  protected Injector getInjector() {
    LPSolveStandaloneSetup _lPSolveStandaloneSetup = new LPSolveStandaloneSetup();
    return _lPSolveStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
  
  protected boolean isSerializable(final EObject object) {
    throw new Error("Unresolved compilation problems:"
      + "\nIntegerLinearProgram cannot be resolved to a type.");
  }
}
