import com.actions.myAccountActions.MyListsActions

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

String[] itemDetails = CustomKeywords.'com.actions.myAccountActions.ListDetailsActions.selectSuggestedItemAtIndex'(4)

/*

String[] itemDetails = ListDetailsActions.selectFirstSuggestedItem()

ListDetailsActions.clickAddItemToListButton()

ListDetailsValidation.verifyItemExistsInList(itemDetails[0])

ListDetailsActions.clickAddListToCartButton()

BradyCommonFunctions.waitToastModalToDisplay()

Navigations.navigateToCartPage()

CommonHelpers.closeBrowser()*/