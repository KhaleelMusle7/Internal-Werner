package customKeywords
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.actions.basicActions.NavigationActions
import com.kms.katalon.core.annotation.Keyword

import internal.GlobalVariable

public class Navigations {

	/**
	 * Navigate to cart
	 * @author Anas Salahat
	 */
	@Keyword
	def static navigateToCart () {
		NavigationActions.navigateToURL(GlobalVariable.URL_Cart)
	}

	@Keyword
	def static navigateToPage(String URL) {
		NavigationActions.navigateToURL(URL)
	}
}
