# \SlingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_agent**](SlingApi.md#delete_agent) | **Delete** /etc/replication/agents.{runmode}/{name} | 
[**delete_node**](SlingApi.md#delete_node) | **Delete** /{path}/{name} | 
[**get_agent**](SlingApi.md#get_agent) | **Get** /etc/replication/agents.{runmode}/{name} | 
[**get_agents**](SlingApi.md#get_agents) | **Get** /etc/replication/agents.{runmode}.-1.json | 
[**get_authorizable_keystore**](SlingApi.md#get_authorizable_keystore) | **Get** /{intermediatePath}/{authorizableId}.ks.json | 
[**get_keystore**](SlingApi.md#get_keystore) | **Get** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
[**get_node**](SlingApi.md#get_node) | **Get** /{path}/{name} | 
[**get_package**](SlingApi.md#get_package) | **Get** /etc/packages/{group}/{name}-{version}.zip | 
[**get_package_filter**](SlingApi.md#get_package_filter) | **Get** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
[**get_query**](SlingApi.md#get_query) | **Get** /bin/querybuilder.json | 
[**get_truststore**](SlingApi.md#get_truststore) | **Get** /etc/truststore/truststore.p12 | 
[**get_truststore_info**](SlingApi.md#get_truststore_info) | **Get** /libs/granite/security/truststore.json | 
[**post_agent**](SlingApi.md#post_agent) | **Post** /etc/replication/agents.{runmode}/{name} | 
[**post_authorizable_keystore**](SlingApi.md#post_authorizable_keystore) | **Post** /{intermediatePath}/{authorizableId}.ks.html | 
[**post_authorizables**](SlingApi.md#post_authorizables) | **Post** /libs/granite/security/post/authorizables | 
[**post_config_adobe_granite_saml_authentication_handler**](SlingApi.md#post_config_adobe_granite_saml_authentication_handler) | **Post** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
[**post_config_apache_felix_jetty_based_http_service**](SlingApi.md#post_config_apache_felix_jetty_based_http_service) | **Post** /apps/system/config/org.apache.felix.http | 
[**post_config_apache_http_components_proxy_configuration**](SlingApi.md#post_config_apache_http_components_proxy_configuration) | **Post** /apps/system/config/org.apache.http.proxyconfigurator.config | 
[**post_config_apache_sling_dav_ex_servlet**](SlingApi.md#post_config_apache_sling_dav_ex_servlet) | **Post** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
[**post_config_apache_sling_get_servlet**](SlingApi.md#post_config_apache_sling_get_servlet) | **Post** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
[**post_config_apache_sling_referrer_filter**](SlingApi.md#post_config_apache_sling_referrer_filter) | **Post** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
[**post_node**](SlingApi.md#post_node) | **Post** /{path}/{name} | 
[**post_node_rw**](SlingApi.md#post_node_rw) | **Post** /{path}/{name}.rw.html | 
[**post_path**](SlingApi.md#post_path) | **Post** /{path}/ | 
[**post_query**](SlingApi.md#post_query) | **Post** /bin/querybuilder.json | 
[**post_tree_activation**](SlingApi.md#post_tree_activation) | **Post** /etc/replication/treeactivation.html | 
[**post_truststore**](SlingApi.md#post_truststore) | **Post** /libs/granite/security/post/truststore | 
[**post_truststore_pkcs12**](SlingApi.md#post_truststore_pkcs12) | **Post** /etc/truststore | 


# **delete_agent**
> delete_agent(ctx, runmode, name)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **runmode** | **String**|  | 
  **name** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_node**
> delete_node(ctx, path, name)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **path** | **String**|  | 
  **name** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_agent**
> get_agent(ctx, runmode, name)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **runmode** | **String**|  | 
  **name** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_agents**
> String get_agents(ctx, runmode)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **runmode** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_authorizable_keystore**
> ::models::KeystoreInfo get_authorizable_keystore(ctx, intermediate_path, authorizable_id)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **intermediate_path** | **String**|  | 
  **authorizable_id** | **String**|  | 

### Return type

[**::models::KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_keystore**
> ::models::File get_keystore(ctx, intermediate_path, authorizable_id)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **intermediate_path** | **String**|  | 
  **authorizable_id** | **String**|  | 

### Return type

[**::models::File**](::models::File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_node**
> get_node(ctx, path, name)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **path** | **String**|  | 
  **name** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_package**
> ::models::File get_package(ctx, group, name, version)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **group** | **String**|  | 
  **name** | **String**|  | 
  **version** | **String**|  | 

### Return type

[**::models::File**](::models::File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_package_filter**
> String get_package_filter(ctx, group, name, version)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **group** | **String**|  | 
  **name** | **String**|  | 
  **version** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_query**
> String get_query(ctx, path, p_limit, var_1_property, var_1_property_value)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **path** | **String**|  | 
  **p_limit** | **f32**|  | 
  **var_1_property** | **String**|  | 
  **var_1_property_value** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_truststore**
> ::models::File get_truststore(ctx, )


### Required Parameters
This endpoint does not need any parameter.

### Return type

[**::models::File**](::models::File.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_truststore_info**
> ::models::TruststoreInfo get_truststore_info(ctx, )


### Required Parameters
This endpoint does not need any parameter.

### Return type

[**::models::TruststoreInfo**](TruststoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_agent**
> post_agent(ctx, runmode, name, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **runmode** | **String**|  | 
  **name** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **runmode** | **String**|  | 
 **name** | **String**|  | 
 **jcrcontentcqdistribute** | **bool**|  | 
 **jcrcontentcqdistribute_type_hint** | **String**|  | 
 **jcrcontentcqname** | **String**|  | 
 **jcrcontentcqtemplate** | **String**|  | 
 **jcrcontentenabled** | **bool**|  | 
 **jcrcontentjcrdescription** | **String**|  | 
 **jcrcontentjcrlast_modified** | **String**|  | 
 **jcrcontentjcrlast_modified_by** | **String**|  | 
 **jcrcontentjcrmixin_types** | **String**|  | 
 **jcrcontentjcrtitle** | **String**|  | 
 **jcrcontentlog_level** | **String**|  | 
 **jcrcontentno_status_update** | **bool**|  | 
 **jcrcontentno_versioning** | **bool**|  | 
 **jcrcontentprotocol_connect_timeout** | **f32**|  | 
 **jcrcontentprotocol_http_connection_closed** | **bool**|  | 
 **jcrcontentprotocol_http_expired** | **String**|  | 
 **jcrcontentprotocol_http_headers** | [**Vec&lt;String&gt;**](String.md)|  | 
 **jcrcontentprotocol_http_headers_type_hint** | **String**|  | 
 **jcrcontentprotocol_http_method** | **String**|  | 
 **jcrcontentprotocol_https_relaxed** | **bool**|  | 
 **jcrcontentprotocol_interface** | **String**|  | 
 **jcrcontentprotocol_socket_timeout** | **f32**|  | 
 **jcrcontentprotocol_version** | **String**|  | 
 **jcrcontentproxy_ntlm_domain** | **String**|  | 
 **jcrcontentproxy_ntlm_host** | **String**|  | 
 **jcrcontentproxy_host** | **String**|  | 
 **jcrcontentproxy_password** | **String**|  | 
 **jcrcontentproxy_port** | **f32**|  | 
 **jcrcontentproxy_user** | **String**|  | 
 **jcrcontentqueue_batch_max_size** | **f32**|  | 
 **jcrcontentqueue_batch_mode** | **String**|  | 
 **jcrcontentqueue_batch_wait_time** | **f32**|  | 
 **jcrcontentretry_delay** | **String**|  | 
 **jcrcontentreverse_replication** | **bool**|  | 
 **jcrcontentserialization_type** | **String**|  | 
 **jcrcontentslingresource_type** | **String**|  | 
 **jcrcontentssl** | **String**|  | 
 **jcrcontenttransport_ntlm_domain** | **String**|  | 
 **jcrcontenttransport_ntlm_host** | **String**|  | 
 **jcrcontenttransport_password** | **String**|  | 
 **jcrcontenttransport_uri** | **String**|  | 
 **jcrcontenttransport_user** | **String**|  | 
 **jcrcontenttrigger_distribute** | **bool**|  | 
 **jcrcontenttrigger_modified** | **bool**|  | 
 **jcrcontenttrigger_on_off_time** | **bool**|  | 
 **jcrcontenttrigger_receive** | **bool**|  | 
 **jcrcontenttrigger_specific** | **bool**|  | 
 **jcrcontentuser_id** | **String**|  | 
 **jcrprimary_type** | **String**|  | 
 **operation** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_authorizable_keystore**
> ::models::KeystoreInfo post_authorizable_keystore(ctx, intermediate_path, authorizable_id, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **intermediate_path** | **String**|  | 
  **authorizable_id** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **intermediate_path** | **String**|  | 
 **authorizable_id** | **String**|  | 
 **operation** | **String**|  | 
 **current_password** | **String**|  | 
 **new_password** | **String**|  | 
 **re_password** | **String**|  | 
 **key_password** | **String**|  | 
 **key_store_pass** | **String**|  | 
 **alias** | **String**|  | 
 **new_alias** | **String**|  | 
 **remove_alias** | **String**|  | 
 **cert_chain** | **::models::File**|  | 
 **pk** | **::models::File**|  | 
 **key_store** | **::models::File**|  | 

### Return type

[**::models::KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_authorizables**
> String post_authorizables(ctx, authorizable_id, intermediate_path, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **authorizable_id** | **String**|  | 
  **intermediate_path** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorizable_id** | **String**|  | 
 **intermediate_path** | **String**|  | 
 **create_user** | **String**|  | 
 **create_group** | **String**|  | 
 **reppassword** | **String**|  | 
 **profilegiven_name** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_adobe_granite_saml_authentication_handler**
> post_config_adobe_granite_saml_authentication_handler(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_store_password** | **String**|  | 
 **key_store_password_type_hint** | **String**|  | 
 **service_ranking** | **i32**|  | 
 **service_ranking_type_hint** | **String**|  | 
 **idp_http_redirect** | **bool**|  | 
 **idp_http_redirect_type_hint** | **String**|  | 
 **create_user** | **bool**|  | 
 **create_user_type_hint** | **String**|  | 
 **default_redirect_url** | **String**|  | 
 **default_redirect_url_type_hint** | **String**|  | 
 **user_id_attribute** | **String**|  | 
 **user_id_attribute_type_hint** | **String**|  | 
 **default_groups** | [**Vec&lt;String&gt;**](String.md)|  | 
 **default_groups_type_hint** | **String**|  | 
 **idp_cert_alias** | **String**|  | 
 **idp_cert_alias_type_hint** | **String**|  | 
 **add_group_memberships** | **bool**|  | 
 **add_group_memberships_type_hint** | **String**|  | 
 **path** | [**Vec&lt;String&gt;**](String.md)|  | 
 **path_type_hint** | **String**|  | 
 **synchronize_attributes** | [**Vec&lt;String&gt;**](String.md)|  | 
 **synchronize_attributes_type_hint** | **String**|  | 
 **clock_tolerance** | **i32**|  | 
 **clock_tolerance_type_hint** | **String**|  | 
 **group_membership_attribute** | **String**|  | 
 **group_membership_attribute_type_hint** | **String**|  | 
 **idp_url** | **String**|  | 
 **idp_url_type_hint** | **String**|  | 
 **logout_url** | **String**|  | 
 **logout_url_type_hint** | **String**|  | 
 **service_provider_entity_id** | **String**|  | 
 **service_provider_entity_id_type_hint** | **String**|  | 
 **assertion_consumer_service_url** | **String**|  | 
 **assertion_consumer_service_url_type_hint** | **String**|  | 
 **handle_logout** | **bool**|  | 
 **handle_logout_type_hint** | **String**|  | 
 **sp_private_key_alias** | **String**|  | 
 **sp_private_key_alias_type_hint** | **String**|  | 
 **use_encryption** | **bool**|  | 
 **use_encryption_type_hint** | **String**|  | 
 **name_id_format** | **String**|  | 
 **name_id_format_type_hint** | **String**|  | 
 **digest_method** | **String**|  | 
 **digest_method_type_hint** | **String**|  | 
 **signature_method** | **String**|  | 
 **signature_method_type_hint** | **String**|  | 
 **user_intermediate_path** | **String**|  | 
 **user_intermediate_path_type_hint** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_felix_jetty_based_http_service**
> post_config_apache_felix_jetty_based_http_service(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **org_apache_felix_https_nio** | **bool**|  | 
 **org_apache_felix_https_nio_type_hint** | **String**|  | 
 **org_apache_felix_https_keystore** | **String**|  | 
 **org_apache_felix_https_keystore_type_hint** | **String**|  | 
 **org_apache_felix_https_keystore_password** | **String**|  | 
 **org_apache_felix_https_keystore_password_type_hint** | **String**|  | 
 **org_apache_felix_https_keystore_key** | **String**|  | 
 **org_apache_felix_https_keystore_key_type_hint** | **String**|  | 
 **org_apache_felix_https_keystore_key_password** | **String**|  | 
 **org_apache_felix_https_keystore_key_password_type_hint** | **String**|  | 
 **org_apache_felix_https_truststore** | **String**|  | 
 **org_apache_felix_https_truststore_type_hint** | **String**|  | 
 **org_apache_felix_https_truststore_password** | **String**|  | 
 **org_apache_felix_https_truststore_password_type_hint** | **String**|  | 
 **org_apache_felix_https_clientcertificate** | **String**|  | 
 **org_apache_felix_https_clientcertificate_type_hint** | **String**|  | 
 **org_apache_felix_https_enable** | **bool**|  | 
 **org_apache_felix_https_enable_type_hint** | **String**|  | 
 **org_osgi_service_http_port_secure** | **String**|  | 
 **org_osgi_service_http_port_secure_type_hint** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_http_components_proxy_configuration**
> post_config_apache_http_components_proxy_configuration(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxy_host** | **String**|  | 
 **proxy_host_type_hint** | **String**|  | 
 **proxy_port** | **i32**|  | 
 **proxy_port_type_hint** | **String**|  | 
 **proxy_exceptions** | [**Vec&lt;String&gt;**](String.md)|  | 
 **proxy_exceptions_type_hint** | **String**|  | 
 **proxy_enabled** | **bool**|  | 
 **proxy_enabled_type_hint** | **String**|  | 
 **proxy_user** | **String**|  | 
 **proxy_user_type_hint** | **String**|  | 
 **proxy_password** | **String**|  | 
 **proxy_password_type_hint** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_sling_dav_ex_servlet**
> post_config_apache_sling_dav_ex_servlet(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **alias** | **String**|  | 
 **alias_type_hint** | **String**|  | 
 **dav_create_absolute_uri** | **bool**|  | 
 **dav_create_absolute_uri_type_hint** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_sling_get_servlet**
> post_config_apache_sling_get_servlet(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **json_maximumresults** | **String**|  | 
 **json_maximumresults_type_hint** | **String**|  | 
 **enable_html** | **bool**|  | 
 **enable_html_type_hint** | **String**|  | 
 **enable_txt** | **bool**|  | 
 **enable_txt_type_hint** | **String**|  | 
 **enable_xml** | **bool**|  | 
 **enable_xml_type_hint** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_config_apache_sling_referrer_filter**
> post_config_apache_sling_referrer_filter(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allow_empty** | **bool**|  | 
 **allow_empty_type_hint** | **String**|  | 
 **allow_hosts** | **String**|  | 
 **allow_hosts_type_hint** | **String**|  | 
 **allow_hosts_regexp** | **String**|  | 
 **allow_hosts_regexp_type_hint** | **String**|  | 
 **filter_methods** | **String**|  | 
 **filter_methods_type_hint** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_node**
> post_node(ctx, path, name, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **path** | **String**|  | 
  **name** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **name** | **String**|  | 
 **operation** | **String**|  | 
 **delete_authorizable** | **String**|  | 
 **file** | **::models::File**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_node_rw**
> post_node_rw(ctx, path, name, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **path** | **String**|  | 
  **name** | **String**|  | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**|  | 
 **name** | **String**|  | 
 **add_members** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_path**
> post_path(ctx, path, jcrprimary_type, name)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **path** | **String**|  | 
  **jcrprimary_type** | **String**|  | 
  **name** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_query**
> String post_query(ctx, path, p_limit, var_1_property, var_1_property_value)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **path** | **String**|  | 
  **p_limit** | **f32**|  | 
  **var_1_property** | **String**|  | 
  **var_1_property_value** | **String**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_tree_activation**
> post_tree_activation(ctx, ignoredeactivated, onlymodified, path)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ignoredeactivated** | **bool**|  | 
  **onlymodified** | **bool**|  | 
  **path** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_truststore**
> String post_truststore(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operation** | **String**|  | 
 **new_password** | **String**|  | 
 **re_password** | **String**|  | 
 **key_store_type** | **String**|  | 
 **remove_alias** | **String**|  | 
 **certificate** | **::models::File**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_truststore_pkcs12**
> String post_truststore_pkcs12(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststore_p12** | **::models::File**|  | 

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

