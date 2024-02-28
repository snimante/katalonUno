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

'15 - Firmar contratación.'
WebUI.openBrowser('')

'15 - Firmar contratación.'
WebUI.maximizeWindow()

'15 - Firmar contratación.'
WebUI.navigateToUrl(GlobalVariable.Abaco)

'15 - Firmar contratación.'
WebUI.delay(2)

'15 - Firmar contratación.'
WebUI.scrollToPosition(0, 120)

'15 - Firmar contratación.'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/00 - Acceso/AccesoProduccion'))

'15 - Firmar contratación.'
WebUI.switchToWindowTitle('MFS')

'15 - Firmar contratación.'
WebUI.delay(2)

'15 - Firmar contratación.'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), FailureHandling.STOP_ON_FAILURE)

'15 - Firmar contratación.'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), Punto)

'15 - Firmar contratación.'
WebUI.delay(2)

'15 - Firmar contratación.'
WebUI.click(findTestObject('Produccion Busqueda Solicitudes/busquedaOperaciones'))

'15 - Firmar contratación.'
WebUI.setText(findTestObject('Produccion Busqueda Solicitudes/nifContratacion'), GlobalVariable.GlobalDNITitu)

'15 - Firmar contratación.'
WebUI.click(findTestObject('Produccion Busqueda Solicitudes/operacion'))

'15 - Firmar contratación.'
WebUI.click(findTestObject('Produccion Busqueda Solicitudes/operacionContratacion'))

'15 - Firmar contratación.'
WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'))

'15 - Firmar contratación.'
WebUI.click(findTestObject('Produccion Busqueda Solicitudes/firmaManual'))

'15 - Firmar contratación.'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/03 - Datos Firma/CerrarManualAvalista'))

'15 - Firmar contratación.'
WebUI.click(findTestObject('Produccion Busqueda Solicitudes/BotonesContratar/SalirDetalleOperacion'))

'15 - Firmar contratación.'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\test3.png')

