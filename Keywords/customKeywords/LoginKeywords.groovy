package customKeywords

import com.actions.basicActions.GlobalActions
import com.actions.changeCustomer.ChangeCustomerActions
import com.actions.loginActions.LoginActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class LoginKeywords {

	/**
	 * Perform login
	 * @param userName
	 * @param password
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def PerformLogin(String userName, String password) {
		WebUI.navigateToUrl(GlobalVariable.URL_SignIn)
		LoginActions.writeUserName(userName)
		LoginActions.writePassword(password)
		LoginActions.clickSignInButton()
	}
}
