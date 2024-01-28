package event

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
@Keyword
public class addEvent {

	public void addNewEvent() {

		WebUI.click(findTestObject('03 - Dashboard/3.1 - Event/Page_Home page/btn_AddNewEvent'))

		WebUI.setText(findTestObject('03 - Dashboard/3.1 - Event/Page_Home page/input_Subject'), 'test')

		WebUI.setText(findTestObject('03 - Dashboard/3.1 - Event/Page_Home page/input_Location'), 'test')

		WebUI.click(findTestObject('03 - Dashboard/3.1 - Event/Page_Home page/input_startTime'))

		WebUI.click(findTestObject('03 - Dashboard/3.1 - Event/Page_Home page/div_0100'))

		WebUI.click(findTestObject('03 - Dashboard/3.1 - Event/Page_Home page/select_Location - Copy'))
	}
}
