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

WebUI.click(findTestObject('04 - Self-services/04.4 - Tickets/Page_Home page/div_Self services'))

WebUI.waitForElementNotVisible(findTestObject('04 - Self-services/04.4 - Tickets/Page_Home page/div_Loading'), 0)

WebUI.scrollToElement(findTestObject('04 - Self-services/04.4 - Tickets/Page_Home page/scroll_leavetransaction'), 0)

WebUI.scrollToElement(findTestObject('04 - Self-services/04.4 - Tickets/Page_Home page/scroll_My tickets'), 0)

WebUI.click(findTestObject('04 - Self-services/04.4 - Tickets/Page_Home page/scroll_My tickets'))

WebUI.waitForElementNotVisible(findTestObject('04 - Self-services/04.4 - Tickets/Page_Home page/div_Loading'), 0)

WebUI.click(findTestObject('04 - Self-services/04.4 - Tickets/Page_Home page/btn_Create ticket'))

WebUI.click(findTestObject('04 - Self-services/04.4 - Tickets/Page_Home page/a_Submit'))

