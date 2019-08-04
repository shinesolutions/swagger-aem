note
    description: "API tests for SLING_API"
    date: "$Date$"
    revision: "$Revision$"


class SLING_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_agent
            -- 
            -- 
            --  
        local
            l_runmode: STRING_32
            l_name: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_runmode
            -- l_name
                      
            -- api.agent(l_runmode, l_name)
            assert ("not_implemented", False)
        end
    
    test_agents
            -- 
            -- 
            --  
        local
            l_response: STRING_32
            l_runmode: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_runmode
                      
            -- l_response := api.agents(l_runmode)
            assert ("not_implemented", False)
        end
    
    test_authorizable_keystore
            -- 
            -- 
            --  
        local
            l_response: KEYSTORE_INFO
            l_intermediate_path: STRING_32
            l_authorizable_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_intermediate_path
            -- l_authorizable_id
                      
            -- l_response := api.authorizable_keystore(l_intermediate_path, l_authorizable_id)
            assert ("not_implemented", False)
        end
    
    test_delete_agent
            -- 
            -- 
            --  
        local
            l_runmode: STRING_32
            l_name: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_runmode
            -- l_name
                      
            -- api.delete_agent(l_runmode, l_name)
            assert ("not_implemented", False)
        end
    
    test_delete_node
            -- 
            -- 
            --  
        local
            l_path: STRING_32
            l_name: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_path
            -- l_name
                      
            -- api.delete_node(l_path, l_name)
            assert ("not_implemented", False)
        end
    
    test_keystore
            -- 
            -- 
            --  
        local
            l_response: FILE
            l_intermediate_path: STRING_32
            l_authorizable_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_intermediate_path
            -- l_authorizable_id
                      
            -- l_response := api.keystore(l_intermediate_path, l_authorizable_id)
            assert ("not_implemented", False)
        end
    
    test_node
            -- 
            -- 
            --  
        local
            l_path: STRING_32
            l_name: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_path
            -- l_name
                      
            -- api.node(l_path, l_name)
            assert ("not_implemented", False)
        end
    
    test_package
            -- 
            -- 
            --  
        local
            l_response: FILE
            l_group: STRING_32
            l_name: STRING_32
            l_version: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_group
            -- l_name
            -- l_version
                      
            -- l_response := api.package(l_group, l_name, l_version)
            assert ("not_implemented", False)
        end
    
    test_package_filter
            -- 
            -- 
            --  
        local
            l_response: STRING_32
            l_group: STRING_32
            l_name: STRING_32
            l_version: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_group
            -- l_name
            -- l_version
                      
            -- l_response := api.package_filter(l_group, l_name, l_version)
            assert ("not_implemented", False)
        end
    
    test_post_agent
            -- 
            -- 
            --  
        local
            l_runmode: STRING_32
            l_name: STRING_32
            l_jcrcontentcqdistribute: BOOLEAN
            l_jcrcontentcqdistribute_type_hint: STRING_32
            l_jcrcontentcqname: STRING_32
            l_jcrcontentcqtemplate: STRING_32
            l_jcrcontentenabled: BOOLEAN
            l_jcrcontentjcrdescription: STRING_32
            l_jcrcontentjcrlast_modified: STRING_32
            l_jcrcontentjcrlast_modified_by: STRING_32
            l_jcrcontentjcrmixin_types: STRING_32
            l_jcrcontentjcrtitle: STRING_32
            l_jcrcontentlog_level: STRING_32
            l_jcrcontentno_status_update: BOOLEAN
            l_jcrcontentno_versioning: BOOLEAN
            l_jcrcontentprotocol_connect_timeout: REAL_32
            l_jcrcontentprotocol_ht_tp_connection_closed: BOOLEAN
            l_jcrcontentprotocol_ht_tp_expired: STRING_32
            l_jcrcontentprotocol_ht_tp_headers: LIST [STRING_32]
            l_jcrcontentprotocol_ht_tp_headers_type_hint: STRING_32
            l_jcrcontentprotocol_ht_tp_method: STRING_32
            l_jcrcontentprotocol_ht_tp_srelaxed: BOOLEAN
            l_jcrcontentprotocol_interface: STRING_32
            l_jcrcontentprotocol_socket_timeout: REAL_32
            l_jcrcontentprotocol_version: STRING_32
            l_jcrcontentproxy_nt_lm_domain: STRING_32
            l_jcrcontentproxy_nt_lm_host: STRING_32
            l_jcrcontentproxy_host: STRING_32
            l_jcrcontentproxy_password: STRING_32
            l_jcrcontentproxy_port: REAL_32
            l_jcrcontentproxy_user: STRING_32
            l_jcrcontentqueue_batch_max_size: REAL_32
            l_jcrcontentqueue_batch_mode: STRING_32
            l_jcrcontentqueue_batch_wait_time: REAL_32
            l_jcrcontentretry_delay: STRING_32
            l_jcrcontentreverse_replication: BOOLEAN
            l_jcrcontentserialization_type: STRING_32
            l_jcrcontentslingresource_type: STRING_32
            l_jcrcontentssl: STRING_32
            l_jcrcontenttransport_nt_lm_domain: STRING_32
            l_jcrcontenttransport_nt_lm_host: STRING_32
            l_jcrcontenttransport_password: STRING_32
            l_jcrcontenttransport_uri: STRING_32
            l_jcrcontenttransport_user: STRING_32
            l_jcrcontenttrigger_distribute: BOOLEAN
            l_jcrcontenttrigger_modified: BOOLEAN
            l_jcrcontenttrigger_on_off_time: BOOLEAN
            l_jcrcontenttrigger_receive: BOOLEAN
            l_jcrcontenttrigger_specific: BOOLEAN
            l_jcrcontentuser_id: STRING_32
            l_jcrprimary_type: STRING_32
            l_operation: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_runmode
            -- l_name
                      
            -- api.post_agent(l_runmode, l_name, l_jcrcontentcqdistribute, l_jcrcontentcqdistribute_type_hint, l_jcrcontentcqname, l_jcrcontentcqtemplate, l_jcrcontentenabled, l_jcrcontentjcrdescription, l_jcrcontentjcrlast_modified, l_jcrcontentjcrlast_modified_by, l_jcrcontentjcrmixin_types, l_jcrcontentjcrtitle, l_jcrcontentlog_level, l_jcrcontentno_status_update, l_jcrcontentno_versioning, l_jcrcontentprotocol_connect_timeout, l_jcrcontentprotocol_ht_tp_connection_closed, l_jcrcontentprotocol_ht_tp_expired, l_jcrcontentprotocol_ht_tp_headers, l_jcrcontentprotocol_ht_tp_headers_type_hint, l_jcrcontentprotocol_ht_tp_method, l_jcrcontentprotocol_ht_tp_srelaxed, l_jcrcontentprotocol_interface, l_jcrcontentprotocol_socket_timeout, l_jcrcontentprotocol_version, l_jcrcontentproxy_nt_lm_domain, l_jcrcontentproxy_nt_lm_host, l_jcrcontentproxy_host, l_jcrcontentproxy_password, l_jcrcontentproxy_port, l_jcrcontentproxy_user, l_jcrcontentqueue_batch_max_size, l_jcrcontentqueue_batch_mode, l_jcrcontentqueue_batch_wait_time, l_jcrcontentretry_delay, l_jcrcontentreverse_replication, l_jcrcontentserialization_type, l_jcrcontentslingresource_type, l_jcrcontentssl, l_jcrcontenttransport_nt_lm_domain, l_jcrcontenttransport_nt_lm_host, l_jcrcontenttransport_password, l_jcrcontenttransport_uri, l_jcrcontenttransport_user, l_jcrcontenttrigger_distribute, l_jcrcontenttrigger_modified, l_jcrcontenttrigger_on_off_time, l_jcrcontenttrigger_receive, l_jcrcontenttrigger_specific, l_jcrcontentuser_id, l_jcrprimary_type, l_operation)
            assert ("not_implemented", False)
        end
    
    test_post_authorizable_keystore
            -- 
            -- 
            --  
        local
            l_response: KEYSTORE_INFO
            l_intermediate_path: STRING_32
            l_authorizable_id: STRING_32
            l_operation: STRING_32
            l_current_password: STRING_32
            l_new_password: STRING_32
            l_re_password: STRING_32
            l_key_password: STRING_32
            l_key_store_pass: STRING_32
            l_var_alias: STRING_32
            l_new_alias: STRING_32
            l_remove_alias: STRING_32
            l_cert_chain: FILE
            l_pk: FILE
            l_key_store: FILE
        do
            -- TODO: Initialize required params.
            -- l_intermediate_path
            -- l_authorizable_id
                      
            -- l_response := api.post_authorizable_keystore(l_intermediate_path, l_authorizable_id, l_operation, l_current_password, l_new_password, l_re_password, l_key_password, l_key_store_pass, l_var_alias, l_new_alias, l_remove_alias, l_cert_chain, l_pk, l_key_store)
            assert ("not_implemented", False)
        end
    
    test_post_authorizables
            -- 
            -- 
            --  
        local
            l_response: STRING_32
            l_authorizable_id: STRING_32
            l_intermediate_path: STRING_32
            l_create_user: STRING_32
            l_create_group: STRING_32
            l_reppassword: STRING_32
            l_profilegiven_name: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_authorizable_id
            -- l_intermediate_path
                      
            -- l_response := api.post_authorizables(l_authorizable_id, l_intermediate_path, l_create_user, l_create_group, l_reppassword, l_profilegiven_name)
            assert ("not_implemented", False)
        end
    
    test_post_config_adobe_granite_saml_authentication_handler
            -- 
            -- 
            --  
        local
            l_key_store_password: STRING_32
            l_key_store_password_type_hint: STRING_32
            l_service_ranking: INTEGER_32
            l_service_ranking_type_hint: STRING_32
            l_idp_http_redirect: BOOLEAN
            l_idp_http_redirect_type_hint: STRING_32
            l_create_user: BOOLEAN
            l_create_user_type_hint: STRING_32
            l_default_redirect_url: STRING_32
            l_default_redirect_url_type_hint: STRING_32
            l_user_id_attribute: STRING_32
            l_user_id_attribute_type_hint: STRING_32
            l_default_groups: LIST [STRING_32]
            l_default_groups_type_hint: STRING_32
            l_idp_cert_alias: STRING_32
            l_idp_cert_alias_type_hint: STRING_32
            l_add_group_memberships: BOOLEAN
            l_add_group_memberships_type_hint: STRING_32
            l_path: LIST [STRING_32]
            l_path_type_hint: STRING_32
            l_synchronize_attributes: LIST [STRING_32]
            l_synchronize_attributes_type_hint: STRING_32
            l_clock_tolerance: INTEGER_32
            l_clock_tolerance_type_hint: STRING_32
            l_group_membership_attribute: STRING_32
            l_group_membership_attribute_type_hint: STRING_32
            l_idp_url: STRING_32
            l_idp_url_type_hint: STRING_32
            l_logout_url: STRING_32
            l_logout_url_type_hint: STRING_32
            l_service_provider_entity_id: STRING_32
            l_service_provider_entity_id_type_hint: STRING_32
            l_assertion_consumer_service_ur_l: STRING_32
            l_assertion_consumer_service_ur_ltype_hint: STRING_32
            l_handle_logout: BOOLEAN
            l_handle_logout_type_hint: STRING_32
            l_sp_private_key_alias: STRING_32
            l_sp_private_key_alias_type_hint: STRING_32
            l_use_encryption: BOOLEAN
            l_use_encryption_type_hint: STRING_32
            l_name_id_format: STRING_32
            l_name_id_format_type_hint: STRING_32
            l_digest_method: STRING_32
            l_digest_method_type_hint: STRING_32
            l_signature_method: STRING_32
            l_signature_method_type_hint: STRING_32
            l_user_intermediate_path: STRING_32
            l_user_intermediate_path_type_hint: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- api.post_config_adobe_granite_saml_authentication_handler(l_key_store_password, l_key_store_password_type_hint, l_service_ranking, l_service_ranking_type_hint, l_idp_http_redirect, l_idp_http_redirect_type_hint, l_create_user, l_create_user_type_hint, l_default_redirect_url, l_default_redirect_url_type_hint, l_user_id_attribute, l_user_id_attribute_type_hint, l_default_groups, l_default_groups_type_hint, l_idp_cert_alias, l_idp_cert_alias_type_hint, l_add_group_memberships, l_add_group_memberships_type_hint, l_path, l_path_type_hint, l_synchronize_attributes, l_synchronize_attributes_type_hint, l_clock_tolerance, l_clock_tolerance_type_hint, l_group_membership_attribute, l_group_membership_attribute_type_hint, l_idp_url, l_idp_url_type_hint, l_logout_url, l_logout_url_type_hint, l_service_provider_entity_id, l_service_provider_entity_id_type_hint, l_assertion_consumer_service_ur_l, l_assertion_consumer_service_ur_ltype_hint, l_handle_logout, l_handle_logout_type_hint, l_sp_private_key_alias, l_sp_private_key_alias_type_hint, l_use_encryption, l_use_encryption_type_hint, l_name_id_format, l_name_id_format_type_hint, l_digest_method, l_digest_method_type_hint, l_signature_method, l_signature_method_type_hint, l_user_intermediate_path, l_user_intermediate_path_type_hint)
            assert ("not_implemented", False)
        end
    
    test_post_config_apache_felix_jetty_based_http_service
            -- 
            -- 
            --  
        local
            l_org_apache_felix_https_nio: BOOLEAN
            l_org_apache_felix_https_nio_type_hint: STRING_32
            l_org_apache_felix_https_keystore: STRING_32
            l_org_apache_felix_https_keystore_type_hint: STRING_32
            l_org_apache_felix_https_keystore_password: STRING_32
            l_org_apache_felix_https_keystore_password_type_hint: STRING_32
            l_org_apache_felix_https_keystore_key: STRING_32
            l_org_apache_felix_https_keystore_key_type_hint: STRING_32
            l_org_apache_felix_https_keystore_key_password: STRING_32
            l_org_apache_felix_https_keystore_key_password_type_hint: STRING_32
            l_org_apache_felix_https_truststore: STRING_32
            l_org_apache_felix_https_truststore_type_hint: STRING_32
            l_org_apache_felix_https_truststore_password: STRING_32
            l_org_apache_felix_https_truststore_password_type_hint: STRING_32
            l_org_apache_felix_https_clientcertificate: STRING_32
            l_org_apache_felix_https_clientcertificate_type_hint: STRING_32
            l_org_apache_felix_https_enable: BOOLEAN
            l_org_apache_felix_https_enable_type_hint: STRING_32
            l_org_osgi_service_http_port_secure: STRING_32
            l_org_osgi_service_http_port_secure_type_hint: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- api.post_config_apache_felix_jetty_based_http_service(l_org_apache_felix_https_nio, l_org_apache_felix_https_nio_type_hint, l_org_apache_felix_https_keystore, l_org_apache_felix_https_keystore_type_hint, l_org_apache_felix_https_keystore_password, l_org_apache_felix_https_keystore_password_type_hint, l_org_apache_felix_https_keystore_key, l_org_apache_felix_https_keystore_key_type_hint, l_org_apache_felix_https_keystore_key_password, l_org_apache_felix_https_keystore_key_password_type_hint, l_org_apache_felix_https_truststore, l_org_apache_felix_https_truststore_type_hint, l_org_apache_felix_https_truststore_password, l_org_apache_felix_https_truststore_password_type_hint, l_org_apache_felix_https_clientcertificate, l_org_apache_felix_https_clientcertificate_type_hint, l_org_apache_felix_https_enable, l_org_apache_felix_https_enable_type_hint, l_org_osgi_service_http_port_secure, l_org_osgi_service_http_port_secure_type_hint)
            assert ("not_implemented", False)
        end
    
    test_post_config_apache_http_components_proxy_configuration
            -- 
            -- 
            --  
        local
            l_proxy_host: STRING_32
            l_proxy_host_type_hint: STRING_32
            l_proxy_port: INTEGER_32
            l_proxy_port_type_hint: STRING_32
            l_proxy_exceptions: LIST [STRING_32]
            l_proxy_exceptions_type_hint: STRING_32
            l_proxy_enabled: BOOLEAN
            l_proxy_enabled_type_hint: STRING_32
            l_proxy_user: STRING_32
            l_proxy_user_type_hint: STRING_32
            l_proxy_password: STRING_32
            l_proxy_password_type_hint: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- api.post_config_apache_http_components_proxy_configuration(l_proxy_host, l_proxy_host_type_hint, l_proxy_port, l_proxy_port_type_hint, l_proxy_exceptions, l_proxy_exceptions_type_hint, l_proxy_enabled, l_proxy_enabled_type_hint, l_proxy_user, l_proxy_user_type_hint, l_proxy_password, l_proxy_password_type_hint)
            assert ("not_implemented", False)
        end
    
    test_post_config_apache_sling_dav_ex_servlet
            -- 
            -- 
            --  
        local
            l_var_alias: STRING_32
            l_alias_type_hint: STRING_32
            l_dav_create_absolute_uri: BOOLEAN
            l_dav_create_absolute_uri_type_hint: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- api.post_config_apache_sling_dav_ex_servlet(l_var_alias, l_alias_type_hint, l_dav_create_absolute_uri, l_dav_create_absolute_uri_type_hint)
            assert ("not_implemented", False)
        end
    
    test_post_config_apache_sling_get_servlet
            -- 
            -- 
            --  
        local
            l_json_maximumresults: STRING_32
            l_json_maximumresults_type_hint: STRING_32
            l_enable_html: BOOLEAN
            l_enable_html_type_hint: STRING_32
            l_enable_txt: BOOLEAN
            l_enable_txt_type_hint: STRING_32
            l_enable_xml: BOOLEAN
            l_enable_xml_type_hint: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- api.post_config_apache_sling_get_servlet(l_json_maximumresults, l_json_maximumresults_type_hint, l_enable_html, l_enable_html_type_hint, l_enable_txt, l_enable_txt_type_hint, l_enable_xml, l_enable_xml_type_hint)
            assert ("not_implemented", False)
        end
    
    test_post_config_apache_sling_referrer_filter
            -- 
            -- 
            --  
        local
            l_allow_empty: BOOLEAN
            l_allow_empty_type_hint: STRING_32
            l_allow_hosts: STRING_32
            l_allow_hosts_type_hint: STRING_32
            l_allow_hosts_regexp: STRING_32
            l_allow_hosts_regexp_type_hint: STRING_32
            l_filter_methods: STRING_32
            l_filter_methods_type_hint: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- api.post_config_apache_sling_referrer_filter(l_allow_empty, l_allow_empty_type_hint, l_allow_hosts, l_allow_hosts_type_hint, l_allow_hosts_regexp, l_allow_hosts_regexp_type_hint, l_filter_methods, l_filter_methods_type_hint)
            assert ("not_implemented", False)
        end
    
    test_post_node
            -- 
            -- 
            --  
        local
            l_path: STRING_32
            l_name: STRING_32
            l_operation: STRING_32
            l_delete_authorizable: STRING_32
            l_file: FILE
        do
            -- TODO: Initialize required params.
            -- l_path
            -- l_name
                      
            -- api.post_node(l_path, l_name, l_operation, l_delete_authorizable, l_file)
            assert ("not_implemented", False)
        end
    
    test_post_node_rw
            -- 
            -- 
            --  
        local
            l_path: STRING_32
            l_name: STRING_32
            l_add_members: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_path
            -- l_name
                      
            -- api.post_node_rw(l_path, l_name, l_add_members)
            assert ("not_implemented", False)
        end
    
    test_post_path
            -- 
            -- 
            --  
        local
            l_path: STRING_32
            l_jcrprimary_type: STRING_32
            l_name: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_path
            -- l_jcrprimary_type
            -- l_name
                      
            -- api.post_path(l_path, l_jcrprimary_type, l_name)
            assert ("not_implemented", False)
        end
    
    test_post_query
            -- 
            -- 
            --  
        local
            l_response: STRING_32
            l_path: STRING_32
            l_p_limit: REAL_32
            l_var_1_property: STRING_32
            l_var_1_property_value: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_path
            -- l_p_limit
            -- l_var_1_property
            -- l_var_1_property_value
                      
            -- l_response := api.post_query(l_path, l_p_limit, l_var_1_property, l_var_1_property_value)
            assert ("not_implemented", False)
        end
    
    test_post_tree_activation
            -- 
            -- 
            --  
        local
            l_ignoredeactivated: BOOLEAN
            l_onlymodified: BOOLEAN
            l_path: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ignoredeactivated
            -- l_onlymodified
            -- l_path
                      
            -- api.post_tree_activation(l_ignoredeactivated, l_onlymodified, l_path)
            assert ("not_implemented", False)
        end
    
    test_post_truststore
            -- 
            -- 
            --  
        local
            l_response: STRING_32
            l_operation: STRING_32
            l_new_password: STRING_32
            l_re_password: STRING_32
            l_key_store_type: STRING_32
            l_remove_alias: STRING_32
            l_certificate: FILE
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.post_truststore(l_operation, l_new_password, l_re_password, l_key_store_type, l_remove_alias, l_certificate)
            assert ("not_implemented", False)
        end
    
    test_post_truststore_pk_cs12
            -- 
            -- 
            --  
        local
            l_response: STRING_32
            l_truststore_p12: FILE
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.post_truststore_pk_cs12(l_truststore_p12)
            assert ("not_implemented", False)
        end
    
    test_query
            -- 
            -- 
            --  
        local
            l_response: STRING_32
            l_path: STRING_32
            l_p_limit: REAL_32
            l_var_1_property: STRING_32
            l_var_1_property_value: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_path
            -- l_p_limit
            -- l_var_1_property
            -- l_var_1_property_value
                      
            -- l_response := api.query(l_path, l_p_limit, l_var_1_property, l_var_1_property_value)
            assert ("not_implemented", False)
        end
    
    test_truststore
            -- 
            -- 
            --  
        local
            l_response: FILE
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.truststore
            assert ("not_implemented", False)
        end
    
    test_truststore_info
            -- 
            -- 
            --  
        local
            l_response: TRUSTSTORE_INFO
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.truststore_info
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: SLING_API
            -- Create an object instance of `SLING_API'.
        once            
            create { SLING_API } Result
        end

end
