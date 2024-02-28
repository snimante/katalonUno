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

/*Selección de punto de red y vehiculo para contratar*/
WebUI.callTestCase(findTestCase('99 - 00 Versión Modulada/99 - 01 - Seleccion Vehiculo'), [:], FailureHandling.CONTINUE_ON_FAILURE)

println('Fin de proceso de selección de vehiculo')

/*Información de cliente - Titular - */
WebUI.callTestCase(findTestCase('99 - 00 Versión Modulada/99 - 02 - Solicitar cliente'), [:], FailureHandling.CONTINUE_ON_FAILURE)

println('Fin de informar Titular')

/*Control de estados posible EA - DP o DP - AF*/
try {
    /*Sí la solicitud se queda en estado EA y se necesita rellena ficha*/
    WebUI.callTestCase(findTestCase('99 - 00 Versión Modulada/99 - 04 - AcepClienteEA'), [:], FailureHandling.STOP_ON_FAILURE)

    println('Solicitud en EA, que fuerza estado a DP')

    WebUI.callTestCase(findTestCase('99 - 00 Versión Modulada/99 - 03 - AcepClienteDP Op B'), [:], FailureHandling.CONTINUE_ON_FAILURE)
}
catch (Exception e) {
    /*Cambiar de estado de DP "Estudio" a AF "Aceptada Pendiende de Información" */
    WebUI.callTestCase(findTestCase('99 - 00 Versión Modulada/99 - 03 - AcepClienteDP'), [:], FailureHandling.CONTINUE_ON_FAILURE)

    println('Cambio de estado DP - AF')
} 

/*Validación documental, donde se comprueba que funciona servicio de IPIS*/
WebUI.callTestCase(findTestCase('99 - 00 Versión Modulada/99 - 05 - VerificaciónDocumental'), [:], FailureHandling.CONTINUE_ON_FAILURE)

println('Validaciópn documental y servicio de IPIS')

/*Documentación correcta en estado AF - AC, donde se realiza la contratación*/
WebUI.callTestCase(findTestCase('99 - 00 Versión Modulada/99 - 06 - Contratación'), [:], FailureHandling.CONTINUE_ON_FAILURE)

println('Se realiza proceso de contratación')

WebUI.callTestCase(findTestCase('99 - 00 Versión Modulada/99 - 07 - Firma de contrato'), [('Punto') : findTestData('Centro 12000/12000').getValue(
            1, 1)], FailureHandling.CONTINUE_ON_FAILURE)

println('Se termina proceso de contratación con firma Manual')

WebUI.callTestCase(findTestCase('99 - 00 Versión Modulada/99 - 08 - Avanza validacion'), [:], FailureHandling.CONTINUE_ON_FAILURE)

println('Fin de preceso')

