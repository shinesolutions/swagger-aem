package org.openapitools.api;

import java.io.File;
import org.openapitools.model.InstallStatus;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/crx")
@Api(description = "the crx API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2021-09-03T15:26:06.461+10:00[Australia/Melbourne]")public class CrxApi {

    @GET
    @Path("/server/crx.default/jcr:root/.1.json")
    @Produces({ "plain/text" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "CRXDE is enabled", response = String.class),
        @ApiResponse(code = 404, message = "CRXDE is disabled", response = String.class)
    })
    public Response getCrxdeStatus() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/packmgr/installstatus.jsp")
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = InstallStatus.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved CRX package manager install status", response = InstallStatus.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response getInstallStatus() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/packmgr/service/script.html")
    @Produces({ "text/html" })
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 404, message = "Package Manager Servlet is disabled", response = String.class),
        @ApiResponse(code = 405, message = "Package Manager Servlet is active", response = String.class)
    })
    public Response getPackageManagerServlet() {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/packmgr/service.jsp")
    @Produces({ "text/xml" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response postPackageService(@QueryParam("cmd") @NotNull    String cmd) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/packmgr/service/.json/{path}")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response postPackageServiceJson(@PathParam("path") String path,@QueryParam("cmd") @NotNull    String cmd,@QueryParam("groupName")    String groupName,@QueryParam("packageName")    String packageName,@QueryParam("packageVersion")    String packageVersion,@QueryParam("_charset_")    String charset,@QueryParam("force")    Boolean force,@QueryParam("recursive")    Boolean recursive, @FormParam(value = "package") InputStream _packageInputStream) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/packmgr/update.jsp")
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response postPackageUpdate(@QueryParam("groupName") @NotNull    String groupName,@QueryParam("packageName") @NotNull    String packageName,@QueryParam("version") @NotNull    String version,@QueryParam("path") @NotNull    String path,@QueryParam("filter")    String filter,@QueryParam("_charset_")    String charset) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/explorer/ui/setpassword.jsp")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class)
    })
    public Response postSetPassword(@QueryParam("old") @NotNull    String old,@QueryParam("plain") @NotNull    String plain,@QueryParam("verify") @NotNull    String verify) {
        return Response.ok().entity("magic!").build();
    }
}
