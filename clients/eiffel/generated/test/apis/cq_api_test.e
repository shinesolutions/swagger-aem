note
    description: "API tests for CQ_API"
    date: "$Date$"
    revision: "$Revision$"


class CQ_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_login_page
            -- 
            -- 
            --  
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.login_page
            assert ("not_implemented", False)
        end
    
    test_post_cq_actions
            -- 
            -- 
            --  
        local
            l_authorizable_id: STRING_32
            l_changelog: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_authorizable_id
            -- l_changelog
                      
            -- api.post_cq_actions(l_authorizable_id, l_changelog)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CQ_API
            -- Create an object instance of `CQ_API'.
        once            
            create { CQ_API } Result
        end

end
