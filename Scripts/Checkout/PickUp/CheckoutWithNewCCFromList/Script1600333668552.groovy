import customKeywords.Navigations
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'customKeywords.BrowserKeywords.OpenBrowser'()

CustomKeywords.'customKeywords.LoginKeywords.PerformLogin'(GlobalVariable.userName, GlobalVariable.password)

CustomKeywords.'customKeywords.ChangeCustomerKeywords.ChangeCustomerByCustomerNumber'(GlobalVariable.Customer_Billto, GlobalVariable.Customer_Shipto)

CustomKeywords.'com.actions.checkoutActions.CartActions.clearCart'()

CustomKeywords.'customKeywords.Navigations.navigateToPage'(GlobalVariable.MyLists_URL)
