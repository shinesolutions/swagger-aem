# SamlConfigurationPropertyItemsBoolean


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | property name | [optional] 
**optional** | **bool** | True if optional | [optional] 
**is_set** | **bool** | True if property is set | [optional] 
**type** | **int** | Property type, 1&#x3D;String, 3&#x3D;long, 11&#x3D;boolean, 12&#x3D;Password | [optional] 
**value** | **bool** | Property value | [optional] 
**description** | **str** | Property description | [optional] 

## Example

```python
from openapi_client.models.saml_configuration_property_items_boolean import SamlConfigurationPropertyItemsBoolean

# TODO update the JSON string below
json = "{}"
# create an instance of SamlConfigurationPropertyItemsBoolean from a JSON string
saml_configuration_property_items_boolean_instance = SamlConfigurationPropertyItemsBoolean.from_json(json)
# print the JSON string representation of the object
print SamlConfigurationPropertyItemsBoolean.to_json()

# convert the object into a dict
saml_configuration_property_items_boolean_dict = saml_configuration_property_items_boolean_instance.to_dict()
# create an instance of SamlConfigurationPropertyItemsBoolean from a dict
saml_configuration_property_items_boolean_from_dict = SamlConfigurationPropertyItemsBoolean.from_dict(saml_configuration_property_items_boolean_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


