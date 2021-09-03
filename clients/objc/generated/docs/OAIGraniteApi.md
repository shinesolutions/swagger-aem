# OAIGraniteApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sslSetup**](OAIGraniteApi.md#sslsetup) | **POST** /libs/granite/security/post/sslSetup.html | 


# **sslSetup**
```objc
-(NSURLSessionTask*) sslSetupWithKeystorePassword: (NSString*) keystorePassword
    keystorePasswordConfirm: (NSString*) keystorePasswordConfirm
    truststorePassword: (NSString*) truststorePassword
    truststorePasswordConfirm: (NSString*) truststorePasswordConfirm
    httpsHostname: (NSString*) httpsHostname
    httpsPort: (NSString*) httpsPort
    privatekeyFile: (NSURL*) privatekeyFile
    certificateFile: (NSURL*) certificateFile
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* keystorePassword = @"keystorePassword_example"; // 
NSString* keystorePasswordConfirm = @"keystorePasswordConfirm_example"; // 
NSString* truststorePassword = @"truststorePassword_example"; // 
NSString* truststorePasswordConfirm = @"truststorePasswordConfirm_example"; // 
NSString* httpsHostname = @"httpsHostname_example"; // 
NSString* httpsPort = @"httpsPort_example"; // 
NSURL* privatekeyFile = [NSURL fileURLWithPath:@"/path/to/file"]; //  (optional)
NSURL* certificateFile = [NSURL fileURLWithPath:@"/path/to/file"]; //  (optional)

OAIGraniteApi*apiInstance = [[OAIGraniteApi alloc] init];

[apiInstance sslSetupWithKeystorePassword:keystorePassword
              keystorePasswordConfirm:keystorePasswordConfirm
              truststorePassword:truststorePassword
              truststorePasswordConfirm:truststorePasswordConfirm
              httpsHostname:httpsHostname
              httpsPort:httpsPort
              privatekeyFile:privatekeyFile
              certificateFile:certificateFile
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIGraniteApi->sslSetup: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keystorePassword** | **NSString***|  | 
 **keystorePasswordConfirm** | **NSString***|  | 
 **truststorePassword** | **NSString***|  | 
 **truststorePasswordConfirm** | **NSString***|  | 
 **httpsHostname** | **NSString***|  | 
 **httpsPort** | **NSString***|  | 
 **privatekeyFile** | **NSURL*****NSURL***|  | [optional] 
 **certificateFile** | **NSURL*****NSURL***|  | [optional] 

### Return type

**NSString***

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

