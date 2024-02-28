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
WebUI.setText(findTestObject('01 - Solicitudes/01 - Buscador/Filtros Busqueda/CampoNif'), GlobalVariable.GlobalDNITitu)

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'))

WebUI.delay(5)

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar de ventana/AceptarVentanaUno'))

WebUI.delay(2)

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/AceptarSegundaAcceso'))

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/OpcionesAceptar/LiquizDelTitular'))

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptar'))

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.delay(5)

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptar'))

'Funcionalidad Solicitud - Evidencia estado 3'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\AceptarSolicitud\\AceptarSolicitud3.png', 
    FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/XX - Genericos/Ventana/cerrarVentanaSolicitudOpcion'), FailureHandling.OPTIONAL)

