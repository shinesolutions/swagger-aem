package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.CqactionsHtmlApiService;
import org.openapitools.api.factories.CqactionsHtmlApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/.cqactions.html")


@io.swagger.annotations.Api(description = "the .cqactions.html API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-09-03T15:25:23.467+10:00[Australia/Melbourne]")
public class CqactionsHtmlApi  {
   private final CqactionsHtmlApiService delegate = CqactionsHtmlApiServiceFactory.getCqactionsHtmlApi();

    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "cq", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postCqActions(@ApiParam(value = "",required=true) @QueryParam("authorizableId") String authorizableId
,@ApiParam(value = "",required=true) @QueryParam("changelog") String changelog
)
    throws NotFoundException {
        return delegate.postCqActions(authorizableId,changelog);
    }
}
