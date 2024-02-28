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

'Funcionalidad Solicitud - 1 - Acceso Abaco'
WebUI.openBrowser('')

'Funcionalidad Solicitud - 1 - Acceso Abaco'
WebUI.maximizeWindow()

'Funcionalidad Solicitud - 1 - Acceso Abaco'
WebUI.navigateToUrl(GlobalVariable.Abaco)

'Funcionalidad Solicitud - 1 - Acceso Abaco'
WebUI.waitForPageLoad(10)

'Funcionalidad Solicitud - 1 - Acceso Abaco'
WebUI.scrollToPosition(0, 120)

'Funcionalidad Solicitud - 1 - Acceso Abaco'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/00 - Acceso/AccesoProduccion'))

'Funcionalidad Solicitud - 1 - Acceso Abaco'
WebUI.switchToWindowTitle('MFS')

'Funcionalidad Solicitud - 2 - Punto de Red'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), FailureHandling.STOP_ON_FAILURE)

'Funcionalidad Solicitud - 2 - Punto de Red'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), '10404')

'Funcionalidad Solicitud - 2 - Punto de Red'
WebUI.delay(2)

'Funcionalidad Solicitud - 3 - Selección de VN'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelectVN'))

'Funcionalidad Solicitud - 2 - Punto de Red'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectModelo'))

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.delay(2)

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectClio'))

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectCarburante'))

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.delay(2)

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectDiesel'))

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectVersion'))

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.delay(2)

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/VersionNombre'))

'Funcionalidad Solicitud - 4 - Modelo de cohe'
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

'Funcionalidad Solicitud - 5 - Baremos'
WebUI.delay(15)

'Funcionalidad Solicitud - 6 - Opciones'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 00 - Opciones/00 - OpcionesOferta'))

'Funcionalidad Solicitud - 6 - Opciones'
WebUI.delay(5)

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 03 - Solicitar/03 - NewSolicitar'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 03 - Solicitar/03 - 01 - SolictarCajaTres'), 
    FailureHandling.OPTIONAL)

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/00 - Vendedor/NIFvendedor'), '23312526W')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/NIFCliente'), 
    NIFComprador)

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/01 - Emergentes/AceptarNoCliente'), FailureHandling.OPTIONAL)

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/ApellidoSolicitar'), 
    'ApeSolicitar')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/NombreSolicitar'), 
    'NomSolicitar')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/CPSolicitud'), 
    '15001')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/LocalidadSolicitud'), 
    'Coruña')

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
    '687393983', FailureHandling.OPTIONAL)

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
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/Fingreso'), '01012015')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/RazonSocial'), 'Prueba razon social')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/CIFempresa'), '26020872Y')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/MensualidadPrestamo'), 
    '500')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/NetoMensual'), '2200')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/CNAE'), 'FA05')

'Funcionalidad Solicitud - 7 - Solicitar'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/idProfesion'), 'TÉCNICOS Y PROFESIONALES CIENTIFICOS E INTELECTUALES')

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

'Funcionalidad Aceptar Solicitud - 1 - Acceso Abaco'
WebUI.openBrowser('')

'Funcionalidad Aceptar Solicitud - 1 - Acceso Abaco'
WebUI.maximizeWindow()

'Funcionalidad Aceptar Solicitud - 1 - Acceso Abaco'
WebUI.navigateToUrl(GlobalVariable.Abaco)

'Funcionalidad Aceptar Solicitud - 1 - Acceso Abaco'
WebUI.delay(2)

'Funcionalidad Aceptar Solicitud - 1 - Acceso Abaco'
WebUI.click(findTestObject('01 - Solicitudes/00 - Acceso/Solicitud - Contratar'))

'Funcionalidad Aceptar Solicitud - 1 - Acceso Abaco'
WebUI.switchToWindowTitle('MFS')

'Funcionalidad Aceptar Solicitud - 1 - Acceso Abaco'
WebUI.delay(5)

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.setText(findTestObject('01 - Solicitudes/01 - Buscador/Filtros Busqueda/CampoNif'), NIFComprador)

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.delay(300)

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'))

WebUI.delay(5)

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar de ventana/AceptarVentanaUno'), FailureHandling.OPTIONAL)

'Funcionalidad Solicitud - Evidencia estado 1'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\AceptarSolicitud\\AceptarSolicitud1.png', 
    FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - Opcional Para EA'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/Rellenar Ficha/RellenarFicha'), FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - Opcional Para EA'
