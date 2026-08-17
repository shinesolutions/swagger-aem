# frozen_string_literal: true

module OpenapiClient
  module Api
    class System
      def initialize(connection)
        @connection = connection
      end

      def console_bundles(name:, action:)
        raise ArgumentError, 'name is required' if name.nil?
        raise ArgumentError, 'action is required' if action.nil?

        @connection.call(
          :POST,
          '/system/console/bundles/{name}'
            .gsub('{name}', ERB::Util.url_encode(name.to_s)),
          type: nil,
          auth: ['aemAuth'],
          query: { 'action' => action }
        )
      end

      def console_bundles_{name}/json(name:)
        raise ArgumentError, 'name is required' if name.nil?

        @connection.call(
          :GET,
          '/system/console/bundles/{name}.json'
            .gsub('{name}', ERB::Util.url_encode(name.to_s)),
          type: OpenapiClient::Models::BundleInfo,
          auth: ['aemAuth']
        )
      end

      def console_config_mgr
        @connection.call(
          :GET,
          '/system/console/configMgr',
          type: nil,
          auth: ['aemAuth']
        )
      end

      def console_config_mgr_com/adobe/granite/auth/saml/saml_authentication_handler(post: nil, apply: nil, delete: nil, action: nil, location: nil, path: nil, service_ranking: nil, idp_url: nil, idp_cert_alias: nil, idp_http_redirect: nil, service_provider_entity_id: nil, assertion_consumer_service_url: nil, sp_private_key_alias: nil, key_store_password: nil, default_redirect_url: nil, user_id_attribute: nil, use_encryption: nil, create_user: nil, add_group_memberships: nil, group_membership_attribute: nil, default_groups: nil, name_id_format: nil, synchronize_attributes: nil, handle_logout: nil, logout_url: nil, clock_tolerance: nil, digest_method: nil, signature_method: nil, user_intermediate_path: nil, propertylist: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler',
          type: OpenapiClient::Models::SamlConfigurationInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'path' => path, 'service.ranking' => service_ranking, 'idpUrl' => idp_url, 'idpCertAlias' => idp_cert_alias, 'idpHttpRedirect' => idp_http_redirect, 'serviceProviderEntityId' => service_provider_entity_id, 'assertionConsumerServiceURL' => assertion_consumer_service_url, 'spPrivateKeyAlias' => sp_private_key_alias, 'keyStorePassword' => key_store_password, 'defaultRedirectUrl' => default_redirect_url, 'userIDAttribute' => user_id_attribute, 'useEncryption' => use_encryption, 'createUser' => create_user, 'addGroupMemberships' => add_group_memberships, 'groupMembershipAttribute' => group_membership_attribute, 'defaultGroups' => default_groups, 'nameIdFormat' => name_id_format, 'synchronizeAttributes' => synchronize_attributes, 'handleLogout' => handle_logout, 'logoutUrl' => logout_url, 'clockTolerance' => clock_tolerance, 'digestMethod' => digest_method, 'signatureMethod' => signature_method, 'userIntermediatePath' => user_intermediate_path, 'propertylist' => propertylist }
        )
      end

      def console_jmx_com/adobe/granite:type&#x3D;repository_op(action:)
        raise ArgumentError, 'action is required' if action.nil?

        @connection.call(
          :POST,
          '/system/console/jmx/com.adobe.granite:type=Repository/op/{action}'
            .gsub('{action}', ERB::Util.url_encode(action.to_s)),
          type: nil,
          auth: ['aemAuth']
        )
      end

      def console_status_productinfo/json
        @connection.call(
          :GET,
          '/system/console/status-productinfo.json',
          type: nil,
          auth: ['aemAuth']
        )
      end

      def health(tags: nil, combine_tags_or: nil)
        @connection.call(
          :GET,
          '/system/health',
          type: nil,
          auth: ['aemAuth'],
          query: { 'tags' => tags, 'combineTagsOr' => combine_tags_or }
        )
      end
    end
  end
end
