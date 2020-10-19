package com.actions.checkoutActions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.testobject.TestObject

public class ReviewActions {

	/**
	 * Click submit order button
	 * @author Iman Abu Abiah
	 */
	public static void clickSubmitOrder (){
		TestObject submitButton = findTestObject('Page_Checkout_ReviewAndPay/Review/button_submitOrder')
		BasicActions.clickElement(submitButton)
	}
}
