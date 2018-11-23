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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

CustomKeywords.'mjpack.loginFrontend.getLogin'()

WebUI.verifyElementPresent(findTestObject('ucf88_or/frontend/betting/span_logout'), 2)

WebUI.delay(2)

tempBalance = WebUI.getText(findTestObject('ucf88_or/frontend/betting/span_balance'), FailureHandling.CONTINUE_ON_FAILURE)

balance = tempBalance.replace(',', '')

float balance = Float.valueOf(balance)

arenaPresent = WebUI.verifyElementPresent(findTestObject('ucf88_or/frontend/betting/button_arena'), 1)

matchPresent = WebUI.verifyElementPresent(findTestObject('ucf88_or/frontend/betting/Page_UCF/Page_UCF/strong_A1 - Fight 1'), 
    1, FailureHandling.OPTIONAL)

if (((balance > 100) && arenaPresent) && matchPresent) {
    WebUI.click(findTestObject('ucf88_or/frontend/betting/button_placeOdds'))

    WebUI.sendKeys(findTestObject('ucf88_or/frontend/betting/input_betField'), Keys.chord(Keys.CONTROL, 'a'))

    WebUI.setText(findTestObject('ucf88_or/frontend/betting/input_betField'), '1000')

    WebUI.sendKeys(findTestObject('ucf88_or/frontend/betting/input_betField'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('ucf88_or/frontend/betting/button_betButton'))
} else {
    WebUI.click(findTestObject('ucf88_or/frontend/betting/button_arena'))

    WebUI.click(findTestObject('ucf88_or/frontend/betting/button_placeOdds'))

    WebUI.click(findTestObject('ucf88_or/frontend/betting/button_placeOdds'))

    WebUI.sendKeys(findTestObject('ucf88_or/frontend/betting/input_betField'), Keys.chord(Keys.CONTROL, 'a'))

    WebUI.setText(findTestObject('ucf88_or/frontend/betting/input_betField'), '1000')

    WebUI.sendKeys(findTestObject('ucf88_or/frontend/betting/input_betField'), Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('ucf88_or/frontend/betting/button_betButton'))
}

WebUI.selectOptionByValue(findTestObject(null), '', false)

