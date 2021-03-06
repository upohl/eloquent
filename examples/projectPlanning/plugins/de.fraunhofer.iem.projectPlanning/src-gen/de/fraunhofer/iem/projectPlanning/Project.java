/**
 * generated by Xtext 2.10.0
 */
package de.fraunhofer.iem.projectPlanning;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.iem.projectPlanning.Project#getName <em>Name</em>}</li>
 *   <li>{@link de.fraunhofer.iem.projectPlanning.Project#getRequiresResources <em>Requires Resources</em>}</li>
 *   <li>{@link de.fraunhofer.iem.projectPlanning.Project#getRequiresCapabilities <em>Requires Capabilities</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.iem.projectPlanning.ProjectPlanningPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.fraunhofer.iem.projectPlanning.ProjectPlanningPackage#getProject_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.fraunhofer.iem.projectPlanning.Project#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Requires Resources</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requires Resources</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requires Resources</em>' attribute.
   * @see #setRequiresResources(int)
   * @see de.fraunhofer.iem.projectPlanning.ProjectPlanningPackage#getProject_RequiresResources()
   * @model
   * @generated
   */
  int getRequiresResources();

  /**
   * Sets the value of the '{@link de.fraunhofer.iem.projectPlanning.Project#getRequiresResources <em>Requires Resources</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Requires Resources</em>' attribute.
   * @see #getRequiresResources()
   * @generated
   */
  void setRequiresResources(int value);

  /**
   * Returns the value of the '<em><b>Requires Capabilities</b></em>' reference list.
   * The list contents are of type {@link de.fraunhofer.iem.projectPlanning.Capability}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requires Capabilities</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requires Capabilities</em>' reference list.
   * @see de.fraunhofer.iem.projectPlanning.ProjectPlanningPackage#getProject_RequiresCapabilities()
   * @model
   * @generated
   */
  EList<Capability> getRequiresCapabilities();

} // Project
