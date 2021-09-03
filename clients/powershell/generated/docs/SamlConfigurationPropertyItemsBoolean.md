# SamlConfigurationPropertyItemsBoolean
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | property name | [optional] 
**Optional** | **Boolean** | True if optional | [optional] 
**IsSet** | **Boolean** | True if property is set | [optional] 
**Type** | **Int32** | Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password | [optional] 
**Value** | **Boolean** | Property value | [optional] 
**Description** | **String** | Property description | [optional] 

## Examples

- Prepare the resource
```powershell
$SamlConfigurationPropertyItemsBoolean = Initialize-PSOpenAPIToolsSamlConfigurationPropertyItemsBoolean  -Name null `
 -Optional null `
 -IsSet null `
 -Type null `
 -Value null `
 -Description null
```

- Convert the resource to JSON
```powershell
$SamlConfigurationPropertyItemsBoolean | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

