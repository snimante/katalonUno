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

WebUI.click(findTestObject('VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/anoOcacion'))

WebUI.click(findTestObject('VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/agnoSeleccion'))

WebUI.click(findTestObject('VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/TipodeVehiculo'))

WebUI.click(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/TipodeVehiculoParticular'))

WebUI.click(findTestObject('VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/Carburante'))

WebUI.click(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/CarburanteDiesel'))

WebUI.click(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/Modelo'))

WebUI.click(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/EspaceDiesel 20-23'))

WebUI.click(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/Version'))

WebUI.click(findTestObject('VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/VersionEspaceBlueDCI'))

WebUI.setText(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Otros/MatriculaVO'), 
    '3592KKK')

WebUI.setText(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Otros/FechaMatriculaciónVO'), 
    '01/01/2022')

WebUI.setText(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Otros/Kilometros'), 
    '20000')

WebUI.setText(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Otros/PrecioVehiculo'), 
    '45000')

WebUI.click(findTestObject('Object Repository/VO - Opciones/Produccion - VO - Solicitar/Vehiculo Ocasión/Selección Vehiculo/Botones/AceptarVehiculoOcacion'))

WebUI.delay(40)

WebUI.click(findTestObject('VO - Opciones/Produccion - VO - Solicitar/Simulación/OpcionesSimulación/Opciones'))

WebUI.click(findTestObject('VO - Opciones/Produccion - VO - Solicitar/Simulación/OpcionesSimulación/Solicitar'))

WebUI.delay(5)

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/00 - Vendedor/NIFvendedor'), '23312526W')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/NIFCliente'), 
    DNIcomprador)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/01 - Emergentes/AceptarNoCliente'))

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/ApellidoSolicitar'), 
    'ApeSolicitar')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/NombreSolicitar'), 
    'NomSolicitar')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/CPSolicitud'), 
    '15001')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/LocalidadSolicitud'), 
    'Coruña')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/FechaSolicitar'), 
    '26081987')

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/SeleccionViaSolicitud'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/TipoVia'))

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/NombreViaSolicitud'), 
    'PruebaVia')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/NumeroViaSolicitud'), 
    '10')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/TelefonoSolicitud'), 
    '687393983')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/01 - Datos de Contacto/MailSolicitud'), 
    'rober.avila87@gmail.com')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/NumDependientes'), 
    '1')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/02 - Datos vivienda/FechaViviendaSolicitud'), 
    '01012010')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/03 - Datos Bancarios/IBAN1Solicitud'), 
    'ES55')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/03 - Datos Bancarios/IBAN2Solicitud'), 
    '1465')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/03 - Datos Bancarios/IBAN3Solicitud'), 
    '0100')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/03 - Datos Bancarios/IBAN4Solicitud'), 
    '9117')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/03 - Datos Bancarios/IBAN5Solicitud'), 
    '4900')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/03 - Datos Bancarios/IBAN6Solicitud'), 
    '4779')

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/04 - Datos Firma/FirmaDistancia'))

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/Fingreso'), '01012015')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/RazonSocial'), 'Prueba razon social')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/CIFempresa'), '26020872Y')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/MensualidadPrestamo'), 
    '100')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/NetoMensual'), '2000')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/CNAE'), 'FA05')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/idProfesion'), 'TÉCNICOS Y PROFESIONALES CIENTIFICOS E INTELECTUALES')

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/04 - Datos Firma/ValidarFirma'))

WebUI.delay(5)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/GuardarEnvioDocumentacion'))

WebUI.delay(30)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/Z - Emergentes/ConfirmarCliente'))

WebUI.delay(10)

WebUI.click(findTestObject('Solicitar/AceptarSolicitarVO'))

WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\VO1.png')

WebUI.delay(20)

'9 - Acceso Abaco Solicitud'
WebUI.openBrowser('')

'9 - Acceso Abaco Solicitud'
WebUI.maximizeWindow()

'9 - Acceso Abaco Solicitud'
WebUI.navigateToUrl(GlobalVariable.Abaco)

'9 - Acceso Abaco Solicitud'
WebUI.delay(2)

'9 - Acceso Abaco Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/00 - Acceso/Solicitud - Contratar'))

'9 - Acceso Abaco Solicitud'
WebUI.switchToWindowTitle('MFS')

'9 - Acceso Abaco Solicitud'
WebUI.delay(5)

'10 - Aceptar Solicitud'
WebUI.setText(findTestObject('01 - Solicitudes/01 - Buscador/Filtros Busqueda/CampoNif'), DNIcomprador)

'10 - Aceptar Solicitud'
WebUI.delay(500)

'10 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

'10 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'))

'10 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar de ventana/AceptarVentanaUno'))

'10 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/AceptarSolicitudCambio'))

'10 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/OpcionesAceptar/LiquizDelTitular'))

'10 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptar'))

'10 - Aceptar Solicitud'
WebUI.delay(5)

'10 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptar'))

WebUI.delay(10)

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
WebUI.setText(findTestObject('01 - Vuelo/NifVerificacion'), DNIcomprador)

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
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/InformacionPrecontractual'))

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

'12 - Verificar Documentos'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/CerrarVerificación'))

'12 - Verificar Documentos'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\test2.png')

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
WebUI.delay(200)

'14 - Contratar solicitud'
WebUI.setText(findTestObject('01 - Vuelo/NifVerificacion'), DNIcomprador)

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'))

WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/Produccion'))

WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/ContratarProduccion'))

WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/chasisProduccion'), '1234567800fnxdfgw')

WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/MatriculaProduccion'), '3592FNX')

WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/Fecha'), '01/01/2022')

WebUI.delay(2)

WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptar'))

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
WebUI.setText(findTestObject('Produccion Busqueda Solicitudes/nifContratacion'), DNIcomprador)

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
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\VO3.png')

'XXXXXXXXXXXX'
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://rci-omegapre.vll.renault.es/Omega/security/login.do')

WebUI.setText(findTestObject('Avanza/Bueno/InformarUsuarioAvanza'), 'PS13116')

WebUI.setEncryptedText(findTestObject('Object Repository/Avanza/Bueno/InformarContraSeñaAvanza'), 'hDbHQ6BUgZR9cXgSdBjBVA==')

WebUI.click(findTestObject('Avanza/Bueno/AceptarAccederAvanza'))

WebUI.click(findTestObject('Avanza/Bueno/SeleccionarBusquedaCesta'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Avanza/Page_Avanzav24.15.0/a_Buscar contrato'))

WebUI.click(findTestObject('Avanza/Bueno/BusquedaDNI'))

WebUI.setText(findTestObject('Avanza/Bueno/BusquedaDNI'), DNIcomprador)

WebUI.click(findTestObject('Object Repository/Avanza/Page_Avanzav24.15.0/button_Buscar'))

WebUI.click(findTestObject('Object Repository/Avanza/Page_Avanzav24.15.0/img_Gestin normal - Activo_width-20-px clic_267c21'))

WebUI.click(findTestObject('Avanza/Bueno/PestanaCliente'))

WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\VO4.png')

WebUI.click(findTestObject('Avanza/Bueno/PestanaDatosFinancieros'))

WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\VO5.png')

WebUI.click(findTestObject('Avanza/Bueno/PestanaPrestaciones'))

WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\VO6.png')

WebUI.click(findTestObject('Avanza/Bueno/PentanaOperacionesEspeciales'))

WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\VO7.png')

WebUI.click(findTestObject('Avanza/Bueno/PestanaGestionImpagos'))

WebUI.scrollToPosition(0, 150)

WebUI.takeScreenshotAsCheckpoint('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\VO8.png')

