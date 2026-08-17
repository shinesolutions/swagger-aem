# SwaggerAemClient::KeystoreInfo

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **aliases** | [**Array&lt;KeystoreItems&gt;**](KeystoreItems.md) |  | [optional] |
| **exists** | **Boolean** | False if truststore don&#39;t exist | [optional] |

## Example

```ruby
require 'swagger_aem'

instance = SwaggerAemClient::KeystoreInfo.new(
  aliases: null,
  exists: null
)
```

