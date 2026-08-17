# frozen_string_literal: true

module OpenapiClient
  module Api
    class Root
      def initialize(connection)
        @connection = connection
      end

      def create(path:, jcr_primary_type:, _name:)
        raise ArgumentError, 'path is required' if path.nil?
        raise ArgumentError, 'jcr_primary_type is required' if jcr_primary_type.nil?
        raise ArgumentError, '_name is required' if _name.nil?

        @connection.call(
          :POST,
          '/{path}/'
            .gsub('{path}', ERB::Util.url_encode(path.to_s)),
          type: nil,
          auth: ['aemAuth'],
          query: { 'jcr:primaryType' => jcr_primary_type, ':name' => _name }
        )
      end

      def create_post(path:, name:, _operation: nil, delete_authorizable: nil, file: nil)
        raise ArgumentError, 'path is required' if path.nil?
        raise ArgumentError, 'name is required' if name.nil?

        @connection.call(
          :POST,
          '/{path}/{name}'
            .gsub('{path}', ERB::Util.url_encode(path.to_s))
            .gsub('{name}', ERB::Util.url_encode(name.to_s)),
          type: nil,
          auth: ['aemAuth'],
          query: { ':operation' => _operation, 'deleteAuthorizable' => delete_authorizable },
          form: { 'file' => file }
        )
      end

      def delete(path:, name:)
        raise ArgumentError, 'path is required' if path.nil?
        raise ArgumentError, 'name is required' if name.nil?

        @connection.call(
          :DELETE,
          '/{path}/{name}'
            .gsub('{path}', ERB::Util.url_encode(path.to_s))
            .gsub('{name}', ERB::Util.url_encode(name.to_s)),
          type: nil,
          auth: ['aemAuth']
        )
      end

      def get(path:, name:)
        raise ArgumentError, 'path is required' if path.nil?
        raise ArgumentError, 'name is required' if name.nil?

        @connection.call(
          :GET,
          '/{path}/{name}'
            .gsub('{path}', ERB::Util.url_encode(path.to_s))
            .gsub('{name}', ERB::Util.url_encode(name.to_s)),
          type: nil,
          auth: ['aemAuth']
        )
      end
    end
  end
end
