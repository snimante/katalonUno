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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Abaco)

WebUI.delay(5)

WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/AccesoVrificación'))

WebUI.switchToWindowTitle('MFS')

WebUI.delay(10)

WebUI.setText(findTestObject('02 - Producción - Verificación/BotonesVerificacion/BusquedaVerificacion'), '4833309')

WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/BotonBuscar'))

WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/PasarVerificacion'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/AceptarDNI'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/InformacionPrecontractual'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/JBacanrioAceptar'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/ConsentimientoVeracidadSI'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/SveracidadAceptar'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/EstadoFirmaCompleatada'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/Nomina'))

WebUI.delay(5)

WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/VerificaciónFinal'))

WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\test1.png')

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/CerrarVerificación'))

