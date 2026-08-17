require "json"

module OpenAPIClient
  module Api
  class Libs
    def initialize(@conn : Connection); end

    # 
    def granite_core_content_login_html() : Response(String)
      @conn.request(String,
        method: :GET,
        path: "/libs/granite/core/content/login.html",
        accept: %w[text/html],
        raw: true,
        auth: %w[])
    end

    # 
    def granite_security_post_authorizables(*, authorizable_id : String? = nil, intermediate_path : String? = nil, create_user : String? = nil, create_group : String? = nil, rep_password : String? = nil, profile_given_name : String? = nil) : Response(String)
      @conn.request(String,
        method: :POST,
        path: "/libs/granite/security/post/authorizables",
        query: { "authorizableId" => authorizable_id, "intermediatePath" => intermediate_path, "createUser" => create_user, "createGroup" => create_group, "rep:password" => rep_password, "profile/givenName" => profile_given_name },
        accept: %w[text/html],
        raw: true,
        auth: %w[aemAuth])
    end

    # 
    def granite_security_post_ssl_setup_html(privatekey_file : ::File? = nil, certificate_file : ::File? = nil, *, keystore_password : String? = nil, keystore_password_confirm : String? = nil, truststore_password : String? = nil, truststore_password_confirm : String? = nil, https_hostname : String? = nil, https_port : String? = nil) : Response(String)
      @conn.request(String,
        method: :POST,
        path: "/libs/granite/security/post/sslSetup.html",
        query: { "keystorePassword" => keystore_password, "keystorePasswordConfirm" => keystore_password_confirm, "truststorePassword" => truststore_password, "truststorePasswordConfirm" => truststore_password_confirm, "httpsHostname" => https_hostname, "httpsPort" => https_port },
        form: Hash(String, Crest::ParamsValue){ "privatekeyFile" => privatekey_file, "certificateFile" => certificate_file },
        accept: %w[text/plain],
        raw: true,
        auth: %w[aemAuth])
    end

    # 
    def granite_security_post_truststore(certificate : ::File? = nil, *, _operation : String? = nil, new_password : String? = nil, re_password : String? = nil, key_store_type : String? = nil, remove_alias : String? = nil) : Response(String)
      @conn.request(String,
        method: :POST,
        path: "/libs/granite/security/post/truststore",
        query: { ":operation" => _operation, "newPassword" => new_password, "rePassword" => re_password, "keyStoreType" => key_store_type, "removeAlias" => remove_alias },
        form: Hash(String, Crest::ParamsValue){ "certificate" => certificate },
        accept: %w[text/plain],
        raw: true,
        auth: %w[aemAuth])
    end

    # 
    def granite_security_truststore_json() : Response(OpenAPIClient::TruststoreInfo)
      @conn.request(OpenAPIClient::TruststoreInfo,
        method: :GET,
        path: "/libs/granite/security/truststore.json",
        accept: %w[application/json],
        auth: %w[aemAuth])
    end

    # 
    def replication_treeactivation_html(*, ignoredeactivated : Bool? = nil, onlymodified : Bool? = nil, path : String? = nil, cmd : String? = nil) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/libs/replication/treeactivation.html",
        query: { "ignoredeactivated" => ignoredeactivated, "onlymodified" => onlymodified, "path" => path, "cmd" => cmd },
        accept: %w[],
        auth: %w[aemAuth])
    end
  end
  end

end
