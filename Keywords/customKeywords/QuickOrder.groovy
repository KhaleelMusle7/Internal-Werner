package customKeywords
import com.actions.myAccountActions.QuickOrderActions

public class QuickOrder {

	def static addfromQuickOrder() {
		QuickOrderActions.expandQuickOrder()
		QuickOrderActions.addRandomItem()
		QuickOrderActions.addToCart()
	}
}
