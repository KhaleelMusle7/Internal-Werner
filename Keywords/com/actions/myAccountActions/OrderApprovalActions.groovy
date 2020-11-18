package com.actions.myAccountActions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.actions.basicActions.GlobalActions


class OrderApprovalActions {
	/***
	 * Expands search order widget
	 * @author Anas Salahat
	 */
	@Keyword
	def static expandSearchOrdersWidget() {
		TestObject searchOrderWidget = findTestObject("My Account/Page_Order Approval/label_expandSearchWidget")
		BasicActions.clickElement(searchOrderWidget)
	}

	/***
	 * Writes Order Number into the search field
	 * @param orderNumber
	 * @author Anas Salahat
	 */
	@Keyword
	def static writeOrderNumber(String orderNumber) {
		TestObject orderNumberField = findTestObject('My Account/Page_Order Approval/input_orderNumberField')
		BasicActions.writeText(orderNumberField, orderNumber)
	}

	/***
	 * Clicks Search button
	 * @author Anas Salahat
	 */
	@Keyword
	def static clickSearchButton() {
		TestObject searchButton = findTestObject('My Account/Page_Order Approval/button_searchOrder')
		BasicActions.clickElement(searchButton)
	}

	/***
	 * Clicks on first order number link in order approval table
	 * @author Anas Salahat
	 */
	@Keyword
	def static clickOrderNumberLink() {
		GlobalActions.WaitForLoaderToFinish()
		
		TestObject orderNumberLink = findTestObject('My Account/Page_Order Approval/a_orderNumber')
		BasicActions.clickElement(orderNumberLink)
		
	}


	/***
	 * Clicks on first order number link in order approval table
	 * @author Shurooq Salahat
	 */
	@Keyword
	def static clickSubmitForApprovalButton() {
		TestObject submitForApproval = findTestObject('Object Repository/My Account/Page_Order Approval/button_submitForApproval')
		BasicActions.clickElement(submitForApproval)
	}
}