package org.openapitools.api;

import java.io.File;
import org.openapitools.model.KeystoreInfo;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("")
@Api(description = "the default API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-09-03T15:26:06.461+10:00[Australia/Melbourne]")public class DefaultApi {

    @DELETE
    @Path("/{path}/{name}")
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response deleteNode(@PathParam("path") String path,@PathParam("name") String name) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{intermediatePath}/{authorizableId}.ks.json")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = KeystoreInfo.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response getAuthorizableKeystore(@PathParam("intermediatePath") String intermediatePath,@PathParam("authorizableId") String authorizableId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{intermediatePath}/{authorizableId}/keystore/store.p12")
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "", notes = "", response = File.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = File.class)
    })
    public Response getKeystore(@PathParam("intermediatePath") String intermediatePath,@PathParam("authorizableId") String authorizableId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{path}/{name}")
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response getNode(@PathParam("path") String path,@PathParam("name") String name) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{intermediatePath}/{authorizableId}.ks.html")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = KeystoreInfo.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response postAuthorizableKeystore(@PathParam("intermediatePath") String intermediatePath,@PathParam("authorizableId") String authorizableId,@QueryParam(":operation")    String colonOperation,@QueryParam("currentPassword")    String currentPassword,@QueryParam("newPassword")    String newPassword,@QueryParam("rePassword")    String rePassword,@QueryParam("keyPassword")    String keyPassword,@QueryParam("keyStorePass")    String keyStorePass,@QueryParam("alias")    String alias,@QueryParam("newAlias")    String newAlias,@QueryParam("removeAlias")    String removeAlias, @FormParam(value = "cert-chain") InputStream certChainInputStream, @FormParam(value = "pk") InputStream pkInputStream, @FormParam(value = "keyStore") InputStream keyStoreInputStream) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{path}/{name}")
    @Consumes({ "multipart/form-data" })
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response postNode(@PathParam("path") String path,@PathParam("name") String name,@QueryParam(":operation")    String colonOperation,@QueryParam("deleteAuthorizable")    String deleteAuthorizable, @FormParam(value = "file") InputStream fileInputStream) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{path}/{name}.rw.html")
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response postNodeRw(@PathParam("path") String path,@PathParam("name") String name,@QueryParam("addMembers")    String addMembers) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{path}/")
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response postPath(@PathParam("path") String path,@QueryParam("jcr:primaryType") @NotNull    String jcrColonPrimaryType,@QueryParam(":name") @NotNull    String colonName) {
        return Response.ok().entity("magic!").build();
    }
}
