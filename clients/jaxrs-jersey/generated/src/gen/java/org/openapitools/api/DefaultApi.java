package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.DefaultApiService;
import org.openapitools.api.factories.DefaultApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.KeystoreInfo;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("")


@io.swagger.annotations.Api(description = "the default API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2021-09-03T15:25:53.422+10:00[Australia/Melbourne]")
public class DefaultApi  {
   private final DefaultApiService delegate;

   public DefaultApi(@Context ServletConfig servletContext) {
      DefaultApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("DefaultApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (DefaultApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = DefaultApiServiceFactory.getDefaultApi();
      }

      this.delegate = delegate;
   }

    @DELETE
    @Path("/{path}/{name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response deleteNode(@ApiParam(value = "", required = true) @PathParam("path") @NotNull  String path,@ApiParam(value = "", required = true) @PathParam("name") @NotNull  String name,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteNode(path, name, securityContext);
    }
    @GET
    @Path("/{intermediatePath}/{authorizableId}.ks.json")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = KeystoreInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response getAuthorizableKeystore(@ApiParam(value = "", required = true) @PathParam("intermediatePath") @NotNull  String intermediatePath,@ApiParam(value = "", required = true) @PathParam("authorizableId") @NotNull  String authorizableId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAuthorizableKeystore(intermediatePath, authorizableId, securityContext);
    }
    @GET
    @Path("/{intermediatePath}/{authorizableId}/keystore/store.p12")
    
    @Produces({ "application/octet-stream" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = File.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = File.class)
    })
    public Response getKeystore(@ApiParam(value = "", required = true) @PathParam("intermediatePath") @NotNull  String intermediatePath,@ApiParam(value = "", required = true) @PathParam("authorizableId") @NotNull  String authorizableId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getKeystore(intermediatePath, authorizableId, securityContext);
    }
    @GET
    @Path("/{path}/{name}")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response getNode(@ApiParam(value = "", required = true) @PathParam("path") @NotNull  String path,@ApiParam(value = "", required = true) @PathParam("name") @NotNull  String name,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getNode(path, name, securityContext);
    }
    @POST
    @Path("/{intermediatePath}/{authorizableId}.ks.html")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = KeystoreInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response postAuthorizableKeystore(@ApiParam(value = "", required = true) @PathParam("intermediatePath") @NotNull  String intermediatePath,@ApiParam(value = "", required = true) @PathParam("authorizableId") @NotNull  String authorizableId,@ApiParam(value = "") @QueryParam(":operation")  String colonOperation,@ApiParam(value = "") @QueryParam("currentPassword")  String currentPassword,@ApiParam(value = "") @QueryParam("newPassword")  String newPassword,@ApiParam(value = "") @QueryParam("rePassword")  String rePassword,@ApiParam(value = "") @QueryParam("keyPassword")  String keyPassword,@ApiParam(value = "") @QueryParam("keyStorePass")  String keyStorePass,@ApiParam(value = "") @QueryParam("alias")  String alias,@ApiParam(value = "") @QueryParam("newAlias")  String newAlias,@ApiParam(value = "") @QueryParam("removeAlias")  String removeAlias,
 @FormDataParam("cert-chain") FormDataBodyPart certChainBodypart ,
 @FormDataParam("pk") FormDataBodyPart pkBodypart ,
 @FormDataParam("keyStore") FormDataBodyPart keyStoreBodypart ,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postAuthorizableKeystore(intermediatePath, authorizableId, colonOperation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChainBodypart, pkBodypart, keyStoreBodypart, securityContext);
    }
    @POST
    @Path("/{path}/{name}")
    @Consumes({ "multipart/form-data" })
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response postNode(@ApiParam(value = "", required = true) @PathParam("path") @NotNull  String path,@ApiParam(value = "", required = true) @PathParam("name") @NotNull  String name,@ApiParam(value = "") @QueryParam(":operation")  String colonOperation,@ApiParam(value = "") @QueryParam("deleteAuthorizable")  String deleteAuthorizable,
 @FormDataParam("file") FormDataBodyPart fileBodypart ,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postNode(path, name, colonOperation, deleteAuthorizable, fileBodypart, securityContext);
    }
    @POST
    @Path("/{path}/{name}.rw.html")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response postNodeRw(@ApiParam(value = "", required = true) @PathParam("path") @NotNull  String path,@ApiParam(value = "", required = true) @PathParam("name") @NotNull  String name,@ApiParam(value = "") @QueryParam("addMembers")  String addMembers,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postNodeRw(path, name, addMembers, securityContext);
    }
    @POST
    @Path("/{path}/")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response postPath(@ApiParam(value = "", required = true) @PathParam("path") @NotNull  String path,@ApiParam(value = "", required = true) @QueryParam("jcr:primaryType") @NotNull  String jcrColonPrimaryType,@ApiParam(value = "", required = true) @QueryParam(":name") @NotNull  String colonName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postPath(path, jcrColonPrimaryType, colonName, securityContext);
    }
}
