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

WebUI.callTestCase(findTestCase('utilities/TC_0c-Login Corretto - ReUse'), [:], FailureHandling.STOP_ON_FAILURE)

selfWindowTitle = WebUI.getWindowTitle()

WebUI.verifyEqual(selfWindowTitle, windowTitle)

WebUI.comment('Se mobile menu presente lo apre, altrimenti salta il passaggio. Non bloccante')

viewPort = WebUI.getViewportWidth()

if (viewPort < 1400) {
    println('Viewport: ' + viewPort)

    WebUI.click(findTestObject('Page_MenuCheck/UserMenu/MobileMenu_label_menu-icon'), FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/UserMenu/MobileMenu_a_Home'), 2, FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/UserMenu/MobileMenu_a_Help'), 2, FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/UserMenu/MobileMenu_a_User'), 2, FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/UserMenu/MobileMenu_a_Logout'), 2, FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/UserMenu/WebMenu_a_Home'), 2)

    WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/UserMenu/WebMenu_a_Help'), 2)

    WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/UserMenu/WebMenu_userIcon'), 2)

    WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/UserMenu/WebMenu_a_Logout'), 2)
}

WebUI.callTestCase(findTestCase('utilities/TC_0a-close browser'), [:], FailureHandling.STOP_ON_FAILURE)

