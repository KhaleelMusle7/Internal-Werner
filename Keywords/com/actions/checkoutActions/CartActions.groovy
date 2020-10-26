package com.actions.checkoutActions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.validations.checkoutValidations.CartValidations

import customKeywords.CommonKeywords
import customKeywords.Navigations
import internal.GlobalVariable

public class CartActions {

	/***
	 * Clicks on Checkout button
	 * @author Anas Salahat
	 */
	@Keyword
	def clickCheckoutButton() {
		BasicActions.clickElement(findTestObject('Object Repository/Page_Cart/button_checkout'))
	}

	/***
	 * Navigates to Cart page and makes sure no items exist in the cart before starting specific test scenario
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	@Keyword
	def clearCart() {
		Navigations.navigateToCart()

		if(CommonKeywords.isElementPresent(findTestObject('Object Repository/Page_Cart/button_Remove All Items'))) {
			CartActions.clickRemoveAllButton()
			CartActions.clickConfirmDeleteCartButton()
		}

		CartValidations.verifyCartIsEmpty()
	}

	/***
	 * Clicks on Remove All Button
	 * @author Anas Salahat
	 */
	def static clickRemoveAllButton() {
		TestObject removeAllItemsButton = findTestObject('Object Repository/Page_Cart/button_Remove All Items')
		BasicActions.clickElement(removeAllItemsButton)
	}

	/***
	 * Clicks on Delete button in the displayed confirmation modal when the user clicks on Remove All button
	 * @author Ibrahim Shawahni
	 * @anas Salahat
	 */
	def static clickConfirmDeleteCartButton() {
		TestObject confirmDeleteCartButton = findTestObject('Object Repository/Page_Cart/button_confirmDeleteCart')
		WebUI.waitForElementClickable(confirmDeleteCartButton, GlobalVariable.elementTimeOut)
		BasicActions.clickElement(confirmDeleteCartButton)
	}
}
