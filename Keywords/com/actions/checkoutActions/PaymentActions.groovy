package com.actions.checkoutActions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class PaymentActions {

	//	public static void choosePaymentMethod(String paymentMethod){
	//		if (paymentMethod.equalsIgnoreCase('cc'))
	//			clickCCOption()
	//		else
	//			clickPOOption()
	//	}

	/**
	 * Choose CC radio button as payment method
	 * @author Iman Abu Abiah
	 */
	public static void clickCCOption(){
		TestObject ccOption = findTestObject('Page_Checkout_ReviewAndPay/Payment/label_CC_option')
		BasicActions.clickElement(ccOption)
	}

	/**
	 * Choose PO radio button as payment method
	 * @author Iman Abu Abiah
	 */
	public static void clickPOOption() {
		TestObject poOption = findTestObject('Page_Checkout_ReviewAndPay/Payment/label_PO_option')
		BasicActions.clickElement(poOption)
	}

	/**
	 * select the first saved CC from credit card drop-down list
	 * @author Iman Abu Abiah
	 */
	public static void selectSavedCC (){
		TestObject ccDropDownList = findTestObject('Page_Checkout_ReviewAndPay/Payment/select_CC_dropDown')
		BasicActions.clickElement(ccDropDownList)
		BasicActions.selectFromDropDownListByIndex(ccDropDownList, 2)
	}

	/**
	 * select add new CC from credit card drop-down list
	 * @author Iman Abu Abiah
	 */
	public static void selectNewCC (){
		TestObject ccDropDownList = findTestObject('Page_Checkout_ReviewAndPay/Payment/select_CC_dropDown')
		BasicActions.clickElement(ccDropDownList)
		BasicActions.selectFromDropDownListByIndex(ccDropDownList, 1)
	}

	/**
	 * Fill PO number field
	 * @author Iman Abu Abiah
	 */
	public static void wrtiePONumber(){
		TestObject poNumberField = findTestObject('Page_Checkout_ReviewAndPay/Payment/input_poNumber')
		BasicActions.writeText(poNumberField, GlobalVariable.PO_Number)
	}

	/**
	 * New CC - Check save CC information checkbox
	 * @author Iman Abu Abiah
	 */
	public static void clickSaveCardCheckbox(){
		TestObject saveCCInfoCheckbox = findTestObject('Object Repository/Page_Checkout_ReviewAndPay/Payment/New_CC/input_saveCCInfoCheckbox')
		TestObject checkboxLabel = findTestObject('Object Repository/Page_Checkout_ReviewAndPay/Payment/New_CC/label_saveCCInfoCheckbox')
		BasicActions.checkCheckbox(saveCCInfoCheckbox, checkboxLabel)
	}

	/**
	 * New CC - Fill card name field
	 * @author Iman Abu Abiah
	 */
	public static void wrtieCardName(){
		TestObject cardNameField = findTestObject('Page_Checkout_ReviewAndPay/Payment/New_CC/input_cardName')
		BasicActions.writeText(cardNameField, GlobalVariable.card_Name)
	}

	/**
	 * New CC - Fill card number field
	 * @author Iman Abu Abiah
	 */
	public static void wrtieCardNumber(){
		TestObject cardNumberField = findTestObject('Page_Checkout_ReviewAndPay/Payment/New_CC/input_cardNumber')
		BasicActions.writeText(cardNumberField, GlobalVariable.CC_Number)
	}

	/**
	 * New CC - Fill CVV field
	 * @author Iman Abu Abiah
	 */
	public static void wrtieCVVForNewCC(){
		TestObject CVVField = findTestObject('Page_Checkout_ReviewAndPay/Payment/New_CC/input_CVV')
		BasicActions.writeText(CVVField, GlobalVariable.CC_CVV)
	}

	/**
	 * Saved CC - Fill CVV field
	 * @author Iman Abu Abiah
	 */
	public static void wrtieCVVForSavedCC(){
		TestObject CVVField = findTestObject('Page_Checkout_ReviewAndPay/Payment/Saved_CC/CVV Field')
		BasicActions.writeText(CVVField, GlobalVariable.CC_CVV)
	}

	/**
	 * New CC - Fill exp date field
	 * @author Iman Abu Abiah
	 */
	public static void wrtieExpDate(){
		TestObject expDateField = findTestObject('Page_Checkout_ReviewAndPay/Payment/New_CC/input_expDate')
		BasicActions.writeText(expDateField, GlobalVariable.CC_Exp_Date)
	}

	/**
	 * Click next button in order to Proceed to the Review step
	 * @author Iman Abu Abiah
	 */
	public  static clickNext() {
		TestObject nextButton = findTestObject('Page_Checkout_ReviewAndPay/Payment/button_NextReviewSubmitOrder')
		BasicActions.clickElement(nextButton)
	}
}