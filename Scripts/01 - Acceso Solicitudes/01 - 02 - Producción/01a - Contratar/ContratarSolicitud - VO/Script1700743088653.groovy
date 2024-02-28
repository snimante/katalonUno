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

WebUI.delay(2)

WebUI.click(findTestObject('01 - Solicitudes/00 - Acceso/Solicitud - Contratar'))

WebUI.switchToWindowTitle('MFS')

WebUI.setText(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/SeleccionarBuscasdor'), '4832189')

WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/Produccion'))

WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/ContratarProduccion'))

WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/chasisProduccion'), '1234567890fnxdfgw')

WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/MatriculaProduccion'), '3592FNX')

WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/Fecha'), '01012015')

WebUI.delay(2)

WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptar'))

