package com.actions.basicActions
import org.openqa.selenium.WebElement
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject


import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class BasicActions {

	/***
	 * Click on the given element
	 * @param element
	 * @author Iman Abu Abiah
	 */
	public static void clickElement(TestObject element){
		WebUI.click(element)
	}

	/**
	 * Write the given text to the given element
	 * @param element
	 * @param text
	 * @author khaleel Musleh
	 */
	public static void writeText (TestObject element, String text){
		WebUI.setText(element, text)
	}

	/**
	 * Click on the given index from the given elementList
	 * @param elementList
	 * @param index
	 *  @author khaleel Musleh
	 */
	public static void clickElementAtIndex(TestObject elementList, int index){
		List<WebElement> listOfElements = WebUiCommonHelper.findWebElements(elementList, GlobalVariable.elementTimeOut)
		WebElement targetElement = listOfElements.get(index)
		targetElement.click()
	}

	/**
	 * Check the Checkbox if not checked
	 * @param element
	 *  @author khaleel Musleh
	 */
	public static void checkCheckbox(TestObject element, TestObject checkbox){
		String checked = WebUI.getAttribute(element, 'value')
		if (checked.equalsIgnoreCase('false'))
			clickElement(checkbox)
	}

	/**
	 * Ucheck the Checkbox if checked
	 * @param element
	 *  @author khaleel Musleh
	 */
	public static void unCheckCheckbox(TestObject element, TestObject checkbox){
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
	public static void selectFromDropDownListByLabel(TestObject element, String label){
		WebUI.selectOptionByLabel(element, label, false)
	}

	/**
	 * Select from the drop-down list based on the given index
	 * @param element
	 * @param index
	 *  @author khaleel Musleh
	 */
	public static void selectFromDropDownListByIndex(TestObject element, int index){
		WebUI.selectOptionByIndex(element, index)
	}
	
	/***
	 * Return test object text
	 * @param object the selector represents the set of elements
	 * @return text inside test object
	 * @author Ibrahim Shawahni
	 * @author Anas Salahat
	 */
	public static String getElementText(TestObject object) {
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
	public static String getElementTextAtIndex(TestObject object, int index) {
		List<WebElement> elementsList = WebUiCommonHelper.findWebElements(object, GlobalVariable.ElementsTimeOut)
		WebElement elementAtIndex = elementsList.get(index);
		String itemText = elementAtIndex.getText()
		return itemText
	}
}
