# BundleInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **str** | Status description of all bundles | [optional] 
**s** | **List[int]** |  | [optional] 
**data** | [**List[BundleData]**](BundleData.md) |  | [optional] 

## Example

```python
from openapi_client.models.bundle_info import BundleInfo

# TODO update the JSON string below
json = "{}"
# create an instance of BundleInfo from a JSON string
bundle_info_instance = BundleInfo.from_json(json)
# print the JSON string representation of the object
print BundleInfo.to_json()

# convert the object into a dict
bundle_info_dict = bundle_info_instance.to_dict()
# create an instance of BundleInfo from a dict
bundle_info_from_dict = BundleInfo.from_dict(bundle_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


