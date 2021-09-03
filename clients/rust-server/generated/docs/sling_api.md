# sling_api

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
**deleteAgent**](sling_api.md#deleteAgent) | **DELETE** /etc/replication/agents.{runmode}/{name} | 
**deleteNode**](sling_api.md#deleteNode) | **DELETE** /{path}/{name} | 
**getAgent**](sling_api.md#getAgent) | **GET** /etc/replication/agents.{runmode}/{name} | 
**getAgents**](sling_api.md#getAgents) | **GET** /etc/replication/agents.{runmode}.-1.json | 
**getAuthorizableKeystore**](sling_api.md#getAuthorizableKeystore) | **GET** /{intermediatePath}/{authorizableId}.ks.json | 
**getKeystore**](sling_api.md#getKeystore) | **GET** /{intermediatePath}/{authorizableId}/keystore/store.p12 | 
**getNode**](sling_api.md#getNode) | **GET** /{path}/{name} | 
**getPackage**](sling_api.md#getPackage) | **GET** /etc/packages/{group}/{name}-{version}.zip | 
**getPackageFilter**](sling_api.md#getPackageFilter) | **GET** /etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json | 
**getQuery**](sling_api.md#getQuery) | **GET** /bin/querybuilder.json | 
**getTruststore**](sling_api.md#getTruststore) | **GET** /etc/truststore/truststore.p12 | 
**getTruststoreInfo**](sling_api.md#getTruststoreInfo) | **GET** /libs/granite/security/truststore.json | 
**postAgent**](sling_api.md#postAgent) | **POST** /etc/replication/agents.{runmode}/{name} | 
**postAuthorizableKeystore**](sling_api.md#postAuthorizableKeystore) | **POST** /{intermediatePath}/{authorizableId}.ks.html | 
**postAuthorizables**](sling_api.md#postAuthorizables) | **POST** /libs/granite/security/post/authorizables | 
**postConfigAdobeGraniteSamlAuthenticationHandler**](sling_api.md#postConfigAdobeGraniteSamlAuthenticationHandler) | **POST** /apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config | 
**postConfigApacheFelixJettyBasedHttpService**](sling_api.md#postConfigApacheFelixJettyBasedHttpService) | **POST** /apps/system/config/org.apache.felix.http | 
**postConfigApacheHttpComponentsProxyConfiguration**](sling_api.md#postConfigApacheHttpComponentsProxyConfiguration) | **POST** /apps/system/config/org.apache.http.proxyconfigurator.config | 
**postConfigApacheSlingDavExServlet**](sling_api.md#postConfigApacheSlingDavExServlet) | **POST** /apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
**postConfigApacheSlingGetServlet**](sling_api.md#postConfigApacheSlingGetServlet) | **POST** /apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet | 
**postConfigApacheSlingReferrerFilter**](sling_api.md#postConfigApacheSlingReferrerFilter) | **POST** /apps/system/config/org.apache.sling.security.impl.ReferrerFilter | 
**postConfigProperty**](sling_api.md#postConfigProperty) | **POST** /apps/system/config/{configNodeName} | 
**postNode**](sling_api.md#postNode) | **POST** /{path}/{name} | 
**postNodeRw**](sling_api.md#postNodeRw) | **POST** /{path}/{name}.rw.html | 
**postPath**](sling_api.md#postPath) | **POST** /{path}/ | 
**postQuery**](sling_api.md#postQuery) | **POST** /bin/querybuilder.json | 
**postTreeActivation**](sling_api.md#postTreeActivation) | **POST** /etc/replication/treeactivation.html | 
**postTruststore**](sling_api.md#postTruststore) | **POST** /libs/granite/security/post/truststore | 
**postTruststorePKCS12**](sling_api.md#postTruststorePKCS12) | **POST** /etc/truststore | 


# **deleteAgent**
> deleteAgent(ctx, runmode, name)


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

# **deleteNode**
> deleteNode(ctx, path, name)


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

# **getAgent**
> getAgent(ctx, runmode, name)


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

# **getAgents**
> String getAgents(ctx, runmode)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **runmode** | **String**|  | 

### Return type

[**String**](string.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAuthorizableKeystore**
> models::KeystoreInfo getAuthorizableKeystore(ctx, intermediate_path, authorizable_id)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **intermediate_path** | **String**|  | 
  **authorizable_id** | **String**|  | 

### Return type

[**models::KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getKeystore**
> swagger::ByteArray getKeystore(ctx, intermediate_path, authorizable_id)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **intermediate_path** | **String**|  | 
  **authorizable_id** | **String**|  | 

### Return type

[**swagger::ByteArray**](file.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getNode**
> getNode(ctx, path, name)


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

# **getPackage**
> swagger::ByteArray getPackage(ctx, group, name, version)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **group** | **String**|  | 
  **name** | **String**|  | 
  **version** | **String**|  | 

### Return type

[**swagger::ByteArray**](file.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPackageFilter**
> String getPackageFilter(ctx, group, name, version)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **group** | **String**|  | 
  **name** | **String**|  | 
  **version** | **String**|  | 

### Return type

[**String**](string.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getQuery**
> String getQuery(ctx, path, p_limit, param_1_property, param_1_property_value)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **path** | **String**|  | 
  **p_limit** | **f64**|  | 
  **param_1_property** | **String**|  | 
  **param_1_property_value** | **String**|  | 

### Return type

[**String**](string.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getTruststore**
> swagger::ByteArray getTruststore(ctx, )


### Required Parameters
This endpoint does not need any parameter.

### Return type

[**swagger::ByteArray**](file.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getTruststoreInfo**
> models::TruststoreInfo getTruststoreInfo(ctx, )


### Required Parameters
This endpoint does not need any parameter.

### Return type

[**models::TruststoreInfo**](TruststoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postAgent**
> postAgent(ctx, runmode, name, optional)


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
 **jcrcontent_cqdistribute** | **bool**|  | 
 **jcrcontent_cqdistribute_type_hint** | **String**|  | 
 **jcrcontent_cqname** | **String**|  | 
 **jcrcontent_cqtemplate** | **String**|  | 
 **jcrcontent_enabled** | **bool**|  | 
 **jcrcontent_jcrdescription** | **String**|  | 
 **jcrcontent_jcrlast_modified** | **String**|  | 
 **jcrcontent_jcrlast_modified_by** | **String**|  | 
 **jcrcontent_jcrmixin_types** | **String**|  | 
 **jcrcontent_jcrtitle** | **String**|  | 
 **jcrcontent_log_level** | **String**|  | 
 **jcrcontent_no_status_update** | **bool**|  | 
 **jcrcontent_no_versioning** | **bool**|  | 
 **jcrcontent_protocol_connect_timeout** | **f64**|  | 
 **jcrcontent_protocol_http_connection_closed** | **bool**|  | 
 **jcrcontent_protocol_http_expired** | **String**|  | 
 **jcrcontent_protocol_http_headers** | [**String**](String.md)|  | 
 **jcrcontent_protocol_http_headers_type_hint** | **String**|  | 
 **jcrcontent_protocol_http_method** | **String**|  | 
 **jcrcontent_protocol_https_relaxed** | **bool**|  | 
 **jcrcontent_protocol_interface** | **String**|  | 
 **jcrcontent_protocol_socket_timeout** | **f64**|  | 
 **jcrcontent_protocol_version** | **String**|  | 
 **jcrcontent_proxy_ntlm_domain** | **String**|  | 
 **jcrcontent_proxy_ntlm_host** | **String**|  | 
 **jcrcontent_proxy_host** | **String**|  | 
 **jcrcontent_proxy_password** | **String**|  | 
 **jcrcontent_proxy_port** | **f64**|  | 
 **jcrcontent_proxy_user** | **String**|  | 
 **jcrcontent_queue_batch_max_size** | **f64**|  | 
 **jcrcontent_queue_batch_mode** | **String**|  | 
 **jcrcontent_queue_batch_wait_time** | **f64**|  | 
 **jcrcontent_retry_delay** | **String**|  | 
 **jcrcontent_reverse_replication** | **bool**|  | 
 **jcrcontent_serialization_type** | **String**|  | 
 **jcrcontent_slingresource_type** | **String**|  | 
 **jcrcontent_ssl** | **String**|  | 
 **jcrcontent_transport_ntlm_domain** | **String**|  | 
 **jcrcontent_transport_ntlm_host** | **String**|  | 
 **jcrcontent_transport_password** | **String**|  | 
 **jcrcontent_transport_uri** | **String**|  | 
 **jcrcontent_transport_user** | **String**|  | 
 **jcrcontent_trigger_distribute** | **bool**|  | 
 **jcrcontent_trigger_modified** | **bool**|  | 
 **jcrcontent_trigger_on_off_time** | **bool**|  | 
 **jcrcontent_trigger_receive** | **bool**|  | 
 **jcrcontent_trigger_specific** | **bool**|  | 
 **jcrcontent_user_id** | **String**|  | 
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

# **postAuthorizableKeystore**
> models::KeystoreInfo postAuthorizableKeystore(ctx, intermediate_path, authorizable_id, optional)


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
 **cert_chain** | **swagger::ByteArray**|  | 
 **pk** | **swagger::ByteArray**|  | 
 **key_store** | **swagger::ByteArray**|  | 

### Return type

[**models::KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postAuthorizables**
> String postAuthorizables(ctx, authorizable_id, intermediate_path, optional)


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
 **profile_given_name** | **String**|  | 

### Return type

[**String**](string.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postConfigAdobeGraniteSamlAuthenticationHandler**
> postConfigAdobeGraniteSamlAuthenticationHandler(ctx, optional)


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
 **default_groups** | [**String**](String.md)|  | 
 **default_groups_type_hint** | **String**|  | 
 **idp_cert_alias** | **String**|  | 
 **idp_cert_alias_type_hint** | **String**|  | 
 **add_group_memberships** | **bool**|  | 
 **add_group_memberships_type_hint** | **String**|  | 
 **path** | [**String**](String.md)|  | 
 **path_type_hint** | **String**|  | 
 **synchronize_attributes** | [**String**](String.md)|  | 
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

# **postConfigApacheFelixJettyBasedHttpService**
> postConfigApacheFelixJettyBasedHttpService(ctx, optional)


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

# **postConfigApacheHttpComponentsProxyConfiguration**
> postConfigApacheHttpComponentsProxyConfiguration(ctx, optional)


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
 **proxy_exceptions** | [**String**](String.md)|  | 
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

# **postConfigApacheSlingDavExServlet**
> postConfigApacheSlingDavExServlet(ctx, optional)


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

# **postConfigApacheSlingGetServlet**
> postConfigApacheSlingGetServlet(ctx, optional)


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

# **postConfigApacheSlingReferrerFilter**
> postConfigApacheSlingReferrerFilter(ctx, optional)


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

# **postConfigProperty**
> postConfigProperty(ctx, config_node_name)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **config_node_name** | **String**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postNode**
> postNode(ctx, path, name, optional)


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
 **file** | **swagger::ByteArray**|  | 

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postNodeRw**
> postNodeRw(ctx, path, name, optional)


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

# **postPath**
> postPath(ctx, path, jcrprimary_type, name)


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

# **postQuery**
> String postQuery(ctx, path, p_limit, param_1_property, param_1_property_value)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **path** | **String**|  | 
  **p_limit** | **f64**|  | 
  **param_1_property** | **String**|  | 
  **param_1_property_value** | **String**|  | 

### Return type

[**String**](string.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postTreeActivation**
> postTreeActivation(ctx, ignoredeactivated, onlymodified, path)


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

# **postTruststore**
> String postTruststore(ctx, optional)


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
 **certificate** | **swagger::ByteArray**|  | 

### Return type

[**String**](string.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **postTruststorePKCS12**
> String postTruststorePKCS12(ctx, optional)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **truststore_p12** | **swagger::ByteArray**|  | 

### Return type

[**String**](string.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

