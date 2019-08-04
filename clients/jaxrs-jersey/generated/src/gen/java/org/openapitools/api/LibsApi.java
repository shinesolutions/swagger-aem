package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.LibsApiService;
import org.openapitools.api.factories.LibsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.TruststoreInfo;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/libs")


@io.swagger.annotations.Api(description = "the libs API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-08-04T23:41:59.588Z[GMT]")
public class LibsApi  {
   private final LibsApiService delegate;

   public LibsApi(@Context ServletConfig servletContext) {
      LibsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("LibsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (LibsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = LibsApiServiceFactory.getLibsApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/granite/core/content/login.html")
    
    @Produces({ "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "cq", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getLoginPage(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getLoginPage(securityContext);
    }
    @GET
    @Path("/granite/security/truststore.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TruststoreInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved AEM Truststore info", response = TruststoreInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getTruststoreInfo(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTruststoreInfo(securityContext);
    }
    @POST
    @Path("/granite/security/post/authorizables")
    
    @Produces({ "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postAuthorizables(@ApiParam(value = "",required=true) @QueryParam("authorizableId") String authorizableId
,@ApiParam(value = "",required=true) @QueryParam("intermediatePath") String intermediatePath
,@ApiParam(value = "") @QueryParam("createUser") String createUser
,@ApiParam(value = "") @QueryParam("createGroup") String createGroup
,@ApiParam(value = "") @QueryParam("rep:password") String repColonPassword
,@ApiParam(value = "") @QueryParam("profile/givenName") String profileSlashGivenName
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postAuthorizables(authorizableId,intermediatePath,createUser,createGroup,repColonPassword,profileSlashGivenName,securityContext);
    }
    @POST
    @Path("/granite/security/post/truststore")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postTruststore(@ApiParam(value = "") @QueryParam(":operation") String colonOperation
,@ApiParam(value = "") @QueryParam("newPassword") String newPassword
,@ApiParam(value = "") @QueryParam("rePassword") String rePassword
,@ApiParam(value = "") @QueryParam("keyStoreType") String keyStoreType
,@ApiParam(value = "") @QueryParam("removeAlias") String removeAlias
,
            @FormDataParam("certificate") InputStream certificateInputStream,
            @FormDataParam("certificate") FormDataContentDisposition certificateDetail
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postTruststore(colonOperation,newPassword,rePassword,keyStoreType,removeAlias,certificateInputStream, certificateDetail,securityContext);
    }
}
