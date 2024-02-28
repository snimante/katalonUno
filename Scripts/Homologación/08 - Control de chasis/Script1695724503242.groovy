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

'Abre Navegador'
WebUI.openBrowser('')

'Maximizar Pantalla'
WebUI.maximizeWindow()

'Acceso a Abaco'
WebUI.navigateToUrl(GlobalVariable.Abaco)

'Espera que cargue pantalla'
WebUI.delay(2)

'Acceso menu Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/00 - Acceso/Solicitud - Contratar'))

'Cambiar de Pestaña'
WebUI.switchToWindowTitle('MFS')

'Informas ID de busqueda'
WebUI.setText(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/SeleccionarBuscasdor'), '4828162')

'Pulsar boton de busqueda'
WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

'Pulsar botono de Producción'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/Produccion'))

'Seleccionar contratar producto'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/ContratarProduccion'))

'Informar Chasis'
WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/chasisProduccion'), '1234567890fnxdfgw')

'Informar Matricula'
WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/MatriculaProduccion'), '3592FNX')

'Informar Fecha'
WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/Fecha'), '01012015')

'Sacar Foto de control de chasis'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\Homologacion\\Control de Chasis\\Chasis1.png')

'Siguiente pantalla'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptar'))

'Control de chasis'
WebUI.delay(5)

'Foto de control de chasis'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\Homologacion\\Control de Chasis\\Chasis2.png')

'Aceptar mensaje de control'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/AceptarChasis'))

'Informar motivio'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/MotivoChasis'))

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptarDos'))

