package com.validations.myAccountValidations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.annotation.Keyword

public class OrderHistoryValidations {

	/***
	 * Verifies if the order history page has items
	 * @author Anas Salahat
	 */
	@Keyword
	def static void verifyOrderHistoryHasItems() {

		boolean result = false
		try {
			result = BasicActions.isElementPresent(findTestObject("Object Repository/My Account/Page_Order History/div_noOrdersFound"))
		} catch(Throwable t) {
			result = false;
		} finally {
			assert result == true;
		}
	}
}
