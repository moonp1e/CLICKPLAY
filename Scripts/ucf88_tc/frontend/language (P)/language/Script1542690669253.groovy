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

CustomKeywords.'mjpack.loginFrontend.getLogin'()

WebUI.verifyElementPresent(findTestObject('ucf88_or/frontend/betting/span_logout'), 3)

WebUI.click(findTestObject('ucf88_or/frontend/language/a_flagDrpdwn'))

WebUI.click(findTestObject('ucf88_or/frontend/language/img_chineseFlag'))

WebUI.verifyElementText(findTestObject('ucf88_or/frontend/language/a_chineseWord'), '结果')

WebUI.click(findTestObject('ucf88_or/frontend/language/a_flagDrpdwn'))

WebUI.click(findTestObject('ucf88_or/frontend/language/img_indonesianFlag'))

WebUI.verifyElementText(findTestObject('ucf88_or/frontend/language/a_indoWord'), 'Hasil')

WebUI.click(findTestObject('ucf88_or/frontend/language/a_flagDrpdwn'))

WebUI.click(findTestObject('ucf88_or/frontend/language/img_thaiFlag'))

WebUI.verifyElementText(findTestObject('ucf88_or/frontend/language/a_ThaiWord'), 'ผล')

WebUI.closeBrowser()

