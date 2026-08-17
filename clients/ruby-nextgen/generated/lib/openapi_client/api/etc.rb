# frozen_string_literal: true

module OpenapiClient
  module Api
    class Etc
      def initialize(connection)
        @connection = connection
      end

      def replication_agents/{runmode}(runmode:, name:)
        raise ArgumentError, 'runmode is required' if runmode.nil?
        raise ArgumentError, 'name is required' if name.nil?

        @connection.call(
          :GET,
          '/etc/replication/agents.{runmode}/{name}'
            .gsub('{runmode}', ERB::Util.url_encode(runmode.to_s))
            .gsub('{name}', ERB::Util.url_encode(name.to_s)),
          type: nil,
          auth: ['aemAuth']
        )
      end

      def replication_agents/{runmode}/_1/json(runmode:)
        raise ArgumentError, 'runmode is required' if runmode.nil?

        @connection.call(
          :GET,
          '/etc/replication/agents.{runmode}.-1.json'
            .gsub('{runmode}', ERB::Util.url_encode(runmode.to_s)),
          type: nil,
          auth: ['aemAuth']
        )
      end

      def replication_agents/{runmode}_delete(runmode:, name:)
        raise ArgumentError, 'runmode is required' if runmode.nil?
        raise ArgumentError, 'name is required' if name.nil?

        @connection.call(
          :DELETE,
          '/etc/replication/agents.{runmode}/{name}'
            .gsub('{runmode}', ERB::Util.url_encode(runmode.to_s))
            .gsub('{name}', ERB::Util.url_encode(name.to_s)),
          type: nil,
          auth: ['aemAuth']
        )
      end

      def replication_agents/{runmode}_post(runmode:, name:, jcr_content_cq_distribute: nil, jcr_content_cq_distribute_type_hint: nil, jcr_content_cq_name: nil, jcr_content_cq_template: nil, jcr_content_alias_update: nil, jcr_content_enabled: nil, jcr_content_jcr_description: nil, jcr_content_jcr_last_modified: nil, jcr_content_jcr_last_modified_by: nil, jcr_content_jcr_mixin_types: nil, jcr_content_jcr_title: nil, jcr_content_log_level: nil, jcr_content_no_status_update: nil, jcr_content_no_versioning: nil, jcr_content_protocol_connect_timeout: nil, jcr_content_protocol_http_connection_closed: nil, jcr_content_protocol_http_expired: nil, jcr_content_protocol_http_headers: nil, jcr_content_protocol_http_headers_type_hint: nil, jcr_content_protocol_http_method: nil, jcr_content_protocol_https_relaxed: nil, jcr_content_protocol_interface: nil, jcr_content_protocol_socket_timeout: nil, jcr_content_protocol_version: nil, jcr_content_proxy_ntlm_domain: nil, jcr_content_proxy_ntlm_host: nil, jcr_content_proxy_host: nil, jcr_content_proxy_password: nil, jcr_content_proxy_port: nil, jcr_content_proxy_user: nil, jcr_content_queue_batch_max_size: nil, jcr_content_queue_batch_mode: nil, jcr_content_queue_batch_wait_time: nil, jcr_content_retry_delay: nil, jcr_content_reverse_replication: nil, jcr_content_serialization_type: nil, jcr_content_sling_resource_type: nil, jcr_content_ssl: nil, jcr_content_transport_ntlm_domain: nil, jcr_content_transport_ntlm_host: nil, jcr_content_transport_password: nil, jcr_content_transport_uri: nil, jcr_content_transport_user: nil, jcr_content_trigger_distribute: nil, jcr_content_trigger_modified: nil, jcr_content_trigger_on_off_time: nil, jcr_content_trigger_receive: nil, jcr_content_trigger_specific: nil, jcr_content_user_id: nil, jcr_primary_type: nil, _operation: nil)
        raise ArgumentError, 'runmode is required' if runmode.nil?
        raise ArgumentError, 'name is required' if name.nil?

        @connection.call(
          :POST,
          '/etc/replication/agents.{runmode}/{name}'
            .gsub('{runmode}', ERB::Util.url_encode(runmode.to_s))
            .gsub('{name}', ERB::Util.url_encode(name.to_s)),
          type: nil,
          auth: ['aemAuth'],
          query: { 'jcr:content/cq:distribute' => jcr_content_cq_distribute, 'jcr:content/cq:distribute@TypeHint' => jcr_content_cq_distribute_type_hint, 'jcr:content/cq:name' => jcr_content_cq_name, 'jcr:content/cq:template' => jcr_content_cq_template, 'jcr:content/aliasUpdate' => jcr_content_alias_update, 'jcr:content/enabled' => jcr_content_enabled, 'jcr:content/jcr:description' => jcr_content_jcr_description, 'jcr:content/jcr:lastModified' => jcr_content_jcr_last_modified, 'jcr:content/jcr:lastModifiedBy' => jcr_content_jcr_last_modified_by, 'jcr:content/jcr:mixinTypes' => jcr_content_jcr_mixin_types, 'jcr:content/jcr:title' => jcr_content_jcr_title, 'jcr:content/logLevel' => jcr_content_log_level, 'jcr:content/noStatusUpdate' => jcr_content_no_status_update, 'jcr:content/noVersioning' => jcr_content_no_versioning, 'jcr:content/protocolConnectTimeout' => jcr_content_protocol_connect_timeout, 'jcr:content/protocolHTTPConnectionClosed' => jcr_content_protocol_http_connection_closed, 'jcr:content/protocolHTTPExpired' => jcr_content_protocol_http_expired, 'jcr:content/protocolHTTPHeaders' => jcr_content_protocol_http_headers, 'jcr:content/protocolHTTPHeaders@TypeHint' => jcr_content_protocol_http_headers_type_hint, 'jcr:content/protocolHTTPMethod' => jcr_content_protocol_http_method, 'jcr:content/protocolHTTPSRelaxed' => jcr_content_protocol_https_relaxed, 'jcr:content/protocolInterface' => jcr_content_protocol_interface, 'jcr:content/protocolSocketTimeout' => jcr_content_protocol_socket_timeout, 'jcr:content/protocolVersion' => jcr_content_protocol_version, 'jcr:content/proxyNTLMDomain' => jcr_content_proxy_ntlm_domain, 'jcr:content/proxyNTLMHost' => jcr_content_proxy_ntlm_host, 'jcr:content/proxyHost' => jcr_content_proxy_host, 'jcr:content/proxyPassword' => jcr_content_proxy_password, 'jcr:content/proxyPort' => jcr_content_proxy_port, 'jcr:content/proxyUser' => jcr_content_proxy_user, 'jcr:content/queueBatchMaxSize' => jcr_content_queue_batch_max_size, 'jcr:content/queueBatchMode' => jcr_content_queue_batch_mode, 'jcr:content/queueBatchWaitTime' => jcr_content_queue_batch_wait_time, 'jcr:content/retryDelay' => jcr_content_retry_delay, 'jcr:content/reverseReplication' => jcr_content_reverse_replication, 'jcr:content/serializationType' => jcr_content_serialization_type, 'jcr:content/sling:resourceType' => jcr_content_sling_resource_type, 'jcr:content/ssl' => jcr_content_ssl, 'jcr:content/transportNTLMDomain' => jcr_content_transport_ntlm_domain, 'jcr:content/transportNTLMHost' => jcr_content_transport_ntlm_host, 'jcr:content/transportPassword' => jcr_content_transport_password, 'jcr:content/transportUri' => jcr_content_transport_uri, 'jcr:content/transportUser' => jcr_content_transport_user, 'jcr:content/triggerDistribute' => jcr_content_trigger_distribute, 'jcr:content/triggerModified' => jcr_content_trigger_modified, 'jcr:content/triggerOnOffTime' => jcr_content_trigger_on_off_time, 'jcr:content/triggerReceive' => jcr_content_trigger_receive, 'jcr:content/triggerSpecific' => jcr_content_trigger_specific, 'jcr:content/userId' => jcr_content_user_id, 'jcr:primaryType' => jcr_primary_type, ':operation' => _operation }
        )
      end

      def truststore(truststore_p12: nil)
        @connection.call(
          :POST,
          '/etc/truststore',
          type: nil,
          auth: ['aemAuth'],
          form: { 'truststore.p12' => truststore_p12 }
        )
      end

      def truststore_truststore/p12
        @connection.call(
          :GET,
          '/etc/truststore/truststore.p12',
          type: nil,
          auth: ['aemAuth']
        )
      end
    end
  end
end
