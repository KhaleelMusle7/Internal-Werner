package com.actions.searchActions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.actions.myAccountActions.OrderHistoryActions
import com.actions.basicActions.BasicActions
import com.actions.checkoutActions.Checkout_Actions
import com.kms.katalon.core.testobject.TestObject

public class SearchActions {

	/**
	 * Search for the given search term
	 * @param searchTerm
	 * @author Iman Abu Abiah
	 */
	public static void searchForProduct (String searchTerm){
		TestObject searchIcon = findTestObject('Page_Search/span_searchIcon')
		BasicActions.clickElement(searchIcon)
		TestObject searchField = findTestObject('Page_Search/input_searchField')
		BasicActions.writeText(searchField, searchTerm)
	}

	/**
	 * Click add to cat button and close the search auto-complete
	 * @author Iman Abu Abiah
	 */
	public static void clickAddToCart (){
		Checkout_Actions.clickAddToCart(findTestObject('Page_Search/button_AddToCart'))
	}

	/***
	 * @author khaleel Musleh
	 */
	
	public static void searchForOrder(String orderNumber) {
		OrderHistoryActions.expandSearchForm()
		OrderHistoryActions.fillOrderNumberField(orderNumber)
		OrderHistoryActions.clickSearchButton()
	}
}
