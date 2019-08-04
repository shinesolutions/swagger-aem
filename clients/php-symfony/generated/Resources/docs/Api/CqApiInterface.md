# OpenAPI\Server\Api\CqApiInterface

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLoginPage**](CqApiInterface.md#getLoginPage) | **GET** /libs/granite/core/content/login.html | 
[**postCqActions**](CqApiInterface.md#postCqActions) | **POST** /.cqactions.html | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.cq:
        class: Acme\MyBundle\Api\CqApi
        tags:
            - { name: "open_apiserver.api", api: "cq" }
    # ...
```

## **getLoginPage**
> string getLoginPage()



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CqApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CqApiInterface;

class CqApi implements CqApiInterface
{

    // ...

    /**
     * Implementation of CqApiInterface#getLoginPage
     */
    public function getLoginPage()
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postCqActions**
> postCqActions($authorizableId, $changelog)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CqApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CqApiInterface;

class CqApi implements CqApiInterface
{

    // ...

    /**
     * Implementation of CqApiInterface#postCqActions
     */
    public function postCqActions($authorizableId, $changelog)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizableId** | **string**|  |
 **changelog** | **string**|  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

