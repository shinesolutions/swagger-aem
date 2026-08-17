# TruststoreItems


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alias** | **str** | Truststore alias name | [optional] 
**entry_type** | **str** |  | [optional] 
**subject** | **str** | e.g. \&quot;CN&#x3D;localhost\&quot; | [optional] 
**issuer** | **str** | e.g. \&quot;CN&#x3D;Admin\&quot; | [optional] 
**not_before** | **str** | e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot; | [optional] 
**not_after** | **str** | e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot; | [optional] 
**serial_number** | **int** | 18165099476682912368 | [optional] 

## Example

```python
from swaggeraem.models.truststore_items import TruststoreItems

# TODO update the JSON string below
json = "{}"
# create an instance of TruststoreItems from a JSON string
truststore_items_instance = TruststoreItems.from_json(json)
# print the JSON string representation of the object
print(TruststoreItems.to_json())

# convert the object into a dict
truststore_items_dict = truststore_items_instance.to_dict()
# create an instance of TruststoreItems from a dict
truststore_items_from_dict = TruststoreItems.from_dict(truststore_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


