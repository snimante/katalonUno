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
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), '10404')

'2 - Punto de Red'
WebUI.delay(2)

'3 - Selección de VN'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelectVN'))

'4 - Modelo de Coche'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectModelo'))

'4 - Modelo de Coche'
WebUI.delay(2)

'4 - Modelo de Coche'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectClio'))

'4 - Modelo de Coche'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectCarburante'))

'4 - Modelo de Coche'
WebUI.delay(2)

'4 - Modelo de Coche'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectDiesel'))

'4 - Modelo de Coche'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectVersion'))

'4 - Modelo de Coche'
WebUI.delay(2)

'4 - Modelo de Coche'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/Versionseleccionada'))

'4 - Modelo de Coche'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/Complemento1'))

'4 - Modelo de Coche'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/02 - 00 - BotonesVehiculo/CalcularOferta'))

'4 - Modelo de Coche'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/02 - 00 - BotonesVehiculo/AceptarOferta'))

'5 - Selección cliente'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/A - 01- Comunes - SeleccionCliente/00 - SeleccionCliente'))

'5 - Selección cliente'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/A - 01- Comunes - SeleccionCliente/Profesionales/Profesionales'))

'6 - Selección Producto'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/B - 01 - Comunes - SeleccionProducto/SeleccionProducto'))

'6 - Selección Producto'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/B - 01 - Comunes - SeleccionProducto/Leasing/Leasing'))

'6 - Selección Producto'
WebUI.delay(2)

'7 - Opciones'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 00 - Opciones/00 - OpcionesOferta'))

'7 - Opciones'
WebUI.delay(5)

'7 - Opciones'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 03 - Solicitar/03 - Solicitar'))

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/00 - Vendedor/NIFvendedor'), '23312526W')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/NIFCliente'), 
    DNIProfesional)

'8 - Solicitud'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/01 - Emergentes/AceptarNoCliente'))

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/ApellidoSolicitar'), 
    'ApeSolicitar')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/NombreSolicitar'), 
    'NomSolicitar')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/CPSolicitud'), 
    '15001')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/LocalidadSolicitud'), 
    'Coruña')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/FechaSolicitar'), 
    '26081987')

'8 - Solicitud'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/SeleccionViaSolicitud'))

'8 - Solicitud'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/TipoVia'))

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/NombreViaSolicitud'), 
    'PruebaVia')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/NumeroViaSolicitud'), 
    '10')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/TelefonoSolicitud'), 
    '687393983')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/MailSolicitud'), 
    'rober.avila87@gmail.com')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/NumDependientes'), 
    '1')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/02 - Datos vivienda/FechaViviendaSolicitud'), 
    '01012010')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/03 - Datos Bancarios/IBAN1Solicitud'), 
    'ES55')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/03 - Datos Bancarios/IBAN2Solicitud'), 
    '1465')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/03 - Datos Bancarios/IBAN3Solicitud'), 
    '0100')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/03 - Datos Bancarios/IBAN4Solicitud'), 
    '9117')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/03 - Datos Bancarios/IBAN5Solicitud'), 
    '4900')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/03 - Datos Bancarios/IBAN6Solicitud'), 
    '4779')

'8 - Solicitud'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/04 - Datos Firma/FirmaDistancia'))

'8 - Solicitud Leasing'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/A - 01- Comunes - SeleccionCliente/Profesionales/SolicitudCamposLeasing/FechaAltaIAE'), 
    '26082020')

'8 - Solicitud Leasing'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/A - 01- Comunes - SeleccionCliente/Profesionales/SolicitudCamposLeasing/rendimientoNeto'), 
    '20000')

'8 - Solicitud Leasing'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/A - 01- Comunes - SeleccionCliente/Profesionales/SolicitudCamposLeasing/brutoAnual'), 
    '15000')

'8 - Solicitud Leasing'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/A - 01- Comunes - SeleccionCliente/Profesionales/SolicitudCamposLeasing/comboPropiedadLocal'))

'8 - Solicitud Leasing'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/A - 01- Comunes - SeleccionCliente/Profesionales/SolicitudCamposLeasing/LocalPropio'))

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/CNAE'), '6820')

'8 - Solicitud Leasing'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/A - 01- Comunes - SeleccionCliente/Profesionales/SolicitudCamposLeasing/mensualidadPrestamo'), 
    '1000')

'8 - Solicitud'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/04 - Datos Firma/ValidarFirma'))

'8 - Solicitud'
WebUI.delay(5)

'8 - Solicitud'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/GuardarEnvioDocumentacion'))

'8 - Solicitud'
WebUI.delay(15)

'8 - Solicitud'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/Z - Emergentes/ConfirmarCliente'))

'8 - Solicitud'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/06 - BotonesSolicitud/AceptarSolicitar'))

'8 - Solicitud'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\test1.png')

'8 - Solicitud'
WebUI.click(findTestObject('01 - Vuelo/SalirSolicitud'))

