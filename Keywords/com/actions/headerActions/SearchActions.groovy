package com.actions.headerActions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.actions.checkoutActions.Checkout_Actions
import com.actions.myAccountActions.OrderHistoryActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import org.openqa.selenium.Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class SearchActions {

	/**
	 * Search for the given search term
	 * @param searchTerm
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def static searchForProduct (String searchTerm){
		TestObject searchIcon = findTestObject('Page_Search/span_searchIcon')
		BasicActions.clickElement(searchIcon)
		TestObject searchField = findTestObject('Page_Search/input_searchField')
		BasicActions.writeText(searchField, searchTerm)
	}

	/**
	 * Click add to cat button and close the search auto-complete
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def static clickAddToCart (){
		BasicActions.clickElementAtIndex(findTestObject('Page_Search/button_AddToCart'), 0)
	}
	
	/***
	 * Press Enter  To navigate to search result page
	 * @author Nada Jom'a
	 */
	@Keyword
	def static SubmitSearchRequest() {
		WebUI.sendKeys(findTestObject('Page_Search/input_searchField'), Keys.chord(Keys.ENTER))
	}

}
