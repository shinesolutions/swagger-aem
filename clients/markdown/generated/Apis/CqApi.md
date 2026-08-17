# CqApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLoginPage**](CqApi.md#getLoginPage) | **GET** /libs/granite/core/content/login.html |  |
| [**postCqActions**](CqApi.md#postCqActions) | **POST** /.cqactions.html |  |


<a name="getLoginPage"></a>
# **getLoginPage**
> String getLoginPage()



### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html

<a name="postCqActions"></a>
# **postCqActions**
> postCqActions(authorizableId, changelog)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorizableId** | **String**|  | [default to null] |
| **changelog** | **String**|  | [default to null] |

### Return type

null (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

