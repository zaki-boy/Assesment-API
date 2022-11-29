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

GlobalVariable.name = 'Agung'
GlobalVariable.username = 'Agungmuzaki'
GlobalVariable.email = 'Agung@gmail.com'
GlobalVariable.street = 'karang kates raya'
GlobalVariable.suite = 'home'
GlobalVariable.city = 'tangerang'
GlobalVariable.zipcode = '109101'
GlobalVariable.lat = '-18171'
GlobalVariable.lng = '-18181'
GlobalVariable.phone = '0817176161'
GlobalVariable.website = 'Agung.co.id'
GlobalVariable.companyname = 'PT Agung'
GlobalVariable.catchPhrase = 'PAgung'
GlobalVariable.bs = 'LAgung'

response1 = WS.sendRequest(findTestObject('Users/POST - users'))

WS.verifyResponseStatusCode(response1, 201)
WS.verifyElementPropertyValue(response1, 'name', 'Agung')
WS.verifyElementPropertyValue(response1, 'username', 'Agungmuzaki')
WS.verifyElementPropertyValue(response1, 'email', 'Agung@gmail.com')
WS.verifyElementPropertyValue(response1, 'address.street', 'karang kates raya')
WS.verifyElementPropertyValue(response1, 'address.suite', 'home')
WS.verifyElementPropertyValue(response1, 'address.city', 'tangerang')
WS.verifyElementPropertyValue(response1, 'address.zipcode', '109101')
WS.verifyElementPropertyValue(response1, 'address.geo.lat', '-18171')
WS.verifyElementPropertyValue(response1, 'address.geo.lng', '-18181')
WS.verifyElementPropertyValue(response1, 'phone', '0817176161')
WS.verifyElementPropertyValue(response1, 'website', 'Agung.co.id')
WS.verifyElementPropertyValue(response1, 'company.name', 'PT Agung')
WS.verifyElementPropertyValue(response1, 'company.catchPhrase', 'PAgung')
WS.verifyElementPropertyValue(response1, 'company.bs', 'LAgung')


GlobalVariable.name = 'muzaki'
GlobalVariable.username = 'muzakiprasetya'
GlobalVariable.email = 'muzaki@gmail.com'
GlobalVariable.street = 'karang kates raya 9'
GlobalVariable.suite = '-'
GlobalVariable.city = 'tangerang'
GlobalVariable.zipcode = '10911101'
GlobalVariable.lat = '-1813371'
GlobalVariable.lng = '-1814481'
GlobalVariable.phone = '081722176161'
GlobalVariable.website = 'muzaki.co.id'
GlobalVariable.companyname = 'CV Agung'
GlobalVariable.catchPhrase = 'KAgung'
GlobalVariable.bs = 'WAgung'

response2 = WS.sendRequest(findTestObject('Users/POST - users'))

WS.verifyResponseStatusCode(response2, 201)
WS.verifyElementPropertyValue(response2, 'name', 'muzaki')
WS.verifyElementPropertyValue(response2, 'username', 'muzakiprasetya')
WS.verifyElementPropertyValue(response2, 'email', 'muzaki@gmail.com')
WS.verifyElementPropertyValue(response2, 'address.street', 'karang kates raya 9')
WS.verifyElementPropertyValue(response2, 'address.suite', '-')
WS.verifyElementPropertyValue(response2, 'address.city', 'tangerang')
WS.verifyElementPropertyValue(response2, 'address.zipcode', '10911101')
WS.verifyElementPropertyValue(response2, 'address.geo.lat', '-1813371')
WS.verifyElementPropertyValue(response2, 'address.geo.lng', '-1814481')
WS.verifyElementPropertyValue(response2, 'phone', '081722176161')
WS.verifyElementPropertyValue(response2, 'website', 'muzaki.co.id')
WS.verifyElementPropertyValue(response2, 'company.name', 'CV Agung')
WS.verifyElementPropertyValue(response2, 'company.catchPhrase', 'KAgung')
WS.verifyElementPropertyValue(response2, 'company.bs', 'WAgung')

