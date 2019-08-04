note
    description: "API tests for CONSOLE_API"
    date: "$Date$"
    revision: "$Revision$"


class CONSOLE_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_aem_product_info
            -- 
            -- 
            --  
        local
            l_response: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.aem_product_info
            assert ("not_implemented", False)
        end
    
    test_config_mgr
            -- 
            -- 
            --  
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.config_mgr
            assert ("not_implemented", False)
        end
    
    test_post_bundle
            -- 
            -- 
            --  
        local
            l_name: STRING_32
            l_action: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_name
            -- l_action
                      
            -- api.post_bundle(l_name, l_action)
            assert ("not_implemented", False)
        end
    
    test_post_jmx_repository
            -- 
            -- 
            --  
        local
            l_action: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_action
                      
            -- api.post_jmx_repository(l_action)
            assert ("not_implemented", False)
        end
    
    test_post_saml_configuration
            -- 
            -- 
            --  
        local
            l_response: SAML_CONFIGURATION_INFO
            l_post: BOOLEAN
            l_apply: BOOLEAN
            l_delete: BOOLEAN
            l_action: STRING_32
            l_location: STRING_32
            l_path: LIST [STRING_32]
            l_service_ranking: INTEGER_32
            l_idp_url: STRING_32
            l_idp_cert_alias: STRING_32
            l_idp_http_redirect: BOOLEAN
            l_service_provider_entity_id: STRING_32
            l_assertion_consumer_service_ur_l: STRING_32
            l_sp_private_key_alias: STRING_32
            l_key_store_password: STRING_32
            l_default_redirect_url: STRING_32
            l_user_id_attribute: STRING_32
            l_use_encryption: BOOLEAN
            l_create_user: BOOLEAN
            l_add_group_memberships: BOOLEAN
            l_group_membership_attribute: STRING_32
            l_default_groups: LIST [STRING_32]
            l_name_id_format: STRING_32
            l_synchronize_attributes: LIST [STRING_32]
            l_handle_logout: BOOLEAN
            l_logout_url: STRING_32
            l_clock_tolerance: INTEGER_32
            l_digest_method: STRING_32
            l_signature_method: STRING_32
            l_user_intermediate_path: STRING_32
            l_propertylist: LIST [STRING_32]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.post_saml_configuration(l_post, l_apply, l_delete, l_action, l_location, l_path, l_service_ranking, l_idp_url, l_idp_cert_alias, l_idp_http_redirect, l_service_provider_entity_id, l_assertion_consumer_service_ur_l, l_sp_private_key_alias, l_key_store_password, l_default_redirect_url, l_user_id_attribute, l_use_encryption, l_create_user, l_add_group_memberships, l_group_membership_attribute, l_default_groups, l_name_id_format, l_synchronize_attributes, l_handle_logout, l_logout_url, l_clock_tolerance, l_digest_method, l_signature_method, l_user_intermediate_path, l_propertylist)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CONSOLE_API
            -- Create an object instance of `CONSOLE_API'.
        once            
            create { CONSOLE_API } Result
        end

end
