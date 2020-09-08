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

Mobile.tap(findTestObject('evermoss-mobile-app-object/toko-saya-menu'), 0)

Mobile.verifyElementExist(findTestObject('evermoss-mobile-app-object/toko-saya-name'), 0)

Mobile.tap(findTestObject('evermoss-mobile-app-object/first-product'), 0)

Mobile.verifyElementExist(findTestObject('evermoss-mobile-app-object/nama-product'), 0)

Mobile.tap(findTestObject('evermoss-mobile-app-object/share-toko-saya'), 0)

Mobile.tap(findTestObject('evermoss-mobile-app-object/download-toko-saya'), 0)

Mobile.tap(findTestObject('evermoss-mobile-app-object/dot-toko-saya'), 0)

Mobile.verifyElementExist(findTestObject('evermoss-mobile-app-object/back-toko-saya'), 0)

Mobile.tap(findTestObject('evermoss-mobile-app-object/back-toko-saya'), 0)

