# frozen_string_literal: true

module OpenapiClient
  module Api
    class Apps
      def initialize(connection)
        @connection = connection
      end

      def system_config(config_node_name:)
        raise ArgumentError, 'config_node_name is required' if config_node_name.nil?

        @connection.call(
          :POST,
          '/apps/system/config/{configNodeName}'
            .gsub('{configNodeName}', ERB::Util.url_encode(config_node_name.to_s)),
          type: nil,
          auth: ['aemAuth']
        )
      end

      def system_config_com/adobe/granite/auth/saml/saml_authentication_handler/config(key_store_password: nil, key_store_password_type_hint: nil, service_ranking: nil, service_ranking_type_hint: nil, idp_http_redirect: nil, idp_http_redirect_type_hint: nil, create_user: nil, create_user_type_hint: nil, default_redirect_url: nil, default_redirect_url_type_hint: nil, user_id_attribute: nil, user_id_attribute_type_hint: nil, default_groups: nil, default_groups_type_hint: nil, idp_cert_alias: nil, idp_cert_alias_type_hint: nil, add_group_memberships: nil, add_group_memberships_type_hint: nil, path: nil, path_type_hint: nil, synchronize_attributes: nil, synchronize_attributes_type_hint: nil, clock_tolerance: nil, clock_tolerance_type_hint: nil, group_membership_attribute: nil, group_membership_attribute_type_hint: nil, idp_url: nil, idp_url_type_hint: nil, logout_url: nil, logout_url_type_hint: nil, service_provider_entity_id: nil, service_provider_entity_id_type_hint: nil, assertion_consumer_service_url: nil, assertion_consumer_service_url_type_hint: nil, handle_logout: nil, handle_logout_type_hint: nil, sp_private_key_alias: nil, sp_private_key_alias_type_hint: nil, use_encryption: nil, use_encryption_type_hint: nil, name_id_format: nil, name_id_format_type_hint: nil, digest_method: nil, digest_method_type_hint: nil, signature_method: nil, signature_method_type_hint: nil, user_intermediate_path: nil, user_intermediate_path_type_hint: nil)
        @connection.call(
          :POST,
          '/apps/system/config/com.adobe.granite.auth.saml.SamlAuthenticationHandler.config',
          type: nil,
          auth: ['aemAuth'],
          query: { 'keyStorePassword' => key_store_password, 'keyStorePassword@TypeHint' => key_store_password_type_hint, 'service.ranking' => service_ranking, 'service.ranking@TypeHint' => service_ranking_type_hint, 'idpHttpRedirect' => idp_http_redirect, 'idpHttpRedirect@TypeHint' => idp_http_redirect_type_hint, 'createUser' => create_user, 'createUser@TypeHint' => create_user_type_hint, 'defaultRedirectUrl' => default_redirect_url, 'defaultRedirectUrl@TypeHint' => default_redirect_url_type_hint, 'userIDAttribute' => user_id_attribute, 'userIDAttribute@TypeHint' => user_id_attribute_type_hint, 'defaultGroups' => default_groups, 'defaultGroups@TypeHint' => default_groups_type_hint, 'idpCertAlias' => idp_cert_alias, 'idpCertAlias@TypeHint' => idp_cert_alias_type_hint, 'addGroupMemberships' => add_group_memberships, 'addGroupMemberships@TypeHint' => add_group_memberships_type_hint, 'path' => path, 'path@TypeHint' => path_type_hint, 'synchronizeAttributes' => synchronize_attributes, 'synchronizeAttributes@TypeHint' => synchronize_attributes_type_hint, 'clockTolerance' => clock_tolerance, 'clockTolerance@TypeHint' => clock_tolerance_type_hint, 'groupMembershipAttribute' => group_membership_attribute, 'groupMembershipAttribute@TypeHint' => group_membership_attribute_type_hint, 'idpUrl' => idp_url, 'idpUrl@TypeHint' => idp_url_type_hint, 'logoutUrl' => logout_url, 'logoutUrl@TypeHint' => logout_url_type_hint, 'serviceProviderEntityId' => service_provider_entity_id, 'serviceProviderEntityId@TypeHint' => service_provider_entity_id_type_hint, 'assertionConsumerServiceURL' => assertion_consumer_service_url, 'assertionConsumerServiceURL@TypeHint' => assertion_consumer_service_url_type_hint, 'handleLogout' => handle_logout, 'handleLogout@TypeHint' => handle_logout_type_hint, 'spPrivateKeyAlias' => sp_private_key_alias, 'spPrivateKeyAlias@TypeHint' => sp_private_key_alias_type_hint, 'useEncryption' => use_encryption, 'useEncryption@TypeHint' => use_encryption_type_hint, 'nameIdFormat' => name_id_format, 'nameIdFormat@TypeHint' => name_id_format_type_hint, 'digestMethod' => digest_method, 'digestMethod@TypeHint' => digest_method_type_hint, 'signatureMethod' => signature_method, 'signatureMethod@TypeHint' => signature_method_type_hint, 'userIntermediatePath' => user_intermediate_path, 'userIntermediatePath@TypeHint' => user_intermediate_path_type_hint }
        )
      end

      def system_config_com/shinesolutions/aem/passwordreset/activator(pwdreset_authorizables: nil, pwdreset_authorizables_type_hint: nil)
        @connection.call(
          :POST,
          '/apps/system/config/com.shinesolutions.aem.passwordreset.Activator',
          type: nil,
          auth: ['aemAuth'],
          query: { 'pwdreset.authorizables' => pwdreset_authorizables, 'pwdreset.authorizables@TypeHint' => pwdreset_authorizables_type_hint }
        )
      end

      def system_config_com/shinesolutions/healthcheck/hc/impl/active_bundle_health_check(bundles_ignored: nil, bundles_ignored_type_hint: nil)
        @connection.call(
          :POST,
          '/apps/system/config/com.shinesolutions.healthcheck.hc.impl.ActiveBundleHealthCheck',
          type: nil,
          auth: ['aemAuth'],
          query: { 'bundles.ignored' => bundles_ignored, 'bundles.ignored@TypeHint' => bundles_ignored_type_hint }
        )
      end

      def system_config_org/apache/felix/http(org_apache_felix_https_nio: nil, org_apache_felix_https_nio_type_hint: nil, org_apache_felix_https_keystore: nil, org_apache_felix_https_keystore_type_hint: nil, org_apache_felix_https_keystore_password: nil, org_apache_felix_https_keystore_password_type_hint: nil, org_apache_felix_https_keystore_key: nil, org_apache_felix_https_keystore_key_type_hint: nil, org_apache_felix_https_keystore_key_password: nil, org_apache_felix_https_keystore_key_password_type_hint: nil, org_apache_felix_https_truststore: nil, org_apache_felix_https_truststore_type_hint: nil, org_apache_felix_https_truststore_password: nil, org_apache_felix_https_truststore_password_type_hint: nil, org_apache_felix_https_clientcertificate: nil, org_apache_felix_https_clientcertificate_type_hint: nil, org_apache_felix_https_enable: nil, org_apache_felix_https_enable_type_hint: nil, org_osgi_service_http_port_secure: nil, org_osgi_service_http_port_secure_type_hint: nil)
        @connection.call(
          :POST,
          '/apps/system/config/org.apache.felix.http',
          type: nil,
          auth: ['aemAuth'],
          query: { 'org.apache.felix.https.nio' => org_apache_felix_https_nio, 'org.apache.felix.https.nio@TypeHint' => org_apache_felix_https_nio_type_hint, 'org.apache.felix.https.keystore' => org_apache_felix_https_keystore, 'org.apache.felix.https.keystore@TypeHint' => org_apache_felix_https_keystore_type_hint, 'org.apache.felix.https.keystore.password' => org_apache_felix_https_keystore_password, 'org.apache.felix.https.keystore.password@TypeHint' => org_apache_felix_https_keystore_password_type_hint, 'org.apache.felix.https.keystore.key' => org_apache_felix_https_keystore_key, 'org.apache.felix.https.keystore.key@TypeHint' => org_apache_felix_https_keystore_key_type_hint, 'org.apache.felix.https.keystore.key.password' => org_apache_felix_https_keystore_key_password, 'org.apache.felix.https.keystore.key.password@TypeHint' => org_apache_felix_https_keystore_key_password_type_hint, 'org.apache.felix.https.truststore' => org_apache_felix_https_truststore, 'org.apache.felix.https.truststore@TypeHint' => org_apache_felix_https_truststore_type_hint, 'org.apache.felix.https.truststore.password' => org_apache_felix_https_truststore_password, 'org.apache.felix.https.truststore.password@TypeHint' => org_apache_felix_https_truststore_password_type_hint, 'org.apache.felix.https.clientcertificate' => org_apache_felix_https_clientcertificate, 'org.apache.felix.https.clientcertificate@TypeHint' => org_apache_felix_https_clientcertificate_type_hint, 'org.apache.felix.https.enable' => org_apache_felix_https_enable, 'org.apache.felix.https.enable@TypeHint' => org_apache_felix_https_enable_type_hint, 'org.osgi.service.http.port.secure' => org_osgi_service_http_port_secure, 'org.osgi.service.http.port.secure@TypeHint' => org_osgi_service_http_port_secure_type_hint }
        )
      end

      def system_config_org/apache/http/proxyconfigurator/config(proxy_host: nil, proxy_host_type_hint: nil, proxy_port: nil, proxy_port_type_hint: nil, proxy_exceptions: nil, proxy_exceptions_type_hint: nil, proxy_enabled: nil, proxy_enabled_type_hint: nil, proxy_user: nil, proxy_user_type_hint: nil, proxy_password: nil, proxy_password_type_hint: nil)
        @connection.call(
          :POST,
          '/apps/system/config/org.apache.http.proxyconfigurator.config',
          type: nil,
          auth: ['aemAuth'],
          query: { 'proxy.host' => proxy_host, 'proxy.host@TypeHint' => proxy_host_type_hint, 'proxy.port' => proxy_port, 'proxy.port@TypeHint' => proxy_port_type_hint, 'proxy.exceptions' => proxy_exceptions, 'proxy.exceptions@TypeHint' => proxy_exceptions_type_hint, 'proxy.enabled' => proxy_enabled, 'proxy.enabled@TypeHint' => proxy_enabled_type_hint, 'proxy.user' => proxy_user, 'proxy.user@TypeHint' => proxy_user_type_hint, 'proxy.password' => proxy_password, 'proxy.password@TypeHint' => proxy_password_type_hint }
        )
      end

      def system_config_org/apache/sling/jcr/davex/impl/servlets/sling_dav_ex_servlet(alias_: nil, alias_type_hint: nil, dav_create_absolute_uri: nil, dav_create_absolute_uri_type_hint: nil)
        @connection.call(
          :POST,
          '/apps/system/config/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet',
          type: nil,
          auth: ['aemAuth'],
          query: { 'alias' => alias_, 'alias@TypeHint' => alias_type_hint, 'dav.create-absolute-uri' => dav_create_absolute_uri, 'dav.create-absolute-uri@TypeHint' => dav_create_absolute_uri_type_hint }
        )
      end

      def system_config_org/apache/sling/security/impl/referrer_filter(allow_empty: nil, allow_empty_type_hint: nil, allow_hosts: nil, allow_hosts_type_hint: nil, allow_hosts_regexp: nil, allow_hosts_regexp_type_hint: nil, filter_methods: nil, filter_methods_type_hint: nil)
        @connection.call(
          :POST,
          '/apps/system/config/org.apache.sling.security.impl.ReferrerFilter',
          type: nil,
          auth: ['aemAuth'],
          query: { 'allow.empty' => allow_empty, 'allow.empty@TypeHint' => allow_empty_type_hint, 'allow.hosts' => allow_hosts, 'allow.hosts@TypeHint' => allow_hosts_type_hint, 'allow.hosts.regexp' => allow_hosts_regexp, 'allow.hosts.regexp@TypeHint' => allow_hosts_regexp_type_hint, 'filter.methods' => filter_methods, 'filter.methods@TypeHint' => filter_methods_type_hint }
        )
      end

      def system_config_org/apache/sling/servlets/get/default_get_servlet(json_maximumresults: nil, json_maximumresults_type_hint: nil, enable_html: nil, enable_html_type_hint: nil, enable_txt: nil, enable_txt_type_hint: nil, enable_xml: nil, enable_xml_type_hint: nil)
        @connection.call(
          :POST,
          '/apps/system/config/org.apache.sling.servlets.get.DefaultGetServlet',
          type: nil,
          auth: ['aemAuth'],
          query: { 'json.maximumresults' => json_maximumresults, 'json.maximumresults@TypeHint' => json_maximumresults_type_hint, 'enable.html' => enable_html, 'enable.html@TypeHint' => enable_html_type_hint, 'enable.txt' => enable_txt, 'enable.txt@TypeHint' => enable_txt_type_hint, 'enable.xml' => enable_xml, 'enable.xml@TypeHint' => enable_xml_type_hint }
        )
      end
    end
  end
end
