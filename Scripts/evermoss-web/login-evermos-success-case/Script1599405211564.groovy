import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

//WebUI.openBrowser(GlobalVariable.EvermosUrl)
//
//WebUI.maximizeWindow()
WebUI.verifyElementPresent(findTestObject('evermoss-web-object/Home page/landing-page-text'), 0)

WebUI.click(findTestObject('evermoss-web-object/Home page/button-masuk'))

WebUI.verifyElementPresent(findTestObject('evermoss-web-object/Login Page/ayo-masuk-text'), 0)

WebUI.click(findTestObject('evermoss-web-object/Login Page/label-no-tlp'))

WebUI.sendKeys(findTestObject('evermoss-web-object/Login Page/number-telepon'), GlobalVariable.EvermosPhoneNumber)

WebUI.click(findTestObject('evermoss-web-object/Login Page/label-kata-sandi'))

WebUI.sendKeys(findTestObject('evermoss-web-object/Login Page/kata-sandi'), GlobalVariable.EvermosPassword)

WebUI.click(findTestObject('evermoss-web-object/Login Page/button-masuk'))

WebUI.click(findTestObject('evermoss-web-object/Evermos - Katalog/offering Mau button'))

