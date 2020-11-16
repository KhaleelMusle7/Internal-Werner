package com.validations.myAccountValidations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class SavedPaymentValidations {
	
	/***
	 * Checks if No Saved Payment message is displayed
	 * @return True if the message is displayed, False elsewhere
	 * @author Anas Salahat
	 */
	@Keyword
	def static boolean verifyNoSavedPaymentsMessage() {
		boolean result = true
		try {
			result = WebUI.verifyElementPresent(findTestObject('Object Repository/My Account/Page_Saved Payments/div_noSavedPaymentsMessage'), GlobalVariable.Elements_Absence_TimeOut, FailureHandling.OPTIONAL)
		} catch(Throwable t) {
			result = false;
		} finally {
			return result;
		}
	}
	
	/***
	 * Checks if the saved payments page has saved cards
	 * @return True if there is at least one saved card at page, False if there is no saved cards
	 * @author Anas Salahat
	 */
	@Keyword
	def static boolean verifySavedPayments() {
		return !verifyNoSavedPaymentsMessage()
	}
}
