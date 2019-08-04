# OAICustomApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemHealthCheck**](OAICustomApi.md#getaemhealthcheck) | **GET** /system/health | 
[**postConfigAemHealthCheckServlet**](OAICustomApi.md#postconfigaemhealthcheckservlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**postConfigAemPasswordReset**](OAICustomApi.md#postconfigaempasswordreset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 


# **getAemHealthCheck**
```objc
-(NSURLSessionTask*) getAemHealthCheckWithTags: (NSString*) tags
    combineTagsOr: (NSNumber*) combineTagsOr
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* tags = @"tags_example"; //  (optional)
NSNumber* combineTagsOr = @56; //  (optional)

OAICustomApi*apiInstance = [[OAICustomApi alloc] init];

[apiInstance getAemHealthCheckWithTags:tags
              combineTagsOr:combineTagsOr
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICustomApi->getAemHealthCheck: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | **NSString***|  | [optional] 
 **combineTagsOr** | **NSNumber***|  | [optional] 

### Return type

**NSString***

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigAemHealthCheckServlet**
```objc
-(NSURLSessionTask*) postConfigAemHealthCheckServletWithBundlesIgnored: (NSArray<NSString*>*) bundlesIgnored
    bundlesIgnoredTypeHint: (NSString*) bundlesIgnoredTypeHint
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSArray<NSString*>* bundlesIgnored = @[@"bundlesIgnored_example"]; //  (optional)
NSString* bundlesIgnoredTypeHint = @"bundlesIgnoredTypeHint_example"; //  (optional)

OAICustomApi*apiInstance = [[OAICustomApi alloc] init];

[apiInstance postConfigAemHealthCheckServletWithBundlesIgnored:bundlesIgnored
              bundlesIgnoredTypeHint:bundlesIgnoredTypeHint
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAICustomApi->postConfigAemHealthCheckServlet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundlesIgnored** | [**NSArray&lt;NSString*&gt;***](NSString*.md)|  | [optional] 
 **bundlesIgnoredTypeHint** | **NSString***|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigAemPasswordReset**
```objc
-(NSURLSessionTask*) postConfigAemPasswordResetWithPwdresetAuthorizables: (NSArray<NSString*>*) pwdresetAuthorizables
    pwdresetAuthorizablesTypeHint: (NSString*) pwdresetAuthorizablesTypeHint
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSArray<NSString*>* pwdresetAuthorizables = @[@"pwdresetAuthorizables_example"]; //  (optional)
NSString* pwdresetAuthorizablesTypeHint = @"pwdresetAuthorizablesTypeHint_example"; //  (optional)

OAICustomApi*apiInstance = [[OAICustomApi alloc] init];

[apiInstance postConfigAemPasswordResetWithPwdresetAuthorizables:pwdresetAuthorizables
              pwdresetAuthorizablesTypeHint:pwdresetAuthorizablesTypeHint
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAICustomApi->postConfigAemPasswordReset: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pwdresetAuthorizables** | [**NSArray&lt;NSString*&gt;***](NSString*.md)|  | [optional] 
 **pwdresetAuthorizablesTypeHint** | **NSString***|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

