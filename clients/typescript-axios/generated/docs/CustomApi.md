# CustomApi

All URIs are relative to *http://localhost*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**getAemHealthCheck**](#getaemhealthcheck) | **GET** /system/health | |
|[**postConfigAemHealthCheckServlet**](#postconfigaemhealthcheckservlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | |
|[**postConfigAemPasswordReset**](#postconfigaempasswordreset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | |

# **getAemHealthCheck**
> string getAemHealthCheck()


### Example

```typescript
import {
    CustomApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CustomApi(configuration);

let tags: string; // (optional) (default to undefined)
let combineTagsOr: boolean; // (optional) (default to undefined)

const { status, data } = await apiInstance.getAemHealthCheck(
    tags,
    combineTagsOr
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **tags** | [**string**] |  | (optional) defaults to undefined|
| **combineTagsOr** | [**boolean**] |  | (optional) defaults to undefined|


### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigAemHealthCheckServlet**
> postConfigAemHealthCheckServlet()


### Example

```typescript
import {
    CustomApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CustomApi(configuration);

let bundlesIgnored: Array<string>; // (optional) (default to undefined)
let bundlesIgnoredTypeHint: string; // (optional) (default to undefined)

const { status, data } = await apiInstance.postConfigAemHealthCheckServlet(
    bundlesIgnored,
    bundlesIgnoredTypeHint
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **bundlesIgnored** | **Array&lt;string&gt;** |  | (optional) defaults to undefined|
| **bundlesIgnoredTypeHint** | [**string**] |  | (optional) defaults to undefined|


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
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigAemPasswordReset**
> postConfigAemPasswordReset()


### Example

```typescript
import {
    CustomApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CustomApi(configuration);

let pwdresetAuthorizables: Array<string>; // (optional) (default to undefined)
let pwdresetAuthorizablesTypeHint: string; // (optional) (default to undefined)

const { status, data } = await apiInstance.postConfigAemPasswordReset(
    pwdresetAuthorizables,
    pwdresetAuthorizablesTypeHint
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **pwdresetAuthorizables** | **Array&lt;string&gt;** |  | (optional) defaults to undefined|
| **pwdresetAuthorizablesTypeHint** | [**string**] |  | (optional) defaults to undefined|


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
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

