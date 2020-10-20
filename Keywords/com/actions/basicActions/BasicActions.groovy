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

	
}
