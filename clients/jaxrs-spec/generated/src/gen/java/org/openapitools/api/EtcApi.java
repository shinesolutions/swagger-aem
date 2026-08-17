package org.openapitools.api;

import java.math.BigDecimal;
import java.io.File;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/etc")
@Api(description = "the etc API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-17T07:13:15.121519061Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class EtcApi {

    @DELETE
    @Path("/replication/agents.{runmode}/{name}")
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response deleteAgent(@PathParam("runmode") String runmode,@PathParam("name") String name) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/replication/agents.{runmode}/{name}")
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response getAgent(@PathParam("runmode") String runmode,@PathParam("name") String name) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/replication/agents.{runmode}.-1.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response getAgents(@PathParam("runmode") String runmode) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/packages/{group}/{name}-{version}.zip")
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "", notes = "", response = File.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = File.class)
    })
    public Response getPackage(@PathParam("group") String group,@PathParam("name") String name,@PathParam("version") String version) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response getPackageFilter(@PathParam("group") String group,@PathParam("name") String name,@PathParam("version") String version) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/truststore/truststore.p12")
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "", notes = "", response = File.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = File.class)
    })
    public Response getTruststore() {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/replication/agents.{runmode}/{name}")
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response postAgent(@PathParam("runmode") String runmode,@PathParam("name") String name,@QueryParam("jcr:content/cq:distribute")   Boolean jcrContentCqDistribute,@QueryParam("jcr:content/cq:distribute@TypeHint")   String jcrContentCqDistributeAtTypeHint,@QueryParam("jcr:content/cq:name")   String jcrContentCqName,@QueryParam("jcr:content/cq:template")   String jcrContentCqTemplate,@QueryParam("jcr:content/aliasUpdate")   Boolean jcrContentAliasUpdate,@QueryParam("jcr:content/enabled")   Boolean jcrContentEnabled,@QueryParam("jcr:content/jcr:description")   String jcrContentJcrDescription,@QueryParam("jcr:content/jcr:lastModified")   String jcrContentJcrLastModified,@QueryParam("jcr:content/jcr:lastModifiedBy")   String jcrContentJcrLastModifiedBy,@QueryParam("jcr:content/jcr:mixinTypes")   String jcrContentJcrMixinTypes,@QueryParam("jcr:content/jcr:title")   String jcrContentJcrTitle,@QueryParam("jcr:content/logLevel")   String jcrContentLogLevel,@QueryParam("jcr:content/noStatusUpdate")   Boolean jcrContentNoStatusUpdate,@QueryParam("jcr:content/noVersioning")   Boolean jcrContentNoVersioning,@QueryParam("jcr:content/protocolConnectTimeout")   BigDecimal jcrContentProtocolConnectTimeout,@QueryParam("jcr:content/protocolHTTPConnectionClosed")   Boolean jcrContentProtocolHTTPConnectionClosed,@QueryParam("jcr:content/protocolHTTPExpired")   String jcrContentProtocolHTTPExpired,@QueryParam("jcr:content/protocolHTTPHeaders")   List<String> jcrContentProtocolHTTPHeaders,@QueryParam("jcr:content/protocolHTTPHeaders@TypeHint")   String jcrContentProtocolHTTPHeadersAtTypeHint,@QueryParam("jcr:content/protocolHTTPMethod")   String jcrContentProtocolHTTPMethod,@QueryParam("jcr:content/protocolHTTPSRelaxed")   Boolean jcrContentProtocolHTTPSRelaxed,@QueryParam("jcr:content/protocolInterface")   String jcrContentProtocolInterface,@QueryParam("jcr:content/protocolSocketTimeout")   BigDecimal jcrContentProtocolSocketTimeout,@QueryParam("jcr:content/protocolVersion")   String jcrContentProtocolVersion,@QueryParam("jcr:content/proxyNTLMDomain")   String jcrContentProxyNTLMDomain,@QueryParam("jcr:content/proxyNTLMHost")   String jcrContentProxyNTLMHost,@QueryParam("jcr:content/proxyHost")   String jcrContentProxyHost,@QueryParam("jcr:content/proxyPassword")   String jcrContentProxyPassword,@QueryParam("jcr:content/proxyPort")   BigDecimal jcrContentProxyPort,@QueryParam("jcr:content/proxyUser")   String jcrContentProxyUser,@QueryParam("jcr:content/queueBatchMaxSize")   BigDecimal jcrContentQueueBatchMaxSize,@QueryParam("jcr:content/queueBatchMode")   String jcrContentQueueBatchMode,@QueryParam("jcr:content/queueBatchWaitTime")   BigDecimal jcrContentQueueBatchWaitTime,@QueryParam("jcr:content/retryDelay")   String jcrContentRetryDelay,@QueryParam("jcr:content/reverseReplication")   Boolean jcrContentReverseReplication,@QueryParam("jcr:content/serializationType")   String jcrContentSerializationType,@QueryParam("jcr:content/sling:resourceType")   String jcrContentSlingResourceType,@QueryParam("jcr:content/ssl")   String jcrContentSsl,@QueryParam("jcr:content/transportNTLMDomain")   String jcrContentTransportNTLMDomain,@QueryParam("jcr:content/transportNTLMHost")   String jcrContentTransportNTLMHost,@QueryParam("jcr:content/transportPassword")   String jcrContentTransportPassword,@QueryParam("jcr:content/transportUri")   String jcrContentTransportUri,@QueryParam("jcr:content/transportUser")   String jcrContentTransportUser,@QueryParam("jcr:content/triggerDistribute")   Boolean jcrContentTriggerDistribute,@QueryParam("jcr:content/triggerModified")   Boolean jcrContentTriggerModified,@QueryParam("jcr:content/triggerOnOffTime")   Boolean jcrContentTriggerOnOffTime,@QueryParam("jcr:content/triggerReceive")   Boolean jcrContentTriggerReceive,@QueryParam("jcr:content/triggerSpecific")   Boolean jcrContentTriggerSpecific,@QueryParam("jcr:content/userId")   String jcrContentUserId,@QueryParam("jcr:primaryType")   String jcrPrimaryType,@QueryParam(":operation")   String operation) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/truststore")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response postTruststorePKCS12(@FormParam(value = "truststore.p12") InputStream truststoreP12InputStream) {
        return Response.ok().entity("magic!").build();
    }
}
