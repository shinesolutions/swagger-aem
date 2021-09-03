# CRX_API

All URIs are relative to *http://localhost*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**crxde_status**](CRX_API.md#crxde_status) | **Get** /crx/server/crx.default/jcr:root/.1.json | 
[**install_status**](CRX_API.md#install_status) | **Get** /crx/packmgr/installstatus.jsp | 
[**package_manager_servlet**](CRX_API.md#package_manager_servlet) | **Get** /crx/packmgr/service/script.html | 
[**post_package_service**](CRX_API.md#post_package_service) | **Post** /crx/packmgr/service.jsp | 
[**post_package_service_json**](CRX_API.md#post_package_service_json) | **Post** /crx/packmgr/service/.json/{path} | 
[**post_package_update**](CRX_API.md#post_package_update) | **Post** /crx/packmgr/update.jsp | 
[**post_set_password**](CRX_API.md#post_set_password) | **Post** /crx/explorer/ui/setpassword.jsp | 


# **crxde_status**
> crxde_status : detachable STRING_32
	




### Parameters
This endpoint does not need any parameter.

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: plain/text

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **install_status**
> install_status : detachable INSTALL_STATUS
	




### Parameters
This endpoint does not need any parameter.

### Return type

[**INSTALL_STATUS**](InstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **package_manager_servlet**
> package_manager_servlet 
	




### Parameters
This endpoint does not need any parameter.

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_package_service**
> post_package_service (cmd: STRING_32 ): detachable STRING_32
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmd** | **STRING_32**|  | [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_package_service_json**
> post_package_service_json (path: STRING_32 ; cmd: STRING_32 ; group_name:  detachable STRING_32 ; package_name:  detachable STRING_32 ; package_version:  detachable STRING_32 ; var_charset_:  detachable STRING_32 ; force:  detachable BOOLEAN ; recursive:  detachable BOOLEAN ; package:  detachable FILE ): detachable STRING_32
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **STRING_32**|  | [default to null]
 **cmd** | **STRING_32**|  | [default to null]
 **group_name** | **STRING_32**|  | [optional] [default to null]
 **package_name** | **STRING_32**|  | [optional] [default to null]
 **package_version** | **STRING_32**|  | [optional] [default to null]
 **var_charset_** | **STRING_32**|  | [optional] [default to null]
 **force** | **BOOLEAN**|  | [optional] [default to null]
 **recursive** | **BOOLEAN**|  | [optional] [default to null]
 **package** | **FILE**|  | [optional] [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_package_update**
> post_package_update (group_name: STRING_32 ; package_name: STRING_32 ; version: STRING_32 ; path: STRING_32 ; filter:  detachable STRING_32 ; var_charset_:  detachable STRING_32 ): detachable STRING_32
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_name** | **STRING_32**|  | [default to null]
 **package_name** | **STRING_32**|  | [default to null]
 **version** | **STRING_32**|  | [default to null]
 **path** | **STRING_32**|  | [default to null]
 **filter** | **STRING_32**|  | [optional] [default to null]
 **var_charset_** | **STRING_32**|  | [optional] [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_set_password**
> post_set_password (var_old: STRING_32 ; plain: STRING_32 ; verify: STRING_32 ): detachable STRING_32
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **var_old** | **STRING_32**|  | [default to null]
 **plain** | **STRING_32**|  | [default to null]
 **verify** | **STRING_32**|  | [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

