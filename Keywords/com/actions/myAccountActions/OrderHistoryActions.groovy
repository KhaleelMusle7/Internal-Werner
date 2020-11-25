package com.actions.myAccountActions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.actions.basicActions.GlobalActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject

public class OrderHistoryActions {


	@Keyword
	def static navigateToSpecificOrder(String orderNumber) {
		searchOrderByOrderNumber(orderNumber)
	}
	@Keyword
	def static expandSearchForm() {
		BasicActions.clickElement(findTestObject('My Account/Page_Order History/label_searchOrdersHistory'))
	}

	/***
	 * Writes a Search Term for the order number
	 * VM Specific description. You can write Order#, PO or release in this field
	 * @param orderNumber
	 * @author Ibrahim Shawahni
	 */
	@Keyword
	def static fillOrderNumberField(String orderNumber) {
		BasicActions.writeText(findTestObject('My Account/Page_Order History/input_orderNumber'), orderNumber)
	}

	/***
	 * Writes a Search Term in the PO field
	 * @param PO
	 * @author Anas Salahat
	 */
	@Keyword
	def static fillPOField(String PO) {
		TestObject poField = findTestObject('Object Repository/My Account/Page_Order History/input_PO')
		BasicActions.writeText(poField, PO)
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
		GlobalActions.WaitForLoaderToFinish()
		BasicActions.clickElement(findTestObject('My Account/Page_Order History/a_orderNumber'))
	}

	/***
	 * @author khaleel Musleh
	 */
	@Keyword
	def static searchOrderByOrderNumber(String orderNumber) {
		OrderHistoryActions.expandSearchForm()
		OrderHistoryActions.fillOrderNumberField(orderNumber)
		OrderHistoryActions.clickSearchButton()
	}

	/***
	 * Search order by it's PO number
	 * @param po
	 * @author Anas Salahat
	 */
	@Keyword
	def static searchOrderByPO(String po) {
		OrderHistoryActions.expandSearchForm()
		OrderHistoryActions.fillPOField(po)
		OrderHistoryActions.clickSearchButton()
	}
	
	/***
	 * Click on randon Order from order history page
	 * @author Nada Jom'a
	 */
	@Keyword
	def static navigateToRandomOrder() {
		TestObject orderERPbject = findTestObject('My Account/Page_Order History/a_orderNumber')
		BasicActions.clickRandomElement(orderERPbject)
	}
}

