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

'Verifica le intestazioni della tabella'
WebUI.verifyElementPresent(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/00_ProductLines_title'), 3)

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/00_ProductLines_title'), findTestData('Product Lines/Product Lines-Intestazioni').getValue(
        1, 1))

WebUI.verifyElementPresent(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/01_ID_lbl'), 3)

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/01_ID_lbl'), findTestData('Product Lines/Product Lines-Intestazioni').getValue(
        1, 2))

WebUI.verifyElementPresent(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/02_Select'), 3)

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/02_Select'), findTestData('Product Lines/Product Lines-Intestazioni').getValue(
        1, 3))

WebUI.verifyElementPresent(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/03_Reference Part Number_lbl'), 3)

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/03_Reference Part Number_lbl'), findTestData(
        'Product Lines/Product Lines-Intestazioni').getValue(1, 4))

WebUI.verifyElementPresent(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/04_Project Name_lbl'), 3)

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/04_Project Name_lbl'), findTestData('Product Lines/Product Lines-Intestazioni').getValue(
        1, 5))

WebUI.verifyElementPresent(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/05_Product Families List_lbl'), 3)

WebUI.verifyElementText(findTestObject('02_ProductLines/02a_Page_ProductLines_List/Intestazioni/05_Product Families List_lbl'), findTestData(
        'Product Lines/Product Lines-Intestazioni').getValue(1, 6))

WebUiBuiltInKeywords.closeBrowser()

