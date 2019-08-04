# WWW::OpenAPIClient::CqApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::CqApi;
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_login_page**](CqApi.md#get_login_page) | **GET** /libs/granite/core/content/login.html | 
[**post_cq_actions**](CqApi.md#post_cq_actions) | **POST** /.cqactions.html | 


# **get_login_page**
> string get_login_page()



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CqApi;
my $api_instance = WWW::OpenAPIClient::CqApi->new(
);


eval { 
    my $result = $api_instance->get_login_page();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CqApi->get_login_page: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_cq_actions**
> post_cq_actions(authorizable_id => $authorizable_id, changelog => $changelog)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CqApi;
my $api_instance = WWW::OpenAPIClient::CqApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $authorizable_id = "authorizable_id_example"; # string | 
my $changelog = "changelog_example"; # string | 

eval { 
    $api_instance->post_cq_actions(authorizable_id => $authorizable_id, changelog => $changelog);
};
if ($@) {
    warn "Exception when calling CqApi->post_cq_actions: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizable_id** | **string**|  | 
 **changelog** | **string**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

