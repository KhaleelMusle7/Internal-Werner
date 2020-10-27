package customKeywords
import com.actions.PDPActions.PDPActions
import com.kms.katalon.core.annotation.Keyword

public class PDPKeywords {


	@Keyword
	def static AddToCartFromPDP (){
		PDPActions.clickAddToCart()
	}
}
