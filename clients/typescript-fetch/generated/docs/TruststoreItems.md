
# TruststoreItems


## Properties

Name | Type
------------ | -------------
`alias` | string
`entryType` | string
`subject` | string
`issuer` | string
`notBefore` | string
`notAfter` | string
`serialNumber` | number

## Example

```typescript
import type { TruststoreItems } from ''

// TODO: Update the object below with actual values
const example = {
  "alias": null,
  "entryType": null,
  "subject": null,
  "issuer": null,
  "notBefore": null,
  "notAfter": null,
  "serialNumber": null,
} satisfies TruststoreItems

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TruststoreItems
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


