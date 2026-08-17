package org.openapitools.api.consumer;

import java.math.BigDecimal;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.EtcService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/etc")
public class EtcServiceController {

    @DubboReference
    private EtcService etcService;

    @RequestMapping(method = RequestMethod.DELETE, value = "/replication/agents.{runmode}/{name}")
    public void deleteAgent(
        @RequestParam(name = "runmode") String runmode,
        @RequestParam(name = "name") String name
    ) {
        etcService.deleteAgent(runmode, name);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/replication/agents.{runmode}/{name}")
    public void getAgent(
        @RequestParam(name = "runmode") String runmode,
        @RequestParam(name = "name") String name
    ) {
        etcService.getAgent(runmode, name);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/replication/agents.{runmode}.-1.json")
    public String getAgents(
        @RequestParam(name = "runmode") String runmode
    ) {
        return etcService.getAgents(runmode);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/packages/{group}/{name}-{version}.zip")
    public org.springframework.web.multipart.MultipartFile getPackage(
        @RequestParam(name = "group") String group,
        @RequestParam(name = "name") String name,
        @RequestParam(name = "version") String version
    ) {
        return etcService.getPackage(group, name, version);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json")
    public String getPackageFilter(
        @RequestParam(name = "group") String group,
        @RequestParam(name = "name") String name,
        @RequestParam(name = "version") String version
    ) {
        return etcService.getPackageFilter(group, name, version);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/truststore/truststore.p12")
    public org.springframework.web.multipart.MultipartFile getTruststore(
    ) {
        return etcService.getTruststore();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/replication/agents.{runmode}/{name}")
    public void postAgent(
        @RequestParam(name = "runmode") String runmode,
        @RequestParam(name = "name") String name,
        @RequestParam(name = "jcrContentCqDistribute") Boolean jcrContentCqDistribute,
        @RequestParam(name = "jcrContentCqDistributeAtTypeHint") String jcrContentCqDistributeAtTypeHint,
        @RequestParam(name = "jcrContentCqName") String jcrContentCqName,
        @RequestParam(name = "jcrContentCqTemplate") String jcrContentCqTemplate,
        @RequestParam(name = "jcrContentAliasUpdate") Boolean jcrContentAliasUpdate,
        @RequestParam(name = "jcrContentEnabled") Boolean jcrContentEnabled,
        @RequestParam(name = "jcrContentJcrDescription") String jcrContentJcrDescription,
        @RequestParam(name = "jcrContentJcrLastModified") String jcrContentJcrLastModified,
        @RequestParam(name = "jcrContentJcrLastModifiedBy") String jcrContentJcrLastModifiedBy,
        @RequestParam(name = "jcrContentJcrMixinTypes") String jcrContentJcrMixinTypes,
        @RequestParam(name = "jcrContentJcrTitle") String jcrContentJcrTitle,
        @RequestParam(name = "jcrContentLogLevel") String jcrContentLogLevel,
        @RequestParam(name = "jcrContentNoStatusUpdate") Boolean jcrContentNoStatusUpdate,
        @RequestParam(name = "jcrContentNoVersioning") Boolean jcrContentNoVersioning,
        @RequestParam(name = "jcrContentProtocolConnectTimeout") BigDecimal jcrContentProtocolConnectTimeout,
        @RequestParam(name = "jcrContentProtocolHTTPConnectionClosed") Boolean jcrContentProtocolHTTPConnectionClosed,
        @RequestParam(name = "jcrContentProtocolHTTPExpired") String jcrContentProtocolHTTPExpired,
        @RequestParam(name = "jcrContentProtocolHTTPHeaders") List<String> jcrContentProtocolHTTPHeaders,
        @RequestParam(name = "jcrContentProtocolHTTPHeadersAtTypeHint") String jcrContentProtocolHTTPHeadersAtTypeHint,
        @RequestParam(name = "jcrContentProtocolHTTPMethod") String jcrContentProtocolHTTPMethod,
        @RequestParam(name = "jcrContentProtocolHTTPSRelaxed") Boolean jcrContentProtocolHTTPSRelaxed,
        @RequestParam(name = "jcrContentProtocolInterface") String jcrContentProtocolInterface,
        @RequestParam(name = "jcrContentProtocolSocketTimeout") BigDecimal jcrContentProtocolSocketTimeout,
        @RequestParam(name = "jcrContentProtocolVersion") String jcrContentProtocolVersion,
        @RequestParam(name = "jcrContentProxyNTLMDomain") String jcrContentProxyNTLMDomain,
        @RequestParam(name = "jcrContentProxyNTLMHost") String jcrContentProxyNTLMHost,
        @RequestParam(name = "jcrContentProxyHost") String jcrContentProxyHost,
        @RequestParam(name = "jcrContentProxyPassword") String jcrContentProxyPassword,
        @RequestParam(name = "jcrContentProxyPort") BigDecimal jcrContentProxyPort,
        @RequestParam(name = "jcrContentProxyUser") String jcrContentProxyUser,
        @RequestParam(name = "jcrContentQueueBatchMaxSize") BigDecimal jcrContentQueueBatchMaxSize,
        @RequestParam(name = "jcrContentQueueBatchMode") String jcrContentQueueBatchMode,
        @RequestParam(name = "jcrContentQueueBatchWaitTime") BigDecimal jcrContentQueueBatchWaitTime,
        @RequestParam(name = "jcrContentRetryDelay") String jcrContentRetryDelay,
        @RequestParam(name = "jcrContentReverseReplication") Boolean jcrContentReverseReplication,
        @RequestParam(name = "jcrContentSerializationType") String jcrContentSerializationType,
        @RequestParam(name = "jcrContentSlingResourceType") String jcrContentSlingResourceType,
        @RequestParam(name = "jcrContentSsl") String jcrContentSsl,
        @RequestParam(name = "jcrContentTransportNTLMDomain") String jcrContentTransportNTLMDomain,
        @RequestParam(name = "jcrContentTransportNTLMHost") String jcrContentTransportNTLMHost,
        @RequestParam(name = "jcrContentTransportPassword") String jcrContentTransportPassword,
        @RequestParam(name = "jcrContentTransportUri") String jcrContentTransportUri,
        @RequestParam(name = "jcrContentTransportUser") String jcrContentTransportUser,
        @RequestParam(name = "jcrContentTriggerDistribute") Boolean jcrContentTriggerDistribute,
        @RequestParam(name = "jcrContentTriggerModified") Boolean jcrContentTriggerModified,
        @RequestParam(name = "jcrContentTriggerOnOffTime") Boolean jcrContentTriggerOnOffTime,
        @RequestParam(name = "jcrContentTriggerReceive") Boolean jcrContentTriggerReceive,
        @RequestParam(name = "jcrContentTriggerSpecific") Boolean jcrContentTriggerSpecific,
        @RequestParam(name = "jcrContentUserId") String jcrContentUserId,
        @RequestParam(name = "jcrPrimaryType") String jcrPrimaryType,
        @RequestParam(name = "operation") String operation
    ) {
        etcService.postAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeAtTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersAtTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/truststore")
    public String postTruststorePKCS12(
        @RequestParam(name = "truststoreP12") org.springframework.web.multipart.MultipartFile truststoreP12
    ) {
        return etcService.postTruststorePKCS12(truststoreP12);
    }
}
