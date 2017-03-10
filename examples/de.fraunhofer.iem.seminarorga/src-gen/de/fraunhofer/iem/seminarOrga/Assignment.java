/**
 * generated by Xtext 2.11.0
 */
package de.fraunhofer.iem.seminarOrga;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.iem.seminarOrga.Assignment#getStudent <em>Student</em>}</li>
 *   <li>{@link de.fraunhofer.iem.seminarOrga.Assignment#getTopic <em>Topic</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.iem.seminarOrga.SeminarOrgaPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends EObject
{
  /**
   * Returns the value of the '<em><b>Student</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Student</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Student</em>' reference.
   * @see #setStudent(Student)
   * @see de.fraunhofer.iem.seminarOrga.SeminarOrgaPackage#getAssignment_Student()
   * @model
   * @generated
   */
  Student getStudent();

  /**
   * Sets the value of the '{@link de.fraunhofer.iem.seminarOrga.Assignment#getStudent <em>Student</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Student</em>' reference.
   * @see #getStudent()
   * @generated
   */
  void setStudent(Student value);

  /**
   * Returns the value of the '<em><b>Topic</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Topic</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Topic</em>' reference.
   * @see #setTopic(Topic)
   * @see de.fraunhofer.iem.seminarOrga.SeminarOrgaPackage#getAssignment_Topic()
   * @model
   * @generated
   */
  Topic getTopic();

  /**
   * Sets the value of the '{@link de.fraunhofer.iem.seminarOrga.Assignment#getTopic <em>Topic</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Topic</em>' reference.
   * @see #getTopic()
   * @generated
   */
  void setTopic(Topic value);

} // Assignment
