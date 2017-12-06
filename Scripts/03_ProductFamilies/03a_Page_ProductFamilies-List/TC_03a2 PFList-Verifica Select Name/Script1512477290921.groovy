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

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/02_Select'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_CENTRAL-CORE'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/SelectArrow'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_Evo A'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/SelectArrow'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_Evo U'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/SelectArrow'))

WebUI.focus(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_REACT-3.6(4.6)-TL'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_REACT-3.6(4.6)-TL'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/SelectArrow'))

WebUI.focus(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_TRIO-50.0(60.0)-TL-OUTD-US'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_TRIO-50.0(60.0)-TL-OUTD-US'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/SelectArrow'))

WebUI.focus(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_TRIO-50.0-TL-OUTD-JP'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_TRIO-50.0-TL-OUTD-JP'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/SelectArrow'))

WebUI.focus(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_TRIO-50.0-TL-OUTD'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_TRIO-50.0-TL-OUTD'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/SelectArrow'))

WebUI.focus(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_TRIO-60.0-TL-OUTD'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_TRIO-60.0-TL-OUTD'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/SelectArrow'))

WebUI.focus(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_TRIO-8.5(7.5)(5.8)-TL-OUTD'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_TRIO-8.5(7.5)(5.8)-TL-OUTD'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/SelectArrow'))

WebUI.focus(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_UNO-2.0(3.0)-TL-OUTD-US'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_UNO-2.0(3.0)-TL-OUTD-US'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/SelectArrow'))

WebUI.focus(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_UNO-2.0(3.0)-TL-OUTD'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_UNO-2.0(3.0)-TL-OUTD'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/SelectArrow'))

WebUI.focus(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_UNO-3.6(3.8)(4.2)-TL-OUTD'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_UNO-3.6(3.8)(4.2)-TL-OUTD'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/SelectArrow'))

WebUI.focus(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_UNO-7.6(8.6)-TL-OUTD'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_UNO-7.6(8.6)-TL-OUTD'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/SelectArrow'))

WebUI.focus(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_UNO-DM-5.0_1.2-TL-PLUS-EU'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_UNO-DM-5.0_1.2-TL-PLUS-EU'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/SelectArrow'))

WebUI.focus(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_UNO-DM-5.0_3.3-TL-PLUS-US'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_UNO-DM-5.0_3.3-TL-PLUS-US'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/SelectArrow'))

WebUI.focus(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_UNO-DM-6.0-TL-PLUS-EU'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_UNO-DM-6.0-TL-PLUS-EU'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/SelectArrow'))

WebUI.focus(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_UNO-DM-6.0-TL-PLUS-US'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_UNO-DM-6.0-TL-PLUS-US'))

WebUI.closeBrowser()

