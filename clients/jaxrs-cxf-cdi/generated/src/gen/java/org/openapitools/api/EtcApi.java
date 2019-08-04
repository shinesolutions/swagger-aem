package org.openapitools.api;

import java.math.BigDecimal;
import java.io.File;
import org.openapitools.api.EtcApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/etc")
@RequestScoped

@Api(description = "the etc API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-08-04T23:41:53.293Z[GMT]")

public class EtcApi  {

  @Context SecurityContext securityContext;

  @Inject EtcApiService delegate;


    @DELETE
    @Path("/replication/agents.{runmode}/{name}")
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response deleteAgent(@ApiParam(value = "",required=true) @PathParam("runmode") String runmode, @ApiParam(value = "",required=true) @PathParam("name") String name) {
        return delegate.deleteAgent(runmode, name, securityContext);
    }

    @GET
    @Path("/replication/agents.{runmode}/{name}")
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response getAgent(@ApiParam(value = "",required=true) @PathParam("runmode") String runmode, @ApiParam(value = "",required=true) @PathParam("name") String name) {
        return delegate.getAgent(runmode, name, securityContext);
    }

    @GET
    @Path("/replication/agents.{runmode}.-1.json")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getAgents(@ApiParam(value = "",required=true) @PathParam("runmode") String runmode) {
        return delegate.getAgents(runmode, securityContext);
    }

