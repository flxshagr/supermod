/**
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package de.ubt.ai1.supermod.mm.collab;

import org.eclipse.emf.common.util.EList;

import de.ubt.ai1.supermod.mm.core.DefaultBinding;
import de.ubt.ai1.supermod.mm.core.Option;
import de.ubt.ai1.supermod.mm.core.Preference;
import de.ubt.ai1.supermod.mm.core.VersionSpaceElement;
import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.Revision#getPredecessors <em>Predecessors</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.Revision#getSuccessors <em>Successors</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.Revision#getAllPredecessors <em>All Predecessors</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.Revision#getAllSuccessors <em>All Successors</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.Revision#getEarliestPredecessors <em>Earliest Predecessors</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.Revision#getLatestSuccessors <em>Latest Successors</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.Revision#getRevisionOption <em>Revision Option</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.Revision#getRevisionDefaultBinding <em>Revision Default Binding</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.Revision#getPredecessorPreferences <em>Predecessor Preferences</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.Revision#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.Revision#getDisplayRevisionNumber <em>Display Revision Number</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.Revision#getDate <em>Date</em>}</li>
 *   <li>{@link de.ubt.ai1.supermod.mm.collab.Revision#getCommitMessage <em>Commit Message</em>}</li>
 * </ul>
 *
 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getRevision()
 * @model abstract="true"
 * @generated
 */
public interface Revision extends VersionSpaceElement {
	/**
	 * Returns the value of the '<em><b>Predecessors</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.collab.Revision}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.collab.Revision#getSuccessors <em>Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessors</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getRevision_Predecessors()
	 * @see de.ubt.ai1.supermod.mm.collab.Revision#getSuccessors
	 * @model opposite="successors"
	 * @generated
	 */
	EList<Revision> getPredecessors();

	/**
	 * Returns the value of the '<em><b>Successors</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.collab.Revision}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.collab.Revision#getPredecessors <em>Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Successors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Successors</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getRevision_Successors()
	 * @see de.ubt.ai1.supermod.mm.collab.Revision#getPredecessors
	 * @model opposite="predecessors"
	 * @generated
	 */
	EList<Revision> getSuccessors();

	/**
	 * Returns the value of the '<em><b>All Predecessors</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.collab.Revision}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.collab.Revision#getAllSuccessors <em>All Successors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Predecessors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Predecessors</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getRevision_AllPredecessors()
	 * @see de.ubt.ai1.supermod.mm.collab.Revision#getAllSuccessors
	 * @model opposite="allSuccessors" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Revision> getAllPredecessors();

	/**
	 * Returns the value of the '<em><b>All Successors</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.collab.Revision}.
	 * It is bidirectional and its opposite is '{@link de.ubt.ai1.supermod.mm.collab.Revision#getAllPredecessors <em>All Predecessors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Successors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Successors</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getRevision_AllSuccessors()
	 * @see de.ubt.ai1.supermod.mm.collab.Revision#getAllPredecessors
	 * @model opposite="allPredecessors" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Revision> getAllSuccessors();

	/**
	 * Returns the value of the '<em><b>Earliest Predecessors</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.collab.Revision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Earliest Predecessors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Earliest Predecessors</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getRevision_EarliestPredecessors()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Revision> getEarliestPredecessors();

	/**
	 * Returns the value of the '<em><b>Latest Successors</b></em>' reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.collab.Revision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latest Successors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Successors</em>' reference list.
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getRevision_LatestSuccessors()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Revision> getLatestSuccessors();

	/**
	 * Returns the value of the '<em><b>Revision Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision Option</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision Option</em>' containment reference.
	 * @see #setRevisionOption(Option)
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getRevision_RevisionOption()
	 * @model containment="true"
	 * @generated
	 */
	Option getRevisionOption();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.collab.Revision#getRevisionOption <em>Revision Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Option</em>' containment reference.
	 * @see #getRevisionOption()
	 * @generated
	 */
	void setRevisionOption(Option value);

	/**
	 * Returns the value of the '<em><b>Revision Default Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision Default Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision Default Binding</em>' containment reference.
	 * @see #setRevisionDefaultBinding(DefaultBinding)
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getRevision_RevisionDefaultBinding()
	 * @model containment="true"
	 * @generated
	 */
	DefaultBinding getRevisionDefaultBinding();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.collab.Revision#getRevisionDefaultBinding <em>Revision Default Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Default Binding</em>' containment reference.
	 * @see #getRevisionDefaultBinding()
	 * @generated
	 */
	void setRevisionDefaultBinding(DefaultBinding value);

	/**
	 * Returns the value of the '<em><b>Predecessor Preferences</b></em>' containment reference list.
	 * The list contents are of type {@link de.ubt.ai1.supermod.mm.core.Preference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predecessor Preferences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predecessor Preferences</em>' containment reference list.
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getRevision_PredecessorPreferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Preference> getPredecessorPreferences();

	/**
	 * Returns the value of the '<em><b>Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision Number</em>' attribute.
	 * @see #setRevisionNumber(int)
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getRevision_RevisionNumber()
	 * @model
	 * @generated
	 */
	int getRevisionNumber();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.collab.Revision#getRevisionNumber <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Number</em>' attribute.
	 * @see #getRevisionNumber()
	 * @generated
	 */
	void setRevisionNumber(int value);

	/**
	 * Returns the value of the '<em><b>Display Revision Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Revision Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Revision Number</em>' attribute.
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getRevision_DisplayRevisionNumber()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDisplayRevisionNumber();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getRevision_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.collab.Revision#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Commit Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commit Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commit Message</em>' attribute.
	 * @see #setCommitMessage(String)
	 * @see de.ubt.ai1.supermod.mm.collab.SuperModCollabPackage#getRevision_CommitMessage()
	 * @model
	 * @generated
	 */
	String getCommitMessage();

	/**
	 * Sets the value of the '{@link de.ubt.ai1.supermod.mm.collab.Revision#getCommitMessage <em>Commit Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commit Message</em>' attribute.
	 * @see #getCommitMessage()
	 * @generated
	 */
	void setCommitMessage(String value);

} // Revision
