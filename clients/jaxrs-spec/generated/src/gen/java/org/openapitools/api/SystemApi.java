package org.openapitools.api;

import org.openapitools.model.BundleInfo;
import org.openapitools.model.SamlConfigurationInfo;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/system")
@Api(description = "the system API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-09-03T15:26:06.461+10:00[Australia/Melbourne]")public class SystemApi {

    @GET
    @Path("/health")
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "custom" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response getAemHealthCheck(@QueryParam("tags")    String tags,@QueryParam("combineTagsOr")    Boolean combineTagsOr) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/console/status-productinfo.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = String.class, responseContainer = "List", authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "console" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class, responseContainer = "List")
    })
    public Response getAemProductInfo() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/console/bundles/{name}.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = BundleInfo.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "console" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved bundle info", response = BundleInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response getBundleInfo(@PathParam("name") String name) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/console/configMgr")
    @Produces({ "text/xml" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "console" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 5XX, message = "Unexpected error.", response = Void.class)
    })
    public Response getConfigMgr() {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/console/bundles/{name}")
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "console" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response postBundle(@PathParam("name") String name,@QueryParam("action") @NotNull    String action) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/console/jmx/com.adobe.granite:type=Repository/op/{action}")
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "console" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response postJmxRepository(@PathParam("action") String action) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = SamlConfigurationInfo.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "console" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved AEM SAML Configuration", response = SamlConfigurationInfo.class),
        @ApiResponse(code = 302, message = "Default response", response = String.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response postSamlConfiguration(@QueryParam("post")    Boolean post,@QueryParam("apply")    Boolean apply,@QueryParam("delete")    Boolean delete,@QueryParam("action")    String action,@QueryParam("$location")    String $location,@QueryParam("path")    List<String> path,@QueryParam("service.ranking")    Integer serviceRanking,@QueryParam("idpUrl")    String idpUrl,@QueryParam("idpCertAlias")    String idpCertAlias,@QueryParam("idpHttpRedirect")    Boolean idpHttpRedirect,@QueryParam("serviceProviderEntityId")    String serviceProviderEntityId,@QueryParam("assertionConsumerServiceURL")    String assertionConsumerServiceURL,@QueryParam("spPrivateKeyAlias")    String spPrivateKeyAlias,@QueryParam("keyStorePassword")    String keyStorePassword,@QueryParam("defaultRedirectUrl")    String defaultRedirectUrl,@QueryParam("userIDAttribute")    String userIDAttribute,@QueryParam("useEncryption")    Boolean useEncryption,@QueryParam("createUser")    Boolean createUser,@QueryParam("addGroupMemberships")    Boolean addGroupMemberships,@QueryParam("groupMembershipAttribute")    String groupMembershipAttribute,@QueryParam("defaultGroups")    List<String> defaultGroups,@QueryParam("nameIdFormat")    String nameIdFormat,@QueryParam("synchronizeAttributes")    List<String> synchronizeAttributes,@QueryParam("handleLogout")    Boolean handleLogout,@QueryParam("logoutUrl")    String logoutUrl,@QueryParam("clockTolerance")    Integer clockTolerance,@QueryParam("digestMethod")    String digestMethod,@QueryParam("signatureMethod")    String signatureMethod,@QueryParam("userIntermediatePath")    String userIntermediatePath,@QueryParam("propertylist")    List<String> propertylist) {
        return Response.ok().entity("magic!").build();
    }
}
