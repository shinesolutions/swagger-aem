# BundleDataProp


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **str** | Bundle data key | [optional] 
**value** | **str** | Bundle data value | [optional] 

## Example

```python
from swaggeraem.models.bundle_data_prop import BundleDataProp

# TODO update the JSON string below
json = "{}"
# create an instance of BundleDataProp from a JSON string
bundle_data_prop_instance = BundleDataProp.from_json(json)
# print the JSON string representation of the object
print(BundleDataProp.to_json())

# convert the object into a dict
bundle_data_prop_dict = bundle_data_prop_instance.to_dict()
# create an instance of BundleDataProp from a dict
bundle_data_prop_from_dict = BundleDataProp.from_dict(bundle_data_prop_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


