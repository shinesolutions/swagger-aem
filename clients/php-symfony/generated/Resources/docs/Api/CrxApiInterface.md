# OpenAPI\Server\Api\CrxApiInterface

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCrxdeStatus**](CrxApiInterface.md#getCrxdeStatus) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
[**getInstallStatus**](CrxApiInterface.md#getInstallStatus) | **GET** /crx/packmgr/installstatus.jsp | 
[**getPackageManagerServlet**](CrxApiInterface.md#getPackageManagerServlet) | **GET** /crx/packmgr/service/script.html | 
[**postPackageService**](CrxApiInterface.md#postPackageService) | **POST** /crx/packmgr/service.jsp | 
[**postPackageServiceJson**](CrxApiInterface.md#postPackageServiceJson) | **POST** /crx/packmgr/service/.json/{path} | 
[**postPackageUpdate**](CrxApiInterface.md#postPackageUpdate) | **POST** /crx/packmgr/update.jsp | 
[**postSetPassword**](CrxApiInterface.md#postSetPassword) | **POST** /crx/explorer/ui/setpassword.jsp | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.crx:
        class: Acme\MyBundle\Api\CrxApi
        tags:
            - { name: "open_apiserver.api", api: "crx" }
    # ...
```

## **getCrxdeStatus**
> string getCrxdeStatus()



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CrxApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CrxApiInterface;

class CrxApi implements CrxApiInterface
{

    // ...

    /**
     * Implementation of CrxApiInterface#getCrxdeStatus
     */
    public function getCrxdeStatus()
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: plain/text

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getInstallStatus**
> OpenAPI\Server\Model\InstallStatus getInstallStatus()



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CrxApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CrxApiInterface;

class CrxApi implements CrxApiInterface
{

    // ...

    /**
     * Implementation of CrxApiInterface#getInstallStatus
     */
    public function getInstallStatus()
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OpenAPI\Server\Model\InstallStatus**](../Model/InstallStatus.md)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getPackageManagerServlet**
> getPackageManagerServlet()



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CrxApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CrxApiInterface;

class CrxApi implements CrxApiInterface
{

    // ...

    /**
     * Implementation of CrxApiInterface#getPackageManagerServlet
     */
    public function getPackageManagerServlet()
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postPackageService**
> string postPackageService($cmd)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CrxApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CrxApiInterface;

class CrxApi implements CrxApiInterface
{

    // ...

    /**
     * Implementation of CrxApiInterface#postPackageService
     */
    public function postPackageService($cmd)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmd** | **string**|  |

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postPackageServiceJson**
> string postPackageServiceJson($path, $cmd, $groupName, $packageName, $packageVersion, $charset, $force, $recursive, $package)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CrxApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CrxApiInterface;

class CrxApi implements CrxApiInterface
{

    // ...

    /**
     * Implementation of CrxApiInterface#postPackageServiceJson
     */
    public function postPackageServiceJson($path, $cmd, $groupName = null, $packageName = null, $packageVersion = null, $charset = null, $force = null, $recursive = null, UploadedFile $package = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string**|  |
 **cmd** | **string**|  |
 **groupName** | **string**|  | [optional]
 **packageName** | **string**|  | [optional]
 **packageVersion** | **string**|  | [optional]
 **charset** | **string**|  | [optional]
 **force** | **bool**|  | [optional]
 **recursive** | **bool**|  | [optional]
 **package** | **UploadedFile****UploadedFile**|  | [optional]

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postPackageUpdate**
> string postPackageUpdate($groupName, $packageName, $version, $path, $filter, $charset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CrxApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CrxApiInterface;

class CrxApi implements CrxApiInterface
{

    // ...

    /**
     * Implementation of CrxApiInterface#postPackageUpdate
     */
    public function postPackageUpdate($groupName, $packageName, $version, $path, $filter = null, $charset = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **string**|  |
 **packageName** | **string**|  |
 **version** | **string**|  |
 **path** | **string**|  |
 **filter** | **string**|  | [optional]
 **charset** | **string**|  | [optional]

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postSetPassword**
> string postSetPassword($old, $plain, $verify)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CrxApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CrxApiInterface;

class CrxApi implements CrxApiInterface
{

    // ...

    /**
     * Implementation of CrxApiInterface#postSetPassword
     */
    public function postSetPassword($old, $plain, $verify)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **old** | **string**|  |
 **plain** | **string**|  |
 **verify** | **string**|  |

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

