package org.openapitools.api;

import java.io.File;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/{path}")
@Api(description = "the {path} API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-08-04T23:42:15.912Z[GMT]")
public class PathApi {

    @DELETE
    @Path("/{name}")
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response deleteNode(@PathParam("path") String path,@PathParam("name") String name) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{name}")
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response getNode(@PathParam("path") String path,@PathParam("name") String name) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{name}")
    @Consumes({ "multipart/form-data" })
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response postNode(@PathParam("path") String path,@PathParam("name") String name,@QueryParam(":operation")    String colonOperation,@QueryParam("deleteAuthorizable")    String deleteAuthorizable, @FormParam(value = "file") InputStream fileInputStream,
   @FormParam(value = "file") Attachment fileDetail) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{name}.rw.html")
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response postNodeRw(@PathParam("path") String path,@PathParam("name") String name,@QueryParam("addMembers")    String addMembers) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/")
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
