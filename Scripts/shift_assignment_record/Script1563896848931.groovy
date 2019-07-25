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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://as-19.ott.twamb.ca/auth-service/login?proxyParams=response_type%3Dcode%26client_id%3Dtwauth%26scope%3Dread%26state%3DPHFHVuPtn_0_pQv4A7Z6Lk1w6-X6Azg9VKZVa0du_Bk%253D%26redirect_uri%3Dhttps%253A%252F%252Fas-19.ott.twamb.ca%252Fagent-server%252Flogin%252Foauth2%252Fcode%252Ftwauth%253FTWREDIRECT%253Dhttps%25253A%25252F%25252Fas-19.ott.twamb.ca%25252Fagent-server%25252Flaunch%25253Furi%25253Dhttp%25253A%25252F%25252Fthoughtwire.ca%25252Font%25252Fsln%25252F1.0.0%25252Fsmh%25252Fhome&expired_message=Login+session+expired.+Please+try+again&timeout=600000')

WebUI.setText(findTestObject('Object Repository/shifts_record/Page_ThoughtWire/input_Username_username'), 'sbelle')

WebUI.setEncryptedText(findTestObject('Object Repository/shifts_record/Page_ThoughtWire/input_Password_password'), 'WfhbnYCDenevwEefKBoKjA==')

WebUI.sendKeys(findTestObject('Object Repository/shifts_record/Page_ThoughtWire/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - SMH Ambiant Home/a_Shift Assignments'))

WebUI.switchToWindowTitle('ThoughtWire - Centralized Assignments - Code Team Assignments')

WebUI.click(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/div_Nurse  Patient Assignments'))

WebUI.selectOptionByValue(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/select_Select unitCICUCVICUMSICUTNICU2D4B9CS4D6B7CS7CN8CS9CC9CCI14C16CN17C'), 
    'http://building.thoughtwire.ca/zone/10200014', true)

WebUI.click(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/div_Nurse Shift Assignments'))

WebUI.click(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/button_Create New Shift'))

WebUI.click(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/span_Check all'))

WebUI.click(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/a_24'))

WebUI.selectOptionByValue(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/select_DayEveningNight'), 
    'Evening', true)

WebUI.click(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/button_Save Shift'))

WebUI.click(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/button_Create New Shift'))

WebUI.click(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/button_Cancel'))

WebUI.click(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/div_Next Shift Patient Assignments'))

WebUI.selectOptionByValue(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/select_Betty SnowSylvie Belletwire201twire202twire203twire204twire205twire206twire301'), 
    'http://hl7.org/fhir/practitioner/twire201', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/select_-Select Type-Primary NurseCovering Nurse'), 
    'http://thoughtwire.ca/ont/dh/1.0.0/smh/ValueSet/care-team-role/PrimaryNurse', true)

WebUI.click(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/span_Check all'))

WebUI.click(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/span_Save_fa fa-check'))

WebUI.selectOptionByValue(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/select_Betty SnowSylvie Belletwire201twire202twire203twire204twire205twire206twire301'), 
    'http://hl7.org/fhir/practitioner/twire202', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/select_-Select Type-Primary NurseCovering Nurse'), 
    'http://thoughtwire.ca/ont/dh/1.0.0/smh/ValueSet/care-team-role/SecondaryNurse', true)

WebUI.click(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/span_Check all'))

WebUI.click(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/button_Save'))

WebUI.click(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/button_Activate Shift Now'))

WebUI.click(findTestObject('Object Repository/shifts_record/Page_ThoughtWire - Centralized Assignments - Code Team Assignments/button_Yes'))

