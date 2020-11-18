package com.actions.myAccountActions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.actions.basicActions.GlobalActions
import com.kms.katalon.core.annotation.Keyword
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
	
	/***
	 * Re-Order the order from order details page
	 * @return First item SKU
	 * @author Khaleel Musleh
	 * @author Nada Jom'a
	 */
	@Keyword
	def static reorder() {
		TestObject itemSKUObject = findTestObject('/My Account/Page_Order Details/span_itemSKU')
		String itemSKUText = BasicActions.getElementTextAtIndex(itemSKUObject, 0)
		BasicActions.clickElement(findTestObject('My Account/Page_Order Details/button_reorder'))
		GlobalActions.waitToastMessageToDisplay()
		return itemSKUText
	}
	
}
