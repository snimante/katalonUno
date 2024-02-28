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

WebUI.callTestCase(findTestCase('99 - 00 Versión Modulada/99 - 01 - Seleccion Vehiculo'), [:], FailureHandling.CONTINUE_ON_FAILURE)

println('Fin de proceso de selección de vehiculo')

WebUI.callTestCase(findTestCase('00 - Produccion/00 - 01 - Vehiculo Nuevo/03 - Profesionales/00 - Funcionalidad Unitaria/02 - 02b - Selec tipoCliente tipoProducto'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

println('Fin Seleccionar Cliente Profesional Leasing')

WebUI.callTestCase(findTestCase('00 - Produccion/00 - 01 - Vehiculo Nuevo/03 - Profesionales/00 - Funcionalidad Unitaria/02 - 02 - Solicitar cliente Profesional'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

println('Fin de informar Titular Profesional con Producto Leasing')

WebUI.callTestCase(findTestCase('00 - Produccion/00 - 01 - Vehiculo Nuevo/03 - Profesionales/00 - Funcionalidad Unitaria/99 - 03 - Condicion estado Profesional'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

println('Fin de cambio de estado EA - DP ')

WebUI.callTestCase(findTestCase('00 - Produccion/00 - 01 - Vehiculo Nuevo/03 - Profesionales/00 - Funcionalidad Unitaria/99 - 05 - VerificaciónDocumentalProfesional'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

println('Se realiza la creación de una factura')

WebUI.callTestCase(findTestCase('00 - Produccion/00 - 01 - Vehiculo Nuevo/03 - Profesionales/00 - Funcionalidad Unitaria/Validacion de factura'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

println('Validaciópn documental y servicio de IPIS')

WebUI.callTestCase(findTestCase('00 - Produccion/00 - 01 - Vehiculo Nuevo/03 - Profesionales/00 - Funcionalidad Unitaria/99 - 03 - Condicion estado AC Profesional'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

println('Cambia estado de AC a AV dejando contratado')

WebUI.callTestCase(findTestCase('00 - Produccion/00 - 01 - Vehiculo Nuevo/03 - Profesionales/00 - Funcionalidad Unitaria/99 - 07 - Firma de contrato Profesional'), 
    [('Punto') : findTestData('Centro 12000/12000').getValue(1, 1)], FailureHandling.CONTINUE_ON_FAILURE)

println('Se termina proceso de contratación con firma Manual')

