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


	String residentsAssignment=WebUI.getText(findTestObject('eWBD_Patient_Info_Display_Column/Residents_row1'))
	String primaryNurseAssignment=WebUI.getText(findTestObject('Object Repository/eWBD_Patient_Info_Display_Column/primaryNurse_row1'))
	String coveringNurseAssignment=WebUI.getText(findTestObject('Object Repository/eWBD_Patient_Info_Display_Column/coveringNurse_row1'))
	String supportAssignment=WebUI.getText(findTestObject('Object Repository/eWBD_Patient_Info_Display_Column/support_row1'))
/*
	{
		String residentsAssignment=WebUI.getText(findTestObject('eWBD_Patient_Info_Display_Column/Residents_row2'))
		String primaryNurseAssignment=WebUI.getText(findTestObject('Object Repository/eWBD_Patient_Info_Display_Column/primaryNurse_row2'))
		String coveringNurseAssignment=WebUI.getText(findTestObject('Object Repository/eWBD_Patient_Info_Display_Column/coveringNurse_row2'))
		String supportAssignment=WebUI.getText(findTestObject('Object Repository/eWBD_Patient_Info_Display_Column/support_row2'))
	}*/
String empty=""
//def assignmentList = ["residentsAssignment", "primaryNurseAssignmen", "coveringNurseAssignment", "supportAssignment"]
	boolean residentcheck = residentsAssignment.equals(empty)
	boolean primarynursecheck = residentsAssignment.equals(empty)
	boolean coveringnursecheck = residentsAssignment.equals(empty)
	boolean supportcheck = residentsAssignment.equals(empty)
	if((residentcheck==true) && (primarynursecheck==true) && (coveringnursecheck==true) && (supportcheck==true))
	{
	println('After admitting the patient all assignments are empty')
	}
	else
	{
		println('empty assignment is not displayed')
	}


