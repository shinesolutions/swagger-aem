# OpenAPI\Server\Api\ConsoleApiInterface

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemProductInfo**](ConsoleApiInterface.md#getAemProductInfo) | **GET** /system/console/status-productinfo.json | 
[**getConfigMgr**](ConsoleApiInterface.md#getConfigMgr) | **GET** /system/console/configMgr | 
[**postBundle**](ConsoleApiInterface.md#postBundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository**](ConsoleApiInterface.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**postSamlConfiguration**](ConsoleApiInterface.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.console:
        class: Acme\MyBundle\Api\ConsoleApi
        tags:
            - { name: "open_apiserver.api", api: "console" }
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
    public function getAemProductInfo()
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
    public function getConfigMgr()
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
    public function postBundle($name, $action)
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
    public function postJmxRepository($action)
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
    public function postSamlConfiguration($post = null, $apply = null, $delete = null, $action = null, $location = null, array $path = null, $serviceRanking = null, $idpUrl = null, $idpCertAlias = null, $idpHttpRedirect = null, $serviceProviderEntityId = null, $assertionConsumerServiceURL = null, $spPrivateKeyAlias = null, $keyStorePassword = null, $defaultRedirectUrl = null, $userIDAttribute = null, $useEncryption = null, $createUser = null, $addGroupMemberships = null, $groupMembershipAttribute = null, array $defaultGroups = null, $nameIdFormat = null, array $synchronizeAttributes = null, $handleLogout = null, $logoutUrl = null, $clockTolerance = null, $digestMethod = null, $signatureMethod = null, $userIntermediatePath = null, array $propertylist = null)
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

