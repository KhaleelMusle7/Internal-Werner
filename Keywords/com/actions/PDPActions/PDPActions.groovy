package com.actions.PDPActions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.actions.basicActions.GlobalActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject

public class PDPActions {

	/***
	 * Fill the quantity field and clicks on add to cart button
	 * @param quantityValue The quantity value for the product will be added to cart
	 * @return the SKU value for the product added to the cart
	 * @author Anas Salahat
	 */
	@Keyword
	def static String clickAddToCartWithQuantity(String quantityValue){

		TestObject addToCartButton = findTestObject('Page_PDP/button_addToCart')
		TestObject quantityField = findTestObject('Page_PDP/input_quantity')
		TestObject itemSKUObject = findTestObject('Page_PDP/span_itemSKU')
		String itemSKUText = BasicActions.getElementText(itemSKUObject)

		BasicActions.writeText(quantityField, quantityValue)
		BasicActions.clickElement(addToCartButton)
		GlobalActions.waitToastMessageToDisplay()
		return itemSKUText
	}
}
