package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import java.math.BigDecimal;
import java.io.File;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-09-03T15:25:23.467+10:00[Australia/Melbourne]")
public abstract class EtcApiService {
    public abstract Response deleteAgent(String runmode
 ,String name
 ) throws NotFoundException;
    public abstract Response getAgent(String runmode
 ,String name
 ) throws NotFoundException;
    public abstract Response getAgents(String runmode
 ) throws NotFoundException;
    public abstract Response getPackage(String group
 ,String name
 ,String version
 ) throws NotFoundException;
    public abstract Response getPackageFilter(String group
 ,String name
 ,String version
 ) throws NotFoundException;
    public abstract Response getTruststore() throws NotFoundException;
    public abstract Response postAgent(String runmode
 ,String name
 ,Boolean jcrColonContentCqColonDistribute
 ,String jcrColonContentCqColonDistributeAtTypeHint
 ,String jcrColonContentCqColonName
 ,String jcrColonContentCqColonTemplate
 ,Boolean jcrColonContentEnabled
 ,String jcrColonContentJcrColonDescription
 ,String jcrColonContentJcrColonLastModified
 ,String jcrColonContentJcrColonLastModifiedBy
 ,String jcrColonContentJcrColonMixinTypes
 ,String jcrColonContentJcrColonTitle
 ,String jcrColonContentLogLevel
 ,Boolean jcrColonContentNoStatusUpdate
 ,Boolean jcrColonContentNoVersioning
 ,BigDecimal jcrColonContentProtocolConnectTimeout
 ,Boolean jcrColonContentProtocolHTTPConnectionClosed
 ,String jcrColonContentProtocolHTTPExpired
 ,List<String> jcrColonContentProtocolHTTPHeaders
 ,String jcrColonContentProtocolHTTPHeadersAtTypeHint
 ,String jcrColonContentProtocolHTTPMethod
 ,Boolean jcrColonContentProtocolHTTPSRelaxed
 ,String jcrColonContentProtocolInterface
 ,BigDecimal jcrColonContentProtocolSocketTimeout
 ,String jcrColonContentProtocolVersion
 ,String jcrColonContentProxyNTLMDomain
 ,String jcrColonContentProxyNTLMHost
 ,String jcrColonContentProxyHost
 ,String jcrColonContentProxyPassword
 ,BigDecimal jcrColonContentProxyPort
 ,String jcrColonContentProxyUser
 ,BigDecimal jcrColonContentQueueBatchMaxSize
 ,String jcrColonContentQueueBatchMode
 ,BigDecimal jcrColonContentQueueBatchWaitTime
 ,String jcrColonContentRetryDelay
 ,Boolean jcrColonContentReverseReplication
 ,String jcrColonContentSerializationType
 ,String jcrColonContentSlingColonResourceType
 ,String jcrColonContentSsl
 ,String jcrColonContentTransportNTLMDomain
 ,String jcrColonContentTransportNTLMHost
 ,String jcrColonContentTransportPassword
 ,String jcrColonContentTransportUri
 ,String jcrColonContentTransportUser
 ,Boolean jcrColonContentTriggerDistribute
 ,Boolean jcrColonContentTriggerModified
 ,Boolean jcrColonContentTriggerOnOffTime
 ,Boolean jcrColonContentTriggerReceive
 ,Boolean jcrColonContentTriggerSpecific
 ,String jcrColonContentUserId
 ,String jcrColonPrimaryType
 ,String colonOperation
 ) throws NotFoundException;
    public abstract Response postTreeActivation(Boolean ignoredeactivated
 ,Boolean onlymodified
 ,String path
 ) throws NotFoundException;
    public abstract Response postTruststorePKCS12(InputStream truststoreP12InputStream, FileInfo truststoreP12Detail
 ) throws NotFoundException;
}
