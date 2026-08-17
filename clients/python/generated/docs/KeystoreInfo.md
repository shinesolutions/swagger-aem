# KeystoreInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aliases** | [**List[KeystoreItems]**](KeystoreItems.md) |  | [optional] 
**exists** | **bool** | False if truststore don&#39;t exist | [optional] 

## Example

```python
from swaggeraem.models.keystore_info import KeystoreInfo

# TODO update the JSON string below
json = "{}"
# create an instance of KeystoreInfo from a JSON string
keystore_info_instance = KeystoreInfo.from_json(json)
# print the JSON string representation of the object
print(KeystoreInfo.to_json())

# convert the object into a dict
keystore_info_dict = keystore_info_instance.to_dict()
# create an instance of KeystoreInfo from a dict
keystore_info_from_dict = KeystoreInfo.from_dict(keystore_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


