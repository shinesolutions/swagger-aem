# CustomApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAemHealthCheck**](CustomApi.md#getAemHealthCheck) | **GET** /system/health |  |
| [**postConfigAemHealthCheckServlet**](CustomApi.md#postConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck |  |
| [**postConfigAemPasswordReset**](CustomApi.md#postConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator |  |


<a name="getAemHealthCheck"></a>
# **getAemHealthCheck**
> String getAemHealthCheck(tags, combineTagsOr)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tags** | **String**|  | [optional] [default to null] |
| **combineTagsOr** | **Boolean**|  | [optional] [default to null] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="postConfigAemHealthCheckServlet"></a>
# **postConfigAemHealthCheckServlet**
> postConfigAemHealthCheckServlet(bundles.ignored, bundles.ignored@TypeHint)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bundles.ignored** | [**List**](../Models/String.md)|  | [optional] [default to null] |
| **bundles.ignored@TypeHint** | **String**|  | [optional] [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="postConfigAemPasswordReset"></a>
# **postConfigAemPasswordReset**
> postConfigAemPasswordReset(pwdreset.authorizables, pwdreset.authorizables@TypeHint)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pwdreset.authorizables** | [**List**](../Models/String.md)|  | [optional] [default to null] |
| **pwdreset.authorizables@TypeHint** | **String**|  | [optional] [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

