package com.actions.checkoutActions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.testobject.TestObject

public class ShippingActions {

	/**
	 * Choose shipping method based on the given method
	 * @param shippingMethod
	 * @author Iman Abu Abiah
	 */
	def static chooseShippingMethod (String shippingMethod){
		if (shippingMethod.equalsIgnoreCase('complete'))
			clickShipWhenComplete()
		else
			clickShipWhenAvailable()
	}

	/**
	 * Click ship when available radio button
	 * @author Iman Abu Abiah
	 */
	def static clickShipWhenAvailable (){
		TestObject shipWhenAvailable = findTestObject('Checkout/Page_ReviewAndPay/Shipping/label_shipWhenAvailableRadioButton')
		BasicActions.clickElement(shipWhenAvailable)
	}

	/**
	 * Click ship when complete radio button
	 * @author Iman Abu Abiah
	 */
	def static clickShipWhenComplete (){
		TestObject shipWhenComplete = findTestObject('Checkout/Page_ReviewAndPay/Shipping/label_shipWhenCompleteRadioButton')
		BasicActions.clickElement(shipWhenComplete)
	}

	/**
	 * Fill attintionTo field based on the given text
	 * @param attentionTo
	 * @author Iman Abu Abiah
	 */
	def static writeAttentionTo (String attentionTo){
		TestObject attentionToField = findTestObject('Checkout/Page_ReviewAndPay/Shipping/input_AttentionToField')
		BasicActions.clickElement(attentionToField)
		BasicActions.writeText(attentionToField, attentionTo)
	}

	/**
	 * Fill Shipping Instructions field based on the given text
	 * @param shippingInstructions
	 * @author Iman Abu Abiah
	 */
	def static writeShippingInstructions (String shippingInstructions){
		TestObject shippingInstructionsField = findTestObject('Checkout/Page_ReviewAndPay/Shipping/input_ShippingInstructionsField')
		BasicActions.clickElement(shippingInstructionsField)
		BasicActions.writeText(shippingInstructionsField, shippingInstructions)
	}

	/**
	 * Click next button in order to Proceed to the payment information step
	 * @author Iman Abu Abiah
	 */
	def static clickNextButton (){
		TestObject nextButton = findTestObject('Checkout/Page_ReviewAndPay/Shipping/button_nextPaymentInformation')
		BasicActions.clickElement(nextButton)
	}

	/**
	 * Click next button in order to Proceed to the addresses information step
	 * @author Iman Abu Abiah
	 */
	def static clickBackButton (){
		TestObject backButton = findTestObject('Checkout/Page_ReviewAndPay/Shipping/button_backToAddresses')
		BasicActions.clickElement(backButton)
	}
}
