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

WebUI.click(findTestObject('00_Page_MenuCheck/VociMenu/04a_ProductFamilies_List'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/02_Select'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_CENTRAL-CORE'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/SelectArrow'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/01_70_CentralCore/td_70'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(1, 1))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/01_70_CentralCore/a_CENTRAL-CORE'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(2, 1))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/01_70_CentralCore/td_V1K4'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(7, 1))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/01_70_CentralCore/td_Logger'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(8, 1))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/01_70_CentralCore/td_txt-center'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(10, 1))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_Evo A'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/SelectArrow'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/02_10_EvoA/td_10'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(1, 2))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/02_10_EvoA/a_Evo A'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(2, 2))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/02_10_EvoA/td_3I72'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(7, 2))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/02_10_EvoA/td_Logger'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(8, 2))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/02_10_EvoA/td_txt-center'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(10, 2))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_Evo U'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/03_103_EvoU/td_103'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(1, 3))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/03_103_EvoU/a_Evo U'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(2, 3))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/03_103_EvoU/td_3I72'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(7, 3))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/03_103_EvoU/td_Logger'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(8, 3))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/03_103_EvoU/td_txt-center'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(10, 3))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/SelectArrow'))

WebUI.focus(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_REACT-3.6(4.6)-TL'))

WebUI.click(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/NameSelectOptions/div_REACT-3.6(4.6)-TL'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/04_116_REACT-3.6(4.6)-TL/td_116'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(1, 4))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/04_116_REACT-3.6(4.6)-TL/a_REACT-3.6(4.6)-TL'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(2, 4))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/04_116_REACT-3.6(4.6)-TL/td_3N08'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(7, 4))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/04_116_REACT-3.6(4.6)-TL/td_Inverter'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(8, 4))

WebUiBuiltInKeywords.verifyElementText(findTestObject('03_Page_ProductFamilies/03a_Page_ProductFamilies_List/Elenco_Oggetti/04_116_REACT-3.6(4.6)-TL/td_txt-center'), 
    findTestData('DB_Conn/DatabaseConnection_PF_List').getValue(10, 4))

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

