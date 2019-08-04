# OAICqApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLoginPage**](OAICqApi.md#getloginpage) | **GET** /libs/granite/core/content/login.html | 
[**postCqActions**](OAICqApi.md#postcqactions) | **POST** /.cqactions.html | 


# **getLoginPage**
```objc
-(NSURLSessionTask*) getLoginPageWithCompletionHandler: 
        (void (^)(NSString* output, NSError* error)) handler;
```



### Example 
```objc


OAICqApi*apiInstance = [[OAICqApi alloc] init];

[apiInstance getLoginPageWithCompletionHandler: 
          ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICqApi->getLoginPage: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

**NSString***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postCqActions**
```objc
-(NSURLSessionTask*) postCqActionsWithAuthorizableId: (NSString*) authorizableId
    changelog: (NSString*) changelog
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* authorizableId = @"authorizableId_example"; // 
NSString* changelog = @"changelog_example"; // 

OAICqApi*apiInstance = [[OAICqApi alloc] init];

[apiInstance postCqActionsWithAuthorizableId:authorizableId
              changelog:changelog
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAICqApi->postCqActions: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **NSString***|  | 
 **changelog** | **NSString***|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

