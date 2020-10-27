package customKeywords

import com.actions.basicActions.GlobalActions
import com.actions.searchActions.SearchActions
import com.kms.katalon.core.annotation.Keyword
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