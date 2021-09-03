package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.api.BinApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/bin/querybuilder.json")
@RequestScoped

@Api(description = "the bin API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-09-03T15:25:48.597+10:00[Australia/Melbourne]")

public class BinApi  {

  @Context SecurityContext securityContext;

  @Inject BinApiService delegate;


    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getQuery( @NotNull @ApiParam(value = "",required=true)  @QueryParam("path") String path,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("p.limit") BigDecimal pLimit,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("1_property") String _1property,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("1_property.value") String _1propertyValue) {
        return delegate.getQuery(path, pLimit, _1property, _1propertyValue, securityContext);
    }

    @POST
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postQuery( @NotNull @ApiParam(value = "",required=true)  @QueryParam("path") String path,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("p.limit") BigDecimal pLimit,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("1_property") String _1property,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("1_property.value") String _1propertyValue) {
        return delegate.postQuery(path, pLimit, _1property, _1propertyValue, securityContext);
    }
}
