package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import java.math.BigDecimal;
import java.io.File;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-09-03T15:25:23.467+10:00[Australia/Melbourne]")
public class EtcApiServiceImpl extends EtcApiService {
    @Override
    public Response deleteAgent(String runmode
, String name
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getAgent(String runmode
, String name
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getAgents(String runmode
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getPackage(String group
, String name
, String version
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getPackageFilter(String group
, String name
, String version
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getTruststore() throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postAgent(String runmode
, String name
, Boolean jcrColonContentCqColonDistribute
, String jcrColonContentCqColonDistributeAtTypeHint
, String jcrColonContentCqColonName
, String jcrColonContentCqColonTemplate
, Boolean jcrColonContentEnabled
, String jcrColonContentJcrColonDescription
, String jcrColonContentJcrColonLastModified
, String jcrColonContentJcrColonLastModifiedBy
, String jcrColonContentJcrColonMixinTypes
, String jcrColonContentJcrColonTitle
, String jcrColonContentLogLevel
, Boolean jcrColonContentNoStatusUpdate
, Boolean jcrColonContentNoVersioning
, BigDecimal jcrColonContentProtocolConnectTimeout
, Boolean jcrColonContentProtocolHTTPConnectionClosed
, String jcrColonContentProtocolHTTPExpired
, List<String> jcrColonContentProtocolHTTPHeaders
, String jcrColonContentProtocolHTTPHeadersAtTypeHint
, String jcrColonContentProtocolHTTPMethod
, Boolean jcrColonContentProtocolHTTPSRelaxed
, String jcrColonContentProtocolInterface
, BigDecimal jcrColonContentProtocolSocketTimeout
, String jcrColonContentProtocolVersion
, String jcrColonContentProxyNTLMDomain
, String jcrColonContentProxyNTLMHost
, String jcrColonContentProxyHost
, String jcrColonContentProxyPassword
, BigDecimal jcrColonContentProxyPort
, String jcrColonContentProxyUser
, BigDecimal jcrColonContentQueueBatchMaxSize
, String jcrColonContentQueueBatchMode
, BigDecimal jcrColonContentQueueBatchWaitTime
, String jcrColonContentRetryDelay
, Boolean jcrColonContentReverseReplication
, String jcrColonContentSerializationType
, String jcrColonContentSlingColonResourceType
, String jcrColonContentSsl
, String jcrColonContentTransportNTLMDomain
, String jcrColonContentTransportNTLMHost
, String jcrColonContentTransportPassword
, String jcrColonContentTransportUri
, String jcrColonContentTransportUser
, Boolean jcrColonContentTriggerDistribute
, Boolean jcrColonContentTriggerModified
, Boolean jcrColonContentTriggerOnOffTime
, Boolean jcrColonContentTriggerReceive
, Boolean jcrColonContentTriggerSpecific
, String jcrColonContentUserId
, String jcrColonPrimaryType
, String colonOperation
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postTreeActivation(Boolean ignoredeactivated
, Boolean onlymodified
, String path
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postTruststorePKCS12(InputStream truststoreP12InputStream, FileInfo truststoreP12Detail
 ) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
