<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>POST - users</name>
   <tag></tag>
   <elementGuidId>5c6981b9-c43b-4164-8931-a28b0e242ce8</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;id\&quot;: 1,\n    \&quot;name\&quot;: \&quot;${GlobalVariable.name}\&quot;,\n    \&quot;username\&quot;: \&quot;${GlobalVariable.username}\&quot;,\n    \&quot;email\&quot;: \&quot;${GlobalVariable.email}\&quot;,\n    \&quot;address\&quot;: {\n      \&quot;street\&quot;: \&quot;${GlobalVariable.street}\&quot;,\n      \&quot;suite\&quot;: \&quot;${GlobalVariable.suite}\&quot;,\n      \&quot;city\&quot;: \&quot;${GlobalVariable.city}\&quot;,\n      \&quot;zipcode\&quot;: \&quot;${GlobalVariable.zipcode}\&quot;,\n      \&quot;geo\&quot;: {\n        \&quot;lat\&quot;: \&quot;${GlobalVariable.lat}\&quot;,\n        \&quot;lng\&quot;: \&quot;${GlobalVariable.lng}\&quot;\n      }\n    },\n    \&quot;phone\&quot;: \&quot;${GlobalVariable.phone}\&quot;,\n    \&quot;website\&quot;: \&quot;${GlobalVariable.website}\&quot;,\n    \&quot;company\&quot;: {\n      \&quot;name\&quot;: \&quot;${GlobalVariable.companyname}\&quot;,\n      \&quot;catchPhrase\&quot;: \&quot;${GlobalVariable.catchPhrase}\&quot;,\n      \&quot;bs\&quot;: \&quot;${GlobalVariable.bs}\&quot;\n    }\n  }&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>939369e0-1c15-45db-8b75-09a5fdee76e1</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://jsonplaceholder.typicode.com/users</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


WS.verifyResponseStatusCode(response, 201)
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
