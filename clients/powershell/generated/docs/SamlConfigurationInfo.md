# SamlConfigurationInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarPid** | **String** | Persistent Identity (PID) | [optional] 
**Title** | **String** | Title | [optional] 
**Description** | **String** | Title | [optional] 
**BundleLocation** | **String** | needed for configuration binding | [optional] 
**ServiceLocation** | **String** | needed for configuraiton binding | [optional] 
**Properties** | [**SamlConfigurationProperties**](SamlConfigurationProperties.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$SamlConfigurationInfo = Initialize-PSOpenAPIToolsSamlConfigurationInfo  -VarPid null `
 -Title null `
 -Description null `
 -BundleLocation null `
 -ServiceLocation null `
 -Properties null
```

- Convert the resource to JSON
```powershell
$SamlConfigurationInfo | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

