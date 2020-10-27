package customKeywords
import com.actions.PDPActions.PDP_Actions
import com.kms.katalon.core.annotation.Keyword

public class PDPKeywords {


	@Keyword
	def static AddToCartFromPDP (){
		PDP_Actions.clickAddToCart()
	}
}
