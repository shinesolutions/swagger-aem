# OpenAPI\Server\Api\ConsoleApiInterface

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemProductInfo**](ConsoleApiInterface.md#getAemProductInfo) | **GET** /system/console/status-productinfo.json | 
[**getBundleInfo**](ConsoleApiInterface.md#getBundleInfo) | **GET** /system/console/bundles/{name}.json | 
[**getConfigMgr**](ConsoleApiInterface.md#getConfigMgr) | **GET** /system/console/configMgr | 
[**postBundle**](ConsoleApiInterface.md#postBundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](ConsoleApiInterface.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**postSamlConfiguration**](ConsoleApiInterface.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ConsoleApi:
        tags:
            - { name: "open_api_server.api", api: "console" }
    # ...
```

## **getAemProductInfo**
> string getAemProductInfo()



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ConsoleApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ConsoleApiInterface;

class ConsoleApi implements ConsoleApiInterface
{

    // ...

    /**
     * Implementation of ConsoleApiInterface#getAemProductInfo
     */
    public function getAemProductInfo(int &$responseCode, array &$responseHeaders): array|object|null
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
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getBundleInfo**
> OpenAPI\Server\Model\BundleInfo getBundleInfo($name)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ConsoleApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ConsoleApiInterface;

class ConsoleApi implements ConsoleApiInterface
{

    // ...

    /**
     * Implementation of ConsoleApiInterface#getBundleInfo
     */
    public function getBundleInfo(string $name, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**|  |

### Return type

[**OpenAPI\Server\Model\BundleInfo**](../Model/BundleInfo.md)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getConfigMgr**
> string getConfigMgr()



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ConsoleApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ConsoleApiInterface;

class ConsoleApi implements ConsoleApiInterface
{

    // ...

    /**
     * Implementation of ConsoleApiInterface#getConfigMgr
     */
    public function getConfigMgr(int &$responseCode, array &$responseHeaders): string
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
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postBundle**
> postBundle($name, $action)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ConsoleApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ConsoleApiInterface;

class ConsoleApi implements ConsoleApiInterface
{

    // ...

    /**
     * Implementation of ConsoleApiInterface#postBundle
     */
    public function postBundle(string $name, string $action, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**|  |
 **action** | **string**|  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postJmxRepository**
> postJmxRepository($action)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ConsoleApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ConsoleApiInterface;

class ConsoleApi implements ConsoleApiInterface
{

    // ...

    /**
     * Implementation of ConsoleApiInterface#postJmxRepository
     */
    public function postJmxRepository(string $action, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **string**|  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postSamlConfiguration**
> OpenAPI\Server\Model\SamlConfigurationInfo postSamlConfiguration($post, $apply, $delete, $action, $location, $path, $serviceRanking, $idpUrl, $idpCertAlias, $idpHttpRedirect, $serviceProviderEntityId, $assertionConsumerServiceURL, $spPrivateKeyAlias, $keyStorePassword, $defaultRedirectUrl, $userIDAttribute, $useEncryption, $createUser, $addGroupMemberships, $groupMembershipAttribute, $defaultGroups, $nameIdFormat, $synchronizeAttributes, $handleLogout, $logoutUrl, $clockTolerance, $digestMethod, $signatureMethod, $userIntermediatePath, $propertylist)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ConsoleApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ConsoleApiInterface;

class ConsoleApi implements ConsoleApiInterface
{

    // ...

    /**
     * Implementation of ConsoleApiInterface#postSamlConfiguration
     */
    public function postSamlConfiguration(?bool $post, ?bool $apply, ?bool $delete, ?string $action, ?string $location, ?array $path, ?int $serviceRanking, ?string $idpUrl, ?string $idpCertAlias, ?bool $idpHttpRedirect, ?string $serviceProviderEntityId, ?string $assertionConsumerServiceURL, ?string $spPrivateKeyAlias, ?string $keyStorePassword, ?string $defaultRedirectUrl, ?string $userIDAttribute, ?bool $useEncryption, ?bool $createUser, ?bool $addGroupMemberships, ?string $groupMembershipAttribute, ?array $defaultGroups, ?string $nameIdFormat, ?array $synchronizeAttributes, ?bool $handleLogout, ?string $logoutUrl, ?int $clockTolerance, ?string $digestMethod, ?string $signatureMethod, ?string $userIntermediatePath, ?array $propertylist, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **bool**|  | [optional]
 **apply** | **bool**|  | [optional]
 **delete** | **bool**|  | [optional]
 **action** | **string**|  | [optional]
 **location** | **string**|  | [optional]
 **path** | [**string**](../Model/string.md)|  | [optional]
 **serviceRanking** | **int**|  | [optional]
 **idpUrl** | **string**|  | [optional]
 **idpCertAlias** | **string**|  | [optional]
 **idpHttpRedirect** | **bool**|  | [optional]
 **serviceProviderEntityId** | **string**|  | [optional]
 **assertionConsumerServiceURL** | **string**|  | [optional]
 **spPrivateKeyAlias** | **string**|  | [optional]
 **keyStorePassword** | **string**|  | [optional]
 **defaultRedirectUrl** | **string**|  | [optional]
 **userIDAttribute** | **string**|  | [optional]
 **useEncryption** | **bool**|  | [optional]
 **createUser** | **bool**|  | [optional]
 **addGroupMemberships** | **bool**|  | [optional]
 **groupMembershipAttribute** | **string**|  | [optional]
 **defaultGroups** | [**string**](../Model/string.md)|  | [optional]
 **nameIdFormat** | **string**|  | [optional]
 **synchronizeAttributes** | [**string**](../Model/string.md)|  | [optional]
 **handleLogout** | **bool**|  | [optional]
 **logoutUrl** | **string**|  | [optional]
 **clockTolerance** | **int**|  | [optional]
 **digestMethod** | **string**|  | [optional]
 **signatureMethod** | **string**|  | [optional]
 **userIntermediatePath** | **string**|  | [optional]
 **propertylist** | [**string**](../Model/string.md)|  | [optional]

### Return type

[**OpenAPI\Server\Model\SamlConfigurationInfo**](../Model/SamlConfigurationInfo.md)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

