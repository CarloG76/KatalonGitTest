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

WebUI.click(findTestObject('Page_ProductLines_List/Intestazioni/02_Select'))

'Seleziona e verifica risutato selezione'
WebUI.click(findTestObject('Page_ProductLines_List/NameSelectOptions/div_EVO'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/83-evo/td_83'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(1, 1))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/83-evo/td_evoName'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(2, 1))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/83-evo/td_3I72'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(3, 1))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/83-evo/td_Evo'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(4, 1))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/83-evo/td_evoPFL'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(5, 1))

WebUI.click(findTestObject('Page_ProductLines_List/NameSelectOptions/span_md-select-icon'))

sleep(1000)

WebUI.click(findTestObject('Page_ProductLines_List/NameSelectOptions/div_UNO'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/84-uno/td_84'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(1, 2))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/84-uno/td_unoName'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(2, 2))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/84-uno/td_3N41'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(3, 2))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/84-uno/td_UNO low cost'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(4, 2))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/84-uno/td_unoPFL'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(5, 2))

WebUI.click(findTestObject('Page_ProductLines_List/NameSelectOptions/span_md-select-icon'))

sleep(1000)

WebUI.click(findTestObject('Page_ProductLines_List/NameSelectOptions/div_UNO-DM VEGA'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/85-uno_dm_vega/td_85'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(1, 3))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/85-uno_dm_vega/td_unoDMVegaName'), 
    findTestData('Product Lines/ProductLines-Oggetti').getValue(2, 3))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/85-uno_dm_vega/td_3P25'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(3, 3))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/85-uno_dm_vega/td_VEGA B'), 
    findTestData('Product Lines/ProductLines-Oggetti').getValue(4, 3))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/85-uno_dm_vega/td_unoDMVegaPFL'), 
    findTestData('Product Lines/ProductLines-Oggetti').getValue(5, 3))

WebUI.click(findTestObject('Page_ProductLines_List/NameSelectOptions/span_md-select-icon'))

sleep(1000)

WebUI.click(findTestObject('Page_ProductLines_List/NameSelectOptions/div_TRIO-50'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/86-trio_50/td_86'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(1, 4))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/86-trio_50/td_trio50Name'), 
    findTestData('Product Lines/ProductLines-Oggetti').getValue(2, 4))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/86-trio_50/td_3N63'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(3, 4))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/86-trio_50/td_TRIO-50'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(4, 4))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/86-trio_50/td_trio5PFL'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(5, 4))

WebUI.click(findTestObject('Page_ProductLines_List/NameSelectOptions/span_md-select-icon'))

sleep(1000)

WebUI.click(findTestObject('Page_ProductLines_List/NameSelectOptions/div_REACT'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/87-React/td_87'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(1, 5))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/87-React/td_reactName'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(2, 5))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/87-React/td_3N08'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(3, 5))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/87-React/td_REACT'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(4, 5))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/87-React/td_reactPFL'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(5, 5))

WebUI.click(findTestObject('Page_ProductLines_List/NameSelectOptions/span_md-select-icon'))

sleep(1000)

WebUI.click(findTestObject('Page_ProductLines_List/NameSelectOptions/div_WIFI'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/88-Wifi/td_88'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(1, 6))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/88-Wifi/td_wifiName'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(2, 6))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/88-Wifi/td_3N16'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(3, 6))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/88-Wifi/td_WIFI Logger Card'), 
    findTestData('Product Lines/ProductLines-Oggetti').getValue(4, 6))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/88-Wifi/td_wifiPFL'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(5, 6))

WebUI.click(findTestObject('Page_ProductLines_List/NameSelectOptions/span_md-select-icon'))

sleep(1000)

WebUI.click(findTestObject('Page_ProductLines_List/NameSelectOptions/div_TRIO-8.5 BABY'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/89-Trio8.5_Baby/td_89'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(1, 7))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/89-Trio8.5_Baby/td_trio85babyName'), 
    findTestData('Product Lines/ProductLines-Oggetti').getValue(2, 7))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/89-Trio8.5_Baby/td_3M99'), 
    findTestData('Product Lines/ProductLines-Oggetti').getValue(3, 7))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/89-Trio8.5_Baby/td_TRIO BABY'), 
    findTestData('Product Lines/ProductLines-Oggetti').getValue(4, 7))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/89-Trio8.5_Baby/td_trio85babyPFL'), 
    findTestData('Product Lines/ProductLines-Oggetti').getValue(5, 7))

WebUI.click(findTestObject('Page_ProductLines_List/NameSelectOptions/span_md-select-icon'))

sleep(1000)

WebUI.click(findTestObject('Page_ProductLines_List/NameSelectOptions/div_UNO-7.6 USA'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/90-uno7.6_USA/td_90'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(1, 8))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/90-uno7.6_USA/td_uno76usaName'), 
    findTestData('Product Lines/ProductLines-Oggetti').getValue(2, 8))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/90-uno7.6_USA/td_3M19'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(3, 8))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/90-uno7.6_USA/td_AMERICAN UNO'), 
    findTestData('Product Lines/ProductLines-Oggetti').getValue(4, 8))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/90-uno7.6_USA/td_uno76usaPFL'), 
    findTestData('Product Lines/ProductLines-Oggetti').getValue(5, 8))

WebUI.click(findTestObject('Page_ProductLines_List/NameSelectOptions/span_md-select-icon'))

sleep(1000)

WebUI.click(findTestObject('Page_ProductLines_List/NameSelectOptions/div_CDD'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/91-CCD/td_91'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(1, 9))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/91-CCD/td_CDDName'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(2, 9))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/91-CCD/td_3M60'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(3, 9))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/91-CCD/td_CDD'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(4, 9))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/91-CCD/td_CDDPFL'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(5, 9))

WebUI.click(findTestObject('Page_ProductLines_List/NameSelectOptions/span_md-select-icon'))

sleep(1000)

WebUI.click(findTestObject('Page_ProductLines_List/NameSelectOptions/div_Q0'))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/92-Q0/td_92'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(1, 10))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/92-Q0/td_Q0Name'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(2, 10))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/92-Q0/td_Q028'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(3, 10))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/92-Q0/td_CCCP'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(4, 10))

WebUiBuiltInKeywords.verifyElementText(findTestObject('Page_ProductLines_List/Elenco_Oggetti/92-Q0/td_Q0PFL'), findTestData(
        'Product Lines/ProductLines-Oggetti').getValue(5, 10))

WebUI.closeBrowser()

