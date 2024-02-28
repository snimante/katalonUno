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

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/02 - 00 - BotonesVehiculo/CalcularOferta'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/02 - 00 - BotonesVehiculo/AceptarOferta'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/03 - Baremos/00 - SimulacionBaremo'))

WebUI.delay(2)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 00 - Opciones/00 - OpcionesOferta'))

WebUI.delay(5)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 03 - Solicitar/03 - Solicitar'))

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/00 - Vendedor/NIFvendedor'), '23312526W')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/NIFCliente'), 
    NIFComprador)

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
    '400')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/NetoMensual'), '2000')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/CNAE'), 'FA05')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/05 - Laboral/idProfesion'), 'TÉCNICOS Y PROFESIONALES CIENTIFICOS E INTELECTUALES')

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/04 - Datos Firma/ValidarFirma'))

WebUI.delay(5)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/GuardarEnvioDocumentacion'))

WebUI.delay(15)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/00 - Datos Cliente/Z - Emergentes/ConfirmarCliente'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/00 - AnadirAvalista'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/00 - DatosCliente/NIFClienteAvalista'))

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/00 - DatosCliente/NIFClienteAvalista'), 
    NIFAvalista)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/07 - Ofertar/01 - Emergentes/AceptarNoCliente'))

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/00 - DatosCliente/ApellidoSolicitarAvalista'), 
    'ApeSolicitar')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/00 - DatosCliente/NombreSolicitarAvalista'), 
    'NomSolicitar')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/01 - Datos Contacto/CPSolicitudAvalista'), 
    '15001')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/01 - Datos Contacto/LocalidadSolicitudAvalista'), 
    'Coruña')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/00 - DatosCliente/FechaSolicitarAvalista'), 
    '26081987')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/01 - Datos Contacto/NombreViaSolicitudAvalista'), 
    'PruebaVia')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/01 - Datos Contacto/NumeroViaSolicitudAvalista'), 
    '10')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/01 - Datos Contacto/TelefonoSolicitudAvalista'), 
    '687393984')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/01 - Datos Contacto/MailSolicitudAvalista'), 
    'rober.avila87@gmail.com')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/00 - DatosCliente/NumDependientesAvalista'), 
    '1')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/02 - Datos Vivienda/FechaViviendaSolicitudAvalista'), 
    '01012010')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/02 - Datos Vivienda/imHipotecario'), 
    '500')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/02 - Datos Vivienda/porcentajeHipotecario'), 
    '50')

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/03 - Datos Firma/FirmaManulAvalista'))

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/04 - Laboral Avalista/FingresoAvalista'), 
    '01012015')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/04 - Laboral Avalista/RazonSocialAvalista'), 
    'Prueba razon social')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/04 - Laboral Avalista/CIFempresaAvalista'), 
    '26020872Y')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/04 - Laboral Avalista/MensualidadPrestamoAvalista'), 
    '200')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/04 - Laboral Avalista/NetoMensualAvalista'), 
    '2500')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/04 - Laboral Avalista/CNAEAvalista'), 
    'FA05')

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/04 - Laboral Avalista/idProfesionAvalista'), 
    'TÉCNICOS Y PROFESIONALES CIENTIFICOS E INTELECTUALES')

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/03 - Datos Firma/ValidarFirmaAvalista'))

WebUI.delay(5)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/03 - Datos Firma/CerrarManualAvalista'))

WebUI.delay(15)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/06 - BotonesSolicitud/AceptarSolicitar'))

WebUI.click(findTestObject('01 - Vuelo/SalirSolicitud'))

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Abaco)

WebUI.delay(2)

WebUI.click(findTestObject('01 - Solicitudes/00 - Acceso/Solicitud - Contratar'))

WebUI.switchToWindowTitle('MFS')

WebUI.setText(findTestObject('01 - Solicitudes/01 - Buscador/Filtros Busqueda/CampoNif'), NIFComprador)

WebUI.delay(5)

WebUI.delay(500)

WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'))

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar de ventana/AceptarVentanaUno'))

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/AceptarSolicitudCambio'))

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/OpcionesAceptar/LiquizDelTitular'))

WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptar'))

WebUI.delay(5)

WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptar'))

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Abaco)

WebUI.delay(5)

WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/AccesoVrificación'))

WebUI.switchToWindowTitle('MFS')

WebUI.delay(10)

WebUI.setText(findTestObject('01 - Vuelo/NifVerificacion'), NIFComprador)

WebUI.delay(10)

WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'))

WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/PasarVerificacion'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/AceptarDNI'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/JBacanrioAceptar'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/ConsentimientoVeracidadSI'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/SveracidadAceptar'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/EstadoFirmaCompleatada'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/Nomina'))

WebUI.delay(5)

WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/VerificaciónFinal'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Avalista 1/SeleccionarAvalista'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Avalista 1/DNIAvalista'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Avalista 1/ConsetimientoVedaconAvalista'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Avalista 1/EstadoFirmaAvalista'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Avalista 1/SolicitudVedacon'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Avalista 1/NominaAvalista'))

WebUI.delay(5)

WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/VerificaciónFinal'))

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/CerrarVerificación'))

WebUI.delay(20)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.Abaco)

WebUI.delay(2)

WebUI.click(findTestObject('01 - Solicitudes/00 - Acceso/Solicitud - Contratar'))

WebUI.switchToWindowTitle('MFS')

WebUI.delay(500)

WebUI.setText(findTestObject('01 - Vuelo/NifVerificacion'), NIFComprador)

WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'))

WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/Produccion'))

WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/ContratarProduccion'))

WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/chasisProduccion'), '1234567890fnxdfgw')

WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/MatriculaProduccion'), '3592FNX')

WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/Fecha'), '01012015')

WebUI.delay(2)

WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptar'))

WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/AceptarChasis'))

WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/MotivoChasis'))

WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptarDos'))

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

WebUI.click(findTestObject('Produccion Busqueda Solicitudes/operacion'))

WebUI.click(findTestObject('Produccion Busqueda Solicitudes/operacionContratacion'))

WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'))

WebUI.click(findTestObject('Produccion Busqueda Solicitudes/firmaManual'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/02 - Avalista/03 - Datos Firma/CerrarManualAvalista'))

WebUI.delay(10)

WebUI.click(findTestObject('Produccion Busqueda Solicitudes/BotonesContratar/SalirDetalleOperacion'))

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

WebUI.click(findTestObject('Avanza/Bueno/PestanaDatosFinancieros'))

WebUI.click(findTestObject('Avanza/Bueno/PestanaPrestaciones'))

WebUI.click(findTestObject('Avanza/Bueno/PentanaOperacionesEspeciales'))

WebUI.click(findTestObject('Avanza/Bueno/PestanaGestionImpagos'))

WebUI.scrollToPosition(0, 150)