WebUI.setText(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/Rellenar Ficha/NotaRiskScore'), '5', FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - Opcional Para EA'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/Rellenar Ficha/BotonSiguienteRellenarFicha'), 
    FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - Opcional Para EA'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/Rellenar Ficha/emergenteSIRiskscore'), FailureHandling.OPTIONAL)

'Funcionalidad Solicitud - Evidencia estado 2'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\AceptarSolicitud\\AceptarSolicitud2.png', 
    FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - Opcional Para EA'
WebUI.click(findTestObject('01 - Solicitudes/XX - Genericos/Ventana/cerrarVentanaSolicitudOpcion'), FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'), FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistroSolicitud'), FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistroSolicitudDos'), FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar de Ventana Segundo Acceso/AceptarVentanaUnoSegundoAcceso'), 
    FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/AceptarSegundaAcceso'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar de Ventana Segundo Acceso/AceptarVentanaDosSegundoAcceso'), 
    FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/AceptarSegundaAcceso'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar de Ventana Segundo Acceso/AceptarVentanaTresSegundoAcceso'), 
    FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/AceptarSegundaAcceso'), FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/OpcionesAceptar/LiquizDelTitular'))

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptar'))

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.delay(5)

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptar'))

'Funcionalidad Solicitud - Evidencia estado 3'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\AceptarSolicitud\\AceptarSolicitud3.png', 
    FailureHandling.OPTIONAL)

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/XX - Genericos/Ventana/cerrarVentanaSolicitudOpcion'), FailureHandling.OPTIONAL)

'11 - Acceso Abaco Verificación'
WebUI.openBrowser('')

'11 - Acceso Abaco Verificación'
WebUI.maximizeWindow()

'11 - Acceso Abaco Verificación'
WebUI.navigateToUrl(GlobalVariable.Abaco)

'11 - Acceso Abaco Verificación'
WebUI.delay(5)

'11 - Acceso Abaco Verificación'
WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/AccesoVrificación'))

'11 - Acceso Abaco Verificación'
WebUI.switchToWindowTitle('MFS')

'11 - Acceso Abaco Verificación'
WebUI.delay(10)

'12 - Verificar Documentos'
WebUI.setText(findTestObject('01 - Vuelo/NifVerificacion'), NIFComprador)

'12 - Verificar Documentos'
WebUI.delay(10)

'12 - Verificar Documentos'
WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

'12 - Verificar Documentos'
WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'))

'12 - Verificar Documentos'
WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/PasarVerificacion'))

'12 - Verificar Documentos'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/AceptarDNI'))

'12 - Verificar Documentos'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/JBacanrioAceptar'))

'12 - Verificar Documentos'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/ConsentimientoVeracidadSI'))

'12 - Verificar Documentos'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/SveracidadAceptar'))

'12 - Verificar Documentos'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/EstadoFirmaCompleatada'))

'12 - Verificar Documentos'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/Nomina'))

'12 - Verificar Documentos'
WebUI.delay(5)

'12 - Verificar Documentos'
WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/VerificaciónFinal'))

WebUI.delay(10)

'12 - Verificar Documentos'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/CerrarVerificación'), FailureHandling.CONTINUE_ON_FAILURE)

'12 - Verificar Documentos'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/CerrarVerificacionDos'), FailureHandling.OPTIONAL)

WebUI.delay(10)

'12 - Verificar Documentos'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\test2.png')

WebUI.closeBrowser()

'12 - Verificar Documentos'
WebUI.delay(20)

'13 - Acceso Abaco Solicitud'
WebUI.openBrowser('')

'13 - Acceso Abaco Solicitud'
WebUI.maximizeWindow()

'13 - Acceso Abaco Solicitud'
WebUI.navigateToUrl(GlobalVariable.Abaco)

'13 - Acceso Abaco Solicitud'
WebUI.delay(2)

'13 - Acceso Abaco Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/00 - Acceso/Solicitud - Contratar'))

'13 - Acceso Abaco Solicitud'
WebUI.switchToWindowTitle('MFS')

'13 - Acceso Abaco Solicitud'
WebUI.delay(500)

'14 - Contratar solicitud'
WebUI.setText(findTestObject('01 - Vuelo/NifVerificacion'), NIFComprador)

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

WebUI.delay(10)

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'))

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/Produccion'))

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/ContratarProduccion'))

'14 - Contratar solicitud'
WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/chasisProduccion'), '1234567890fnxdfgw')

