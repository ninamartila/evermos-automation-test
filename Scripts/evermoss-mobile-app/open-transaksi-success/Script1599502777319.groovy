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

Mobile.tap(findTestObject('evermoss-mobile-app-object/transaksi-menu'), 0)

Mobile.verifyElementExist(findTestObject('evermoss-mobile-app-object/Transaksi-text'), 0)

Mobile.tap(findTestObject('evermoss-mobile-app-object/point-saya-menu'), 0)

Mobile.tap(findTestObject('evermoss-mobile-app-object/ok-alert-point-saya'), 0)

Mobile.tap(findTestObject('evermoss-mobile-app-object/riwayat-transaksi'), 0)

Mobile.verifyElementExist(findTestObject('evermoss-mobile-app-object/data-tidak-tersedia-text'), 0)

Mobile.tap(findTestObject('evermoss-mobile-app-object/icon-back'), 0)

Mobile.tap(findTestObject('evermoss-mobile-app-object/transaksi-via-evermos'), 0)

Mobile.verifyElementExist(findTestObject('evermoss-mobile-app-object/pesanan-riwayat'), 0)

Mobile.tap(findTestObject('evermoss-mobile-app-object/back-transaksi'), 0)

