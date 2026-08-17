# BundleData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | Bundle ID | [optional] [default to undefined]
**name** | **string** | Bundle name | [optional] [default to undefined]
**fragment** | **boolean** | Is bundle a fragment | [optional] [default to undefined]
**stateRaw** | **number** | Numeric raw bundle state value | [optional] [default to undefined]
**state** | **string** | Bundle state value | [optional] [default to undefined]
**version** | **string** | Bundle version | [optional] [default to undefined]
**symbolicName** | **string** | Bundle symbolic name | [optional] [default to undefined]
**category** | **string** | Bundle category | [optional] [default to undefined]
**props** | [**Array&lt;BundleDataProp&gt;**](BundleDataProp.md) |  | [optional] [default to undefined]

## Example

```typescript
import { BundleData } from './api';

const instance: BundleData = {
    id,
    name,
    fragment,
    stateRaw,
    state,
    version,
    symbolicName,
    category,
    props,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
