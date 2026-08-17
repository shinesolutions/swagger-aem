package org.openapitools.api;

import org.openapitools.model.TruststoreInfo;
import org.openapitools.api.LibsApiService;

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
import javax.validation.Valid;
@Path("/libs")
@RequestScoped

@Api


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-08-17T07:13:03.808307969Z[Etc/UTC]", comments = "Generator version: 7.24.0")

public class LibsApi  {

  @Context SecurityContext securityContext;

  @Inject LibsApiService delegate;


    @GET
    @Path("/granite/core/content/login.html")
    
    @Produces({ "text/html" })
    @ApiOperation(value = "", notes = "", response = String.class, tags={ "cq" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getLoginPage() {
        return delegate.getLoginPage(securityContext);
    }

    @GET
    @Path("/granite/security/truststore.json")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = TruststoreInfo.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved AEM Truststore info", response = TruststoreInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getTruststoreInfo() {
        return delegate.getTruststoreInfo(securityContext);
    }

    @POST
    @Path("/granite/security/post/authorizables")
    
    @Produces({ "text/html" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postAuthorizables( @NotNull @ApiParam(value = "",required=true)  @QueryParam("authorizableId") String authorizableId,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("intermediatePath") String intermediatePath, @ApiParam(value = "")  @QueryParam("createUser") String createUser, @ApiParam(value = "")  @QueryParam("createGroup") String createGroup, @ApiParam(value = "")  @QueryParam("rep:password") String repPassword, @ApiParam(value = "")  @QueryParam("profile/givenName") String profileGivenName) {
        return delegate.postAuthorizables(authorizableId, intermediatePath, createUser, createGroup, repPassword, profileGivenName, securityContext);
    }

    @POST
    @Path("/replication/treeactivation.html")
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postTreeActivation( @NotNull @ApiParam(value = "",required=true)  @QueryParam("ignoredeactivated") Boolean ignoredeactivated,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("onlymodified") Boolean onlymodified,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("path") String path,  @NotNull @ApiParam(value = "",required=true, defaultValue="activate") @DefaultValue("activate")  @QueryParam("cmd") String cmd) {
        return delegate.postTreeActivation(ignoredeactivated, onlymodified, path, cmd, securityContext);
    }

    @POST
    @Path("/granite/security/post/truststore")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postTruststore(@ApiParam(value = "")  @QueryParam(":operation") String operation, @ApiParam(value = "")  @QueryParam("newPassword") String newPassword, @ApiParam(value = "")  @QueryParam("rePassword") String rePassword, @ApiParam(value = "")  @QueryParam("keyStoreType") String keyStoreType, @ApiParam(value = "")  @QueryParam("removeAlias") String removeAlias,  @Multipart(value = "certificate" , required = false) Attachment certificateDetail) {
        return delegate.postTruststore(operation, newPassword, rePassword, keyStoreType, removeAlias, certificateDetail, securityContext);
    }

    @POST
    @Path("/granite/security/post/sslSetup.html")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "granite" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response sslSetup( @NotNull @ApiParam(value = "",required=true)  @QueryParam("keystorePassword") String keystorePassword,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("keystorePasswordConfirm") String keystorePasswordConfirm,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("truststorePassword") String truststorePassword,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("truststorePasswordConfirm") String truststorePasswordConfirm,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("httpsHostname") String httpsHostname,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("httpsPort") String httpsPort,  @Multipart(value = "privatekeyFile" , required = false) Attachment privatekeyFileDetail,  @Multipart(value = "certificateFile" , required = false) Attachment certificateFileDetail) {
        return delegate.sslSetup(keystorePassword, keystorePasswordConfirm, truststorePassword, truststorePasswordConfirm, httpsHostname, httpsPort, privatekeyFileDetail, certificateFileDetail, securityContext);
    }
}
