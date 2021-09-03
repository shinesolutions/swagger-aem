# \GraniteApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SslSetup**](GraniteApi.md#SslSetup) | **Post** /libs/granite/security/post/sslSetup.html | 



## SslSetup

> string SslSetup(ctx).KeystorePassword(keystorePassword).KeystorePasswordConfirm(keystorePasswordConfirm).TruststorePassword(truststorePassword).TruststorePasswordConfirm(truststorePasswordConfirm).HttpsHostname(httpsHostname).HttpsPort(httpsPort).PrivatekeyFile(privatekeyFile).CertificateFile(certificateFile).Execute()



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    keystorePassword := "keystorePassword_example" // string | 
    keystorePasswordConfirm := "keystorePasswordConfirm_example" // string | 
    truststorePassword := "truststorePassword_example" // string | 
    truststorePasswordConfirm := "truststorePasswordConfirm_example" // string | 
    httpsHostname := "httpsHostname_example" // string | 
    httpsPort := "httpsPort_example" // string | 
    privatekeyFile := os.NewFile(1234, "some_file") // *os.File |  (optional)
    certificateFile := os.NewFile(1234, "some_file") // *os.File |  (optional)

    configuration := openapiclient.NewConfiguration()
    api_client := openapiclient.NewAPIClient(configuration)
    resp, r, err := api_client.GraniteApi.SslSetup(context.Background()).KeystorePassword(keystorePassword).KeystorePasswordConfirm(keystorePasswordConfirm).TruststorePassword(truststorePassword).TruststorePasswordConfirm(truststorePasswordConfirm).HttpsHostname(httpsHostname).HttpsPort(httpsPort).PrivatekeyFile(privatekeyFile).CertificateFile(certificateFile).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `GraniteApi.SslSetup``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `SslSetup`: string
    fmt.Fprintf(os.Stdout, "Response from `GraniteApi.SslSetup`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSslSetupRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keystorePassword** | **string** |  | 
 **keystorePasswordConfirm** | **string** |  | 
 **truststorePassword** | **string** |  | 
 **truststorePasswordConfirm** | **string** |  | 
 **httpsHostname** | **string** |  | 
 **httpsPort** | **string** |  | 
 **privatekeyFile** | ***os.File** |  | 
 **certificateFile** | ***os.File** |  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

