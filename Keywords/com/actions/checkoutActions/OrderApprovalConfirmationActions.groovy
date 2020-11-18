package com.actions.checkoutActions

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import com.actions.basicActions.BasicActions

import com.actions.basicActions.GlobalActions
public class OrderApprovalConfirmationActions {

	/***
	 * verify the order approval confirmation page is the currently opened page
	 * @author Shurooq Salahat
	 */
	@Keyword
	def static verifyOrdarApprovalPageTitle() {
		TestObject checkoutPageTitle = findTestObject('Object Repository/Checkout/Page_OrderApprovalConfirmation/title_orderApprovalTitle')
		WebUI.verifyElementVisible(checkoutPageTitle)
		String currentCheckoutPageTitle = BasicActions.getElementText(checkoutPageTitle)
		assert currentCheckoutPageTitle.equalsIgnoreCase("Order Approval Details")
	}
	/***
	 * Get Order number from order approval details page
	 * @return order Number
	 * @author Shurooq Salahat
	 */

	@Keyword
	def static String getOrderNumber() {
		return BasicActions.getElementText(findTestObject('Object Repository/Checkout/Page_OrderApprovalConfirmation/order_Number'))
	}
}
