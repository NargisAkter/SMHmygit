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

//WebUI.navigateToUrl('https://as-19.ott.twamb.ca/agent-server/launch?uri=http://thoughtwire.ca/ont/sln/ewb/smh&unit=14C')

WebUI.navigateToUrl('https://as-19.ott.twamb.ca/agent-server/launch?uri=http://thoughtwire.ca/ont/sln/nm/smh')
WebUI.setText(findTestObject('Object Repository/LoginPage/input_User name_username'),
	'bsnow')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/input_Password_password'),
	'WfhbnYCDenevwEefKBoKjA==')

WebUI.click(findTestObject('Object Repository/LoginPage/input_Password_twLogin_button'))
WebUI.delay(20)
WebUI.click(findTestObject('Object Repository/Alarm Manager/Home_Tab/Team_Assignment_Link'))
WebUI.delay(5)
WebUI.selectOptionByValue(findTestObject('Object Repository/Alarm Manager/Home_Tab/cb_select_Role'),
	'http://medical.thoughtwire.ca/seniorMedicalResident', true)
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Alarm Manager/Home_Tab/Assign_Button'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Alarm Manager/Home_Tab/Team_Assignment_Link'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Alarm Manager/Home_Tab/Cancel_button'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Alarm Manager/Home_Tab/Code_Event_Subscriptions_Link'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Alarm Manager/Home_Tab/cb_subscription_check'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Alarm Manager/Home_Tab/save_btn_for_subscription'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Alarm Manager/Home_Tab/Code_Event_Subscriptions_Link'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Alarm Manager/Home_Tab/cb_subscription_check'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Alarm Manager/Home_Tab/cancel_btn_for_subscription'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Alarm Manager/Home_Tab/Logout_btn'))

