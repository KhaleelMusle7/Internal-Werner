package com.validations.myAccountValidations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class SavedOrderValidations {


	/***
	 * Verifies if an item with specific SKU exists in the cart
	 * @param SKU the ERP number of the item
	 * @return the index of the item starting from 0
	 * @author Shurooq Salahat
	 */
	@Keyword
	def static int verifyItemExistsInSavedOrder(String SKU) {
		List<WebElement> itemsERPNumbers = WebUiCommonHelper.findWebElements(findTestObject('My Account/Page_SavedOrder/span_itemSKU'), GlobalVariable.elementTimeOut)
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
