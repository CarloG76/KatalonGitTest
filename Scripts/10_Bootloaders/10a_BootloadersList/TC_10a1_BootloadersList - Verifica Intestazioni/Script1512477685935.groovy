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

WebUI.focus(findTestObject('00_Page_MenuCheck/NavArrows/Bootloaders_cls'))

WebUiBuiltInKeywords.click(findTestObject('00_Page_MenuCheck/NavArrows/Bootloaders_cls'))

WebUI.focus(findTestObject('00_Page_MenuCheck/VociMenu/12a_Bootloaders_list'))

WebUiBuiltInKeywords.click(findTestObject('00_Page_MenuCheck/VociMenu/12a_Bootloaders_list'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('10_Page_Bootloaders/10a_Page_Bootloaders_List/Intestazioni/01_BootloadersList_title'), 
    3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('10_Page_Bootloaders/10a_Page_Bootloaders_List/Intestazioni/02_ID'), 
    3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('10_Page_Bootloaders/10a_Page_Bootloaders_List/Intestazioni/03_FamilyName_select'), 
    3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('10_Page_Bootloaders/10a_Page_Bootloaders_List/Intestazioni/04_Models_select'), 
    3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('10_Page_Bootloaders/10a_Page_Bootloaders_List/Intestazioni/06_Name'), 
    3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('08_Page_LogicalDevices/Intestazioni/06_SupportsMonolithic'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('10_Page_Bootloaders/10a_Page_Bootloaders_List/Intestazioni/07_Created at'), 
    3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('10_Page_Bootloaders/10a_Page_Bootloaders_List/Intestazioni/08_MD5 SUM'), 
    3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('10_Page_Bootloaders/10a_Page_Bootloaders_List/Intestazioni/09_Active'), 
    3)

WebUiBuiltInKeywords.comment('Verifica dei valori con Test Data')

WebUiBuiltInKeywords.verifyElementText(findTestObject('10_Page_Bootloaders/10a_Page_Bootloaders_List/Intestazioni/01_BootloadersList_title'), 
    findTestData('Bootloaders/BootloadersList - Intestazioni').getValue(1, 1))

WebUiBuiltInKeywords.verifyElementText(findTestObject('10_Page_Bootloaders/10a_Page_Bootloaders_List/Intestazioni/02_ID'), 
    findTestData('Bootloaders/BootloadersList - Intestazioni').getValue(1, 2))

WebUiBuiltInKeywords.verifyElementText(findTestObject('10_Page_Bootloaders/10a_Page_Bootloaders_List/Intestazioni/03_FamilyName_select'), 
    findTestData('Bootloaders/BootloadersList - Intestazioni').getValue(1, 3))

WebUiBuiltInKeywords.verifyElementText(findTestObject('10_Page_Bootloaders/10a_Page_Bootloaders_List/Intestazioni/04_Models_select'), 
    findTestData('Bootloaders/BootloadersList - Intestazioni').getValue(1, 4))

WebUiBuiltInKeywords.verifyElementText(findTestObject('10_Page_Bootloaders/10a_Page_Bootloaders_List/Intestazioni/05_Logical Device'), 
    findTestData('Bootloaders/BootloadersList - Intestazioni').getValue(1, 5))

WebUiBuiltInKeywords.verifyElementText(findTestObject('10_Page_Bootloaders/10a_Page_Bootloaders_List/Intestazioni/06_Name'), 
    findTestData('Bootloaders/BootloadersList - Intestazioni').getValue(1, 6))

WebUiBuiltInKeywords.verifyElementText(findTestObject('10_Page_Bootloaders/10a_Page_Bootloaders_List/Intestazioni/07_Created at'), 
    findTestData('Bootloaders/BootloadersList - Intestazioni').getValue(1, 7))

WebUiBuiltInKeywords.verifyElementText(findTestObject('10_Page_Bootloaders/10a_Page_Bootloaders_List/Intestazioni/08_MD5 SUM'), 
    findTestData('Bootloaders/BootloadersList - Intestazioni').getValue(1, 8))

WebUiBuiltInKeywords.verifyElementText(findTestObject('10_Page_Bootloaders/10a_Page_Bootloaders_List/Intestazioni/09_Active'), 
    findTestData('Bootloaders/BootloadersList - Intestazioni').getValue(1, 9))

WebUiBuiltInKeywords.closeBrowser()

