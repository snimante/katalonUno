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

WebUI.delay(5)

WebUI.scrollToPosition(0, 120)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/00 - Acceso/AccesoProduccion'))

WebUI.switchToWindowTitle('MFS')

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), '10404')

WebUI.delay(2)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VO/00 - Acceso/SeleccionVO'))

WebUI.click(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/TipodeVehiculo'))

WebUI.click(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/TipodeVehiculoParticular'))

WebUI.click(findTestObject('VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/Carburante'))

WebUI.click(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/CarburanteDiesel'))

WebUI.click(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/Modelo'))

WebUI.click(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/EspaceDiesel 20-23'))

WebUI.click(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/Version'))

WebUI.click(findTestObject('VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/VersionEspaceBlueDCI'))

WebUI.setText(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Otros/MatriculaVO'), 
    '3592FNX')

WebUI.setText(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Otros/FechaMatriculaciónVO'), 
    '01/01/2022')

WebUI.setText(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Otros/Kilometros'), 
    '20000')

WebUI.setText(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Otros/PrecioVehiculo'), 
    '25000')

WebUI.click(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/Botones/AceptarVehiculoOcacion'))

WebUI.click(findTestObject('VO - Opciones/Produccion - VO - Solicitar/Simulación/OpcionesSimulación/Opciones'))

WebUI.delay(10)

WebUI.click(findTestObject('VO - Opciones/Produccion - VO - Solicitar/Simulación/OpcionesSimulación/Ofertas'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/01 - Emergentes/AceptarComprobarSeguro'))

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/00 - NIF'), '66830245L')

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/01 - Emergentes/AceptarNoCliente'))

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/01 - Apellidos'), 'Prueba')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/02 - Nombre'), 'PruebaNombre')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/03 - CP'), '15001')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/04 - Localidad'), 'PruebaLocalidad')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/05 - Via'), 'PruebaVia')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/06 - Telefono'), '687393983')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/07 - mail'), 'rober.avila87@gmail.com')

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/OpcionesFirmaOfertar/00 - Distancia'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/08 - ValidarCliente'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/00 - OfertarCliente/ValidacionClienteBotones/GuardarCliente'))

