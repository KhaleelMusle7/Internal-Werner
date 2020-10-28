package com.helpers.myAccountHelpers

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.actions.myAccountActions.MyListsActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
public class MyListsHelpers {

	/**
	 * Create New List with random name and description 
	 * @return created list name
	 * @author Anas Salahat
	 */
	@Keyword
	def createNewListWithRandomNameAndDescription() {
		TestObject createNewListButton = findTestObject('My Account/Page_My Lists/button_createList')
		BasicActions.clickElement(createNewListButton)
		String enteredListName = MyListsActions.writeRandomListName()
		MyListsActions.writeRandomListDescription()
		MyListsActions.clickCreateListButtonInCreateNewListModal()
		return enteredListName
	}
}
