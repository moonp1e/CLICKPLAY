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

WebUI.mouseOver(findTestObject('ucf88_or/backoffice/header_or/span_Betting'))

WebUI.verifyElementPresent(findTestObject('ucf88_or/backoffice/header_or/span_Match'), 3)

WebUI.click(findTestObject('ucf88_or/backoffice/header_or/span_Match'))

WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/button_createMatch'))

WebUI.verifyElementPresent(findTestObject('ucf88_or/backoffice/createMatch_or/text_addMatch'), 3)

WebUI.selectOptionByLabel(findTestObject('ucf88_or/backoffice/createMatch_or/dropdown_selectArena'), acronym, false)

WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_meronName'), meronName)

WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_walaName'), walaName)

WebUI.waitForElementVisible(findTestObject('ucf88_or/backoffice/createMatch_or/link_newMatch_Clickhere'), 3)

WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/button_submitMatch'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/button_openMatch'))

WebUI.waitForElementVisible(findTestObject('ucf88_or/backoffice/createMatch_or/button_agreeOpenMatch'), 3)

WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/button_agreeOpenMatch'))

WebUI.delay(2)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

Thread.sleep(3000)

