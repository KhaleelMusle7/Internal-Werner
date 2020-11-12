package com.actions.checkoutActions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement as WebElement

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

public class Checkout_Actions {
	/***
	 * @author khaleel Musleh
	 */

	def static clickAddToCart(TestObject addToCartButton) {

		BasicActions.clickElement(addToCartButton)
	}

	def static writeQuantity(TestObject qty_feild, String qty) {
		BasicActions.writeText(qty_feild, qty)
	}

	def static clickRandomAddToCart() {

		List<WebElement> addToCartButtons = WebUiCommonHelper.findWebElements(findTestObject('Page_SRP And PLP/Span_addToCart'),GlobalVariable.elementTimeOut)
		Random rand = new Random();
		int randomButtonIndex ;
		WebElement randomButtonElement = null;
		while({
			randomButtonIndex = rand.nextInt(addToCartButtons.size());
			randomButtonElement = addToCartButtons.get(randomButtonIndex);
		} ()) continue
			TestObject randomButton = WebUI.convertWebElementToTestObject(randomButtonElement)
		WebUI.click(randomButton)
	}
}
