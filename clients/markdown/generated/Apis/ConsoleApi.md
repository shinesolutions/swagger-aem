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


<a name="getAemProductInfo"></a>
# **getAemProductInfo**
> List getAemProductInfo()



### Parameters
This endpoint does not need any parameter.

### Return type

**List**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getBundleInfo"></a>
# **getBundleInfo**
> BundleInfo getBundleInfo(name)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | [default to null] |

### Return type

[**BundleInfo**](../Models/BundleInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="getConfigMgr"></a>
# **getConfigMgr**
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

<a name="postBundle"></a>
# **postBundle**
> postBundle(name, action)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | [default to null] |
| **action** | **String**|  | [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="postJmxRepository"></a>
# **postJmxRepository**
> postJmxRepository(action)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **action** | **String**|  | [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="postSamlConfiguration"></a>
# **postSamlConfiguration**
> SamlConfigurationInfo postSamlConfiguration(post, apply, delete, action, $location, path, service.ranking, idpUrl, idpCertAlias, idpHttpRedirect, serviceProviderEntityId, assertionConsumerServiceURL, spPrivateKeyAlias, keyStorePassword, defaultRedirectUrl, userIDAttribute, useEncryption, createUser, addGroupMemberships, groupMembershipAttribute, defaultGroups, nameIdFormat, synchronizeAttributes, handleLogout, logoutUrl, clockTolerance, digestMethod, signatureMethod, userIntermediatePath, propertylist)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **post** | **Boolean**|  | [optional] [default to null] |
| **apply** | **Boolean**|  | [optional] [default to null] |
| **delete** | **Boolean**|  | [optional] [default to null] |
| **action** | **String**|  | [optional] [default to null] |
| **$location** | **String**|  | [optional] [default to null] |
| **path** | [**List**](../Models/String.md)|  | [optional] [default to null] |
| **service.ranking** | **Integer**|  | [optional] [default to null] |
| **idpUrl** | **String**|  | [optional] [default to null] |
| **idpCertAlias** | **String**|  | [optional] [default to null] |
| **idpHttpRedirect** | **Boolean**|  | [optional] [default to null] |
| **serviceProviderEntityId** | **String**|  | [optional] [default to null] |
| **assertionConsumerServiceURL** | **String**|  | [optional] [default to null] |
| **spPrivateKeyAlias** | **String**|  | [optional] [default to null] |
| **keyStorePassword** | **String**|  | [optional] [default to null] |
| **defaultRedirectUrl** | **String**|  | [optional] [default to null] |
| **userIDAttribute** | **String**|  | [optional] [default to null] |
| **useEncryption** | **Boolean**|  | [optional] [default to null] |
| **createUser** | **Boolean**|  | [optional] [default to null] |
| **addGroupMemberships** | **Boolean**|  | [optional] [default to null] |
| **groupMembershipAttribute** | **String**|  | [optional] [default to null] |
| **defaultGroups** | [**List**](../Models/String.md)|  | [optional] [default to null] |
| **nameIdFormat** | **String**|  | [optional] [default to null] |
| **synchronizeAttributes** | [**List**](../Models/String.md)|  | [optional] [default to null] |
| **handleLogout** | **Boolean**|  | [optional] [default to null] |
| **logoutUrl** | **String**|  | [optional] [default to null] |
| **clockTolerance** | **Integer**|  | [optional] [default to null] |
| **digestMethod** | **String**|  | [optional] [default to null] |
| **signatureMethod** | **String**|  | [optional] [default to null] |
| **userIntermediatePath** | **String**|  | [optional] [default to null] |
| **propertylist** | [**List**](../Models/String.md)|  | [optional] [default to null] |

### Return type

[**SamlConfigurationInfo**](../Models/SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

