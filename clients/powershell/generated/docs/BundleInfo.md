# BundleInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **String** | Status description of all bundles | [optional] 
**S** | **Int32[]** |  | [optional] 
**VarData** | [**BundleData[]**](BundleData.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BundleInfo = Initialize-PSOpenAPIToolsBundleInfo  -Status null `
 -S null `
 -VarData null
```

- Convert the resource to JSON
```powershell
$BundleInfo | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

