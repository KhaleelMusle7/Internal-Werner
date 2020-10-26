package com.validations.myAccountValidations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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
}
