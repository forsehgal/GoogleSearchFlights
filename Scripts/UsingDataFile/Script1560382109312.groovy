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

//Trip Type
WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/div_Round trip'))

// Choose Multi City
WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/menu-item_Multi-city'))

//Choose Seat Class
WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/div_EconomyPremium EconomyBusinessFirst Class'))

//Choosing Business Class
WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/menu-item_Business'))

//Provide source by clicking in the input and providing it
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/div_Where from Calgary Calgary'))

WebUI.setText(findTestObject('Object Repository/SearchObjects/Page_Flights/input'), From)

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/SearchObjects/Page_Flights/input'), ((Keys.ENTER) as String))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/div_Where to  Where to'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/SearchObjects/Page_Flights/input_4'), MidDes1)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/SearchObjects/Page_Flights/input_5'), ((Keys.ENTER) as String))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/div_Where from TorontoYYZ TorontoYYZ'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/SearchObjects/Page_Flights/input'), MidDes1)

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Object Repository/SearchObjects/Page_Flights/input'), ((Keys.ENTER) as String))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/div_Where to Calgary Calgary'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/SearchObjects/Page_Flights/input_9'), MidDes2)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/SearchObjects/Page_Flights/input_10'), ((Keys.ENTER) as String))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/fill-button_Add Flight'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/div_Where from OttawaYOW OttawaYOW'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/SearchObjects/Page_Flights/input'), MidDes2)

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/SearchObjects/Page_Flights/input'), ((Keys.ENTER) as String))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/div_Where to CalgaryYYC CalgaryYYC'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/SearchObjects/Page_Flights/input_14'), From)

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/SearchObjects/Page_Flights/input_15'), ((Keys.ENTER) as String))

WebUI.delay(10)

//Provide Dates from the Calender
WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/div_Departure date Fri 28 Jun Fri 28 Jun'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/calendar-day_16'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/calendar-day_22'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/SearchObjects/Page_Flights/calendar-day_29'))

WebUI.delay(5)

//Check if flights found or not
if (WebUI.verifyElementPresent(findTestObject('Object Repository/SearchObjects/Page_Flights/span_Best flights'), 5, FailureHandling.CONTINUE_ON_FAILURE)) {
    println('Flights available as listed')
} else {
    WebUI.comment('No Flights available')
}