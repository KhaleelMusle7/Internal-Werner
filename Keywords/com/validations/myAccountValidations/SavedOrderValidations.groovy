package com.validations.myAccountValidations

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.actions.basicActions.BasicActions
import org.openqa.selenium.WebElement
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
		List<WebElement> itemsERPNumbers = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/Page_SavedOrder/span_itemSKU'), GlobalVariable.elementTimeOut)
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
