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

CustomKeywords.'errpack.loginBackoffice.getLogin'()

WebUI.verifyElementPresent(findTestObject('ucf88_or/backoffice/header_or/span_Match'), 3)

WebUI.mouseOver(findTestObject('ucf88_or/backoffice/header_or/span_Betting'))

WebUI.click(findTestObject('ucf88_or/backoffice/header_or/span_Match'))

WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/button_createMatch'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('ucf88_or/backoffice/createMatch_or/text_addMatch'), 3)

WebUI.delay(1)

WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/dropdown_selectArena'))

//WebUI.selectOptionByLabel(findTestObject('ucf88_or/backoffice/createMatch_or/drpdwnContent_selectArena'), ArenaName_Acronym, 
//    false)
WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_selectArena'), 'Arena_Test - A1')

WebUI.sendKeys(findTestObject('ucf88_or/backoffice/createMatch_or/input_selectArena'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_name_meron'), MeronName)

WebUI.delay(1)

WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_name_wala'), WalaName)

WebUI.delay(1)

WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_farm_meron'), MeronFarm)

WebUI.delay(1)

WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/Page_Match Management - ucf88/input_farm_wala'), WalaFarm)

WebUI.delay(1)

WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/Page_Match Management - ucf88/input_breed_meron'), MeronBreed)

WebUI.delay(1)

WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/Page_Match Management - ucf88/input_breed_wala'), WalaBreed)

WebUI.delay(1)

WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/Page_Match Management - ucf88/input_weight_meron'), MeronWeight)

WebUI.delay(1)

WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/Page_Match Management - ucf88/input_weight_wala'), WalaWeight)

WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/button_submitMatch'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/link_Clickmatch'))

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/button_openMatch'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('ucf88_or/backoffice/createMatch_or/button_agreeOpenMatch'), 3)

WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/button_agreeOpenMatch'))

WebUI.delay(2)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

