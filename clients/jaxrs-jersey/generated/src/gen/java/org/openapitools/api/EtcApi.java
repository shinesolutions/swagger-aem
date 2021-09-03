package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.EtcApiService;
import org.openapitools.api.factories.EtcApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.math.BigDecimal;
import java.io.File;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/etc")


@io.swagger.annotations.Api(description = "the etc API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-09-03T15:25:53.422+10:00[Australia/Melbourne]")
public class EtcApi  {
   private final EtcApiService delegate;

   public EtcApi(@Context ServletConfig servletContext) {
      EtcApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("EtcApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (EtcApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = EtcApiServiceFactory.getEtcApi();
      }

      this.delegate = delegate;
   }

    @DELETE
    @Path("/replication/agents.{runmode}/{name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response deleteAgent(@ApiParam(value = "", required = true) @PathParam("runmode") @NotNull  String runmode,@ApiParam(value = "", required = true) @PathParam("name") @NotNull  String name,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAgent(runmode, name, securityContext);
    }
    @GET
    @Path("/replication/agents.{runmode}/{name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response getAgent(@ApiParam(value = "", required = true) @PathParam("runmode") @NotNull  String runmode,@ApiParam(value = "", required = true) @PathParam("name") @NotNull  String name,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAgent(runmode, name, securityContext);
    }
    @GET
    @Path("/replication/agents.{runmode}.-1.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response getAgents(@ApiParam(value = "", required = true) @PathParam("runmode") @NotNull  String runmode,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAgents(runmode, securityContext);
    }
    @GET
    @Path("/packages/{group}/{name}-{version}.zip")
    
