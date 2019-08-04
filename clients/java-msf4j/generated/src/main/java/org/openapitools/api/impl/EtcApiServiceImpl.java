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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-04T23:41:25.207Z[GMT]")
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
, Boolean jcrColonContentSlashCqColonDistribute
, String jcrColonContentSlashCqColonDistributeAtTypeHint
, String jcrColonContentSlashCqColonName
, String jcrColonContentSlashCqColonTemplate
, Boolean jcrColonContentSlashEnabled
, String jcrColonContentSlashJcrColonDescription
, String jcrColonContentSlashJcrColonLastModified
, String jcrColonContentSlashJcrColonLastModifiedBy
, String jcrColonContentSlashJcrColonMixinTypes
, String jcrColonContentSlashJcrColonTitle
, String jcrColonContentSlashLogLevel
, Boolean jcrColonContentSlashNoStatusUpdate
, Boolean jcrColonContentSlashNoVersioning
, BigDecimal jcrColonContentSlashProtocolConnectTimeout
, Boolean jcrColonContentSlashProtocolHTTPConnectionClosed
, String jcrColonContentSlashProtocolHTTPExpired
, List<String> jcrColonContentSlashProtocolHTTPHeaders
, String jcrColonContentSlashProtocolHTTPHeadersAtTypeHint
, String jcrColonContentSlashProtocolHTTPMethod
, Boolean jcrColonContentSlashProtocolHTTPSRelaxed
, String jcrColonContentSlashProtocolInterface
, BigDecimal jcrColonContentSlashProtocolSocketTimeout
, String jcrColonContentSlashProtocolVersion
, String jcrColonContentSlashProxyNTLMDomain
, String jcrColonContentSlashProxyNTLMHost
, String jcrColonContentSlashProxyHost
, String jcrColonContentSlashProxyPassword
, BigDecimal jcrColonContentSlashProxyPort
, String jcrColonContentSlashProxyUser
, BigDecimal jcrColonContentSlashQueueBatchMaxSize
, String jcrColonContentSlashQueueBatchMode
, BigDecimal jcrColonContentSlashQueueBatchWaitTime
, String jcrColonContentSlashRetryDelay
, Boolean jcrColonContentSlashReverseReplication
, String jcrColonContentSlashSerializationType
, String jcrColonContentSlashSlingColonResourceType
, String jcrColonContentSlashSsl
, String jcrColonContentSlashTransportNTLMDomain
, String jcrColonContentSlashTransportNTLMHost
, String jcrColonContentSlashTransportPassword
, String jcrColonContentSlashTransportUri
, String jcrColonContentSlashTransportUser
, Boolean jcrColonContentSlashTriggerDistribute
, Boolean jcrColonContentSlashTriggerModified
, Boolean jcrColonContentSlashTriggerOnOffTime
, Boolean jcrColonContentSlashTriggerReceive
, Boolean jcrColonContentSlashTriggerSpecific
, String jcrColonContentSlashUserId
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
