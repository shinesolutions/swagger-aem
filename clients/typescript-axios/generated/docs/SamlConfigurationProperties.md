# SamlConfigurationProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | [**SamlConfigurationPropertyItemsArray**](SamlConfigurationPropertyItemsArray.md) |  | [optional] [default to undefined]
**service_ranking** | [**SamlConfigurationPropertyItemsLong**](SamlConfigurationPropertyItemsLong.md) |  | [optional] [default to undefined]
**idpUrl** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] [default to undefined]
**idpCertAlias** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] [default to undefined]
**idpHttpRedirect** | [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] [default to undefined]
**serviceProviderEntityId** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] [default to undefined]
**assertionConsumerServiceURL** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] [default to undefined]
**spPrivateKeyAlias** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] [default to undefined]
**keyStorePassword** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] [default to undefined]
**defaultRedirectUrl** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] [default to undefined]
**userIDAttribute** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] [default to undefined]
**useEncryption** | [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] [default to undefined]
**createUser** | [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] [default to undefined]
**addGroupMemberships** | [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] [default to undefined]
**groupMembershipAttribute** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] [default to undefined]
**defaultGroups** | [**SamlConfigurationPropertyItemsArray**](SamlConfigurationPropertyItemsArray.md) |  | [optional] [default to undefined]
**nameIdFormat** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] [default to undefined]
**synchronizeAttributes** | [**SamlConfigurationPropertyItemsArray**](SamlConfigurationPropertyItemsArray.md) |  | [optional] [default to undefined]
**handleLogout** | [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] [default to undefined]
**logoutUrl** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] [default to undefined]
**clockTolerance** | [**SamlConfigurationPropertyItemsLong**](SamlConfigurationPropertyItemsLong.md) |  | [optional] [default to undefined]
**digestMethod** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] [default to undefined]
**signatureMethod** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] [default to undefined]
**userIntermediatePath** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] [default to undefined]

## Example

```typescript
import { SamlConfigurationProperties } from './api';

const instance: SamlConfigurationProperties = {
    path,
    service_ranking,
    idpUrl,
    idpCertAlias,
    idpHttpRedirect,
    serviceProviderEntityId,
    assertionConsumerServiceURL,
    spPrivateKeyAlias,
    keyStorePassword,
    defaultRedirectUrl,
    userIDAttribute,
    useEncryption,
    createUser,
    addGroupMemberships,
    groupMembershipAttribute,
    defaultGroups,
    nameIdFormat,
    synchronizeAttributes,
    handleLogout,
    logoutUrl,
    clockTolerance,
    digestMethod,
    signatureMethod,
    userIntermediatePath,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
