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

WebUI.navigateToUrl('http://dev-admin.ucf88.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('ucf88_or/backoffice/login_or/input_username'), 'admin')

WebUI.setEncryptedText(findTestObject('ucf88_or/backoffice/login_or/input_password'), 'SFTQUhjBfIY=')

WebUI.click(findTestObject('ucf88_or/backoffice/login_or/button_Login'))

WebUI.mouseOver(findTestObject('ucf88_or/backoffice/header_or/span_Betting'))

WebUI.verifyElementPresent(findTestObject('ucf88_or/backoffice/header_or/span_Arena'), 2)

WebUI.click(findTestObject('ucf88_or/backoffice/header_or/span_Arena'))

WebUI.verifyElementPresent(findTestObject('ucf88_or/backoffice/createArena_or/button_createArena'), 2)

WebUI.click(findTestObject('ucf88_or/backoffice/createArena_or/button_createArena'))

WebUI.verifyElementPresent(findTestObject('ucf88_or/backoffice/header_or/h5_Add Arena'), 2)

WebUI.setText(findTestObject('ucf88_or/backoffice/createArena_or/input_arenaName'), arenaName)

WebUI.setText(findTestObject('ucf88_or/backoffice/createArena_or/input_eventName'), eventName)

WebUI.setText(findTestObject('ucf88_or/backoffice/createArena_or/input_acronym'), acronym)

WebUI.setText(findTestObject('ucf88_or/backoffice/createArena_or/input_profitMargin'), profitMargin)

Thread.sleep(3000)

