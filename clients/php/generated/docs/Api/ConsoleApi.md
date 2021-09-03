# OpenAPI\Client\ConsoleApi

All URIs are relative to http://localhost.

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAemProductInfo()**](ConsoleApi.md#getAemProductInfo) | **GET** /system/console/status-productinfo.json | 
[**getBundleInfo()**](ConsoleApi.md#getBundleInfo) | **GET** /system/console/bundles/{name}.json | 
[**getConfigMgr()**](ConsoleApi.md#getConfigMgr) | **GET** /system/console/configMgr | 
[**postBundle()**](ConsoleApi.md#postBundle) | **POST** /system/console/bundles/{name} | 
[**postJmxRepository()**](ConsoleApi.md#postJmxRepository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**postSamlConfiguration()**](ConsoleApi.md#postSamlConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


## `getAemProductInfo()`

```php
getAemProductInfo(): string[]
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\ConsoleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->getAemProductInfo();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConsoleApi->getAemProductInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**string[]**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getBundleInfo()`

```php
getBundleInfo($name): \OpenAPI\Client\Model\BundleInfo
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\ConsoleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$name = 'name_example'; // string

try {
    $result = $apiInstance->getBundleInfo($name);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConsoleApi->getBundleInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**|  |

### Return type

[**\OpenAPI\Client\Model\BundleInfo**](../Model/BundleInfo.md)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getConfigMgr()`

```php
getConfigMgr(): string
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\ConsoleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->getConfigMgr();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConsoleApi->getConfigMgr: ', $e->getMessage(), PHP_EOL;
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
- **Accept**: `text/xml`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `postBundle()`

```php
postBundle($name, $action)
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\ConsoleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$name = 'name_example'; // string
$action = 'action_example'; // string

try {
    $apiInstance->postBundle($name, $action);
} catch (Exception $e) {
    echo 'Exception when calling ConsoleApi->postBundle: ', $e->getMessage(), PHP_EOL;
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

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `postJmxRepository()`

```php
postJmxRepository($action)
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\ConsoleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$action = 'action_example'; // string

try {
    $apiInstance->postJmxRepository($action);
} catch (Exception $e) {
    echo 'Exception when calling ConsoleApi->postJmxRepository: ', $e->getMessage(), PHP_EOL;
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

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `postSamlConfiguration()`

```php
postSamlConfiguration($post, $apply, $delete, $action, $location, $path, $service_ranking, $idp_url, $idp_cert_alias, $idp_http_redirect, $service_provider_entity_id, $assertion_consumer_service_url, $sp_private_key_alias, $key_store_password, $default_redirect_url, $user_id_attribute, $use_encryption, $create_user, $add_group_memberships, $group_membership_attribute, $default_groups, $name_id_format, $synchronize_attributes, $handle_logout, $logout_url, $clock_tolerance, $digest_method, $signature_method, $user_intermediate_path, $propertylist): \OpenAPI\Client\Model\SamlConfigurationInfo
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\ConsoleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$post = True; // bool
$apply = True; // bool
$delete = True; // bool
$action = 'action_example'; // string
$location = 'location_example'; // string
$path = array('path_example'); // string[]
$service_ranking = 56; // int
$idp_url = 'idp_url_example'; // string
$idp_cert_alias = 'idp_cert_alias_example'; // string
$idp_http_redirect = True; // bool
$service_provider_entity_id = 'service_provider_entity_id_example'; // string
$assertion_consumer_service_url = 'assertion_consumer_service_url_example'; // string
$sp_private_key_alias = 'sp_private_key_alias_example'; // string
$key_store_password = 'key_store_password_example'; // string
$default_redirect_url = 'default_redirect_url_example'; // string
$user_id_attribute = 'user_id_attribute_example'; // string
$use_encryption = True; // bool
$create_user = True; // bool
$add_group_memberships = True; // bool
$group_membership_attribute = 'group_membership_attribute_example'; // string
$default_groups = array('default_groups_example'); // string[]
$name_id_format = 'name_id_format_example'; // string
$synchronize_attributes = array('synchronize_attributes_example'); // string[]
$handle_logout = True; // bool
$logout_url = 'logout_url_example'; // string
$clock_tolerance = 56; // int
$digest_method = 'digest_method_example'; // string
$signature_method = 'signature_method_example'; // string
$user_intermediate_path = 'user_intermediate_path_example'; // string
$propertylist = array('propertylist_example'); // string[]

try {
    $result = $apiInstance->postSamlConfiguration($post, $apply, $delete, $action, $location, $path, $service_ranking, $idp_url, $idp_cert_alias, $idp_http_redirect, $service_provider_entity_id, $assertion_consumer_service_url, $sp_private_key_alias, $key_store_password, $default_redirect_url, $user_id_attribute, $use_encryption, $create_user, $add_group_memberships, $group_membership_attribute, $default_groups, $name_id_format, $synchronize_attributes, $handle_logout, $logout_url, $clock_tolerance, $digest_method, $signature_method, $user_intermediate_path, $propertylist);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ConsoleApi->postSamlConfiguration: ', $e->getMessage(), PHP_EOL;
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
 **path** | [**string[]**](../Model/string.md)|  | [optional]
 **service_ranking** | **int**|  | [optional]
 **idp_url** | **string**|  | [optional]
 **idp_cert_alias** | **string**|  | [optional]
 **idp_http_redirect** | **bool**|  | [optional]
 **service_provider_entity_id** | **string**|  | [optional]
 **assertion_consumer_service_url** | **string**|  | [optional]
 **sp_private_key_alias** | **string**|  | [optional]
 **key_store_password** | **string**|  | [optional]
 **default_redirect_url** | **string**|  | [optional]
 **user_id_attribute** | **string**|  | [optional]
 **use_encryption** | **bool**|  | [optional]
 **create_user** | **bool**|  | [optional]
 **add_group_memberships** | **bool**|  | [optional]
 **group_membership_attribute** | **string**|  | [optional]
 **default_groups** | [**string[]**](../Model/string.md)|  | [optional]
 **name_id_format** | **string**|  | [optional]
 **synchronize_attributes** | [**string[]**](../Model/string.md)|  | [optional]
 **handle_logout** | **bool**|  | [optional]
 **logout_url** | **string**|  | [optional]
 **clock_tolerance** | **int**|  | [optional]
 **digest_method** | **string**|  | [optional]
 **signature_method** | **string**|  | [optional]
 **user_intermediate_path** | **string**|  | [optional]
 **propertylist** | [**string[]**](../Model/string.md)|  | [optional]

### Return type

[**\OpenAPI\Client\Model\SamlConfigurationInfo**](../Model/SamlConfigurationInfo.md)

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `text/plain`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
