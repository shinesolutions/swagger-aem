
# SamlConfigurationInfo


## Properties

Name | Type
------------ | -------------
`pid` | string
`title` | string
`description` | string
`bundleLocation` | string
`serviceLocation` | string
`properties` | [SamlConfigurationProperties](SamlConfigurationProperties.md)

## Example

```typescript
import type { SamlConfigurationInfo } from ''

// TODO: Update the object below with actual values
const example = {
  "pid": null,
  "title": null,
  "description": null,
  "bundleLocation": null,
  "serviceLocation": null,
  "properties": null,
} satisfies SamlConfigurationInfo

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SamlConfigurationInfo
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


