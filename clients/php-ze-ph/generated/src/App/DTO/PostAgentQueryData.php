<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for postAgent
 */
class PostAgentQueryData
{
    /**
     * @DTA\Data(field="jcr:content/triggerOnOffTime", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $jcrcontenttrigger_on_off_time;
    /**
     * @DTA\Data(field="jcr:content/retryDelay", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentretry_delay;
    /**
     * @DTA\Data(field="jcr:content/proxyPassword", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentproxy_password;
    /**
     * @DTA\Data(field="jcr:content/jcr:lastModified", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentjcrlast_modified;
    /**
     * @DTA\Data(field="jcr:content/serializationType", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentserialization_type;
    /**
     * @DTA\Data(field="jcr:content/reverseReplication", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $jcrcontentreverse_replication;
    /**
     * @DTA\Data(field="jcr:content/triggerModified", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $jcrcontenttrigger_modified;
    /**
     * @DTA\Data(field="jcr:content/cq:distribute@TypeHint", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentcqdistribute_type_hint;
    /**
     * @DTA\Data(field="jcr:content/proxyNTLMHost", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentproxy_ntlm_host;
    /**
     * @DTA\Data(field="jcr:content/protocolHTTPMethod", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentprotocol_http_method;
    /**
     * @DTA\Data(field="jcr:content/sling:resourceType", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentslingresource_type;
    /**
     * @DTA\Data(field="jcr:content/protocolSocketTimeout", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"float"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"float"})
     * @var float
     */
    public $jcrcontentprotocol_socket_timeout;
    /**
     * @DTA\Data(field="jcr:content/queueBatchWaitTime", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"float"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"float"})
     * @var float
     */
    public $jcrcontentqueue_batch_wait_time;
    /**
     * @DTA\Data(field="jcr:content/enabled", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $jcrcontentenabled;
    /**
     * @DTA\Data(field="jcr:content/protocolHTTPConnectionClosed", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $jcrcontentprotocol_http_connection_closed;
    /**
     * @DTA\Data(field="jcr:content/ssl", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentssl;
    /**
     * @DTA\Data(field="jcr:content/triggerSpecific", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $jcrcontenttrigger_specific;
    /**
     * @DTA\Data(field="jcr:content/protocolHTTPExpired", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentprotocol_http_expired;
    /**
     * @DTA\Data(field="jcr:content/jcr:lastModifiedBy", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentjcrlast_modified_by;
    /**
     * @DTA\Data(field="jcr:content/transportNTLMHost", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontenttransport_ntlm_host;
    /**
     * @DTA\Data(field="jcr:content/jcr:title", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentjcrtitle;
    /**
     * @DTA\Data(field="jcr:content/triggerReceive", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $jcrcontenttrigger_receive;
    /**
     * @DTA\Data(field="jcr:content/proxyNTLMDomain", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentproxy_ntlm_domain;
    /**
     * @DTA\Data(field="jcr:content/protocolHTTPHeaders@TypeHint", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentprotocol_http_headers_type_hint;
    /**
     * @DTA\Data(field="jcr:content/proxyUser", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentproxy_user;
    /**
     * @DTA\Data(field="jcr:content/protocolVersion", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentprotocol_version;
    /**
     * @DTA\Data(field="jcr:primaryType", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrprimary_type;
    /**
     * @DTA\Data(field="jcr:content/transportUri", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontenttransport_uri;
    /**
     * @DTA\Data(field="jcr:content/cq:name", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentcqname;
    /**
     * @DTA\Data(field="jcr:content/queueBatchMode", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentqueue_batch_mode;
    /**
     * @DTA\Data(field="jcr:content/jcr:mixinTypes", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentjcrmixin_types;
    /**
     * @DTA\Data(field="jcr:content/proxyPort", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"float"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"float"})
     * @var float
     */
    public $jcrcontentproxy_port;
    /**
     * @DTA\Data(field="jcr:content/protocolConnectTimeout", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"float"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"float"})
     * @var float
     */
    public $jcrcontentprotocol_connect_timeout;
    /**
     * @DTA\Data(field="jcr:content/transportNTLMDomain", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontenttransport_ntlm_domain;
    /**
     * @DTA\Data(field="jcr:content/logLevel", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentlog_level;
    /**
     * @DTA\Data(field="jcr:content/protocolInterface", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentprotocol_interface;
    /**
     * @DTA\Data(field="jcr:content/protocolHTTPSRelaxed", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $jcrcontentprotocol_https_relaxed;
    /**
     * @DTA\Data(field="jcr:content/transportUser", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontenttransport_user;
    /**
     * @DTA\Data(field=":operation", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $operation;
    /**
     * @DTA\Data(field="jcr:content/cq:distribute", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $jcrcontentcqdistribute;
    /**
     * @DTA\Data(field="jcr:content/jcr:description", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentjcrdescription;
    /**
     * @DTA\Data(field="jcr:content/noVersioning", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $jcrcontentno_versioning;
    /**
     * @DTA\Data(field="jcr:content/noStatusUpdate", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $jcrcontentno_status_update;
    /**
     * @DTA\Data(field="jcr:content/proxyHost", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentproxy_host;
    /**
     * @DTA\Data(field="jcr:content/transportPassword", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontenttransport_password;
    /**
     * @DTA\Data(field="jcr:content/protocolHTTPHeaders", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $jcrcontentprotocol_http_headers;
    /**
     * @DTA\Data(field="jcr:content/queueBatchMaxSize", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"float"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"float"})
     * @var float
     */
    public $jcrcontentqueue_batch_max_size;
    /**
     * @DTA\Data(field="jcr:content/cq:template", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentcqtemplate;
    /**
     * @DTA\Data(field="jcr:content/userId", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $jcrcontentuser_id;
    /**
     * @DTA\Data(field="jcr:content/triggerDistribute", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $jcrcontenttrigger_distribute;
}
