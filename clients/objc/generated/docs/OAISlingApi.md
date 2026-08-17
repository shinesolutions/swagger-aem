# OAISlingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAgent**](OAISlingApi.md#deleteagent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**deleteNode**](OAISlingApi.md#deletenode) | **DELETE** /{path}/{name} | 
[**getAgent**](OAISlingApi.md#getagent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**getAgents**](OAISlingApi.md#getagents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**getAuthorizableKeystore**](OAISlingApi.md#getauthorizablekeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**getKeystore**](OAISlingApi.md#getkeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**getNode**](OAISlingApi.md#getnode) | **GET** /{path}/{name} | 
[**getPackage**](OAISlingApi.md#getpackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**getPackageFilter**](OAISlingApi.md#getpackagefilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**getQuery**](OAISlingApi.md#getquery) | **GET** /bin/querybuilder.json | 
[**getTruststore**](OAISlingApi.md#gettruststore) | **GET** /etc/truststore/truststore.p12 | 
[**getTruststoreInfo**](OAISlingApi.md#gettruststoreinfo) | **GET** /libs/granite/security/truststore.json | 
[**postAgent**](OAISlingApi.md#postagent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**postAuthorizableKeystore**](OAISlingApi.md#postauthorizablekeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**postAuthorizables**](OAISlingApi.md#postauthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**postConfigAdobeGraniteSamlAuthenticationHandler**](OAISlingApi.md#postconfigadobegranitesamlauthenticationhandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**postConfigApacheFelixJettyBasedHttpService**](OAISlingApi.md#postconfigapachefelixjettybasedhttpservice) | **POST** /apps/system/config/org.apache.felix.http | 
[**postConfigApacheHttpComponentsProxyConfiguration**](OAISlingApi.md#postconfigapachehttpcomponentsproxyconfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**postConfigApacheSlingDavExServlet**](OAISlingApi.md#postconfigapacheslingdavexservlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**postConfigApacheSlingGetServlet**](OAISlingApi.md#postconfigapacheslinggetservlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**postConfigApacheSlingReferrerFilter**](OAISlingApi.md#postconfigapacheslingreferrerfilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**postConfigProperty**](OAISlingApi.md#postconfigproperty) | **POST** /apps/system/config/{configNodeName} | 
[**postNode**](OAISlingApi.md#postnode) | **POST** /{path}/{name} | 
[**postNodeRw**](OAISlingApi.md#postnoderw) | **POST** /{path}/{name}.rw.html | 
[**postPath**](OAISlingApi.md#postpath) | **POST** /{path}/ | 
[**postQuery**](OAISlingApi.md#postquery) | **POST** /bin/querybuilder.json | 
[**postTreeActivation**](OAISlingApi.md#posttreeactivation) | **POST** /libs/replication/treeactivation.html | 
[**postTruststore**](OAISlingApi.md#posttruststore) | **POST** /libs/granite/security/post/truststore | 
[**postTruststorePKCS12**](OAISlingApi.md#posttruststorepkcs12) | **POST** /etc/truststore | 


# **deleteAgent**
```objc
-(NSURLSessionTask*) deleteAgentWithRunmode: (NSString*) runmode
    name: (NSString*) name
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* runmode = @"runmode_example"; // 
NSString* name = @"name_example"; // 

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance deleteAgentWithRunmode:runmode
              name:name
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->deleteAgent: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **NSString***|  | 
 **name** | **NSString***|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteNode**
```objc
-(NSURLSessionTask*) deleteNodeWithPath: (NSString*) path
    name: (NSString*) name
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* path = @"path_example"; // 
NSString* name = @"name_example"; // 

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance deleteNodeWithPath:path
              name:name
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->deleteNode: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **NSString***|  | 
 **name** | **NSString***|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAgent**
```objc
-(NSURLSessionTask*) getAgentWithRunmode: (NSString*) runmode
    name: (NSString*) name
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* runmode = @"runmode_example"; // 
NSString* name = @"name_example"; // 

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance getAgentWithRunmode:runmode
              name:name
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->getAgent: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **NSString***|  | 
 **name** | **NSString***|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAgents**
```objc
-(NSURLSessionTask*) getAgentsWithRunmode: (NSString*) runmode
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* runmode = @"runmode_example"; // 

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance getAgentsWithRunmode:runmode
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->getAgents: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **NSString***|  | 

### Return type

**NSString***

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAuthorizableKeystore**
```objc
-(NSURLSessionTask*) getAuthorizableKeystoreWithIntermediatePath: (NSString*) intermediatePath
    authorizableId: (NSString*) authorizableId
        completionHandler: (void (^)(OAIKeystoreInfo* output, NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* intermediatePath = @"intermediatePath_example"; // 
NSString* authorizableId = @"authorizableId_example"; // 

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance getAuthorizableKeystoreWithIntermediatePath:intermediatePath
              authorizableId:authorizableId
          completionHandler: ^(OAIKeystoreInfo* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->getAuthorizableKeystore: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **NSString***|  | 
 **authorizableId** | **NSString***|  | 

### Return type

[**OAIKeystoreInfo***](OAIKeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getKeystore**
```objc
-(NSURLSessionTask*) getKeystoreWithIntermediatePath: (NSString*) intermediatePath
    authorizableId: (NSString*) authorizableId
        completionHandler: (void (^)(NSURL* output, NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* intermediatePath = @"intermediatePath_example"; // 
NSString* authorizableId = @"authorizableId_example"; // 

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance getKeystoreWithIntermediatePath:intermediatePath
              authorizableId:authorizableId
          completionHandler: ^(NSURL* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->getKeystore: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **NSString***|  | 
 **authorizableId** | **NSString***|  | 

### Return type

**NSURL***

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getNode**
```objc
-(NSURLSessionTask*) getNodeWithPath: (NSString*) path
    name: (NSString*) name
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* path = @"path_example"; // 
NSString* name = @"name_example"; // 

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance getNodeWithPath:path
              name:name
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->getNode: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **NSString***|  | 
 **name** | **NSString***|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPackage**
```objc
-(NSURLSessionTask*) getPackageWithGroup: (NSString*) group
    name: (NSString*) name
    version: (NSString*) version
        completionHandler: (void (^)(NSURL* output, NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* group = @"group_example"; // 
NSString* name = @"name_example"; // 
NSString* version = @"version_example"; // 

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance getPackageWithGroup:group
              name:name
              version:version
          completionHandler: ^(NSURL* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->getPackage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **NSString***|  | 
 **name** | **NSString***|  | 
 **version** | **NSString***|  | 

### Return type

**NSURL***

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPackageFilter**
```objc
-(NSURLSessionTask*) getPackageFilterWithGroup: (NSString*) group
    name: (NSString*) name
    version: (NSString*) version
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* group = @"group_example"; // 
NSString* name = @"name_example"; // 
NSString* version = @"version_example"; // 

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance getPackageFilterWithGroup:group
              name:name
              version:version
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->getPackageFilter: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **NSString***|  | 
 **name** | **NSString***|  | 
 **version** | **NSString***|  | 

### Return type

**NSString***

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getQuery**
```objc
-(NSURLSessionTask*) getQueryWithPath: (NSString*) path
    pLimit: (NSNumber*) pLimit
    _1property: (NSString*) _1property
    _1propertyValue: (NSString*) _1propertyValue
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* path = @"path_example"; // 
NSNumber* pLimit = @56; // 
NSString* _1property = @"_1property_example"; // 
NSString* _1propertyValue = @"_1propertyValue_example"; // 

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance getQueryWithPath:path
              pLimit:pLimit
              _1property:_1property
              _1propertyValue:_1propertyValue
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->getQuery: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **NSString***|  | 
 **pLimit** | **NSNumber***|  | 
 **_1property** | **NSString***|  | 
 **_1propertyValue** | **NSString***|  | 

### Return type

**NSString***

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getTruststore**
```objc
-(NSURLSessionTask*) getTruststoreWithCompletionHandler: 
        (void (^)(NSURL* output, NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];



OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance getTruststoreWithCompletionHandler: 
          ^(NSURL* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->getTruststore: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

**NSURL***

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getTruststoreInfo**
```objc
-(NSURLSessionTask*) getTruststoreInfoWithCompletionHandler: 
        (void (^)(OAITruststoreInfo* output, NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];



OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance getTruststoreInfoWithCompletionHandler: 
          ^(OAITruststoreInfo* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->getTruststoreInfo: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAITruststoreInfo***](OAITruststoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postAgent**
```objc
-(NSURLSessionTask*) postAgentWithRunmode: (NSString*) runmode
    name: (NSString*) name
    jcrContentCqDistribute: (NSNumber*) jcrContentCqDistribute
    jcrContentCqDistributeTypeHint: (NSString*) jcrContentCqDistributeTypeHint
    jcrContentCqName: (NSString*) jcrContentCqName
    jcrContentCqTemplate: (NSString*) jcrContentCqTemplate
    jcrContentAliasUpdate: (NSNumber*) jcrContentAliasUpdate
    jcrContentEnabled: (NSNumber*) jcrContentEnabled
    jcrContentJcrDescription: (NSString*) jcrContentJcrDescription
    jcrContentJcrLastModified: (NSString*) jcrContentJcrLastModified
    jcrContentJcrLastModifiedBy: (NSString*) jcrContentJcrLastModifiedBy
    jcrContentJcrMixinTypes: (NSString*) jcrContentJcrMixinTypes
    jcrContentJcrTitle: (NSString*) jcrContentJcrTitle
    jcrContentLogLevel: (NSString*) jcrContentLogLevel
    jcrContentNoStatusUpdate: (NSNumber*) jcrContentNoStatusUpdate
    jcrContentNoVersioning: (NSNumber*) jcrContentNoVersioning
    jcrContentProtocolConnectTimeout: (NSNumber*) jcrContentProtocolConnectTimeout
    jcrContentProtocolHTTPConnectionClosed: (NSNumber*) jcrContentProtocolHTTPConnectionClosed
    jcrContentProtocolHTTPExpired: (NSString*) jcrContentProtocolHTTPExpired
    jcrContentProtocolHTTPHeaders: (NSArray<NSString*>*) jcrContentProtocolHTTPHeaders
    jcrContentProtocolHTTPHeadersTypeHint: (NSString*) jcrContentProtocolHTTPHeadersTypeHint
    jcrContentProtocolHTTPMethod: (NSString*) jcrContentProtocolHTTPMethod
    jcrContentProtocolHTTPSRelaxed: (NSNumber*) jcrContentProtocolHTTPSRelaxed
    jcrContentProtocolInterface: (NSString*) jcrContentProtocolInterface
    jcrContentProtocolSocketTimeout: (NSNumber*) jcrContentProtocolSocketTimeout
    jcrContentProtocolVersion: (NSString*) jcrContentProtocolVersion
    jcrContentProxyNTLMDomain: (NSString*) jcrContentProxyNTLMDomain
    jcrContentProxyNTLMHost: (NSString*) jcrContentProxyNTLMHost
    jcrContentProxyHost: (NSString*) jcrContentProxyHost
    jcrContentProxyPassword: (NSString*) jcrContentProxyPassword
    jcrContentProxyPort: (NSNumber*) jcrContentProxyPort
    jcrContentProxyUser: (NSString*) jcrContentProxyUser
    jcrContentQueueBatchMaxSize: (NSNumber*) jcrContentQueueBatchMaxSize
    jcrContentQueueBatchMode: (NSString*) jcrContentQueueBatchMode
    jcrContentQueueBatchWaitTime: (NSNumber*) jcrContentQueueBatchWaitTime
    jcrContentRetryDelay: (NSString*) jcrContentRetryDelay
    jcrContentReverseReplication: (NSNumber*) jcrContentReverseReplication
    jcrContentSerializationType: (NSString*) jcrContentSerializationType
    jcrContentSlingResourceType: (NSString*) jcrContentSlingResourceType
    jcrContentSsl: (NSString*) jcrContentSsl
    jcrContentTransportNTLMDomain: (NSString*) jcrContentTransportNTLMDomain
    jcrContentTransportNTLMHost: (NSString*) jcrContentTransportNTLMHost
    jcrContentTransportPassword: (NSString*) jcrContentTransportPassword
    jcrContentTransportUri: (NSString*) jcrContentTransportUri
    jcrContentTransportUser: (NSString*) jcrContentTransportUser
    jcrContentTriggerDistribute: (NSNumber*) jcrContentTriggerDistribute
    jcrContentTriggerModified: (NSNumber*) jcrContentTriggerModified
    jcrContentTriggerOnOffTime: (NSNumber*) jcrContentTriggerOnOffTime
    jcrContentTriggerReceive: (NSNumber*) jcrContentTriggerReceive
    jcrContentTriggerSpecific: (NSNumber*) jcrContentTriggerSpecific
    jcrContentUserId: (NSString*) jcrContentUserId
    jcrPrimaryType: (NSString*) jcrPrimaryType
    operation: (NSString*) operation
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* runmode = @"runmode_example"; // 
NSString* name = @"name_example"; // 
NSNumber* jcrContentCqDistribute = @56; //  (optional)
NSString* jcrContentCqDistributeTypeHint = @"jcrContentCqDistributeTypeHint_example"; //  (optional)
NSString* jcrContentCqName = @"jcrContentCqName_example"; //  (optional)
NSString* jcrContentCqTemplate = @"jcrContentCqTemplate_example"; //  (optional)
NSNumber* jcrContentAliasUpdate = @56; //  (optional)
NSNumber* jcrContentEnabled = @56; //  (optional)
NSString* jcrContentJcrDescription = @"jcrContentJcrDescription_example"; //  (optional)
NSString* jcrContentJcrLastModified = @"jcrContentJcrLastModified_example"; //  (optional)
NSString* jcrContentJcrLastModifiedBy = @"jcrContentJcrLastModifiedBy_example"; //  (optional)
NSString* jcrContentJcrMixinTypes = @"jcrContentJcrMixinTypes_example"; //  (optional)
NSString* jcrContentJcrTitle = @"jcrContentJcrTitle_example"; //  (optional)
NSString* jcrContentLogLevel = @"jcrContentLogLevel_example"; //  (optional)
NSNumber* jcrContentNoStatusUpdate = @56; //  (optional)
NSNumber* jcrContentNoVersioning = @56; //  (optional)
NSNumber* jcrContentProtocolConnectTimeout = @56; //  (optional)
NSNumber* jcrContentProtocolHTTPConnectionClosed = @56; //  (optional)
NSString* jcrContentProtocolHTTPExpired = @"jcrContentProtocolHTTPExpired_example"; //  (optional)
NSArray<NSString*>* jcrContentProtocolHTTPHeaders = @[@"jcrContentProtocolHTTPHeaders_example"]; //  (optional)
NSString* jcrContentProtocolHTTPHeadersTypeHint = @"jcrContentProtocolHTTPHeadersTypeHint_example"; //  (optional)
NSString* jcrContentProtocolHTTPMethod = @"jcrContentProtocolHTTPMethod_example"; //  (optional)
NSNumber* jcrContentProtocolHTTPSRelaxed = @56; //  (optional)
NSString* jcrContentProtocolInterface = @"jcrContentProtocolInterface_example"; //  (optional)
NSNumber* jcrContentProtocolSocketTimeout = @56; //  (optional)
NSString* jcrContentProtocolVersion = @"jcrContentProtocolVersion_example"; //  (optional)
NSString* jcrContentProxyNTLMDomain = @"jcrContentProxyNTLMDomain_example"; //  (optional)
NSString* jcrContentProxyNTLMHost = @"jcrContentProxyNTLMHost_example"; //  (optional)
NSString* jcrContentProxyHost = @"jcrContentProxyHost_example"; //  (optional)
NSString* jcrContentProxyPassword = @"jcrContentProxyPassword_example"; //  (optional)
NSNumber* jcrContentProxyPort = @56; //  (optional)
NSString* jcrContentProxyUser = @"jcrContentProxyUser_example"; //  (optional)
NSNumber* jcrContentQueueBatchMaxSize = @56; //  (optional)
NSString* jcrContentQueueBatchMode = @"jcrContentQueueBatchMode_example"; //  (optional)
NSNumber* jcrContentQueueBatchWaitTime = @56; //  (optional)
NSString* jcrContentRetryDelay = @"jcrContentRetryDelay_example"; //  (optional)
NSNumber* jcrContentReverseReplication = @56; //  (optional)
NSString* jcrContentSerializationType = @"jcrContentSerializationType_example"; //  (optional)
NSString* jcrContentSlingResourceType = @"jcrContentSlingResourceType_example"; //  (optional)
NSString* jcrContentSsl = @"jcrContentSsl_example"; //  (optional)
NSString* jcrContentTransportNTLMDomain = @"jcrContentTransportNTLMDomain_example"; //  (optional)
NSString* jcrContentTransportNTLMHost = @"jcrContentTransportNTLMHost_example"; //  (optional)
NSString* jcrContentTransportPassword = @"jcrContentTransportPassword_example"; //  (optional)
NSString* jcrContentTransportUri = @"jcrContentTransportUri_example"; //  (optional)
NSString* jcrContentTransportUser = @"jcrContentTransportUser_example"; //  (optional)
NSNumber* jcrContentTriggerDistribute = @56; //  (optional)
NSNumber* jcrContentTriggerModified = @56; //  (optional)
NSNumber* jcrContentTriggerOnOffTime = @56; //  (optional)
NSNumber* jcrContentTriggerReceive = @56; //  (optional)
NSNumber* jcrContentTriggerSpecific = @56; //  (optional)
NSString* jcrContentUserId = @"jcrContentUserId_example"; //  (optional)
NSString* jcrPrimaryType = @"jcrPrimaryType_example"; //  (optional)
NSString* operation = @"operation_example"; //  (optional)

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance postAgentWithRunmode:runmode
              name:name
              jcrContentCqDistribute:jcrContentCqDistribute
              jcrContentCqDistributeTypeHint:jcrContentCqDistributeTypeHint
              jcrContentCqName:jcrContentCqName
              jcrContentCqTemplate:jcrContentCqTemplate
              jcrContentAliasUpdate:jcrContentAliasUpdate
              jcrContentEnabled:jcrContentEnabled
              jcrContentJcrDescription:jcrContentJcrDescription
              jcrContentJcrLastModified:jcrContentJcrLastModified
              jcrContentJcrLastModifiedBy:jcrContentJcrLastModifiedBy
              jcrContentJcrMixinTypes:jcrContentJcrMixinTypes
              jcrContentJcrTitle:jcrContentJcrTitle
              jcrContentLogLevel:jcrContentLogLevel
              jcrContentNoStatusUpdate:jcrContentNoStatusUpdate
              jcrContentNoVersioning:jcrContentNoVersioning
              jcrContentProtocolConnectTimeout:jcrContentProtocolConnectTimeout
              jcrContentProtocolHTTPConnectionClosed:jcrContentProtocolHTTPConnectionClosed
              jcrContentProtocolHTTPExpired:jcrContentProtocolHTTPExpired
              jcrContentProtocolHTTPHeaders:jcrContentProtocolHTTPHeaders
              jcrContentProtocolHTTPHeadersTypeHint:jcrContentProtocolHTTPHeadersTypeHint
              jcrContentProtocolHTTPMethod:jcrContentProtocolHTTPMethod
              jcrContentProtocolHTTPSRelaxed:jcrContentProtocolHTTPSRelaxed
              jcrContentProtocolInterface:jcrContentProtocolInterface
              jcrContentProtocolSocketTimeout:jcrContentProtocolSocketTimeout
              jcrContentProtocolVersion:jcrContentProtocolVersion
              jcrContentProxyNTLMDomain:jcrContentProxyNTLMDomain
              jcrContentProxyNTLMHost:jcrContentProxyNTLMHost
              jcrContentProxyHost:jcrContentProxyHost
              jcrContentProxyPassword:jcrContentProxyPassword
              jcrContentProxyPort:jcrContentProxyPort
              jcrContentProxyUser:jcrContentProxyUser
              jcrContentQueueBatchMaxSize:jcrContentQueueBatchMaxSize
              jcrContentQueueBatchMode:jcrContentQueueBatchMode
              jcrContentQueueBatchWaitTime:jcrContentQueueBatchWaitTime
              jcrContentRetryDelay:jcrContentRetryDelay
              jcrContentReverseReplication:jcrContentReverseReplication
              jcrContentSerializationType:jcrContentSerializationType
              jcrContentSlingResourceType:jcrContentSlingResourceType
              jcrContentSsl:jcrContentSsl
              jcrContentTransportNTLMDomain:jcrContentTransportNTLMDomain
              jcrContentTransportNTLMHost:jcrContentTransportNTLMHost
              jcrContentTransportPassword:jcrContentTransportPassword
              jcrContentTransportUri:jcrContentTransportUri
              jcrContentTransportUser:jcrContentTransportUser
              jcrContentTriggerDistribute:jcrContentTriggerDistribute
              jcrContentTriggerModified:jcrContentTriggerModified
              jcrContentTriggerOnOffTime:jcrContentTriggerOnOffTime
              jcrContentTriggerReceive:jcrContentTriggerReceive
              jcrContentTriggerSpecific:jcrContentTriggerSpecific
              jcrContentUserId:jcrContentUserId
              jcrPrimaryType:jcrPrimaryType
              operation:operation
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->postAgent: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **NSString***|  | 
 **name** | **NSString***|  | 
 **jcrContentCqDistribute** | **NSNumber***|  | [optional] 
 **jcrContentCqDistributeTypeHint** | **NSString***|  | [optional] 
 **jcrContentCqName** | **NSString***|  | [optional] 
 **jcrContentCqTemplate** | **NSString***|  | [optional] 
 **jcrContentAliasUpdate** | **NSNumber***|  | [optional] 
 **jcrContentEnabled** | **NSNumber***|  | [optional] 
 **jcrContentJcrDescription** | **NSString***|  | [optional] 
 **jcrContentJcrLastModified** | **NSString***|  | [optional] 
 **jcrContentJcrLastModifiedBy** | **NSString***|  | [optional] 
 **jcrContentJcrMixinTypes** | **NSString***|  | [optional] 
 **jcrContentJcrTitle** | **NSString***|  | [optional] 
 **jcrContentLogLevel** | **NSString***|  | [optional] 
 **jcrContentNoStatusUpdate** | **NSNumber***|  | [optional] 
 **jcrContentNoVersioning** | **NSNumber***|  | [optional] 
 **jcrContentProtocolConnectTimeout** | **NSNumber***|  | [optional] 
 **jcrContentProtocolHTTPConnectionClosed** | **NSNumber***|  | [optional] 
 **jcrContentProtocolHTTPExpired** | **NSString***|  | [optional] 
 **jcrContentProtocolHTTPHeaders** | [**NSArray&lt;NSString*&gt;***](NSString*.md)|  | [optional] 
 **jcrContentProtocolHTTPHeadersTypeHint** | **NSString***|  | [optional] 
 **jcrContentProtocolHTTPMethod** | **NSString***|  | [optional] 
 **jcrContentProtocolHTTPSRelaxed** | **NSNumber***|  | [optional] 
 **jcrContentProtocolInterface** | **NSString***|  | [optional] 
 **jcrContentProtocolSocketTimeout** | **NSNumber***|  | [optional] 
 **jcrContentProtocolVersion** | **NSString***|  | [optional] 
 **jcrContentProxyNTLMDomain** | **NSString***|  | [optional] 
 **jcrContentProxyNTLMHost** | **NSString***|  | [optional] 
 **jcrContentProxyHost** | **NSString***|  | [optional] 
 **jcrContentProxyPassword** | **NSString***|  | [optional] 
 **jcrContentProxyPort** | **NSNumber***|  | [optional] 
 **jcrContentProxyUser** | **NSString***|  | [optional] 
 **jcrContentQueueBatchMaxSize** | **NSNumber***|  | [optional] 
 **jcrContentQueueBatchMode** | **NSString***|  | [optional] 
 **jcrContentQueueBatchWaitTime** | **NSNumber***|  | [optional] 
 **jcrContentRetryDelay** | **NSString***|  | [optional] 
 **jcrContentReverseReplication** | **NSNumber***|  | [optional] 
 **jcrContentSerializationType** | **NSString***|  | [optional] 
 **jcrContentSlingResourceType** | **NSString***|  | [optional] 
 **jcrContentSsl** | **NSString***|  | [optional] 
 **jcrContentTransportNTLMDomain** | **NSString***|  | [optional] 
 **jcrContentTransportNTLMHost** | **NSString***|  | [optional] 
 **jcrContentTransportPassword** | **NSString***|  | [optional] 
 **jcrContentTransportUri** | **NSString***|  | [optional] 
 **jcrContentTransportUser** | **NSString***|  | [optional] 
 **jcrContentTriggerDistribute** | **NSNumber***|  | [optional] 
 **jcrContentTriggerModified** | **NSNumber***|  | [optional] 
 **jcrContentTriggerOnOffTime** | **NSNumber***|  | [optional] 
 **jcrContentTriggerReceive** | **NSNumber***|  | [optional] 
 **jcrContentTriggerSpecific** | **NSNumber***|  | [optional] 
 **jcrContentUserId** | **NSString***|  | [optional] 
 **jcrPrimaryType** | **NSString***|  | [optional] 
 **operation** | **NSString***|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postAuthorizableKeystore**
```objc
-(NSURLSessionTask*) postAuthorizableKeystoreWithIntermediatePath: (NSString*) intermediatePath
    authorizableId: (NSString*) authorizableId
    operation: (NSString*) operation
    currentPassword: (NSString*) currentPassword
    varNewPassword: (NSString*) varNewPassword
    rePassword: (NSString*) rePassword
    keyPassword: (NSString*) keyPassword
    keyStorePass: (NSString*) keyStorePass
    alias: (NSString*) alias
    varNewAlias: (NSString*) varNewAlias
    removeAlias: (NSString*) removeAlias
    certChain: (NSURL*) certChain
    pk: (NSURL*) pk
    keyStore: (NSURL*) keyStore
        completionHandler: (void (^)(OAIKeystoreInfo* output, NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* intermediatePath = @"intermediatePath_example"; // 
NSString* authorizableId = @"authorizableId_example"; // 
NSString* operation = @"operation_example"; //  (optional)
NSString* currentPassword = @"currentPassword_example"; //  (optional)
NSString* varNewPassword = @"varNewPassword_example"; //  (optional)
NSString* rePassword = @"rePassword_example"; //  (optional)
NSString* keyPassword = @"keyPassword_example"; //  (optional)
NSString* keyStorePass = @"keyStorePass_example"; //  (optional)
NSString* alias = @"alias_example"; //  (optional)
NSString* varNewAlias = @"varNewAlias_example"; //  (optional)
NSString* removeAlias = @"removeAlias_example"; //  (optional)
NSURL* certChain = [NSURL fileURLWithPath:@"/path/to/file"]; //  (optional)
NSURL* pk = [NSURL fileURLWithPath:@"/path/to/file"]; //  (optional)
NSURL* keyStore = [NSURL fileURLWithPath:@"/path/to/file"]; //  (optional)

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance postAuthorizableKeystoreWithIntermediatePath:intermediatePath
              authorizableId:authorizableId
              operation:operation
              currentPassword:currentPassword
              varNewPassword:varNewPassword
              rePassword:rePassword
              keyPassword:keyPassword
              keyStorePass:keyStorePass
              alias:alias
              varNewAlias:varNewAlias
              removeAlias:removeAlias
              certChain:certChain
              pk:pk
              keyStore:keyStore
          completionHandler: ^(OAIKeystoreInfo* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->postAuthorizableKeystore: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **NSString***|  | 
 **authorizableId** | **NSString***|  | 
 **operation** | **NSString***|  | [optional] 
 **currentPassword** | **NSString***|  | [optional] 
 **varNewPassword** | **NSString***|  | [optional] 
 **rePassword** | **NSString***|  | [optional] 
 **keyPassword** | **NSString***|  | [optional] 
 **keyStorePass** | **NSString***|  | [optional] 
 **alias** | **NSString***|  | [optional] 
 **varNewAlias** | **NSString***|  | [optional] 
 **removeAlias** | **NSString***|  | [optional] 
 **certChain** | **NSURL*****NSURL***|  | [optional] 
 **pk** | **NSURL*****NSURL***|  | [optional] 
 **keyStore** | **NSURL*****NSURL***|  | [optional] 

### Return type

[**OAIKeystoreInfo***](OAIKeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postAuthorizables**
```objc
-(NSURLSessionTask*) postAuthorizablesWithAuthorizableId: (NSString*) authorizableId
    intermediatePath: (NSString*) intermediatePath
    createUser: (NSString*) createUser
    createGroup: (NSString*) createGroup
    repPassword: (NSString*) repPassword
    profileGivenName: (NSString*) profileGivenName
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* authorizableId = @"authorizableId_example"; // 
NSString* intermediatePath = @"intermediatePath_example"; // 
NSString* createUser = @"createUser_example"; //  (optional)
NSString* createGroup = @"createGroup_example"; //  (optional)
NSString* repPassword = @"repPassword_example"; //  (optional)
NSString* profileGivenName = @"profileGivenName_example"; //  (optional)

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance postAuthorizablesWithAuthorizableId:authorizableId
              intermediatePath:intermediatePath
              createUser:createUser
              createGroup:createGroup
              repPassword:repPassword
              profileGivenName:profileGivenName
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->postAuthorizables: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **NSString***|  | 
 **intermediatePath** | **NSString***|  | 
 **createUser** | **NSString***|  | [optional] 
 **createGroup** | **NSString***|  | [optional] 
 **repPassword** | **NSString***|  | [optional] 
 **profileGivenName** | **NSString***|  | [optional] 

### Return type

**NSString***

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigAdobeGraniteSamlAuthenticationHandler**
```objc
-(NSURLSessionTask*) postConfigAdobeGraniteSamlAuthenticationHandlerWithKeyStorePassword: (NSString*) keyStorePassword
    keyStorePasswordTypeHint: (NSString*) keyStorePasswordTypeHint
    serviceRanking: (NSNumber*) serviceRanking
    serviceRankingTypeHint: (NSString*) serviceRankingTypeHint
    idpHttpRedirect: (NSNumber*) idpHttpRedirect
    idpHttpRedirectTypeHint: (NSString*) idpHttpRedirectTypeHint
    createUser: (NSNumber*) createUser
    createUserTypeHint: (NSString*) createUserTypeHint
    defaultRedirectUrl: (NSString*) defaultRedirectUrl
    defaultRedirectUrlTypeHint: (NSString*) defaultRedirectUrlTypeHint
    userIDAttribute: (NSString*) userIDAttribute
    userIDAttributeTypeHint: (NSString*) userIDAttributeTypeHint
    defaultGroups: (NSArray<NSString*>*) defaultGroups
    defaultGroupsTypeHint: (NSString*) defaultGroupsTypeHint
    idpCertAlias: (NSString*) idpCertAlias
    idpCertAliasTypeHint: (NSString*) idpCertAliasTypeHint
    addGroupMemberships: (NSNumber*) addGroupMemberships
    addGroupMembershipsTypeHint: (NSString*) addGroupMembershipsTypeHint
    path: (NSArray<NSString*>*) path
    pathTypeHint: (NSString*) pathTypeHint
    synchronizeAttributes: (NSArray<NSString*>*) synchronizeAttributes
    synchronizeAttributesTypeHint: (NSString*) synchronizeAttributesTypeHint
    clockTolerance: (NSNumber*) clockTolerance
    clockToleranceTypeHint: (NSString*) clockToleranceTypeHint
    groupMembershipAttribute: (NSString*) groupMembershipAttribute
    groupMembershipAttributeTypeHint: (NSString*) groupMembershipAttributeTypeHint
    idpUrl: (NSString*) idpUrl
    idpUrlTypeHint: (NSString*) idpUrlTypeHint
    logoutUrl: (NSString*) logoutUrl
    logoutUrlTypeHint: (NSString*) logoutUrlTypeHint
    serviceProviderEntityId: (NSString*) serviceProviderEntityId
    serviceProviderEntityIdTypeHint: (NSString*) serviceProviderEntityIdTypeHint
    assertionConsumerServiceURL: (NSString*) assertionConsumerServiceURL
    assertionConsumerServiceURLTypeHint: (NSString*) assertionConsumerServiceURLTypeHint
    handleLogout: (NSNumber*) handleLogout
    handleLogoutTypeHint: (NSString*) handleLogoutTypeHint
    spPrivateKeyAlias: (NSString*) spPrivateKeyAlias
    spPrivateKeyAliasTypeHint: (NSString*) spPrivateKeyAliasTypeHint
    useEncryption: (NSNumber*) useEncryption
    useEncryptionTypeHint: (NSString*) useEncryptionTypeHint
    nameIdFormat: (NSString*) nameIdFormat
    nameIdFormatTypeHint: (NSString*) nameIdFormatTypeHint
    digestMethod: (NSString*) digestMethod
    digestMethodTypeHint: (NSString*) digestMethodTypeHint
    signatureMethod: (NSString*) signatureMethod
    signatureMethodTypeHint: (NSString*) signatureMethodTypeHint
    userIntermediatePath: (NSString*) userIntermediatePath
    userIntermediatePathTypeHint: (NSString*) userIntermediatePathTypeHint
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* keyStorePassword = @"keyStorePassword_example"; //  (optional)
NSString* keyStorePasswordTypeHint = @"keyStorePasswordTypeHint_example"; //  (optional)
NSNumber* serviceRanking = @56; //  (optional)
NSString* serviceRankingTypeHint = @"serviceRankingTypeHint_example"; //  (optional)
NSNumber* idpHttpRedirect = @56; //  (optional)
NSString* idpHttpRedirectTypeHint = @"idpHttpRedirectTypeHint_example"; //  (optional)
NSNumber* createUser = @56; //  (optional)
NSString* createUserTypeHint = @"createUserTypeHint_example"; //  (optional)
NSString* defaultRedirectUrl = @"defaultRedirectUrl_example"; //  (optional)
NSString* defaultRedirectUrlTypeHint = @"defaultRedirectUrlTypeHint_example"; //  (optional)
NSString* userIDAttribute = @"userIDAttribute_example"; //  (optional)
NSString* userIDAttributeTypeHint = @"userIDAttributeTypeHint_example"; //  (optional)
NSArray<NSString*>* defaultGroups = @[@"defaultGroups_example"]; //  (optional)
NSString* defaultGroupsTypeHint = @"defaultGroupsTypeHint_example"; //  (optional)
NSString* idpCertAlias = @"idpCertAlias_example"; //  (optional)
NSString* idpCertAliasTypeHint = @"idpCertAliasTypeHint_example"; //  (optional)
NSNumber* addGroupMemberships = @56; //  (optional)
NSString* addGroupMembershipsTypeHint = @"addGroupMembershipsTypeHint_example"; //  (optional)
NSArray<NSString*>* path = @[@"path_example"]; //  (optional)
NSString* pathTypeHint = @"pathTypeHint_example"; //  (optional)
NSArray<NSString*>* synchronizeAttributes = @[@"synchronizeAttributes_example"]; //  (optional)
NSString* synchronizeAttributesTypeHint = @"synchronizeAttributesTypeHint_example"; //  (optional)
NSNumber* clockTolerance = @56; //  (optional)
NSString* clockToleranceTypeHint = @"clockToleranceTypeHint_example"; //  (optional)
NSString* groupMembershipAttribute = @"groupMembershipAttribute_example"; //  (optional)
NSString* groupMembershipAttributeTypeHint = @"groupMembershipAttributeTypeHint_example"; //  (optional)
NSString* idpUrl = @"idpUrl_example"; //  (optional)
NSString* idpUrlTypeHint = @"idpUrlTypeHint_example"; //  (optional)
NSString* logoutUrl = @"logoutUrl_example"; //  (optional)
NSString* logoutUrlTypeHint = @"logoutUrlTypeHint_example"; //  (optional)
NSString* serviceProviderEntityId = @"serviceProviderEntityId_example"; //  (optional)
NSString* serviceProviderEntityIdTypeHint = @"serviceProviderEntityIdTypeHint_example"; //  (optional)
NSString* assertionConsumerServiceURL = @"assertionConsumerServiceURL_example"; //  (optional)
NSString* assertionConsumerServiceURLTypeHint = @"assertionConsumerServiceURLTypeHint_example"; //  (optional)
NSNumber* handleLogout = @56; //  (optional)
NSString* handleLogoutTypeHint = @"handleLogoutTypeHint_example"; //  (optional)
NSString* spPrivateKeyAlias = @"spPrivateKeyAlias_example"; //  (optional)
NSString* spPrivateKeyAliasTypeHint = @"spPrivateKeyAliasTypeHint_example"; //  (optional)
NSNumber* useEncryption = @56; //  (optional)
NSString* useEncryptionTypeHint = @"useEncryptionTypeHint_example"; //  (optional)
NSString* nameIdFormat = @"nameIdFormat_example"; //  (optional)
NSString* nameIdFormatTypeHint = @"nameIdFormatTypeHint_example"; //  (optional)
NSString* digestMethod = @"digestMethod_example"; //  (optional)
NSString* digestMethodTypeHint = @"digestMethodTypeHint_example"; //  (optional)
NSString* signatureMethod = @"signatureMethod_example"; //  (optional)
NSString* signatureMethodTypeHint = @"signatureMethodTypeHint_example"; //  (optional)
NSString* userIntermediatePath = @"userIntermediatePath_example"; //  (optional)
NSString* userIntermediatePathTypeHint = @"userIntermediatePathTypeHint_example"; //  (optional)

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance postConfigAdobeGraniteSamlAuthenticationHandlerWithKeyStorePassword:keyStorePassword
              keyStorePasswordTypeHint:keyStorePasswordTypeHint
              serviceRanking:serviceRanking
              serviceRankingTypeHint:serviceRankingTypeHint
              idpHttpRedirect:idpHttpRedirect
              idpHttpRedirectTypeHint:idpHttpRedirectTypeHint
              createUser:createUser
              createUserTypeHint:createUserTypeHint
              defaultRedirectUrl:defaultRedirectUrl
              defaultRedirectUrlTypeHint:defaultRedirectUrlTypeHint
              userIDAttribute:userIDAttribute
              userIDAttributeTypeHint:userIDAttributeTypeHint
              defaultGroups:defaultGroups
              defaultGroupsTypeHint:defaultGroupsTypeHint
              idpCertAlias:idpCertAlias
              idpCertAliasTypeHint:idpCertAliasTypeHint
              addGroupMemberships:addGroupMemberships
              addGroupMembershipsTypeHint:addGroupMembershipsTypeHint
              path:path
              pathTypeHint:pathTypeHint
              synchronizeAttributes:synchronizeAttributes
              synchronizeAttributesTypeHint:synchronizeAttributesTypeHint
              clockTolerance:clockTolerance
              clockToleranceTypeHint:clockToleranceTypeHint
              groupMembershipAttribute:groupMembershipAttribute
              groupMembershipAttributeTypeHint:groupMembershipAttributeTypeHint
              idpUrl:idpUrl
              idpUrlTypeHint:idpUrlTypeHint
              logoutUrl:logoutUrl
              logoutUrlTypeHint:logoutUrlTypeHint
              serviceProviderEntityId:serviceProviderEntityId
              serviceProviderEntityIdTypeHint:serviceProviderEntityIdTypeHint
              assertionConsumerServiceURL:assertionConsumerServiceURL
              assertionConsumerServiceURLTypeHint:assertionConsumerServiceURLTypeHint
              handleLogout:handleLogout
              handleLogoutTypeHint:handleLogoutTypeHint
              spPrivateKeyAlias:spPrivateKeyAlias
              spPrivateKeyAliasTypeHint:spPrivateKeyAliasTypeHint
              useEncryption:useEncryption
              useEncryptionTypeHint:useEncryptionTypeHint
              nameIdFormat:nameIdFormat
              nameIdFormatTypeHint:nameIdFormatTypeHint
              digestMethod:digestMethod
              digestMethodTypeHint:digestMethodTypeHint
              signatureMethod:signatureMethod
              signatureMethodTypeHint:signatureMethodTypeHint
              userIntermediatePath:userIntermediatePath
              userIntermediatePathTypeHint:userIntermediatePathTypeHint
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->postConfigAdobeGraniteSamlAuthenticationHandler: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyStorePassword** | **NSString***|  | [optional] 
 **keyStorePasswordTypeHint** | **NSString***|  | [optional] 
 **serviceRanking** | **NSNumber***|  | [optional] 
 **serviceRankingTypeHint** | **NSString***|  | [optional] 
 **idpHttpRedirect** | **NSNumber***|  | [optional] 
 **idpHttpRedirectTypeHint** | **NSString***|  | [optional] 
 **createUser** | **NSNumber***|  | [optional] 
 **createUserTypeHint** | **NSString***|  | [optional] 
 **defaultRedirectUrl** | **NSString***|  | [optional] 
 **defaultRedirectUrlTypeHint** | **NSString***|  | [optional] 
 **userIDAttribute** | **NSString***|  | [optional] 
 **userIDAttributeTypeHint** | **NSString***|  | [optional] 
 **defaultGroups** | [**NSArray&lt;NSString*&gt;***](NSString*.md)|  | [optional] 
 **defaultGroupsTypeHint** | **NSString***|  | [optional] 
 **idpCertAlias** | **NSString***|  | [optional] 
 **idpCertAliasTypeHint** | **NSString***|  | [optional] 
 **addGroupMemberships** | **NSNumber***|  | [optional] 
 **addGroupMembershipsTypeHint** | **NSString***|  | [optional] 
 **path** | [**NSArray&lt;NSString*&gt;***](NSString*.md)|  | [optional] 
 **pathTypeHint** | **NSString***|  | [optional] 
 **synchronizeAttributes** | [**NSArray&lt;NSString*&gt;***](NSString*.md)|  | [optional] 
 **synchronizeAttributesTypeHint** | **NSString***|  | [optional] 
 **clockTolerance** | **NSNumber***|  | [optional] 
 **clockToleranceTypeHint** | **NSString***|  | [optional] 
 **groupMembershipAttribute** | **NSString***|  | [optional] 
 **groupMembershipAttributeTypeHint** | **NSString***|  | [optional] 
 **idpUrl** | **NSString***|  | [optional] 
 **idpUrlTypeHint** | **NSString***|  | [optional] 
 **logoutUrl** | **NSString***|  | [optional] 
 **logoutUrlTypeHint** | **NSString***|  | [optional] 
 **serviceProviderEntityId** | **NSString***|  | [optional] 
 **serviceProviderEntityIdTypeHint** | **NSString***|  | [optional] 
 **assertionConsumerServiceURL** | **NSString***|  | [optional] 
 **assertionConsumerServiceURLTypeHint** | **NSString***|  | [optional] 
 **handleLogout** | **NSNumber***|  | [optional] 
 **handleLogoutTypeHint** | **NSString***|  | [optional] 
 **spPrivateKeyAlias** | **NSString***|  | [optional] 
 **spPrivateKeyAliasTypeHint** | **NSString***|  | [optional] 
 **useEncryption** | **NSNumber***|  | [optional] 
 **useEncryptionTypeHint** | **NSString***|  | [optional] 
 **nameIdFormat** | **NSString***|  | [optional] 
 **nameIdFormatTypeHint** | **NSString***|  | [optional] 
 **digestMethod** | **NSString***|  | [optional] 
 **digestMethodTypeHint** | **NSString***|  | [optional] 
 **signatureMethod** | **NSString***|  | [optional] 
 **signatureMethodTypeHint** | **NSString***|  | [optional] 
 **userIntermediatePath** | **NSString***|  | [optional] 
 **userIntermediatePathTypeHint** | **NSString***|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheFelixJettyBasedHttpService**
```objc
-(NSURLSessionTask*) postConfigApacheFelixJettyBasedHttpServiceWithOrgApacheFelixHttpsNio: (NSNumber*) orgApacheFelixHttpsNio
    orgApacheFelixHttpsNioTypeHint: (NSString*) orgApacheFelixHttpsNioTypeHint
    orgApacheFelixHttpsKeystore: (NSString*) orgApacheFelixHttpsKeystore
    orgApacheFelixHttpsKeystoreTypeHint: (NSString*) orgApacheFelixHttpsKeystoreTypeHint
    orgApacheFelixHttpsKeystorePassword: (NSString*) orgApacheFelixHttpsKeystorePassword
    orgApacheFelixHttpsKeystorePasswordTypeHint: (NSString*) orgApacheFelixHttpsKeystorePasswordTypeHint
    orgApacheFelixHttpsKeystoreKey: (NSString*) orgApacheFelixHttpsKeystoreKey
    orgApacheFelixHttpsKeystoreKeyTypeHint: (NSString*) orgApacheFelixHttpsKeystoreKeyTypeHint
    orgApacheFelixHttpsKeystoreKeyPassword: (NSString*) orgApacheFelixHttpsKeystoreKeyPassword
    orgApacheFelixHttpsKeystoreKeyPasswordTypeHint: (NSString*) orgApacheFelixHttpsKeystoreKeyPasswordTypeHint
    orgApacheFelixHttpsTruststore: (NSString*) orgApacheFelixHttpsTruststore
    orgApacheFelixHttpsTruststoreTypeHint: (NSString*) orgApacheFelixHttpsTruststoreTypeHint
    orgApacheFelixHttpsTruststorePassword: (NSString*) orgApacheFelixHttpsTruststorePassword
    orgApacheFelixHttpsTruststorePasswordTypeHint: (NSString*) orgApacheFelixHttpsTruststorePasswordTypeHint
    orgApacheFelixHttpsClientcertificate: (NSString*) orgApacheFelixHttpsClientcertificate
    orgApacheFelixHttpsClientcertificateTypeHint: (NSString*) orgApacheFelixHttpsClientcertificateTypeHint
    orgApacheFelixHttpsEnable: (NSNumber*) orgApacheFelixHttpsEnable
    orgApacheFelixHttpsEnableTypeHint: (NSString*) orgApacheFelixHttpsEnableTypeHint
    orgOsgiServiceHttpPortSecure: (NSString*) orgOsgiServiceHttpPortSecure
    orgOsgiServiceHttpPortSecureTypeHint: (NSString*) orgOsgiServiceHttpPortSecureTypeHint
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* orgApacheFelixHttpsNio = @56; //  (optional)
NSString* orgApacheFelixHttpsNioTypeHint = @"orgApacheFelixHttpsNioTypeHint_example"; //  (optional)
NSString* orgApacheFelixHttpsKeystore = @"orgApacheFelixHttpsKeystore_example"; //  (optional)
NSString* orgApacheFelixHttpsKeystoreTypeHint = @"orgApacheFelixHttpsKeystoreTypeHint_example"; //  (optional)
NSString* orgApacheFelixHttpsKeystorePassword = @"orgApacheFelixHttpsKeystorePassword_example"; //  (optional)
NSString* orgApacheFelixHttpsKeystorePasswordTypeHint = @"orgApacheFelixHttpsKeystorePasswordTypeHint_example"; //  (optional)
NSString* orgApacheFelixHttpsKeystoreKey = @"orgApacheFelixHttpsKeystoreKey_example"; //  (optional)
NSString* orgApacheFelixHttpsKeystoreKeyTypeHint = @"orgApacheFelixHttpsKeystoreKeyTypeHint_example"; //  (optional)
NSString* orgApacheFelixHttpsKeystoreKeyPassword = @"orgApacheFelixHttpsKeystoreKeyPassword_example"; //  (optional)
NSString* orgApacheFelixHttpsKeystoreKeyPasswordTypeHint = @"orgApacheFelixHttpsKeystoreKeyPasswordTypeHint_example"; //  (optional)
NSString* orgApacheFelixHttpsTruststore = @"orgApacheFelixHttpsTruststore_example"; //  (optional)
NSString* orgApacheFelixHttpsTruststoreTypeHint = @"orgApacheFelixHttpsTruststoreTypeHint_example"; //  (optional)
NSString* orgApacheFelixHttpsTruststorePassword = @"orgApacheFelixHttpsTruststorePassword_example"; //  (optional)
NSString* orgApacheFelixHttpsTruststorePasswordTypeHint = @"orgApacheFelixHttpsTruststorePasswordTypeHint_example"; //  (optional)
NSString* orgApacheFelixHttpsClientcertificate = @"orgApacheFelixHttpsClientcertificate_example"; //  (optional)
NSString* orgApacheFelixHttpsClientcertificateTypeHint = @"orgApacheFelixHttpsClientcertificateTypeHint_example"; //  (optional)
NSNumber* orgApacheFelixHttpsEnable = @56; //  (optional)
NSString* orgApacheFelixHttpsEnableTypeHint = @"orgApacheFelixHttpsEnableTypeHint_example"; //  (optional)
NSString* orgOsgiServiceHttpPortSecure = @"orgOsgiServiceHttpPortSecure_example"; //  (optional)
NSString* orgOsgiServiceHttpPortSecureTypeHint = @"orgOsgiServiceHttpPortSecureTypeHint_example"; //  (optional)

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance postConfigApacheFelixJettyBasedHttpServiceWithOrgApacheFelixHttpsNio:orgApacheFelixHttpsNio
              orgApacheFelixHttpsNioTypeHint:orgApacheFelixHttpsNioTypeHint
              orgApacheFelixHttpsKeystore:orgApacheFelixHttpsKeystore
              orgApacheFelixHttpsKeystoreTypeHint:orgApacheFelixHttpsKeystoreTypeHint
              orgApacheFelixHttpsKeystorePassword:orgApacheFelixHttpsKeystorePassword
              orgApacheFelixHttpsKeystorePasswordTypeHint:orgApacheFelixHttpsKeystorePasswordTypeHint
              orgApacheFelixHttpsKeystoreKey:orgApacheFelixHttpsKeystoreKey
              orgApacheFelixHttpsKeystoreKeyTypeHint:orgApacheFelixHttpsKeystoreKeyTypeHint
              orgApacheFelixHttpsKeystoreKeyPassword:orgApacheFelixHttpsKeystoreKeyPassword
              orgApacheFelixHttpsKeystoreKeyPasswordTypeHint:orgApacheFelixHttpsKeystoreKeyPasswordTypeHint
              orgApacheFelixHttpsTruststore:orgApacheFelixHttpsTruststore
              orgApacheFelixHttpsTruststoreTypeHint:orgApacheFelixHttpsTruststoreTypeHint
              orgApacheFelixHttpsTruststorePassword:orgApacheFelixHttpsTruststorePassword
              orgApacheFelixHttpsTruststorePasswordTypeHint:orgApacheFelixHttpsTruststorePasswordTypeHint
              orgApacheFelixHttpsClientcertificate:orgApacheFelixHttpsClientcertificate
              orgApacheFelixHttpsClientcertificateTypeHint:orgApacheFelixHttpsClientcertificateTypeHint
              orgApacheFelixHttpsEnable:orgApacheFelixHttpsEnable
              orgApacheFelixHttpsEnableTypeHint:orgApacheFelixHttpsEnableTypeHint
              orgOsgiServiceHttpPortSecure:orgOsgiServiceHttpPortSecure
              orgOsgiServiceHttpPortSecureTypeHint:orgOsgiServiceHttpPortSecureTypeHint
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->postConfigApacheFelixJettyBasedHttpService: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgApacheFelixHttpsNio** | **NSNumber***|  | [optional] 
 **orgApacheFelixHttpsNioTypeHint** | **NSString***|  | [optional] 
 **orgApacheFelixHttpsKeystore** | **NSString***|  | [optional] 
 **orgApacheFelixHttpsKeystoreTypeHint** | **NSString***|  | [optional] 
 **orgApacheFelixHttpsKeystorePassword** | **NSString***|  | [optional] 
 **orgApacheFelixHttpsKeystorePasswordTypeHint** | **NSString***|  | [optional] 
 **orgApacheFelixHttpsKeystoreKey** | **NSString***|  | [optional] 
 **orgApacheFelixHttpsKeystoreKeyTypeHint** | **NSString***|  | [optional] 
 **orgApacheFelixHttpsKeystoreKeyPassword** | **NSString***|  | [optional] 
 **orgApacheFelixHttpsKeystoreKeyPasswordTypeHint** | **NSString***|  | [optional] 
 **orgApacheFelixHttpsTruststore** | **NSString***|  | [optional] 
 **orgApacheFelixHttpsTruststoreTypeHint** | **NSString***|  | [optional] 
 **orgApacheFelixHttpsTruststorePassword** | **NSString***|  | [optional] 
 **orgApacheFelixHttpsTruststorePasswordTypeHint** | **NSString***|  | [optional] 
 **orgApacheFelixHttpsClientcertificate** | **NSString***|  | [optional] 
 **orgApacheFelixHttpsClientcertificateTypeHint** | **NSString***|  | [optional] 
 **orgApacheFelixHttpsEnable** | **NSNumber***|  | [optional] 
 **orgApacheFelixHttpsEnableTypeHint** | **NSString***|  | [optional] 
 **orgOsgiServiceHttpPortSecure** | **NSString***|  | [optional] 
 **orgOsgiServiceHttpPortSecureTypeHint** | **NSString***|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheHttpComponentsProxyConfiguration**
```objc
-(NSURLSessionTask*) postConfigApacheHttpComponentsProxyConfigurationWithProxyHost: (NSString*) proxyHost
    proxyHostTypeHint: (NSString*) proxyHostTypeHint
    proxyPort: (NSNumber*) proxyPort
    proxyPortTypeHint: (NSString*) proxyPortTypeHint
    proxyExceptions: (NSArray<NSString*>*) proxyExceptions
    proxyExceptionsTypeHint: (NSString*) proxyExceptionsTypeHint
    proxyEnabled: (NSNumber*) proxyEnabled
    proxyEnabledTypeHint: (NSString*) proxyEnabledTypeHint
    proxyUser: (NSString*) proxyUser
    proxyUserTypeHint: (NSString*) proxyUserTypeHint
    proxyPassword: (NSString*) proxyPassword
    proxyPasswordTypeHint: (NSString*) proxyPasswordTypeHint
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* proxyHost = @"proxyHost_example"; //  (optional)
NSString* proxyHostTypeHint = @"proxyHostTypeHint_example"; //  (optional)
NSNumber* proxyPort = @56; //  (optional)
NSString* proxyPortTypeHint = @"proxyPortTypeHint_example"; //  (optional)
NSArray<NSString*>* proxyExceptions = @[@"proxyExceptions_example"]; //  (optional)
NSString* proxyExceptionsTypeHint = @"proxyExceptionsTypeHint_example"; //  (optional)
NSNumber* proxyEnabled = @56; //  (optional)
NSString* proxyEnabledTypeHint = @"proxyEnabledTypeHint_example"; //  (optional)
NSString* proxyUser = @"proxyUser_example"; //  (optional)
NSString* proxyUserTypeHint = @"proxyUserTypeHint_example"; //  (optional)
NSString* proxyPassword = @"proxyPassword_example"; //  (optional)
NSString* proxyPasswordTypeHint = @"proxyPasswordTypeHint_example"; //  (optional)

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance postConfigApacheHttpComponentsProxyConfigurationWithProxyHost:proxyHost
              proxyHostTypeHint:proxyHostTypeHint
              proxyPort:proxyPort
              proxyPortTypeHint:proxyPortTypeHint
              proxyExceptions:proxyExceptions
              proxyExceptionsTypeHint:proxyExceptionsTypeHint
              proxyEnabled:proxyEnabled
              proxyEnabledTypeHint:proxyEnabledTypeHint
              proxyUser:proxyUser
              proxyUserTypeHint:proxyUserTypeHint
              proxyPassword:proxyPassword
              proxyPasswordTypeHint:proxyPasswordTypeHint
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->postConfigApacheHttpComponentsProxyConfiguration: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyHost** | **NSString***|  | [optional] 
 **proxyHostTypeHint** | **NSString***|  | [optional] 
 **proxyPort** | **NSNumber***|  | [optional] 
 **proxyPortTypeHint** | **NSString***|  | [optional] 
 **proxyExceptions** | [**NSArray&lt;NSString*&gt;***](NSString*.md)|  | [optional] 
 **proxyExceptionsTypeHint** | **NSString***|  | [optional] 
 **proxyEnabled** | **NSNumber***|  | [optional] 
 **proxyEnabledTypeHint** | **NSString***|  | [optional] 
 **proxyUser** | **NSString***|  | [optional] 
 **proxyUserTypeHint** | **NSString***|  | [optional] 
 **proxyPassword** | **NSString***|  | [optional] 
 **proxyPasswordTypeHint** | **NSString***|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheSlingDavExServlet**
```objc
-(NSURLSessionTask*) postConfigApacheSlingDavExServletWithAlias: (NSString*) alias
    aliasTypeHint: (NSString*) aliasTypeHint
    davCreateAbsoluteUri: (NSNumber*) davCreateAbsoluteUri
    davCreateAbsoluteUriTypeHint: (NSString*) davCreateAbsoluteUriTypeHint
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* alias = @"alias_example"; //  (optional)
NSString* aliasTypeHint = @"aliasTypeHint_example"; //  (optional)
NSNumber* davCreateAbsoluteUri = @56; //  (optional)
NSString* davCreateAbsoluteUriTypeHint = @"davCreateAbsoluteUriTypeHint_example"; //  (optional)

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance postConfigApacheSlingDavExServletWithAlias:alias
              aliasTypeHint:aliasTypeHint
              davCreateAbsoluteUri:davCreateAbsoluteUri
              davCreateAbsoluteUriTypeHint:davCreateAbsoluteUriTypeHint
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->postConfigApacheSlingDavExServlet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **NSString***|  | [optional] 
 **aliasTypeHint** | **NSString***|  | [optional] 
 **davCreateAbsoluteUri** | **NSNumber***|  | [optional] 
 **davCreateAbsoluteUriTypeHint** | **NSString***|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheSlingGetServlet**
```objc
-(NSURLSessionTask*) postConfigApacheSlingGetServletWithJsonMaximumresults: (NSString*) jsonMaximumresults
    jsonMaximumresultsTypeHint: (NSString*) jsonMaximumresultsTypeHint
    enableHtml: (NSNumber*) enableHtml
    enableHtmlTypeHint: (NSString*) enableHtmlTypeHint
    enableTxt: (NSNumber*) enableTxt
    enableTxtTypeHint: (NSString*) enableTxtTypeHint
    enableXml: (NSNumber*) enableXml
    enableXmlTypeHint: (NSString*) enableXmlTypeHint
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* jsonMaximumresults = @"jsonMaximumresults_example"; //  (optional)
NSString* jsonMaximumresultsTypeHint = @"jsonMaximumresultsTypeHint_example"; //  (optional)
NSNumber* enableHtml = @56; //  (optional)
NSString* enableHtmlTypeHint = @"enableHtmlTypeHint_example"; //  (optional)
NSNumber* enableTxt = @56; //  (optional)
NSString* enableTxtTypeHint = @"enableTxtTypeHint_example"; //  (optional)
NSNumber* enableXml = @56; //  (optional)
NSString* enableXmlTypeHint = @"enableXmlTypeHint_example"; //  (optional)

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance postConfigApacheSlingGetServletWithJsonMaximumresults:jsonMaximumresults
              jsonMaximumresultsTypeHint:jsonMaximumresultsTypeHint
              enableHtml:enableHtml
              enableHtmlTypeHint:enableHtmlTypeHint
              enableTxt:enableTxt
              enableTxtTypeHint:enableTxtTypeHint
              enableXml:enableXml
              enableXmlTypeHint:enableXmlTypeHint
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->postConfigApacheSlingGetServlet: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jsonMaximumresults** | **NSString***|  | [optional] 
 **jsonMaximumresultsTypeHint** | **NSString***|  | [optional] 
 **enableHtml** | **NSNumber***|  | [optional] 
 **enableHtmlTypeHint** | **NSString***|  | [optional] 
 **enableTxt** | **NSNumber***|  | [optional] 
 **enableTxtTypeHint** | **NSString***|  | [optional] 
 **enableXml** | **NSNumber***|  | [optional] 
 **enableXmlTypeHint** | **NSString***|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigApacheSlingReferrerFilter**
```objc
-(NSURLSessionTask*) postConfigApacheSlingReferrerFilterWithAllowEmpty: (NSNumber*) allowEmpty
    allowEmptyTypeHint: (NSString*) allowEmptyTypeHint
    allowHosts: (NSString*) allowHosts
    allowHostsTypeHint: (NSString*) allowHostsTypeHint
    allowHostsRegexp: (NSString*) allowHostsRegexp
    allowHostsRegexpTypeHint: (NSString*) allowHostsRegexpTypeHint
    filterMethods: (NSString*) filterMethods
    filterMethodsTypeHint: (NSString*) filterMethodsTypeHint
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* allowEmpty = @56; //  (optional)
NSString* allowEmptyTypeHint = @"allowEmptyTypeHint_example"; //  (optional)
NSString* allowHosts = @"allowHosts_example"; //  (optional)
NSString* allowHostsTypeHint = @"allowHostsTypeHint_example"; //  (optional)
NSString* allowHostsRegexp = @"allowHostsRegexp_example"; //  (optional)
NSString* allowHostsRegexpTypeHint = @"allowHostsRegexpTypeHint_example"; //  (optional)
NSString* filterMethods = @"filterMethods_example"; //  (optional)
NSString* filterMethodsTypeHint = @"filterMethodsTypeHint_example"; //  (optional)

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance postConfigApacheSlingReferrerFilterWithAllowEmpty:allowEmpty
              allowEmptyTypeHint:allowEmptyTypeHint
              allowHosts:allowHosts
              allowHostsTypeHint:allowHostsTypeHint
              allowHostsRegexp:allowHostsRegexp
              allowHostsRegexpTypeHint:allowHostsRegexpTypeHint
              filterMethods:filterMethods
              filterMethodsTypeHint:filterMethodsTypeHint
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->postConfigApacheSlingReferrerFilter: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowEmpty** | **NSNumber***|  | [optional] 
 **allowEmptyTypeHint** | **NSString***|  | [optional] 
 **allowHosts** | **NSString***|  | [optional] 
 **allowHostsTypeHint** | **NSString***|  | [optional] 
 **allowHostsRegexp** | **NSString***|  | [optional] 
 **allowHostsRegexpTypeHint** | **NSString***|  | [optional] 
 **filterMethods** | **NSString***|  | [optional] 
 **filterMethodsTypeHint** | **NSString***|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigProperty**
```objc
-(NSURLSessionTask*) postConfigPropertyWithConfigNodeName: (NSString*) configNodeName
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* configNodeName = @"configNodeName_example"; // 

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance postConfigPropertyWithConfigNodeName:configNodeName
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->postConfigProperty: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configNodeName** | **NSString***|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postNode**
```objc
-(NSURLSessionTask*) postNodeWithPath: (NSString*) path
    name: (NSString*) name
    operation: (NSString*) operation
    deleteAuthorizable: (NSString*) deleteAuthorizable
    file: (NSURL*) file
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* path = @"path_example"; // 
NSString* name = @"name_example"; // 
NSString* operation = @"operation_example"; //  (optional)
NSString* deleteAuthorizable = @"deleteAuthorizable_example"; //  (optional)
NSURL* file = [NSURL fileURLWithPath:@"/path/to/file"]; //  (optional)

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance postNodeWithPath:path
              name:name
              operation:operation
              deleteAuthorizable:deleteAuthorizable
              file:file
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->postNode: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **NSString***|  | 
 **name** | **NSString***|  | 
 **operation** | **NSString***|  | [optional] 
 **deleteAuthorizable** | **NSString***|  | [optional] 
 **file** | **NSURL*****NSURL***|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postNodeRw**
```objc
-(NSURLSessionTask*) postNodeRwWithPath: (NSString*) path
    name: (NSString*) name
    addMembers: (NSString*) addMembers
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* path = @"path_example"; // 
NSString* name = @"name_example"; // 
NSString* addMembers = @"addMembers_example"; //  (optional)

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance postNodeRwWithPath:path
              name:name
              addMembers:addMembers
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->postNodeRw: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **NSString***|  | 
 **name** | **NSString***|  | 
 **addMembers** | **NSString***|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postPath**
```objc
-(NSURLSessionTask*) postPathWithPath: (NSString*) path
    jcrPrimaryType: (NSString*) jcrPrimaryType
    name: (NSString*) name
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* path = @"path_example"; // 
NSString* jcrPrimaryType = @"jcrPrimaryType_example"; // 
NSString* name = @"name_example"; // 

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance postPathWithPath:path
              jcrPrimaryType:jcrPrimaryType
              name:name
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->postPath: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **NSString***|  | 
 **jcrPrimaryType** | **NSString***|  | 
 **name** | **NSString***|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postQuery**
```objc
-(NSURLSessionTask*) postQueryWithPath: (NSString*) path
    pLimit: (NSNumber*) pLimit
    _1property: (NSString*) _1property
    _1propertyValue: (NSString*) _1propertyValue
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* path = @"path_example"; // 
NSNumber* pLimit = @56; // 
NSString* _1property = @"_1property_example"; // 
NSString* _1propertyValue = @"_1propertyValue_example"; // 

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance postQueryWithPath:path
              pLimit:pLimit
              _1property:_1property
              _1propertyValue:_1propertyValue
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->postQuery: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **NSString***|  | 
 **pLimit** | **NSNumber***|  | 
 **_1property** | **NSString***|  | 
 **_1propertyValue** | **NSString***|  | 

### Return type

**NSString***

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postTreeActivation**
```objc
-(NSURLSessionTask*) postTreeActivationWithIgnoredeactivated: (NSNumber*) ignoredeactivated
    onlymodified: (NSNumber*) onlymodified
    path: (NSString*) path
    cmd: (NSString*) cmd
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSNumber* ignoredeactivated = @56; // 
NSNumber* onlymodified = @56; // 
NSString* path = @"path_example"; // 
NSString* cmd = @"activate"; //  (default to @"activate")

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance postTreeActivationWithIgnoredeactivated:ignoredeactivated
              onlymodified:onlymodified
              path:path
              cmd:cmd
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->postTreeActivation: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **NSNumber***|  | 
 **onlymodified** | **NSNumber***|  | 
 **path** | **NSString***|  | 
 **cmd** | **NSString***|  | [default to @&quot;activate&quot;]

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postTruststore**
```objc
-(NSURLSessionTask*) postTruststoreWithOperation: (NSString*) operation
    varNewPassword: (NSString*) varNewPassword
    rePassword: (NSString*) rePassword
    keyStoreType: (NSString*) keyStoreType
    removeAlias: (NSString*) removeAlias
    certificate: (NSURL*) certificate
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* operation = @"operation_example"; //  (optional)
NSString* varNewPassword = @"varNewPassword_example"; //  (optional)
NSString* rePassword = @"rePassword_example"; //  (optional)
NSString* keyStoreType = @"keyStoreType_example"; //  (optional)
NSString* removeAlias = @"removeAlias_example"; //  (optional)
NSURL* certificate = [NSURL fileURLWithPath:@"/path/to/file"]; //  (optional)

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance postTruststoreWithOperation:operation
              varNewPassword:varNewPassword
              rePassword:rePassword
              keyStoreType:keyStoreType
              removeAlias:removeAlias
              certificate:certificate
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->postTruststore: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operation** | **NSString***|  | [optional] 
 **varNewPassword** | **NSString***|  | [optional] 
 **rePassword** | **NSString***|  | [optional] 
 **keyStoreType** | **NSString***|  | [optional] 
 **removeAlias** | **NSString***|  | [optional] 
 **certificate** | **NSURL*****NSURL***|  | [optional] 

### Return type

**NSString***

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postTruststorePKCS12**
```objc
-(NSURLSessionTask*) postTruststorePKCS12WithTruststoreP12: (NSURL*) truststoreP12
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: aemAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSURL* truststoreP12 = [NSURL fileURLWithPath:@"/path/to/file"]; //  (optional)

OAISlingApi*apiInstance = [[OAISlingApi alloc] init];

[apiInstance postTruststorePKCS12WithTruststoreP12:truststoreP12
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISlingApi->postTruststorePKCS12: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststoreP12** | **NSURL*****NSURL***|  | [optional] 

### Return type

**NSString***

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

