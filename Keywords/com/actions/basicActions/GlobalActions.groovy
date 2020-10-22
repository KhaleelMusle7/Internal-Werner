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
		BasicActions.clickElement(findTestObject('Object Repository/Page_FulfilmentMethod/span_fulfilmentMethod'))
		BasicActions.clickElement(findTestObject('Page_FulfilmentMethod/label_Pick Up'))
		BasicActions.clickElement(findTestObject('Page_FulfilmentMethod/a_closeIcon'))
	}

	/***
	 * @author khaleel Musleh
	 * @param element
	 */
	public static void changeFulfilmentMethodToDelivery(){
		BasicActions.clickElement(findTestObject('Page_FulfilmentMethod/span_fulfilmentMethod'))
		BasicActions.clickElement(findTestObject('Page_FulfilmentMethod/label_Delivery'))
		BasicActions.clickElement(findTestObject('Page_FulfilmentMethod/a_closeIcon'))
	}
}
