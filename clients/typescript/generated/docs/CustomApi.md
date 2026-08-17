# .CustomApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemHealthCheck**](CustomApi.md#getAemHealthCheck) | **GET** /system/health | 
[**postConfigAemHealthCheckServlet**](CustomApi.md#postConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**postConfigAemPasswordReset**](CustomApi.md#postConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 


# **getAemHealthCheck**
> getAemHealthCheck()


### Example


```typescript
import { createConfiguration, CustomApi } from '';
import type { CustomApiGetAemHealthCheckRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CustomApi(configuration);

const request: CustomApiGetAemHealthCheckRequest = {
  
  tags: "tags_example",
  
  combineTagsOr: true,
};

const data = await apiInstance.getAemHealthCheck(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**string**] |  | (optional) defaults to undefined
 **combineTagsOr** | [**boolean**] |  | (optional) defaults to undefined


### Return type

void (empty response body)

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **postConfigAemHealthCheckServlet**
> postConfigAemHealthCheckServlet()


### Example


```typescript
import { createConfiguration, CustomApi } from '';
import type { CustomApiPostConfigAemHealthCheckServletRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CustomApi(configuration);

const request: CustomApiPostConfigAemHealthCheckServletRequest = {
  
  bundlesIgnored: [
    "bundles.ignored_example",
  ],
  
  bundlesIgnoredTypeHint: "bundles.ignored@TypeHint_example",
};

const data = await apiInstance.postConfigAemHealthCheckServlet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundlesIgnored** | **Array&lt;string&gt;** |  | (optional) defaults to undefined
 **bundlesIgnoredTypeHint** | [**string**] |  | (optional) defaults to undefined


### Return type

void (empty response body)

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **postConfigAemPasswordReset**
> postConfigAemPasswordReset()


### Example


```typescript
import { createConfiguration, CustomApi } from '';
import type { CustomApiPostConfigAemPasswordResetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CustomApi(configuration);

const request: CustomApiPostConfigAemPasswordResetRequest = {
  
  pwdresetAuthorizables: [
    "pwdreset.authorizables_example",
  ],
  
  pwdresetAuthorizablesTypeHint: "pwdreset.authorizables@TypeHint_example",
};

const data = await apiInstance.postConfigAemPasswordReset(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pwdresetAuthorizables** | **Array&lt;string&gt;** |  | (optional) defaults to undefined
 **pwdresetAuthorizablesTypeHint** | [**string**] |  | (optional) defaults to undefined


### Return type

void (empty response body)

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


