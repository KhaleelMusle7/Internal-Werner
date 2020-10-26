import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

CustomKeywords.'customKeywords.BrowserKeywords.OpenBrowser'()

CustomKeywords.'customKeywords.LoginKeywords.PerformLogin'(GlobalVariable.userName, GlobalVariable.password)

CustomKeywords.'customKeywords.ChangeCustomerKeywords.ChangeCustomerByCustomerNumber'(GlobalVariable.Customer_Billto, GlobalVariable.Customer_Shipto)

CustomKeywords.'com.actions.checkoutActions.CartActions.clearCart'()

CustomKeywords.'customKeywords.Navigations.navigateToPage'(GlobalVariable.OrderApproval_URL)

CustomKeywords.'com.helpers.myAccountHelpers.OrderApprovalHelpers.navigateToOrderApprovalDetailsForSpecificOrder'(GlobalVariable.OrderApproval_OrderNumber)

CustomKeywords.'com.actions.myAccountActions.OrderApprovalDetailsActions.clickApproveOrder'()

CustomKeywords.'customKeywords.Navigations.navigateToCart'()

CustomKeywords.'com.actions.checkoutActions.CartActions.clickCheckoutButton'()

CustomKeywords.'customKeywords.CheckoutKeywords.AddressesStepWithDeliveryAddress'()

CustomKeywords.'customKeywords.CheckoutKeywords.ShippingStep'(GlobalVariable.Shipping_Available, GlobalVariable.Attention, GlobalVariable.ShippingInstructions)

CustomKeywords.'customKeywords.CheckoutKeywords.PaymentStepWithPO'()

CustomKeywords.'customKeywords.CheckoutKeywords.ReviewStep'()

CustomKeywords.'customKeywords.OrderConfirmation.verifyPageTitle'()

String orderNumber = CustomKeywords.'customKeywords.OrderConfirmation.getOrderNumber'()

CustomKeywords.'customKeywords.Navigations.navigateToPage'(GlobalVariable.OrderHistory_URL)

CustomKeywords.'customKeywords.CheckoutKeywords.verifyOrderPlaced'(orderNumber)

WebUI.closeBrowser()