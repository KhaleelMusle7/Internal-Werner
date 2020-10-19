package customKeywords
import com.kms.katalon.core.annotation.Keyword


import com.actions.PDPActions.PDP_Actions
import com.actions.checkoutActions.Checkout_Actions
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.entity.global.GlobalVariableEntity
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class PDPKeywords {


	@Keyword
	AddToCartFromPDP (){

		PDP_Actions.clickAddToCart()
	}
}
