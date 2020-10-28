package com.helpers.checkoutHelpers

import com.actions.basicActions.GlobalActions
import com.actions.checkoutActions.AddressesActions
import com.kms.katalon.core.annotation.Keyword

public class CheckoutAddressesHelpers {

	/**
	 * This keyword will do the following:
	 * 1. Uncheck the use ship-to checkbox
	 * 2. Fill the ship one-time shipping address fields
	 * 3. Click on save button
	 * 4. Proceed to the next step
	 * Note: if one-time shipping address already entered, then only the last step will be applied
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def AddressesStepWithOneTimeShippingAddress (){
		AddressesActions.uncheckUseShipToCheckbox()
		AddressesActions.fillOneTimeShippingAddressForm()
		AddressesActions.clickNextButton()
	}

	/**
	 * This keyword will do the following:
	 * 1. Check the use ship-to checkbox
	 * 2. Proceed to the next step
	 * Note: if one-time shipping address already entered, then only the last step will be applied
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def AddressesStepWithDeliveryAddress (){
		AddressesActions.checkUseShipToCheckbox()
		AddressesActions.clickNextButton()
	}

	/**
	 * This keyword will do the following:
	 * 1. Change the fulfilment method to pickup
	 * 2. Proceed to the next step
	 * Note: if one-time shipping address already entered, then only the last step will be applied
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def AddressesStepWithPickUpAddress (){
		GlobalActions.changeFulfilmentMethodToPickUp()
		AddressesActions.clickNextButton()
	}
}
