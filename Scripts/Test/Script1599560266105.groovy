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
import org.openqa.selenium.Keys as Keys







WebUI.setText(findTestObject('Checkout/Page_ReviewAndPay/Payment/New_CC/input_CVV'), 
    '123')

WebUI.click(findTestObject('Checkout/Page_ReviewAndPay/Payment/New_CC/label_saveCCInfoCheckbox'))

WebUI.setText(findTestObject('Page_ToReview/input_address1'), 
    'Address')

WebUI.setText(findTestObject('Page_ToReview/input_city'), 'City')

WebUI.selectOptionByValue(findTestObject('Page_ToReview/select_Select StateAlabamaAlaskaAmerican Sa_50aeed'), 
    'object:281', true)

WebUI.setText(findTestObject('Page_ToReview/input_postalCode'), '10167')

