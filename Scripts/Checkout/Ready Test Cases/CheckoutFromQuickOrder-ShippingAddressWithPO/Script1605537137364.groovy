import com.validations.checkoutValidations.CartValidations as CartValidations
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

CustomKeywords.'com.actions.basicActions.BrowserKeywords.OpenBrowser'()

CustomKeywords.'com.helpers.loginHelpers.LoginHelpers.PerformLogin'(GlobalVariable.userName, GlobalVariable.password)

CustomKeywords.'com.helpers.loginHelpers.ChangeCustomerHelpers.ChangeCustomer'()

CustomKeywords.'com.actions.checkoutActions.CartActions.clearCart'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToPage'(GlobalVariable.QuickOrderPage_URL)

CustomKeywords.'com.actions.myAccountActions.QuickOrderActions.addProductToOrder'()

CustomKeywords.'com.actions.myAccountActions.QuickOrderActions.waitForAddAllToCartToBeVisible'()

String itemSKU = CustomKeywords.'com.actions.myAccountActions.QuickOrderActions.addAllProductsToCart'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToCart'()

CartValidations.verifyItemExistsInCart(itemSKU)

CustomKeywords.'com.actions.checkoutActions.CartActions.clickCheckoutButton'()

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutAddressesHelpers.AddressesStepWithDeliveryAddress'()

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