note
    description: "API tests for CUSTOM_API"
    date: "$Date$"
    revision: "$Revision$"


class CUSTOM_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_aem_health_check
            -- 
            -- 
            --  
        local
            l_response: STRING_32
            l_tags: STRING_32
            l_combine_tags_or: BOOLEAN
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.aem_health_check(l_tags, l_combine_tags_or)
            assert ("not_implemented", False)
        end
    
    test_post_config_aem_health_check_servlet
            -- 
            -- 
            --  
        local
            l_bundles_ignored: LIST [STRING_32]
            l_bundles_ignored_type_hint: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- api.post_config_aem_health_check_servlet(l_bundles_ignored, l_bundles_ignored_type_hint)
            assert ("not_implemented", False)
        end
    
    test_post_config_aem_password_reset
            -- 
            -- 
            --  
        local
            l_pwdreset_authorizables: LIST [STRING_32]
            l_pwdreset_authorizables_type_hint: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- api.post_config_aem_password_reset(l_pwdreset_authorizables, l_pwdreset_authorizables_type_hint)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CUSTOM_API
            -- Create an object instance of `CUSTOM_API'.
        once            
            create { CUSTOM_API } Result
        end

end
