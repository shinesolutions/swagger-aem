# CrxApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCrxdeStatus**](CrxApi.md#getcrxdestatus) | **GET** /crx/server/crx.default/jcr:root/.1.json |  |
| [**getInstallStatus**](CrxApi.md#getinstallstatus) | **GET** /crx/packmgr/installstatus.jsp |  |
| [**getPackageManagerServlet**](CrxApi.md#getpackagemanagerservlet) | **GET** /crx/packmgr/service/script.html |  |
| [**postPackageService**](CrxApi.md#postpackageservice) | **POST** /crx/packmgr/service.jsp |  |
| [**postPackageServiceJson**](CrxApi.md#postpackageservicejson) | **POST** /crx/packmgr/service/.json/{path} |  |
| [**postPackageUpdate**](CrxApi.md#postpackageupdate) | **POST** /crx/packmgr/update.jsp |  |
| [**postSetPassword**](CrxApi.md#postsetpassword) | **POST** /crx/explorer/ui/setpassword.jsp |  |



## getCrxdeStatus

> string getCrxdeStatus()



### Example

```ts
import {
  Configuration,
  CrxApi,
} from '';
import type { GetCrxdeStatusRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new CrxApi(config);

  try {
    const data = await api.getCrxdeStatus();
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

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `plain/text`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CRXDE is enabled |  -  |
| **404** | CRXDE is disabled |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getInstallStatus

> InstallStatus getInstallStatus()



### Example

```ts
import {
  Configuration,
  CrxApi,
} from '';
import type { GetInstallStatusRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new CrxApi(config);

  try {
    const data = await api.getInstallStatus();
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

[**InstallStatus**](InstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved CRX package manager install status |  -  |
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getPackageManagerServlet

> getPackageManagerServlet()



### Example

```ts
import {
  Configuration,
  CrxApi,
} from '';
import type { GetPackageManagerServletRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new CrxApi(config);

  try {
    const data = await api.getPackageManagerServlet();
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

`void` (Empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `text/html`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Package Manager Servlet is disabled |  -  |
| **405** | Package Manager Servlet is active |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postPackageService

> string postPackageService(cmd)



### Example

```ts
import {
  Configuration,
  CrxApi,
} from '';
import type { PostPackageServiceRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new CrxApi(config);

  const body = {
    // string
    cmd: cmd_example,
  } satisfies PostPackageServiceRequest;

  try {
    const data = await api.postPackageService(body);
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
| **cmd** | `string` |  | [Defaults to `undefined`] |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `text/xml`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postPackageServiceJson

> string postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _package)



### Example

```ts
import {
  Configuration,
  CrxApi,
} from '';
import type { PostPackageServiceJsonRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new CrxApi(config);

  const body = {
    // string
    path: path_example,
    // string
    cmd: cmd_example,
    // string (optional)
    groupName: groupName_example,
    // string (optional)
    packageName: packageName_example,
    // string (optional)
    packageVersion: packageVersion_example,
    // string (optional)
    charset: charset_example,
    // boolean (optional)
    force: true,
    // boolean (optional)
    recursive: true,
    // Blob (optional)
    _package: BINARY_DATA_HERE,
  } satisfies PostPackageServiceJsonRequest;

  try {
    const data = await api.postPackageServiceJson(body);
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
| **path** | `string` |  | [Defaults to `undefined`] |
| **cmd** | `string` |  | [Defaults to `undefined`] |
| **groupName** | `string` |  | [Optional] [Defaults to `undefined`] |
| **packageName** | `string` |  | [Optional] [Defaults to `undefined`] |
| **packageVersion** | `string` |  | [Optional] [Defaults to `undefined`] |
| **charset** | `string` |  | [Optional] [Defaults to `undefined`] |
| **force** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **recursive** | `boolean` |  | [Optional] [Defaults to `undefined`] |
| **_package** | `Blob` |  | [Optional] [Defaults to `undefined`] |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postPackageUpdate

> string postPackageUpdate(groupName, packageName, version, path, filter, charset)



### Example

```ts
import {
  Configuration,
  CrxApi,
} from '';
import type { PostPackageUpdateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new CrxApi(config);

  const body = {
    // string
    groupName: groupName_example,
    // string
    packageName: packageName_example,
    // string
    version: version_example,
    // string
    path: path_example,
    // string (optional)
    filter: filter_example,
    // string (optional)
    charset: charset_example,
  } satisfies PostPackageUpdateRequest;

  try {
    const data = await api.postPackageUpdate(body);
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
| **groupName** | `string` |  | [Defaults to `undefined`] |
| **packageName** | `string` |  | [Defaults to `undefined`] |
| **version** | `string` |  | [Defaults to `undefined`] |
| **path** | `string` |  | [Defaults to `undefined`] |
| **filter** | `string` |  | [Optional] [Defaults to `undefined`] |
| **charset** | `string` |  | [Optional] [Defaults to `undefined`] |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postSetPassword

> string postSetPassword(old, plain, verify)



### Example

```ts
import {
  Configuration,
  CrxApi,
} from '';
import type { PostSetPasswordRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure HTTP basic authorization: aemAuth
    username: "YOUR USERNAME",
    password: "YOUR PASSWORD",
  });
  const api = new CrxApi(config);

  const body = {
    // string
    old: old_example,
    // string
    plain: plain_example,
    // string
    verify: verify_example,
  } satisfies PostSetPasswordRequest;

  try {
    const data = await api.postSetPassword(body);
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
| **old** | `string` |  | [Defaults to `undefined`] |
| **plain** | `string` |  | [Defaults to `undefined`] |
| **verify** | `string` |  | [Defaults to `undefined`] |

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `text/plain`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

