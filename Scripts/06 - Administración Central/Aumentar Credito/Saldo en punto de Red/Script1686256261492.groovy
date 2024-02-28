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

WebUI.scrollToPosition(0, 120)

WebUI.click(findTestObject('Aumentar Credito/Acceso AdmCen'))

WebUI.switchToWindowTitle('MFS')

WebUI.click(findTestObject('Aumentar Credito/Buscador/AdmPuntoRed'))

WebUI.delay(2)

WebUI.click(findTestObject('Aumentar Credito/Buscador/radiobuttonRed'))

WebUI.setText(findTestObject('Aumentar Credito/Buscador/SeleccionRed'), '10404')

WebUI.click(findTestObject('Aumentar Credito/Buscador/BotonBuscar'))

WebUI.click(findTestObject('Aumentar Credito/Buscador/BuscarRed'), FailureHandling.OPTIONAL)

WebUI.delay(2)

WebUI.click(findTestObject('Aumentar Credito/Buscador/SelecRed10404'))

WebUI.setText(findTestObject('Aumentar Credito/Informar Saldo/campoCredito'), '400000')

WebUI.setText(findTestObject('Aumentar Credito/Informar Saldo/campoLeasing'), '400000')

WebUI.setText(findTestObject('Aumentar Credito/Informar Saldo/campoRenting'), '400000')

WebUI.click(findTestObject('Aumentar Credito/Botones/GuardarSaldo'))

