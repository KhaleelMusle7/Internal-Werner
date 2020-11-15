import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.actions.basicActions.BrowserKeywords.OpenBrowser'()

CustomKeywords.'com.helpers.loginHelpers.LoginHelpers.PerformLogin'(GlobalVariable.userName, GlobalVariable.password)

CustomKeywords.'com.helpers.loginHelpers.ChangeCustomerHelpers.ChangeCustomerByCustomerNumber'(GlobalVariable.Customer_Billto, GlobalVariable.Customer_Shipto)

CustomKeywords.'com.actions.checkoutActions.CartActions.clearCart'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToPage'(GlobalVariable.OrderApproval_URL)

CustomKeywords.'com.helpers.myAccountHelpers.OrderApprovalHelpers.navigateToOrderApprovalDetailsForSpecificOrder'(GlobalVariable.OrderApproval_OrderNumber)

CustomKeywords.'com.actions.myAccountActions.OrderApprovalDetailsActions.clickApproveOrder'()

CustomKeywords.'com.actions.checkoutActions.CartActions.clickCheckoutButton'()

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutAddressesHelpers.AddressesStepWithDeliveryAddress'()

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutShippingHelpers.ShippingStep'(GlobalVariable.Shipping_Available, GlobalVariable.Attention, GlobalVariable.ShippingInstructions)

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutPaymentHelpers.PaymentStepWithPO'()

CustomKeywords.'com.actions.checkoutActions.ReviewActions.clickSubmitOrder'()

CustomKeywords.'com.actions.checkoutActions.OrderConfirmationActions.verifyPageTitle'()

String orderNumber = CustomKeywords.'com.actions.checkoutActions.OrderConfirmationActions.getOrderNumber'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToPage'(GlobalVariable.OrderHistory_URL)

CustomKeywords.'com.actions.myAccountActions.OrderHistoryActions.searchOrderByOrderNumber'(orderNumber)

CustomKeywords.'com.actions.basicActions.BrowserKeywords.closeBrowser'()