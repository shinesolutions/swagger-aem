
# SamlConfigurationProperties


## Properties

Name | Type
------------ | -------------
`path` | [SamlConfigurationPropertyItemsArray](SamlConfigurationPropertyItemsArray.md)
`serviceRanking` | [SamlConfigurationPropertyItemsLong](SamlConfigurationPropertyItemsLong.md)
`idpUrl` | [SamlConfigurationPropertyItemsString](SamlConfigurationPropertyItemsString.md)
`idpCertAlias` | [SamlConfigurationPropertyItemsString](SamlConfigurationPropertyItemsString.md)
`idpHttpRedirect` | [SamlConfigurationPropertyItemsBoolean](SamlConfigurationPropertyItemsBoolean.md)
`serviceProviderEntityId` | [SamlConfigurationPropertyItemsString](SamlConfigurationPropertyItemsString.md)
`assertionConsumerServiceURL` | [SamlConfigurationPropertyItemsString](SamlConfigurationPropertyItemsString.md)
`spPrivateKeyAlias` | [SamlConfigurationPropertyItemsString](SamlConfigurationPropertyItemsString.md)
`keyStorePassword` | [SamlConfigurationPropertyItemsString](SamlConfigurationPropertyItemsString.md)
`defaultRedirectUrl` | [SamlConfigurationPropertyItemsString](SamlConfigurationPropertyItemsString.md)
`userIDAttribute` | [SamlConfigurationPropertyItemsString](SamlConfigurationPropertyItemsString.md)
`useEncryption` | [SamlConfigurationPropertyItemsBoolean](SamlConfigurationPropertyItemsBoolean.md)
`createUser` | [SamlConfigurationPropertyItemsBoolean](SamlConfigurationPropertyItemsBoolean.md)
`addGroupMemberships` | [SamlConfigurationPropertyItemsBoolean](SamlConfigurationPropertyItemsBoolean.md)
`groupMembershipAttribute` | [SamlConfigurationPropertyItemsString](SamlConfigurationPropertyItemsString.md)
`defaultGroups` | [SamlConfigurationPropertyItemsArray](SamlConfigurationPropertyItemsArray.md)
`nameIdFormat` | [SamlConfigurationPropertyItemsString](SamlConfigurationPropertyItemsString.md)
`synchronizeAttributes` | [SamlConfigurationPropertyItemsArray](SamlConfigurationPropertyItemsArray.md)
`handleLogout` | [SamlConfigurationPropertyItemsBoolean](SamlConfigurationPropertyItemsBoolean.md)
`logoutUrl` | [SamlConfigurationPropertyItemsString](SamlConfigurationPropertyItemsString.md)
`clockTolerance` | [SamlConfigurationPropertyItemsLong](SamlConfigurationPropertyItemsLong.md)
`digestMethod` | [SamlConfigurationPropertyItemsString](SamlConfigurationPropertyItemsString.md)
`signatureMethod` | [SamlConfigurationPropertyItemsString](SamlConfigurationPropertyItemsString.md)
`userIntermediatePath` | [SamlConfigurationPropertyItemsString](SamlConfigurationPropertyItemsString.md)

## Example

```typescript
import type { SamlConfigurationProperties } from ''

// TODO: Update the object below with actual values
const example = {
  "path": null,
  "serviceRanking": null,
  "idpUrl": null,
  "idpCertAlias": null,
  "idpHttpRedirect": null,
  "serviceProviderEntityId": null,
  "assertionConsumerServiceURL": null,
  "spPrivateKeyAlias": null,
  "keyStorePassword": null,
  "defaultRedirectUrl": null,
  "userIDAttribute": null,
  "useEncryption": null,
  "createUser": null,
  "addGroupMemberships": null,
  "groupMembershipAttribute": null,
  "defaultGroups": null,
  "nameIdFormat": null,
  "synchronizeAttributes": null,
  "handleLogout": null,
  "logoutUrl": null,
  "clockTolerance": null,
  "digestMethod": null,
  "signatureMethod": null,
  "userIntermediatePath": null,
} satisfies SamlConfigurationProperties

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SamlConfigurationProperties
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


