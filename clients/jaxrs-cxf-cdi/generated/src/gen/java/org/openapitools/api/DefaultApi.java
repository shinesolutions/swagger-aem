package org.openapitools.api;

import java.io.File;
import org.openapitools.model.KeystoreInfo;
import org.openapitools.api.DefaultApiService;

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
@Path("")
@RequestScoped

@Api(description = "the default API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2021-09-03T15:25:48.597+10:00[Australia/Melbourne]")

public class DefaultApi  {

  @Context SecurityContext securityContext;

  @Inject DefaultApiService delegate;


    @DELETE
    @Path("/{path}/{name}")
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response deleteNode(@ApiParam(value = "",required=true) @PathParam("path") String path, @ApiParam(value = "",required=true) @PathParam("name") String name) {
        return delegate.deleteNode(path, name, securityContext);
    }

    @GET
    @Path("/{intermediatePath}/{authorizableId}.ks.json")
    
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = KeystoreInfo.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response getAuthorizableKeystore(@ApiParam(value = "",required=true) @PathParam("intermediatePath") String intermediatePath, @ApiParam(value = "",required=true) @PathParam("authorizableId") String authorizableId) {
        return delegate.getAuthorizableKeystore(intermediatePath, authorizableId, securityContext);
    }

    @GET
    @Path("/{intermediatePath}/{authorizableId}/keystore/store.p12")
    
    @Produces({ "application/octet-stream" })
    @ApiOperation(value = "", notes = "", response = File.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = File.class) })
    public Response getKeystore(@ApiParam(value = "",required=true) @PathParam("intermediatePath") String intermediatePath, @ApiParam(value = "",required=true) @PathParam("authorizableId") String authorizableId) {
        return delegate.getKeystore(intermediatePath, authorizableId, securityContext);
    }

    @GET
    @Path("/{path}/{name}")
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response getNode(@ApiParam(value = "",required=true) @PathParam("path") String path, @ApiParam(value = "",required=true) @PathParam("name") String name) {
        return delegate.getNode(path, name, securityContext);
    }

    @POST
    @Path("/{intermediatePath}/{authorizableId}.ks.html")
    @Consumes({ "multipart/form-data" })
    @Produces({ "text/plain" })
    @ApiOperation(value = "", notes = "", response = KeystoreInfo.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retrieved Authorizable Keystore info", response = KeystoreInfo.class),
        @ApiResponse(code = 200, message = "Default response", response = String.class) })
    public Response postAuthorizableKeystore(@ApiParam(value = "",required=true) @PathParam("intermediatePath") String intermediatePath, @ApiParam(value = "",required=true) @PathParam("authorizableId") String authorizableId, @ApiParam(value = "")  @QueryParam(":operation") String colonOperation, @ApiParam(value = "")  @QueryParam("currentPassword") String currentPassword, @ApiParam(value = "")  @QueryParam("newPassword") String newPassword, @ApiParam(value = "")  @QueryParam("rePassword") String rePassword, @ApiParam(value = "")  @QueryParam("keyPassword") String keyPassword, @ApiParam(value = "")  @QueryParam("keyStorePass") String keyStorePass, @ApiParam(value = "")  @QueryParam("alias") String alias, @ApiParam(value = "")  @QueryParam("newAlias") String newAlias, @ApiParam(value = "")  @QueryParam("removeAlias") String removeAlias,  @Multipart(value = "cert-chain", required = false) InputStream certChainInputStream, @Multipart(value = "cert-chain" , required = false) Attachment certChainDetail,  @Multipart(value = "pk", required = false) InputStream pkInputStream, @Multipart(value = "pk" , required = false) Attachment pkDetail,  @Multipart(value = "keyStore", required = false) InputStream keyStoreInputStream, @Multipart(value = "keyStore" , required = false) Attachment keyStoreDetail) {
        return delegate.postAuthorizableKeystore(intermediatePath, authorizableId, colonOperation, currentPassword, newPassword, rePassword, keyPassword, keyStorePass, alias, newAlias, removeAlias, certChainInputStream, certChainDetail, pkInputStream, pkDetail, keyStoreInputStream, keyStoreDetail, securityContext);
    }

    @POST
    @Path("/{path}/{name}")
    @Consumes({ "multipart/form-data" })
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postNode(@ApiParam(value = "",required=true) @PathParam("path") String path, @ApiParam(value = "",required=true) @PathParam("name") String name, @ApiParam(value = "")  @QueryParam(":operation") String colonOperation, @ApiParam(value = "")  @QueryParam("deleteAuthorizable") String deleteAuthorizable,  @Multipart(value = "file", required = false) InputStream fileInputStream, @Multipart(value = "file" , required = false) Attachment fileDetail) {
        return delegate.postNode(path, name, colonOperation, deleteAuthorizable, fileInputStream, fileDetail, securityContext);
    }

    @POST
    @Path("/{path}/{name}.rw.html")
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postNodeRw(@ApiParam(value = "",required=true) @PathParam("path") String path, @ApiParam(value = "",required=true) @PathParam("name") String name, @ApiParam(value = "")  @QueryParam("addMembers") String addMembers) {
        return delegate.postNodeRw(path, name, addMembers, securityContext);
    }

    @POST
    @Path("/{path}/")
    
    
    @ApiOperation(value = "", notes = "", response = Void.class, authorizations = {
        
        @Authorization(value = "aemAuth")
         }, tags={ "sling" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Default response", response = Void.class) })
    public Response postPath(@ApiParam(value = "",required=true) @PathParam("path") String path,  @NotNull @ApiParam(value = "",required=true)  @QueryParam("jcr:primaryType") String jcrColonPrimaryType,  @NotNull @ApiParam(value = "",required=true)  @QueryParam(":name") String colonName) {
        return delegate.postPath(path, jcrColonPrimaryType, colonName, securityContext);
    }
}
