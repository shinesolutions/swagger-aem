# \SlingApi

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
[**post_truststore_pkcs12**](SlingApi.md#post_truststore_pkcs12) | **POST** /etc/truststore | 



## delete_agent

> delete_agent(runmode, name)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**runmode** | **String** |  | [required] |
**name** | **String** |  | [required] |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## delete_node

> delete_node(path, name)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**path** | **String** |  | [required] |
**name** | **String** |  | [required] |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_agent

> get_agent(runmode, name)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**runmode** | **String** |  | [required] |
**name** | **String** |  | [required] |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_agents

> String get_agents(runmode)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**runmode** | **String** |  | [required] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_authorizable_keystore

> models::KeystoreInfo get_authorizable_keystore(intermediate_path, authorizable_id)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**intermediate_path** | **String** |  | [required] |
**authorizable_id** | **String** |  | [required] |

### Return type

[**models::KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_keystore

> std::path::PathBuf get_keystore(intermediate_path, authorizable_id)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**intermediate_path** | **String** |  | [required] |
**authorizable_id** | **String** |  | [required] |

### Return type

[**std::path::PathBuf**](std::path::PathBuf.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_node

> get_node(path, name)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**path** | **String** |  | [required] |
**name** | **String** |  | [required] |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_package

> std::path::PathBuf get_package(group, name, version)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**group** | **String** |  | [required] |
**name** | **String** |  | [required] |
**version** | **String** |  | [required] |

### Return type

[**std::path::PathBuf**](std::path::PathBuf.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_package_filter

> String get_package_filter(group, name, version)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**group** | **String** |  | [required] |
**name** | **String** |  | [required] |
**version** | **String** |  | [required] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_query

> String get_query(path, p_limit, param_1_property, param_1_property_value)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**path** | **String** |  | [required] |
**p_limit** | **f64** |  | [required] |
**param_1_property** | **String** |  | [required] |
**param_1_property_value** | **String** |  | [required] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_truststore

> std::path::PathBuf get_truststore()


### Parameters

This endpoint does not need any parameter.

### Return type

[**std::path::PathBuf**](std::path::PathBuf.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_truststore_info

> models::TruststoreInfo get_truststore_info()


### Parameters

This endpoint does not need any parameter.

### Return type

[**models::TruststoreInfo**](TruststoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_agent

> post_agent(runmode, name, jcr_colon_content_slash_cq_colon_distribute, jcr_colon_content_slash_cq_colon_distribute_at_type_hint, jcr_colon_content_slash_cq_colon_name, jcr_colon_content_slash_cq_colon_template, jcr_colon_content_slash_alias_update, jcr_colon_content_slash_enabled, jcr_colon_content_slash_jcr_colon_description, jcr_colon_content_slash_jcr_colon_last_modified, jcr_colon_content_slash_jcr_colon_last_modified_by, jcr_colon_content_slash_jcr_colon_mixin_types, jcr_colon_content_slash_jcr_colon_title, jcr_colon_content_slash_log_level, jcr_colon_content_slash_no_status_update, jcr_colon_content_slash_no_versioning, jcr_colon_content_slash_protocol_connect_timeout, jcr_colon_content_slash_protocol_http_connection_closed, jcr_colon_content_slash_protocol_http_expired, jcr_colon_content_slash_protocol_http_headers, jcr_colon_content_slash_protocol_http_headers_at_type_hint, jcr_colon_content_slash_protocol_http_method, jcr_colon_content_slash_protocol_https_relaxed, jcr_colon_content_slash_protocol_interface, jcr_colon_content_slash_protocol_socket_timeout, jcr_colon_content_slash_protocol_version, jcr_colon_content_slash_proxy_ntlm_domain, jcr_colon_content_slash_proxy_ntlm_host, jcr_colon_content_slash_proxy_host, jcr_colon_content_slash_proxy_password, jcr_colon_content_slash_proxy_port, jcr_colon_content_slash_proxy_user, jcr_colon_content_slash_queue_batch_max_size, jcr_colon_content_slash_queue_batch_mode, jcr_colon_content_slash_queue_batch_wait_time, jcr_colon_content_slash_retry_delay, jcr_colon_content_slash_reverse_replication, jcr_colon_content_slash_serialization_type, jcr_colon_content_slash_sling_colon_resource_type, jcr_colon_content_slash_ssl, jcr_colon_content_slash_transport_ntlm_domain, jcr_colon_content_slash_transport_ntlm_host, jcr_colon_content_slash_transport_password, jcr_colon_content_slash_transport_uri, jcr_colon_content_slash_transport_user, jcr_colon_content_slash_trigger_distribute, jcr_colon_content_slash_trigger_modified, jcr_colon_content_slash_trigger_on_off_time, jcr_colon_content_slash_trigger_receive, jcr_colon_content_slash_trigger_specific, jcr_colon_content_slash_user_id, jcr_colon_primary_type, colon_operation)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**runmode** | **String** |  | [required] |
**name** | **String** |  | [required] |
**jcr_colon_content_slash_cq_colon_distribute** | Option<**bool**> |  |  |
**jcr_colon_content_slash_cq_colon_distribute_at_type_hint** | Option<**String**> |  |  |
**jcr_colon_content_slash_cq_colon_name** | Option<**String**> |  |  |
**jcr_colon_content_slash_cq_colon_template** | Option<**String**> |  |  |
**jcr_colon_content_slash_alias_update** | Option<**bool**> |  |  |
**jcr_colon_content_slash_enabled** | Option<**bool**> |  |  |
**jcr_colon_content_slash_jcr_colon_description** | Option<**String**> |  |  |
**jcr_colon_content_slash_jcr_colon_last_modified** | Option<**String**> |  |  |
**jcr_colon_content_slash_jcr_colon_last_modified_by** | Option<**String**> |  |  |
**jcr_colon_content_slash_jcr_colon_mixin_types** | Option<**String**> |  |  |
**jcr_colon_content_slash_jcr_colon_title** | Option<**String**> |  |  |
**jcr_colon_content_slash_log_level** | Option<**String**> |  |  |
**jcr_colon_content_slash_no_status_update** | Option<**bool**> |  |  |
**jcr_colon_content_slash_no_versioning** | Option<**bool**> |  |  |
**jcr_colon_content_slash_protocol_connect_timeout** | Option<**f64**> |  |  |
**jcr_colon_content_slash_protocol_http_connection_closed** | Option<**bool**> |  |  |
**jcr_colon_content_slash_protocol_http_expired** | Option<**String**> |  |  |
**jcr_colon_content_slash_protocol_http_headers** | Option<[**Vec<String>**](String.md)> |  |  |
**jcr_colon_content_slash_protocol_http_headers_at_type_hint** | Option<**String**> |  |  |
**jcr_colon_content_slash_protocol_http_method** | Option<**String**> |  |  |
**jcr_colon_content_slash_protocol_https_relaxed** | Option<**bool**> |  |  |
**jcr_colon_content_slash_protocol_interface** | Option<**String**> |  |  |
**jcr_colon_content_slash_protocol_socket_timeout** | Option<**f64**> |  |  |
**jcr_colon_content_slash_protocol_version** | Option<**String**> |  |  |
**jcr_colon_content_slash_proxy_ntlm_domain** | Option<**String**> |  |  |
**jcr_colon_content_slash_proxy_ntlm_host** | Option<**String**> |  |  |
**jcr_colon_content_slash_proxy_host** | Option<**String**> |  |  |
**jcr_colon_content_slash_proxy_password** | Option<**String**> |  |  |
**jcr_colon_content_slash_proxy_port** | Option<**f64**> |  |  |
**jcr_colon_content_slash_proxy_user** | Option<**String**> |  |  |
**jcr_colon_content_slash_queue_batch_max_size** | Option<**f64**> |  |  |
**jcr_colon_content_slash_queue_batch_mode** | Option<**String**> |  |  |
**jcr_colon_content_slash_queue_batch_wait_time** | Option<**f64**> |  |  |
**jcr_colon_content_slash_retry_delay** | Option<**String**> |  |  |
**jcr_colon_content_slash_reverse_replication** | Option<**bool**> |  |  |
**jcr_colon_content_slash_serialization_type** | Option<**String**> |  |  |
**jcr_colon_content_slash_sling_colon_resource_type** | Option<**String**> |  |  |
**jcr_colon_content_slash_ssl** | Option<**String**> |  |  |
**jcr_colon_content_slash_transport_ntlm_domain** | Option<**String**> |  |  |
**jcr_colon_content_slash_transport_ntlm_host** | Option<**String**> |  |  |
**jcr_colon_content_slash_transport_password** | Option<**String**> |  |  |
**jcr_colon_content_slash_transport_uri** | Option<**String**> |  |  |
**jcr_colon_content_slash_transport_user** | Option<**String**> |  |  |
**jcr_colon_content_slash_trigger_distribute** | Option<**bool**> |  |  |
**jcr_colon_content_slash_trigger_modified** | Option<**bool**> |  |  |
**jcr_colon_content_slash_trigger_on_off_time** | Option<**bool**> |  |  |
**jcr_colon_content_slash_trigger_receive** | Option<**bool**> |  |  |
**jcr_colon_content_slash_trigger_specific** | Option<**bool**> |  |  |
**jcr_colon_content_slash_user_id** | Option<**String**> |  |  |
**jcr_colon_primary_type** | Option<**String**> |  |  |
**colon_operation** | Option<**String**> |  |  |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_authorizable_keystore

> models::KeystoreInfo post_authorizable_keystore(intermediate_path, authorizable_id, colon_operation, current_password, new_password, re_password, key_password, key_store_pass, alias, new_alias, remove_alias, cert_chain, pk, key_store)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**intermediate_path** | **String** |  | [required] |
**authorizable_id** | **String** |  | [required] |
**colon_operation** | Option<**String**> |  |  |
**current_password** | Option<**String**> |  |  |
**new_password** | Option<**String**> |  |  |
**re_password** | Option<**String**> |  |  |
**key_password** | Option<**String**> |  |  |
**key_store_pass** | Option<**String**> |  |  |
**alias** | Option<**String**> |  |  |
**new_alias** | Option<**String**> |  |  |
**remove_alias** | Option<**String**> |  |  |
**cert_chain** | Option<**std::path::PathBuf**> |  |  |
**pk** | Option<**std::path::PathBuf**> |  |  |
**key_store** | Option<**std::path::PathBuf**> |  |  |

### Return type

[**models::KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_authorizables

> String post_authorizables(authorizable_id, intermediate_path, create_user, create_group, rep_colon_password, profile_slash_given_name)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorizable_id** | **String** |  | [required] |
**intermediate_path** | **String** |  | [required] |
**create_user** | Option<**String**> |  |  |
**create_group** | Option<**String**> |  |  |
**rep_colon_password** | Option<**String**> |  |  |
**profile_slash_given_name** | Option<**String**> |  |  |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_config_adobe_granite_saml_authentication_handler

> post_config_adobe_granite_saml_authentication_handler(key_store_password, key_store_password_at_type_hint, service_ranking, service_ranking_at_type_hint, idp_http_redirect, idp_http_redirect_at_type_hint, create_user, create_user_at_type_hint, default_redirect_url, default_redirect_url_at_type_hint, user_id_attribute, user_id_attribute_at_type_hint, default_groups, default_groups_at_type_hint, idp_cert_alias, idp_cert_alias_at_type_hint, add_group_memberships, add_group_memberships_at_type_hint, path, path_at_type_hint, synchronize_attributes, synchronize_attributes_at_type_hint, clock_tolerance, clock_tolerance_at_type_hint, group_membership_attribute, group_membership_attribute_at_type_hint, idp_url, idp_url_at_type_hint, logout_url, logout_url_at_type_hint, service_provider_entity_id, service_provider_entity_id_at_type_hint, assertion_consumer_service_url, assertion_consumer_service_urlat_type_hint, handle_logout, handle_logout_at_type_hint, sp_private_key_alias, sp_private_key_alias_at_type_hint, use_encryption, use_encryption_at_type_hint, name_id_format, name_id_format_at_type_hint, digest_method, digest_method_at_type_hint, signature_method, signature_method_at_type_hint, user_intermediate_path, user_intermediate_path_at_type_hint)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**key_store_password** | Option<**String**> |  |  |
**key_store_password_at_type_hint** | Option<**String**> |  |  |
**service_ranking** | Option<**i32**> |  |  |
**service_ranking_at_type_hint** | Option<**String**> |  |  |
**idp_http_redirect** | Option<**bool**> |  |  |
**idp_http_redirect_at_type_hint** | Option<**String**> |  |  |
**create_user** | Option<**bool**> |  |  |
**create_user_at_type_hint** | Option<**String**> |  |  |
**default_redirect_url** | Option<**String**> |  |  |
**default_redirect_url_at_type_hint** | Option<**String**> |  |  |
**user_id_attribute** | Option<**String**> |  |  |
**user_id_attribute_at_type_hint** | Option<**String**> |  |  |
**default_groups** | Option<[**Vec<String>**](String.md)> |  |  |
**default_groups_at_type_hint** | Option<**String**> |  |  |
**idp_cert_alias** | Option<**String**> |  |  |
**idp_cert_alias_at_type_hint** | Option<**String**> |  |  |
**add_group_memberships** | Option<**bool**> |  |  |
**add_group_memberships_at_type_hint** | Option<**String**> |  |  |
**path** | Option<[**Vec<String>**](String.md)> |  |  |
**path_at_type_hint** | Option<**String**> |  |  |
**synchronize_attributes** | Option<[**Vec<String>**](String.md)> |  |  |
**synchronize_attributes_at_type_hint** | Option<**String**> |  |  |
**clock_tolerance** | Option<**i32**> |  |  |
**clock_tolerance_at_type_hint** | Option<**String**> |  |  |
**group_membership_attribute** | Option<**String**> |  |  |
**group_membership_attribute_at_type_hint** | Option<**String**> |  |  |
**idp_url** | Option<**String**> |  |  |
**idp_url_at_type_hint** | Option<**String**> |  |  |
**logout_url** | Option<**String**> |  |  |
**logout_url_at_type_hint** | Option<**String**> |  |  |
**service_provider_entity_id** | Option<**String**> |  |  |
**service_provider_entity_id_at_type_hint** | Option<**String**> |  |  |
**assertion_consumer_service_url** | Option<**String**> |  |  |
**assertion_consumer_service_urlat_type_hint** | Option<**String**> |  |  |
**handle_logout** | Option<**bool**> |  |  |
**handle_logout_at_type_hint** | Option<**String**> |  |  |
**sp_private_key_alias** | Option<**String**> |  |  |
**sp_private_key_alias_at_type_hint** | Option<**String**> |  |  |
**use_encryption** | Option<**bool**> |  |  |
**use_encryption_at_type_hint** | Option<**String**> |  |  |
**name_id_format** | Option<**String**> |  |  |
**name_id_format_at_type_hint** | Option<**String**> |  |  |
**digest_method** | Option<**String**> |  |  |
**digest_method_at_type_hint** | Option<**String**> |  |  |
**signature_method** | Option<**String**> |  |  |
**signature_method_at_type_hint** | Option<**String**> |  |  |
**user_intermediate_path** | Option<**String**> |  |  |
**user_intermediate_path_at_type_hint** | Option<**String**> |  |  |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_config_apache_felix_jetty_based_http_service

> post_config_apache_felix_jetty_based_http_service(org_apache_felix_https_nio, org_apache_felix_https_nio_at_type_hint, org_apache_felix_https_keystore, org_apache_felix_https_keystore_at_type_hint, org_apache_felix_https_keystore_password, org_apache_felix_https_keystore_password_at_type_hint, org_apache_felix_https_keystore_key, org_apache_felix_https_keystore_key_at_type_hint, org_apache_felix_https_keystore_key_password, org_apache_felix_https_keystore_key_password_at_type_hint, org_apache_felix_https_truststore, org_apache_felix_https_truststore_at_type_hint, org_apache_felix_https_truststore_password, org_apache_felix_https_truststore_password_at_type_hint, org_apache_felix_https_clientcertificate, org_apache_felix_https_clientcertificate_at_type_hint, org_apache_felix_https_enable, org_apache_felix_https_enable_at_type_hint, org_osgi_service_http_port_secure, org_osgi_service_http_port_secure_at_type_hint)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**org_apache_felix_https_nio** | Option<**bool**> |  |  |
**org_apache_felix_https_nio_at_type_hint** | Option<**String**> |  |  |
**org_apache_felix_https_keystore** | Option<**String**> |  |  |
**org_apache_felix_https_keystore_at_type_hint** | Option<**String**> |  |  |
**org_apache_felix_https_keystore_password** | Option<**String**> |  |  |
**org_apache_felix_https_keystore_password_at_type_hint** | Option<**String**> |  |  |
**org_apache_felix_https_keystore_key** | Option<**String**> |  |  |
**org_apache_felix_https_keystore_key_at_type_hint** | Option<**String**> |  |  |
**org_apache_felix_https_keystore_key_password** | Option<**String**> |  |  |
**org_apache_felix_https_keystore_key_password_at_type_hint** | Option<**String**> |  |  |
**org_apache_felix_https_truststore** | Option<**String**> |  |  |
**org_apache_felix_https_truststore_at_type_hint** | Option<**String**> |  |  |
**org_apache_felix_https_truststore_password** | Option<**String**> |  |  |
**org_apache_felix_https_truststore_password_at_type_hint** | Option<**String**> |  |  |
**org_apache_felix_https_clientcertificate** | Option<**String**> |  |  |
**org_apache_felix_https_clientcertificate_at_type_hint** | Option<**String**> |  |  |
**org_apache_felix_https_enable** | Option<**bool**> |  |  |
**org_apache_felix_https_enable_at_type_hint** | Option<**String**> |  |  |
**org_osgi_service_http_port_secure** | Option<**String**> |  |  |
**org_osgi_service_http_port_secure_at_type_hint** | Option<**String**> |  |  |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_config_apache_http_components_proxy_configuration

> post_config_apache_http_components_proxy_configuration(proxy_host, proxy_host_at_type_hint, proxy_port, proxy_port_at_type_hint, proxy_exceptions, proxy_exceptions_at_type_hint, proxy_enabled, proxy_enabled_at_type_hint, proxy_user, proxy_user_at_type_hint, proxy_password, proxy_password_at_type_hint)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**proxy_host** | Option<**String**> |  |  |
**proxy_host_at_type_hint** | Option<**String**> |  |  |
**proxy_port** | Option<**i32**> |  |  |
**proxy_port_at_type_hint** | Option<**String**> |  |  |
**proxy_exceptions** | Option<[**Vec<String>**](String.md)> |  |  |
**proxy_exceptions_at_type_hint** | Option<**String**> |  |  |
**proxy_enabled** | Option<**bool**> |  |  |
**proxy_enabled_at_type_hint** | Option<**String**> |  |  |
**proxy_user** | Option<**String**> |  |  |
**proxy_user_at_type_hint** | Option<**String**> |  |  |
**proxy_password** | Option<**String**> |  |  |
**proxy_password_at_type_hint** | Option<**String**> |  |  |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_config_apache_sling_dav_ex_servlet

> post_config_apache_sling_dav_ex_servlet(alias, alias_at_type_hint, dav_create_absolute_uri, dav_create_absolute_uri_at_type_hint)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**alias** | Option<**String**> |  |  |
**alias_at_type_hint** | Option<**String**> |  |  |
**dav_create_absolute_uri** | Option<**bool**> |  |  |
**dav_create_absolute_uri_at_type_hint** | Option<**String**> |  |  |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_config_apache_sling_get_servlet

> post_config_apache_sling_get_servlet(json_maximumresults, json_maximumresults_at_type_hint, enable_html, enable_html_at_type_hint, enable_txt, enable_txt_at_type_hint, enable_xml, enable_xml_at_type_hint)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**json_maximumresults** | Option<**String**> |  |  |
**json_maximumresults_at_type_hint** | Option<**String**> |  |  |
**enable_html** | Option<**bool**> |  |  |
**enable_html_at_type_hint** | Option<**String**> |  |  |
**enable_txt** | Option<**bool**> |  |  |
**enable_txt_at_type_hint** | Option<**String**> |  |  |
**enable_xml** | Option<**bool**> |  |  |
**enable_xml_at_type_hint** | Option<**String**> |  |  |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_config_apache_sling_referrer_filter

> post_config_apache_sling_referrer_filter(allow_empty, allow_empty_at_type_hint, allow_hosts, allow_hosts_at_type_hint, allow_hosts_regexp, allow_hosts_regexp_at_type_hint, filter_methods, filter_methods_at_type_hint)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**allow_empty** | Option<**bool**> |  |  |
**allow_empty_at_type_hint** | Option<**String**> |  |  |
**allow_hosts** | Option<**String**> |  |  |
**allow_hosts_at_type_hint** | Option<**String**> |  |  |
**allow_hosts_regexp** | Option<**String**> |  |  |
**allow_hosts_regexp_at_type_hint** | Option<**String**> |  |  |
**filter_methods** | Option<**String**> |  |  |
**filter_methods_at_type_hint** | Option<**String**> |  |  |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_config_property

> post_config_property(config_node_name)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**config_node_name** | **String** |  | [required] |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_node

> post_node(path, name, colon_operation, delete_authorizable, file)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**path** | **String** |  | [required] |
**name** | **String** |  | [required] |
**colon_operation** | Option<**String**> |  |  |
**delete_authorizable** | Option<**String**> |  |  |
**file** | Option<**std::path::PathBuf**> |  |  |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_node_rw

> post_node_rw(path, name, add_members)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**path** | **String** |  | [required] |
**name** | **String** |  | [required] |
**add_members** | Option<**String**> |  |  |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_path

> post_path(path, jcr_colon_primary_type, colon_name)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**path** | **String** |  | [required] |
**jcr_colon_primary_type** | **String** |  | [required] |
**colon_name** | **String** |  | [required] |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_query

> String post_query(path, p_limit, param_1_property, param_1_property_value)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**path** | **String** |  | [required] |
**p_limit** | **f64** |  | [required] |
**param_1_property** | **String** |  | [required] |
**param_1_property_value** | **String** |  | [required] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_tree_activation

> post_tree_activation(ignoredeactivated, onlymodified, path, cmd)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ignoredeactivated** | **bool** |  | [required] |
**onlymodified** | **bool** |  | [required] |
**path** | **String** |  | [required] |
**cmd** | **String** |  | [required] |[default to activate]

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_truststore

> String post_truststore(colon_operation, new_password, re_password, key_store_type, remove_alias, certificate)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**colon_operation** | Option<**String**> |  |  |
**new_password** | Option<**String**> |  |  |
**re_password** | Option<**String**> |  |  |
**key_store_type** | Option<**String**> |  |  |
**remove_alias** | Option<**String**> |  |  |
**certificate** | Option<**std::path::PathBuf**> |  |  |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_truststore_pkcs12

> String post_truststore_pkcs12(truststore_p12)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**truststore_p12** | Option<**std::path::PathBuf**> |  |  |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

