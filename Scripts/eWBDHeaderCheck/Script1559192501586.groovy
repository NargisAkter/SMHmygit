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
import ca.thoughtwire.acceptance.mllp.api.Command;
import ca.thoughtwire.acceptance.mllp.api.MllpCommandSender;
import ca.thoughtwire.acceptance.mllp.api.MllpDriver;
import ca.thoughtwire.acceptance.mllp.impl.MllpDriverImpl;

WebUI.openBrowser('')

WebUI.navigateToUrl('https://as-19.ott.twamb.ca/agent-server/launch?uri=http://thoughtwire.ca/ont/sln/ewb/smh&unit=14C')

WebUI.setText(findTestObject('Object Repository/LoginPage/input_User name_username'),
	'bsnow')

WebUI.setEncryptedText(findTestObject('Object Repository/LoginPage/input_Password_password'),
	'WfhbnYCDenevwEefKBoKjA==')

WebUI.click(findTestObject('Object Repository/LoginPage/input_Password_twLogin_button'))
WebUI.delay(35)
String Row1=WebUI.getText(findTestObject('eWBD_Patient_Info_Display_Column/Residents_row1'))
println(Row1)
String empty=""
//boolean check = Row1.equals(empty)
String Row2=WebUI.getText(findTestObject('eWBD_Patient_Info_Display_Column/Residents_row2'))
println(Row2)
String nullString=null
//boolean check2 = Row2.equals(nullString)


/*
MllpDriver driver =new MllpDriverImpl();
MllpCommandSender sender = driver.getNewSender("cs1-19.ott.twamb.ca", "14000", "C:\\Users\\Titu\\Downloads\\SampleData_Day1.xls");

def mrnlist=["4003205","4002259"]
for(def mrn:mrnlist)
{
Command admitCommand = sender.admit(mrn)
admitCommand.execute();
}
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


//Command cancelCommand = sender.cancelAdmit("4002259")
//cancelCommand.execute();
//Command cancelCommand1 = sender.cancelAdmit("4002259")
//cancelCommand.execute();
//cancelCommand1.execute();


/*admitCommand.updateField(MllpDataConstants.PATIENT_GENDER, "F");
admitCommand.updateField(MllpDataConstants.PATIENT_VISIT_ID, "sadas");
admitCommand.updateField(MllpDataConstants.VISIT_ASSIGNED_ROOM, "3");



for(def rowNum=1;rowNum<=3;rowNum++)
{
	//String mrn=findTestData("SampleData_eWBD").getValue("Room", rowNum)
	//String mrn=findTestData("SampleData_eWBD").getValue("Bed", rowNum)
	String familyname=findTestData("SampleData_eWBD").getValue("FamilyName", rowNum)
	String givenname=findTestData("SampleData_eWBD").getValue("GivenName", rowNum)
	String givennameshort=givenname.substring(0,1)
	String nameinfile = familyname +','+ givennameshort
	String nameineWBD=WebUI.getText(findTestObject('eWBD_Patient_Info_Display_Column/patient_name_row1'))
	if(nameinfile.equals(nameineWBD))
	{
		println('Name display correctly')
	}
	//String mrn=findTestData("SampleData_eWBD").getValue("hospitalService", rowNum)
	//String mrn=findTestData("SampleData_eWBD").getValue("MRN", rowNum)
	//for(def colNum=1;colNum<=5;colNum++)
	//{
	//String name=findTestData("SampleData_eWBD").getValue(colNum,rowNum)
	println(name)
	//}
}*/

