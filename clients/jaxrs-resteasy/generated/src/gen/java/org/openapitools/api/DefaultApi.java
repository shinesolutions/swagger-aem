package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.DefaultApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.KeystoreInfo;

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

@Path("")


@io.swagger.annotations.Api(description = "the default API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-17T07:13:10.689769688Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DefaultApi  {

    @Inject DefaultApiService service;

    @DELETE
    @Path("/{path}/{name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response deleteNode( @PathParam("path") String path, @PathParam("name") String name,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.deleteNode(path,name,securityContext);
    }
    @GET
    @Path("/{intermediatePath}/{authorizableId}.ks.json")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = KeystoreInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getAuthorizableKeystore( @PathParam("intermediatePath") String intermediatePath, @PathParam("authorizableId") String authorizableId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getAuthorizableKeystore(intermediatePath,authorizableId,securityContext);
    }
    @GET
    @Path("/{intermediatePath}/{authorizableId}/keystore/store.p12")
    
    @Produces({ "application/octet-stream" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = File.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = File.class) })
    public Response getKeystore( @PathParam("intermediatePath") String intermediatePath, @PathParam("authorizableId") String authorizableId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getKeystore(intermediatePath,authorizableId,securityContext);
    }
    @GET
    @Path("/{path}/{name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response getNode( @PathParam("path") String path, @PathParam("name") String name,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getNode(path,name,securityContext);
    }
    @POST
    @Path("/{intermediatePath}/{authorizableId}.ks.html")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = KeystoreInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postAuthorizableKeystore(MultipartFormDataInput input, @PathParam("intermediatePath") String intermediatePath, @PathParam("authorizableId") String authorizableId, @QueryParam(":operation") String operation, @QueryParam("currentPassword") String currentPassword, @QueryParam("newPassword") String newPassword, @QueryParam("rePassword") String rePassword, @QueryParam("keyPassword") String keyPassword, @QueryParam("keyStorePass") String keyStorePass, @QueryParam("alias") String alias, @QueryParam("newAlias") String newAlias, @QueryParam("removeAlias") String removeAlias,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postAuthorizableKeystore(input,intermediatePath,authorizableId,operation,currentPassword,newPassword,rePassword,keyPassword,keyStorePass,alias,newAlias,removeAlias,securityContext);
    }
    @POST
    @Path("/{path}/{name}")
    @Consumes({ "multipart/form-data" })
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postNode(MultipartFormDataInput input, @PathParam("path") String path, @PathParam("name") String name, @QueryParam(":operation") String operation, @QueryParam("deleteAuthorizable") String deleteAuthorizable,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postNode(input,path,name,operation,deleteAuthorizable,securityContext);
    }
    @POST
    @Path("/{path}/{name}.rw.html")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postNodeRw( @PathParam("path") String path, @PathParam("name") String name, @QueryParam("addMembers") String addMembers,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postNodeRw(path,name,addMembers,securityContext);
    }
    @POST
    @Path("/{path}/")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postPath( @PathParam("path") String path, @NotNull @QueryParam("jcr:primaryType") String jcrPrimaryType, @NotNull @QueryParam(":name") String name,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postPath(path,jcrPrimaryType,name,securityContext);
    }
}
