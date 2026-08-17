# SamlConfigurationPropertyItemsString


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | property name | [optional] 
**optional** | **bool** | True if optional | [optional] 
**is_set** | **bool** | True if property is set | [optional] 
**type** | **int** | Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password | [optional] 
**value** | **str** | Property value | [optional] 
**description** | **str** | Property description | [optional] 

## Example

```python
from swaggeraem.models.saml_configuration_property_items_string import SamlConfigurationPropertyItemsString

# TODO update the JSON string below
json = "{}"
# create an instance of SamlConfigurationPropertyItemsString from a JSON string
saml_configuration_property_items_string_instance = SamlConfigurationPropertyItemsString.from_json(json)
# print the JSON string representation of the object
print(SamlConfigurationPropertyItemsString.to_json())

# convert the object into a dict
saml_configuration_property_items_string_dict = saml_configuration_property_items_string_instance.to_dict()
# create an instance of SamlConfigurationPropertyItemsString from a dict
saml_configuration_property_items_string_from_dict = SamlConfigurationPropertyItemsString.from_dict(saml_configuration_property_items_string_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


