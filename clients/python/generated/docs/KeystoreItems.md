# KeystoreItems


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alias** | **str** | Keystore alias name | [optional] 
**entry_type** | **str** | e.g. \&quot;privateKey\&quot; | [optional] 
**algorithm** | **str** | e.g. \&quot;RSA\&quot; | [optional] 
**format** | **str** | e.g. \&quot;PKCS#8\&quot; | [optional] 
**chain** | [**List[KeystoreChainItems]**](KeystoreChainItems.md) |  | [optional] 

## Example

```python
from swaggeraem.models.keystore_items import KeystoreItems

# TODO update the JSON string below
json = "{}"
# create an instance of KeystoreItems from a JSON string
keystore_items_instance = KeystoreItems.from_json(json)
# print the JSON string representation of the object
print(KeystoreItems.to_json())

# convert the object into a dict
keystore_items_dict = keystore_items_instance.to_dict()
# create an instance of KeystoreItems from a dict
keystore_items_from_dict = KeystoreItems.from_dict(keystore_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


