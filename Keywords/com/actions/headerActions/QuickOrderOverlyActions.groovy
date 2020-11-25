package com.actions.headerActions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class QuickOrderOverlyActions {

	public static void expandQuickOrder() {
		WebUI.mouseOver(findTestObject('Object Repository/Header/QuickOrderOverly/span_quickOrderOverlay'))
	}

	def static addRandomItem() {
		BasicActions.clickElement(findTestObject('Header/QuickOrderOverly/input_keyword'))
		BasicActions.writeText(findTestObject('Header/QuickOrderOverly/input_keyword'), GlobalVariable.Search_term)
		BasicActions.clickElementAtIndex(findTestObject('Header/QuickOrderOverly/li_selectedItem'), 0)
	}

	def static addAllToCartAndCheckout() {
		BasicActions.clickElement(findTestObject('Header/QuickOrderOverly/button_addToCart'))
	}

	@Keyword
	def static addProductToCart() {
		QuickOrderOverlyActions.expandQuickOrder()
		QuickOrderOverlyActions.addRandomItem()
		QuickOrderOverlyActions.addAllToCartAndCheckout()
	}
}
