import com.validations.checkoutValidations.CartValidations

import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.actions.basicActions.BrowserKeywords.OpenBrowser'()

CustomKeywords.'com.helpers.loginHelpers.LoginHelpers.PerformLogin'(GlobalVariable.userName, GlobalVariable.password)

CustomKeywords.'com.helpers.loginHelpers.ChangeCustomerHelpers.ChangeCustomer'()

CustomKeywords.'com.actions.checkoutActions.CartActions.clearCart'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToPage'(GlobalVariable.OrderHistory_URL)

CustomKeywords.'com.actions.myAccountActions.OrderHistoryActions.navigateToRandomOrder'()

String itemSKU = CustomKeywords.'com.actions.myAccountActions.OrderDetailsActions.reorder'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToCart'()

CartValidations.verifyItemExistsInCart(itemSKU)

CustomKeywords.'com.actions.checkoutActions.CartActions.clickCheckoutButton'()

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutAddressesHelpers.AddressesStepWithOneTimeShippingAddress'()

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutShippingHelpers.ShippingStep'(GlobalVariable.shipWhenAvailble, GlobalVariable.Attention,
	GlobalVariable.ShippingInstructions)

String poNumber = CustomKeywords.'com.helpers.checkoutHelpers.CheckoutPaymentHelpers.PaymentStepWithPO'()

CustomKeywords.'com.actions.checkoutActions.ReviewActions.clickSubmitOrder'()

CustomKeywords.'com.actions.checkoutActions.OrderConfirmationActions.verifyPageTitle'()

String orderNumber = CustomKeywords.'com.actions.checkoutActions.OrderConfirmationActions.getOrderNumber'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToPage'(GlobalVariable.OrderHistory_URL)

CustomKeywords.'com.actions.myAccountActions.OrderHistoryActions.searchOrderByPO'(poNumber)

CustomKeywords.'com.validations.myAccountValidations.OrderHistoryValidations.verifyOrderHistoryHasItems'()

CustomKeywords.'com.actions.myAccountActions.OrderHistoryActions.clickOrderNumber'()

CustomKeywords.'com.validations.myAccountValidations.OrderDetailsValidations.verifyCurrentOrderNumber'(orderNumber)

CustomKeywords.'com.validations.myAccountValidations.OrderDetailsValidations.verifyCurrentPONumber'(poNumber)

CustomKeywords.'com.validations.myAccountValidations.OrderDetailsValidations.verifyItemExistsInPage'(itemSKU)

CustomKeywords.'com.actions.basicActions.BrowserKeywords.closeBrowser'()