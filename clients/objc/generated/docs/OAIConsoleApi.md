# OAIConsoleApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemProductInfo**](OAIConsoleApi.md#getaemproductinfo) | **GET** /system/console/status-productinfo.json | 
[**getConfigMgr**](OAIConsoleApi.md#getconfigmgr) | **GET** /system/console/configMgr | 
[**postBundle**](OAIConsoleApi.md#postbundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](OAIConsoleApi.md#postjmxrepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**postSamlConfiguration**](OAIConsoleApi.md#postsamlconfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


# **getAemProductInfo**
```objc
-(NSURLSessionTask*) getAemProductInfoWithCompletionHandler: 
        (void (^)(NSArray<NSString*>* output, NSError* error)) handler;
```



### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];



OAIConsoleApi*apiInstance = [[OAIConsoleApi alloc] init];

[apiInstance getAemProductInfoWithCompletionHandler: 
          ^(NSArray<NSString*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIConsoleApi->getAemProductInfo: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

**NSArray<NSString*>***

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getConfigMgr**
```objc
-(NSURLSessionTask*) getConfigMgrWithCompletionHandler: 
        (void (^)(NSString* output, NSError* error)) handler;
```



### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];



OAIConsoleApi*apiInstance = [[OAIConsoleApi alloc] init];

[apiInstance getConfigMgrWithCompletionHandler: 
          ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIConsoleApi->getConfigMgr: %@", error);
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
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postBundle**
```objc
-(NSURLSessionTask*) postBundleWithName: (NSString*) name
    action: (NSString*) action
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* name = @"name_example"; // 
NSString* action = @"action_example"; // 

OAIConsoleApi*apiInstance = [[OAIConsoleApi alloc] init];

[apiInstance postBundleWithName:name
              action:action
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIConsoleApi->postBundle: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **NSString***|  | 
 **action** | **NSString***|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postJmxRepository**
```objc
-(NSURLSessionTask*) postJmxRepositoryWithAction: (NSString*) action
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* action = @"action_example"; // 

OAIConsoleApi*apiInstance = [[OAIConsoleApi alloc] init];

[apiInstance postJmxRepositoryWithAction:action
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIConsoleApi->postJmxRepository: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **NSString***|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postSamlConfiguration**
```objc
-(NSURLSessionTask*) postSamlConfigurationWithPost: (NSNumber*) post
    apply: (NSNumber*) apply
    delete: (NSNumber*) delete
    action: (NSString*) action
    location: (NSString*) location
    path: (NSArray<NSString*>*) path
    serviceRanking: (NSNumber*) serviceRanking
    idpUrl: (NSString*) idpUrl
    idpCertAlias: (NSString*) idpCertAlias
    idpHttpRedirect: (NSNumber*) idpHttpRedirect
    serviceProviderEntityId: (NSString*) serviceProviderEntityId
    assertionConsumerServiceURL: (NSString*) assertionConsumerServiceURL
    spPrivateKeyAlias: (NSString*) spPrivateKeyAlias
    keyStorePassword: (NSString*) keyStorePassword
    defaultRedirectUrl: (NSString*) defaultRedirectUrl
    userIDAttribute: (NSString*) userIDAttribute
    useEncryption: (NSNumber*) useEncryption
    createUser: (NSNumber*) createUser
    addGroupMemberships: (NSNumber*) addGroupMemberships
    groupMembershipAttribute: (NSString*) groupMembershipAttribute
    defaultGroups: (NSArray<NSString*>*) defaultGroups
    nameIdFormat: (NSString*) nameIdFormat
    synchronizeAttributes: (NSArray<NSString*>*) synchronizeAttributes
    handleLogout: (NSNumber*) handleLogout
    logoutUrl: (NSString*) logoutUrl
    clockTolerance: (NSNumber*) clockTolerance
    digestMethod: (NSString*) digestMethod
    signatureMethod: (NSString*) signatureMethod
    userIntermediatePath: (NSString*) userIntermediatePath
    propertylist: (NSArray<NSString*>*) propertylist
        completionHandler: (void (^)(OAISamlConfigurationInfo* output, NSError* error)) handler;
```



### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* post = @56; //  (optional)
NSNumber* apply = @56; //  (optional)
NSNumber* delete = @56; //  (optional)
NSString* action = @"action_example"; //  (optional)
NSString* location = @"location_example"; //  (optional)
NSArray<NSString*>* path = @[@"path_example"]; //  (optional)
NSNumber* serviceRanking = @56; //  (optional)
NSString* idpUrl = @"idpUrl_example"; //  (optional)
NSString* idpCertAlias = @"idpCertAlias_example"; //  (optional)
NSNumber* idpHttpRedirect = @56; //  (optional)
NSString* serviceProviderEntityId = @"serviceProviderEntityId_example"; //  (optional)
NSString* assertionConsumerServiceURL = @"assertionConsumerServiceURL_example"; //  (optional)
NSString* spPrivateKeyAlias = @"spPrivateKeyAlias_example"; //  (optional)
NSString* keyStorePassword = @"keyStorePassword_example"; //  (optional)
NSString* defaultRedirectUrl = @"defaultRedirectUrl_example"; //  (optional)
NSString* userIDAttribute = @"userIDAttribute_example"; //  (optional)
NSNumber* useEncryption = @56; //  (optional)
NSNumber* createUser = @56; //  (optional)
NSNumber* addGroupMemberships = @56; //  (optional)
NSString* groupMembershipAttribute = @"groupMembershipAttribute_example"; //  (optional)
NSArray<NSString*>* defaultGroups = @[@"defaultGroups_example"]; //  (optional)
NSString* nameIdFormat = @"nameIdFormat_example"; //  (optional)
NSArray<NSString*>* synchronizeAttributes = @[@"synchronizeAttributes_example"]; //  (optional)
NSNumber* handleLogout = @56; //  (optional)
NSString* logoutUrl = @"logoutUrl_example"; //  (optional)
NSNumber* clockTolerance = @56; //  (optional)
NSString* digestMethod = @"digestMethod_example"; //  (optional)
NSString* signatureMethod = @"signatureMethod_example"; //  (optional)
NSString* userIntermediatePath = @"userIntermediatePath_example"; //  (optional)
NSArray<NSString*>* propertylist = @[@"propertylist_example"]; //  (optional)

OAIConsoleApi*apiInstance = [[OAIConsoleApi alloc] init];

[apiInstance postSamlConfigurationWithPost:post
              apply:apply
              delete:delete
              action:action
              location:location
              path:path
              serviceRanking:serviceRanking
              idpUrl:idpUrl
              idpCertAlias:idpCertAlias
              idpHttpRedirect:idpHttpRedirect
              serviceProviderEntityId:serviceProviderEntityId
              assertionConsumerServiceURL:assertionConsumerServiceURL
              spPrivateKeyAlias:spPrivateKeyAlias
              keyStorePassword:keyStorePassword
              defaultRedirectUrl:defaultRedirectUrl
              userIDAttribute:userIDAttribute
              useEncryption:useEncryption
              createUser:createUser
              addGroupMemberships:addGroupMemberships
              groupMembershipAttribute:groupMembershipAttribute
              defaultGroups:defaultGroups
              nameIdFormat:nameIdFormat
              synchronizeAttributes:synchronizeAttributes
              handleLogout:handleLogout
              logoutUrl:logoutUrl
              clockTolerance:clockTolerance
              digestMethod:digestMethod
              signatureMethod:signatureMethod
              userIntermediatePath:userIntermediatePath
              propertylist:propertylist
          completionHandler: ^(OAISamlConfigurationInfo* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIConsoleApi->postSamlConfiguration: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **NSNumber***|  | [optional] 
 **apply** | **NSNumber***|  | [optional] 
 **delete** | **NSNumber***|  | [optional] 
 **action** | **NSString***|  | [optional] 
 **location** | **NSString***|  | [optional] 
 **path** | [**NSArray&lt;NSString*&gt;***](NSString*.md)|  | [optional] 
 **serviceRanking** | **NSNumber***|  | [optional] 
 **idpUrl** | **NSString***|  | [optional] 
 **idpCertAlias** | **NSString***|  | [optional] 
 **idpHttpRedirect** | **NSNumber***|  | [optional] 
 **serviceProviderEntityId** | **NSString***|  | [optional] 
 **assertionConsumerServiceURL** | **NSString***|  | [optional] 
 **spPrivateKeyAlias** | **NSString***|  | [optional] 
 **keyStorePassword** | **NSString***|  | [optional] 
 **defaultRedirectUrl** | **NSString***|  | [optional] 
 **userIDAttribute** | **NSString***|  | [optional] 
 **useEncryption** | **NSNumber***|  | [optional] 
 **createUser** | **NSNumber***|  | [optional] 
 **addGroupMemberships** | **NSNumber***|  | [optional] 
 **groupMembershipAttribute** | **NSString***|  | [optional] 
 **defaultGroups** | [**NSArray&lt;NSString*&gt;***](NSString*.md)|  | [optional] 
 **nameIdFormat** | **NSString***|  | [optional] 
 **synchronizeAttributes** | [**NSArray&lt;NSString*&gt;***](NSString*.md)|  | [optional] 
 **handleLogout** | **NSNumber***|  | [optional] 
 **logoutUrl** | **NSString***|  | [optional] 
 **clockTolerance** | **NSNumber***|  | [optional] 
 **digestMethod** | **NSString***|  | [optional] 
 **signatureMethod** | **NSString***|  | [optional] 
 **userIntermediatePath** | **NSString***|  | [optional] 
 **propertylist** | [**NSArray&lt;NSString*&gt;***](NSString*.md)|  | [optional] 

### Return type

[**OAISamlConfigurationInfo***](OAISamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

