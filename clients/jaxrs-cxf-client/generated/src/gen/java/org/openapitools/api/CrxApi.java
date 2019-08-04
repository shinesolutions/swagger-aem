package org.openapitools.api;

import java.io.File;
import org.openapitools.model.InstallStatus;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * Adobe Experience Manager (AEM) API
 *
 * <p>Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface CrxApi  {

    @GET
    @Path("/crx/server/crx.default/jcr:root/.1.json")
    @Produces({ "plain/text" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "CRXDE is enabled", response = String.class),
        @ApiResponse(code = 404, message = "CRXDE is disabled", response = String.class) })
    public String getCrxdeStatus();

    @GET
    @Path("/crx/packmgr/installstatus.jsp")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved CRX package manager install status", response = InstallStatus.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public InstallStatus getInstallStatus();

    @GET
    @Path("/crx/packmgr/service/script.html")
    @Produces({ "text/html" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 404, message = "Package Manager Servlet is disabled", response = String.class),
        @ApiResponse(code = 405, message = "Package Manager Servlet is active", response = String.class) })
    public void getPackageManagerServlet();

    @POST
    @Path("/crx/packmgr/service.jsp")
    @Produces({ "text/xml" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String postPackageService(@QueryParam("cmd")String cmd);

    @POST
    @Path("/crx/packmgr/service/.json/{path}")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String postPackageServiceJson(@PathParam("path") String path, @QueryParam("cmd")String cmd, @QueryParam("groupName")String groupName, @QueryParam("packageName")String packageName, @QueryParam("packageVersion")String packageVersion, @QueryParam("_charset_")String charset, @QueryParam("force")Boolean force, @QueryParam("recursive")Boolean recursive,  @Multipart(value = "package" , required = false) Attachment _packageDetail);

    @POST
    @Path("/crx/packmgr/update.jsp")
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String postPackageUpdate(@QueryParam("groupName")String groupName, @QueryParam("packageName")String packageName, @QueryParam("version")String version, @QueryParam("path")String path, @QueryParam("filter")String filter, @QueryParam("_charset_")String charset);

    @POST
    @Path("/crx/explorer/ui/setpassword.jsp")
    @Produces({ "text/plain" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public String postSetPassword(@QueryParam("old")String old, @QueryParam("plain")String plain, @QueryParam("verify")String verify);
}

