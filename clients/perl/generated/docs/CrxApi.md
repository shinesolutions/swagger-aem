# WWW::OpenAPIClient::CrxApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::CrxApi;
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_crxde_status**](CrxApi.md#get_crxde_status) | **GET** /crx/server/crx.default/jcr:root/.1.json | 
[**get_install_status**](CrxApi.md#get_install_status) | **GET** /crx/packmgr/installstatus.jsp | 
[**get_package_manager_servlet**](CrxApi.md#get_package_manager_servlet) | **GET** /crx/packmgr/service/script.html | 
[**post_package_service**](CrxApi.md#post_package_service) | **POST** /crx/packmgr/service.jsp | 
[**post_package_service_json**](CrxApi.md#post_package_service_json) | **POST** /crx/packmgr/service/.json/{path} | 
[**post_package_update**](CrxApi.md#post_package_update) | **POST** /crx/packmgr/update.jsp | 
[**post_set_password**](CrxApi.md#post_set_password) | **POST** /crx/explorer/ui/setpassword.jsp | 


# **get_crxde_status**
> string get_crxde_status()



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CrxApi;
my $api_instance = WWW::OpenAPIClient::CrxApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
);


eval { 
    my $result = $api_instance->get_crxde_status();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CrxApi->get_crxde_status: $@\n";
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
 - **Accept**: plain/text

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_install_status**
> InstallStatus get_install_status()



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CrxApi;
my $api_instance = WWW::OpenAPIClient::CrxApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
);


eval { 
    my $result = $api_instance->get_install_status();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CrxApi->get_install_status: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InstallStatus**](InstallStatus.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_package_manager_servlet**
> get_package_manager_servlet()



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CrxApi;
my $api_instance = WWW::OpenAPIClient::CrxApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
);


eval { 
    $api_instance->get_package_manager_servlet();
};
if ($@) {
    warn "Exception when calling CrxApi->get_package_manager_servlet: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_package_service**
> string post_package_service(cmd => $cmd)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CrxApi;
my $api_instance = WWW::OpenAPIClient::CrxApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
);

my $cmd = "cmd_example"; # string | 

eval { 
    my $result = $api_instance->post_package_service(cmd => $cmd);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CrxApi->post_package_service: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cmd** | **string**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_package_service_json**
> string post_package_service_json(path => $path, cmd => $cmd, group_name => $group_name, package_name => $package_name, package_version => $package_version, _charset_ => $_charset_, force => $force, recursive => $recursive, package => $package)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CrxApi;
my $api_instance = WWW::OpenAPIClient::CrxApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
);

my $path = "path_example"; # string | 
my $cmd = "cmd_example"; # string | 
my $group_name = "group_name_example"; # string | 
my $package_name = "package_name_example"; # string | 
my $package_version = "package_version_example"; # string | 
my $_charset_ = "_charset__example"; # string | 
my $force = null; # boolean | 
my $recursive = null; # boolean | 
my $package = "/path/to/file"; # string | 

eval { 
    my $result = $api_instance->post_package_service_json(path => $path, cmd => $cmd, group_name => $group_name, package_name => $package_name, package_version => $package_version, _charset_ => $_charset_, force => $force, recursive => $recursive, package => $package);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CrxApi->post_package_service_json: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string**|  | 
 **cmd** | **string**|  | 
 **group_name** | **string**|  | [optional] 
 **package_name** | **string**|  | [optional] 
 **package_version** | **string**|  | [optional] 
 **_charset_** | **string**|  | [optional] 
 **force** | **boolean**|  | [optional] 
 **recursive** | **boolean**|  | [optional] 
 **package** | **string****string**|  | [optional] 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_package_update**
> string post_package_update(group_name => $group_name, package_name => $package_name, version => $version, path => $path, filter => $filter, _charset_ => $_charset_)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CrxApi;
my $api_instance = WWW::OpenAPIClient::CrxApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
);

my $group_name = "group_name_example"; # string | 
my $package_name = "package_name_example"; # string | 
my $version = "version_example"; # string | 
my $path = "path_example"; # string | 
my $filter = "filter_example"; # string | 
my $_charset_ = "_charset__example"; # string | 

eval { 
    my $result = $api_instance->post_package_update(group_name => $group_name, package_name => $package_name, version => $version, path => $path, filter => $filter, _charset_ => $_charset_);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CrxApi->post_package_update: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_name** | **string**|  | 
 **package_name** | **string**|  | 
 **version** | **string**|  | 
 **path** | **string**|  | 
 **filter** | **string**|  | [optional] 
 **_charset_** | **string**|  | [optional] 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_set_password**
> string post_set_password(old => $old, plain => $plain, verify => $verify)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CrxApi;
my $api_instance = WWW::OpenAPIClient::CrxApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
);

my $old = "old_example"; # string | 
my $plain = "plain_example"; # string | 
my $verify = "verify_example"; # string | 

eval { 
    my $result = $api_instance->post_set_password(old => $old, plain => $plain, verify => $verify);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CrxApi->post_set_password: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **old** | **string**|  | 
 **plain** | **string**|  | 
 **verify** | **string**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

