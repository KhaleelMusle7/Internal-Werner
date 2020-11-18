package com.actions.checkoutActions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class OrderConfirmationActions {

	/***
	 * verify the order confirmation page is the currently opened page
	 * @author Anas Salahat
	 */
	@Keyword
	def static verifyPageTitle() {
		TestObject checkoutPageTitle = findTestObject('Checkout/h1_pageTitle')
		WebUI.verifyElementVisible(checkoutPageTitle)
		String currentCheckoutPageTitle = BasicActions.getElementText(checkoutPageTitle)
		assert currentCheckoutPageTitle.equalsIgnoreCase("Order Confirmation")
	}
	
	

	@Keyword
	def static String getOrderNumber() {
		return BasicActions.getElementText(findTestObject('Checkout/Page_Order Confirmation/orderNumber'))
	}
}
