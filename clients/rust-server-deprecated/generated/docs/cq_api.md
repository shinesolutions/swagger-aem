# cq_api

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
**getLoginPage**](cq_api.md#getLoginPage) | **GET** /libs/granite/core/content/login.html | 
**postCqActions**](cq_api.md#postCqActions) | **POST** /.cqactions.html | 


# **getLoginPage**
> String getLoginPage()


### Required Parameters
This endpoint does not need any parameter.

### Return type

[**String**](string.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postCqActions**
> postCqActions(ctx, authorizable_id, changelog)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **authorizable_id** | **String**|  | 
  **changelog** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

