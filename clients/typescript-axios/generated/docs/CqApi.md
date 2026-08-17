# CqApi

All URIs are relative to *http://localhost*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**getLoginPage**](#getloginpage) | **GET** /libs/granite/core/content/login.html | |
|[**postCqActions**](#postcqactions) | **POST** /.cqactions.html | |

# **getLoginPage**
> string getLoginPage()


### Example

```typescript
import {
    CqApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CqApi(configuration);

const { status, data } = await apiInstance.getLoginPage();
```

### Parameters
This endpoint does not have any parameters.


### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postCqActions**
> postCqActions()


### Example

```typescript
import {
    CqApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CqApi(configuration);

let authorizableId: string; // (default to undefined)
let changelog: string; // (default to undefined)

const { status, data } = await apiInstance.postCqActions(
    authorizableId,
    changelog
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **authorizableId** | [**string**] |  | defaults to undefined|
| **changelog** | [**string**] |  | defaults to undefined|


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

