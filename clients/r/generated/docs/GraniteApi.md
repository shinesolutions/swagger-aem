# GraniteApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SslSetup**](GraniteApi.md#SslSetup) | **POST** /libs/granite/security/post/sslSetup.html | 


# **SslSetup**
> character SslSetup(keystore.password, keystore.password.confirm, truststore.password, truststore.password.confirm, https.hostname, https.port, privatekey.file=var.privatekey.file, certificate.file=var.certificate.file)



### Example
```R
library(openapi)

var.keystore.password <- 'keystore.password_example' # character | 
var.keystore.password.confirm <- 'keystore.password.confirm_example' # character | 
var.truststore.password <- 'truststore.password_example' # character | 
var.truststore.password.confirm <- 'truststore.password.confirm_example' # character | 
var.https.hostname <- 'https.hostname_example' # character | 
var.https.port <- 'https.port_example' # character | 
var.privatekey.file <- File.new('/path/to/file') # data.frame | 
var.certificate.file <- File.new('/path/to/file') # data.frame | 

api.instance <- GraniteApi$new()
# Configure HTTP basic authorization: aemAuth
api.instance$apiClient$username <- 'TODO_YOUR_USERNAME';
api.instance$apiClient$password <- 'TODO_YOUR_PASSWORD';
result <- api.instance$SslSetup(var.keystore.password, var.keystore.password.confirm, var.truststore.password, var.truststore.password.confirm, var.https.hostname, var.https.port, privatekey.file=var.privatekey.file, certificate.file=var.certificate.file)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keystore.password** | **character**|  | 
 **keystore.password.confirm** | **character**|  | 
 **truststore.password** | **character**|  | 
 **truststore.password.confirm** | **character**|  | 
 **https.hostname** | **character**|  | 
 **https.port** | **character**|  | 
 **privatekey.file** | **data.frame**|  | [optional] 
 **certificate.file** | **data.frame**|  | [optional] 

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

