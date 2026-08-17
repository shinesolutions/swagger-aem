require "json"

module OpenAPIClient
  module Api
  class Etc
    def initialize(@conn : Connection); end

    # 
    def replication_agents_runmode(runmode : String, name : String) : Response(Nil)
      @conn.request(Nil,
        method: :GET,
        path: "/etc/replication/agents.{runmode}/{name}".sub("{runmode}", OpenAPIClient.enc(runmode)).sub("{name}", OpenAPIClient.enc(name)),
        accept: %w[],
        auth: %w[aemAuth])
    end

    # 
    def replication_agents_runmode__1_json(runmode : String) : Response(String)
      @conn.request(String,
        method: :GET,
        path: "/etc/replication/agents.{runmode}.-1.json".sub("{runmode}", OpenAPIClient.enc(runmode)),
        accept: %w[application/json],
        auth: %w[aemAuth])
    end

    # 
    def replication_agents_runmode_delete(runmode : String, name : String) : Response(Nil)
      @conn.request(Nil,
        method: :DELETE,
        path: "/etc/replication/agents.{runmode}/{name}".sub("{runmode}", OpenAPIClient.enc(runmode)).sub("{name}", OpenAPIClient.enc(name)),
        accept: %w[],
        auth: %w[aemAuth])
    end

    # 
    def replication_agents_runmode_post(runmode : String, name : String, *, jcr_content_cq_distribute : Bool? = nil, jcr_content_cq_distribute_type_hint : String? = nil, jcr_content_cq_name : String? = nil, jcr_content_cq_template : String? = nil, jcr_content_alias_update : Bool? = nil, jcr_content_enabled : Bool? = nil, jcr_content_jcr_description : String? = nil, jcr_content_jcr_last_modified : String? = nil, jcr_content_jcr_last_modified_by : String? = nil, jcr_content_jcr_mixin_types : String? = nil, jcr_content_jcr_title : String? = nil, jcr_content_log_level : String? = nil, jcr_content_no_status_update : Bool? = nil, jcr_content_no_versioning : Bool? = nil, jcr_content_protocol_connect_timeout : Float64? = nil, jcr_content_protocol_http_connection_closed : Bool? = nil, jcr_content_protocol_http_expired : String? = nil, jcr_content_protocol_http_headers : Array(String)? = nil, jcr_content_protocol_http_headers_type_hint : String? = nil, jcr_content_protocol_http_method : String? = nil, jcr_content_protocol_https_relaxed : Bool? = nil, jcr_content_protocol_interface : String? = nil, jcr_content_protocol_socket_timeout : Float64? = nil, jcr_content_protocol_version : String? = nil, jcr_content_proxy_ntlm_domain : String? = nil, jcr_content_proxy_ntlm_host : String? = nil, jcr_content_proxy_host : String? = nil, jcr_content_proxy_password : String? = nil, jcr_content_proxy_port : Float64? = nil, jcr_content_proxy_user : String? = nil, jcr_content_queue_batch_max_size : Float64? = nil, jcr_content_queue_batch_mode : String? = nil, jcr_content_queue_batch_wait_time : Float64? = nil, jcr_content_retry_delay : String? = nil, jcr_content_reverse_replication : Bool? = nil, jcr_content_serialization_type : String? = nil, jcr_content_sling_resource_type : String? = nil, jcr_content_ssl : String? = nil, jcr_content_transport_ntlm_domain : String? = nil, jcr_content_transport_ntlm_host : String? = nil, jcr_content_transport_password : String? = nil, jcr_content_transport_uri : String? = nil, jcr_content_transport_user : String? = nil, jcr_content_trigger_distribute : Bool? = nil, jcr_content_trigger_modified : Bool? = nil, jcr_content_trigger_on_off_time : Bool? = nil, jcr_content_trigger_receive : Bool? = nil, jcr_content_trigger_specific : Bool? = nil, jcr_content_user_id : String? = nil, jcr_primary_type : String? = nil, _operation : String? = nil) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/etc/replication/agents.{runmode}/{name}".sub("{runmode}", OpenAPIClient.enc(runmode)).sub("{name}", OpenAPIClient.enc(name)),
        query: { "jcr:content/cq:distribute" => jcr_content_cq_distribute, "jcr:content/cq:distribute@TypeHint" => jcr_content_cq_distribute_type_hint, "jcr:content/cq:name" => jcr_content_cq_name, "jcr:content/cq:template" => jcr_content_cq_template, "jcr:content/aliasUpdate" => jcr_content_alias_update, "jcr:content/enabled" => jcr_content_enabled, "jcr:content/jcr:description" => jcr_content_jcr_description, "jcr:content/jcr:lastModified" => jcr_content_jcr_last_modified, "jcr:content/jcr:lastModifiedBy" => jcr_content_jcr_last_modified_by, "jcr:content/jcr:mixinTypes" => jcr_content_jcr_mixin_types, "jcr:content/jcr:title" => jcr_content_jcr_title, "jcr:content/logLevel" => jcr_content_log_level, "jcr:content/noStatusUpdate" => jcr_content_no_status_update, "jcr:content/noVersioning" => jcr_content_no_versioning, "jcr:content/protocolConnectTimeout" => jcr_content_protocol_connect_timeout, "jcr:content/protocolHTTPConnectionClosed" => jcr_content_protocol_http_connection_closed, "jcr:content/protocolHTTPExpired" => jcr_content_protocol_http_expired, "jcr:content/protocolHTTPHeaders" => jcr_content_protocol_http_headers, "jcr:content/protocolHTTPHeaders@TypeHint" => jcr_content_protocol_http_headers_type_hint, "jcr:content/protocolHTTPMethod" => jcr_content_protocol_http_method, "jcr:content/protocolHTTPSRelaxed" => jcr_content_protocol_https_relaxed, "jcr:content/protocolInterface" => jcr_content_protocol_interface, "jcr:content/protocolSocketTimeout" => jcr_content_protocol_socket_timeout, "jcr:content/protocolVersion" => jcr_content_protocol_version, "jcr:content/proxyNTLMDomain" => jcr_content_proxy_ntlm_domain, "jcr:content/proxyNTLMHost" => jcr_content_proxy_ntlm_host, "jcr:content/proxyHost" => jcr_content_proxy_host, "jcr:content/proxyPassword" => jcr_content_proxy_password, "jcr:content/proxyPort" => jcr_content_proxy_port, "jcr:content/proxyUser" => jcr_content_proxy_user, "jcr:content/queueBatchMaxSize" => jcr_content_queue_batch_max_size, "jcr:content/queueBatchMode" => jcr_content_queue_batch_mode, "jcr:content/queueBatchWaitTime" => jcr_content_queue_batch_wait_time, "jcr:content/retryDelay" => jcr_content_retry_delay, "jcr:content/reverseReplication" => jcr_content_reverse_replication, "jcr:content/serializationType" => jcr_content_serialization_type, "jcr:content/sling:resourceType" => jcr_content_sling_resource_type, "jcr:content/ssl" => jcr_content_ssl, "jcr:content/transportNTLMDomain" => jcr_content_transport_ntlm_domain, "jcr:content/transportNTLMHost" => jcr_content_transport_ntlm_host, "jcr:content/transportPassword" => jcr_content_transport_password, "jcr:content/transportUri" => jcr_content_transport_uri, "jcr:content/transportUser" => jcr_content_transport_user, "jcr:content/triggerDistribute" => jcr_content_trigger_distribute, "jcr:content/triggerModified" => jcr_content_trigger_modified, "jcr:content/triggerOnOffTime" => jcr_content_trigger_on_off_time, "jcr:content/triggerReceive" => jcr_content_trigger_receive, "jcr:content/triggerSpecific" => jcr_content_trigger_specific, "jcr:content/userId" => jcr_content_user_id, "jcr:primaryType" => jcr_primary_type, ":operation" => _operation },
        accept: %w[],
        auth: %w[aemAuth])
    end

    # 
    def truststore(truststore_p12 : ::File? = nil) : Response(String)
      @conn.request(String,
        method: :POST,
        path: "/etc/truststore",
        form: Hash(String, Crest::ParamsValue){ "truststore.p12" => truststore_p12 },
        accept: %w[text/plain],
        raw: true,
        auth: %w[aemAuth])
    end

    # 
    def truststore_truststore_p12() : Response(::File)
      @conn.request(::File,
        method: :GET,
        path: "/etc/truststore/truststore.p12",
        accept: %w[application/octet-stream],
        raw: true,
        auth: %w[aemAuth])
    end
  end
  end

end
