import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
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

viewportWidth = WebUI.getViewportWidth()

if (viewportWidth < 1400) {
    WebUI.click(findTestObject('Page_MenuCheck/MenuResponsiveArrow'), FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/01_li_Assets'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/01_li_Assets'), findTestData('BenGenMenu').getValue(1, 1), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/02_li_Tree View'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/02_li_Tree View'), findTestData('BenGenMenu').getValue(1, 
        2), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_MenuCheck/NavArrows/ProdLinesArrow_opn'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/03_li_Product lines'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/03_li_Product lines'), findTestData('BenGenMenu').getValue(
        1, 3), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_MenuCheck/NavArrows/ProdLinesArrow_cls'))

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/03a_ProductLines_List'), findTestData('BenGenMenu').getValue(
        2, 3), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/03b_ProductLines_Datasheet'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/04_li_Product Families'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_MenuCheck/NavArrows/ProdLinesArrow_opn'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/04_li_Product Families'), findTestData('BenGenMenu').getValue(
        1, 4), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_MenuCheck/NavArrows/ProdFamsArrow_cls'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/04a_ProductFamilies_List'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/04a_ProductFamilies_List'), findTestData('BenGenMenu').getValue(
        2, 4), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/04b_ProductFamilies_Datasheet'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/04b_ProductFamilies_Datasheet'), findTestData('BenGenMenu').getValue(
        3, 4), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_MenuCheck/NavArrows/ProdFamsArrow_opn'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/05_li_Product Models'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/05_li_Product Models'), findTestData('BenGenMenu').getValue(
        1, 5), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/06_li_Country Areas'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/06_li_Country Areas'), findTestData('BenGenMenu').getValue(
        1, 6), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/07_li_Country Standards'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/07_li_Country Standards'), findTestData('BenGenMenu').getValue(
        1, 7), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/08_li_Functional Groups'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/08_li_Functional Groups'), findTestData('BenGenMenu').getValue(
        1, 8), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/09_li_Logical Devices'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/09_li_Logical Devices'), findTestData('BenGenMenu').getValue(
        1, 9), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/10_li_Physical Devices'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/10_li_Physical Devices'), findTestData('BenGenMenu').getValue(
        1, 10), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/11_li_Firmwares'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/11_li_Firmwares'), findTestData('BenGenMenu').getValue(1, 
        11), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/12_li_Bootloaders'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/12_li_Bootloaders'), findTestData('BenGenMenu').getValue(1, 12), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_MenuCheck/NavArrows/Bootloaders_cls'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/12a_Bootloaders_list'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/12a_Bootloaders_list'), findTestData('BenGenMenu').getValue(
        2, 12), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/12b_Bootloaders_new'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/12b_Bootloaders_new'), findTestData('BenGenMenu').getValue(
        3, 12), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_MenuCheck/NavArrows/Bootloaders_opn'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/13_li_BENs'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/13_li_BENs'), findTestData('BenGenMenu').getValue(1, 13), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_MenuCheck/NavArrows/Ben_cls'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/13a_Ben_List'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/13a_Ben_List'), findTestData('BenGenMenu').getValue(2, 13), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/13b_Ben_New BEN'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/13b_Ben_New BEN'), findTestData('BenGenMenu').getValue(3, 
        13), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_MenuCheck/NavArrows/Ben_opn'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_MenuCheck/VociMenu/14_li_Bundle'), 3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Page_MenuCheck/VociMenu/14_li_Bundle'), findTestData('BenGenMenu').getValue(1, 14), FailureHandling.STOP_ON_FAILURE)

if (viewportWidth < 1400) {
    WebUI.click(findTestObject('Page_MenuCheck/MenuResponsiveArrow'), FailureHandling.CONTINUE_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('utilities/TC_0a-close browser'), [:], FailureHandling.STOP_ON_FAILURE)

