# frozen_string_literal: true

module OpenapiClient
  module Api
    class {AuthorizableId}KsJson
      def initialize(connection)
        @connection = connection
      end

      def list(intermediate_path:, authorizable_id:)
        raise ArgumentError, 'intermediate_path is required' if intermediate_path.nil?
        raise ArgumentError, 'authorizable_id is required' if authorizable_id.nil?

        @connection.call(
          :GET,
          '/{intermediatePath}/{authorizableId}.ks.json'
            .gsub('{intermediatePath}', ERB::Util.url_encode(intermediate_path.to_s))
            .gsub('{authorizableId}', ERB::Util.url_encode(authorizable_id.to_s)),
          type: OpenapiClient::Models::KeystoreInfo,
          auth: ['aemAuth']
        )
      end
    end
  end
end
