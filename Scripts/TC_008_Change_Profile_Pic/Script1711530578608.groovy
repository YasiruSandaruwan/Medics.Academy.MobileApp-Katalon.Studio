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

Mobile.tap(findTestObject('Object Repository/PG_001_Medics Login/1. Button - Sign in'), 0)

Mobile.setText(findTestObject('Object Repository/PG_001_Medics Login/2. Input - Email address'), GlobalVariable.Email, 0)

Mobile.setText(findTestObject('Object Repository/PG_001_Medics Login/3. Input - Password'), GlobalVariable.Password, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('PG_001_Medics Login/1. Button - Sign in'), 0)

Mobile.waitForElementPresent(findTestObject('PG_001_Medics Login/4. Wait For Element - Choose your programme'), 0)

Mobile.tap(findTestObject('PG_002_Medics Logout/1. Icon - Profile'), 0)

Mobile.waitForElementPresent(findTestObject('PG_002_Medics Logout/2. Wait For Element - Change your picture'), 0)

Mobile.tap(findTestObject('PG_008_Change Profile Picture/1. Element - Change your picture'), 0)

Mobile.tap(findTestObject('PG_008_Change Profile Picture/2. Button - Go to photos'), 0)

Mobile.tap(findTestObject('PG_008_Change Profile Picture/3. Button - Photos'), 0)

Mobile.tap(findTestObject('PG_008_Change Profile Picture/4. Button - Download'), 0)

Mobile.tap(findTestObject('PG_008_Change Profile Picture/5. Image - select'), 0)

Mobile.tap(findTestObject('PG_008_Change Profile Picture/6. Image - Click'), 0)

Mobile.waitForElementPresent(findTestObject('PG_002_Medics Logout/2. Wait For Element - Change your picture'), 0)

Mobile.tap(findTestObject('PG_008_Change Profile Picture/7. Button - Save'), 0)

Mobile.waitForElementPresent(findTestObject('PG_008_Change Profile Picture/8. Wait For Element - Are you sure you want to save these changes'), 
    0)

Mobile.tap(findTestObject('PG_008_Change Profile Picture/9. Save Confirm - Save'), 0)

Mobile.waitForElementPresent(findTestObject('PG_002_Medics Logout/2. Wait For Element - Change your picture'), 0)

Mobile.scrollToText('Sign out')

Mobile.tap(findTestObject('PG_002_Medics Logout/3. Button - Sign out'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/PG_001_Medics Login/1. Button - Sign in'), 60)

Mobile.closeApplication()

