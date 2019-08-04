package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.BinApiService;
import org.openapitools.api.factories.BinApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.math.BigDecimal;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/bin")


@io.swagger.annotations.Api(description = "the bin API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-04T23:41:25.207Z[GMT]")
public class BinApi  {
   private final BinApiService delegate = BinApiServiceFactory.getBinApi();

    @GET
    @Path("/querybuilder.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getQuery(@ApiParam(value = "",required=true) @QueryParam("path") String path
,@ApiParam(value = "",required=true) @QueryParam("p.limit") BigDecimal pLimit
,@ApiParam(value = "",required=true) @QueryParam("1_property") String _1property
,@ApiParam(value = "",required=true) @QueryParam("1_property.value") String _1propertyValue
)
    throws NotFoundException {
        return delegate.getQuery(path,pLimit,_1property,_1propertyValue);
    }
    @POST
    @Path("/querybuilder.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postQuery(@ApiParam(value = "",required=true) @QueryParam("path") String path
,@ApiParam(value = "",required=true) @QueryParam("p.limit") BigDecimal pLimit
,@ApiParam(value = "",required=true) @QueryParam("1_property") String _1property
,@ApiParam(value = "",required=true) @QueryParam("1_property.value") String _1propertyValue
)
    throws NotFoundException {
        return delegate.postQuery(path,pLimit,_1property,_1propertyValue);
    }
}
