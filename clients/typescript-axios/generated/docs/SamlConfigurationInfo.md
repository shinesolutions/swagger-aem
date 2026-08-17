# SamlConfigurationInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **string** | Persistent Identity (PID) | [optional] [default to undefined]
**title** | **string** | Title | [optional] [default to undefined]
**description** | **string** | Title | [optional] [default to undefined]
**bundle_location** | **string** | needed for configuration binding | [optional] [default to undefined]
**service_location** | **string** | needed for configuraiton binding | [optional] [default to undefined]
**properties** | [**SamlConfigurationProperties**](SamlConfigurationProperties.md) |  | [optional] [default to undefined]

## Example

```typescript
import { SamlConfigurationInfo } from './api';

const instance: SamlConfigurationInfo = {
    pid,
    title,
    description,
    bundle_location,
    service_location,
    properties,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
