# OpenAPI\Client\GraniteApi

All URIs are relative to http://localhost.

Method | HTTP request | Description
------------- | ------------- | -------------
[**sslSetup()**](GraniteApi.md#sslSetup) | **POST** /libs/granite/security/post/sslSetup.html | 


## `sslSetup()`

```php
sslSetup($keystore_password, $keystore_password_confirm, $truststore_password, $truststore_password_confirm, $https_hostname, $https_port, $privatekey_file, $certificate_file): string
```



### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure HTTP basic authorization: aemAuth
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');


$apiInstance = new OpenAPI\Client\Api\GraniteApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$keystore_password = 'keystore_password_example'; // string
$keystore_password_confirm = 'keystore_password_confirm_example'; // string
$truststore_password = 'truststore_password_example'; // string
$truststore_password_confirm = 'truststore_password_confirm_example'; // string
$https_hostname = 'https_hostname_example'; // string
$https_port = 'https_port_example'; // string
$privatekey_file = "/path/to/file.txt"; // \SplFileObject
$certificate_file = "/path/to/file.txt"; // \SplFileObject

try {
    $result = $apiInstance->sslSetup($keystore_password, $keystore_password_confirm, $truststore_password, $truststore_password_confirm, $https_hostname, $https_port, $privatekey_file, $certificate_file);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GraniteApi->sslSetup: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keystore_password** | **string**|  |
 **keystore_password_confirm** | **string**|  |
 **truststore_password** | **string**|  |
 **truststore_password_confirm** | **string**|  |
 **https_hostname** | **string**|  |
 **https_port** | **string**|  |
 **privatekey_file** | **\SplFileObject****\SplFileObject**|  | [optional]
 **certificate_file** | **\SplFileObject****\SplFileObject**|  | [optional]

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `text/plain`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
