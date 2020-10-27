import org.eclipse.persistence.internal.jpa.parsing.jpql.antlr.JPQLParser.orderByClause_scope

import com.actions.checkoutActions.CartActions
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


import internal.GlobalVariable as GlobalVariable

CustomKeywords.'customKeywords.BrowserKeywords.OpenBrowser'()

CustomKeywords.'customKeywords.LoginKeywords.PerformLogin'(GlobalVariable.userName, GlobalVariable.password)

CustomKeywords.'customKeywords.ChangeCustomerKeywords.ChangeCustomer'()

CustomKeywords.'com.actions.checkoutActions.CartActions.clearCart'()

CustomKeywords.'customKeywords.SearchKeywords.PerformSearch'(GlobalVariable.Search_term)

CustomKeywords.'customKeywords.SearchKeywords.AddToCartFromSearch'()

CustomKeywords.'customKeywords.Navigations.navigateToCart'()

CustomKeywords.'com.actions.checkoutActions.CartActions.clickCheckoutButton'()

CustomKeywords.'customKeywords.CheckoutKeywords.AddressesStepWithOneTimeShippingAddress'()

CustomKeywords.'customKeywords.CheckoutKeywords.ShippingStep'(GlobalVariable.Shipping_Available, GlobalVariable.Attention, GlobalVariable.ShippingInstructions)

CustomKeywords.'customKeywords.CheckoutKeywords.PaymentStepWithNewCC'()

CustomKeywords.'customKeywords.CheckoutKeywords.ReviewStep'()

CustomKeywords.'customKeywords.OrderConfirmation.verifyPageTitle'()

String orderNumber = CustomKeywords.'customKeywords.OrderConfirmation.getOrderNumber'()

CustomKeywords.'customKeywords.Navigations.navigateToPage'(GlobalVariable.OrderHistory_URL)

CustomKeywords.'customKeywords.CheckoutKeywords.verifyOrderPlaced'(orderNumber)

CustomKeywords.'customKeywords.BrowserKeywords.closeBrowser'()
