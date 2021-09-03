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

@Path("/etc")
@Api(description = "the etc API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-09-03T15:26:06.461+10:00[Australia/Melbourne]")public class EtcApi {

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
    public Response postAgent(@PathParam("runmode") String runmode,@PathParam("name") String name,@QueryParam("jcr:content/cq:distribute")    Boolean jcrColonContentCqColonDistribute,@QueryParam("jcr:content/cq:distribute@TypeHint")    String jcrColonContentCqColonDistributeAtTypeHint,@QueryParam("jcr:content/cq:name")    String jcrColonContentCqColonName,@QueryParam("jcr:content/cq:template")    String jcrColonContentCqColonTemplate,@QueryParam("jcr:content/enabled")    Boolean jcrColonContentEnabled,@QueryParam("jcr:content/jcr:description")    String jcrColonContentJcrColonDescription,@QueryParam("jcr:content/jcr:lastModified")    String jcrColonContentJcrColonLastModified,@QueryParam("jcr:content/jcr:lastModifiedBy")    String jcrColonContentJcrColonLastModifiedBy,@QueryParam("jcr:content/jcr:mixinTypes")    String jcrColonContentJcrColonMixinTypes,@QueryParam("jcr:content/jcr:title")    String jcrColonContentJcrColonTitle,@QueryParam("jcr:content/logLevel")    String jcrColonContentLogLevel,@QueryParam("jcr:content/noStatusUpdate")    Boolean jcrColonContentNoStatusUpdate,@QueryParam("jcr:content/noVersioning")    Boolean jcrColonContentNoVersioning,@QueryParam("jcr:content/protocolConnectTimeout")    BigDecimal jcrColonContentProtocolConnectTimeout,@QueryParam("jcr:content/protocolHTTPConnectionClosed")    Boolean jcrColonContentProtocolHTTPConnectionClosed,@QueryParam("jcr:content/protocolHTTPExpired")    String jcrColonContentProtocolHTTPExpired,@QueryParam("jcr:content/protocolHTTPHeaders")    List<String> jcrColonContentProtocolHTTPHeaders,@QueryParam("jcr:content/protocolHTTPHeaders@TypeHint")    String jcrColonContentProtocolHTTPHeadersAtTypeHint,@QueryParam("jcr:content/protocolHTTPMethod")    String jcrColonContentProtocolHTTPMethod,@QueryParam("jcr:content/protocolHTTPSRelaxed")    Boolean jcrColonContentProtocolHTTPSRelaxed,@QueryParam("jcr:content/protocolInterface")    String jcrColonContentProtocolInterface,@QueryParam("jcr:content/protocolSocketTimeout")    BigDecimal jcrColonContentProtocolSocketTimeout,@QueryParam("jcr:content/protocolVersion")    String jcrColonContentProtocolVersion,@QueryParam("jcr:content/proxyNTLMDomain")    String jcrColonContentProxyNTLMDomain,@QueryParam("jcr:content/proxyNTLMHost")    String jcrColonContentProxyNTLMHost,@QueryParam("jcr:content/proxyHost")    String jcrColonContentProxyHost,@QueryParam("jcr:content/proxyPassword")    String jcrColonContentProxyPassword,@QueryParam("jcr:content/proxyPort")    BigDecimal jcrColonContentProxyPort,@QueryParam("jcr:content/proxyUser")    String jcrColonContentProxyUser,@QueryParam("jcr:content/queueBatchMaxSize")    BigDecimal jcrColonContentQueueBatchMaxSize,@QueryParam("jcr:content/queueBatchMode")    String jcrColonContentQueueBatchMode,@QueryParam("jcr:content/queueBatchWaitTime")    BigDecimal jcrColonContentQueueBatchWaitTime,@QueryParam("jcr:content/retryDelay")    String jcrColonContentRetryDelay,@QueryParam("jcr:content/reverseReplication")    Boolean jcrColonContentReverseReplication,@QueryParam("jcr:content/serializationType")    String jcrColonContentSerializationType,@QueryParam("jcr:content/sling:resourceType")    String jcrColonContentSlingColonResourceType,@QueryParam("jcr:content/ssl")    String jcrColonContentSsl,@QueryParam("jcr:content/transportNTLMDomain")    String jcrColonContentTransportNTLMDomain,@QueryParam("jcr:content/transportNTLMHost")    String jcrColonContentTransportNTLMHost,@QueryParam("jcr:content/transportPassword")    String jcrColonContentTransportPassword,@QueryParam("jcr:content/transportUri")    String jcrColonContentTransportUri,@QueryParam("jcr:content/transportUser")    String jcrColonContentTransportUser,@QueryParam("jcr:content/triggerDistribute")    Boolean jcrColonContentTriggerDistribute,@QueryParam("jcr:content/triggerModified")    Boolean jcrColonContentTriggerModified,@QueryParam("jcr:content/triggerOnOffTime")    Boolean jcrColonContentTriggerOnOffTime,@QueryParam("jcr:content/triggerReceive")    Boolean jcrColonContentTriggerReceive,@QueryParam("jcr:content/triggerSpecific")    Boolean jcrColonContentTriggerSpecific,@QueryParam("jcr:content/userId")    String jcrColonContentUserId,@QueryParam("jcr:primaryType")    String jcrColonPrimaryType,@QueryParam(":operation")    String colonOperation) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/replication/treeactivation.html")
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response postTreeActivation(@QueryParam("ignoredeactivated") @NotNull    Boolean ignoredeactivated,@QueryParam("onlymodified") @NotNull    Boolean onlymodified,@QueryParam("path") @NotNull    String path) {
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
    public Response postTruststorePKCS12( @FormParam(value = "truststore.p12") InputStream truststoreP12InputStream) {
        return Response.ok().entity("magic!").build();
    }
}
