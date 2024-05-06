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

Mobile.scrollToText('Other')

Mobile.tap(findTestObject('PG_022_Update Account/1. Icon - Organisatin Options'), 0)

Mobile.scrollToText(organisation)

Mobile.tap(findTestObject('PG_022_Update Account/2. Select - Organisation Name',[('OrgName') : organisation]), 0)

Mobile.setText(findTestObject('Object Repository/PG_022_Update Account/3. Set - Website'), Web, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/PG_022_Update Account/4. Button - Save'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/PG_022_Update Account/5. Verify Element - Save after Click'), 
    'Are you sure you want to save these changes?')

Mobile.tap(findTestObject('Object Repository/PG_022_Update Account/6. Confirm - Save'), 0)

Mobile.waitForElementPresent(findTestObject('PG_002_Medics Logout/2. Wait For Element - Change your picture'), 0)

Mobile.scrollToText('Sign out')

Mobile.tap(findTestObject('PG_002_Medics Logout/3. Button - Sign out'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/PG_001_Medics Login/1. Button - Sign in'), 0)

Mobile.closeApplication()

