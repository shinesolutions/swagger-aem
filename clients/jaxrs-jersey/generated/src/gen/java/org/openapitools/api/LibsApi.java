package org.openapitools.api;

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

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/libs")


@io.swagger.annotations.Api(description = "the libs API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-17T07:13:06.132469009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LibsApi  {
   private final LibsApiService delegate;

   public LibsApi(@Context ServletConfig servletContext) {
      LibsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("LibsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (LibsApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
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

    @javax.ws.rs.GET
    @Path("/granite/core/content/login.html")
    
    @Produces({ "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "cq", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response getLoginPage(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getLoginPage(securityContext);
    }
    @javax.ws.rs.GET
    @Path("/granite/security/truststore.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TruststoreInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved AEM Truststore info", response = TruststoreInfo.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response getTruststoreInfo(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTruststoreInfo(securityContext);
    }
    @javax.ws.rs.POST
    @Path("/granite/security/post/authorizables")
    
    @Produces({ "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response postAuthorizables(@ApiParam(value = "", required = true) @QueryParam("authorizableId") @NotNull  String authorizableId,@ApiParam(value = "", required = true) @QueryParam("intermediatePath") @NotNull  String intermediatePath,@ApiParam(value = "") @QueryParam("createUser")  String createUser,@ApiParam(value = "") @QueryParam("createGroup")  String createGroup,@ApiParam(value = "") @QueryParam("rep:password")  String repPassword,@ApiParam(value = "") @QueryParam("profile/givenName")  String profileGivenName,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/replication/treeactivation.html")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class)
    })
    public Response postTreeActivation(@ApiParam(value = "", required = true) @QueryParam("ignoredeactivated") @NotNull  Boolean ignoredeactivated,@ApiParam(value = "", required = true) @QueryParam("onlymodified") @NotNull  Boolean onlymodified,@ApiParam(value = "", required = true) @QueryParam("path") @NotNull  String path,@ApiParam(value = "", required = true, defaultValue = "activate") @DefaultValue("activate") @QueryParam("cmd") @NotNull  String cmd,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postTreeActivation(ignoredeactivated, onlymodified, path, cmd, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/granite/security/post/truststore")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response postTruststore(@ApiParam(value = "") @QueryParam(":operation")  String operation,@ApiParam(value = "") @QueryParam("newPassword")  String newPassword,@ApiParam(value = "") @QueryParam("rePassword")  String rePassword,@ApiParam(value = "") @QueryParam("keyStoreType")  String keyStoreType,@ApiParam(value = "") @QueryParam("removeAlias")  String removeAlias,
 @FormDataParam("certificate") FormDataBodyPart certificateBodypart ,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificateBodypart, securityContext);
    }
    @javax.ws.rs.POST
    @Path("/granite/security/post/sslSetup.html")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "granite", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response sslSetup(@ApiParam(value = "", required = true) @QueryParam("keystorePassword") @NotNull  String keystorePassword,@ApiParam(value = "", required = true) @QueryParam("keystorePasswordConfirm") @NotNull  String keystorePasswordConfirm,@ApiParam(value = "", required = true) @QueryParam("truststorePassword") @NotNull  String truststorePassword,@ApiParam(value = "", required = true) @QueryParam("truststorePasswordConfirm") @NotNull  String truststorePasswordConfirm,@ApiParam(value = "", required = true) @QueryParam("httpsHostname") @NotNull  String httpsHostname,@ApiParam(value = "", required = true) @QueryParam("httpsPort") @NotNull  String httpsPort,
 @FormDataParam("privatekeyFile") FormDataBodyPart privatekeyFileBodypart ,
 @FormDataParam("certificateFile") FormDataBodyPart certificateFileBodypart ,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFileBodypart, certificateFileBodypart, securityContext);
    }
}
