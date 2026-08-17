# frozen_string_literal: true

module OpenapiClient
  module Api
    class Etc::Packages
      def initialize(connection)
        @connection = connection
      end

      def {name}_{version}/zip(group:, name:, version:)
        raise ArgumentError, 'group is required' if group.nil?
        raise ArgumentError, 'name is required' if name.nil?
        raise ArgumentError, 'version is required' if version.nil?

        @connection.call(
          :GET,
          '/etc/packages/{group}/{name}-{version}.zip'
            .gsub('{group}', ERB::Util.url_encode(group.to_s))
            .gsub('{name}', ERB::Util.url_encode(name.to_s))
            .gsub('{version}', ERB::Util.url_encode(version.to_s)),
          type: nil,
          auth: ['aemAuth']
        )
      end

      def {name}_{version}/zip_jcr:content_vlt:definition_filter/tidy/2/json(group:, name:, version:)
        raise ArgumentError, 'group is required' if group.nil?
        raise ArgumentError, 'name is required' if name.nil?
        raise ArgumentError, 'version is required' if version.nil?

        @connection.call(
          :GET,
          '/etc/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json'
            .gsub('{group}', ERB::Util.url_encode(group.to_s))
            .gsub('{name}', ERB::Util.url_encode(name.to_s))
            .gsub('{version}', ERB::Util.url_encode(version.to_s)),
          type: nil,
          auth: ['aemAuth']
        )
      end
    end
  end
end
