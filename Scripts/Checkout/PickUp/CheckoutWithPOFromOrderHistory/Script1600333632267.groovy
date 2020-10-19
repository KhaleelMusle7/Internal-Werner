import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'customKeywords.BrowserKeywords.OpenBrowser'()

CustomKeywords.'customKeywords.LoginKeywords.PerformLogin'(GlobalVariable.userName, GlobalVariable.password)

//CustomKeywords.'customKeywords.Actions.SelectFulfillmentMethod'('pickup')
//CustomKeywords.'customKeywords.Actions.SelectFulfillmentMethod'('Delivery')
//CustomKeywords.'customKeywords.Actions.ChangeCustomer'()
CustomKeywords.'customKeywords.SearchKeywords.PerformSearch'('shirt')

CustomKeywords.'customKeywords.SearchKeywords.AddToCartFromSearch'()

CustomKeywords.'customKeywords.Navigations.NavigateToAddressesInCheckout'()

CustomKeywords.'customKeywords.CheckoutKeywords.AddressesStepWithPickUpAddress'()

CustomKeywords.'customKeywords.CheckoutKeywords.ShippingStep'('complete', 'AttentionAuto', 'ShippingInstructionsAuto')

CustomKeywords.'customKeywords.CheckoutKeywords.PaymentStepWithPO'()

CustomKeywords.'customKeywords.CheckoutKeywords.ReviewStep'()

WebUI.closeBrowser()

