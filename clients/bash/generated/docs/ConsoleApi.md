# ConsoleApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemProductInfo**](ConsoleApi.md#getAemProductInfo) | **GET** /system/console/status-productinfo.json | 
[**getBundleInfo**](ConsoleApi.md#getBundleInfo) | **GET** /system/console/bundles/{name}.json | 
[**getConfigMgr**](ConsoleApi.md#getConfigMgr) | **GET** /system/console/configMgr | 
[**postBundle**](ConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](ConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**postSamlConfiguration**](ConsoleApi.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 



## getAemProductInfo



### Example

```bash
 getAemProductInfo
```

### Parameters

This endpoint does not need any parameter.

### Return type

**array[string]**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getBundleInfo



### Example

```bash
 getBundleInfo name=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string** |  | [default to null]

### Return type

[**BundleInfo**](BundleInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getConfigMgr



### Example

```bash
 getConfigMgr
```

### Parameters

This endpoint does not need any parameter.

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postBundle



### Example

```bash
 postBundle name=value  action=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string** |  | [default to null]
 **action** | **string** |  | [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postJmxRepository



### Example

```bash
 postJmxRepository action=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **string** |  | [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postSamlConfiguration



### Example

```bash
 postSamlConfiguration  post=value  apply=value  delete=value  action=value  $location=value  Specify as:  path=value1 path=value2 path=...  service.ranking=value  idpUrl=value  idpCertAlias=value  idpHttpRedirect=value  serviceProviderEntityId=value  assertionConsumerServiceURL=value  spPrivateKeyAlias=value  keyStorePassword=value  defaultRedirectUrl=value  userIDAttribute=value  useEncryption=value  createUser=value  addGroupMemberships=value  groupMembershipAttribute=value  Specify as:  defaultGroups=value1 defaultGroups=value2 defaultGroups=...  nameIdFormat=value  Specify as:  synchronizeAttributes=value1 synchronizeAttributes=value2 synchronizeAttributes=...  handleLogout=value  logoutUrl=value  clockTolerance=value  digestMethod=value  signatureMethod=value  userIntermediatePath=value  Specify as:  propertylist="value1,value2,..."
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **boolean** |  | [optional] [default to null]
 **apply** | **boolean** |  | [optional] [default to null]
 **delete** | **boolean** |  | [optional] [default to null]
 **action** | **string** |  | [optional] [default to null]
 **Dollarlocation** | **string** |  | [optional] [default to null]
 **path** | [**array[string]**](string.md) |  | [optional] [default to null]
 **servicePeriodranking** | **integer** |  | [optional] [default to null]
 **idpUrl** | **string** |  | [optional] [default to null]
 **idpCertAlias** | **string** |  | [optional] [default to null]
 **idpHttpRedirect** | **boolean** |  | [optional] [default to null]
 **serviceProviderEntityId** | **string** |  | [optional] [default to null]
 **assertionConsumerServiceURL** | **string** |  | [optional] [default to null]
 **spPrivateKeyAlias** | **string** |  | [optional] [default to null]
 **keyStorePassword** | **string** |  | [optional] [default to null]
 **defaultRedirectUrl** | **string** |  | [optional] [default to null]
 **userIDAttribute** | **string** |  | [optional] [default to null]
 **useEncryption** | **boolean** |  | [optional] [default to null]
 **createUser** | **boolean** |  | [optional] [default to null]
 **addGroupMemberships** | **boolean** |  | [optional] [default to null]
 **groupMembershipAttribute** | **string** |  | [optional] [default to null]
 **defaultGroups** | [**array[string]**](string.md) |  | [optional] [default to null]
 **nameIdFormat** | **string** |  | [optional] [default to null]
 **synchronizeAttributes** | [**array[string]**](string.md) |  | [optional] [default to null]
 **handleLogout** | **boolean** |  | [optional] [default to null]
 **logoutUrl** | **string** |  | [optional] [default to null]
 **clockTolerance** | **integer** |  | [optional] [default to null]
 **digestMethod** | **string** |  | [optional] [default to null]
 **signatureMethod** | **string** |  | [optional] [default to null]
 **userIntermediatePath** | **string** |  | [optional] [default to null]
 **propertylist** | [**array[string]**](string.md) |  | [optional] [default to null]

### Return type

[**SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

