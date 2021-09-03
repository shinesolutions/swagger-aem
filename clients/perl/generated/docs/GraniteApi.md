# WWW::OpenAPIClient::GraniteApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::GraniteApi;
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ssl_setup**](GraniteApi.md#ssl_setup) | **POST** /libs/granite/security/post/sslSetup.html | 


# **ssl_setup**
> string ssl_setup(keystore_password => $keystore_password, keystore_password_confirm => $keystore_password_confirm, truststore_password => $truststore_password, truststore_password_confirm => $truststore_password_confirm, https_hostname => $https_hostname, https_port => $https_port, privatekey_file => $privatekey_file, certificate_file => $certificate_file)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::GraniteApi;
my $api_instance = WWW::OpenAPIClient::GraniteApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
    
);

my $keystore_password = "keystore_password_example"; # string | 
my $keystore_password_confirm = "keystore_password_confirm_example"; # string | 
my $truststore_password = "truststore_password_example"; # string | 
my $truststore_password_confirm = "truststore_password_confirm_example"; # string | 
my $https_hostname = "https_hostname_example"; # string | 
my $https_port = "https_port_example"; # string | 
my $privatekey_file = "/path/to/file"; # string | 
my $certificate_file = "/path/to/file"; # string | 

eval { 
    my $result = $api_instance->ssl_setup(keystore_password => $keystore_password, keystore_password_confirm => $keystore_password_confirm, truststore_password => $truststore_password, truststore_password_confirm => $truststore_password_confirm, https_hostname => $https_hostname, https_port => $https_port, privatekey_file => $privatekey_file, certificate_file => $certificate_file);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling GraniteApi->ssl_setup: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **keystore_password** | **string**|  | 
 **keystore_password_confirm** | **string**|  | 
 **truststore_password** | **string**|  | 
 **truststore_password_confirm** | **string**|  | 
 **https_hostname** | **string**|  | 
 **https_port** | **string**|  | 
 **privatekey_file** | **string****string**|  | [optional] 
 **certificate_file** | **string****string**|  | [optional] 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

