# SwaggerAemClient::KeystoreItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_alias** | **String** | Keystore alias name | [optional] 
**entry_type** | **String** | e.g. \&quot;privateKey\&quot; | [optional] 
**algorithm** | **String** | e.g. \&quot;RSA\&quot; | [optional] 
**format** | **String** | e.g. \&quot;PKCS#8\&quot; | [optional] 
**chain** | [**Array&lt;KeystoreChainItems&gt;**](KeystoreChainItems.md) |  | [optional] 

## Code Sample

```ruby
require 'SwaggerAemClient'

instance = SwaggerAemClient::KeystoreItems.new(_alias: null,
                                 entry_type: null,
                                 algorithm: null,
                                 format: null,
                                 chain: null)
```


