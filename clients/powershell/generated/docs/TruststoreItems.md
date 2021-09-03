# TruststoreItems
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Alias** | **String** | Truststore alias name | [optional] 
**EntryType** | **String** |  | [optional] 
**Subject** | **String** | e.g. &quot;&quot;CN&#x3D;localhost&quot;&quot; | [optional] 
**Issuer** | **String** | e.g. &quot;&quot;CN&#x3D;Admin&quot;&quot; | [optional] 
**NotBefore** | **String** | e.g. &quot;&quot;Sun Jul 01 12:00:00 AEST 2018&quot;&quot; | [optional] 
**NotAfter** | **String** | e.g. &quot;&quot;Sun Jun 30 23:59:50 AEST 2019&quot;&quot; | [optional] 
**SerialNumber** | **Int32** | 18165099476682912368 | [optional] 

## Examples

- Prepare the resource
```powershell
$TruststoreItems = Initialize-PSOpenAPIToolsTruststoreItems  -Alias null `
 -EntryType null `
 -Subject null `
 -Issuer null `
 -NotBefore null `
 -NotAfter null `
 -SerialNumber null
```

- Convert the resource to JSON
```powershell
$TruststoreItems | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

