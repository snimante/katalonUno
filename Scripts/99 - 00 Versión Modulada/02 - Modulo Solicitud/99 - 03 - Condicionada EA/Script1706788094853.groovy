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

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'))

WebUI.delay(5)

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar de ventana/AceptarVentanaUno'), FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - Opcional Para EA'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/Rellenar Ficha/RellenarFicha'), FailureHandling.OPTIONAL)

WebUI.delay(2, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar de ventana/AceptarVentanaDos'), FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - Opcional Para EA'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/Rellenar Ficha/RellenarFicha'), FailureHandling.OPTIONAL)

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar de ventana/AceptarVentanaTres'), FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - Opcional Para EA'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/Rellenar Ficha/RellenarFicha'), FailureHandling.OPTIONAL)

'Funcionalidad Solicitud - Evidencia estado 1'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\AceptarSolicitud\\AceptarSolicitud1.png', 
    FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - Opcional Para EA'
WebUI.setText(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/Rellenar Ficha/NotaRiskScore'), '5', FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - Opcional Para EA'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/Rellenar Ficha/BotonSiguienteRellenarFicha'), 
    FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - Opcional Para EA'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/Rellenar Ficha/emergenteSIRiskscore'), FailureHandling.OPTIONAL)

'Funcionalidad Solicitud - Evidencia estado 2'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\AceptarSolicitud\\AceptarSolicitud2.png', 
    FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - Opcional Para EA'
WebUI.click(findTestObject('01 - Solicitudes/XX - Genericos/Ventana/cerrarVentanaSolicitudOpcion'), FailureHandling.OPTIONAL)

WebUI.delay(5, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('01 - Solicitudes/XX - Genericos/Ventana/CerrarVentanaSolicitudOpcionNOEA'), FailureHandling.OPTIONAL)

WebUI.delay(5, FailureHandling.OPTIONAL)

