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
WebUI.delay(2)

'Scroll ver Produccion'
WebUI.scrollToPosition(0, 120)

'Acceso menu Produccion'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/00 - Acceso/AccesoProduccion'))

'Cambiar de Pestaña'
WebUI.switchToWindowTitle('MFS')

'Espera que cargue pantalla'
WebUI.delay(2)

'Foco Punto de Red'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), FailureHandling.STOP_ON_FAILURE)

'Informar Punto de Red'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), '10404')

'Espera que cargue pantalla'
WebUI.delay(2)

'Seleccionar tipo de vehiculo'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelectVN'))

'Seleccionar modelo'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectModelo'))

'Espera que cargue pantalla'
WebUI.delay(2)

'Seleccionar Clio'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectClio'))

'Seleccionar Carburante'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectCarburante'))

'Espera que cargue pantalla'
WebUI.delay(2)

'Seleccionar Diesel'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectDiesel'))

'Seleccionar Versión'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectVersion'))

'Espera que cargue pantalla'
WebUI.delay(2)

'Seleccionar Modelo'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/Versionseleccionada'))

'Complemento'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/Complemento1'))

'Calcular Oferta'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/02 - 00 - BotonesVehiculo/CalcularOferta'))

'Aceptar Oferta'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/02 - 00 - BotonesVehiculo/AceptarOferta'))

'Simular Oferta'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/03 - Baremos/00 - SimulacionBaremo'))

'Espera que cargue pantalla'
WebUI.delay(5)

'Seleccionar un Baremo'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/03 - Baremos/Baremo RenaultCredito'))

'Espera que cargue pantalla'
WebUI.delay(5)

'Selecciona Ofertar'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 00 - Opciones/00 - OpcionesOferta'))

'Espera que cargue pantalla'
WebUI.delay(5)

'Acceso a realizar una oferta'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 02 - Ofertar/02 - Ofertar'))

'Aceptamos venta emeregente'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/01 - Emergentes/AceptarComprobarSeguro'))

'Informar nuevo cliente'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/00 - NIF'), '56891684B')

'Aceptar nuevo cliente'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/01 - Emergentes/AceptarNoCliente'))

'Informar Apellido'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/01 - Apellidos'), 'ApellidoAuto')

'Informar Nombre'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/02 - Nombre'), 'NombreAuto')

'Informar CP'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/03 - CP'), '150001')

'Informar Localidad'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/04 - Localidad'), 'Coruña')

'Informar Telefono'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/06 - Telefono'), '687393983')

'Informar Mail'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/07 - mail'), 'rober.avila87@gmail.com')

'Seleccionar tipo de firma'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/OpcionesFirmaOfertar/00 - Distancia'), 
    FailureHandling.STOP_ON_FAILURE)

'Validar envio de cliente'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/08 - ValidarCliente'))

'Guardar operacion'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/ValidacionClienteBotones/GuardarCliente'))

'Espera que cargue pantalla'
WebUI.delay(5)

'Termina Proceso de Oferta'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/01 - Emergentes/AceptarOfertar'))

'Espera que cargue pantalla'
WebUI.delay(20)

'Foto de estado de cliente'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\Homologacion\\Ofertar\\Ofertar.png')

