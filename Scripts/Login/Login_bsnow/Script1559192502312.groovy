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

WebUI.navigateToUrl('https://as-19.ott.twamb.ca/agent-server/launch?uri=http://thoughtwire.ca/ont/sln/ewb/smh&unit=14C')

WebUI.setText(findTestObject('Object Repository/LoginPage/input_User name_username'),
	'bsnow')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/input_Password_password'),
	'WfhbnYCDenevwEefKBoKjA==')

WebUI.click(findTestObject('Object Repository/LoginPage/input_Password_twLogin_button'))
WebUI.delay(35)