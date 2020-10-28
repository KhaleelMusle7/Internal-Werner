package com.util.helpers.generalHelpers
import com.actions.basicActions.BasicActions
import com.kms.katalon.core.annotation.Keyword

import internal.GlobalVariable

public class Navigations {

	/**
	 * Navigate to cart
	 * @author Anas Salahat
	 */
	@Keyword
	def static navigateToCart () {
		BasicActions.navigateToURL(GlobalVariable.Cart_URL)
	}

	@Keyword
	def static navigateToPage(String URL) {
		BasicActions.navigateToURL(URL)
	}
}
