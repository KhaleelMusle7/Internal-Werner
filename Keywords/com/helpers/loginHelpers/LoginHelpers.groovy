package com.helpers.loginHelpers

import com.actions.basicActions.BasicActions
import com.actions.loginActions.LoginActions
import com.kms.katalon.core.annotation.Keyword
import com.util.helpers.generalHelpers.Navigations

import internal.GlobalVariable

public class LoginHelpers {

	/**
	 * Perform login
	 * @param userName
	 * @param password
	 * @author Iman Abu Abiah
	 * @author Anas Salahat
	 */
	@Keyword
	def PerformLogin(String userName, String password) {
		Navigations.navigateToPage(GlobalVariable.SignInPage_URL)
		LoginActions.writeUserName(userName)
		LoginActions.writePassword(password)
		LoginActions.clickSignInButton()
	}
}
