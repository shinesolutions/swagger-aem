<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for postAgent
 */
class PostAgentParameterData
{
    /**
     * @DTA\Data(subset="query", field="jcr:content/triggerOnOffTime", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $jcr_content_trigger_on_off_time = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/retryDelay", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_retry_delay = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/proxyPassword", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_proxy_password = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/jcr:lastModified", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_jcr_last_modified = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/serializationType", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_serialization_type = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/reverseReplication", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $jcr_content_reverse_replication = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/triggerModified", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $jcr_content_trigger_modified = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/cq:distribute@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_cq_distribute_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/proxyNTLMHost", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_proxy_ntlm_host = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/protocolHTTPMethod", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_protocol_http_method = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/sling:resourceType", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_sling_resource_type = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/protocolSocketTimeout", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"float"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"float"})
     */
    public ?float $jcr_content_protocol_socket_timeout = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/queueBatchWaitTime", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"float"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"float"})
     */
    public ?float $jcr_content_queue_batch_wait_time = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/enabled", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $jcr_content_enabled = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/protocolHTTPConnectionClosed", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $jcr_content_protocol_http_connection_closed = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/ssl", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_ssl = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/triggerSpecific", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $jcr_content_trigger_specific = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/protocolHTTPExpired", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_protocol_http_expired = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/jcr:lastModifiedBy", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_jcr_last_modified_by = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/transportNTLMHost", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_transport_ntlm_host = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/jcr:title", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_jcr_title = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/triggerReceive", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $jcr_content_trigger_receive = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/proxyNTLMDomain", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_proxy_ntlm_domain = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/protocolHTTPHeaders@TypeHint", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_protocol_http_headers_type_hint = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/proxyUser", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_proxy_user = null;

    /**
     * @DTA\Data(subset="path", field="name")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/protocolVersion", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_protocol_version = null;

    /**
     * @DTA\Data(subset="query", field="jcr:primaryType", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_primary_type = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/transportUri", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_transport_uri = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/cq:name", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_cq_name = null;

    /**
     * @DTA\Data(subset="path", field="runmode")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $runmode = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/queueBatchMode", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_queue_batch_mode = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/jcr:mixinTypes", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_jcr_mixin_types = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/proxyPort", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"float"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"float"})
     */
    public ?float $jcr_content_proxy_port = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/protocolConnectTimeout", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"float"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"float"})
     */
    public ?float $jcr_content_protocol_connect_timeout = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/transportNTLMDomain", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_transport_ntlm_domain = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/logLevel", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_log_level = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/protocolInterface", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_protocol_interface = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/protocolHTTPSRelaxed", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $jcr_content_protocol_https_relaxed = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/transportUser", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_transport_user = null;

    /**
     * @DTA\Data(subset="query", field=":operation", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $_operation = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/cq:distribute", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $jcr_content_cq_distribute = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/jcr:description", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_jcr_description = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/noVersioning", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $jcr_content_no_versioning = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/noStatusUpdate", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $jcr_content_no_status_update = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/proxyHost", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_proxy_host = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/transportPassword", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_transport_password = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/protocolHTTPHeaders", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $jcr_content_protocol_http_headers = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/aliasUpdate", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $jcr_content_alias_update = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/queueBatchMaxSize", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"float"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"float"})
     */
    public ?float $jcr_content_queue_batch_max_size = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/cq:template", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_cq_template = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/userId", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $jcr_content_user_id = null;

    /**
     * @DTA\Data(subset="query", field="jcr:content/triggerDistribute", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $jcr_content_trigger_distribute = null;

}
