# OpenAPI\Client\SlingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAgent**](SlingApi.md#deleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**deleteNode**](SlingApi.md#deleteNode) | **DELETE** /{path}/{name} | 
[**getAgent**](SlingApi.md#getAgent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**getAgents**](SlingApi.md#getAgents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**getAuthorizableKeystore**](SlingApi.md#getAuthorizableKeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**getKeystore**](SlingApi.md#getKeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**getNode**](SlingApi.md#getNode) | **GET** /{path}/{name} | 
[**getPackage**](SlingApi.md#getPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**getPackageFilter**](SlingApi.md#getPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**getQuery**](SlingApi.md#getQuery) | **GET** /bin/querybuilder.json | 
[**getTruststore**](SlingApi.md#getTruststore) | **GET** /etc/truststore/truststore.p12 | 
[**getTruststoreInfo**](SlingApi.md#getTruststoreInfo) | **GET** /libs/granite/security/truststore.json | 
[**postAgent**](SlingApi.md#postAgent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**postAuthorizableKeystore**](SlingApi.md#postAuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**postAuthorizables**](SlingApi.md#postAuthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**postConfigAdobeGraniteSamlAuthenticationHandler**](SlingApi.md#postConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**postConfigApacheFelixJettyBasedHttpService**](SlingApi.md#postConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http | 
[**postConfigApacheHttpComponentsProxyConfiguration**](SlingApi.md#postConfigApacheHttpComponentsProxyConfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**postConfigApacheSlingDavExServlet**](SlingApi.md#postConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**postConfigApacheSlingGetServlet**](SlingApi.md#postConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**postConfigApacheSlingReferrerFilter**](SlingApi.md#postConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**postNode**](SlingApi.md#postNode) | **POST** /{path}/{name} | 
[**postNodeRw**](SlingApi.md#postNodeRw) | **POST** /{path}/{name}.rw.html | 
[**postPath**](SlingApi.md#postPath) | **POST** /{path}/ | 
[**postQuery**](SlingApi.md#postQuery) | **POST** /bin/querybuilder.json | 
[**postTreeActivation**](SlingApi.md#postTreeActivation) | **POST** /etc/replication/treeactivation.html | 
[**postTruststore**](SlingApi.md#postTruststore) | **POST** /libs/granite/security/post/truststore | 
[**postTruststorePKCS12**](SlingApi.md#postTruststorePKCS12) | **POST** /etc/truststore | 


# **deleteAgent**
> deleteAgent($runmode, $name)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$runmode = 'runmode_example'; // string | 
$name = 'name_example'; // string | 

try {
    $apiInstance->deleteAgent($runmode, $name);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->deleteAgent: ', $e->getMessage(), PHP_EOL;
}
?>
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

# **deleteNode**
> deleteNode($path, $name)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$path = 'path_example'; // string | 
$name = 'name_example'; // string | 

try {
    $apiInstance->deleteNode($path, $name);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->deleteNode: ', $e->getMessage(), PHP_EOL;
}
?>
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

# **getAgent**
> getAgent($runmode, $name)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$runmode = 'runmode_example'; // string | 
$name = 'name_example'; // string | 

try {
    $apiInstance->getAgent($runmode, $name);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->getAgent: ', $e->getMessage(), PHP_EOL;
}
?>
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

# **getAgents**
> string getAgents($runmode)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$runmode = 'runmode_example'; // string | 

try {
    $result = $apiInstance->getAgents($runmode);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->getAgents: ', $e->getMessage(), PHP_EOL;
}
?>
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

# **getAuthorizableKeystore**
> \OpenAPI\Client\Model\KeystoreInfo getAuthorizableKeystore($intermediate_path, $authorizable_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$intermediate_path = 'intermediate_path_example'; // string | 
$authorizable_id = 'authorizable_id_example'; // string | 

try {
    $result = $apiInstance->getAuthorizableKeystore($intermediate_path, $authorizable_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->getAuthorizableKeystore: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate_path** | **string**|  |
 **authorizable_id** | **string**|  |

### Return type

[**\OpenAPI\Client\Model\KeystoreInfo**](../Model/KeystoreInfo.md)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getKeystore**
> \SplFileObject getKeystore($intermediate_path, $authorizable_id)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$intermediate_path = 'intermediate_path_example'; // string | 
$authorizable_id = 'authorizable_id_example'; // string | 

try {
    $result = $apiInstance->getKeystore($intermediate_path, $authorizable_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->getKeystore: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate_path** | **string**|  |
 **authorizable_id** | **string**|  |

### Return type

[**\SplFileObject**](../Model/\SplFileObject.md)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getNode**
> getNode($path, $name)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$path = 'path_example'; // string | 
$name = 'name_example'; // string | 

try {
    $apiInstance->getNode($path, $name);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->getNode: ', $e->getMessage(), PHP_EOL;
}
?>
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

# **getPackage**
> \SplFileObject getPackage($group, $name, $version)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$group = 'group_example'; // string | 
$name = 'name_example'; // string | 
$version = 'version_example'; // string | 

try {
    $result = $apiInstance->getPackage($group, $name, $version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->getPackage: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **string**|  |
 **name** | **string**|  |
 **version** | **string**|  |

### Return type

[**\SplFileObject**](../Model/\SplFileObject.md)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPackageFilter**
> string getPackageFilter($group, $name, $version)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$group = 'group_example'; // string | 
$name = 'name_example'; // string | 
$version = 'version_example'; // string | 

try {
    $result = $apiInstance->getPackageFilter($group, $name, $version);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->getPackageFilter: ', $e->getMessage(), PHP_EOL;
}
?>
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

# **getQuery**
> string getQuery($path, $p_limit, $_1_property, $_1_property_value)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$path = 'path_example'; // string | 
$p_limit = 3.4; // float | 
$_1_property = '_1_property_example'; // string | 
$_1_property_value = '_1_property_value_example'; // string | 

try {
    $result = $apiInstance->getQuery($path, $p_limit, $_1_property, $_1_property_value);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->getQuery: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string**|  |
 **p_limit** | **float**|  |
 **_1_property** | **string**|  |
 **_1_property_value** | **string**|  |

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getTruststore**
> \SplFileObject getTruststore()



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->getTruststore();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->getTruststore: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\SplFileObject**](../Model/\SplFileObject.md)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getTruststoreInfo**
> \OpenAPI\Client\Model\TruststoreInfo getTruststoreInfo()



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->getTruststoreInfo();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->getTruststoreInfo: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\TruststoreInfo**](../Model/TruststoreInfo.md)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **postAgent**
> postAgent($runmode, $name, $jcrcontentcqdistribute, $jcrcontentcqdistribute_type_hint, $jcrcontentcqname, $jcrcontentcqtemplate, $jcrcontentenabled, $jcrcontentjcrdescription, $jcrcontentjcrlast_modified, $jcrcontentjcrlast_modified_by, $jcrcontentjcrmixin_types, $jcrcontentjcrtitle, $jcrcontentlog_level, $jcrcontentno_status_update, $jcrcontentno_versioning, $jcrcontentprotocol_connect_timeout, $jcrcontentprotocol_http_connection_closed, $jcrcontentprotocol_http_expired, $jcrcontentprotocol_http_headers, $jcrcontentprotocol_http_headers_type_hint, $jcrcontentprotocol_http_method, $jcrcontentprotocol_https_relaxed, $jcrcontentprotocol_interface, $jcrcontentprotocol_socket_timeout, $jcrcontentprotocol_version, $jcrcontentproxy_ntlm_domain, $jcrcontentproxy_ntlm_host, $jcrcontentproxy_host, $jcrcontentproxy_password, $jcrcontentproxy_port, $jcrcontentproxy_user, $jcrcontentqueue_batch_max_size, $jcrcontentqueue_batch_mode, $jcrcontentqueue_batch_wait_time, $jcrcontentretry_delay, $jcrcontentreverse_replication, $jcrcontentserialization_type, $jcrcontentslingresource_type, $jcrcontentssl, $jcrcontenttransport_ntlm_domain, $jcrcontenttransport_ntlm_host, $jcrcontenttransport_password, $jcrcontenttransport_uri, $jcrcontenttransport_user, $jcrcontenttrigger_distribute, $jcrcontenttrigger_modified, $jcrcontenttrigger_on_off_time, $jcrcontenttrigger_receive, $jcrcontenttrigger_specific, $jcrcontentuser_id, $jcrprimary_type, $operation)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$runmode = 'runmode_example'; // string | 
$name = 'name_example'; // string | 
$jcrcontentcqdistribute = True; // bool | 
$jcrcontentcqdistribute_type_hint = 'jcrcontentcqdistribute_type_hint_example'; // string | 
$jcrcontentcqname = 'jcrcontentcqname_example'; // string | 
$jcrcontentcqtemplate = 'jcrcontentcqtemplate_example'; // string | 
$jcrcontentenabled = True; // bool | 
$jcrcontentjcrdescription = 'jcrcontentjcrdescription_example'; // string | 
$jcrcontentjcrlast_modified = 'jcrcontentjcrlast_modified_example'; // string | 
$jcrcontentjcrlast_modified_by = 'jcrcontentjcrlast_modified_by_example'; // string | 
$jcrcontentjcrmixin_types = 'jcrcontentjcrmixin_types_example'; // string | 
$jcrcontentjcrtitle = 'jcrcontentjcrtitle_example'; // string | 
$jcrcontentlog_level = 'jcrcontentlog_level_example'; // string | 
$jcrcontentno_status_update = True; // bool | 
$jcrcontentno_versioning = True; // bool | 
$jcrcontentprotocol_connect_timeout = 3.4; // float | 
$jcrcontentprotocol_http_connection_closed = True; // bool | 
$jcrcontentprotocol_http_expired = 'jcrcontentprotocol_http_expired_example'; // string | 
$jcrcontentprotocol_http_headers = array('jcrcontentprotocol_http_headers_example'); // string[] | 
$jcrcontentprotocol_http_headers_type_hint = 'jcrcontentprotocol_http_headers_type_hint_example'; // string | 
$jcrcontentprotocol_http_method = 'jcrcontentprotocol_http_method_example'; // string | 
$jcrcontentprotocol_https_relaxed = True; // bool | 
$jcrcontentprotocol_interface = 'jcrcontentprotocol_interface_example'; // string | 
$jcrcontentprotocol_socket_timeout = 3.4; // float | 
$jcrcontentprotocol_version = 'jcrcontentprotocol_version_example'; // string | 
$jcrcontentproxy_ntlm_domain = 'jcrcontentproxy_ntlm_domain_example'; // string | 
$jcrcontentproxy_ntlm_host = 'jcrcontentproxy_ntlm_host_example'; // string | 
$jcrcontentproxy_host = 'jcrcontentproxy_host_example'; // string | 
$jcrcontentproxy_password = 'jcrcontentproxy_password_example'; // string | 
$jcrcontentproxy_port = 3.4; // float | 
$jcrcontentproxy_user = 'jcrcontentproxy_user_example'; // string | 
$jcrcontentqueue_batch_max_size = 3.4; // float | 
$jcrcontentqueue_batch_mode = 'jcrcontentqueue_batch_mode_example'; // string | 
$jcrcontentqueue_batch_wait_time = 3.4; // float | 
$jcrcontentretry_delay = 'jcrcontentretry_delay_example'; // string | 
$jcrcontentreverse_replication = True; // bool | 
$jcrcontentserialization_type = 'jcrcontentserialization_type_example'; // string | 
$jcrcontentslingresource_type = 'jcrcontentslingresource_type_example'; // string | 
$jcrcontentssl = 'jcrcontentssl_example'; // string | 
$jcrcontenttransport_ntlm_domain = 'jcrcontenttransport_ntlm_domain_example'; // string | 
$jcrcontenttransport_ntlm_host = 'jcrcontenttransport_ntlm_host_example'; // string | 
$jcrcontenttransport_password = 'jcrcontenttransport_password_example'; // string | 
$jcrcontenttransport_uri = 'jcrcontenttransport_uri_example'; // string | 
$jcrcontenttransport_user = 'jcrcontenttransport_user_example'; // string | 
$jcrcontenttrigger_distribute = True; // bool | 
$jcrcontenttrigger_modified = True; // bool | 
$jcrcontenttrigger_on_off_time = True; // bool | 
$jcrcontenttrigger_receive = True; // bool | 
$jcrcontenttrigger_specific = True; // bool | 
$jcrcontentuser_id = 'jcrcontentuser_id_example'; // string | 
$jcrprimary_type = 'jcrprimary_type_example'; // string | 
$operation = 'operation_example'; // string | 

try {
    $apiInstance->postAgent($runmode, $name, $jcrcontentcqdistribute, $jcrcontentcqdistribute_type_hint, $jcrcontentcqname, $jcrcontentcqtemplate, $jcrcontentenabled, $jcrcontentjcrdescription, $jcrcontentjcrlast_modified, $jcrcontentjcrlast_modified_by, $jcrcontentjcrmixin_types, $jcrcontentjcrtitle, $jcrcontentlog_level, $jcrcontentno_status_update, $jcrcontentno_versioning, $jcrcontentprotocol_connect_timeout, $jcrcontentprotocol_http_connection_closed, $jcrcontentprotocol_http_expired, $jcrcontentprotocol_http_headers, $jcrcontentprotocol_http_headers_type_hint, $jcrcontentprotocol_http_method, $jcrcontentprotocol_https_relaxed, $jcrcontentprotocol_interface, $jcrcontentprotocol_socket_timeout, $jcrcontentprotocol_version, $jcrcontentproxy_ntlm_domain, $jcrcontentproxy_ntlm_host, $jcrcontentproxy_host, $jcrcontentproxy_password, $jcrcontentproxy_port, $jcrcontentproxy_user, $jcrcontentqueue_batch_max_size, $jcrcontentqueue_batch_mode, $jcrcontentqueue_batch_wait_time, $jcrcontentretry_delay, $jcrcontentreverse_replication, $jcrcontentserialization_type, $jcrcontentslingresource_type, $jcrcontentssl, $jcrcontenttransport_ntlm_domain, $jcrcontenttransport_ntlm_host, $jcrcontenttransport_password, $jcrcontenttransport_uri, $jcrcontenttransport_user, $jcrcontenttrigger_distribute, $jcrcontenttrigger_modified, $jcrcontenttrigger_on_off_time, $jcrcontenttrigger_receive, $jcrcontenttrigger_specific, $jcrcontentuser_id, $jcrprimary_type, $operation);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->postAgent: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **string**|  |
 **name** | **string**|  |
 **jcrcontentcqdistribute** | **bool**|  | [optional]
 **jcrcontentcqdistribute_type_hint** | **string**|  | [optional]
 **jcrcontentcqname** | **string**|  | [optional]
 **jcrcontentcqtemplate** | **string**|  | [optional]
 **jcrcontentenabled** | **bool**|  | [optional]
 **jcrcontentjcrdescription** | **string**|  | [optional]
 **jcrcontentjcrlast_modified** | **string**|  | [optional]
 **jcrcontentjcrlast_modified_by** | **string**|  | [optional]
 **jcrcontentjcrmixin_types** | **string**|  | [optional]
 **jcrcontentjcrtitle** | **string**|  | [optional]
 **jcrcontentlog_level** | **string**|  | [optional]
 **jcrcontentno_status_update** | **bool**|  | [optional]
 **jcrcontentno_versioning** | **bool**|  | [optional]
 **jcrcontentprotocol_connect_timeout** | **float**|  | [optional]
 **jcrcontentprotocol_http_connection_closed** | **bool**|  | [optional]
 **jcrcontentprotocol_http_expired** | **string**|  | [optional]
 **jcrcontentprotocol_http_headers** | [**string[]**](../Model/string.md)|  | [optional]
 **jcrcontentprotocol_http_headers_type_hint** | **string**|  | [optional]
 **jcrcontentprotocol_http_method** | **string**|  | [optional]
 **jcrcontentprotocol_https_relaxed** | **bool**|  | [optional]
 **jcrcontentprotocol_interface** | **string**|  | [optional]
 **jcrcontentprotocol_socket_timeout** | **float**|  | [optional]
 **jcrcontentprotocol_version** | **string**|  | [optional]
 **jcrcontentproxy_ntlm_domain** | **string**|  | [optional]
 **jcrcontentproxy_ntlm_host** | **string**|  | [optional]
 **jcrcontentproxy_host** | **string**|  | [optional]
 **jcrcontentproxy_password** | **string**|  | [optional]
 **jcrcontentproxy_port** | **float**|  | [optional]
 **jcrcontentproxy_user** | **string**|  | [optional]
 **jcrcontentqueue_batch_max_size** | **float**|  | [optional]
 **jcrcontentqueue_batch_mode** | **string**|  | [optional]
 **jcrcontentqueue_batch_wait_time** | **float**|  | [optional]
 **jcrcontentretry_delay** | **string**|  | [optional]
 **jcrcontentreverse_replication** | **bool**|  | [optional]
 **jcrcontentserialization_type** | **string**|  | [optional]
 **jcrcontentslingresource_type** | **string**|  | [optional]
 **jcrcontentssl** | **string**|  | [optional]
 **jcrcontenttransport_ntlm_domain** | **string**|  | [optional]
 **jcrcontenttransport_ntlm_host** | **string**|  | [optional]
 **jcrcontenttransport_password** | **string**|  | [optional]
 **jcrcontenttransport_uri** | **string**|  | [optional]
 **jcrcontenttransport_user** | **string**|  | [optional]
 **jcrcontenttrigger_distribute** | **bool**|  | [optional]
 **jcrcontenttrigger_modified** | **bool**|  | [optional]
 **jcrcontenttrigger_on_off_time** | **bool**|  | [optional]
 **jcrcontenttrigger_receive** | **bool**|  | [optional]
 **jcrcontenttrigger_specific** | **bool**|  | [optional]
 **jcrcontentuser_id** | **string**|  | [optional]
 **jcrprimary_type** | **string**|  | [optional]
 **operation** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **postAuthorizableKeystore**
> \OpenAPI\Client\Model\KeystoreInfo postAuthorizableKeystore($intermediate_path, $authorizable_id, $operation, $current_password, $new_password, $re_password, $key_password, $key_store_pass, $alias, $new_alias, $remove_alias, $cert_chain, $pk, $key_store)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$intermediate_path = 'intermediate_path_example'; // string | 
$authorizable_id = 'authorizable_id_example'; // string | 
$operation = 'operation_example'; // string | 
$current_password = 'current_password_example'; // string | 
$new_password = 'new_password_example'; // string | 
$re_password = 're_password_example'; // string | 
$key_password = 'key_password_example'; // string | 
$key_store_pass = 'key_store_pass_example'; // string | 
$alias = 'alias_example'; // string | 
$new_alias = 'new_alias_example'; // string | 
$remove_alias = 'remove_alias_example'; // string | 
$cert_chain = "/path/to/file.txt"; // \SplFileObject | 
$pk = "/path/to/file.txt"; // \SplFileObject | 
$key_store = "/path/to/file.txt"; // \SplFileObject | 

try {
    $result = $apiInstance->postAuthorizableKeystore($intermediate_path, $authorizable_id, $operation, $current_password, $new_password, $re_password, $key_password, $key_store_pass, $alias, $new_alias, $remove_alias, $cert_chain, $pk, $key_store);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->postAuthorizableKeystore: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate_path** | **string**|  |
 **authorizable_id** | **string**|  |
 **operation** | **string**|  | [optional]
 **current_password** | **string**|  | [optional]
 **new_password** | **string**|  | [optional]
 **re_password** | **string**|  | [optional]
 **key_password** | **string**|  | [optional]
 **key_store_pass** | **string**|  | [optional]
 **alias** | **string**|  | [optional]
 **new_alias** | **string**|  | [optional]
 **remove_alias** | **string**|  | [optional]
 **cert_chain** | **\SplFileObject****\SplFileObject**|  | [optional]
 **pk** | **\SplFileObject****\SplFileObject**|  | [optional]
 **key_store** | **\SplFileObject****\SplFileObject**|  | [optional]

### Return type

[**\OpenAPI\Client\Model\KeystoreInfo**](../Model/KeystoreInfo.md)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **postAuthorizables**
> string postAuthorizables($authorizable_id, $intermediate_path, $create_user, $create_group, $reppassword, $profilegiven_name)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$authorizable_id = 'authorizable_id_example'; // string | 
$intermediate_path = 'intermediate_path_example'; // string | 
$create_user = 'create_user_example'; // string | 
$create_group = 'create_group_example'; // string | 
$reppassword = 'reppassword_example'; // string | 
$profilegiven_name = 'profilegiven_name_example'; // string | 

try {
    $result = $apiInstance->postAuthorizables($authorizable_id, $intermediate_path, $create_user, $create_group, $reppassword, $profilegiven_name);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->postAuthorizables: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizable_id** | **string**|  |
 **intermediate_path** | **string**|  |
 **create_user** | **string**|  | [optional]
 **create_group** | **string**|  | [optional]
 **reppassword** | **string**|  | [optional]
 **profilegiven_name** | **string**|  | [optional]

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **postConfigAdobeGraniteSamlAuthenticationHandler**
> postConfigAdobeGraniteSamlAuthenticationHandler($key_store_password, $key_store_password_type_hint, $service_ranking, $service_ranking_type_hint, $idp_http_redirect, $idp_http_redirect_type_hint, $create_user, $create_user_type_hint, $default_redirect_url, $default_redirect_url_type_hint, $user_id_attribute, $user_id_attribute_type_hint, $default_groups, $default_groups_type_hint, $idp_cert_alias, $idp_cert_alias_type_hint, $add_group_memberships, $add_group_memberships_type_hint, $path, $path_type_hint, $synchronize_attributes, $synchronize_attributes_type_hint, $clock_tolerance, $clock_tolerance_type_hint, $group_membership_attribute, $group_membership_attribute_type_hint, $idp_url, $idp_url_type_hint, $logout_url, $logout_url_type_hint, $service_provider_entity_id, $service_provider_entity_id_type_hint, $assertion_consumer_service_url, $assertion_consumer_service_url_type_hint, $handle_logout, $handle_logout_type_hint, $sp_private_key_alias, $sp_private_key_alias_type_hint, $use_encryption, $use_encryption_type_hint, $name_id_format, $name_id_format_type_hint, $digest_method, $digest_method_type_hint, $signature_method, $signature_method_type_hint, $user_intermediate_path, $user_intermediate_path_type_hint)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$key_store_password = 'key_store_password_example'; // string | 
$key_store_password_type_hint = 'key_store_password_type_hint_example'; // string | 
$service_ranking = 56; // int | 
$service_ranking_type_hint = 'service_ranking_type_hint_example'; // string | 
$idp_http_redirect = True; // bool | 
$idp_http_redirect_type_hint = 'idp_http_redirect_type_hint_example'; // string | 
$create_user = True; // bool | 
$create_user_type_hint = 'create_user_type_hint_example'; // string | 
$default_redirect_url = 'default_redirect_url_example'; // string | 
$default_redirect_url_type_hint = 'default_redirect_url_type_hint_example'; // string | 
$user_id_attribute = 'user_id_attribute_example'; // string | 
$user_id_attribute_type_hint = 'user_id_attribute_type_hint_example'; // string | 
$default_groups = array('default_groups_example'); // string[] | 
$default_groups_type_hint = 'default_groups_type_hint_example'; // string | 
$idp_cert_alias = 'idp_cert_alias_example'; // string | 
$idp_cert_alias_type_hint = 'idp_cert_alias_type_hint_example'; // string | 
$add_group_memberships = True; // bool | 
$add_group_memberships_type_hint = 'add_group_memberships_type_hint_example'; // string | 
$path = array('path_example'); // string[] | 
$path_type_hint = 'path_type_hint_example'; // string | 
$synchronize_attributes = array('synchronize_attributes_example'); // string[] | 
$synchronize_attributes_type_hint = 'synchronize_attributes_type_hint_example'; // string | 
$clock_tolerance = 56; // int | 
$clock_tolerance_type_hint = 'clock_tolerance_type_hint_example'; // string | 
$group_membership_attribute = 'group_membership_attribute_example'; // string | 
$group_membership_attribute_type_hint = 'group_membership_attribute_type_hint_example'; // string | 
$idp_url = 'idp_url_example'; // string | 
$idp_url_type_hint = 'idp_url_type_hint_example'; // string | 
$logout_url = 'logout_url_example'; // string | 
$logout_url_type_hint = 'logout_url_type_hint_example'; // string | 
$service_provider_entity_id = 'service_provider_entity_id_example'; // string | 
$service_provider_entity_id_type_hint = 'service_provider_entity_id_type_hint_example'; // string | 
$assertion_consumer_service_url = 'assertion_consumer_service_url_example'; // string | 
$assertion_consumer_service_url_type_hint = 'assertion_consumer_service_url_type_hint_example'; // string | 
$handle_logout = True; // bool | 
$handle_logout_type_hint = 'handle_logout_type_hint_example'; // string | 
$sp_private_key_alias = 'sp_private_key_alias_example'; // string | 
$sp_private_key_alias_type_hint = 'sp_private_key_alias_type_hint_example'; // string | 
$use_encryption = True; // bool | 
$use_encryption_type_hint = 'use_encryption_type_hint_example'; // string | 
$name_id_format = 'name_id_format_example'; // string | 
$name_id_format_type_hint = 'name_id_format_type_hint_example'; // string | 
$digest_method = 'digest_method_example'; // string | 
$digest_method_type_hint = 'digest_method_type_hint_example'; // string | 
$signature_method = 'signature_method_example'; // string | 
$signature_method_type_hint = 'signature_method_type_hint_example'; // string | 
$user_intermediate_path = 'user_intermediate_path_example'; // string | 
$user_intermediate_path_type_hint = 'user_intermediate_path_type_hint_example'; // string | 

try {
    $apiInstance->postConfigAdobeGraniteSamlAuthenticationHandler($key_store_password, $key_store_password_type_hint, $service_ranking, $service_ranking_type_hint, $idp_http_redirect, $idp_http_redirect_type_hint, $create_user, $create_user_type_hint, $default_redirect_url, $default_redirect_url_type_hint, $user_id_attribute, $user_id_attribute_type_hint, $default_groups, $default_groups_type_hint, $idp_cert_alias, $idp_cert_alias_type_hint, $add_group_memberships, $add_group_memberships_type_hint, $path, $path_type_hint, $synchronize_attributes, $synchronize_attributes_type_hint, $clock_tolerance, $clock_tolerance_type_hint, $group_membership_attribute, $group_membership_attribute_type_hint, $idp_url, $idp_url_type_hint, $logout_url, $logout_url_type_hint, $service_provider_entity_id, $service_provider_entity_id_type_hint, $assertion_consumer_service_url, $assertion_consumer_service_url_type_hint, $handle_logout, $handle_logout_type_hint, $sp_private_key_alias, $sp_private_key_alias_type_hint, $use_encryption, $use_encryption_type_hint, $name_id_format, $name_id_format_type_hint, $digest_method, $digest_method_type_hint, $signature_method, $signature_method_type_hint, $user_intermediate_path, $user_intermediate_path_type_hint);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->postConfigAdobeGraniteSamlAuthenticationHandler: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_store_password** | **string**|  | [optional]
 **key_store_password_type_hint** | **string**|  | [optional]
 **service_ranking** | **int**|  | [optional]
 **service_ranking_type_hint** | **string**|  | [optional]
 **idp_http_redirect** | **bool**|  | [optional]
 **idp_http_redirect_type_hint** | **string**|  | [optional]
 **create_user** | **bool**|  | [optional]
 **create_user_type_hint** | **string**|  | [optional]
 **default_redirect_url** | **string**|  | [optional]
 **default_redirect_url_type_hint** | **string**|  | [optional]
 **user_id_attribute** | **string**|  | [optional]
 **user_id_attribute_type_hint** | **string**|  | [optional]
 **default_groups** | [**string[]**](../Model/string.md)|  | [optional]
 **default_groups_type_hint** | **string**|  | [optional]
 **idp_cert_alias** | **string**|  | [optional]
 **idp_cert_alias_type_hint** | **string**|  | [optional]
 **add_group_memberships** | **bool**|  | [optional]
 **add_group_memberships_type_hint** | **string**|  | [optional]
 **path** | [**string[]**](../Model/string.md)|  | [optional]
 **path_type_hint** | **string**|  | [optional]
 **synchronize_attributes** | [**string[]**](../Model/string.md)|  | [optional]
 **synchronize_attributes_type_hint** | **string**|  | [optional]
 **clock_tolerance** | **int**|  | [optional]
 **clock_tolerance_type_hint** | **string**|  | [optional]
 **group_membership_attribute** | **string**|  | [optional]
 **group_membership_attribute_type_hint** | **string**|  | [optional]
 **idp_url** | **string**|  | [optional]
 **idp_url_type_hint** | **string**|  | [optional]
 **logout_url** | **string**|  | [optional]
 **logout_url_type_hint** | **string**|  | [optional]
 **service_provider_entity_id** | **string**|  | [optional]
 **service_provider_entity_id_type_hint** | **string**|  | [optional]
 **assertion_consumer_service_url** | **string**|  | [optional]
 **assertion_consumer_service_url_type_hint** | **string**|  | [optional]
 **handle_logout** | **bool**|  | [optional]
 **handle_logout_type_hint** | **string**|  | [optional]
 **sp_private_key_alias** | **string**|  | [optional]
 **sp_private_key_alias_type_hint** | **string**|  | [optional]
 **use_encryption** | **bool**|  | [optional]
 **use_encryption_type_hint** | **string**|  | [optional]
 **name_id_format** | **string**|  | [optional]
 **name_id_format_type_hint** | **string**|  | [optional]
 **digest_method** | **string**|  | [optional]
 **digest_method_type_hint** | **string**|  | [optional]
 **signature_method** | **string**|  | [optional]
 **signature_method_type_hint** | **string**|  | [optional]
 **user_intermediate_path** | **string**|  | [optional]
 **user_intermediate_path_type_hint** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **postConfigApacheFelixJettyBasedHttpService**
> postConfigApacheFelixJettyBasedHttpService($org_apache_felix_https_nio, $org_apache_felix_https_nio_type_hint, $org_apache_felix_https_keystore, $org_apache_felix_https_keystore_type_hint, $org_apache_felix_https_keystore_password, $org_apache_felix_https_keystore_password_type_hint, $org_apache_felix_https_keystore_key, $org_apache_felix_https_keystore_key_type_hint, $org_apache_felix_https_keystore_key_password, $org_apache_felix_https_keystore_key_password_type_hint, $org_apache_felix_https_truststore, $org_apache_felix_https_truststore_type_hint, $org_apache_felix_https_truststore_password, $org_apache_felix_https_truststore_password_type_hint, $org_apache_felix_https_clientcertificate, $org_apache_felix_https_clientcertificate_type_hint, $org_apache_felix_https_enable, $org_apache_felix_https_enable_type_hint, $org_osgi_service_http_port_secure, $org_osgi_service_http_port_secure_type_hint)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$org_apache_felix_https_nio = True; // bool | 
$org_apache_felix_https_nio_type_hint = 'org_apache_felix_https_nio_type_hint_example'; // string | 
$org_apache_felix_https_keystore = 'org_apache_felix_https_keystore_example'; // string | 
$org_apache_felix_https_keystore_type_hint = 'org_apache_felix_https_keystore_type_hint_example'; // string | 
$org_apache_felix_https_keystore_password = 'org_apache_felix_https_keystore_password_example'; // string | 
$org_apache_felix_https_keystore_password_type_hint = 'org_apache_felix_https_keystore_password_type_hint_example'; // string | 
$org_apache_felix_https_keystore_key = 'org_apache_felix_https_keystore_key_example'; // string | 
$org_apache_felix_https_keystore_key_type_hint = 'org_apache_felix_https_keystore_key_type_hint_example'; // string | 
$org_apache_felix_https_keystore_key_password = 'org_apache_felix_https_keystore_key_password_example'; // string | 
$org_apache_felix_https_keystore_key_password_type_hint = 'org_apache_felix_https_keystore_key_password_type_hint_example'; // string | 
$org_apache_felix_https_truststore = 'org_apache_felix_https_truststore_example'; // string | 
$org_apache_felix_https_truststore_type_hint = 'org_apache_felix_https_truststore_type_hint_example'; // string | 
$org_apache_felix_https_truststore_password = 'org_apache_felix_https_truststore_password_example'; // string | 
$org_apache_felix_https_truststore_password_type_hint = 'org_apache_felix_https_truststore_password_type_hint_example'; // string | 
$org_apache_felix_https_clientcertificate = 'org_apache_felix_https_clientcertificate_example'; // string | 
$org_apache_felix_https_clientcertificate_type_hint = 'org_apache_felix_https_clientcertificate_type_hint_example'; // string | 
$org_apache_felix_https_enable = True; // bool | 
$org_apache_felix_https_enable_type_hint = 'org_apache_felix_https_enable_type_hint_example'; // string | 
$org_osgi_service_http_port_secure = 'org_osgi_service_http_port_secure_example'; // string | 
$org_osgi_service_http_port_secure_type_hint = 'org_osgi_service_http_port_secure_type_hint_example'; // string | 

try {
    $apiInstance->postConfigApacheFelixJettyBasedHttpService($org_apache_felix_https_nio, $org_apache_felix_https_nio_type_hint, $org_apache_felix_https_keystore, $org_apache_felix_https_keystore_type_hint, $org_apache_felix_https_keystore_password, $org_apache_felix_https_keystore_password_type_hint, $org_apache_felix_https_keystore_key, $org_apache_felix_https_keystore_key_type_hint, $org_apache_felix_https_keystore_key_password, $org_apache_felix_https_keystore_key_password_type_hint, $org_apache_felix_https_truststore, $org_apache_felix_https_truststore_type_hint, $org_apache_felix_https_truststore_password, $org_apache_felix_https_truststore_password_type_hint, $org_apache_felix_https_clientcertificate, $org_apache_felix_https_clientcertificate_type_hint, $org_apache_felix_https_enable, $org_apache_felix_https_enable_type_hint, $org_osgi_service_http_port_secure, $org_osgi_service_http_port_secure_type_hint);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->postConfigApacheFelixJettyBasedHttpService: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org_apache_felix_https_nio** | **bool**|  | [optional]
 **org_apache_felix_https_nio_type_hint** | **string**|  | [optional]
 **org_apache_felix_https_keystore** | **string**|  | [optional]
 **org_apache_felix_https_keystore_type_hint** | **string**|  | [optional]
 **org_apache_felix_https_keystore_password** | **string**|  | [optional]
 **org_apache_felix_https_keystore_password_type_hint** | **string**|  | [optional]
 **org_apache_felix_https_keystore_key** | **string**|  | [optional]
 **org_apache_felix_https_keystore_key_type_hint** | **string**|  | [optional]
 **org_apache_felix_https_keystore_key_password** | **string**|  | [optional]
 **org_apache_felix_https_keystore_key_password_type_hint** | **string**|  | [optional]
 **org_apache_felix_https_truststore** | **string**|  | [optional]
 **org_apache_felix_https_truststore_type_hint** | **string**|  | [optional]
 **org_apache_felix_https_truststore_password** | **string**|  | [optional]
 **org_apache_felix_https_truststore_password_type_hint** | **string**|  | [optional]
 **org_apache_felix_https_clientcertificate** | **string**|  | [optional]
 **org_apache_felix_https_clientcertificate_type_hint** | **string**|  | [optional]
 **org_apache_felix_https_enable** | **bool**|  | [optional]
 **org_apache_felix_https_enable_type_hint** | **string**|  | [optional]
 **org_osgi_service_http_port_secure** | **string**|  | [optional]
 **org_osgi_service_http_port_secure_type_hint** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **postConfigApacheHttpComponentsProxyConfiguration**
> postConfigApacheHttpComponentsProxyConfiguration($proxy_host, $proxy_host_type_hint, $proxy_port, $proxy_port_type_hint, $proxy_exceptions, $proxy_exceptions_type_hint, $proxy_enabled, $proxy_enabled_type_hint, $proxy_user, $proxy_user_type_hint, $proxy_password, $proxy_password_type_hint)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$proxy_host = 'proxy_host_example'; // string | 
$proxy_host_type_hint = 'proxy_host_type_hint_example'; // string | 
$proxy_port = 56; // int | 
$proxy_port_type_hint = 'proxy_port_type_hint_example'; // string | 
$proxy_exceptions = array('proxy_exceptions_example'); // string[] | 
$proxy_exceptions_type_hint = 'proxy_exceptions_type_hint_example'; // string | 
$proxy_enabled = True; // bool | 
$proxy_enabled_type_hint = 'proxy_enabled_type_hint_example'; // string | 
$proxy_user = 'proxy_user_example'; // string | 
$proxy_user_type_hint = 'proxy_user_type_hint_example'; // string | 
$proxy_password = 'proxy_password_example'; // string | 
$proxy_password_type_hint = 'proxy_password_type_hint_example'; // string | 

try {
    $apiInstance->postConfigApacheHttpComponentsProxyConfiguration($proxy_host, $proxy_host_type_hint, $proxy_port, $proxy_port_type_hint, $proxy_exceptions, $proxy_exceptions_type_hint, $proxy_enabled, $proxy_enabled_type_hint, $proxy_user, $proxy_user_type_hint, $proxy_password, $proxy_password_type_hint);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->postConfigApacheHttpComponentsProxyConfiguration: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxy_host** | **string**|  | [optional]
 **proxy_host_type_hint** | **string**|  | [optional]
 **proxy_port** | **int**|  | [optional]
 **proxy_port_type_hint** | **string**|  | [optional]
 **proxy_exceptions** | [**string[]**](../Model/string.md)|  | [optional]
 **proxy_exceptions_type_hint** | **string**|  | [optional]
 **proxy_enabled** | **bool**|  | [optional]
 **proxy_enabled_type_hint** | **string**|  | [optional]
 **proxy_user** | **string**|  | [optional]
 **proxy_user_type_hint** | **string**|  | [optional]
 **proxy_password** | **string**|  | [optional]
 **proxy_password_type_hint** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **postConfigApacheSlingDavExServlet**
> postConfigApacheSlingDavExServlet($alias, $alias_type_hint, $dav_create_absolute_uri, $dav_create_absolute_uri_type_hint)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$alias = 'alias_example'; // string | 
$alias_type_hint = 'alias_type_hint_example'; // string | 
$dav_create_absolute_uri = True; // bool | 
$dav_create_absolute_uri_type_hint = 'dav_create_absolute_uri_type_hint_example'; // string | 

try {
    $apiInstance->postConfigApacheSlingDavExServlet($alias, $alias_type_hint, $dav_create_absolute_uri, $dav_create_absolute_uri_type_hint);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->postConfigApacheSlingDavExServlet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **string**|  | [optional]
 **alias_type_hint** | **string**|  | [optional]
 **dav_create_absolute_uri** | **bool**|  | [optional]
 **dav_create_absolute_uri_type_hint** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **postConfigApacheSlingGetServlet**
> postConfigApacheSlingGetServlet($json_maximumresults, $json_maximumresults_type_hint, $enable_html, $enable_html_type_hint, $enable_txt, $enable_txt_type_hint, $enable_xml, $enable_xml_type_hint)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$json_maximumresults = 'json_maximumresults_example'; // string | 
$json_maximumresults_type_hint = 'json_maximumresults_type_hint_example'; // string | 
$enable_html = True; // bool | 
$enable_html_type_hint = 'enable_html_type_hint_example'; // string | 
$enable_txt = True; // bool | 
$enable_txt_type_hint = 'enable_txt_type_hint_example'; // string | 
$enable_xml = True; // bool | 
$enable_xml_type_hint = 'enable_xml_type_hint_example'; // string | 

try {
    $apiInstance->postConfigApacheSlingGetServlet($json_maximumresults, $json_maximumresults_type_hint, $enable_html, $enable_html_type_hint, $enable_txt, $enable_txt_type_hint, $enable_xml, $enable_xml_type_hint);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->postConfigApacheSlingGetServlet: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **json_maximumresults** | **string**|  | [optional]
 **json_maximumresults_type_hint** | **string**|  | [optional]
 **enable_html** | **bool**|  | [optional]
 **enable_html_type_hint** | **string**|  | [optional]
 **enable_txt** | **bool**|  | [optional]
 **enable_txt_type_hint** | **string**|  | [optional]
 **enable_xml** | **bool**|  | [optional]
 **enable_xml_type_hint** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **postConfigApacheSlingReferrerFilter**
> postConfigApacheSlingReferrerFilter($allow_empty, $allow_empty_type_hint, $allow_hosts, $allow_hosts_type_hint, $allow_hosts_regexp, $allow_hosts_regexp_type_hint, $filter_methods, $filter_methods_type_hint)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$allow_empty = True; // bool | 
$allow_empty_type_hint = 'allow_empty_type_hint_example'; // string | 
$allow_hosts = 'allow_hosts_example'; // string | 
$allow_hosts_type_hint = 'allow_hosts_type_hint_example'; // string | 
$allow_hosts_regexp = 'allow_hosts_regexp_example'; // string | 
$allow_hosts_regexp_type_hint = 'allow_hosts_regexp_type_hint_example'; // string | 
$filter_methods = 'filter_methods_example'; // string | 
$filter_methods_type_hint = 'filter_methods_type_hint_example'; // string | 

try {
    $apiInstance->postConfigApacheSlingReferrerFilter($allow_empty, $allow_empty_type_hint, $allow_hosts, $allow_hosts_type_hint, $allow_hosts_regexp, $allow_hosts_regexp_type_hint, $filter_methods, $filter_methods_type_hint);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->postConfigApacheSlingReferrerFilter: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allow_empty** | **bool**|  | [optional]
 **allow_empty_type_hint** | **string**|  | [optional]
 **allow_hosts** | **string**|  | [optional]
 **allow_hosts_type_hint** | **string**|  | [optional]
 **allow_hosts_regexp** | **string**|  | [optional]
 **allow_hosts_regexp_type_hint** | **string**|  | [optional]
 **filter_methods** | **string**|  | [optional]
 **filter_methods_type_hint** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **postNode**
> postNode($path, $name, $operation, $delete_authorizable, $file)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$path = 'path_example'; // string | 
$name = 'name_example'; // string | 
$operation = 'operation_example'; // string | 
$delete_authorizable = 'delete_authorizable_example'; // string | 
$file = "/path/to/file.txt"; // \SplFileObject | 

try {
    $apiInstance->postNode($path, $name, $operation, $delete_authorizable, $file);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->postNode: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string**|  |
 **name** | **string**|  |
 **operation** | **string**|  | [optional]
 **delete_authorizable** | **string**|  | [optional]
 **file** | **\SplFileObject****\SplFileObject**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **postNodeRw**
> postNodeRw($path, $name, $add_members)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$path = 'path_example'; // string | 
$name = 'name_example'; // string | 
$add_members = 'add_members_example'; // string | 

try {
    $apiInstance->postNodeRw($path, $name, $add_members);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->postNodeRw: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string**|  |
 **name** | **string**|  |
 **add_members** | **string**|  | [optional]

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **postPath**
> postPath($path, $jcrprimary_type, $name)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$path = 'path_example'; // string | 
$jcrprimary_type = 'jcrprimary_type_example'; // string | 
$name = 'name_example'; // string | 

try {
    $apiInstance->postPath($path, $jcrprimary_type, $name);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->postPath: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string**|  |
 **jcrprimary_type** | **string**|  |
 **name** | **string**|  |

### Return type

void (empty response body)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **postQuery**
> string postQuery($path, $p_limit, $_1_property, $_1_property_value)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$path = 'path_example'; // string | 
$p_limit = 3.4; // float | 
$_1_property = '_1_property_example'; // string | 
$_1_property_value = '_1_property_value_example'; // string | 

try {
    $result = $apiInstance->postQuery($path, $p_limit, $_1_property, $_1_property_value);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->postQuery: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string**|  |
 **p_limit** | **float**|  |
 **_1_property** | **string**|  |
 **_1_property_value** | **string**|  |

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **postTreeActivation**
> postTreeActivation($ignoredeactivated, $onlymodified, $path)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ignoredeactivated = True; // bool | 
$onlymodified = True; // bool | 
$path = 'path_example'; // string | 

try {
    $apiInstance->postTreeActivation($ignoredeactivated, $onlymodified, $path);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->postTreeActivation: ', $e->getMessage(), PHP_EOL;
}
?>
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

# **postTruststore**
> string postTruststore($operation, $new_password, $re_password, $key_store_type, $remove_alias, $certificate)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$operation = 'operation_example'; // string | 
$new_password = 'new_password_example'; // string | 
$re_password = 're_password_example'; // string | 
$key_store_type = 'key_store_type_example'; // string | 
$remove_alias = 'remove_alias_example'; // string | 
$certificate = "/path/to/file.txt"; // \SplFileObject | 

try {
    $result = $apiInstance->postTruststore($operation, $new_password, $re_password, $key_store_type, $remove_alias, $certificate);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->postTruststore: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operation** | **string**|  | [optional]
 **new_password** | **string**|  | [optional]
 **re_password** | **string**|  | [optional]
 **key_store_type** | **string**|  | [optional]
 **remove_alias** | **string**|  | [optional]
 **certificate** | **\SplFileObject****\SplFileObject**|  | [optional]

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **postTruststorePKCS12**
> string postTruststorePKCS12($truststore_p12)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\SlingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$truststore_p12 = "/path/to/file.txt"; // \SplFileObject | 

try {
    $result = $apiInstance->postTruststorePKCS12($truststore_p12);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SlingApi->postTruststorePKCS12: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststore_p12** | **\SplFileObject****\SplFileObject**|  | [optional]

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

