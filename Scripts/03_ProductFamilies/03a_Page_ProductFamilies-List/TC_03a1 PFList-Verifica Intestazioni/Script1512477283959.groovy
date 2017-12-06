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

'Apertura pagina PL > Datasheet'
WebUI.click(findTestObject('00_Page_MenuCheck/VociMenu/04a_ProductFamilies_List'))

'Verifica le intestazioni della tabella'
WebUI.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Intestazioni/01_Product Families_title'), 3)

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Intestazioni/01_Product Families_title'), findTestData(
        'Product Families/ProductFamilies - Intestazioni').getValue(1, 1))

'Verifica le intestazioni della tabella'
WebUI.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Intestazioni/02_ID'), 3)

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Intestazioni/02_ID'), findTestData('Product Families/ProductFamilies - Intestazioni').getValue(
        1, 2))

'Verifica le intestazioni della tabella'
WebUI.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Intestazioni/03_Name Select'), 3)

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Intestazioni/03_Name Select'), findTestData('Product Families/ProductFamilies - Intestazioni').getValue(
        1, 3))

'Verifica le intestazioni della tabella'
WebUI.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Intestazioni/04_ReferencePartNumber'), 3)

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Intestazioni/04_ReferencePartNumber'), findTestData('Product Families/ProductFamilies - Intestazioni').getValue(
        1, 4))

'Verifica le intestazioni della tabella'
WebUI.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Intestazioni/05_th_Type'), 3)

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Intestazioni/05_th_Type'), findTestData('Product Families/ProductFamilies - Intestazioni').getValue(
        1, 5))

'Verifica le intestazioni della tabella'
WebUI.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Intestazioni/06_th_Product Line Name'), 3)

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Intestazioni/06_th_Product Line Name'), findTestData('Product Families/ProductFamilies - Intestazioni').getValue(
        1, 6))

'Verifica le intestazioni della tabella'
WebUI.verifyElementPresent(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Intestazioni/07_SelectModels'), 3)

WebUI.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Intestazioni/07_SelectModels'), findTestData('Product Families/ProductFamilies - Intestazioni').getValue(
        1, 7))

