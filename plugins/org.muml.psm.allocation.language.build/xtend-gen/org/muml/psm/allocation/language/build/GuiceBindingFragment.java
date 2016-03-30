package org.muml.psm.allocation.language.build;

import java.util.HashSet;
import java.util.Set;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.generator.BindFactory;
import org.eclipse.xtext.generator.BindKey;
import org.eclipse.xtext.generator.Binding;

@SuppressWarnings("all")
public class GuiceBindingFragment /* implements EssentialOCLFragment  */{
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
    throw new Error("Unresolved compilation problems:"
      + "\nSpecificationCSResource cannot be resolved to a type."
      + "\nThe method or field super is undefined"
      + "\ngetGuiceBindingsRt cannot be resolved"
      + "\nremoveBindingsFor cannot be resolved"
      + "\naddBindingFor cannot be resolved");
  }
  
  @Override
  public Set<Binding> getGuiceBindingsUi(final Grammar grammar) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\ngetGuiceBindingsUi cannot be resolved"
      + "\nremoveBindingsFor cannot be resolved");
  }
}
