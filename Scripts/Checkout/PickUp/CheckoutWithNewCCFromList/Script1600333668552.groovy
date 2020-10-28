import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.actions.basicActions.BrowserKeywords.OpenBrowser'()

CustomKeywords.'com.helpers.loginHelpers.LoginHelpers.PerformLogin'(GlobalVariable.userName, GlobalVariable.password)

CustomKeywords.'com.helpers.loginHelpers.ChangeCustomerHelpers.ChangeCustomerByCustomerNumber'(GlobalVariable.Customer_Billto, GlobalVariable.Customer_Shipto)

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

CustomKeywords.'com.actions.checkoutActions.CartActions.clickCheckoutButton'()

CustomKeywords.'customKeywords.CheckoutKeywords.ShippingStepWithPickUp'( GlobalVariable.Attention, GlobalVariable.ShippingInstructions)

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutPaymentHelpers.PaymentStepWithPO'()

CustomKeywords.'com.helpers.checkoutHelpers.CheckoutReviewHelpers.ReviewStep'()

CustomKeywords.'com.actions.checkoutActions.OrderConfirmationActions.verifyPageTitle'()

String orderNumber = CustomKeywords.'com.actions.checkoutActions.OrderConfirmationActions.getOrderNumber'()

CustomKeywords.'com.util.helpers.generalHelpers.Navigations.navigateToPage'(GlobalVariable.OrderHistory_URL)

CustomKeywords.'com.actions.headerActions.SearchActions.searchForOrder'(orderNumber)

CustomKeywords.'com.actions.basicActions.BrowserKeywords.closeBrowser'()