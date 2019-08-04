# OAICrxApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCrxdeStatus**](OAICrxApi.md#getcrxdestatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
[**getInstallStatus**](OAICrxApi.md#getinstallstatus) | **GET** /crx/packmgr/installstatus.jsp | 
[**getPackageManagerServlet**](OAICrxApi.md#getpackagemanagerservlet) | **GET** /crx/packmgr/service/script.html | 
[**postPackageService**](OAICrxApi.md#postpackageservice) | **POST** /crx/packmgr/service.jsp | 
[**postPackageServiceJson**](OAICrxApi.md#postpackageservicejson) | **POST** /crx/packmgr/service/.json/{path} | 
[**postPackageUpdate**](OAICrxApi.md#postpackageupdate) | **POST** /crx/packmgr/update.jsp | 
[**postSetPassword**](OAICrxApi.md#postsetpassword) | **POST** /crx/explorer/ui/setpassword.jsp | 


# **getCrxdeStatus**
```objc
-(NSURLSessionTask*) getCrxdeStatusWithCompletionHandler: 
        (void (^)(NSString* output, NSError* error)) handler;
```



### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];



OAICrxApi*apiInstance = [[OAICrxApi alloc] init];

[apiInstance getCrxdeStatusWithCompletionHandler: 
          ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICrxApi->getCrxdeStatus: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

**NSString***

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: plain/text

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getInstallStatus**
```objc
-(NSURLSessionTask*) getInstallStatusWithCompletionHandler: 
        (void (^)(OAIInstallStatus* output, NSError* error)) handler;
```



### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];



OAICrxApi*apiInstance = [[OAICrxApi alloc] init];

[apiInstance getInstallStatusWithCompletionHandler: 
          ^(OAIInstallStatus* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICrxApi->getInstallStatus: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIInstallStatus***](OAIInstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPackageManagerServlet**
```objc
-(NSURLSessionTask*) getPackageManagerServletWithCompletionHandler: 
        (void (^)(NSError* error)) handler;
```



### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];



OAICrxApi*apiInstance = [[OAICrxApi alloc] init];

[apiInstance getPackageManagerServletWithCompletionHandler: 
          ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAICrxApi->getPackageManagerServlet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postPackageService**
```objc
-(NSURLSessionTask*) postPackageServiceWithCmd: (NSString*) cmd
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* cmd = @"cmd_example"; // 

OAICrxApi*apiInstance = [[OAICrxApi alloc] init];

[apiInstance postPackageServiceWithCmd:cmd
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICrxApi->postPackageService: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmd** | **NSString***|  | 

### Return type

**NSString***

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postPackageServiceJson**
```objc
-(NSURLSessionTask*) postPackageServiceJsonWithPath: (NSString*) path
    cmd: (NSString*) cmd
    groupName: (NSString*) groupName
    packageName: (NSString*) packageName
    packageVersion: (NSString*) packageVersion
    charset: (NSString*) charset
    force: (NSNumber*) force
    recursive: (NSNumber*) recursive
    package: (NSURL*) package
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* path = @"path_example"; // 
NSString* cmd = @"cmd_example"; // 
NSString* groupName = @"groupName_example"; //  (optional)
NSString* packageName = @"packageName_example"; //  (optional)
NSString* packageVersion = @"packageVersion_example"; //  (optional)
NSString* charset = @"charset_example"; //  (optional)
NSNumber* force = @56; //  (optional)
NSNumber* recursive = @56; //  (optional)
NSURL* package = [NSURL fileURLWithPath:@"/path/to/file"]; //  (optional)

OAICrxApi*apiInstance = [[OAICrxApi alloc] init];

[apiInstance postPackageServiceJsonWithPath:path
              cmd:cmd
              groupName:groupName
              packageName:packageName
              packageVersion:packageVersion
              charset:charset
              force:force
              recursive:recursive
              package:package
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICrxApi->postPackageServiceJson: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **NSString***|  | 
 **cmd** | **NSString***|  | 
 **groupName** | **NSString***|  | [optional] 
 **packageName** | **NSString***|  | [optional] 
 **packageVersion** | **NSString***|  | [optional] 
 **charset** | **NSString***|  | [optional] 
 **force** | **NSNumber***|  | [optional] 
 **recursive** | **NSNumber***|  | [optional] 
 **package** | **NSURL*****NSURL***|  | [optional] 

### Return type

**NSString***

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postPackageUpdate**
```objc
-(NSURLSessionTask*) postPackageUpdateWithGroupName: (NSString*) groupName
    packageName: (NSString*) packageName
    version: (NSString*) version
    path: (NSString*) path
    filter: (NSString*) filter
    charset: (NSString*) charset
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* groupName = @"groupName_example"; // 
NSString* packageName = @"packageName_example"; // 
NSString* version = @"version_example"; // 
NSString* path = @"path_example"; // 
NSString* filter = @"filter_example"; //  (optional)
NSString* charset = @"charset_example"; //  (optional)

OAICrxApi*apiInstance = [[OAICrxApi alloc] init];

[apiInstance postPackageUpdateWithGroupName:groupName
              packageName:packageName
              version:version
              path:path
              filter:filter
              charset:charset
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICrxApi->postPackageUpdate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **NSString***|  | 
 **packageName** | **NSString***|  | 
 **version** | **NSString***|  | 
 **path** | **NSString***|  | 
 **filter** | **NSString***|  | [optional] 
 **charset** | **NSString***|  | [optional] 

### Return type

**NSString***

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postSetPassword**
```objc
-(NSURLSessionTask*) postSetPasswordWithOld: (NSString*) old
    plain: (NSString*) plain
    verify: (NSString*) verify
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* old = @"old_example"; // 
NSString* plain = @"plain_example"; // 
NSString* verify = @"verify_example"; // 

OAICrxApi*apiInstance = [[OAICrxApi alloc] init];

[apiInstance postSetPasswordWithOld:old
              plain:plain
              verify:verify
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICrxApi->postSetPassword: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **old** | **NSString***|  | 
 **plain** | **NSString***|  | 
 **verify** | **NSString***|  | 

### Return type

**NSString***

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

