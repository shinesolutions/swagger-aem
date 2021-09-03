# WWW::OpenAPIClient::ConsoleApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ConsoleApi;
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_aem_product_info**](ConsoleApi.md#get_aem_product_info) | **GET** /system/console/status-productinfo.json | 
[**get_bundle_info**](ConsoleApi.md#get_bundle_info) | **GET** /system/console/bundles/{name}.json | 
[**get_config_mgr**](ConsoleApi.md#get_config_mgr) | **GET** /system/console/configMgr | 
[**post_bundle**](ConsoleApi.md#post_bundle) | **POST** /system/console/bundles/{name} | 
[**post_jmx_repository**](ConsoleApi.md#post_jmx_repository) | **POST** /system/console/jmx/com.adobe.granite:type&#x3D;Repository/op/{action} | 
[**post_saml_configuration**](ConsoleApi.md#post_saml_configuration) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 


# **get_aem_product_info**
> ARRAY[string] get_aem_product_info()



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConsoleApi;
my $api_instance = WWW::OpenAPIClient::ConsoleApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
);


eval { 
    my $result = $api_instance->get_aem_product_info();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConsoleApi->get_aem_product_info: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ARRAY[string]**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bundle_info**
> BundleInfo get_bundle_info(name => $name)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConsoleApi;
my $api_instance = WWW::OpenAPIClient::ConsoleApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
);

my $name = "name_example"; # string | 

eval { 
    my $result = $api_instance->get_bundle_info(name => $name);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConsoleApi->get_bundle_info: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**|  | 

### Return type

[**BundleInfo**](BundleInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_config_mgr**
> string get_config_mgr()



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConsoleApi;
my $api_instance = WWW::OpenAPIClient::ConsoleApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
);


eval { 
    my $result = $api_instance->get_config_mgr();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConsoleApi->get_config_mgr: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_bundle**
> post_bundle(name => $name, action => $action)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConsoleApi;
my $api_instance = WWW::OpenAPIClient::ConsoleApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
);

my $name = "name_example"; # string | 
my $action = "action_example"; # string | 

eval { 
    $api_instance->post_bundle(name => $name, action => $action);
};
if ($@) {
    warn "Exception when calling ConsoleApi->post_bundle: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **string**|  | 
 **action** | **string**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_jmx_repository**
> post_jmx_repository(action => $action)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConsoleApi;
my $api_instance = WWW::OpenAPIClient::ConsoleApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
);

my $action = "action_example"; # string | 

eval { 
    $api_instance->post_jmx_repository(action => $action);
};
if ($@) {
    warn "Exception when calling ConsoleApi->post_jmx_repository: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **string**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_saml_configuration**
> SamlConfigurationInfo post_saml_configuration(post => $post, apply => $apply, delete => $delete, action => $action, __location => $__location, path => $path, service/ranking => $service/ranking, idp_url => $idp_url, idp_cert_alias => $idp_cert_alias, idp_http_redirect => $idp_http_redirect, service_provider_entity_id => $service_provider_entity_id, assertion_consumer_service_url => $assertion_consumer_service_url, sp_private_key_alias => $sp_private_key_alias, key_store_password => $key_store_password, default_redirect_url => $default_redirect_url, user_id_attribute => $user_id_attribute, use_encryption => $use_encryption, create_user => $create_user, add_group_memberships => $add_group_memberships, group_membership_attribute => $group_membership_attribute, default_groups => $default_groups, name_id_format => $name_id_format, synchronize_attributes => $synchronize_attributes, handle_logout => $handle_logout, logout_url => $logout_url, clock_tolerance => $clock_tolerance, digest_method => $digest_method, signature_method => $signature_method, user_intermediate_path => $user_intermediate_path, propertylist => $propertylist)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ConsoleApi;
my $api_instance = WWW::OpenAPIClient::ConsoleApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
);

my $post = null; # boolean | 
my $apply = null; # boolean | 
my $delete = null; # boolean | 
my $action = "action_example"; # string | 
my $__location = "__location_example"; # string | 
my $path = [("null")]; # ARRAY[string] | 
my $service/ranking = 56; # int | 
my $idp_url = "idp_url_example"; # string | 
my $idp_cert_alias = "idp_cert_alias_example"; # string | 
my $idp_http_redirect = null; # boolean | 
my $service_provider_entity_id = "service_provider_entity_id_example"; # string | 
my $assertion_consumer_service_url = "assertion_consumer_service_url_example"; # string | 
my $sp_private_key_alias = "sp_private_key_alias_example"; # string | 
my $key_store_password = "key_store_password_example"; # string | 
my $default_redirect_url = "default_redirect_url_example"; # string | 
my $user_id_attribute = "user_id_attribute_example"; # string | 
my $use_encryption = null; # boolean | 
my $create_user = null; # boolean | 
my $add_group_memberships = null; # boolean | 
my $group_membership_attribute = "group_membership_attribute_example"; # string | 
my $default_groups = [("null")]; # ARRAY[string] | 
my $name_id_format = "name_id_format_example"; # string | 
my $synchronize_attributes = [("null")]; # ARRAY[string] | 
my $handle_logout = null; # boolean | 
my $logout_url = "logout_url_example"; # string | 
my $clock_tolerance = 56; # int | 
my $digest_method = "digest_method_example"; # string | 
my $signature_method = "signature_method_example"; # string | 
my $user_intermediate_path = "user_intermediate_path_example"; # string | 
my $propertylist = [("null")]; # ARRAY[string] | 

eval { 
    my $result = $api_instance->post_saml_configuration(post => $post, apply => $apply, delete => $delete, action => $action, __location => $__location, path => $path, service/ranking => $service/ranking, idp_url => $idp_url, idp_cert_alias => $idp_cert_alias, idp_http_redirect => $idp_http_redirect, service_provider_entity_id => $service_provider_entity_id, assertion_consumer_service_url => $assertion_consumer_service_url, sp_private_key_alias => $sp_private_key_alias, key_store_password => $key_store_password, default_redirect_url => $default_redirect_url, user_id_attribute => $user_id_attribute, use_encryption => $use_encryption, create_user => $create_user, add_group_memberships => $add_group_memberships, group_membership_attribute => $group_membership_attribute, default_groups => $default_groups, name_id_format => $name_id_format, synchronize_attributes => $synchronize_attributes, handle_logout => $handle_logout, logout_url => $logout_url, clock_tolerance => $clock_tolerance, digest_method => $digest_method, signature_method => $signature_method, user_intermediate_path => $user_intermediate_path, propertylist => $propertylist);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ConsoleApi->post_saml_configuration: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post** | **boolean**|  | [optional] 
 **apply** | **boolean**|  | [optional] 
 **delete** | **boolean**|  | [optional] 
 **action** | **string**|  | [optional] 
 **__location** | **string**|  | [optional] 
 **path** | [**ARRAY[string]**](string.md)|  | [optional] 
 **service/ranking** | **int**|  | [optional] 
 **idp_url** | **string**|  | [optional] 
 **idp_cert_alias** | **string**|  | [optional] 
 **idp_http_redirect** | **boolean**|  | [optional] 
 **service_provider_entity_id** | **string**|  | [optional] 
 **assertion_consumer_service_url** | **string**|  | [optional] 
 **sp_private_key_alias** | **string**|  | [optional] 
 **key_store_password** | **string**|  | [optional] 
 **default_redirect_url** | **string**|  | [optional] 
 **user_id_attribute** | **string**|  | [optional] 
 **use_encryption** | **boolean**|  | [optional] 
 **create_user** | **boolean**|  | [optional] 
 **add_group_memberships** | **boolean**|  | [optional] 
 **group_membership_attribute** | **string**|  | [optional] 
 **default_groups** | [**ARRAY[string]**](string.md)|  | [optional] 
 **name_id_format** | **string**|  | [optional] 
 **synchronize_attributes** | [**ARRAY[string]**](string.md)|  | [optional] 
 **handle_logout** | **boolean**|  | [optional] 
 **logout_url** | **string**|  | [optional] 
 **clock_tolerance** | **int**|  | [optional] 
 **digest_method** | **string**|  | [optional] 
 **signature_method** | **string**|  | [optional] 
 **user_intermediate_path** | **string**|  | [optional] 
 **propertylist** | [**ARRAY[string]**](string.md)|  | [optional] 

### Return type

[**SamlConfigurationInfo**](SamlConfigurationInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

