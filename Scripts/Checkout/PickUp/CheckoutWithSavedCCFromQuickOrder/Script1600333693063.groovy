import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


import internal.GlobalVariable as GlobalVariable

CustomKeywords.'customKeywords.BrowserKeywords.OpenBrowser'()

CustomKeywords.'customKeywords.LoginKeywords.PerformLogin'(GlobalVariable.userName, GlobalVariable.password)

CustomKeywords.'customKeywords.ChangeCustomerKeywords.ChangeCustomer'()

CustomKeywords.'com.actions.checkoutActions.CartActions.clearCart'()

CustomKeywords.'customKeywords.QuickOrder.addfromQuickOrder'()

CustomKeywords.'customKeywords.Navigations.navigateToCart'()

CustomKeywords.'com.actions.checkoutActions.CartActions.clickCheckoutButton'()

CustomKeywords.'customKeywords.CheckoutKeywords.AddressesStepWithPickUpAddress'()

CustomKeywords.'customKeywords.CheckoutKeywords.ShippingStepWithPickUp'( GlobalVariable.Attention, GlobalVariable.ShippingInstructions)

CustomKeywords.'customKeywords.CheckoutKeywords.PaymentStepWithSavedCC'()

CustomKeywords.'customKeywords.CheckoutKeywords.ReviewStep'()

CustomKeywords.'customKeywords.OrderConfirmation.verifyPageTitle'()

String orderNumber = CustomKeywords.'customKeywords.OrderConfirmation.getOrderNumber'()

CustomKeywords.'customKeywords.Navigations.navigateToPage'(GlobalVariable.OrderHistory_URL)

CustomKeywords.'customKeywords.CheckoutKeywords.verifyOrderPlaced'(orderNumber)

CustomKeywords.'customKeywords.BrowserKeywords.closeBrowser'()
