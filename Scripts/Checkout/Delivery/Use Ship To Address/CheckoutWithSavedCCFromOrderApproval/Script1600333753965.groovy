import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

CustomKeywords.'customKeywords.BrowserKeywords.OpenBrowser'()

CustomKeywords.'customKeywords.LoginKeywords.PerformLogin'(GlobalVariable.userName, GlobalVariable.password)

CustomKeywords.'customKeywords.ChangeCustomerKeywords.ChangeCustomer'()

CustomKeywords.'customKeywords.Navigations.navigateToPage'(GlobalVariable.PLP_URL)

CustomKeywords.'customKeywords.PLPKeywords.clickRandomAddToCart'()

CustomKeywords.'customKeywords.Navigations.NavigateToAddressesInCheckout'()

CustomKeywords.'customKeywords.CheckoutKeywords.AddressesStepWithDeliveryAddress'()

CustomKeywords.'customKeywords.CheckoutKeywords.ShippingStep'(GlobalVariable.Shipping_Available, GlobalVariable.Attention, GlobalVariable.ShippingInstructions)

CustomKeywords.'customKeywords.CheckoutKeywords.PaymentStepWithSavedCC'()

CustomKeywords.'customKeywords.CheckoutKeywords.ReviewStep'()

WebUI.closeBrowser()
