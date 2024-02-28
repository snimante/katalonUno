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

'Verificación Documental'
WebUI.openBrowser('')

'Verificación Documental'
WebUI.maximizeWindow()

'Verificación Documental'
WebUI.navigateToUrl(GlobalVariable.Abaco)

'Verificación Documental'
WebUI.delay(5)

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/AccesoVrificación'))

'Verificación Documental'
WebUI.switchToWindowTitle('MFS')

'Verificación Documental'
WebUI.delay(10)

'Verificación Documental'
WebUI.setText(findTestObject('02 - Producción - Verificación/BotonesVerificacion/BusquedaVerificacion'), '4852398')

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/BotonBuscar'))

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/PasarVerificacion'), FailureHandling.OPTIONAL)

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/AceptarDNI'), FailureHandling.OPTIONAL)

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/JBacanrioAceptar'), FailureHandling.OPTIONAL)

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/ConsentimientoVeracidadSI'), FailureHandling.OPTIONAL)

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/SveracidadAceptar'), FailureHandling.OPTIONAL)

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/EstadoFirmaCompleatada'), FailureHandling.OPTIONAL)

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/Nomina'), FailureHandling.OPTIONAL)

'Verificación Documental'
WebUI.delay(5)

'Verificación Documental'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\Homologacion\\IPDS\\IPDS1.png')

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/CerrarVerificación'), FailureHandling.OPTIONAL)

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/CerrarVerificacionDos'), FailureHandling.OPTIONAL)

'13 - Acceso Abaco Solicitud'
WebUI.delay(700)

'Verificación Documental'
WebUI.setText(findTestObject('02 - Producción - Verificación/BotonesVerificacion/BusquedaVerificacion'), '4840572')

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/BotonBuscar'))

