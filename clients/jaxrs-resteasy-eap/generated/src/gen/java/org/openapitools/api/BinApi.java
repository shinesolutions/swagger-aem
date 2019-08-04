package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.math.BigDecimal;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/bin")


@io.swagger.annotations.Api(description = "the bin API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-04T23:42:11.561Z[GMT]")
public interface BinApi  {
   
    @GET
    @Path("/querybuilder.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getQuery( @NotNull @QueryParam("path") String path, @NotNull @QueryParam("p.limit") BigDecimal pLimit, @NotNull @QueryParam("1_property") String _1property, @NotNull @QueryParam("1_property.value") String _1propertyValue,@Context SecurityContext securityContext);
    @POST
    @Path("/querybuilder.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postQuery( @NotNull @QueryParam("path") String path, @NotNull @QueryParam("p.limit") BigDecimal pLimit, @NotNull @QueryParam("1_property") String _1property, @NotNull @QueryParam("1_property.value") String _1propertyValue,@Context SecurityContext securityContext);
}
