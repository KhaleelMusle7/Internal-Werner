package com.actions.basicActions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class GlobalActions {

	/***
	 * @author khaleel Musleh
	 * 
	 */
	public static void WaitForLoaderToFinish(){
		//WebUI.waitForElementNotVisible(findTestObject('Page_ChangeCustomer/loader'), GlobalVariable.Timeout)
		TestObject loadingSpinner = findTestObject('Page_ChangeCustomer/loader')
		WebUI.waitForElementNotVisible(loadingSpinner, GlobalVariable.ElementsTimeOut)
	}
	/***
	 * @author khaleel Musleh
	 */

	public static void changeFulfilmentMethodToPickUp(){
		TestObject fulfillmentFromHeader = findTestObject('Object Repository/Page_FulfilmentMethod/span_fulfilmentMethod')
		BasicActions.clickElement(fulfillmentFromHeader)
		TestObject pickUpOption = findTestObject('Page_FulfilmentMethod/label_Pick Up')
		BasicActions.clickElement(pickUpOption)
		TestObject closeIcon = findTestObject('Page_FulfilmentMethod/a_closeIcon')
		BasicActions.clickElement(closeIcon)
	}

	/**
	 * This function will change the fulfillment to delivery from the header
	 * @author Iman Abu Abiah
	 */
	public static void changeFulfilmentMethodToDelivery(){
		TestObject fulfillmentFromHeader = findTestObject('Object Repository/Page_FulfilmentMethod/span_fulfilmentMethod')
		BasicActions.clickElement(fulfillmentFromHeader)
		TestObject deliveryOption = findTestObject('Page_FulfilmentMethod/label_Delivery')
		BasicActions.clickElement(deliveryOption)
		TestObject closeIcon = findTestObject('Page_FulfilmentMethod/a_closeIcon')
		BasicActions.clickElement(closeIcon)
	}
}
