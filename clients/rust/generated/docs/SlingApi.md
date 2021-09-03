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
[**post_tree_activation**](SlingApi.md#post_tree_activation) | **POST** /etc/replication/treeactivation.html | 
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

> crate::models::KeystoreInfo get_authorizable_keystore(intermediate_path, authorizable_id)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**intermediate_path** | **String** |  | [required] |
**authorizable_id** | **String** |  | [required] |

### Return type

[**crate::models::KeystoreInfo**](KeystoreInfo.md)

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

> String get_query(path, p_limit, var_1_property, var_1_property_value)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**path** | **String** |  | [required] |
**p_limit** | **f32** |  | [required] |
**var_1_property** | **String** |  | [required] |
**var_1_property_value** | **String** |  | [required] |

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

> crate::models::TruststoreInfo get_truststore_info()


### Parameters

This endpoint does not need any parameter.

### Return type

[**crate::models::TruststoreInfo**](TruststoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_agent

> post_agent(runmode, name, jcrcontent_cqdistribute, jcrcontent_cqdistribute_type_hint, jcrcontent_cqname, jcrcontent_cqtemplate, jcrcontent_enabled, jcrcontent_jcrdescription, jcrcontent_jcrlast_modified, jcrcontent_jcrlast_modified_by, jcrcontent_jcrmixin_types, jcrcontent_jcrtitle, jcrcontent_log_level, jcrcontent_no_status_update, jcrcontent_no_versioning, jcrcontent_protocol_connect_timeout, jcrcontent_protocol_http_connection_closed, jcrcontent_protocol_http_expired, jcrcontent_protocol_http_headers, jcrcontent_protocol_http_headers_type_hint, jcrcontent_protocol_http_method, jcrcontent_protocol_https_relaxed, jcrcontent_protocol_interface, jcrcontent_protocol_socket_timeout, jcrcontent_protocol_version, jcrcontent_proxy_ntlm_domain, jcrcontent_proxy_ntlm_host, jcrcontent_proxy_host, jcrcontent_proxy_password, jcrcontent_proxy_port, jcrcontent_proxy_user, jcrcontent_queue_batch_max_size, jcrcontent_queue_batch_mode, jcrcontent_queue_batch_wait_time, jcrcontent_retry_delay, jcrcontent_reverse_replication, jcrcontent_serialization_type, jcrcontent_slingresource_type, jcrcontent_ssl, jcrcontent_transport_ntlm_domain, jcrcontent_transport_ntlm_host, jcrcontent_transport_password, jcrcontent_transport_uri, jcrcontent_transport_user, jcrcontent_trigger_distribute, jcrcontent_trigger_modified, jcrcontent_trigger_on_off_time, jcrcontent_trigger_receive, jcrcontent_trigger_specific, jcrcontent_user_id, jcrprimary_type, operation)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**runmode** | **String** |  | [required] |
**name** | **String** |  | [required] |
**jcrcontent_cqdistribute** | Option<**bool**> |  |  |
**jcrcontent_cqdistribute_type_hint** | Option<**String**> |  |  |
**jcrcontent_cqname** | Option<**String**> |  |  |
**jcrcontent_cqtemplate** | Option<**String**> |  |  |
**jcrcontent_enabled** | Option<**bool**> |  |  |
**jcrcontent_jcrdescription** | Option<**String**> |  |  |
**jcrcontent_jcrlast_modified** | Option<**String**> |  |  |
**jcrcontent_jcrlast_modified_by** | Option<**String**> |  |  |
**jcrcontent_jcrmixin_types** | Option<**String**> |  |  |
**jcrcontent_jcrtitle** | Option<**String**> |  |  |
**jcrcontent_log_level** | Option<**String**> |  |  |
**jcrcontent_no_status_update** | Option<**bool**> |  |  |
**jcrcontent_no_versioning** | Option<**bool**> |  |  |
**jcrcontent_protocol_connect_timeout** | Option<**f32**> |  |  |
**jcrcontent_protocol_http_connection_closed** | Option<**bool**> |  |  |
**jcrcontent_protocol_http_expired** | Option<**String**> |  |  |
**jcrcontent_protocol_http_headers** | Option<[**Vec<String>**](String.md)> |  |  |
**jcrcontent_protocol_http_headers_type_hint** | Option<**String**> |  |  |
**jcrcontent_protocol_http_method** | Option<**String**> |  |  |
**jcrcontent_protocol_https_relaxed** | Option<**bool**> |  |  |
**jcrcontent_protocol_interface** | Option<**String**> |  |  |
**jcrcontent_protocol_socket_timeout** | Option<**f32**> |  |  |
**jcrcontent_protocol_version** | Option<**String**> |  |  |
**jcrcontent_proxy_ntlm_domain** | Option<**String**> |  |  |
**jcrcontent_proxy_ntlm_host** | Option<**String**> |  |  |
**jcrcontent_proxy_host** | Option<**String**> |  |  |
**jcrcontent_proxy_password** | Option<**String**> |  |  |
**jcrcontent_proxy_port** | Option<**f32**> |  |  |
**jcrcontent_proxy_user** | Option<**String**> |  |  |
**jcrcontent_queue_batch_max_size** | Option<**f32**> |  |  |
**jcrcontent_queue_batch_mode** | Option<**String**> |  |  |
**jcrcontent_queue_batch_wait_time** | Option<**f32**> |  |  |
**jcrcontent_retry_delay** | Option<**String**> |  |  |
**jcrcontent_reverse_replication** | Option<**bool**> |  |  |
**jcrcontent_serialization_type** | Option<**String**> |  |  |
**jcrcontent_slingresource_type** | Option<**String**> |  |  |
**jcrcontent_ssl** | Option<**String**> |  |  |
**jcrcontent_transport_ntlm_domain** | Option<**String**> |  |  |
**jcrcontent_transport_ntlm_host** | Option<**String**> |  |  |
**jcrcontent_transport_password** | Option<**String**> |  |  |
**jcrcontent_transport_uri** | Option<**String**> |  |  |
**jcrcontent_transport_user** | Option<**String**> |  |  |
**jcrcontent_trigger_distribute** | Option<**bool**> |  |  |
**jcrcontent_trigger_modified** | Option<**bool**> |  |  |
**jcrcontent_trigger_on_off_time** | Option<**bool**> |  |  |
**jcrcontent_trigger_receive** | Option<**bool**> |  |  |
**jcrcontent_trigger_specific** | Option<**bool**> |  |  |
**jcrcontent_user_id** | Option<**String**> |  |  |
**jcrprimary_type** | Option<**String**> |  |  |
**operation** | Option<**String**> |  |  |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_authorizable_keystore

> crate::models::KeystoreInfo post_authorizable_keystore(intermediate_path, authorizable_id, operation, current_password, new_password, re_password, key_password, key_store_pass, alias, new_alias, remove_alias, cert_chain, pk, key_store)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**intermediate_path** | **String** |  | [required] |
**authorizable_id** | **String** |  | [required] |
**operation** | Option<**String**> |  |  |
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

[**crate::models::KeystoreInfo**](KeystoreInfo.md)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_authorizables

> String post_authorizables(authorizable_id, intermediate_path, create_user, create_group, reppassword, profile_given_name)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorizable_id** | **String** |  | [required] |
**intermediate_path** | **String** |  | [required] |
**create_user** | Option<**String**> |  |  |
**create_group** | Option<**String**> |  |  |
**reppassword** | Option<**String**> |  |  |
**profile_given_name** | Option<**String**> |  |  |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/html

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_config_adobe_granite_saml_authentication_handler

> post_config_adobe_granite_saml_authentication_handler(key_store_password, key_store_password_type_hint, service_ranking, service_ranking_type_hint, idp_http_redirect, idp_http_redirect_type_hint, create_user, create_user_type_hint, default_redirect_url, default_redirect_url_type_hint, user_id_attribute, user_id_attribute_type_hint, default_groups, default_groups_type_hint, idp_cert_alias, idp_cert_alias_type_hint, add_group_memberships, add_group_memberships_type_hint, path, path_type_hint, synchronize_attributes, synchronize_attributes_type_hint, clock_tolerance, clock_tolerance_type_hint, group_membership_attribute, group_membership_attribute_type_hint, idp_url, idp_url_type_hint, logout_url, logout_url_type_hint, service_provider_entity_id, service_provider_entity_id_type_hint, assertion_consumer_service_url, assertion_consumer_service_url_type_hint, handle_logout, handle_logout_type_hint, sp_private_key_alias, sp_private_key_alias_type_hint, use_encryption, use_encryption_type_hint, name_id_format, name_id_format_type_hint, digest_method, digest_method_type_hint, signature_method, signature_method_type_hint, user_intermediate_path, user_intermediate_path_type_hint)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**key_store_password** | Option<**String**> |  |  |
**key_store_password_type_hint** | Option<**String**> |  |  |
**service_ranking** | Option<**i32**> |  |  |
**service_ranking_type_hint** | Option<**String**> |  |  |
**idp_http_redirect** | Option<**bool**> |  |  |
**idp_http_redirect_type_hint** | Option<**String**> |  |  |
**create_user** | Option<**bool**> |  |  |
**create_user_type_hint** | Option<**String**> |  |  |
**default_redirect_url** | Option<**String**> |  |  |
**default_redirect_url_type_hint** | Option<**String**> |  |  |
**user_id_attribute** | Option<**String**> |  |  |
**user_id_attribute_type_hint** | Option<**String**> |  |  |
**default_groups** | Option<[**Vec<String>**](String.md)> |  |  |
**default_groups_type_hint** | Option<**String**> |  |  |
**idp_cert_alias** | Option<**String**> |  |  |
**idp_cert_alias_type_hint** | Option<**String**> |  |  |
**add_group_memberships** | Option<**bool**> |  |  |
**add_group_memberships_type_hint** | Option<**String**> |  |  |
**path** | Option<[**Vec<String>**](String.md)> |  |  |
**path_type_hint** | Option<**String**> |  |  |
**synchronize_attributes** | Option<[**Vec<String>**](String.md)> |  |  |
**synchronize_attributes_type_hint** | Option<**String**> |  |  |
**clock_tolerance** | Option<**i32**> |  |  |
**clock_tolerance_type_hint** | Option<**String**> |  |  |
**group_membership_attribute** | Option<**String**> |  |  |
**group_membership_attribute_type_hint** | Option<**String**> |  |  |
**idp_url** | Option<**String**> |  |  |
**idp_url_type_hint** | Option<**String**> |  |  |
**logout_url** | Option<**String**> |  |  |
**logout_url_type_hint** | Option<**String**> |  |  |
**service_provider_entity_id** | Option<**String**> |  |  |
**service_provider_entity_id_type_hint** | Option<**String**> |  |  |
**assertion_consumer_service_url** | Option<**String**> |  |  |
**assertion_consumer_service_url_type_hint** | Option<**String**> |  |  |
**handle_logout** | Option<**bool**> |  |  |
**handle_logout_type_hint** | Option<**String**> |  |  |
**sp_private_key_alias** | Option<**String**> |  |  |
**sp_private_key_alias_type_hint** | Option<**String**> |  |  |
**use_encryption** | Option<**bool**> |  |  |
**use_encryption_type_hint** | Option<**String**> |  |  |
**name_id_format** | Option<**String**> |  |  |
**name_id_format_type_hint** | Option<**String**> |  |  |
**digest_method** | Option<**String**> |  |  |
**digest_method_type_hint** | Option<**String**> |  |  |
**signature_method** | Option<**String**> |  |  |
**signature_method_type_hint** | Option<**String**> |  |  |
**user_intermediate_path** | Option<**String**> |  |  |
**user_intermediate_path_type_hint** | Option<**String**> |  |  |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_config_apache_felix_jetty_based_http_service

> post_config_apache_felix_jetty_based_http_service(org_apache_felix_https_nio, org_apache_felix_https_nio_type_hint, org_apache_felix_https_keystore, org_apache_felix_https_keystore_type_hint, org_apache_felix_https_keystore_password, org_apache_felix_https_keystore_password_type_hint, org_apache_felix_https_keystore_key, org_apache_felix_https_keystore_key_type_hint, org_apache_felix_https_keystore_key_password, org_apache_felix_https_keystore_key_password_type_hint, org_apache_felix_https_truststore, org_apache_felix_https_truststore_type_hint, org_apache_felix_https_truststore_password, org_apache_felix_https_truststore_password_type_hint, org_apache_felix_https_clientcertificate, org_apache_felix_https_clientcertificate_type_hint, org_apache_felix_https_enable, org_apache_felix_https_enable_type_hint, org_osgi_service_http_port_secure, org_osgi_service_http_port_secure_type_hint)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**org_apache_felix_https_nio** | Option<**bool**> |  |  |
**org_apache_felix_https_nio_type_hint** | Option<**String**> |  |  |
**org_apache_felix_https_keystore** | Option<**String**> |  |  |
**org_apache_felix_https_keystore_type_hint** | Option<**String**> |  |  |
**org_apache_felix_https_keystore_password** | Option<**String**> |  |  |
**org_apache_felix_https_keystore_password_type_hint** | Option<**String**> |  |  |
**org_apache_felix_https_keystore_key** | Option<**String**> |  |  |
**org_apache_felix_https_keystore_key_type_hint** | Option<**String**> |  |  |
**org_apache_felix_https_keystore_key_password** | Option<**String**> |  |  |
**org_apache_felix_https_keystore_key_password_type_hint** | Option<**String**> |  |  |
**org_apache_felix_https_truststore** | Option<**String**> |  |  |
**org_apache_felix_https_truststore_type_hint** | Option<**String**> |  |  |
**org_apache_felix_https_truststore_password** | Option<**String**> |  |  |
**org_apache_felix_https_truststore_password_type_hint** | Option<**String**> |  |  |
**org_apache_felix_https_clientcertificate** | Option<**String**> |  |  |
**org_apache_felix_https_clientcertificate_type_hint** | Option<**String**> |  |  |
**org_apache_felix_https_enable** | Option<**bool**> |  |  |
**org_apache_felix_https_enable_type_hint** | Option<**String**> |  |  |
**org_osgi_service_http_port_secure** | Option<**String**> |  |  |
**org_osgi_service_http_port_secure_type_hint** | Option<**String**> |  |  |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_config_apache_http_components_proxy_configuration

> post_config_apache_http_components_proxy_configuration(proxy_host, proxy_host_type_hint, proxy_port, proxy_port_type_hint, proxy_exceptions, proxy_exceptions_type_hint, proxy_enabled, proxy_enabled_type_hint, proxy_user, proxy_user_type_hint, proxy_password, proxy_password_type_hint)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**proxy_host** | Option<**String**> |  |  |
**proxy_host_type_hint** | Option<**String**> |  |  |
**proxy_port** | Option<**i32**> |  |  |
**proxy_port_type_hint** | Option<**String**> |  |  |
**proxy_exceptions** | Option<[**Vec<String>**](String.md)> |  |  |
**proxy_exceptions_type_hint** | Option<**String**> |  |  |
**proxy_enabled** | Option<**bool**> |  |  |
**proxy_enabled_type_hint** | Option<**String**> |  |  |
**proxy_user** | Option<**String**> |  |  |
**proxy_user_type_hint** | Option<**String**> |  |  |
**proxy_password** | Option<**String**> |  |  |
**proxy_password_type_hint** | Option<**String**> |  |  |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_config_apache_sling_dav_ex_servlet

> post_config_apache_sling_dav_ex_servlet(alias, alias_type_hint, dav_create_absolute_uri, dav_create_absolute_uri_type_hint)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**alias** | Option<**String**> |  |  |
**alias_type_hint** | Option<**String**> |  |  |
**dav_create_absolute_uri** | Option<**bool**> |  |  |
**dav_create_absolute_uri_type_hint** | Option<**String**> |  |  |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_config_apache_sling_get_servlet

> post_config_apache_sling_get_servlet(json_maximumresults, json_maximumresults_type_hint, enable_html, enable_html_type_hint, enable_txt, enable_txt_type_hint, enable_xml, enable_xml_type_hint)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**json_maximumresults** | Option<**String**> |  |  |
**json_maximumresults_type_hint** | Option<**String**> |  |  |
**enable_html** | Option<**bool**> |  |  |
**enable_html_type_hint** | Option<**String**> |  |  |
**enable_txt** | Option<**bool**> |  |  |
**enable_txt_type_hint** | Option<**String**> |  |  |
**enable_xml** | Option<**bool**> |  |  |
**enable_xml_type_hint** | Option<**String**> |  |  |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_config_apache_sling_referrer_filter

> post_config_apache_sling_referrer_filter(allow_empty, allow_empty_type_hint, allow_hosts, allow_hosts_type_hint, allow_hosts_regexp, allow_hosts_regexp_type_hint, filter_methods, filter_methods_type_hint)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**allow_empty** | Option<**bool**> |  |  |
**allow_empty_type_hint** | Option<**String**> |  |  |
**allow_hosts** | Option<**String**> |  |  |
**allow_hosts_type_hint** | Option<**String**> |  |  |
**allow_hosts_regexp** | Option<**String**> |  |  |
**allow_hosts_regexp_type_hint** | Option<**String**> |  |  |
**filter_methods** | Option<**String**> |  |  |
**filter_methods_type_hint** | Option<**String**> |  |  |

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

> post_node(path, name, operation, delete_authorizable, file)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**path** | **String** |  | [required] |
**name** | **String** |  | [required] |
**operation** | Option<**String**> |  |  |
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

> post_path(path, jcrprimary_type, name)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**path** | **String** |  | [required] |
**jcrprimary_type** | **String** |  | [required] |
**name** | **String** |  | [required] |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_query

> String post_query(path, p_limit, var_1_property, var_1_property_value)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**path** | **String** |  | [required] |
**p_limit** | **f32** |  | [required] |
**var_1_property** | **String** |  | [required] |
**var_1_property_value** | **String** |  | [required] |

### Return type

**String**

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_tree_activation

> post_tree_activation(ignoredeactivated, onlymodified, path)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ignoredeactivated** | **bool** |  | [required] |
**onlymodified** | **bool** |  | [required] |
**path** | **String** |  | [required] |

### Return type

 (empty response body)

### Authorization

[aemAuth](../README.md#aemAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## post_truststore

> String post_truststore(operation, new_password, re_password, key_store_type, remove_alias, certificate)


### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**operation** | Option<**String**> |  |  |
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

