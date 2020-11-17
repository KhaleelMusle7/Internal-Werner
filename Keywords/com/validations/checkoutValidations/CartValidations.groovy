package com.validations.checkoutValidations
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable


class CartValidations {

	/**
	 * Verifies the cart not have items
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	@Keyword
	def static verifyCartIsEmpty() {
		String emptyCartMessage = WebUI.getText(findTestObject('Checkout/Page_Cart/div_cartMessageBody'))

		String expectedMessage = GlobalVariable.emptyCartMessage

		assert emptyCartMessage.trim() == expectedMessage.trim()
	}

	/***
	 * Verifies if an item with specific SKU and specific quantity exists in the cart
	 * @param SKU the ERP number of the item
	 * @param expectedQuantity the expected quantity value of the item
	 * @return the index of the item starting from 0
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	@Keyword
	def static int verifyItemExistsInCartWithSpecificQuantity(String SKU, String expectedQuantity) {
		List<WebElement> itemsERPNumbers = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Checkout/Page_Cart/span_productSKU'), GlobalVariable.elementTimeOut)
		List<WebElement> itemsQuantityFields = WebUI.findWebElements(findTestObject('Object Repository/Checkout/Page_Cart/input_itemQtyBox'), GlobalVariable.elementTimeOut)
		int itemIndex = -1;
		for (int i = 0; i<itemsERPNumbers.size(); i++) {
			TestObject currentItemNumberObject = WebUI.convertWebElementToTestObject(itemsERPNumbers.get(i))
			TestObject currentItemQuantityObject = WebUI.convertWebElementToTestObject(itemsQuantityFields.get(i))
			String currentItemSKU = BasicActions.getElementText(currentItemNumberObject)
			String currentItemQuantityValue = WebUI.getAttribute(currentItemQuantityObject, "value")

			if(currentItemSKU.equalsIgnoreCase(SKU) && currentItemQuantityValue.equals(expectedQuantity)) {
				assert true == true
				itemIndex = i;
				return itemIndex;
			}
		}
		assert true == false
		return itemIndex
	}

	/***
	 * Verifies if an item with specific SKU exists in the cart
	 * @param SKU the ERP number of the item
	 * @return the index of the item starting from 0
	 * @author Nada Jom'a
	 */
	@Keyword
	def static int verifyItemExistsInCart(String SKU) {
		List<WebElement> itemsERPNumbers = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Checkout/Page_Cart/span_productSKU'), GlobalVariable.elementTimeOut)
		int itemIndex = -1;
		for (int i = 0; i<itemsERPNumbers.size(); i++) {
			TestObject currentItemNumberObject = WebUI.convertWebElementToTestObject(itemsERPNumbers.get(i))
			String currentItemSKU = BasicActions.getElementText(currentItemNumberObject)

			if(currentItemSKU.equalsIgnoreCase(SKU)) {
				assert true == true
				itemIndex = i;
				return itemIndex;
			}
		}
		assert true == false
		return itemIndex
	}
}