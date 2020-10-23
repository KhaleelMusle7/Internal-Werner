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
	 * Select specific bill-to value
	 * Call this function at change customer page
	 * @param billToValue
	 * @author Iman Abu Abiah
	 * @author Anas Salahat
	 */
	public static void selectBillToAddressByCustomer (String billToValue){
		TestObject billToDropDown = findTestObject('Page_ChangeCustomer/input_selectBillToList')
		BasicActions.clickElement(billToDropDown)
		BasicActions.writeText(billToDropDown, billToValue)
		TestObject billToList = findTestObject('Object Repository/Page_ChangeCustomer/li_Select Bill-To Options')
		WebUI.waitForElementVisible(billToList, GlobalVariable.ElementsTimeOut)
		WebUI.click(billToList)
	}
	
	/***
	 * Select specific ship-to value
	 * Call this function at change customer page
	 * @param shipToValue
	 * @author Iman Abu Abiah
	 * @author Anas Salahat
	 */

	public static void selectShipToAddressByCustomer (String shipToValue){
		TestObject shipToDropDown = findTestObject('Page_ChangeCustomer/input_selectShipToList')
		BasicActions.clickElement(shipToDropDown)
		BasicActions.writeText(shipToDropDown, shipToValue)
		TestObject shipToList = findTestObject('Page_ChangeCustomer/ShippingAddressDropDown')
		WebUI.waitForElementVisible(shipToList, GlobalVariable.ElementsTimeOut)
		WebUI.click(shipToList)
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
