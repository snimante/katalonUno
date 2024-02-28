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

'Funcionalidad Aceptar Solicitud - 1 - Acceso Abaco'
WebUI.openBrowser('')

'Funcionalidad Aceptar Solicitud - 1 - Acceso Abaco'
WebUI.maximizeWindow()

'Funcionalidad Aceptar Solicitud - 1 - Acceso Abaco'
WebUI.navigateToUrl(GlobalVariable.Abaco)

'Funcionalidad Aceptar Solicitud - 1 - Acceso Abaco'
WebUI.delay(2)

'Funcionalidad Aceptar Solicitud - 1 - Acceso Abaco'
WebUI.click(findTestObject('01 - Solicitudes/00 - Acceso/Solicitud - Contratar'))

'Funcionalidad Aceptar Solicitud - 1 - Acceso Abaco'
WebUI.switchToWindowTitle('MFS')

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.setText(findTestObject('01 - Solicitudes/01 - Buscador/Filtros Busqueda/CampoNif'), GlobalVariable.GlobalDNIProfesional)

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'))

WebUI.delay(5)

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/Produccion'))

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/rellenarFactura/grabarFactura'))

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/rellenarFactura/nFacturaUno'))

WebUI.setText(findTestObject('01 - Solicitudes/02 - Aceptación/rellenarFactura/nFactura'), 'RS01234512410')

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/rellenarFactura/fFacturaUno'))

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/rellenarFactura/fFactura'))

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/rellenarFactura/hoyFechaBoton'))

WebUI.delay(2)

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/rellenarFactura/baseUno'))

WebUI.setText(findTestObject('01 - Solicitudes/02 - Aceptación/rellenarFactura/base'), '16363.58')

WebUI.doubleClick(findTestObject('01 - Solicitudes/02 - Aceptación/rellenarFactura/tipoImpositivoUno'))

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/rellenarFactura/tipoImpositivo'))

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/rellenarFactura/impuesto21'))

WebUI.delay(10)

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/rellenarFactura/aceptarFactura'))

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/rellenarFactura/aceptarFactura'))

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/rellenarFactura/avisoFacturaOK'))

WebUI.delay(10)

