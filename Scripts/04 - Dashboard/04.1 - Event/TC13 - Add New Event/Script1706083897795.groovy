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

CustomKeywords.'event.addEvent.addNewEvent'()

/*WebUI.click(findTestObject('03 - Dashboard/3.1 - Event/Page_Home page/btn_AddNewEvent'))

WebUI.setText(findTestObject('03 - Dashboard/3.1 - Event/Page_Home page/input_Subject'), 'test')

WebUI.setText(findTestObject('03 - Dashboard/3.1 - Event/Page_Home page/input_Location'), 'test')

WebUI.click(findTestObject('03 - Dashboard/3.1 - Event/Page_Home page/input_startTime'))

WebUI.click(findTestObject('03 - Dashboard/3.1 - Event/Page_Home page/div_0100'))

WebUI.click(findTestObject('03 - Dashboard/3.1 - Event/Page_Home page/select_Location - Copy'))*/

WebUI.verifyElementPresent(findTestObject('03 - Dashboard/3.1 - Event/Page_Home page/a_Save'), 0)

WebUI.click(findTestObject('03 - Dashboard/3.1 - Event/Page_Home page/a_Save'))

