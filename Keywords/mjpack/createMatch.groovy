package mjpack

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.builtin.getCSSValueKeyword

import internal.GlobalVariable

public class createMatch {

	@Keyword
	public createMatch() {

		WebUI.verifyElementPresent(findTestObject('ucf88_or/backoffice/header_or/span_match'), 3)

		WebUI.mouseOver(findTestObject('ucf88_or/backoffice/header_or/span_betting'))

		WebUI.click(findTestObject('ucf88_or/backoffice/header_or/span_match'))

		WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/button_createMatch'))

		WebUI.delay(1)

		WebUI.verifyElementPresent(findTestObject('ucf88_or/backoffice/createMatch_or/text_addMatch'), 3)

		WebUI.delay(1)

		WebUI.selectOptionByLabel(findTestObject('ucf88_or/backoffice/createMatch_or/dropdown_selectArena'), acronym, false)

		WebUI.delay(1)

		WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_name_meron'), meronName)

		WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_name_wala'), walaName)

		WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_farm_meron'), meronFarm)

		WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_farm_wala'), walaFarm)

		WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_breed_meron'), meronBreed)

		WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_breed_wala'), walaBreed)

		WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_weight_meron'), meronWeight)

		WebUI.setText(findTestObject('ucf88_or/backoffice/createMatch_or/input_weight_meron'), walaWeight)

		WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/button_submitMatch'), FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/link_Clickmatch'))

		WebUI.delay(1)

		WebUI.switchToWindowIndex(1)

		WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/button_openMatch'))

		WebUI.delay(1)

		WebUI.waitForElementVisible(findTestObject('ucf88_or/backoffice/createMatch_or/button_agreeOpenMatch'), 3)

		WebUI.click(findTestObject('ucf88_or/backoffice/createMatch_or/button_agreeOpenMatch'))
		
	}
}
