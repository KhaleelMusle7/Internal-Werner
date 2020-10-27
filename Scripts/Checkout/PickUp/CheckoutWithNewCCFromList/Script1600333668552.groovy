import com.actions.basicActions.BasicActions

import internal.GlobalVariable as GlobalVariable

CustomKeywords.'customKeywords.BrowserKeywords.OpenBrowser'()

CustomKeywords.'customKeywords.LoginKeywords.PerformLogin'(GlobalVariable.userName, GlobalVariable.password)

CustomKeywords.'customKeywords.ChangeCustomerKeywords.ChangeCustomerByCustomerNumber'(GlobalVariable.Customer_Billto, GlobalVariable.Customer_Shipto)

CustomKeywords.'com.actions.checkoutActions.CartActions.clearCart'()

CustomKeywords.'customKeywords.Navigations.navigateToPage'(GlobalVariable.MyLists_URL)

String listName = CustomKeywords.'com.helpers.myAccountHelpers.MyListsHelpers.createNewListWithRandomNameAndDescription'()

CustomKeywords.'com.actions.myAccountActions.MyListsActions.navigateToListByName'(listName)

CustomKeywords.'com.validations.myAccountValidations.ListDetailsValidations.verifyListName'(listName)

CustomKeywords.'com.actions.myAccountActions.ListDetailsActions.clickAddItemsButton'()

CustomKeywords.'com.actions.myAccountActions.ListDetailsActions.writeSearchTerm'(GlobalVariable.Item_Name_For_List)

String[] itemDetails = CustomKeywords.'com.actions.myAccountActions.ListDetailsActions.selectFirstSuggestedItem'()

CustomKeywords.'com.actions.myAccountActions.ListDetailsActions.clickAddItemToListButton'()

CustomKeywords.'com.validations.myAccountValidations.ListDetailsValidations.verifyItemExistsInList'(itemDetails[0])

CustomKeywords.'com.actions.myAccountActions.ListDetailsActions.clickAddListToCartButton'()

CustomKeywords.'customKeywords.Navigations.navigateToCart'()

CustomKeywords.'com.actions.checkoutActions.CartActions.clickCheckoutButton'()

CustomKeywords.'customKeywords.CheckoutKeywords.ShippingStepWithPickUp'( GlobalVariable.Attention, GlobalVariable.ShippingInstructions)

CustomKeywords.'customKeywords.CheckoutKeywords.PaymentStepWithPO'()

CustomKeywords.'customKeywords.CheckoutKeywords.ReviewStep'()

CustomKeywords.'customKeywords.OrderConfirmation.verifyPageTitle'()

String orderNumber = CustomKeywords.'customKeywords.OrderConfirmation.getOrderNumber'()

CustomKeywords.'customKeywords.Navigations.navigateToPage'(GlobalVariable.OrderHistory_URL)

CustomKeywords.'customKeywords.CheckoutKeywords.verifyOrderPlaced'(orderNumber)

CustomKeywords.'customKeywords.BrowserKeywords.closeBrowser'()