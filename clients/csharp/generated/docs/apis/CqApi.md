# Org.OpenAPITools.Api.CqApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**GetLoginPage**](CqApi.md#getloginpage) | **GET** /libs/granite/core/content/login.html |  |
| [**PostCqActions**](CqApi.md#postcqactions) | **POST** /.cqactions.html |  |

<a id="getloginpage"></a>
# **GetLoginPage**
> string GetLoginPage ()




### Parameters
This endpoint does not need any parameter.
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
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="postcqactions"></a>
# **PostCqActions**
> void PostCqActions (string authorizableId, string changelog)




### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorizableId** | **string** |  |  |
| **changelog** | **string** |  |  |

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

