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

WebUI.delay(300)

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.setText(findTestObject('01 - Solicitudes/01 - Buscador/Filtros Busqueda/CampoNif'), GlobalVariable.GlobalDNITituAvalista)

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

if (WebUI.verifyElementVisible(findTestObject('01 - Solicitudes/06 - Condiciones/solicitudEA'), FailureHandling.OPTIONAL) == 
true) {
    //Valida estado EA para ponerlos en DP.
    WebUI.callTestCase(findTestCase('99 - 00 Versión Modulada/02 - Modulo Solicitud/99 - 03 - Condicionada EA'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('00 - Produccion/00 - 01 - Vehiculo Nuevo/01 - Particular/01 - 01 - 01 - Avalista/01 - Funcionalidad Unitaria Avalista/99 - 03 - AcepClienteDP Avalista'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)
} else if (WebUI.verifyElementVisible(findTestObject('Object Repository/01 - Solicitudes/06 - Condiciones/solicitudDP'), 
    FailureHandling.CONTINUE_ON_FAILURE) == true) {
    WebUI.callTestCase(findTestCase('08 - Avanza/99 - 03 - Condicionada DP'), [:], FailureHandling.CONTINUE_ON_FAILURE)
}

