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

'15 - Firmar Contrato'
WebUI.openBrowser('')

'15 - Firmar Contrato'
WebUI.maximizeWindow()

'15 - Firmar Contrato'
WebUI.navigateToUrl(GlobalVariable.Abaco)

'15 - Firmar Contrato'
WebUI.delay(2)

'15 - Firmar Contrato'
WebUI.scrollToPosition(0, 120)

'15 - Firmar Contrato'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/00 - Acceso/AccesoProduccion'))

'15 - Firmar Contrato'
WebUI.switchToWindowTitle('MFS')

'15 - Firmar Contrato'
WebUI.delay(2)

'15 - Firmar Contrato'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), FailureHandling.STOP_ON_FAILURE)

'15 - Firmar Contrato'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), '5203')

'15 - Firmar Contrato'
WebUI.delay(2)

'15 - Firmar Contrato'
WebUI.click(findTestObject('Produccion Busqueda Solicitudes/busquedaOperaciones'))

'15 - Firmar Contrato'
WebUI.click(findTestObject('Produccion Busqueda Solicitudes/operacion'))

'15 - Firmar Contrato'
WebUI.click(findTestObject('Produccion Busqueda Solicitudes/operacionContratacion'))

'15 - Firmar Contrato'
WebUI.setText(findTestObject('Produccion Busqueda Solicitudes/NumContratacion'), '202300059470')

'15 - Firmar Contrato'
WebUI.click(findTestObject('Produccion Busqueda Solicitudes/IrContrato'))

'15 - Firmar Contrato'
WebUI.click(findTestObject('Produccion Busqueda Solicitudes/firmaManual'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/03 - Datos Firma/CerrarManualAvalista'))

