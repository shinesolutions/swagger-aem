# Org.OpenAPITools.Api.ConsoleApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetAemProductInfo**](ConsoleApi.md#getaemproductinfo) | **GET** /system/console/status-productinfo.json |  |
| [**GetBundleInfo**](ConsoleApi.md#getbundleinfo) | **GET** /system/console/bundles/{name}.json |  |
| [**GetConfigMgr**](ConsoleApi.md#getconfigmgr) | **GET** /system/console/configMgr |  |
| [**PostBundle**](ConsoleApi.md#postbundle) | **POST** /system/console/bundles/{name} |  |
| [**PostJmxRepository**](ConsoleApi.md#postjmxrepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} |  |
| [**PostSamlConfiguration**](ConsoleApi.md#postsamlconfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler |  |

<a id="getaemproductinfo"></a>
# **GetAemProductInfo**
> List&lt;string&gt; GetAemProductInfo ()




### Parameters
This endpoint does not need any parameter.
### Return type

**List<string>**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getbundleinfo"></a>
# **GetBundleInfo**
> BundleInfo GetBundleInfo (string name)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **name** | **string** |  |  |

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
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="getconfigmgr"></a>
# **GetConfigMgr**
> string GetConfigMgr ()




### Parameters
This endpoint does not need any parameter.
### Return type

**string**

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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postbundle"></a>
# **PostBundle**
> void PostBundle (string name, string action)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **name** | **string** |  |  |
| **action** | **string** |  |  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postjmxrepository"></a>
# **PostJmxRepository**
> void PostJmxRepository (string action)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **action** | **string** |  |  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postsamlconfiguration"></a>
# **PostSamlConfiguration**
> SamlConfigurationInfo PostSamlConfiguration (bool post = null, bool apply = null, bool delete = null, string action = null, string location = null, List<string> path = null, int serviceRanking = null, string idpUrl = null, string idpCertAlias = null, bool idpHttpRedirect = null, string serviceProviderEntityId = null, string assertionConsumerServiceURL = null, string spPrivateKeyAlias = null, string keyStorePassword = null, string defaultRedirectUrl = null, string userIDAttribute = null, bool useEncryption = null, bool createUser = null, bool addGroupMemberships = null, string groupMembershipAttribute = null, List<string> defaultGroups = null, string nameIdFormat = null, List<string> synchronizeAttributes = null, bool handleLogout = null, string logoutUrl = null, int clockTolerance = null, string digestMethod = null, string signatureMethod = null, string userIntermediatePath = null, List<string> propertylist = null)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **post** | **bool** |  | [optional]  |
| **apply** | **bool** |  | [optional]  |
| **delete** | **bool** |  | [optional]  |
| **action** | **string** |  | [optional]  |
| **location** | **string** |  | [optional]  |
| **path** | [**List&lt;string&gt;**](string.md) |  | [optional]  |
| **serviceRanking** | **int** |  | [optional]  |
| **idpUrl** | **string** |  | [optional]  |
| **idpCertAlias** | **string** |  | [optional]  |
| **idpHttpRedirect** | **bool** |  | [optional]  |
| **serviceProviderEntityId** | **string** |  | [optional]  |
| **assertionConsumerServiceURL** | **string** |  | [optional]  |
| **spPrivateKeyAlias** | **string** |  | [optional]  |
| **keyStorePassword** | **string** |  | [optional]  |
| **defaultRedirectUrl** | **string** |  | [optional]  |
| **userIDAttribute** | **string** |  | [optional]  |
| **useEncryption** | **bool** |  | [optional]  |
| **createUser** | **bool** |  | [optional]  |
| **addGroupMemberships** | **bool** |  | [optional]  |
| **groupMembershipAttribute** | **string** |  | [optional]  |
| **defaultGroups** | [**List&lt;string&gt;**](string.md) |  | [optional]  |
| **nameIdFormat** | **string** |  | [optional]  |
| **synchronizeAttributes** | [**List&lt;string&gt;**](string.md) |  | [optional]  |
| **handleLogout** | **bool** |  | [optional]  |
| **logoutUrl** | **string** |  | [optional]  |
| **clockTolerance** | **int** |  | [optional]  |
| **digestMethod** | **string** |  | [optional]  |
| **signatureMethod** | **string** |  | [optional]  |
| **userIntermediatePath** | **string** |  | [optional]  |
| **propertylist** | [**List&lt;string&gt;**](string.md) |  | [optional]  |

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
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

