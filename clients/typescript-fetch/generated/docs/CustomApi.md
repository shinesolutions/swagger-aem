# CustomApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAemHealthCheck**](CustomApi.md#getaemhealthcheck) | **GET** /system/health |  |
| [**postConfigAemHealthCheckServlet**](CustomApi.md#postconfigaemhealthcheckservlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck |  |
| [**postConfigAemPasswordReset**](CustomApi.md#postconfigaempasswordreset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator |  |



## getAemHealthCheck

> string getAemHealthCheck(tags, combineTagsOr)



### Example

```ts
import {
  Configuration,
  CustomApi,
} from '';
import type { GetAemHealthCheckRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new CustomApi(config);

  const body = {
    // string (optional)
    tags: tags_example,
    // boolean (optional)
    combineTagsOr: true,
  } satisfies GetAemHealthCheckRequest;

  try {
    const data = await api.getAemHealthCheck(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tags** | `string` |  | [Optional] [Defaults to `undefined`] |
| **combineTagsOr** | `boolean` |  | [Optional] [Defaults to `undefined`] |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postConfigAemHealthCheckServlet

> postConfigAemHealthCheckServlet(bundlesIgnored, bundlesIgnoredTypeHint)



### Example

```ts
import {
  Configuration,
  CustomApi,
} from '';
import type { PostConfigAemHealthCheckServletRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new CustomApi(config);

  const body = {
    // Array<string> (optional)
    bundlesIgnored: ...,
    // string (optional)
    bundlesIgnoredTypeHint: bundlesIgnoredTypeHint_example,
  } satisfies PostConfigAemHealthCheckServletRequest;

  try {
    const data = await api.postConfigAemHealthCheckServlet(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **bundlesIgnored** | `Array<string>` |  | [Optional] |
| **bundlesIgnoredTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |

### Return type

`void` (Empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postConfigAemPasswordReset

> postConfigAemPasswordReset(pwdresetAuthorizables, pwdresetAuthorizablesTypeHint)



### Example

```ts
import {
  Configuration,
  CustomApi,
} from '';
import type { PostConfigAemPasswordResetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new CustomApi(config);

  const body = {
    // Array<string> (optional)
    pwdresetAuthorizables: ...,
    // string (optional)
    pwdresetAuthorizablesTypeHint: pwdresetAuthorizablesTypeHint_example,
  } satisfies PostConfigAemPasswordResetRequest;

  try {
    const data = await api.postConfigAemPasswordReset(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pwdresetAuthorizables** | `Array<string>` |  | [Optional] |
| **pwdresetAuthorizablesTypeHint** | `string` |  | [Optional] [Defaults to `undefined`] |

### Return type

`void` (Empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

