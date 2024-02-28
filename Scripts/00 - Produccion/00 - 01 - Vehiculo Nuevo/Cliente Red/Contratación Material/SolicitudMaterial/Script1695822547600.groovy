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

WebUI.delay(2)

WebUI.scrollToPosition(0, 120)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/00 - Acceso/AccesoProduccion'))

WebUI.switchToWindowTitle('MFS')

WebUI.delay(2)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/01 - Comunes/01 - SelecRedTipoVehiculo/SelecRed'), '222224')

WebUI.delay(2)

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/A - 01- Comunes - SeleccionCliente/00 - SeleccionCliente'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/A - 01- Comunes - SeleccionCliente/Cliente Red/ClienteRed'))

WebUI.click(findTestObject('00 - VN - Opciones/Otros/SeleccionOtros'))

WebUI.click(findTestObject('00 - VN - Opciones/Otros/ImporteMaterial/Importe'))

WebUI.setText(findTestObject('00 - VN - Opciones/Otros/ImporteMaterial/Importe'), '10000')

WebUI.click(findTestObject('00 - VN - Opciones/Otros/ImporteMaterial/BotonContinuar'))

WebUI.click(findTestObject('00 - VN - Opciones/Produccion VN/03 - Baremos/Material/Credito - SAP2/ComboProducto'))

WebUI.click(findTestObject('Object Repository/00 - VN - Opciones/Produccion VN/03 - Baremos/Material/Credito - SAP2/CreditoProducto'))

WebUI.click(findTestObject('Object Repository/00 - VN - Opciones/Produccion VN/03 - Baremos/Material/Credito - SAP2/ComboBaremo'))

WebUI.click(findTestObject('Object Repository/00 - VN - Opciones/Produccion VN/03 - Baremos/Material/Credito - SAP2/BaremoSAP2'))

WebUI.click(findTestObject('Object Repository/00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 00 - Opciones/00 - OpcionesOferta'))

WebUI.click(findTestObject('Object Repository/00 - VN - Opciones/Produccion VN/05 - Opciones/05 - 03 - Solicitar/03 - Solicitar'))

WebUI.setText(findTestObject('00 - VN - Opciones/Produccion VN/08 - Solicitar/00 - Vendedor/NIFvendedor'), '30403183N')

WebUI.click(findTestObject('Object Repository/00 - VN - Opciones/Otros/EmpresaSolicitar/CamposSolicitud/RadioButtonSeleccionEmpresa'))

WebUI.setText(findTestObject('Object Repository/00 - VN - Opciones/Otros/EmpresaSolicitar/CamposSolicitud/CIFNIF'), 'A79249470')

WebUI.click(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/Seleccion Cliente/SeleccionCliente'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/Seleccion Cliente/SeleccionBotonCuenta'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/Seleccion Cliente/cuentaClienteDos'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/Seleccion Cliente/cuentaCliente'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/Seleccion Cliente/SeleccionaBotonEmpresas'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/Seleccion Cliente/SeleccionEmpresa'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/Seleccion Cliente/AceptarSeleccioneCliente'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/CamposSolicitud/NumeroViaEmpresa'), '69', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/CamposSolicitud/NIFApoderado'), '86728853Q', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/CamposSolicitud/apellidoApoderado'), 'ApellidoPrueba')

WebUI.setText(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/CamposSolicitud/CNAE'), '1330', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/CamposSolicitud/CNAE2'), '1330', FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/CamposSolicitud/fechaNacimiento'), '25101987')

WebUI.setText(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/CamposSolicitud/mailEmpresa'), 'prueba@prueba.es')

WebUI.setText(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/CamposSolicitud/nombreApoderado'), 'Apoderado')

WebUI.setText(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/CamposSolicitud/CPEmpresa'), '48200')

WebUI.setText(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/CamposSolicitud/NombreNotarioEmpresa'), 'Notario')

WebUI.click(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/CamposSolicitud/AceptarSolicitudEmpresaMaterial'))

WebUI.delay(5)

WebUI.takeScreenshot('C:\\Users\\PS13116\\OneDrive - Alliance\\Escritorio\\Katalon\\Katalon_Studio_Windows_64-8.6.5\\Evidencias\\MaterialTaller\\MaterialTaller.png')

WebUI.click(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/CamposSolicitud/SalirSolicitud'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('00 - VN - Opciones/Otros/EmpresaSolicitar/CamposSolicitud/SalirSolicitudDos'), FailureHandling.OPTIONAL)

