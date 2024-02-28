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

WebUI.callTestCase(findTestCase('99 - 00 Versión Modulada/99 - 01 - Seleccion Vehiculo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('99 - 00 Versión Modulada/99 - 02 - Solicitar cliente'), [:], FailureHandling.CONTINUE_ON_FAILURE)

try {
    // Utilizamos acceso por Rellenar Ficha
    WebUI.callTestCase(findTestCase('99 - 00 Versión Modulada/99 - 04 - AcepClienteEA'), [:], FailureHandling.STOP_ON_FAILURE)
}
catch (Exception e) {
    // Si falla CasoDePrueba2, ejecuta CasoDePruebaAlternativo
    WebUI.callTestCase(findTestCase('99 - 00 Versión Modulada/99 - 04 - AcepClienteEA'), [:], FailureHandling.CONTINUE_ON_FAILURE)
} 

WebUI.callTestCase(findTestCase('99 - 00 Versión Modulada/99 - 05 - VerificaciónDocumental'), [:], FailureHandling.CONTINUE_ON_FAILURE)

