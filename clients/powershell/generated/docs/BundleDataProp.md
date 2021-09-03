# BundleDataProp
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | **String** | Bundle data key | [optional] 
**Value** | **String** | Bundle data value | [optional] 

## Examples

- Prepare the resource
```powershell
$BundleDataProp = Initialize-PSOpenAPIToolsBundleDataProp  -Key null `
 -Value null
```

- Convert the resource to JSON
```powershell
$BundleDataProp | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

