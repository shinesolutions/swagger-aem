require "json"

module OpenAPIClient
  module Api
  class System
    def initialize(@conn : Connection); end

    # 
    def console_bundles(name : String, *, action : String? = nil) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/system/console/bundles/{name}".sub("{name}", OpenAPIClient.enc(name)),
        query: { "action" => action },
        accept: %w[],
        auth: %w[aemAuth])
    end

    # 
    def console_bundles_name_json(name : String) : Response(OpenAPIClient::BundleInfo)
      @conn.request(OpenAPIClient::BundleInfo,
        method: :GET,
        path: "/system/console/bundles/{name}.json".sub("{name}", OpenAPIClient.enc(name)),
        accept: %w[application/json],
        auth: %w[aemAuth])
    end

    # 
    def console_config_mgr() : Response(String)
      @conn.request(String,
        method: :GET,
        path: "/system/console/configMgr",
        accept: %w[text/xml],
        raw: true,
        auth: %w[aemAuth])
    end

    # 
    def console_config_mgr_com_adobe_granite_auth_saml_saml_authentication_handler(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, path : Array(String)? = nil, service_ranking : Int32? = nil, idp_url : String? = nil, idp_cert_alias : String? = nil, idp_http_redirect : Bool? = nil, service_provider_entity_id : String? = nil, assertion_consumer_service_url : String? = nil, sp_private_key_alias : String? = nil, key_store_password : String? = nil, default_redirect_url : String? = nil, user_id_attribute : String? = nil, use_encryption : Bool? = nil, create_user : Bool? = nil, add_group_memberships : Bool? = nil, group_membership_attribute : String? = nil, default_groups : Array(String)? = nil, name_id_format : String? = nil, synchronize_attributes : Array(String)? = nil, handle_logout : Bool? = nil, logout_url : String? = nil, clock_tolerance : Int32? = nil, digest_method : String? = nil, signature_method : String? = nil, user_intermediate_path : String? = nil, propertylist : Array(String)? = nil) : Response(OpenAPIClient::SamlConfigurationInfo)
      @conn.request(OpenAPIClient::SamlConfigurationInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "path" => path, "service.ranking" => service_ranking, "idpUrl" => idp_url, "idpCertAlias" => idp_cert_alias, "idpHttpRedirect" => idp_http_redirect, "serviceProviderEntityId" => service_provider_entity_id, "assertionConsumerServiceURL" => assertion_consumer_service_url, "spPrivateKeyAlias" => sp_private_key_alias, "keyStorePassword" => key_store_password, "defaultRedirectUrl" => default_redirect_url, "userIDAttribute" => user_id_attribute, "useEncryption" => use_encryption, "createUser" => create_user, "addGroupMemberships" => add_group_memberships, "groupMembershipAttribute" => group_membership_attribute, "defaultGroups" => default_groups, "nameIdFormat" => name_id_format, "synchronizeAttributes" => synchronize_attributes, "handleLogout" => handle_logout, "logoutUrl" => logout_url, "clockTolerance" => clock_tolerance, "digestMethod" => digest_method, "signatureMethod" => signature_method, "userIntermediatePath" => user_intermediate_path, "propertylist" => propertylist.try(&.map(&.to_s).join(",")) },
        accept: %w[text/plain],
        raw: true,
        auth: %w[aemAuth])
    end

    # 
    def console_jmx_com_adobe_granite_typerepository_op(action : String) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/system/console/jmx/com.adobe.granite:type=Repository/op/{action}".sub("{action}", OpenAPIClient.enc(action)),
        accept: %w[],
        auth: %w[aemAuth])
    end

    # 
    def console_status_productinfo_json() : Response(Array(String))
      @conn.request(Array(String),
        method: :GET,
        path: "/system/console/status-productinfo.json",
        accept: %w[application/json],
        auth: %w[aemAuth])
    end

    # 
    def health(*, tags : String? = nil, combine_tags_or : Bool? = nil) : Response(String)
      @conn.request(String,
        method: :GET,
        path: "/system/health",
        query: { "tags" => tags, "combineTagsOr" => combine_tags_or },
        accept: %w[application/json],
        auth: %w[aemAuth])
    end
  end
  end

end
