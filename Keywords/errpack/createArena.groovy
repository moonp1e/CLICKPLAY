package errpack

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

import internal.GlobalVariable

public class createArena {
	
	@Keyword
	public createArena() {
		
		WebUI.mouseOver(findTestObject('ucf88_or/backoffice/header_or/span_Betting'))
		
		WebUI.verifyElementPresent(findTestObject('ucf88_or/backoffice/header_or/span_Arena'), 2)
		
		WebUI.click(findTestObject('ucf88_or/backoffice/header_or/span_Arena'))
		
		WebUI.click(findTestObject('ucf88_or/backoffice/createArena_or/button_createArena'))
		
		WebUI.setText(findTestObject('ucf88_or/backoffice/createArena_or/input_arenaName'), NAME)
		
		WebUI.setText(findTestObject('ucf88_or/backoffice/createArena_or/input_eventName'), eventName)
		
		WebUI.setText(findTestObject('ucf88_or/backoffice/createArena_or/input_acronym'), acronym)
		
		WebUI.setText(findTestObject('ucf88_or/backoffice/createArena_or/input_profitMargin'), profitMargin)
		
		WebUI.click(findTestObject('ucf88_or/backoffice/createArena_or/button_submitArena'))
	}
}
