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

WebUI.navigateToUrl('http://ps13116:Santander022@rcieslv01.grouperci.com:61005/pfn/dmz/indexCentral.do#')

WebUI.click(findTestObject('Object Repository/Borrar/Page_baco Central/strong_SOLICITUDES'))

WebUI.switchToWindowTitle('MFS')

WebUI.click(findTestObject('Object Repository/Borrar/Page_MFS/span_Aceptar_button-1005-btnIconEl'))

WebUI.setText(findTestObject('Object Repository/Borrar/Page_MFS/input_Buscar operacin_idOperation'), '4834194')

WebUI.click(findTestObject('Object Repository/Borrar/Page_MFS/span_Buscar'))

WebUI.click(findTestObject('01 - Solicitudes/05 - Fraude/AccesoFraude'))

WebUI.click(findTestObject('Object Repository/Borrar/Page_MFS/span_X - Cerrar_button-2351-btnIconEl'))

WebUI.click(findTestObject('Object Repository/Borrar/Page_MFS/div_F.Dist_x-grid-cell-inner'))

WebUI.click(findTestObject('Object Repository/Borrar/Page_MFS/span_Fraude_button-2381-btnIconEl'))

WebUI.click(findTestObject('Object Repository/Borrar/Page_MFS/span_X - Cerrar_button-2351-btnIconEl'))

WebUI.click(findTestObject('Object Repository/Borrar/Page_MFS/div_'))

WebUI.click(findTestObject('Object Repository/Borrar/Page_MFS/span_Fraude_button-4145-btnIconEl'))

WebUI.click(findTestObject('Object Repository/Borrar/Page_MFS/span_X - Cerrar_button-4115-btnIconEl'))

WebUI.click(findTestObject('Object Repository/Borrar/Page_MFS/div_F.Dist_x-grid-cell-inner'))

WebUI.click(findTestObject('Object Repository/Borrar/Page_MFS/span_Fraude_button-5909-btnIconEl'))

