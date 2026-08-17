package org.openapitools.api;

import java.io.File;
import org.openapitools.model.TruststoreInfo;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/libs")
@Api(description = "the libs API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-17T02:15:42.417242947Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LibsApi {

    @GET
    @Path("/granite/core/content/login.html")
    @Produces({ "text/html" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "cq" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response getLoginPage() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/granite/security/truststore.json")
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = TruststoreInfo.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved AEM Truststore info", response = TruststoreInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response getTruststoreInfo() {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/granite/security/post/authorizables")
    @Produces({ "text/html" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response postAuthorizables(@QueryParam("authorizableId") @NotNull   String authorizableId,@QueryParam("intermediatePath") @NotNull   String intermediatePath,@QueryParam("createUser")   String createUser,@QueryParam("createGroup")   String createGroup,@QueryParam("rep:password")   String repPassword,@QueryParam("profile/givenName")   String profileGivenName) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/replication/treeactivation.html")
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response postTreeActivation(@QueryParam("ignoredeactivated") @NotNull   Boolean ignoredeactivated,@QueryParam("onlymodified") @NotNull   Boolean onlymodified,@QueryParam("path") @NotNull   String path,@QueryParam("cmd") @NotNull @DefaultValue("activate")   String cmd) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/granite/security/post/truststore")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response postTruststore(@QueryParam(":operation")   String operation,@QueryParam("newPassword")   String newPassword,@QueryParam("rePassword")   String rePassword,@QueryParam("keyStoreType")   String keyStoreType,@QueryParam("removeAlias")   String removeAlias,@FormParam(value = "certificate") InputStream certificateInputStream) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/granite/security/post/sslSetup.html")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "granite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response sslSetup(@QueryParam("keystorePassword") @NotNull   String keystorePassword,@QueryParam("keystorePasswordConfirm") @NotNull   String keystorePasswordConfirm,@QueryParam("truststorePassword") @NotNull   String truststorePassword,@QueryParam("truststorePasswordConfirm") @NotNull   String truststorePasswordConfirm,@QueryParam("httpsHostname") @NotNull   String httpsHostname,@QueryParam("httpsPort") @NotNull   String httpsPort,@FormParam(value = "privatekeyFile") InputStream privatekeyFileInputStream,@FormParam(value = "certificateFile") InputStream certificateFileInputStream) {
        return Response.ok().entity("magic!").build();
    }
}
