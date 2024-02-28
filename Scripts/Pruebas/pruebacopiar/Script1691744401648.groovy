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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



WebUI.openBrowser('')

WebUI.navigateToUrl('http://ps13116:Santander011@rcieslv01.grouperci.com:61005/pfn/dmz/indexCentral.do#')

WebUI.click(findTestObject('Object Repository/xx/Page_baco Central/a_SOLICITUDESENTRAR'))

WebUI.switchToWindowTitle('MFS')

WebUI.click(findTestObject('Object Repository/xx/Page_MFS/span_Buscar'))

WebUI.click(findTestObject('Object Repository/xx/Page_MFS/span_Aceptar_button-1005-btnIconEl'))

WebUI.click(findTestObject('Object Repository/xx/Page_MFS/span_SOLICITUDES_button-1068-btnIconEl'))

WebUI.click(findTestObject('Object Repository/xx/Page_MFS/span_UNISONO_button-1668-btnIconEl'))

WebUI.click(findTestObject('Object Repository/xx/Page_MFS/div_4815884'))

WebUI.click(findTestObject('Object Repository/xx/Page_MFS/td_4815884'))

WebUI.mouseOver(findTestObject('Object Repository/xx/Page_MFS/td_4815884'))

WebUI.click(findTestObject('Object Repository/xx/Page_MFS/td_4815884'))

WebUI.verifyElementClickable(findTestObject('Object Repository/xx/Page_MFS/td_4815884'))

WebUI.closeBrowser()

