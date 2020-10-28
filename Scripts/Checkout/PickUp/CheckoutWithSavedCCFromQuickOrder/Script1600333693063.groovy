import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.actions.basicActions.BrowserKeywords.OpenBrowser'()

CustomKeywords.'com.helpers.loginHelpers.LoginHelpers.PerformLogin'(GlobalVariable.userName, GlobalVariable.password)

CustomKeywords.'com.helpers.loginHelpers.ChangeCustomerHelpers.ChangeCustomer'()

CustomKeywords.'com.actions.checkoutActions.CartActions.clearCart'()

CustomKeywords.'com.actions.headerActions.QuickOrderOverlyActions.addProductToCart'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToCart'()

CustomKeywords.'com.actions.checkoutActions.CartActions.clickCheckoutButton'()

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutAddressesHelpers.AddressesStepWithPickUpAddress'()

CustomKeywords.'customKeywords.CheckoutKeywords.ShippingStepWithPickUp'( GlobalVariable.Attention, GlobalVariable.ShippingInstructions)

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutPaymentHelpers.PaymentStepWithSavedCC'()

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutReviewHelpers.ReviewStep'()

CustomKeywords.'com.actions.checkoutActions.OrderConfirmationActions.verifyPageTitle'()

String orderNumber = CustomKeywords.'com.actions.checkoutActions.OrderConfirmationActions.getOrderNumber'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToPage'(GlobalVariable.OrderHistory_URL)

CustomKeywords.'com.actions.headerActions.SearchActions.searchForOrder'(orderNumber)

CustomKeywords.'com.actions.basicActions.BrowserKeywords.closeBrowser'()
