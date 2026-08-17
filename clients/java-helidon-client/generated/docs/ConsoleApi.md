# ConsoleApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAemProductInfo**](ConsoleApi.md#getAemProductInfo) | **GET** /system/console/status-productinfo.json |  |
| [**getBundleInfo**](ConsoleApi.md#getBundleInfo) | **GET** /system/console/bundles/{name}.json |  |
| [**getConfigMgr**](ConsoleApi.md#getConfigMgr) | **GET** /system/console/configMgr |  |
| [**postBundle**](ConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} |  |
| [**postJmxRepository**](ConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} |  |
| [**postSamlConfiguration**](ConsoleApi.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler |  |



## getAemProductInfo

> List&lt;String&gt; getAemProductInfo()



### Parameters

This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## getBundleInfo

> BundleInfo getBundleInfo(name)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |

### Return type

[**BundleInfo**](BundleInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved bundle info |  -  |
| **200** | Default response |  -  |


## getConfigMgr

> String getConfigMgr()



### Parameters

This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **5XX** | Unexpected error. |  -  |


## postBundle

> void postBundle(name, action)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **action** | **String**|  | |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postJmxRepository

> void postJmxRepository(action)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**|  | |

### Return type

[**void**](Void.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default response |  -  |


## postSamlConfiguration

> SamlConfigurationInfo postSamlConfiguration(post, apply, delete, action, $location, path, serviceRanking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist)



### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **post** | **Boolean**|  | [optional] |
| **apply** | **Boolean**|  | [optional] |
| **delete** | **Boolean**|  | [optional] |
| **action** | **String**|  | [optional] |
| **$location** | **String**|  | [optional] |
| **path** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **serviceRanking** | **Integer**|  | [optional] |
| **idpUrl** | **String**|  | [optional] |
| **idpCertAlias** | **String**|  | [optional] |
| **idpHttpRedirect** | **Boolean**|  | [optional] |
| **serviceProviderEntityId** | **String**|  | [optional] |
| **assertionConsumerServiceURL** | **String**|  | [optional] |
| **spPrivateKeyAlias** | **String**|  | [optional] |
| **keyStorePassword** | **String**|  | [optional] |
| **defaultRedirectUrl** | **String**|  | [optional] |
| **userIDAttribute** | **String**|  | [optional] |
| **useEncryption** | **Boolean**|  | [optional] |
| **createUser** | **Boolean**|  | [optional] |
| **addGroupMemberships** | **Boolean**|  | [optional] |
| **groupMembershipAttribute** | **String**|  | [optional] |
| **defaultGroups** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **nameIdFormat** | **String**|  | [optional] |
| **synchronizeAttributes** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **handleLogout** | **Boolean**|  | [optional] |
| **logoutUrl** | **String**|  | [optional] |
| **clockTolerance** | **Integer**|  | [optional] |
| **digestMethod** | **String**|  | [optional] |
| **signatureMethod** | **String**|  | [optional] |
| **userIntermediatePath** | **String**|  | [optional] |
| **propertylist** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved AEM SAML Configuration |  -  |
| **302** | Default response |  -  |
| **200** | Default response |  -  |

