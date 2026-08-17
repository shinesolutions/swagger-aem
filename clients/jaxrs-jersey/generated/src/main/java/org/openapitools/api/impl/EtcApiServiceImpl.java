package org.openapitools.api.impl;

import org.openapitools.api.*;
import java.math.BigDecimal;
import java.io.File;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-17T02:15:33.561165235Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class EtcApiServiceImpl extends EtcApiService {
    @Override
    public Response deleteAgent(String runmode, String name, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getAgent(String runmode, String name, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getAgents(String runmode, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getPackage(String group, String name, String version, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getPackageFilter(String group, String name, String version, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getTruststore(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postAgent(String runmode, String name, Boolean jcrContentCqDistribute, String jcrContentCqDistributeAtTypeHint, String jcrContentCqName, String jcrContentCqTemplate, Boolean jcrContentAliasUpdate, Boolean jcrContentEnabled, String jcrContentJcrDescription, String jcrContentJcrLastModified, String jcrContentJcrLastModifiedBy, String jcrContentJcrMixinTypes, String jcrContentJcrTitle, String jcrContentLogLevel, Boolean jcrContentNoStatusUpdate, Boolean jcrContentNoVersioning, BigDecimal jcrContentProtocolConnectTimeout, Boolean jcrContentProtocolHTTPConnectionClosed, String jcrContentProtocolHTTPExpired, List<String> jcrContentProtocolHTTPHeaders, String jcrContentProtocolHTTPHeadersAtTypeHint, String jcrContentProtocolHTTPMethod, Boolean jcrContentProtocolHTTPSRelaxed, String jcrContentProtocolInterface, BigDecimal jcrContentProtocolSocketTimeout, String jcrContentProtocolVersion, String jcrContentProxyNTLMDomain, String jcrContentProxyNTLMHost, String jcrContentProxyHost, String jcrContentProxyPassword, BigDecimal jcrContentProxyPort, String jcrContentProxyUser, BigDecimal jcrContentQueueBatchMaxSize, String jcrContentQueueBatchMode, BigDecimal jcrContentQueueBatchWaitTime, String jcrContentRetryDelay, Boolean jcrContentReverseReplication, String jcrContentSerializationType, String jcrContentSlingResourceType, String jcrContentSsl, String jcrContentTransportNTLMDomain, String jcrContentTransportNTLMHost, String jcrContentTransportPassword, String jcrContentTransportUri, String jcrContentTransportUser, Boolean jcrContentTriggerDistribute, Boolean jcrContentTriggerModified, Boolean jcrContentTriggerOnOffTime, Boolean jcrContentTriggerReceive, Boolean jcrContentTriggerSpecific, String jcrContentUserId, String jcrPrimaryType, String operation, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response postTruststorePKCS12(FormDataBodyPart truststoreP12Bodypart, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
