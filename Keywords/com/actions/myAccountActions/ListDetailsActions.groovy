package com.actions.myAccountActions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class ListDetailsActions {

	/***
	 * Clicks on Add Items Button to show add items modal
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	@Keyword
	def static clickAddItemsButton() {
		BasicActions.clickElement(findTestObject('Object Repository/My Account/Page_List Details/button_addItemsButton'))
	}

	/***
	 * Writes the provided search term inside search field of add items modal
	 * @param searchTerm
	 * @author Anas Salahat
	 */
	@Keyword
	def static writeSearchTerm(String searchTerm) {
		TestObject keywordSearchField = findTestObject('My Account/Page_List Details/Add Items Modal/input_searchItemKeywordField')
		WebUI.waitForElementClickable(keywordSearchField, GlobalVariable.ElementsTimeOut)
		BasicActions.writeText(keywordSearchField, searchTerm)
	}

	/***
	 * Selects Specific suggested item from the products suggestion list
	 * @param index the order of the item at the list
	 * @return Array of the item details the first element is the Item Description and the second element is the Item Number
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	@Keyword
	def static String[] selectSuggestedItemAtIndex(int index) {
		TestObject suggestedProduct = findTestObject('My Account/Page_List Details/Add Items Modal/li_suggestedProduct')
		WebUI.waitForElementVisible(suggestedProduct, GlobalVariable.ElementsTimeOut)
		WebUI.waitForElementClickable(suggestedProduct, GlobalVariable.ElementsTimeOut)

		String itemName = BasicActions.getElementTextAtIndex(findTestObject('Object Repository/My Account/Page_List Details/Add Items Modal/suggestedItemText'), index)
		String itemNumber = BasicActions.getElementTextAtIndex(findTestObject('Object Repository/My Account/Page_List Details/Add Items Modal/suggestedItemNumber'), index)

		BasicActions.clickElementAtIndex(suggestedProduct, index)
		
		 String[] itemDetails = new String[2];
		 itemDetails[0] = itemName;
		 itemDetails[1] = itemNumber;
		 return itemDetails;
	}
}
