package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.KeystoreInfo;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

@Path("/{intermediatePath}")


@io.swagger.annotations.Api(description = "the {intermediatePath} API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-04T23:42:11.561Z[GMT]")
public interface IntermediatePathApi  {
   
    @GET
    @Path("/{authorizableId}.ks.json")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = KeystoreInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getAuthorizableKeystore( @PathParam("intermediatePath") String intermediatePath, @PathParam("authorizableId") String authorizableId,@Context SecurityContext securityContext);
    @GET
    @Path("/{authorizableId}/keystore/store.p12")
    
    @Produces({ "application/octet-stream" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = File.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = File.class) })
    public Response getKeystore( @PathParam("intermediatePath") String intermediatePath, @PathParam("authorizableId") String authorizableId,@Context SecurityContext securityContext);
    @POST
    @Path("/{authorizableId}.ks.html")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = KeystoreInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postAuthorizableKeystore(MultipartFormDataInput input, @PathParam("intermediatePath") String intermediatePath, @PathParam("authorizableId") String authorizableId, @QueryParam(":operation") String colonOperation, @QueryParam("currentPassword") String currentPassword, @QueryParam("newPassword") String newPassword, @QueryParam("rePassword") String rePassword, @QueryParam("keyPassword") String keyPassword, @QueryParam("keyStorePass") String keyStorePass, @QueryParam("alias") String alias, @QueryParam("newAlias") String newAlias, @QueryParam("removeAlias") String removeAlias,@Context SecurityContext securityContext);
}
