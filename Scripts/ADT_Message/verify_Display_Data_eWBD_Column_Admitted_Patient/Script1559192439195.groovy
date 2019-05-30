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
for(def rowNum=3;rowNum<=4;rowNum++)
{
   //String room=findTestData("SampleData_eWBD").getValue("Room", rowNum)
    //String bed=findTestData("SampleData_eWBD").getValue("Bed", rowNum)
	String familyname=findTestData("SampleData_eWBD").getValue("FamilyName", rowNum)
	String givenname=findTestData("SampleData_eWBD").getValue("GivenName", rowNum)
	String diagnosisFile=findTestData("SampleData_eWBD").getValue("admitReason/Diagnosis", rowNum)
	String serviceFile=findTestData("SampleData_eWBD").getValue("hospitalService", rowNum)
	String attendingMRPFile=findTestData("SampleData_eWBD").getValue("AttendingDoctorId", rowNum)
	String givennameshort=givenname.substring(0,1)
	String nameinfile = familyname +', '+ givennameshort
	String attendingMRPFileFormat=attendingMRPFile.substring(0,1) + '. ' + attendingMRPFile.substring(1,10)
	String attendingMRPFileDisplay=attendingMRPFileFormat.toUpperCase()
	println(attendingMRPFileDisplay)
	if(rowNum==3)
	{
	String nameineWBDRow1=WebUI.getText(findTestObject('eWBD_Patient_Info_Display_Column/patient_name_row1'))
	String diagnosiseWBDRow1=WebUI.getText(findTestObject('Object Repository/eWBD_Patient_Info_Display_Column/diagnosis_row1'))
	String serviceeWBDRow1=WebUI.getText(findTestObject('Object Repository/eWBD_Patient_Info_Display_Column/service_row1'))
	String attendingMRPeWBDRow1=WebUI.getText(findTestObject('Object Repository/eWBD_Patient_Info_Display_Column/attendingMRP_row1'))
	println(nameinfile + '->' + nameineWBDRow1 + diagnosisFile + '->' + diagnosiseWBDRow1 + serviceFile + '->' + serviceeWBDRow1 + attendingMRPFile + '->' + attendingMRPeWBDRow1)
	if((nameinfile.equals(nameineWBDRow1)) && (diagnosisFile.equals(diagnosiseWBDRow1)) && (serviceFile.equals(serviceeWBDRow1)) && (attendingMRPFileDisplay.equals(attendingMRPeWBDRow1)))
	{
		println('Name,diagnosis,service and attendingMRP display correctly')
	}
	else
	{
		println('unsuccessful')
		
	}
	}
	else
	{
		String nameineWBDRow2=WebUI.getText(findTestObject('eWBD_Patient_Info_Display_Column/patient_name_row2'))
		String diagnosiseWBDRow2=WebUI.getText(findTestObject('Object Repository/eWBD_Patient_Info_Display_Column/diagnosis_row2'))
		String serviceeWBDRow2=WebUI.getText(findTestObject('Object Repository/eWBD_Patient_Info_Display_Column/service_row2'))
		String attendingMRPeWBDRow2=WebUI.getText(findTestObject('Object Repository/eWBD_Patient_Info_Display_Column/attendingMRP_row2'))
		println(nameinfile + '->' + nameineWBDRow2 + diagnosisFile + '->' + diagnosiseWBDRow2 + serviceFile + '->' + serviceeWBDRow2 + attendingMRPFile + '->' + attendingMRPeWBDRow2)
		if((nameinfile.equals(nameineWBDRow2)) && (diagnosisFile.equals(diagnosiseWBDRow2)) && (serviceFile.equals(serviceeWBDRow2)) && (attendingMRPFileDisplay.equals(attendingMRPeWBDRow2)))
	
	{
		println('Name,diagnosis,service and attendingMRP display correctly')
	}
	else
	{
		println('unsuccessful')
		
	}
		
}
}
