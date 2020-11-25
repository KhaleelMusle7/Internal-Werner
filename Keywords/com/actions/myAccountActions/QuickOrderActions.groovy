package com.actions.myAccountActions

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.actions.PLPActions.PLPActions
import com.actions.basicActions.BasicActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class QuickOrderActions {

	/***
	 * Enter search keyword in the search field
	 * @param searchTerm
	 * @author Nada Jom'a
	 */
	@Keyword
	def static searchItem(String searchTerm){
		TestObject searchField = findTestObject('My Account/Page_Quick Order/input_searchKeyword')
		BasicActions.writeText(searchField, searchTerm)
	}

	/***
	 * CLick random Item from suggested Items list
	 * @author Nada Jom'a
	 */
	@Keyword
	def static selectRandomSuggestedElements() {
		TestObject obj = findTestObject('My Account/Page_Quick Order/li_suggestedItems')
		BasicActions.clickRandomElement(obj)
	}

	/***
	 * wait for Add To Order button to be enabled
	 * @author Nada Jom'a
	 */
	@Keyword
	def static  waitAddToOrderButtonToBeEnabled() {
		TestObject obj = findTestObject('My Account/Page_Quick Order/button_addToOrder')
		WebUI.waitForElementVisible(obj, GlobalVariable.elementTimeOut)
	}
	
	@Keyword
	def static waitForAddAllToCartToBeVisible(){
		TestObject obj = findTestObject('My Account/Page_Quick Order/button_addAllToCart')
		WebUI.waitForElementVisible(obj, GlobalVariable.elementTimeOut)
	}

	/***
	 * CLick Add To Order Button
	 * @author Nada Jom'a
	 */
	@Keyword
	def static clickAddToOrder(){
		TestObject addToOrderField = findTestObject('My Account/Page_Quick Order/button_addToOrder')
		BasicActions.clickElement(addToOrderField)
	}

	/***
	 * Add all products to cart by clicking 'Add All to cart and checkout' button and return product SKU number
	 * @return PRoduct SKU number
	 * @author Nada Jom'a
	 */
	@Keyword
	def static addAllProductsToCart() {
		TestObject itemNumSKU = findTestObject('My Account/Page_Quick Order/span_itemSKU')
		String itemSKU = PLPActions.getItemSKUAtIndex(itemNumSKU, 0)

		TestObject obj = findTestObject('My Account/Page_Quick Order/button_addAllToCart')
		BasicActions.clickElementAtIndex(obj, 0)

		return itemSKU
	}

	/***
	 * @author Nada Jom'a
	 */
	@Keyword
	def static addProductToOrder() {
		searchItem(GlobalVariable.Search_term)
		selectRandomSuggestedElements()
		waitAddToOrderButtonToBeEnabled()
		clickAddToOrder()
	}
}
