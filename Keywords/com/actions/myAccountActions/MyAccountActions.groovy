package com.actions.myAccountActions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class MyAccountActions {
	public static void verifyMyAccountTitleIsDisplayed(){
		String pageTitle = WebUI.getText(findTestObject('My Account/Page_My Account Dashboard/h1_myAccountTitle'))
		assert pageTitle == 'My Account'
	}
}
