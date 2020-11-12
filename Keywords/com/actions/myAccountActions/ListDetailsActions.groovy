package com.actions.myAccountActions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.actions.basicActions.BasicActions
import com.actions.basicActions.GlobalActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
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
		WebUI.waitForElementClickable(keywordSearchField, GlobalVariable.elementTimeOut)
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
		WebUI.waitForElementVisible(suggestedProduct, GlobalVariable.elementTimeOut)
		WebUI.waitForElementClickable(suggestedProduct, GlobalVariable.elementTimeOut)

		String itemName = BasicActions.getElementTextAtIndex(findTestObject('Object Repository/My Account/Page_List Details/Add Items Modal/suggestedItemText'), index)
		String itemNumber = BasicActions.getElementTextAtIndex(findTestObject('Object Repository/My Account/Page_List Details/Add Items Modal/suggestedItemNumber'), index)

		BasicActions.clickElementAtIndex(suggestedProduct, index)

		String[] itemDetails = new String[2];
		itemDetails[0] = itemName;
		itemDetails[1] = itemNumber;
		return itemDetails;
	}

	/***
	 * Selects Random suggested item from the products suggestion list
	 * @return Array of the item details the first element is the Item Description and the second element is the Item Number
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	@Keyword
	def static String[] selecRandomSuggestedItem() {
		TestObject suggestedProducts = findTestObject('My Account/Page_List Details/Add Items Modal/li_suggestedProduct')
		List<WebElement> items = WebUiCommonHelper.findWebElements(suggestedProducts, GlobalVariable.elementTimeOut)
		int randomIndex = Math.floor(Math.random() * items.size())
		return selectSuggestedItemAtIndex(randomIndex)
	}

	/***
	 * Selects First suggested item from the products suggestion list
	 * @return Array of the item details the first element is the Item Description and the second element is the Item Number
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	@Keyword
	def static String[] selectFirstSuggestedItem() {
		return selectSuggestedItemAtIndex(0)
	}

	/***
	 * Clicks on Add Item to List button
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	@Keyword
	def static clickAddItemToListButton() {
		WebUI.click(findTestObject('Object Repository/My Account/Page_List Details/Add Items Modal/button_addItemToList'))
		clickAddItemsButton()
	}

	/***
	 * Clicks on Add List to Cart button
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	@Keyword
	public static void clickAddListToCartButton() {
		BasicActions.clickElement(findTestObject('Object Repository/My Account/Page_List Details/button_addListToCart'))
		GlobalActions.waitToastMessageToDisplay()
	}
}
