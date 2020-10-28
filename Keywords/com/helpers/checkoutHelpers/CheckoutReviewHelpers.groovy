package com.helpers.checkoutHelpers

import com.actions.basicActions.GlobalActions
import com.actions.checkoutActions.ReviewActions
import com.kms.katalon.core.annotation.Keyword

public class CheckoutReviewHelpers {

	/**
	 * Submit the order
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def ReviewStep(){
		ReviewActions.clickSubmitOrder()
		GlobalActions.WaitForLoaderToFinish()
	}
}
