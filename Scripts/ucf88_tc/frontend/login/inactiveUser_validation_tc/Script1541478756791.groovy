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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://dev-operator.ucf88.com/#/')

WebUI.setText(findTestObject('ucf88_or/frontend/login_or/input_username_fe'), 'test.inactiveUser')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('ucf88_or/frontend/login_or/input_password_fe'), 'CSt51UwWECc=')

WebUI.delay(1)

WebUI.click(findTestObject('ucf88_or/frontend/login_or/button_login_fe'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.focus(findTestObject('ucf88_or/frontend/login_or/div_sysMsg'))

WebUI.verifyElementText(findTestObject('ucf88_or/frontend/login_or/div_inactiveTxt'), 'Account is inactive.', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ucf88_or/frontend/login_or/button_closeSysMsg'))

