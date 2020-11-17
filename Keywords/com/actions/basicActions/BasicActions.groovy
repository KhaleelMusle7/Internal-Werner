package com.actions.basicActions
import org.openqa.selenium.WebElement

import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class BasicActions {

	/***
	 * Click on the given element
	 * @param element
	 * @author Khaleel Musleh
	 */
	def static  clickElement(TestObject element){
		WebUI.click(element)
	}

	/***
	 * Scroll to given Element
	 * @param element
	 * @author Shurooq Salahat
	 */
	def static  scrollToElement(TestObject element){
		WebUI.scrollToElement(element, 0)
	}

	/**
	 * Write the given text to the given element
	 * @param element
	 * @param text
	 * @author khaleel Musleh
	 */
	def static  writeText (TestObject element, String text){
		WebUI.setText(element, text)
	}

	/**
	 * Click on the given index from the given elementList
	 * @param elementList
	 * @param index
	 *  @author khaleel Musleh
	 */
	def static  clickElementAtIndex(TestObject elementList, int index){
		List<WebElement> listOfElements = WebUiCommonHelper.findWebElements(elementList, GlobalVariable.elementTimeOut)
		WebElement targetElement = listOfElements.get(index)
		targetElement.click()
	}

	/**
	 * Check the Checkbox if not checked
	 * @param element
	 *  @author khaleel Musleh
	 */
	def static  checkCheckbox(TestObject element, TestObject checkbox){
		String checked = WebUI.getAttribute(element, 'value')
		if (checked.equalsIgnoreCase('false'))
			clickElement(checkbox)
	}

	/**
	 * Ucheck the Checkbox if checked
	 * @param element
	 *  @author khaleel Musleh
	 */
	def static  unCheckCheckbox(TestObject element, TestObject checkbox){
		String checked = WebUI.getAttribute(element, 'value')
		if (checked.equalsIgnoreCase('true'))
			clickElement(checkbox)
	}

	/**
	 * Select from the drop-down list based on the given label
	 * @param element
	 * @param label
	 *  @author khaleel Musleh
	 */
	def static selectFromDropDownListByLabel(TestObject element, String label){
		WebUI.selectOptionByLabel(element, label, false)
	}

	/**
	 * Select from the drop-down list based on the given index
	 * @param element
	 * @param index
	 *  @author khaleel Musleh
	 */
	def static selectFromDropDownListByIndex(TestObject element, int index){
		WebUI.selectOptionByIndex(element, index)
	}

	/***
	 * Return test object text
	 * @param object the selector represents the set of elements
	 * @return text inside test object
	 * @author Anas Salahat
	 */
	def static String getElementText(TestObject object) {
		return WebUI.getText(object).trim()
	}

	/***
	 * Return element text from list of elements based on index
	 * @param obj the selector represents the set of elements
	 * @param index the order of the item
	 * @return text inside test object at specific list index
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	def static String getElementTextAtIndex(TestObject object, int index) {
		List<WebElement> elementsList = WebUiCommonHelper.findWebElements(object, GlobalVariable.elementTimeOut)
		WebElement elementAtIndex = elementsList.get(index);
		String itemText = elementAtIndex.getText()
		return itemText
	}

	/***
	 * Check if element present in the page
	 * @param object - the target element to check if present or not
	 * @return boolean - true if the element present and false if the element no present in the page
	 * @author Nada Joma
	 * @author Anas Salahat
	 */
	def static boolean isElementPresent(TestObject object) {
		try {
			if(WebUI.verifyElementPresent(object, GlobalVariable.Elements_Absence_TimeOut, FailureHandling.OPTIONAL)) {
				return true
			}
		} catch (WebElementNotFoundException e) {
			return false;
		} catch (StepFailedException e) {
			return false;
		}
	}

	/***
	 * for navigate to any page
	 * @author khaleel Musleh
	 */
	def static navigateToURL(String Url){
		WebUI.navigateToUrl(Url);
	}

	/***
	 * Clicks on a random element from a set of elements with the same selector
	 * @param obj the selector represents the set of elements
	 */
	def static  clickRandomElement(TestObject obj) {
		List<WebElement> elementsList = WebUiCommonHelper.findWebElements(obj, GlobalVariable.elementTimeOut)

		Random rand = new Random();
		int randomButtonIndex ;
		WebElement randomButtonElement = null;

		randomButtonIndex = rand.nextInt(elementsList.size());
		randomButtonElement = elementsList.get(randomButtonIndex);

		TestObject randomButton = WebUI.convertWebElementToTestObject(randomButtonElement)
		WebUI.click(randomButton)

		return randomButtonIndex
	}
}
