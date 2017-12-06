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

WebUI.callTestCase(findTestCase('utilities/TC_0c-Login Corretto - ReUse'), [('windowTitle') : 'Aurora Vision BenGen'], FailureHandling.STOP_ON_FAILURE)

viewPort = WebUI.getViewportWidth()

if (viewPort < 1400) {
    WebUiBuiltInKeywords.click(findTestObject('00_Page_MenuCheck/MenuResponsiveArrow'))
}

WebUI.focus(findTestObject('00_Page_MenuCheck/NavArrows/ProdLinesArrow_opn'))

WebUI.click(findTestObject('00_Page_MenuCheck/NavArrows/ProdLinesArrow_opn'))

WebUI.focus(findTestObject('00_Page_MenuCheck/NavArrows/ProdLinesArrow_cls'))

WebUI.click(findTestObject('00_Page_MenuCheck/NavArrows/ProdLinesArrow_cls'))

'Apertura pagina PL > Datasheet'
WebUI.click(findTestObject('00_Page_MenuCheck/VociMenu/03b_ProductLines_Datasheet'))

WebUI.comment('Blocco 1 - Intestazioni Generali')

'Verifica esistenza delle intestazioni generali'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/00_ProductLinesDatasheet_title'), 
    3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/01_ProductLineName_preSelect'), 
    3)

WebUI.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/02_ProductLineRPN'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/03_ProductLine_ProjectName'), 
    3)

WebUI.verifyElementText(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/00_ProductLinesDatasheet_title'), findTestData(
        'Product Lines/Product Lines - DS - Intestazioni').getValue(1, 1))

WebUI.verifyElementText(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/01_ProductLineName_preSelect'), findTestData(
        'Product Lines/Product Lines - DS - Intestazioni').getValue(2, 1))

WebUiBuiltInKeywords.verifyTextPresent(findTestData('Product Lines/Product Lines - DS - Intestazioni').getValue(3, 1), false)

WebUiBuiltInKeywords.verifyTextPresent(findTestData('Product Lines/Product Lines - DS - Intestazioni').getValue(4, 1), false)

WebUI.comment('Blocco 2 - Product Families List')

'Verifica esistenza delle intestazioni di  Product Families List\r\n'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/04_ProductFamiliesList_title'), 
    3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/04a_columnID'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/04b_columnName'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/04c_columnModelList'), 
    3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/04d_columnCountryAreasNames'), 
    3)

'Verifica valori corretti delle intestazioni di Product Families List'
WebUI.verifyElementText(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/04_ProductFamiliesList_title'), findTestData(
        'Product Lines/Product Lines - DS - Intestazioni').getValue(1, 2))

WebUI.verifyElementText(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/04a_columnID'), findTestData('Product Lines/Product Lines - DS - Intestazioni').getValue(
        2, 2))

WebUI.verifyElementText(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/04b_columnName'), findTestData('Product Lines/Product Lines - DS - Intestazioni').getValue(
        3, 2))

WebUI.verifyElementText(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/04c_columnModelList'), findTestData('Product Lines/Product Lines - DS - Intestazioni').getValue(
        4, 2))

WebUI.verifyElementText(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/04d_columnCountryAreasNames'), findTestData(
        'Product Lines/Product Lines - DS - Intestazioni').getValue(5, 2))

WebUI.comment('Blocco 3 - Product Line Design')

'Verifica esistenza delle intestazioni di Product Line Design\r\n\r\n'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/05_ProductLineDesign_title'), 
    3)

'\r\n'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/05a_columnProductFamily'), 
    3)

'\r\n\r\n'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/05a1_columnID'), 3)

'\r\n'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/05a2_columnName'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/05b_columnLogicalDevices'), 
    3)

'\r\n\r\n'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/05b1_columnFlashApp'), 
    3)

'\r\n'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/05b2_columnFlashEsterna'), 
    3)

'Verifica valori corretti delle intestazioni di Product Line Design'
WebUI.verifyElementText(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/05_ProductLineDesign_title'), findTestData(
        'Product Lines/Product Lines - DS - Intestazioni').getValue(1, 3))

WebUI.verifyElementText(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/05a_columnProductFamily'), findTestData(
        'Product Lines/Product Lines - DS - Intestazioni').getValue(2, 3))

WebUI.verifyElementText(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/05a1_columnID'), findTestData('Product Lines/Product Lines - DS - Intestazioni').getValue(
        3, 3))

WebUI.verifyElementText(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/05a2_columnName'), findTestData('Product Lines/Product Lines - DS - Intestazioni').getValue(
        4, 3))

WebUI.verifyElementText(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/05b_columnLogicalDevices'), findTestData(
        'Product Lines/Product Lines - DS - Intestazioni').getValue(2, 4))

WebUI.verifyElementText(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/05b1_columnFlashApp'), findTestData('Product Lines/Product Lines - DS - Intestazioni').getValue(
        3, 4))

WebUI.verifyElementText(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/05b2_columnFlashEsterna'), findTestData(
        'Product Lines/Product Lines - DS - Intestazioni').getValue(4, 4))

WebUI.comment('Blocco 4 - Functional Groups')

'Verifica esistenza delle intestazioni di Functional Groups\r\n\r\n'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/06_FunctionalGroups_title'), 
    3)

'\r\n'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/06a_columnLogicalDevices'), 
    3)

'\r\n\r\n'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/06b_columnControl'), 
    3)

'\r\n'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/06c_columnConnectivity'), 
    3)

'Verifica valori corretti delle intestazioni di Functional Groups'
WebUI.verifyElementText(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/06_FunctionalGroups_title'), findTestData(
        'Product Lines/Product Lines - DS - Intestazioni').getValue(1, 5))

WebUI.verifyElementText(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/06a_columnLogicalDevices'), findTestData(
        'Product Lines/Product Lines - DS - Intestazioni').getValue(2, 5))

WebUI.verifyElementText(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/06b_columnControl'), findTestData('Product Lines/Product Lines - DS - Intestazioni').getValue(
        3, 5))

WebUI.verifyElementText(findTestObject('02_ProductLines/02_Page_ProductLines_Datasheet/Intestazioni/06c_columnConnectivity'), findTestData(
        'Product Lines/Product Lines - DS - Intestazioni').getValue(4, 5))

WebUiBuiltInKeywords.closeBrowser()

