import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.maybank2u.com.my/home/m2u/common/login.do')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/m2u/Page_Maybank2u/input_Humanising Banking_username'), 'mosajgohar1')

WebUI.click(findTestObject('Object Repository/m2u/Page_Maybank2u/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/m2u/Page_Maybank2u/button_YES'))

WebUI.setText(findTestObject('Object Repository/m2u/Page_Maybank2u/input_Hellomosajgohar1_badge'), 'Learning@20')

WebUI.delay(5)

WebUI.click(findTestObject('spy-m2u/Page_Maybank2u/span_LOGOUT'))

WebUI.closeBrowser()

