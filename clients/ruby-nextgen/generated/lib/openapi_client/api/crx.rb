# frozen_string_literal: true

module OpenapiClient
  module Api
    class Crx
      def initialize(connection)
        @connection = connection
      end

      def explorer_ui_setpassword/jsp(old:, plain:, verify:)
        raise ArgumentError, 'old is required' if old.nil?
        raise ArgumentError, 'plain is required' if plain.nil?
        raise ArgumentError, 'verify is required' if verify.nil?

        @connection.call(
          :POST,
          '/crx/explorer/ui/setpassword.jsp',
          type: nil,
          auth: ['aemAuth'],
          query: { 'old' => old, 'plain' => plain, 'verify' => verify }
        )
      end

      def packmgr_installstatus/jsp
        @connection.call(
          :GET,
          '/crx/packmgr/installstatus.jsp',
          type: OpenapiClient::Models::InstallStatus,
          auth: ['aemAuth']
        )
      end

      def packmgr_service/jsp(cmd:)
        raise ArgumentError, 'cmd is required' if cmd.nil?

        @connection.call(
          :POST,
          '/crx/packmgr/service.jsp',
          type: nil,
          auth: ['aemAuth'],
          query: { 'cmd' => cmd }
        )
      end

      def packmgr_service_/json(path:, cmd:, group_name: nil, package_name: nil, package_version: nil, _charset_: nil, force: nil, recursive: nil, package: nil)
        raise ArgumentError, 'path is required' if path.nil?
        raise ArgumentError, 'cmd is required' if cmd.nil?

        @connection.call(
          :POST,
          '/crx/packmgr/service/.json/{path}'
            .gsub('{path}', ERB::Util.url_encode(path.to_s)),
          type: nil,
          auth: ['aemAuth'],
          query: { 'cmd' => cmd, 'groupName' => group_name, 'packageName' => package_name, 'packageVersion' => package_version, '_charset_' => _charset_, 'force' => force, 'recursive' => recursive },
          form: { 'package' => package }
        )
      end

      def packmgr_service_script/html
        @connection.call(
          :GET,
          '/crx/packmgr/service/script.html',
          type: nil,
          auth: ['aemAuth']
        )
      end

      def packmgr_update/jsp(group_name:, package_name:, version:, path:, filter: nil, _charset_: nil)
        raise ArgumentError, 'group_name is required' if group_name.nil?
        raise ArgumentError, 'package_name is required' if package_name.nil?
        raise ArgumentError, 'version is required' if version.nil?
        raise ArgumentError, 'path is required' if path.nil?

        @connection.call(
          :POST,
          '/crx/packmgr/update.jsp',
          type: nil,
          auth: ['aemAuth'],
          query: { 'groupName' => group_name, 'packageName' => package_name, 'version' => version, 'path' => path, 'filter' => filter, '_charset_' => _charset_ }
        )
      end

      def server_crx/default_jcr:root_/1/json
        @connection.call(
          :GET,
          '/crx/server/crx.default/jcr:root/.1.json',
          type: nil,
          auth: ['aemAuth']
        )
      end
    end
  end
end
