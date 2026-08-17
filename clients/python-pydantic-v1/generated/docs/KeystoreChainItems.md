# KeystoreChainItems


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subject** | **str** | e.g. \&quot;CN&#x3D;localhost\&quot; | [optional] 
**issuer** | **str** | e.g. \&quot;CN&#x3D;Admin\&quot; | [optional] 
**not_before** | **str** | e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot; | [optional] 
**not_after** | **str** | e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot; | [optional] 
**serial_number** | **int** | 18165099476682912368 | [optional] 

## Example

```python
from openapi_client.models.keystore_chain_items import KeystoreChainItems

# TODO update the JSON string below
json = "{}"
# create an instance of KeystoreChainItems from a JSON string
keystore_chain_items_instance = KeystoreChainItems.from_json(json)
# print the JSON string representation of the object
print KeystoreChainItems.to_json()

# convert the object into a dict
keystore_chain_items_dict = keystore_chain_items_instance.to_dict()
# create an instance of KeystoreChainItems from a dict
keystore_chain_items_from_dict = KeystoreChainItems.from_dict(keystore_chain_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


