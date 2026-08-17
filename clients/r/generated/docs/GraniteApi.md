# GraniteApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SslSetup**](GraniteApi.md#SslSetup) | **POST** /libs/granite/security/post/sslSetup.html | 


# **SslSetup**
> character SslSetup(keystore_password, keystore_password_confirm, truststore_password, truststore_password_confirm, https_hostname, https_port, privatekey_file = var.privatekey_file, certificate_file = var.certificate_file)



### Example
```R
library(openapi)

# prepare function argument(s)
var_keystore_password <- "keystore_password_example" # character | 
var_keystore_password_confirm <- "keystore_password_confirm_example" # character | 
var_truststore_password <- "truststore_password_example" # character | 
var_truststore_password_confirm <- "truststore_password_confirm_example" # character | 
var_https_hostname <- "https_hostname_example" # character | 
var_https_port <- "https_port_example" # character | 
var_privatekey_file <- File.new('/path/to/file') # data.frame |  (Optional)
var_certificate_file <- File.new('/path/to/file') # data.frame |  (Optional)

api_instance <- GraniteApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$SslSetup(var_keystore_password, var_keystore_password_confirm, var_truststore_password, var_truststore_password_confirm, var_https_hostname, var_https_port, privatekey_file = var_privatekey_file, certificate_file = var_certificate_filedata_file = "result.txt")
result <- api_instance$SslSetup(var_keystore_password, var_keystore_password_confirm, var_truststore_password, var_truststore_password_confirm, var_https_hostname, var_https_port, privatekey_file = var_privatekey_file, certificate_file = var_certificate_file)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keystore_password** | **character**|  | 
 **keystore_password_confirm** | **character**|  | 
 **truststore_password** | **character**|  | 
 **truststore_password_confirm** | **character**|  | 
 **https_hostname** | **character**|  | 
 **https_port** | **character**|  | 
 **privatekey_file** | **data.frame**|  | [optional] 
 **certificate_file** | **data.frame**|  | [optional] 

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

