package com.actions.checkoutActions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.testobject.TestObject

public class AddressesActions {

	/**
	 * Uncheck use ship to address checkbox in order to use one time shipping address
	 * @author Iman Abu Abiah
	 */
	def static uncheckUseShipToCheckbox() {
		TestObject checboxInput = findTestObject('Page_Checkout_Addresses/input_useShipToCheckbox')
		TestObject checkboxLabel = findTestObject('Page_Checkout_Addresses/label_useShipToCheckbox')
		BasicActions.unCheckCheckbox(checboxInput, checkboxLabel)
	}

	/**
	 * Check use ship to address checkbox in order to use delivery address
	 * @author Iman Abu Abiah
	 */
	def static checkUseShipToCheckbox() {
		TestObject checkboxInput = findTestObject('Page_Checkout_Addresses/input_useShipToCheckbox')
		TestObject checkboxLabel = findTestObject('Page_Checkout_Addresses/label_useShipToCheckbox')
		BasicActions.checkCheckbox(checkboxInput, checkboxLabel)
	}

	/**
	 * Fill one time shipping address fields and save the information
	 * @author Iman Abu Abiah
	 */
	def static fillOneTimeShippingAddressForm() {
		try{
			TestObject companyNameField = findTestObject('Page_Checkout_Addresses/input_companyName')
			BasicActions.writeText(companyNameField, "AutomationCompany Name")

			TestObject addressOneField = findTestObject('Page_Checkout_Addresses/input_address1')
			BasicActions.writeText(addressOneField, "Automation Address one")

			TestObject addressTwoField = findTestObject('Page_Checkout_Addresses/input_address2')
			BasicActions.writeText(addressTwoField, "Automation Address two")

			TestObject cityField = findTestObject('Page_Checkout_Addresses/input_city')
			BasicActions.writeText(cityField, "New York")

			TestObject stateField = findTestObject('Page_Checkout_Addresses/select_state')
			BasicActions.clickElement(stateField)
			BasicActions.selectFromDropDownListByLabel(stateField, "New York")

			TestObject postalCodeField = findTestObject('Page_Checkout_Addresses/input_postalCode')
			BasicActions.writeText(postalCodeField, "10167")

			clickSaveButtonInOneTimeForm()
		}catch(Exception e){
			// Do Nothing
		}
	}

	/**
	 * Click save one time shipping address information button
	 * @author Iman Abu Abiah
	 */
	def static clickSaveButtonInOneTimeForm() {
		TestObject saveButton = findTestObject('Page_Checkout_Addresses/button_Save')
		BasicActions.clickElement(saveButton)
	}

	/**
	 * Click cancel button
	 * @author Iman Abu Abiah
	 */
	def static clickCancelButtonInOneTimeForm() {
		TestObject cancelButton = findTestObject('Page_Checkout_Addresses/button_Cancel')
		BasicActions.clickElement(cancelButton)
	}

	/**
	 * Click next button in order to Proceed to the shipping information step
	 * @author Iman Abu Abiah
	 */
	def static clickNextButton (){
		TestObject nextButton = findTestObject('Page_Checkout_Addresses/button_nextShippingInformation')
		BasicActions.clickElement(nextButton)
	}
}
