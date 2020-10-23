package com.helpers.MyAccountHelpers
import com.actions.myAccountActions.OrderApprovalActions
import com.kms.katalon.core.annotation.Keyword


class OrderApprovalHelpers {

	/**
	 * Navigates to specific order approval details page
	 * This keyword will search for specific order in order approval page and navigate to its details page
	 * @param orderNumber
	 * @author Anas Salahat
	 */
	@Keyword
	def navigateToOrderApprovalDetailsForSpecificOrder(String orderNumber) {
		OrderApprovalActions.expandSearchOrdersWidget()
		OrderApprovalActions.writeOrderNumber(orderNumber)
		OrderApprovalActions.clickSearchButton()
		OrderApprovalActions.clickOrderNumberLink()
	}
}