package featureComment
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class commentFeature {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I want to navigate to dashboard")
	def I_want_to_navigate_to_dashboard() {
		WebUI.callTestCase(findTestCase('01 - Login/TC01 - Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("I input (.*) for user")
	def I_input_comment_for_user(String comment) {
		WebUI.setText(findTestObject('Object Repository/03 - Dashboard/3.2 - Feed/Page_Home page/input_Comment'), comment)
	}
	
	@And("I click on send button")
	def I_click_on_send_button() {
		WebUI.click(findTestObject('03 - Dashboard/3.2 - Feed/Page_Home page/btn_SendComment'))
	}
	
	@And("I click on list of comment button")
	def I_click_on_list_of_comment_button() {
		WebUI.click(findTestObject('03 - Dashboard/3.2 - Feed/Page_Home page/btn_CommentList'))
	}

	@Then("I verify the comment in the list")
	def I_verify_the_comment_in_the_list() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/03 - Dashboard/3.2 - Feed/Page_Home page/appear_listComment'), 
    0)
	}
}