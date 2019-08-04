package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.TruststoreInfo;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

@Path("/libs")


@io.swagger.annotations.Api(description = "the libs API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-04T23:42:11.561Z[GMT]")
public interface LibsApi  {
   
    @GET
    @Path("/granite/core/content/login.html")
    
    @Produces({ "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "cq", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getLoginPage(@Context SecurityContext securityContext);
    @GET
    @Path("/granite/security/truststore.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TruststoreInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved AEM Truststore info", response = TruststoreInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getTruststoreInfo(@Context SecurityContext securityContext);
    @POST
    @Path("/granite/security/post/authorizables")
    
    @Produces({ "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postAuthorizables( @NotNull @QueryParam("authorizableId") String authorizableId, @NotNull @QueryParam("intermediatePath") String intermediatePath, @QueryParam("createUser") String createUser, @QueryParam("createGroup") String createGroup, @QueryParam("rep:password") String repColonPassword, @QueryParam("profile/givenName") String profileSlashGivenName,@Context SecurityContext securityContext);
    @POST
    @Path("/granite/security/post/truststore")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postTruststore(MultipartFormDataInput input, @QueryParam(":operation") String colonOperation, @QueryParam("newPassword") String newPassword, @QueryParam("rePassword") String rePassword, @QueryParam("keyStoreType") String keyStoreType, @QueryParam("removeAlias") String removeAlias,@Context SecurityContext securityContext);
}
