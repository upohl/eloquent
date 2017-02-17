package de.fraunhofer.iem.provider;

import de.fraunhofer.iem.seminar.Student;
import de.fraunhofer.iem.seminar.Topic;
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
public class SeminarNameProvider extends EObjectImpl implements NameProvider {
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
    String _format = String.format(SeminarNameProvider.unexpectedElement, element);
    throw new IllegalArgumentException(_format);
  }
  
  protected String _getNameFor(final Topic topic) {
    return topic.getName();
  }
  
  protected String _getNameFor(final Student student) {
    return student.getName();
  }
  
  public String getNameFor(final Object student) {
    if (student instanceof Student) {
      return _getNameFor((Student)student);
    } else if (student instanceof Topic) {
      return _getNameFor((Topic)student);
    } else if (student != null) {
      return _getNameFor(student);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(student).toString());
    }
  }
}
