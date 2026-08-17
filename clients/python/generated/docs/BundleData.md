# BundleData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Bundle ID | [optional] 
**name** | **str** | Bundle name | [optional] 
**fragment** | **bool** | Is bundle a fragment | [optional] 
**state_raw** | **int** | Numeric raw bundle state value | [optional] 
**state** | **str** | Bundle state value | [optional] 
**version** | **str** | Bundle version | [optional] 
**symbolic_name** | **str** | Bundle symbolic name | [optional] 
**category** | **str** | Bundle category | [optional] 
**props** | [**List[BundleDataProp]**](BundleDataProp.md) |  | [optional] 

## Example

```python
from swaggeraem.models.bundle_data import BundleData

# TODO update the JSON string below
json = "{}"
# create an instance of BundleData from a JSON string
bundle_data_instance = BundleData.from_json(json)
# print the JSON string representation of the object
print(BundleData.to_json())

# convert the object into a dict
bundle_data_dict = bundle_data_instance.to_dict()
# create an instance of BundleData from a dict
bundle_data_from_dict = BundleData.from_dict(bundle_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


