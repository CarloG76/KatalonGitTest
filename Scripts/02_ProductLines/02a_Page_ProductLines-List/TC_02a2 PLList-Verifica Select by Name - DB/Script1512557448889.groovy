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

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/02_Select'))

'Seleziona e verifica risutato selezione'
WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/NameSelectOptions/div_EVO'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/01_83-evo/td_83'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(1, 1))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/01_83-evo/td_evoName'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(2, 1))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/01_83-evo/td_3I72'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(3, 1))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/01_83-evo/td_Evo'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(4, 1))

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/NameSelectOptions/span_md-select-icon'))

sleep(1000)

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/NameSelectOptions/div_UNO'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/02_84-uno/td_84'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(1, 2))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/02_84-uno/td_unoName'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(2, 2))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/02_84-uno/td_3N41'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(3, 2))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/02_84-uno/td_UNO low cost'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(4, 2))

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/NameSelectOptions/span_md-select-icon'))

sleep(1000)

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/NameSelectOptions/div_UNO-DM VEGA'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/03_85-uno_dm_vega/td_85'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(1, 3))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/03_85-uno_dm_vega/td_unoDMVegaName'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(2, 3))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/03_85-uno_dm_vega/td_3P25'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(3, 3))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/03_85-uno_dm_vega/td_VEGA B'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(4, 3))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/03_85-uno_dm_vega/td_unoDMVegaPFL'), 
    findTestData('Product Lines/ProductLines-Oggetti').getValue(5, 3))

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/NameSelectOptions/span_md-select-icon'))

sleep(1000)

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/NameSelectOptions/div_TRIO-50'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/04_86-trio_50/td_86'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(1, 4))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/04_86-trio_50/td_trio50Name'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(2, 4))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/04_86-trio_50/td_3N63'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(3, 4))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/04_86-trio_50/td_TRIO-50'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(4, 4))

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/NameSelectOptions/span_md-select-icon'))

sleep(1000)

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/NameSelectOptions/div_REACT'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/05_87-React/td_87'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(1, 5))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/05_87-React/td_reactName'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(2, 5))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/05_87-React/td_3N08'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(3, 5))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/05_87-React/td_REACT'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(4, 5))

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/NameSelectOptions/span_md-select-icon'))

sleep(1000)

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/NameSelectOptions/div_WIFI'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/06_88-Wifi/td_88'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(1, 6))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/06_88-Wifi/td_wifiName'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(2, 6))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/06_88-Wifi/td_3N16'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(3, 6))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/06_88-Wifi/td_WIFI Logger Card'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(4, 6))

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/NameSelectOptions/span_md-select-icon'))

sleep(1000)

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/NameSelectOptions/div_TRIO-8.5 BABY'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/07_89-Trio8.5_Baby/td_89'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(1, 7))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/07_89-Trio8.5_Baby/td_trio85babyName'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(2, 7))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/07_89-Trio8.5_Baby/td_3M99'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(3, 7))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/07_89-Trio8.5_Baby/td_TRIO BABY'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(4, 7))

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/NameSelectOptions/span_md-select-icon'))

sleep(1000)

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/NameSelectOptions/div_UNO-7.6 USA'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/08_90-uno7.6_USA/td_90'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(1, 8))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/08_90-uno7.6_USA/td_uno76usaName'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(2, 8))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/08_90-uno7.6_USA/td_3M19'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(3, 8))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/08_90-uno7.6_USA/td_AMERICAN UNO'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(4, 8))

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/NameSelectOptions/span_md-select-icon'))

sleep(1000)

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/NameSelectOptions/div_CDD'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/09_91-CCD/td_91'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(1, 9))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/09_91-CCD/td_CDDName'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(2, 9))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/09_91-CCD/td_3M60'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(3, 9))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/09_91-CCD/td_CDD'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(4, 9))

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/NameSelectOptions/span_md-select-icon'))

sleep(1000)

WebUI.click(findTestObject('02_ProductLines/02a_Page_ProductLines_List/NameSelectOptions/div_Q0'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/10_92-Q0/td_92'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(1, 10))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/10_92-Q0/td_Q0Name'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(2, 10))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/10_92-Q0/td_Q028'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(3, 10))

WebUiBuiltInKeywords.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Elenco_Oggetti/10_92-Q0/td_CCCP'), 
    findTestData('DB_Conn/DatabaseConnection_PL_List').getValue(4, 10))

WebUI.closeBrowser()

