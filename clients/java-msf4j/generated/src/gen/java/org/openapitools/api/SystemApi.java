package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.SystemApiService;
import org.openapitools.api.factories.SystemApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.BundleInfo;
import org.openapitools.model.SamlConfigurationInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/system")


@io.swagger.annotations.Api(description = "the system API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-09-03T15:25:23.467+10:00[Australia/Melbourne]")
public class SystemApi  {
   private final SystemApiService delegate = SystemApiServiceFactory.getSystemApi();

    @GET
    @Path("/health")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "custom", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getAemHealthCheck(@ApiParam(value = "") @QueryParam("tags") String tags
,@ApiParam(value = "") @QueryParam("combineTagsOr") Boolean combineTagsOr
)
    throws NotFoundException {
        return delegate.getAemHealthCheck(tags,combineTagsOr);
    }
    @GET
    @Path("/console/status-productinfo.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "console", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class, responseContainer = "List") })
    public Response getAemProductInfo()
    throws NotFoundException {
        return delegate.getAemProductInfo();
    }
    @GET
    @Path("/console/bundles/{name}.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = BundleInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "console", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved bundle info", response = BundleInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = BundleInfo.class) })
    public Response getBundleInfo(@ApiParam(value = "",required=true) @PathParam("name") String name
)
    throws NotFoundException {
        return delegate.getBundleInfo(name);
    }
    @GET
    @Path("/console/configMgr")
    
    @Produces({ "text/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "console", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 5XX, message = "Unexpected error.", response = String.class) })
    public Response getConfigMgr()
    throws NotFoundException {
        return delegate.getConfigMgr();
    }
    @POST
    @Path("/console/bundles/{name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "console", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postBundle(@ApiParam(value = "",required=true) @PathParam("name") String name
,@ApiParam(value = "",required=true) @QueryParam("action") String action
)
    throws NotFoundException {
        return delegate.postBundle(name,action);
    }
    @POST
    @Path("/console/jmx/com.adobe.granite:type=Repository/op/{action}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "console", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postJmxRepository(@ApiParam(value = "",required=true) @PathParam("action") String action
)
    throws NotFoundException {
        return delegate.postJmxRepository(action);
    }
    @POST
    @Path("/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = SamlConfigurationInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "console", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved AEM SAML Configuration", response = SamlConfigurationInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 302, message = "Default response", response = SamlConfigurationInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = SamlConfigurationInfo.class) })
    public Response postSamlConfiguration(@ApiParam(value = "") @QueryParam("post") Boolean post
,@ApiParam(value = "") @QueryParam("apply") Boolean apply
,@ApiParam(value = "") @QueryParam("delete") Boolean delete
,@ApiParam(value = "") @QueryParam("action") String action
,@ApiParam(value = "") @QueryParam("$location") String $location
,@ApiParam(value = "") @QueryParam("path") List<String> path
,@ApiParam(value = "") @QueryParam("service.ranking") Integer serviceRanking
,@ApiParam(value = "") @QueryParam("idpUrl") String idpUrl
,@ApiParam(value = "") @QueryParam("idpCertAlias") String idpCertAlias
,@ApiParam(value = "") @QueryParam("idpHttpRedirect") Boolean idpHttpRedirect
,@ApiParam(value = "") @QueryParam("serviceProviderEntityId") String serviceProviderEntityId
,@ApiParam(value = "") @QueryParam("assertionConsumerServiceURL") String assertionConsumerServiceURL
,@ApiParam(value = "") @QueryParam("spPrivateKeyAlias") String spPrivateKeyAlias
,@ApiParam(value = "") @QueryParam("keyStorePassword") String keyStorePassword
,@ApiParam(value = "") @QueryParam("defaultRedirectUrl") String defaultRedirectUrl
,@ApiParam(value = "") @QueryParam("userIDAttribute") String userIDAttribute
,@ApiParam(value = "") @QueryParam("useEncryption") Boolean useEncryption
,@ApiParam(value = "") @QueryParam("createUser") Boolean createUser
,@ApiParam(value = "") @QueryParam("addGroupMemberships") Boolean addGroupMemberships
,@ApiParam(value = "") @QueryParam("groupMembershipAttribute") String groupMembershipAttribute
,@ApiParam(value = "") @QueryParam("defaultGroups") List<String> defaultGroups
,@ApiParam(value = "") @QueryParam("nameIdFormat") String nameIdFormat
,@ApiParam(value = "") @QueryParam("synchronizeAttributes") List<String> synchronizeAttributes
,@ApiParam(value = "") @QueryParam("handleLogout") Boolean handleLogout
,@ApiParam(value = "") @QueryParam("logoutUrl") String logoutUrl
,@ApiParam(value = "") @QueryParam("clockTolerance") Integer clockTolerance
,@ApiParam(value = "") @QueryParam("digestMethod") String digestMethod
,@ApiParam(value = "") @QueryParam("signatureMethod") String signatureMethod
,@ApiParam(value = "") @QueryParam("userIntermediatePath") String userIntermediatePath
,@ApiParam(value = "") @QueryParam("propertylist") List<String> propertylist
)
    throws NotFoundException {
        return delegate.postSamlConfiguration(post,apply,delete,action,$location,path,serviceRanking,idpUrl,idpCertAlias,idpHttpRedirect,serviceProviderEntityId,assertionConsumerServiceURL,spPrivateKeyAlias,keyStorePassword,defaultRedirectUrl,userIDAttribute,useEncryption,createUser,addGroupMemberships,groupMembershipAttribute,defaultGroups,nameIdFormat,synchronizeAttributes,handleLogout,logoutUrl,clockTolerance,digestMethod,signatureMethod,userIntermediatePath,propertylist);
    }
}
