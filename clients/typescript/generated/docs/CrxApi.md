# .CrxApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCrxdeStatus**](CrxApi.md#getCrxdeStatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
[**getInstallStatus**](CrxApi.md#getInstallStatus) | **GET** /crx/packmgr/installstatus.jsp | 
[**getPackageManagerServlet**](CrxApi.md#getPackageManagerServlet) | **GET** /crx/packmgr/service/script.html | 
[**postPackageService**](CrxApi.md#postPackageService) | **POST** /crx/packmgr/service.jsp | 
[**postPackageServiceJson**](CrxApi.md#postPackageServiceJson) | **POST** /crx/packmgr/service/.json/{path} | 
[**postPackageUpdate**](CrxApi.md#postPackageUpdate) | **POST** /crx/packmgr/update.jsp | 
[**postSetPassword**](CrxApi.md#postSetPassword) | **POST** /crx/explorer/ui/setpassword.jsp | 


# **getCrxdeStatus**
> string getCrxdeStatus()


### Example


```typescript
import { createConfiguration, CrxApi } from '';

const configuration = createConfiguration();
const apiInstance = new CrxApi(configuration);

const request = {};

const data = await apiInstance.getCrxdeStatus(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**string**

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: plain/text


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | CRXDE is enabled |  -  |
**404** | CRXDE is disabled |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getInstallStatus**
> InstallStatus getInstallStatus()


### Example


```typescript
import { createConfiguration, CrxApi } from '';

const configuration = createConfiguration();
const apiInstance = new CrxApi(configuration);

const request = {};

const data = await apiInstance.getInstallStatus(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

**InstallStatus**

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Retrieved CRX package manager install status |  -  |
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getPackageManagerServlet**
> getPackageManagerServlet()


### Example


```typescript
import { createConfiguration, CrxApi } from '';

const configuration = createConfiguration();
const apiInstance = new CrxApi(configuration);

const request = {};

const data = await apiInstance.getPackageManagerServlet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters
This endpoint does not need any parameter.


### Return type

void (empty response body)

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**404** | Package Manager Servlet is disabled |  -  |
**405** | Package Manager Servlet is active |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **postPackageService**
> postPackageService()


### Example


```typescript
import { createConfiguration, CrxApi } from '';
import type { CrxApiPostPackageServiceRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CrxApi(configuration);

const request: CrxApiPostPackageServiceRequest = {
  
  cmd: "cmd_example",
};

const data = await apiInstance.postPackageService(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmd** | [**string**] |  | defaults to undefined


### Return type

void (empty response body)

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **postPackageServiceJson**
> postPackageServiceJson()


### Example


```typescript
import { createConfiguration, CrxApi } from '';
import type { CrxApiPostPackageServiceJsonRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CrxApi(configuration);

const request: CrxApiPostPackageServiceJsonRequest = {
  
  path: "path_example",
  
  cmd: "cmd_example",
  
  groupName: "groupName_example",
  
  packageName: "packageName_example",
  
  packageVersion: "packageVersion_example",
  
  charset: "_charset__example",
  
  force: true,
  
  recursive: true,
  
  _package: { data: Buffer.from(fs.readFileSync('/path/to/file', 'utf-8')), name: '/path/to/file' },
};

const data = await apiInstance.postPackageServiceJson(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | [**string**] |  | defaults to undefined
 **cmd** | [**string**] |  | defaults to undefined
 **groupName** | [**string**] |  | (optional) defaults to undefined
 **packageName** | [**string**] |  | (optional) defaults to undefined
 **packageVersion** | [**string**] |  | (optional) defaults to undefined
 **charset** | [**string**] |  | (optional) defaults to undefined
 **force** | [**boolean**] |  | (optional) defaults to undefined
 **recursive** | [**boolean**] |  | (optional) defaults to undefined
 **_package** | [**HttpFile**] |  | (optional) defaults to undefined


### Return type

void (empty response body)

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **postPackageUpdate**
> postPackageUpdate()


### Example


```typescript
import { createConfiguration, CrxApi } from '';
import type { CrxApiPostPackageUpdateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CrxApi(configuration);

const request: CrxApiPostPackageUpdateRequest = {
  
  groupName: "groupName_example",
  
  packageName: "packageName_example",
  
  version: "version_example",
  
  path: "path_example",
  
  filter: "filter_example",
  
  charset: "_charset__example",
};

const data = await apiInstance.postPackageUpdate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | [**string**] |  | defaults to undefined
 **packageName** | [**string**] |  | defaults to undefined
 **version** | [**string**] |  | defaults to undefined
 **path** | [**string**] |  | defaults to undefined
 **filter** | [**string**] |  | (optional) defaults to undefined
 **charset** | [**string**] |  | (optional) defaults to undefined


### Return type

void (empty response body)

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **postSetPassword**
> postSetPassword()


### Example


```typescript
import { createConfiguration, CrxApi } from '';
import type { CrxApiPostSetPasswordRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CrxApi(configuration);

const request: CrxApiPostSetPasswordRequest = {
  
  old: "old_example",
  
  plain: "plain_example",
  
  verify: "verify_example",
};

const data = await apiInstance.postSetPassword(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **old** | [**string**] |  | defaults to undefined
 **plain** | [**string**] |  | defaults to undefined
 **verify** | [**string**] |  | defaults to undefined


### Return type

void (empty response body)

### Authorization

[aemAuth](README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


