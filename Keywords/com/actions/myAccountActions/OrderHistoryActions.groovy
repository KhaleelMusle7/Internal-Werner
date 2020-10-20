package com.actions.myAccountActions
import com.actions.searchActions.SearchActions
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

public class OrderHistoryActions {


	public static void navigateToSpecificOrder(String orderNumber, int index) {
		SearchActions.searchForOrder(orderNumber)
	}
	public static void expandSearchForm() {
		WebUI.click(findTestObject('Object Repository/Page_Order History/label_Search Orders History'))
	}

	/***
	 * Writes a Search Term for the order number
	 * VM Specific description. You can write Order#, PO or release in this field
	 * @param orderNumber
	 * @author Inrahim Shawahni
	 */
	public static void fillOrderNumberField(String orderNumber) {
		WebUI.setText(findTestObject('Object Repository/Page_Order History/input_orders-page-search'), orderNumber)
	}

	/***
	 * Clicks on Search button in the Search Orders Widget
	 * @author Ibrahim Shawahni
	 */
	public static void clickSearchButton() {
		WebUI.click(findTestObject('Object Repository/Page_Order History/button_Search'))
	}

	/***
	 * Clicks on Order number in order to navigate to Order Details page
	 * @author Ibrahim Shawahni
	 */
	public static void clickOrderNumber() {
		WebUI.click(findTestObject('Object Repository/Page_Order History/orderNumber'))
	}
}

