# OpenAPI\Server\Api\GraniteApiInterface

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sslSetup**](GraniteApiInterface.md#sslSetup) | **POST** /libs/granite/security/post/sslSetup.html | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.granite:
        class: Acme\MyBundle\Api\GraniteApi
        tags:
            - { name: "open_api_server.api", api: "granite" }
    # ...
```

## **sslSetup**
> string sslSetup($keystorePassword, $keystorePasswordConfirm, $truststorePassword, $truststorePasswordConfirm, $httpsHostname, $httpsPort, $privatekeyFile, $certificateFile)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/GraniteApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\GraniteApiInterface;

class GraniteApi implements GraniteApiInterface
{

    // ...

    /**
     * Implementation of GraniteApiInterface#sslSetup
     */
    public function sslSetup($keystorePassword, $keystorePasswordConfirm, $truststorePassword, $truststorePasswordConfirm, $httpsHostname, $httpsPort, UploadedFile $privatekeyFile = null, UploadedFile $certificateFile = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keystorePassword** | **string**|  |
 **keystorePasswordConfirm** | **string**|  |
 **truststorePassword** | **string**|  |
 **truststorePasswordConfirm** | **string**|  |
 **httpsHostname** | **string**|  |
 **httpsPort** | **string**|  |
 **privatekeyFile** | **UploadedFile****UploadedFile**|  | [optional]
 **certificateFile** | **UploadedFile****UploadedFile**|  | [optional]

### Return type

**string**

### Authorization

[aemAuth](../../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

