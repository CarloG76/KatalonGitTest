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

WebUI.click(findTestObject('00_Page_MenuCheck/VociMenu/05_li_Product Models'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('04_Page_ProductModels/Intestazioni/01_Product Models_title'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('04_Page_ProductModels/Intestazioni/02_ID'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('04_Page_ProductModels/Intestazioni/03_NameSelect'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('04_Page_ProductModels/Intestazioni/04_InternalName'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('04_Page_ProductModels/Intestazioni/05_th_Type'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('04_Page_ProductModels/Intestazioni/06_PartNumber'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('04_Page_ProductModels/Intestazioni/07_PrimaryID'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('04_Page_ProductModels/Intestazioni/08_SecondaryID'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('04_Page_ProductModels/Intestazioni/09_StringID'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('04_Page_ProductModels/Intestazioni/10_CountryAreasSpecificNameList'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('04_Page_ProductModels/Intestazioni/11_ProductFamilyName'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('04_Page_ProductModels/Intestazioni/12_ProductLineName'), 3)

WebUiBuiltInKeywords.comment('Verifica dei valori con Test Data')

WebUiBuiltInKeywords.verifyElementText(findTestObject('04_Page_ProductModels/Intestazioni/01_Product Models_title'), findTestData('Product Models/ProductModels - Intestazioni').getValue(
        1, 1))

WebUiBuiltInKeywords.verifyElementText(findTestObject('04_Page_ProductModels/Intestazioni/02_ID'), findTestData('Product Models/ProductModels - Intestazioni').getValue(
        1, 2))

WebUiBuiltInKeywords.verifyElementText(findTestObject('04_Page_ProductModels/Intestazioni/03_NameSelect'), findTestData('Product Models/ProductModels - Intestazioni').getValue(
        1, 3))

WebUiBuiltInKeywords.verifyElementText(findTestObject('04_Page_ProductModels/Intestazioni/04_InternalName'), findTestData('Product Models/ProductModels - Intestazioni').getValue(
        1, 4))

WebUiBuiltInKeywords.verifyElementText(findTestObject('04_Page_ProductModels/Intestazioni/05_th_Type'), findTestData('Product Models/ProductModels - Intestazioni').getValue(
        1, 5))

WebUiBuiltInKeywords.verifyElementText(findTestObject('04_Page_ProductModels/Intestazioni/06_PartNumber'), findTestData('Product Models/ProductModels - Intestazioni').getValue(
        1, 6))

WebUiBuiltInKeywords.verifyElementText(findTestObject('04_Page_ProductModels/Intestazioni/07_PrimaryID'), findTestData('Product Models/ProductModels - Intestazioni').getValue(
        1, 7))

WebUiBuiltInKeywords.verifyElementText(findTestObject('04_Page_ProductModels/Intestazioni/08_SecondaryID'), findTestData('Product Models/ProductModels - Intestazioni').getValue(
        1, 8))

WebUiBuiltInKeywords.verifyElementText(findTestObject('04_Page_ProductModels/Intestazioni/09_StringID'), findTestData('Product Models/ProductModels - Intestazioni').getValue(
        1, 9))

WebUiBuiltInKeywords.verifyElementText(findTestObject('04_Page_ProductModels/Intestazioni/10_CountryAreasSpecificNameList'), findTestData(
        'Product Models/ProductModels - Intestazioni').getValue(1, 10))

WebUiBuiltInKeywords.verifyElementText(findTestObject('04_Page_ProductModels/Intestazioni/11_ProductFamilyName'), findTestData('Product Models/ProductModels - Intestazioni').getValue(
        1, 11))

WebUiBuiltInKeywords.verifyElementText(findTestObject('04_Page_ProductModels/Intestazioni/12_ProductLineName'), findTestData('Product Models/ProductModels - Intestazioni').getValue(
        1, 12))

WebUiBuiltInKeywords.closeBrowser()

