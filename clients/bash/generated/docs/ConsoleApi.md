# ConsoleApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemProductInfo**](ConsoleApi.md#getAemProductInfo) | **GET** /system/console/status-productinfo.json | 
[**getConfigMgr**](ConsoleApi.md#getConfigMgr) | **GET** /system/console/configMgr | 
[**postBundle**](ConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](ConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**postSamlConfiguration**](ConsoleApi.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


## **getAemProductInfo**



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

## **getConfigMgr**



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

## **postBundle**



### Example
```bash
 postBundle name=value  action=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string** |  |
 **action** | **string** |  |

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **postJmxRepository**



### Example
```bash
 postJmxRepository action=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **string** |  |

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **postSamlConfiguration**



### Example
```bash
 postSamlConfiguration  post=value  apply=value  delete=value  action=value  $location=value  Specify as:  path=value1 path=value2 path=...  service.ranking=value  idpUrl=value  idpCertAlias=value  idpHttpRedirect=value  serviceProviderEntityId=value  assertionConsumerServiceURL=value  spPrivateKeyAlias=value  keyStorePassword=value  defaultRedirectUrl=value  userIDAttribute=value  useEncryption=value  createUser=value  addGroupMemberships=value  groupMembershipAttribute=value  Specify as:  defaultGroups=value1 defaultGroups=value2 defaultGroups=...  nameIdFormat=value  Specify as:  synchronizeAttributes=value1 synchronizeAttributes=value2 synchronizeAttributes=...  handleLogout=value  logoutUrl=value  clockTolerance=value  digestMethod=value  signatureMethod=value  userIntermediatePath=value  Specify as:  propertylist="value1,value2,..."
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **boolean** |  | [optional]
 **apply** | **boolean** |  | [optional]
 **delete** | **boolean** |  | [optional]
 **action** | **string** |  | [optional]
 **Dollarlocation** | **string** |  | [optional]
 **path** | [**array[string]**](string.md) |  | [optional]
 **servicePeriodranking** | **integer** |  | [optional]
 **idpUrl** | **string** |  | [optional]
 **idpCertAlias** | **string** |  | [optional]
 **idpHttpRedirect** | **boolean** |  | [optional]
 **serviceProviderEntityId** | **string** |  | [optional]
 **assertionConsumerServiceURL** | **string** |  | [optional]
 **spPrivateKeyAlias** | **string** |  | [optional]
 **keyStorePassword** | **string** |  | [optional]
 **defaultRedirectUrl** | **string** |  | [optional]
 **userIDAttribute** | **string** |  | [optional]
 **useEncryption** | **boolean** |  | [optional]
 **createUser** | **boolean** |  | [optional]
 **addGroupMemberships** | **boolean** |  | [optional]
 **groupMembershipAttribute** | **string** |  | [optional]
 **defaultGroups** | [**array[string]**](string.md) |  | [optional]
 **nameIdFormat** | **string** |  | [optional]
 **synchronizeAttributes** | [**array[string]**](string.md) |  | [optional]
 **handleLogout** | **boolean** |  | [optional]
 **logoutUrl** | **string** |  | [optional]
 **clockTolerance** | **integer** |  | [optional]
 **digestMethod** | **string** |  | [optional]
 **signatureMethod** | **string** |  | [optional]
 **userIntermediatePath** | **string** |  | [optional]
 **propertylist** | [**array[string]**](string.md) |  | [optional]

### Return type

[**SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

