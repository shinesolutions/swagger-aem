# frozen_string_literal: true

module OpenapiClient
  module Api
    class {AuthorizableId}KsHtml
      def initialize(connection)
        @connection = connection
      end

      def create(intermediate_path:, authorizable_id:, _operation: nil, current_password: nil, new_password: nil, re_password: nil, key_password: nil, key_store_pass: nil, alias_: nil, new_alias: nil, remove_alias: nil, cert_chain: nil, pk: nil, key_store: nil)
        raise ArgumentError, 'intermediate_path is required' if intermediate_path.nil?
        raise ArgumentError, 'authorizable_id is required' if authorizable_id.nil?

        @connection.call(
          :POST,
          '/{intermediatePath}/{authorizableId}.ks.html'
            .gsub('{intermediatePath}', ERB::Util.url_encode(intermediate_path.to_s))
            .gsub('{authorizableId}', ERB::Util.url_encode(authorizable_id.to_s)),
          type: OpenapiClient::Models::KeystoreInfo,
          auth: ['aemAuth'],
          query: { ':operation' => _operation, 'currentPassword' => current_password, 'newPassword' => new_password, 'rePassword' => re_password, 'keyPassword' => key_password, 'keyStorePass' => key_store_pass, 'alias' => alias_, 'newAlias' => new_alias, 'removeAlias' => remove_alias },
          form: { 'cert-chain' => cert_chain, 'pk' => pk, 'keyStore' => key_store }
        )
      end
    end
  end
end
