package com.actions.myAccountActions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions

public class MyAccountActions {
	def static verifyMyAccountTitleIsDisplayed(){
		String pageTitle = BasicActions.getElementText(findTestObject('My Account/Page_My Account Dashboard/h1_myAccountTitle'))
		assert pageTitle == 'My Account'
	}
}
