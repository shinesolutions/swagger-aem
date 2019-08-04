package org.openapitools.api;

import java.io.File;
import org.openapitools.model.KeystoreInfo;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/{intermediatePath}")
@Api(description = "the {intermediatePath} API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-08-04T23:42:15.912Z[GMT]")
public class IntermediatePathApi {

    @GET
    @Path("/{authorizableId}.ks.json")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = KeystoreInfo.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response getAuthorizableKeystore(@PathParam("intermediatePath") String intermediatePath,@PathParam("authorizableId") String authorizableId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{authorizableId}/keystore/store.p12")
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "", notes = "", response = File.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = File.class)
    })
    public Response getKeystore(@PathParam("intermediatePath") String intermediatePath,@PathParam("authorizableId") String authorizableId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{authorizableId}.ks.html")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = KeystoreInfo.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response postAuthorizableKeystore(@PathParam("intermediatePath") String intermediatePath,@PathParam("authorizableId") String authorizableId,@QueryParam(":operation")    String colonOperation,@QueryParam("currentPassword")    String currentPassword,@QueryParam("newPassword")    String newPassword,@QueryParam("rePassword")    String rePassword,@QueryParam("keyPassword")    String keyPassword,@QueryParam("keyStorePass")    String keyStorePass,@QueryParam("alias")    String alias,@QueryParam("newAlias")    String newAlias,@QueryParam("removeAlias")    String removeAlias, @FormParam(value = "cert-chain") InputStream certChainInputStream,
   @FormParam(value = "cert-chain") Attachment certChainDetail, @FormParam(value = "pk") InputStream pkInputStream,
   @FormParam(value = "pk") Attachment pkDetail, @FormParam(value = "keyStore") InputStream keyStoreInputStream,
   @FormParam(value = "keyStore") Attachment keyStoreDetail) {
        return Response.ok().entity("magic!").build();
    }
}
