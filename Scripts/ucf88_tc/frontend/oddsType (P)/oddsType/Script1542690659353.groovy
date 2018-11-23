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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

CustomKeywords.'mjpack.loginFrontend.getLogin'()

arenaPresent = WebUI.verifyElementPresent(findTestObject('ucf88_or/frontend/oddsType/i_activeArenaAndMatch'), 2)

matchPresent = WebUI.verifyElementPresent(findTestObject('ucf88_or/frontend/oddsType/button_verifyOpenMatch_meronB'), 2, 
    FailureHandling.OPTIONAL)

if (arenaPresent && matchPresent) {
    WebUI.selectOptionByLabel(findTestObject('ucf88_or/frontend/oddsType/select_oddsDrpdwn'), 'Malay', false)

    WebUI.delay(1)

    WebUI.verifyElementText(findTestObject('ucf88_or/frontend/oddsType/button_malayOdds'), '0.95')

    WebUI.delay(1)
} else {
    WebUI.click(findTestObject('ucf88_or/frontend/oddsType/i_activeArenaAndMatch'), FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(1)

    WebUI.selectOptionByLabel(findTestObject('ucf88_or/frontend/oddsType/select_oddsDrpdwn'), 'Malay', false)

    WebUI.delay(1)
}

WebUI.selectOptionByLabel(findTestObject('ucf88_or/frontend/oddsType/select_oddsDrpdwn'), 'Decimal', false)

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('ucf88_or/frontend/oddsType/button_decimalOdds'), '1.95')

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('ucf88_or/frontend/oddsType/select_oddsDrpdwn'), 'Hongkong', false)

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('ucf88_or/frontend/oddsType/button_hongkongOdds'), '0.95')

WebUI.closeBrowser()

