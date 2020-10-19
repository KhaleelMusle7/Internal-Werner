package customKeywords
import com.kms.katalon.core.annotation.Keyword

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class PLPKeywords {

	/*	@Keyword
	 AddToCartFromPLP (){
	 PLP_Actions.clickRandomAddToCart()
	 }*/


	@Keyword
	AddToCartFromPLP () {

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
	
	@Keyword
    clickRandomAddToCart() {
		
				WebUI.verifyElementVisible(findTestObject('Object Repository/Page_PLP/Span_addToCart'))
				List<WebElement> addToCartButtons = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Page_PLP/Span_addToCart'),GlobalVariable.ElementsTimeOut)
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
	
}
