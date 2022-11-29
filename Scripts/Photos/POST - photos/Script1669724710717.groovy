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
import groovy.json.JsonSlurper as JsonSlurper

GlobalVariable.title = 'Agung'
GlobalVariable.url = 'Agung.co.id'
GlobalVariable.thumbnailUrl = 'https://Agung.co.id'


response1 = WS.sendRequest(findTestObject('Photos/POST - photos'))

WS.verifyResponseStatusCode(response1, 201)
WS.verifyElementPropertyValue(response1, 'title', 'Agung')
WS.verifyElementPropertyValue(response1, 'url', 'Agung.co.id')
WS.verifyElementPropertyValue(response1, 'thumbnailUrl', 'https://Agung.co.id')

GlobalVariable.title = 'Muzaki'
GlobalVariable.url = 'Muzaki.co.id'
GlobalVariable.thumbnailUrl = 'https://Muzaki.co.id'


response2 = WS.sendRequest(findTestObject('Photos/POST - photos'))

WS.verifyResponseStatusCode(response2, 201)
WS.verifyElementPropertyValue(response2, 'title', 'Muzaki')
WS.verifyElementPropertyValue(response2, 'url', 'Muzaki.co.id')
WS.verifyElementPropertyValue(response2, 'thumbnailUrl', 'https://Muzaki.co.id')
