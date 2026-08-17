# CrxApi

All URIs are relative to *http://localhost*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**getCrxdeStatus**](#getcrxdestatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | |
|[**getInstallStatus**](#getinstallstatus) | **GET** /crx/packmgr/installstatus.jsp | |
|[**getPackageManagerServlet**](#getpackagemanagerservlet) | **GET** /crx/packmgr/service/script.html | |
|[**postPackageService**](#postpackageservice) | **POST** /crx/packmgr/service.jsp | |
|[**postPackageServiceJson**](#postpackageservicejson) | **POST** /crx/packmgr/service/.json/{path} | |
|[**postPackageUpdate**](#postpackageupdate) | **POST** /crx/packmgr/update.jsp | |
|[**postSetPassword**](#postsetpassword) | **POST** /crx/explorer/ui/setpassword.jsp | |

# **getCrxdeStatus**
> string getCrxdeStatus()


### Example

```typescript
import {
    CrxApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CrxApi(configuration);

const { status, data } = await apiInstance.getCrxdeStatus();
```

### Parameters
This endpoint does not have any parameters.


### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: plain/text


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | CRXDE is enabled |  -  |
|**404** | CRXDE is disabled |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getInstallStatus**
> InstallStatus getInstallStatus()


### Example

```typescript
import {
    CrxApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CrxApi(configuration);

const { status, data } = await apiInstance.getInstallStatus();
```

### Parameters
This endpoint does not have any parameters.


### Return type

**InstallStatus**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Retrieved CRX package manager install status |  -  |
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPackageManagerServlet**
> getPackageManagerServlet()


### Example

```typescript
import {
    CrxApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CrxApi(configuration);

const { status, data } = await apiInstance.getPackageManagerServlet();
```

### Parameters
This endpoint does not have any parameters.


### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**404** | Package Manager Servlet is disabled |  -  |
|**405** | Package Manager Servlet is active |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postPackageService**
> string postPackageService()


### Example

```typescript
import {
    CrxApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CrxApi(configuration);

let cmd: string; // (default to undefined)

const { status, data } = await apiInstance.postPackageService(
    cmd
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **cmd** | [**string**] |  | defaults to undefined|


### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postPackageServiceJson**
> string postPackageServiceJson()


### Example

```typescript
import {
    CrxApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CrxApi(configuration);

let path: string; // (default to undefined)
let cmd: string; // (default to undefined)
let groupName: string; // (optional) (default to undefined)
let packageName: string; // (optional) (default to undefined)
let packageVersion: string; // (optional) (default to undefined)
let charset: string; // (optional) (default to undefined)
let force: boolean; // (optional) (default to undefined)
let recursive: boolean; // (optional) (default to undefined)
let _package: File; // (optional) (default to undefined)

const { status, data } = await apiInstance.postPackageServiceJson(
    path,
    cmd,
    groupName,
    packageName,
    packageVersion,
    charset,
    force,
    recursive,
    _package
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **path** | [**string**] |  | defaults to undefined|
| **cmd** | [**string**] |  | defaults to undefined|
| **groupName** | [**string**] |  | (optional) defaults to undefined|
| **packageName** | [**string**] |  | (optional) defaults to undefined|
| **packageVersion** | [**string**] |  | (optional) defaults to undefined|
| **charset** | [**string**] |  | (optional) defaults to undefined|
| **force** | [**boolean**] |  | (optional) defaults to undefined|
| **recursive** | [**boolean**] |  | (optional) defaults to undefined|
| **_package** | [**File**] |  | (optional) defaults to undefined|


### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postPackageUpdate**
> string postPackageUpdate()


### Example

```typescript
import {
    CrxApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CrxApi(configuration);

let groupName: string; // (default to undefined)
let packageName: string; // (default to undefined)
let version: string; // (default to undefined)
let path: string; // (default to undefined)
let filter: string; // (optional) (default to undefined)
let charset: string; // (optional) (default to undefined)

const { status, data } = await apiInstance.postPackageUpdate(
    groupName,
    packageName,
    version,
    path,
    filter,
    charset
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **groupName** | [**string**] |  | defaults to undefined|
| **packageName** | [**string**] |  | defaults to undefined|
| **version** | [**string**] |  | defaults to undefined|
| **path** | [**string**] |  | defaults to undefined|
| **filter** | [**string**] |  | (optional) defaults to undefined|
| **charset** | [**string**] |  | (optional) defaults to undefined|


### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postSetPassword**
> string postSetPassword()


### Example

```typescript
import {
    CrxApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CrxApi(configuration);

let old: string; // (default to undefined)
let plain: string; // (default to undefined)
let verify: string; // (default to undefined)

const { status, data } = await apiInstance.postSetPassword(
    old,
    plain,
    verify
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **old** | [**string**] |  | defaults to undefined|
| **plain** | [**string**] |  | defaults to undefined|
| **verify** | [**string**] |  | defaults to undefined|


### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

