package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.PathApiService;
import org.openapitools.api.factories.PathApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/{path}")


@io.swagger.annotations.Api(description = "the {path} API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-04T23:41:25.207Z[GMT]")
public class PathApi  {
   private final PathApiService delegate = PathApiServiceFactory.getPathApi();

    @DELETE
    @Path("/{name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response deleteNode(@ApiParam(value = "",required=true) @PathParam("path") String path
,@ApiParam(value = "",required=true) @PathParam("name") String name
)
    throws NotFoundException {
        return delegate.deleteNode(path,name);
    }
    @GET
    @Path("/{name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response getNode(@ApiParam(value = "",required=true) @PathParam("path") String path
,@ApiParam(value = "",required=true) @PathParam("name") String name
)
    throws NotFoundException {
        return delegate.getNode(path,name);
    }
    @POST
    @Path("/{name}")
    @Consumes({ "multipart/form-data" })
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postNode(@ApiParam(value = "",required=true) @PathParam("path") String path
,@ApiParam(value = "",required=true) @PathParam("name") String name
,@ApiParam(value = "") @QueryParam(":operation") String colonOperation
,@ApiParam(value = "") @QueryParam("deleteAuthorizable") String deleteAuthorizable
,
            @FormDataParam("file") InputStream fileInputStream,
            @FormDataParam("file") FileInfo fileDetail
)
    throws NotFoundException {
        return delegate.postNode(path,name,colonOperation,deleteAuthorizable,fileInputStream, fileDetail);
    }
    @POST
    @Path("/{name}.rw.html")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postNodeRw(@ApiParam(value = "",required=true) @PathParam("path") String path
,@ApiParam(value = "",required=true) @PathParam("name") String name
,@ApiParam(value = "") @QueryParam("addMembers") String addMembers
)
    throws NotFoundException {
        return delegate.postNodeRw(path,name,addMembers);
    }
    @POST
    @Path("/")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postPath(@ApiParam(value = "",required=true) @PathParam("path") String path
,@ApiParam(value = "",required=true) @QueryParam("jcr:primaryType") String jcrColonPrimaryType
,@ApiParam(value = "",required=true) @QueryParam(":name") String colonName
)
    throws NotFoundException {
        return delegate.postPath(path,jcrColonPrimaryType,colonName);
    }
}
