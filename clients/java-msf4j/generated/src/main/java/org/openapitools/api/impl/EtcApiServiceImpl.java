package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import java.math.BigDecimal;
import java.io.File;
import java.util.List;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-17T07:12:45.791437416Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
, Boolean jcrContentCqDistribute
, String jcrContentCqDistributeAtTypeHint
, String jcrContentCqName
, String jcrContentCqTemplate
, Boolean jcrContentAliasUpdate
, Boolean jcrContentEnabled
, String jcrContentJcrDescription
, String jcrContentJcrLastModified
, String jcrContentJcrLastModifiedBy
, String jcrContentJcrMixinTypes
, String jcrContentJcrTitle
, String jcrContentLogLevel
, Boolean jcrContentNoStatusUpdate
, Boolean jcrContentNoVersioning
, BigDecimal jcrContentProtocolConnectTimeout
, Boolean jcrContentProtocolHTTPConnectionClosed
, String jcrContentProtocolHTTPExpired
, List<String> jcrContentProtocolHTTPHeaders
, String jcrContentProtocolHTTPHeadersAtTypeHint
, String jcrContentProtocolHTTPMethod
, Boolean jcrContentProtocolHTTPSRelaxed
, String jcrContentProtocolInterface
, BigDecimal jcrContentProtocolSocketTimeout
, String jcrContentProtocolVersion
, String jcrContentProxyNTLMDomain
, String jcrContentProxyNTLMHost
, String jcrContentProxyHost
, String jcrContentProxyPassword
, BigDecimal jcrContentProxyPort
, String jcrContentProxyUser
, BigDecimal jcrContentQueueBatchMaxSize
, String jcrContentQueueBatchMode
, BigDecimal jcrContentQueueBatchWaitTime
, String jcrContentRetryDelay
, Boolean jcrContentReverseReplication
, String jcrContentSerializationType
, String jcrContentSlingResourceType
, String jcrContentSsl
, String jcrContentTransportNTLMDomain
, String jcrContentTransportNTLMHost
, String jcrContentTransportPassword
, String jcrContentTransportUri
, String jcrContentTransportUser
, Boolean jcrContentTriggerDistribute
, Boolean jcrContentTriggerModified
, Boolean jcrContentTriggerOnOffTime
, Boolean jcrContentTriggerReceive
, Boolean jcrContentTriggerSpecific
, String jcrContentUserId
, String jcrPrimaryType
, String operation
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
