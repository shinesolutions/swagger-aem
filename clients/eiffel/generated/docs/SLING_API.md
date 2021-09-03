# SLING_API

All URIs are relative to *http://localhost*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**agent**](SLING_API.md#agent) | **Get** /etc/replication/agents.{runmode}/{name} | 
[**agents**](SLING_API.md#agents) | **Get** /etc/replication/agents.{runmode}.-1.json | 
[**authorizable_keystore**](SLING_API.md#authorizable_keystore) | **Get** /{intermediatePath}/{authorizableId}.ks.json | 
[**delete_agent**](SLING_API.md#delete_agent) | **Delete** /etc/replication/agents.{runmode}/{name} | 
[**delete_node**](SLING_API.md#delete_node) | **Delete** /{path}/{name} | 
[**keystore**](SLING_API.md#keystore) | **Get** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**node**](SLING_API.md#node) | **Get** /{path}/{name} | 
[**package**](SLING_API.md#package) | **Get** /etc/packages/{group}/{name}-{version}.zip | 
[**package_filter**](SLING_API.md#package_filter) | **Get** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**post_agent**](SLING_API.md#post_agent) | **Post** /etc/replication/agents.{runmode}/{name} | 
[**post_authorizable_keystore**](SLING_API.md#post_authorizable_keystore) | **Post** /{intermediatePath}/{authorizableId}.ks.html | 
[**post_authorizables**](SLING_API.md#post_authorizables) | **Post** /libs/granite/security/post/authorizables | 
[**post_config_adobe_granite_saml_authentication_handler**](SLING_API.md#post_config_adobe_granite_saml_authentication_handler) | **Post** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**post_config_apache_felix_jetty_based_http_service**](SLING_API.md#post_config_apache_felix_jetty_based_http_service) | **Post** /apps/system/config/org.apache.felix.http | 
[**post_config_apache_http_components_proxy_configuration**](SLING_API.md#post_config_apache_http_components_proxy_configuration) | **Post** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**post_config_apache_sling_dav_ex_servlet**](SLING_API.md#post_config_apache_sling_dav_ex_servlet) | **Post** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**post_config_apache_sling_get_servlet**](SLING_API.md#post_config_apache_sling_get_servlet) | **Post** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**post_config_apache_sling_referrer_filter**](SLING_API.md#post_config_apache_sling_referrer_filter) | **Post** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**post_config_property**](SLING_API.md#post_config_property) | **Post** /apps/system/config/{configNodeName} | 
[**post_node**](SLING_API.md#post_node) | **Post** /{path}/{name} | 
[**post_node_rw**](SLING_API.md#post_node_rw) | **Post** /{path}/{name}.rw.html | 
[**post_path**](SLING_API.md#post_path) | **Post** /{path}/ | 
[**post_query**](SLING_API.md#post_query) | **Post** /bin/querybuilder.json | 
[**post_tree_activation**](SLING_API.md#post_tree_activation) | **Post** /etc/replication/treeactivation.html | 
[**post_truststore**](SLING_API.md#post_truststore) | **Post** /libs/granite/security/post/truststore | 
[**post_truststore_pk_cs12**](SLING_API.md#post_truststore_pk_cs12) | **Post** /etc/truststore | 
[**query**](SLING_API.md#query) | **Get** /bin/querybuilder.json | 
[**truststore**](SLING_API.md#truststore) | **Get** /etc/truststore/truststore.p12 | 
[**truststore_info**](SLING_API.md#truststore_info) | **Get** /libs/granite/security/truststore.json | 


# **agent**
> agent (runmode: STRING_32 ; name: STRING_32 )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **STRING_32**|  | [default to null]
 **name** | **STRING_32**|  | [default to null]

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **agents**
> agents (runmode: STRING_32 ): detachable STRING_32
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **STRING_32**|  | [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **authorizable_keystore**
> authorizable_keystore (intermediate_path: STRING_32 ; authorizable_id: STRING_32 ): detachable KEYSTORE_INFO
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate_path** | **STRING_32**|  | [default to null]
 **authorizable_id** | **STRING_32**|  | [default to null]

### Return type

[**KEYSTORE_INFO**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_agent**
> delete_agent (runmode: STRING_32 ; name: STRING_32 )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **STRING_32**|  | [default to null]
 **name** | **STRING_32**|  | [default to null]

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_node**
> delete_node (path: STRING_32 ; name: STRING_32 )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **STRING_32**|  | [default to null]
 **name** | **STRING_32**|  | [default to null]

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **keystore**
> keystore (intermediate_path: STRING_32 ; authorizable_id: STRING_32 ): detachable FILE
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate_path** | **STRING_32**|  | [default to null]
 **authorizable_id** | **STRING_32**|  | [default to null]

### Return type

[**FILE**](FILE.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **node**
> node (path: STRING_32 ; name: STRING_32 )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **STRING_32**|  | [default to null]
 **name** | **STRING_32**|  | [default to null]

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **package**
> package (group: STRING_32 ; name: STRING_32 ; version: STRING_32 ): detachable FILE
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **STRING_32**|  | [default to null]
 **name** | **STRING_32**|  | [default to null]
 **version** | **STRING_32**|  | [default to null]

### Return type

[**FILE**](FILE.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **package_filter**
> package_filter (group: STRING_32 ; name: STRING_32 ; version: STRING_32 ): detachable STRING_32
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **STRING_32**|  | [default to null]
 **name** | **STRING_32**|  | [default to null]
 **version** | **STRING_32**|  | [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_agent**
> post_agent (runmode: STRING_32 ; name: STRING_32 ; jcrcontent_cqdistribute:  detachable BOOLEAN ; jcrcontent_cqdistribute_type_hint:  detachable STRING_32 ; jcrcontent_cqname:  detachable STRING_32 ; jcrcontent_cqtemplate:  detachable STRING_32 ; jcrcontent_enabled:  detachable BOOLEAN ; jcrcontent_jcrdescription:  detachable STRING_32 ; jcrcontent_jcrlast_modified:  detachable STRING_32 ; jcrcontent_jcrlast_modified_by:  detachable STRING_32 ; jcrcontent_jcrmixin_types:  detachable STRING_32 ; jcrcontent_jcrtitle:  detachable STRING_32 ; jcrcontent_log_level:  detachable STRING_32 ; jcrcontent_no_status_update:  detachable BOOLEAN ; jcrcontent_no_versioning:  detachable BOOLEAN ; jcrcontent_protocol_connect_timeout:  detachable REAL_32 ; jcrcontent_protocol_ht_tp_connection_closed:  detachable BOOLEAN ; jcrcontent_protocol_ht_tp_expired:  detachable STRING_32 ; jcrcontent_protocol_ht_tp_headers:  detachable LIST [STRING_32] ; jcrcontent_protocol_ht_tp_headers_type_hint:  detachable STRING_32 ; jcrcontent_protocol_ht_tp_method:  detachable STRING_32 ; jcrcontent_protocol_ht_tp_srelaxed:  detachable BOOLEAN ; jcrcontent_protocol_interface:  detachable STRING_32 ; jcrcontent_protocol_socket_timeout:  detachable REAL_32 ; jcrcontent_protocol_version:  detachable STRING_32 ; jcrcontent_proxy_nt_lm_domain:  detachable STRING_32 ; jcrcontent_proxy_nt_lm_host:  detachable STRING_32 ; jcrcontent_proxy_host:  detachable STRING_32 ; jcrcontent_proxy_password:  detachable STRING_32 ; jcrcontent_proxy_port:  detachable REAL_32 ; jcrcontent_proxy_user:  detachable STRING_32 ; jcrcontent_queue_batch_max_size:  detachable REAL_32 ; jcrcontent_queue_batch_mode:  detachable STRING_32 ; jcrcontent_queue_batch_wait_time:  detachable REAL_32 ; jcrcontent_retry_delay:  detachable STRING_32 ; jcrcontent_reverse_replication:  detachable BOOLEAN ; jcrcontent_serialization_type:  detachable STRING_32 ; jcrcontent_slingresource_type:  detachable STRING_32 ; jcrcontent_ssl:  detachable STRING_32 ; jcrcontent_transport_nt_lm_domain:  detachable STRING_32 ; jcrcontent_transport_nt_lm_host:  detachable STRING_32 ; jcrcontent_transport_password:  detachable STRING_32 ; jcrcontent_transport_uri:  detachable STRING_32 ; jcrcontent_transport_user:  detachable STRING_32 ; jcrcontent_trigger_distribute:  detachable BOOLEAN ; jcrcontent_trigger_modified:  detachable BOOLEAN ; jcrcontent_trigger_on_off_time:  detachable BOOLEAN ; jcrcontent_trigger_receive:  detachable BOOLEAN ; jcrcontent_trigger_specific:  detachable BOOLEAN ; jcrcontent_user_id:  detachable STRING_32 ; jcrprimary_type:  detachable STRING_32 ; operation:  detachable STRING_32 )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **STRING_32**|  | [default to null]
 **name** | **STRING_32**|  | [default to null]
 **jcrcontent_cqdistribute** | **BOOLEAN**|  | [optional] [default to null]
 **jcrcontent_cqdistribute_type_hint** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_cqname** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_cqtemplate** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_enabled** | **BOOLEAN**|  | [optional] [default to null]
 **jcrcontent_jcrdescription** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_jcrlast_modified** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_jcrlast_modified_by** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_jcrmixin_types** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_jcrtitle** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_log_level** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_no_status_update** | **BOOLEAN**|  | [optional] [default to null]
 **jcrcontent_no_versioning** | **BOOLEAN**|  | [optional] [default to null]
 **jcrcontent_protocol_connect_timeout** | **REAL_32**|  | [optional] [default to null]
 **jcrcontent_protocol_ht_tp_connection_closed** | **BOOLEAN**|  | [optional] [default to null]
 **jcrcontent_protocol_ht_tp_expired** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_protocol_ht_tp_headers** | [**LIST [STRING_32]**](STRING_32.md)|  | [optional] [default to null]
 **jcrcontent_protocol_ht_tp_headers_type_hint** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_protocol_ht_tp_method** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_protocol_ht_tp_srelaxed** | **BOOLEAN**|  | [optional] [default to null]
 **jcrcontent_protocol_interface** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_protocol_socket_timeout** | **REAL_32**|  | [optional] [default to null]
 **jcrcontent_protocol_version** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_proxy_nt_lm_domain** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_proxy_nt_lm_host** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_proxy_host** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_proxy_password** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_proxy_port** | **REAL_32**|  | [optional] [default to null]
 **jcrcontent_proxy_user** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_queue_batch_max_size** | **REAL_32**|  | [optional] [default to null]
 **jcrcontent_queue_batch_mode** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_queue_batch_wait_time** | **REAL_32**|  | [optional] [default to null]
 **jcrcontent_retry_delay** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_reverse_replication** | **BOOLEAN**|  | [optional] [default to null]
 **jcrcontent_serialization_type** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_slingresource_type** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_ssl** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_transport_nt_lm_domain** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_transport_nt_lm_host** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_transport_password** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_transport_uri** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_transport_user** | **STRING_32**|  | [optional] [default to null]
 **jcrcontent_trigger_distribute** | **BOOLEAN**|  | [optional] [default to null]
 **jcrcontent_trigger_modified** | **BOOLEAN**|  | [optional] [default to null]
 **jcrcontent_trigger_on_off_time** | **BOOLEAN**|  | [optional] [default to null]
 **jcrcontent_trigger_receive** | **BOOLEAN**|  | [optional] [default to null]
 **jcrcontent_trigger_specific** | **BOOLEAN**|  | [optional] [default to null]
 **jcrcontent_user_id** | **STRING_32**|  | [optional] [default to null]
 **jcrprimary_type** | **STRING_32**|  | [optional] [default to null]
 **operation** | **STRING_32**|  | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_authorizable_keystore**
> post_authorizable_keystore (intermediate_path: STRING_32 ; authorizable_id: STRING_32 ; operation:  detachable STRING_32 ; current_password:  detachable STRING_32 ; new_password:  detachable STRING_32 ; re_password:  detachable STRING_32 ; key_password:  detachable STRING_32 ; key_store_pass:  detachable STRING_32 ; var_alias:  detachable STRING_32 ; new_alias:  detachable STRING_32 ; remove_alias:  detachable STRING_32 ; cert_chain:  detachable FILE ; pk:  detachable FILE ; key_store:  detachable FILE ): detachable KEYSTORE_INFO
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate_path** | **STRING_32**|  | [default to null]
 **authorizable_id** | **STRING_32**|  | [default to null]
 **operation** | **STRING_32**|  | [optional] [default to null]
 **current_password** | **STRING_32**|  | [optional] [default to null]
 **new_password** | **STRING_32**|  | [optional] [default to null]
 **re_password** | **STRING_32**|  | [optional] [default to null]
 **key_password** | **STRING_32**|  | [optional] [default to null]
 **key_store_pass** | **STRING_32**|  | [optional] [default to null]
 **var_alias** | **STRING_32**|  | [optional] [default to null]
 **new_alias** | **STRING_32**|  | [optional] [default to null]
 **remove_alias** | **STRING_32**|  | [optional] [default to null]
 **cert_chain** | **FILE**|  | [optional] [default to null]
 **pk** | **FILE**|  | [optional] [default to null]
 **key_store** | **FILE**|  | [optional] [default to null]

### Return type

[**KEYSTORE_INFO**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_authorizables**
> post_authorizables (authorizable_id: STRING_32 ; intermediate_path: STRING_32 ; create_user:  detachable STRING_32 ; create_group:  detachable STRING_32 ; reppassword:  detachable STRING_32 ; profile_given_name:  detachable STRING_32 ): detachable STRING_32
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizable_id** | **STRING_32**|  | [default to null]
 **intermediate_path** | **STRING_32**|  | [default to null]
 **create_user** | **STRING_32**|  | [optional] [default to null]
 **create_group** | **STRING_32**|  | [optional] [default to null]
 **reppassword** | **STRING_32**|  | [optional] [default to null]
 **profile_given_name** | **STRING_32**|  | [optional] [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_adobe_granite_saml_authentication_handler**
> post_config_adobe_granite_saml_authentication_handler (key_store_password:  detachable STRING_32 ; key_store_password_type_hint:  detachable STRING_32 ; service_ranking:  detachable INTEGER_32 ; service_ranking_type_hint:  detachable STRING_32 ; idp_http_redirect:  detachable BOOLEAN ; idp_http_redirect_type_hint:  detachable STRING_32 ; create_user:  detachable BOOLEAN ; create_user_type_hint:  detachable STRING_32 ; default_redirect_url:  detachable STRING_32 ; default_redirect_url_type_hint:  detachable STRING_32 ; user_id_attribute:  detachable STRING_32 ; user_id_attribute_type_hint:  detachable STRING_32 ; default_groups:  detachable LIST [STRING_32] ; default_groups_type_hint:  detachable STRING_32 ; idp_cert_alias:  detachable STRING_32 ; idp_cert_alias_type_hint:  detachable STRING_32 ; add_group_memberships:  detachable BOOLEAN ; add_group_memberships_type_hint:  detachable STRING_32 ; path:  detachable LIST [STRING_32] ; path_type_hint:  detachable STRING_32 ; synchronize_attributes:  detachable LIST [STRING_32] ; synchronize_attributes_type_hint:  detachable STRING_32 ; clock_tolerance:  detachable INTEGER_32 ; clock_tolerance_type_hint:  detachable STRING_32 ; group_membership_attribute:  detachable STRING_32 ; group_membership_attribute_type_hint:  detachable STRING_32 ; idp_url:  detachable STRING_32 ; idp_url_type_hint:  detachable STRING_32 ; logout_url:  detachable STRING_32 ; logout_url_type_hint:  detachable STRING_32 ; service_provider_entity_id:  detachable STRING_32 ; service_provider_entity_id_type_hint:  detachable STRING_32 ; assertion_consumer_service_ur_l:  detachable STRING_32 ; assertion_consumer_service_ur_ltype_hint:  detachable STRING_32 ; handle_logout:  detachable BOOLEAN ; handle_logout_type_hint:  detachable STRING_32 ; sp_private_key_alias:  detachable STRING_32 ; sp_private_key_alias_type_hint:  detachable STRING_32 ; use_encryption:  detachable BOOLEAN ; use_encryption_type_hint:  detachable STRING_32 ; name_id_format:  detachable STRING_32 ; name_id_format_type_hint:  detachable STRING_32 ; digest_method:  detachable STRING_32 ; digest_method_type_hint:  detachable STRING_32 ; signature_method:  detachable STRING_32 ; signature_method_type_hint:  detachable STRING_32 ; user_intermediate_path:  detachable STRING_32 ; user_intermediate_path_type_hint:  detachable STRING_32 )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_store_password** | **STRING_32**|  | [optional] [default to null]
 **key_store_password_type_hint** | **STRING_32**|  | [optional] [default to null]
 **service_ranking** | **INTEGER_32**|  | [optional] [default to null]
 **service_ranking_type_hint** | **STRING_32**|  | [optional] [default to null]
 **idp_http_redirect** | **BOOLEAN**|  | [optional] [default to null]
 **idp_http_redirect_type_hint** | **STRING_32**|  | [optional] [default to null]
 **create_user** | **BOOLEAN**|  | [optional] [default to null]
 **create_user_type_hint** | **STRING_32**|  | [optional] [default to null]
 **default_redirect_url** | **STRING_32**|  | [optional] [default to null]
 **default_redirect_url_type_hint** | **STRING_32**|  | [optional] [default to null]
 **user_id_attribute** | **STRING_32**|  | [optional] [default to null]
 **user_id_attribute_type_hint** | **STRING_32**|  | [optional] [default to null]
 **default_groups** | [**LIST [STRING_32]**](STRING_32.md)|  | [optional] [default to null]
 **default_groups_type_hint** | **STRING_32**|  | [optional] [default to null]
 **idp_cert_alias** | **STRING_32**|  | [optional] [default to null]
 **idp_cert_alias_type_hint** | **STRING_32**|  | [optional] [default to null]
 **add_group_memberships** | **BOOLEAN**|  | [optional] [default to null]
 **add_group_memberships_type_hint** | **STRING_32**|  | [optional] [default to null]
 **path** | [**LIST [STRING_32]**](STRING_32.md)|  | [optional] [default to null]
 **path_type_hint** | **STRING_32**|  | [optional] [default to null]
 **synchronize_attributes** | [**LIST [STRING_32]**](STRING_32.md)|  | [optional] [default to null]
 **synchronize_attributes_type_hint** | **STRING_32**|  | [optional] [default to null]
 **clock_tolerance** | **INTEGER_32**|  | [optional] [default to null]
 **clock_tolerance_type_hint** | **STRING_32**|  | [optional] [default to null]
 **group_membership_attribute** | **STRING_32**|  | [optional] [default to null]
 **group_membership_attribute_type_hint** | **STRING_32**|  | [optional] [default to null]
 **idp_url** | **STRING_32**|  | [optional] [default to null]
 **idp_url_type_hint** | **STRING_32**|  | [optional] [default to null]
 **logout_url** | **STRING_32**|  | [optional] [default to null]
 **logout_url_type_hint** | **STRING_32**|  | [optional] [default to null]
 **service_provider_entity_id** | **STRING_32**|  | [optional] [default to null]
 **service_provider_entity_id_type_hint** | **STRING_32**|  | [optional] [default to null]
 **assertion_consumer_service_ur_l** | **STRING_32**|  | [optional] [default to null]
 **assertion_consumer_service_ur_ltype_hint** | **STRING_32**|  | [optional] [default to null]
 **handle_logout** | **BOOLEAN**|  | [optional] [default to null]
 **handle_logout_type_hint** | **STRING_32**|  | [optional] [default to null]
 **sp_private_key_alias** | **STRING_32**|  | [optional] [default to null]
 **sp_private_key_alias_type_hint** | **STRING_32**|  | [optional] [default to null]
 **use_encryption** | **BOOLEAN**|  | [optional] [default to null]
 **use_encryption_type_hint** | **STRING_32**|  | [optional] [default to null]
 **name_id_format** | **STRING_32**|  | [optional] [default to null]
 **name_id_format_type_hint** | **STRING_32**|  | [optional] [default to null]
 **digest_method** | **STRING_32**|  | [optional] [default to null]
 **digest_method_type_hint** | **STRING_32**|  | [optional] [default to null]
 **signature_method** | **STRING_32**|  | [optional] [default to null]
 **signature_method_type_hint** | **STRING_32**|  | [optional] [default to null]
 **user_intermediate_path** | **STRING_32**|  | [optional] [default to null]
 **user_intermediate_path_type_hint** | **STRING_32**|  | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_felix_jetty_based_http_service**
> post_config_apache_felix_jetty_based_http_service (org_apache_felix_https_nio:  detachable BOOLEAN ; org_apache_felix_https_nio_type_hint:  detachable STRING_32 ; org_apache_felix_https_keystore:  detachable STRING_32 ; org_apache_felix_https_keystore_type_hint:  detachable STRING_32 ; org_apache_felix_https_keystore_password:  detachable STRING_32 ; org_apache_felix_https_keystore_password_type_hint:  detachable STRING_32 ; org_apache_felix_https_keystore_key:  detachable STRING_32 ; org_apache_felix_https_keystore_key_type_hint:  detachable STRING_32 ; org_apache_felix_https_keystore_key_password:  detachable STRING_32 ; org_apache_felix_https_keystore_key_password_type_hint:  detachable STRING_32 ; org_apache_felix_https_truststore:  detachable STRING_32 ; org_apache_felix_https_truststore_type_hint:  detachable STRING_32 ; org_apache_felix_https_truststore_password:  detachable STRING_32 ; org_apache_felix_https_truststore_password_type_hint:  detachable STRING_32 ; org_apache_felix_https_clientcertificate:  detachable STRING_32 ; org_apache_felix_https_clientcertificate_type_hint:  detachable STRING_32 ; org_apache_felix_https_enable:  detachable BOOLEAN ; org_apache_felix_https_enable_type_hint:  detachable STRING_32 ; org_osgi_service_http_port_secure:  detachable STRING_32 ; org_osgi_service_http_port_secure_type_hint:  detachable STRING_32 )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org_apache_felix_https_nio** | **BOOLEAN**|  | [optional] [default to null]
 **org_apache_felix_https_nio_type_hint** | **STRING_32**|  | [optional] [default to null]
 **org_apache_felix_https_keystore** | **STRING_32**|  | [optional] [default to null]
 **org_apache_felix_https_keystore_type_hint** | **STRING_32**|  | [optional] [default to null]
 **org_apache_felix_https_keystore_password** | **STRING_32**|  | [optional] [default to null]
 **org_apache_felix_https_keystore_password_type_hint** | **STRING_32**|  | [optional] [default to null]
 **org_apache_felix_https_keystore_key** | **STRING_32**|  | [optional] [default to null]
 **org_apache_felix_https_keystore_key_type_hint** | **STRING_32**|  | [optional] [default to null]
 **org_apache_felix_https_keystore_key_password** | **STRING_32**|  | [optional] [default to null]
 **org_apache_felix_https_keystore_key_password_type_hint** | **STRING_32**|  | [optional] [default to null]
 **org_apache_felix_https_truststore** | **STRING_32**|  | [optional] [default to null]
 **org_apache_felix_https_truststore_type_hint** | **STRING_32**|  | [optional] [default to null]
 **org_apache_felix_https_truststore_password** | **STRING_32**|  | [optional] [default to null]
 **org_apache_felix_https_truststore_password_type_hint** | **STRING_32**|  | [optional] [default to null]
 **org_apache_felix_https_clientcertificate** | **STRING_32**|  | [optional] [default to null]
 **org_apache_felix_https_clientcertificate_type_hint** | **STRING_32**|  | [optional] [default to null]
 **org_apache_felix_https_enable** | **BOOLEAN**|  | [optional] [default to null]
 **org_apache_felix_https_enable_type_hint** | **STRING_32**|  | [optional] [default to null]
 **org_osgi_service_http_port_secure** | **STRING_32**|  | [optional] [default to null]
 **org_osgi_service_http_port_secure_type_hint** | **STRING_32**|  | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_http_components_proxy_configuration**
> post_config_apache_http_components_proxy_configuration (proxy_host:  detachable STRING_32 ; proxy_host_type_hint:  detachable STRING_32 ; proxy_port:  detachable INTEGER_32 ; proxy_port_type_hint:  detachable STRING_32 ; proxy_exceptions:  detachable LIST [STRING_32] ; proxy_exceptions_type_hint:  detachable STRING_32 ; proxy_enabled:  detachable BOOLEAN ; proxy_enabled_type_hint:  detachable STRING_32 ; proxy_user:  detachable STRING_32 ; proxy_user_type_hint:  detachable STRING_32 ; proxy_password:  detachable STRING_32 ; proxy_password_type_hint:  detachable STRING_32 )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxy_host** | **STRING_32**|  | [optional] [default to null]
 **proxy_host_type_hint** | **STRING_32**|  | [optional] [default to null]
 **proxy_port** | **INTEGER_32**|  | [optional] [default to null]
 **proxy_port_type_hint** | **STRING_32**|  | [optional] [default to null]
 **proxy_exceptions** | [**LIST [STRING_32]**](STRING_32.md)|  | [optional] [default to null]
 **proxy_exceptions_type_hint** | **STRING_32**|  | [optional] [default to null]
 **proxy_enabled** | **BOOLEAN**|  | [optional] [default to null]
 **proxy_enabled_type_hint** | **STRING_32**|  | [optional] [default to null]
 **proxy_user** | **STRING_32**|  | [optional] [default to null]
 **proxy_user_type_hint** | **STRING_32**|  | [optional] [default to null]
 **proxy_password** | **STRING_32**|  | [optional] [default to null]
 **proxy_password_type_hint** | **STRING_32**|  | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_sling_dav_ex_servlet**
> post_config_apache_sling_dav_ex_servlet (var_alias:  detachable STRING_32 ; alias_type_hint:  detachable STRING_32 ; dav_create_absolute_uri:  detachable BOOLEAN ; dav_create_absolute_uri_type_hint:  detachable STRING_32 )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **var_alias** | **STRING_32**|  | [optional] [default to null]
 **alias_type_hint** | **STRING_32**|  | [optional] [default to null]
 **dav_create_absolute_uri** | **BOOLEAN**|  | [optional] [default to null]
 **dav_create_absolute_uri_type_hint** | **STRING_32**|  | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_sling_get_servlet**
> post_config_apache_sling_get_servlet (json_maximumresults:  detachable STRING_32 ; json_maximumresults_type_hint:  detachable STRING_32 ; enable_html:  detachable BOOLEAN ; enable_html_type_hint:  detachable STRING_32 ; enable_txt:  detachable BOOLEAN ; enable_txt_type_hint:  detachable STRING_32 ; enable_xml:  detachable BOOLEAN ; enable_xml_type_hint:  detachable STRING_32 )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **json_maximumresults** | **STRING_32**|  | [optional] [default to null]
 **json_maximumresults_type_hint** | **STRING_32**|  | [optional] [default to null]
 **enable_html** | **BOOLEAN**|  | [optional] [default to null]
 **enable_html_type_hint** | **STRING_32**|  | [optional] [default to null]
 **enable_txt** | **BOOLEAN**|  | [optional] [default to null]
 **enable_txt_type_hint** | **STRING_32**|  | [optional] [default to null]
 **enable_xml** | **BOOLEAN**|  | [optional] [default to null]
 **enable_xml_type_hint** | **STRING_32**|  | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_sling_referrer_filter**
> post_config_apache_sling_referrer_filter (allow_empty:  detachable BOOLEAN ; allow_empty_type_hint:  detachable STRING_32 ; allow_hosts:  detachable STRING_32 ; allow_hosts_type_hint:  detachable STRING_32 ; allow_hosts_regexp:  detachable STRING_32 ; allow_hosts_regexp_type_hint:  detachable STRING_32 ; filter_methods:  detachable STRING_32 ; filter_methods_type_hint:  detachable STRING_32 )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allow_empty** | **BOOLEAN**|  | [optional] [default to null]
 **allow_empty_type_hint** | **STRING_32**|  | [optional] [default to null]
 **allow_hosts** | **STRING_32**|  | [optional] [default to null]
 **allow_hosts_type_hint** | **STRING_32**|  | [optional] [default to null]
 **allow_hosts_regexp** | **STRING_32**|  | [optional] [default to null]
 **allow_hosts_regexp_type_hint** | **STRING_32**|  | [optional] [default to null]
 **filter_methods** | **STRING_32**|  | [optional] [default to null]
 **filter_methods_type_hint** | **STRING_32**|  | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_property**
> post_config_property (config_node_name: STRING_32 )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **config_node_name** | **STRING_32**|  | [default to null]

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_node**
> post_node (path: STRING_32 ; name: STRING_32 ; operation:  detachable STRING_32 ; delete_authorizable:  detachable STRING_32 ; file:  detachable FILE )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **STRING_32**|  | [default to null]
 **name** | **STRING_32**|  | [default to null]
 **operation** | **STRING_32**|  | [optional] [default to null]
 **delete_authorizable** | **STRING_32**|  | [optional] [default to null]
 **file** | **FILE**|  | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_node_rw**
> post_node_rw (path: STRING_32 ; name: STRING_32 ; add_members:  detachable STRING_32 )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **STRING_32**|  | [default to null]
 **name** | **STRING_32**|  | [default to null]
 **add_members** | **STRING_32**|  | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_path**
> post_path (path: STRING_32 ; jcrprimary_type: STRING_32 ; name: STRING_32 )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **STRING_32**|  | [default to null]
 **jcrprimary_type** | **STRING_32**|  | [default to null]
 **name** | **STRING_32**|  | [default to null]

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_query**
> post_query (path: STRING_32 ; p_limit: REAL_32 ; var_1_property: STRING_32 ; var_1_property_value: STRING_32 ): detachable STRING_32
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **STRING_32**|  | [default to null]
 **p_limit** | **REAL_32**|  | [default to null]
 **var_1_property** | **STRING_32**|  | [default to null]
 **var_1_property_value** | **STRING_32**|  | [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_tree_activation**
> post_tree_activation (ignoredeactivated: BOOLEAN ; onlymodified: BOOLEAN ; path: STRING_32 )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoredeactivated** | **BOOLEAN**|  | [default to null]
 **onlymodified** | **BOOLEAN**|  | [default to null]
 **path** | **STRING_32**|  | [default to null]

### Return type

{empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_truststore**
> post_truststore (operation:  detachable STRING_32 ; new_password:  detachable STRING_32 ; re_password:  detachable STRING_32 ; key_store_type:  detachable STRING_32 ; remove_alias:  detachable STRING_32 ; certificate:  detachable FILE ): detachable STRING_32
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operation** | **STRING_32**|  | [optional] [default to null]
 **new_password** | **STRING_32**|  | [optional] [default to null]
 **re_password** | **STRING_32**|  | [optional] [default to null]
 **key_store_type** | **STRING_32**|  | [optional] [default to null]
 **remove_alias** | **STRING_32**|  | [optional] [default to null]
 **certificate** | **FILE**|  | [optional] [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_truststore_pk_cs12**
> post_truststore_pk_cs12 (truststore_p12:  detachable FILE ): detachable STRING_32
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststore_p12** | **FILE**|  | [optional] [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **query**
> query (path: STRING_32 ; p_limit: REAL_32 ; var_1_property: STRING_32 ; var_1_property_value: STRING_32 ): detachable STRING_32
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **STRING_32**|  | [default to null]
 **p_limit** | **REAL_32**|  | [default to null]
 **var_1_property** | **STRING_32**|  | [default to null]
 **var_1_property_value** | **STRING_32**|  | [default to null]

### Return type

[**STRING_32**](STRING_32.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **truststore**
> truststore : detachable FILE
	




### Parameters
This endpoint does not need any parameter.

### Return type

[**FILE**](FILE.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **truststore_info**
> truststore_info : detachable TRUSTSTORE_INFO
	




### Parameters
This endpoint does not need any parameter.

### Return type

[**TRUSTSTORE_INFO**](TruststoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

