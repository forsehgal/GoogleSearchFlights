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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

WebUI.openBrowser('')

//Open the Url
WebUI.navigateToUrl('https://www.google.com/flights')

//Provide destination by clicking in the input and providing it
WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/div_Where to  Try Florida'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/SearchObjects/Page_Flights/input'), To)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/SearchObjects/Page_Flights/input'), ((Keys.ENTER) as String))

WebUI.delay(3)

//Provide Dates from the Calender
WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/div_Departure date'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/calendar-day_16'))

WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/div_S_gws-travel-calendar__flipper gws-travel-calendar__next'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/calendar-day_31'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/div_Done'))

//Verify if flights found
if (WebUI.verifyElementPresent(findTestObject('SearchObjects/Page_Flights/span_Best departing flights'), 5, FailureHandling.CONTINUE_ON_FAILURE)) {
    println('Flights available as listed')
} else {
    WebUI.comment('No Flights available')

    WebUI.click(findTestObject('SearchObjects/Page_Flights/floating-action-button_Search (1)'))
}