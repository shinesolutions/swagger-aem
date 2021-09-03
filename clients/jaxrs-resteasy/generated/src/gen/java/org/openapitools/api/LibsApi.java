package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.LibsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.TruststoreInfo;

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
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

@Path("/libs/granite")


@io.swagger.annotations.Api(description = "the libs API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-09-03T15:25:57.989+10:00[Australia/Melbourne]")
public class LibsApi  {

    @Inject LibsApiService service;

    @GET
    @Path("/core/content/login.html")
    
    @Produces({ "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "cq", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getLoginPage(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getLoginPage(securityContext);
    }
    @GET
    @Path("/security/truststore.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TruststoreInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved AEM Truststore info", response = TruststoreInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getTruststoreInfo(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getTruststoreInfo(securityContext);
    }
    @POST
    @Path("/security/post/authorizables")
    
    @Produces({ "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postAuthorizables( @NotNull  @QueryParam("authorizableId") String authorizableId, @NotNull  @QueryParam("intermediatePath") String intermediatePath,  @QueryParam("createUser") String createUser,  @QueryParam("createGroup") String createGroup,  @QueryParam("rep:password") String repColonPassword,  @QueryParam("profile/givenName") String profileGivenName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postAuthorizables(authorizableId,intermediatePath,createUser,createGroup,repColonPassword,profileGivenName,securityContext);
    }
    @POST
    @Path("/security/post/truststore")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postTruststore(MultipartFormDataInput input,  @QueryParam(":operation") String colonOperation,  @QueryParam("newPassword") String newPassword,  @QueryParam("rePassword") String rePassword,  @QueryParam("keyStoreType") String keyStoreType,  @QueryParam("removeAlias") String removeAlias,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postTruststore(input,colonOperation,newPassword,rePassword,keyStoreType,removeAlias,securityContext);
    }
    @POST
    @Path("/security/post/sslSetup.html")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "granite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response sslSetup(MultipartFormDataInput input, @NotNull  @QueryParam("keystorePassword") String keystorePassword, @NotNull  @QueryParam("keystorePasswordConfirm") String keystorePasswordConfirm, @NotNull  @QueryParam("truststorePassword") String truststorePassword, @NotNull  @QueryParam("truststorePasswordConfirm") String truststorePasswordConfirm, @NotNull  @QueryParam("httpsHostname") String httpsHostname, @NotNull  @QueryParam("httpsPort") String httpsPort,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.sslSetup(input,keystorePassword,keystorePasswordConfirm,truststorePassword,truststorePasswordConfirm,httpsHostname,httpsPort,securityContext);
    }
}
