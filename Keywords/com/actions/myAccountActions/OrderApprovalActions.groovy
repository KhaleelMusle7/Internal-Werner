package com.actions.myAccountActions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject


class OrderApprovalActions {
	/***
	 * Expands search order widget
	 * @author Anas Salahat
	 */
	@Keyword
	def static expandSearchOrdersWidget() {
		TestObject searchOrderWidget = findTestObject("My Account/Page_Order Approval/label_Expand Search Widget")
		BasicActions.clickElement(searchOrderWidget)
	}

	/***
	 * Writes Order Number into the search field
	 * @param orderNumber
	 * @author Anas Salahat
	 */
	@Keyword
	def static writeOrderNumber(String orderNumber) {
		TestObject orderNumberField = findTestObject('My Account/Page_Order Approval/input_Order Number Field')
		BasicActions.writeText(orderNumberField, orderNumber)
	}

	/***
	 * Clicks Search button
	 * @author Anas Salahat
	 */
	@Keyword
	def static clickSearchButton() {
		TestObject searchButton = findTestObject('My Account/Page_Order Approval/button_Search Order')
		BasicActions.clickElement(searchButton)
	}

	/***
	 * Clicks on first order number link in order approval table
	 * @author Anas Salahat
	 */
	@Keyword
	def static clickOrderNumberLink() {
		TestObject orderNumberLink = findTestObject('Object Repository/My Account/Page_Order Approval/a_Order Number')
		BasicActions.clickElement(orderNumberLink)
	}
}