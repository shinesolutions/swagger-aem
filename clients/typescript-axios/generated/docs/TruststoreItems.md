# TruststoreItems


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alias** | **string** | Truststore alias name | [optional] [default to undefined]
**entryType** | **string** |  | [optional] [default to undefined]
**subject** | **string** | e.g. \&quot;CN&#x3D;localhost\&quot; | [optional] [default to undefined]
**issuer** | **string** | e.g. \&quot;CN&#x3D;Admin\&quot; | [optional] [default to undefined]
**notBefore** | **string** | e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot; | [optional] [default to undefined]
**notAfter** | **string** | e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot; | [optional] [default to undefined]
**serialNumber** | **number** | 18165099476682912368 | [optional] [default to undefined]

## Example

```typescript
import { TruststoreItems } from './api';

const instance: TruststoreItems = {
    alias,
    entryType,
    subject,
    issuer,
    notBefore,
    notAfter,
    serialNumber,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
