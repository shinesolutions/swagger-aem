package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.api.EtcApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@Path("/etc")
@RequestScoped

@Api


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-08-17T07:13:03.808307969Z[Etc/UTC]", comments = "Generator version: 7.24.0")

public class EtcApi  {

  @Context SecurityContext securityContext;

  @Inject EtcApiService delegate;


    @DELETE
    @Path("/replication/agents.{runmode}/{name}")
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response deleteAgent(@ApiParam(value = "",required=true) @PathParam("runmode") String runmode, @ApiParam(value = "",required=true) @PathParam("name") String name) {
        return delegate.deleteAgent(runmode, name, securityContext);
    }

    @GET
    @Path("/replication/agents.{runmode}/{name}")
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
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
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getAgents(@ApiParam(value = "",required=true) @PathParam("runmode") String runmode) {
        return delegate.getAgents(runmode, securityContext);
    }

    @GET
    @Path("/packages/{group}/{name}-{version}.zip")
    
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "", notes = "", response = java.io.InputStream.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = java.io.InputStream.class) })
    public Response getPackage(@ApiParam(value = "",required=true) @PathParam("group") String group, @ApiParam(value = "",required=true) @PathParam("name") String name, @ApiParam(value = "",required=true) @PathParam("version") String version) {
        return delegate.getPackage(group, name, version, securityContext);
    }

    @GET
    @Path("/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getPackageFilter(@ApiParam(value = "",required=true) @PathParam("group") String group, @ApiParam(value = "",required=true) @PathParam("name") String name, @ApiParam(value = "",required=true) @PathParam("version") String version) {
        return delegate.getPackageFilter(group, name, version, securityContext);
    }

    @GET
    @Path("/truststore/truststore.p12")
    
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "", notes = "", response = java.io.InputStream.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = java.io.InputStream.class) })
    public Response getTruststore() {
        return delegate.getTruststore(securityContext);
    }

    @POST
    @Path("/replication/agents.{runmode}/{name}")
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postAgent(@ApiParam(value = "",required=true) @PathParam("runmode") String runmode, @ApiParam(value = "",required=true) @PathParam("name") String name, @ApiParam(value = "")  @QueryParam("jcr:content/cq:distribute") Boolean jcrContentCqDistribute, @ApiParam(value = "")  @QueryParam("jcr:content/cq:distribute@TypeHint") String jcrContentCqDistributeAtTypeHint, @ApiParam(value = "")  @QueryParam("jcr:content/cq:name") String jcrContentCqName, @ApiParam(value = "")  @QueryParam("jcr:content/cq:template") String jcrContentCqTemplate, @ApiParam(value = "")  @QueryParam("jcr:content/aliasUpdate") Boolean jcrContentAliasUpdate, @ApiParam(value = "")  @QueryParam("jcr:content/enabled") Boolean jcrContentEnabled, @ApiParam(value = "")  @QueryParam("jcr:content/jcr:description") String jcrContentJcrDescription, @ApiParam(value = "")  @QueryParam("jcr:content/jcr:lastModified") String jcrContentJcrLastModified, @ApiParam(value = "")  @QueryParam("jcr:content/jcr:lastModifiedBy") String jcrContentJcrLastModifiedBy, @ApiParam(value = "")  @QueryParam("jcr:content/jcr:mixinTypes") String jcrContentJcrMixinTypes, @ApiParam(value = "")  @QueryParam("jcr:content/jcr:title") String jcrContentJcrTitle, @ApiParam(value = "")  @QueryParam("jcr:content/logLevel") String jcrContentLogLevel, @ApiParam(value = "")  @QueryParam("jcr:content/noStatusUpdate") Boolean jcrContentNoStatusUpdate, @ApiParam(value = "")  @QueryParam("jcr:content/noVersioning") Boolean jcrContentNoVersioning, @ApiParam(value = "")  @QueryParam("jcr:content/protocolConnectTimeout") BigDecimal jcrContentProtocolConnectTimeout, @ApiParam(value = "")  @QueryParam("jcr:content/protocolHTTPConnectionClosed") Boolean jcrContentProtocolHTTPConnectionClosed, @ApiParam(value = "")  @QueryParam("jcr:content/protocolHTTPExpired") String jcrContentProtocolHTTPExpired, @ApiParam(value = "")  @QueryParam("jcr:content/protocolHTTPHeaders") List<String> jcrContentProtocolHTTPHeaders, @ApiParam(value = "")  @QueryParam("jcr:content/protocolHTTPHeaders@TypeHint") String jcrContentProtocolHTTPHeadersAtTypeHint, @ApiParam(value = "")  @QueryParam("jcr:content/protocolHTTPMethod") String jcrContentProtocolHTTPMethod, @ApiParam(value = "")  @QueryParam("jcr:content/protocolHTTPSRelaxed") Boolean jcrContentProtocolHTTPSRelaxed, @ApiParam(value = "")  @QueryParam("jcr:content/protocolInterface") String jcrContentProtocolInterface, @ApiParam(value = "")  @QueryParam("jcr:content/protocolSocketTimeout") BigDecimal jcrContentProtocolSocketTimeout, @ApiParam(value = "")  @QueryParam("jcr:content/protocolVersion") String jcrContentProtocolVersion, @ApiParam(value = "")  @QueryParam("jcr:content/proxyNTLMDomain") String jcrContentProxyNTLMDomain, @ApiParam(value = "")  @QueryParam("jcr:content/proxyNTLMHost") String jcrContentProxyNTLMHost, @ApiParam(value = "")  @QueryParam("jcr:content/proxyHost") String jcrContentProxyHost, @ApiParam(value = "")  @QueryParam("jcr:content/proxyPassword") String jcrContentProxyPassword, @ApiParam(value = "")  @QueryParam("jcr:content/proxyPort") BigDecimal jcrContentProxyPort, @ApiParam(value = "")  @QueryParam("jcr:content/proxyUser") String jcrContentProxyUser, @ApiParam(value = "")  @QueryParam("jcr:content/queueBatchMaxSize") BigDecimal jcrContentQueueBatchMaxSize, @ApiParam(value = "")  @QueryParam("jcr:content/queueBatchMode") String jcrContentQueueBatchMode, @ApiParam(value = "")  @QueryParam("jcr:content/queueBatchWaitTime") BigDecimal jcrContentQueueBatchWaitTime, @ApiParam(value = "")  @QueryParam("jcr:content/retryDelay") String jcrContentRetryDelay, @ApiParam(value = "")  @QueryParam("jcr:content/reverseReplication") Boolean jcrContentReverseReplication, @ApiParam(value = "")  @QueryParam("jcr:content/serializationType") String jcrContentSerializationType, @ApiParam(value = "")  @QueryParam("jcr:content/sling:resourceType") String jcrContentSlingResourceType, @ApiParam(value = "")  @QueryParam("jcr:content/ssl") String jcrContentSsl, @ApiParam(value = "")  @QueryParam("jcr:content/transportNTLMDomain") String jcrContentTransportNTLMDomain, @ApiParam(value = "")  @QueryParam("jcr:content/transportNTLMHost") String jcrContentTransportNTLMHost, @ApiParam(value = "")  @QueryParam("jcr:content/transportPassword") String jcrContentTransportPassword, @ApiParam(value = "")  @QueryParam("jcr:content/transportUri") String jcrContentTransportUri, @ApiParam(value = "")  @QueryParam("jcr:content/transportUser") String jcrContentTransportUser, @ApiParam(value = "")  @QueryParam("jcr:content/triggerDistribute") Boolean jcrContentTriggerDistribute, @ApiParam(value = "")  @QueryParam("jcr:content/triggerModified") Boolean jcrContentTriggerModified, @ApiParam(value = "")  @QueryParam("jcr:content/triggerOnOffTime") Boolean jcrContentTriggerOnOffTime, @ApiParam(value = "")  @QueryParam("jcr:content/triggerReceive") Boolean jcrContentTriggerReceive, @ApiParam(value = "")  @QueryParam("jcr:content/triggerSpecific") Boolean jcrContentTriggerSpecific, @ApiParam(value = "")  @QueryParam("jcr:content/userId") String jcrContentUserId, @ApiParam(value = "")  @QueryParam("jcr:primaryType") String jcrPrimaryType, @ApiParam(value = "")  @QueryParam(":operation") String operation) {
        return delegate.postAgent(runmode, name, jcrContentCqDistribute, jcrContentCqDistributeAtTypeHint, jcrContentCqName, jcrContentCqTemplate, jcrContentAliasUpdate, jcrContentEnabled, jcrContentJcrDescription, jcrContentJcrLastModified, jcrContentJcrLastModifiedBy, jcrContentJcrMixinTypes, jcrContentJcrTitle, jcrContentLogLevel, jcrContentNoStatusUpdate, jcrContentNoVersioning, jcrContentProtocolConnectTimeout, jcrContentProtocolHTTPConnectionClosed, jcrContentProtocolHTTPExpired, jcrContentProtocolHTTPHeaders, jcrContentProtocolHTTPHeadersAtTypeHint, jcrContentProtocolHTTPMethod, jcrContentProtocolHTTPSRelaxed, jcrContentProtocolInterface, jcrContentProtocolSocketTimeout, jcrContentProtocolVersion, jcrContentProxyNTLMDomain, jcrContentProxyNTLMHost, jcrContentProxyHost, jcrContentProxyPassword, jcrContentProxyPort, jcrContentProxyUser, jcrContentQueueBatchMaxSize, jcrContentQueueBatchMode, jcrContentQueueBatchWaitTime, jcrContentRetryDelay, jcrContentReverseReplication, jcrContentSerializationType, jcrContentSlingResourceType, jcrContentSsl, jcrContentTransportNTLMDomain, jcrContentTransportNTLMHost, jcrContentTransportPassword, jcrContentTransportUri, jcrContentTransportUser, jcrContentTriggerDistribute, jcrContentTriggerModified, jcrContentTriggerOnOffTime, jcrContentTriggerReceive, jcrContentTriggerSpecific, jcrContentUserId, jcrPrimaryType, operation, securityContext);
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
    public Response postTruststorePKCS12( @Multipart(value = "truststore.p12" , required = false) Attachment truststoreP12Detail) {
        return delegate.postTruststorePKCS12(truststoreP12Detail, securityContext);
    }
}
