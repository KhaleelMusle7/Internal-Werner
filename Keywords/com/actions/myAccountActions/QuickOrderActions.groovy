package com.actions.myAccountActions
import customKeywords.PLPKeywords
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.actions.basicActions.BasicActions
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
import com.kms.katalon.entity.global.GlobalVariableEntity

import internal.GlobalVariable

public class QuickOrderActions {

	public static void expandQuickOrder() {
		WebUI.mouseOver(findTestObject('Page_QuickOrder/Span_QuickOrderOverlay'))
	}

	public static void addRandomItem() {
		WebUI.click(findTestObject('Object Repository/Page_QuickOrder/Keyword_input'))
		WebUI.setText(findTestObject('Object Repository/Page_QuickOrder/Keyword_input'), GlobalVariable.Search_term)
		//WebUI.waitForElementClickable(findTestObject('Object Repository/Page_QuickOrder/Keyword_input'), GlobalVariable.ElementsTimeOut)
		BasicActions.clickElementAtIndex(findTestObject('Object Repository/Page_QuickOrder/Selected_Item'), 0)
		//WebUI.click(findTestObject('Object Repository/Page_QuickOrder/Keyword_input'))
		//		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_QuickOrder/Keyword_input'))
		//		WebUI.click(findTestObject('Object Repository/Page_QuickOrder/Keyword_input'))
	}

	public static void addToCart() {
		WebUI.click(findTestObject('Object Repository/Page_QuickOrder/addToCart'))
	}
}
