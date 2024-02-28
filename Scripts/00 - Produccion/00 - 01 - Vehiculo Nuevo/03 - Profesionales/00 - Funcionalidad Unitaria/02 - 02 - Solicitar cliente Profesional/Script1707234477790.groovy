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

'Funcionalidad Solicitud - 6 - Opciones'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 00 - Opciones/00 - OpcionesOferta'))

'Funcionalidad Solicitud - 6 - Opciones'
WebUI.delay(5)

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 03 - Solicitar/03 - NewSolicitar'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 03 - Solicitar/03 - 01 - SolictarCajaTres'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 03 - Solicitar/03 - Solicitar'), FailureHandling.OPTIONAL)

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/00 - Vendedor/NIFvendedor'), '23312526W')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/NIFCliente'), 
    GlobalVariable.GlobalDNIProfesional)

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/01 - Emergentes/AceptarNoCliente'))

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/ApellidoSolicitar'), 
    'ApeSolicitar')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/NombreSolicitar'), 
    'NomSolicitar')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/CPSolicitud'), 
    cp)

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/LocalidadSolicitud'), 
    localidad)

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/FechaSolicitar'), 
    '26081987', FailureHandling.OPTIONAL)

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/SeleccionViaSolicitud'))

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/TipoVia'))

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/NombreViaSolicitud'), 
    'PruebaVia')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/NumeroViaSolicitud'), 
    '10')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/TelefonoSolicitud'), 
    '687393983')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/MailSolicitud'), 
    'rober.avila87@gmail.com')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/NumDependientes'), 
    '1')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/02 - Datos vivienda/FechaViviendaSolicitud'), 
    '01092022')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/02 - Datos vivienda/ImporteViviendaSolicitud'), 
    '250', FailureHandling.OPTIONAL)

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/02 - Datos vivienda/PorcetajeViviendaSolicitud'), 
    '50', FailureHandling.OPTIONAL)

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

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/04 - Datos Firma/FirmaDistancia'))

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/altaIAElprofesional'), 
    '01012015')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/rendimientoNetoProfesional'), 
    '2000')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/salaryBrutoAnualProfesional'), 
    '30000')

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/propiedadLocalProfesional'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/propiedadLocalSeleccion'), 
    FailureHandling.CONTINUE_ON_FAILURE)

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/CNAE'), '6120')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/MensualidadPrestamo'), 
    '400')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/04 - Datos Firma/ValidarFirma'))

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.delay(5)

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/GuardarEnvioDocumentacion'))

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.delay(15)

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/Z - Emergentes/ConfirmarCliente'))

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/06 - BotonesSolicitud/AceptarSolicitar'))

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.delay(5)

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\Solicitud\\test1.png', 
    FailureHandling.OPTIONAL)

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.click(findTestObject('01 - Vuelo/SalirSolicitud'))

