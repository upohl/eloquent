/**
 */
package org.muml.psm.allocation.ilp.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.muml.core.expressions.common.provider.ComparisonExpressionItemProvider;
import org.muml.mumlcore.expressions.common.CommonExpressionsPackage;
import org.muml.psm.allocation.ilp.ConstraintExpression;
import org.muml.psm.allocation.ilp.IlpFactory;

/**
 * This is the item provider adapter for a {@link org.muml.psm.allocation.ilp.ConstraintExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintExpressionItemProvider
	extends ComparisonExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintExpressionItemProvider(AdapterFactory adapterFactory) {
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
	 * This returns ConstraintExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConstraintExpression"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ConstraintExpression)object).getComment();
		return label == null || label.length() == 0 ?
			getString("_UI_ConstraintExpression_type") :
			getString("_UI_ConstraintExpression_type") + " " + label;
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
				(CommonExpressionsPackage.Literals.BINARY_EXPRESSION__LEFT_EXPRESSION,
				 IlpFactory.eINSTANCE.createConstraintExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CommonExpressionsPackage.Literals.BINARY_EXPRESSION__LEFT_EXPRESSION,
				 IlpFactory.eINSTANCE.createVariableExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CommonExpressionsPackage.Literals.BINARY_EXPRESSION__RIGHT_EXPRESSION,
				 IlpFactory.eINSTANCE.createConstraintExpression()));

		newChildDescriptors.add
			(createChildParameter
				(CommonExpressionsPackage.Literals.BINARY_EXPRESSION__RIGHT_EXPRESSION,
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
			childFeature == CommonExpressionsPackage.Literals.BINARY_EXPRESSION__LEFT_EXPRESSION ||
			childFeature == CommonExpressionsPackage.Literals.BINARY_EXPRESSION__RIGHT_EXPRESSION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return IlpEditPlugin.INSTANCE;
	}

}
