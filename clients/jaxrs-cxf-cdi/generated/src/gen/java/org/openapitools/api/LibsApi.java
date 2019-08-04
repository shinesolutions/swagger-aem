package org.openapitools.api;

import java.io.File;
import org.openapitools.model.TruststoreInfo;
import org.openapitools.api.LibsApiService;

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
@Path("/libs")
@RequestScoped

@Api(description = "the libs API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-08-04T23:41:53.293Z[GMT]")

public class LibsApi  {

  @Context SecurityContext securityContext;

  @Inject LibsApiService delegate;


    @GET
    @Path("/granite/core/content/login.html")
    
    @Produces({ "text/html" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "cq",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getLoginPage() {
        return delegate.getLoginPage(securityContext);
    }

    @GET
    @Path("/granite/security/truststore.json")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = TruststoreInfo.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved AEM Truststore info", response = TruststoreInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getTruststoreInfo() {
        return delegate.getTruststoreInfo(securityContext);
    }

    @POST
    @Path("/granite/security/post/authorizables")
    
    @Produces({ "text/html" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postAuthorizables( @NotNull @ApiParam(value = "",required=true)  @QueryParam("authorizableId") String authorizableId,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("intermediatePath") String intermediatePath,  @ApiParam(value = "")  @QueryParam("createUser") String createUser,  @ApiParam(value = "")  @QueryParam("createGroup") String createGroup,  @ApiParam(value = "")  @QueryParam("rep:password") String repColonPassword,  @ApiParam(value = "")  @QueryParam("profile/givenName") String profileSlashGivenName) {
        return delegate.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repColonPassword, profileSlashGivenName, securityContext);
    }

    @POST
    @Path("/granite/security/post/truststore")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postTruststore( @ApiParam(value = "")  @QueryParam(":operation") String colonOperation,  @ApiParam(value = "")  @QueryParam("newPassword") String newPassword,  @ApiParam(value = "")  @QueryParam("rePassword") String rePassword,  @ApiParam(value = "")  @QueryParam("keyStoreType") String keyStoreType,  @ApiParam(value = "")  @QueryParam("removeAlias") String removeAlias,  @Multipart(value = "certificate", required = false) InputStream certificateInputStream, @Multipart(value = "certificate" , required = false) Attachment certificateDetail) {
        return delegate.postTruststore(colonOperation, newPassword, rePassword, keyStoreType, removeAlias, certificateInputStream, certificateDetail, securityContext);
    }
}
