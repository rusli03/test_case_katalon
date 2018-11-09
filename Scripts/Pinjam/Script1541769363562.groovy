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

WebUI.navigateToUrl('https://www.pinjam.co.id/')

WebUI.click(findTestObject('Object Repository/Pinjam_test/Page_Gadai Online dan Pinjaman Uang/a_Gadai sekarang'))

WebUI.click(findTestObject('Object Repository/Pinjam_test/Page_Gadai Online dan Pinjaman Uang/a_Perhiasan emas'))

WebUI.setText(findTestObject('Object Repository/Pinjam_test/Page_Gadai Online dan Pinjaman Uang/input_Berat kotor (gram)_gross'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Pinjam_test/Page_Gadai Online dan Pinjaman Uang/input_Berat bersih (gram)_net_'), 
    '1.5')

WebUI.selectOptionByValue(findTestObject('Object Repository/Pinjam_test/Page_Gadai Online dan Pinjaman Uang/select_Pilih spesifikasi1 Kara'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Pinjam_test/Page_Gadai Online dan Pinjaman Uang/input_Nomor handphone Anda_pho'), 
    '08344546764355456')

WebUI.click(findTestObject('Object Repository/Pinjam_test/Page_Gadai Online dan Pinjaman Uang/input_Nomor handphone Anda_com'))

WebUI.click(findTestObject('Object Repository/Pinjam_test/Page_Gadai Online dan Pinjaman Uang/div_Biaya Asuransi      Biaya'))

WebUI.click(findTestObject('Object Repository/Pinjam_test/Page_Gadai Online dan Pinjaman Uang/button_Gadai sekarang'))

WebUI.setText(findTestObject('Object Repository/Pinjam_test/Page_Gadai Online dan Pinjaman Uang/input_Email_useremail'), 
    'dino@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Pinjam_test/Page_Gadai Online dan Pinjaman Uang/input_Password_userpassword'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Pinjam_test/Page_Gadai Online dan Pinjaman Uang/input_Remember me_commit'))

WebUI.closeBrowser()

