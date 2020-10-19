package customKeywords

import com.actions.basicActions.GlobalActions
import com.actions.checkoutActions.Checkout_Actions

import com.actions.searchActions.SearchActions
import com.kms.katalon.core.annotation.Keyword

import internal.GlobalVariable

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
public class SearchKeywords {

	/**
	 * Search for the term given
	 * @param searchTerm
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def PerformSearch (String searchTerm){
		SearchActions.searchForProduct(searchTerm)
	}

	/**
	 * Add product to the cart from the search
	 * @author Iman Abu Abiah
	 */
	@Keyword
	def AddToCartFromSearch (){
		SearchActions.clickAddToCart()
	}
	@Keyword
	def WaitForLoaderToFinish (){
		GlobalActions.WaitForLoaderToFinish()
	}
}