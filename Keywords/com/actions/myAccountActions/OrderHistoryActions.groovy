package com.actions.myAccountActions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.actions.searchActions.SearchActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class OrderHistoryActions {


	@Keyword
	def static navigateToSpecificOrder(String orderNumber) {
		SearchActions.searchForOrder(orderNumber)
	}
	@Keyword
	def static expandSearchForm() {
		BasicActions.clickElement(findTestObject('My Account/Page_Order History/label_Search Orders History'))
	}

	/***
	 * Writes a Search Term for the order number
	 * VM Specific description. You can write Order#, PO or release in this field
	 * @param orderNumber
	 * @author Ibrahim Shawahni
	 */
	@Keyword
	def static fillOrderNumberField(String orderNumber) {
		BasicActions.writeText(findTestObject('My Account/Page_Order History/input_orders-page-search'), orderNumber)
	}

	/***
	 * Clicks on Search button in the Search Orders Widget
	 * @author Ibrahim Shawahni
	 */
	@Keyword
	def static clickSearchButton() {
		BasicActions.clickElement(findTestObject('My Account/Page_Order History/button_Search'))
	}

	/***
	 * Clicks on Order number in order to navigate to Order Details page
	 * @author Ibrahim Shawahni
	 */
	@Keyword
	def clickOrderNumber() {
		BasicActions.clickElement(findTestObject('My Account/Page_Order History/orderNumber'))
	}

	@Keyword
	def static reorder() {
		BasicActions.clickElement(findTestObject('My Account/Page_Order History/button_ordernumber'))
		BasicActions.clickElement(findTestObject('My Account/Page_Order History/button_reorder'))
	}
}

