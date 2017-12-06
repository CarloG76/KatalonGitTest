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

WebUI.click(findTestObject('00_Page_MenuCheck/VociMenu/10_li_Physical Devices'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('09_Page_PhysicalDevices/Intestazioni/01_PhysicalDevices_title'), 
    3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('09_Page_PhysicalDevices/Intestazioni/02_ID'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('09_Page_PhysicalDevices/Intestazioni/03_Name'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('09_Page_PhysicalDevices/Intestazioni/04_Target'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('09_Page_PhysicalDevices/Intestazioni/05_Bootsize'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('09_Page_PhysicalDevices/Intestazioni/06_HeaderAddress'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('09_Page_PhysicalDevices/Intestazioni/06a_HeaderAddress-Start'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('09_Page_PhysicalDevices/Intestazioni/06b_HeaderAddress-Stop'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('09_Page_PhysicalDevices/Intestazioni/07_ApplicationAddress'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('09_Page_PhysicalDevices/Intestazioni/07a_ApplicationAddress-Start'), 
    3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('09_Page_PhysicalDevices/Intestazioni/07b_ApplicationAddress-Stop'), 
    3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('09_Page_PhysicalDevices/Intestazioni/08_AddressAlignment'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('09_Page_PhysicalDevices/Intestazioni/09_FillWholeMemory'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('09_Page_PhysicalDevices/Intestazioni/10_MinBlockSize'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('09_Page_PhysicalDevices/Intestazioni/11_PageSize'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('09_Page_PhysicalDevices/Intestazioni/12_AdaptMemory'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('09_Page_PhysicalDevices/Intestazioni/13_VirtualAddress'), 3)

WebUiBuiltInKeywords.comment('Verifica dei valori con Test Data')

WebUiBuiltInKeywords.verifyElementText(findTestObject('09_Page_PhysicalDevices/Intestazioni/01_PhysicalDevices_title'), findTestData(
        'Physical Devices/Physical Devices - Intestazioni').getValue(1, 1))

WebUiBuiltInKeywords.verifyElementText(findTestObject('09_Page_PhysicalDevices/Intestazioni/02_ID'), findTestData('Physical Devices/Physical Devices - Intestazioni').getValue(
        1, 2))

WebUiBuiltInKeywords.verifyElementText(findTestObject('09_Page_PhysicalDevices/Intestazioni/03_Name'), findTestData('Physical Devices/Physical Devices - Intestazioni').getValue(
        1, 3))

WebUiBuiltInKeywords.verifyElementText(findTestObject('09_Page_PhysicalDevices/Intestazioni/04_Target'), findTestData('Physical Devices/Physical Devices - Intestazioni').getValue(
        1, 4))

WebUiBuiltInKeywords.verifyElementText(findTestObject('09_Page_PhysicalDevices/Intestazioni/05_Bootsize'), findTestData('Physical Devices/Physical Devices - Intestazioni').getValue(
        1, 5))

WebUiBuiltInKeywords.verifyElementText(findTestObject('09_Page_PhysicalDevices/Intestazioni/06_HeaderAddress'), findTestData(
        'Physical Devices/Physical Devices - Intestazioni').getValue(1, 6))

WebUiBuiltInKeywords.verifyElementText(findTestObject('09_Page_PhysicalDevices/Intestazioni/06a_HeaderAddress-Start'), findTestData(
        'Physical Devices/Physical Devices - Intestazioni').getValue(2, 6))

WebUiBuiltInKeywords.verifyElementText(findTestObject('09_Page_PhysicalDevices/Intestazioni/06b_HeaderAddress-Stop'), findTestData(
        'Physical Devices/Physical Devices - Intestazioni').getValue(3, 6))

WebUiBuiltInKeywords.verifyElementText(findTestObject('09_Page_PhysicalDevices/Intestazioni/07_ApplicationAddress'), findTestData(
        'Physical Devices/Physical Devices - Intestazioni').getValue(1, 7))

WebUiBuiltInKeywords.verifyElementText(findTestObject('09_Page_PhysicalDevices/Intestazioni/07a_ApplicationAddress-Start'), 
    findTestData('Physical Devices/Physical Devices - Intestazioni').getValue(2, 7))

WebUiBuiltInKeywords.verifyElementText(findTestObject('09_Page_PhysicalDevices/Intestazioni/07b_ApplicationAddress-Stop'), 
    findTestData('Physical Devices/Physical Devices - Intestazioni').getValue(3, 7))

WebUiBuiltInKeywords.verifyElementText(findTestObject('09_Page_PhysicalDevices/Intestazioni/08_AddressAlignment'), findTestData(
        'Physical Devices/Physical Devices - Intestazioni').getValue(1, 8))

WebUiBuiltInKeywords.verifyElementText(findTestObject('09_Page_PhysicalDevices/Intestazioni/09_FillWholeMemory'), findTestData(
        'Physical Devices/Physical Devices - Intestazioni').getValue(1, 9))

WebUiBuiltInKeywords.verifyElementText(findTestObject('09_Page_PhysicalDevices/Intestazioni/10_MinBlockSize'), findTestData(
        'Physical Devices/Physical Devices - Intestazioni').getValue(1, 10))

WebUiBuiltInKeywords.verifyElementText(findTestObject('09_Page_PhysicalDevices/Intestazioni/11_PageSize'), findTestData('Physical Devices/Physical Devices - Intestazioni').getValue(
        1, 11))

WebUiBuiltInKeywords.verifyElementText(findTestObject('09_Page_PhysicalDevices/Intestazioni/12_AdaptMemory'), findTestData(
        'Physical Devices/Physical Devices - Intestazioni').getValue(1, 12))

WebUiBuiltInKeywords.verifyElementText(findTestObject('09_Page_PhysicalDevices/Intestazioni/13_VirtualAddress'), findTestData(
        'Physical Devices/Physical Devices - Intestazioni').getValue(1, 13))

WebUiBuiltInKeywords.closeBrowser()

