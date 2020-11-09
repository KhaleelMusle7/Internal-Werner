package com.actions.PLPActions
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.actions.basicActions.GlobalActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class PLPActions {

	@Keyword
	def clickRandomitem(TestObject randomItem) {

		WebUI.verifyElementVisible(findTestObject(randomItem))
		List<WebElement> addToCartButtons = WebUiCommonHelper.findWebElements(findTestObject(randomItem),GlobalVariable.ElementsTimeOut)
		Random rand = new Random();
		int randomButtonIndex ;

		WebElement randomButtonElement = null;

		while({
			randomButtonIndex = rand.nextInt(addToCartButtons.size());
			randomButtonElement = addToCartButtons.get(randomButtonIndex);

			randomButtonElement.getAttribute("disabled") == "disabled"
		}()) continue

			TestObject randomButton = WebUI.convertWebElementToTestObject(randomButtonElement)


		WebUI.click(randomButton)
	}

	@Keyword
	def AddToCartFromPLP () {

		List<WebElement> addToCartButtons = WebUiCommonHelper.findWebElements(findTestObject('Page_SRP And PLP/Span_addToCart'),GlobalVariable.ElementsTimeOut)
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
	
	/***
	 * Clicks on Add To Cart button for random product with fill quantity value for this product where this product can be added to the cart
	 * @param quantityValue The quantity value for the product will be added to cart
	 * @return the SKU value for the product added to the cart
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	@Keyword
	def static String clickRandomAddToCartWithQuantity(String quantityValue) {

		TestObject productContainerTestObject = findTestObject('Object Repository/Page_SRP And PLP/li_productContainer');
		WebUI.verifyElementVisible(productContainerTestObject)
		List<WebElement> productContainersList =  WebUiCommonHelper.findWebElements(productContainerTestObject, GlobalVariable.ElementsTimeOut)


		List<WebElement> availbleAddToCartProducts = new ArrayList<WebElement>()

		for(WebElement productContainer: productContainersList) {
			if(productContainer.findElements(By.cssSelector(".xng-add-to-cart-wrapper .xng-add-to-cart-btn")).size() > 0) {
				availbleAddToCartProducts.add(productContainer)
			}
		}

		if(availbleAddToCartProducts.size() > 0) {
			Random rand = new Random();

			int randomProductContainerIndex = rand.nextInt(availbleAddToCartProducts.size());

			WebElement randomProductContainerElement = availbleAddToCartProducts.get(randomProductContainerIndex);

			WebElement itemSKUObject = randomProductContainerElement.findElement(By.cssSelector(".item-num-sku > span"))
			String itemSKUText = itemSKUObject.getText()

			WebElement itemQtyBox = randomProductContainerElement.findElement(By.cssSelector(".product-qty >input"))
			itemQtyBox.clear()
			itemQtyBox.sendKeys(quantityValue)

			WebElement addToCartButton = randomProductContainerElement.findElement(By.cssSelector(".xng-add-to-cart-wrapper .xng-add-to-cart-btn"))
			addToCartButton.click()

			GlobalActions.WaitForLoaderToFinish()
			GlobalActions.waitToastMessageToDisplay()

			return itemSKUText
		} else {
			assert true == false
			return ""
		}
	}

	/***
	 * Clicks on Add To Cart button for random product where this product can be added to the cart
	 * @return the SKU value for the product added to the cart
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	public static String clickRandomAddToCart() {
		return clickRandomAddToCartWithQuantity("1")
	}
}
