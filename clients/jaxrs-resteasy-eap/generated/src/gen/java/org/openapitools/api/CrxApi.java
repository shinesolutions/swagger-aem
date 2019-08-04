package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.InstallStatus;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

@Path("/crx")


@io.swagger.annotations.Api(description = "the crx API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-04T23:42:11.561Z[GMT]")
public interface CrxApi  {
   
    @GET
    @Path("/server/crx.default/jcr:root/.1.json")
    
    @Produces({ "plain/text" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "CRXDE is enabled", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "CRXDE is disabled", response = String.class) })
    public Response getCrxdeStatus(@Context SecurityContext securityContext);
    @GET
    @Path("/packmgr/installstatus.jsp")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = InstallStatus.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved CRX package manager install status", response = InstallStatus.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getInstallStatus(@Context SecurityContext securityContext);
    @GET
    @Path("/packmgr/service/script.html")
    
    @Produces({ "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 404, message = "Package Manager Servlet is disabled", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Package Manager Servlet is active", response = String.class) })
    public Response getPackageManagerServlet(@Context SecurityContext securityContext);
    @POST
    @Path("/packmgr/service.jsp")
    
    @Produces({ "text/xml" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postPackageService( @NotNull @QueryParam("cmd") String cmd,@Context SecurityContext securityContext);
    @POST
    @Path("/packmgr/service/.json/{path}")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postPackageServiceJson(MultipartFormDataInput input, @PathParam("path") String path, @NotNull @QueryParam("cmd") String cmd, @QueryParam("groupName") String groupName, @QueryParam("packageName") String packageName, @QueryParam("packageVersion") String packageVersion, @QueryParam("_charset_") String charset, @QueryParam("force") Boolean force, @QueryParam("recursive") Boolean recursive,@Context SecurityContext securityContext);
    @POST
    @Path("/packmgr/update.jsp")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postPackageUpdate( @NotNull @QueryParam("groupName") String groupName, @NotNull @QueryParam("packageName") String packageName, @NotNull @QueryParam("version") String version, @NotNull @QueryParam("path") String path, @QueryParam("filter") String filter, @QueryParam("_charset_") String charset,@Context SecurityContext securityContext);
    @POST
    @Path("/explorer/ui/setpassword.jsp")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postSetPassword( @NotNull @QueryParam("old") String old, @NotNull @QueryParam("plain") String plain, @NotNull @QueryParam("verify") String verify,@Context SecurityContext securityContext);
}
