import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.actions.basicActions.BrowserKeywords.OpenBrowser'()

CustomKeywords.'com.helpers.loginHelpers.LoginHelpers.PerformLogin'(GlobalVariable.buyer1User, GlobalVariable.buyer1Password)

CustomKeywords.'com.helpers.loginHelpers.ChangeCustomerHelpers.ChangeCustomer'()

CustomKeywords.'com.actions.checkoutActions.CartActions.clearCart'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToPage'(GlobalVariable.PDP_URL)

String itemSKU = CustomKeywords.'com.actions.PDPActions.PDPActions.clickAddToCartWithQuantity'(GlobalVariable.qty)

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToCart'()

CustomKeywords.'com.validations.checkoutValidations.CartValidations.verifyItemExistsInCartWithSpecificQuantity'(itemSKU, GlobalVariable.qty)

CustomKeywords.'com.actions.checkoutActions.CartActions.clickCheckoutButton'()

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutAddressesHelpers.AddressesStepWithOneTimeShippingAddress'()

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutShippingHelpers.ShippingStep'(GlobalVariable.shipWhenComplete, GlobalVariable.Attention,
	GlobalVariable.ShippingInstructions)

String poNumber = CustomKeywords.'com.helpers.checkoutHelpers.CheckoutPaymentHelpers.PaymentStepWithPOInOrderApproval'()

CustomKeywords.'com.actions.myAccountActions.OrderApprovalActions.clickSubmitForApprovalButton'()

CustomKeywords.'com.actions.checkoutActions.OrderApprovalConfirmationActions.verifyOrdarApprovalPageTitle'()

String orderNumber = CustomKeywords."com.actions.checkoutActions.OrderApprovalConfirmationActions.getOrderNumber"()

CustomKeywords.'com.actions.basicActions.BrowserKeywords.clearCookies'() 

CustomKeywords.'com.helpers.loginHelpers.LoginHelpers.PerformLogin'(GlobalVariable.userName, GlobalVariable.password)

CustomKeywords.'com.helpers.loginHelpers.ChangeCustomerHelpers.ChangeCustomer'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToPage'(GlobalVariable.OrderApproval_URL)

CustomKeywords.'com.actions.myAccountActions.OrderApprovalActions.expandSearchOrdersWidget'()

CustomKeywords.'com.actions.myAccountActions.OrderApprovalActions.writeOrderNumber'(orderNumber)

CustomKeywords.'com.actions.myAccountActions.OrderApprovalActions.clickSearchButton'()

CustomKeywords.'com.actions.myAccountActions.OrderApprovalActions.clickOrderNumberLink'()

CustomKeywords.'com.actions.myAccountActions.OrderApprovalDetailsActions.clickApproveOrder'()

CustomKeywords.'com.actions.checkoutActions.CartActions.clickCheckoutButton'()

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutAddressesHelpers.AddressesStepWithOneTimeShippingAddress'()

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutShippingHelpers.ShippingStep'(GlobalVariable.shipWhenComplete, GlobalVariable.Attention,
	GlobalVariable.ShippingInstructions)
String PONumber = CustomKeywords.'com.helpers.checkoutHelpers.CheckoutPaymentHelpers.PaymentStepWithPO'()

CustomKeywords.'com.actions.checkoutActions.ReviewActions.clickSubmitOrder'()

CustomKeywords.'com.actions.checkoutActions.OrderConfirmationActions.verifyPageTitle'()

String OrderNumber = CustomKeywords.'com.actions.checkoutActions.OrderConfirmationActions.getOrderNumber'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToPage'(GlobalVariable.OrderHistory_URL)

CustomKeywords.'com.actions.myAccountActions.OrderHistoryActions.searchOrderByOrderNumber'(OrderNumber)

CustomKeywords.'com.validations.myAccountValidations.OrderHistoryValidations.verifyOrderHistoryHasItems'()

CustomKeywords.'com.actions.myAccountActions.OrderHistoryActions.clickOrderNumber'()

CustomKeywords.'com.validations.myAccountValidations.OrderDetailsValidations.verifyCurrentOrderNumber'(OrderNumber)

CustomKeywords.'com.validations.myAccountValidations.OrderDetailsValidations.verifyCurrentPONumber'(PONumber)

CustomKeywords.'com.actions.basicActions.BrowserKeywords.closeBrowser'()