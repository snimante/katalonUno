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

'Control de chasis'
WebUI.openBrowser('')

'Control de chasis'
WebUI.maximizeWindow()

'Control de chasis'
WebUI.navigateToUrl(GlobalVariable.Abaco)

'Control de chasis'
WebUI.delay(2)

'Control de chasis'
WebUI.click(findTestObject('01 - Solicitudes/00 - Acceso/Solicitud - Contratar'))

'Control de chasis'
WebUI.switchToWindowTitle('MFS')

'Control de chasis'
WebUI.setText(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/SeleccionarBuscasdor'), '4854898')

'Control de chasis'
WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

'Control de chasis'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\test1.png')

'Control de chasis'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/Produccion'))

'Control de chasis'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/ContratarProduccion'))

'Control de chasis'
WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/chasisProduccion'), '1234567890fnxdfgw')

'Control de chasis'
WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/MatriculaProduccion'), '3592FNX')

'Control de chasis'
WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/Fecha'), '01012015')

'Control de chasis'
WebUI.delay(2)

'Control de chasis'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptar'))

'Control de chasis'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/AceptarChasis'))

'Control de chasis'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/MotivoChasis'))

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptarDos'))

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Solicitudes/XX - Genericos/Ventana/cerrarVentanaSolicitudOpcion'), FailureHandling.OPTIONAL)

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Solicitudes/XX - Genericos/Ventana/CerrarSolicitud'), FailureHandling.OPTIONAL)

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Solicitudes/XX - Genericos/Ventana/cerrarVentanaSolicitud'), FailureHandling.OPTIONAL)

