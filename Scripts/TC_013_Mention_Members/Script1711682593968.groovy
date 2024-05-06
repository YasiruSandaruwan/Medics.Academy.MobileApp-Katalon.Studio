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

Mobile.tap(findTestObject('PG_003_Medics WorkspaceAccess/1. Icon - WorkSpace', [('WorkSpace') : WorkSpaceName]), 0)

Mobile.waitForElementPresent(findTestObject('PG_003_Medics WorkspaceAccess/2. Wait For Element - WorkSpace', [('WorkSpace') : WorkSpaceName]), 
    0)

Mobile.tap(findTestObject('PG_007_Create Channel/1. Icon - Create Channel'), 0)

Mobile.tap(findTestObject('PG_007_Create Channel/2. Button - Create Channel'), 0)

Mobile.setText(findTestObject('PG_007_Create Channel/3. Input - Channel name'), ChannelName, 0)

Mobile.setText(findTestObject('PG_007_Create Channel/4. Input - Channel description'), ChannelDescription, 0)

Mobile.hideKeyboard()

if ((MakePrivate == 'Yes') || (MakePrivate == 'yes')) {
    Mobile.tap(findTestObject('PG_007_Create Channel/5. Switch - to Private'), 0)
}

Mobile.tap(findTestObject('PG_007_Create Channel/6. Button - Create Channel'), 0)

Mobile.waitForElementPresent(findTestObject('PG_007_Create Channel/7. Wait For Element - Channel Name', [('Channelname') : ChannelName]), 
    0)

Mobile.verifyElementText(findTestObject('PG_007_Create Channel/8. Verify - Channel Name', [('VerifyChannelName') : ChannelName]), 
    ChannelName)

Mobile.verifyElementText(findTestObject('PG_007_Create Channel/9. Verify - Channel Description', [('VerifyChannelDescription') : ChannelDescription]), 
    ChannelDescription)

Mobile.tap(findTestObject('Object Repository/PG_009_Leave From Channel/1. Icon - Channel Settings'), 0)

Mobile.tap(findTestObject('Object Repository/PG_010_Add People to Channel/1. Button - Add people'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/PG_010_Add People to Channel/2. Wait For Element - Add People'), 
    0)

Mobile.scrollToText(PeopleName)

Mobile.tap(findTestObject('Object Repository/PG_010_Add People to Channel/3. Click Name - People Name', [('PeopleName') : PeopleName]), 
    0)

Mobile.tap(findTestObject('Object Repository/PG_010_Add People to Channel/4. Button - Add'), 0)

Mobile.waitForElementPresent(findTestObject('PG_007_Create Channel/7. Wait For Element - Channel Name', [('Channelname') : ChannelName]), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/PG_010_Add People to Channel/5. Verify Element - After Added', 
        [('VerifyPeopleName') : PeopleName]), ('@' + PeopleName) + ' has been added')

Mobile.setText(findTestObject('Object Repository/PG_013_Mention Members/1. Element - Send a message'), (('@' + PeopleName) + 
    ' ') + Message, 0)

Mobile.tap(findTestObject('Object Repository/PG_013_Mention Members/2. Button - send'), 0)

Mobile.hideKeyboard()

Mobile.pressBack()

Mobile.waitForElementPresent(findTestObject('Object Repository/PG_009_Leave From Channel/5.Wait For Element - Channel'), 
    0)

Mobile.tap(findTestObject('PG_003_Medics WorkspaceAccess/3. Icon - Menu'), 0)

Mobile.tap(findTestObject('PG_003_Medics WorkspaceAccess/4. Element - My Account'), 0)

Mobile.waitForElementPresent(findTestObject('PG_002_Medics Logout/2. Wait For Element - Change your picture'), 0)

Mobile.scrollToText('Sign out')

Mobile.tap(findTestObject('PG_002_Medics Logout/3. Button - Sign out'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/PG_001_Medics Login/1. Button - Sign in'), 0)

Mobile.closeApplication()

