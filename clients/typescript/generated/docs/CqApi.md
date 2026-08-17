# .CqApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLoginPage**](CqApi.md#getLoginPage) | **GET** /libs/granite/core/content/login.html | 
[**postCqActions**](CqApi.md#postCqActions) | **POST** /.cqactions.html | 


# **getLoginPage**
> getLoginPage()


### Example


```typescript
import { createConfiguration, CqApi } from '';

const configuration = createConfiguration();
const apiInstance = new CqApi(configuration);

const request = {};

const data = await apiInstance.getLoginPage(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **postCqActions**
> postCqActions()


### Example


```typescript
import { createConfiguration, CqApi } from '';
import type { CqApiPostCqActionsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CqApi(configuration);

const request: CqApiPostCqActionsRequest = {
  
  authorizableId: "authorizableId_example",
  
  changelog: "changelog_example",
};

const data = await apiInstance.postCqActions(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | [**string**] |  | defaults to undefined
 **changelog** | [**string**] |  | defaults to undefined


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


