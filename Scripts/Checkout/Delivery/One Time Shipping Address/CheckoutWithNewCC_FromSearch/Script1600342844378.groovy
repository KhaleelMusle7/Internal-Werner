import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.actions.basicActions.BrowserKeywords.OpenBrowser'()

CustomKeywords.'com.helpers.loginHelpers.LoginHelpers.PerformLogin'(GlobalVariable.userName, GlobalVariable.password)

CustomKeywords.'com.helpers.loginHelpers.ChangeCustomerHelpers.ChangeCustomer'()

CustomKeywords.'com.actions.checkoutActions.CartActions.clearCart'()

CustomKeywords.'com.actions.headerActions.SearchActions.searchForProduct'(GlobalVariable.Search_term)

CustomKeywords.'com.actions.headerActions.SearchActions.clickAddToCart'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToCart'()

CustomKeywords.'com.actions.checkoutActions.CartActions.clickCheckoutButton'()

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutAddressesHelpers.AddressesStepWithOneTimeShippingAddress'()

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutShippingHelpers.ShippingStep'(GlobalVariable.Shipping_Available, GlobalVariable.Attention, GlobalVariable.ShippingInstructions)

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutPaymentHelpers.PaymentStepWithNewCC'()

CustomKeywords.'com.actions.checkoutActions.ReviewActions.clickSubmitOrder'()

CustomKeywords.'com.actions.checkoutActions.OrderConfirmationActions.verifyPageTitle'()

String orderNumber = CustomKeywords.'com.actions.checkoutActions.OrderConfirmationActions.getOrderNumber'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToPage'(GlobalVariable.OrderHistory_URL)

CustomKeywords.'com.actions.myAccountActions.OrderHistoryActions.searchOrderByOrderNumber'(orderNumber)

CustomKeywords.'com.actions.basicActions.BrowserKeywords.closeBrowser'()
