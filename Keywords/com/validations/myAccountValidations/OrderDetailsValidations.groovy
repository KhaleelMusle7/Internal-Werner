package com.validations.myAccountValidations

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.actions.basicActions.BasicActions
import com.actions.myAccountActions.OrderDetailsActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class OrderDetailsValidations {

	/***
	 * Verifies if the provided ERP order number matches the ERP order number of the order
	 * @param expectedOrderNumber
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	@Keyword
	def static verifyCurrentOrderNumber(String expectedOrderNumber) {
		String actualOrderNumber = OrderDetailsActions.getOrderNumber()
		assert actualOrderNumber.trim().endsWith(expectedOrderNumber.trim())
	}

	/***
	 * Verifies if the provided PO number matches the PO number of the order
	 * @param expectedPONumber
	 * @author Anas Salahat
	 */
	@Keyword
	def static verifyCurrentPONumber(String expectedPONumber) {
		String actualPONumber = OrderDetailsActions.getPONumber()
		assert actualPONumber.trim().endsWith(expectedPONumber.trim())
	}
	
	/***
	 * Verifies if an item with specific ERP number exists in order details page
	 * @param SKU the ERP number of the item
	 * @return the index of the item starting from 0
	 * @author Anas Salahat
	 */
	@Keyword
	public static int verifyItemExistsInPage(String SKU) {
		TestObject itemSKUObject = findTestObject('Object Repository/My Account/Page_Order Details/span_itemSKU')
		List<WebElement> itemsERPNumbers = WebUiCommonHelper.findWebElements(itemSKUObject, GlobalVariable.elementTimeOut)
		int itemIndex = -1;
		for (int i = 0; i<itemsERPNumbers.size(); i++) {
			TestObject currentItemNumberObject = WebUI.convertWebElementToTestObject(itemsERPNumbers.get(i))
			String itemSKU = BasicActions.getElementText(currentItemNumberObject);
			if(itemSKU.equalsIgnoreCase(SKU)) {
				assert true == true
				itemIndex = i;
				return itemIndex;
			}
		}
		assert true == false
		return itemIndex
	}
}
