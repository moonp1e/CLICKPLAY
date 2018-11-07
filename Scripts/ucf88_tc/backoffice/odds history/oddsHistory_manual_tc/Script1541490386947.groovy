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

WebUI.click(findTestObject('ucf88_or/backoffice/header_or/span_oddHistory'))

WebUI.click(findTestObject('ucf88_or/backoffice/riskMangement_or/Page_ucf88/span_increaseOdds'))

WebUI.mouseOver(findTestObject('ucf88_or/backoffice/header_or/span_Betting'))

WebUI.click(findTestObject('ucf88_or/backoffice/header_or/span_oddHistory'))

WebUI.selectOptionByLabel(findTestObject('ucf88_or/backoffice/oddsHistory_or/span_selectArena'), ArenaName, false)

WebUI.selectOptionByLabel(findTestObject('ucf88_or/backoffice/oddsHistory_or/span_selectMatch'), EventName, false)

WebUI.click(findTestObject('ucf88_or/backoffice/oddsHistory_or/click_search'))

WebUI.verifyElementText(findTestObject('ucf88_or/backoffice/oddsHistory_or/span_verifyArenaName'), ArenaName)

WebUI.verifyElementText(findTestObject('ucf88_or/backoffice/oddsHistory_or/oddsNew_meron'), '0.96')

WebUI.verifyElementText(findTestObject('ucf88_or/backoffice/oddsHistory_or/oddsNew_wala'), '0.94')

