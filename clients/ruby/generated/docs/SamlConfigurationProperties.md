# SwaggerAemClient::SamlConfigurationProperties

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

## Code Sample

```ruby
require 'SwaggerAemClient'

instance = SwaggerAemClient::SamlConfigurationProperties.new(path: null,
                                 service_ranking: null,
                                 idp_url: null,
                                 idp_cert_alias: null,
                                 idp_http_redirect: null,
                                 service_provider_entity_id: null,
                                 assertion_consumer_service_url: null,
                                 sp_private_key_alias: null,
                                 key_store_password: null,
                                 default_redirect_url: null,
                                 user_id_attribute: null,
                                 use_encryption: null,
                                 create_user: null,
                                 add_group_memberships: null,
                                 group_membership_attribute: null,
                                 default_groups: null,
                                 name_id_format: null,
                                 synchronize_attributes: null,
                                 handle_logout: null,
                                 logout_url: null,
                                 clock_tolerance: null,
                                 digest_method: null,
                                 signature_method: null,
                                 user_intermediate_path: null)
```


