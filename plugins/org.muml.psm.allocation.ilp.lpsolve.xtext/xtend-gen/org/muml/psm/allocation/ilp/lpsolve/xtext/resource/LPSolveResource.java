package org.muml.psm.allocation.ilp.lpsolve.xtext.resource;

import com.google.inject.Injector;
import org.eclipse.emf.ecore.EObject;
import org.muml.core.common.xtext.AbstractLanguageResource;
import org.muml.psm.allocation.ilp.IntegerLinearProgram;
import org.muml.psm.allocation.ilp.lpsolve.xtext.LPSolveStandaloneSetup;

@SuppressWarnings("all")
public class LPSolveResource extends AbstractLanguageResource {
  @Override
  protected Injector getInjector() {
    LPSolveStandaloneSetup _lPSolveStandaloneSetup = new LPSolveStandaloneSetup();
    return _lPSolveStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
  
  @Override
  protected boolean isSerializable(final EObject object) {
    return (object instanceof IntegerLinearProgram);
  }
}
