package org.openapitools.api;

import org.openapitools.api.CqactionsHtmlApiService;

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
@Path("/.cqactions.html")
@RequestScoped

@Api(description = "the .cqactions.html API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-08-04T23:41:53.293Z[GMT]")

public class CqactionsHtmlApi  {

  @Context SecurityContext securityContext;

  @Inject CqactionsHtmlApiService delegate;


    @POST
    
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "cq" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postCqActions( @NotNull @ApiParam(value = "",required=true)  @QueryParam("authorizableId") String authorizableId,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("changelog") String changelog) {
        return delegate.postCqActions(authorizableId, changelog, securityContext);
    }
}
