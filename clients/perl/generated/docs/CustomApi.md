# WWW::OpenAPIClient::CustomApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::CustomApi;
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_aem_health_check**](CustomApi.md#get_aem_health_check) | **GET** /system/health | 
[**post_config_aem_health_check_servlet**](CustomApi.md#post_config_aem_health_check_servlet) | **POST** /apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck | 
[**post_config_aem_password_reset**](CustomApi.md#post_config_aem_password_reset) | **POST** /apps/system/config/com.shinesolutions.aem.passwordreset.Activator | 


# **get_aem_health_check**
> string get_aem_health_check(tags => $tags, combine_tags_or => $combine_tags_or)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CustomApi;
my $api_instance = WWW::OpenAPIClient::CustomApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $tags = "tags_example"; # string | 
my $combine_tags_or = null; # boolean | 

eval { 
    my $result = $api_instance->get_aem_health_check(tags => $tags, combine_tags_or => $combine_tags_or);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CustomApi->get_aem_health_check: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | **string**|  | [optional] 
 **combine_tags_or** | **boolean**|  | [optional] 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_aem_health_check_servlet**
> post_config_aem_health_check_servlet(bundles/ignored => $bundles/ignored, bundles/ignored@type_hint => $bundles/ignored@type_hint)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CustomApi;
my $api_instance = WWW::OpenAPIClient::CustomApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $bundles/ignored = [("inner_example")]; # ARRAY[string] | 
my $bundles/ignored@type_hint = "bundles/ignored@type_hint_example"; # string | 

eval { 
    $api_instance->post_config_aem_health_check_servlet(bundles/ignored => $bundles/ignored, bundles/ignored@type_hint => $bundles/ignored@type_hint);
};
if ($@) {
    warn "Exception when calling CustomApi->post_config_aem_health_check_servlet: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundles/ignored** | [**ARRAY[string]**](string.md)|  | [optional] 
 **bundles/ignored@type_hint** | **string**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_aem_password_reset**
> post_config_aem_password_reset(pwdreset/authorizables => $pwdreset/authorizables, pwdreset/authorizables@type_hint => $pwdreset/authorizables@type_hint)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CustomApi;
my $api_instance = WWW::OpenAPIClient::CustomApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $pwdreset/authorizables = [("inner_example")]; # ARRAY[string] | 
my $pwdreset/authorizables@type_hint = "pwdreset/authorizables@type_hint_example"; # string | 

eval { 
    $api_instance->post_config_aem_password_reset(pwdreset/authorizables => $pwdreset/authorizables, pwdreset/authorizables@type_hint => $pwdreset/authorizables@type_hint);
};
if ($@) {
    warn "Exception when calling CustomApi->post_config_aem_password_reset: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pwdreset/authorizables** | [**ARRAY[string]**](string.md)|  | [optional] 
 **pwdreset/authorizables@type_hint** | **string**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

