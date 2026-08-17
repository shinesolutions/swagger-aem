# frozen_string_literal: true

module OpenapiClient
  module Api
    class Keystore
      def initialize(connection)
        @connection = connection
      end

      def store/p12(intermediate_path:, authorizable_id:)
        raise ArgumentError, 'intermediate_path is required' if intermediate_path.nil?
        raise ArgumentError, 'authorizable_id is required' if authorizable_id.nil?

        @connection.call(
          :GET,
          '/{intermediatePath}/{authorizableId}/keystore/store.p12'
            .gsub('{intermediatePath}', ERB::Util.url_encode(intermediate_path.to_s))
            .gsub('{authorizableId}', ERB::Util.url_encode(authorizable_id.to_s)),
          type: nil,
          auth: ['aemAuth']
        )
      end
    end
  end
end
