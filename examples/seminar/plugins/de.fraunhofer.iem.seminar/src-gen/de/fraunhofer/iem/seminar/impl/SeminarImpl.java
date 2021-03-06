/**
 * generated by Xtext 2.10.0
 */
package de.fraunhofer.iem.seminar.impl;

import de.fraunhofer.iem.seminar.Assignment;
import de.fraunhofer.iem.seminar.Preference;
import de.fraunhofer.iem.seminar.Rating;
import de.fraunhofer.iem.seminar.Seminar;
import de.fraunhofer.iem.seminar.SeminarPackage;
import de.fraunhofer.iem.seminar.Student;
import de.fraunhofer.iem.seminar.Supervise;
import de.fraunhofer.iem.seminar.Supervisor;
import de.fraunhofer.iem.seminar.Topic;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seminar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.iem.seminar.impl.SeminarImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.fraunhofer.iem.seminar.impl.SeminarImpl#getSupervisors <em>Supervisors</em>}</li>
 *   <li>{@link de.fraunhofer.iem.seminar.impl.SeminarImpl#getStudents <em>Students</em>}</li>
 *   <li>{@link de.fraunhofer.iem.seminar.impl.SeminarImpl#getTopics <em>Topics</em>}</li>
 *   <li>{@link de.fraunhofer.iem.seminar.impl.SeminarImpl#getPreferences <em>Preferences</em>}</li>
 *   <li>{@link de.fraunhofer.iem.seminar.impl.SeminarImpl#getRatings <em>Ratings</em>}</li>
 *   <li>{@link de.fraunhofer.iem.seminar.impl.SeminarImpl#getSupervises <em>Supervises</em>}</li>
 *   <li>{@link de.fraunhofer.iem.seminar.impl.SeminarImpl#getAssignments <em>Assignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeminarImpl extends MinimalEObjectImpl.Container implements Seminar
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSupervisors() <em>Supervisors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupervisors()
   * @generated
   * @ordered
   */
  protected EList<Supervisor> supervisors;

  /**
   * The cached value of the '{@link #getStudents() <em>Students</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudents()
   * @generated
   * @ordered
   */
  protected EList<Student> students;

  /**
   * The cached value of the '{@link #getTopics() <em>Topics</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTopics()
   * @generated
   * @ordered
   */
  protected EList<Topic> topics;

  /**
   * The cached value of the '{@link #getPreferences() <em>Preferences</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreferences()
   * @generated
   * @ordered
   */
  protected EList<Preference> preferences;

  /**
   * The cached value of the '{@link #getRatings() <em>Ratings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRatings()
   * @generated
   * @ordered
   */
  protected EList<Rating> ratings;

  /**
   * The cached value of the '{@link #getSupervises() <em>Supervises</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupervises()
   * @generated
   * @ordered
   */
  protected EList<Supervise> supervises;

  /**
   * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignments()
   * @generated
   * @ordered
   */
  protected EList<Assignment> assignments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SeminarImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SeminarPackage.Literals.SEMINAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SeminarPackage.SEMINAR__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Supervisor> getSupervisors()
  {
    if (supervisors == null)
    {
      supervisors = new EObjectContainmentEList<Supervisor>(Supervisor.class, this, SeminarPackage.SEMINAR__SUPERVISORS);
    }
    return supervisors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Student> getStudents()
  {
    if (students == null)
    {
      students = new EObjectContainmentEList<Student>(Student.class, this, SeminarPackage.SEMINAR__STUDENTS);
    }
    return students;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Topic> getTopics()
  {
    if (topics == null)
    {
      topics = new EObjectContainmentEList<Topic>(Topic.class, this, SeminarPackage.SEMINAR__TOPICS);
    }
    return topics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Preference> getPreferences()
  {
    if (preferences == null)
    {
      preferences = new EObjectContainmentEList<Preference>(Preference.class, this, SeminarPackage.SEMINAR__PREFERENCES);
    }
    return preferences;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rating> getRatings()
  {
    if (ratings == null)
    {
      ratings = new EObjectContainmentEList<Rating>(Rating.class, this, SeminarPackage.SEMINAR__RATINGS);
    }
    return ratings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Supervise> getSupervises()
  {
    if (supervises == null)
    {
      supervises = new EObjectContainmentEList<Supervise>(Supervise.class, this, SeminarPackage.SEMINAR__SUPERVISES);
    }
    return supervises;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Assignment> getAssignments()
  {
    if (assignments == null)
    {
      assignments = new EObjectContainmentEList<Assignment>(Assignment.class, this, SeminarPackage.SEMINAR__ASSIGNMENTS);
    }
    return assignments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SeminarPackage.SEMINAR__SUPERVISORS:
        return ((InternalEList<?>)getSupervisors()).basicRemove(otherEnd, msgs);
      case SeminarPackage.SEMINAR__STUDENTS:
        return ((InternalEList<?>)getStudents()).basicRemove(otherEnd, msgs);
      case SeminarPackage.SEMINAR__TOPICS:
        return ((InternalEList<?>)getTopics()).basicRemove(otherEnd, msgs);
      case SeminarPackage.SEMINAR__PREFERENCES:
        return ((InternalEList<?>)getPreferences()).basicRemove(otherEnd, msgs);
      case SeminarPackage.SEMINAR__RATINGS:
        return ((InternalEList<?>)getRatings()).basicRemove(otherEnd, msgs);
      case SeminarPackage.SEMINAR__SUPERVISES:
        return ((InternalEList<?>)getSupervises()).basicRemove(otherEnd, msgs);
      case SeminarPackage.SEMINAR__ASSIGNMENTS:
        return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SeminarPackage.SEMINAR__NAME:
        return getName();
      case SeminarPackage.SEMINAR__SUPERVISORS:
        return getSupervisors();
      case SeminarPackage.SEMINAR__STUDENTS:
        return getStudents();
      case SeminarPackage.SEMINAR__TOPICS:
        return getTopics();
      case SeminarPackage.SEMINAR__PREFERENCES:
        return getPreferences();
      case SeminarPackage.SEMINAR__RATINGS:
        return getRatings();
      case SeminarPackage.SEMINAR__SUPERVISES:
        return getSupervises();
      case SeminarPackage.SEMINAR__ASSIGNMENTS:
        return getAssignments();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SeminarPackage.SEMINAR__NAME:
        setName((String)newValue);
        return;
      case SeminarPackage.SEMINAR__SUPERVISORS:
        getSupervisors().clear();
        getSupervisors().addAll((Collection<? extends Supervisor>)newValue);
        return;
      case SeminarPackage.SEMINAR__STUDENTS:
        getStudents().clear();
        getStudents().addAll((Collection<? extends Student>)newValue);
        return;
      case SeminarPackage.SEMINAR__TOPICS:
        getTopics().clear();
        getTopics().addAll((Collection<? extends Topic>)newValue);
        return;
      case SeminarPackage.SEMINAR__PREFERENCES:
        getPreferences().clear();
        getPreferences().addAll((Collection<? extends Preference>)newValue);
        return;
      case SeminarPackage.SEMINAR__RATINGS:
        getRatings().clear();
        getRatings().addAll((Collection<? extends Rating>)newValue);
        return;
      case SeminarPackage.SEMINAR__SUPERVISES:
        getSupervises().clear();
        getSupervises().addAll((Collection<? extends Supervise>)newValue);
        return;
      case SeminarPackage.SEMINAR__ASSIGNMENTS:
        getAssignments().clear();
        getAssignments().addAll((Collection<? extends Assignment>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SeminarPackage.SEMINAR__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SeminarPackage.SEMINAR__SUPERVISORS:
        getSupervisors().clear();
        return;
      case SeminarPackage.SEMINAR__STUDENTS:
        getStudents().clear();
        return;
      case SeminarPackage.SEMINAR__TOPICS:
        getTopics().clear();
        return;
      case SeminarPackage.SEMINAR__PREFERENCES:
        getPreferences().clear();
        return;
      case SeminarPackage.SEMINAR__RATINGS:
        getRatings().clear();
        return;
      case SeminarPackage.SEMINAR__SUPERVISES:
        getSupervises().clear();
        return;
      case SeminarPackage.SEMINAR__ASSIGNMENTS:
        getAssignments().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SeminarPackage.SEMINAR__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SeminarPackage.SEMINAR__SUPERVISORS:
        return supervisors != null && !supervisors.isEmpty();
      case SeminarPackage.SEMINAR__STUDENTS:
        return students != null && !students.isEmpty();
      case SeminarPackage.SEMINAR__TOPICS:
        return topics != null && !topics.isEmpty();
      case SeminarPackage.SEMINAR__PREFERENCES:
        return preferences != null && !preferences.isEmpty();
      case SeminarPackage.SEMINAR__RATINGS:
        return ratings != null && !ratings.isEmpty();
      case SeminarPackage.SEMINAR__SUPERVISES:
        return supervises != null && !supervises.isEmpty();
      case SeminarPackage.SEMINAR__ASSIGNMENTS:
        return assignments != null && !assignments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SeminarImpl
