package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.SystemApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.BundleInfo;
import org.openapitools.model.SamlConfigurationInfo;

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

@Path("/system")


@io.swagger.annotations.Api(description = "the system API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-09-03T15:25:57.989+10:00[Australia/Melbourne]")
public class SystemApi  {

    @Inject SystemApiService service;

    @GET
    @Path("/health")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "custom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getAemHealthCheck(  @QueryParam("tags") String tags,  @QueryParam("combineTagsOr") Boolean combineTagsOr,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAemHealthCheck(tags,combineTagsOr,securityContext);
    }
    @GET
    @Path("/console/status-productinfo.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "console", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class, responseContainer = "List") })
    public Response getAemProductInfo(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAemProductInfo(securityContext);
    }
    @GET
    @Path("/console/bundles/{name}.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = BundleInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "console", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved bundle info", response = BundleInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getBundleInfo( @PathParam("name") String name,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getBundleInfo(name,securityContext);
    }
    @GET
    @Path("/console/configMgr")
    
    @Produces({ "text/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "console", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 5XX, message = "Unexpected error.", response = Void.class) })
    public Response getConfigMgr(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getConfigMgr(securityContext);
    }
    @POST
    @Path("/console/bundles/{name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "console", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postBundle( @PathParam("name") String name, @NotNull  @QueryParam("action") String action,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postBundle(name,action,securityContext);
    }
    @POST
    @Path("/console/jmx/com.adobe.granite:type=Repository/op/{action}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "console", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postJmxRepository( @PathParam("action") String action,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postJmxRepository(action,securityContext);
    }
    @POST
    @Path("/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = SamlConfigurationInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "console", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved AEM SAML Configuration", response = SamlConfigurationInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 302, message = "Default response", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postSamlConfiguration(  @QueryParam("post") Boolean post,  @QueryParam("apply") Boolean apply,  @QueryParam("delete") Boolean delete,  @QueryParam("action") String action,  @QueryParam("$location") String $location,  @QueryParam("path") List<String> path,  @QueryParam("service.ranking") Integer serviceRanking,  @QueryParam("idpUrl") String idpUrl,  @QueryParam("idpCertAlias") String idpCertAlias,  @QueryParam("idpHttpRedirect") Boolean idpHttpRedirect,  @QueryParam("serviceProviderEntityId") String serviceProviderEntityId,  @QueryParam("assertionConsumerServiceURL") String assertionConsumerServiceURL,  @QueryParam("spPrivateKeyAlias") String spPrivateKeyAlias,  @QueryParam("keyStorePassword") String keyStorePassword,  @QueryParam("defaultRedirectUrl") String defaultRedirectUrl,  @QueryParam("userIDAttribute") String userIDAttribute,  @QueryParam("useEncryption") Boolean useEncryption,  @QueryParam("createUser") Boolean createUser,  @QueryParam("addGroupMemberships") Boolean addGroupMemberships,  @QueryParam("groupMembershipAttribute") String groupMembershipAttribute,  @QueryParam("defaultGroups") List<String> defaultGroups,  @QueryParam("nameIdFormat") String nameIdFormat,  @QueryParam("synchronizeAttributes") List<String> synchronizeAttributes,  @QueryParam("handleLogout") Boolean handleLogout,  @QueryParam("logoutUrl") String logoutUrl,  @QueryParam("clockTolerance") Integer clockTolerance,  @QueryParam("digestMethod") String digestMethod,  @QueryParam("signatureMethod") String signatureMethod,  @QueryParam("userIntermediatePath") String userIntermediatePath,  @QueryParam("propertylist") List<String> propertylist,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postSamlConfiguration(post,apply,delete,action,$location,path,serviceRanking,idpUrl,idpCertAlias,idpHttpRedirect,serviceProviderEntityId,assertionConsumerServiceURL,spPrivateKeyAlias,keyStorePassword,defaultRedirectUrl,userIDAttribute,useEncryption,createUser,addGroupMemberships,groupMembershipAttribute,defaultGroups,nameIdFormat,synchronizeAttributes,handleLogout,logoutUrl,clockTolerance,digestMethod,signatureMethod,userIntermediatePath,propertylist,securityContext);
    }
}
