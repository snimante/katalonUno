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

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/00 - Acceso/AccesoProduccion'))

WebUI.switchToWindowTitle('MFS')

WebUI.delay(2)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), '10404')

WebUI.delay(2)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelectVN'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectModelo'))

WebUI.delay(2)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectClio'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectCarburante'))

WebUI.delay(2)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectDiesel'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectVersion'))

WebUI.delay(2)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/Versionseleccionada'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/Complemento1'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/02 - 00 - BotonesVehiculo/CalcularOfertaNewDos'), 
    FailureHandling.OPTIONAL)

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/02 - 00 - BotonesVehiculo/CalcularOfertaNew'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/Calis/MensajeCalis'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/Calis/Impuesto'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/Calis/SelectImpuesto'), FailureHandling.OPTIONAL)

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/02 - 00 - BotonesVehiculo/AcpetarOfertaNew'))

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/04 - FechadeNacimiento/FechaNaciento'), '26081987', 
    FailureHandling.OPTIONAL)

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/04 - FechadeNacimiento/AceptarFecha'), FailureHandling.OPTIONAL)

WebUI.delay(10)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 00 - Opciones/00 - OpcionesOferta'))

WebUI.delay(5)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 02 - Ofertar/02 - Ofertar'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/01 - Emergentes/AceptarComprobarSeguro'))

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/00 - NIF'), '06212276E')

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/01 - Emergentes/AceptarNoCliente'))

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/01 - Apellidos'), 'ApellidoAuto')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/02 - Nombre'), 'NombreAuto')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/03 - CP'), '150001')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/04 - Localidad'), 'Coruña')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/06 - Telefono'), '687393983')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/07 - mail'), 'rober.avila87@gmail.com')

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/OpcionesFirmaOfertar/00 - Distancia'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/08 - ValidarCliente'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/ValidacionClienteBotones/GuardarCliente'))

WebUI.delay(5)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/01 - Emergentes/AceptarOfertar'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/09 - BotonAceptar'))

