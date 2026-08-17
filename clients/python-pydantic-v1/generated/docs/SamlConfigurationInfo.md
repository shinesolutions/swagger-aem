# SamlConfigurationInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** | Persistent Identity (PID) | [optional] 
**title** | **str** | Title | [optional] 
**description** | **str** | Title | [optional] 
**bundle_location** | **str** | needed for configuration binding | [optional] 
**service_location** | **str** | needed for configuraiton binding | [optional] 
**properties** | [**SamlConfigurationProperties**](SamlConfigurationProperties.md) |  | [optional] 

## Example

```python
from openapi_client.models.saml_configuration_info import SamlConfigurationInfo

# TODO update the JSON string below
json = "{}"
# create an instance of SamlConfigurationInfo from a JSON string
saml_configuration_info_instance = SamlConfigurationInfo.from_json(json)
# print the JSON string representation of the object
print SamlConfigurationInfo.to_json()

# convert the object into a dict
saml_configuration_info_dict = saml_configuration_info_instance.to_dict()
# create an instance of SamlConfigurationInfo from a dict
saml_configuration_info_from_dict = SamlConfigurationInfo.from_dict(saml_configuration_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


