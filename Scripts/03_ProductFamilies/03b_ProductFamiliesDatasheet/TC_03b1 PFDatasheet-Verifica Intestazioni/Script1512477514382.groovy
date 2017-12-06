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

WebUI.focus(findTestObject('00_Page_MenuCheck/NavArrows/ProdFamsArrow_cls'))

WebUI.click(findTestObject('00_Page_MenuCheck/NavArrows/ProdFamsArrow_cls'))

'Apertura pagina PF > Datasheet'
WebUI.click(findTestObject('00_Page_MenuCheck/VociMenu/04b_ProductFamilies_Datasheet'))

WebUI.comment('Blocco 1 - Intestazioni Generali')

'Verifica esistenza delle intestazioni generali'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/00_ProductFamiliesDatasheet_title'), 
    3)

'Verifica esistenza delle intestazioni generali'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/01_ProductFamiliesName_preSelect'), 
    3)

'Verifica esistenza delle intestazioni generali'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/02_ProductFamiliesRPN'), 
    3)

'Verifica esistenza delle intestazioni generali'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/03_ProductFamiliesType'), 
    3)

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/00_ProductFamiliesDatasheet_title'), 
    findTestData('Product Families/Product Families - DS - Intestazioni').getValue(1, 1))

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/01_ProductFamiliesName_preSelect'), 
    findTestData('Product Families/Product Families - DS - Intestazioni').getValue(2, 1))

WebUI.verifyTextPresent(findTestData('Product Families/Product Families - DS - Intestazioni').getValue(3, 1), false)

WebUI.verifyTextPresent(findTestData('Product Families/Product Families - DS - Intestazioni').getValue(4, 1), false)

WebUI.comment('Blocco 2 - Product Models List')

'Verifica esistenza delle intestazioni generali'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/04_ProductModelsList_title'), 
    3)

'Verifica esistenza delle intestazioni generali'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/04a_columnID'), 3)

'Verifica esistenza delle intestazioni generali'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/04b_columnName'), 
    3)

'Verifica esistenza delle intestazioni generali'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/04c_columnCountryAreasSpecificName'), 
    3)

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/04_ProductModelsList_title'), findTestData(
        'Product Families/Product Families - DS - Intestazioni').getValue(1, 2))

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/04a_columnID'), findTestData('Product Families/Product Families - DS - Intestazioni').getValue(
        2, 2))

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/04b_columnName'), findTestData('Product Families/Product Families - DS - Intestazioni').getValue(
        3, 2))

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/04c_columnCountryAreasSpecificName'), 
    findTestData('Product Families/Product Families - DS - Intestazioni').getValue(4, 2))

WebUI.comment('Blocco 3 - Product Family Design')

'Verifica esistenza delle intestazioni generali'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05_ProductFamilyDesign_title'), 
    3)

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05_ProductFamilyDesign_title'), findTestData(
        'Product Families/Product Families - DS - Intestazioni').getValue(1, 3))

WebUI.comment('Blocco 3a - Logical Devices')

'Verifica esistenza delle intestazioni generali'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05a_LogicalDevices'), 
    3)

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05a_LogicalDevices'), findTestData('Product Families/Product Families - DS - Intestazioni').getValue(
        2, 3))

WebUI.comment('Blocco 3b - Functional Groups')

'Verifica esistenza delle intestazioni generali'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05b_FunctionalGroups'), 
    3)

'Verifica esistenza delle intestazioni generali'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05b1_Logical Devices'), 
    3)

'Verifica esistenza delle intestazioni generali'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05b2_Control'), 3)

'Verifica esistenza delle intestazioni generali'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05b3_Connectivity'), 
    3)

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05b_FunctionalGroups'), findTestData(
        'Product Families/Product Families - DS - Intestazioni').getValue(2, 4))

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05b1_Logical Devices'), findTestData(
        'Product Families/Product Families - DS - Intestazioni').getValue(3, 4))

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05b2_Control'), findTestData('Product Families/Product Families - DS - Intestazioni').getValue(
        4, 4))

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05b3_Connectivity'), findTestData('Product Families/Product Families - DS - Intestazioni').getValue(
        5, 4))

WebUI.comment('Blocco 3c - Logical Devices Details')

'Verifica esistenza delle intestazioni generali'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05c_LogicalDevicesDetails'), 
    3)

'Verifica esistenza delle intestazioni generali'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05c1_Name'), 3)

'Verifica esistenza delle intestazioni generali'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05c2_Physical Device'), 
    3)

'Verifica esistenza delle intestazioni generali'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05c3_Fat Type'), 3)

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05c_LogicalDevicesDetails'), findTestData(
        'Product Families/Product Families - DS - Intestazioni').getValue(2, 5))

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05c1_Name'), findTestData('Product Families/Product Families - DS - Intestazioni').getValue(
        3, 5))

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05c2_Physical Device'), findTestData(
        'Product Families/Product Families - DS - Intestazioni').getValue(4, 5))

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03b_Page_ProductFamilies_Datasheet/Intestazioni/05c3_Fat Type'), findTestData('Product Families/Product Families - DS - Intestazioni').getValue(
        5, 5))

WebUI.closeBrowser()

