package com.validations.checkoutValidations
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable


class CartValidations {
	
	/**
	 * Verifies the cart not have items
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	@Keyword
	def static verifyCartIsEmpty() {
		String emptyCartMessage = WebUI.getText(findTestObject('Object Repository/Page_Cart/div_cartMessageBody'))

		String expectedMessage = GlobalVariable.emptyCartMessage

		assert emptyCartMessage.trim() == expectedMessage.trim()
	}
}