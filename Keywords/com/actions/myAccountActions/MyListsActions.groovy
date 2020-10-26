package com.actions.myAccountActions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.actions.basicActions.GlobalActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.util.helpers.generalHelpers.RandomUtil

import internal.GlobalVariable

public class MyListsActions {

	/***
	 * write random String in the list name field in create new list modal
	 * @return the entered list name
	 * @author Anas Salahat
	 */
	@Keyword
	def static writeRandomListName() {
		String randomListName = RandomUtil.getRandomName()
		TestObject listNameField = findTestObject('My Account/Page_My Lists/Create New List Modal/input_List Name')
		BasicActions.writeText(listNameField, randomListName)
		return randomListName
	}

	/***
	 * write random String in the list description field in create new list modal
	 * @return the entered list description
	 * @author Anas Salahat
	 */
	@Keyword
	def static writeRandomListDescription() {
		String randomListDescription = RandomUtil.getRandomString()
		TestObject listDescriptionField = findTestObject('My Account/Page_My Lists/Create New List Modal/textarea_List Description')
		BasicActions.writeText(listDescriptionField, randomListDescription)
		return randomListDescription
	}

	/***
	 * Clicks on create list button in the create new list modal
	 * @author Anas Salahat
	 */
	@Keyword
	def static clickCreateListButtonInCreateNewListModal() {
		TestObject createListButton = findTestObject('Object Repository/My Account/Page_My Lists/Create New List Modal/button_Create List')
		BasicActions.clickElement(createListButton)
	}

	/***
	 * Navigates to the List Details page using the name of the list
	 * @param listName 
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	@Keyword
	def static navigateToListByName(String listName) {
		writeSearchTerm(listName);
		Thread.sleep(2000);
		clickListAtIndex(0);
	}

	/***
	 * Navigates to List Details page using the order of the list
	 * @param index the order of the list in the page starting from 0
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	def static clickListAtIndex(int index) {
		BasicActions.clickElementAtIndex(findTestObject('Object Repository/My Account/Page_My Lists/a_List Name'), index)
	}

	/***
	 * Writes a search term inside the search box of the My Lists page and waits for the results.
	 * This method doesn't verify the returned results
	 * @param searchTerm
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	def static writeSearchTerm(String searchTerm) {
		TestObject searchField = findTestObject('Object Repository/My Account/Page_My Lists/input_Search Field')
		WebUI.clearText(searchField)
		BasicActions.writeText(searchField, searchTerm);
		GlobalActions.WaitForLoaderToFinish()
	}
}
