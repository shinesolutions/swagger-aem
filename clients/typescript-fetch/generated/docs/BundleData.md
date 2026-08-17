
# BundleData


## Properties

Name | Type
------------ | -------------
`id` | number
`name` | string
`fragment` | boolean
`stateRaw` | number
`state` | string
`version` | string
`symbolicName` | string
`category` | string
`props` | [Array&lt;BundleDataProp&gt;](BundleDataProp.md)

## Example

```typescript
import type { BundleData } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "fragment": null,
  "stateRaw": null,
  "state": null,
  "version": null,
  "symbolicName": null,
  "category": null,
  "props": null,
} satisfies BundleData

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BundleData
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


