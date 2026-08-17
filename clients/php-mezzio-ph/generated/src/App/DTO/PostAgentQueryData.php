<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for postAgent
 */
class PostAgentQueryData
{
    /**
     * @DTA\Data(field="jcr:content/triggerOnOffTime", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $jcr_content_trigger_on_off_time;

    /**
     * @DTA\Data(field="jcr:content/retryDelay", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_retry_delay;

    /**
     * @DTA\Data(field="jcr:content/proxyPassword", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_proxy_password;

    /**
     * @DTA\Data(field="jcr:content/jcr:lastModified", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_jcr_last_modified;

    /**
     * @DTA\Data(field="jcr:content/serializationType", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_serialization_type;

    /**
     * @DTA\Data(field="jcr:content/reverseReplication", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $jcr_content_reverse_replication;

    /**
     * @DTA\Data(field="jcr:content/triggerModified", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $jcr_content_trigger_modified;

    /**
     * @DTA\Data(field="jcr:content/cq:distribute@TypeHint", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_cq_distribute_type_hint;

    /**
     * @DTA\Data(field="jcr:content/proxyNTLMHost", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_proxy_ntlm_host;

    /**
     * @DTA\Data(field="jcr:content/protocolHTTPMethod", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_protocol_http_method;

    /**
     * @DTA\Data(field="jcr:content/sling:resourceType", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_sling_resource_type;

    /**
     * @DTA\Data(field="jcr:content/protocolSocketTimeout", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"float"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"float"})
     * @var float|null
     */
    public $jcr_content_protocol_socket_timeout;

    /**
     * @DTA\Data(field="jcr:content/queueBatchWaitTime", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"float"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"float"})
     * @var float|null
     */
    public $jcr_content_queue_batch_wait_time;

    /**
     * @DTA\Data(field="jcr:content/enabled", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $jcr_content_enabled;

    /**
     * @DTA\Data(field="jcr:content/protocolHTTPConnectionClosed", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $jcr_content_protocol_http_connection_closed;

    /**
     * @DTA\Data(field="jcr:content/ssl", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_ssl;

    /**
     * @DTA\Data(field="jcr:content/triggerSpecific", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $jcr_content_trigger_specific;

    /**
     * @DTA\Data(field="jcr:content/protocolHTTPExpired", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_protocol_http_expired;

    /**
     * @DTA\Data(field="jcr:content/jcr:lastModifiedBy", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_jcr_last_modified_by;

    /**
     * @DTA\Data(field="jcr:content/transportNTLMHost", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_transport_ntlm_host;

    /**
     * @DTA\Data(field="jcr:content/jcr:title", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_jcr_title;

    /**
     * @DTA\Data(field="jcr:content/triggerReceive", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $jcr_content_trigger_receive;

    /**
     * @DTA\Data(field="jcr:content/proxyNTLMDomain", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_proxy_ntlm_domain;

    /**
     * @DTA\Data(field="jcr:content/protocolHTTPHeaders@TypeHint", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_protocol_http_headers_type_hint;

    /**
     * @DTA\Data(field="jcr:content/proxyUser", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_proxy_user;

    /**
     * @DTA\Data(field="jcr:content/protocolVersion", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_protocol_version;

    /**
     * @DTA\Data(field="jcr:primaryType", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_primary_type;

    /**
     * @DTA\Data(field="jcr:content/transportUri", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_transport_uri;

    /**
     * @DTA\Data(field="jcr:content/cq:name", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_cq_name;

    /**
     * @DTA\Data(field="jcr:content/queueBatchMode", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_queue_batch_mode;

    /**
     * @DTA\Data(field="jcr:content/jcr:mixinTypes", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_jcr_mixin_types;

    /**
     * @DTA\Data(field="jcr:content/proxyPort", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"float"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"float"})
     * @var float|null
     */
    public $jcr_content_proxy_port;

    /**
     * @DTA\Data(field="jcr:content/protocolConnectTimeout", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"float"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"float"})
     * @var float|null
     */
    public $jcr_content_protocol_connect_timeout;

    /**
     * @DTA\Data(field="jcr:content/transportNTLMDomain", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_transport_ntlm_domain;

    /**
     * @DTA\Data(field="jcr:content/logLevel", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_log_level;

    /**
     * @DTA\Data(field="jcr:content/protocolInterface", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_protocol_interface;

    /**
     * @DTA\Data(field="jcr:content/protocolHTTPSRelaxed", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $jcr_content_protocol_https_relaxed;

    /**
     * @DTA\Data(field="jcr:content/transportUser", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_transport_user;

    /**
     * @DTA\Data(field=":operation", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $_operation;

    /**
     * @DTA\Data(field="jcr:content/cq:distribute", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $jcr_content_cq_distribute;

    /**
     * @DTA\Data(field="jcr:content/jcr:description", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_jcr_description;

    /**
     * @DTA\Data(field="jcr:content/noVersioning", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $jcr_content_no_versioning;

    /**
     * @DTA\Data(field="jcr:content/noStatusUpdate", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $jcr_content_no_status_update;

    /**
     * @DTA\Data(field="jcr:content/proxyHost", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_proxy_host;

    /**
     * @DTA\Data(field="jcr:content/transportPassword", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_transport_password;

    /**
     * @DTA\Data(field="jcr:content/protocolHTTPHeaders", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @var string[]|null
     */
    public $jcr_content_protocol_http_headers;

    /**
     * @DTA\Data(field="jcr:content/aliasUpdate", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $jcr_content_alias_update;

    /**
     * @DTA\Data(field="jcr:content/queueBatchMaxSize", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"float"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"float"})
     * @var float|null
     */
    public $jcr_content_queue_batch_max_size;

    /**
     * @DTA\Data(field="jcr:content/cq:template", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_cq_template;

    /**
     * @DTA\Data(field="jcr:content/userId", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $jcr_content_user_id;

    /**
     * @DTA\Data(field="jcr:content/triggerDistribute", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $jcr_content_trigger_distribute;

}
