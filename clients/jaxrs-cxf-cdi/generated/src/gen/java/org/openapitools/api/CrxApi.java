package org.openapitools.api;

import java.io.File;
import org.openapitools.model.InstallStatus;
import org.openapitools.api.CrxApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/crx")
@RequestScoped

@Api(description = "the crx API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-09-03T15:25:48.597+10:00[Australia/Melbourne]")

public class CrxApi  {

  @Context SecurityContext securityContext;

  @Inject CrxApiService delegate;


    @GET
    @Path("/server/crx.default/jcr:root/.1.json")
    
    @Produces({ "plain/text" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "CRXDE is enabled", response = String.class),
        @ApiResponse(code = 404, message = "CRXDE is disabled", response = String.class) })
    public Response getCrxdeStatus() {
        return delegate.getCrxdeStatus(securityContext);
    }

    @GET
    @Path("/packmgr/installstatus.jsp")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = InstallStatus.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved CRX package manager install status", response = InstallStatus.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getInstallStatus() {
        return delegate.getInstallStatus(securityContext);
    }

    @GET
    @Path("/packmgr/service/script.html")
    
    @Produces({ "text/html" })
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 404, message = "Package Manager Servlet is disabled", response = String.class),
        @ApiResponse(code = 405, message = "Package Manager Servlet is active", response = String.class) })
    public Response getPackageManagerServlet() {
        return delegate.getPackageManagerServlet(securityContext);
    }

    @POST
    @Path("/packmgr/service.jsp")
    
    @Produces({ "text/xml" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postPackageService( @NotNull @ApiParam(value = "",required=true)  @QueryParam("cmd") String cmd) {
        return delegate.postPackageService(cmd, securityContext);
    }

    @POST
    @Path("/packmgr/service/.json/{path}")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postPackageServiceJson(@ApiParam(value = "",required=true) @PathParam("path") String path,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("cmd") String cmd, @ApiParam(value = "")  @QueryParam("groupName") String groupName, @ApiParam(value = "")  @QueryParam("packageName") String packageName, @ApiParam(value = "")  @QueryParam("packageVersion") String packageVersion, @ApiParam(value = "")  @QueryParam("_charset_") String charset, @ApiParam(value = "")  @QueryParam("force") Boolean force, @ApiParam(value = "")  @QueryParam("recursive") Boolean recursive,  @Multipart(value = "package", required = false) InputStream _packageInputStream, @Multipart(value = "package" , required = false) Attachment _packageDetail) {
        return delegate.postPackageServiceJson(path, cmd, groupName, packageName, packageVersion, charset, force, recursive, _packageInputStream, _packageDetail, securityContext);
    }

    @POST
    @Path("/packmgr/update.jsp")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postPackageUpdate( @NotNull @ApiParam(value = "",required=true)  @QueryParam("groupName") String groupName,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("packageName") String packageName,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("version") String version,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("path") String path, @ApiParam(value = "")  @QueryParam("filter") String filter, @ApiParam(value = "")  @QueryParam("_charset_") String charset) {
        return delegate.postPackageUpdate(groupName, packageName, version, path, filter, charset, securityContext);
    }

    @POST
    @Path("/explorer/ui/setpassword.jsp")
    
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "crx" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postSetPassword( @NotNull @ApiParam(value = "",required=true)  @QueryParam("old") String old,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("plain") String plain,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("verify") String verify) {
        return delegate.postSetPassword(old, plain, verify, securityContext);
    }
}
