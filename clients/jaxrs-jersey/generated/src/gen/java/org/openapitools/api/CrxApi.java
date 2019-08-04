package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.CrxApiService;
import org.openapitools.api.factories.CrxApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.InstallStatus;

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

@Path("/crx")


@io.swagger.annotations.Api(description = "the crx API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-08-04T23:41:59.588Z[GMT]")
public class CrxApi  {
   private final CrxApiService delegate;

   public CrxApi(@Context ServletConfig servletContext) {
      CrxApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CrxApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CrxApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = CrxApiServiceFactory.getCrxApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/server/crx.default/jcr:root/.1.json")
    
    @Produces({ "plain/text" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "CRXDE is enabled", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "CRXDE is disabled", response = String.class) })
    public Response getCrxdeStatus(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getCrxdeStatus(securityContext);
    }
    @GET
    @Path("/packmgr/installstatus.jsp")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = InstallStatus.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved CRX package manager install status", response = InstallStatus.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getInstallStatus(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getInstallStatus(securityContext);
    }
    @GET
    @Path("/packmgr/service/script.html")
    
    @Produces({ "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 404, message = "Package Manager Servlet is disabled", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Package Manager Servlet is active", response = String.class) })
    public Response getPackageManagerServlet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPackageManagerServlet(securityContext);
    }
    @POST
    @Path("/packmgr/service.jsp")
    
    @Produces({ "text/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postPackageService(@ApiParam(value = "",required=true) @QueryParam("cmd") String cmd
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postPackageService(cmd,securityContext);
    }
    @POST
    @Path("/packmgr/service/.json/{path}")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postPackageServiceJson(@ApiParam(value = "",required=true) @PathParam("path") String path
,@ApiParam(value = "",required=true) @QueryParam("cmd") String cmd
,@ApiParam(value = "") @QueryParam("groupName") String groupName
,@ApiParam(value = "") @QueryParam("packageName") String packageName
,@ApiParam(value = "") @QueryParam("packageVersion") String packageVersion
,@ApiParam(value = "") @QueryParam("_charset_") String charset
,@ApiParam(value = "") @QueryParam("force") Boolean force
,@ApiParam(value = "") @QueryParam("recursive") Boolean recursive
,
            @FormDataParam("package") InputStream _packageInputStream,
            @FormDataParam("package") FormDataContentDisposition _packageDetail
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postPackageServiceJson(path,cmd,groupName,packageName,packageVersion,charset,force,recursive,_packageInputStream, _packageDetail,securityContext);
    }
    @POST
    @Path("/packmgr/update.jsp")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postPackageUpdate(@ApiParam(value = "",required=true) @QueryParam("groupName") String groupName
,@ApiParam(value = "",required=true) @QueryParam("packageName") String packageName
,@ApiParam(value = "",required=true) @QueryParam("version") String version
,@ApiParam(value = "",required=true) @QueryParam("path") String path
,@ApiParam(value = "") @QueryParam("filter") String filter
,@ApiParam(value = "") @QueryParam("_charset_") String charset
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postPackageUpdate(groupName,packageName,version,path,filter,charset,securityContext);
    }
    @POST
    @Path("/explorer/ui/setpassword.jsp")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postSetPassword(@ApiParam(value = "",required=true) @QueryParam("old") String old
,@ApiParam(value = "",required=true) @QueryParam("plain") String plain
,@ApiParam(value = "",required=true) @QueryParam("verify") String verify
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.postSetPassword(old,plain,verify,securityContext);
    }
}
