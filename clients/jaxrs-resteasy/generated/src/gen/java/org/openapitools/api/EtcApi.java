package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.EtcApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.math.BigDecimal;
import java.io.File;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

@Path("/etc")


@io.swagger.annotations.Api(description = "the etc API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-17T07:13:10.689769688Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class EtcApi  {

    @Inject EtcApiService service;

    @DELETE
    @Path("/replication/agents.{runmode}/{name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response deleteAgent( @PathParam("runmode") String runmode, @PathParam("name") String name,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteAgent(runmode,name,securityContext);
    }
    @GET
    @Path("/replication/agents.{runmode}/{name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response getAgent( @PathParam("runmode") String runmode, @PathParam("name") String name,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAgent(runmode,name,securityContext);
    }
    @GET
    @Path("/replication/agents.{runmode}.-1.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getAgents( @PathParam("runmode") String runmode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAgents(runmode,securityContext);
    }
    @GET
    @Path("/packages/{group}/{name}-{version}.zip")
    
    @Produces({ "application/octet-stream" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = File.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = File.class) })
    public Response getPackage( @PathParam("group") String group, @PathParam("name") String name, @PathParam("version") String version,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPackage(group,name,version,securityContext);
    }
    @GET
    @Path("/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getPackageFilter( @PathParam("group") String group, @PathParam("name") String name, @PathParam("version") String version,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getPackageFilter(group,name,version,securityContext);
    }
    @GET
    @Path("/truststore/truststore.p12")
    
    @Produces({ "application/octet-stream" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = File.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = File.class) })
    public Response getTruststore(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTruststore(securityContext);
    }
    @POST
    @Path("/replication/agents.{runmode}/{name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postAgent( @PathParam("runmode") String runmode, @PathParam("name") String name, @QueryParam("jcr:content/cq:distribute") Boolean jcrContentCqDistribute, @QueryParam("jcr:content/cq:distribute@TypeHint") String jcrContentCqDistributeAtTypeHint, @QueryParam("jcr:content/cq:name") String jcrContentCqName, @QueryParam("jcr:content/cq:template") String jcrContentCqTemplate, @QueryParam("jcr:content/aliasUpdate") Boolean jcrContentAliasUpdate, @QueryParam("jcr:content/enabled") Boolean jcrContentEnabled, @QueryParam("jcr:content/jcr:description") String jcrContentJcrDescription, @QueryParam("jcr:content/jcr:lastModified") String jcrContentJcrLastModified, @QueryParam("jcr:content/jcr:lastModifiedBy") String jcrContentJcrLastModifiedBy, @QueryParam("jcr:content/jcr:mixinTypes") String jcrContentJcrMixinTypes, @QueryParam("jcr:content/jcr:title") String jcrContentJcrTitle, @QueryParam("jcr:content/logLevel") String jcrContentLogLevel, @QueryParam("jcr:content/noStatusUpdate") Boolean jcrContentNoStatusUpdate, @QueryParam("jcr:content/noVersioning") Boolean jcrContentNoVersioning, @QueryParam("jcr:content/protocolConnectTimeout") BigDecimal jcrContentProtocolConnectTimeout, @QueryParam("jcr:content/protocolHTTPConnectionClosed") Boolean jcrContentProtocolHTTPConnectionClosed, @QueryParam("jcr:content/protocolHTTPExpired") String jcrContentProtocolHTTPExpired, @QueryParam("jcr:content/protocolHTTPHeaders") List<String> jcrContentProtocolHTTPHeaders, @QueryParam("jcr:content/protocolHTTPHeaders@TypeHint") String jcrContentProtocolHTTPHeadersAtTypeHint, @QueryParam("jcr:content/protocolHTTPMethod") String jcrContentProtocolHTTPMethod, @QueryParam("jcr:content/protocolHTTPSRelaxed") Boolean jcrContentProtocolHTTPSRelaxed, @QueryParam("jcr:content/protocolInterface") String jcrContentProtocolInterface, @QueryParam("jcr:content/protocolSocketTimeout") BigDecimal jcrContentProtocolSocketTimeout, @QueryParam("jcr:content/protocolVersion") String jcrContentProtocolVersion, @QueryParam("jcr:content/proxyNTLMDomain") String jcrContentProxyNTLMDomain, @QueryParam("jcr:content/proxyNTLMHost") String jcrContentProxyNTLMHost, @QueryParam("jcr:content/proxyHost") String jcrContentProxyHost, @QueryParam("jcr:content/proxyPassword") String jcrContentProxyPassword, @QueryParam("jcr:content/proxyPort") BigDecimal jcrContentProxyPort, @QueryParam("jcr:content/proxyUser") String jcrContentProxyUser, @QueryParam("jcr:content/queueBatchMaxSize") BigDecimal jcrContentQueueBatchMaxSize, @QueryParam("jcr:content/queueBatchMode") String jcrContentQueueBatchMode, @QueryParam("jcr:content/queueBatchWaitTime") BigDecimal jcrContentQueueBatchWaitTime, @QueryParam("jcr:content/retryDelay") String jcrContentRetryDelay, @QueryParam("jcr:content/reverseReplication") Boolean jcrContentReverseReplication, @QueryParam("jcr:content/serializationType") String jcrContentSerializationType, @QueryParam("jcr:content/sling:resourceType") String jcrContentSlingResourceType, @QueryParam("jcr:content/ssl") String jcrContentSsl, @QueryParam("jcr:content/transportNTLMDomain") String jcrContentTransportNTLMDomain, @QueryParam("jcr:content/transportNTLMHost") String jcrContentTransportNTLMHost, @QueryParam("jcr:content/transportPassword") String jcrContentTransportPassword, @QueryParam("jcr:content/transportUri") String jcrContentTransportUri, @QueryParam("jcr:content/transportUser") String jcrContentTransportUser, @QueryParam("jcr:content/triggerDistribute") Boolean jcrContentTriggerDistribute, @QueryParam("jcr:content/triggerModified") Boolean jcrContentTriggerModified, @QueryParam("jcr:content/triggerOnOffTime") Boolean jcrContentTriggerOnOffTime, @QueryParam("jcr:content/triggerReceive") Boolean jcrContentTriggerReceive, @QueryParam("jcr:content/triggerSpecific") Boolean jcrContentTriggerSpecific, @QueryParam("jcr:content/userId") String jcrContentUserId, @QueryParam("jcr:primaryType") String jcrPrimaryType, @QueryParam(":operation") String operation,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postAgent(runmode,name,jcrContentCqDistribute,jcrContentCqDistributeAtTypeHint,jcrContentCqName,jcrContentCqTemplate,jcrContentAliasUpdate,jcrContentEnabled,jcrContentJcrDescription,jcrContentJcrLastModified,jcrContentJcrLastModifiedBy,jcrContentJcrMixinTypes,jcrContentJcrTitle,jcrContentLogLevel,jcrContentNoStatusUpdate,jcrContentNoVersioning,jcrContentProtocolConnectTimeout,jcrContentProtocolHTTPConnectionClosed,jcrContentProtocolHTTPExpired,jcrContentProtocolHTTPHeaders,jcrContentProtocolHTTPHeadersAtTypeHint,jcrContentProtocolHTTPMethod,jcrContentProtocolHTTPSRelaxed,jcrContentProtocolInterface,jcrContentProtocolSocketTimeout,jcrContentProtocolVersion,jcrContentProxyNTLMDomain,jcrContentProxyNTLMHost,jcrContentProxyHost,jcrContentProxyPassword,jcrContentProxyPort,jcrContentProxyUser,jcrContentQueueBatchMaxSize,jcrContentQueueBatchMode,jcrContentQueueBatchWaitTime,jcrContentRetryDelay,jcrContentReverseReplication,jcrContentSerializationType,jcrContentSlingResourceType,jcrContentSsl,jcrContentTransportNTLMDomain,jcrContentTransportNTLMHost,jcrContentTransportPassword,jcrContentTransportUri,jcrContentTransportUser,jcrContentTriggerDistribute,jcrContentTriggerModified,jcrContentTriggerOnOffTime,jcrContentTriggerReceive,jcrContentTriggerSpecific,jcrContentUserId,jcrPrimaryType,operation,securityContext);
    }
    @POST
    @Path("/truststore")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postTruststorePKCS12(MultipartFormDataInput input,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postTruststorePKCS12(input,securityContext);
    }
}
