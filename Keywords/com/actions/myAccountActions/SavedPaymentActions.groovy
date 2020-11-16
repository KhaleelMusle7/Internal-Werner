package com.actions.myAccountActions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.actions.basicActions.GlobalActions
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class SavedPaymentActions {
	
	/***
	 * click on the first saved card header in the page
	 * @author Anas Salahat
	 */
	def static expandSavedCard() {
		TestObject savedCardHeader = findTestObject("Object Repository/My Account/Page_Saved Payments/label_savedPaymentHeader")
		BasicActions.clickElement(savedCardHeader)
	}
	
	/***
	 * Clicks on Delete icon for the expanded saved card info
	 * @author Anas Salahat
	 */
	def static clickDeleteCardIcon() {
		TestObject savedCartDeleteIcon = findTestObject('Object Repository/My Account/Page_Saved Payments/i_deleteCardIcon')
		WebUI.waitForElementPresent(savedCartDeleteIcon, GlobalVariable.Elements_Absence_TimeOut)
		BasicActions.clickElement(savedCartDeleteIcon)
	}

	/***
	 * Clicks on Delete button from Delete Card Confirmation Modal
	 */
	def static clickConfirmDeleteCardButton() {
		BasicActions.clickElement(findTestObject('Object Repository/My Account/Page_Saved Payments/button_confirmDeleteCard'))
		GlobalActions.WaitForLoaderToFinish()
	}
}
