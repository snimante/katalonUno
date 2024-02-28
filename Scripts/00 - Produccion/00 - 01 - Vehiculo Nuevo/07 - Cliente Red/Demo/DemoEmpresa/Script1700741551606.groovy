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
WebUI.delay(2)

'Funcionalidad Solicitud - 1 - Acceso Abaco'
WebUI.scrollToPosition(0, 120)

'Funcionalidad Solicitud - 1 - Acceso Abaco'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/00 - Acceso/AccesoProduccion'))

'Funcionalidad Solicitud - 1 - Acceso Abaco'
WebUI.switchToWindowTitle('MFS')

'Funcionalidad Solicitud - 1 - Acceso Abaco'
WebUI.delay(2)

'Funcionalidad Solicitud - 1 - Acceso Abaco'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), FailureHandling.STOP_ON_FAILURE)

'Funcionalidad Solicitud - 1 - Acceso Abaco'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), '10404')

'Funcionalidad Solicitud - 1 - Acceso Abaco'
WebUI.delay(2)

'Funcionalidad Solicitud - 1 - Acceso Abaco'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/A - 01- Comunes - SeleccionCliente/00 - SeleccionCliente'))

'Funcionalidad Solicitud - 1 - Acceso Abaco'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/A - 01- Comunes - SeleccionCliente/Cliente Red/ClienteRed'))

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
WebUI.delay(2)

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/SelectVersion'))

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/VersionNombre'))

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/Complemento1'))

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/02 - 00 - BotonesVehiculo/CalculadoraClienteRed'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/02 - 00 - BotonesVehiculo/CalcularOfertaNewDos'), 
    FailureHandling.OPTIONAL)

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/02 - 00 - BotonesVehiculo/CalcularOfertaNew'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/Calis/MensajeCalis'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/Calis/Impuesto'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/Calis/SelectImpuesto'), FailureHandling.OPTIONAL)

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/02 - 00 - BotonesVehiculo/AceptarOfertaClienteRed'), 
    FailureHandling.OPTIONAL)

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/02 - ModeloVehiculo/02 - 00 - BotonesVehiculo/AcpetarOfertaNew'), 
    FailureHandling.OPTIONAL)

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/04 - FechadeNacimiento/FechaNaciento'), '26081987', 
    FailureHandling.OPTIONAL)

'Funcionalidad Solicitud - 4 - Modelo de cohe'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/04 - FechadeNacimiento/AceptarFecha'), FailureHandling.OPTIONAL)

'Funcionalidad Solicitud - 5 Empezar Demo'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 00 - Opciones/00 - OpcionesOfertaCajaTres'))

'Funcionalidad Solicitud - 5 Empezar Demo'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 03 - Solicitar/03 - 01 - SolictarCajaTres'))

'Funcionalidad Solicitud - 5 Empezar Demo'
WebUI.click(findTestObject('Object Repository/00 - VN - Opciones/Otros/EmpresaSolicitar/CamposSolicitud/RadioButtonSeleccionEmpresa'))

'Funcionalidad Solicitud - 5 Empezar Demo'
WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/00 - Vendedor/NIFvendedor'), '30403183N')

'Funcionalidad Solicitud - 5 Empezar Demo'
WebUI.setText(findTestObject('Object Repository/00 - VN - Opciones/Otros/EmpresaSolicitar/CamposSolicitud/CIFNIF'), 'B15954654')

