# SwaggerAemClient::BundleData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Bundle ID | [optional] 
**name** | **String** | Bundle name | [optional] 
**fragment** | **Boolean** | Is bundle a fragment | [optional] 
**state_raw** | **Integer** | Numeric raw bundle state value | [optional] 
**state** | **String** | Bundle state value | [optional] 
**version** | **String** | Bundle version | [optional] 
**symbolic_name** | **String** | Bundle symbolic name | [optional] 
**category** | **String** | Bundle category | [optional] 
**props** | [**Array&lt;BundleDataProp&gt;**](BundleDataProp.md) |  | [optional] 

## Code Sample

```ruby
require 'SwaggerAemClient'

instance = SwaggerAemClient::BundleData.new(id: null,
                                 name: null,
                                 fragment: null,
                                 state_raw: null,
                                 state: null,
                                 version: null,
                                 symbolic_name: null,
                                 category: null,
                                 props: null)
```


