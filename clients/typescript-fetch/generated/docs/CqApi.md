# CqApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLoginPage**](CqApi.md#getloginpage) | **GET** /libs/granite/core/content/login.html |  |
| [**postCqActions**](CqApi.md#postcqactions) | **POST** /.cqactions.html |  |



## getLoginPage

> string getLoginPage()



### Example

```ts
import {
  Configuration,
  CqApi,
} from '';
import type { GetLoginPageRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new CqApi();

  try {
    const data = await api.getLoginPage();
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters

This endpoint does not need any parameter.

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `text/html`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postCqActions

> postCqActions(authorizableId, changelog)



### Example

```ts
import {
  Configuration,
  CqApi,
} from '';
import type { PostCqActionsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new CqApi(config);

  const body = {
    // string
    authorizableId: authorizableId_example,
    // string
    changelog: changelog_example,
  } satisfies PostCqActionsRequest;

  try {
    const data = await api.postCqActions(body);
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
| **authorizableId** | `string` |  | [Defaults to `undefined`] |
| **changelog** | `string` |  | [Defaults to `undefined`] |

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

