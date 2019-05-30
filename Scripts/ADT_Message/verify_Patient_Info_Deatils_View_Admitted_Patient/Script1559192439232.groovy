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

String mrn=findTestData("SampleData_eWBD").getValue("MRN", 3)
String admitDate=findTestData("SampleData_eWBD").getValue("admitDate", 3)
//String admitdateDisplay = admitDate.substring(0,4) + '-' + admitDate.substring(5,6) + '-' + admitDate.substring(7,8)
String gender=findTestData("SampleData_eWBD").getValue("Gender", 3)
String birthdate=findTestData("SampleData_eWBD").getValue("DOB", 3)
WebUI.click(findTestObject('Object Repository/eWBD_Patient_Info_Detailed_View/edit_button'))
WebUI.delay(5)
String mrnineWBD=WebUI.getText(findTestObject('Object Repository/eWBD_Patient_Info_Detailed_View/MRN'))
String genderineWBD=WebUI.getText(findTestObject('Object Repository/eWBD_Patient_Info_Detailed_View/Gender'))

if((mrn.equals(mrnineWBD)) && (gender.equals(genderineWBD)))
{
	println('success')
}
else
{
	println('failed')
}