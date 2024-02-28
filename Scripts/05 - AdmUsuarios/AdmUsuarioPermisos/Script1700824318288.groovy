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

WebUI.scrollToPosition(0, 140)

WebUI.delay(10)

WebUI.click(findTestObject('Administracion Usuarios/Comunes/Acceso AdmUsuarios'))

WebUI.switchToWindowTitle('MFS')

WebUI.setText(findTestObject('Administracion Usuarios/Consulta/IPN'), 'PS13116')

WebUI.click(findTestObject('Administracion Usuarios/Comunes/Buscar'))

WebUI.click(findTestObject('Administracion Usuarios/SeleccionUsuarios/SeleccionPS13116'))

WebUI.click(findTestObject('Administracion Usuarios/Permisos - Roles/Aceptacion'))

WebUI.click(findTestObject('Administracion Usuarios/Permisos - Roles/AceptacionFuncionalidad/RequisitosMinimos'))

WebUI.click(findTestObject('Administracion Usuarios/Permisos - Roles/AceptacionFuncionalidad/checkPermisos'))

WebUI.click(findTestObject('Administracion Usuarios/Permisos - Roles/AceptacionFuncionalidad/TipoDeCliente'))

WebUI.click(findTestObject('Administracion Usuarios/Permisos - Roles/AceptacionFuncionalidad/ImportesAceptacionUno'))

WebUI.delay(5)

WebUI.setText(findTestObject('Administracion Usuarios/Permisos - Roles/AceptacionFuncionalidad/ImpAcepUnoplus'), '10')

WebUI.click(findTestObject('Administracion Usuarios/Permisos - Roles/AceptacionFuncionalidad/ImportesAceptacionDos'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.setText(findTestObject('Administracion Usuarios/Permisos - Roles/AceptacionFuncionalidad/ImpAcepDos'), '10')

WebUI.delay(5)

WebUI.click(findTestObject('Administracion Usuarios/Permisos - Roles/AceptacionFuncionalidad/ImportesAceptacionTres'))

WebUI.click(findTestObject('Administracion Usuarios/Comunes/GuardarAceptacion'))

