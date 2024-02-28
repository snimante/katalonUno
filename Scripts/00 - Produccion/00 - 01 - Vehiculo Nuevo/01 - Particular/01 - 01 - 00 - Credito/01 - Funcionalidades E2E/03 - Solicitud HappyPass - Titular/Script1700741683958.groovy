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
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\VNT01.png')

'4 - Modelo de Coche'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/02 - 00 - BotonesVehiculo/CalcularOferta'))

'4 - Modelo de Coche'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\VNT02.png')

'4 - Modelo de Coche'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/02 - 00 - BotonesVehiculo/AceptarOferta'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/03 - Baremos/00 - SimulacionBaremo'))

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
    NIFComprador)

'8 - Solicitud'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/01 - Emergentes/AceptarNoCliente'))

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/ApellidoSolicitar'), 
    'Avila')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/NombreSolicitar'), 
    'Roberto')

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

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/Fingreso'), '01012015')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/RazonSocial'), 'Prueba razon social')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/CIFempresa'), '26020872Y')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/MensualidadPrestamo'), 
    '100')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/NetoMensual'), '2500')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/CNAE'), 'FA05')

'8 - Solicitud'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/idProfesion'), 'TÉCNICOS Y PROFESIONALES CIENTIFICOS E INTELECTUALES')

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
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\VNT03.png')

'8 - Solicitud'
WebUI.click(findTestObject('01 - Vuelo/SalirSolicitud'))

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
WebUI.setText(findTestObject('01 - Solicitudes/01 - Buscador/Filtros Busqueda/CampoNif'), NIFComprador)

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
WebUI.delay(700)

'14 - Contratar solicitud'
WebUI.setText(findTestObject('01 - Vuelo/NifVerificacion'), NIFComprador)

'14 - Contratar solicitud'
WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

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

WebUI.click(findTestObject('Produccion Busqueda Solicitudes/busquedaOperaciones'))

WebUI.setText(findTestObject('Produccion Busqueda Solicitudes/nifContratacion'), NIFComprador)

WebUI.click(findTestObject('Produccion Busqueda Solicitudes/operacion'))

WebUI.click(findTestObject('Produccion Busqueda Solicitudes/operacionContratacion'))

WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'))

WebUI.click(findTestObject('Produccion Busqueda Solicitudes/firmaManual'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/03 - Datos Firma/CerrarManualAvalista'))

WebUI.click(findTestObject('Produccion Busqueda Solicitudes/BotonesContratar/SalirDetalleOperacion'))

WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\test3.png')

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