    @Produces({ "application/octet-stream" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = File.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = File.class)
    })
    public Response getPackage(@ApiParam(value = "", required = true) @PathParam("group") @NotNull  String group,@ApiParam(value = "", required = true) @PathParam("name") @NotNull  String name,@ApiParam(value = "", required = true) @PathParam("version") @NotNull  String version,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPackage(group, name, version, securityContext);
    }
    @GET
    @Path("/packages/{group}/{name}-{version}.zip/jcr:content/vlt:definition/filter.tidy.2.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response getPackageFilter(@ApiParam(value = "", required = true) @PathParam("group") @NotNull  String group,@ApiParam(value = "", required = true) @PathParam("name") @NotNull  String name,@ApiParam(value = "", required = true) @PathParam("version") @NotNull  String version,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPackageFilter(group, name, version, securityContext);
    }
    @GET
    @Path("/truststore/truststore.p12")
    
    @Produces({ "application/octet-stream" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = File.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = File.class)
    })
    public Response getTruststore(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTruststore(securityContext);
    }
    @POST
    @Path("/replication/agents.{runmode}/{name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response postAgent(@ApiParam(value = "", required = true) @PathParam("runmode") @NotNull  String runmode,@ApiParam(value = "", required = true) @PathParam("name") @NotNull  String name,@ApiParam(value = "") @QueryParam("jcr:content/cq:distribute")  Boolean jcrColonContentCqColonDistribute,@ApiParam(value = "") @QueryParam("jcr:content/cq:distribute@TypeHint")  String jcrColonContentCqColonDistributeAtTypeHint,@ApiParam(value = "") @QueryParam("jcr:content/cq:name")  String jcrColonContentCqColonName,@ApiParam(value = "") @QueryParam("jcr:content/cq:template")  String jcrColonContentCqColonTemplate,@ApiParam(value = "") @QueryParam("jcr:content/enabled")  Boolean jcrColonContentEnabled,@ApiParam(value = "") @QueryParam("jcr:content/jcr:description")  String jcrColonContentJcrColonDescription,@ApiParam(value = "") @QueryParam("jcr:content/jcr:lastModified")  String jcrColonContentJcrColonLastModified,@ApiParam(value = "") @QueryParam("jcr:content/jcr:lastModifiedBy")  String jcrColonContentJcrColonLastModifiedBy,@ApiParam(value = "") @QueryParam("jcr:content/jcr:mixinTypes")  String jcrColonContentJcrColonMixinTypes,@ApiParam(value = "") @QueryParam("jcr:content/jcr:title")  String jcrColonContentJcrColonTitle,@ApiParam(value = "") @QueryParam("jcr:content/logLevel")  String jcrColonContentLogLevel,@ApiParam(value = "") @QueryParam("jcr:content/noStatusUpdate")  Boolean jcrColonContentNoStatusUpdate,@ApiParam(value = "") @QueryParam("jcr:content/noVersioning")  Boolean jcrColonContentNoVersioning,@ApiParam(value = "") @QueryParam("jcr:content/protocolConnectTimeout")  BigDecimal jcrColonContentProtocolConnectTimeout,@ApiParam(value = "") @QueryParam("jcr:content/protocolHTTPConnectionClosed")  Boolean jcrColonContentProtocolHTTPConnectionClosed,@ApiParam(value = "") @QueryParam("jcr:content/protocolHTTPExpired")  String jcrColonContentProtocolHTTPExpired,@ApiParam(value = "") @QueryParam("jcr:content/protocolHTTPHeaders") @Valid  List<String> jcrColonContentProtocolHTTPHeaders,@ApiParam(value = "") @QueryParam("jcr:content/protocolHTTPHeaders@TypeHint")  String jcrColonContentProtocolHTTPHeadersAtTypeHint,@ApiParam(value = "") @QueryParam("jcr:content/protocolHTTPMethod")  String jcrColonContentProtocolHTTPMethod,@ApiParam(value = "") @QueryParam("jcr:content/protocolHTTPSRelaxed")  Boolean jcrColonContentProtocolHTTPSRelaxed,@ApiParam(value = "") @QueryParam("jcr:content/protocolInterface")  String jcrColonContentProtocolInterface,@ApiParam(value = "") @QueryParam("jcr:content/protocolSocketTimeout")  BigDecimal jcrColonContentProtocolSocketTimeout,@ApiParam(value = "") @QueryParam("jcr:content/protocolVersion")  String jcrColonContentProtocolVersion,@ApiParam(value = "") @QueryParam("jcr:content/proxyNTLMDomain")  String jcrColonContentProxyNTLMDomain,@ApiParam(value = "") @QueryParam("jcr:content/proxyNTLMHost")  String jcrColonContentProxyNTLMHost,@ApiParam(value = "") @QueryParam("jcr:content/proxyHost")  String jcrColonContentProxyHost,@ApiParam(value = "") @QueryParam("jcr:content/proxyPassword")  String jcrColonContentProxyPassword,@ApiParam(value = "") @QueryParam("jcr:content/proxyPort")  BigDecimal jcrColonContentProxyPort,@ApiParam(value = "") @QueryParam("jcr:content/proxyUser")  String jcrColonContentProxyUser,@ApiParam(value = "") @QueryParam("jcr:content/queueBatchMaxSize")  BigDecimal jcrColonContentQueueBatchMaxSize,@ApiParam(value = "") @QueryParam("jcr:content/queueBatchMode")  String jcrColonContentQueueBatchMode,@ApiParam(value = "") @QueryParam("jcr:content/queueBatchWaitTime")  BigDecimal jcrColonContentQueueBatchWaitTime,@ApiParam(value = "") @QueryParam("jcr:content/retryDelay")  String jcrColonContentRetryDelay,@ApiParam(value = "") @QueryParam("jcr:content/reverseReplication")  Boolean jcrColonContentReverseReplication,@ApiParam(value = "") @QueryParam("jcr:content/serializationType")  String jcrColonContentSerializationType,@ApiParam(value = "") @QueryParam("jcr:content/sling:resourceType")  String jcrColonContentSlingColonResourceType,@ApiParam(value = "") @QueryParam("jcr:content/ssl")  String jcrColonContentSsl,@ApiParam(value = "") @QueryParam("jcr:content/transportNTLMDomain")  String jcrColonContentTransportNTLMDomain,@ApiParam(value = "") @QueryParam("jcr:content/transportNTLMHost")  String jcrColonContentTransportNTLMHost,@ApiParam(value = "") @QueryParam("jcr:content/transportPassword")  String jcrColonContentTransportPassword,@ApiParam(value = "") @QueryParam("jcr:content/transportUri")  String jcrColonContentTransportUri,@ApiParam(value = "") @QueryParam("jcr:content/transportUser")  String jcrColonContentTransportUser,@ApiParam(value = "") @QueryParam("jcr:content/triggerDistribute")  Boolean jcrColonContentTriggerDistribute,@ApiParam(value = "") @QueryParam("jcr:content/triggerModified")  Boolean jcrColonContentTriggerModified,@ApiParam(value = "") @QueryParam("jcr:content/triggerOnOffTime")  Boolean jcrColonContentTriggerOnOffTime,@ApiParam(value = "") @QueryParam("jcr:content/triggerReceive")  Boolean jcrColonContentTriggerReceive,@ApiParam(value = "") @QueryParam("jcr:content/triggerSpecific")  Boolean jcrColonContentTriggerSpecific,@ApiParam(value = "") @QueryParam("jcr:content/userId")  String jcrColonContentUserId,@ApiParam(value = "") @QueryParam("jcr:primaryType")  String jcrColonPrimaryType,@ApiParam(value = "") @QueryParam(":operation")  String colonOperation,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postAgent(runmode, name, jcrColonContentCqColonDistribute, jcrColonContentCqColonDistributeAtTypeHint, jcrColonContentCqColonName, jcrColonContentCqColonTemplate, jcrColonContentEnabled, jcrColonContentJcrColonDescription, jcrColonContentJcrColonLastModified, jcrColonContentJcrColonLastModifiedBy, jcrColonContentJcrColonMixinTypes, jcrColonContentJcrColonTitle, jcrColonContentLogLevel, jcrColonContentNoStatusUpdate, jcrColonContentNoVersioning, jcrColonContentProtocolConnectTimeout, jcrColonContentProtocolHTTPConnectionClosed, jcrColonContentProtocolHTTPExpired, jcrColonContentProtocolHTTPHeaders, jcrColonContentProtocolHTTPHeadersAtTypeHint, jcrColonContentProtocolHTTPMethod, jcrColonContentProtocolHTTPSRelaxed, jcrColonContentProtocolInterface, jcrColonContentProtocolSocketTimeout, jcrColonContentProtocolVersion, jcrColonContentProxyNTLMDomain, jcrColonContentProxyNTLMHost, jcrColonContentProxyHost, jcrColonContentProxyPassword, jcrColonContentProxyPort, jcrColonContentProxyUser, jcrColonContentQueueBatchMaxSize, jcrColonContentQueueBatchMode, jcrColonContentQueueBatchWaitTime, jcrColonContentRetryDelay, jcrColonContentReverseReplication, jcrColonContentSerializationType, jcrColonContentSlingColonResourceType, jcrColonContentSsl, jcrColonContentTransportNTLMDomain, jcrColonContentTransportNTLMHost, jcrColonContentTransportPassword, jcrColonContentTransportUri, jcrColonContentTransportUser, jcrColonContentTriggerDistribute, jcrColonContentTriggerModified, jcrColonContentTriggerOnOffTime, jcrColonContentTriggerReceive, jcrColonContentTriggerSpecific, jcrColonContentUserId, jcrColonPrimaryType, colonOperation, securityContext);
    }
    @POST
    @Path("/replication/treeactivation.html")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response postTreeActivation(@ApiParam(value = "", required = true) @QueryParam("ignoredeactivated") @NotNull  Boolean ignoredeactivated,@ApiParam(value = "", required = true) @QueryParam("onlymodified") @NotNull  Boolean onlymodified,@ApiParam(value = "", required = true) @QueryParam("path") @NotNull  String path,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postTreeActivation(ignoredeactivated, onlymodified, path, securityContext);
    }
    @POST
    @Path("/truststore")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response postTruststorePKCS12(
 @FormDataParam("truststore.p12") FormDataBodyPart truststoreP12Bodypart ,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postTruststorePKCS12(truststoreP12Bodypart, securityContext);
    }
}
