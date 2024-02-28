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

'11 - Acceso Abaco Verificación'
WebUI.openBrowser('')

'11 - Acceso Abaco Verificación'
WebUI.maximizeWindow()

'11 - Acceso Abaco Verificación'
WebUI.navigateToUrl(GlobalVariable.Abaco)

'11 - Acceso Abaco Verificación'
WebUI.delay(5)

'11 - Acceso Abaco Verificación'
WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/AccesoVrificación'))

'11 - Acceso Abaco Verificación'
WebUI.switchToWindowTitle('MFS')

'11 - Acceso Abaco Verificación'
WebUI.delay(10)

'12 - Verificar Documentos'
WebUI.setText(findTestObject('02 - Producción - Verificación/BotonesVerificacion/BusquedaVerificacion'), '4851645')

'12 - Verificar Documentos'
WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/BotonBuscar'))

'12 - Verificar Documentos - Mensaje en solicitud'
WebUI.click(findTestObject('02 - Producción - Verificación/MensajesVerificación/AccesoMensajes'))

'12 - Verificar Documentos - Mensaje en solicitud'
WebUI.click(findTestObject('02 - Producción - Verificación/MensajesVerificación/AnadirMensaje'))

'12 - Verificar Documentos - Mensaje en solicitud'
WebUI.setText(findTestObject('02 - Producción - Verificación/MensajesVerificación/EscribirMensaje'), 'Prueba')

'12 - Verificar Documentos - Mensaje en solicitud'
WebUI.click(findTestObject('02 - Producción - Verificación/MensajesVerificación/EnviarMensaje'))

'12 - Verificar Documentos - Mensaje en solicitud'
WebUI.click(findTestObject('02 - Producción - Verificación/MensajesVerificación/AceptarMensajeAlerta'))

'12 - Verificar Documentos - Evidencia Mensaje'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\Mensaje.png')

