package org.openapitools.api;

import java.math.BigDecimal;

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
@Path("/bin/querybuilder.json")
@Api(description = "the bin API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-17T02:15:42.417242947Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BinApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response getQuery(@QueryParam("path") @NotNull   String path,@QueryParam("p.limit") @NotNull   BigDecimal pLimit,@QueryParam("1_property") @NotNull   String _1property,@QueryParam("1_property.value") @NotNull   String _1propertyValue) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response postQuery(@QueryParam("path") @NotNull   String path,@QueryParam("p.limit") @NotNull   BigDecimal pLimit,@QueryParam("1_property") @NotNull   String _1property,@QueryParam("1_property.value") @NotNull   String _1propertyValue) {
        return Response.ok().entity("magic!").build();
    }
}
