package de.uni_paderborn.fujaba.muml.allocation.language.build;

import de.uni_paderborn.fujaba.muml.allocation.language.resource.SpecificationCSResource;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.ocl.examples.build.fragments.EssentialOCLFragment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.generator.BindFactory;
import org.eclipse.xtext.generator.BindKey;
import org.eclipse.xtext.generator.Binding;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;

@SuppressWarnings("all")
public class GuiceBindingFragment extends EssentialOCLFragment {
  private Set<Binding> removeBindingsFor(final Set<Binding> bindings, final Class<?> clazz) {
    Set<Binding> _xblockexpression = null;
    {
      final Set<Binding> toRemove = new HashSet<Binding>();
      String _name = clazz.getName();
      final BindKey bindKey = BindKey.type(_name);
      for (final Binding binding : bindings) {
        BindKey _key = binding.getKey();
        boolean _equals = _key.equals(bindKey);
        if (_equals) {
          toRemove.add(binding);
        }
      }
      bindings.removeAll(toRemove);
      _xblockexpression = bindings;
    }
    return _xblockexpression;
  }
  
  private Set<Binding> addBindingFor(final Set<Binding> bindings, final Class<?> fromClazz, final Class<?> toClazz) {
    Set<Binding> _xblockexpression = null;
    {
      BindFactory _bindFactory = new BindFactory();
      String _name = fromClazz.getName();
      String _name_1 = toClazz.getName();
      BindFactory _addTypeToType = _bindFactory.addTypeToType(_name, _name_1);
      Set<Binding> _bindings = _addTypeToType.getBindings();
      bindings.addAll(_bindings);
      _xblockexpression = bindings;
    }
    return _xblockexpression;
  }
  
  @Override
  public Set<Binding> getGuiceBindingsRt(final Grammar grammar) {
    Set<Binding> _guiceBindingsRt = super.getGuiceBindingsRt(grammar);
    Set<Binding> _removeBindingsFor = this.removeBindingsFor(_guiceBindingsRt, 
      XtextResource.class);
    return this.addBindingFor(_removeBindingsFor, 
      XtextResource.class, 
      SpecificationCSResource.class);
  }
  
  @Override
  public Set<Binding> getGuiceBindingsUi(final Grammar grammar) {
    Set<Binding> _guiceBindingsUi = super.getGuiceBindingsUi(grammar);
    return this.removeBindingsFor(_guiceBindingsUi, 
      XtextEditor.class);
  }
}
