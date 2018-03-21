/******************************************************************************
 * Copyright (c) 2014 Chair for Applied Computer Science I, University of 
 * Bayreuth. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html 
 *****************************************************************************/
package de.ubt.ai1.supermod.mm.core.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.ubt.ai1.supermod.mm.core.Invariant;
import de.ubt.ai1.supermod.mm.core.SuperModCoreFactory;
import de.ubt.ai1.supermod.mm.core.SuperModCorePackage;

/**
 * This is the item provider adapter for a {@link de.ubt.ai1.supermod.mm.core.Invariant} object.
 * <!-- begin-user-doc -->
 * @author 	Felix Schwaegerl <felix.schwaegerl(at)uni(minus)bayreuth(dot)de>
 * @version	0.1.0
 * @since	0.1.0
 * @date 	2014-07-28
 * <!-- end-user-doc -->
 * @generated
 */
public class InvariantItemProvider
	extends RuleBaseElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvariantItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SuperModCorePackage.Literals.INVARIANT__OPTION_EXPR);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Invariant.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Invariant"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return super.getText(object);
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Invariant.class)) {
			case SuperModCorePackage.INVARIANT__OPTION_EXPR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SuperModCorePackage.Literals.INVARIANT__OPTION_EXPR,
				 SuperModCoreFactory.eINSTANCE.createVisibilityRef()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModCorePackage.Literals.INVARIANT__OPTION_EXPR,
				 SuperModCoreFactory.eINSTANCE.createOptionRef()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModCorePackage.Literals.INVARIANT__OPTION_EXPR,
				 SuperModCoreFactory.eINSTANCE.createNegExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModCorePackage.Literals.INVARIANT__OPTION_EXPR,
				 SuperModCoreFactory.eINSTANCE.createAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModCorePackage.Literals.INVARIANT__OPTION_EXPR,
				 SuperModCoreFactory.eINSTANCE.createOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModCorePackage.Literals.INVARIANT__OPTION_EXPR,
				 SuperModCoreFactory.eINSTANCE.createXorExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModCorePackage.Literals.INVARIANT__OPTION_EXPR,
				 SuperModCoreFactory.eINSTANCE.createImpliesExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModCorePackage.Literals.INVARIANT__OPTION_EXPR,
				 SuperModCoreFactory.eINSTANCE.createBiconditionalExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModCorePackage.Literals.INVARIANT__OPTION_EXPR,
				 SuperModCoreFactory.eINSTANCE.createNandExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModCorePackage.Literals.INVARIANT__OPTION_EXPR,
				 SuperModCoreFactory.eINSTANCE.createMinusExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModCorePackage.Literals.INVARIANT__OPTION_EXPR,
				 SuperModCoreFactory.eINSTANCE.createMergeExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModCorePackage.Literals.INVARIANT__OPTION_EXPR,
				 SuperModCoreFactory.eINSTANCE.createBigAndExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModCorePackage.Literals.INVARIANT__OPTION_EXPR,
				 SuperModCoreFactory.eINSTANCE.createBigOrExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModCorePackage.Literals.INVARIANT__OPTION_EXPR,
				 SuperModCoreFactory.eINSTANCE.createBigXorExpr()));

		newChildDescriptors.add
			(createChildParameter
				(SuperModCorePackage.Literals.INVARIANT__OPTION_EXPR,
				 SuperModCoreFactory.eINSTANCE.createBigNandExpr()));
	}

}
