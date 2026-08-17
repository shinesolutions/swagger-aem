# SamlConfigurationPropertyItemsArray


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | property name | [optional] 
**optional** | **bool** | True if optional | [optional] 
**is_set** | **bool** | True if property is set | [optional] 
**type** | **int** | Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password | [optional] 
**values** | **List[str]** | Property value | [optional] 
**description** | **str** | Property description | [optional] 

## Example

```python
from swaggeraem.models.saml_configuration_property_items_array import SamlConfigurationPropertyItemsArray

# TODO update the JSON string below
json = "{}"
# create an instance of SamlConfigurationPropertyItemsArray from a JSON string
saml_configuration_property_items_array_instance = SamlConfigurationPropertyItemsArray.from_json(json)
# print the JSON string representation of the object
print(SamlConfigurationPropertyItemsArray.to_json())

# convert the object into a dict
saml_configuration_property_items_array_dict = saml_configuration_property_items_array_instance.to_dict()
# create an instance of SamlConfigurationPropertyItemsArray from a dict
saml_configuration_property_items_array_from_dict = SamlConfigurationPropertyItemsArray.from_dict(saml_configuration_property_items_array_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


