# GraniteController

All URIs are relative to `""`

The controller class is defined in **[GraniteController.java](../../src/main/java/org/openapitools/controller/GraniteController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**sslSetup**](#sslSetup) | **POST** /libs/granite/security/post/sslSetup.html | 

<a id="sslSetup"></a>
# **sslSetup**
```java
Mono<String> GraniteController.sslSetup(keystorePasswordkeystorePasswordConfirmtruststorePasswordtruststorePasswordConfirmhttpsHostnamehttpsPortprivatekeyFilecertificateFile)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**keystorePassword** | `String` |  |
**keystorePasswordConfirm** | `String` |  |
**truststorePassword** | `String` |  |
**truststorePasswordConfirm** | `String` |  |
**httpsHostname** | `String` |  |
**httpsPort** | `String` |  |
**privatekeyFile** | `CompletedFileUpload` |  | [optional parameter]
**certificateFile** | `CompletedFileUpload` |  | [optional parameter]

### Return type
`String`

### Authorization
* **aemAuth**

### HTTP request headers
 - **Accepts Content-Type**: `multipart/form-data`
 - **Produces Content-Type**: `text/plain`