    @GET
    @Path("/packages/{group}/{name}-{version}.zip")
    
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "", notes = "", response = File.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = File.class) })
    public Response getPackage(@ApiParam(value = "",required=true) @PathParam("group") String group, @ApiParam(value = "",required=true) @PathParam("name") String name, @ApiParam(value = "",required=true) @PathParam("version") String version) {
        return delegate.getPackage(group, name, version, securityContext);
    }

    @GET
    @Path("/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getPackageFilter(@ApiParam(value = "",required=true) @PathParam("group") String group, @ApiParam(value = "",required=true) @PathParam("name") String name, @ApiParam(value = "",required=true) @PathParam("version") String version) {
        return delegate.getPackageFilter(group, name, version, securityContext);
    }

    @GET
    @Path("/truststore/truststore.p12")
    
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "", notes = "", response = File.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = File.class) })
    public Response getTruststore() {
        return delegate.getTruststore(securityContext);
    }

    @POST
    @Path("/replication/agents.{runmode}/{name}")
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postAgent(@ApiParam(value = "",required=true) @PathParam("runmode") String runmode, @ApiParam(value = "",required=true) @PathParam("name") String name,  @ApiParam(value = "")  @QueryParam("jcr:content/cq:distribute") Boolean jcrColonContentSlashCqColonDistribute,  @ApiParam(value = "")  @QueryParam("jcr:content/cq:distribute@TypeHint") String jcrColonContentSlashCqColonDistributeAtTypeHint,  @ApiParam(value = "")  @QueryParam("jcr:content/cq:name") String jcrColonContentSlashCqColonName,  @ApiParam(value = "")  @QueryParam("jcr:content/cq:template") String jcrColonContentSlashCqColonTemplate,  @ApiParam(value = "")  @QueryParam("jcr:content/enabled") Boolean jcrColonContentSlashEnabled,  @ApiParam(value = "")  @QueryParam("jcr:content/jcr:description") String jcrColonContentSlashJcrColonDescription,  @ApiParam(value = "")  @QueryParam("jcr:content/jcr:lastModified") String jcrColonContentSlashJcrColonLastModified,  @ApiParam(value = "")  @QueryParam("jcr:content/jcr:lastModifiedBy") String jcrColonContentSlashJcrColonLastModifiedBy,  @ApiParam(value = "")  @QueryParam("jcr:content/jcr:mixinTypes") String jcrColonContentSlashJcrColonMixinTypes,  @ApiParam(value = "")  @QueryParam("jcr:content/jcr:title") String jcrColonContentSlashJcrColonTitle,  @ApiParam(value = "")  @QueryParam("jcr:content/logLevel") String jcrColonContentSlashLogLevel,  @ApiParam(value = "")  @QueryParam("jcr:content/noStatusUpdate") Boolean jcrColonContentSlashNoStatusUpdate,  @ApiParam(value = "")  @QueryParam("jcr:content/noVersioning") Boolean jcrColonContentSlashNoVersioning,  @ApiParam(value = "")  @QueryParam("jcr:content/protocolConnectTimeout") BigDecimal jcrColonContentSlashProtocolConnectTimeout,  @ApiParam(value = "")  @QueryParam("jcr:content/protocolHTTPConnectionClosed") Boolean jcrColonContentSlashProtocolHTTPConnectionClosed,  @ApiParam(value = "")  @QueryParam("jcr:content/protocolHTTPExpired") String jcrColonContentSlashProtocolHTTPExpired,  @ApiParam(value = "")  @QueryParam("jcr:content/protocolHTTPHeaders") List<String> jcrColonContentSlashProtocolHTTPHeaders,  @ApiParam(value = "")  @QueryParam("jcr:content/protocolHTTPHeaders@TypeHint") String jcrColonContentSlashProtocolHTTPHeadersAtTypeHint,  @ApiParam(value = "")  @QueryParam("jcr:content/protocolHTTPMethod") String jcrColonContentSlashProtocolHTTPMethod,  @ApiParam(value = "")  @QueryParam("jcr:content/protocolHTTPSRelaxed") Boolean jcrColonContentSlashProtocolHTTPSRelaxed,  @ApiParam(value = "")  @QueryParam("jcr:content/protocolInterface") String jcrColonContentSlashProtocolInterface,  @ApiParam(value = "")  @QueryParam("jcr:content/protocolSocketTimeout") BigDecimal jcrColonContentSlashProtocolSocketTimeout,  @ApiParam(value = "")  @QueryParam("jcr:content/protocolVersion") String jcrColonContentSlashProtocolVersion,  @ApiParam(value = "")  @QueryParam("jcr:content/proxyNTLMDomain") String jcrColonContentSlashProxyNTLMDomain,  @ApiParam(value = "")  @QueryParam("jcr:content/proxyNTLMHost") String jcrColonContentSlashProxyNTLMHost,  @ApiParam(value = "")  @QueryParam("jcr:content/proxyHost") String jcrColonContentSlashProxyHost,  @ApiParam(value = "")  @QueryParam("jcr:content/proxyPassword") String jcrColonContentSlashProxyPassword,  @ApiParam(value = "")  @QueryParam("jcr:content/proxyPort") BigDecimal jcrColonContentSlashProxyPort,  @ApiParam(value = "")  @QueryParam("jcr:content/proxyUser") String jcrColonContentSlashProxyUser,  @ApiParam(value = "")  @QueryParam("jcr:content/queueBatchMaxSize") BigDecimal jcrColonContentSlashQueueBatchMaxSize,  @ApiParam(value = "")  @QueryParam("jcr:content/queueBatchMode") String jcrColonContentSlashQueueBatchMode,  @ApiParam(value = "")  @QueryParam("jcr:content/queueBatchWaitTime") BigDecimal jcrColonContentSlashQueueBatchWaitTime,  @ApiParam(value = "")  @QueryParam("jcr:content/retryDelay") String jcrColonContentSlashRetryDelay,  @ApiParam(value = "")  @QueryParam("jcr:content/reverseReplication") Boolean jcrColonContentSlashReverseReplication,  @ApiParam(value = "")  @QueryParam("jcr:content/serializationType") String jcrColonContentSlashSerializationType,  @ApiParam(value = "")  @QueryParam("jcr:content/sling:resourceType") String jcrColonContentSlashSlingColonResourceType,  @ApiParam(value = "")  @QueryParam("jcr:content/ssl") String jcrColonContentSlashSsl,  @ApiParam(value = "")  @QueryParam("jcr:content/transportNTLMDomain") String jcrColonContentSlashTransportNTLMDomain,  @ApiParam(value = "")  @QueryParam("jcr:content/transportNTLMHost") String jcrColonContentSlashTransportNTLMHost,  @ApiParam(value = "")  @QueryParam("jcr:content/transportPassword") String jcrColonContentSlashTransportPassword,  @ApiParam(value = "")  @QueryParam("jcr:content/transportUri") String jcrColonContentSlashTransportUri,  @ApiParam(value = "")  @QueryParam("jcr:content/transportUser") String jcrColonContentSlashTransportUser,  @ApiParam(value = "")  @QueryParam("jcr:content/triggerDistribute") Boolean jcrColonContentSlashTriggerDistribute,  @ApiParam(value = "")  @QueryParam("jcr:content/triggerModified") Boolean jcrColonContentSlashTriggerModified,  @ApiParam(value = "")  @QueryParam("jcr:content/triggerOnOffTime") Boolean jcrColonContentSlashTriggerOnOffTime,  @ApiParam(value = "")  @QueryParam("jcr:content/triggerReceive") Boolean jcrColonContentSlashTriggerReceive,  @ApiParam(value = "")  @QueryParam("jcr:content/triggerSpecific") Boolean jcrColonContentSlashTriggerSpecific,  @ApiParam(value = "")  @QueryParam("jcr:content/userId") String jcrColonContentSlashUserId,  @ApiParam(value = "")  @QueryParam("jcr:primaryType") String jcrColonPrimaryType,  @ApiParam(value = "")  @QueryParam(":operation") String colonOperation) {
        return delegate.postAgent(runmode, name, jcrColonContentSlashCqColonDistribute, jcrColonContentSlashCqColonDistributeAtTypeHint, jcrColonContentSlashCqColonName, jcrColonContentSlashCqColonTemplate, jcrColonContentSlashEnabled, jcrColonContentSlashJcrColonDescription, jcrColonContentSlashJcrColonLastModified, jcrColonContentSlashJcrColonLastModifiedBy, jcrColonContentSlashJcrColonMixinTypes, jcrColonContentSlashJcrColonTitle, jcrColonContentSlashLogLevel, jcrColonContentSlashNoStatusUpdate, jcrColonContentSlashNoVersioning, jcrColonContentSlashProtocolConnectTimeout, jcrColonContentSlashProtocolHTTPConnectionClosed, jcrColonContentSlashProtocolHTTPExpired, jcrColonContentSlashProtocolHTTPHeaders, jcrColonContentSlashProtocolHTTPHeadersAtTypeHint, jcrColonContentSlashProtocolHTTPMethod, jcrColonContentSlashProtocolHTTPSRelaxed, jcrColonContentSlashProtocolInterface, jcrColonContentSlashProtocolSocketTimeout, jcrColonContentSlashProtocolVersion, jcrColonContentSlashProxyNTLMDomain, jcrColonContentSlashProxyNTLMHost, jcrColonContentSlashProxyHost, jcrColonContentSlashProxyPassword, jcrColonContentSlashProxyPort, jcrColonContentSlashProxyUser, jcrColonContentSlashQueueBatchMaxSize, jcrColonContentSlashQueueBatchMode, jcrColonContentSlashQueueBatchWaitTime, jcrColonContentSlashRetryDelay, jcrColonContentSlashReverseReplication, jcrColonContentSlashSerializationType, jcrColonContentSlashSlingColonResourceType, jcrColonContentSlashSsl, jcrColonContentSlashTransportNTLMDomain, jcrColonContentSlashTransportNTLMHost, jcrColonContentSlashTransportPassword, jcrColonContentSlashTransportUri, jcrColonContentSlashTransportUser, jcrColonContentSlashTriggerDistribute, jcrColonContentSlashTriggerModified, jcrColonContentSlashTriggerOnOffTime, jcrColonContentSlashTriggerReceive, jcrColonContentSlashTriggerSpecific, jcrColonContentSlashUserId, jcrColonPrimaryType, colonOperation, securityContext);
    }

    @POST
    @Path("/replication/treeactivation.html")
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postTreeActivation( @NotNull @ApiParam(value = "",required=true)  @QueryParam("ignoredeactivated") Boolean ignoredeactivated,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("onlymodified") Boolean onlymodified,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("path") String path) {
        return delegate.postTreeActivation(ignoredeactivated, onlymodified, path, securityContext);
    }

    @POST
    @Path("/truststore")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postTruststorePKCS12( @Multipart(value = "truststore.p12", required = false) InputStream truststoreP12InputStream, @Multipart(value = "truststore.p12" , required = false) Attachment truststoreP12Detail) {
        return delegate.postTruststorePKCS12(truststoreP12InputStream, truststoreP12Detail, securityContext);
    }
}
