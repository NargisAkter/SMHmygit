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

//WebUI.navigateToUrl('https://as-19.ott.twamb.ca/agent-server/launch?uri=http://thoughtwire.ca/ont/sln/1.0.0/smh/home')

WebUI.navigateToUrl('https://as-19.ott.twamb.ca/agent-server/launch?uri=http://thoughtwire.ca/ont/sln/ca')
WebUI.setText(findTestObject('Object Repository/LoginPage/input_User name_username'),
	'sbelle')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/input_Password_password'),
	'WfhbnYCDenevwEefKBoKjA==')

WebUI.click(findTestObject('Object Repository/LoginPage/input_Password_twLogin_button'))
WebUI.delay(20)
//WebUI.click(findTestObject('Object Repository/shift_assignment/shift_assignment_link_home_page'))
WebUI.click(findTestObject('Object Repository/shift_assignment/nusrse_patient_assignments'))
WebUI.delay(10)
WebUI.selectOptionByValue(findTestObject('Object Repository/shift_assignment/select_unit'),
	'http://building.thoughtwire.ca/zone/10200014', true)
WebUI.delay(25)
WebUI.click(findTestObject('Object Repository/shift_assignment/nurse_shift_assignments_tab'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/shift_assignment/create_new_Shift_btn'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/shift_assignment/check_all_for_creating_shift'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/shift_assignment/save_btn'))
WebUI.delay(5)
WebUI.click(findTestObject('shift_assignment/remove_btn_for_top_shift'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/shift_assignment/Yes_btn_for_remove_shift'))


