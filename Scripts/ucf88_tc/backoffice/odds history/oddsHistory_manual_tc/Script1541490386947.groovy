import org.openqa.selenium.Keys as Keys
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

//CustomKeywords.'errpack.loginBackoffice.getLogin'()

WebUI.mouseOver(findTestObject('ucf88_or/backoffice/header_or/span_Betting'))

WebUI.delay(1)

WebUI.click(findTestObject('ucf88_or/backoffice/header_or/span_oddHistory'))

WebUI.delay(1)

WebUI.click(findTestObject('ucf88_or/backoffice/oddsHistory_or/span_selectArena '))

WebUI.delay(1)

WebUI.setText(findTestObject('ucf88_or/backoffice/oddsHistory_or/input_arenaName'), ArenaName_Acronym)

WebUI.delay(1)

WebUI.sendKeys(findTestObject('ucf88_or/backoffice/oddsHistory_or/input_arenaName'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('ucf88_or/backoffice/oddsHistory_or/span_selectMatch'))

WebUI.delay(1)

WebUI.setText(findTestObject('ucf88_or/backoffice/oddsHistory_or/input_arenaName'), EventName)

WebUI.delay(1)

WebUI.sendKeys(findTestObject('ucf88_or/backoffice/oddsHistory_or/input_arenaName'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('ucf88_or/backoffice/oddsHistory_or/click_search'))

WebUI.delay(1)

WebUI.verifyTextPresent(ArenaName_Acronym, false)

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('ucf88_or/backoffice/oddsHistory_or/oddsNew_meron'), '0.96')

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('ucf88_or/backoffice/oddsHistory_or/oddsNew_wala'), '0.94')

