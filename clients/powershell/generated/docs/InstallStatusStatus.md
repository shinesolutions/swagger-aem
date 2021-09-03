# InstallStatusStatus
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Finished** | **Boolean** |  | [optional] 
**ItemCount** | **Int32** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$InstallStatusStatus = Initialize-PSOpenAPIToolsInstallStatusStatus  -Finished null `
 -ItemCount null
```

- Convert the resource to JSON
```powershell
$InstallStatusStatus | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

