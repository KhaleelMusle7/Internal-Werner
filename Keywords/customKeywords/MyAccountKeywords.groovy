package customKeywords

import com.actions.myAccountActions.MyAccountActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class MyAccountKeywords {
	
	/**
	 * Verify that the title of my account page is displayed
	 */
	@Keyword
	def VerifyMyAccountPageTitle () {
		WebUI.navigateToUrl(GlobalVariable.URL_MyAccount)
		MyAccountActions.verifyMyAccountTitleIsDisplayed()
	}
}
