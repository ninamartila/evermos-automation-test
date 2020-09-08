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

WebUI.verifyElementPresent(findTestObject('berikhtiar-web-object/menu-akun'), 0)

WebUI.click(findTestObject('berikhtiar-web-object/menu-akun'))

WebUI.verifyElementPresent(findTestObject('berikhtiar-web-object/akun-text-Transaksi Saya'), 0)

WebUI.click(findTestObject('berikhtiar-web-object/akun-transaksi-saya'))

WebUI.verifyElementPresent(findTestObject('berikhtiar-web-object/akun-Belum Dibayar'), 0)

WebUI.click(findTestObject('berikhtiar-web-object/akun-back-belum-bayar'))

WebUI.verifyElementPresent(findTestObject('berikhtiar-web-object/akun-text-daftar-alamat'), 0)

WebUI.click(findTestObject('berikhtiar-web-object/akun-button-daftar-alamat'))

WebUI.verifyElementPresent(findTestObject('berikhtiar-web-object/akun-text-search-box'), 0)

WebUI.click(findTestObject('berikhtiar-web-object/akun-back-daftar-alamat'))

WebUI.click(findTestObject('berikhtiar-web-object/akun-keranjang'))

WebUI.verifyElementPresent(findTestObject('berikhtiar-web-object/akun-belanja-kosong'), 0)

WebUI.click(findTestObject('berikhtiar-web-object/akun-back-keranjang-2'))

WebUI.click(findTestObject('berikhtiar-web-object/akun-back-saya'))

