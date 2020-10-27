package com.actions.checkoutActions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.testobject.TestObject

public class ReviewActions {

	/**
	 * Click submit order button
	 * @author Iman Abu Abiah
	 */
	def static clickSubmitOrder (){
		TestObject submitButton = findTestObject('Checkout/Page_ReviewAndPay/Review/button_submitOrder')
		BasicActions.clickElement(submitButton)
	}
}
