package com.actions.myAccountActions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.testobject.TestObject

public class OrderDetailsActions {
	
	/***
	 * return order number from order details page
	 * @return Current Order Number
	 * @author Anas Salahat
	 */
	def static String getOrderNumber() {
		TestObject orderNumberObject = findTestObject('Object Repository/My Account/Page_Order Details/h1_orderNumber')
		String orderNumberText = BasicActions.getElementText(orderNumberObject)
		String orderNumber = orderNumberText.substring(7)
		return orderNumber
	}
	
	/***
	 * return PO number from current order details page
	 * @return Current PO number
	 * @author Anas Salahat
	 */
	def static String getPONumber() {
		TestObject poNumberObject = findTestObject('Object Repository/My Account/Page_Order Details/span_poNumber')
		String poNumber = BasicActions.getElementText(poNumberObject)
		return poNumber
	}
}
