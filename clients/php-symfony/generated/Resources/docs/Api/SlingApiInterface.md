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
[**postTreeActivation**](SlingApiInterface.md#postTreeActivation) | **POST** /etc/replication/treeactivation.html | 
[**postTruststore**](SlingApiInterface.md#postTruststore) | **POST** /libs/granite/security/post/truststore | 
[**postTruststorePKCS12**](SlingApiInterface.md#postTruststorePKCS12) | **POST** /etc/truststore | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.sling:
        class: Acme\MyBundle\Api\SlingApi
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
    public function deleteAgent($runmode, $name)
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
    public function deleteNode($path, $name)
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
    public function getAgent($runmode, $name)
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
    public function getAgents($runmode)
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
    public function getAuthorizableKeystore($intermediatePath, $authorizableId)
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
    public function getKeystore($intermediatePath, $authorizableId)
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

[**UploadedFile**](../Model/UploadedFile.md)

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
    public function getNode($path, $name)
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
    public function getPackage($group, $name, $version)
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

[**UploadedFile**](../Model/UploadedFile.md)

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
    public function getPackageFilter($group, $name, $version)
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
    public function getQuery($path, $pLimit, $_1property, $_1propertyValue)
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
    public function getTruststore()
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UploadedFile**](../Model/UploadedFile.md)

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
    public function getTruststoreInfo()
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
> postAgent($runmode, $name, $jcrcontentCqdistribute, $jcrcontentCqdistributeTypeHint, $jcrcontentCqname, $jcrcontentCqtemplate, $jcrcontentEnabled, $jcrcontentJcrdescription, $jcrcontentJcrlastModified, $jcrcontentJcrlastModifiedBy, $jcrcontentJcrmixinTypes, $jcrcontentJcrtitle, $jcrcontentLogLevel, $jcrcontentNoStatusUpdate, $jcrcontentNoVersioning, $jcrcontentProtocolConnectTimeout, $jcrcontentProtocolHTTPConnectionClosed, $jcrcontentProtocolHTTPExpired, $jcrcontentProtocolHTTPHeaders, $jcrcontentProtocolHTTPHeadersTypeHint, $jcrcontentProtocolHTTPMethod, $jcrcontentProtocolHTTPSRelaxed, $jcrcontentProtocolInterface, $jcrcontentProtocolSocketTimeout, $jcrcontentProtocolVersion, $jcrcontentProxyNTLMDomain, $jcrcontentProxyNTLMHost, $jcrcontentProxyHost, $jcrcontentProxyPassword, $jcrcontentProxyPort, $jcrcontentProxyUser, $jcrcontentQueueBatchMaxSize, $jcrcontentQueueBatchMode, $jcrcontentQueueBatchWaitTime, $jcrcontentRetryDelay, $jcrcontentReverseReplication, $jcrcontentSerializationType, $jcrcontentSlingresourceType, $jcrcontentSsl, $jcrcontentTransportNTLMDomain, $jcrcontentTransportNTLMHost, $jcrcontentTransportPassword, $jcrcontentTransportUri, $jcrcontentTransportUser, $jcrcontentTriggerDistribute, $jcrcontentTriggerModified, $jcrcontentTriggerOnOffTime, $jcrcontentTriggerReceive, $jcrcontentTriggerSpecific, $jcrcontentUserId, $jcrprimaryType, $operation)



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
    public function postAgent($runmode, $name, $jcrcontentCqdistribute = null, $jcrcontentCqdistributeTypeHint = null, $jcrcontentCqname = null, $jcrcontentCqtemplate = null, $jcrcontentEnabled = null, $jcrcontentJcrdescription = null, $jcrcontentJcrlastModified = null, $jcrcontentJcrlastModifiedBy = null, $jcrcontentJcrmixinTypes = null, $jcrcontentJcrtitle = null, $jcrcontentLogLevel = null, $jcrcontentNoStatusUpdate = null, $jcrcontentNoVersioning = null, $jcrcontentProtocolConnectTimeout = null, $jcrcontentProtocolHTTPConnectionClosed = null, $jcrcontentProtocolHTTPExpired = null, array $jcrcontentProtocolHTTPHeaders = null, $jcrcontentProtocolHTTPHeadersTypeHint = null, $jcrcontentProtocolHTTPMethod = null, $jcrcontentProtocolHTTPSRelaxed = null, $jcrcontentProtocolInterface = null, $jcrcontentProtocolSocketTimeout = null, $jcrcontentProtocolVersion = null, $jcrcontentProxyNTLMDomain = null, $jcrcontentProxyNTLMHost = null, $jcrcontentProxyHost = null, $jcrcontentProxyPassword = null, $jcrcontentProxyPort = null, $jcrcontentProxyUser = null, $jcrcontentQueueBatchMaxSize = null, $jcrcontentQueueBatchMode = null, $jcrcontentQueueBatchWaitTime = null, $jcrcontentRetryDelay = null, $jcrcontentReverseReplication = null, $jcrcontentSerializationType = null, $jcrcontentSlingresourceType = null, $jcrcontentSsl = null, $jcrcontentTransportNTLMDomain = null, $jcrcontentTransportNTLMHost = null, $jcrcontentTransportPassword = null, $jcrcontentTransportUri = null, $jcrcontentTransportUser = null, $jcrcontentTriggerDistribute = null, $jcrcontentTriggerModified = null, $jcrcontentTriggerOnOffTime = null, $jcrcontentTriggerReceive = null, $jcrcontentTriggerSpecific = null, $jcrcontentUserId = null, $jcrprimaryType = null, $operation = null)
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
 **jcrcontentCqdistribute** | **bool**|  | [optional]
 **jcrcontentCqdistributeTypeHint** | **string**|  | [optional]
 **jcrcontentCqname** | **string**|  | [optional]
 **jcrcontentCqtemplate** | **string**|  | [optional]
 **jcrcontentEnabled** | **bool**|  | [optional]
 **jcrcontentJcrdescription** | **string**|  | [optional]
 **jcrcontentJcrlastModified** | **string**|  | [optional]
 **jcrcontentJcrlastModifiedBy** | **string**|  | [optional]
 **jcrcontentJcrmixinTypes** | **string**|  | [optional]
 **jcrcontentJcrtitle** | **string**|  | [optional]
 **jcrcontentLogLevel** | **string**|  | [optional]
 **jcrcontentNoStatusUpdate** | **bool**|  | [optional]
 **jcrcontentNoVersioning** | **bool**|  | [optional]
 **jcrcontentProtocolConnectTimeout** | **float**|  | [optional]
 **jcrcontentProtocolHTTPConnectionClosed** | **bool**|  | [optional]
 **jcrcontentProtocolHTTPExpired** | **string**|  | [optional]
 **jcrcontentProtocolHTTPHeaders** | [**string**](../Model/string.md)|  | [optional]
 **jcrcontentProtocolHTTPHeadersTypeHint** | **string**|  | [optional]
 **jcrcontentProtocolHTTPMethod** | **string**|  | [optional]
 **jcrcontentProtocolHTTPSRelaxed** | **bool**|  | [optional]
 **jcrcontentProtocolInterface** | **string**|  | [optional]
 **jcrcontentProtocolSocketTimeout** | **float**|  | [optional]
 **jcrcontentProtocolVersion** | **string**|  | [optional]
 **jcrcontentProxyNTLMDomain** | **string**|  | [optional]
 **jcrcontentProxyNTLMHost** | **string**|  | [optional]
 **jcrcontentProxyHost** | **string**|  | [optional]
 **jcrcontentProxyPassword** | **string**|  | [optional]
 **jcrcontentProxyPort** | **float**|  | [optional]
 **jcrcontentProxyUser** | **string**|  | [optional]
 **jcrcontentQueueBatchMaxSize** | **float**|  | [optional]
 **jcrcontentQueueBatchMode** | **string**|  | [optional]
 **jcrcontentQueueBatchWaitTime** | **float**|  | [optional]
 **jcrcontentRetryDelay** | **string**|  | [optional]
 **jcrcontentReverseReplication** | **bool**|  | [optional]
 **jcrcontentSerializationType** | **string**|  | [optional]
 **jcrcontentSlingresourceType** | **string**|  | [optional]
 **jcrcontentSsl** | **string**|  | [optional]
 **jcrcontentTransportNTLMDomain** | **string**|  | [optional]
 **jcrcontentTransportNTLMHost** | **string**|  | [optional]
 **jcrcontentTransportPassword** | **string**|  | [optional]
 **jcrcontentTransportUri** | **string**|  | [optional]
 **jcrcontentTransportUser** | **string**|  | [optional]
 **jcrcontentTriggerDistribute** | **bool**|  | [optional]
 **jcrcontentTriggerModified** | **bool**|  | [optional]
 **jcrcontentTriggerOnOffTime** | **bool**|  | [optional]
 **jcrcontentTriggerReceive** | **bool**|  | [optional]
 **jcrcontentTriggerSpecific** | **bool**|  | [optional]
 **jcrcontentUserId** | **string**|  | [optional]
 **jcrprimaryType** | **string**|  | [optional]
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
    public function postAuthorizableKeystore($intermediatePath, $authorizableId, $operation = null, $currentPassword = null, $newPassword = null, $rePassword = null, $keyPassword = null, $keyStorePass = null, $alias = null, $newAlias = null, $removeAlias = null, UploadedFile $certChain = null, UploadedFile $pk = null, UploadedFile $keyStore = null)
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
> string postAuthorizables($authorizableId, $intermediatePath, $createUser, $createGroup, $reppassword, $profileGivenName)



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
    public function postAuthorizables($authorizableId, $intermediatePath, $createUser = null, $createGroup = null, $reppassword = null, $profileGivenName = null)
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
 **reppassword** | **string**|  | [optional]
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
    public function postConfigAdobeGraniteSamlAuthenticationHandler($keyStorePassword = null, $keyStorePasswordTypeHint = null, $serviceRanking = null, $serviceRankingTypeHint = null, $idpHttpRedirect = null, $idpHttpRedirectTypeHint = null, $createUser = null, $createUserTypeHint = null, $defaultRedirectUrl = null, $defaultRedirectUrlTypeHint = null, $userIDAttribute = null, $userIDAttributeTypeHint = null, array $defaultGroups = null, $defaultGroupsTypeHint = null, $idpCertAlias = null, $idpCertAliasTypeHint = null, $addGroupMemberships = null, $addGroupMembershipsTypeHint = null, array $path = null, $pathTypeHint = null, array $synchronizeAttributes = null, $synchronizeAttributesTypeHint = null, $clockTolerance = null, $clockToleranceTypeHint = null, $groupMembershipAttribute = null, $groupMembershipAttributeTypeHint = null, $idpUrl = null, $idpUrlTypeHint = null, $logoutUrl = null, $logoutUrlTypeHint = null, $serviceProviderEntityId = null, $serviceProviderEntityIdTypeHint = null, $assertionConsumerServiceURL = null, $assertionConsumerServiceURLTypeHint = null, $handleLogout = null, $handleLogoutTypeHint = null, $spPrivateKeyAlias = null, $spPrivateKeyAliasTypeHint = null, $useEncryption = null, $useEncryptionTypeHint = null, $nameIdFormat = null, $nameIdFormatTypeHint = null, $digestMethod = null, $digestMethodTypeHint = null, $signatureMethod = null, $signatureMethodTypeHint = null, $userIntermediatePath = null, $userIntermediatePathTypeHint = null)
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
    public function postConfigApacheFelixJettyBasedHttpService($orgApacheFelixHttpsNio = null, $orgApacheFelixHttpsNioTypeHint = null, $orgApacheFelixHttpsKeystore = null, $orgApacheFelixHttpsKeystoreTypeHint = null, $orgApacheFelixHttpsKeystorePassword = null, $orgApacheFelixHttpsKeystorePasswordTypeHint = null, $orgApacheFelixHttpsKeystoreKey = null, $orgApacheFelixHttpsKeystoreKeyTypeHint = null, $orgApacheFelixHttpsKeystoreKeyPassword = null, $orgApacheFelixHttpsKeystoreKeyPasswordTypeHint = null, $orgApacheFelixHttpsTruststore = null, $orgApacheFelixHttpsTruststoreTypeHint = null, $orgApacheFelixHttpsTruststorePassword = null, $orgApacheFelixHttpsTruststorePasswordTypeHint = null, $orgApacheFelixHttpsClientcertificate = null, $orgApacheFelixHttpsClientcertificateTypeHint = null, $orgApacheFelixHttpsEnable = null, $orgApacheFelixHttpsEnableTypeHint = null, $orgOsgiServiceHttpPortSecure = null, $orgOsgiServiceHttpPortSecureTypeHint = null)
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
    public function postConfigApacheHttpComponentsProxyConfiguration($proxyHost = null, $proxyHostTypeHint = null, $proxyPort = null, $proxyPortTypeHint = null, array $proxyExceptions = null, $proxyExceptionsTypeHint = null, $proxyEnabled = null, $proxyEnabledTypeHint = null, $proxyUser = null, $proxyUserTypeHint = null, $proxyPassword = null, $proxyPasswordTypeHint = null)
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
    public function postConfigApacheSlingDavExServlet($alias = null, $aliasTypeHint = null, $davCreateAbsoluteUri = null, $davCreateAbsoluteUriTypeHint = null)
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
    public function postConfigApacheSlingGetServlet($jsonMaximumresults = null, $jsonMaximumresultsTypeHint = null, $enableHtml = null, $enableHtmlTypeHint = null, $enableTxt = null, $enableTxtTypeHint = null, $enableXml = null, $enableXmlTypeHint = null)
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
    public function postConfigApacheSlingReferrerFilter($allowEmpty = null, $allowEmptyTypeHint = null, $allowHosts = null, $allowHostsTypeHint = null, $allowHostsRegexp = null, $allowHostsRegexpTypeHint = null, $filterMethods = null, $filterMethodsTypeHint = null)
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
    public function postConfigProperty($configNodeName)
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
    public function postNode($path, $name, $operation = null, $deleteAuthorizable = null, UploadedFile $file = null)
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
    public function postNodeRw($path, $name, $addMembers = null)
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
> postPath($path, $jcrprimaryType, $name)



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
    public function postPath($path, $jcrprimaryType, $name)
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
 **jcrprimaryType** | **string**|  |
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
    public function postQuery($path, $pLimit, $_1property, $_1propertyValue)
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
> postTreeActivation($ignoredeactivated, $onlymodified, $path)



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
    public function postTreeActivation($ignoredeactivated, $onlymodified, $path)
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
    public function postTruststore($operation = null, $newPassword = null, $rePassword = null, $keyStoreType = null, $removeAlias = null, UploadedFile $certificate = null)
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
    public function postTruststorePKCS12(UploadedFile $truststoreP12 = null)
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

