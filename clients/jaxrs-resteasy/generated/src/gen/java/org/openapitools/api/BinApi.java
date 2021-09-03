package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.BinApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.math.BigDecimal;

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

@Path("/bin/querybuilder.json")


@io.swagger.annotations.Api(description = "the bin API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2021-09-03T15:25:57.989+10:00[Australia/Melbourne]")
public class BinApi  {

    @Inject BinApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getQuery( @NotNull  @QueryParam("path") String path, @NotNull  @QueryParam("p.limit") BigDecimal pLimit, @NotNull  @QueryParam("1_property") String _1property, @NotNull  @QueryParam("1_property.value") String _1propertyValue,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getQuery(path,pLimit,_1property,_1propertyValue,securityContext);
    }
    @POST
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postQuery( @NotNull  @QueryParam("path") String path, @NotNull  @QueryParam("p.limit") BigDecimal pLimit, @NotNull  @QueryParam("1_property") String _1property, @NotNull  @QueryParam("1_property.value") String _1propertyValue,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postQuery(path,pLimit,_1property,_1propertyValue,securityContext);
    }
}
