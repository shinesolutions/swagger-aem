package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.CqactionsHtmlApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


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

@Path("/.cqactions.html")


@io.swagger.annotations.Api(description = "the .cqactions.html API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-04T23:42:05.073Z[GMT]")
public class CqactionsHtmlApi  {

    @Inject CqactionsHtmlApiService service;

    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "cq", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postCqActions( @NotNull  @QueryParam("authorizableId") String authorizableId, @NotNull  @QueryParam("changelog") String changelog,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.postCqActions(authorizableId,changelog,securityContext);
    }
}
