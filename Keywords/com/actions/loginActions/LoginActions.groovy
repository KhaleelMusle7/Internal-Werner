package com.actions.loginActions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class LoginActions {

	/**
	 * Write the user name on the user name field
	 * @param userName
	 * @author Iman Abu Abiah
	 */
	def static writeUserName (String userName){
		TestObject userNameField = findTestObject('Page_SignIn/input_userName')
		BasicActions.clickElement(userNameField)
		BasicActions.writeText(userNameField, userName)
	}

	/**
	 * Write the user password on the password field
	 * @param password
	 * @author Iman Abu Abiah
	 */
	def static writePassword (String password){
		TestObject passwordField = findTestObject('Page_SignIn/input_password')
		BasicActions.clickElement(passwordField)
		BasicActions.writeText(passwordField, password)
	}

	/**
	 * Click on sign in button
	 * @author Iman Abu Abiah
	 */
	def static clickSignInButton(){
		TestObject signInButton = findTestObject('Page_SignIn/button_SignIn')
		BasicActions.clickElement(signInButton)
	}
}
