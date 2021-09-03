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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-09-03T15:25:57.989+10:00[Australia/Melbourne]")
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
    public Response postAgent( @PathParam("runmode") String runmode, @PathParam("name") String name,  @QueryParam("jcr:content/cq:distribute") Boolean jcrColonContentCqColonDistribute,  @QueryParam("jcr:content/cq:distribute@TypeHint") String jcrColonContentCqColonDistributeAtTypeHint,  @QueryParam("jcr:content/cq:name") String jcrColonContentCqColonName,  @QueryParam("jcr:content/cq:template") String jcrColonContentCqColonTemplate,  @QueryParam("jcr:content/enabled") Boolean jcrColonContentEnabled,  @QueryParam("jcr:content/jcr:description") String jcrColonContentJcrColonDescription,  @QueryParam("jcr:content/jcr:lastModified") String jcrColonContentJcrColonLastModified,  @QueryParam("jcr:content/jcr:lastModifiedBy") String jcrColonContentJcrColonLastModifiedBy,  @QueryParam("jcr:content/jcr:mixinTypes") String jcrColonContentJcrColonMixinTypes,  @QueryParam("jcr:content/jcr:title") String jcrColonContentJcrColonTitle,  @QueryParam("jcr:content/logLevel") String jcrColonContentLogLevel,  @QueryParam("jcr:content/noStatusUpdate") Boolean jcrColonContentNoStatusUpdate,  @QueryParam("jcr:content/noVersioning") Boolean jcrColonContentNoVersioning,  @QueryParam("jcr:content/protocolConnectTimeout") BigDecimal jcrColonContentProtocolConnectTimeout,  @QueryParam("jcr:content/protocolHTTPConnectionClosed") Boolean jcrColonContentProtocolHTTPConnectionClosed,  @QueryParam("jcr:content/protocolHTTPExpired") String jcrColonContentProtocolHTTPExpired,  @QueryParam("jcr:content/protocolHTTPHeaders") List<String> jcrColonContentProtocolHTTPHeaders,  @QueryParam("jcr:content/protocolHTTPHeaders@TypeHint") String jcrColonContentProtocolHTTPHeadersAtTypeHint,  @QueryParam("jcr:content/protocolHTTPMethod") String jcrColonContentProtocolHTTPMethod,  @QueryParam("jcr:content/protocolHTTPSRelaxed") Boolean jcrColonContentProtocolHTTPSRelaxed,  @QueryParam("jcr:content/protocolInterface") String jcrColonContentProtocolInterface,  @QueryParam("jcr:content/protocolSocketTimeout") BigDecimal jcrColonContentProtocolSocketTimeout,  @QueryParam("jcr:content/protocolVersion") String jcrColonContentProtocolVersion,  @QueryParam("jcr:content/proxyNTLMDomain") String jcrColonContentProxyNTLMDomain,  @QueryParam("jcr:content/proxyNTLMHost") String jcrColonContentProxyNTLMHost,  @QueryParam("jcr:content/proxyHost") String jcrColonContentProxyHost,  @QueryParam("jcr:content/proxyPassword") String jcrColonContentProxyPassword,  @QueryParam("jcr:content/proxyPort") BigDecimal jcrColonContentProxyPort,  @QueryParam("jcr:content/proxyUser") String jcrColonContentProxyUser,  @QueryParam("jcr:content/queueBatchMaxSize") BigDecimal jcrColonContentQueueBatchMaxSize,  @QueryParam("jcr:content/queueBatchMode") String jcrColonContentQueueBatchMode,  @QueryParam("jcr:content/queueBatchWaitTime") BigDecimal jcrColonContentQueueBatchWaitTime,  @QueryParam("jcr:content/retryDelay") String jcrColonContentRetryDelay,  @QueryParam("jcr:content/reverseReplication") Boolean jcrColonContentReverseReplication,  @QueryParam("jcr:content/serializationType") String jcrColonContentSerializationType,  @QueryParam("jcr:content/sling:resourceType") String jcrColonContentSlingColonResourceType,  @QueryParam("jcr:content/ssl") String jcrColonContentSsl,  @QueryParam("jcr:content/transportNTLMDomain") String jcrColonContentTransportNTLMDomain,  @QueryParam("jcr:content/transportNTLMHost") String jcrColonContentTransportNTLMHost,  @QueryParam("jcr:content/transportPassword") String jcrColonContentTransportPassword,  @QueryParam("jcr:content/transportUri") String jcrColonContentTransportUri,  @QueryParam("jcr:content/transportUser") String jcrColonContentTransportUser,  @QueryParam("jcr:content/triggerDistribute") Boolean jcrColonContentTriggerDistribute,  @QueryParam("jcr:content/triggerModified") Boolean jcrColonContentTriggerModified,  @QueryParam("jcr:content/triggerOnOffTime") Boolean jcrColonContentTriggerOnOffTime,  @QueryParam("jcr:content/triggerReceive") Boolean jcrColonContentTriggerReceive,  @QueryParam("jcr:content/triggerSpecific") Boolean jcrColonContentTriggerSpecific,  @QueryParam("jcr:content/userId") String jcrColonContentUserId,  @QueryParam("jcr:primaryType") String jcrColonPrimaryType,  @QueryParam(":operation") String colonOperation,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postAgent(runmode,name,jcrColonContentCqColonDistribute,jcrColonContentCqColonDistributeAtTypeHint,jcrColonContentCqColonName,jcrColonContentCqColonTemplate,jcrColonContentEnabled,jcrColonContentJcrColonDescription,jcrColonContentJcrColonLastModified,jcrColonContentJcrColonLastModifiedBy,jcrColonContentJcrColonMixinTypes,jcrColonContentJcrColonTitle,jcrColonContentLogLevel,jcrColonContentNoStatusUpdate,jcrColonContentNoVersioning,jcrColonContentProtocolConnectTimeout,jcrColonContentProtocolHTTPConnectionClosed,jcrColonContentProtocolHTTPExpired,jcrColonContentProtocolHTTPHeaders,jcrColonContentProtocolHTTPHeadersAtTypeHint,jcrColonContentProtocolHTTPMethod,jcrColonContentProtocolHTTPSRelaxed,jcrColonContentProtocolInterface,jcrColonContentProtocolSocketTimeout,jcrColonContentProtocolVersion,jcrColonContentProxyNTLMDomain,jcrColonContentProxyNTLMHost,jcrColonContentProxyHost,jcrColonContentProxyPassword,jcrColonContentProxyPort,jcrColonContentProxyUser,jcrColonContentQueueBatchMaxSize,jcrColonContentQueueBatchMode,jcrColonContentQueueBatchWaitTime,jcrColonContentRetryDelay,jcrColonContentReverseReplication,jcrColonContentSerializationType,jcrColonContentSlingColonResourceType,jcrColonContentSsl,jcrColonContentTransportNTLMDomain,jcrColonContentTransportNTLMHost,jcrColonContentTransportPassword,jcrColonContentTransportUri,jcrColonContentTransportUser,jcrColonContentTriggerDistribute,jcrColonContentTriggerModified,jcrColonContentTriggerOnOffTime,jcrColonContentTriggerReceive,jcrColonContentTriggerSpecific,jcrColonContentUserId,jcrColonPrimaryType,colonOperation,securityContext);
    }
    @POST
    @Path("/replication/treeactivation.html")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postTreeActivation( @NotNull  @QueryParam("ignoredeactivated") Boolean ignoredeactivated, @NotNull  @QueryParam("onlymodified") Boolean onlymodified, @NotNull  @QueryParam("path") String path,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postTreeActivation(ignoredeactivated,onlymodified,path,securityContext);
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
