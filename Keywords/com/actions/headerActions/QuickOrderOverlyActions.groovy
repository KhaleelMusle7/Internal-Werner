package com.actions.headerActions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class QuickOrderOverlyActions {

	public static void expandQuickOrder() {
		WebUI.mouseOver(findTestObject('My Account/Page_QuickOrder/Span_QuickOrderOverlay'))
	}

	def static addRandomItem() {
		BasicActions.clickElement(findTestObject('My Account/Page_QuickOrder/Keyword_input'))
		BasicActions.writeText(findTestObject('My Account/Page_QuickOrder/Keyword_input'), GlobalVariable.Search_term)
		BasicActions.clickElementAtIndex(findTestObject('My Account/Page_QuickOrder/Selected_Item'), 0)
	}

	def static addToCart() {
		BasicActions.clickElement(findTestObject('My Account/Page_QuickOrder/addToCart'))
	}
	
	@Keyword
	def static addProductToCart() {
		QuickOrderOverlyActions.expandQuickOrder()
		QuickOrderOverlyActions.addRandomItem()
		QuickOrderOverlyActions.addToCart()
	}
}
