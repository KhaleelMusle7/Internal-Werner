package customKeywords
import com.actions.basicActions.BasicActions
import com.kms.katalon.core.annotation.Keyword

import internal.GlobalVariable

public class Navigations {

	/**
	 * Navigate to cart
	 * @author Anas Salahat
	 */
	@Keyword
	def static navigateToCart () {
		BasicActions.navigateToURL(GlobalVariable.URL_Cart)
	}

	@Keyword
	def static navigateToPage(String URL) {
		BasicActions.navigateToURL(URL)
	}
}
