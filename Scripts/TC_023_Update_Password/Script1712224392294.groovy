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

Mobile.startApplication(GlobalVariable.App_Path, true)

Mobile.tap(findTestObject('PG_001_Medics Login/1. Button - Sign in'), 0)

Mobile.setText(findTestObject('Object Repository/PG_001_Medics Login/2. Input - Email address'), GlobalVariable.Email, 0)

Mobile.setText(findTestObject('Object Repository/PG_001_Medics Login/3. Input - Password'), GlobalVariable.Password, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('PG_001_Medics Login/1. Button - Sign in'), 0)

Mobile.waitForElementPresent(findTestObject('PG_001_Medics Login/4. Wait For Element - Choose your programme'), 0)

Mobile.tap(findTestObject('PG_002_Medics Logout/1. Icon - Profile'), 0)

Mobile.waitForElementPresent(findTestObject('PG_002_Medics Logout/2. Wait For Element - Change your picture'), 0)

Mobile.tap(findTestObject('Object Repository/PG_023_Update Password/1. Move to tab - Password'), 0)

Mobile.setText(findTestObject('Object Repository/PG_023_Update Password/2. Set - Current password'), GlobalVariable.Password, 
    0)

Mobile.setText(findTestObject('Object Repository/PG_023_Update Password/3. Set - New password'), NewPassowrd, 0)

Mobile.setText(findTestObject('Object Repository/PG_023_Update Password/4. Set - Confirm password'), NewPassowrd, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/PG_023_Update Password/5. Show and Hide Mask Passwords'), 0)

Mobile.tap(findTestObject('Object Repository/PG_023_Update Password/5. Show and Hide Mask Passwords'), 0)

Mobile.tap(findTestObject('Object Repository/PG_023_Update Password/6. Button - Save'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/PG_023_Update Password/7. Verify Element - Are you sure you want to save these changes'), 
    'Are you sure you want to save these changes?')

Mobile.tap(findTestObject('PG_023_Update Password/8. Button - Confirm save'), 0)

Mobile.waitForElementPresent(findTestObject('PG_023_Update Password/9. Wait For Element - Password successfully updated'), 
    0)

Mobile.tap(findTestObject('Object Repository/PG_023_Update Password/10. Button - Ok'), 0)

Mobile.tap(findTestObject('Object Repository/PG_023_Update Password/11. Tab - My Account'), 0)

Mobile.scrollToText('Sign out')

Mobile.tap(findTestObject('PG_002_Medics Logout/3. Button - Sign out'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/PG_001_Medics Login/1. Button - Sign in'), 0)

Mobile.closeApplication()

