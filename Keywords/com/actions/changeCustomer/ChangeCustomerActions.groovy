package com.actions.changeCustomer

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class ChangeCustomerActions {

	public static void selectBillToAddress(){
		WebUI.click(findTestObject('Page_ChangeCustomer/input_selectBillToList'))
		List<WebElement> BilllistElements = WebUiCommonHelper.findWebElements(findTestObject('Page_ChangeCustomer/BillingAddressDropdown'), 30)
		WebElement firstBillTo = BilllistElements.get(0)
		firstBillTo.click()
	}

	public static void selectShipToAddress(){
		WebUI.click(findTestObject('Page_ChangeCustomer/input_selectShipToList'))
		List<WebElement> ShiplistElements = WebUiCommonHelper.findWebElements(findTestObject('Page_ChangeCustomer/ShippingAddressDropDown'), 30)
		WebElement firstShipTo = ShiplistElements.get(0)
		firstShipTo.click()
	}

	/***
	 * Select bill to/customer number based on the provided customer number
	 * Call this function at change customer page
	 * @param customerNumber
	 * @author Iman Abu Abiah
	 */
	public static void selectBillToAddressByCustomer (String customerNumber){
		TestObject billToDropDown = findTestObject('Page_ChangeCustomer/input_selectBillToList')
		BasicActions.clickElement(billToDropDown)
		BasicActions.writeText(billToDropDown, customerNumber)
		TestObject billToList = findTestObject('Page_ChangeCustomer/BillingAddressDropdown')
		BasicActions.clickElementAtIndex(billToList, 0)
	}

	public static void selectShipToAddressByCustomer (String customerNumber){
		WebUI.click(findTestObject('Page_ChangeCustomer/input_selectShipToList'))
		WebUI.setText(findTestObject('Page_ChangeCustomer/input_selectShipToList'), customerNumber)
		List<WebElement> ShiplistElements = WebUiCommonHelper.findWebElements(findTestObject('Page_ChangeCustomer/ShippingAddressDropDown'), 30)
		WebElement firstShipTo = ShiplistElements.get(0)
		firstShipTo.click()
	}

	public static void selectFulfillmentMethod (String fulfillmentMethod){
		if (fulfillmentMethod.equalsIgnoreCase('delivery'))
			WebUI.click(findTestObject('Page_ChangeCustomer/radioButton_delivery'))
		else
			WebUI.click(findTestObject('Page_ChangeCustomer/radioButton_pickUp'))
	}

	public static void clickChangeCustomerButton(){
		WebUI.click(findTestObject('Page_ChangeCustomer/button_Continue'))
	}
}
