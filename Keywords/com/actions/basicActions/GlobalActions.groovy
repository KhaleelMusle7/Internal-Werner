package com.actions.basicActions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class GlobalActions {

	/***
	 * @author khaleel Musleh
	 *  wait for loader finish 
	 */
	def static WaitForLoaderToFinish(){
		TestObject loadingSpinner = findTestObject('Common Objects/loader')
		WebUI.waitForElementNotVisible(loadingSpinner, GlobalVariable.elementTimeOut)
	}

	/***
	 * Waits for the Toaster message to be displayed.
	 * This can be called after the action you are expecting to see toaster message as success indicator.
	 * Call it after Add to Cart action for example.
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	def static waitToastMessageToDisplay() {
		WebUI.waitForElementVisible(findTestObject('Object Repository/Common Objects/div_toasterMessage'), GlobalVariable.elementTimeOut)
	}

	/***
	 * This function will change the fulfillment to PickUp from the header
	 * @author khaleel Musleh
	 */
	def static changeFulfilmentMethodToPickUp(){
		TestObject fulfillmentFromHeader = findTestObject('Page_Fulfilment Method/span_fulfilmentMethod')
		BasicActions.clickElement(fulfillmentFromHeader)
		TestObject pickUpOption = findTestObject('Page_Fulfilment Method/label_pickup')
		BasicActions.clickElement(pickUpOption)
		TestObject closeIcon = findTestObject('Page_Fulfilment Method/a_closeIcon')
		BasicActions.clickElement(closeIcon)
	}

	/**
	 * This function will change the fulfillment to delivery from the header
	 * @author Iman Abu Abiah
	 */
	def static changeFulfilmentMethodToDelivery(){
		TestObject fulfillmentFromHeader = findTestObject('Page_Fulfilment Method/span_fulfilmentMethod')
		BasicActions.clickElement(fulfillmentFromHeader)
		TestObject deliveryOption = findTestObject('Page_Fulfilment Method/label_Delivery')
		BasicActions.clickElement(deliveryOption)
		TestObject closeIcon = findTestObject('Page_Fulfilment Method/a_closeIcon')
		BasicActions.clickElement(closeIcon)
	}
}
