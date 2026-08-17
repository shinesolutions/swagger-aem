# frozen_string_literal: true

module OpenapiClient
  module Api
    class Bin
      def initialize(connection)
        @connection = connection
      end

      def querybuilder/json(path:, p_limit:, 1_property_:, 1_property_value_:)
        raise ArgumentError, 'path is required' if path.nil?
        raise ArgumentError, 'p_limit is required' if p_limit.nil?
        raise ArgumentError, '1_property_ is required' if 1_property_.nil?
        raise ArgumentError, '1_property_value_ is required' if 1_property_value_.nil?

        @connection.call(
          :GET,
          '/bin/querybuilder.json',
          type: nil,
          auth: ['aemAuth'],
          query: { 'path' => path, 'p.limit' => p_limit, '1_property' => 1_property_, '1_property.value' => 1_property_value_ }
        )
      end

      def querybuilder/json_post(path:, p_limit:, 1_property_:, 1_property_value_:)
        raise ArgumentError, 'path is required' if path.nil?
        raise ArgumentError, 'p_limit is required' if p_limit.nil?
        raise ArgumentError, '1_property_ is required' if 1_property_.nil?
        raise ArgumentError, '1_property_value_ is required' if 1_property_value_.nil?

        @connection.call(
          :POST,
          '/bin/querybuilder.json',
          type: nil,
          auth: ['aemAuth'],
          query: { 'path' => path, 'p.limit' => p_limit, '1_property' => 1_property_, '1_property.value' => 1_property_value_ }
        )
      end
    end
  end
end
