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
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), '12000')

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

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/A - 01- Comunes - SeleccionCliente/00 - SeleccionCliente'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/A - 01- Comunes - SeleccionCliente/Empresa/Empresas'))

'6 - Selección Producto'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/B - 01 - Comunes - SeleccionProducto/SeleccionProducto'))

'6 - Selección Producto'
WebUI.delay(2)

'Funcionalidad Solicitud - 6 - Opciones'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 00 - Opciones/00 - OpcionesOferta'))

'7 - Opciones'
WebUI.delay(5)

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 03 - Solicitar/03 - NewSolicitar'), FailureHandling.OPTIONAL)

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/00 - Vendedor/NIFvendedor'), '23312526W')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/EmpresaNueva/00 - Datos Empresa/Razon Social'), 
    'Vass')

'Funcionalidad Solicitud - 5 Empezar Demo'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/EmpresaNueva/00 - Datos Empresa/CIFNIF'), 
    'D61748158')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/01 - Emergentes/AceptarNoCliente'))

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/EmpresaNueva/00 - Datos Empresa/CNAE'), '2562')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/CPSolicitud'), 
    '28044')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/LocalidadSolicitud'), 
    'Madrid')

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/SeleccionViaSolicitud'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/TipoVia'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/NombreViaSolicitud'), 
    'Del tren')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/NumeroViaSolicitud'), 
    '1')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/MailSolicitud'), 
    'rober.avila87@gmail.com')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/EmpresaNueva/04 - Dato Contacto/TelefoContacto'), 
    '687393983', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/EmpresaNueva/01 - Datos Apoderado/NIFAopedaro'), 
    '20281019X')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/EmpresaNueva/01 - Datos Apoderado/ApellidoApoderado'), 
    'Avis')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/EmpresaNueva/01 - Datos Apoderado/NombreApoderado'), 
    'Robert')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/EmpresaNueva/01 - Datos Apoderado/fechaApoderado'), 
    '26081987')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/EmpresaNueva/01 - Datos Apoderado/CPApoderado'), 
    '28044')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/EmpresaNueva/01 - Datos Apoderado/Notario'), 
    'Notariado')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/EmpresaNueva/01 - Datos Apoderado/fpoder'), 
    '25012000')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/EmpresaNueva/05 - Datos de Registro/Fconstitucion'), 
    '25012000')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/EmpresaNueva/02 - Datos Bancarios/NombreBanco'), 
    'Santander')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/03 - Datos Bancarios/IBAN1Solicitud'), 
    'ES55')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/03 - Datos Bancarios/IBAN2Solicitud'), 
    '1465')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/03 - Datos Bancarios/IBAN3Solicitud'), 
    '0100')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/03 - Datos Bancarios/IBAN4Solicitud'), 
    '9117')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/03 - Datos Bancarios/IBAN5Solicitud'), 
    '4900')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/03 - Datos Bancarios/IBAN6Solicitud'), 
    '4779')

'Funcionalidad Solicitud - 5 Empezar Demo'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/EmpresaNueva/03 - Datos Firma/FirmaImpreso'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/EmpresaNueva/03 - Datos Firma/Imprimir'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/EmpresaNueva/03 - Datos Firma/CerrarImpreso'))

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/06 - BotonesSolicitud/AceptarSolicitar'))

'Funcionalidad Solicitud - 5 Empezar Demo'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/06 - BotonesSolicitud/SalirSolicitud'))

