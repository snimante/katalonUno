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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'16 - Avanza'
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://rci-omegapre.vll.renault.es/Omega/security/login.do')

WebUI.setText(findTestObject('Avanza/Bueno/InformarUsuarioAvanza'), 'PS13116')

WebUI.setEncryptedText(findTestObject('Object Repository/Avanza/Bueno/InformarContraSeñaAvanza'), 'hDbHQ6BUgZRp97lo1YEtgg==')

WebUI.click(findTestObject('Avanza/Bueno/AceptarAccederAvanza'))

WebUI.click(findTestObject('Avanza/Bueno/SeleccionarBusquedaCesta'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Avanza/Page_Avanzav24.15.0/a_Buscar contrato'))

WebUI.click(findTestObject('Avanza/Bueno/BusquedaDNI'))

WebUI.setText(findTestObject('Avanza/Bueno/BusquedaDNI'), GlobalVariable.GlobalDNITitu)

WebUI.click(findTestObject('Object Repository/Avanza/Page_Avanzav24.15.0/button_Buscar'))

WebUI.click(findTestObject('Object Repository/Avanza/Page_Avanzav24.15.0/img_Gestin normal - Activo_width-20-px clic_267c21'))

WebUI.click(findTestObject('Avanza/Bueno/PestanaCliente'))

WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\test4.png')

WebUI.click(findTestObject('Avanza/Bueno/PestanaDatosFinancieros'))

WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\test5.png')

WebUI.click(findTestObject('Avanza/Bueno/PestanaPrestaciones'))

WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\test6.png')

WebUI.click(findTestObject('Avanza/Bueno/PentanaOperacionesEspeciales'), FailureHandling.OPTIONAL)

WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\test7.png', 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Avanza/Bueno/PestanaGestionImpagos'), FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 150, FailureHandling.OPTIONAL)

