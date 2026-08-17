# frozen_string_literal: true

module OpenapiClient
  module Api
    class CqactionsHtml
      def initialize(connection)
        @connection = connection
      end

      def create(authorizable_id:, changelog:)
        raise ArgumentError, 'authorizable_id is required' if authorizable_id.nil?
        raise ArgumentError, 'changelog is required' if changelog.nil?

        @connection.call(
          :POST,
          '/.cqactions.html',
          type: nil,
          auth: ['aemAuth'],
          query: { 'authorizableId' => authorizable_id, 'changelog' => changelog }
        )
      end
    end
  end
end
