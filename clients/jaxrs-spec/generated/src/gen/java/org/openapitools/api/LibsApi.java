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

@Path("/libs/granite")
@Api(description = "the libs API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-09-03T15:26:06.461+10:00[Australia/Melbourne]")public class LibsApi {

    @GET
    @Path("/core/content/login.html")
    @Produces({ "text/html" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "cq" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response getLoginPage() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/security/truststore.json")
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
    @Path("/security/post/authorizables")
    @Produces({ "text/html" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response postAuthorizables(@QueryParam("authorizableId") @NotNull    String authorizableId,@QueryParam("intermediatePath") @NotNull    String intermediatePath,@QueryParam("createUser")    String createUser,@QueryParam("createGroup")    String createGroup,@QueryParam("rep:password")    String repColonPassword,@QueryParam("profile/givenName")    String profileGivenName) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/security/post/truststore")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response postTruststore(@QueryParam(":operation")    String colonOperation,@QueryParam("newPassword")    String newPassword,@QueryParam("rePassword")    String rePassword,@QueryParam("keyStoreType")    String keyStoreType,@QueryParam("removeAlias")    String removeAlias, @FormParam(value = "certificate") InputStream certificateInputStream) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/security/post/sslSetup.html")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "granite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response sslSetup(@QueryParam("keystorePassword") @NotNull    String keystorePassword,@QueryParam("keystorePasswordConfirm") @NotNull    String keystorePasswordConfirm,@QueryParam("truststorePassword") @NotNull    String truststorePassword,@QueryParam("truststorePasswordConfirm") @NotNull    String truststorePasswordConfirm,@QueryParam("httpsHostname") @NotNull    String httpsHostname,@QueryParam("httpsPort") @NotNull    String httpsPort, @FormParam(value = "privatekeyFile") InputStream privatekeyFileInputStream, @FormParam(value = "certificateFile") InputStream certificateFileInputStream) {
        return Response.ok().entity("magic!").build();
    }
}
