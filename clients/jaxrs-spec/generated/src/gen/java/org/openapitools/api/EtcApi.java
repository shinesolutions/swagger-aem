package org.openapitools.api;

import java.math.BigDecimal;
import java.io.File;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/etc")
@Api(description = "the etc API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-08-04T23:42:15.912Z[GMT]")
public class EtcApi {

    @DELETE
    @Path("/replication/agents.{runmode}/{name}")
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
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
    }, tags={ "sling",  })
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
    }, tags={ "sling",  })
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
    }, tags={ "sling",  })
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
    }, tags={ "sling",  })
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
    }, tags={ "sling",  })
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
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response postAgent(@PathParam("runmode") String runmode,@PathParam("name") String name,@QueryParam("jcr:content/cq:distribute")    Boolean jcrColonContentSlashCqColonDistribute,@QueryParam("jcr:content/cq:distribute@TypeHint")    String jcrColonContentSlashCqColonDistributeAtTypeHint,@QueryParam("jcr:content/cq:name")    String jcrColonContentSlashCqColonName,@QueryParam("jcr:content/cq:template")    String jcrColonContentSlashCqColonTemplate,@QueryParam("jcr:content/enabled")    Boolean jcrColonContentSlashEnabled,@QueryParam("jcr:content/jcr:description")    String jcrColonContentSlashJcrColonDescription,@QueryParam("jcr:content/jcr:lastModified")    String jcrColonContentSlashJcrColonLastModified,@QueryParam("jcr:content/jcr:lastModifiedBy")    String jcrColonContentSlashJcrColonLastModifiedBy,@QueryParam("jcr:content/jcr:mixinTypes")    String jcrColonContentSlashJcrColonMixinTypes,@QueryParam("jcr:content/jcr:title")    String jcrColonContentSlashJcrColonTitle,@QueryParam("jcr:content/logLevel")    String jcrColonContentSlashLogLevel,@QueryParam("jcr:content/noStatusUpdate")    Boolean jcrColonContentSlashNoStatusUpdate,@QueryParam("jcr:content/noVersioning")    Boolean jcrColonContentSlashNoVersioning,@QueryParam("jcr:content/protocolConnectTimeout")    BigDecimal jcrColonContentSlashProtocolConnectTimeout,@QueryParam("jcr:content/protocolHTTPConnectionClosed")    Boolean jcrColonContentSlashProtocolHTTPConnectionClosed,@QueryParam("jcr:content/protocolHTTPExpired")    String jcrColonContentSlashProtocolHTTPExpired,@QueryParam("jcr:content/protocolHTTPHeaders")    List<String> jcrColonContentSlashProtocolHTTPHeaders,@QueryParam("jcr:content/protocolHTTPHeaders@TypeHint")    String jcrColonContentSlashProtocolHTTPHeadersAtTypeHint,@QueryParam("jcr:content/protocolHTTPMethod")    String jcrColonContentSlashProtocolHTTPMethod,@QueryParam("jcr:content/protocolHTTPSRelaxed")    Boolean jcrColonContentSlashProtocolHTTPSRelaxed,@QueryParam("jcr:content/protocolInterface")    String jcrColonContentSlashProtocolInterface,@QueryParam("jcr:content/protocolSocketTimeout")    BigDecimal jcrColonContentSlashProtocolSocketTimeout,@QueryParam("jcr:content/protocolVersion")    String jcrColonContentSlashProtocolVersion,@QueryParam("jcr:content/proxyNTLMDomain")    String jcrColonContentSlashProxyNTLMDomain,@QueryParam("jcr:content/proxyNTLMHost")    String jcrColonContentSlashProxyNTLMHost,@QueryParam("jcr:content/proxyHost")    String jcrColonContentSlashProxyHost,@QueryParam("jcr:content/proxyPassword")    String jcrColonContentSlashProxyPassword,@QueryParam("jcr:content/proxyPort")    BigDecimal jcrColonContentSlashProxyPort,@QueryParam("jcr:content/proxyUser")    String jcrColonContentSlashProxyUser,@QueryParam("jcr:content/queueBatchMaxSize")    BigDecimal jcrColonContentSlashQueueBatchMaxSize,@QueryParam("jcr:content/queueBatchMode")    String jcrColonContentSlashQueueBatchMode,@QueryParam("jcr:content/queueBatchWaitTime")    BigDecimal jcrColonContentSlashQueueBatchWaitTime,@QueryParam("jcr:content/retryDelay")    String jcrColonContentSlashRetryDelay,@QueryParam("jcr:content/reverseReplication")    Boolean jcrColonContentSlashReverseReplication,@QueryParam("jcr:content/serializationType")    String jcrColonContentSlashSerializationType,@QueryParam("jcr:content/sling:resourceType")    String jcrColonContentSlashSlingColonResourceType,@QueryParam("jcr:content/ssl")    String jcrColonContentSlashSsl,@QueryParam("jcr:content/transportNTLMDomain")    String jcrColonContentSlashTransportNTLMDomain,@QueryParam("jcr:content/transportNTLMHost")    String jcrColonContentSlashTransportNTLMHost,@QueryParam("jcr:content/transportPassword")    String jcrColonContentSlashTransportPassword,@QueryParam("jcr:content/transportUri")    String jcrColonContentSlashTransportUri,@QueryParam("jcr:content/transportUser")    String jcrColonContentSlashTransportUser,@QueryParam("jcr:content/triggerDistribute")    Boolean jcrColonContentSlashTriggerDistribute,@QueryParam("jcr:content/triggerModified")    Boolean jcrColonContentSlashTriggerModified,@QueryParam("jcr:content/triggerOnOffTime")    Boolean jcrColonContentSlashTriggerOnOffTime,@QueryParam("jcr:content/triggerReceive")    Boolean jcrColonContentSlashTriggerReceive,@QueryParam("jcr:content/triggerSpecific")    Boolean jcrColonContentSlashTriggerSpecific,@QueryParam("jcr:content/userId")    String jcrColonContentSlashUserId,@QueryParam("jcr:primaryType")    String jcrColonPrimaryType,@QueryParam(":operation")    String colonOperation) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/replication/treeactivation.html")
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
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
    public Response postTruststorePKCS12( @FormParam(value = "truststore.p12") InputStream truststoreP12InputStream,
   @FormParam(value = "truststore.p12") Attachment truststoreP12Detail) {
        return Response.ok().entity("magic!").build();
    }
}
