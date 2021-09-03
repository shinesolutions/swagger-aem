# KeystoreInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Aliases** | [**KeystoreItems[]**](KeystoreItems.md) |  | [optional] 
**Exists** | **Boolean** | False if truststore don&#39;t exist | [optional] 

## Examples

- Prepare the resource
```powershell
$KeystoreInfo = Initialize-PSOpenAPIToolsKeystoreInfo  -Aliases null `
 -Exists null
```

- Convert the resource to JSON
```powershell
$KeystoreInfo | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

