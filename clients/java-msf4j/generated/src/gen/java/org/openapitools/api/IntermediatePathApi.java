package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.IntermediatePathApiService;
import org.openapitools.api.factories.IntermediatePathApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;
import org.openapitools.model.KeystoreInfo;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/{intermediatePath}")


@io.swagger.annotations.Api(description = "the {intermediatePath} API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-04T23:41:25.207Z[GMT]")
public class IntermediatePathApi  {
   private final IntermediatePathApiService delegate = IntermediatePathApiServiceFactory.getIntermediatePathApi();

    @GET
    @Path("/{authorizableId}.ks.json")
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = KeystoreInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = KeystoreInfo.class) })
    public Response getAuthorizableKeystore(@ApiParam(value = "",required=true) @PathParam("intermediatePath") String intermediatePath
,@ApiParam(value = "",required=true) @PathParam("authorizableId") String authorizableId
)
    throws NotFoundException {
        return delegate.getAuthorizableKeystore(intermediatePath,authorizableId);
    }
    @GET
    @Path("/{authorizableId}/keystore/store.p12")
    
    @Produces({ "application/octet-stream" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = File.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = File.class) })
    public Response getKeystore(@ApiParam(value = "",required=true) @PathParam("intermediatePath") String intermediatePath
,@ApiParam(value = "",required=true) @PathParam("authorizableId") String authorizableId
)
    throws NotFoundException {
        return delegate.getKeystore(intermediatePath,authorizableId);
    }
    @POST
    @Path("/{authorizableId}.ks.html")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = KeystoreInfo.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "aemAuth")
    }, tags={ "sling", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Default response", response = KeystoreInfo.class) })
    public Response postAuthorizableKeystore(@ApiParam(value = "",required=true) @PathParam("intermediatePath") String intermediatePath
,@ApiParam(value = "",required=true) @PathParam("authorizableId") String authorizableId
,@ApiParam(value = "") @QueryParam(":operation") String colonOperation
,@ApiParam(value = "") @QueryParam("currentPassword") String currentPassword
,@ApiParam(value = "") @QueryParam("newPassword") String newPassword
,@ApiParam(value = "") @QueryParam("rePassword") String rePassword
,@ApiParam(value = "") @QueryParam("keyPassword") String keyPassword
,@ApiParam(value = "") @QueryParam("keyStorePass") String keyStorePass
,@ApiParam(value = "") @QueryParam("alias") String alias
,@ApiParam(value = "") @QueryParam("newAlias") String newAlias
,@ApiParam(value = "") @QueryParam("removeAlias") String removeAlias
,
            @FormDataParam("cert-chain") InputStream certChainInputStream,
            @FormDataParam("cert-chain") FileInfo certChainDetail
,
            @FormDataParam("pk") InputStream pkInputStream,
            @FormDataParam("pk") FileInfo pkDetail
,
            @FormDataParam("keyStore") InputStream keyStoreInputStream,
            @FormDataParam("keyStore") FileInfo keyStoreDetail
)
    throws NotFoundException {
        return delegate.postAuthorizableKeystore(intermediatePath,authorizableId,colonOperation,currentPassword,newPassword,rePassword,keyPassword,keyStorePass,alias,newAlias,removeAlias,certChainInputStream, certChainDetail,pkInputStream, pkDetail,keyStoreInputStream, keyStoreDetail);
    }
}
