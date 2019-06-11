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
import ca.thoughtwire.acceptance.mllp.api.Command as Command
import ca.thoughtwire.acceptance.mllp.api.MllpCommandSender as MllpCommandSender
import ca.thoughtwire.acceptance.mllp.api.MllpDriver as MllpDriver
import ca.thoughtwire.acceptance.mllp.impl.MllpDataConstants as MllpDataConstants
import ca.thoughtwire.acceptance.mllp.impl.MllpDriverImpl as MllpDriverImpl

MllpDriver driver = new MllpDriverImpl()

MllpCommandSender sender = driver.getNewSender('as-19.ott.twamb.ca', '14000', '/Users/nargis.akter/Downloads/SampleData_Day1.xls')

/*def mrnlist = ['4003205', '4002259']

for (def mrn : mrnlist) {
    Command admitCommand = sender.admit(mrn)

    admitCommand.getField(MllpDataConstants.MRN)

    admitCommand.getField(MllpDataConstants.PATIENT_DOB)
    String service = admitCommand.getField(MllpDataConstants.VISIT_HOSPITAL_SERVICE)

    admitCommand.execute()
}*/


Command admitCommand = sender.admit("4004648")
admitCommand.execute()
WebUI.delay(60)
