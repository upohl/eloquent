package de.uni_paderborn.fujaba.muml.allocation.language.attributes;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ocl.examples.pivot.scoping.EnvironmentView;
import org.eclipse.ocl.examples.pivot.scoping.ScopeView;
import org.eclipse.ocl.examples.xtext.completeocl.attributes.CompleteOCLDocumentCSAttribution;
import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.ClassifierContextDeclCS;

@SuppressWarnings("all")
public class SpecificationCSAttribution extends CompleteOCLDocumentCSAttribution {
  @NonNull
  public final static SpecificationCSAttribution INSTANCE = new SpecificationCSAttribution();
  
  public ScopeView computeLookup(@NonNull final EObject target, @NonNull final EnvironmentView environmentView, @NonNull final ScopeView scopeView) {
    ScopeView _xblockexpression = null;
    {
      final ScopeView outerScopeView = super.computeLookup(target, environmentView, scopeView);
      final EObject child = scopeView.getChild();
      boolean _and = false;
      boolean _hasFinalResult = environmentView.hasFinalResult();
      boolean _not = (!_hasFinalResult);
      if (!_not) {
        _and = false;
      } else {
        _and = (child instanceof ClassifierContextDeclCS);
      }
      if (_and) {
        environmentView.addRootPackages();
      }
      _xblockexpression = outerScopeView;
    }
    return _xblockexpression;
  }
}
