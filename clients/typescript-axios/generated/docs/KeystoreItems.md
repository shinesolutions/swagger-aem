# KeystoreItems


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alias** | **string** | Keystore alias name | [optional] [default to undefined]
**entryType** | **string** | e.g. \&quot;privateKey\&quot; | [optional] [default to undefined]
**algorithm** | **string** | e.g. \&quot;RSA\&quot; | [optional] [default to undefined]
**format** | **string** | e.g. \&quot;PKCS#8\&quot; | [optional] [default to undefined]
**chain** | [**Array&lt;KeystoreChainItems&gt;**](KeystoreChainItems.md) |  | [optional] [default to undefined]

## Example

```typescript
import { KeystoreItems } from './api';

const instance: KeystoreItems = {
    alias,
    entryType,
    algorithm,
    format,
    chain,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
