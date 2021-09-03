# BundleData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | Bundle ID | [optional] 
**Name** | **String** | Bundle name | [optional] 
**Fragment** | **Boolean** | Is bundle a fragment | [optional] 
**StateRaw** | **Int32** | Numeric raw bundle state value | [optional] 
**State** | **String** | Bundle state value | [optional] 
**Version** | **String** | Bundle version | [optional] 
**SymbolicName** | **String** | Bundle symbolic name | [optional] 
**Category** | **String** | Bundle category | [optional] 
**Props** | [**BundleDataProp[]**](BundleDataProp.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BundleData = Initialize-PSOpenAPIToolsBundleData  -Id null `
 -Name null `
 -Fragment null `
 -StateRaw null `
 -State null `
 -Version null `
 -SymbolicName null `
 -Category null `
 -Props null
```

- Convert the resource to JSON
```powershell
$BundleData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

