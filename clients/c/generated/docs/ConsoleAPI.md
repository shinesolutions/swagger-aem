# ConsoleAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConsoleAPI_getAemProductInfo**](ConsoleAPI.md#ConsoleAPI_getAemProductInfo) | **GET** /system/console/status-productinfo.json | 
[**ConsoleAPI_getBundleInfo**](ConsoleAPI.md#ConsoleAPI_getBundleInfo) | **GET** /system/console/bundles/{name}.json | 
[**ConsoleAPI_getConfigMgr**](ConsoleAPI.md#ConsoleAPI_getConfigMgr) | **GET** /system/console/configMgr | 
[**ConsoleAPI_postBundle**](ConsoleAPI.md#ConsoleAPI_postBundle) | **POST** /system/console/bundles/{name} | 
[**ConsoleAPI_postJmxRepository**](ConsoleAPI.md#ConsoleAPI_postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**ConsoleAPI_postSamlConfiguration**](ConsoleAPI.md#ConsoleAPI_postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


# **ConsoleAPI_getAemProductInfo**
```c
list_t* ConsoleAPI_getAemProductInfo(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type


[list_t](char.md) *




### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConsoleAPI_getBundleInfo**
```c
bundle_info_t* ConsoleAPI_getBundleInfo(apiClient_t *apiClient, char *name);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**name** | **char \*** |  | 

### Return type

[bundle_info_t](bundle_info.md) *


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConsoleAPI_getConfigMgr**
```c
char* ConsoleAPI_getConfigMgr(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

char*



### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConsoleAPI_postBundle**
```c
void ConsoleAPI_postBundle(apiClient_t *apiClient, char *name, char *action);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**name** | **char \*** |  | 
**action** | **char \*** |  | 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConsoleAPI_postJmxRepository**
```c
void ConsoleAPI_postJmxRepository(apiClient_t *apiClient, char *action);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**action** | **char \*** |  | 

### Return type

void

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConsoleAPI_postSamlConfiguration**
```c
saml_configuration_info_t* ConsoleAPI_postSamlConfiguration(apiClient_t *apiClient, int *post, int *apply, int *_delete, char *action, char *$location, list_t *path, int *service.ranking, char *idpUrl, char *idpCertAlias, int *idpHttpRedirect, char *serviceProviderEntityId, char *assertionConsumerServiceURL, char *spPrivateKeyAlias, char *keyStorePassword, char *defaultRedirectUrl, char *userIDAttribute, int *useEncryption, int *createUser, int *addGroupMemberships, char *groupMembershipAttribute, list_t *defaultGroups, char *nameIdFormat, list_t *synchronizeAttributes, int *handleLogout, char *logoutUrl, int *clockTolerance, char *digestMethod, char *signatureMethod, char *userIntermediatePath, list_t *propertylist);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**post** | **int \*** |  | [optional] 
**apply** | **int \*** |  | [optional] 
**_delete** | **int \*** |  | [optional] 
**action** | **char \*** |  | [optional] 
**$location** | **char \*** |  | [optional] 
**path** | **[list_t](char.md) \*** |  | [optional] 
**service.ranking** | **int \*** |  | [optional] 
**idpUrl** | **char \*** |  | [optional] 
**idpCertAlias** | **char \*** |  | [optional] 
**idpHttpRedirect** | **int \*** |  | [optional] 
**serviceProviderEntityId** | **char \*** |  | [optional] 
**assertionConsumerServiceURL** | **char \*** |  | [optional] 
**spPrivateKeyAlias** | **char \*** |  | [optional] 
**keyStorePassword** | **char \*** |  | [optional] 
**defaultRedirectUrl** | **char \*** |  | [optional] 
**userIDAttribute** | **char \*** |  | [optional] 
**useEncryption** | **int \*** |  | [optional] 
**createUser** | **int \*** |  | [optional] 
**addGroupMemberships** | **int \*** |  | [optional] 
**groupMembershipAttribute** | **char \*** |  | [optional] 
**defaultGroups** | **[list_t](char.md) \*** |  | [optional] 
**nameIdFormat** | **char \*** |  | [optional] 
**synchronizeAttributes** | **[list_t](char.md) \*** |  | [optional] 
**handleLogout** | **int \*** |  | [optional] 
**logoutUrl** | **char \*** |  | [optional] 
**clockTolerance** | **int \*** |  | [optional] 
**digestMethod** | **char \*** |  | [optional] 
**signatureMethod** | **char \*** |  | [optional] 
**userIntermediatePath** | **char \*** |  | [optional] 
**propertylist** | **[list_t](char.md) \*** |  | [optional] 

### Return type

[saml_configuration_info_t](saml_configuration_info.md) *


### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

