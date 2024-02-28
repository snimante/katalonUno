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

'1 - Acceso Abaco'
WebUI.openBrowser('')

'1 - Acceso Abaco'
WebUI.maximizeWindow()

'1 - Acceso Abaco'
WebUI.navigateToUrl(GlobalVariable.Abaco)

'1 - Acceso Abaco'
WebUI.delay(5)

'1 - Acceso Abaco'
WebUI.scrollToPosition(0, 120)

'1 - Acceso Abaco'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/00 - Acceso/AccesoProduccion'))

'1 - Acceso Abaco'
WebUI.switchToWindowTitle('MFS')

'2 - Punto de Red'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), FailureHandling.STOP_ON_FAILURE)

'2 - Punto de Red'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), '300795')

'2 - Punto de Red'
WebUI.delay(2)

'3 - Selección de VN'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelectVN'))

'4 - Modelo de Coche'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectModelo'))

'4 - Modelo de Coche'
WebUI.delay(2)

'4 - Modelo de Coche'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectQASHQAI'))

'4 - Modelo de Coche'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectCarburante'))

'4 - Modelo de Coche'
WebUI.delay(2)

'4 - Modelo de Coche'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectGasolina'))

'4 - Modelo de Coche'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectVersion'))

'4 - Modelo de Coche'
WebUI.delay(2)

'4 - Modelo de Coche'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectVersionQASHQAI'))

'4 - Modelo de Coche'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/02 - 00 - BotonesVehiculo/CalcularOferta'))

'4 - Modelo de Coche'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/02 - 00 - BotonesVehiculo/AceptarOferta'))

'5 - Selección cliente'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/A - 01- Comunes - SeleccionCliente/00 - SeleccionCliente'))

'5 - Selección cliente'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/A - 01- Comunes - SeleccionCliente/Empleados/Empleados'))

'6 - Selección Producto'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/B - 01 - Comunes - SeleccionProducto/SeleccionProducto'))

'6 - Selección Producto'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/B - 01 - Comunes - SeleccionProducto/Renting/Renting'))

'6 - Selección Producto'
WebUI.delay(2)

'7 - Opciones'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 00 - Opciones/00 - OpcionesOferta'))

'7 - Opciones'
WebUI.delay(5)

'7 - Opciones'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 02 - Ofertar/02b - OfertarRenting'))

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/00 - NIF'), '27042996X')

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/01 - Emergentes/AceptarNoCliente'))

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/01 - Apellidos'), 'ApellidoAuto')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/02 - Nombre'), 'NombreAuto')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/03 - CP'), '28044')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/04 - Localidad'), 'Madrid')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/06 - Telefono'), '687393983')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/07 - mail'), 'rober.avila87@gmail.com')

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/OpcionesFirmaOfertar/00 - Distancia'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/08 - ValidarCliente'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/ValidacionClienteBotones/GuardarCliente'))

WebUI.delay(5)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/01 - Emergentes/AceptarOfertar'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/ValidacionClienteBotones/AceptarEnviarOfertarRenting'))

