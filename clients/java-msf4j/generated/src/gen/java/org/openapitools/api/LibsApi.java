package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.LibsApiService;
import org.openapitools.api.factories.LibsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.TruststoreInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/libs")


@io.swagger.annotations.Api(description = "the libs API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-17T07:12:45.791437416Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LibsApi  {
   private final LibsApiService delegate = LibsApiServiceFactory.getLibsApi();

    @GET
    @Path("/granite/core/content/login.html")
    
    @Produces({ "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, tags={ "cq", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getLoginPage()
    throws NotFoundException {
        return delegate.getLoginPage();
    }
    @GET
    @Path("/granite/security/truststore.json")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = TruststoreInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved AEM Truststore info", response = TruststoreInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = TruststoreInfo.class) })
    public Response getTruststoreInfo()
    throws NotFoundException {
        return delegate.getTruststoreInfo();
    }
    @POST
    @Path("/granite/security/post/authorizables")
    
    @Produces({ "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postAuthorizables(@ApiParam(value = "",required=true) @QueryParam("authorizableId") String authorizableId
,@ApiParam(value = "",required=true) @QueryParam("intermediatePath") String intermediatePath
,@ApiParam(value = "") @QueryParam("createUser") String createUser
,@ApiParam(value = "") @QueryParam("createGroup") String createGroup
,@ApiParam(value = "") @QueryParam("rep:password") String repPassword
,@ApiParam(value = "") @QueryParam("profile/givenName") String profileGivenName
)
    throws NotFoundException {
        return delegate.postAuthorizables(authorizableId,intermediatePath,createUser,createGroup,repPassword,profileGivenName);
    }
    @POST
    @Path("/replication/treeactivation.html")
    
    
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postTreeActivation(@ApiParam(value = "",required=true) @QueryParam("ignoredeactivated") Boolean ignoredeactivated
,@ApiParam(value = "",required=true) @QueryParam("onlymodified") Boolean onlymodified
,@ApiParam(value = "",required=true) @QueryParam("path") String path
,@ApiParam(value = "",required=true, defaultValue="activate") @DefaultValue("activate") @QueryParam("cmd") String cmd
)
    throws NotFoundException {
        return delegate.postTreeActivation(ignoredeactivated,onlymodified,path,cmd);
    }
    @POST
    @Path("/granite/security/post/truststore")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postTruststore(@ApiParam(value = "") @QueryParam(":operation") String operation
,@ApiParam(value = "") @QueryParam("newPassword") String newPassword
,@ApiParam(value = "") @QueryParam("rePassword") String rePassword
,@ApiParam(value = "") @QueryParam("keyStoreType") String keyStoreType
,@ApiParam(value = "") @QueryParam("removeAlias") String removeAlias
,
            @FormDataParam("certificate") InputStream certificateInputStream,
            @FormDataParam("certificate") FileInfo certificateDetail
)
    throws NotFoundException {
        return delegate.postTruststore(operation,newPassword,rePassword,keyStoreType,removeAlias,certificateInputStream, certificateDetail);
    }
    @POST
    @Path("/granite/security/post/sslSetup.html")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = String.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "granite", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response sslSetup(@ApiParam(value = "",required=true) @QueryParam("keystorePassword") String keystorePassword
,@ApiParam(value = "",required=true) @QueryParam("keystorePasswordConfirm") String keystorePasswordConfirm
,@ApiParam(value = "",required=true) @QueryParam("truststorePassword") String truststorePassword
,@ApiParam(value = "",required=true) @QueryParam("truststorePasswordConfirm") String truststorePasswordConfirm
,@ApiParam(value = "",required=true) @QueryParam("httpsHostname") String httpsHostname
,@ApiParam(value = "",required=true) @QueryParam("httpsPort") String httpsPort
,
            @FormDataParam("privatekeyFile") InputStream privatekeyFileInputStream,
            @FormDataParam("privatekeyFile") FileInfo privatekeyFileDetail
,
            @FormDataParam("certificateFile") InputStream certificateFileInputStream,
            @FormDataParam("certificateFile") FileInfo certificateFileDetail
)
    throws NotFoundException {
        return delegate.sslSetup(keystorePassword,keystorePasswordConfirm,truststorePassword,truststorePasswordConfirm,httpsHostname,httpsPort,privatekeyFileInputStream, privatekeyFileDetail,certificateFileInputStream, certificateFileDetail);
    }
}
