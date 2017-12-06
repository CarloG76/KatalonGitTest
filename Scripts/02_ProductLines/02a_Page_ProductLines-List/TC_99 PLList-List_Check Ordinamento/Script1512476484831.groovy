import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('utilities/TC_0c-Login Corretto - ReUse'), [('windowTitle') : 'Aurora Vision BenGen'], FailureHandling.STOP_ON_FAILURE)

viewportWidth = WebUI.getViewportWidth()

if (viewportWidth < 1400) {
    WebUI.click(findTestObject('00_Page_MenuCheck/MenuResponsiveArrow'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('00_Page_MenuCheck/VociMenu/03a_ProductLines_List'))

'Verifica le intestazioni della tabella'
WebUI.verifyElementPresent(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/00_ProductLines_title'), 
    3)

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/00_ProductLines_title'), 
    findTestData('Product Lines/Product Lines-Intestazioni').getValue(1, 1))

WebUI.verifyElementPresent(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/01_ID_lbl'), 3)

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/01_ID_lbl'), findTestData(
        'ProductLines-Order').getValue(1, 2))

WebUI.verifyElementPresent(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/02_Select'), 3)

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/02_Select'), findTestData(
        'ProductLines-Order').getValue(1, 3))

WebUI.verifyElementPresent(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/03_Reference Part Number_lbl'), 
    3)

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/03_Reference Part Number_lbl'), 
    findTestData('ProductLines-Order').getValue(1, 4))

WebUI.verifyElementPresent(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/04_Project Name_lbl'), 
    3)

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/04_Project Name_lbl'), findTestData(
        'ProductLines-Order').getValue(1, 5))

WebUI.verifyElementPresent(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/05_Product Families List_lbl'), 
    3)

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/05_Product Families List_lbl'), 
    findTestData('ProductLines-Order').getValue(1, 6))

'Verifica il corretto ordinamento - excel'
WebUI.comment('')

'Ordina per ID crescente\r\n'
WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/01_ID_lbl'))

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/CheckOrdinamento/OrderCre_ID_1_83'), 
    findTestData('ProductLines-Order').getValue(1, 1))

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/CheckOrdinamento/OrderCre_ID_2_84'), 
    findTestData('ProductLines-Order').getValue(1, 2))

'Ordina per ID decrescente\r\n'
WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/01_ID_lbl'))

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/CheckOrdinamento/OrderDec_ID_1_92'), 
    findTestData('ProductLines-Order').getValue(1, 3))

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/CheckOrdinamento/OrderDec_ID_2_91'), 
    findTestData('ProductLines-Order').getValue(1, 4))

'Ordina per RPN crescente\r\n'
WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/03_Reference Part Number_lbl'))

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/CheckOrdinamento/OrderCre_RPN_1_3l72'), 
    findTestData('ProductLines-Order').getValue(1, 5))

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/CheckOrdinamento/OrderCre_RPN_2_3M19'), 
    findTestData('ProductLines-Order').getValue(1, 6))

'Ordina per RPN decrescente\r\n'
WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/03_Reference Part Number_lbl'))

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/CheckOrdinamento/OrderDec_RPN_1_Q028'), 
    findTestData('ProductLines-Order').getValue(1, 7))

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/CheckOrdinamento/OrderDec_RPN_2_3P25'), 
    findTestData('ProductLines-Order').getValue(1, 8))

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/04_Project Name_lbl'))

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/CheckOrdinamento/OrderCre_PN_1_AMERICAN UNO'), 
    findTestData('ProductLines-Order').getValue(1, 9))

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/CheckOrdinamento/OrderCre_PN_2_CCCP'), 
    findTestData('ProductLines-Order').getValue(1, 10))

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/04_Project Name_lbl'))

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/CheckOrdinamento/OrderDec_PN_1_WIFI Logger Card'), 
    findTestData('ProductLines-Order').getValue(1, 11))

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/CheckOrdinamento/OrderDec_PN_2_VEGA B'), 
    findTestData('ProductLines-Order').getValue(1, 12))

WebUI.closeBrowser()

