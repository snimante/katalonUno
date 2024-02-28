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
WebUI.delay(5)

'Scroll ver Produccion'
WebUI.scrollToPosition(0, 120)

'Acceso menu Produccion'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/00 - Acceso/AccesoProduccion'))

'Cambiar de Pestaña'
WebUI.switchToWindowTitle('MFS')

'Foco Punto de Red'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), FailureHandling.STOP_ON_FAILURE)

'Informar Punto de Red'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), '10404')

'Espera que cargue pantalla'
WebUI.delay(2)

'Busqueda de operaciones en el punto de red'
WebUI.click(findTestObject('Produccion Busqueda Solicitudes/busquedaOperaciones'))

'Combo de operaciones'
WebUI.click(findTestObject('Produccion Busqueda Solicitudes/operacion'))

'Seleccionar estado solicitud en elaboracion'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/09 - Solicitar Elaboracion/SeleccionSolicitudElaboracion'))

'Seleccioanr primer registro'
WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'))

'Foto de estado de solicitud'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\Homologacion\\Solicitud Elaboracion\\SE1.png')

'Seleccionar solicitar'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/09 - Solicitar Elaboracion/Solicitar'))

'Espera que cargue pantalla'
WebUI.delay(5)

'Aceptar solicitud'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/09 - Solicitar Elaboracion/AceptarSolicitudRecuperada'))

'Foto de Solicitud terminada'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\Homologacion\\Solicitud Elaboracion\\SE2.png')

