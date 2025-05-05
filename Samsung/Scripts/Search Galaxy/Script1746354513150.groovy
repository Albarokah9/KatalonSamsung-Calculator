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

// Mulai aplikasi
Mobile.startApplication('C:\\Users\\albar\\Katalon Studio\\Samsung\\APK\\Shop _Samsung.apk', true)

// Tap tombol guest dan lanjutkan
Mobile.tap(findTestObject('Search/android.widget.Button_guest'), 0)

Mobile.tap(findTestObject('Search/android.widget.Button_continue'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Search/android.view.View_search'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Search/android.widget.ImageViewPhones'), 0)

Mobile.waitForElementPresent(findTestObject('Search/android.view.View_search'), 10)

Mobile.tap(findTestObject('Search/android.widget.ImageViewGalaxyS'), 0)

Mobile.waitForElementPresent(findTestObject('Search/android.widget.ImageView512GB'), 10)

Mobile.tap(findTestObject('Search/android.widget.ImageView512GB'), 0)

Mobile.scrollToText('Yes, trade-in', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.tap(findTestObject('Search/android.widget.Button - Tradein type Device boldNobold'), 0)

Mobile.scrollToText('I\'m not interested', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.tap(findTestObject('Search/android.widget.Button - Im not interested'), 0)

Mobile.scrollToText('You Saved Today')

Mobile.delay(2)

Mobile.tap(findTestObject('Search/android.widget.Button - Continue2'), 0)

Mobile.scrollToText('Minions Halloween', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

Mobile.tap(findTestObject('Search/android.widget.Button - Skip add-ons'), 0)

Mobile.scrollToText('Estimated Total', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Search/android.widget.Button - Checkout'), 0)

