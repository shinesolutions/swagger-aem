package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.IntermediatePathApiService;
import org.openapitools.api.factories.IntermediatePathApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.KeystoreInfo;

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

@Path("/{intermediatePath}")


@io.swagger.annotations.Api(description = "the {intermediatePath} API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-08-04T23:41:59.588Z[GMT]")
public class IntermediatePathApi  {
   private final IntermediatePathApiService delegate;

   public IntermediatePathApi(@Context ServletConfig servletContext) {
      IntermediatePathApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("IntermediatePathApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (IntermediatePathApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = IntermediatePathApiServiceFactory.getIntermediatePathApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/{authorizableId}.ks.json")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = KeystoreInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getAuthorizableKeystore(@ApiParam(value = "",required=true) @PathParam("intermediatePath") String intermediatePath
,@ApiParam(value = "",required=true) @PathParam("authorizableId") String authorizableId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAuthorizableKeystore(intermediatePath,authorizableId,securityContext);
    }
    @GET
    @Path("/{authorizableId}/keystore/store.p12")
    
    @Produces({ "application/octet-stream" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = File.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = File.class) })
    public Response getKeystore(@ApiParam(value = "",required=true) @PathParam("intermediatePath") String intermediatePath
,@ApiParam(value = "",required=true) @PathParam("authorizableId") String authorizableId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getKeystore(intermediatePath,authorizableId,securityContext);
    }
    @POST
    @Path("/{authorizableId}.ks.html")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = KeystoreInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postAuthorizableKeystore(@ApiParam(value = "",required=true) @PathParam("intermediatePath") String intermediatePath
,@ApiParam(value = "",required=true) @PathParam("authorizableId") String authorizableId
,@ApiParam(value = "") @QueryParam(":operation") String colonOperation
,@ApiParam(value = "") @QueryParam("currentPassword") String currentPassword
,@ApiParam(value = "") @QueryParam("newPassword") String newPassword
,@ApiParam(value = "") @QueryParam("rePassword") String rePassword
,@ApiParam(value = "") @QueryParam("keyPassword") String keyPassword
,@ApiParam(value = "") @QueryParam("keyStorePass") String keyStorePass
,@ApiParam(value = "") @QueryParam("alias") String alias
,@ApiParam(value = "") @QueryParam("newAlias") String newAlias
,@ApiParam(value = "") @QueryParam("removeAlias") String removeAlias
,
            @FormDataParam("cert-chain") InputStream certChainInputStream,
            @FormDataParam("cert-chain") FormDataContentDisposition certChainDetail
,
            @FormDataParam("pk") InputStream pkInputStream,
            @FormDataParam("pk") FormDataContentDisposition pkDetail
,
            @FormDataParam("keyStore") InputStream keyStoreInputStream,
            @FormDataParam("keyStore") FormDataContentDisposition keyStoreDetail
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postAuthorizableKeystore(intermediatePath,authorizableId,colonOperation,currentPassword,newPassword,rePassword,keyPassword,keyStorePass,alias,newAlias,removeAlias,certChainInputStream, certChainDetail,pkInputStream, pkDetail,keyStoreInputStream, keyStoreDetail,securityContext);
    }
}
