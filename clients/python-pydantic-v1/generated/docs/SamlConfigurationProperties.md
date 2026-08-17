# SamlConfigurationProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | [**SamlConfigurationPropertyItemsArray**](SamlConfigurationPropertyItemsArray.md) |  | [optional] 
**service_ranking** | [**SamlConfigurationPropertyItemsLong**](SamlConfigurationPropertyItemsLong.md) |  | [optional] 
**idp_url** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**idp_cert_alias** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**idp_http_redirect** | [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] 
**service_provider_entity_id** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**assertion_consumer_service_url** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**sp_private_key_alias** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**key_store_password** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**default_redirect_url** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**user_id_attribute** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**use_encryption** | [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] 
**create_user** | [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] 
**add_group_memberships** | [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] 
**group_membership_attribute** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**default_groups** | [**SamlConfigurationPropertyItemsArray**](SamlConfigurationPropertyItemsArray.md) |  | [optional] 
**name_id_format** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**synchronize_attributes** | [**SamlConfigurationPropertyItemsArray**](SamlConfigurationPropertyItemsArray.md) |  | [optional] 
**handle_logout** | [**SamlConfigurationPropertyItemsBoolean**](SamlConfigurationPropertyItemsBoolean.md) |  | [optional] 
**logout_url** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**clock_tolerance** | [**SamlConfigurationPropertyItemsLong**](SamlConfigurationPropertyItemsLong.md) |  | [optional] 
**digest_method** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**signature_method** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 
**user_intermediate_path** | [**SamlConfigurationPropertyItemsString**](SamlConfigurationPropertyItemsString.md) |  | [optional] 

## Example

```python
from openapi_client.models.saml_configuration_properties import SamlConfigurationProperties

# TODO update the JSON string below
json = "{}"
# create an instance of SamlConfigurationProperties from a JSON string
saml_configuration_properties_instance = SamlConfigurationProperties.from_json(json)
# print the JSON string representation of the object
print SamlConfigurationProperties.to_json()

# convert the object into a dict
saml_configuration_properties_dict = saml_configuration_properties_instance.to_dict()
# create an instance of SamlConfigurationProperties from a dict
saml_configuration_properties_from_dict = SamlConfigurationProperties.from_dict(saml_configuration_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


