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

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/bin")
@RequestScoped

@Api(description = "the bin API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-08-04T23:41:53.293Z[GMT]")

public class BinApi  {

  @Context SecurityContext securityContext;

  @Inject BinApiService delegate;


    @GET
    @Path("/querybuilder.json")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getQuery( @NotNull @ApiParam(value = "",required=true)  @QueryParam("path") String path,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("p.limit") BigDecimal pLimit,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("1_property") String _1property,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("1_property.value") String _1propertyValue) {
        return delegate.getQuery(path, pLimit, _1property, _1propertyValue, securityContext);
    }

    @POST
    @Path("/querybuilder.json")
    
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
