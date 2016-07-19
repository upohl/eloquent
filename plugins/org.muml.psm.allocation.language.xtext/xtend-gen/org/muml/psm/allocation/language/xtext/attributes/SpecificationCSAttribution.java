package org.muml.psm.allocation.language.xtext.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.pivot.internal.scoping.EnvironmentView;
import org.eclipse.ocl.pivot.internal.scoping.ScopeView;
import org.eclipse.ocl.xtext.completeocl.attributes.CompleteOCLDocumentCSAttribution;
import org.eclipse.ocl.xtext.completeoclcs.ClassifierContextDeclCS;

@SuppressWarnings("all")
public class SpecificationCSAttribution extends CompleteOCLDocumentCSAttribution {
  /**
   * @NonNull
   */
  public final static SpecificationCSAttribution INSTANCE = new SpecificationCSAttribution();
  
  public ScopeView computeLookup(final EObject target, final EnvironmentView environmentView, final ScopeView scopeView) {
    ScopeView _xblockexpression = null;
    {
      final ScopeView outerScopeView = super.computeLookup(target, environmentView, scopeView);
      final EObject child = scopeView.getChild();
      if (((!environmentView.hasFinalResult()) && (child instanceof ClassifierContextDeclCS))) {
        environmentView.addRootPackages();
      }
      _xblockexpression = outerScopeView;
    }
    return _xblockexpression;
  }
}
