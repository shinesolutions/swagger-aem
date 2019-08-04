package org.openapitools.api;

import java.io.File;
import org.openapitools.api.PathApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/{path}")
@RequestScoped

@Api(description = "the {path} API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-08-04T23:41:53.293Z[GMT]")

public class PathApi  {

  @Context SecurityContext securityContext;

  @Inject PathApiService delegate;


    @DELETE
    @Path("/{name}")
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response deleteNode(@ApiParam(value = "",required=true) @PathParam("path") String path, @ApiParam(value = "",required=true) @PathParam("name") String name) {
        return delegate.deleteNode(path, name, securityContext);
    }

    @GET
    @Path("/{name}")
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response getNode(@ApiParam(value = "",required=true) @PathParam("path") String path, @ApiParam(value = "",required=true) @PathParam("name") String name) {
        return delegate.getNode(path, name, securityContext);
    }

    @POST
    @Path("/{name}")
    @Consumes({ "multipart/form-data" })
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postNode(@ApiParam(value = "",required=true) @PathParam("path") String path, @ApiParam(value = "",required=true) @PathParam("name") String name,  @ApiParam(value = "")  @QueryParam(":operation") String colonOperation,  @ApiParam(value = "")  @QueryParam("deleteAuthorizable") String deleteAuthorizable,  @Multipart(value = "file", required = false) InputStream fileInputStream, @Multipart(value = "file" , required = false) Attachment fileDetail) {
        return delegate.postNode(path, name, colonOperation, deleteAuthorizable, fileInputStream, fileDetail, securityContext);
    }

    @POST
    @Path("/{name}.rw.html")
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postNodeRw(@ApiParam(value = "",required=true) @PathParam("path") String path, @ApiParam(value = "",required=true) @PathParam("name") String name,  @ApiParam(value = "")  @QueryParam("addMembers") String addMembers) {
        return delegate.postNodeRw(path, name, addMembers, securityContext);
    }

    @POST
    @Path("/")
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postPath(@ApiParam(value = "",required=true) @PathParam("path") String path,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("jcr:primaryType") String jcrColonPrimaryType,  @NotNull @ApiParam(value = "",required=true)  @QueryParam(":name") String colonName) {
        return delegate.postPath(path, jcrColonPrimaryType, colonName, securityContext);
    }
}
