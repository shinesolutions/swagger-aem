# OpenAPI\Server\Api\SlingApiInterface

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAgent**](SlingApiInterface.md#deleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**deleteNode**](SlingApiInterface.md#deleteNode) | **DELETE** /{path}/{name} | 
[**getAgent**](SlingApiInterface.md#getAgent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**getAgents**](SlingApiInterface.md#getAgents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**getAuthorizableKeystore**](SlingApiInterface.md#getAuthorizableKeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**getKeystore**](SlingApiInterface.md#getKeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**getNode**](SlingApiInterface.md#getNode) | **GET** /{path}/{name} | 
[**getPackage**](SlingApiInterface.md#getPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**getPackageFilter**](SlingApiInterface.md#getPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**getQuery**](SlingApiInterface.md#getQuery) | **GET** /bin/querybuilder.json | 
[**getTruststore**](SlingApiInterface.md#getTruststore) | **GET** /etc/truststore/truststore.p12 | 
[**getTruststoreInfo**](SlingApiInterface.md#getTruststoreInfo) | **GET** /libs/granite/security/truststore.json | 
[**postAgent**](SlingApiInterface.md#postAgent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**postAuthorizableKeystore**](SlingApiInterface.md#postAuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**postAuthorizables**](SlingApiInterface.md#postAuthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**postConfigAdobeGraniteSamlAuthenticationHandler**](SlingApiInterface.md#postConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**postConfigApacheFelixJettyBasedHttpService**](SlingApiInterface.md#postConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http | 
[**postConfigApacheHttpComponentsProxyConfiguration**](SlingApiInterface.md#postConfigApacheHttpComponentsProxyConfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**postConfigApacheSlingDavExServlet**](SlingApiInterface.md#postConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**postConfigApacheSlingGetServlet**](SlingApiInterface.md#postConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**postConfigApacheSlingReferrerFilter**](SlingApiInterface.md#postConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**postConfigProperty**](SlingApiInterface.md#postConfigProperty) | **POST** /apps/system/config/{configNodeName} | 
[**postNode**](SlingApiInterface.md#postNode) | **POST** /{path}/{name} | 
[**postNodeRw**](SlingApiInterface.md#postNodeRw) | **POST** /{path}/{name}.rw.html | 
[**postPath**](SlingApiInterface.md#postPath) | **POST** /{path}/ | 
[**postQuery**](SlingApiInterface.md#postQuery) | **POST** /bin/querybuilder.json | 
[**postTreeActivation**](SlingApiInterface.md#postTreeActivation) | **POST** /libs/replication/treeactivation.html | 
[**postTruststore**](SlingApiInterface.md#postTruststore) | **POST** /libs/granite/security/post/truststore | 
[**postTruststorePKCS12**](SlingApiInterface.md#postTruststorePKCS12) | **POST** /etc/truststore | 


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\SlingApi:
        tags:
            - { name: "open_api_server.api", api: "sling" }
    # ...
```

## **deleteAgent**
> deleteAgent($runmode, $name)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#deleteAgent
     */
    public function deleteAgent(string $runmode, string $name, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **string**|  |
 **name** | **string**|  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deleteNode**
> deleteNode($path, $name)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#deleteNode
     */
    public function deleteNode(string $path, string $name, int &$responseCode, array &$responseHeaders): void
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
 **name** | **string**|  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getAgent**
> getAgent($runmode, $name)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#getAgent
     */
    public function getAgent(string $runmode, string $name, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **string**|  |
 **name** | **string**|  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getAgents**
> string getAgents($runmode)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#getAgents
     */
    public function getAgents(string $runmode, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **string**|  |

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getAuthorizableKeystore**
> OpenAPI\Server\Model\KeystoreInfo getAuthorizableKeystore($intermediatePath, $authorizableId)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#getAuthorizableKeystore
     */
    public function getAuthorizableKeystore(string $intermediatePath, string $authorizableId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **string**|  |
 **authorizableId** | **string**|  |

### Return type

[**OpenAPI\Server\Model\KeystoreInfo**](../Model/KeystoreInfo.md)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getKeystore**
> UploadedFile getKeystore($intermediatePath, $authorizableId)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#getKeystore
     */
    public function getKeystore(string $intermediatePath, string $authorizableId, int &$responseCode, array &$responseHeaders): mixed
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **string**|  |
 **authorizableId** | **string**|  |

### Return type

**UploadedFile**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getNode**
> getNode($path, $name)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#getNode
     */
    public function getNode(string $path, string $name, int &$responseCode, array &$responseHeaders): void
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
 **name** | **string**|  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getPackage**
> UploadedFile getPackage($group, $name, $version)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#getPackage
     */
    public function getPackage(string $group, string $name, string $version, int &$responseCode, array &$responseHeaders): mixed
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **string**|  |
 **name** | **string**|  |
 **version** | **string**|  |

### Return type

**UploadedFile**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getPackageFilter**
> string getPackageFilter($group, $name, $version)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#getPackageFilter
     */
    public function getPackageFilter(string $group, string $name, string $version, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **string**|  |
 **name** | **string**|  |
 **version** | **string**|  |

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getQuery**
> string getQuery($path, $pLimit, $_1property, $_1propertyValue)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#getQuery
     */
    public function getQuery(string $path, float $pLimit, string $_1property, string $_1propertyValue, int &$responseCode, array &$responseHeaders): array|object|null
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
 **pLimit** | **float**|  |
 **_1property** | **string**|  |
 **_1propertyValue** | **string**|  |

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getTruststore**
> UploadedFile getTruststore()



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#getTruststore
     */
    public function getTruststore(int &$responseCode, array &$responseHeaders): mixed
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UploadedFile**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getTruststoreInfo**
> OpenAPI\Server\Model\TruststoreInfo getTruststoreInfo()



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#getTruststoreInfo
     */
    public function getTruststoreInfo(int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OpenAPI\Server\Model\TruststoreInfo**](../Model/TruststoreInfo.md)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postAgent**
> postAgent($runmode, $name, $jcrContentCqDistribute, $jcrContentCqDistributeTypeHint, $jcrContentCqName, $jcrContentCqTemplate, $jcrContentAliasUpdate, $jcrContentEnabled, $jcrContentJcrDescription, $jcrContentJcrLastModified, $jcrContentJcrLastModifiedBy, $jcrContentJcrMixinTypes, $jcrContentJcrTitle, $jcrContentLogLevel, $jcrContentNoStatusUpdate, $jcrContentNoVersioning, $jcrContentProtocolConnectTimeout, $jcrContentProtocolHTTPConnectionClosed, $jcrContentProtocolHTTPExpired, $jcrContentProtocolHTTPHeaders, $jcrContentProtocolHTTPHeadersTypeHint, $jcrContentProtocolHTTPMethod, $jcrContentProtocolHTTPSRelaxed, $jcrContentProtocolInterface, $jcrContentProtocolSocketTimeout, $jcrContentProtocolVersion, $jcrContentProxyNTLMDomain, $jcrContentProxyNTLMHost, $jcrContentProxyHost, $jcrContentProxyPassword, $jcrContentProxyPort, $jcrContentProxyUser, $jcrContentQueueBatchMaxSize, $jcrContentQueueBatchMode, $jcrContentQueueBatchWaitTime, $jcrContentRetryDelay, $jcrContentReverseReplication, $jcrContentSerializationType, $jcrContentSlingResourceType, $jcrContentSsl, $jcrContentTransportNTLMDomain, $jcrContentTransportNTLMHost, $jcrContentTransportPassword, $jcrContentTransportUri, $jcrContentTransportUser, $jcrContentTriggerDistribute, $jcrContentTriggerModified, $jcrContentTriggerOnOffTime, $jcrContentTriggerReceive, $jcrContentTriggerSpecific, $jcrContentUserId, $jcrPrimaryType, $operation)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#postAgent
     */
    public function postAgent(string $runmode, string $name, ?bool $jcrContentCqDistribute, ?string $jcrContentCqDistributeTypeHint, ?string $jcrContentCqName, ?string $jcrContentCqTemplate, ?bool $jcrContentAliasUpdate, ?bool $jcrContentEnabled, ?string $jcrContentJcrDescription, ?string $jcrContentJcrLastModified, ?string $jcrContentJcrLastModifiedBy, ?string $jcrContentJcrMixinTypes, ?string $jcrContentJcrTitle, ?string $jcrContentLogLevel, ?bool $jcrContentNoStatusUpdate, ?bool $jcrContentNoVersioning, ?float $jcrContentProtocolConnectTimeout, ?bool $jcrContentProtocolHTTPConnectionClosed, ?string $jcrContentProtocolHTTPExpired, ?array $jcrContentProtocolHTTPHeaders, ?string $jcrContentProtocolHTTPHeadersTypeHint, ?string $jcrContentProtocolHTTPMethod, ?bool $jcrContentProtocolHTTPSRelaxed, ?string $jcrContentProtocolInterface, ?float $jcrContentProtocolSocketTimeout, ?string $jcrContentProtocolVersion, ?string $jcrContentProxyNTLMDomain, ?string $jcrContentProxyNTLMHost, ?string $jcrContentProxyHost, ?string $jcrContentProxyPassword, ?float $jcrContentProxyPort, ?string $jcrContentProxyUser, ?float $jcrContentQueueBatchMaxSize, ?string $jcrContentQueueBatchMode, ?float $jcrContentQueueBatchWaitTime, ?string $jcrContentRetryDelay, ?bool $jcrContentReverseReplication, ?string $jcrContentSerializationType, ?string $jcrContentSlingResourceType, ?string $jcrContentSsl, ?string $jcrContentTransportNTLMDomain, ?string $jcrContentTransportNTLMHost, ?string $jcrContentTransportPassword, ?string $jcrContentTransportUri, ?string $jcrContentTransportUser, ?bool $jcrContentTriggerDistribute, ?bool $jcrContentTriggerModified, ?bool $jcrContentTriggerOnOffTime, ?bool $jcrContentTriggerReceive, ?bool $jcrContentTriggerSpecific, ?string $jcrContentUserId, ?string $jcrPrimaryType, ?string $operation, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **string**|  |
 **name** | **string**|  |
 **jcrContentCqDistribute** | **bool**|  | [optional]
 **jcrContentCqDistributeTypeHint** | **string**|  | [optional]
 **jcrContentCqName** | **string**|  | [optional]
 **jcrContentCqTemplate** | **string**|  | [optional]
 **jcrContentAliasUpdate** | **bool**|  | [optional]
 **jcrContentEnabled** | **bool**|  | [optional]
 **jcrContentJcrDescription** | **string**|  | [optional]
 **jcrContentJcrLastModified** | **string**|  | [optional]
 **jcrContentJcrLastModifiedBy** | **string**|  | [optional]
 **jcrContentJcrMixinTypes** | **string**|  | [optional]
 **jcrContentJcrTitle** | **string**|  | [optional]
 **jcrContentLogLevel** | **string**|  | [optional]
 **jcrContentNoStatusUpdate** | **bool**|  | [optional]
 **jcrContentNoVersioning** | **bool**|  | [optional]
 **jcrContentProtocolConnectTimeout** | **float**|  | [optional]
 **jcrContentProtocolHTTPConnectionClosed** | **bool**|  | [optional]
 **jcrContentProtocolHTTPExpired** | **string**|  | [optional]
 **jcrContentProtocolHTTPHeaders** | [**string**](../Model/string.md)|  | [optional]
 **jcrContentProtocolHTTPHeadersTypeHint** | **string**|  | [optional]
 **jcrContentProtocolHTTPMethod** | **string**|  | [optional]
 **jcrContentProtocolHTTPSRelaxed** | **bool**|  | [optional]
 **jcrContentProtocolInterface** | **string**|  | [optional]
 **jcrContentProtocolSocketTimeout** | **float**|  | [optional]
 **jcrContentProtocolVersion** | **string**|  | [optional]
 **jcrContentProxyNTLMDomain** | **string**|  | [optional]
 **jcrContentProxyNTLMHost** | **string**|  | [optional]
 **jcrContentProxyHost** | **string**|  | [optional]
 **jcrContentProxyPassword** | **string**|  | [optional]
 **jcrContentProxyPort** | **float**|  | [optional]
 **jcrContentProxyUser** | **string**|  | [optional]
 **jcrContentQueueBatchMaxSize** | **float**|  | [optional]
 **jcrContentQueueBatchMode** | **string**|  | [optional]
 **jcrContentQueueBatchWaitTime** | **float**|  | [optional]
 **jcrContentRetryDelay** | **string**|  | [optional]
 **jcrContentReverseReplication** | **bool**|  | [optional]
 **jcrContentSerializationType** | **string**|  | [optional]
 **jcrContentSlingResourceType** | **string**|  | [optional]
 **jcrContentSsl** | **string**|  | [optional]
 **jcrContentTransportNTLMDomain** | **string**|  | [optional]
 **jcrContentTransportNTLMHost** | **string**|  | [optional]
 **jcrContentTransportPassword** | **string**|  | [optional]
 **jcrContentTransportUri** | **string**|  | [optional]
 **jcrContentTransportUser** | **string**|  | [optional]
 **jcrContentTriggerDistribute** | **bool**|  | [optional]
 **jcrContentTriggerModified** | **bool**|  | [optional]
 **jcrContentTriggerOnOffTime** | **bool**|  | [optional]
 **jcrContentTriggerReceive** | **bool**|  | [optional]
 **jcrContentTriggerSpecific** | **bool**|  | [optional]
 **jcrContentUserId** | **string**|  | [optional]
 **jcrPrimaryType** | **string**|  | [optional]
 **operation** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postAuthorizableKeystore**
> OpenAPI\Server\Model\KeystoreInfo postAuthorizableKeystore($intermediatePath, $authorizableId, $operation, $currentPassword, $newPassword, $rePassword, $keyPassword, $keyStorePass, $alias, $newAlias, $removeAlias, $certChain, $pk, $keyStore)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#postAuthorizableKeystore
     */
    public function postAuthorizableKeystore(string $intermediatePath, string $authorizableId, ?string $operation, ?string $currentPassword, ?string $newPassword, ?string $rePassword, ?string $keyPassword, ?string $keyStorePass, ?string $alias, ?string $newAlias, ?string $removeAlias, ?UploadedFile $certChain, ?UploadedFile $pk, ?UploadedFile $keyStore, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediatePath** | **string**|  |
 **authorizableId** | **string**|  |
 **operation** | **string**|  | [optional]
 **currentPassword** | **string**|  | [optional]
 **newPassword** | **string**|  | [optional]
 **rePassword** | **string**|  | [optional]
 **keyPassword** | **string**|  | [optional]
 **keyStorePass** | **string**|  | [optional]
 **alias** | **string**|  | [optional]
 **newAlias** | **string**|  | [optional]
 **removeAlias** | **string**|  | [optional]
 **certChain** | **UploadedFile****UploadedFile**|  | [optional]
 **pk** | **UploadedFile****UploadedFile**|  | [optional]
 **keyStore** | **UploadedFile****UploadedFile**|  | [optional]

### Return type

[**OpenAPI\Server\Model\KeystoreInfo**](../Model/KeystoreInfo.md)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postAuthorizables**
> string postAuthorizables($authorizableId, $intermediatePath, $createUser, $createGroup, $repPassword, $profileGivenName)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#postAuthorizables
     */
    public function postAuthorizables(string $authorizableId, string $intermediatePath, ?string $createUser, ?string $createGroup, ?string $repPassword, ?string $profileGivenName, int &$responseCode, array &$responseHeaders): string
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
 **intermediatePath** | **string**|  |
 **createUser** | **string**|  | [optional]
 **createGroup** | **string**|  | [optional]
 **repPassword** | **string**|  | [optional]
 **profileGivenName** | **string**|  | [optional]

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postConfigAdobeGraniteSamlAuthenticationHandler**
> postConfigAdobeGraniteSamlAuthenticationHandler($keyStorePassword, $keyStorePasswordTypeHint, $serviceRanking, $serviceRankingTypeHint, $idpHttpRedirect, $idpHttpRedirectTypeHint, $createUser, $createUserTypeHint, $defaultRedirectUrl, $defaultRedirectUrlTypeHint, $userIDAttribute, $userIDAttributeTypeHint, $defaultGroups, $defaultGroupsTypeHint, $idpCertAlias, $idpCertAliasTypeHint, $addGroupMemberships, $addGroupMembershipsTypeHint, $path, $pathTypeHint, $synchronizeAttributes, $synchronizeAttributesTypeHint, $clockTolerance, $clockToleranceTypeHint, $groupMembershipAttribute, $groupMembershipAttributeTypeHint, $idpUrl, $idpUrlTypeHint, $logoutUrl, $logoutUrlTypeHint, $serviceProviderEntityId, $serviceProviderEntityIdTypeHint, $assertionConsumerServiceURL, $assertionConsumerServiceURLTypeHint, $handleLogout, $handleLogoutTypeHint, $spPrivateKeyAlias, $spPrivateKeyAliasTypeHint, $useEncryption, $useEncryptionTypeHint, $nameIdFormat, $nameIdFormatTypeHint, $digestMethod, $digestMethodTypeHint, $signatureMethod, $signatureMethodTypeHint, $userIntermediatePath, $userIntermediatePathTypeHint)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#postConfigAdobeGraniteSamlAuthenticationHandler
     */
    public function postConfigAdobeGraniteSamlAuthenticationHandler(?string $keyStorePassword, ?string $keyStorePasswordTypeHint, ?int $serviceRanking, ?string $serviceRankingTypeHint, ?bool $idpHttpRedirect, ?string $idpHttpRedirectTypeHint, ?bool $createUser, ?string $createUserTypeHint, ?string $defaultRedirectUrl, ?string $defaultRedirectUrlTypeHint, ?string $userIDAttribute, ?string $userIDAttributeTypeHint, ?array $defaultGroups, ?string $defaultGroupsTypeHint, ?string $idpCertAlias, ?string $idpCertAliasTypeHint, ?bool $addGroupMemberships, ?string $addGroupMembershipsTypeHint, ?array $path, ?string $pathTypeHint, ?array $synchronizeAttributes, ?string $synchronizeAttributesTypeHint, ?int $clockTolerance, ?string $clockToleranceTypeHint, ?string $groupMembershipAttribute, ?string $groupMembershipAttributeTypeHint, ?string $idpUrl, ?string $idpUrlTypeHint, ?string $logoutUrl, ?string $logoutUrlTypeHint, ?string $serviceProviderEntityId, ?string $serviceProviderEntityIdTypeHint, ?string $assertionConsumerServiceURL, ?string $assertionConsumerServiceURLTypeHint, ?bool $handleLogout, ?string $handleLogoutTypeHint, ?string $spPrivateKeyAlias, ?string $spPrivateKeyAliasTypeHint, ?bool $useEncryption, ?string $useEncryptionTypeHint, ?string $nameIdFormat, ?string $nameIdFormatTypeHint, ?string $digestMethod, ?string $digestMethodTypeHint, ?string $signatureMethod, ?string $signatureMethodTypeHint, ?string $userIntermediatePath, ?string $userIntermediatePathTypeHint, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keyStorePassword** | **string**|  | [optional]
 **keyStorePasswordTypeHint** | **string**|  | [optional]
 **serviceRanking** | **int**|  | [optional]
 **serviceRankingTypeHint** | **string**|  | [optional]
 **idpHttpRedirect** | **bool**|  | [optional]
 **idpHttpRedirectTypeHint** | **string**|  | [optional]
 **createUser** | **bool**|  | [optional]
 **createUserTypeHint** | **string**|  | [optional]
 **defaultRedirectUrl** | **string**|  | [optional]
 **defaultRedirectUrlTypeHint** | **string**|  | [optional]
 **userIDAttribute** | **string**|  | [optional]
 **userIDAttributeTypeHint** | **string**|  | [optional]
 **defaultGroups** | [**string**](../Model/string.md)|  | [optional]
 **defaultGroupsTypeHint** | **string**|  | [optional]
 **idpCertAlias** | **string**|  | [optional]
 **idpCertAliasTypeHint** | **string**|  | [optional]
 **addGroupMemberships** | **bool**|  | [optional]
 **addGroupMembershipsTypeHint** | **string**|  | [optional]
 **path** | [**string**](../Model/string.md)|  | [optional]
 **pathTypeHint** | **string**|  | [optional]
 **synchronizeAttributes** | [**string**](../Model/string.md)|  | [optional]
 **synchronizeAttributesTypeHint** | **string**|  | [optional]
 **clockTolerance** | **int**|  | [optional]
 **clockToleranceTypeHint** | **string**|  | [optional]
 **groupMembershipAttribute** | **string**|  | [optional]
 **groupMembershipAttributeTypeHint** | **string**|  | [optional]
 **idpUrl** | **string**|  | [optional]
 **idpUrlTypeHint** | **string**|  | [optional]
 **logoutUrl** | **string**|  | [optional]
 **logoutUrlTypeHint** | **string**|  | [optional]
 **serviceProviderEntityId** | **string**|  | [optional]
 **serviceProviderEntityIdTypeHint** | **string**|  | [optional]
 **assertionConsumerServiceURL** | **string**|  | [optional]
 **assertionConsumerServiceURLTypeHint** | **string**|  | [optional]
 **handleLogout** | **bool**|  | [optional]
 **handleLogoutTypeHint** | **string**|  | [optional]
 **spPrivateKeyAlias** | **string**|  | [optional]
 **spPrivateKeyAliasTypeHint** | **string**|  | [optional]
 **useEncryption** | **bool**|  | [optional]
 **useEncryptionTypeHint** | **string**|  | [optional]
 **nameIdFormat** | **string**|  | [optional]
 **nameIdFormatTypeHint** | **string**|  | [optional]
 **digestMethod** | **string**|  | [optional]
 **digestMethodTypeHint** | **string**|  | [optional]
 **signatureMethod** | **string**|  | [optional]
 **signatureMethodTypeHint** | **string**|  | [optional]
 **userIntermediatePath** | **string**|  | [optional]
 **userIntermediatePathTypeHint** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postConfigApacheFelixJettyBasedHttpService**
> postConfigApacheFelixJettyBasedHttpService($orgApacheFelixHttpsNio, $orgApacheFelixHttpsNioTypeHint, $orgApacheFelixHttpsKeystore, $orgApacheFelixHttpsKeystoreTypeHint, $orgApacheFelixHttpsKeystorePassword, $orgApacheFelixHttpsKeystorePasswordTypeHint, $orgApacheFelixHttpsKeystoreKey, $orgApacheFelixHttpsKeystoreKeyTypeHint, $orgApacheFelixHttpsKeystoreKeyPassword, $orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, $orgApacheFelixHttpsTruststore, $orgApacheFelixHttpsTruststoreTypeHint, $orgApacheFelixHttpsTruststorePassword, $orgApacheFelixHttpsTruststorePasswordTypeHint, $orgApacheFelixHttpsClientcertificate, $orgApacheFelixHttpsClientcertificateTypeHint, $orgApacheFelixHttpsEnable, $orgApacheFelixHttpsEnableTypeHint, $orgOsgiServiceHttpPortSecure, $orgOsgiServiceHttpPortSecureTypeHint)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#postConfigApacheFelixJettyBasedHttpService
     */
    public function postConfigApacheFelixJettyBasedHttpService(?bool $orgApacheFelixHttpsNio, ?string $orgApacheFelixHttpsNioTypeHint, ?string $orgApacheFelixHttpsKeystore, ?string $orgApacheFelixHttpsKeystoreTypeHint, ?string $orgApacheFelixHttpsKeystorePassword, ?string $orgApacheFelixHttpsKeystorePasswordTypeHint, ?string $orgApacheFelixHttpsKeystoreKey, ?string $orgApacheFelixHttpsKeystoreKeyTypeHint, ?string $orgApacheFelixHttpsKeystoreKeyPassword, ?string $orgApacheFelixHttpsKeystoreKeyPasswordTypeHint, ?string $orgApacheFelixHttpsTruststore, ?string $orgApacheFelixHttpsTruststoreTypeHint, ?string $orgApacheFelixHttpsTruststorePassword, ?string $orgApacheFelixHttpsTruststorePasswordTypeHint, ?string $orgApacheFelixHttpsClientcertificate, ?string $orgApacheFelixHttpsClientcertificateTypeHint, ?bool $orgApacheFelixHttpsEnable, ?string $orgApacheFelixHttpsEnableTypeHint, ?string $orgOsgiServiceHttpPortSecure, ?string $orgOsgiServiceHttpPortSecureTypeHint, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgApacheFelixHttpsNio** | **bool**|  | [optional]
 **orgApacheFelixHttpsNioTypeHint** | **string**|  | [optional]
 **orgApacheFelixHttpsKeystore** | **string**|  | [optional]
 **orgApacheFelixHttpsKeystoreTypeHint** | **string**|  | [optional]
 **orgApacheFelixHttpsKeystorePassword** | **string**|  | [optional]
 **orgApacheFelixHttpsKeystorePasswordTypeHint** | **string**|  | [optional]
 **orgApacheFelixHttpsKeystoreKey** | **string**|  | [optional]
 **orgApacheFelixHttpsKeystoreKeyTypeHint** | **string**|  | [optional]
 **orgApacheFelixHttpsKeystoreKeyPassword** | **string**|  | [optional]
 **orgApacheFelixHttpsKeystoreKeyPasswordTypeHint** | **string**|  | [optional]
 **orgApacheFelixHttpsTruststore** | **string**|  | [optional]
 **orgApacheFelixHttpsTruststoreTypeHint** | **string**|  | [optional]
 **orgApacheFelixHttpsTruststorePassword** | **string**|  | [optional]
 **orgApacheFelixHttpsTruststorePasswordTypeHint** | **string**|  | [optional]
 **orgApacheFelixHttpsClientcertificate** | **string**|  | [optional]
 **orgApacheFelixHttpsClientcertificateTypeHint** | **string**|  | [optional]
 **orgApacheFelixHttpsEnable** | **bool**|  | [optional]
 **orgApacheFelixHttpsEnableTypeHint** | **string**|  | [optional]
 **orgOsgiServiceHttpPortSecure** | **string**|  | [optional]
 **orgOsgiServiceHttpPortSecureTypeHint** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postConfigApacheHttpComponentsProxyConfiguration**
> postConfigApacheHttpComponentsProxyConfiguration($proxyHost, $proxyHostTypeHint, $proxyPort, $proxyPortTypeHint, $proxyExceptions, $proxyExceptionsTypeHint, $proxyEnabled, $proxyEnabledTypeHint, $proxyUser, $proxyUserTypeHint, $proxyPassword, $proxyPasswordTypeHint)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#postConfigApacheHttpComponentsProxyConfiguration
     */
    public function postConfigApacheHttpComponentsProxyConfiguration(?string $proxyHost, ?string $proxyHostTypeHint, ?int $proxyPort, ?string $proxyPortTypeHint, ?array $proxyExceptions, ?string $proxyExceptionsTypeHint, ?bool $proxyEnabled, ?string $proxyEnabledTypeHint, ?string $proxyUser, ?string $proxyUserTypeHint, ?string $proxyPassword, ?string $proxyPasswordTypeHint, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyHost** | **string**|  | [optional]
 **proxyHostTypeHint** | **string**|  | [optional]
 **proxyPort** | **int**|  | [optional]
 **proxyPortTypeHint** | **string**|  | [optional]
 **proxyExceptions** | [**string**](../Model/string.md)|  | [optional]
 **proxyExceptionsTypeHint** | **string**|  | [optional]
 **proxyEnabled** | **bool**|  | [optional]
 **proxyEnabledTypeHint** | **string**|  | [optional]
 **proxyUser** | **string**|  | [optional]
 **proxyUserTypeHint** | **string**|  | [optional]
 **proxyPassword** | **string**|  | [optional]
 **proxyPasswordTypeHint** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postConfigApacheSlingDavExServlet**
> postConfigApacheSlingDavExServlet($alias, $aliasTypeHint, $davCreateAbsoluteUri, $davCreateAbsoluteUriTypeHint)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#postConfigApacheSlingDavExServlet
     */
    public function postConfigApacheSlingDavExServlet(?string $alias, ?string $aliasTypeHint, ?bool $davCreateAbsoluteUri, ?string $davCreateAbsoluteUriTypeHint, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **string**|  | [optional]
 **aliasTypeHint** | **string**|  | [optional]
 **davCreateAbsoluteUri** | **bool**|  | [optional]
 **davCreateAbsoluteUriTypeHint** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postConfigApacheSlingGetServlet**
> postConfigApacheSlingGetServlet($jsonMaximumresults, $jsonMaximumresultsTypeHint, $enableHtml, $enableHtmlTypeHint, $enableTxt, $enableTxtTypeHint, $enableXml, $enableXmlTypeHint)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#postConfigApacheSlingGetServlet
     */
    public function postConfigApacheSlingGetServlet(?string $jsonMaximumresults, ?string $jsonMaximumresultsTypeHint, ?bool $enableHtml, ?string $enableHtmlTypeHint, ?bool $enableTxt, ?string $enableTxtTypeHint, ?bool $enableXml, ?string $enableXmlTypeHint, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jsonMaximumresults** | **string**|  | [optional]
 **jsonMaximumresultsTypeHint** | **string**|  | [optional]
 **enableHtml** | **bool**|  | [optional]
 **enableHtmlTypeHint** | **string**|  | [optional]
 **enableTxt** | **bool**|  | [optional]
 **enableTxtTypeHint** | **string**|  | [optional]
 **enableXml** | **bool**|  | [optional]
 **enableXmlTypeHint** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postConfigApacheSlingReferrerFilter**
> postConfigApacheSlingReferrerFilter($allowEmpty, $allowEmptyTypeHint, $allowHosts, $allowHostsTypeHint, $allowHostsRegexp, $allowHostsRegexpTypeHint, $filterMethods, $filterMethodsTypeHint)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#postConfigApacheSlingReferrerFilter
     */
    public function postConfigApacheSlingReferrerFilter(?bool $allowEmpty, ?string $allowEmptyTypeHint, ?string $allowHosts, ?string $allowHostsTypeHint, ?string $allowHostsRegexp, ?string $allowHostsRegexpTypeHint, ?string $filterMethods, ?string $filterMethodsTypeHint, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allowEmpty** | **bool**|  | [optional]
 **allowEmptyTypeHint** | **string**|  | [optional]
 **allowHosts** | **string**|  | [optional]
 **allowHostsTypeHint** | **string**|  | [optional]
 **allowHostsRegexp** | **string**|  | [optional]
 **allowHostsRegexpTypeHint** | **string**|  | [optional]
 **filterMethods** | **string**|  | [optional]
 **filterMethodsTypeHint** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postConfigProperty**
> postConfigProperty($configNodeName)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#postConfigProperty
     */
    public function postConfigProperty(string $configNodeName, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **configNodeName** | **string**|  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postNode**
> postNode($path, $name, $operation, $deleteAuthorizable, $file)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#postNode
     */
    public function postNode(string $path, string $name, ?string $operation, ?string $deleteAuthorizable, ?UploadedFile $file, int &$responseCode, array &$responseHeaders): void
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
 **name** | **string**|  |
 **operation** | **string**|  | [optional]
 **deleteAuthorizable** | **string**|  | [optional]
 **file** | **UploadedFile****UploadedFile**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postNodeRw**
> postNodeRw($path, $name, $addMembers)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#postNodeRw
     */
    public function postNodeRw(string $path, string $name, ?string $addMembers, int &$responseCode, array &$responseHeaders): void
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
 **name** | **string**|  |
 **addMembers** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postPath**
> postPath($path, $jcrPrimaryType, $name)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#postPath
     */
    public function postPath(string $path, string $jcrPrimaryType, string $name, int &$responseCode, array &$responseHeaders): void
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
 **jcrPrimaryType** | **string**|  |
 **name** | **string**|  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postQuery**
> string postQuery($path, $pLimit, $_1property, $_1propertyValue)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#postQuery
     */
    public function postQuery(string $path, float $pLimit, string $_1property, string $_1propertyValue, int &$responseCode, array &$responseHeaders): array|object|null
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
 **pLimit** | **float**|  |
 **_1property** | **string**|  |
 **_1propertyValue** | **string**|  |

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postTreeActivation**
> postTreeActivation($ignoredeactivated, $onlymodified, $path, $cmd)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#postTreeActivation
     */
    public function postTreeActivation(bool $ignoredeactivated, bool $onlymodified, string $path, string $cmd, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **bool**|  |
 **onlymodified** | **bool**|  |
 **path** | **string**|  |
 **cmd** | **string**|  | [default to &#39;activate&#39;]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postTruststore**
> string postTruststore($operation, $newPassword, $rePassword, $keyStoreType, $removeAlias, $certificate)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#postTruststore
     */
    public function postTruststore(?string $operation, ?string $newPassword, ?string $rePassword, ?string $keyStoreType, ?string $removeAlias, ?UploadedFile $certificate, int &$responseCode, array &$responseHeaders): string
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operation** | **string**|  | [optional]
 **newPassword** | **string**|  | [optional]
 **rePassword** | **string**|  | [optional]
 **keyStoreType** | **string**|  | [optional]
 **removeAlias** | **string**|  | [optional]
 **certificate** | **UploadedFile****UploadedFile**|  | [optional]

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **postTruststorePKCS12**
> string postTruststorePKCS12($truststoreP12)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SlingApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SlingApiInterface;

class SlingApi implements SlingApiInterface
{

    // ...

    /**
     * Implementation of SlingApiInterface#postTruststorePKCS12
     */
    public function postTruststorePKCS12(?UploadedFile $truststoreP12, int &$responseCode, array &$responseHeaders): string
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststoreP12** | **UploadedFile****UploadedFile**|  | [optional]

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

