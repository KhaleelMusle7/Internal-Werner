package com.actions.myAccountActions
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.actions.basicActions.BasicActions
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class OrderApprovalActions {
	/***
	 * Expands search order widget
	 * @author Anas Salahat
	 */
	@Keyword
	def static expandSearchOrdersWidget() {
		TestObject searchOrderWidget = findTestObject("My Account/Page_Order Approval/label_Expand Search Widget")
		BasicActions.clickElement(searchOrderWidget)
	}

	/***
	 * Writes Order Number into the search field
	 * @param orderNumber
	 * @author Anas Salahat
	 */
	@Keyword
	def static writeOrderNumber(String orderNumber) {
		TestObject orderNumberField = findTestObject('My Account/Page_Order Approval/input_Order Number Field')
		BasicActions.writeText(orderNumberField, orderNumber)
	}

	/***
	 * Clicks Search button
	 * @author Anas Salahat
	 */
	@Keyword
	def static clickSearchButton() {
		TestObject searchButton = findTestObject('My Account/Page_Order Approval/button_Search Order')
		BasicActions.clickElement(searchButton)
	}

	/***
	 * Clicks on first order number link in order approval table
	 * @author Anas Salahat
	 */
	@Keyword
	def static clickOrderNumberLink() {
		TestObject orderNumberLink = findTestObject('Object Repository/My Account/Page_Order Approval/a_Order Number')
		BasicActions.clickElement(orderNumberLink)
	}
}