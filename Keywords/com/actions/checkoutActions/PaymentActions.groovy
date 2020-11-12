package com.actions.checkoutActions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.testobject.TestObject

import internal.GlobalVariable

public class PaymentActions {

	/**
	 * Choose CC radio button as payment method
	 * @author Iman Abu Abiah
	 */
	def static clickCCOption(){
		TestObject ccOption = findTestObject('Checkout/Page_ReviewAndPay/Payment/label_CC_option')
		BasicActions.clickElement(ccOption)
	}

	/**
	 * Choose PO radio button as payment method
	 * @author Iman Abu Abiah
	 */
	def static clickPOOption() {
		TestObject poOption = findTestObject('Checkout/Page_ReviewAndPay/Payment/label_PO_option')
		BasicActions.clickElement(poOption)
	}

	/**
	 * select the first saved CC from credit card drop-down list
	 * @author Iman Abu Abiah
	 */
	def static selectSavedCC (){
		TestObject ccDropDownList = findTestObject('Checkout/Page_ReviewAndPay/Payment/select_CC_dropDown')
		BasicActions.clickElement(ccDropDownList)
		BasicActions.selectFromDropDownListByIndex(ccDropDownList, 2)
	}

	/**
	 * select add new CC from credit card drop-down list
	 * @author Iman Abu Abiah
	 */
	def static selectNewCC (){
		TestObject ccDropDownList = findTestObject('Checkout/Page_ReviewAndPay/Payment/select_CC_dropDown')
		BasicActions.clickElement(ccDropDownList)
		BasicActions.selectFromDropDownListByIndex(ccDropDownList, 1)
	}

	/**
	 * Fill PO number field
	 * @author Iman Abu Abiah
	 */
	def static wrtiePONumber(){
		TestObject poNumberField = findTestObject('Checkout/Page_ReviewAndPay/Payment/input_poNumber')
		BasicActions.writeText(poNumberField, GlobalVariable.PO_Number)
	}

	/**
	 * New CC - Check save CC information checkbox
	 * @author Iman Abu Abiah
	 */
	def static clickSaveCardCheckbox(){
		TestObject saveCCInfoCheckbox = findTestObject('Checkout/Page_ReviewAndPay/Payment/New_CC/input_saveCCInfoCheckbox')
		TestObject checkboxLabel = findTestObject('Checkout/Page_ReviewAndPay/Payment/New_CC/label_saveCCInfoCheckbox')
		BasicActions.checkCheckbox(saveCCInfoCheckbox, checkboxLabel)
	}

	/**
	 * New CC - Fill card name field
	 * @author Iman Abu Abiah
	 */
	def static wrtieCardName(){
		TestObject cardNameField = findTestObject('Checkout/Page_ReviewAndPay/Payment/New_CC/input_cardName')
		BasicActions.writeText(cardNameField, GlobalVariable.card_Name)
	}

	/**
	 * New CC - Fill card number field
	 * @author Iman Abu Abiah
	 */
	def static wrtieCardNumber(){
		TestObject cardNumberField = findTestObject('Checkout/Page_ReviewAndPay/Payment/New_CC/input_cardNumber')
		BasicActions.writeText(cardNumberField, GlobalVariable.CC_Number)
	}

	/**
	 * New CC - Fill CVV field
	 * @author Iman Abu Abiah
	 */
	def static wrtieCVVForNewCC(){
		TestObject CVVField = findTestObject('Object Repository/Checkout/Page_ReviewAndPay/Payment/New_CC/input_CVV')
		BasicActions.writeText(CVVField, GlobalVariable.CC_CVV)
	}

	/**
	 * Saved CC - Fill CVV field
	 * @author Iman Abu Abiah
	 */
	def static wrtieCVVForSavedCC(){
		TestObject CVVField = findTestObject('Object Repository/Checkout/Page_ReviewAndPay/Payment/Saved_CC/CVV Field')
		BasicActions.writeText(CVVField, GlobalVariable.CC_CVV)
	}

	/**
	 * New CC - Fill exp date field
	 * @author Iman Abu Abiah
	 */
	def static wrtieExpDate(){
		TestObject expDateField = findTestObject('Object Repository/Checkout/Page_ReviewAndPay/Payment/New_CC/input_expDate')
		BasicActions.writeText(expDateField, GlobalVariable.CC_Exp_Date)
	}

	/**
	 * Click next button in order to Proceed to the Review step
	 * @author Iman Abu Abiah
	 */
	def static clickNext() {
		TestObject nextButton = findTestObject('Object Repository/Checkout/Page_ReviewAndPay/Payment/button_nextReviewSubmitOrder')
		BasicActions.clickElement(nextButton)
	}
}