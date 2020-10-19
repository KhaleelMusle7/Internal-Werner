package com.actions.searchActions
import com.actions.checkoutActions.Checkout_Actions

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

import internal.GlobalVariable

public class SearchActions {

	/**
	 * Search for the given search term
	 * @param searchTerm
	 * @author Iman Abu Abiah
	 */
	public static void searchForProduct (String searchTerm){
		TestObject searchIcon = findTestObject('Page_Search/span_searchIcon')
		BasicActions.clickElement(searchIcon)
		TestObject searchField = findTestObject('Page_Search/input_searchField')
		BasicActions.writeText(searchField, searchTerm)
	}

	/**
	 * Click add to cat button and close the search auto-complete
	 * @author Iman Abu Abiah
	 */
	public static void clickAddToCart (){
		Checkout_Actions.clickAddToCart(findTestObject('Page_Search/button_AddToCart'))
	}

	/***
	 * @author khaleel Musleh
	 */
}
