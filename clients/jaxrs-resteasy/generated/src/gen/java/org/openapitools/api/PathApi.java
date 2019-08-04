package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.PathApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;

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
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

@Path("/{path}")


@io.swagger.annotations.Api(description = "the {path} API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-04T23:42:05.073Z[GMT]")
public class PathApi  {

    @Inject PathApiService service;

    @DELETE
    @Path("/{name}")
    
    
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
    @Path("/{name}")
    
    
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
    @Path("/{name}")
    @Consumes({ "multipart/form-data" })
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postNode(MultipartFormDataInput input, @PathParam("path") String path, @PathParam("name") String name,  @QueryParam(":operation") String colonOperation,  @QueryParam("deleteAuthorizable") String deleteAuthorizable,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postNode(input,path,name,colonOperation,deleteAuthorizable,securityContext);
    }
    @POST
    @Path("/{name}.rw.html")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postNodeRw( @PathParam("path") String path, @PathParam("name") String name,  @QueryParam("addMembers") String addMembers,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postNodeRw(path,name,addMembers,securityContext);
    }
    @POST
    @Path("/")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postPath( @PathParam("path") String path, @NotNull  @QueryParam("jcr:primaryType") String jcrColonPrimaryType, @NotNull  @QueryParam(":name") String colonName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postPath(path,jcrColonPrimaryType,colonName,securityContext);
    }
}