'14 - Contratar solicitud'
WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/MatriculaProduccion'), '3592FNX')

'14 - Contratar solicitud'
WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/Fecha'), '01012015')

'14 - Contratar solicitud'
WebUI.delay(2)

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptar'))

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/AceptarChasis'))

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/MotivoChasis'))

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptarDos'))

'14 - Contratar solicitud'
WebUI.delay(10)

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Solicitudes/XX - Genericos/Ventana/cerrarVentanaSolicitudOpcion'), FailureHandling.OPTIONAL)

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Solicitudes/XX - Genericos/Ventana/CerrarSolicitud'), FailureHandling.OPTIONAL)

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Solicitudes/XX - Genericos/Ventana/cerrarVentanaSolicitud'), FailureHandling.OPTIONAL)

'15 - Firmar contratación.'
WebUI.openBrowser('')

'15 - Firmar contratación.'
WebUI.maximizeWindow()

'15 - Firmar contratación.'
WebUI.navigateToUrl(GlobalVariable.Abaco)

'15 - Firmar contratación.'
WebUI.delay(2)

'15 - Firmar contratación.'
WebUI.scrollToPosition(0, 120)

'15 - Firmar contratación.'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/00 - Acceso/AccesoProduccion'))

'15 - Firmar contratación.'
WebUI.switchToWindowTitle('MFS')

'15 - Firmar contratación.'
WebUI.delay(2)

'15 - Firmar contratación.'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), FailureHandling.STOP_ON_FAILURE)

'15 - Firmar contratación.'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), '10404')

'15 - Firmar contratación.'
WebUI.delay(2)

'15 - Firmar contratación.'
WebUI.click(findTestObject('Produccion Busqueda Solicitudes/busquedaOperaciones'))

'15 - Firmar contratación.'
WebUI.setText(findTestObject('Produccion Busqueda Solicitudes/nifContratacion'), NIFComprador)

'15 - Firmar contratación.'
WebUI.click(findTestObject('Produccion Busqueda Solicitudes/operacion'))

'15 - Firmar contratación.'
WebUI.click(findTestObject('Produccion Busqueda Solicitudes/operacionContratacion'))

'15 - Firmar contratación.'
WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'))

'15 - Firmar contratación.'
WebUI.click(findTestObject('Produccion Busqueda Solicitudes/firmaManual'))

'15 - Firmar contratación.'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/03 - Datos Firma/CerrarManualAvalista'))

'15 - Firmar contratación.'
WebUI.click(findTestObject('Produccion Busqueda Solicitudes/BotonesContratar/SalirDetalleOperacion'))

'15 - Firmar contratación.'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\test3.png')

'16 - Avanza'
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://rci-omegapre.vll.renault.es/Omega/security/login.do')

WebUI.setText(findTestObject('Avanza/Bueno/InformarUsuarioAvanza'), 'PS13116')

WebUI.setEncryptedText(findTestObject('Object Repository/Avanza/Bueno/InformarContraSeñaAvanza'), 'hDbHQ6BUgZRp97lo1YEtgg==')

WebUI.click(findTestObject('Avanza/Bueno/AceptarAccederAvanza'))

WebUI.click(findTestObject('Avanza/Bueno/SeleccionarBusquedaCesta'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Avanza/Page_Avanzav24.15.0/a_Buscar contrato'))

WebUI.click(findTestObject('Avanza/Bueno/BusquedaDNI'))

WebUI.setText(findTestObject('Avanza/Bueno/BusquedaDNI'), NIFComprador)

WebUI.click(findTestObject('Object Repository/Avanza/Page_Avanzav24.15.0/button_Buscar'))

WebUI.click(findTestObject('Object Repository/Avanza/Page_Avanzav24.15.0/img_Gestin normal - Activo_width-20-px clic_267c21'))

WebUI.click(findTestObject('Avanza/Bueno/PestanaCliente'))

WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\test4.png')

WebUI.click(findTestObject('Avanza/Bueno/PestanaDatosFinancieros'))

WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\test5.png')

WebUI.click(findTestObject('Avanza/Bueno/PestanaPrestaciones'))

WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\test6.png')

WebUI.click(findTestObject('Avanza/Bueno/PentanaOperacionesEspeciales'), FailureHandling.OPTIONAL)

WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\test7.png', 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Avanza/Bueno/PestanaGestionImpagos'), FailureHandling.OPTIONAL)

WebUI.scrollToPosition(0, 150, FailureHandling.OPTIONAL)

