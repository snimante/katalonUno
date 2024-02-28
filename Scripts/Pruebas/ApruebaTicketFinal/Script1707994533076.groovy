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
import com.kms.katalon.core.util.KeywordUtil as MensLog

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://vmrciel07o.vll.renault.es:8080/login.jsp?os_destination=%2Fprojects%2FSYS%2Fqueues%2Fcustom%2F22&permissionViolation=true')

WebUI.setText(findTestObject('Aprobación de tickets/Login/usuarioLogin'), 'ps13116')

WebUI.setEncryptedText(findTestObject('Aprobación de tickets/Login/passLogin'), 'hDbHQ6BUgZQTFeRp05MH4g==')

WebUI.click(findTestObject('Aprobación de tickets/Login/accesoLogin'), FailureHandling.CONTINUE_ON_FAILURE)

int a = 0

int contadorSolicitud = 0

int intentos = 0

while (a < 100) {
    WebUI.click(findTestObject('Aprobación de tickets/Funcionalidades/CarpetaAutoHomologar'), FailureHandling.OPTIONAL)

    boolean control = WebUI.verifyElementVisible(findTestObject('Aprobación de tickets/Funcionalidades/seleccionarTicketprimero'), 
        FailureHandling.OPTIONAL)

    println(control)

    if (control == true) {
        WebUI.click(findTestObject('Aprobación de tickets/Funcionalidades/seleccionarTicketprimero'))

        WebUI.click(findTestObject('Aprobación de tickets/Funcionalidades/botonAprobar'), FailureHandling.OPTIONAL)

        contadorSolicitud++

        MensLog.logInfo('*********************************************************************************************')

        MensLog.logInfo(('******************** Solicitud aprobada numero: ' + contadorSolicitud) + '********************')

        MensLog.logInfo('*********************************************************************************************')
    } else {
        println('NO TENGO REGISTROS')

        intentos++

        MensLog.logInfo('Solicitudes Aprobadas hoy : ' + contadorSolicitud)

        MensLog.logInfo('Intentos de aprobar : ' + intentos)

        a++
    }
    
    WebUI.delay(60)
}

MensLog.logInfo(('Termino de trabajar' + a) + 'Veces ejecutado')

