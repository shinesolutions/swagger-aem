note
    description: "API tests for GRANITE_API"
    date: "$Date$"
    revision: "$Revision$"


class GRANITE_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_ssl_setup
            -- 
            -- 
            --  
        local
            l_response: STRING_32
            l_keystore_password: STRING_32
            l_keystore_password_confirm: STRING_32
            l_truststore_password: STRING_32
            l_truststore_password_confirm: STRING_32
            l_https_hostname: STRING_32
            l_https_port: STRING_32
            l_privatekey_file: FILE
            l_certificate_file: FILE
        do
            -- TODO: Initialize required params.
            -- l_keystore_password
            -- l_keystore_password_confirm
            -- l_truststore_password
            -- l_truststore_password_confirm
            -- l_https_hostname
            -- l_https_port
                      
            -- l_response := api.ssl_setup(l_keystore_password, l_keystore_password_confirm, l_truststore_password, l_truststore_password_confirm, l_https_hostname, l_https_port, l_privatekey_file, l_certificate_file)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: GRANITE_API
            -- Create an object instance of `GRANITE_API'.
        once            
            create { GRANITE_API } Result
        end

end
