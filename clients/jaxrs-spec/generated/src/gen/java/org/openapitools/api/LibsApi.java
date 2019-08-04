package org.openapitools.api;

import java.io.File;
import org.openapitools.model.TruststoreInfo;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/libs")
@Api(description = "the libs API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-08-04T23:42:15.912Z[GMT]")
public class LibsApi {

    @GET
    @Path("/granite/core/content/login.html")
    @Produces({ "text/html" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "cq",  })
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
    }, tags={ "sling",  })
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
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response postAuthorizables(@QueryParam("authorizableId") @NotNull    String authorizableId,@QueryParam("intermediatePath") @NotNull    String intermediatePath,@QueryParam("createUser")    String createUser,@QueryParam("createGroup")    String createGroup,@QueryParam("rep:password")    String repColonPassword,@QueryParam("profile/givenName")    String profileSlashGivenName) {
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
    public Response postTruststore(@QueryParam(":operation")    String colonOperation,@QueryParam("newPassword")    String newPassword,@QueryParam("rePassword")    String rePassword,@QueryParam("keyStoreType")    String keyStoreType,@QueryParam("removeAlias")    String removeAlias, @FormParam(value = "certificate") InputStream certificateInputStream,
   @FormParam(value = "certificate") Attachment certificateDetail) {
        return Response.ok().entity("magic!").build();
    }
}
