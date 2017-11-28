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
    WebUiBuiltInKeywords.click(findTestObject('Page_MenuCheck/MenuResponsiveArrow'))
}

WebUI.focus(findTestObject('Page_MenuCheck/NavArrows/ProdLinesArrow_opn'))

WebUI.click(findTestObject('Page_MenuCheck/NavArrows/ProdLinesArrow_opn'))

WebUI.click(findTestObject('Page_MenuCheck/NavArrows/ProdFamsArrow_cls'))

'Apertura pagina PL > Datasheet'
WebUI.click(findTestObject('Page_MenuCheck/VociMenu/04a_ProductFamilies_List'))

WebUI.click(findTestObject('RECORDED_LAST_/md-select_select_19 (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/md-option_select_option_40 (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/span_md-select-icon (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/md-option_select_option_41 (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/span_md-select-icon (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/md-option_select_option_42 (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/span_md-select-icon (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/md-option_select_option_43 (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/span_md-select-icon (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/md-option_select_option_44 (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/span_md-select-icon (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/md-option_select_option_45 (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/span_md-select-icon (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/md-option_select_option_46 (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/span_md-select-icon (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/md-option_select_option_47 (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/span_md-select-icon (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/md-option_select_option_48 (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/span_md-select-icon (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/md-option_select_option_49 (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/span_md-select-icon (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/md-option_select_option_51 (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/span_md-select-icon (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/md-option_select_option_52 (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/span_md-select-icon (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/md-option_select_option_53 (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/span_md-select-icon (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/md-option_select_option_54 (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/span_md-select-icon (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/md-option_select_option_55 (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/span_md-select-icon (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/md-option_select_option_56 (1)'))

WebUI.click(findTestObject('RECORDED_LAST_/span_md-select-icon (1)'))

WebUI.closeBrowser()

