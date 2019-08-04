# OpenAPI\Server\Api\CustomApiInterface

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemHealthCheck**](CustomApiInterface.md#getAemHealthCheck) | **GET** /system/health | 
[**postConfigAemHealthCheckServlet**](CustomApiInterface.md#postConfigAemHealthCheckServlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**postConfigAemPasswordReset**](CustomApiInterface.md#postConfigAemPasswordReset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.custom:
        class: Acme\MyBundle\Api\CustomApi
        tags:
            - { name: "open_apiserver.api", api: "custom" }
    # ...
```

## **getAemHealthCheck**
> string getAemHealthCheck($tags, $combineTagsOr)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CustomApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CustomApiInterface;

class CustomApi implements CustomApiInterface
{

    // ...

    /**
     * Implementation of CustomApiInterface#getAemHealthCheck
     */
    public function getAemHealthCheck($tags = null, $combineTagsOr = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | **string**|  | [optional]
 **combineTagsOr** | **bool**|  | [optional]

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postConfigAemHealthCheckServlet**
> postConfigAemHealthCheckServlet($bundlesIgnored, $bundlesIgnoredTypeHint)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CustomApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CustomApiInterface;

class CustomApi implements CustomApiInterface
{

    // ...

    /**
     * Implementation of CustomApiInterface#postConfigAemHealthCheckServlet
     */
    public function postConfigAemHealthCheckServlet(array $bundlesIgnored = null, $bundlesIgnoredTypeHint = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundlesIgnored** | [**string**](../Model/string.md)|  | [optional]
 **bundlesIgnoredTypeHint** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postConfigAemPasswordReset**
> postConfigAemPasswordReset($pwdresetAuthorizables, $pwdresetAuthorizablesTypeHint)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CustomApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CustomApiInterface;

class CustomApi implements CustomApiInterface
{

    // ...

    /**
     * Implementation of CustomApiInterface#postConfigAemPasswordReset
     */
    public function postConfigAemPasswordReset(array $pwdresetAuthorizables = null, $pwdresetAuthorizablesTypeHint = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pwdresetAuthorizables** | [**string**](../Model/string.md)|  | [optional]
 **pwdresetAuthorizablesTypeHint** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

