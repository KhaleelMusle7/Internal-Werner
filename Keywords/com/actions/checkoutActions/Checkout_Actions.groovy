package com.actions.checkoutActions
import org.openqa.selenium.WebElement as WebElement
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.actions.basicActions.BasicActions
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

public class Checkout_Actions {
	/***
	 * @author khaleel Musleh
	 */

	public static void clickAddToCart(TestObject addToCartButton) {

		BasicActions.clickElement(addToCartButton)
	}
	public static void writeQuantity(TestObject qty_feild, String qty) {
		BasicActions.writeText(qty_feild, qty)
	}

	public static void clickRandomAddToCart() {

		List<WebElement> addToCartButtons = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Page_PLP/Span_addToCart'),GlobalVariable.ElementsTimeOut)
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
