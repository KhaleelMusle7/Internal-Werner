package com.helpers.checkoutHelpers

import com.actions.checkoutActions.ShippingActions
import com.kms.katalon.core.annotation.Keyword

public class CheckoutShippingHelpers {

	/**
	 * This keyword will do the following:
	 * 1. Choose the shipping method based on the given method
	 * 2. Fill AttentionTo field (if not empty)
	 * 3. Fill Shipping Instructions field (if not empty)
	 * 4. Proceed to the next step
	 * @param shippingMethod
	 * @param AttentionTo
	 * @param ShippingInstructions
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def ShippingStep(String shippingMethod, String AttentionTo, String ShippingInstructions){
		ShippingActions.chooseShippingMethod(shippingMethod)
		ShippingActions.writeAttentionTo(AttentionTo)
		ShippingActions.writeShippingInstructions(ShippingInstructions)
		ShippingActions.clickNextButton()
	}
}
