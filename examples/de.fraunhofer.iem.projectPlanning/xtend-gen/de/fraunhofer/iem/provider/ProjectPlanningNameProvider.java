package de.fraunhofer.iem.provider;

import de.fraunhofer.iem.projectPlanning.Employee;
import de.fraunhofer.iem.projectPlanning.Project;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.muml.psm.allocation.language.as.NameProvider;

/**
 * MUML-specific NameProvider. Currently, it only ComponentInstances
 * and ResourceInstances are supported.
 */
@SuppressWarnings("all")
public class ProjectPlanningNameProvider extends EObjectImpl implements NameProvider {
  private final static String unexpectedElement = "Unable to provide name for %s";
  
  @Override
  public String getName(final Object element) {
    String _xblockexpression = null;
    {
      EcoreUtil.resolveAll(((EObject) element).eResource());
      _xblockexpression = this.getNameFor(element);
    }
    return _xblockexpression;
  }
  
  protected String _getNameFor(final Object element) {
    String _format = String.format(ProjectPlanningNameProvider.unexpectedElement, element);
    throw new IllegalArgumentException(_format);
  }
  
  protected String _getNameFor(final Project project) {
    return project.getName();
  }
  
  protected String _getNameFor(final Employee employee) {
    return employee.getName();
  }
  
  public String getNameFor(final Object employee) {
    if (employee instanceof Employee) {
      return _getNameFor((Employee)employee);
    } else if (employee instanceof Project) {
      return _getNameFor((Project)employee);
    } else if (employee != null) {
      return _getNameFor(employee);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(employee).toString());
    }
  }
}
