# TruststoreInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aliases** | [**List[TruststoreItems]**](TruststoreItems.md) |  | [optional] 
**exists** | **bool** | False if truststore don&#39;t exist | [optional] 

## Example

```python
from swaggeraem.models.truststore_info import TruststoreInfo

# TODO update the JSON string below
json = "{}"
# create an instance of TruststoreInfo from a JSON string
truststore_info_instance = TruststoreInfo.from_json(json)
# print the JSON string representation of the object
print(TruststoreInfo.to_json())

# convert the object into a dict
truststore_info_dict = truststore_info_instance.to_dict()
# create an instance of TruststoreInfo from a dict
truststore_info_from_dict = TruststoreInfo.from_dict(truststore_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


