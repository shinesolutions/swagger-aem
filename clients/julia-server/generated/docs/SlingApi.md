# SlingApi

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
[**post_config_property**](SlingApi.md#post_config_property) | **POST** /apps/system/config/{configNodeName} | 
[**post_node**](SlingApi.md#post_node) | **POST** /{path}/{name} | 
[**post_node_rw**](SlingApi.md#post_node_rw) | **POST** /{path}/{name}.rw.html | 
[**post_path**](SlingApi.md#post_path) | **POST** /{path}/ | 
[**post_query**](SlingApi.md#post_query) | **POST** /bin/querybuilder.json | 
[**post_tree_activation**](SlingApi.md#post_tree_activation) | **POST** /libs/replication/treeactivation.html | 
[**post_truststore**](SlingApi.md#post_truststore) | **POST** /libs/granite/security/post/truststore | 
[**post_truststore_p_k_c_s12**](SlingApi.md#post_truststore_p_k_c_s12) | **POST** /etc/truststore | 


# **delete_agent**
> `delete_agent`(req::`HTTP.Request`, `runmode`::`String`, `name`::`String`;) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`runmode`** | **`String`**|  |
**`name`** | **`String`**|  |

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_node**
> `delete_node`(req::`HTTP.Request`, `path`::`String`, `name`::`String`;) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`path`** | **`String`**|  |
**`name`** | **`String`**|  |

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_agent**
> `get_agent`(req::`HTTP.Request`, `runmode`::`String`, `name`::`String`;) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`runmode`** | **`String`**|  |
**`name`** | **`String`**|  |

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_agents**
> `get_agents`(req::`HTTP.Request`, `runmode`::`String`;) -> `String`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`runmode`** | **`String`**|  |

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_authorizable_keystore**
> `get_authorizable_keystore`(req::`HTTP.Request`, `intermediate_path`::`String`, `authorizable_id`::`String`;) -> `KeystoreInfo`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`intermediate_path`** | **`String`**|  |
**`authorizable_id`** | **`String`**|  |

### Return type

[**`KeystoreInfo`**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_keystore**
> `get_keystore`(req::`HTTP.Request`, `intermediate_path`::`String`, `authorizable_id`::`String`;) -> `String`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`intermediate_path`** | **`String`**|  |
**`authorizable_id`** | **`String`**|  |

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_node**
> `get_node`(req::`HTTP.Request`, `path`::`String`, `name`::`String`;) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`path`** | **`String`**|  |
**`name`** | **`String`**|  |

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_package**
> `get_package`(req::`HTTP.Request`, `group`::`String`, `name`::`String`, `version`::`String`;) -> `String`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`group`** | **`String`**|  |
**`name`** | **`String`**|  |
**`version`** | **`String`**|  |

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_package_filter**
> `get_package_filter`(req::`HTTP.Request`, `group`::`String`, `name`::`String`, `version`::`String`;) -> `String`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`group`** | **`String`**|  |
**`name`** | **`String`**|  |
**`version`** | **`String`**|  |

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_query**
> `get_query`(req::`HTTP.Request`, `path`::`String`, `p_limit`::`Float64`, `1_property`::`String`, `1_property_value`::`String`;) -> `String`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`path`** | **`String`**|  |
**`p_limit`** | **`Float64`**|  |
**`1_property`** | **`String`**|  |
**`1_property_value`** | **`String`**|  |

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_truststore**
> `get_truststore`(req::`HTTP.Request`;) -> `String`



### Required Parameters
This endpoint does not need any parameter.

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_truststore_info**
> `get_truststore_info`(req::`HTTP.Request`;) -> `TruststoreInfo`



### Required Parameters
This endpoint does not need any parameter.

### Return type

[**`TruststoreInfo`**](TruststoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_agent**
> `post_agent`(req::`HTTP.Request`, `runmode`::`String`, `name`::`String`; `jcrcontent_cqdistribute`=nothing, `jcrcontent_cqdistribute_type_hint`=nothing, `jcrcontent_cqname`=nothing, `jcrcontent_cqtemplate`=nothing, `jcrcontent_alias_update`=nothing, `jcrcontent_enabled`=nothing, `jcrcontent_jcrdescription`=nothing, `jcrcontent_jcrlast_modified`=nothing, `jcrcontent_jcrlast_modified_by`=nothing, `jcrcontent_jcrmixin_types`=nothing, `jcrcontent_jcrtitle`=nothing, `jcrcontent_log_level`=nothing, `jcrcontent_no_status_update`=nothing, `jcrcontent_no_versioning`=nothing, `jcrcontent_protocol_connect_timeout`=nothing, `jcrcontent_protocol_h_t_t_p_connection_closed`=nothing, `jcrcontent_protocol_h_t_t_p_expired`=nothing, `jcrcontent_protocol_h_t_t_p_headers`=nothing, `jcrcontent_protocol_h_t_t_p_headers_type_hint`=nothing, `jcrcontent_protocol_h_t_t_p_method`=nothing, `jcrcontent_protocol_h_t_t_p_s_relaxed`=nothing, `jcrcontent_protocol_interface`=nothing, `jcrcontent_protocol_socket_timeout`=nothing, `jcrcontent_protocol_version`=nothing, `jcrcontent_proxy_n_t_l_m_domain`=nothing, `jcrcontent_proxy_n_t_l_m_host`=nothing, `jcrcontent_proxy_host`=nothing, `jcrcontent_proxy_password`=nothing, `jcrcontent_proxy_port`=nothing, `jcrcontent_proxy_user`=nothing, `jcrcontent_queue_batch_max_size`=nothing, `jcrcontent_queue_batch_mode`=nothing, `jcrcontent_queue_batch_wait_time`=nothing, `jcrcontent_retry_delay`=nothing, `jcrcontent_reverse_replication`=nothing, `jcrcontent_serialization_type`=nothing, `jcrcontent_slingresource_type`=nothing, `jcrcontent_ssl`=nothing, `jcrcontent_transport_n_t_l_m_domain`=nothing, `jcrcontent_transport_n_t_l_m_host`=nothing, `jcrcontent_transport_password`=nothing, `jcrcontent_transport_uri`=nothing, `jcrcontent_transport_user`=nothing, `jcrcontent_trigger_distribute`=nothing, `jcrcontent_trigger_modified`=nothing, `jcrcontent_trigger_on_off_time`=nothing, `jcrcontent_trigger_receive`=nothing, `jcrcontent_trigger_specific`=nothing, `jcrcontent_user_id`=nothing, `jcrprimary_type`=nothing, `operation`=nothing,) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`runmode`** | **`String`**|  |
**`name`** | **`String`**|  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`jcrcontent_cqdistribute`** | **`Bool`**|  | [default to nothing]
 **`jcrcontent_cqdistribute_type_hint`** | **`String`**|  | [default to nothing]
 **`jcrcontent_cqname`** | **`String`**|  | [default to nothing]
 **`jcrcontent_cqtemplate`** | **`String`**|  | [default to nothing]
 **`jcrcontent_alias_update`** | **`Bool`**|  | [default to nothing]
 **`jcrcontent_enabled`** | **`Bool`**|  | [default to nothing]
 **`jcrcontent_jcrdescription`** | **`String`**|  | [default to nothing]
 **`jcrcontent_jcrlast_modified`** | **`String`**|  | [default to nothing]
 **`jcrcontent_jcrlast_modified_by`** | **`String`**|  | [default to nothing]
 **`jcrcontent_jcrmixin_types`** | **`String`**|  | [default to nothing]
 **`jcrcontent_jcrtitle`** | **`String`**|  | [default to nothing]
 **`jcrcontent_log_level`** | **`String`**|  | [default to nothing]
 **`jcrcontent_no_status_update`** | **`Bool`**|  | [default to nothing]
 **`jcrcontent_no_versioning`** | **`Bool`**|  | [default to nothing]
 **`jcrcontent_protocol_connect_timeout`** | **`Float64`**|  | [default to nothing]
 **`jcrcontent_protocol_h_t_t_p_connection_closed`** | **`Bool`**|  | [default to nothing]
 **`jcrcontent_protocol_h_t_t_p_expired`** | **`String`**|  | [default to nothing]
 **`jcrcontent_protocol_h_t_t_p_headers`** | [**`Vector{String}`**](String.md)|  | [default to nothing]
 **`jcrcontent_protocol_h_t_t_p_headers_type_hint`** | **`String`**|  | [default to nothing]
 **`jcrcontent_protocol_h_t_t_p_method`** | **`String`**|  | [default to nothing]
 **`jcrcontent_protocol_h_t_t_p_s_relaxed`** | **`Bool`**|  | [default to nothing]
 **`jcrcontent_protocol_interface`** | **`String`**|  | [default to nothing]
 **`jcrcontent_protocol_socket_timeout`** | **`Float64`**|  | [default to nothing]
 **`jcrcontent_protocol_version`** | **`String`**|  | [default to nothing]
 **`jcrcontent_proxy_n_t_l_m_domain`** | **`String`**|  | [default to nothing]
 **`jcrcontent_proxy_n_t_l_m_host`** | **`String`**|  | [default to nothing]
 **`jcrcontent_proxy_host`** | **`String`**|  | [default to nothing]
 **`jcrcontent_proxy_password`** | **`String`**|  | [default to nothing]
 **`jcrcontent_proxy_port`** | **`Float64`**|  | [default to nothing]
 **`jcrcontent_proxy_user`** | **`String`**|  | [default to nothing]
 **`jcrcontent_queue_batch_max_size`** | **`Float64`**|  | [default to nothing]
 **`jcrcontent_queue_batch_mode`** | **`String`**|  | [default to nothing]
 **`jcrcontent_queue_batch_wait_time`** | **`Float64`**|  | [default to nothing]
 **`jcrcontent_retry_delay`** | **`String`**|  | [default to nothing]
 **`jcrcontent_reverse_replication`** | **`Bool`**|  | [default to nothing]
 **`jcrcontent_serialization_type`** | **`String`**|  | [default to nothing]
 **`jcrcontent_slingresource_type`** | **`String`**|  | [default to nothing]
 **`jcrcontent_ssl`** | **`String`**|  | [default to nothing]
 **`jcrcontent_transport_n_t_l_m_domain`** | **`String`**|  | [default to nothing]
 **`jcrcontent_transport_n_t_l_m_host`** | **`String`**|  | [default to nothing]
 **`jcrcontent_transport_password`** | **`String`**|  | [default to nothing]
 **`jcrcontent_transport_uri`** | **`String`**|  | [default to nothing]
 **`jcrcontent_transport_user`** | **`String`**|  | [default to nothing]
 **`jcrcontent_trigger_distribute`** | **`Bool`**|  | [default to nothing]
 **`jcrcontent_trigger_modified`** | **`Bool`**|  | [default to nothing]
 **`jcrcontent_trigger_on_off_time`** | **`Bool`**|  | [default to nothing]
 **`jcrcontent_trigger_receive`** | **`Bool`**|  | [default to nothing]
 **`jcrcontent_trigger_specific`** | **`Bool`**|  | [default to nothing]
 **`jcrcontent_user_id`** | **`String`**|  | [default to nothing]
 **`jcrprimary_type`** | **`String`**|  | [default to nothing]
 **`operation`** | **`String`**|  | [default to nothing]

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_authorizable_keystore**
> `post_authorizable_keystore`(req::`HTTP.Request`, `intermediate_path`::`String`, `authorizable_id`::`String`; `operation`=nothing, `current_password`=nothing, `new_password`=nothing, `re_password`=nothing, `key_password`=nothing, `key_store_pass`=nothing, `alias`=nothing, `new_alias`=nothing, `remove_alias`=nothing, `cert_chain`=nothing, `pk`=nothing, `key_store`=nothing,) -> `KeystoreInfo`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`intermediate_path`** | **`String`**|  |
**`authorizable_id`** | **`String`**|  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`operation`** | **`String`**|  | [default to nothing]
 **`current_password`** | **`String`**|  | [default to nothing]
 **`new_password`** | **`String`**|  | [default to nothing]
 **`re_password`** | **`String`**|  | [default to nothing]
 **`key_password`** | **`String`**|  | [default to nothing]
 **`key_store_pass`** | **`String`**|  | [default to nothing]
 **`alias`** | **`String`**|  | [default to nothing]
 **`new_alias`** | **`String`**|  | [default to nothing]
 **`remove_alias`** | **`String`**|  | [default to nothing]
 **`cert_chain`** | **`Vector{UInt8}`**|  | 
 **`pk`** | **`Vector{UInt8}`**|  | 
 **`key_store`** | **`Vector{UInt8}`**|  | 

### Return type

[**`KeystoreInfo`**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_authorizables**
> `post_authorizables`(req::`HTTP.Request`, `authorizable_id`::`String`, `intermediate_path`::`String`; `create_user`=nothing, `create_group`=nothing, `reppassword`=nothing, `profile_given_name`=nothing,) -> `String`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`authorizable_id`** | **`String`**|  |
**`intermediate_path`** | **`String`**|  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`create_user`** | **`String`**|  | [default to nothing]
 **`create_group`** | **`String`**|  | [default to nothing]
 **`reppassword`** | **`String`**|  | [default to nothing]
 **`profile_given_name`** | **`String`**|  | [default to nothing]

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_adobe_granite_saml_authentication_handler**
> `post_config_adobe_granite_saml_authentication_handler`(req::`HTTP.Request`; `key_store_password`=nothing, `key_store_password_type_hint`=nothing, `service_ranking`=nothing, `service_ranking_type_hint`=nothing, `idp_http_redirect`=nothing, `idp_http_redirect_type_hint`=nothing, `create_user`=nothing, `create_user_type_hint`=nothing, `default_redirect_url`=nothing, `default_redirect_url_type_hint`=nothing, `user_i_d_attribute`=nothing, `user_i_d_attribute_type_hint`=nothing, `default_groups`=nothing, `default_groups_type_hint`=nothing, `idp_cert_alias`=nothing, `idp_cert_alias_type_hint`=nothing, `add_group_memberships`=nothing, `add_group_memberships_type_hint`=nothing, `path`=nothing, `path_type_hint`=nothing, `synchronize_attributes`=nothing, `synchronize_attributes_type_hint`=nothing, `clock_tolerance`=nothing, `clock_tolerance_type_hint`=nothing, `group_membership_attribute`=nothing, `group_membership_attribute_type_hint`=nothing, `idp_url`=nothing, `idp_url_type_hint`=nothing, `logout_url`=nothing, `logout_url_type_hint`=nothing, `service_provider_entity_id`=nothing, `service_provider_entity_id_type_hint`=nothing, `assertion_consumer_service_u_r_l`=nothing, `assertion_consumer_service_u_r_l_type_hint`=nothing, `handle_logout`=nothing, `handle_logout_type_hint`=nothing, `sp_private_key_alias`=nothing, `sp_private_key_alias_type_hint`=nothing, `use_encryption`=nothing, `use_encryption_type_hint`=nothing, `name_id_format`=nothing, `name_id_format_type_hint`=nothing, `digest_method`=nothing, `digest_method_type_hint`=nothing, `signature_method`=nothing, `signature_method_type_hint`=nothing, `user_intermediate_path`=nothing, `user_intermediate_path_type_hint`=nothing,) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`key_store_password`** | **`String`**|  | [default to nothing]
 **`key_store_password_type_hint`** | **`String`**|  | [default to nothing]
 **`service_ranking`** | **`Int64`**|  | [default to nothing]
 **`service_ranking_type_hint`** | **`String`**|  | [default to nothing]
 **`idp_http_redirect`** | **`Bool`**|  | [default to nothing]
 **`idp_http_redirect_type_hint`** | **`String`**|  | [default to nothing]
 **`create_user`** | **`Bool`**|  | [default to nothing]
 **`create_user_type_hint`** | **`String`**|  | [default to nothing]
 **`default_redirect_url`** | **`String`**|  | [default to nothing]
 **`default_redirect_url_type_hint`** | **`String`**|  | [default to nothing]
 **`user_i_d_attribute`** | **`String`**|  | [default to nothing]
 **`user_i_d_attribute_type_hint`** | **`String`**|  | [default to nothing]
 **`default_groups`** | [**`Vector{String}`**](String.md)|  | [default to nothing]
 **`default_groups_type_hint`** | **`String`**|  | [default to nothing]
 **`idp_cert_alias`** | **`String`**|  | [default to nothing]
 **`idp_cert_alias_type_hint`** | **`String`**|  | [default to nothing]
 **`add_group_memberships`** | **`Bool`**|  | [default to nothing]
 **`add_group_memberships_type_hint`** | **`String`**|  | [default to nothing]
 **`path`** | [**`Vector{String}`**](String.md)|  | [default to nothing]
 **`path_type_hint`** | **`String`**|  | [default to nothing]
 **`synchronize_attributes`** | [**`Vector{String}`**](String.md)|  | [default to nothing]
 **`synchronize_attributes_type_hint`** | **`String`**|  | [default to nothing]
 **`clock_tolerance`** | **`Int64`**|  | [default to nothing]
 **`clock_tolerance_type_hint`** | **`String`**|  | [default to nothing]
 **`group_membership_attribute`** | **`String`**|  | [default to nothing]
 **`group_membership_attribute_type_hint`** | **`String`**|  | [default to nothing]
 **`idp_url`** | **`String`**|  | [default to nothing]
 **`idp_url_type_hint`** | **`String`**|  | [default to nothing]
 **`logout_url`** | **`String`**|  | [default to nothing]
 **`logout_url_type_hint`** | **`String`**|  | [default to nothing]
 **`service_provider_entity_id`** | **`String`**|  | [default to nothing]
 **`service_provider_entity_id_type_hint`** | **`String`**|  | [default to nothing]
 **`assertion_consumer_service_u_r_l`** | **`String`**|  | [default to nothing]
 **`assertion_consumer_service_u_r_l_type_hint`** | **`String`**|  | [default to nothing]
 **`handle_logout`** | **`Bool`**|  | [default to nothing]
 **`handle_logout_type_hint`** | **`String`**|  | [default to nothing]
 **`sp_private_key_alias`** | **`String`**|  | [default to nothing]
 **`sp_private_key_alias_type_hint`** | **`String`**|  | [default to nothing]
 **`use_encryption`** | **`Bool`**|  | [default to nothing]
 **`use_encryption_type_hint`** | **`String`**|  | [default to nothing]
 **`name_id_format`** | **`String`**|  | [default to nothing]
 **`name_id_format_type_hint`** | **`String`**|  | [default to nothing]
 **`digest_method`** | **`String`**|  | [default to nothing]
 **`digest_method_type_hint`** | **`String`**|  | [default to nothing]
 **`signature_method`** | **`String`**|  | [default to nothing]
 **`signature_method_type_hint`** | **`String`**|  | [default to nothing]
 **`user_intermediate_path`** | **`String`**|  | [default to nothing]
 **`user_intermediate_path_type_hint`** | **`String`**|  | [default to nothing]

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_felix_jetty_based_http_service**
> `post_config_apache_felix_jetty_based_http_service`(req::`HTTP.Request`; `org_apache_felix_https_nio`=nothing, `org_apache_felix_https_nio_type_hint`=nothing, `org_apache_felix_https_keystore`=nothing, `org_apache_felix_https_keystore_type_hint`=nothing, `org_apache_felix_https_keystore_password`=nothing, `org_apache_felix_https_keystore_password_type_hint`=nothing, `org_apache_felix_https_keystore_key`=nothing, `org_apache_felix_https_keystore_key_type_hint`=nothing, `org_apache_felix_https_keystore_key_password`=nothing, `org_apache_felix_https_keystore_key_password_type_hint`=nothing, `org_apache_felix_https_truststore`=nothing, `org_apache_felix_https_truststore_type_hint`=nothing, `org_apache_felix_https_truststore_password`=nothing, `org_apache_felix_https_truststore_password_type_hint`=nothing, `org_apache_felix_https_clientcertificate`=nothing, `org_apache_felix_https_clientcertificate_type_hint`=nothing, `org_apache_felix_https_enable`=nothing, `org_apache_felix_https_enable_type_hint`=nothing, `org_osgi_service_http_port_secure`=nothing, `org_osgi_service_http_port_secure_type_hint`=nothing,) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`org_apache_felix_https_nio`** | **`Bool`**|  | [default to nothing]
 **`org_apache_felix_https_nio_type_hint`** | **`String`**|  | [default to nothing]
 **`org_apache_felix_https_keystore`** | **`String`**|  | [default to nothing]
 **`org_apache_felix_https_keystore_type_hint`** | **`String`**|  | [default to nothing]
 **`org_apache_felix_https_keystore_password`** | **`String`**|  | [default to nothing]
 **`org_apache_felix_https_keystore_password_type_hint`** | **`String`**|  | [default to nothing]
 **`org_apache_felix_https_keystore_key`** | **`String`**|  | [default to nothing]
 **`org_apache_felix_https_keystore_key_type_hint`** | **`String`**|  | [default to nothing]
 **`org_apache_felix_https_keystore_key_password`** | **`String`**|  | [default to nothing]
 **`org_apache_felix_https_keystore_key_password_type_hint`** | **`String`**|  | [default to nothing]
 **`org_apache_felix_https_truststore`** | **`String`**|  | [default to nothing]
 **`org_apache_felix_https_truststore_type_hint`** | **`String`**|  | [default to nothing]
 **`org_apache_felix_https_truststore_password`** | **`String`**|  | [default to nothing]
 **`org_apache_felix_https_truststore_password_type_hint`** | **`String`**|  | [default to nothing]
 **`org_apache_felix_https_clientcertificate`** | **`String`**|  | [default to nothing]
 **`org_apache_felix_https_clientcertificate_type_hint`** | **`String`**|  | [default to nothing]
 **`org_apache_felix_https_enable`** | **`Bool`**|  | [default to nothing]
 **`org_apache_felix_https_enable_type_hint`** | **`String`**|  | [default to nothing]
 **`org_osgi_service_http_port_secure`** | **`String`**|  | [default to nothing]
 **`org_osgi_service_http_port_secure_type_hint`** | **`String`**|  | [default to nothing]

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_http_components_proxy_configuration**
> `post_config_apache_http_components_proxy_configuration`(req::`HTTP.Request`; `proxy_host`=nothing, `proxy_host_type_hint`=nothing, `proxy_port`=nothing, `proxy_port_type_hint`=nothing, `proxy_exceptions`=nothing, `proxy_exceptions_type_hint`=nothing, `proxy_enabled`=nothing, `proxy_enabled_type_hint`=nothing, `proxy_user`=nothing, `proxy_user_type_hint`=nothing, `proxy_password`=nothing, `proxy_password_type_hint`=nothing,) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`proxy_host`** | **`String`**|  | [default to nothing]
 **`proxy_host_type_hint`** | **`String`**|  | [default to nothing]
 **`proxy_port`** | **`Int64`**|  | [default to nothing]
 **`proxy_port_type_hint`** | **`String`**|  | [default to nothing]
 **`proxy_exceptions`** | [**`Vector{String}`**](String.md)|  | [default to nothing]
 **`proxy_exceptions_type_hint`** | **`String`**|  | [default to nothing]
 **`proxy_enabled`** | **`Bool`**|  | [default to nothing]
 **`proxy_enabled_type_hint`** | **`String`**|  | [default to nothing]
 **`proxy_user`** | **`String`**|  | [default to nothing]
 **`proxy_user_type_hint`** | **`String`**|  | [default to nothing]
 **`proxy_password`** | **`String`**|  | [default to nothing]
 **`proxy_password_type_hint`** | **`String`**|  | [default to nothing]

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_sling_dav_ex_servlet**
> `post_config_apache_sling_dav_ex_servlet`(req::`HTTP.Request`; `alias`=nothing, `alias_type_hint`=nothing, `dav_create_absolute_uri`=nothing, `dav_create_absolute_uri_type_hint`=nothing,) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`alias`** | **`String`**|  | [default to nothing]
 **`alias_type_hint`** | **`String`**|  | [default to nothing]
 **`dav_create_absolute_uri`** | **`Bool`**|  | [default to nothing]
 **`dav_create_absolute_uri_type_hint`** | **`String`**|  | [default to nothing]

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_sling_get_servlet**
> `post_config_apache_sling_get_servlet`(req::`HTTP.Request`; `json_maximumresults`=nothing, `json_maximumresults_type_hint`=nothing, `enable_html`=nothing, `enable_html_type_hint`=nothing, `enable_txt`=nothing, `enable_txt_type_hint`=nothing, `enable_xml`=nothing, `enable_xml_type_hint`=nothing,) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`json_maximumresults`** | **`String`**|  | [default to nothing]
 **`json_maximumresults_type_hint`** | **`String`**|  | [default to nothing]
 **`enable_html`** | **`Bool`**|  | [default to nothing]
 **`enable_html_type_hint`** | **`String`**|  | [default to nothing]
 **`enable_txt`** | **`Bool`**|  | [default to nothing]
 **`enable_txt_type_hint`** | **`String`**|  | [default to nothing]
 **`enable_xml`** | **`Bool`**|  | [default to nothing]
 **`enable_xml_type_hint`** | **`String`**|  | [default to nothing]

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_sling_referrer_filter**
> `post_config_apache_sling_referrer_filter`(req::`HTTP.Request`; `allow_empty`=nothing, `allow_empty_type_hint`=nothing, `allow_hosts`=nothing, `allow_hosts_type_hint`=nothing, `allow_hosts_regexp`=nothing, `allow_hosts_regexp_type_hint`=nothing, `filter_methods`=nothing, `filter_methods_type_hint`=nothing,) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`allow_empty`** | **`Bool`**|  | [default to nothing]
 **`allow_empty_type_hint`** | **`String`**|  | [default to nothing]
 **`allow_hosts`** | **`String`**|  | [default to nothing]
 **`allow_hosts_type_hint`** | **`String`**|  | [default to nothing]
 **`allow_hosts_regexp`** | **`String`**|  | [default to nothing]
 **`allow_hosts_regexp_type_hint`** | **`String`**|  | [default to nothing]
 **`filter_methods`** | **`String`**|  | [default to nothing]
 **`filter_methods_type_hint`** | **`String`**|  | [default to nothing]

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_property**
> `post_config_property`(req::`HTTP.Request`, `config_node_name`::`String`;) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`config_node_name`** | **`String`**|  |

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_node**
> `post_node`(req::`HTTP.Request`, `path`::`String`, `name`::`String`; `operation`=nothing, `delete_authorizable`=nothing, `file`=nothing,) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`path`** | **`String`**|  |
**`name`** | **`String`**|  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`operation`** | **`String`**|  | [default to nothing]
 **`delete_authorizable`** | **`String`**|  | [default to nothing]
 **`file`** | **`Vector{UInt8}`**|  | 

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_node_rw**
> `post_node_rw`(req::`HTTP.Request`, `path`::`String`, `name`::`String`; `add_members`=nothing,) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`path`** | **`String`**|  |
**`name`** | **`String`**|  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`add_members`** | **`String`**|  | [default to nothing]

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_path**
> `post_path`(req::`HTTP.Request`, `path`::`String`, `jcrprimary_type`::`String`, `name`::`String`;) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`path`** | **`String`**|  |
**`jcrprimary_type`** | **`String`**|  |
**`name`** | **`String`**|  |

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_query**
> `post_query`(req::`HTTP.Request`, `path`::`String`, `p_limit`::`Float64`, `1_property`::`String`, `1_property_value`::`String`;) -> `String`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`path`** | **`String`**|  |
**`p_limit`** | **`Float64`**|  |
**`1_property`** | **`String`**|  |
**`1_property_value`** | **`String`**|  |

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_tree_activation**
> `post_tree_activation`(req::`HTTP.Request`, `ignoredeactivated`::`Bool`, `onlymodified`::`Bool`, `path`::`String`, `cmd`::`String`;) -> `Nothing`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ignoredeactivated`** | **`Bool`**|  |
**`onlymodified`** | **`Bool`**|  |
**`path`** | **`String`**|  |
**`cmd`** | **`String`**|  |

### Return type

`Nothing`

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_truststore**
> `post_truststore`(req::`HTTP.Request`; `operation`=nothing, `new_password`=nothing, `re_password`=nothing, `key_store_type`=nothing, `remove_alias`=nothing, `certificate`=nothing,) -> `String`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`operation`** | **`String`**|  | [default to nothing]
 **`new_password`** | **`String`**|  | [default to nothing]
 **`re_password`** | **`String`**|  | [default to nothing]
 **`key_store_type`** | **`String`**|  | [default to nothing]
 **`remove_alias`** | **`String`**|  | [default to nothing]
 **`certificate`** | **`Vector{UInt8}`**|  | 

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_truststore_p_k_c_s12**
> `post_truststore_p_k_c_s12`(req::`HTTP.Request`; `truststore_p12`=nothing,) -> `String`



### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`truststore_p12`** | **`Vector{UInt8}`**|  | 

### Return type

**`String`**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

