# KeystoreItems
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Alias** | **String** | Keystore alias name | [optional] 
**EntryType** | **String** | e.g. &quot;&quot;privateKey&quot;&quot; | [optional] 
**Algorithm** | **String** | e.g. &quot;&quot;RSA&quot;&quot; | [optional] 
**Format** | **String** | e.g. &quot;&quot;PKCS#8&quot;&quot; | [optional] 
**Chain** | [**KeystoreChainItems[]**](KeystoreChainItems.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$KeystoreItems = Initialize-PSOpenAPIToolsKeystoreItems  -Alias null `
 -EntryType null `
 -Algorithm null `
 -Format null `
 -Chain null
```

- Convert the resource to JSON
```powershell
$KeystoreItems | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

