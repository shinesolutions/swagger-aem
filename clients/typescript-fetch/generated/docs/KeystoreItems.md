
# KeystoreItems


## Properties

Name | Type
------------ | -------------
`alias` | string
`entryType` | string
`algorithm` | string
`format` | string
`chain` | [Array&lt;KeystoreChainItems&gt;](KeystoreChainItems.md)

## Example

```typescript
import type { KeystoreItems } from ''

// TODO: Update the object below with actual values
const example = {
  "alias": null,
  "entryType": null,
  "algorithm": null,
  "format": null,
  "chain": null,
} satisfies KeystoreItems

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as KeystoreItems
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


