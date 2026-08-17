package org.openapitools.api.interfaces;

import java.math.BigDecimal;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface EtcService {

    /**
     * 
     * 
     *
     * @param runmode  (required)
     * @param name  (required)
     * @return void
     */
    void deleteAgent(
        String runmode,
        String name
    );

    /**
     * 
     * 
     *
     * @param runmode  (required)
     * @param name  (required)
     * @return void
     */
    void getAgent(
        String runmode,
        String name
    );

    /**
     * 
     * 
     *
     * @param runmode  (required)
     * @return String
     */
    String getAgents(
        String runmode
    );

    /**
     * 
     * 
     *
     * @param group  (required)
     * @param name  (required)
     * @param version  (required)
     * @return org.springframework.web.multipart.MultipartFile
     */
    org.springframework.web.multipart.MultipartFile getPackage(
        String group,
        String name,
        String version
    );

    /**
     * 
     * 
     *
     * @param group  (required)
     * @param name  (required)
     * @param version  (required)
     * @return String
     */
    String getPackageFilter(
        String group,
        String name,
        String version
    );

    /**
     * 
     * 
     *
     * @return org.springframework.web.multipart.MultipartFile
     */
    org.springframework.web.multipart.MultipartFile getTruststore(
    );

    /**
     * 
     * 
     *
     * @param runmode  (required)
     * @param name  (required)
     * @param jcrContentCqDistribute  (optional)
     * @param jcrContentCqDistributeAtTypeHint  (optional)
     * @param jcrContentCqName  (optional)
     * @param jcrContentCqTemplate  (optional)
     * @param jcrContentAliasUpdate  (optional)
     * @param jcrContentEnabled  (optional)
     * @param jcrContentJcrDescription  (optional)
     * @param jcrContentJcrLastModified  (optional)
     * @param jcrContentJcrLastModifiedBy  (optional)
     * @param jcrContentJcrMixinTypes  (optional)
     * @param jcrContentJcrTitle  (optional)
     * @param jcrContentLogLevel  (optional)
     * @param jcrContentNoStatusUpdate  (optional)
     * @param jcrContentNoVersioning  (optional)
     * @param jcrContentProtocolConnectTimeout  (optional)
     * @param jcrContentProtocolHTTPConnectionClosed  (optional)
     * @param jcrContentProtocolHTTPExpired  (optional)
     * @param jcrContentProtocolHTTPHeaders  (optional)
     * @param jcrContentProtocolHTTPHeadersAtTypeHint  (optional)
     * @param jcrContentProtocolHTTPMethod  (optional)
     * @param jcrContentProtocolHTTPSRelaxed  (optional)
     * @param jcrContentProtocolInterface  (optional)
     * @param jcrContentProtocolSocketTimeout  (optional)
     * @param jcrContentProtocolVersion  (optional)
     * @param jcrContentProxyNTLMDomain  (optional)
     * @param jcrContentProxyNTLMHost  (optional)
     * @param jcrContentProxyHost  (optional)
     * @param jcrContentProxyPassword  (optional)
     * @param jcrContentProxyPort  (optional)
     * @param jcrContentProxyUser  (optional)
     * @param jcrContentQueueBatchMaxSize  (optional)
     * @param jcrContentQueueBatchMode  (optional)
     * @param jcrContentQueueBatchWaitTime  (optional)
     * @param jcrContentRetryDelay  (optional)
     * @param jcrContentReverseReplication  (optional)
     * @param jcrContentSerializationType  (optional)
     * @param jcrContentSlingResourceType  (optional)
     * @param jcrContentSsl  (optional)
     * @param jcrContentTransportNTLMDomain  (optional)
     * @param jcrContentTransportNTLMHost  (optional)
     * @param jcrContentTransportPassword  (optional)
     * @param jcrContentTransportUri  (optional)
     * @param jcrContentTransportUser  (optional)
     * @param jcrContentTriggerDistribute  (optional)
     * @param jcrContentTriggerModified  (optional)
     * @param jcrContentTriggerOnOffTime  (optional)
     * @param jcrContentTriggerReceive  (optional)
     * @param jcrContentTriggerSpecific  (optional)
     * @param jcrContentUserId  (optional)
     * @param jcrPrimaryType  (optional)
     * @param operation  (optional)
     * @return void
     */
    void postAgent(
        String runmode,
        String name,
        Boolean jcrContentCqDistribute,
        String jcrContentCqDistributeAtTypeHint,
        String jcrContentCqName,
        String jcrContentCqTemplate,
        Boolean jcrContentAliasUpdate,
        Boolean jcrContentEnabled,
        String jcrContentJcrDescription,
        String jcrContentJcrLastModified,
        String jcrContentJcrLastModifiedBy,
        String jcrContentJcrMixinTypes,
        String jcrContentJcrTitle,
        String jcrContentLogLevel,
        Boolean jcrContentNoStatusUpdate,
        Boolean jcrContentNoVersioning,
        BigDecimal jcrContentProtocolConnectTimeout,
        Boolean jcrContentProtocolHTTPConnectionClosed,
        String jcrContentProtocolHTTPExpired,
        List<String> jcrContentProtocolHTTPHeaders,
        String jcrContentProtocolHTTPHeadersAtTypeHint,
        String jcrContentProtocolHTTPMethod,
        Boolean jcrContentProtocolHTTPSRelaxed,
        String jcrContentProtocolInterface,
        BigDecimal jcrContentProtocolSocketTimeout,
        String jcrContentProtocolVersion,
        String jcrContentProxyNTLMDomain,
        String jcrContentProxyNTLMHost,
        String jcrContentProxyHost,
        String jcrContentProxyPassword,
        BigDecimal jcrContentProxyPort,
        String jcrContentProxyUser,
        BigDecimal jcrContentQueueBatchMaxSize,
        String jcrContentQueueBatchMode,
        BigDecimal jcrContentQueueBatchWaitTime,
        String jcrContentRetryDelay,
        Boolean jcrContentReverseReplication,
        String jcrContentSerializationType,
        String jcrContentSlingResourceType,
        String jcrContentSsl,
        String jcrContentTransportNTLMDomain,
        String jcrContentTransportNTLMHost,
        String jcrContentTransportPassword,
        String jcrContentTransportUri,
        String jcrContentTransportUser,
        Boolean jcrContentTriggerDistribute,
        Boolean jcrContentTriggerModified,
        Boolean jcrContentTriggerOnOffTime,
        Boolean jcrContentTriggerReceive,
        Boolean jcrContentTriggerSpecific,
        String jcrContentUserId,
        String jcrPrimaryType,
        String operation
    );

    /**
     * 
     * 
     *
     * @param truststoreP12  (optional)
     * @return String
     */
    String postTruststorePKCS12(
        org.springframework.web.multipart.MultipartFile truststoreP12
    );
}
