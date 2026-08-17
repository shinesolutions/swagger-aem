# CqApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_login_page**](CqApi.md#get_login_page) | **GET** /libs/granite/core/content/login.html | 
[**post_cq_actions**](CqApi.md#post_cq_actions) | **POST** /.cqactions.html | 


# **get_login_page**
> `get_login_page`(_api::`CqApi`; _mediaType=nothing) -> `String`, `OpenAPI.Clients.ApiResponse` <br/>
> `get_login_page`(_api::`CqApi`, response_stream::`Channel`; _mediaType=nothing) -> `Channel`{ `String` }, `OpenAPI.Clients.ApiResponse`



### Required Parameters
This endpoint does not need any parameter.

### Return type

**`String`**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **post_cq_actions**
> `post_cq_actions`(_api::`CqApi`, `authorizable_id`::`String`, `changelog`::`String`; _mediaType=nothing) -> `Nothing`, `OpenAPI.Clients.ApiResponse` <br/>
> `post_cq_actions`(_api::`CqApi`, response_stream::`Channel`, `authorizable_id`::`String`, `changelog`::`String`; _mediaType=nothing) -> `Channel`{ `Nothing` }, `OpenAPI.Clients.ApiResponse`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`CqApi`** | API context | 
**`authorizable_id`** | **`String`** |  |
**`changelog`** | **`String`** |  |

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

