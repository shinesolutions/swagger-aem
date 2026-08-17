require "json"

module OpenAPIClient
  module Api
  class Apps
    def initialize(@conn : Connection); end

    # 
    def system_config(config_node_name : String) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/apps/system/config/{configNodeName}".sub("{configNodeName}", OpenAPIClient.enc(config_node_name)),
        accept: %w[],
        auth: %w[aemAuth])
    end

    # 
    def system_config_com_adobe_granite_auth_saml_saml_authentication_handler_config(*, key_store_password : String? = nil, key_store_password_type_hint : String? = nil, service_ranking : Int32? = nil, service_ranking_type_hint : String? = nil, idp_http_redirect : Bool? = nil, idp_http_redirect_type_hint : String? = nil, create_user : Bool? = nil, create_user_type_hint : String? = nil, default_redirect_url : String? = nil, default_redirect_url_type_hint : String? = nil, user_id_attribute : String? = nil, user_id_attribute_type_hint : String? = nil, default_groups : Array(String)? = nil, default_groups_type_hint : String? = nil, idp_cert_alias : String? = nil, idp_cert_alias_type_hint : String? = nil, add_group_memberships : Bool? = nil, add_group_memberships_type_hint : String? = nil, path : Array(String)? = nil, path_type_hint : String? = nil, synchronize_attributes : Array(String)? = nil, synchronize_attributes_type_hint : String? = nil, clock_tolerance : Int32? = nil, clock_tolerance_type_hint : String? = nil, group_membership_attribute : String? = nil, group_membership_attribute_type_hint : String? = nil, idp_url : String? = nil, idp_url_type_hint : String? = nil, logout_url : String? = nil, logout_url_type_hint : String? = nil, service_provider_entity_id : String? = nil, service_provider_entity_id_type_hint : String? = nil, assertion_consumer_service_url : String? = nil, assertion_consumer_service_url_type_hint : String? = nil, handle_logout : Bool? = nil, handle_logout_type_hint : String? = nil, sp_private_key_alias : String? = nil, sp_private_key_alias_type_hint : String? = nil, use_encryption : Bool? = nil, use_encryption_type_hint : String? = nil, name_id_format : String? = nil, name_id_format_type_hint : String? = nil, digest_method : String? = nil, digest_method_type_hint : String? = nil, signature_method : String? = nil, signature_method_type_hint : String? = nil, user_intermediate_path : String? = nil, user_intermediate_path_type_hint : String? = nil) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config",
        query: { "keyStorePassword" => key_store_password, "keyStorePassword@TypeHint" => key_store_password_type_hint, "service.ranking" => service_ranking, "service.ranking@TypeHint" => service_ranking_type_hint, "idpHttpRedirect" => idp_http_redirect, "idpHttpRedirect@TypeHint" => idp_http_redirect_type_hint, "createUser" => create_user, "createUser@TypeHint" => create_user_type_hint, "defaultRedirectUrl" => default_redirect_url, "defaultRedirectUrl@TypeHint" => default_redirect_url_type_hint, "userIDAttribute" => user_id_attribute, "userIDAttribute@TypeHint" => user_id_attribute_type_hint, "defaultGroups" => default_groups, "defaultGroups@TypeHint" => default_groups_type_hint, "idpCertAlias" => idp_cert_alias, "idpCertAlias@TypeHint" => idp_cert_alias_type_hint, "addGroupMemberships" => add_group_memberships, "addGroupMemberships@TypeHint" => add_group_memberships_type_hint, "path" => path, "path@TypeHint" => path_type_hint, "synchronizeAttributes" => synchronize_attributes, "synchronizeAttributes@TypeHint" => synchronize_attributes_type_hint, "clockTolerance" => clock_tolerance, "clockTolerance@TypeHint" => clock_tolerance_type_hint, "groupMembershipAttribute" => group_membership_attribute, "groupMembershipAttribute@TypeHint" => group_membership_attribute_type_hint, "idpUrl" => idp_url, "idpUrl@TypeHint" => idp_url_type_hint, "logoutUrl" => logout_url, "logoutUrl@TypeHint" => logout_url_type_hint, "serviceProviderEntityId" => service_provider_entity_id, "serviceProviderEntityId@TypeHint" => service_provider_entity_id_type_hint, "assertionConsumerServiceURL" => assertion_consumer_service_url, "assertionConsumerServiceURL@TypeHint" => assertion_consumer_service_url_type_hint, "handleLogout" => handle_logout, "handleLogout@TypeHint" => handle_logout_type_hint, "spPrivateKeyAlias" => sp_private_key_alias, "spPrivateKeyAlias@TypeHint" => sp_private_key_alias_type_hint, "useEncryption" => use_encryption, "useEncryption@TypeHint" => use_encryption_type_hint, "nameIdFormat" => name_id_format, "nameIdFormat@TypeHint" => name_id_format_type_hint, "digestMethod" => digest_method, "digestMethod@TypeHint" => digest_method_type_hint, "signatureMethod" => signature_method, "signatureMethod@TypeHint" => signature_method_type_hint, "userIntermediatePath" => user_intermediate_path, "userIntermediatePath@TypeHint" => user_intermediate_path_type_hint },
        accept: %w[],
        auth: %w[aemAuth])
    end

    # 
    def system_config_com_shinesolutions_aem_passwordreset_activator(*, pwdreset_authorizables : Array(String)? = nil, pwdreset_authorizables_type_hint : String? = nil) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/apps/system/config/com.shinesolutions.aem.passwordreset.Activator",
        query: { "pwdreset.authorizables" => pwdreset_authorizables, "pwdreset.authorizables@TypeHint" => pwdreset_authorizables_type_hint },
        accept: %w[],
        auth: %w[aemAuth])
    end

    # 
    def system_config_com_shinesolutions_healthcheck_hc_impl_active_bundle_health_check(*, bundles_ignored : Array(String)? = nil, bundles_ignored_type_hint : String? = nil) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck",
        query: { "bundles.ignored" => bundles_ignored, "bundles.ignored@TypeHint" => bundles_ignored_type_hint },
        accept: %w[],
        auth: %w[aemAuth])
    end

    # 
    def system_config_org_apache_felix_http(*, org_apache_felix_https_nio : Bool? = nil, org_apache_felix_https_nio_type_hint : String? = nil, org_apache_felix_https_keystore : String? = nil, org_apache_felix_https_keystore_type_hint : String? = nil, org_apache_felix_https_keystore_password : String? = nil, org_apache_felix_https_keystore_password_type_hint : String? = nil, org_apache_felix_https_keystore_key : String? = nil, org_apache_felix_https_keystore_key_type_hint : String? = nil, org_apache_felix_https_keystore_key_password : String? = nil, org_apache_felix_https_keystore_key_password_type_hint : String? = nil, org_apache_felix_https_truststore : String? = nil, org_apache_felix_https_truststore_type_hint : String? = nil, org_apache_felix_https_truststore_password : String? = nil, org_apache_felix_https_truststore_password_type_hint : String? = nil, org_apache_felix_https_clientcertificate : String? = nil, org_apache_felix_https_clientcertificate_type_hint : String? = nil, org_apache_felix_https_enable : Bool? = nil, org_apache_felix_https_enable_type_hint : String? = nil, org_osgi_service_http_port_secure : String? = nil, org_osgi_service_http_port_secure_type_hint : String? = nil) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/apps/system/config/org.apache.felix.http",
        query: { "org.apache.felix.https.nio" => org_apache_felix_https_nio, "org.apache.felix.https.nio@TypeHint" => org_apache_felix_https_nio_type_hint, "org.apache.felix.https.keystore" => org_apache_felix_https_keystore, "org.apache.felix.https.keystore@TypeHint" => org_apache_felix_https_keystore_type_hint, "org.apache.felix.https.keystore.password" => org_apache_felix_https_keystore_password, "org.apache.felix.https.keystore.password@TypeHint" => org_apache_felix_https_keystore_password_type_hint, "org.apache.felix.https.keystore.key" => org_apache_felix_https_keystore_key, "org.apache.felix.https.keystore.key@TypeHint" => org_apache_felix_https_keystore_key_type_hint, "org.apache.felix.https.keystore.key.password" => org_apache_felix_https_keystore_key_password, "org.apache.felix.https.keystore.key.password@TypeHint" => org_apache_felix_https_keystore_key_password_type_hint, "org.apache.felix.https.truststore" => org_apache_felix_https_truststore, "org.apache.felix.https.truststore@TypeHint" => org_apache_felix_https_truststore_type_hint, "org.apache.felix.https.truststore.password" => org_apache_felix_https_truststore_password, "org.apache.felix.https.truststore.password@TypeHint" => org_apache_felix_https_truststore_password_type_hint, "org.apache.felix.https.clientcertificate" => org_apache_felix_https_clientcertificate, "org.apache.felix.https.clientcertificate@TypeHint" => org_apache_felix_https_clientcertificate_type_hint, "org.apache.felix.https.enable" => org_apache_felix_https_enable, "org.apache.felix.https.enable@TypeHint" => org_apache_felix_https_enable_type_hint, "org.osgi.service.http.port.secure" => org_osgi_service_http_port_secure, "org.osgi.service.http.port.secure@TypeHint" => org_osgi_service_http_port_secure_type_hint },
        accept: %w[],
        auth: %w[aemAuth])
    end

    # 
    def system_config_org_apache_http_proxyconfigurator_config(*, proxy_host : String? = nil, proxy_host_type_hint : String? = nil, proxy_port : Int32? = nil, proxy_port_type_hint : String? = nil, proxy_exceptions : Array(String)? = nil, proxy_exceptions_type_hint : String? = nil, proxy_enabled : Bool? = nil, proxy_enabled_type_hint : String? = nil, proxy_user : String? = nil, proxy_user_type_hint : String? = nil, proxy_password : String? = nil, proxy_password_type_hint : String? = nil) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/apps/system/config/org.apache.http.proxyconfigurator.config",
        query: { "proxy.host" => proxy_host, "proxy.host@TypeHint" => proxy_host_type_hint, "proxy.port" => proxy_port, "proxy.port@TypeHint" => proxy_port_type_hint, "proxy.exceptions" => proxy_exceptions, "proxy.exceptions@TypeHint" => proxy_exceptions_type_hint, "proxy.enabled" => proxy_enabled, "proxy.enabled@TypeHint" => proxy_enabled_type_hint, "proxy.user" => proxy_user, "proxy.user@TypeHint" => proxy_user_type_hint, "proxy.password" => proxy_password, "proxy.password@TypeHint" => proxy_password_type_hint },
        accept: %w[],
        auth: %w[aemAuth])
    end

    # 
    def system_config_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet(*, _alias : String? = nil, alias_type_hint : String? = nil, dav_create_absolute_uri : Bool? = nil, dav_create_absolute_uri_type_hint : String? = nil) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet",
        query: { "alias" => _alias, "alias@TypeHint" => alias_type_hint, "dav.create-absolute-uri" => dav_create_absolute_uri, "dav.create-absolute-uri@TypeHint" => dav_create_absolute_uri_type_hint },
        accept: %w[],
        auth: %w[aemAuth])
    end

    # 
    def system_config_org_apache_sling_security_impl_referrer_filter(*, allow_empty : Bool? = nil, allow_empty_type_hint : String? = nil, allow_hosts : String? = nil, allow_hosts_type_hint : String? = nil, allow_hosts_regexp : String? = nil, allow_hosts_regexp_type_hint : String? = nil, filter_methods : String? = nil, filter_methods_type_hint : String? = nil) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/apps/system/config/org.apache.sling.security.impl.ReferrerFilter",
        query: { "allow.empty" => allow_empty, "allow.empty@TypeHint" => allow_empty_type_hint, "allow.hosts" => allow_hosts, "allow.hosts@TypeHint" => allow_hosts_type_hint, "allow.hosts.regexp" => allow_hosts_regexp, "allow.hosts.regexp@TypeHint" => allow_hosts_regexp_type_hint, "filter.methods" => filter_methods, "filter.methods@TypeHint" => filter_methods_type_hint },
        accept: %w[],
        auth: %w[aemAuth])
    end

    # 
    def system_config_org_apache_sling_servlets_get_default_get_servlet(*, json_maximumresults : String? = nil, json_maximumresults_type_hint : String? = nil, enable_html : Bool? = nil, enable_html_type_hint : String? = nil, enable_txt : Bool? = nil, enable_txt_type_hint : String? = nil, enable_xml : Bool? = nil, enable_xml_type_hint : String? = nil) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet",
        query: { "json.maximumresults" => json_maximumresults, "json.maximumresults@TypeHint" => json_maximumresults_type_hint, "enable.html" => enable_html, "enable.html@TypeHint" => enable_html_type_hint, "enable.txt" => enable_txt, "enable.txt@TypeHint" => enable_txt_type_hint, "enable.xml" => enable_xml, "enable.xml@TypeHint" => enable_xml_type_hint },
        accept: %w[],
        auth: %w[aemAuth])
    end
  end
  end

end
