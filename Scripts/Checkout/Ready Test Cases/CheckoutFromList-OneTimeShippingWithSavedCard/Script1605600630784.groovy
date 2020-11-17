import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.actions.basicActions.BrowserKeywords.OpenBrowser'()

CustomKeywords.'com.helpers.loginHelpers.LoginHelpers.PerformLogin'(GlobalVariable.userName, GlobalVariable.password)

CustomKeywords.'com.helpers.loginHelpers.ChangeCustomerHelpers.ChangeCustomer'()

CustomKeywords.'com.actions.checkoutActions.CartActions.clearCart'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToPage'(GlobalVariable.MyLists_URL)

String listName = CustomKeywords.'com.helpers.myAccountHelpers.MyListsHelpers.createNewListWithRandomNameAndDescription'()

CustomKeywords.'com.actions.myAccountActions.MyListsActions.navigateToListByName'(listName)

CustomKeywords.'com.validations.myAccountValidations.ListDetailsValidations.verifyListName'(listName)

CustomKeywords.'com.actions.myAccountActions.ListDetailsActions.clickAddItemsButton'()

CustomKeywords.'com.actions.myAccountActions.ListDetailsActions.writeSearchTerm'(GlobalVariable.Item_Name_For_List)

String[] itemDetails = CustomKeywords.'com.actions.myAccountActions.ListDetailsActions.selectFirstSuggestedItem'()

CustomKeywords.'com.actions.myAccountActions.ListDetailsActions.clickAddItemToListButton'()

CustomKeywords.'com.validations.myAccountValidations.ListDetailsValidations.verifyItemExistsInList'(itemDetails[0])

CustomKeywords.'com.actions.myAccountActions.ListDetailsActions.clickAddListToCartButton'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToCart'()

CustomKeywords.'com.validations.checkoutValidations.CartValidations.verifyItemExistsInCart'(itemDetails[1])

CustomKeywords.'com.actions.checkoutActions.CartActions.clickCheckoutButton'()

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutAddressesHelpers.AddressesStepWithOneTimeShippingAddress'()

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutShippingHelpers.ShippingStep'(GlobalVariable.shipWhenAvailble, GlobalVariable.Attention, 
    GlobalVariable.ShippingInstructions)

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutPaymentHelpers.PaymentStepWithSavedCC'()

CustomKeywords.'com.actions.checkoutActions.ReviewActions.clickSubmitOrder'()

CustomKeywords.'com.actions.checkoutActions.OrderConfirmationActions.verifyPageTitle'()

String orderNumber = CustomKeywords.'com.actions.checkoutActions.OrderConfirmationActions.getOrderNumber'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToPage'(GlobalVariable.OrderHistory_URL)

CustomKeywords.'com.actions.myAccountActions.OrderHistoryActions.searchOrderByOrderNumber'(orderNumber)

CustomKeywords.'com.validations.myAccountValidations.OrderHistoryValidations.verifyOrderHistoryHasItems'()

CustomKeywords.'com.actions.myAccountActions.OrderHistoryActions.clickOrderNumber'()

CustomKeywords.'com.validations.myAccountValidations.OrderDetailsValidations.verifyCurrentOrderNumber'(orderNumber)

CustomKeywords.'com.validations.myAccountValidations.OrderDetailsValidations.verifyItemExistsInPage'(itemDetails[1])

CustomKeywords.'com.actions.basicActions.BrowserKeywords.closeBrowser'()