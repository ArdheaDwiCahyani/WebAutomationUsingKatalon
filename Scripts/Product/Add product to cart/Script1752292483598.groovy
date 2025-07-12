import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.verifyElementVisible(findTestObject('Object Repository/Product Page/div_Swag Labs'))

WebUI.setText(findTestObject('Object Repository/Product Page/input_Swag Labs_user-name'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Object Repository/Product Page/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Product Page/input_Swag Labs_login-button'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Product Page/span_Products'), 10)

WebUI.waitForElementClickable(findTestObject('Object Repository/Product Page/button_Add to cart_backpack'), 0)
WebUI.click(findTestObject('Object Repository/Product Page/button_Add to cart_backpack'))

WebUI.click(findTestObject('Object Repository/Product Page/a_Swag Labs_shopping_cart_link'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Product Page/div_1Sauce Labs Backpackcarry.allTheThings(_948477'))

