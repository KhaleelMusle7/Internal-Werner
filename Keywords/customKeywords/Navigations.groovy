package customKeywords
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.actions.basicActions.NavigationActions
import com.kms.katalon.core.annotation.Keyword

import internal.GlobalVariable

public class Navigations {
	/**
	 * Checkout with saved CC
	 */
	@Keyword
	def NavigateToAddressesInCheckout (){

		NavigationActions.navigateToURL(GlobalVariable.URL_Cart)
		BasicActions.clickElement(findTestObject('Object Repository/Page_Cart/button_checkout'))
	}

	@Keyword
	def navigateToPage(String URL) {
		NavigationActions.navigateToURL(URL)
	}
}