'Funcionalidad Solicitud - 5 Empezar Demo'
WebUI.setText(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/CamposSolicitud/NombreNotarioEmpresa'), 'PruebaNotario')

'Funcionalidad Solicitud - 5 Empezar Demo'
WebUI.setText(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/CamposSolicitud/mailEmpresa'), 'prueba@prueba.es')

'Funcionalidad Solicitud - 5 Empezar Demo'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/06 - BotonesSolicitud/AceptarSolicitar'))

'Funcionalidad Solicitud - 5 Empezar Demo'
WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/01 - Titular/06 - BotonesSolicitud/SalirSolicitud'))

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
WebUI.setText(findTestObject('01 - Solicitudes/01 - Buscador/Filtros Busqueda/CampoNif'), 'B15954654')

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.delay(400)

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'))

WebUI.click(findTestObject('01 - Solicitudes/05 - Fraude/AccesoFraudeTres'))

WebUI.delay(5)

WebUI.click(findTestObject('01 - Solicitudes/05 - Fraude/01 - Documentación recibida/DocuRecibida'))

WebUI.delay(5)

WebUI.click(findTestObject('01 - Solicitudes/05 - Fraude/AccesoFraudeTres'))

WebUI.delay(5)

WebUI.click(findTestObject('01 - Solicitudes/05 - Fraude/01 - Documentación recibida/RellenarDocumentacion'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('01 - Solicitudes/05 - Fraude/01 - Documentación recibida/bancariaBien'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('01 - Solicitudes/05 - Fraude/01 - Documentación recibida/ingresosBien'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('01 - Solicitudes/05 - Fraude/01 - Documentación recibida/propiedadBien'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('01 - Solicitudes/05 - Fraude/01 - Documentación recibida/BotonSiguienteAceparDocumentacion'), 
    FailureHandling.OPTIONAL)

WebUI.delay(3)

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar de ventana/AceptarVentanaUno'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/AceptarSegundoAccesoCambio'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar de Ventana Segundo Acceso/AceptarVentanaDosSegundoAcceso'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/AceptarSolicitudCambio'))

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/02 - Aceptación/Aceptar Proceso/OpcionesAceptar/Garantias'))

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptar'))

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.delay(5)

'Funcionalidad Aceptar Solicitud - 3 - Aceptar Solicitud'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptar'))

'Funcionalidad Aceptar - Evidencia estado 3'
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
WebUI.setText(findTestObject('01 - Vuelo/NifVerificacion'), 'B15954654')

'12 - Verificar Documentos'
WebUI.delay(10)

'12 - Verificar Documentos'
WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

'12 - Verificar Documentos'
WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistroSolicitudDos'), FailureHandling.OPTIONAL)

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/PasarVerificacion'), FailureHandling.OPTIONAL)

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Empresa/DNIApoderado'), FailureHandling.OPTIONAL)

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Empresa/VerificaciónPoderes'), FailureHandling.OPTIONAL)

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Empresa/ImpuestoSociedades'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Empresa/ListaBlaqueo'), FailureHandling.OPTIONAL)

'Verificación Documental'
WebUI.delay(5, FailureHandling.OPTIONAL)

'Verificación Documental'
WebUI.click(findTestObject('02 - Producción - Verificación/BotonesVerificacion/VerificaciónFinal'), FailureHandling.OPTIONAL)

'Verificación Documental'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\test1.png', 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('02 - Producción - Verificación/00 - Documentación/Titular/CerrarVerificación'), FailureHandling.OPTIONAL)

'Control de chasis'
WebUI.openBrowser('')

'Control de chasis'
WebUI.maximizeWindow()

'Control de chasis'
WebUI.navigateToUrl(GlobalVariable.Abaco)

'Control de chasis'
WebUI.delay(2)

'Control de chasis'
WebUI.click(findTestObject('01 - Solicitudes/00 - Acceso/Solicitud - Contratar'))

'Control de chasis'
WebUI.switchToWindowTitle('MFS')

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.setText(findTestObject('01 - Solicitudes/01 - Buscador/Filtros Busqueda/CampoNif'), 'B15954654')

'Control de chasis'
WebUI.click(findTestObject('01 - Solicitudes/01 - Buscador/Buscador/BuscarSolicitud'))

'Funcionalidad Aceptar Solicitud - 2 - Buscador de solicitudes'
WebUI.click(findTestObject('01 - Vuelo/SeleccionaPrimerRegistro'))

'Control de chasis'
WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\\\test1.png')

'Control de chasis'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/Produccion'))

'Control de chasis'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/ContratarProduccion'))

'Control de chasis'
WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/chasisProduccion'), '1234567890fnxdfgw')

'Control de chasis'
WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/MatriculaProduccion'), '3592FNX')

'Control de chasis'
WebUI.setText(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/Fecha'), '01012015')

'Control de chasis'
WebUI.delay(2)

'Control de chasis'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptar'))

'Control de chasis'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/AceptarChasis'))

'Control de chasis'
WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/Contratar/MotivoChasis'))

WebUI.click(findTestObject('01 - Solicitudes/03 - Produccion/BotonesChasis/BotonSiguienteAceptarDos'))

WebUI.click(findTestObject('01 - Solicitudes/XX - Genericos/Ventana/cerrarVentanaSolicitud'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('01 - Solicitudes/XX - Genericos/Ventana/cerrarVentanaSolicitudOpcion'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('01 - Solicitudes/XX - Genericos/Ventana/CerrarSolicitud'), FailureHandling.OPTIONAL)

