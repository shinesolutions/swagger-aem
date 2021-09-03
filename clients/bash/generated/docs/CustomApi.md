# CustomApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemHealthCheck**](CustomApi.md#getAemHealthCheck) | **GET** /system/health | 
[**postConfigAemHealthCheckServlet**](CustomApi.md#postConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**postConfigAemPasswordReset**](CustomApi.md#postConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 



## getAemHealthCheck



### Example

```bash
 getAemHealthCheck  tags=value  combineTagsOr=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | **string** |  | [optional] [default to null]
 **combineTagsOr** | **boolean** |  | [optional] [default to null]

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postConfigAemHealthCheckServlet



### Example

```bash
 postConfigAemHealthCheckServlet  Specify as:  bundles.ignored=value1 bundles.ignored=value2 bundles.ignored=...  bundles.ignored@TypeHint=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundlesPeriodignored** | [**array[string]**](string.md) |  | [optional] [default to null]
 **bundlesPeriodignoredAtTypeHint** | **string** |  | [optional] [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## postConfigAemPasswordReset



### Example

```bash
 postConfigAemPasswordReset  Specify as:  pwdreset.authorizables=value1 pwdreset.authorizables=value2 pwdreset.authorizables=...  pwdreset.authorizables@TypeHint=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pwdresetPeriodauthorizables** | [**array[string]**](string.md) |  | [optional] [default to null]
 **pwdresetPeriodauthorizablesAtTypeHint** | **string** |  | [optional] [default to null]

### Return type

(empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: Not Applicable

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

