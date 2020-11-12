package com.validations.myAccountValidations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class ListDetailsValidations {
	/***
	 * Verifies the list name if its matches expected list name
	 * @param listName
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	@Keyword
	def static verifyListName(String listName) {
		assert WebUI.getText(findTestObject('Object Repository/My Account/Page_List Details/h1_listName')).equalsIgnoreCase(listName) == true
	}

	/***
	 * Verifies if item exists in the list
	 * @param itemName the name of the item
	 * @return the index of the item in the list
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	@Keyword
	def static int verifyItemExistsInList(String itemName) {
		List<WebElement> itemsNames = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/My Account/Page_List Details/a_itemName'), GlobalVariable.elementTimeOut)
		int itemIndex = -1;
		for (int i = 0; i<itemsNames.size(); i++) {
			TestObject currentItemNameObject = WebUI.convertWebElementToTestObject(itemsNames.get(i))
			if(BasicActions.getElementText(currentItemNameObject).equalsIgnoreCase(itemName)) {
				assert true == true
				itemIndex = i;
				return itemIndex;
			}
		}
		assert true == false
		return itemIndex
	}
}
