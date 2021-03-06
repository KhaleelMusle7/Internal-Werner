import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.actions.basicActions.BrowserKeywords.OpenBrowser'()

CustomKeywords.'com.helpers.loginHelpers.LoginHelpers.PerformLogin'(GlobalVariable.SavedPayment_UserName, GlobalVariable.SavedPayment_Password)

CustomKeywords.'com.helpers.loginHelpers.ChangeCustomerHelpers.ChangeCustomer'()

CustomKeywords.'com.actions.checkoutActions.CartActions.clearCart'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToPage'(GlobalVariable.SavedPayment_URL)

CustomKeywords.'com.helpers.myAccountHelpers.SavedPaymentsHelpers.deleteAllCards'()

CustomKeywords.'com.actions.headerActions.SearchActions.searchForProduct'(GlobalVariable.Search_term)

CustomKeywords.'com.actions.headerActions.SearchActions.SubmitSearchRequest'()

String addedItemSKU = CustomKeywords.'com.actions.PLPActions.PLPActions.clickRandomAddToCartWithQuantity'(GlobalVariable.qty)

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToCart'()

CustomKeywords.'com.validations.checkoutValidations.CartValidations.verifyItemExistsInCartWithSpecificQuantity'(addedItemSKU,
	GlobalVariable.qty)

CustomKeywords.'com.actions.checkoutActions.CartActions.clickCheckoutButton'()

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutAddressesHelpers.AddressesStepWithOneTimeShippingAddress'()

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutShippingHelpers.ShippingStep'(GlobalVariable.shipWhenComplete, GlobalVariable.Attention, GlobalVariable.ShippingInstructions)

String poNumber = CustomKeywords.'com.helpers.checkoutHelpers.CheckoutPaymentHelpers.PaymentStepWithSaveNewCC'()

CustomKeywords.'com.actions.checkoutActions.ReviewActions.clickSubmitOrder'()

CustomKeywords.'com.actions.checkoutActions.OrderConfirmationActions.verifyPageTitle'()

String orderNumber = CustomKeywords.'com.actions.checkoutActions.OrderConfirmationActions.getOrderNumber'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToPage'(GlobalVariable.OrderHistory_URL)

CustomKeywords.'com.actions.myAccountActions.OrderHistoryActions.searchOrderByOrderNumber'(orderNumber)

CustomKeywords.'com.validations.myAccountValidations.OrderHistoryValidations.verifyOrderHistoryHasItems'()

CustomKeywords.'com.actions.myAccountActions.OrderHistoryActions.clickOrderNumber'()

CustomKeywords.'com.validations.myAccountValidations.OrderDetailsValidations.verifyCurrentOrderNumber'(orderNumber)

CustomKeywords.'com.validations.myAccountValidations.OrderDetailsValidations.verifyCurrentPONumber'(poNumber)

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToPage'(GlobalVariable.SavedPayment_URL)

CustomKeywords.'com.validations.myAccountValidations.SavedPaymentValidations.verifySavedPayments'()

CustomKeywords.'com.actions.basicActions.BrowserKeywords.closeBrowser'()