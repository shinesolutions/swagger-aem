note
    description: "API tests for CRX_API"
    date: "$Date$"
    revision: "$Revision$"


class CRX_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_crxde_status
            -- 
            -- 
            --  
        local
            l_response: STRING_32
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.crxde_status
            assert ("not_implemented", False)
        end
    
    test_install_status
            -- 
            -- 
            --  
        local
            l_response: INSTALL_STATUS
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.install_status
            assert ("not_implemented", False)
        end
    
    test_package_manager_servlet
            -- 
            -- 
            --  
        local
        do
            -- TODO: Initialize required params.
                      
            -- api.package_manager_servlet
            assert ("not_implemented", False)
        end
    
    test_post_package_service
            -- 
            -- 
            --  
        local
            l_response: STRING_32
            l_cmd: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_cmd
                      
            -- l_response := api.post_package_service(l_cmd)
            assert ("not_implemented", False)
        end
    
    test_post_package_service_json
            -- 
            -- 
            --  
        local
            l_response: STRING_32
            l_path: STRING_32
            l_cmd: STRING_32
            l_group_name: STRING_32
            l_package_name: STRING_32
            l_package_version: STRING_32
            l_var_charset_: STRING_32
            l_force: BOOLEAN
            l_recursive: BOOLEAN
            l_package: FILE
        do
            -- TODO: Initialize required params.
            -- l_path
            -- l_cmd
                      
            -- l_response := api.post_package_service_json(l_path, l_cmd, l_group_name, l_package_name, l_package_version, l_var_charset_, l_force, l_recursive, l_package)
            assert ("not_implemented", False)
        end
    
    test_post_package_update
            -- 
            -- 
            --  
        local
            l_response: STRING_32
            l_group_name: STRING_32
            l_package_name: STRING_32
            l_version: STRING_32
            l_path: STRING_32
            l_filter: STRING_32
            l_var_charset_: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_group_name
            -- l_package_name
            -- l_version
            -- l_path
                      
            -- l_response := api.post_package_update(l_group_name, l_package_name, l_version, l_path, l_filter, l_var_charset_)
            assert ("not_implemented", False)
        end
    
    test_post_set_password
            -- 
            -- 
            --  
        local
            l_response: STRING_32
            l_var_old: STRING_32
            l_plain: STRING_32
            l_verify: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_var_old
            -- l_plain
            -- l_verify
                      
            -- l_response := api.post_set_password(l_var_old, l_plain, l_verify)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CRX_API
            -- Create an object instance of `CRX_API'.
        once            
            create { CRX_API } Result
        end

end
