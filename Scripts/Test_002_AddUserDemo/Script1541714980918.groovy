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

WebUI.navigateToUrl('https://testingcr-demo.glitch.me/login')

WebUI.click(findTestObject('Page_TestingCR Login Demo/a_Registrarse'))

WebUI.setText(findTestObject('Page_TestingCR Login Demo/input_First Name_firstName'), varName)

WebUI.setText(findTestObject('Page_TestingCR Login Demo/input_Last Name_lastName'), varLast)

WebUI.setText(findTestObject('Page_TestingCR Login Demo/input_Username_username'), varUser)

WebUI.setText(findTestObject('Page_TestingCR Login Demo/input_Password_password'), varPass)

WebUI.takeScreenshot()

if(getText(X)=== "")

WebUI.click(findTestObject('Page_TestingCR Login Demo/button_Registrarse'))

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_TestingCR Login Demo/div_Registration successful'), 0)

WebUI.closeBrowser()

