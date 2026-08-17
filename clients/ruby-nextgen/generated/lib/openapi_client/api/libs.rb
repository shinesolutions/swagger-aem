# frozen_string_literal: true

module OpenapiClient
  module Api
    class Libs
      def initialize(connection)
        @connection = connection
      end

      def granite_core_content_login/html
        @connection.call(
          :GET,
          '/libs/granite/core/content/login.html',
          type: nil,
          auth: []
        )
      end

      def granite_security_post_authorizables(authorizable_id:, intermediate_path:, create_user: nil, create_group: nil, rep_password: nil, profile_given_name: nil)
        raise ArgumentError, 'authorizable_id is required' if authorizable_id.nil?
        raise ArgumentError, 'intermediate_path is required' if intermediate_path.nil?

        @connection.call(
          :POST,
          '/libs/granite/security/post/authorizables',
          type: nil,
          auth: ['aemAuth'],
          query: { 'authorizableId' => authorizable_id, 'intermediatePath' => intermediate_path, 'createUser' => create_user, 'createGroup' => create_group, 'rep:password' => rep_password, 'profile/givenName' => profile_given_name }
        )
      end

      def granite_security_post_ssl_setup/html(keystore_password:, keystore_password_confirm:, truststore_password:, truststore_password_confirm:, https_hostname:, https_port:, privatekey_file: nil, certificate_file: nil)
        raise ArgumentError, 'keystore_password is required' if keystore_password.nil?
        raise ArgumentError, 'keystore_password_confirm is required' if keystore_password_confirm.nil?
        raise ArgumentError, 'truststore_password is required' if truststore_password.nil?
        raise ArgumentError, 'truststore_password_confirm is required' if truststore_password_confirm.nil?
        raise ArgumentError, 'https_hostname is required' if https_hostname.nil?
        raise ArgumentError, 'https_port is required' if https_port.nil?

        @connection.call(
          :POST,
          '/libs/granite/security/post/sslSetup.html',
          type: nil,
          auth: ['aemAuth'],
          query: { 'keystorePassword' => keystore_password, 'keystorePasswordConfirm' => keystore_password_confirm, 'truststorePassword' => truststore_password, 'truststorePasswordConfirm' => truststore_password_confirm, 'httpsHostname' => https_hostname, 'httpsPort' => https_port },
          form: { 'privatekeyFile' => privatekey_file, 'certificateFile' => certificate_file }
        )
      end

      def granite_security_post_truststore(_operation: nil, new_password: nil, re_password: nil, key_store_type: nil, remove_alias: nil, certificate: nil)
        @connection.call(
          :POST,
          '/libs/granite/security/post/truststore',
          type: nil,
          auth: ['aemAuth'],
          query: { ':operation' => _operation, 'newPassword' => new_password, 'rePassword' => re_password, 'keyStoreType' => key_store_type, 'removeAlias' => remove_alias },
          form: { 'certificate' => certificate }
        )
      end

      def granite_security_truststore/json
        @connection.call(
          :GET,
          '/libs/granite/security/truststore.json',
          type: OpenapiClient::Models::TruststoreInfo,
          auth: ['aemAuth']
        )
      end

      def replication_treeactivation/html(ignoredeactivated:, onlymodified:, path:, cmd:)
        raise ArgumentError, 'ignoredeactivated is required' if ignoredeactivated.nil?
        raise ArgumentError, 'onlymodified is required' if onlymodified.nil?
        raise ArgumentError, 'path is required' if path.nil?
        raise ArgumentError, 'cmd is required' if cmd.nil?

        @connection.call(
          :POST,
          '/libs/replication/treeactivation.html',
          type: nil,
          auth: ['aemAuth'],
          query: { 'ignoredeactivated' => ignoredeactivated, 'onlymodified' => onlymodified, 'path' => path, 'cmd' => cmd }
        )
      end
    end
  end
end
