# frozen_string_literal: true

module OpenapiClient
  module Api
    class {Name}RwHtml
      def initialize(connection)
        @connection = connection
      end

      def create(path:, name:, add_members: nil)
        raise ArgumentError, 'path is required' if path.nil?
        raise ArgumentError, 'name is required' if name.nil?

        @connection.call(
          :POST,
          '/{path}/{name}.rw.html'
            .gsub('{path}', ERB::Util.url_encode(path.to_s))
            .gsub('{name}', ERB::Util.url_encode(name.to_s)),
          type: nil,
          auth: ['aemAuth'],
          query: { 'addMembers' => add_members }
        )
      end
    end
  end
end
