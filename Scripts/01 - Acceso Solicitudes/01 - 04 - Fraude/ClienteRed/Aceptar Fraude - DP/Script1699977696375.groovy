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
WebUI.setText(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/SeleccionarBuscasdor'), '4875768')

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

WebUI.click(findTestObject('01 - Solicitudes/05 - Fraude/AccesoFraude'))

WebUI.click(findTestObject('01 - Solicitudes/05 - Fraude/01 - Documentación recibida/DocuRecibida'))

WebUI.delay(5)

WebUI.click(findTestObject('01 - Solicitudes/05 - Fraude/AccesoFraude'))

WebUI.click(findTestObject('01 - Solicitudes/05 - Fraude/01 - Documentación recibida/RellenarDocumentacion'))

WebUI.click(findTestObject('01 - Solicitudes/05 - Fraude/01 - Documentación recibida/bancariaBien'))

WebUI.click(findTestObject('01 - Solicitudes/05 - Fraude/01 - Documentación recibida/ingresosBien'))

WebUI.click(findTestObject('01 - Solicitudes/05 - Fraude/01 - Documentación recibida/propiedadBien'))

WebUI.click(findTestObject('01 - Solicitudes/05 - Fraude/01 - Documentación recibida/BotonSiguienteAceparDocumentacion'))

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar de ventana/AceptarVentanaUno'))

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/AceptarSegundaAcceso'), FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('null'), FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/OpcionesAceptar/Garantias'))

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptar'))

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.delay(5)

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptar'))

'Funcionalidad Aceptar - Evidencia estado 3'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\AceptarSolicitud\\AceptarSolicitud3.png', 
    FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/XX - Genericos/Ventana/cerrarVentanaSolicitudOpcion'), FailureHandling.OPTIONAL)

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
WebUI.setText(findTestObject('01 - Vuelo/NifVerificacion'), 'B15954654')

'12 - Verificar Documentos'
WebUI.delay(10)

'12 - Verificar Documentos'
WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

'12 - Verificar Documentos'
WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'))

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/PasarVerificacion'), FailureHandling.OPTIONAL)

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Empresa/DNIApoderado'))

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Empresa/VerificaciónPoderes'))

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Empresa/ImpuestoSociedades'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Empresa/ListaBlaqueo'))

'Verificación Documental'
WebUI.delay(5)

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/VerificaciónFinal'))

'Verificación Documental'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\test1.png')

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/CerrarVerificación'))

