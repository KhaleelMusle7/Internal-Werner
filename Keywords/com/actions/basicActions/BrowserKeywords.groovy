package com.actions.basicActions

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class BrowserKeywords {
	/**
	 * Open browser and maximize window
	 * @author Iman Abu Abiah
	 * @author Anas Salahat
	 */
	@Keyword
	def OpenBrowser() {
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl(GlobalVariable.Site_URL)
	}

	
	/**
	 * Clear Cookies in browser and signout from website
	 * @author Shurooq Salahat
	 */
	@Keyword
	def clearCookies() {
		WebUI.deleteAllCookies()
	}

	/**
	 * Close Browser
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def closeBrowser() {
		WebUI.closeBrowser()
	}
}
