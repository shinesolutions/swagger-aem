package org.openapitools.api;

import java.io.File;
import org.openapitools.model.KeystoreInfo;
import org.openapitools.api.IntermediatePathApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/{intermediatePath}")
@RequestScoped

@Api(description = "the {intermediatePath} API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-08-04T23:41:53.293Z[GMT]")

public class IntermediatePathApi  {

  @Context SecurityContext securityContext;

  @Inject IntermediatePathApiService delegate;


    @GET
    @Path("/{authorizableId}.ks.json")
    
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = KeystoreInfo.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getAuthorizableKeystore(@ApiParam(value = "",required=true) @PathParam("intermediatePath") String intermediatePath, @ApiParam(value = "",required=true) @PathParam("authorizableId") String authorizableId) {
        return delegate.getAuthorizableKeystore(intermediatePath, authorizableId, securityContext);
    }

    @GET
    @Path("/{authorizableId}/keystore/store.p12")
    
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "", notes = "", response = File.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = File.class) })
    public Response getKeystore(@ApiParam(value = "",required=true) @PathParam("intermediatePath") String intermediatePath, @ApiParam(value = "",required=true) @PathParam("authorizableId") String authorizableId) {
        return delegate.getKeystore(intermediatePath, authorizableId, securityContext);
    }

    @POST
    @Path("/{authorizableId}.ks.html")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = KeystoreInfo.class, authorizations = {
        @Authorization(value = "aemAuth")
    }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postAuthorizableKeystore(@ApiParam(value = "",required=true) @PathParam("intermediatePath") String intermediatePath, @ApiParam(value = "",required=true) @PathParam("authorizableId") String authorizableId,  @ApiParam(value = "")  @QueryParam(":operation") String colonOperation,  @ApiParam(value = "")  @QueryParam("currentPassword") String currentPassword,  @ApiParam(value = "")  @QueryParam("newPassword") String newPassword,  @ApiParam(value = "")  @QueryParam("rePassword") String rePassword,  @ApiParam(value = "")  @QueryParam("keyPassword") String keyPassword,  @ApiParam(value = "")  @QueryParam("keyStorePass") String keyStorePass,  @ApiParam(value = "")  @QueryParam("alias") String alias,  @ApiParam(value = "")  @QueryParam("newAlias") String newAlias,  @ApiParam(value = "")  @QueryParam("removeAlias") String removeAlias,  @Multipart(value = "cert-chain", required = false) InputStream certChainInputStream, @Multipart(value = "cert-chain" , required = false) Attachment certChainDetail,  @Multipart(value = "pk", required = false) InputStream pkInputStream, @Multipart(value = "pk" , required = false) Attachment pkDetail,  @Multipart(value = "keyStore", required = false) InputStream keyStoreInputStream, @Multipart(value = "keyStore" , required = false) Attachment keyStoreDetail) {
        return delegate.postAuthorizableKeystore(intermediatePath, authorizableId, colonOperation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChainInputStream, certChainDetail, pkInputStream, pkDetail, keyStoreInputStream, keyStoreDetail, securityContext);
    }
}
