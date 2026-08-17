# SlingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteAgent**](SlingApi.md#DeleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
[**DeleteNode**](SlingApi.md#DeleteNode) | **DELETE** /{path}/{name} | 
[**GetAgent**](SlingApi.md#GetAgent) | **GET** /etc/replication/agents.{runmode}/{name} | 
[**GetAgents**](SlingApi.md#GetAgents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
[**GetAuthorizableKeystore**](SlingApi.md#GetAuthorizableKeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
[**GetKeystore**](SlingApi.md#GetKeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**GetNode**](SlingApi.md#GetNode) | **GET** /{path}/{name} | 
[**GetPackage**](SlingApi.md#GetPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
[**GetPackageFilter**](SlingApi.md#GetPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**GetQuery**](SlingApi.md#GetQuery) | **GET** /bin/querybuilder.json | 
[**GetTruststore**](SlingApi.md#GetTruststore) | **GET** /etc/truststore/truststore.p12 | 
[**GetTruststoreInfo**](SlingApi.md#GetTruststoreInfo) | **GET** /libs/granite/security/truststore.json | 
[**PostAgent**](SlingApi.md#PostAgent) | **POST** /etc/replication/agents.{runmode}/{name} | 
[**PostAuthorizableKeystore**](SlingApi.md#PostAuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
[**PostAuthorizables**](SlingApi.md#PostAuthorizables) | **POST** /libs/granite/security/post/authorizables | 
[**PostConfigAdobeGraniteSamlAuthenticationHandler**](SlingApi.md#PostConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**PostConfigApacheFelixJettyBasedHttpService**](SlingApi.md#PostConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http | 
[**PostConfigApacheHttpComponentsProxyConfiguration**](SlingApi.md#PostConfigApacheHttpComponentsProxyConfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**PostConfigApacheSlingDavExServlet**](SlingApi.md#PostConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**PostConfigApacheSlingGetServlet**](SlingApi.md#PostConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**PostConfigApacheSlingReferrerFilter**](SlingApi.md#PostConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**PostConfigProperty**](SlingApi.md#PostConfigProperty) | **POST** /apps/system/config/{configNodeName} | 
[**PostNode**](SlingApi.md#PostNode) | **POST** /{path}/{name} | 
[**PostNodeRw**](SlingApi.md#PostNodeRw) | **POST** /{path}/{name}.rw.html | 
[**PostPath**](SlingApi.md#PostPath) | **POST** /{path}/ | 
[**PostQuery**](SlingApi.md#PostQuery) | **POST** /bin/querybuilder.json | 
[**PostTreeActivation**](SlingApi.md#PostTreeActivation) | **POST** /libs/replication/treeactivation.html | 
[**PostTruststore**](SlingApi.md#PostTruststore) | **POST** /libs/granite/security/post/truststore | 
[**PostTruststorePKCS12**](SlingApi.md#PostTruststorePKCS12) | **POST** /etc/truststore | 


# **DeleteAgent**
> DeleteAgent(runmode, name)



### Example
```R
library(openapi)

# prepare function argument(s)
var_runmode <- "runmode_example" # character | 
var_name <- "name_example" # character | 

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$DeleteAgent(var_runmode, var_name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **character**|  | 
 **name** | **character**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **DeleteNode**
> DeleteNode(path, name)



### Example
```R
library(openapi)

# prepare function argument(s)
var_path <- "path_example" # character | 
var_name <- "name_example" # character | 

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$DeleteNode(var_path, var_name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **character**|  | 
 **name** | **character**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **GetAgent**
> GetAgent(runmode, name)



### Example
```R
library(openapi)

# prepare function argument(s)
var_runmode <- "runmode_example" # character | 
var_name <- "name_example" # character | 

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$GetAgent(var_runmode, var_name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **character**|  | 
 **name** | **character**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **GetAgents**
> character GetAgents(runmode)



### Example
```R
library(openapi)

# prepare function argument(s)
var_runmode <- "runmode_example" # character | 

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetAgents(var_runmodedata_file = "result.txt")
result <- api_instance$GetAgents(var_runmode)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **character**|  | 

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **GetAuthorizableKeystore**
> KeystoreInfo GetAuthorizableKeystore(intermediate_path, authorizable_id)



### Example
```R
library(openapi)

# prepare function argument(s)
var_intermediate_path <- "intermediate_path_example" # character | 
var_authorizable_id <- "authorizable_id_example" # character | 

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetAuthorizableKeystore(var_intermediate_path, var_authorizable_iddata_file = "result.txt")
result <- api_instance$GetAuthorizableKeystore(var_intermediate_path, var_authorizable_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate_path** | **character**|  | 
 **authorizable_id** | **character**|  | 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved Authorizable Keystore info |  -  |
| **0** | Default response |  -  |

# **GetKeystore**
> data.frame GetKeystore(intermediate_path, authorizable_id)



### Example
```R
library(openapi)

# prepare function argument(s)
var_intermediate_path <- "intermediate_path_example" # character | 
var_authorizable_id <- "authorizable_id_example" # character | 

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetKeystore(var_intermediate_path, var_authorizable_iddata_file = "result.txt")
result <- api_instance$GetKeystore(var_intermediate_path, var_authorizable_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate_path** | **character**|  | 
 **authorizable_id** | **character**|  | 

### Return type

**data.frame**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **GetNode**
> GetNode(path, name)



### Example
```R
library(openapi)

# prepare function argument(s)
var_path <- "path_example" # character | 
var_name <- "name_example" # character | 

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$GetNode(var_path, var_name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **character**|  | 
 **name** | **character**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **GetPackage**
> data.frame GetPackage(group, name, version)



### Example
```R
library(openapi)

# prepare function argument(s)
var_group <- "group_example" # character | 
var_name <- "name_example" # character | 
var_version <- "version_example" # character | 

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetPackage(var_group, var_name, var_versiondata_file = "result.txt")
result <- api_instance$GetPackage(var_group, var_name, var_version)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **character**|  | 
 **name** | **character**|  | 
 **version** | **character**|  | 

### Return type

**data.frame**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **GetPackageFilter**
> character GetPackageFilter(group, name, version)



### Example
```R
library(openapi)

# prepare function argument(s)
var_group <- "group_example" # character | 
var_name <- "name_example" # character | 
var_version <- "version_example" # character | 

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetPackageFilter(var_group, var_name, var_versiondata_file = "result.txt")
result <- api_instance$GetPackageFilter(var_group, var_name, var_version)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **character**|  | 
 **name** | **character**|  | 
 **version** | **character**|  | 

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **GetQuery**
> character GetQuery(path, p_limit, var_1_property, var_1_property_value)



### Example
```R
library(openapi)

# prepare function argument(s)
var_path <- "path_example" # character | 
var_p_limit <- 3.4 # numeric | 
var_var_1_property <- "var_1_property_example" # character | 
var_var_1_property_value <- "var_1_property_value_example" # character | 

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetQuery(var_path, var_p_limit, var_var_1_property, var_var_1_property_valuedata_file = "result.txt")
result <- api_instance$GetQuery(var_path, var_p_limit, var_var_1_property, var_var_1_property_value)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **character**|  | 
 **p_limit** | **numeric**|  | 
 **var_1_property** | **character**|  | 
 **var_1_property_value** | **character**|  | 

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **GetTruststore**
> data.frame GetTruststore()



### Example
```R
library(openapi)


api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetTruststore(data_file = "result.txt")
result <- api_instance$GetTruststore()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**data.frame**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **GetTruststoreInfo**
> TruststoreInfo GetTruststoreInfo()



### Example
```R
library(openapi)


api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetTruststoreInfo(data_file = "result.txt")
result <- api_instance$GetTruststoreInfo()
dput(result)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved AEM Truststore info |  -  |
| **0** | Default response |  -  |

# **PostAgent**
> PostAgent(runmode, name, jcr_content_cq_distribute = var.jcr_content_cq_distribute, jcr_content_cq_distribute_type_hint = var.jcr_content_cq_distribute_type_hint, jcr_content_cq_name = var.jcr_content_cq_name, jcr_content_cq_template = var.jcr_content_cq_template, jcr_content_alias_update = var.jcr_content_alias_update, jcr_content_enabled = var.jcr_content_enabled, jcr_content_jcr_description = var.jcr_content_jcr_description, jcr_content_jcr_last_modified = var.jcr_content_jcr_last_modified, jcr_content_jcr_last_modified_by = var.jcr_content_jcr_last_modified_by, jcr_content_jcr_mixin_types = var.jcr_content_jcr_mixin_types, jcr_content_jcr_title = var.jcr_content_jcr_title, jcr_content_log_level = var.jcr_content_log_level, jcr_content_no_status_update = var.jcr_content_no_status_update, jcr_content_no_versioning = var.jcr_content_no_versioning, jcr_content_protocol_connect_timeout = var.jcr_content_protocol_connect_timeout, jcr_content_protocol_http_connection_closed = var.jcr_content_protocol_http_connection_closed, jcr_content_protocol_http_expired = var.jcr_content_protocol_http_expired, jcr_content_protocol_http_headers = var.jcr_content_protocol_http_headers, jcr_content_protocol_http_headers_type_hint = var.jcr_content_protocol_http_headers_type_hint, jcr_content_protocol_http_method = var.jcr_content_protocol_http_method, jcr_content_protocol_https_relaxed = var.jcr_content_protocol_https_relaxed, jcr_content_protocol_interface = var.jcr_content_protocol_interface, jcr_content_protocol_socket_timeout = var.jcr_content_protocol_socket_timeout, jcr_content_protocol_version = var.jcr_content_protocol_version, jcr_content_proxy_ntlm_domain = var.jcr_content_proxy_ntlm_domain, jcr_content_proxy_ntlm_host = var.jcr_content_proxy_ntlm_host, jcr_content_proxy_host = var.jcr_content_proxy_host, jcr_content_proxy_password = var.jcr_content_proxy_password, jcr_content_proxy_port = var.jcr_content_proxy_port, jcr_content_proxy_user = var.jcr_content_proxy_user, jcr_content_queue_batch_max_size = var.jcr_content_queue_batch_max_size, jcr_content_queue_batch_mode = var.jcr_content_queue_batch_mode, jcr_content_queue_batch_wait_time = var.jcr_content_queue_batch_wait_time, jcr_content_retry_delay = var.jcr_content_retry_delay, jcr_content_reverse_replication = var.jcr_content_reverse_replication, jcr_content_serialization_type = var.jcr_content_serialization_type, jcr_content_sling_resource_type = var.jcr_content_sling_resource_type, jcr_content_ssl = var.jcr_content_ssl, jcr_content_transport_ntlm_domain = var.jcr_content_transport_ntlm_domain, jcr_content_transport_ntlm_host = var.jcr_content_transport_ntlm_host, jcr_content_transport_password = var.jcr_content_transport_password, jcr_content_transport_uri = var.jcr_content_transport_uri, jcr_content_transport_user = var.jcr_content_transport_user, jcr_content_trigger_distribute = var.jcr_content_trigger_distribute, jcr_content_trigger_modified = var.jcr_content_trigger_modified, jcr_content_trigger_on_off_time = var.jcr_content_trigger_on_off_time, jcr_content_trigger_receive = var.jcr_content_trigger_receive, jcr_content_trigger_specific = var.jcr_content_trigger_specific, jcr_content_user_id = var.jcr_content_user_id, jcr_primary_type = var.jcr_primary_type, _operation = var._operation)



### Example
```R
library(openapi)

# prepare function argument(s)
var_runmode <- "runmode_example" # character | 
var_name <- "name_example" # character | 
var_jcr_content_cq_distribute <- "jcr_content_cq_distribute_example" # character |  (Optional)
var_jcr_content_cq_distribute_type_hint <- "jcr_content_cq_distribute_type_hint_example" # character |  (Optional)
var_jcr_content_cq_name <- "jcr_content_cq_name_example" # character |  (Optional)
var_jcr_content_cq_template <- "jcr_content_cq_template_example" # character |  (Optional)
var_jcr_content_alias_update <- "jcr_content_alias_update_example" # character |  (Optional)
var_jcr_content_enabled <- "jcr_content_enabled_example" # character |  (Optional)
var_jcr_content_jcr_description <- "jcr_content_jcr_description_example" # character |  (Optional)
var_jcr_content_jcr_last_modified <- "jcr_content_jcr_last_modified_example" # character |  (Optional)
var_jcr_content_jcr_last_modified_by <- "jcr_content_jcr_last_modified_by_example" # character |  (Optional)
var_jcr_content_jcr_mixin_types <- "jcr_content_jcr_mixin_types_example" # character |  (Optional)
var_jcr_content_jcr_title <- "jcr_content_jcr_title_example" # character |  (Optional)
var_jcr_content_log_level <- "jcr_content_log_level_example" # character |  (Optional)
var_jcr_content_no_status_update <- "jcr_content_no_status_update_example" # character |  (Optional)
var_jcr_content_no_versioning <- "jcr_content_no_versioning_example" # character |  (Optional)
var_jcr_content_protocol_connect_timeout <- 3.4 # numeric |  (Optional)
var_jcr_content_protocol_http_connection_closed <- "jcr_content_protocol_http_connection_closed_example" # character |  (Optional)
var_jcr_content_protocol_http_expired <- "jcr_content_protocol_http_expired_example" # character |  (Optional)
var_jcr_content_protocol_http_headers <- c("inner_example") # array[character] |  (Optional)
var_jcr_content_protocol_http_headers_type_hint <- "jcr_content_protocol_http_headers_type_hint_example" # character |  (Optional)
var_jcr_content_protocol_http_method <- "jcr_content_protocol_http_method_example" # character |  (Optional)
var_jcr_content_protocol_https_relaxed <- "jcr_content_protocol_https_relaxed_example" # character |  (Optional)
var_jcr_content_protocol_interface <- "jcr_content_protocol_interface_example" # character |  (Optional)
var_jcr_content_protocol_socket_timeout <- 3.4 # numeric |  (Optional)
var_jcr_content_protocol_version <- "jcr_content_protocol_version_example" # character |  (Optional)
var_jcr_content_proxy_ntlm_domain <- "jcr_content_proxy_ntlm_domain_example" # character |  (Optional)
var_jcr_content_proxy_ntlm_host <- "jcr_content_proxy_ntlm_host_example" # character |  (Optional)
var_jcr_content_proxy_host <- "jcr_content_proxy_host_example" # character |  (Optional)
var_jcr_content_proxy_password <- "jcr_content_proxy_password_example" # character |  (Optional)
var_jcr_content_proxy_port <- 3.4 # numeric |  (Optional)
var_jcr_content_proxy_user <- "jcr_content_proxy_user_example" # character |  (Optional)
var_jcr_content_queue_batch_max_size <- 3.4 # numeric |  (Optional)
var_jcr_content_queue_batch_mode <- "jcr_content_queue_batch_mode_example" # character |  (Optional)
var_jcr_content_queue_batch_wait_time <- 3.4 # numeric |  (Optional)
var_jcr_content_retry_delay <- "jcr_content_retry_delay_example" # character |  (Optional)
var_jcr_content_reverse_replication <- "jcr_content_reverse_replication_example" # character |  (Optional)
var_jcr_content_serialization_type <- "jcr_content_serialization_type_example" # character |  (Optional)
var_jcr_content_sling_resource_type <- "jcr_content_sling_resource_type_example" # character |  (Optional)
var_jcr_content_ssl <- "jcr_content_ssl_example" # character |  (Optional)
var_jcr_content_transport_ntlm_domain <- "jcr_content_transport_ntlm_domain_example" # character |  (Optional)
var_jcr_content_transport_ntlm_host <- "jcr_content_transport_ntlm_host_example" # character |  (Optional)
var_jcr_content_transport_password <- "jcr_content_transport_password_example" # character |  (Optional)
var_jcr_content_transport_uri <- "jcr_content_transport_uri_example" # character |  (Optional)
var_jcr_content_transport_user <- "jcr_content_transport_user_example" # character |  (Optional)
var_jcr_content_trigger_distribute <- "jcr_content_trigger_distribute_example" # character |  (Optional)
var_jcr_content_trigger_modified <- "jcr_content_trigger_modified_example" # character |  (Optional)
var_jcr_content_trigger_on_off_time <- "jcr_content_trigger_on_off_time_example" # character |  (Optional)
var_jcr_content_trigger_receive <- "jcr_content_trigger_receive_example" # character |  (Optional)
var_jcr_content_trigger_specific <- "jcr_content_trigger_specific_example" # character |  (Optional)
var_jcr_content_user_id <- "jcr_content_user_id_example" # character |  (Optional)
var_jcr_primary_type <- "jcr_primary_type_example" # character |  (Optional)
var__operation <- "_operation_example" # character |  (Optional)

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$PostAgent(var_runmode, var_name, jcr_content_cq_distribute = var_jcr_content_cq_distribute, jcr_content_cq_distribute_type_hint = var_jcr_content_cq_distribute_type_hint, jcr_content_cq_name = var_jcr_content_cq_name, jcr_content_cq_template = var_jcr_content_cq_template, jcr_content_alias_update = var_jcr_content_alias_update, jcr_content_enabled = var_jcr_content_enabled, jcr_content_jcr_description = var_jcr_content_jcr_description, jcr_content_jcr_last_modified = var_jcr_content_jcr_last_modified, jcr_content_jcr_last_modified_by = var_jcr_content_jcr_last_modified_by, jcr_content_jcr_mixin_types = var_jcr_content_jcr_mixin_types, jcr_content_jcr_title = var_jcr_content_jcr_title, jcr_content_log_level = var_jcr_content_log_level, jcr_content_no_status_update = var_jcr_content_no_status_update, jcr_content_no_versioning = var_jcr_content_no_versioning, jcr_content_protocol_connect_timeout = var_jcr_content_protocol_connect_timeout, jcr_content_protocol_http_connection_closed = var_jcr_content_protocol_http_connection_closed, jcr_content_protocol_http_expired = var_jcr_content_protocol_http_expired, jcr_content_protocol_http_headers = var_jcr_content_protocol_http_headers, jcr_content_protocol_http_headers_type_hint = var_jcr_content_protocol_http_headers_type_hint, jcr_content_protocol_http_method = var_jcr_content_protocol_http_method, jcr_content_protocol_https_relaxed = var_jcr_content_protocol_https_relaxed, jcr_content_protocol_interface = var_jcr_content_protocol_interface, jcr_content_protocol_socket_timeout = var_jcr_content_protocol_socket_timeout, jcr_content_protocol_version = var_jcr_content_protocol_version, jcr_content_proxy_ntlm_domain = var_jcr_content_proxy_ntlm_domain, jcr_content_proxy_ntlm_host = var_jcr_content_proxy_ntlm_host, jcr_content_proxy_host = var_jcr_content_proxy_host, jcr_content_proxy_password = var_jcr_content_proxy_password, jcr_content_proxy_port = var_jcr_content_proxy_port, jcr_content_proxy_user = var_jcr_content_proxy_user, jcr_content_queue_batch_max_size = var_jcr_content_queue_batch_max_size, jcr_content_queue_batch_mode = var_jcr_content_queue_batch_mode, jcr_content_queue_batch_wait_time = var_jcr_content_queue_batch_wait_time, jcr_content_retry_delay = var_jcr_content_retry_delay, jcr_content_reverse_replication = var_jcr_content_reverse_replication, jcr_content_serialization_type = var_jcr_content_serialization_type, jcr_content_sling_resource_type = var_jcr_content_sling_resource_type, jcr_content_ssl = var_jcr_content_ssl, jcr_content_transport_ntlm_domain = var_jcr_content_transport_ntlm_domain, jcr_content_transport_ntlm_host = var_jcr_content_transport_ntlm_host, jcr_content_transport_password = var_jcr_content_transport_password, jcr_content_transport_uri = var_jcr_content_transport_uri, jcr_content_transport_user = var_jcr_content_transport_user, jcr_content_trigger_distribute = var_jcr_content_trigger_distribute, jcr_content_trigger_modified = var_jcr_content_trigger_modified, jcr_content_trigger_on_off_time = var_jcr_content_trigger_on_off_time, jcr_content_trigger_receive = var_jcr_content_trigger_receive, jcr_content_trigger_specific = var_jcr_content_trigger_specific, jcr_content_user_id = var_jcr_content_user_id, jcr_primary_type = var_jcr_primary_type, _operation = var__operation)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **character**|  | 
 **name** | **character**|  | 
 **jcr_content_cq_distribute** | **character**|  | [optional] 
 **jcr_content_cq_distribute_type_hint** | **character**|  | [optional] 
 **jcr_content_cq_name** | **character**|  | [optional] 
 **jcr_content_cq_template** | **character**|  | [optional] 
 **jcr_content_alias_update** | **character**|  | [optional] 
 **jcr_content_enabled** | **character**|  | [optional] 
 **jcr_content_jcr_description** | **character**|  | [optional] 
 **jcr_content_jcr_last_modified** | **character**|  | [optional] 
 **jcr_content_jcr_last_modified_by** | **character**|  | [optional] 
 **jcr_content_jcr_mixin_types** | **character**|  | [optional] 
 **jcr_content_jcr_title** | **character**|  | [optional] 
 **jcr_content_log_level** | **character**|  | [optional] 
 **jcr_content_no_status_update** | **character**|  | [optional] 
 **jcr_content_no_versioning** | **character**|  | [optional] 
 **jcr_content_protocol_connect_timeout** | **numeric**|  | [optional] 
 **jcr_content_protocol_http_connection_closed** | **character**|  | [optional] 
 **jcr_content_protocol_http_expired** | **character**|  | [optional] 
 **jcr_content_protocol_http_headers** | list( **character** )|  | [optional] 
 **jcr_content_protocol_http_headers_type_hint** | **character**|  | [optional] 
 **jcr_content_protocol_http_method** | **character**|  | [optional] 
 **jcr_content_protocol_https_relaxed** | **character**|  | [optional] 
 **jcr_content_protocol_interface** | **character**|  | [optional] 
 **jcr_content_protocol_socket_timeout** | **numeric**|  | [optional] 
 **jcr_content_protocol_version** | **character**|  | [optional] 
 **jcr_content_proxy_ntlm_domain** | **character**|  | [optional] 
 **jcr_content_proxy_ntlm_host** | **character**|  | [optional] 
 **jcr_content_proxy_host** | **character**|  | [optional] 
 **jcr_content_proxy_password** | **character**|  | [optional] 
 **jcr_content_proxy_port** | **numeric**|  | [optional] 
 **jcr_content_proxy_user** | **character**|  | [optional] 
 **jcr_content_queue_batch_max_size** | **numeric**|  | [optional] 
 **jcr_content_queue_batch_mode** | **character**|  | [optional] 
 **jcr_content_queue_batch_wait_time** | **numeric**|  | [optional] 
 **jcr_content_retry_delay** | **character**|  | [optional] 
 **jcr_content_reverse_replication** | **character**|  | [optional] 
 **jcr_content_serialization_type** | **character**|  | [optional] 
 **jcr_content_sling_resource_type** | **character**|  | [optional] 
 **jcr_content_ssl** | **character**|  | [optional] 
 **jcr_content_transport_ntlm_domain** | **character**|  | [optional] 
 **jcr_content_transport_ntlm_host** | **character**|  | [optional] 
 **jcr_content_transport_password** | **character**|  | [optional] 
 **jcr_content_transport_uri** | **character**|  | [optional] 
 **jcr_content_transport_user** | **character**|  | [optional] 
 **jcr_content_trigger_distribute** | **character**|  | [optional] 
 **jcr_content_trigger_modified** | **character**|  | [optional] 
 **jcr_content_trigger_on_off_time** | **character**|  | [optional] 
 **jcr_content_trigger_receive** | **character**|  | [optional] 
 **jcr_content_trigger_specific** | **character**|  | [optional] 
 **jcr_content_user_id** | **character**|  | [optional] 
 **jcr_primary_type** | **character**|  | [optional] 
 **_operation** | **character**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostAuthorizableKeystore**
> KeystoreInfo PostAuthorizableKeystore(intermediate_path, authorizable_id, _operation = var._operation, current_password = var.current_password, new_password = var.new_password, re_password = var.re_password, key_password = var.key_password, key_store_pass = var.key_store_pass, alias = var.alias, new_alias = var.new_alias, remove_alias = var.remove_alias, cert_chain = var.cert_chain, pk = var.pk, key_store = var.key_store)



### Example
```R
library(openapi)

# prepare function argument(s)
var_intermediate_path <- "intermediate_path_example" # character | 
var_authorizable_id <- "authorizable_id_example" # character | 
var__operation <- "_operation_example" # character |  (Optional)
var_current_password <- "current_password_example" # character |  (Optional)
var_new_password <- "new_password_example" # character |  (Optional)
var_re_password <- "re_password_example" # character |  (Optional)
var_key_password <- "key_password_example" # character |  (Optional)
var_key_store_pass <- "key_store_pass_example" # character |  (Optional)
var_alias <- "alias_example" # character |  (Optional)
var_new_alias <- "new_alias_example" # character |  (Optional)
var_remove_alias <- "remove_alias_example" # character |  (Optional)
var_cert_chain <- File.new('/path/to/file') # data.frame |  (Optional)
var_pk <- File.new('/path/to/file') # data.frame |  (Optional)
var_key_store <- File.new('/path/to/file') # data.frame |  (Optional)

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PostAuthorizableKeystore(var_intermediate_path, var_authorizable_id, _operation = var__operation, current_password = var_current_password, new_password = var_new_password, re_password = var_re_password, key_password = var_key_password, key_store_pass = var_key_store_pass, alias = var_alias, new_alias = var_new_alias, remove_alias = var_remove_alias, cert_chain = var_cert_chain, pk = var_pk, key_store = var_key_storedata_file = "result.txt")
result <- api_instance$PostAuthorizableKeystore(var_intermediate_path, var_authorizable_id, _operation = var__operation, current_password = var_current_password, new_password = var_new_password, re_password = var_re_password, key_password = var_key_password, key_store_pass = var_key_store_pass, alias = var_alias, new_alias = var_new_alias, remove_alias = var_remove_alias, cert_chain = var_cert_chain, pk = var_pk, key_store = var_key_store)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate_path** | **character**|  | 
 **authorizable_id** | **character**|  | 
 **_operation** | **character**|  | [optional] 
 **current_password** | **character**|  | [optional] 
 **new_password** | **character**|  | [optional] 
 **re_password** | **character**|  | [optional] 
 **key_password** | **character**|  | [optional] 
 **key_store_pass** | **character**|  | [optional] 
 **alias** | **character**|  | [optional] 
 **new_alias** | **character**|  | [optional] 
 **remove_alias** | **character**|  | [optional] 
 **cert_chain** | **data.frame**|  | [optional] 
 **pk** | **data.frame**|  | [optional] 
 **key_store** | **data.frame**|  | [optional] 

### Return type

[**KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved Authorizable Keystore info |  -  |
| **0** | Default response |  -  |

# **PostAuthorizables**
> character PostAuthorizables(authorizable_id, intermediate_path, create_user = var.create_user, create_group = var.create_group, rep_password = var.rep_password, profile_given_name = var.profile_given_name)



### Example
```R
library(openapi)

# prepare function argument(s)
var_authorizable_id <- "authorizable_id_example" # character | 
var_intermediate_path <- "intermediate_path_example" # character | 
var_create_user <- "create_user_example" # character |  (Optional)
var_create_group <- "create_group_example" # character |  (Optional)
var_rep_password <- "rep_password_example" # character |  (Optional)
var_profile_given_name <- "profile_given_name_example" # character |  (Optional)

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PostAuthorizables(var_authorizable_id, var_intermediate_path, create_user = var_create_user, create_group = var_create_group, rep_password = var_rep_password, profile_given_name = var_profile_given_namedata_file = "result.txt")
result <- api_instance$PostAuthorizables(var_authorizable_id, var_intermediate_path, create_user = var_create_user, create_group = var_create_group, rep_password = var_rep_password, profile_given_name = var_profile_given_name)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizable_id** | **character**|  | 
 **intermediate_path** | **character**|  | 
 **create_user** | **character**|  | [optional] 
 **create_group** | **character**|  | [optional] 
 **rep_password** | **character**|  | [optional] 
 **profile_given_name** | **character**|  | [optional] 

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostConfigAdobeGraniteSamlAuthenticationHandler**
> PostConfigAdobeGraniteSamlAuthenticationHandler(key_store_password = var.key_store_password, key_store_password_type_hint = var.key_store_password_type_hint, service_ranking = var.service_ranking, service_ranking_type_hint = var.service_ranking_type_hint, idp_http_redirect = var.idp_http_redirect, idp_http_redirect_type_hint = var.idp_http_redirect_type_hint, create_user = var.create_user, create_user_type_hint = var.create_user_type_hint, default_redirect_url = var.default_redirect_url, default_redirect_url_type_hint = var.default_redirect_url_type_hint, user_id_attribute = var.user_id_attribute, user_id_attribute_type_hint = var.user_id_attribute_type_hint, default_groups = var.default_groups, default_groups_type_hint = var.default_groups_type_hint, idp_cert_alias = var.idp_cert_alias, idp_cert_alias_type_hint = var.idp_cert_alias_type_hint, add_group_memberships = var.add_group_memberships, add_group_memberships_type_hint = var.add_group_memberships_type_hint, path = var.path, path_type_hint = var.path_type_hint, synchronize_attributes = var.synchronize_attributes, synchronize_attributes_type_hint = var.synchronize_attributes_type_hint, clock_tolerance = var.clock_tolerance, clock_tolerance_type_hint = var.clock_tolerance_type_hint, group_membership_attribute = var.group_membership_attribute, group_membership_attribute_type_hint = var.group_membership_attribute_type_hint, idp_url = var.idp_url, idp_url_type_hint = var.idp_url_type_hint, logout_url = var.logout_url, logout_url_type_hint = var.logout_url_type_hint, service_provider_entity_id = var.service_provider_entity_id, service_provider_entity_id_type_hint = var.service_provider_entity_id_type_hint, assertion_consumer_service_url = var.assertion_consumer_service_url, assertion_consumer_service_url_type_hint = var.assertion_consumer_service_url_type_hint, handle_logout = var.handle_logout, handle_logout_type_hint = var.handle_logout_type_hint, sp_private_key_alias = var.sp_private_key_alias, sp_private_key_alias_type_hint = var.sp_private_key_alias_type_hint, use_encryption = var.use_encryption, use_encryption_type_hint = var.use_encryption_type_hint, name_id_format = var.name_id_format, name_id_format_type_hint = var.name_id_format_type_hint, digest_method = var.digest_method, digest_method_type_hint = var.digest_method_type_hint, signature_method = var.signature_method, signature_method_type_hint = var.signature_method_type_hint, user_intermediate_path = var.user_intermediate_path, user_intermediate_path_type_hint = var.user_intermediate_path_type_hint)



### Example
```R
library(openapi)

# prepare function argument(s)
var_key_store_password <- "key_store_password_example" # character |  (Optional)
var_key_store_password_type_hint <- "key_store_password_type_hint_example" # character |  (Optional)
var_service_ranking <- 56 # integer |  (Optional)
var_service_ranking_type_hint <- "service_ranking_type_hint_example" # character |  (Optional)
var_idp_http_redirect <- "idp_http_redirect_example" # character |  (Optional)
var_idp_http_redirect_type_hint <- "idp_http_redirect_type_hint_example" # character |  (Optional)
var_create_user <- "create_user_example" # character |  (Optional)
var_create_user_type_hint <- "create_user_type_hint_example" # character |  (Optional)
var_default_redirect_url <- "default_redirect_url_example" # character |  (Optional)
var_default_redirect_url_type_hint <- "default_redirect_url_type_hint_example" # character |  (Optional)
var_user_id_attribute <- "user_id_attribute_example" # character |  (Optional)
var_user_id_attribute_type_hint <- "user_id_attribute_type_hint_example" # character |  (Optional)
var_default_groups <- c("inner_example") # array[character] |  (Optional)
var_default_groups_type_hint <- "default_groups_type_hint_example" # character |  (Optional)
var_idp_cert_alias <- "idp_cert_alias_example" # character |  (Optional)
var_idp_cert_alias_type_hint <- "idp_cert_alias_type_hint_example" # character |  (Optional)
var_add_group_memberships <- "add_group_memberships_example" # character |  (Optional)
var_add_group_memberships_type_hint <- "add_group_memberships_type_hint_example" # character |  (Optional)
var_path <- c("inner_example") # array[character] |  (Optional)
var_path_type_hint <- "path_type_hint_example" # character |  (Optional)
var_synchronize_attributes <- c("inner_example") # array[character] |  (Optional)
var_synchronize_attributes_type_hint <- "synchronize_attributes_type_hint_example" # character |  (Optional)
var_clock_tolerance <- 56 # integer |  (Optional)
var_clock_tolerance_type_hint <- "clock_tolerance_type_hint_example" # character |  (Optional)
var_group_membership_attribute <- "group_membership_attribute_example" # character |  (Optional)
var_group_membership_attribute_type_hint <- "group_membership_attribute_type_hint_example" # character |  (Optional)
var_idp_url <- "idp_url_example" # character |  (Optional)
var_idp_url_type_hint <- "idp_url_type_hint_example" # character |  (Optional)
var_logout_url <- "logout_url_example" # character |  (Optional)
var_logout_url_type_hint <- "logout_url_type_hint_example" # character |  (Optional)
var_service_provider_entity_id <- "service_provider_entity_id_example" # character |  (Optional)
var_service_provider_entity_id_type_hint <- "service_provider_entity_id_type_hint_example" # character |  (Optional)
var_assertion_consumer_service_url <- "assertion_consumer_service_url_example" # character |  (Optional)
var_assertion_consumer_service_url_type_hint <- "assertion_consumer_service_url_type_hint_example" # character |  (Optional)
var_handle_logout <- "handle_logout_example" # character |  (Optional)
var_handle_logout_type_hint <- "handle_logout_type_hint_example" # character |  (Optional)
var_sp_private_key_alias <- "sp_private_key_alias_example" # character |  (Optional)
var_sp_private_key_alias_type_hint <- "sp_private_key_alias_type_hint_example" # character |  (Optional)
var_use_encryption <- "use_encryption_example" # character |  (Optional)
var_use_encryption_type_hint <- "use_encryption_type_hint_example" # character |  (Optional)
var_name_id_format <- "name_id_format_example" # character |  (Optional)
var_name_id_format_type_hint <- "name_id_format_type_hint_example" # character |  (Optional)
var_digest_method <- "digest_method_example" # character |  (Optional)
var_digest_method_type_hint <- "digest_method_type_hint_example" # character |  (Optional)
var_signature_method <- "signature_method_example" # character |  (Optional)
var_signature_method_type_hint <- "signature_method_type_hint_example" # character |  (Optional)
var_user_intermediate_path <- "user_intermediate_path_example" # character |  (Optional)
var_user_intermediate_path_type_hint <- "user_intermediate_path_type_hint_example" # character |  (Optional)

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$PostConfigAdobeGraniteSamlAuthenticationHandler(key_store_password = var_key_store_password, key_store_password_type_hint = var_key_store_password_type_hint, service_ranking = var_service_ranking, service_ranking_type_hint = var_service_ranking_type_hint, idp_http_redirect = var_idp_http_redirect, idp_http_redirect_type_hint = var_idp_http_redirect_type_hint, create_user = var_create_user, create_user_type_hint = var_create_user_type_hint, default_redirect_url = var_default_redirect_url, default_redirect_url_type_hint = var_default_redirect_url_type_hint, user_id_attribute = var_user_id_attribute, user_id_attribute_type_hint = var_user_id_attribute_type_hint, default_groups = var_default_groups, default_groups_type_hint = var_default_groups_type_hint, idp_cert_alias = var_idp_cert_alias, idp_cert_alias_type_hint = var_idp_cert_alias_type_hint, add_group_memberships = var_add_group_memberships, add_group_memberships_type_hint = var_add_group_memberships_type_hint, path = var_path, path_type_hint = var_path_type_hint, synchronize_attributes = var_synchronize_attributes, synchronize_attributes_type_hint = var_synchronize_attributes_type_hint, clock_tolerance = var_clock_tolerance, clock_tolerance_type_hint = var_clock_tolerance_type_hint, group_membership_attribute = var_group_membership_attribute, group_membership_attribute_type_hint = var_group_membership_attribute_type_hint, idp_url = var_idp_url, idp_url_type_hint = var_idp_url_type_hint, logout_url = var_logout_url, logout_url_type_hint = var_logout_url_type_hint, service_provider_entity_id = var_service_provider_entity_id, service_provider_entity_id_type_hint = var_service_provider_entity_id_type_hint, assertion_consumer_service_url = var_assertion_consumer_service_url, assertion_consumer_service_url_type_hint = var_assertion_consumer_service_url_type_hint, handle_logout = var_handle_logout, handle_logout_type_hint = var_handle_logout_type_hint, sp_private_key_alias = var_sp_private_key_alias, sp_private_key_alias_type_hint = var_sp_private_key_alias_type_hint, use_encryption = var_use_encryption, use_encryption_type_hint = var_use_encryption_type_hint, name_id_format = var_name_id_format, name_id_format_type_hint = var_name_id_format_type_hint, digest_method = var_digest_method, digest_method_type_hint = var_digest_method_type_hint, signature_method = var_signature_method, signature_method_type_hint = var_signature_method_type_hint, user_intermediate_path = var_user_intermediate_path, user_intermediate_path_type_hint = var_user_intermediate_path_type_hint)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_store_password** | **character**|  | [optional] 
 **key_store_password_type_hint** | **character**|  | [optional] 
 **service_ranking** | **integer**|  | [optional] 
 **service_ranking_type_hint** | **character**|  | [optional] 
 **idp_http_redirect** | **character**|  | [optional] 
 **idp_http_redirect_type_hint** | **character**|  | [optional] 
 **create_user** | **character**|  | [optional] 
 **create_user_type_hint** | **character**|  | [optional] 
 **default_redirect_url** | **character**|  | [optional] 
 **default_redirect_url_type_hint** | **character**|  | [optional] 
 **user_id_attribute** | **character**|  | [optional] 
 **user_id_attribute_type_hint** | **character**|  | [optional] 
 **default_groups** | list( **character** )|  | [optional] 
 **default_groups_type_hint** | **character**|  | [optional] 
 **idp_cert_alias** | **character**|  | [optional] 
 **idp_cert_alias_type_hint** | **character**|  | [optional] 
 **add_group_memberships** | **character**|  | [optional] 
 **add_group_memberships_type_hint** | **character**|  | [optional] 
 **path** | list( **character** )|  | [optional] 
 **path_type_hint** | **character**|  | [optional] 
 **synchronize_attributes** | list( **character** )|  | [optional] 
 **synchronize_attributes_type_hint** | **character**|  | [optional] 
 **clock_tolerance** | **integer**|  | [optional] 
 **clock_tolerance_type_hint** | **character**|  | [optional] 
 **group_membership_attribute** | **character**|  | [optional] 
 **group_membership_attribute_type_hint** | **character**|  | [optional] 
 **idp_url** | **character**|  | [optional] 
 **idp_url_type_hint** | **character**|  | [optional] 
 **logout_url** | **character**|  | [optional] 
 **logout_url_type_hint** | **character**|  | [optional] 
 **service_provider_entity_id** | **character**|  | [optional] 
 **service_provider_entity_id_type_hint** | **character**|  | [optional] 
 **assertion_consumer_service_url** | **character**|  | [optional] 
 **assertion_consumer_service_url_type_hint** | **character**|  | [optional] 
 **handle_logout** | **character**|  | [optional] 
 **handle_logout_type_hint** | **character**|  | [optional] 
 **sp_private_key_alias** | **character**|  | [optional] 
 **sp_private_key_alias_type_hint** | **character**|  | [optional] 
 **use_encryption** | **character**|  | [optional] 
 **use_encryption_type_hint** | **character**|  | [optional] 
 **name_id_format** | **character**|  | [optional] 
 **name_id_format_type_hint** | **character**|  | [optional] 
 **digest_method** | **character**|  | [optional] 
 **digest_method_type_hint** | **character**|  | [optional] 
 **signature_method** | **character**|  | [optional] 
 **signature_method_type_hint** | **character**|  | [optional] 
 **user_intermediate_path** | **character**|  | [optional] 
 **user_intermediate_path_type_hint** | **character**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostConfigApacheFelixJettyBasedHttpService**
> PostConfigApacheFelixJettyBasedHttpService(org_apache_felix_https_nio = var.org_apache_felix_https_nio, org_apache_felix_https_nio_type_hint = var.org_apache_felix_https_nio_type_hint, org_apache_felix_https_keystore = var.org_apache_felix_https_keystore, org_apache_felix_https_keystore_type_hint = var.org_apache_felix_https_keystore_type_hint, org_apache_felix_https_keystore_password = var.org_apache_felix_https_keystore_password, org_apache_felix_https_keystore_password_type_hint = var.org_apache_felix_https_keystore_password_type_hint, org_apache_felix_https_keystore_key = var.org_apache_felix_https_keystore_key, org_apache_felix_https_keystore_key_type_hint = var.org_apache_felix_https_keystore_key_type_hint, org_apache_felix_https_keystore_key_password = var.org_apache_felix_https_keystore_key_password, org_apache_felix_https_keystore_key_password_type_hint = var.org_apache_felix_https_keystore_key_password_type_hint, org_apache_felix_https_truststore = var.org_apache_felix_https_truststore, org_apache_felix_https_truststore_type_hint = var.org_apache_felix_https_truststore_type_hint, org_apache_felix_https_truststore_password = var.org_apache_felix_https_truststore_password, org_apache_felix_https_truststore_password_type_hint = var.org_apache_felix_https_truststore_password_type_hint, org_apache_felix_https_clientcertificate = var.org_apache_felix_https_clientcertificate, org_apache_felix_https_clientcertificate_type_hint = var.org_apache_felix_https_clientcertificate_type_hint, org_apache_felix_https_enable = var.org_apache_felix_https_enable, org_apache_felix_https_enable_type_hint = var.org_apache_felix_https_enable_type_hint, org_osgi_service_http_port_secure = var.org_osgi_service_http_port_secure, org_osgi_service_http_port_secure_type_hint = var.org_osgi_service_http_port_secure_type_hint)



### Example
```R
library(openapi)

# prepare function argument(s)
var_org_apache_felix_https_nio <- "org_apache_felix_https_nio_example" # character |  (Optional)
var_org_apache_felix_https_nio_type_hint <- "org_apache_felix_https_nio_type_hint_example" # character |  (Optional)
var_org_apache_felix_https_keystore <- "org_apache_felix_https_keystore_example" # character |  (Optional)
var_org_apache_felix_https_keystore_type_hint <- "org_apache_felix_https_keystore_type_hint_example" # character |  (Optional)
var_org_apache_felix_https_keystore_password <- "org_apache_felix_https_keystore_password_example" # character |  (Optional)
var_org_apache_felix_https_keystore_password_type_hint <- "org_apache_felix_https_keystore_password_type_hint_example" # character |  (Optional)
var_org_apache_felix_https_keystore_key <- "org_apache_felix_https_keystore_key_example" # character |  (Optional)
var_org_apache_felix_https_keystore_key_type_hint <- "org_apache_felix_https_keystore_key_type_hint_example" # character |  (Optional)
var_org_apache_felix_https_keystore_key_password <- "org_apache_felix_https_keystore_key_password_example" # character |  (Optional)
var_org_apache_felix_https_keystore_key_password_type_hint <- "org_apache_felix_https_keystore_key_password_type_hint_example" # character |  (Optional)
var_org_apache_felix_https_truststore <- "org_apache_felix_https_truststore_example" # character |  (Optional)
var_org_apache_felix_https_truststore_type_hint <- "org_apache_felix_https_truststore_type_hint_example" # character |  (Optional)
var_org_apache_felix_https_truststore_password <- "org_apache_felix_https_truststore_password_example" # character |  (Optional)
var_org_apache_felix_https_truststore_password_type_hint <- "org_apache_felix_https_truststore_password_type_hint_example" # character |  (Optional)
var_org_apache_felix_https_clientcertificate <- "org_apache_felix_https_clientcertificate_example" # character |  (Optional)
var_org_apache_felix_https_clientcertificate_type_hint <- "org_apache_felix_https_clientcertificate_type_hint_example" # character |  (Optional)
var_org_apache_felix_https_enable <- "org_apache_felix_https_enable_example" # character |  (Optional)
var_org_apache_felix_https_enable_type_hint <- "org_apache_felix_https_enable_type_hint_example" # character |  (Optional)
var_org_osgi_service_http_port_secure <- "org_osgi_service_http_port_secure_example" # character |  (Optional)
var_org_osgi_service_http_port_secure_type_hint <- "org_osgi_service_http_port_secure_type_hint_example" # character |  (Optional)

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$PostConfigApacheFelixJettyBasedHttpService(org_apache_felix_https_nio = var_org_apache_felix_https_nio, org_apache_felix_https_nio_type_hint = var_org_apache_felix_https_nio_type_hint, org_apache_felix_https_keystore = var_org_apache_felix_https_keystore, org_apache_felix_https_keystore_type_hint = var_org_apache_felix_https_keystore_type_hint, org_apache_felix_https_keystore_password = var_org_apache_felix_https_keystore_password, org_apache_felix_https_keystore_password_type_hint = var_org_apache_felix_https_keystore_password_type_hint, org_apache_felix_https_keystore_key = var_org_apache_felix_https_keystore_key, org_apache_felix_https_keystore_key_type_hint = var_org_apache_felix_https_keystore_key_type_hint, org_apache_felix_https_keystore_key_password = var_org_apache_felix_https_keystore_key_password, org_apache_felix_https_keystore_key_password_type_hint = var_org_apache_felix_https_keystore_key_password_type_hint, org_apache_felix_https_truststore = var_org_apache_felix_https_truststore, org_apache_felix_https_truststore_type_hint = var_org_apache_felix_https_truststore_type_hint, org_apache_felix_https_truststore_password = var_org_apache_felix_https_truststore_password, org_apache_felix_https_truststore_password_type_hint = var_org_apache_felix_https_truststore_password_type_hint, org_apache_felix_https_clientcertificate = var_org_apache_felix_https_clientcertificate, org_apache_felix_https_clientcertificate_type_hint = var_org_apache_felix_https_clientcertificate_type_hint, org_apache_felix_https_enable = var_org_apache_felix_https_enable, org_apache_felix_https_enable_type_hint = var_org_apache_felix_https_enable_type_hint, org_osgi_service_http_port_secure = var_org_osgi_service_http_port_secure, org_osgi_service_http_port_secure_type_hint = var_org_osgi_service_http_port_secure_type_hint)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org_apache_felix_https_nio** | **character**|  | [optional] 
 **org_apache_felix_https_nio_type_hint** | **character**|  | [optional] 
 **org_apache_felix_https_keystore** | **character**|  | [optional] 
 **org_apache_felix_https_keystore_type_hint** | **character**|  | [optional] 
 **org_apache_felix_https_keystore_password** | **character**|  | [optional] 
 **org_apache_felix_https_keystore_password_type_hint** | **character**|  | [optional] 
 **org_apache_felix_https_keystore_key** | **character**|  | [optional] 
 **org_apache_felix_https_keystore_key_type_hint** | **character**|  | [optional] 
 **org_apache_felix_https_keystore_key_password** | **character**|  | [optional] 
 **org_apache_felix_https_keystore_key_password_type_hint** | **character**|  | [optional] 
 **org_apache_felix_https_truststore** | **character**|  | [optional] 
 **org_apache_felix_https_truststore_type_hint** | **character**|  | [optional] 
 **org_apache_felix_https_truststore_password** | **character**|  | [optional] 
 **org_apache_felix_https_truststore_password_type_hint** | **character**|  | [optional] 
 **org_apache_felix_https_clientcertificate** | **character**|  | [optional] 
 **org_apache_felix_https_clientcertificate_type_hint** | **character**|  | [optional] 
 **org_apache_felix_https_enable** | **character**|  | [optional] 
 **org_apache_felix_https_enable_type_hint** | **character**|  | [optional] 
 **org_osgi_service_http_port_secure** | **character**|  | [optional] 
 **org_osgi_service_http_port_secure_type_hint** | **character**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostConfigApacheHttpComponentsProxyConfiguration**
> PostConfigApacheHttpComponentsProxyConfiguration(proxy_host = var.proxy_host, proxy_host_type_hint = var.proxy_host_type_hint, proxy_port = var.proxy_port, proxy_port_type_hint = var.proxy_port_type_hint, proxy_exceptions = var.proxy_exceptions, proxy_exceptions_type_hint = var.proxy_exceptions_type_hint, proxy_enabled = var.proxy_enabled, proxy_enabled_type_hint = var.proxy_enabled_type_hint, proxy_user = var.proxy_user, proxy_user_type_hint = var.proxy_user_type_hint, proxy_password = var.proxy_password, proxy_password_type_hint = var.proxy_password_type_hint)



### Example
```R
library(openapi)

# prepare function argument(s)
var_proxy_host <- "proxy_host_example" # character |  (Optional)
var_proxy_host_type_hint <- "proxy_host_type_hint_example" # character |  (Optional)
var_proxy_port <- 56 # integer |  (Optional)
var_proxy_port_type_hint <- "proxy_port_type_hint_example" # character |  (Optional)
var_proxy_exceptions <- c("inner_example") # array[character] |  (Optional)
var_proxy_exceptions_type_hint <- "proxy_exceptions_type_hint_example" # character |  (Optional)
var_proxy_enabled <- "proxy_enabled_example" # character |  (Optional)
var_proxy_enabled_type_hint <- "proxy_enabled_type_hint_example" # character |  (Optional)
var_proxy_user <- "proxy_user_example" # character |  (Optional)
var_proxy_user_type_hint <- "proxy_user_type_hint_example" # character |  (Optional)
var_proxy_password <- "proxy_password_example" # character |  (Optional)
var_proxy_password_type_hint <- "proxy_password_type_hint_example" # character |  (Optional)

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$PostConfigApacheHttpComponentsProxyConfiguration(proxy_host = var_proxy_host, proxy_host_type_hint = var_proxy_host_type_hint, proxy_port = var_proxy_port, proxy_port_type_hint = var_proxy_port_type_hint, proxy_exceptions = var_proxy_exceptions, proxy_exceptions_type_hint = var_proxy_exceptions_type_hint, proxy_enabled = var_proxy_enabled, proxy_enabled_type_hint = var_proxy_enabled_type_hint, proxy_user = var_proxy_user, proxy_user_type_hint = var_proxy_user_type_hint, proxy_password = var_proxy_password, proxy_password_type_hint = var_proxy_password_type_hint)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxy_host** | **character**|  | [optional] 
 **proxy_host_type_hint** | **character**|  | [optional] 
 **proxy_port** | **integer**|  | [optional] 
 **proxy_port_type_hint** | **character**|  | [optional] 
 **proxy_exceptions** | list( **character** )|  | [optional] 
 **proxy_exceptions_type_hint** | **character**|  | [optional] 
 **proxy_enabled** | **character**|  | [optional] 
 **proxy_enabled_type_hint** | **character**|  | [optional] 
 **proxy_user** | **character**|  | [optional] 
 **proxy_user_type_hint** | **character**|  | [optional] 
 **proxy_password** | **character**|  | [optional] 
 **proxy_password_type_hint** | **character**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostConfigApacheSlingDavExServlet**
> PostConfigApacheSlingDavExServlet(alias = var.alias, alias_type_hint = var.alias_type_hint, dav_create_absolute_uri = var.dav_create_absolute_uri, dav_create_absolute_uri_type_hint = var.dav_create_absolute_uri_type_hint)



### Example
```R
library(openapi)

# prepare function argument(s)
var_alias <- "alias_example" # character |  (Optional)
var_alias_type_hint <- "alias_type_hint_example" # character |  (Optional)
var_dav_create_absolute_uri <- "dav_create_absolute_uri_example" # character |  (Optional)
var_dav_create_absolute_uri_type_hint <- "dav_create_absolute_uri_type_hint_example" # character |  (Optional)

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$PostConfigApacheSlingDavExServlet(alias = var_alias, alias_type_hint = var_alias_type_hint, dav_create_absolute_uri = var_dav_create_absolute_uri, dav_create_absolute_uri_type_hint = var_dav_create_absolute_uri_type_hint)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **character**|  | [optional] 
 **alias_type_hint** | **character**|  | [optional] 
 **dav_create_absolute_uri** | **character**|  | [optional] 
 **dav_create_absolute_uri_type_hint** | **character**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostConfigApacheSlingGetServlet**
> PostConfigApacheSlingGetServlet(json_maximumresults = var.json_maximumresults, json_maximumresults_type_hint = var.json_maximumresults_type_hint, enable_html = var.enable_html, enable_html_type_hint = var.enable_html_type_hint, enable_txt = var.enable_txt, enable_txt_type_hint = var.enable_txt_type_hint, enable_xml = var.enable_xml, enable_xml_type_hint = var.enable_xml_type_hint)



### Example
```R
library(openapi)

# prepare function argument(s)
var_json_maximumresults <- "json_maximumresults_example" # character |  (Optional)
var_json_maximumresults_type_hint <- "json_maximumresults_type_hint_example" # character |  (Optional)
var_enable_html <- "enable_html_example" # character |  (Optional)
var_enable_html_type_hint <- "enable_html_type_hint_example" # character |  (Optional)
var_enable_txt <- "enable_txt_example" # character |  (Optional)
var_enable_txt_type_hint <- "enable_txt_type_hint_example" # character |  (Optional)
var_enable_xml <- "enable_xml_example" # character |  (Optional)
var_enable_xml_type_hint <- "enable_xml_type_hint_example" # character |  (Optional)

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$PostConfigApacheSlingGetServlet(json_maximumresults = var_json_maximumresults, json_maximumresults_type_hint = var_json_maximumresults_type_hint, enable_html = var_enable_html, enable_html_type_hint = var_enable_html_type_hint, enable_txt = var_enable_txt, enable_txt_type_hint = var_enable_txt_type_hint, enable_xml = var_enable_xml, enable_xml_type_hint = var_enable_xml_type_hint)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **json_maximumresults** | **character**|  | [optional] 
 **json_maximumresults_type_hint** | **character**|  | [optional] 
 **enable_html** | **character**|  | [optional] 
 **enable_html_type_hint** | **character**|  | [optional] 
 **enable_txt** | **character**|  | [optional] 
 **enable_txt_type_hint** | **character**|  | [optional] 
 **enable_xml** | **character**|  | [optional] 
 **enable_xml_type_hint** | **character**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostConfigApacheSlingReferrerFilter**
> PostConfigApacheSlingReferrerFilter(allow_empty = var.allow_empty, allow_empty_type_hint = var.allow_empty_type_hint, allow_hosts = var.allow_hosts, allow_hosts_type_hint = var.allow_hosts_type_hint, allow_hosts_regexp = var.allow_hosts_regexp, allow_hosts_regexp_type_hint = var.allow_hosts_regexp_type_hint, filter_methods = var.filter_methods, filter_methods_type_hint = var.filter_methods_type_hint)



### Example
```R
library(openapi)

# prepare function argument(s)
var_allow_empty <- "allow_empty_example" # character |  (Optional)
var_allow_empty_type_hint <- "allow_empty_type_hint_example" # character |  (Optional)
var_allow_hosts <- "allow_hosts_example" # character |  (Optional)
var_allow_hosts_type_hint <- "allow_hosts_type_hint_example" # character |  (Optional)
var_allow_hosts_regexp <- "allow_hosts_regexp_example" # character |  (Optional)
var_allow_hosts_regexp_type_hint <- "allow_hosts_regexp_type_hint_example" # character |  (Optional)
var_filter_methods <- "filter_methods_example" # character |  (Optional)
var_filter_methods_type_hint <- "filter_methods_type_hint_example" # character |  (Optional)

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$PostConfigApacheSlingReferrerFilter(allow_empty = var_allow_empty, allow_empty_type_hint = var_allow_empty_type_hint, allow_hosts = var_allow_hosts, allow_hosts_type_hint = var_allow_hosts_type_hint, allow_hosts_regexp = var_allow_hosts_regexp, allow_hosts_regexp_type_hint = var_allow_hosts_regexp_type_hint, filter_methods = var_filter_methods, filter_methods_type_hint = var_filter_methods_type_hint)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allow_empty** | **character**|  | [optional] 
 **allow_empty_type_hint** | **character**|  | [optional] 
 **allow_hosts** | **character**|  | [optional] 
 **allow_hosts_type_hint** | **character**|  | [optional] 
 **allow_hosts_regexp** | **character**|  | [optional] 
 **allow_hosts_regexp_type_hint** | **character**|  | [optional] 
 **filter_methods** | **character**|  | [optional] 
 **filter_methods_type_hint** | **character**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostConfigProperty**
> PostConfigProperty(config_node_name)



### Example
```R
library(openapi)

# prepare function argument(s)
var_config_node_name <- "config_node_name_example" # character | 

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$PostConfigProperty(var_config_node_name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config_node_name** | **character**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostNode**
> PostNode(path, name, _operation = var._operation, delete_authorizable = var.delete_authorizable, file = var.file)



### Example
```R
library(openapi)

# prepare function argument(s)
var_path <- "path_example" # character | 
var_name <- "name_example" # character | 
var__operation <- "_operation_example" # character |  (Optional)
var_delete_authorizable <- "delete_authorizable_example" # character |  (Optional)
var_file <- File.new('/path/to/file') # data.frame |  (Optional)

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$PostNode(var_path, var_name, _operation = var__operation, delete_authorizable = var_delete_authorizable, file = var_file)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **character**|  | 
 **name** | **character**|  | 
 **_operation** | **character**|  | [optional] 
 **delete_authorizable** | **character**|  | [optional] 
 **file** | **data.frame**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostNodeRw**
> PostNodeRw(path, name, add_members = var.add_members)



### Example
```R
library(openapi)

# prepare function argument(s)
var_path <- "path_example" # character | 
var_name <- "name_example" # character | 
var_add_members <- "add_members_example" # character |  (Optional)

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$PostNodeRw(var_path, var_name, add_members = var_add_members)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **character**|  | 
 **name** | **character**|  | 
 **add_members** | **character**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostPath**
> PostPath(path, jcr_primary_type, _name)



### Example
```R
library(openapi)

# prepare function argument(s)
var_path <- "path_example" # character | 
var_jcr_primary_type <- "jcr_primary_type_example" # character | 
var__name <- "_name_example" # character | 

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$PostPath(var_path, var_jcr_primary_type, var__name)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **character**|  | 
 **jcr_primary_type** | **character**|  | 
 **_name** | **character**|  | 

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostQuery**
> character PostQuery(path, p_limit, var_1_property, var_1_property_value)



### Example
```R
library(openapi)

# prepare function argument(s)
var_path <- "path_example" # character | 
var_p_limit <- 3.4 # numeric | 
var_var_1_property <- "var_1_property_example" # character | 
var_var_1_property_value <- "var_1_property_value_example" # character | 

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PostQuery(var_path, var_p_limit, var_var_1_property, var_var_1_property_valuedata_file = "result.txt")
result <- api_instance$PostQuery(var_path, var_p_limit, var_var_1_property, var_var_1_property_value)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **character**|  | 
 **p_limit** | **numeric**|  | 
 **var_1_property** | **character**|  | 
 **var_1_property_value** | **character**|  | 

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostTreeActivation**
> PostTreeActivation(ignoredeactivated, onlymodified, path, cmd)



### Example
```R
library(openapi)

# prepare function argument(s)
var_ignoredeactivated <- "ignoredeactivated_example" # character | 
var_onlymodified <- "onlymodified_example" # character | 
var_path <- "path_example" # character | 
var_cmd <- "activate" # character | 

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
api_instance$PostTreeActivation(var_ignoredeactivated, var_onlymodified, var_path, var_cmd)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **character**|  | 
 **onlymodified** | **character**|  | 
 **path** | **character**|  | 
 **cmd** | **character**|  | [default to &quot;activate&quot;]

### Return type

void (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostTruststore**
> character PostTruststore(_operation = var._operation, new_password = var.new_password, re_password = var.re_password, key_store_type = var.key_store_type, remove_alias = var.remove_alias, certificate = var.certificate)



### Example
```R
library(openapi)

# prepare function argument(s)
var__operation <- "_operation_example" # character |  (Optional)
var_new_password <- "new_password_example" # character |  (Optional)
var_re_password <- "re_password_example" # character |  (Optional)
var_key_store_type <- "key_store_type_example" # character |  (Optional)
var_remove_alias <- "remove_alias_example" # character |  (Optional)
var_certificate <- File.new('/path/to/file') # data.frame |  (Optional)

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PostTruststore(_operation = var__operation, new_password = var_new_password, re_password = var_re_password, key_store_type = var_key_store_type, remove_alias = var_remove_alias, certificate = var_certificatedata_file = "result.txt")
result <- api_instance$PostTruststore(_operation = var__operation, new_password = var_new_password, re_password = var_re_password, key_store_type = var_key_store_type, remove_alias = var_remove_alias, certificate = var_certificate)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_operation** | **character**|  | [optional] 
 **new_password** | **character**|  | [optional] 
 **re_password** | **character**|  | [optional] 
 **key_store_type** | **character**|  | [optional] 
 **remove_alias** | **character**|  | [optional] 
 **certificate** | **data.frame**|  | [optional] 

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **PostTruststorePKCS12**
> character PostTruststorePKCS12(truststore_p12 = var.truststore_p12)



### Example
```R
library(openapi)

# prepare function argument(s)
var_truststore_p12 <- File.new('/path/to/file') # data.frame |  (Optional)

api_instance <- SlingApi$new()
# Configure HTTP basic authorization: aemAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PostTruststorePKCS12(truststore_p12 = var_truststore_p12data_file = "result.txt")
result <- api_instance$PostTruststorePKCS12(truststore_p12 = var_truststore_p12)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststore_p12** | **data.frame**|  | [optional] 

### Return type

**character**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

