/**
 */
package org.muml.psm.allocation.ilp.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.muml.psm.allocation.ilp.BinaryExpression;
import org.muml.psm.allocation.ilp.IlpFactory;
import org.muml.psm.allocation.ilp.IlpPackage;

/**
 * This is the item provider adapter for a {@link org.muml.psm.allocation.ilp.BinaryExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryExpressionItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpressionItemProvider(AdapterFactory adapterFactory) {
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

			addLeftExpressionPropertyDescriptor(object);
			addRightExpressionPropertyDescriptor(object);
			addOperatorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Left Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeftExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BinaryExpression_leftExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BinaryExpression_leftExpression_feature", "_UI_BinaryExpression_type"),
				 IlpPackage.Literals.BINARY_EXPRESSION__LEFT_EXPRESSION,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Right Expression feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRightExpressionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BinaryExpression_rightExpression_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BinaryExpression_rightExpression_feature", "_UI_BinaryExpression_type"),
				 IlpPackage.Literals.BINARY_EXPRESSION__RIGHT_EXPRESSION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BinaryExpression_operator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BinaryExpression_operator_feature", "_UI_BinaryExpression_type"),
				 IlpPackage.Literals.BINARY_EXPRESSION__OPERATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(IlpPackage.Literals.BINARY_EXPRESSION__LEFT_EXPRESSION);
			childrenFeatures.add(IlpPackage.Literals.BINARY_EXPRESSION__RIGHT_EXPRESSION);
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
	 * This returns BinaryExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BinaryExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BinaryExpression)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_BinaryExpression_type") :
			getString("_UI_BinaryExpression_type") + " " + label;
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

		switch (notification.getFeatureID(BinaryExpression.class)) {
			case IlpPackage.BINARY_EXPRESSION__OPERATOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case IlpPackage.BINARY_EXPRESSION__LEFT_EXPRESSION:
			case IlpPackage.BINARY_EXPRESSION__RIGHT_EXPRESSION:
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
				(IlpPackage.Literals.BINARY_EXPRESSION__LEFT_EXPRESSION,
				 IlpFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(IlpPackage.Literals.BINARY_EXPRESSION__LEFT_EXPRESSION,
				 IlpFactory.eINSTANCE.createConstraintExpression()));

		newChildDescriptors.add
			(createChildParameter
				(IlpPackage.Literals.BINARY_EXPRESSION__LEFT_EXPRESSION,
				 IlpFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(IlpPackage.Literals.BINARY_EXPRESSION__LEFT_EXPRESSION,
				 IlpFactory.eINSTANCE.createVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(IlpPackage.Literals.BINARY_EXPRESSION__RIGHT_EXPRESSION,
				 IlpFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(IlpPackage.Literals.BINARY_EXPRESSION__RIGHT_EXPRESSION,
				 IlpFactory.eINSTANCE.createConstraintExpression()));

		newChildDescriptors.add
			(createChildParameter
				(IlpPackage.Literals.BINARY_EXPRESSION__RIGHT_EXPRESSION,
				 IlpFactory.eINSTANCE.createArithmeticExpression()));

		newChildDescriptors.add
			(createChildParameter
				(IlpPackage.Literals.BINARY_EXPRESSION__RIGHT_EXPRESSION,
				 IlpFactory.eINSTANCE.createVariableExpression()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == IlpPackage.Literals.BINARY_EXPRESSION__LEFT_EXPRESSION ||
			childFeature == IlpPackage.Literals.BINARY_EXPRESSION__RIGHT_EXPRESSION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
