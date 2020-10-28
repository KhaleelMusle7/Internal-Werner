package com.actions.loginActions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class ChangeCustomerActions {

	/***
	 * @author khaleel Musleh
	 * Call this function at change customer page
	 */

	def static selectBillToAddress(){
		WebUI.click(findTestObject('Page_ChangeCustomer/input_selectBillToList'))
		List<WebElement> BilllistElements = WebUiCommonHelper.findWebElements(findTestObject('Page_ChangeCustomer/BillingAddressDropdown'), 30)
		WebElement firstBillTo = BilllistElements.get(0)
		firstBillTo.click()
	}

	/***
	 * @author khaleel Musleh
	 * Call this function at change customer page
	 */

	def static selectShipToAddress(){
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
	def static selectBillToAddressByCustomer (String billToValue){
		TestObject billToDropDown = findTestObject('Page_ChangeCustomer/input_selectBillToList')
		BasicActions.clickElement(billToDropDown)
		BasicActions.writeText(billToDropDown, billToValue)
		TestObject billToList = findTestObject('Object Repository/Page_ChangeCustomer/li_Select Bill-To Options')
		WebUI.waitForElementVisible(billToList, GlobalVariable.ElementsTimeOut)
		BasicActions.clickElement(billToList)
	}

	/***
	 * Select specific ship-to value
	 * Call this function at change customer page
	 * @param shipToValue
	 * @author Iman Abu Abiah
	 * @author Anas Salahat
	 */

	def static selectShipToAddressByCustomer (String shipToValue){
		TestObject shipToDropDown = findTestObject('Page_ChangeCustomer/input_selectShipToList')
		BasicActions.clickElement(shipToDropDown)
		BasicActions.writeText(shipToDropDown, shipToValue)
		TestObject shipToList = findTestObject('Page_ChangeCustomer/ShippingAddressDropDown')
		WebUI.waitForElementVisible(shipToList, GlobalVariable.ElementsTimeOut)
		BasicActions.clickElement(shipToList)
	}

	def static selectFulfillmentMethod (String fulfillmentMethod){
		if (fulfillmentMethod.equalsIgnoreCase('delivery'))
			BasicActions.clickElement(findTestObject('Page_ChangeCustomer/radioButton_delivery'))
		else
			BasicActions.clickElement(findTestObject('Page_ChangeCustomer/radioButton_pickUp'))
	}

	def static clickChangeCustomerButton(){
		BasicActions.clickElement(findTestObject('Page_ChangeCustomer/button_Continue'))
	}
}
