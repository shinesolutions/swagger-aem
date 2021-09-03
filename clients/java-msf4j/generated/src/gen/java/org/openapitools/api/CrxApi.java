package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.CrxApiService;
import org.openapitools.api.factories.CrxApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.InstallStatus;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/crx")


@io.swagger.annotations.Api(description = "the crx API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2021-09-03T15:25:23.467+10:00[Australia/Melbourne]")
public class CrxApi  {
   private final CrxApiService delegate = CrxApiServiceFactory.getCrxApi();

    @GET
    @Path("/server/crx.default/jcr:root/.1.json")
    
    @Produces({ "plain/text" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "CRXDE is enabled", response = String.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "CRXDE is disabled", response = String.class) })
    public Response getCrxdeStatus()
    throws NotFoundException {
        return delegate.getCrxdeStatus();
    }
    @GET
    @Path("/packmgr/installstatus.jsp")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = InstallStatus.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved CRX package manager install status", response = InstallStatus.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = InstallStatus.class) })
    public Response getInstallStatus()
    throws NotFoundException {
        return delegate.getInstallStatus();
    }
    @GET
    @Path("/packmgr/service/script.html")
    
    @Produces({ "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "crx", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 404, message = "Package Manager Servlet is disabled", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Package Manager Servlet is active", response = Void.class) })
    public Response getPackageManagerServlet()
    throws NotFoundException {
        return delegate.getPackageManagerServlet();
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
)
    throws NotFoundException {
        return delegate.postPackageService(cmd);
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
            @FormDataParam("package") FileInfo _packageDetail
)
    throws NotFoundException {
        return delegate.postPackageServiceJson(path,cmd,groupName,packageName,packageVersion,charset,force,recursive,_packageInputStream, _packageDetail);
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
)
    throws NotFoundException {
        return delegate.postPackageUpdate(groupName,packageName,version,path,filter,charset);
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
)
    throws NotFoundException {
        return delegate.postSetPassword(old,plain,verify);
    }
}
