import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('01 - Login/TC01 - Login'), [:], FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'event.addTask.addNewTask'()

/*WebUI.click(findTestObject('03 - Dashboard/3.1 - Event/Page_Home page/btn_AddNewEvent'))

WebUI.verifyElementPresent(findTestObject('03 - Dashboard/3.1 - Event/Task/Page_Home page/input_Event_task'), 0)

WebUI.click(findTestObject('03 - Dashboard/3.1 - Event/Task/Page_Home page/input_Event_task'))

WebUI.click(findTestObject('03 - Dashboard/3.1 - Event/Task/Page_Home page/input_Subject_subject'))*/

WebUI.setText(findTestObject('03 - Dashboard/3.1 - Event/Task/Page_Home page/input_Subject_subject'), 'test')

WebUI.click(findTestObject('03 - Dashboard/3.1 - Event/Task/Page_Home page/input_Due on_date_selectedEndDate'))

WebUI.click(findTestObject('03 - Dashboard/3.1 - Event/Task/Page_Home page/Due_29'))

WebUI.click(findTestObject('03 - Dashboard/3.1 - Event/Page_Home page/a_Save'))

