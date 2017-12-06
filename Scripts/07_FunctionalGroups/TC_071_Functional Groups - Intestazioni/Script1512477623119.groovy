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

WebUiBuiltInKeywords.click(findTestObject('00_Page_MenuCheck/VociMenu/08_li_Functional Groups'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('07_Page_FunctionalGroups/Intestazioni/01_FunctionalGroups_title'), 
    3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('07_Page_FunctionalGroups/Intestazioni/02_ID'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('07_Page_FunctionalGroups/Intestazioni/03_Name'), 3)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('07_Page_FunctionalGroups/Intestazioni/04_Code'), 3)

WebUiBuiltInKeywords.comment('Verifica dei valori con Test Data')

WebUiBuiltInKeywords.verifyElementText(findTestObject('07_Page_FunctionalGroups/Intestazioni/01_FunctionalGroups_title'), findTestData(
        'Functional Groups/Functional Groups - Intestazioni').getValue(1, 1))

WebUiBuiltInKeywords.verifyElementText(findTestObject('07_Page_FunctionalGroups/Intestazioni/02_ID'), findTestData('Functional Groups/Functional Groups - Intestazioni').getValue(
        1, 2))

WebUiBuiltInKeywords.verifyElementText(findTestObject('07_Page_FunctionalGroups/Intestazioni/03_Name'), findTestData('Functional Groups/Functional Groups - Intestazioni').getValue(
        1, 3))

WebUiBuiltInKeywords.verifyElementText(findTestObject('07_Page_FunctionalGroups/Intestazioni/04_Code'), findTestData('Functional Groups/Functional Groups - Intestazioni').getValue(
        1, 4))

WebUiBuiltInKeywords.closeBrowser()

