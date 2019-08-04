# WWW::OpenAPIClient::SlingApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::SlingApi;
```

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_agent**](SlingApi.md#delete_agent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**delete_node**](SlingApi.md#delete_node) | **DELETE** /{path}/{name} | 
[**get_agent**](SlingApi.md#get_agent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**get_agents**](SlingApi.md#get_agents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**get_authorizable_keystore**](SlingApi.md#get_authorizable_keystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**get_keystore**](SlingApi.md#get_keystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**get_node**](SlingApi.md#get_node) | **GET** /{path}/{name} | 
[**get_package**](SlingApi.md#get_package) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**get_package_filter**](SlingApi.md#get_package_filter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**get_query**](SlingApi.md#get_query) | **GET** /bin/querybuilder.json | 
[**get_truststore**](SlingApi.md#get_truststore) | **GET** /etc/truststore/truststore.p12 | 
[**get_truststore_info**](SlingApi.md#get_truststore_info) | **GET** /libs/granite/security/truststore.json | 
[**post_agent**](SlingApi.md#post_agent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**post_authorizable_keystore**](SlingApi.md#post_authorizable_keystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**post_authorizables**](SlingApi.md#post_authorizables) | **POST** /libs/granite/security/post/authorizables | 
[**post_config_adobe_granite_saml_authentication_handler**](SlingApi.md#post_config_adobe_granite_saml_authentication_handler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**post_config_apache_felix_jetty_based_http_service**](SlingApi.md#post_config_apache_felix_jetty_based_http_service) | **POST** /apps/system/config/org.apache.felix.http | 
[**post_config_apache_http_components_proxy_configuration**](SlingApi.md#post_config_apache_http_components_proxy_configuration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**post_config_apache_sling_dav_ex_servlet**](SlingApi.md#post_config_apache_sling_dav_ex_servlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**post_config_apache_sling_get_servlet**](SlingApi.md#post_config_apache_sling_get_servlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**post_config_apache_sling_referrer_filter**](SlingApi.md#post_config_apache_sling_referrer_filter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**post_node**](SlingApi.md#post_node) | **POST** /{path}/{name} | 
[**post_node_rw**](SlingApi.md#post_node_rw) | **POST** /{path}/{name}.rw.html | 
[**post_path**](SlingApi.md#post_path) | **POST** /{path}/ | 
[**post_query**](SlingApi.md#post_query) | **POST** /bin/querybuilder.json | 
[**post_tree_activation**](SlingApi.md#post_tree_activation) | **POST** /etc/replication/treeactivation.html | 
[**post_truststore**](SlingApi.md#post_truststore) | **POST** /libs/granite/security/post/truststore | 
[**post_truststore_pkcs12**](SlingApi.md#post_truststore_pkcs12) | **POST** /etc/truststore | 


# **delete_agent**
> delete_agent(runmode => $runmode, name => $name)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $runmode = "runmode_example"; # string | 
my $name = "name_example"; # string | 

eval { 
    $api_instance->delete_agent(runmode => $runmode, name => $name);
};
if ($@) {
    warn "Exception when calling SlingApi->delete_agent: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **string**|  | 
 **name** | **string**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_node**
> delete_node(path => $path, name => $name)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $path = "path_example"; # string | 
my $name = "name_example"; # string | 

eval { 
    $api_instance->delete_node(path => $path, name => $name);
};
if ($@) {
    warn "Exception when calling SlingApi->delete_node: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string**|  | 
 **name** | **string**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_agent**
> get_agent(runmode => $runmode, name => $name)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $runmode = "runmode_example"; # string | 
my $name = "name_example"; # string | 

eval { 
    $api_instance->get_agent(runmode => $runmode, name => $name);
};
if ($@) {
    warn "Exception when calling SlingApi->get_agent: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **string**|  | 
 **name** | **string**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_agents**
> string get_agents(runmode => $runmode)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $runmode = "runmode_example"; # string | 

eval { 
    my $result = $api_instance->get_agents(runmode => $runmode);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SlingApi->get_agents: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **string**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_authorizable_keystore**
> KeystoreInfo get_authorizable_keystore(intermediate_path => $intermediate_path, authorizable_id => $authorizable_id)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $intermediate_path = "intermediate_path_example"; # string | 
my $authorizable_id = "authorizable_id_example"; # string | 

eval { 
    my $result = $api_instance->get_authorizable_keystore(intermediate_path => $intermediate_path, authorizable_id => $authorizable_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SlingApi->get_authorizable_keystore: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate_path** | **string**|  | 
 **authorizable_id** | **string**|  | 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_keystore**
> string get_keystore(intermediate_path => $intermediate_path, authorizable_id => $authorizable_id)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $intermediate_path = "intermediate_path_example"; # string | 
my $authorizable_id = "authorizable_id_example"; # string | 

eval { 
    my $result = $api_instance->get_keystore(intermediate_path => $intermediate_path, authorizable_id => $authorizable_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SlingApi->get_keystore: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate_path** | **string**|  | 
 **authorizable_id** | **string**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_node**
> get_node(path => $path, name => $name)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $path = "path_example"; # string | 
my $name = "name_example"; # string | 

eval { 
    $api_instance->get_node(path => $path, name => $name);
};
if ($@) {
    warn "Exception when calling SlingApi->get_node: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string**|  | 
 **name** | **string**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_package**
> string get_package(group => $group, name => $name, version => $version)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $group = "group_example"; # string | 
my $name = "name_example"; # string | 
my $version = "version_example"; # string | 

eval { 
    my $result = $api_instance->get_package(group => $group, name => $name, version => $version);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SlingApi->get_package: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **string**|  | 
 **name** | **string**|  | 
 **version** | **string**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_package_filter**
> string get_package_filter(group => $group, name => $name, version => $version)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $group = "group_example"; # string | 
my $name = "name_example"; # string | 
my $version = "version_example"; # string | 

eval { 
    my $result = $api_instance->get_package_filter(group => $group, name => $name, version => $version);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SlingApi->get_package_filter: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **string**|  | 
 **name** | **string**|  | 
 **version** | **string**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_query**
> string get_query(path => $path, p/limit => $p/limit, _1_property => $_1_property, _1_property/value => $_1_property/value)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $path = "path_example"; # string | 
my $p/limit = 3.4; # double | 
my $_1_property = "_1_property_example"; # string | 
my $_1_property/value = "_1_property/value_example"; # string | 

eval { 
    my $result = $api_instance->get_query(path => $path, p/limit => $p/limit, _1_property => $_1_property, _1_property/value => $_1_property/value);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SlingApi->get_query: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string**|  | 
 **p/limit** | **double**|  | 
 **_1_property** | **string**|  | 
 **_1_property/value** | **string**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_truststore**
> string get_truststore()



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);


eval { 
    my $result = $api_instance->get_truststore();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SlingApi->get_truststore: $@\n";
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
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_truststore_info**
> TruststoreInfo get_truststore_info()



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);


eval { 
    my $result = $api_instance->get_truststore_info();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SlingApi->get_truststore_info: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TruststoreInfo**](TruststoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_agent**
> post_agent(runmode => $runmode, name => $name, jcr:content/cq:distribute => $jcr:content/cq:distribute, jcr:content/cq:distribute@type_hint => $jcr:content/cq:distribute@type_hint, jcr:content/cq:name => $jcr:content/cq:name, jcr:content/cq:template => $jcr:content/cq:template, jcr:content/enabled => $jcr:content/enabled, jcr:content/jcr:description => $jcr:content/jcr:description, jcr:content/jcr:last_modified => $jcr:content/jcr:last_modified, jcr:content/jcr:last_modified_by => $jcr:content/jcr:last_modified_by, jcr:content/jcr:mixin_types => $jcr:content/jcr:mixin_types, jcr:content/jcr:title => $jcr:content/jcr:title, jcr:content/log_level => $jcr:content/log_level, jcr:content/no_status_update => $jcr:content/no_status_update, jcr:content/no_versioning => $jcr:content/no_versioning, jcr:content/protocol_connect_timeout => $jcr:content/protocol_connect_timeout, jcr:content/protocol_http_connection_closed => $jcr:content/protocol_http_connection_closed, jcr:content/protocol_http_expired => $jcr:content/protocol_http_expired, jcr:content/protocol_http_headers => $jcr:content/protocol_http_headers, jcr:content/protocol_http_headers@type_hint => $jcr:content/protocol_http_headers@type_hint, jcr:content/protocol_http_method => $jcr:content/protocol_http_method, jcr:content/protocol_https_relaxed => $jcr:content/protocol_https_relaxed, jcr:content/protocol_interface => $jcr:content/protocol_interface, jcr:content/protocol_socket_timeout => $jcr:content/protocol_socket_timeout, jcr:content/protocol_version => $jcr:content/protocol_version, jcr:content/proxy_ntlm_domain => $jcr:content/proxy_ntlm_domain, jcr:content/proxy_ntlm_host => $jcr:content/proxy_ntlm_host, jcr:content/proxy_host => $jcr:content/proxy_host, jcr:content/proxy_password => $jcr:content/proxy_password, jcr:content/proxy_port => $jcr:content/proxy_port, jcr:content/proxy_user => $jcr:content/proxy_user, jcr:content/queue_batch_max_size => $jcr:content/queue_batch_max_size, jcr:content/queue_batch_mode => $jcr:content/queue_batch_mode, jcr:content/queue_batch_wait_time => $jcr:content/queue_batch_wait_time, jcr:content/retry_delay => $jcr:content/retry_delay, jcr:content/reverse_replication => $jcr:content/reverse_replication, jcr:content/serialization_type => $jcr:content/serialization_type, jcr:content/sling:resource_type => $jcr:content/sling:resource_type, jcr:content/ssl => $jcr:content/ssl, jcr:content/transport_ntlm_domain => $jcr:content/transport_ntlm_domain, jcr:content/transport_ntlm_host => $jcr:content/transport_ntlm_host, jcr:content/transport_password => $jcr:content/transport_password, jcr:content/transport_uri => $jcr:content/transport_uri, jcr:content/transport_user => $jcr:content/transport_user, jcr:content/trigger_distribute => $jcr:content/trigger_distribute, jcr:content/trigger_modified => $jcr:content/trigger_modified, jcr:content/trigger_on_off_time => $jcr:content/trigger_on_off_time, jcr:content/trigger_receive => $jcr:content/trigger_receive, jcr:content/trigger_specific => $jcr:content/trigger_specific, jcr:content/user_id => $jcr:content/user_id, jcr:primary_type => $jcr:primary_type, :operation => $:operation)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $runmode = "runmode_example"; # string | 
my $name = "name_example"; # string | 
my $jcr:content/cq:distribute = null; # boolean | 
my $jcr:content/cq:distribute@type_hint = "jcr:content/cq:distribute@type_hint_example"; # string | 
my $jcr:content/cq:name = "jcr:content/cq:name_example"; # string | 
my $jcr:content/cq:template = "jcr:content/cq:template_example"; # string | 
my $jcr:content/enabled = null; # boolean | 
my $jcr:content/jcr:description = "jcr:content/jcr:description_example"; # string | 
my $jcr:content/jcr:last_modified = "jcr:content/jcr:last_modified_example"; # string | 
my $jcr:content/jcr:last_modified_by = "jcr:content/jcr:last_modified_by_example"; # string | 
my $jcr:content/jcr:mixin_types = "jcr:content/jcr:mixin_types_example"; # string | 
my $jcr:content/jcr:title = "jcr:content/jcr:title_example"; # string | 
my $jcr:content/log_level = "jcr:content/log_level_example"; # string | 
my $jcr:content/no_status_update = null; # boolean | 
my $jcr:content/no_versioning = null; # boolean | 
my $jcr:content/protocol_connect_timeout = 3.4; # double | 
my $jcr:content/protocol_http_connection_closed = null; # boolean | 
my $jcr:content/protocol_http_expired = "jcr:content/protocol_http_expired_example"; # string | 
my $jcr:content/protocol_http_headers = [("inner_example")]; # ARRAY[string] | 
my $jcr:content/protocol_http_headers@type_hint = "jcr:content/protocol_http_headers@type_hint_example"; # string | 
my $jcr:content/protocol_http_method = "jcr:content/protocol_http_method_example"; # string | 
my $jcr:content/protocol_https_relaxed = null; # boolean | 
my $jcr:content/protocol_interface = "jcr:content/protocol_interface_example"; # string | 
my $jcr:content/protocol_socket_timeout = 3.4; # double | 
my $jcr:content/protocol_version = "jcr:content/protocol_version_example"; # string | 
my $jcr:content/proxy_ntlm_domain = "jcr:content/proxy_ntlm_domain_example"; # string | 
my $jcr:content/proxy_ntlm_host = "jcr:content/proxy_ntlm_host_example"; # string | 
my $jcr:content/proxy_host = "jcr:content/proxy_host_example"; # string | 
my $jcr:content/proxy_password = "jcr:content/proxy_password_example"; # string | 
my $jcr:content/proxy_port = 3.4; # double | 
my $jcr:content/proxy_user = "jcr:content/proxy_user_example"; # string | 
my $jcr:content/queue_batch_max_size = 3.4; # double | 
my $jcr:content/queue_batch_mode = "jcr:content/queue_batch_mode_example"; # string | 
my $jcr:content/queue_batch_wait_time = 3.4; # double | 
my $jcr:content/retry_delay = "jcr:content/retry_delay_example"; # string | 
my $jcr:content/reverse_replication = null; # boolean | 
my $jcr:content/serialization_type = "jcr:content/serialization_type_example"; # string | 
my $jcr:content/sling:resource_type = "jcr:content/sling:resource_type_example"; # string | 
my $jcr:content/ssl = "jcr:content/ssl_example"; # string | 
my $jcr:content/transport_ntlm_domain = "jcr:content/transport_ntlm_domain_example"; # string | 
my $jcr:content/transport_ntlm_host = "jcr:content/transport_ntlm_host_example"; # string | 
my $jcr:content/transport_password = "jcr:content/transport_password_example"; # string | 
my $jcr:content/transport_uri = "jcr:content/transport_uri_example"; # string | 
my $jcr:content/transport_user = "jcr:content/transport_user_example"; # string | 
my $jcr:content/trigger_distribute = null; # boolean | 
my $jcr:content/trigger_modified = null; # boolean | 
my $jcr:content/trigger_on_off_time = null; # boolean | 
my $jcr:content/trigger_receive = null; # boolean | 
my $jcr:content/trigger_specific = null; # boolean | 
my $jcr:content/user_id = "jcr:content/user_id_example"; # string | 
my $jcr:primary_type = "jcr:primary_type_example"; # string | 
my $:operation = ":operation_example"; # string | 

eval { 
    $api_instance->post_agent(runmode => $runmode, name => $name, jcr:content/cq:distribute => $jcr:content/cq:distribute, jcr:content/cq:distribute@type_hint => $jcr:content/cq:distribute@type_hint, jcr:content/cq:name => $jcr:content/cq:name, jcr:content/cq:template => $jcr:content/cq:template, jcr:content/enabled => $jcr:content/enabled, jcr:content/jcr:description => $jcr:content/jcr:description, jcr:content/jcr:last_modified => $jcr:content/jcr:last_modified, jcr:content/jcr:last_modified_by => $jcr:content/jcr:last_modified_by, jcr:content/jcr:mixin_types => $jcr:content/jcr:mixin_types, jcr:content/jcr:title => $jcr:content/jcr:title, jcr:content/log_level => $jcr:content/log_level, jcr:content/no_status_update => $jcr:content/no_status_update, jcr:content/no_versioning => $jcr:content/no_versioning, jcr:content/protocol_connect_timeout => $jcr:content/protocol_connect_timeout, jcr:content/protocol_http_connection_closed => $jcr:content/protocol_http_connection_closed, jcr:content/protocol_http_expired => $jcr:content/protocol_http_expired, jcr:content/protocol_http_headers => $jcr:content/protocol_http_headers, jcr:content/protocol_http_headers@type_hint => $jcr:content/protocol_http_headers@type_hint, jcr:content/protocol_http_method => $jcr:content/protocol_http_method, jcr:content/protocol_https_relaxed => $jcr:content/protocol_https_relaxed, jcr:content/protocol_interface => $jcr:content/protocol_interface, jcr:content/protocol_socket_timeout => $jcr:content/protocol_socket_timeout, jcr:content/protocol_version => $jcr:content/protocol_version, jcr:content/proxy_ntlm_domain => $jcr:content/proxy_ntlm_domain, jcr:content/proxy_ntlm_host => $jcr:content/proxy_ntlm_host, jcr:content/proxy_host => $jcr:content/proxy_host, jcr:content/proxy_password => $jcr:content/proxy_password, jcr:content/proxy_port => $jcr:content/proxy_port, jcr:content/proxy_user => $jcr:content/proxy_user, jcr:content/queue_batch_max_size => $jcr:content/queue_batch_max_size, jcr:content/queue_batch_mode => $jcr:content/queue_batch_mode, jcr:content/queue_batch_wait_time => $jcr:content/queue_batch_wait_time, jcr:content/retry_delay => $jcr:content/retry_delay, jcr:content/reverse_replication => $jcr:content/reverse_replication, jcr:content/serialization_type => $jcr:content/serialization_type, jcr:content/sling:resource_type => $jcr:content/sling:resource_type, jcr:content/ssl => $jcr:content/ssl, jcr:content/transport_ntlm_domain => $jcr:content/transport_ntlm_domain, jcr:content/transport_ntlm_host => $jcr:content/transport_ntlm_host, jcr:content/transport_password => $jcr:content/transport_password, jcr:content/transport_uri => $jcr:content/transport_uri, jcr:content/transport_user => $jcr:content/transport_user, jcr:content/trigger_distribute => $jcr:content/trigger_distribute, jcr:content/trigger_modified => $jcr:content/trigger_modified, jcr:content/trigger_on_off_time => $jcr:content/trigger_on_off_time, jcr:content/trigger_receive => $jcr:content/trigger_receive, jcr:content/trigger_specific => $jcr:content/trigger_specific, jcr:content/user_id => $jcr:content/user_id, jcr:primary_type => $jcr:primary_type, :operation => $:operation);
};
if ($@) {
    warn "Exception when calling SlingApi->post_agent: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **string**|  | 
 **name** | **string**|  | 
 **jcr:content/cq:distribute** | **boolean**|  | [optional] 
 **jcr:content/cq:distribute@type_hint** | **string**|  | [optional] 
 **jcr:content/cq:name** | **string**|  | [optional] 
 **jcr:content/cq:template** | **string**|  | [optional] 
 **jcr:content/enabled** | **boolean**|  | [optional] 
 **jcr:content/jcr:description** | **string**|  | [optional] 
 **jcr:content/jcr:last_modified** | **string**|  | [optional] 
 **jcr:content/jcr:last_modified_by** | **string**|  | [optional] 
 **jcr:content/jcr:mixin_types** | **string**|  | [optional] 
 **jcr:content/jcr:title** | **string**|  | [optional] 
 **jcr:content/log_level** | **string**|  | [optional] 
 **jcr:content/no_status_update** | **boolean**|  | [optional] 
 **jcr:content/no_versioning** | **boolean**|  | [optional] 
 **jcr:content/protocol_connect_timeout** | **double**|  | [optional] 
 **jcr:content/protocol_http_connection_closed** | **boolean**|  | [optional] 
 **jcr:content/protocol_http_expired** | **string**|  | [optional] 
 **jcr:content/protocol_http_headers** | [**ARRAY[string]**](string.md)|  | [optional] 
 **jcr:content/protocol_http_headers@type_hint** | **string**|  | [optional] 
 **jcr:content/protocol_http_method** | **string**|  | [optional] 
 **jcr:content/protocol_https_relaxed** | **boolean**|  | [optional] 
 **jcr:content/protocol_interface** | **string**|  | [optional] 
 **jcr:content/protocol_socket_timeout** | **double**|  | [optional] 
 **jcr:content/protocol_version** | **string**|  | [optional] 
 **jcr:content/proxy_ntlm_domain** | **string**|  | [optional] 
 **jcr:content/proxy_ntlm_host** | **string**|  | [optional] 
 **jcr:content/proxy_host** | **string**|  | [optional] 
 **jcr:content/proxy_password** | **string**|  | [optional] 
 **jcr:content/proxy_port** | **double**|  | [optional] 
 **jcr:content/proxy_user** | **string**|  | [optional] 
 **jcr:content/queue_batch_max_size** | **double**|  | [optional] 
 **jcr:content/queue_batch_mode** | **string**|  | [optional] 
 **jcr:content/queue_batch_wait_time** | **double**|  | [optional] 
 **jcr:content/retry_delay** | **string**|  | [optional] 
 **jcr:content/reverse_replication** | **boolean**|  | [optional] 
 **jcr:content/serialization_type** | **string**|  | [optional] 
 **jcr:content/sling:resource_type** | **string**|  | [optional] 
 **jcr:content/ssl** | **string**|  | [optional] 
 **jcr:content/transport_ntlm_domain** | **string**|  | [optional] 
 **jcr:content/transport_ntlm_host** | **string**|  | [optional] 
 **jcr:content/transport_password** | **string**|  | [optional] 
 **jcr:content/transport_uri** | **string**|  | [optional] 
 **jcr:content/transport_user** | **string**|  | [optional] 
 **jcr:content/trigger_distribute** | **boolean**|  | [optional] 
 **jcr:content/trigger_modified** | **boolean**|  | [optional] 
 **jcr:content/trigger_on_off_time** | **boolean**|  | [optional] 
 **jcr:content/trigger_receive** | **boolean**|  | [optional] 
 **jcr:content/trigger_specific** | **boolean**|  | [optional] 
 **jcr:content/user_id** | **string**|  | [optional] 
 **jcr:primary_type** | **string**|  | [optional] 
 **:operation** | **string**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_authorizable_keystore**
> KeystoreInfo post_authorizable_keystore(intermediate_path => $intermediate_path, authorizable_id => $authorizable_id, :operation => $:operation, current_password => $current_password, new_password => $new_password, re_password => $re_password, key_password => $key_password, key_store_pass => $key_store_pass, alias => $alias, new_alias => $new_alias, remove_alias => $remove_alias, cert_chain => $cert_chain, pk => $pk, key_store => $key_store)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $intermediate_path = "intermediate_path_example"; # string | 
my $authorizable_id = "authorizable_id_example"; # string | 
my $:operation = ":operation_example"; # string | 
my $current_password = "current_password_example"; # string | 
my $new_password = "new_password_example"; # string | 
my $re_password = "re_password_example"; # string | 
my $key_password = "key_password_example"; # string | 
my $key_store_pass = "key_store_pass_example"; # string | 
my $alias = "alias_example"; # string | 
my $new_alias = "new_alias_example"; # string | 
my $remove_alias = "remove_alias_example"; # string | 
my $cert_chain = "/path/to/file"; # string | 
my $pk = "/path/to/file"; # string | 
my $key_store = "/path/to/file"; # string | 

eval { 
    my $result = $api_instance->post_authorizable_keystore(intermediate_path => $intermediate_path, authorizable_id => $authorizable_id, :operation => $:operation, current_password => $current_password, new_password => $new_password, re_password => $re_password, key_password => $key_password, key_store_pass => $key_store_pass, alias => $alias, new_alias => $new_alias, remove_alias => $remove_alias, cert_chain => $cert_chain, pk => $pk, key_store => $key_store);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SlingApi->post_authorizable_keystore: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate_path** | **string**|  | 
 **authorizable_id** | **string**|  | 
 **:operation** | **string**|  | [optional] 
 **current_password** | **string**|  | [optional] 
 **new_password** | **string**|  | [optional] 
 **re_password** | **string**|  | [optional] 
 **key_password** | **string**|  | [optional] 
 **key_store_pass** | **string**|  | [optional] 
 **alias** | **string**|  | [optional] 
 **new_alias** | **string**|  | [optional] 
 **remove_alias** | **string**|  | [optional] 
 **cert_chain** | **string****string**|  | [optional] 
 **pk** | **string****string**|  | [optional] 
 **key_store** | **string****string**|  | [optional] 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_authorizables**
> string post_authorizables(authorizable_id => $authorizable_id, intermediate_path => $intermediate_path, create_user => $create_user, create_group => $create_group, rep:password => $rep:password, profile/given_name => $profile/given_name)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $authorizable_id = "authorizable_id_example"; # string | 
my $intermediate_path = "intermediate_path_example"; # string | 
my $create_user = "create_user_example"; # string | 
my $create_group = "create_group_example"; # string | 
my $rep:password = "rep:password_example"; # string | 
my $profile/given_name = "profile/given_name_example"; # string | 

eval { 
    my $result = $api_instance->post_authorizables(authorizable_id => $authorizable_id, intermediate_path => $intermediate_path, create_user => $create_user, create_group => $create_group, rep:password => $rep:password, profile/given_name => $profile/given_name);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SlingApi->post_authorizables: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizable_id** | **string**|  | 
 **intermediate_path** | **string**|  | 
 **create_user** | **string**|  | [optional] 
 **create_group** | **string**|  | [optional] 
 **rep:password** | **string**|  | [optional] 
 **profile/given_name** | **string**|  | [optional] 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_adobe_granite_saml_authentication_handler**
> post_config_adobe_granite_saml_authentication_handler(key_store_password => $key_store_password, key_store_password@type_hint => $key_store_password@type_hint, service/ranking => $service/ranking, service/ranking@type_hint => $service/ranking@type_hint, idp_http_redirect => $idp_http_redirect, idp_http_redirect@type_hint => $idp_http_redirect@type_hint, create_user => $create_user, create_user@type_hint => $create_user@type_hint, default_redirect_url => $default_redirect_url, default_redirect_url@type_hint => $default_redirect_url@type_hint, user_id_attribute => $user_id_attribute, user_id_attribute@type_hint => $user_id_attribute@type_hint, default_groups => $default_groups, default_groups@type_hint => $default_groups@type_hint, idp_cert_alias => $idp_cert_alias, idp_cert_alias@type_hint => $idp_cert_alias@type_hint, add_group_memberships => $add_group_memberships, add_group_memberships@type_hint => $add_group_memberships@type_hint, path => $path, path@type_hint => $path@type_hint, synchronize_attributes => $synchronize_attributes, synchronize_attributes@type_hint => $synchronize_attributes@type_hint, clock_tolerance => $clock_tolerance, clock_tolerance@type_hint => $clock_tolerance@type_hint, group_membership_attribute => $group_membership_attribute, group_membership_attribute@type_hint => $group_membership_attribute@type_hint, idp_url => $idp_url, idp_url@type_hint => $idp_url@type_hint, logout_url => $logout_url, logout_url@type_hint => $logout_url@type_hint, service_provider_entity_id => $service_provider_entity_id, service_provider_entity_id@type_hint => $service_provider_entity_id@type_hint, assertion_consumer_service_url => $assertion_consumer_service_url, assertion_consumer_service_url@type_hint => $assertion_consumer_service_url@type_hint, handle_logout => $handle_logout, handle_logout@type_hint => $handle_logout@type_hint, sp_private_key_alias => $sp_private_key_alias, sp_private_key_alias@type_hint => $sp_private_key_alias@type_hint, use_encryption => $use_encryption, use_encryption@type_hint => $use_encryption@type_hint, name_id_format => $name_id_format, name_id_format@type_hint => $name_id_format@type_hint, digest_method => $digest_method, digest_method@type_hint => $digest_method@type_hint, signature_method => $signature_method, signature_method@type_hint => $signature_method@type_hint, user_intermediate_path => $user_intermediate_path, user_intermediate_path@type_hint => $user_intermediate_path@type_hint)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $key_store_password = "key_store_password_example"; # string | 
my $key_store_password@type_hint = "key_store_password@type_hint_example"; # string | 
my $service/ranking = 56; # int | 
my $service/ranking@type_hint = "service/ranking@type_hint_example"; # string | 
my $idp_http_redirect = null; # boolean | 
my $idp_http_redirect@type_hint = "idp_http_redirect@type_hint_example"; # string | 
my $create_user = null; # boolean | 
my $create_user@type_hint = "create_user@type_hint_example"; # string | 
my $default_redirect_url = "default_redirect_url_example"; # string | 
my $default_redirect_url@type_hint = "default_redirect_url@type_hint_example"; # string | 
my $user_id_attribute = "user_id_attribute_example"; # string | 
my $user_id_attribute@type_hint = "user_id_attribute@type_hint_example"; # string | 
my $default_groups = [("inner_example")]; # ARRAY[string] | 
my $default_groups@type_hint = "default_groups@type_hint_example"; # string | 
my $idp_cert_alias = "idp_cert_alias_example"; # string | 
my $idp_cert_alias@type_hint = "idp_cert_alias@type_hint_example"; # string | 
my $add_group_memberships = null; # boolean | 
my $add_group_memberships@type_hint = "add_group_memberships@type_hint_example"; # string | 
my $path = [("inner_example")]; # ARRAY[string] | 
my $path@type_hint = "path@type_hint_example"; # string | 
my $synchronize_attributes = [("inner_example")]; # ARRAY[string] | 
my $synchronize_attributes@type_hint = "synchronize_attributes@type_hint_example"; # string | 
my $clock_tolerance = 56; # int | 
my $clock_tolerance@type_hint = "clock_tolerance@type_hint_example"; # string | 
my $group_membership_attribute = "group_membership_attribute_example"; # string | 
my $group_membership_attribute@type_hint = "group_membership_attribute@type_hint_example"; # string | 
my $idp_url = "idp_url_example"; # string | 
my $idp_url@type_hint = "idp_url@type_hint_example"; # string | 
my $logout_url = "logout_url_example"; # string | 
my $logout_url@type_hint = "logout_url@type_hint_example"; # string | 
my $service_provider_entity_id = "service_provider_entity_id_example"; # string | 
my $service_provider_entity_id@type_hint = "service_provider_entity_id@type_hint_example"; # string | 
my $assertion_consumer_service_url = "assertion_consumer_service_url_example"; # string | 
my $assertion_consumer_service_url@type_hint = "assertion_consumer_service_url@type_hint_example"; # string | 
my $handle_logout = null; # boolean | 
my $handle_logout@type_hint = "handle_logout@type_hint_example"; # string | 
my $sp_private_key_alias = "sp_private_key_alias_example"; # string | 
my $sp_private_key_alias@type_hint = "sp_private_key_alias@type_hint_example"; # string | 
my $use_encryption = null; # boolean | 
my $use_encryption@type_hint = "use_encryption@type_hint_example"; # string | 
my $name_id_format = "name_id_format_example"; # string | 
my $name_id_format@type_hint = "name_id_format@type_hint_example"; # string | 
my $digest_method = "digest_method_example"; # string | 
my $digest_method@type_hint = "digest_method@type_hint_example"; # string | 
my $signature_method = "signature_method_example"; # string | 
my $signature_method@type_hint = "signature_method@type_hint_example"; # string | 
my $user_intermediate_path = "user_intermediate_path_example"; # string | 
my $user_intermediate_path@type_hint = "user_intermediate_path@type_hint_example"; # string | 

eval { 
    $api_instance->post_config_adobe_granite_saml_authentication_handler(key_store_password => $key_store_password, key_store_password@type_hint => $key_store_password@type_hint, service/ranking => $service/ranking, service/ranking@type_hint => $service/ranking@type_hint, idp_http_redirect => $idp_http_redirect, idp_http_redirect@type_hint => $idp_http_redirect@type_hint, create_user => $create_user, create_user@type_hint => $create_user@type_hint, default_redirect_url => $default_redirect_url, default_redirect_url@type_hint => $default_redirect_url@type_hint, user_id_attribute => $user_id_attribute, user_id_attribute@type_hint => $user_id_attribute@type_hint, default_groups => $default_groups, default_groups@type_hint => $default_groups@type_hint, idp_cert_alias => $idp_cert_alias, idp_cert_alias@type_hint => $idp_cert_alias@type_hint, add_group_memberships => $add_group_memberships, add_group_memberships@type_hint => $add_group_memberships@type_hint, path => $path, path@type_hint => $path@type_hint, synchronize_attributes => $synchronize_attributes, synchronize_attributes@type_hint => $synchronize_attributes@type_hint, clock_tolerance => $clock_tolerance, clock_tolerance@type_hint => $clock_tolerance@type_hint, group_membership_attribute => $group_membership_attribute, group_membership_attribute@type_hint => $group_membership_attribute@type_hint, idp_url => $idp_url, idp_url@type_hint => $idp_url@type_hint, logout_url => $logout_url, logout_url@type_hint => $logout_url@type_hint, service_provider_entity_id => $service_provider_entity_id, service_provider_entity_id@type_hint => $service_provider_entity_id@type_hint, assertion_consumer_service_url => $assertion_consumer_service_url, assertion_consumer_service_url@type_hint => $assertion_consumer_service_url@type_hint, handle_logout => $handle_logout, handle_logout@type_hint => $handle_logout@type_hint, sp_private_key_alias => $sp_private_key_alias, sp_private_key_alias@type_hint => $sp_private_key_alias@type_hint, use_encryption => $use_encryption, use_encryption@type_hint => $use_encryption@type_hint, name_id_format => $name_id_format, name_id_format@type_hint => $name_id_format@type_hint, digest_method => $digest_method, digest_method@type_hint => $digest_method@type_hint, signature_method => $signature_method, signature_method@type_hint => $signature_method@type_hint, user_intermediate_path => $user_intermediate_path, user_intermediate_path@type_hint => $user_intermediate_path@type_hint);
};
if ($@) {
    warn "Exception when calling SlingApi->post_config_adobe_granite_saml_authentication_handler: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_store_password** | **string**|  | [optional] 
 **key_store_password@type_hint** | **string**|  | [optional] 
 **service/ranking** | **int**|  | [optional] 
 **service/ranking@type_hint** | **string**|  | [optional] 
 **idp_http_redirect** | **boolean**|  | [optional] 
 **idp_http_redirect@type_hint** | **string**|  | [optional] 
 **create_user** | **boolean**|  | [optional] 
 **create_user@type_hint** | **string**|  | [optional] 
 **default_redirect_url** | **string**|  | [optional] 
 **default_redirect_url@type_hint** | **string**|  | [optional] 
 **user_id_attribute** | **string**|  | [optional] 
 **user_id_attribute@type_hint** | **string**|  | [optional] 
 **default_groups** | [**ARRAY[string]**](string.md)|  | [optional] 
 **default_groups@type_hint** | **string**|  | [optional] 
 **idp_cert_alias** | **string**|  | [optional] 
 **idp_cert_alias@type_hint** | **string**|  | [optional] 
 **add_group_memberships** | **boolean**|  | [optional] 
 **add_group_memberships@type_hint** | **string**|  | [optional] 
 **path** | [**ARRAY[string]**](string.md)|  | [optional] 
 **path@type_hint** | **string**|  | [optional] 
 **synchronize_attributes** | [**ARRAY[string]**](string.md)|  | [optional] 
 **synchronize_attributes@type_hint** | **string**|  | [optional] 
 **clock_tolerance** | **int**|  | [optional] 
 **clock_tolerance@type_hint** | **string**|  | [optional] 
 **group_membership_attribute** | **string**|  | [optional] 
 **group_membership_attribute@type_hint** | **string**|  | [optional] 
 **idp_url** | **string**|  | [optional] 
 **idp_url@type_hint** | **string**|  | [optional] 
 **logout_url** | **string**|  | [optional] 
 **logout_url@type_hint** | **string**|  | [optional] 
 **service_provider_entity_id** | **string**|  | [optional] 
 **service_provider_entity_id@type_hint** | **string**|  | [optional] 
 **assertion_consumer_service_url** | **string**|  | [optional] 
 **assertion_consumer_service_url@type_hint** | **string**|  | [optional] 
 **handle_logout** | **boolean**|  | [optional] 
 **handle_logout@type_hint** | **string**|  | [optional] 
 **sp_private_key_alias** | **string**|  | [optional] 
 **sp_private_key_alias@type_hint** | **string**|  | [optional] 
 **use_encryption** | **boolean**|  | [optional] 
 **use_encryption@type_hint** | **string**|  | [optional] 
 **name_id_format** | **string**|  | [optional] 
 **name_id_format@type_hint** | **string**|  | [optional] 
 **digest_method** | **string**|  | [optional] 
 **digest_method@type_hint** | **string**|  | [optional] 
 **signature_method** | **string**|  | [optional] 
 **signature_method@type_hint** | **string**|  | [optional] 
 **user_intermediate_path** | **string**|  | [optional] 
 **user_intermediate_path@type_hint** | **string**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_felix_jetty_based_http_service**
> post_config_apache_felix_jetty_based_http_service(org/apache/felix/https/nio => $org/apache/felix/https/nio, org/apache/felix/https/nio@type_hint => $org/apache/felix/https/nio@type_hint, org/apache/felix/https/keystore => $org/apache/felix/https/keystore, org/apache/felix/https/keystore@type_hint => $org/apache/felix/https/keystore@type_hint, org/apache/felix/https/keystore/password => $org/apache/felix/https/keystore/password, org/apache/felix/https/keystore/password@type_hint => $org/apache/felix/https/keystore/password@type_hint, org/apache/felix/https/keystore/key => $org/apache/felix/https/keystore/key, org/apache/felix/https/keystore/key@type_hint => $org/apache/felix/https/keystore/key@type_hint, org/apache/felix/https/keystore/key/password => $org/apache/felix/https/keystore/key/password, org/apache/felix/https/keystore/key/password@type_hint => $org/apache/felix/https/keystore/key/password@type_hint, org/apache/felix/https/truststore => $org/apache/felix/https/truststore, org/apache/felix/https/truststore@type_hint => $org/apache/felix/https/truststore@type_hint, org/apache/felix/https/truststore/password => $org/apache/felix/https/truststore/password, org/apache/felix/https/truststore/password@type_hint => $org/apache/felix/https/truststore/password@type_hint, org/apache/felix/https/clientcertificate => $org/apache/felix/https/clientcertificate, org/apache/felix/https/clientcertificate@type_hint => $org/apache/felix/https/clientcertificate@type_hint, org/apache/felix/https/enable => $org/apache/felix/https/enable, org/apache/felix/https/enable@type_hint => $org/apache/felix/https/enable@type_hint, org/osgi/service/http/port/secure => $org/osgi/service/http/port/secure, org/osgi/service/http/port/secure@type_hint => $org/osgi/service/http/port/secure@type_hint)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $org/apache/felix/https/nio = null; # boolean | 
my $org/apache/felix/https/nio@type_hint = "org/apache/felix/https/nio@type_hint_example"; # string | 
my $org/apache/felix/https/keystore = "org/apache/felix/https/keystore_example"; # string | 
my $org/apache/felix/https/keystore@type_hint = "org/apache/felix/https/keystore@type_hint_example"; # string | 
my $org/apache/felix/https/keystore/password = "org/apache/felix/https/keystore/password_example"; # string | 
my $org/apache/felix/https/keystore/password@type_hint = "org/apache/felix/https/keystore/password@type_hint_example"; # string | 
my $org/apache/felix/https/keystore/key = "org/apache/felix/https/keystore/key_example"; # string | 
my $org/apache/felix/https/keystore/key@type_hint = "org/apache/felix/https/keystore/key@type_hint_example"; # string | 
my $org/apache/felix/https/keystore/key/password = "org/apache/felix/https/keystore/key/password_example"; # string | 
my $org/apache/felix/https/keystore/key/password@type_hint = "org/apache/felix/https/keystore/key/password@type_hint_example"; # string | 
my $org/apache/felix/https/truststore = "org/apache/felix/https/truststore_example"; # string | 
my $org/apache/felix/https/truststore@type_hint = "org/apache/felix/https/truststore@type_hint_example"; # string | 
my $org/apache/felix/https/truststore/password = "org/apache/felix/https/truststore/password_example"; # string | 
my $org/apache/felix/https/truststore/password@type_hint = "org/apache/felix/https/truststore/password@type_hint_example"; # string | 
my $org/apache/felix/https/clientcertificate = "org/apache/felix/https/clientcertificate_example"; # string | 
my $org/apache/felix/https/clientcertificate@type_hint = "org/apache/felix/https/clientcertificate@type_hint_example"; # string | 
my $org/apache/felix/https/enable = null; # boolean | 
my $org/apache/felix/https/enable@type_hint = "org/apache/felix/https/enable@type_hint_example"; # string | 
my $org/osgi/service/http/port/secure = "org/osgi/service/http/port/secure_example"; # string | 
my $org/osgi/service/http/port/secure@type_hint = "org/osgi/service/http/port/secure@type_hint_example"; # string | 

eval { 
    $api_instance->post_config_apache_felix_jetty_based_http_service(org/apache/felix/https/nio => $org/apache/felix/https/nio, org/apache/felix/https/nio@type_hint => $org/apache/felix/https/nio@type_hint, org/apache/felix/https/keystore => $org/apache/felix/https/keystore, org/apache/felix/https/keystore@type_hint => $org/apache/felix/https/keystore@type_hint, org/apache/felix/https/keystore/password => $org/apache/felix/https/keystore/password, org/apache/felix/https/keystore/password@type_hint => $org/apache/felix/https/keystore/password@type_hint, org/apache/felix/https/keystore/key => $org/apache/felix/https/keystore/key, org/apache/felix/https/keystore/key@type_hint => $org/apache/felix/https/keystore/key@type_hint, org/apache/felix/https/keystore/key/password => $org/apache/felix/https/keystore/key/password, org/apache/felix/https/keystore/key/password@type_hint => $org/apache/felix/https/keystore/key/password@type_hint, org/apache/felix/https/truststore => $org/apache/felix/https/truststore, org/apache/felix/https/truststore@type_hint => $org/apache/felix/https/truststore@type_hint, org/apache/felix/https/truststore/password => $org/apache/felix/https/truststore/password, org/apache/felix/https/truststore/password@type_hint => $org/apache/felix/https/truststore/password@type_hint, org/apache/felix/https/clientcertificate => $org/apache/felix/https/clientcertificate, org/apache/felix/https/clientcertificate@type_hint => $org/apache/felix/https/clientcertificate@type_hint, org/apache/felix/https/enable => $org/apache/felix/https/enable, org/apache/felix/https/enable@type_hint => $org/apache/felix/https/enable@type_hint, org/osgi/service/http/port/secure => $org/osgi/service/http/port/secure, org/osgi/service/http/port/secure@type_hint => $org/osgi/service/http/port/secure@type_hint);
};
if ($@) {
    warn "Exception when calling SlingApi->post_config_apache_felix_jetty_based_http_service: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org/apache/felix/https/nio** | **boolean**|  | [optional] 
 **org/apache/felix/https/nio@type_hint** | **string**|  | [optional] 
 **org/apache/felix/https/keystore** | **string**|  | [optional] 
 **org/apache/felix/https/keystore@type_hint** | **string**|  | [optional] 
 **org/apache/felix/https/keystore/password** | **string**|  | [optional] 
 **org/apache/felix/https/keystore/password@type_hint** | **string**|  | [optional] 
 **org/apache/felix/https/keystore/key** | **string**|  | [optional] 
 **org/apache/felix/https/keystore/key@type_hint** | **string**|  | [optional] 
 **org/apache/felix/https/keystore/key/password** | **string**|  | [optional] 
 **org/apache/felix/https/keystore/key/password@type_hint** | **string**|  | [optional] 
 **org/apache/felix/https/truststore** | **string**|  | [optional] 
 **org/apache/felix/https/truststore@type_hint** | **string**|  | [optional] 
 **org/apache/felix/https/truststore/password** | **string**|  | [optional] 
 **org/apache/felix/https/truststore/password@type_hint** | **string**|  | [optional] 
 **org/apache/felix/https/clientcertificate** | **string**|  | [optional] 
 **org/apache/felix/https/clientcertificate@type_hint** | **string**|  | [optional] 
 **org/apache/felix/https/enable** | **boolean**|  | [optional] 
 **org/apache/felix/https/enable@type_hint** | **string**|  | [optional] 
 **org/osgi/service/http/port/secure** | **string**|  | [optional] 
 **org/osgi/service/http/port/secure@type_hint** | **string**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_http_components_proxy_configuration**
> post_config_apache_http_components_proxy_configuration(proxy/host => $proxy/host, proxy/host@type_hint => $proxy/host@type_hint, proxy/port => $proxy/port, proxy/port@type_hint => $proxy/port@type_hint, proxy/exceptions => $proxy/exceptions, proxy/exceptions@type_hint => $proxy/exceptions@type_hint, proxy/enabled => $proxy/enabled, proxy/enabled@type_hint => $proxy/enabled@type_hint, proxy/user => $proxy/user, proxy/user@type_hint => $proxy/user@type_hint, proxy/password => $proxy/password, proxy/password@type_hint => $proxy/password@type_hint)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $proxy/host = "proxy/host_example"; # string | 
my $proxy/host@type_hint = "proxy/host@type_hint_example"; # string | 
my $proxy/port = 56; # int | 
my $proxy/port@type_hint = "proxy/port@type_hint_example"; # string | 
my $proxy/exceptions = [("inner_example")]; # ARRAY[string] | 
my $proxy/exceptions@type_hint = "proxy/exceptions@type_hint_example"; # string | 
my $proxy/enabled = null; # boolean | 
my $proxy/enabled@type_hint = "proxy/enabled@type_hint_example"; # string | 
my $proxy/user = "proxy/user_example"; # string | 
my $proxy/user@type_hint = "proxy/user@type_hint_example"; # string | 
my $proxy/password = "proxy/password_example"; # string | 
my $proxy/password@type_hint = "proxy/password@type_hint_example"; # string | 

eval { 
    $api_instance->post_config_apache_http_components_proxy_configuration(proxy/host => $proxy/host, proxy/host@type_hint => $proxy/host@type_hint, proxy/port => $proxy/port, proxy/port@type_hint => $proxy/port@type_hint, proxy/exceptions => $proxy/exceptions, proxy/exceptions@type_hint => $proxy/exceptions@type_hint, proxy/enabled => $proxy/enabled, proxy/enabled@type_hint => $proxy/enabled@type_hint, proxy/user => $proxy/user, proxy/user@type_hint => $proxy/user@type_hint, proxy/password => $proxy/password, proxy/password@type_hint => $proxy/password@type_hint);
};
if ($@) {
    warn "Exception when calling SlingApi->post_config_apache_http_components_proxy_configuration: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxy/host** | **string**|  | [optional] 
 **proxy/host@type_hint** | **string**|  | [optional] 
 **proxy/port** | **int**|  | [optional] 
 **proxy/port@type_hint** | **string**|  | [optional] 
 **proxy/exceptions** | [**ARRAY[string]**](string.md)|  | [optional] 
 **proxy/exceptions@type_hint** | **string**|  | [optional] 
 **proxy/enabled** | **boolean**|  | [optional] 
 **proxy/enabled@type_hint** | **string**|  | [optional] 
 **proxy/user** | **string**|  | [optional] 
 **proxy/user@type_hint** | **string**|  | [optional] 
 **proxy/password** | **string**|  | [optional] 
 **proxy/password@type_hint** | **string**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_sling_dav_ex_servlet**
> post_config_apache_sling_dav_ex_servlet(alias => $alias, alias@type_hint => $alias@type_hint, dav/create_absolute_uri => $dav/create_absolute_uri, dav/create_absolute_uri@type_hint => $dav/create_absolute_uri@type_hint)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $alias = "alias_example"; # string | 
my $alias@type_hint = "alias@type_hint_example"; # string | 
my $dav/create_absolute_uri = null; # boolean | 
my $dav/create_absolute_uri@type_hint = "dav/create_absolute_uri@type_hint_example"; # string | 

eval { 
    $api_instance->post_config_apache_sling_dav_ex_servlet(alias => $alias, alias@type_hint => $alias@type_hint, dav/create_absolute_uri => $dav/create_absolute_uri, dav/create_absolute_uri@type_hint => $dav/create_absolute_uri@type_hint);
};
if ($@) {
    warn "Exception when calling SlingApi->post_config_apache_sling_dav_ex_servlet: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **string**|  | [optional] 
 **alias@type_hint** | **string**|  | [optional] 
 **dav/create_absolute_uri** | **boolean**|  | [optional] 
 **dav/create_absolute_uri@type_hint** | **string**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_sling_get_servlet**
> post_config_apache_sling_get_servlet(json/maximumresults => $json/maximumresults, json/maximumresults@type_hint => $json/maximumresults@type_hint, enable/html => $enable/html, enable/html@type_hint => $enable/html@type_hint, enable/txt => $enable/txt, enable/txt@type_hint => $enable/txt@type_hint, enable/xml => $enable/xml, enable/xml@type_hint => $enable/xml@type_hint)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $json/maximumresults = "json/maximumresults_example"; # string | 
my $json/maximumresults@type_hint = "json/maximumresults@type_hint_example"; # string | 
my $enable/html = null; # boolean | 
my $enable/html@type_hint = "enable/html@type_hint_example"; # string | 
my $enable/txt = null; # boolean | 
my $enable/txt@type_hint = "enable/txt@type_hint_example"; # string | 
my $enable/xml = null; # boolean | 
my $enable/xml@type_hint = "enable/xml@type_hint_example"; # string | 

eval { 
    $api_instance->post_config_apache_sling_get_servlet(json/maximumresults => $json/maximumresults, json/maximumresults@type_hint => $json/maximumresults@type_hint, enable/html => $enable/html, enable/html@type_hint => $enable/html@type_hint, enable/txt => $enable/txt, enable/txt@type_hint => $enable/txt@type_hint, enable/xml => $enable/xml, enable/xml@type_hint => $enable/xml@type_hint);
};
if ($@) {
    warn "Exception when calling SlingApi->post_config_apache_sling_get_servlet: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **json/maximumresults** | **string**|  | [optional] 
 **json/maximumresults@type_hint** | **string**|  | [optional] 
 **enable/html** | **boolean**|  | [optional] 
 **enable/html@type_hint** | **string**|  | [optional] 
 **enable/txt** | **boolean**|  | [optional] 
 **enable/txt@type_hint** | **string**|  | [optional] 
 **enable/xml** | **boolean**|  | [optional] 
 **enable/xml@type_hint** | **string**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_sling_referrer_filter**
> post_config_apache_sling_referrer_filter(allow/empty => $allow/empty, allow/empty@type_hint => $allow/empty@type_hint, allow/hosts => $allow/hosts, allow/hosts@type_hint => $allow/hosts@type_hint, allow/hosts/regexp => $allow/hosts/regexp, allow/hosts/regexp@type_hint => $allow/hosts/regexp@type_hint, filter/methods => $filter/methods, filter/methods@type_hint => $filter/methods@type_hint)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $allow/empty = null; # boolean | 
my $allow/empty@type_hint = "allow/empty@type_hint_example"; # string | 
my $allow/hosts = "allow/hosts_example"; # string | 
my $allow/hosts@type_hint = "allow/hosts@type_hint_example"; # string | 
my $allow/hosts/regexp = "allow/hosts/regexp_example"; # string | 
my $allow/hosts/regexp@type_hint = "allow/hosts/regexp@type_hint_example"; # string | 
my $filter/methods = "filter/methods_example"; # string | 
my $filter/methods@type_hint = "filter/methods@type_hint_example"; # string | 

eval { 
    $api_instance->post_config_apache_sling_referrer_filter(allow/empty => $allow/empty, allow/empty@type_hint => $allow/empty@type_hint, allow/hosts => $allow/hosts, allow/hosts@type_hint => $allow/hosts@type_hint, allow/hosts/regexp => $allow/hosts/regexp, allow/hosts/regexp@type_hint => $allow/hosts/regexp@type_hint, filter/methods => $filter/methods, filter/methods@type_hint => $filter/methods@type_hint);
};
if ($@) {
    warn "Exception when calling SlingApi->post_config_apache_sling_referrer_filter: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allow/empty** | **boolean**|  | [optional] 
 **allow/empty@type_hint** | **string**|  | [optional] 
 **allow/hosts** | **string**|  | [optional] 
 **allow/hosts@type_hint** | **string**|  | [optional] 
 **allow/hosts/regexp** | **string**|  | [optional] 
 **allow/hosts/regexp@type_hint** | **string**|  | [optional] 
 **filter/methods** | **string**|  | [optional] 
 **filter/methods@type_hint** | **string**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_node**
> post_node(path => $path, name => $name, :operation => $:operation, delete_authorizable => $delete_authorizable, file => $file)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $path = "path_example"; # string | 
my $name = "name_example"; # string | 
my $:operation = ":operation_example"; # string | 
my $delete_authorizable = "delete_authorizable_example"; # string | 
my $file = "/path/to/file"; # string | 

eval { 
    $api_instance->post_node(path => $path, name => $name, :operation => $:operation, delete_authorizable => $delete_authorizable, file => $file);
};
if ($@) {
    warn "Exception when calling SlingApi->post_node: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string**|  | 
 **name** | **string**|  | 
 **:operation** | **string**|  | [optional] 
 **delete_authorizable** | **string**|  | [optional] 
 **file** | **string****string**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_node_rw**
> post_node_rw(path => $path, name => $name, add_members => $add_members)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $path = "path_example"; # string | 
my $name = "name_example"; # string | 
my $add_members = "add_members_example"; # string | 

eval { 
    $api_instance->post_node_rw(path => $path, name => $name, add_members => $add_members);
};
if ($@) {
    warn "Exception when calling SlingApi->post_node_rw: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string**|  | 
 **name** | **string**|  | 
 **add_members** | **string**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_path**
> post_path(path => $path, jcr:primary_type => $jcr:primary_type, :name => $:name)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $path = "path_example"; # string | 
my $jcr:primary_type = "jcr:primary_type_example"; # string | 
my $:name = ":name_example"; # string | 

eval { 
    $api_instance->post_path(path => $path, jcr:primary_type => $jcr:primary_type, :name => $:name);
};
if ($@) {
    warn "Exception when calling SlingApi->post_path: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string**|  | 
 **jcr:primary_type** | **string**|  | 
 **:name** | **string**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_query**
> string post_query(path => $path, p/limit => $p/limit, _1_property => $_1_property, _1_property/value => $_1_property/value)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $path = "path_example"; # string | 
my $p/limit = 3.4; # double | 
my $_1_property = "_1_property_example"; # string | 
my $_1_property/value = "_1_property/value_example"; # string | 

eval { 
    my $result = $api_instance->post_query(path => $path, p/limit => $p/limit, _1_property => $_1_property, _1_property/value => $_1_property/value);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SlingApi->post_query: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **string**|  | 
 **p/limit** | **double**|  | 
 **_1_property** | **string**|  | 
 **_1_property/value** | **string**|  | 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_tree_activation**
> post_tree_activation(ignoredeactivated => $ignoredeactivated, onlymodified => $onlymodified, path => $path)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $ignoredeactivated = null; # boolean | 
my $onlymodified = null; # boolean | 
my $path = "path_example"; # string | 

eval { 
    $api_instance->post_tree_activation(ignoredeactivated => $ignoredeactivated, onlymodified => $onlymodified, path => $path);
};
if ($@) {
    warn "Exception when calling SlingApi->post_tree_activation: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **boolean**|  | 
 **onlymodified** | **boolean**|  | 
 **path** | **string**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_truststore**
> string post_truststore(:operation => $:operation, new_password => $new_password, re_password => $re_password, key_store_type => $key_store_type, remove_alias => $remove_alias, certificate => $certificate)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $:operation = ":operation_example"; # string | 
my $new_password = "new_password_example"; # string | 
my $re_password = "re_password_example"; # string | 
my $key_store_type = "key_store_type_example"; # string | 
my $remove_alias = "remove_alias_example"; # string | 
my $certificate = "/path/to/file"; # string | 

eval { 
    my $result = $api_instance->post_truststore(:operation => $:operation, new_password => $new_password, re_password => $re_password, key_store_type => $key_store_type, remove_alias => $remove_alias, certificate => $certificate);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SlingApi->post_truststore: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **:operation** | **string**|  | [optional] 
 **new_password** | **string**|  | [optional] 
 **re_password** | **string**|  | [optional] 
 **key_store_type** | **string**|  | [optional] 
 **remove_alias** | **string**|  | [optional] 
 **certificate** | **string****string**|  | [optional] 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_truststore_pkcs12**
> string post_truststore_pkcs12(truststore/p12 => $truststore/p12)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SlingApi;
my $api_instance = WWW::OpenAPIClient::SlingApi->new(

    # Configure HTTP basic authorization: aemAuth
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $truststore/p12 = "/path/to/file"; # string | 

eval { 
    my $result = $api_instance->post_truststore_pkcs12(truststore/p12 => $truststore/p12);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SlingApi->post_truststore_pkcs12: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststore/p12** | **string****string**|  | [optional] 

### Return type

**string**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

